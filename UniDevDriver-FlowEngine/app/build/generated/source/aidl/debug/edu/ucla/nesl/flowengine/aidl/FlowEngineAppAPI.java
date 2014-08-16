/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /Users/haksoo/AndroidstudioProjects/UniDev/UniDevDriver-FlowEngine/app/src/main/aidl/edu/ucla/nesl/flowengine/aidl/FlowEngineAppAPI.aidl
 */
package edu.ucla.nesl.flowengine.aidl;
public interface FlowEngineAppAPI extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements edu.ucla.nesl.flowengine.aidl.FlowEngineAppAPI
{
private static final java.lang.String DESCRIPTOR = "edu.ucla.nesl.flowengine.aidl.FlowEngineAppAPI";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an edu.ucla.nesl.flowengine.aidl.FlowEngineAppAPI interface,
 * generating a proxy if needed.
 */
public static edu.ucla.nesl.flowengine.aidl.FlowEngineAppAPI asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof edu.ucla.nesl.flowengine.aidl.FlowEngineAppAPI))) {
return ((edu.ucla.nesl.flowengine.aidl.FlowEngineAppAPI)iin);
}
return new edu.ucla.nesl.flowengine.aidl.FlowEngineAppAPI.Stub.Proxy(obj);
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
case TRANSACTION_register:
{
data.enforceInterface(DESCRIPTOR);
edu.ucla.nesl.flowengine.aidl.ApplicationInterface _arg0;
_arg0 = edu.ucla.nesl.flowengine.aidl.ApplicationInterface.Stub.asInterface(data.readStrongBinder());
int _result = this.register(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_unregister:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
this.unregister(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_submitGraph:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
this.submitGraph(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_subscribe:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
this.subscribe(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_unsubscribe:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
this.unsubscribe(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getSubscribedNodeNames:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String[] _result = this.getSubscribedNodeNames(_arg0);
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements edu.ucla.nesl.flowengine.aidl.FlowEngineAppAPI
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
@Override public int register(edu.ucla.nesl.flowengine.aidl.ApplicationInterface appInterface) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((appInterface!=null))?(appInterface.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_register, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void unregister(int appId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(appId);
mRemote.transact(Stub.TRANSACTION_unregister, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void submitGraph(java.lang.String contextName, java.lang.String graph) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(contextName);
_data.writeString(graph);
mRemote.transact(Stub.TRANSACTION_submitGraph, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void subscribe(int appId, java.lang.String nodeName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(appId);
_data.writeString(nodeName);
mRemote.transact(Stub.TRANSACTION_subscribe, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unsubscribe(int appId, java.lang.String nodeName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(appId);
_data.writeString(nodeName);
mRemote.transact(Stub.TRANSACTION_unsubscribe, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public java.lang.String[] getSubscribedNodeNames(int appId) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(appId);
mRemote.transact(Stub.TRANSACTION_getSubscribedNodeNames, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_register = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_unregister = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_submitGraph = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_subscribe = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_unsubscribe = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getSubscribedNodeNames = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
}
public int register(edu.ucla.nesl.flowengine.aidl.ApplicationInterface appInterface) throws android.os.RemoteException;
public void unregister(int appId) throws android.os.RemoteException;
public void submitGraph(java.lang.String contextName, java.lang.String graph) throws android.os.RemoteException;
public void subscribe(int appId, java.lang.String nodeName) throws android.os.RemoteException;
public void unsubscribe(int appId, java.lang.String nodeName) throws android.os.RemoteException;
public java.lang.String[] getSubscribedNodeNames(int appId) throws android.os.RemoteException;
}
