.class public Lru/zinovin/tankspeedometer/service/InternetMonitorService;
.super Landroid/app/Service;
.source "SourceFile"


# static fields
.field public static final synthetic d:I


# instance fields
.field public final a:LLf;

.field public b:Ljava/util/Timer;

.field public final c:Lt5;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    invoke-static {}, LLf;->a()LLf;

    move-result-object v0

    iput-object v0, p0, Lru/zinovin/tankspeedometer/service/InternetMonitorService;->a:LLf;

    new-instance v0, Lt5;

    const/16 v1, 0xb

    invoke-direct {v0, p0, v1}, Lt5;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lru/zinovin/tankspeedometer/service/InternetMonitorService;->c:Lt5;

    return-void
.end method


# virtual methods
.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final onCreate()V
    .locals 8

    const-string v0, "T500.INET"

    const-string v1, "InternetMonitorService.onCreate()"

    invoke-static {v0, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    new-instance v2, Ljava/util/Timer;

    invoke-direct {v2}, Ljava/util/Timer;-><init>()V

    iput-object v2, p0, Lru/zinovin/tankspeedometer/service/InternetMonitorService;->b:Ljava/util/Timer;

    new-instance v3, LSf;

    const/4 v0, 0x0

    invoke-direct {v3, p0, v0}, LSf;-><init>(Ljava/lang/Object;I)V

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x3a98

    invoke-virtual/range {v2 .. v7}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

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

    const-string p1, "T500.INET"

    const-string p2, "ACTION_STOP_SERVICE received"

    invoke-static {p1, p2}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lru/zinovin/tankspeedometer/service/InternetMonitorService;->b:Ljava/util/Timer;

    invoke-virtual {p1}, Ljava/util/Timer;->cancel()V

    iget-object p1, p0, Lru/zinovin/tankspeedometer/service/InternetMonitorService;->b:Ljava/util/Timer;

    invoke-virtual {p1}, Ljava/util/Timer;->purge()I

    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
