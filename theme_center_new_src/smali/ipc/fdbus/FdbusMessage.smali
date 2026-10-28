.class public Lipc/fdbus/FdbusMessage;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private mMsgCode:I

.field private mNativeHandle:J

.field private mPayload:[B

.field private mSid:I

.field private mStatus:I

.field private mTopic:Ljava/lang/String;

.field private mUserData:Ljava/lang/Object;


# direct methods
.method public constructor <init>(IILjava/lang/String;[BI)V
    .locals 9

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v1, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move v3, p1

    move v4, p2

    move-object v5, p3

    move-object v6, p4

    move v8, p5

    .line 10
    invoke-direct/range {v0 .. v8}, Lipc/fdbus/FdbusMessage;->initialize(JIILjava/lang/String;[BLjava/lang/Object;I)V

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;[BLjava/lang/Object;I)V
    .locals 9

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v1, 0x0

    move-object v0, p0

    move v3, p1

    move v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    move v8, p6

    .line 4
    invoke-direct/range {v0 .. v8}, Lipc/fdbus/FdbusMessage;->initialize(JIILjava/lang/String;[BLjava/lang/Object;I)V

    return-void
.end method

.method public constructor <init>(II[B)V
    .locals 9

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v1, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move v3, p1

    move v4, p2

    move-object v6, p3

    .line 12
    invoke-direct/range {v0 .. v8}, Lipc/fdbus/FdbusMessage;->initialize(JIILjava/lang/String;[BLjava/lang/Object;I)V

    return-void
.end method

.method public constructor <init>(II[BI)V
    .locals 9

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v5, 0x0

    const/4 v7, 0x0

    const-wide/16 v1, 0x0

    move-object v0, p0

    move v3, p1

    move v4, p2

    move-object v6, p3

    move v8, p4

    .line 8
    invoke-direct/range {v0 .. v8}, Lipc/fdbus/FdbusMessage;->initialize(JIILjava/lang/String;[BLjava/lang/Object;I)V

    return-void
.end method

.method public constructor <init>(II[BLjava/lang/Object;)V
    .locals 9

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v5, 0x0

    const/4 v8, 0x0

    const-wide/16 v1, 0x0

    move-object v0, p0

    move v3, p1

    move v4, p2

    move-object v6, p3

    move-object v7, p4

    .line 6
    invoke-direct/range {v0 .. v8}, Lipc/fdbus/FdbusMessage;->initialize(JIILjava/lang/String;[BLjava/lang/Object;I)V

    return-void
.end method

.method public constructor <init>(II[BLjava/lang/Object;I)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v1, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move v3, p1

    move v4, p2

    move-object v6, p3

    move-object v7, p4

    move v8, p5

    .line 2
    invoke-direct/range {v0 .. v8}, Lipc/fdbus/FdbusMessage;->initialize(JIILjava/lang/String;[BLjava/lang/Object;I)V

    return-void
.end method

.method public constructor <init>(JII[B)V
    .locals 9

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v1, p1

    move v3, p3

    move v4, p4

    move-object v6, p5

    .line 14
    invoke-direct/range {v0 .. v8}, Lipc/fdbus/FdbusMessage;->initialize(JIILjava/lang/String;[BLjava/lang/Object;I)V

    return-void
.end method

.method private destroy()V
    .locals 4

    iget-wide v0, p0, Lipc/fdbus/FdbusMessage;->mNativeHandle:J

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lipc/fdbus/FdbusMessage;->mNativeHandle:J

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    invoke-direct {p0, v0, v1}, Lipc/fdbus/FdbusMessage;->fdb_destroy(J)V

    :cond_0
    return-void
.end method

.method private native fdb_broadcast(JILjava/lang/String;[BLjava/lang/String;)Z
.end method

.method private native fdb_destroy(J)V
.end method

.method private native fdb_log_enabled(J)Z
.end method

.method private native fdb_reply(J[BLjava/lang/String;)Z
.end method

.method private initialize(JIILjava/lang/String;[BLjava/lang/Object;I)V
    .locals 0

    iput-wide p1, p0, Lipc/fdbus/FdbusMessage;->mNativeHandle:J

    iput p3, p0, Lipc/fdbus/FdbusMessage;->mSid:I

    iput p4, p0, Lipc/fdbus/FdbusMessage;->mMsgCode:I

    iput-object p6, p0, Lipc/fdbus/FdbusMessage;->mPayload:[B

    iput-object p7, p0, Lipc/fdbus/FdbusMessage;->mUserData:Ljava/lang/Object;

    iput-object p5, p0, Lipc/fdbus/FdbusMessage;->mTopic:Ljava/lang/String;

    iput p8, p0, Lipc/fdbus/FdbusMessage;->mStatus:I

    return-void
.end method


# virtual methods
.method public broadcast(ILjava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x0

    .line 4
    invoke-virtual {p0, p1, v0, p2}, Lipc/fdbus/FdbusMessage;->broadcast(ILjava/lang/String;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public broadcast(ILjava/lang/String;Ljava/lang/Object;)Z
    .locals 7

    .line 1
    invoke-virtual {p0}, Lipc/fdbus/FdbusMessage;->logEnabled()Z

    move-result v0

    invoke-static {p3, v0}, Lipc/fdbus/Fdbus;->encodeMessage(Ljava/lang/Object;Z)Lipc/fdbus/FdbusMsgBuilder;

    move-result-object p3

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    iget-wide v1, p0, Lipc/fdbus/FdbusMessage;->mNativeHandle:J

    invoke-virtual {p3}, Lipc/fdbus/FdbusMsgBuilder;->toBuffer()[B

    move-result-object v5

    invoke-virtual {p3}, Lipc/fdbus/FdbusMsgBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    move-object v0, p0

    move v3, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v6}, Lipc/fdbus/FdbusMessage;->fdb_broadcast(JILjava/lang/String;[BLjava/lang/String;)Z

    move-result p1

    .line 3
    invoke-direct {p0}, Lipc/fdbus/FdbusMessage;->destroy()V

    return p1
.end method

.method public byteArray()[B
    .locals 1

    iget-object v0, p0, Lipc/fdbus/FdbusMessage;->mPayload:[B

    return-object v0
.end method

.method public code()I
    .locals 1

    iget v0, p0, Lipc/fdbus/FdbusMessage;->mMsgCode:I

    return v0
.end method

.method public logEnabled()Z
    .locals 2

    iget-wide v0, p0, Lipc/fdbus/FdbusMessage;->mNativeHandle:J

    invoke-direct {p0, v0, v1}, Lipc/fdbus/FdbusMessage;->fdb_log_enabled(J)Z

    move-result v0

    return v0
.end method

.method public reply(Ljava/lang/Object;)Z
    .locals 3

    invoke-virtual {p0}, Lipc/fdbus/FdbusMessage;->logEnabled()Z

    move-result v0

    invoke-static {p1, v0}, Lipc/fdbus/Fdbus;->encodeMessage(Ljava/lang/Object;Z)Lipc/fdbus/FdbusMsgBuilder;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-wide v0, p0, Lipc/fdbus/FdbusMessage;->mNativeHandle:J

    invoke-virtual {p1}, Lipc/fdbus/FdbusMsgBuilder;->toBuffer()[B

    move-result-object v2

    invoke-virtual {p1}, Lipc/fdbus/FdbusMsgBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, v1, v2, p1}, Lipc/fdbus/FdbusMessage;->fdb_reply(J[BLjava/lang/String;)Z

    move-result p1

    invoke-direct {p0}, Lipc/fdbus/FdbusMessage;->destroy()V

    return p1
.end method

.method public returnValue()I
    .locals 1

    iget v0, p0, Lipc/fdbus/FdbusMessage;->mStatus:I

    return v0
.end method

.method public sid()I
    .locals 1

    iget v0, p0, Lipc/fdbus/FdbusMessage;->mSid:I

    return v0
.end method

.method public topic()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lipc/fdbus/FdbusMessage;->mTopic:Ljava/lang/String;

    return-object v0
.end method

.method public topic(Ljava/lang/String;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lipc/fdbus/FdbusMessage;->mTopic:Ljava/lang/String;

    return-void
.end method

.method public userData()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lipc/fdbus/FdbusMessage;->mUserData:Ljava/lang/Object;

    return-object v0
.end method
