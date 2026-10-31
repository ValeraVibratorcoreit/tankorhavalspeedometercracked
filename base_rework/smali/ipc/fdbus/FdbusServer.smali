.class public Lipc/fdbus/FdbusServer;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private mFdbusListener:Lipc/fdbus/FdbusServerListener;

.field private mNativeHandle:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 8
    invoke-direct {p0, v0, v0}, Lipc/fdbus/FdbusServer;->initialize(Ljava/lang/String;Lipc/fdbus/FdbusServerListener;)V

    return-void
.end method

.method public constructor <init>(Lipc/fdbus/FdbusServerListener;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0, p1}, Lipc/fdbus/FdbusServer;->initialize(Ljava/lang/String;Lipc/fdbus/FdbusServerListener;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 6
    invoke-direct {p0, p1, v0}, Lipc/fdbus/FdbusServer;->initialize(Ljava/lang/String;Lipc/fdbus/FdbusServerListener;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lipc/fdbus/FdbusServerListener;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-direct {p0, p1, p2}, Lipc/fdbus/FdbusServer;->initialize(Ljava/lang/String;Lipc/fdbus/FdbusServerListener;)V

    return-void
.end method

.method private callbackInvoke(II[BJ)V
    .locals 7

    iget-object v0, p0, Lipc/fdbus/FdbusServer;->mFdbusListener:Lipc/fdbus/FdbusServerListener;

    if-eqz v0, :cond_0

    new-instance v0, Lipc/fdbus/FdbusMessage;

    move-object v1, v0

    move-wide v2, p4

    move v4, p1

    move v5, p2

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Lipc/fdbus/FdbusMessage;-><init>(JII[B)V

    iget-object p1, p0, Lipc/fdbus/FdbusServer;->mFdbusListener:Lipc/fdbus/FdbusServerListener;

    invoke-interface {p1, v0}, Lipc/fdbus/FdbusServerListener;->onInvoke(Lipc/fdbus/FdbusMessage;)V

    :cond_0
    return-void
.end method

.method private callbackOffline(IZ)V
    .locals 1

    iget-object v0, p0, Lipc/fdbus/FdbusServer;->mFdbusListener:Lipc/fdbus/FdbusServerListener;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lipc/fdbus/FdbusServerListener;->onOffline(IZ)V

    :cond_0
    return-void
.end method

.method private callbackOnline(IZ)V
    .locals 1

    iget-object v0, p0, Lipc/fdbus/FdbusServer;->mFdbusListener:Lipc/fdbus/FdbusServerListener;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lipc/fdbus/FdbusServerListener;->onOnline(IZ)V

    :cond_0
    return-void
.end method

.method private callbackSubscribe(IJLjava/util/ArrayList;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJ",
            "Ljava/util/ArrayList<",
            "Lipc/fdbus/SubscribeItem;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lipc/fdbus/FdbusServer;->mFdbusListener:Lipc/fdbus/FdbusServerListener;

    if-eqz v0, :cond_0

    new-instance v0, Lipc/fdbus/FdbusMessage;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, v0

    move-wide v2, p2

    move v4, p1

    invoke-direct/range {v1 .. v6}, Lipc/fdbus/FdbusMessage;-><init>(JII[B)V

    iget-object p1, p0, Lipc/fdbus/FdbusServer;->mFdbusListener:Lipc/fdbus/FdbusServerListener;

    invoke-interface {p1, v0, p4}, Lipc/fdbus/FdbusServerListener;->onSubscribe(Lipc/fdbus/FdbusMessage;Ljava/util/ArrayList;)V

    :cond_0
    return-void
.end method

.method private native fdb_bind(JLjava/lang/String;)Z
.end method

.method private native fdb_broadcast(JILjava/lang/String;[BLjava/lang/String;)Z
.end method

.method private native fdb_bus_name(J)Ljava/lang/String;
.end method

.method private native fdb_create(Ljava/lang/String;)J
.end method

.method private native fdb_destroy(J)V
.end method

.method private native fdb_enable_event_cache(JZ)V
.end method

.method private native fdb_endpoint_name(J)Ljava/lang/String;
.end method

.method private native fdb_init_event_cache(JILjava/lang/String;[BZ)V
.end method

.method private native fdb_log_enabled(JI)Z
.end method

.method private native fdb_unbind(J)Z
.end method

.method private initialize(Ljava/lang/String;Lipc/fdbus/FdbusServerListener;)V
    .locals 2

    invoke-direct {p0, p1}, Lipc/fdbus/FdbusServer;->fdb_create(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lipc/fdbus/FdbusServer;->mNativeHandle:J

    iput-object p2, p0, Lipc/fdbus/FdbusServer;->mFdbusListener:Lipc/fdbus/FdbusServerListener;

    return-void
.end method


# virtual methods
.method public bind()Z
    .locals 2

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "svc://"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lipc/fdbus/FdbusServer;->busName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lipc/fdbus/FdbusServer;->bind(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public bind(Ljava/lang/String;)Z
    .locals 2

    .line 1
    iget-wide v0, p0, Lipc/fdbus/FdbusServer;->mNativeHandle:J

    invoke-direct {p0, v0, v1, p1}, Lipc/fdbus/FdbusServer;->fdb_bind(JLjava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public broadcast(ILjava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, p1, v0, p2}, Lipc/fdbus/FdbusServer;->broadcast(ILjava/lang/String;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public broadcast(ILjava/lang/String;Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x4

    .line 1
    invoke-virtual {p0, v0}, Lipc/fdbus/FdbusServer;->logEnabled(I)Z

    move-result v0

    invoke-static {p3, v0}, Lipc/fdbus/Fdbus;->encodeMessage(Ljava/lang/Object;Z)Lipc/fdbus/FdbusMsgBuilder;

    move-result-object p3

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    iget-wide v1, p0, Lipc/fdbus/FdbusServer;->mNativeHandle:J

    invoke-virtual {p3}, Lipc/fdbus/FdbusMsgBuilder;->toBuffer()[B

    move-result-object v5

    invoke-virtual {p3}, Lipc/fdbus/FdbusMsgBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    move-object v0, p0

    move v3, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v6}, Lipc/fdbus/FdbusServer;->fdb_broadcast(JILjava/lang/String;[BLjava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public busName()Ljava/lang/String;
    .locals 2

    iget-wide v0, p0, Lipc/fdbus/FdbusServer;->mNativeHandle:J

    invoke-direct {p0, v0, v1}, Lipc/fdbus/FdbusServer;->fdb_bus_name(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public destroy()V
    .locals 4

    iget-wide v0, p0, Lipc/fdbus/FdbusServer;->mNativeHandle:J

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lipc/fdbus/FdbusServer;->mNativeHandle:J

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    invoke-direct {p0, v0, v1}, Lipc/fdbus/FdbusServer;->fdb_destroy(J)V

    :cond_0
    return-void
.end method

.method public enableEventCache(Z)V
    .locals 2

    iget-wide v0, p0, Lipc/fdbus/FdbusServer;->mNativeHandle:J

    invoke-direct {p0, v0, v1, p1}, Lipc/fdbus/FdbusServer;->fdb_enable_event_cache(JZ)V

    return-void
.end method

.method public endpointName()Ljava/lang/String;
    .locals 2

    iget-wide v0, p0, Lipc/fdbus/FdbusServer;->mNativeHandle:J

    invoke-direct {p0, v0, v1}, Lipc/fdbus/FdbusServer;->fdb_endpoint_name(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public initEventCache(ILjava/lang/String;Ljava/lang/Object;Z)Z
    .locals 8

    const/4 v0, 0x0

    invoke-static {p3, v0}, Lipc/fdbus/Fdbus;->encodeMessage(Ljava/lang/Object;Z)Lipc/fdbus/FdbusMsgBuilder;

    move-result-object p3

    if-nez p3, :cond_0

    return v0

    :cond_0
    iget-wide v2, p0, Lipc/fdbus/FdbusServer;->mNativeHandle:J

    invoke-virtual {p3}, Lipc/fdbus/FdbusMsgBuilder;->toBuffer()[B

    move-result-object v6

    move-object v1, p0

    move v4, p1

    move-object v5, p2

    move v7, p4

    invoke-direct/range {v1 .. v7}, Lipc/fdbus/FdbusServer;->fdb_init_event_cache(JILjava/lang/String;[BZ)V

    const/4 p1, 0x1

    return p1
.end method

.method public logEnabled(I)Z
    .locals 2

    iget-wide v0, p0, Lipc/fdbus/FdbusServer;->mNativeHandle:J

    invoke-direct {p0, v0, v1, p1}, Lipc/fdbus/FdbusServer;->fdb_log_enabled(JI)Z

    move-result p1

    return p1
.end method

.method public setListener(Lipc/fdbus/FdbusServerListener;)V
    .locals 0

    iput-object p1, p0, Lipc/fdbus/FdbusServer;->mFdbusListener:Lipc/fdbus/FdbusServerListener;

    return-void
.end method

.method public unbind()Z
    .locals 2

    iget-wide v0, p0, Lipc/fdbus/FdbusServer;->mNativeHandle:J

    invoke-direct {p0, v0, v1}, Lipc/fdbus/FdbusServer;->fdb_unbind(J)Z

    move-result v0

    return v0
.end method
