.class public Lsj;
.super Lc4;
.source "SourceFile"


# instance fields
.field public U:Landroid/widget/LinearLayout;

.field public final V:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lc4;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lsj;->V:Ljava/util/ArrayList;

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

    const/4 v1, 0x4

    invoke-direct {v0, p0, v1}, Ld4;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;->setOnThemeSelected(Lmo;)V

    new-instance v0, Lt5;

    const/16 v1, 0xf

    invoke-direct {v0, p0, v1}, Lt5;-><init>(Ljava/lang/Object;I)V

    const v1, 0x7f1301cc

    invoke-virtual {p1, v1, v0}, Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;->a(ILjava/lang/Runnable;)V

    return-void
.end method

.method public final c0()V
    .locals 12

    iget-object v0, p0, Lsj;->U:Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object v6, p0, Lsj;->V:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    iget-object v0, v0, Lru/zinovin/tankspeedometer/MainActivity;->z:Ljava/lang/String;

    const-string v1, "Default"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {p0}, Lc4;->T()Landroid/content/SharedPreferences;

    move-result-object v8

    const/4 v9, 0x1

    if-nez v7, :cond_0

    const-string v0, "useDefaultSwitchNavi"

    invoke-interface {v8, v0, v9}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    move v10, v9

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    move v10, v0

    :goto_0
    new-instance v11, LIn;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v11, v0}, LIn;-><init>(Landroid/content/Context;)V

    const v1, 0x7f130145

    const v2, 0x7f130144

    const v3, 0x7f130143

    const/4 v5, 0x0

    move-object v0, p0

    move v4, v10

    invoke-virtual/range {v0 .. v5}, Lc4;->b0(IIIZLVn;)LWn;

    move-result-object v0

    new-instance v1, Lpf;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v0, v2}, Lpf;-><init>(Lc4;Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, LWn;->setOnCheckedChange(LVn;)V

    xor-int/lit8 v1, v7, 0x1

    invoke-virtual {v0, v1}, LSn;->setRowEnabled(Z)V

    invoke-virtual {v11, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v2, "useSysNavi"

    const v3, 0x7f13016f

    const v4, 0x7f13016e

    const v5, 0x7f13016d

    move-object v0, p0

    move-object v1, v8

    invoke-virtual/range {v0 .. v5}, Lsj;->e0(Landroid/content/SharedPreferences;Ljava/lang/String;III)LWn;

    move-result-object v0

    invoke-virtual {v11, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v2, "useNavi"

    const v3, 0x7f13016c

    const v4, 0x7f13016b

    const v5, 0x7f13016a

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lsj;->e0(Landroid/content/SharedPreferences;Ljava/lang/String;III)LWn;

    move-result-object v0

    invoke-virtual {v11, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v2, "naviFullscreen"

    const v3, 0x7f13015d

    const v4, 0x7f13015c

    const v5, 0x7f13015b

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lsj;->e0(Landroid/content/SharedPreferences;Ljava/lang/String;III)LWn;

    move-result-object v0

    invoke-virtual {v11, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    xor-int/lit8 v0, v10, 0x1

    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LWn;

    invoke-virtual {v2, v0}, LSn;->setRowEnabled(Z)V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lsj;->U:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public final d0()Z
    .locals 4

    invoke-virtual {p0}, Lc4;->R()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    invoke-virtual {v1, v0}, Lru/zinovin/tankspeedometer/MainActivity;->G(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "useDefaultSwitchNavi"

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

.method public final e0(Landroid/content/SharedPreferences;Ljava/lang/String;III)LWn;
    .locals 7

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v5

    new-instance v6, Lpf;

    const/4 p1, 0x3

    invoke-direct {v6, p0, p2, p1}, Lpf;-><init>(Lc4;Ljava/lang/Object;I)V

    move-object v1, p0

    move v2, p3

    move v3, p4

    move v4, p5

    invoke-virtual/range {v1 .. v6}, Lc4;->b0(IIIZLVn;)LWn;

    move-result-object p1

    iget-object p2, p0, Lsj;->V:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p1
.end method

.method public final w(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 12

    invoke-virtual {p0}, Lc4;->W()Landroid/widget/ScrollView;

    move-result-object p1

    invoke-virtual {p0}, Lc4;->V()Lji;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    invoke-virtual {p0}, Lc4;->S()Landroid/content/SharedPreferences;

    move-result-object v0

    const v1, 0x7f1300ee

    invoke-virtual {p0, v1}, Lc4;->a0(I)Lii;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v1, LIn;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, LIn;-><init>(Landroid/content/Context;)V

    const-string v2, "naviPackage"

    const-string v3, ""

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    new-instance v9, Lrj;

    const/4 v2, 0x0

    invoke-direct {v9, p0, v0, v2}, Lrj;-><init>(Lsj;Landroid/content/SharedPreferences;I)V

    const v6, 0x7f030013

    const v7, 0x7f030014

    const v5, 0x7f130139

    move-object v4, p0

    invoke-virtual/range {v4 .. v9}, Lc4;->U(IIILjava/lang/String;LQn;)LRn;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v2, "naviUserPackage"

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrj;

    const/4 v4, 0x1

    invoke-direct {v3, p0, v0, v4}, Lrj;-><init>(Lsj;Landroid/content/SharedPreferences;I)V

    const v4, 0x7f13012d

    const/4 v5, 0x1

    invoke-virtual {p0, v4, v2, v5, v3}, Lc4;->Q(ILjava/lang/String;ILOn;)LPn;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v2, "naviStartDelay"

    const-string v3, "500"

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrj;

    const/4 v4, 0x2

    invoke-direct {v3, p0, v0, v4}, Lrj;-><init>(Lsj;Landroid/content/SharedPreferences;I)V

    const v4, 0x7f130126

    const/4 v6, 0x2

    invoke-virtual {p0, v4, v2, v6, v3}, Lc4;->Q(ILjava/lang/String;ILOn;)LPn;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v2, "useNaviActivation"

    invoke-interface {v0, v2, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v10

    new-instance v11, Lrj;

    const/4 v2, 0x3

    invoke-direct {v11, p0, v0, v2}, Lrj;-><init>(Lsj;Landroid/content/SharedPreferences;I)V

    const v8, 0x7f130156

    const v9, 0x7f130155

    const v7, 0x7f130157

    move-object v6, p0

    invoke-virtual/range {v6 .. v11}, Lc4;->b0(IIIZLVn;)LWn;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v2, "showNaviBorder"

    invoke-interface {v0, v2, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v10

    new-instance v11, Lrj;

    const/4 v2, 0x4

    invoke-direct {v11, p0, v0, v2}, Lrj;-><init>(Lsj;Landroid/content/SharedPreferences;I)V

    const v8, 0x7f130159

    const v9, 0x7f130158

    const v7, 0x7f13015a

    invoke-virtual/range {v6 .. v11}, Lc4;->b0(IIIZLVn;)LWn;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v2, "useHud"

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v10

    new-instance v11, Lrj;

    const/4 v2, 0x5

    invoke-direct {v11, p0, v0, v2}, Lrj;-><init>(Lsj;Landroid/content/SharedPreferences;I)V

    const v8, 0x7f130150

    const v9, 0x7f13014f

    const v7, 0x7f130151

    invoke-virtual/range {v6 .. v11}, Lc4;->b0(IIIZLVn;)LWn;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/16 v0, 0x10

    invoke-virtual {p0, p2, v0}, Lc4;->O(Landroid/widget/LinearLayout;I)V

    const v0, 0x7f1300f8

    invoke-virtual {p0, v0}, Lc4;->a0(I)Lii;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v0, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lsj;->U:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    iget-object v0, p0, Lsj;->U:Landroid/widget/LinearLayout;

    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p0}, Lsj;->c0()V

    return-object p1
.end method
