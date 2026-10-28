.class public Lqf;
.super Lc4;
.source "SourceFile"


# static fields
.field public static final W:[Ljava/lang/String;

.field public static final X:[I

.field public static final Y:[Ljava/lang/String;

.field public static final Z:[I

.field public static final a0:[Ljava/lang/String;

.field public static final b0:[I


# instance fields
.field public U:Lji;

.field public final V:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-string v0, "fuel_low_color"

    const-string v1, "fuel_critical_color"

    const-string v2, "fuel_background_color"

    const-string v3, "fuel_color"

    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lqf;->W:[Ljava/lang/String;

    const v0, 0x7f13011d

    const v1, 0x7f130119

    const v2, 0x7f13010f

    const v3, 0x7f130115

    filled-new-array {v2, v3, v0, v1}, [I

    move-result-object v0

    sput-object v0, Lqf;->X:[I

    const-string v0, "battery_low_color"

    const-string v1, "battery_critical_color"

    const-string v2, "battery_background_color"

    const-string v3, "battery_color"

    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lqf;->Y:[Ljava/lang/String;

    const v0, 0x7f1300e9

    const v1, 0x7f1300e5

    const v2, 0x7f1300e1

    const v3, 0x7f1300e3

    filled-new-array {v2, v3, v0, v1}, [I

    move-result-object v0

    sput-object v0, Lqf;->Z:[I

    const-string v0, "coolant_warn_color"

    const-string v1, "coolant_critical_color"

    const-string v2, "coolant_background_color"

    const-string v3, "coolant_color"

    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lqf;->a0:[Ljava/lang/String;

    const v0, 0x7f13010b

    const v1, 0x7f130107

    const v2, 0x7f130101

    const v3, 0x7f130105

    filled-new-array {v2, v3, v0, v1}, [I

    move-result-object v0

    sput-object v0, Lqf;->b0:[I

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lc4;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lqf;->V:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final Y(Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;)V
    .locals 5

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;->c(Z)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, "Default"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f030003

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    iget-object v1, v1, Lru/zinovin/tankspeedometer/MainActivity;->z:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;->b(Ljava/util/ArrayList;Ljava/lang/String;)V

    new-instance v0, Ld4;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Ld4;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;->setOnThemeSelected(Lmo;)V

    new-instance v0, Lt5;

    const/16 v1, 0xa

    invoke-direct {v0, p0, v1}, Lt5;-><init>(Ljava/lang/Object;I)V

    const v1, 0x7f1301cc

    invoke-virtual {p1, v1, v0}, Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;->a(ILjava/lang/Runnable;)V

    return-void
.end method

.method public final c0(I[Ljava/lang/String;[ILandroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 9

    iget-object v0, p0, Lqf;->U:Lji;

    const/16 v1, 0x10

    invoke-virtual {p0, v0, v1}, Lc4;->O(Landroid/widget/LinearLayout;I)V

    iget-object v0, p0, Lqf;->U:Lji;

    invoke-virtual {p0, p1}, Lc4;->a0(I)Lii;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance p1, LIn;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, LIn;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    array-length v2, p2

    if-ge v1, v2, :cond_0

    aget-object v2, p2, v1

    invoke-static {v2, p5}, LTf;->y(Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    new-instance v4, LKn;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v4, v5}, LSn;-><init>(Landroid/content/Context;)V

    const v5, -0x777778

    iput v5, v4, LKn;->j:I

    new-instance v5, Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-direct {v5, v6}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object v5, v4, LKn;->g:Landroid/view/View;

    new-instance v5, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v5}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    iput-object v5, v4, LKn;->h:Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {v5, v0}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    iget-object v5, v4, LKn;->h:Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {v4}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v6

    iget v6, v6, Landroid/util/DisplayMetrics;->density:F

    const/high16 v7, 0x40c00000    # 6.0f

    mul-float/2addr v6, v7

    invoke-virtual {v5, v6}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    iget-object v5, v4, LKn;->h:Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {v4}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v6

    iget v6, v6, Landroid/util/DisplayMetrics;->density:F

    float-to-int v6, v6

    invoke-virtual {v4}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f060341

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v7

    invoke-virtual {v5, v6, v7}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    iget-object v5, v4, LKn;->h:Landroid/graphics/drawable/GradientDrawable;

    iget v6, v4, LKn;->j:I

    invoke-virtual {v5, v6}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    iget-object v5, v4, LKn;->g:Landroid/view/View;

    iget-object v6, v4, LKn;->h:Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {v5, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v4}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    const/high16 v6, 0x42000000    # 32.0f

    mul-float/2addr v5, v6

    float-to-int v5, v5

    iget-object v6, v4, LSn;->d:Landroid/widget/FrameLayout;

    iget-object v7, v4, LKn;->g:Landroid/view/View;

    new-instance v8, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v8, v5, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v6, v7, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v5, Lc6;

    const/4 v6, 0x6

    invoke-direct {v5, v4, v6}, Lc6;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    aget v5, p3, v1

    invoke-virtual {v4, v5}, LSn;->setTitle(I)V

    invoke-interface {p4, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v3

    invoke-virtual {v4, v3}, LKn;->setColor(I)V

    new-instance v3, Lpf;

    const/4 v5, 0x1

    invoke-direct {v3, p0, v2, v5}, Lpf;-><init>(Lc4;Ljava/lang/Object;I)V

    invoke-virtual {v4, v3}, LKn;->setOnColorChanged(LJn;)V

    iget-object v2, p0, Lqf;->V:Ljava/util/ArrayList;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_0
    iget-object p2, p0, Lqf;->U:Lji;

    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public final d0()V
    .locals 4

    invoke-virtual {p0}, Lc4;->R()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    invoke-virtual {v1, v0}, Lru/zinovin/tankspeedometer/MainActivity;->G(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "useDefaultSwitch"

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iget-object v2, p0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    iget-object v2, v2, Lru/zinovin/tankspeedometer/MainActivity;->z:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz v1, :cond_1

    const-string v0, "Default"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "ru.zinovin.tankspeedometer.T500_INDICATOR_COLOR_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    :cond_1
    return-void
.end method

.method public final e0()V
    .locals 13

    iget-object v0, p0, Lqf;->U:Lji;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object v6, p0, Lqf;->V:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    iget-object v7, v0, Lru/zinovin/tankspeedometer/MainActivity;->z:Ljava/lang/String;

    const-string v0, "Default"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {p0}, Lc4;->T()Landroid/content/SharedPreferences;

    move-result-object v9

    const/4 v0, 0x0

    const/4 v10, 0x1

    if-nez v8, :cond_0

    const-string v1, "useDefaultSwitch"

    invoke-interface {v9, v1, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    move v11, v10

    goto :goto_0

    :cond_0
    move v11, v0

    :goto_0
    new-instance v12, LIn;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v12, v0}, LIn;-><init>(Landroid/content/Context;)V

    const v1, 0x7f130142

    const v2, 0x7f130141

    const v3, 0x7f130140

    const/4 v5, 0x0

    move-object v0, p0

    move v4, v11

    invoke-virtual/range {v0 .. v5}, Lc4;->b0(IIIZLVn;)LWn;

    move-result-object v0

    new-instance v1, Lpf;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v0, v2}, Lpf;-><init>(Lc4;Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, LWn;->setOnCheckedChange(LVn;)V

    xor-int/lit8 v1, v8, 0x1

    invoke-virtual {v0, v1}, LSn;->setRowEnabled(Z)V

    invoke-virtual {v12, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v0, p0, Lqf;->U:Lji;

    invoke-virtual {v0, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget-object v2, Lqf;->W:[Ljava/lang/String;

    sget-object v3, Lqf;->X:[I

    const v1, 0x7f1300f1

    move-object v0, p0

    move-object v4, v9

    move-object v5, v7

    invoke-virtual/range {v0 .. v5}, Lqf;->c0(I[Ljava/lang/String;[ILandroid/content/SharedPreferences;Ljava/lang/String;)V

    sget-object v2, Lqf;->Y:[Ljava/lang/String;

    sget-object v3, Lqf;->Z:[I

    const v1, 0x7f1300ec

    invoke-virtual/range {v0 .. v5}, Lqf;->c0(I[Ljava/lang/String;[ILandroid/content/SharedPreferences;Ljava/lang/String;)V

    sget-object v2, Lqf;->a0:[Ljava/lang/String;

    sget-object v3, Lqf;->b0:[I

    const v1, 0x7f1300ef

    invoke-virtual/range {v0 .. v5}, Lqf;->c0(I[Ljava/lang/String;[ILandroid/content/SharedPreferences;Ljava/lang/String;)V

    xor-int/lit8 v0, v11, 0x1

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LKn;

    invoke-virtual {v2, v0}, LSn;->setRowEnabled(Z)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method public final w(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 0

    invoke-virtual {p0}, Lc4;->W()Landroid/widget/ScrollView;

    move-result-object p1

    invoke-virtual {p0}, Lc4;->V()Lji;

    move-result-object p2

    iput-object p2, p0, Lqf;->U:Lji;

    invoke-virtual {p1, p2}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    invoke-virtual {p0}, Lqf;->e0()V

    return-object p1
.end method
