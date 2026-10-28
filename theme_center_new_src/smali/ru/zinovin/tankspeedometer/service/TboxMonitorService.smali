.class public Lru/zinovin/tankspeedometer/service/TboxMonitorService;
.super Landroid/app/Service;
.source "SourceFile"


# static fields
.field public static final synthetic d:I


# instance fields
.field public a:Ljava/util/Timer;

.field public b:Landroid/content/SharedPreferences;

.field public final c:Lt5;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    new-instance v0, Lt5;

    const/16 v1, 0x15

    invoke-direct {v0, p0, v1}, Lt5;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lru/zinovin/tankspeedometer/service/TboxMonitorService;->c:Lt5;

    return-void
.end method


# virtual methods
.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final onCreate()V
    .locals 7

    const-string v0, "T500.TBOX"

    const-string v1, "TboxMonitorService.onCreate()"

    invoke-static {v0, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lmk;->l(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lru/zinovin/tankspeedometer/service/TboxMonitorService;->b:Landroid/content/SharedPreferences;

    new-instance v1, Ljava/util/Timer;

    invoke-direct {v1}, Ljava/util/Timer;-><init>()V

    iput-object v1, p0, Lru/zinovin/tankspeedometer/service/TboxMonitorService;->a:Ljava/util/Timer;

    new-instance v2, LSf;

    const/4 v0, 0x3

    invoke-direct {v2, p0, v0}, LSf;-><init>(Ljava/lang/Object;I)V

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x7530

    invoke-virtual/range {v1 .. v6}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    return-void
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string p2, "ACTION_STOP_SERVICE"

    invoke-static {p1, p2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "T500.TBOX"

    const-string p2, "ACTION_STOP_SERVICE received"

    invoke-static {p1, p2}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lru/zinovin/tankspeedometer/service/TboxMonitorService;->a:Ljava/util/Timer;

    invoke-virtual {p1}, Ljava/util/Timer;->cancel()V

    iget-object p1, p0, Lru/zinovin/tankspeedometer/service/TboxMonitorService;->a:Ljava/util/Timer;

    invoke-virtual {p1}, Ljava/util/Timer;->purge()I

    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
