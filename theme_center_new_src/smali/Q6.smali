.class public LQ6;
.super Landroid/app/Dialog;
.source "SourceFile"

# interfaces
.implements LDg;
.implements Lbk;
.implements Lxn;


# instance fields
.field public a:LFg;

.field public final b:LLo;

.field public final c:Lak;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    new-instance p1, LLo;

    invoke-direct {p1, p0}, LLo;-><init>(Lxn;)V

    iput-object p1, p0, LQ6;->b:LLo;

    new-instance p1, Lak;

    new-instance p2, Lt5;

    const/4 v0, 0x3

    invoke-direct {p2, p0, v0}, Lt5;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p1, p2}, Lak;-><init>(Ljava/lang/Runnable;)V

    iput-object p1, p0, LQ6;->c:Lak;

    return-void
.end method

.method public static a(LQ6;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {v0, p0}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-super {p0}, Landroid/app/Dialog;->onBackPressed()V

    return-void
.end method


# virtual methods
.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    const-string v0, "view"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, LQ6;->d()V

    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final b()Lx1;
    .locals 1

    iget-object v0, p0, LQ6;->b:LLo;

    iget-object v0, v0, LLo;->d:Ljava/lang/Object;

    check-cast v0, Lx1;

    return-object v0
.end method

.method public final c()LFg;
    .locals 1

    iget-object v0, p0, LQ6;->a:LFg;

    if-nez v0, :cond_0

    new-instance v0, LFg;

    invoke-direct {v0, p0}, LFg;-><init>(LDg;)V

    iput-object v0, p0, LQ6;->a:LFg;

    :cond_0
    return-object v0
.end method

.method public final d()V
    .locals 2

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-static {v0}, LTf;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const-string v1, "window!!.decorView"

    invoke-static {v1, v0}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v0, p0}, LF4;->X(Landroid/view/View;LDg;)V

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-static {v0}, LTf;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v1, v0}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v0, p0}, LTd;->D(Landroid/view/View;Lbk;)V

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-static {v0}, LTf;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v1, v0}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v0, p0}, LUd;->f0(Landroid/view/View;Lxn;)V

    return-void
.end method

.method public final getLifecycle()Lwg;
    .locals 1

    invoke-virtual {p0}, LQ6;->c()LFg;

    move-result-object v0

    return-object v0
.end method

.method public final onBackPressed()V
    .locals 1

    iget-object v0, p0, LQ6;->c:Lak;

    invoke-virtual {v0}, Lak;->b()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    invoke-static {p0}, LD;->c(LQ6;)Landroid/window/OnBackInvokedDispatcher;

    move-result-object v0

    const-string v1, "onBackInvokedDispatcher"

    invoke-static {v1, v0}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v1, p0, LQ6;->c:Lak;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v0, v1, Lak;->e:Landroid/window/OnBackInvokedDispatcher;

    iget-boolean v0, v1, Lak;->g:Z

    invoke-virtual {v1, v0}, Lak;->c(Z)V

    :cond_0
    iget-object v0, p0, LQ6;->b:LLo;

    invoke-virtual {v0, p1}, LLo;->e(Landroid/os/Bundle;)V

    invoke-virtual {p0}, LQ6;->c()LFg;

    move-result-object p1

    sget-object v0, Ltg;->ON_CREATE:Ltg;

    invoke-virtual {p1, v0}, LFg;->e(Ltg;)V

    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Bundle;
    .locals 2

    invoke-super {p0}, Landroid/app/Dialog;->onSaveInstanceState()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "super.onSaveInstanceState()"

    invoke-static {v1, v0}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v1, p0, LQ6;->b:LLo;

    invoke-virtual {v1, v0}, LLo;->f(Landroid/os/Bundle;)V

    return-object v0
.end method

.method public final onStart()V
    .locals 2

    invoke-super {p0}, Landroid/app/Dialog;->onStart()V

    invoke-virtual {p0}, LQ6;->c()LFg;

    move-result-object v0

    sget-object v1, Ltg;->ON_RESUME:Ltg;

    invoke-virtual {v0, v1}, LFg;->e(Ltg;)V

    return-void
.end method

.method public onStop()V
    .locals 2

    invoke-virtual {p0}, LQ6;->c()LFg;

    move-result-object v0

    sget-object v1, Ltg;->ON_DESTROY:Ltg;

    invoke-virtual {v0, v1}, LFg;->e(Ltg;)V

    const/4 v0, 0x0

    iput-object v0, p0, LQ6;->a:LFg;

    invoke-super {p0}, Landroid/app/Dialog;->onStop()V

    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, LQ6;->d()V

    .line 2
    invoke-super {p0, p1}, Landroid/app/Dialog;->setContentView(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1

    const-string v0, "view"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    .line 3
    invoke-virtual {p0}, LQ6;->d()V

    .line 4
    invoke-super {p0, p1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    const-string v0, "view"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    .line 5
    invoke-virtual {p0}, LQ6;->d()V

    .line 6
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method
