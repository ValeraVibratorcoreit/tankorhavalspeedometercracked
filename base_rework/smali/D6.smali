.class public LD6;
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
    .locals 10

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

    const-string v2, "autoStart"

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v8

    new-instance v9, LC6;

    const/4 v2, 0x0

    invoke-direct {v9, p0, v0, v2}, LC6;-><init>(LD6;Landroid/content/SharedPreferences;I)V

    const v6, 0x7f13013b

    const v7, 0x7f13013a

    const v5, 0x7f13013c

    move-object v4, p0

    invoke-virtual/range {v4 .. v9}, Lc4;->b0(IIIZLVn;)LWn;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v2, "language"

    const-string v3, "sys"

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    new-instance v9, LC6;

    const/4 v2, 0x1

    invoke-direct {v9, p0, v0, v2}, LC6;-><init>(LD6;Landroid/content/SharedPreferences;I)V

    const v6, 0x7f03000e

    const v7, 0x7f03000f

    const v5, 0x7f130132

    invoke-virtual/range {v4 .. v9}, Lc4;->U(IIILjava/lang/String;LQn;)LRn;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v2, "carModel"

    const-string v3, ""

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    new-instance v9, LC6;

    const/4 v2, 0x2

    invoke-direct {v9, p0, v0, v2}, LC6;-><init>(LD6;Landroid/content/SharedPreferences;I)V

    const v6, 0x7f03000a

    const v7, 0x7f03000b

    const v5, 0x7f130195

    invoke-virtual/range {v4 .. v9}, Lc4;->U(IIILjava/lang/String;LQn;)LRn;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v2, "extFirmware"

    const/4 v3, 0x1

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v8

    new-instance v9, LC6;

    const/4 v2, 0x3

    invoke-direct {v9, p0, v0, v2}, LC6;-><init>(LD6;Landroid/content/SharedPreferences;I)V

    const v6, 0x7f130147

    const v7, 0x7f130146

    const v5, 0x7f130148

    invoke-virtual/range {v4 .. v9}, Lc4;->b0(IIIZLVn;)LWn;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object p1
.end method
