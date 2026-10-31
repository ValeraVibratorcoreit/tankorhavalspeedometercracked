.class public final LAt;
.super Lq0;
.source "SourceFile"

# interfaces
.implements Lri;


# instance fields
.field public final c:Landroid/content/Context;

.field public final d:Lti;

.field public e:Lp0;

.field public f:Ljava/lang/ref/WeakReference;

.field public final synthetic g:LBt;


# direct methods
.method public constructor <init>(LBt;Landroid/content/Context;Ld2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAt;->g:LBt;

    iput-object p2, p0, LAt;->c:Landroid/content/Context;

    iput-object p3, p0, LAt;->e:Lp0;

    new-instance p1, Lti;

    invoke-direct {p1, p2}, Lti;-><init>(Landroid/content/Context;)V

    const/4 p2, 0x1

    iput p2, p1, Lti;->l:I

    iput-object p1, p0, LAt;->d:Lti;

    iput-object p0, p1, Lti;->e:Lri;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, LAt;->g:LBt;

    iget-object v1, v0, LBt;->r:LAt;

    if-eq v1, p0, :cond_0

    return-void

    :cond_0
    iget-boolean v1, v0, LBt;->y:Z

    if-eqz v1, :cond_1

    iput-object p0, v0, LBt;->s:LAt;

    iget-object v1, p0, LAt;->e:Lp0;

    iput-object v1, v0, LBt;->t:Lp0;

    goto :goto_0

    :cond_1
    iget-object v1, p0, LAt;->e:Lp0;

    invoke-interface {v1, p0}, Lp0;->n(Lq0;)V

    :goto_0
    const/4 v1, 0x0

    iput-object v1, p0, LAt;->e:Lp0;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, LBt;->B0(Z)V

    iget-object v2, v0, LBt;->o:Landroidx/appcompat/widget/ActionBarContextView;

    iget-object v3, v2, Landroidx/appcompat/widget/ActionBarContextView;->k:Landroid/view/View;

    if-nez v3, :cond_2

    invoke-virtual {v2}, Landroidx/appcompat/widget/ActionBarContextView;->e()V

    :cond_2
    iget-object v2, v0, LBt;->l:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    iget-boolean v3, v0, LBt;->D:Z

    invoke-virtual {v2, v3}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V

    iput-object v1, v0, LBt;->r:LAt;

    return-void
.end method

.method public final b()Landroid/view/View;
    .locals 1

    iget-object v0, p0, LAt;->f:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final c()Lti;
    .locals 1

    iget-object v0, p0, LAt;->d:Lti;

    return-object v0
.end method

.method public final d()Landroid/view/MenuInflater;
    .locals 2

    new-instance v0, LSp;

    iget-object v1, p0, LAt;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, LSp;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final e()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, LAt;->g:LBt;

    iget-object v0, v0, LBt;->o:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->getSubtitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final f()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, LAt;->g:LBt;

    iget-object v0, v0, LBt;->o:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final g()V
    .locals 2

    iget-object v0, p0, LAt;->g:LBt;

    iget-object v0, v0, LBt;->r:LAt;

    if-eq v0, p0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LAt;->d:Lti;

    invoke-virtual {v0}, Lti;->w()V

    :try_start_0
    iget-object v1, p0, LAt;->e:Lp0;

    invoke-interface {v1, p0, v0}, Lp0;->j(Lq0;Landroid/view/Menu;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lti;->v()V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Lti;->v()V

    throw v1
.end method

.method public final h()Z
    .locals 1

    iget-object v0, p0, LAt;->g:LBt;

    iget-object v0, v0, LBt;->o:Landroidx/appcompat/widget/ActionBarContextView;

    iget-boolean v0, v0, Landroidx/appcompat/widget/ActionBarContextView;->s:Z

    return v0
.end method

.method public final i(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, LAt;->g:LBt;

    iget-object v0, v0, LBt;->o:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setCustomView(Landroid/view/View;)V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, LAt;->f:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public final j(I)V
    .locals 1

    iget-object v0, p0, LAt;->g:LBt;

    iget-object v0, v0, LBt;->j:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LAt;->l(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final k(Lti;)V
    .locals 0

    iget-object p1, p0, LAt;->e:Lp0;

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, LAt;->g()V

    iget-object p1, p0, LAt;->g:LBt;

    iget-object p1, p1, LBt;->o:Landroidx/appcompat/widget/ActionBarContextView;

    iget-object p1, p1, Landroidx/appcompat/widget/ActionBarContextView;->d:Ll0;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ll0;->l()Z

    :cond_1
    return-void
.end method

.method public final l(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, LAt;->g:LBt;

    iget-object v0, v0, LBt;->o:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setSubtitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final m(I)V
    .locals 1

    iget-object v0, p0, LAt;->g:LBt;

    iget-object v0, v0, LBt;->j:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, LAt;->o(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final n(Lti;Landroid/view/MenuItem;)Z
    .locals 0

    iget-object p1, p0, LAt;->e:Lp0;

    if-eqz p1, :cond_0

    invoke-interface {p1, p0, p2}, Lp0;->a(Lq0;Landroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final o(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, LAt;->g:LBt;

    iget-object v0, v0, LBt;->o:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final p(Z)V
    .locals 1

    iput-boolean p1, p0, Lq0;->b:Z

    iget-object v0, p0, LAt;->g:LBt;

    iget-object v0, v0, LBt;->o:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActionBarContextView;->setTitleOptional(Z)V

    return-void
.end method
