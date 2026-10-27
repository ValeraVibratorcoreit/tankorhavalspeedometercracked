package ipc.fdbus;

/* JADX INFO: loaded from: classes.dex */
public class Fdbus {
    public static final int FDB_LL_DEBUG = 1;
    public static final int FDB_LL_ERROR = 4;
    public static final int FDB_LL_FATAL = 5;
    public static final int FDB_LL_INFO = 2;
    public static final int FDB_LL_MAX = 7;
    public static final int FDB_LL_SILENT = 6;
    public static final int FDB_LL_VERBOSE = 0;
    public static final int FDB_LL_WARNING = 3;
    public static final int FDB_MT_BROADCAST = 4;
    public static final int FDB_MT_MAX = 8;
    public static final int FDB_MT_REPLY = 2;
    public static final int FDB_MT_REQUEST = 1;
    public static final int FDB_MT_SIDEBAND_REPLY = 6;
    public static final int FDB_MT_SIDEBAND_REQUEST = 5;
    public static final int FDB_MT_STATUS = 7;
    public static final int FDB_MT_SUBSCRIBE_REQ = 3;
    public static final int FDB_MT_UNKNOWN = 0;
    public static final int FDB_ST_ALREADY_EXIST = -22;
    public static final int FDB_ST_AUTHENTICATION_FAIL = -30;
    public static final int FDB_ST_AUTO_REPLY_OK = -11;
    public static final int FDB_ST_BAD_PARAMETER = -24;
    public static final int FDB_ST_DEAD_LOCK = -19;
    public static final int FDB_ST_INTERNAL_FAIL = -26;
    public static final int FDB_ST_INVALID_ID = -17;
    public static final int FDB_ST_MSG_DECODE_FAIL = -23;
    public static final int FDB_ST_NON_EXIST = -21;
    public static final int FDB_ST_NOT_AVAILABLE = -25;
    public static final int FDB_ST_NOT_IMPLEMENTED = -28;
    public static final int FDB_ST_OBJECT_NOT_FOUND = -29;
    public static final int FDB_ST_OK = 0;
    public static final int FDB_ST_OUT_OF_MEMORY = -27;
    public static final int FDB_ST_PEER_VANISH = -18;
    public static final int FDB_ST_SUBSCRIBE_FAIL = -13;
    public static final int FDB_ST_SUBSCRIBE_OK = -12;
    public static final int FDB_ST_TIMEOUT = -16;
    public static final int FDB_ST_UNABLE_TO_SEND = -20;
    public static final int FDB_ST_UNKNOWN = -128;
    public static final int FDB_ST_UNSUBSCRIBE_FAIL = -15;
    public static final int FDB_ST_UNSUBSCRIBE_OK = -14;

    public Fdbus() {
        System.loadLibrary("fdbus-jni");
        fdb_init(FdbusServer.class, FdbusClient.class, SubscribeItem.class, FdbusMessage.class);
    }

    public static void LOG_D(String str, String str2) {
        fdb_log_trace(str, 1, str2);
    }

    public static void LOG_E(String str, String str2) {
        fdb_log_trace(str, 4, str2);
    }

    public static void LOG_F(String str, String str2) {
        fdb_log_trace(str, 5, str2);
    }

    public static void LOG_I(String str, String str2) {
        fdb_log_trace(str, 2, str2);
    }

    public static void LOG_W(String str, String str2) {
        fdb_log_trace(str, 3, str2);
    }

    public static FdbusMsgBuilder encodeMessage(Object obj, boolean z) {
        if (obj == null || (obj instanceof byte[])) {
            return new FdbusMsgBuilder((byte[]) obj, null);
        }
        if (!(obj instanceof FdbusMsgBuilder)) {
            LOG_E("fdbus-jni", "Unsupported message type!\n");
            return null;
        }
        FdbusMsgBuilder fdbusMsgBuilder = (FdbusMsgBuilder) obj;
        if (fdbusMsgBuilder.build(z)) {
            return fdbusMsgBuilder;
        }
        LOG_E("fdbus-jni", "Fail to build message!\n");
        return null;
    }

    private native void fdb_init(Class cls, Class cls2, Class cls3, Class cls4);

    private static native void fdb_log_trace(String str, int i, String str2);
}
