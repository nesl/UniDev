/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /Users/haksoo/AndroidstudioProjects/UniDev/UniDevDriver-FlowEngine/app/src/main/aidl/edu/ucla/nesl/flowengine/aidl/DeviceAPI.aidl
 */
package edu.ucla.nesl.flowengine.aidl;
public interface DeviceAPI extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements edu.ucla.nesl.flowengine.aidl.DeviceAPI
{
private static final java.lang.String DESCRIPTOR = "edu.ucla.nesl.flowengine.aidl.DeviceAPI";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an edu.ucla.nesl.flowengine.aidl.DeviceAPI interface,
 * generating a proxy if needed.
 */
public static edu.ucla.nesl.flowengine.aidl.DeviceAPI asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof edu.ucla.nesl.flowengine.aidl.DeviceAPI))) {
return ((edu.ucla.nesl.flowengine.aidl.DeviceAPI)iin);
}
return new edu.ucla.nesl.flowengine.aidl.DeviceAPI.Stub.Proxy(obj);
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
case TRANSACTION_start:
{
data.enforceInterface(DESCRIPTOR);
this.start();
reply.writeNoException();
return true;
}
case TRANSACTION_stop:
{
data.enforceInterface(DESCRIPTOR);
this.stop();
reply.writeNoException();
return true;
}
case TRANSACTION_kill:
{
data.enforceInterface(DESCRIPTOR);
this.kill();
reply.writeNoException();
return true;
}
case TRANSACTION_startSensor:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.startSensor(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_stopSensor:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.stopSensor(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements edu.ucla.nesl.flowengine.aidl.DeviceAPI
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
@Override public void start() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_start, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void stop() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stop, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void kill() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_kill, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void startSensor(int sensor) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(sensor);
mRemote.transact(Stub.TRANSACTION_startSensor, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void stopSensor(int sensor) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(sensor);
mRemote.transact(Stub.TRANSACTION_stopSensor, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_start = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_stop = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_kill = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_startSensor = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_stopSensor = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
}
public void start() throws android.os.RemoteException;
public void stop() throws android.os.RemoteException;
public void kill() throws android.os.RemoteException;
public void startSensor(int sensor) throws android.os.RemoteException;
public void stopSensor(int sensor) throws android.os.RemoteException;
}
