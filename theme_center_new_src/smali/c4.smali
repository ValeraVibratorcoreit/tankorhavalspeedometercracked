.class public abstract Lc4;
.super Lzc;
.source "SourceFile"


# instance fields
.field public T:Lru/zinovin/tankspeedometer/MainActivity;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lzc;-><init>()V

    return-void
.end method


# virtual methods
.method public final A()V
    .locals 4

    const/4 v0, 0x1

    iput-boolean v0, p0, Lzc;->C:Z

    iget-object v1, p0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    if-eqz v1, :cond_1

    iget-object v2, v1, Lru/zinovin/tankspeedometer/MainActivity;->A:Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, v2, Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;->f:Landroid/widget/LinearLayout;

    invoke-virtual {v3}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object v2, v2, Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object v2, v1, Lru/zinovin/tankspeedometer/MainActivity;->A:Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;->c(Z)V

    iget-object v2, v1, Lru/zinovin/tankspeedometer/MainActivity;->A:Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;

    invoke-virtual {v2, v0}, Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;->setThemeSpinnerEnabled(Z)V

    iget-object v0, v1, Lru/zinovin/tankspeedometer/MainActivity;->A:Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;->setOnThemeSelected(Lmo;)V

    iget-object v0, v1, Lru/zinovin/tankspeedometer/MainActivity;->A:Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;

    invoke-virtual {v0, v2}, Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;->setOnBackClicked(Ljava/lang/Runnable;)V

    :goto_0
    iget-object v0, p0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    iget-object v0, v0, Lru/zinovin/tankspeedometer/MainActivity;->A:Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;

    invoke-virtual {p0, v0}, Lc4;->Y(Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;)V

    :cond_1
    return-void
.end method

