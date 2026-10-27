package ipc.fdbus;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class FdbusClient {
    private FdbusClientListener mFdbusListener;
    private long mNativeHandle;

    public FdbusClient(String str, FdbusClientListener fdbusClientListener) {
        initialize(str, fdbusClientListener);
    }

    private void callbackBroadcast(int i, int i2, String str, byte[] bArr) {
        if (this.mFdbusListener != null) {
            FdbusMessage fdbusMessage = new FdbusMessage(i, i2, bArr);
            fdbusMessage.topic(str);
            this.mFdbusListener.onBroadcast(fdbusMessage);
        }
    }

    private void callbackGetEvent(int i, int i2, String str, byte[] bArr, int i3, Object obj) {
        if (this.mFdbusListener != null) {
            this.mFdbusListener.onGetEvent(new FdbusMessage(i, i2, str, bArr, obj, i3));
        }
    }

    private void callbackOffline(int i) {
        FdbusClientListener fdbusClientListener = this.mFdbusListener;
        if (fdbusClientListener != null) {
            fdbusClientListener.onOffline(i);
        }
    }

    private void callbackOnline(int i) {
        FdbusClientListener fdbusClientListener = this.mFdbusListener;
        if (fdbusClientListener != null) {
            fdbusClientListener.onOnline(i);
        }
    }

    private void callbackReply(int i, int i2, byte[] bArr, int i3, Object obj) {
        if (this.mFdbusListener != null) {
            this.mFdbusListener.onReply(new FdbusMessage(i, i2, bArr, obj, i3));
        }
    }

    private native String fdb_bus_name(long j);

    private native boolean fdb_connect(long j, String str);

    private native long fdb_create(String str);

    private native void fdb_destroy(long j);

    private native boolean fdb_disconnect(long j);

    private native String fdb_endpoint_name(long j);

    private native boolean fdb_get_event_async(long j, int i, String str, Object obj, int i2);

    private native FdbusMessage fdb_get_event_sync(long j, int i, String str, int i2);

    private native boolean fdb_invoke_async(long j, int i, byte[] bArr, String str, Object obj, int i2);

    private native FdbusMessage fdb_invoke_sync(long j, int i, byte[] bArr, String str, int i2);

    private native boolean fdb_log_enabled(long j, int i);

    private native boolean fdb_publish(long j, int i, String str, byte[] bArr, String str2, boolean z);

    private native boolean fdb_send(long j, int i, byte[] bArr, String str);

    private native boolean fdb_subscribe(long j, ArrayList<SubscribeItem> arrayList);

    private native boolean fdb_unsubscribe(long j, ArrayList<SubscribeItem> arrayList);

    private void initialize(String str, FdbusClientListener fdbusClientListener) {
        this.mNativeHandle = fdb_create(str);
        this.mFdbusListener = fdbusClientListener;
    }

    public String busName() {
        return fdb_bus_name(this.mNativeHandle);
    }

    public boolean connect(String str) {
        return fdb_connect(this.mNativeHandle, str);
    }

    public void destroy() {
        long j = this.mNativeHandle;
        this.mNativeHandle = 0L;
        if (j != 0) {
            fdb_destroy(j);
        }
    }

    public boolean disconnect() {
        return fdb_disconnect(this.mNativeHandle);
    }

    public String endpointName() {
        return fdb_endpoint_name(this.mNativeHandle);
    }

    public boolean getAsync(int i, String str, Object obj, int i2) {
        return fdb_get_event_async(this.mNativeHandle, i, str, obj, i2);
    }

    public FdbusMessage getSync(int i, String str, int i2) {
        return fdb_get_event_sync(this.mNativeHandle, i, str, i2);
    }

    public boolean invokeAsync(int i, Object obj, Object obj2, int i2) {
        FdbusMsgBuilder fdbusMsgBuilderEncodeMessage = Fdbus.encodeMessage(obj, logEnabled(1));
        if (fdbusMsgBuilderEncodeMessage == null) {
            return false;
        }
        return fdb_invoke_async(this.mNativeHandle, i, fdbusMsgBuilderEncodeMessage.toBuffer(), fdbusMsgBuilderEncodeMessage.toString(), obj2, i2);
    }

    public FdbusMessage invokeSync(int i, Object obj, int i2) {
        FdbusMsgBuilder fdbusMsgBuilderEncodeMessage = Fdbus.encodeMessage(obj, logEnabled(1));
        if (fdbusMsgBuilderEncodeMessage == null) {
            return null;
        }
        return fdb_invoke_sync(this.mNativeHandle, i, fdbusMsgBuilderEncodeMessage.toBuffer(), fdbusMsgBuilderEncodeMessage.toString(), i2);
    }

    public boolean logEnabled(int i) {
        return fdb_log_enabled(this.mNativeHandle, i);
    }

    public boolean publish(int i, String str, Object obj, boolean z) {
        FdbusMsgBuilder fdbusMsgBuilderEncodeMessage = Fdbus.encodeMessage(obj, logEnabled(1));
        if (fdbusMsgBuilderEncodeMessage == null) {
            return false;
        }
        return fdb_publish(this.mNativeHandle, i, str, fdbusMsgBuilderEncodeMessage.toBuffer(), fdbusMsgBuilderEncodeMessage.toString(), z);
    }

    public boolean send(int i, Object obj) {
        FdbusMsgBuilder fdbusMsgBuilderEncodeMessage = Fdbus.encodeMessage(obj, logEnabled(1));
        if (fdbusMsgBuilderEncodeMessage == null) {
            return false;
        }
        return fdb_send(this.mNativeHandle, i, fdbusMsgBuilderEncodeMessage.toBuffer(), fdbusMsgBuilderEncodeMessage.toString());
    }

    public void setListener(FdbusClientListener fdbusClientListener) {
        this.mFdbusListener = fdbusClientListener;
    }

    public boolean subscribe(ArrayList<SubscribeItem> arrayList) {
        return fdb_subscribe(this.mNativeHandle, arrayList);
    }

    public boolean unsubscribe(ArrayList<SubscribeItem> arrayList) {
        return fdb_unsubscribe(this.mNativeHandle, arrayList);
    }

    public boolean connect() {
        return connect("svc://" + busName());
    }

    public FdbusClient(FdbusClientListener fdbusClientListener) {
        initialize(null, fdbusClientListener);
    }

    public FdbusClient(String str) {
        initialize(str, null);
    }

    public FdbusClient() {
        initialize(null, null);
    }
}
