#include <jni.h>
#include <sys/mman.h>
#include <binder/IInterface.h>
#include <binder/IBinder.h>
#include <binder/Binder.h>
#include <binder/ProcessState.h>
#include <binder/IServiceManager.h>
#include <binder/IPCThreadState.h>

#undef LOG_TAG
#define LOG_TAG "AndroidIPC::SHM"

using namespace android;

// The binder message ids
enum {
  SET_FD = IBinder::FIRST_CALL_TRANSACTION
};


// The interface, binder client and server should both implement it
class ISHM : public IInterface {
  public:
    virtual status_t setFD(uint32_t fd) = 0;

    DECLARE_META_INTERFACE(SHM);
};


// The client interface
class BpSHM : public BpInterface<ISHM> {
  public:
    BpSHM(const sp<IBinder>& impl) : BpInterface<ISHM>(impl) {
      ALOGD("BpSHM::BpSHM()");
    }

    virtual status_t setFD(uint32_t fd)
    {
      ALOGD("BpSHM::setFD(%u)", fd);
      Parcel data, reply;
      data.writeInterfaceToken(ISHM::getInterfaceDescriptor());
      data.writeFileDescriptor(fd);
      remote()->transact(SET_FD, data, &reply);
      return reply.readInt32();
    }
};

IMPLEMENT_META_INTERFACE(SHM, "io.vec.IPC");


// The server interface
class BnSHM : public BnInterface<ISHM> {
  virtual status_t onTransact(uint32_t code, const Parcel& data, Parcel* reply, uint32_t flags = 0)
  {
    ALOGD("BnSHM::onTransact(%u)", code);
    CHECK_INTERFACE(ISHM, data, reply);
    switch(code) {
      case SET_FD: {
             reply->writeInt32(setFD(data.readFileDescriptor()));
             return NO_ERROR;
           } break;
      default: {
             return BBinder::onTransact(code, data, reply, flags);
           } break;
    }
  }
};

uint8_t *pData = NULL;

// The server implementation
class SHM : public BnSHM {
  public:
    status_t setFD(uint32_t fd)
    {
      ALOGD("SHM::setFD(%u)", fd);
      uint8_t *shm = (uint8_t*)mmap(NULL, 1024, PROT_WRITE | PROT_READ, MAP_SHARED, fd, 0);
      if (shm == MAP_FAILED) {
        ALOGE("mmap failed! %d, %s", errno, strerror(errno));
        return UNKNOWN_ERROR;
      }
      ALOGD("mmap %p", shm);

      // Now we can use shm to share data with Java MemoryFile.
      // For this demo, we just release it.

      pData = shm;

      //munmap(shm, 1024);
      return NO_ERROR;
    }

    static void registerService()
    {
      defaultServiceManager()->addService(String16("binder_shm"), new SHM());
    }

    static sp<ISHM> getService()
    {
      sp<IBinder> binder = defaultServiceManager()->getService(String16("binder_shm"));
      return interface_cast<ISHM>(binder);
    }
};


// Start the server
int main(int argc, char const* argv[])
{
  //printf("SHM starting..");
  //fflush(stdout);

  SHM::registerService();
  android::ProcessState::self()->startThreadPool();
  ALOGI("The SHM service started!");

  for(;;)
  {
    if (pData == NULL) {
      ALOGD("data is still NULL..");
    } else {
      ALOGD("data = %d at 0x%p", *pData, pData);
    }
    sleep(1);
  }

  IPCThreadState::self()->joinThreadPool();

  return 0;
}


// JNI related
static void jni_setFd(JNIEnv* env, jclass clz, jint fd) {
  ALOGD("in jni_setFd(%d)..", fd);
}

static jint jni_setMemoryFile(JNIEnv* env, jclass clz, jobject jmf)
{
  ALOGD("in jni_setMemoryFile() returning FD..");
  
  jclass clsMF = env->FindClass("android/os/MemoryFile");
  jfieldID fldFD = env->GetFieldID(clsMF, "mFD", "Ljava/io/FileDescriptor;");
  jobject objFD = env->GetObjectField(jmf, fldFD);
  jclass clsFD = env->FindClass("java/io/FileDescriptor");
  fldFD = env->GetFieldID(clsFD, "descriptor", "I");
  jint fd = env->GetIntField(objFD, fldFD);
  env->DeleteLocalRef(clsFD);
  env->DeleteLocalRef(objFD);
  env->DeleteLocalRef(clsMF);
  ALOGD("jni_setMemoryFile(%d)", fd);

  return fd;

  /*sp<ISHM> service = SHM::getService();
  if (service->setFD(fd) != NO_ERROR) {
    ALOGE("service->setFD(fd) returned ERROR");
  }*/

  /*
  // construct a new FileDescriptor
  jclass class_fdesc = env->FindClass("java/io/FileDescriptor");
  if (class_fdesc == NULL) {
    ALOGE("class_fdesc is NULL");
    return NULL;
  }
  jmethodID const_fdesc = env->GetMethodID(class_fdesc, "<init>", "()V");
  if (const_fdesc == NULL) {
    ALOGE("const_fdesc is NULL");
    return NULL;
  }
  jobject ret = env->NewObject(class_fdesc, const_fdesc);

  // poke the "descriptor" field with the file descriptor
  jfieldID field_fd = env->GetFieldID(class_fdesc, "descriptor", "I");
  if (field_fd == NULL) {
    ALOGE("field_fd is NULL");
    return NULL;
  }
  env->SetIntField(ret, field_fd, fd);
  
  //return (service->setFD(fd) == NO_ERROR);
  return ret;
  */
}


JNINativeMethod jniMethods[2] = {
  { "setMemoryFile", "(Landroid/os/MemoryFile;)I", (void*)jni_setMemoryFile },
  { "setFd", "(I)", (void*)jni_setFd },
};


jint JNI_OnLoad(JavaVM* vm, void* reserved)
{
  JNIEnv* env;

  if (vm->GetEnv(reinterpret_cast<void**>(&env), JNI_VERSION_1_6) != JNI_OK) {
    return -1;
  }

  jclass clz = env->FindClass("io/vec/demo/android/ipc/IPC");
  env->RegisterNatives(clz, jniMethods, sizeof(jniMethods) / sizeof(JNINativeMethod));
  env->DeleteLocalRef(clz);

  return JNI_VERSION_1_6;
}
