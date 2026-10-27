package ipc.fdbus;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class FdbusServer {
    private FdbusServerListener mFdbusListener;
    private long mNativeHandle;

    public FdbusServer(String str, FdbusServerListener fdbusServerListener) {
        initialize(str, fdbusServerListener);
    }

    private void callbackInvoke(int i, int i2, byte[] bArr, long j) {
        if (this.mFdbusListener != null) {
            this.mFdbusListener.onInvoke(new FdbusMessage(j, i, i2, bArr));
        }
    }

    private void callbackOffline(int i, boolean z) {
        FdbusServerListener fdbusServerListener = this.mFdbusListener;
        if (fdbusServerListener != null) {
            fdbusServerListener.onOffline(i, z);
        }
    }

    private void callbackOnline(int i, boolean z) {
        FdbusServerListener fdbusServerListener = this.mFdbusListener;
        if (fdbusServerListener != null) {
            fdbusServerListener.onOnline(i, z);
        }
    }

    private void callbackSubscribe(int i, long j, ArrayList<SubscribeItem> arrayList) {
        if (this.mFdbusListener != null) {
            this.mFdbusListener.onSubscribe(new FdbusMessage(j, i, 0, (byte[]) null), arrayList);
        }
    }

    private native boolean fdb_bind(long j, String str);

    private native boolean fdb_broadcast(long j, int i, String str, byte[] bArr, String str2);

    private native String fdb_bus_name(long j);

    private native long fdb_create(String str);

    private native void fdb_destroy(long j);

    private native void fdb_enable_event_cache(long j, boolean z);

    private native String fdb_endpoint_name(long j);

    private native void fdb_init_event_cache(long j, int i, String str, byte[] bArr, boolean z);

    private native boolean fdb_log_enabled(long j, int i);

    private native boolean fdb_unbind(long j);

    private void initialize(String str, FdbusServerListener fdbusServerListener) {
        this.mNativeHandle = fdb_create(str);
        this.mFdbusListener = fdbusServerListener;
    }

    public boolean bind(String str) {
        return fdb_bind(this.mNativeHandle, str);
    }

    public boolean broadcast(int i, String str, Object obj) {
        FdbusMsgBuilder fdbusMsgBuilderEncodeMessage = Fdbus.encodeMessage(obj, logEnabled(4));
        if (fdbusMsgBuilderEncodeMessage == null) {
            return false;
        }
        return fdb_broadcast(this.mNativeHandle, i, str, fdbusMsgBuilderEncodeMessage.toBuffer(), fdbusMsgBuilderEncodeMessage.toString());
    }

    public String busName() {
        return fdb_bus_name(this.mNativeHandle);
    }

    public void destroy() {
        long j = this.mNativeHandle;
        this.mNativeHandle = 0L;
        if (j != 0) {
            fdb_destroy(j);
        }
    }

    public void enableEventCache(boolean z) {
        fdb_enable_event_cache(this.mNativeHandle, z);
    }

    public String endpointName() {
        return fdb_endpoint_name(this.mNativeHandle);
    }

    public boolean initEventCache(int i, String str, Object obj, boolean z) {
        FdbusMsgBuilder fdbusMsgBuilderEncodeMessage = Fdbus.encodeMessage(obj, false);
        if (fdbusMsgBuilderEncodeMessage == null) {
            return false;
        }
        fdb_init_event_cache(this.mNativeHandle, i, str, fdbusMsgBuilderEncodeMessage.toBuffer(), z);
        return true;
    }

    public boolean logEnabled(int i) {
        return fdb_log_enabled(this.mNativeHandle, i);
    }

    public void setListener(FdbusServerListener fdbusServerListener) {
        this.mFdbusListener = fdbusServerListener;
    }

    public boolean unbind() {
        return fdb_unbind(this.mNativeHandle);
    }

    public boolean bind() {
        return bind("svc://" + busName());
    }

    public FdbusServer(FdbusServerListener fdbusServerListener) {
        initialize(null, fdbusServerListener);
    }

    public boolean broadcast(int i, Object obj) {
        return broadcast(i, null, obj);
    }

    public FdbusServer(String str) {
        initialize(str, null);
    }

    public FdbusServer() {
        initialize(null, null);
    }
}
