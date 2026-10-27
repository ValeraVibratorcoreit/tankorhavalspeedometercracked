package ipc.fdbus;

/* JADX INFO: loaded from: classes.dex */
public class FdbusMessage {
    private int mMsgCode;
    private long mNativeHandle;
    private byte[] mPayload;
    private int mSid;
    private int mStatus;
    private String mTopic;
    private Object mUserData;

    public FdbusMessage(int i, int i2, byte[] bArr, Object obj, int i3) {
        initialize(0L, i, i2, null, bArr, obj, i3);
    }

    private void destroy() {
        long j = this.mNativeHandle;
        this.mNativeHandle = 0L;
        if (j != 0) {
            fdb_destroy(j);
        }
    }

    private native boolean fdb_broadcast(long j, int i, String str, byte[] bArr, String str2);

    private native void fdb_destroy(long j);

    private native boolean fdb_log_enabled(long j);

    private native boolean fdb_reply(long j, byte[] bArr, String str);

    private void initialize(long j, int i, int i2, String str, byte[] bArr, Object obj, int i3) {
        this.mNativeHandle = j;
        this.mSid = i;
        this.mMsgCode = i2;
        this.mPayload = bArr;
        this.mUserData = obj;
        this.mTopic = str;
        this.mStatus = i3;
    }

    public boolean broadcast(int i, String str, Object obj) {
        FdbusMsgBuilder fdbusMsgBuilderEncodeMessage = Fdbus.encodeMessage(obj, logEnabled());
        if (fdbusMsgBuilderEncodeMessage == null) {
            return false;
        }
        boolean zFdb_broadcast = fdb_broadcast(this.mNativeHandle, i, str, fdbusMsgBuilderEncodeMessage.toBuffer(), fdbusMsgBuilderEncodeMessage.toString());
        destroy();
        return zFdb_broadcast;
    }

    public byte[] byteArray() {
        return this.mPayload;
    }

    public int code() {
        return this.mMsgCode;
    }

    public boolean logEnabled() {
        return fdb_log_enabled(this.mNativeHandle);
    }

    public boolean reply(Object obj) {
        FdbusMsgBuilder fdbusMsgBuilderEncodeMessage = Fdbus.encodeMessage(obj, logEnabled());
        if (fdbusMsgBuilderEncodeMessage == null) {
            return false;
        }
        boolean zFdb_reply = fdb_reply(this.mNativeHandle, fdbusMsgBuilderEncodeMessage.toBuffer(), fdbusMsgBuilderEncodeMessage.toString());
        destroy();
        return zFdb_reply;
    }

    public int returnValue() {
        return this.mStatus;
    }

    public int sid() {
        return this.mSid;
    }

    public String topic() {
        return this.mTopic;
    }

    public Object userData() {
        return this.mUserData;
    }

    public void topic(String str) {
        this.mTopic = str;
    }

    public FdbusMessage(int i, int i2, String str, byte[] bArr, Object obj, int i3) {
        initialize(0L, i, i2, str, bArr, obj, i3);
    }

    public boolean broadcast(int i, Object obj) {
        return broadcast(i, null, obj);
    }

    public FdbusMessage(int i, int i2, byte[] bArr, Object obj) {
        initialize(0L, i, i2, null, bArr, obj, 0);
    }

    public FdbusMessage(int i, int i2, byte[] bArr, int i3) {
        initialize(0L, i, i2, null, bArr, null, i3);
    }

    public FdbusMessage(int i, int i2, String str, byte[] bArr, int i3) {
        initialize(0L, i, i2, str, bArr, null, i3);
    }

    public FdbusMessage(int i, int i2, byte[] bArr) {
        initialize(0L, i, i2, null, bArr, null, 0);
    }

    public FdbusMessage(long j, int i, int i2, byte[] bArr) {
        initialize(j, i, i2, null, bArr, null, 0);
    }
}
