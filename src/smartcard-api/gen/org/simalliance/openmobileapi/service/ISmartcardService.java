/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /Users/krzysiek/Development/FFOS/Android/seek-for-android-read-only/src/smartcard-api/src/org/simalliance/openmobileapi/service/ISmartcardService.aidl
 */
package org.simalliance.openmobileapi.service;
/**
 * Smartcard service interface.
 */
public interface ISmartcardService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements org.simalliance.openmobileapi.service.ISmartcardService
{
private static final java.lang.String DESCRIPTOR = "org.simalliance.openmobileapi.service.ISmartcardService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an org.simalliance.openmobileapi.service.ISmartcardService interface,
 * generating a proxy if needed.
 */
public static org.simalliance.openmobileapi.service.ISmartcardService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof org.simalliance.openmobileapi.service.ISmartcardService))) {
return ((org.simalliance.openmobileapi.service.ISmartcardService)iin);
}
return new org.simalliance.openmobileapi.service.ISmartcardService.Stub.Proxy(obj);
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
case TRANSACTION_closeChannel:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
org.simalliance.openmobileapi.service.SmartcardError _arg1;
_arg1 = new org.simalliance.openmobileapi.service.SmartcardError();
this.closeChannel(_arg0, _arg1);
reply.writeNoException();
if ((_arg1!=null)) {
reply.writeInt(1);
_arg1.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getReaders:
{
data.enforceInterface(DESCRIPTOR);
org.simalliance.openmobileapi.service.SmartcardError _arg0;
_arg0 = new org.simalliance.openmobileapi.service.SmartcardError();
java.lang.String[] _result = this.getReaders(_arg0);
reply.writeNoException();
reply.writeStringArray(_result);
if ((_arg0!=null)) {
reply.writeInt(1);
_arg0.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_isCardPresent:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
org.simalliance.openmobileapi.service.SmartcardError _arg1;
_arg1 = new org.simalliance.openmobileapi.service.SmartcardError();
boolean _result = this.isCardPresent(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
if ((_arg1!=null)) {
reply.writeInt(1);
_arg1.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getAtr:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
org.simalliance.openmobileapi.service.SmartcardError _arg1;
_arg1 = new org.simalliance.openmobileapi.service.SmartcardError();
byte[] _result = this.getAtr(_arg0, _arg1);
reply.writeNoException();
reply.writeByteArray(_result);
if ((_arg1!=null)) {
reply.writeInt(1);
_arg1.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_openBasicChannel:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
org.simalliance.openmobileapi.service.ISmartcardServiceCallback _arg1;
_arg1 = org.simalliance.openmobileapi.service.ISmartcardServiceCallback.Stub.asInterface(data.readStrongBinder());
org.simalliance.openmobileapi.service.SmartcardError _arg2;
_arg2 = new org.simalliance.openmobileapi.service.SmartcardError();
long _result = this.openBasicChannel(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeLong(_result);
if ((_arg2!=null)) {
reply.writeInt(1);
_arg2.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_openBasicChannelAid:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
byte[] _arg1;
_arg1 = data.createByteArray();
org.simalliance.openmobileapi.service.ISmartcardServiceCallback _arg2;
_arg2 = org.simalliance.openmobileapi.service.ISmartcardServiceCallback.Stub.asInterface(data.readStrongBinder());
org.simalliance.openmobileapi.service.SmartcardError _arg3;
_arg3 = new org.simalliance.openmobileapi.service.SmartcardError();
long _result = this.openBasicChannelAid(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeLong(_result);
if ((_arg3!=null)) {
reply.writeInt(1);
_arg3.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_openLogicalChannel:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
byte[] _arg1;
_arg1 = data.createByteArray();
org.simalliance.openmobileapi.service.ISmartcardServiceCallback _arg2;
_arg2 = org.simalliance.openmobileapi.service.ISmartcardServiceCallback.Stub.asInterface(data.readStrongBinder());
org.simalliance.openmobileapi.service.SmartcardError _arg3;
_arg3 = new org.simalliance.openmobileapi.service.SmartcardError();
long _result = this.openLogicalChannel(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
reply.writeLong(_result);
if ((_arg3!=null)) {
reply.writeInt(1);
_arg3.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_transmit:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
byte[] _arg1;
_arg1 = data.createByteArray();
org.simalliance.openmobileapi.service.SmartcardError _arg2;
_arg2 = new org.simalliance.openmobileapi.service.SmartcardError();
byte[] _result = this.transmit(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeByteArray(_result);
if ((_arg2!=null)) {
reply.writeInt(1);
_arg2.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
case TRANSACTION_getSelectResponse:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
org.simalliance.openmobileapi.service.SmartcardError _arg1;
_arg1 = new org.simalliance.openmobileapi.service.SmartcardError();
byte[] _result = this.getSelectResponse(_arg0, _arg1);
reply.writeNoException();
reply.writeByteArray(_result);
if ((_arg1!=null)) {
reply.writeInt(1);
_arg1.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements org.simalliance.openmobileapi.service.ISmartcardService
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
/**
     * Closes the specified connection and frees internal resources.
     * A logical channel will be closed.
     */
@Override public void closeChannel(long hChannel, org.simalliance.openmobileapi.service.SmartcardError error) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(hChannel);
mRemote.transact(Stub.TRANSACTION_closeChannel, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
error.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Returns the friendly names of available smart card readers.
     */
@Override public java.lang.String[] getReaders(org.simalliance.openmobileapi.service.SmartcardError error) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getReaders, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
if ((0!=_reply.readInt())) {
error.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Returns true if a card is present in the specified reader.
     * Returns false if a card is not present in the specified reader.
     */
@Override public boolean isCardPresent(java.lang.String reader, org.simalliance.openmobileapi.service.SmartcardError error) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(reader);
mRemote.transact(Stub.TRANSACTION_isCardPresent, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
if ((0!=_reply.readInt())) {
error.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
	 * Returns the ATR of the connected card or null if the ATR is not available.
	 */
@Override public byte[] getAtr(java.lang.String reader, org.simalliance.openmobileapi.service.SmartcardError error) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
byte[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(reader);
mRemote.transact(Stub.TRANSACTION_getAtr, _data, _reply, 0);
_reply.readException();
_result = _reply.createByteArray();
if ((0!=_reply.readInt())) {
error.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Opens a connection using the basic channel of the card in the
     * specified reader and returns a channel handle.
     * Logical channels cannot be opened with this connection.
     * Use interface method openLogicalChannel() to open a logical channel.
     */
@Override public long openBasicChannel(java.lang.String reader, org.simalliance.openmobileapi.service.ISmartcardServiceCallback callback, org.simalliance.openmobileapi.service.SmartcardError error) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(reader);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_openBasicChannel, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
if ((0!=_reply.readInt())) {
error.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Opens a connection using the basic channel of the card in the
     * specified reader and returns a channel handle. Selects the specified applet.
     * Logical channels cannot be opened with this connection.
     * Selection of other applets with this connection is not supported.
     * Use interface method openLogicalChannel() to open a logical channel.
     */
@Override public long openBasicChannelAid(java.lang.String reader, byte[] aid, org.simalliance.openmobileapi.service.ISmartcardServiceCallback callback, org.simalliance.openmobileapi.service.SmartcardError error) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(reader);
_data.writeByteArray(aid);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_openBasicChannelAid, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
if ((0!=_reply.readInt())) {
error.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Opens a connection using the next free logical channel of the card in the
     * specified reader. Selects the specified applet.
     * Selection of other applets with this connection is not supported.
     */
@Override public long openLogicalChannel(java.lang.String reader, byte[] aid, org.simalliance.openmobileapi.service.ISmartcardServiceCallback callback, org.simalliance.openmobileapi.service.SmartcardError error) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(reader);
_data.writeByteArray(aid);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_openLogicalChannel, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
if ((0!=_reply.readInt())) {
error.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Transmits the specified command APDU and returns the response APDU.
     * MANAGE channel commands are not supported.
     * Selection of applets is not supported in logical channels.
     */
@Override public byte[] transmit(long hChannel, byte[] command, org.simalliance.openmobileapi.service.SmartcardError error) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
byte[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(hChannel);
_data.writeByteArray(command);
mRemote.transact(Stub.TRANSACTION_transmit, _data, _reply, 0);
_reply.readException();
_result = _reply.createByteArray();
if ((0!=_reply.readInt())) {
error.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Returns the data as received from the application select command inclusively the status word.
     * The returned byte array contains the data bytes in the following order:
     * [<first data byte>, ..., <last data byte>, <sw1>, <sw2>]
     */
@Override public byte[] getSelectResponse(long hChannel, org.simalliance.openmobileapi.service.SmartcardError error) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
byte[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(hChannel);
mRemote.transact(Stub.TRANSACTION_getSelectResponse, _data, _reply, 0);
_reply.readException();
_result = _reply.createByteArray();
if ((0!=_reply.readInt())) {
error.readFromParcel(_reply);
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_closeChannel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getReaders = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_isCardPresent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getAtr = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_openBasicChannel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_openBasicChannelAid = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_openLogicalChannel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_transmit = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getSelectResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
}
/**
     * Closes the specified connection and frees internal resources.
     * A logical channel will be closed.
     */
public void closeChannel(long hChannel, org.simalliance.openmobileapi.service.SmartcardError error) throws android.os.RemoteException;
/**
     * Returns the friendly names of available smart card readers.
     */
public java.lang.String[] getReaders(org.simalliance.openmobileapi.service.SmartcardError error) throws android.os.RemoteException;
/**
     * Returns true if a card is present in the specified reader.
     * Returns false if a card is not present in the specified reader.
     */
public boolean isCardPresent(java.lang.String reader, org.simalliance.openmobileapi.service.SmartcardError error) throws android.os.RemoteException;
/**
	 * Returns the ATR of the connected card or null if the ATR is not available.
	 */
public byte[] getAtr(java.lang.String reader, org.simalliance.openmobileapi.service.SmartcardError error) throws android.os.RemoteException;
/**
     * Opens a connection using the basic channel of the card in the
     * specified reader and returns a channel handle.
     * Logical channels cannot be opened with this connection.
     * Use interface method openLogicalChannel() to open a logical channel.
     */
public long openBasicChannel(java.lang.String reader, org.simalliance.openmobileapi.service.ISmartcardServiceCallback callback, org.simalliance.openmobileapi.service.SmartcardError error) throws android.os.RemoteException;
/**
     * Opens a connection using the basic channel of the card in the
     * specified reader and returns a channel handle. Selects the specified applet.
     * Logical channels cannot be opened with this connection.
     * Selection of other applets with this connection is not supported.
     * Use interface method openLogicalChannel() to open a logical channel.
     */
public long openBasicChannelAid(java.lang.String reader, byte[] aid, org.simalliance.openmobileapi.service.ISmartcardServiceCallback callback, org.simalliance.openmobileapi.service.SmartcardError error) throws android.os.RemoteException;
/**
     * Opens a connection using the next free logical channel of the card in the
     * specified reader. Selects the specified applet.
     * Selection of other applets with this connection is not supported.
     */
public long openLogicalChannel(java.lang.String reader, byte[] aid, org.simalliance.openmobileapi.service.ISmartcardServiceCallback callback, org.simalliance.openmobileapi.service.SmartcardError error) throws android.os.RemoteException;
/**
     * Transmits the specified command APDU and returns the response APDU.
     * MANAGE channel commands are not supported.
     * Selection of applets is not supported in logical channels.
     */
public byte[] transmit(long hChannel, byte[] command, org.simalliance.openmobileapi.service.SmartcardError error) throws android.os.RemoteException;
/**
     * Returns the data as received from the application select command inclusively the status word.
     * The returned byte array contains the data bytes in the following order:
     * [<first data byte>, ..., <last data byte>, <sw1>, <sw2>]
     */
public byte[] getSelectResponse(long hChannel, org.simalliance.openmobileapi.service.SmartcardError error) throws android.os.RemoteException;
}
