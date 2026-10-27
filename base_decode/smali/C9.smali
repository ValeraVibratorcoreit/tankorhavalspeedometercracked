.class public final synthetic LC9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lru/zinovin/tankspeedometer/DownloadActivity;

.field public final synthetic c:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method public synthetic constructor <init>(Lru/zinovin/tankspeedometer/DownloadActivity;Ljava/util/concurrent/CountDownLatch;I)V
    .locals 0

    iput p3, p0, LC9;->a:I

    iput-object p1, p0, LC9;->b:Lru/zinovin/tankspeedometer/DownloadActivity;

    iput-object p2, p0, LC9;->c:Ljava/util/concurrent/CountDownLatch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, LC9;->b:Lru/zinovin/tankspeedometer/DownloadActivity;

    iget-object v1, p0, LC9;->c:Ljava/util/concurrent/CountDownLatch;

    iget v2, p0, LC9;->a:I

    packed-switch v2, :pswitch_data_0

    sget-object v2, Lru/zinovin/tankspeedometer/DownloadActivity;->O:Lmi;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x14

    invoke-virtual {v1, v3, v4, v2}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, v0, Lru/zinovin/tankspeedometer/DownloadActivity;->G:Landroid/os/Handler;

    new-instance v2, Lx9;

    const/4 v3, 0x5

    invoke-direct {v2, v0, v3}, Lx9;-><init>(Lru/zinovin/tankspeedometer/DownloadActivity;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    iget-object v1, v0, Lru/zinovin/tankspeedometer/DownloadActivity;->G:Landroid/os/Handler;

    new-instance v2, Lx9;

    const/4 v3, 0x6

    invoke-direct {v2, v0, v3}, Lx9;-><init>(Lru/zinovin/tankspeedometer/DownloadActivity;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iget-object v1, v0, Lru/zinovin/tankspeedometer/DownloadActivity;->G:Landroid/os/Handler;

    new-instance v2, Lx9;

    const/4 v3, 0x7

    invoke-direct {v2, v0, v3}, Lx9;-><init>(Lru/zinovin/tankspeedometer/DownloadActivity;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_0
    return-void

    :pswitch_0
    sget-object v2, Lru/zinovin/tankspeedometer/DownloadActivity;->O:Lmi;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_1
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x3

    invoke-virtual {v1, v3, v4, v2}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    move-result v1

    invoke-virtual {v0}, Lru/zinovin/tankspeedometer/DownloadActivity;->J()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, v0, Lru/zinovin/tankspeedometer/DownloadActivity;->G:Landroid/os/Handler;

    new-instance v3, LD9;

    const/4 v4, 0x1

    invoke-direct {v3, v0, v1, v4}, LD9;-><init>(Lru/zinovin/tankspeedometer/DownloadActivity;ZI)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    invoke-virtual {v0}, Lru/zinovin/tankspeedometer/DownloadActivity;->J()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, v0, Lru/zinovin/tankspeedometer/DownloadActivity;->G:Landroid/os/Handler;

    new-instance v2, Lx9;

    const/4 v3, 0x3

    invoke-direct {v2, v0, v3}, Lx9;-><init>(Lru/zinovin/tankspeedometer/DownloadActivity;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
