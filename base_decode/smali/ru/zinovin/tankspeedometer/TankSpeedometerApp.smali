.class public Lru/zinovin/tankspeedometer/TankSpeedometerApp;
.super Landroid/app/Application;
.source "SourceFile"

# interfaces
.implements Landroid/content/ComponentCallbacks2;


# instance fields
.field public a:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lru/zinovin/tankspeedometer/TankSpeedometerApp;->a:Z

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-boolean v0, p0, Lru/zinovin/tankspeedometer/TankSpeedometerApp;->a:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lru/zinovin/tankspeedometer/TankSpeedometerApp;->a:Z

    sget-object v1, Lyr;->g:Lyr;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lyr;->d:Landroid/os/Handler;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    sget-object v1, Lyr;->g:Lyr;

    iget-object v1, v1, Lyr;->c:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->quitSafely()Z

    sget-object v1, Lyr;->g:Lyr;

    if-eqz v1, :cond_0

    iget-object v1, v1, Lyr;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lyr;->g:Lyr;

    iget-object v1, v0, Lyr;->d:Landroid/os/Handler;

    new-instance v2, Lxr;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v3}, Lxr;-><init>(Lyr;I)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    return-void
.end method

.method public final onCreate()V
    .locals 2

    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    invoke-static {p0}, Lyr;->f(Landroid/content/Context;)V

    const-string v0, "T500.APP"

    const-string v1, "TankSpeedometerApp.onCreate()"

    invoke-static {v0, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p0}, Landroid/content/Context;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    return-void
.end method


.method public final onLowMemory()V
    .locals 2

    const-string v0, "T500.APP"

    const-string v1, "TankSpeedometerApp.onLowMemory()"

    invoke-static {v0, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/TankSpeedometerApp;->a()V

    return-void
.end method

.method public final onTrimMemory(I)V
    .locals 2

    const/16 v0, 0x50

    if-lt p1, v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "TankSpeedometerApp.onTrimMemory()="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "T500.APP"

    invoke-static {v0, p1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/TankSpeedometerApp;->a()V

    :cond_0
    return-void
.end method
