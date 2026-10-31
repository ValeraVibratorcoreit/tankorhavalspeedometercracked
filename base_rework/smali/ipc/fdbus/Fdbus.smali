.class public Lipc/fdbus/Fdbus;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final FDB_LL_DEBUG:I = 0x1

.field public static final FDB_LL_ERROR:I = 0x4

.field public static final FDB_LL_FATAL:I = 0x5

.field public static final FDB_LL_INFO:I = 0x2

.field public static final FDB_LL_MAX:I = 0x7

.field public static final FDB_LL_SILENT:I = 0x6

.field public static final FDB_LL_VERBOSE:I = 0x0

.field public static final FDB_LL_WARNING:I = 0x3

.field public static final FDB_MT_BROADCAST:I = 0x4

.field public static final FDB_MT_MAX:I = 0x8

.field public static final FDB_MT_REPLY:I = 0x2

.field public static final FDB_MT_REQUEST:I = 0x1

.field public static final FDB_MT_SIDEBAND_REPLY:I = 0x6

.field public static final FDB_MT_SIDEBAND_REQUEST:I = 0x5

.field public static final FDB_MT_STATUS:I = 0x7

.field public static final FDB_MT_SUBSCRIBE_REQ:I = 0x3

.field public static final FDB_MT_UNKNOWN:I = 0x0

.field public static final FDB_ST_ALREADY_EXIST:I = -0x16

.field public static final FDB_ST_AUTHENTICATION_FAIL:I = -0x1e

.field public static final FDB_ST_AUTO_REPLY_OK:I = -0xb

.field public static final FDB_ST_BAD_PARAMETER:I = -0x18

.field public static final FDB_ST_DEAD_LOCK:I = -0x13

.field public static final FDB_ST_INTERNAL_FAIL:I = -0x1a

.field public static final FDB_ST_INVALID_ID:I = -0x11

.field public static final FDB_ST_MSG_DECODE_FAIL:I = -0x17

.field public static final FDB_ST_NON_EXIST:I = -0x15

.field public static final FDB_ST_NOT_AVAILABLE:I = -0x19

.field public static final FDB_ST_NOT_IMPLEMENTED:I = -0x1c

.field public static final FDB_ST_OBJECT_NOT_FOUND:I = -0x1d

.field public static final FDB_ST_OK:I = 0x0

.field public static final FDB_ST_OUT_OF_MEMORY:I = -0x1b

.field public static final FDB_ST_PEER_VANISH:I = -0x12

.field public static final FDB_ST_SUBSCRIBE_FAIL:I = -0xd

.field public static final FDB_ST_SUBSCRIBE_OK:I = -0xc

.field public static final FDB_ST_TIMEOUT:I = -0x10

.field public static final FDB_ST_UNABLE_TO_SEND:I = -0x14

.field public static final FDB_ST_UNKNOWN:I = -0x80

.field public static final FDB_ST_UNSUBSCRIBE_FAIL:I = -0xf

.field public static final FDB_ST_UNSUBSCRIBE_OK:I = -0xe


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "fdbus-jni"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    const-class v0, Lipc/fdbus/SubscribeItem;

    const-class v1, Lipc/fdbus/FdbusMessage;

    const-class v2, Lipc/fdbus/FdbusServer;

    const-class v3, Lipc/fdbus/FdbusClient;

    invoke-direct {p0, v2, v3, v0, v1}, Lipc/fdbus/Fdbus;->fdb_init(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    return-void
.end method

.method public static LOG_D(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0, p1}, Lipc/fdbus/Fdbus;->fdb_log_trace(Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method public static LOG_E(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x4

    invoke-static {p0, v0, p1}, Lipc/fdbus/Fdbus;->fdb_log_trace(Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method public static LOG_F(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x5

    invoke-static {p0, v0, p1}, Lipc/fdbus/Fdbus;->fdb_log_trace(Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method public static LOG_I(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x2

    invoke-static {p0, v0, p1}, Lipc/fdbus/Fdbus;->fdb_log_trace(Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method public static LOG_W(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x3

    invoke-static {p0, v0, p1}, Lipc/fdbus/Fdbus;->fdb_log_trace(Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method public static encodeMessage(Ljava/lang/Object;Z)Lipc/fdbus/FdbusMsgBuilder;
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_3

    instance-of v1, p0, [B

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v1, p0, Lipc/fdbus/FdbusMsgBuilder;

    const-string v2, "fdbus-jni"

    if-eqz v1, :cond_2

    check-cast p0, Lipc/fdbus/FdbusMsgBuilder;

    invoke-virtual {p0, p1}, Lipc/fdbus/FdbusMsgBuilder;->build(Z)Z

    move-result p1

    if-nez p1, :cond_1

    const-string p0, "Fail to build message!\n"

    invoke-static {v2, p0}, Lipc/fdbus/Fdbus;->LOG_E(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_1
    return-object p0

    :cond_2
    const-string p0, "Unsupported message type!\n"

    invoke-static {v2, p0}, Lipc/fdbus/Fdbus;->LOG_E(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_3
    :goto_0
    new-instance p1, Lipc/fdbus/FdbusMsgBuilder;

    check-cast p0, [B

    invoke-direct {p1, p0, v0}, Lipc/fdbus/FdbusMsgBuilder;-><init>([BLjava/lang/String;)V

    return-object p1
.end method

.method private native fdb_init(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V
.end method

.method private static native fdb_log_trace(Ljava/lang/String;ILjava/lang/String;)V
.end method
