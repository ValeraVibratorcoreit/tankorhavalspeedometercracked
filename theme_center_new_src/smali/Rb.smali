.class public final LRb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lipc/fdbus/FdbusClientListener;


# instance fields
.field public final a:LLf;

.field public final b:Ljava/lang/Object;

.field public volatile c:Lipc/fdbus/FdbusClient;

.field public volatile d:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LLf;->a()LLf;

    move-result-object v0

    iput-object v0, p0, LRb;->a:LLf;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LRb;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    const-string v0, "T500.FdbusReader"

    const/4 v1, 0x0

    iput-boolean v1, p0, LRb;->d:Z

    iget-object v1, p0, LRb;->c:Lipc/fdbus/FdbusClient;

    const/4 v2, 0x0

    iput-object v2, p0, LRb;->c:Lipc/fdbus/FdbusClient;

    if-eqz v1, :cond_0

    :try_start_0
    invoke-virtual {v1}, Lipc/fdbus/FdbusClient;->disconnect()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    const-string v3, "Disconnect failed"

    invoke-static {v0, v3, v2}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    :try_start_1
    invoke-virtual {v1}, Lipc/fdbus/FdbusClient;->destroy()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    const-string v2, "Destroy failed"

    invoke-static {v0, v2, v1}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_1
    return-void
.end method

.method public final onBroadcast(Lipc/fdbus/FdbusMessage;)V
    .locals 9

    iget-boolean v0, p0, LRb;->d:Z

    if-eqz v0, :cond_a

    invoke-virtual {p1}, Lipc/fdbus/FdbusMessage;->code()I

    move-result v0

    const/16 v1, 0x100

    if-eq v0, v1, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p1}, Lipc/fdbus/FdbusMessage;->byteArray()[B

    move-result-object p1

    const/16 v0, 0x8

    const/4 v1, 0x0

    if-eqz p1, :cond_6

    array-length v2, p1

    const/16 v3, 0xa

    if-lt v2, v3, :cond_6

    const/4 v2, 0x0

    aget-byte v4, p1, v2

    if-eq v4, v3, :cond_1

    goto :goto_2

    :cond_1
    const/4 v3, 0x1

    move v5, v2

    move v6, v5

    move v4, v3

    :goto_0
    array-length v7, p1

    if-ge v4, v7, :cond_3

    const/16 v7, 0x1c

    if-gt v5, v7, :cond_3

    add-int/lit8 v7, v4, 0x1

    aget-byte v4, p1, v4

    and-int/lit8 v8, v4, 0x7f

    shl-int/2addr v8, v5

    or-int/2addr v6, v8

    and-int/lit16 v4, v4, 0x80

    if-nez v4, :cond_2

    move v4, v7

    goto :goto_1

    :cond_2
    add-int/lit8 v5, v5, 0x7

    move v4, v7

    goto :goto_0

    :cond_3
    move v3, v2

    :goto_1
    if-eqz v3, :cond_6

    const/4 v3, 0x7

    if-lt v6, v3, :cond_6

    add-int v5, v4, v6

    array-length v7, p1

    if-le v5, v7, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 v5, v4, 0x2

    aget-byte v5, p1, v5

    and-int/lit16 v5, v5, 0xff

    sub-int/2addr v6, v3

    if-le v5, v6, :cond_5

    goto :goto_2

    :cond_5
    add-int/lit8 v1, v4, 0x4

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    add-int/lit8 v6, v4, 0x5

    aget-byte v6, p1, v6

    and-int/lit16 v6, v6, 0xff

    shl-int/2addr v6, v0

    or-int/2addr v1, v6

    add-int/lit8 v6, v4, 0x6

    aget-byte v6, p1, v6

    and-int/lit16 v6, v6, 0xff

    or-int/2addr v1, v6

    new-array v6, v5, [B

    add-int/2addr v4, v3

    invoke-static {p1, v4, v6, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance p1, LQ0;

    invoke-direct {p1, v1, v6}, LQ0;-><init>(ILjava/lang/Object;)V

    move-object v1, p1

    :cond_6
    :goto_2
    if-eqz v1, :cond_a

    iget p1, v1, LQ0;->a:I

    const/16 v2, 0x111

    if-ne p1, v2, :cond_a

    iget-object p1, v1, LQ0;->b:Ljava/lang/Object;

    check-cast p1, [B

    array-length v1, p1

    if-ge v1, v0, :cond_7

    goto :goto_3

    :cond_7
    const/4 v1, 0x5

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v0, v1, 0x8

    const/4 v1, 0x6

    aget-byte p1, p1, v1

    and-int/lit16 p1, p1, 0xff

    or-int/2addr p1, v0

    const v0, 0xffff

    if-ne p1, v0, :cond_8

    return-void

    :cond_8
    int-to-float p1, p1

    const/high16 v0, 0x41000000    # 8.0f

    div-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result v0

    if-ltz v0, :cond_a

    const/16 v1, 0x1f40

    if-le v0, v1, :cond_9

    goto :goto_3

    :cond_9
    iget-object v0, p0, LRb;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LRb;->a:LLf;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iget-object v1, v1, LLf;->b:Ldr;

    invoke-virtual {v1, p1}, Ldr;->f(Ljava/lang/Object;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_a
    :goto_3
    return-void
.end method

.method public final onGetEvent(Lipc/fdbus/FdbusMessage;)V
    .locals 0

    return-void
.end method

.method public final onOffline(I)V
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Offline sid="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "; Binder fallback will take over"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lyr;->g:Lyr;

    const-string v0, "T500.FdbusReader"

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v1, Lyr;->g:Lyr;

    if-eqz v1, :cond_0

    const-string v2, "WARN"

    invoke-virtual {v1, v2, v0, p1}, Lyr;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final onOnline(I)V
    .locals 3

    iget-object v0, p0, LRb;->c:Lipc/fdbus/FdbusClient;

    iget-boolean v1, p0, LRb;->d:Z

    if-eqz v1, :cond_1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    const/16 v2, 0x100

    invoke-static {v2}, Lipc/fdbus/SubscribeItem;->newEvent(I)Lipc/fdbus/SubscribeItem;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0, v1}, Lipc/fdbus/FdbusClient;->subscribe(Ljava/util/ArrayList;)Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Online sid="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " subscribeAccepted="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "T500.FdbusReader"

    invoke-static {v0, p1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final onReply(Lipc/fdbus/FdbusMessage;)V
    .locals 0

    return-void
.end method
