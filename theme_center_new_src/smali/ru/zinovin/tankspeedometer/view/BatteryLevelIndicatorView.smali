.class public Lru/zinovin/tankspeedometer/view/BatteryLevelIndicatorView;
.super LB6;
.source "SourceFile"


# static fields
.field public static final synthetic n:I


# instance fields
.field public m:LU2;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LB6;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/view/BatteryLevelIndicatorView;->c()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final b()V
    .locals 3

    new-instance v0, LU2;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, LU2;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lru/zinovin/tankspeedometer/view/BatteryLevelIndicatorView;->m:LU2;

    iget-object v1, p0, Lqg;->a:Landroid/content/SharedPreferences;

    invoke-interface {v1, v0}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/view/BatteryLevelIndicatorView;->c()V

    const-string v0, "battery_low_level"

    const-string v2, "20"

    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    invoke-virtual {p0, v0}, LB6;->setNormalLevel(F)V

    const-string v0, "battery_critical_level"

    const-string v2, "10"

    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    invoke-virtual {p0, v0}, LB6;->setWarnLevel(F)V

    return-void
.end method

.method public final c()V
    .locals 1

    const-string v0, "battery_color"

    invoke-static {v0}, LTf;->w(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, LB6;->setColor(I)V

    const-string v0, "battery_background_color"

    invoke-static {v0}, LTf;->w(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, LB6;->setBackColor(I)V

    const-string v0, "battery_low_color"

    invoke-static {v0}, LTf;->w(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, LB6;->setLowColor(I)V

    const-string v0, "battery_critical_color"

    invoke-static {v0}, LTf;->w(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, LB6;->setCriticalColor(I)V

    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    iget-object v0, p0, Lru/zinovin/tankspeedometer/view/BatteryLevelIndicatorView;->m:LU2;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lqg;->a:Landroid/content/SharedPreferences;

    invoke-interface {v1, v0}, Landroid/content/SharedPreferences;->unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    :cond_0
    return-void
.end method
