.class public LEh;
.super Lc4;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lc4;-><init>()V

    return-void
.end method


# virtual methods
.method public final c0(Lji;Landroid/widget/Button;Landroid/widget/Button;)V
    .locals 3

    new-instance v0, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/4 v2, 0x1

    invoke-virtual {p0, p2, v2}, LEh;->d0(Landroid/widget/Button;Z)V

    invoke-virtual {v0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p0, p3, v1}, LEh;->d0(Landroid/widget/Button;Z)V

    invoke-virtual {v0, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public final d0(Landroid/widget/Button;Z)V
    .locals 4

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    const/4 v3, -0x2

    invoke-direct {v0, v2, v3, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    const/16 v1, 0xc

    invoke-virtual {p0, v1}, Lc4;->P(I)I

    move-result v2

    iput v2, v0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    if-eqz p2, :cond_0

    invoke-virtual {p0, v1}, Lc4;->P(I)I

    move-result p2

    invoke-virtual {v0, p2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    :cond_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final w(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 11

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

    new-instance v2, LWn;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, LWn;-><init>(Landroid/content/Context;)V

    const v3, 0x7f1301db

    invoke-virtual {v2, v3}, LSn;->setTitle(I)V

    const-string v3, "tboxSwitch"

    const/4 v4, 0x0

    invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    invoke-virtual {v2, v3}, LWn;->setChecked(Z)V

    new-instance v3, Ltf;

    invoke-direct {v3, p0, v2, v0}, Ltf;-><init>(LEh;LWn;Landroid/content/SharedPreferences;)V

    invoke-virtual {v2, v3}, LWn;->setOnCheckedChange(LVn;)V

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v2, "debugSwitch"

    invoke-interface {v0, v2, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v9

    new-instance v10, LN3;

    const/4 v2, 0x1

    invoke-direct {v10, v0, v2}, LN3;-><init>(Landroid/content/SharedPreferences;I)V

    const/4 v7, 0x0

    const/4 v8, 0x0

    const v6, 0x7f130198

    move-object v5, p0

    invoke-virtual/range {v5 .. v10}, Lc4;->b0(IIIZLVn;)LWn;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/16 v0, 0x10

    invoke-virtual {p0, p2, v0}, Lc4;->O(Landroid/widget/LinearLayout;I)V

    new-instance v0, LE0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LE0;-><init>(I)V

    const v1, 0x7f1301d8

    invoke-virtual {p0, v1, v0}, Lc4;->Z(ILjava/lang/Runnable;)Landroid/widget/Button;

    move-result-object v0

    new-instance v1, LE0;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, LE0;-><init>(I)V

    const v2, 0x7f1301d9

    invoke-virtual {p0, v2, v1}, Lc4;->Z(ILjava/lang/Runnable;)Landroid/widget/Button;

    move-result-object v1

    invoke-virtual {p0, p2, v0, v1}, LEh;->c0(Lji;Landroid/widget/Button;Landroid/widget/Button;)V

    new-instance v0, LE0;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, LE0;-><init>(I)V

    const v1, 0x7f1301da

    invoke-virtual {p0, v1, v0}, Lc4;->Z(ILjava/lang/Runnable;)Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Lt5;

    const/16 v2, 0xe

    invoke-direct {v1, p0, v2}, Lt5;-><init>(Ljava/lang/Object;I)V

    const v2, 0x7f13018b

    invoke-virtual {p0, v2, v1}, Lc4;->Z(ILjava/lang/Runnable;)Landroid/widget/Button;

    move-result-object v1

    invoke-virtual {p0, p2, v0, v1}, LEh;->c0(Lji;Landroid/widget/Button;Landroid/widget/Button;)V

    return-object p1
.end method
