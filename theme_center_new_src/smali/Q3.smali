.class public LQ3;
.super Lc4;
.source "SourceFile"


# instance fields
.field public U:LS3;

.field public V:LPn;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lc4;-><init>()V

    return-void
.end method


# virtual methods
.method public final c0(Ljava/lang/Runnable;)V
    .locals 1

    invoke-virtual {p0}, Lzc;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lzc;->f()Lq1;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lzc;->H()Lq1;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final t(IILandroid/content/Intent;)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Lzc;->t(IILandroid/content/Intent;)V

    const/16 v0, 0x3e9

    if-ne p1, v0, :cond_1

    const/4 p1, -0x1

    if-ne p2, p1, :cond_1

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    new-instance p2, Ljava/lang/Thread;

    new-instance p3, LB1;

    const/4 v0, 0x3

    invoke-direct {p3, p0, v0, p1}, LB1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-direct {p2, p3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {p2}, Ljava/lang/Thread;->start()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object p1

    const p2, 0x7f130209

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final w(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 10

    new-instance p1, LS3;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object p2

    invoke-direct {p1}, LS3;-><init>()V

    iput-object p2, p1, LS3;->b:Landroid/content/Context;

    iput-object p1, p0, LQ3;->U:LS3;

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

    new-instance v2, LPn;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, LPn;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, LQ3;->V:LPn;

    const v3, 0x7f1301fb

    invoke-virtual {v2, v3}, LSn;->setTitle(I)V

    iget-object v2, p0, LQ3;->V:LPn;

    iget-object v3, p0, LQ3;->U:LS3;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LS3;->k()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, LPn;->setValue(Ljava/lang/String;)V

    iget-object v2, p0, LQ3;->V:LPn;

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v2, "pswBackupSwitch"

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v8

    new-instance v9, LN3;

    const/4 v2, 0x0

    invoke-direct {v9, v0, v2}, LN3;-><init>(Landroid/content/SharedPreferences;I)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    const v5, 0x7f1301c9

    move-object v4, p0

    invoke-virtual/range {v4 .. v9}, Lc4;->b0(IIIZLVn;)LWn;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/16 v0, 0xc

    invoke-virtual {p0, p2, v0}, Lc4;->O(Landroid/widget/LinearLayout;I)V

    new-instance v1, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v2, LO3;

    const/4 v4, 0x0

    invoke-direct {v2, p0, v4}, LO3;-><init>(LQ3;I)V

    const v4, 0x7f13018f

    invoke-virtual {p0, v4, v2}, Lc4;->Z(ILjava/lang/Runnable;)Landroid/widget/Button;

    move-result-object v2

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v5, -0x2

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-direct {v4, v3, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, LO3;

    const/4 v4, 0x1

    invoke-direct {v2, p0, v4}, LO3;-><init>(LQ3;I)V

    const v4, 0x7f1301cb

    invoke-virtual {p0, v4, v2}, Lc4;->Z(ILjava/lang/Runnable;)Landroid/widget/Button;

    move-result-object v2

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v4, v3, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {p0, v0}, Lc4;->P(I)I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object p1
.end method
