.class public Lru/zinovin/tankspeedometer/ServicesStartActivity;
.super Lq1;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lq1;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Lq1;->onCreate(Landroid/os/Bundle;)V

    const-string p1, "T500.SERVICE"

    const-string v0, "ServicesStartActivity.onCreate()"

    invoke-static {p1, v0}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0}, Lka;->a(LP6;)V

    const p1, 0x7f0e017a

    invoke-virtual {p0, p1}, Lq1;->setContentView(I)V

    const-string p1, "T500.UTILS"

    const-string v0, "startTboxService() called"

    invoke-static {p1, v0}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lru/zinovin/tankspeedometer/service/TboxMonitorService;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "ACTION_START_OR_RESUME_SERVICE"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method
