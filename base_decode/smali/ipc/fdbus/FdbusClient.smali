.class public Lipc/fdbus/FdbusClient;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private mFdbusListener:Lipc/fdbus/FdbusClientListener;

.field private mNativeHandle:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 8
    invoke-direct {p0, v0, v0}, Lipc/fdbus/FdbusClient;->initialize(Ljava/lang/String;Lipc/fdbus/FdbusClientListener;)V

    return-void
.end method

.method public constructor <init>(Lipc/fdbus/FdbusClientListener;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0, p1}, Lipc/fdbus/FdbusClient;->initialize(Ljava/lang/String;Lipc/fdbus/FdbusClientListener;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 6
    invoke-direct {p0, p1, v0}, Lipc/fdbus/FdbusClient;->initialize(Ljava/lang/String;Lipc/fdbus/FdbusClientListener;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lipc/fdbus/FdbusClientListener;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-direct {p0, p1, p2}, Lipc/fdbus/FdbusClient;->initialize(Ljava/lang/String;Lipc/fdbus/FdbusClientListener;)V

    return-void
.end method

.method private callbackBroadcast(IILjava/lang/String;[B)V
    .locals 1

    iget-object v0, p0, Lipc/fdbus/FdbusClient;->mFdbusListener:Lipc/fdbus/FdbusClientListener;

    if-eqz v0, :cond_0

    new-instance v0, Lipc/fdbus/FdbusMessage;

    invoke-direct {v0, p1, p2, p4}, Lipc/fdbus/FdbusMessage;-><init>(II[B)V

    invoke-virtual {v0, p3}, Lipc/fdbus/FdbusMessage;->topic(Ljava/lang/String;)V

    iget-object p1, p0, Lipc/fdbus/FdbusClient;->mFdbusListener:Lipc/fdbus/FdbusClientListener;

    invoke-interface {p1, v0}, Lipc/fdbus/FdbusClientListener;->onBroadcast(Lipc/fdbus/FdbusMessage;)V

    :cond_0
    return-void
.end method

.method private callbackGetEvent(IILjava/lang/String;[BILjava/lang/Object;)V
    .locals 8

    iget-object v0, p0, Lipc/fdbus/FdbusClient;->mFdbusListener:Lipc/fdbus/FdbusClientListener;

    if-eqz v0, :cond_0

    new-instance v0, Lipc/fdbus/FdbusMessage;

    move-object v1, v0

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p6

    move v7, p5

    invoke-direct/range {v1 .. v7}, Lipc/fdbus/FdbusMessage;-><init>(IILjava/lang/String;[BLjava/lang/Object;I)V

    iget-object p1, p0, Lipc/fdbus/FdbusClient;->mFdbusListener:Lipc/fdbus/FdbusClientListener;

    invoke-interface {p1, v0}, Lipc/fdbus/FdbusClientListener;->onGetEvent(Lipc/fdbus/FdbusMessage;)V

    :cond_0
    return-void
.end method

.method private callbackOffline(I)V
    .locals 1

    iget-object v0, p0, Lipc/fdbus/FdbusClient;->mFdbusListener:Lipc/fdbus/FdbusClientListener;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lipc/fdbus/FdbusClientListener;->onOffline(I)V

    :cond_0
    return-void
.end method

.method private callbackOnline(I)V
    .locals 1

    iget-object v0, p0, Lipc/fdbus/FdbusClient;->mFdbusListener:Lipc/fdbus/FdbusClientListener;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lipc/fdbus/FdbusClientListener;->onOnline(I)V

    :cond_0
    return-void
.end method

.method private callbackReply(II[BILjava/lang/Object;)V
    .locals 7

    iget-object v0, p0, Lipc/fdbus/FdbusClient;->mFdbusListener:Lipc/fdbus/FdbusClientListener;

    if-eqz v0, :cond_0

    new-instance v0, Lipc/fdbus/FdbusMessage;

    move-object v1, v0

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p5

    move v6, p4

    invoke-direct/range {v1 .. v6}, Lipc/fdbus/FdbusMessage;-><init>(II[BLjava/lang/Object;I)V

    iget-object p1, p0, Lipc/fdbus/FdbusClient;->mFdbusListener:Lipc/fdbus/FdbusClientListener;

    invoke-interface {p1, v0}, Lipc/fdbus/FdbusClientListener;->onReply(Lipc/fdbus/FdbusMessage;)V

    :cond_0
    return-void
.end method

.method private native fdb_bus_name(J)Ljava/lang/String;
.end method

.method private native fdb_connect(JLjava/lang/String;)Z
.end method

.method private native fdb_create(Ljava/lang/String;)J
.end method

.method private native fdb_destroy(J)V
.end method

.method private native fdb_disconnect(J)Z
.end method

.method private native fdb_endpoint_name(J)Ljava/lang/String;
.end method

.method private native fdb_get_event_async(JILjava/lang/String;Ljava/lang/Object;I)Z
.end method

.method private native fdb_get_event_sync(JILjava/lang/String;I)Lipc/fdbus/FdbusMessage;
.end method

.method private native fdb_invoke_async(JI[BLjava/lang/String;Ljava/lang/Object;I)Z
.end method

.method private native fdb_invoke_sync(JI[BLjava/lang/String;I)Lipc/fdbus/FdbusMessage;
.end method

.method private native fdb_log_enabled(JI)Z
.end method

.method private native fdb_publish(JILjava/lang/String;[BLjava/lang/String;Z)Z
.end method

.method private native fdb_send(JI[BLjava/lang/String;)Z
.end method

.method private native fdb_subscribe(JLjava/util/ArrayList;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/ArrayList<",
            "Lipc/fdbus/SubscribeItem;",
            ">;)Z"
        }
    .end annotation
.end method

.method private native fdb_unsubscribe(JLjava/util/ArrayList;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/ArrayList<",
            "Lipc/fdbus/SubscribeItem;",
            ">;)Z"
        }
    .end annotation
.end method

.method private initialize(Ljava/lang/String;Lipc/fdbus/FdbusClientListener;)V
    .locals 2

    invoke-direct {p0, p1}, Lipc/fdbus/FdbusClient;->fdb_create(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lipc/fdbus/FdbusClient;->mNativeHandle:J

    iput-object p2, p0, Lipc/fdbus/FdbusClient;->mFdbusListener:Lipc/fdbus/FdbusClientListener;

    return-void
.end method


# virtual methods
.method public busName()Ljava/lang/String;
    .locals 2

    iget-wide v0, p0, Lipc/fdbus/FdbusClient;->mNativeHandle:J

    invoke-direct {p0, v0, v1}, Lipc/fdbus/FdbusClient;->fdb_bus_name(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public connect()Z
    .locals 2

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "svc://"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lipc/fdbus/FdbusClient;->busName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lipc/fdbus/FdbusClient;->connect(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public connect(Ljava/lang/String;)Z
    .locals 2

    .line 1
    iget-wide v0, p0, Lipc/fdbus/FdbusClient;->mNativeHandle:J

    invoke-direct {p0, v0, v1, p1}, Lipc/fdbus/FdbusClient;->fdb_connect(JLjava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public destroy()V
    .locals 4

    iget-wide v0, p0, Lipc/fdbus/FdbusClient;->mNativeHandle:J

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lipc/fdbus/FdbusClient;->mNativeHandle:J

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    invoke-direct {p0, v0, v1}, Lipc/fdbus/FdbusClient;->fdb_destroy(J)V

    :cond_0
    return-void
.end method

.method public disconnect()Z
    .locals 2

    iget-wide v0, p0, Lipc/fdbus/FdbusClient;->mNativeHandle:J

    invoke-direct {p0, v0, v1}, Lipc/fdbus/FdbusClient;->fdb_disconnect(J)Z

    move-result v0

    return v0
.end method

.method public endpointName()Ljava/lang/String;
    .locals 2

    iget-wide v0, p0, Lipc/fdbus/FdbusClient;->mNativeHandle:J

    invoke-direct {p0, v0, v1}, Lipc/fdbus/FdbusClient;->fdb_endpoint_name(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getAsync(ILjava/lang/String;Ljava/lang/Object;I)Z
    .locals 7

    iget-wide v1, p0, Lipc/fdbus/FdbusClient;->mNativeHandle:J

    move-object v0, p0

    move v3, p1

    move-object v4, p2

    move-object v5, p3

    move v6, p4

    invoke-direct/range {v0 .. v6}, Lipc/fdbus/FdbusClient;->fdb_get_event_async(JILjava/lang/String;Ljava/lang/Object;I)Z

    move-result p1

    return p1
.end method

.method public getSync(ILjava/lang/String;I)Lipc/fdbus/FdbusMessage;
    .locals 6

    iget-wide v1, p0, Lipc/fdbus/FdbusClient;->mNativeHandle:J

    move-object v0, p0

    move v3, p1

    move-object v4, p2

    move v5, p3

    invoke-direct/range {v0 .. v5}, Lipc/fdbus/FdbusClient;->fdb_get_event_sync(JILjava/lang/String;I)Lipc/fdbus/FdbusMessage;

    move-result-object p1

    return-object p1
.end method

.method public invokeAsync(ILjava/lang/Object;Ljava/lang/Object;I)Z
    .locals 8

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lipc/fdbus/FdbusClient;->logEnabled(I)Z

    move-result v0

    invoke-static {p2, v0}, Lipc/fdbus/Fdbus;->encodeMessage(Ljava/lang/Object;Z)Lipc/fdbus/FdbusMsgBuilder;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-wide v1, p0, Lipc/fdbus/FdbusClient;->mNativeHandle:J

    invoke-virtual {p2}, Lipc/fdbus/FdbusMsgBuilder;->toBuffer()[B

    move-result-object v4

    invoke-virtual {p2}, Lipc/fdbus/FdbusMsgBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    move-object v0, p0

    move v3, p1

    move-object v6, p3

    move v7, p4

    invoke-direct/range {v0 .. v7}, Lipc/fdbus/FdbusClient;->fdb_invoke_async(JI[BLjava/lang/String;Ljava/lang/Object;I)Z

    move-result p1

    return p1
.end method

.method public invokeSync(ILjava/lang/Object;I)Lipc/fdbus/FdbusMessage;
    .locals 7

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lipc/fdbus/FdbusClient;->logEnabled(I)Z

    move-result v0

    invoke-static {p2, v0}, Lipc/fdbus/Fdbus;->encodeMessage(Ljava/lang/Object;Z)Lipc/fdbus/FdbusMsgBuilder;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-wide v1, p0, Lipc/fdbus/FdbusClient;->mNativeHandle:J

    invoke-virtual {p2}, Lipc/fdbus/FdbusMsgBuilder;->toBuffer()[B

    move-result-object v4

    invoke-virtual {p2}, Lipc/fdbus/FdbusMsgBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    move-object v0, p0

    move v3, p1

    move v6, p3

    invoke-direct/range {v0 .. v6}, Lipc/fdbus/FdbusClient;->fdb_invoke_sync(JI[BLjava/lang/String;I)Lipc/fdbus/FdbusMessage;

    move-result-object p1

    return-object p1
.end method

.method public logEnabled(I)Z
    .locals 2

    iget-wide v0, p0, Lipc/fdbus/FdbusClient;->mNativeHandle:J

    invoke-direct {p0, v0, v1, p1}, Lipc/fdbus/FdbusClient;->fdb_log_enabled(JI)Z

    move-result p1

    return p1
.end method

.method public publish(ILjava/lang/String;Ljava/lang/Object;Z)Z
    .locals 8

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lipc/fdbus/FdbusClient;->logEnabled(I)Z

    move-result v0

    invoke-static {p3, v0}, Lipc/fdbus/Fdbus;->encodeMessage(Ljava/lang/Object;Z)Lipc/fdbus/FdbusMsgBuilder;

    move-result-object p3

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-wide v1, p0, Lipc/fdbus/FdbusClient;->mNativeHandle:J

    invoke-virtual {p3}, Lipc/fdbus/FdbusMsgBuilder;->toBuffer()[B

    move-result-object v5

    invoke-virtual {p3}, Lipc/fdbus/FdbusMsgBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    move-object v0, p0

    move v3, p1

    move-object v4, p2

    move v7, p4

    invoke-direct/range {v0 .. v7}, Lipc/fdbus/FdbusClient;->fdb_publish(JILjava/lang/String;[BLjava/lang/String;Z)Z

    move-result p1

    return p1
.end method

.method public send(ILjava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lipc/fdbus/FdbusClient;->logEnabled(I)Z

    move-result v0

    invoke-static {p2, v0}, Lipc/fdbus/Fdbus;->encodeMessage(Ljava/lang/Object;Z)Lipc/fdbus/FdbusMsgBuilder;

    move-result-object p2

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-wide v1, p0, Lipc/fdbus/FdbusClient;->mNativeHandle:J

    invoke-virtual {p2}, Lipc/fdbus/FdbusMsgBuilder;->toBuffer()[B

    move-result-object v4

    invoke-virtual {p2}, Lipc/fdbus/FdbusMsgBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    move-object v0, p0

    move v3, p1

    invoke-direct/range {v0 .. v5}, Lipc/fdbus/FdbusClient;->fdb_send(JI[BLjava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public setListener(Lipc/fdbus/FdbusClientListener;)V
    .locals 0

    iput-object p1, p0, Lipc/fdbus/FdbusClient;->mFdbusListener:Lipc/fdbus/FdbusClientListener;

    return-void
.end method

.method public subscribe(Ljava/util/ArrayList;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lipc/fdbus/SubscribeItem;",
            ">;)Z"
        }
    .end annotation

    iget-wide v0, p0, Lipc/fdbus/FdbusClient;->mNativeHandle:J

    invoke-direct {p0, v0, v1, p1}, Lipc/fdbus/FdbusClient;->fdb_subscribe(JLjava/util/ArrayList;)Z

    move-result p1

    return p1
.end method

.method public unsubscribe(Ljava/util/ArrayList;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lipc/fdbus/SubscribeItem;",
            ">;)Z"
        }
    .end annotation

    iget-wide v0, p0, Lipc/fdbus/FdbusClient;->mNativeHandle:J

    invoke-direct {p0, v0, v1, p1}, Lipc/fdbus/FdbusClient;->fdb_unsubscribe(JLjava/util/ArrayList;)Z

    move-result p1

    return p1
.end method
