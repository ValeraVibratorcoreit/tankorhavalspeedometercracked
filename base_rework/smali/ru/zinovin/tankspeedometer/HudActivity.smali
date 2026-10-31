.class public Lru/zinovin/tankspeedometer/HudActivity;
.super Lq1;
.source "SourceFile"


# instance fields
.field public final y:LO1;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lq1;-><init>()V

    new-instance v0, LO1;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, LO1;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lru/zinovin/tankspeedometer/HudActivity;->y:LO1;

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Lq1;->onCreate(Landroid/os/Bundle;)V

    const-string p1, "T500.HUD"

    const-string v0, "HudActivity.onCreate()"

    invoke-static {p1, v0}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    const p1, 0x7f0e00aa

    invoke-virtual {p0, p1}, Lq1;->setContentView(I)V

    invoke-static {p0}, Lka;->a(LP6;)V

    const p1, 0x7f0b0138

    invoke-virtual {p0, p1}, Lq1;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    new-instance p1, Landroid/content/IntentFilter;

    invoke-direct {p1}, Landroid/content/IntentFilter;-><init>()V

    const-string v0, "ru.zinovin.tankspeedometer.T500_NAVI_SPEEDLIMIT"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v0, "ru.zinovin.tankspeedometer.T500_NAVI_MANEUVER"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v0, "ru.zinovin.tankspeedometer.T500_NAVI_ETA"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v0, "ru.zinovin.tankspeedometer.T500_HUD_STOP"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v0, "ru.zinovin.tankspeedometer.T500_NAVI_MANEUVER_VISIBILITY"

    invoke-virtual {p1, v0}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v0, "ru.zinovin.tankspeedometer.NAVI_GUIDANCE_PERMISSION"

    const/4 v1, 0x0

    iget-object v2, p0, Lru/zinovin/tankspeedometer/HudActivity;->y:LO1;

    invoke-virtual {p0, v2, p1, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    return-void
.end method

.method public final onDestroy()V
    .locals 2

    const-string v0, "T500.HUD"

    const-string v1, "onDestroy() call"

    invoke-static {v0, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lru/zinovin/tankspeedometer/HudActivity;->y:LO1;

    invoke-virtual {p0, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    invoke-super {p0}, Lq1;->onDestroy()V

    return-void
.end method
