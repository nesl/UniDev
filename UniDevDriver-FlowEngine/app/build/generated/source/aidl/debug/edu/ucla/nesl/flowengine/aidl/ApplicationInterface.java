/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /Users/haksoo/AndroidstudioProjects/UniDev/UniDevDriver-FlowEngine/app/src/main/aidl/edu/ucla/nesl/flowengine/aidl/ApplicationInterface.aidl
 */
package edu.ucla.nesl.flowengine.aidl;
public interface ApplicationInterface extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements edu.ucla.nesl.flowengine.aidl.ApplicationInterface
{
private static final java.lang.String DESCRIPTOR = "edu.ucla.nesl.flowengine.aidl.ApplicationInterface";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an edu.ucla.nesl.flowengine.aidl.ApplicationInterface interface,
 * generating a proxy if needed.
 */
public static edu.ucla.nesl.flowengine.aidl.ApplicationInterface asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof edu.ucla.nesl.flowengine.aidl.ApplicationInterface))) {
return ((edu.ucla.nesl.flowengine.aidl.ApplicationInterface)iin);
}
return new edu.ucla.nesl.flowengine.aidl.ApplicationInterface.Stub.Proxy(obj);
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
case TRANSACTION_publishString:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
long _arg2;
_arg2 = data.readLong();
this.publishString(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_publishDouble:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
double _arg1;
_arg1 = data.readDouble();
long _arg2;
_arg2 = data.readLong();
this.publishDouble(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_publishDoubleArray:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
double[] _arg1;
_arg1 = data.createDoubleArray();
int _arg2;
_arg2 = data.readInt();
long _arg3;
_arg3 = data.readLong();
this.publishDoubleArray(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_publishInt:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
long _arg2;
_arg2 = data.readLong();
this.publishInt(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_publishIntArray:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int[] _arg1;
_arg1 = data.createIntArray();
int _arg2;
_arg2 = data.readInt();
long _arg3;
_arg3 = data.readLong();
this.publishIntArray(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements edu.ucla.nesl.flowengine.aidl.ApplicationInterface
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
@Override public void publishString(java.lang.String name, java.lang.String data, long timestamp) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
_data.writeString(data);
_data.writeLong(timestamp);
mRemote.transact(Stub.TRANSACTION_publishString, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void publishDouble(java.lang.String name, double data, long timestamp) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
_data.writeDouble(data);
_data.writeLong(timestamp);
mRemote.transact(Stub.TRANSACTION_publishDouble, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void publishDoubleArray(java.lang.String name, double[] data, int length, long timestamp) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
_data.writeDoubleArray(data);
_data.writeInt(length);
_data.writeLong(timestamp);
mRemote.transact(Stub.TRANSACTION_publishDoubleArray, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void publishInt(java.lang.String name, int data, long timestamp) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
_data.writeInt(data);
_data.writeLong(timestamp);
mRemote.transact(Stub.TRANSACTION_publishInt, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void publishIntArray(java.lang.String name, int[] data, int length, long timestamp) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
_data.writeIntArray(data);
_data.writeInt(length);
_data.writeLong(timestamp);
mRemote.transact(Stub.TRANSACTION_publishIntArray, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_publishString = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_publishDouble = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_publishDoubleArray = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_publishInt = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_publishIntArray = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
}
public void publishString(java.lang.String name, java.lang.String data, long timestamp) throws android.os.RemoteException;
public void publishDouble(java.lang.String name, double data, long timestamp) throws android.os.RemoteException;
public void publishDoubleArray(java.lang.String name, double[] data, int length, long timestamp) throws android.os.RemoteException;
public void publishInt(java.lang.String name, int data, long timestamp) throws android.os.RemoteException;
public void publishIntArray(java.lang.String name, int[] data, int length, long timestamp) throws android.os.RemoteException;
}