.method public final O(Landroid/widget/LinearLayout;I)V
    .locals 3

    new-instance v0, Landroid/view/View;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, -0x1

    invoke-virtual {p0, p2}, Lc4;->P(I)I

    move-result p2

    invoke-direct {v1, v2, p2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p1, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final P(I)I
    .locals 1

    invoke-virtual {p0}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    int-to-float p1, p1

    mul-float/2addr v0, p1

    float-to-int p1, v0

    return p1
.end method

.method public final Q(ILjava/lang/String;ILOn;)LPn;
    .locals 2

    new-instance v0, LPn;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, LPn;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, LSn;->setTitle(I)V

    invoke-virtual {v0, p3}, LPn;->setInputTypeFlags(I)V

    invoke-virtual {v0, p2}, LPn;->setValue(Ljava/lang/String;)V

    invoke-virtual {v0, p4}, LPn;->setOnValueChanged(LOn;)V

    return-object v0
.end method

.method public final R()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    iget-object v0, v0, Lru/zinovin/tankspeedometer/MainActivity;->y:Landroid/content/SharedPreferences;

    const-string v1, "selectedTheme"

    const-string v2, "Audi Virtual Cockpit"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final S()Landroid/content/SharedPreferences;
    .locals 2

    iget-object v0, p0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    iget-object v1, v0, Lru/zinovin/tankspeedometer/MainActivity;->y:Landroid/content/SharedPreferences;

    if-nez v1, :cond_0

    invoke-static {v0}, Lmk;->l(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    iput-object v1, v0, Lru/zinovin/tankspeedometer/MainActivity;->y:Landroid/content/SharedPreferences;

    :cond_0
    iget-object v0, v0, Lru/zinovin/tankspeedometer/MainActivity;->y:Landroid/content/SharedPreferences;

    return-object v0
.end method

.method public final T()Landroid/content/SharedPreferences;
    .locals 2

    iget-object v0, p0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    iget-object v1, v0, Lru/zinovin/tankspeedometer/MainActivity;->z:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lru/zinovin/tankspeedometer/MainActivity;->G(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v0

    return-object v0
.end method

.method public final U(IIILjava/lang/String;LQn;)LRn;
    .locals 2

    new-instance v0, LRn;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, LRn;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, LSn;->setTitle(I)V

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getTextArray(I)[Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, v0, LRn;->i:[Ljava/lang/CharSequence;

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getTextArray(I)[Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, v0, LRn;->j:[Ljava/lang/CharSequence;

    invoke-virtual {v0, p4}, LRn;->setValue(Ljava/lang/String;)V

    invoke-virtual {v0, p5}, LRn;->setOnValueChanged(LQn;)V

    return-object v0
.end method

.method public final V()Lji;
    .locals 2

    new-instance v0, Lji;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lji;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v1, 0x10

    invoke-virtual {p0, v1}, Lc4;->P(I)I

    move-result v1

    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/view/View;->setPadding(IIII)V

    return-object v0
.end method

.method public final W()Landroid/widget/ScrollView;
    .locals 2

    new-instance v0, Landroid/widget/ScrollView;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ScrollView;->setFillViewport(Z)V

    return-object v0
.end method

.method public final X(Ljava/lang/String;)V
    .locals 3

    invoke-virtual {p0}, Lzc;->h()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v1, Landroid/content/Intent;

    const-string v2, "ru.zinovin.tankspeedometer.T500_IP_SETTINGS_CHANGED"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v2, "pref_key"

    invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method

.method public Y(Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;)V
    .locals 0

    return-void
.end method

.method public final Z(ILjava/lang/Runnable;)Landroid/widget/Button;
    .locals 3

    new-instance v0, Landroid/widget/Button;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setAllCaps(Z)V

    invoke-virtual {p0}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07034d

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    invoke-virtual {v0, p1, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    invoke-virtual {p0}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f060340

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    const v1, 0x7f080161

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setMinWidth(I)V

    invoke-virtual {v0, p1}, Landroid/view/View;->setMinimumWidth(I)V

    invoke-virtual {p0}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07034c

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMinHeight(I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setMinimumHeight(I)V

    const/16 v1, 0x1c

    invoke-virtual {p0, v1}, Lc4;->P(I)I

    move-result v1

    invoke-virtual {v0, v1, p1, v1, p1}, Landroid/view/View;->setPadding(IIII)V

    if-eqz p2, :cond_0

    new-instance p1, La4;

    const/4 v1, 0x0

    invoke-direct {p1, v1, p2}, La4;-><init>(ILjava/lang/Runnable;)V

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 p2, -0x2

    invoke-direct {p1, p2, p2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 p2, 0xc

    invoke-virtual {p0, p2}, Lc4;->P(I)I

    move-result p2

    iput p2, p1, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public final a0(I)Lii;
    .locals 4

    new-instance v0, Lii;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lii;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f060341

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070358

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, LC2;->setAllCaps(Z)V

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    const/high16 v2, 0x41000000    # 8.0f

    mul-float/2addr v1, v2

    float-to-int v1, v1

    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    const/high16 v3, 0x40c00000    # 6.0f

    mul-float/2addr v2, v3

    float-to-int v2, v2

    invoke-virtual {v0, v1, v2, v1, v2}, Landroid/view/View;->setPadding(IIII)V

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    return-object v0
.end method

.method public final b0(IIIZLVn;)LWn;
    .locals 2

    new-instance v0, LWn;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, LWn;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, LSn;->setTitle(I)V

    if-eqz p2, :cond_1

    if-eqz p3, :cond_1

    if-eqz p4, :cond_0

    move p1, p2

    goto :goto_0

    :cond_0
    move p1, p3

    :goto_0
    invoke-virtual {v0, p1}, LSn;->setSubtitle(I)V

    :cond_1
    invoke-virtual {v0, p4}, LWn;->setChecked(Z)V

    new-instance p1, Lb4;

    invoke-direct {p1, p2, p3, v0, p5}, Lb4;-><init>(IILWn;LVn;)V

    invoke-virtual {v0, p1}, LWn;->setOnCheckedChange(LVn;)V

    return-object v0
.end method

.method public final u(Landroid/content/Context;)V
    .locals 1

    invoke-super {p0, p1}, Lzc;->u(Landroid/content/Context;)V

    instance-of v0, p1, Lru/zinovin/tankspeedometer/MainActivity;

    if-eqz v0, :cond_0

    check-cast p1, Lru/zinovin/tankspeedometer/MainActivity;

    iput-object p1, p0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    :cond_0
    return-void
.end method
