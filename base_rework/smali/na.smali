.class public Lna;
.super Lma;
.source "SourceFile"


# virtual methods
.method public a(LXp;LXp;Landroid/view/Window;Landroid/view/View;ZZ)V
    .locals 1

    const-string v0, "statusBarStyle"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string p1, "navigationBarStyle"

    invoke-static {p1, p2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string p1, "window"

    invoke-static {p1, p3}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string p1, "view"

    invoke-static {p1, p4}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 p1, 0x0

    invoke-static {p3, p1}, LF4;->Y(Landroid/view/Window;Z)V

    invoke-virtual {p3, p1}, Landroid/view/Window;->setStatusBarColor(I)V

    invoke-virtual {p3, p1}, Landroid/view/Window;->setNavigationBarColor(I)V

    invoke-static {p3}, LA;->m(Landroid/view/Window;)V

    invoke-static {p3}, LA;->x(Landroid/view/Window;)V

    new-instance p1, LVi;

    invoke-direct {p1, p4}, LVi;-><init>(Landroid/view/View;)V

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p4, 0x1e

    if-lt p2, p4, :cond_0

    new-instance p2, LYt;

    invoke-static {p3}, LB;->l(Landroid/view/Window;)Landroid/view/WindowInsetsController;

    move-result-object p4

    invoke-direct {p2, p4, p1}, LYt;-><init>(Landroid/view/WindowInsetsController;LVi;)V

    iput-object p3, p2, LYt;->j:Landroid/view/Window;

    goto :goto_0

    :cond_0
    new-instance p2, LWt;

    invoke-direct {p2, p3, p1}, LWt;-><init>(Landroid/view/Window;LVi;)V

    :goto_0
    xor-int/lit8 p1, p5, 0x1

    invoke-virtual {p2, p1}, LTd;->F(Z)V

    xor-int/lit8 p1, p6, 0x1

    invoke-virtual {p2, p1}, LTd;->E(Z)V

    return-void
.end method
