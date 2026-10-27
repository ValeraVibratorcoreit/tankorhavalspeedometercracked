.class public LDq;
.super Lc4;
.source "SourceFile"


# static fields
.field public static final W:[Ljava/lang/String;

.field public static final X:[I

.field public static final Y:[I

.field public static final Z:[I


# instance fields
.field public U:Landroid/widget/LinearLayout;

.field public final V:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const-string v4, "transparentBackgroundInCenter"

    const-string v5, "showLabelInMeter"

    const-string v0, "speedFromLeft"

    const-string v1, "bigMeters"

    const-string v2, "infoInCenter"

    const-string v3, "speedInCenter"

    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, LDq;->W:[Ljava/lang/String;

    const/4 v0, 0x6

    new-array v1, v0, [I

    fill-array-data v1, :array_0

    sput-object v1, LDq;->X:[I

    new-array v1, v0, [I

    fill-array-data v1, :array_1

    sput-object v1, LDq;->Y:[I

    new-array v0, v0, [I

    fill-array-data v0, :array_2

    sput-object v0, LDq;->Z:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x7f130166
        0x7f13013f
        0x7f130154
        0x7f130163
        0x7f130169
        0x7f130160
    .end array-data

    :array_1
    .array-data 4
        0x7f130165
        0x7f13013e
        0x7f130153
        0x7f130162
        0x7f130168
        0x7f13015f
    .end array-data

    :array_2
    .array-data 4
        0x7f130164
        0x7f13013d
        0x7f130152
        0x7f130161
        0x7f130167
        0x7f13015e
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lc4;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LDq;->V:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final Y(Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;)V
    .locals 3

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

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    iget-object v1, v1, Lru/zinovin/tankspeedometer/MainActivity;->z:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;->b(Ljava/util/ArrayList;Ljava/lang/String;)V

    new-instance v0, Ld4;

    const/16 v1, 0xa

    invoke-direct {v0, p0, v1}, Ld4;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;->setOnThemeSelected(Lmo;)V

    new-instance v0, Lt5;

    const/16 v1, 0x17

    invoke-direct {v0, p0, v1}, Lt5;-><init>(Ljava/lang/Object;I)V

    const v1, 0x7f1301cc

    invoke-virtual {p1, v1, v0}, Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;->a(ILjava/lang/Runnable;)V

    return-void
.end method

.method public final c0()V
    .locals 14

    iget-object v0, p0, LDq;->U:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object v6, p0, LDq;->V:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    iget-object v0, v0, Lru/zinovin/tankspeedometer/MainActivity;->z:Ljava/lang/String;

    const-string v1, "Default"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {p0}, Lc4;->T()Landroid/content/SharedPreferences;

    move-result-object v8

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-nez v7, :cond_0

    const-string v0, "useDefaultSwitchCommon"

    invoke-interface {v8, v0, v9}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    move v11, v9

    goto :goto_0

    :cond_0
    move v11, v10

    :goto_0
    new-instance v12, LIn;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v12, v0}, LIn;-><init>(Landroid/content/Context;)V

    const v1, 0x7f130145

    const v2, 0x7f130144

    const v3, 0x7f130143

    const/4 v5, 0x0

    move-object v0, p0

    move v4, v11

    invoke-virtual/range {v0 .. v5}, Lc4;->b0(IIIZLVn;)LWn;

    move-result-object v0

    new-instance v1, Lpf;

    const/4 v2, 0x4

    invoke-direct {v1, p0, v0, v2}, Lpf;-><init>(Lc4;Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, LWn;->setOnCheckedChange(LVn;)V

    xor-int/lit8 v1, v7, 0x1

    invoke-virtual {v0, v1}, LSn;->setRowEnabled(Z)V

    invoke-virtual {v12, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    move v7, v10

    :goto_1
    const/4 v0, 0x6

    if-ge v7, v0, :cond_3

    sget-object v0, LDq;->W:[Ljava/lang/String;

    aget-object v0, v0, v7

    const-string v1, "speedFromLeft"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "showLabelInMeter"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_2

    :cond_1
    move v1, v10

    goto :goto_3

    :cond_2
    :goto_2
    move v1, v9

    :goto_3
    invoke-interface {v8, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    sget-object v1, LDq;->X:[I

    aget v1, v1, v7

    sget-object v2, LDq;->Y:[I

    aget v2, v2, v7

    sget-object v3, LDq;->Z:[I

    aget v3, v3, v7

    new-instance v5, Lpf;

    const/4 v13, 0x5

    invoke-direct {v5, p0, v0, v13}, Lpf;-><init>(Lc4;Ljava/lang/Object;I)V

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lc4;->b0(IIIZLVn;)LWn;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v12, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_3
    xor-int/lit8 v0, v11, 0x1

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LWn;

    invoke-virtual {v2, v0}, LSn;->setRowEnabled(Z)V

    goto :goto_4

    :cond_4
    iget-object v0, p0, LDq;->U:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public final d0()Z
    .locals 4

    invoke-virtual {p0}, Lc4;->R()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    invoke-virtual {v1, v0}, Lru/zinovin/tankspeedometer/MainActivity;->G(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "useDefaultSwitchCommon"

    const/4 v3, 0x1

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iget-object v2, p0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    iget-object v2, v2, Lru/zinovin/tankspeedometer/MainActivity;->z:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    if-eqz v1, :cond_0

    const-string v0, "Default"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :cond_1
    :goto_0
    return v3
.end method

.method public final w(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    invoke-virtual {p0}, Lc4;->W()Landroid/widget/ScrollView;

    move-result-object p1

    invoke-virtual {p0}, Lc4;->V()Lji;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    new-instance v0, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, LDq;->U:Landroid/widget/LinearLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    iget-object v0, p0, LDq;->U:Landroid/widget/LinearLayout;

    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p0}, LDq;->c0()V

    return-object p1
.end method
