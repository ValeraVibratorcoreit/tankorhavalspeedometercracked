.class public final synthetic LG9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lru/zinovin/tankspeedometer/DownloadActivity;

.field public final synthetic b:Ljava/util/concurrent/CountDownLatch;

.field public final synthetic c:LP2;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lru/zinovin/tankspeedometer/DownloadActivity;Ljava/util/concurrent/CountDownLatch;LP2;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LG9;->a:Lru/zinovin/tankspeedometer/DownloadActivity;

    iput-object p2, p0, LG9;->b:Ljava/util/concurrent/CountDownLatch;

    iput-object p3, p0, LG9;->c:LP2;

    iput-object p4, p0, LG9;->d:Ljava/lang/String;

    iput-object p5, p0, LG9;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, LG9;->a:Lru/zinovin/tankspeedometer/DownloadActivity;

    iget-object v1, p0, LG9;->b:Ljava/util/concurrent/CountDownLatch;

    iget-object v2, p0, LG9;->c:LP2;

    iget-object v3, p0, LG9;->d:Ljava/lang/String;

    iget-object v4, p0, LG9;->e:Ljava/lang/String;

    const-string v5, "Failed to download: "

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v6, v2, LP2;->a:Ljava/lang/String;

    invoke-virtual {v0, v6, v3, v4}, Lru/zinovin/tankspeedometer/DownloadActivity;->F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    iget-object v4, v0, Lru/zinovin/tankspeedometer/DownloadActivity;->N:Ljava/lang/Object;

    monitor-enter v4

    if-nez v3, :cond_0

    :try_start_0
    iget-object v0, v0, Lru/zinovin/tankspeedometer/DownloadActivity;->M:Ljava/util/ArrayList;

    iget-object v3, v2, LP2;->a:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v0, "T500.DOWNLOADER"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, v2, LP2;->a:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lyr;->g:Lyr;

    invoke-static {v0, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v3, Lyr;->g:Lyr;

    if-eqz v3, :cond_1

    const-string v5, "WARN"

    invoke-virtual {v3, v5, v0, v2}, Lyr;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    iget-object v2, v0, Lru/zinovin/tankspeedometer/DownloadActivity;->G:Landroid/os/Handler;

    new-instance v3, Lx9;

    const/4 v5, 0x0

    invoke-direct {v3, v0, v5}, Lx9;-><init>(Lru/zinovin/tankspeedometer/DownloadActivity;I)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    :goto_0
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void

    :goto_1
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
