/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /Users/haksoo/AndroidstudioProjects/UniDev/UniDevDriver-FlowEngine/app/src/main/aidl/edu/ucla/nesl/flowengine/aidl/FlowEngineAPI.aidl
 */
package edu.ucla.nesl.flowengine.aidl;
public interface FlowEngineAPI extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements edu.ucla.nesl.flowengine.aidl.FlowEngineAPI
{
private static final java.lang.String DESCRIPTOR = "edu.ucla.nesl.flowengine.aidl.FlowEngineAPI";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an edu.ucla.nesl.flowengine.aidl.FlowEngineAPI interface,
 * generating a proxy if needed.
 */
public static edu.ucla.nesl.flowengine.aidl.FlowEngineAPI asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof edu.ucla.nesl.flowengine.aidl.FlowEngineAPI))) {
return ((edu.ucla.nesl.flowengine.aidl.FlowEngineAPI)iin);
}
return new edu.ucla.nesl.flowengine.aidl.FlowEngineAPI.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_pushInt:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
long _arg3;
_arg3 = data.readLong();
this.pushInt(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_pushIntArray:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int[] _arg2;
_arg2 = data.createIntArray();
int _arg3;
_arg3 = data.readInt();
long _arg4;
_arg4 = data.readLong();
this.pushIntArray(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
case TRANSACTION_pushDouble:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
double _arg2;
_arg2 = data.readDouble();
long _arg3;
_arg3 = data.readLong();
this.pushDouble(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_pushDoubleArray:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
double[] _arg2;
_arg2 = data.createDoubleArray();
int _arg3;
_arg3 = data.readInt();
long _arg4;
_arg4 = data.readLong();
this.pushDoubleArray(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
case TRANSACTION_pushString:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
int _arg3;
_arg3 = data.readInt();
long _arg4;
_arg4 = data.readLong();
this.pushString(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
case TRANSACTION_addDevice:
{
data.enforceInterface(DESCRIPTOR);
edu.ucla.nesl.flowengine.aidl.DeviceAPI _arg0;
_arg0 = edu.ucla.nesl.flowengine.aidl.DeviceAPI.Stub.asInterface(data.readStrongBinder());
int _result = this.addDevice(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_addSensor:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.addSensor(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_removeDevice:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.removeDevice(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements edu.ucla.nesl.flowengine.aidl.FlowEngineAPI
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void pushInt(int deviceID, int sensor, int data, long timestamp) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(deviceID);
_data.writeInt(sensor);
_data.writeInt(data);
_data.writeLong(timestamp);
mRemote.transact(Stub.TRANSACTION_pushInt, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void pushIntArray(int deviceID, int sensor, int[] data, int length, long timestamp) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(deviceID);
_data.writeInt(sensor);
_data.writeIntArray(data);
_data.writeInt(length);
_data.writeLong(timestamp);
mRemote.transact(Stub.TRANSACTION_pushIntArray, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void pushDouble(int deviceID, int sensor, double data, long timestamp) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(deviceID);
_data.writeInt(sensor);
_data.writeDouble(data);
_data.writeLong(timestamp);
mRemote.transact(Stub.TRANSACTION_pushDouble, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void pushDoubleArray(int deviceID, int sensor, double[] data, int length, long timestamp) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(deviceID);
_data.writeInt(sensor);
_data.writeDoubleArray(data);
_data.writeInt(length);
_data.writeLong(timestamp);
mRemote.transact(Stub.TRANSACTION_pushDoubleArray, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void pushString(int deviceID, int sensor, java.lang.String data, int length, long timestamp) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(deviceID);
_data.writeInt(sensor);
_data.writeString(data);
_data.writeInt(length);
_data.writeLong(timestamp);
mRemote.transact(Stub.TRANSACTION_pushString, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int addDevice(edu.ucla.nesl.flowengine.aidl.DeviceAPI deviceInterface) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((deviceInterface!=null))?(deviceInterface.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_addDevice, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void addSensor(int deviceID, int sensor, int sampleInterval) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(deviceID);
_data.writeInt(sensor);
_data.writeInt(sampleInterval);
mRemote.transact(Stub.TRANSACTION_addSensor, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void removeDevice(int deviceID) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(deviceID);
mRemote.transact(Stub.TRANSACTION_removeDevice, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_pushInt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_pushIntArray = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_pushDouble = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_pushDoubleArray = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_pushString = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_addDevice = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_addSensor = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_removeDevice = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
}
public void pushInt(int deviceID, int sensor, int data, long timestamp) throws android.os.RemoteException;
public void pushIntArray(int deviceID, int sensor, int[] data, int length, long timestamp) throws android.os.RemoteException;
public void pushDouble(int deviceID, int sensor, double data, long timestamp) throws android.os.RemoteException;
public void pushDoubleArray(int deviceID, int sensor, double[] data, int length, long timestamp) throws android.os.RemoteException;
public void pushString(int deviceID, int sensor, java.lang.String data, int length, long timestamp) throws android.os.RemoteException;
public int addDevice(edu.ucla.nesl.flowengine.aidl.DeviceAPI deviceInterface) throws android.os.RemoteException;
public void addSensor(int deviceID, int sensor, int sampleInterval) throws android.os.RemoteException;
public void removeDevice(int deviceID) throws android.os.RemoteException;
}
