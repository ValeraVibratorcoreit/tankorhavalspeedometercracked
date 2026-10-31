.class public Lmj;
.super Lc4;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lc4;-><init>()V

    return-void
.end method


# virtual methods
.method public final w(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 13

    invoke-virtual {p0}, Lc4;->W()Landroid/widget/ScrollView;

    move-result-object p1

    invoke-virtual {p0}, Lc4;->V()Lji;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    invoke-virtual {p0}, Lc4;->S()Landroid/content/SharedPreferences;

    move-result-object v0

    new-instance v1, LIn;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, LIn;-><init>(Landroid/content/Context;)V

    const-string v2, "musicApp"

    const-string v3, ""

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    new-instance v9, Llj;

    const/4 v2, 0x0

    invoke-direct {v9, p0, v0, v2}, Llj;-><init>(Lmj;Landroid/content/SharedPreferences;I)V

    const v6, 0x7f030010

    const v7, 0x7f030012

    const v5, 0x7f130136

    move-object v4, p0

    invoke-virtual/range {v4 .. v9}, Lc4;->U(IIILjava/lang/String;LQn;)LRn;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v2, "musicUserPackage"

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Llj;

    const/4 v5, 0x1

    invoke-direct {v4, p0, v0, v5}, Llj;-><init>(Lmj;Landroid/content/SharedPreferences;I)V

    const v5, 0x7f13012e

    const/4 v6, 0x1

    invoke-virtual {p0, v5, v2, v6, v4}, Lc4;->Q(ILjava/lang/String;ILOn;)LPn;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v2, "musicAutoPlay"

    const/4 v4, 0x0

    invoke-interface {v0, v2, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v11

    new-instance v12, Llj;

    const/4 v2, 0x2

    invoke-direct {v12, p0, v0, v2}, Llj;-><init>(Lmj;Landroid/content/SharedPreferences;I)V

    const v9, 0x7f130171

    const v10, 0x7f130170

    const v8, 0x7f130172

    move-object v7, p0

    invoke-virtual/range {v7 .. v12}, Lc4;->b0(IIIZLVn;)LWn;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/16 v1, 0x10

    invoke-virtual {p0, p2, v1}, Lc4;->O(Landroid/widget/LinearLayout;I)V

    const v1, 0x7f1300ff

    invoke-virtual {p0, v1}, Lc4;->a0(I)Lii;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v1, LIn;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, LIn;-><init>(Landroid/content/Context;)V

    const-string v2, "ymUser"

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Llj;

    const/4 v5, 0x3

    invoke-direct {v4, p0, v0, v5}, Llj;-><init>(Lmj;Landroid/content/SharedPreferences;I)V

    const v5, 0x7f130130

    invoke-virtual {p0, v5, v2, v6, v4}, Lc4;->Q(ILjava/lang/String;ILOn;)LPn;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v2, "ymPlayMode"

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    new-instance v12, Llj;

    const/4 v2, 0x4

    invoke-direct {v12, p0, v0, v2}, Llj;-><init>(Lmj;Landroid/content/SharedPreferences;I)V

    const v9, 0x7f030015

    const v10, 0x7f030016

    const v8, 0x7f130134

    invoke-virtual/range {v7 .. v12}, Lc4;->U(IIILjava/lang/String;LQn;)LRn;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v2, "ymListId"

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Llj;

    const/4 v4, 0x5

    invoke-direct {v3, p0, v0, v4}, Llj;-><init>(Lmj;Landroid/content/SharedPreferences;I)V

    const v0, 0x7f13012f

    invoke-virtual {p0, v0, v2, v6, v3}, Lc4;->Q(ILjava/lang/String;ILOn;)LPn;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object p1
.end method
