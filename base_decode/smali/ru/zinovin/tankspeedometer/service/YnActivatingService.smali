.class public Lru/zinovin/tankspeedometer/service/YnActivatingService;
.super Landroid/app/Service;
.source "SourceFile"


# static fields
.field public static final synthetic d:I


# instance fields
.field public a:Landroid/content/SharedPreferences;

.field public b:Z

.field public final c:Lt5;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    invoke-static {}, LLf;->a()LLf;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lru/zinovin/tankspeedometer/service/YnActivatingService;->b:Z

    new-instance v0, Lt5;

    const/16 v1, 0x18

    invoke-direct {v0, p0, v1}, Lt5;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lru/zinovin/tankspeedometer/service/YnActivatingService;->c:Lt5;

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

    const-string v0, "T500.YN_ACTIVATE"

    const-string v1, "YnActivatingService.onCreate()"

    invoke-static {v0, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lru/zinovin/tankspeedometer/service/YnActivatingService;->b:Z

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    invoke-static {p0}, Lmk;->l(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lru/zinovin/tankspeedometer/service/YnActivatingService;->a:Landroid/content/SharedPreferences;

    new-instance v1, Ljava/util/Timer;

    invoke-direct {v1}, Ljava/util/Timer;-><init>()V

    new-instance v2, LSf;

    const/4 v0, 0x4

    invoke-direct {v2, p0, v0}, LSf;-><init>(Ljava/lang/Object;I)V

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x3a98

    invoke-virtual/range {v1 .. v6}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    return-void
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 1

    const/4 p2, 0x1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p3

    const-string v0, "ACTION_STOP_SERVICE"

    invoke-static {p3, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    const-string v0, "T500.YN_ACTIVATE"

    if-eqz p3, :cond_0

    const-string p1, "ACTION_STOP_SERVICE received"

    invoke-static {v0, p1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    iput-boolean p2, p0, Lru/zinovin/tankspeedometer/service/YnActivatingService;->b:Z

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string p3, "ACTION_START_OR_RESUME_SERVICE"

    invoke-static {p1, p3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "ACTION_START_SERVICE received"

    invoke-static {v0, p1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lru/zinovin/tankspeedometer/service/YnActivatingService;->b:Z

    :cond_1
    :goto_0
    return p2
.end method
