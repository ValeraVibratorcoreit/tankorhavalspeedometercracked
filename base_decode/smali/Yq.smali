.class public final LYq;
.super LBr;
.source "SourceFile"


# instance fields
.field public final j:Lar;

.field public final k:Landroid/view/Window$Callback;

.field public final l:LXq;

.field public m:Z

.field public n:Z

.field public o:Z

.field public final p:Ljava/util/ArrayList;

.field public final q:Lr0;


# direct methods
.method public constructor <init>(Lcom/google/android/material/appbar/MaterialToolbar;Ljava/lang/CharSequence;Landroid/view/Window$Callback;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LYq;->p:Ljava/util/ArrayList;

    new-instance v0, Lr0;

    const/16 v1, 0x14

    invoke-direct {v0, p0, v1}, Lr0;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, LYq;->q:Lr0;

    new-instance v0, LXq;

    invoke-direct {v0, p0}, LXq;-><init>(LYq;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lar;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lar;-><init>(Landroidx/appcompat/widget/Toolbar;Z)V

    iput-object v1, p0, LYq;->j:Lar;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p3, p0, LYq;->k:Landroid/view/Window$Callback;

    iput-object p3, v1, Lar;->k:Landroid/view/Window$Callback;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setOnMenuItemClickListener(LVq;)V

    iget-boolean p1, v1, Lar;->g:Z

    if-nez p1, :cond_0

    iput-object p2, v1, Lar;->h:Ljava/lang/CharSequence;

    iget p1, v1, Lar;->b:I

    and-int/lit8 p1, p1, 0x8

    if-eqz p1, :cond_0

    iget-object p1, v1, Lar;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    iget-boolean p3, v1, Lar;->g:Z

    if-eqz p3, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p1

    invoke-static {p1, p2}, LGs;->k(Landroid/view/View;Ljava/lang/CharSequence;)V

    :cond_0
    new-instance p1, LXq;

    invoke-direct {p1, p0}, LXq;-><init>(LYq;)V

    iput-object p1, p0, LYq;->l:LXq;

    return-void
.end method


# virtual methods
.method public final B0()Landroid/view/Menu;
    .locals 4

    iget-boolean v0, p0, LYq;->n:Z

    iget-object v1, p0, LYq;->j:Lar;

    if-nez v0, :cond_1

    new-instance v0, LB4;

    invoke-direct {v0, p0}, LB4;-><init>(Ljava/lang/Object;)V

    new-instance v2, LXq;

    invoke-direct {v2, p0}, LXq;-><init>(LYq;)V

    iget-object v3, v1, Lar;->a:Landroidx/appcompat/widget/Toolbar;

    iput-object v0, v3, Landroidx/appcompat/widget/Toolbar;->N:LKi;

    iput-object v2, v3, Landroidx/appcompat/widget/Toolbar;->O:Lri;

    iget-object v3, v3, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz v3, :cond_0

    iput-object v0, v3, Landroidx/appcompat/widget/ActionMenuView;->u:LKi;

    iput-object v2, v3, Landroidx/appcompat/widget/ActionMenuView;->v:Lri;

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LYq;->n:Z

    :cond_1
    iget-object v0, v1, Lar;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    move-result-object v0

    return-object v0
.end method

.method public final C()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, LYq;->j:Lar;

    iget-object v0, v0, Lar;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public final F()Z
    .locals 3

    iget-object v0, p0, LYq;->j:Lar;

    iget-object v1, v0, Lar;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object v2, p0, LYq;->q:Lr0;

    invoke-virtual {v1, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, v0, Lar;->a:Landroidx/appcompat/widget/Toolbar;

    sget-object v1, LGs;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v0, v2}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    const/4 v0, 0x1

    return v0
.end method

.method public final K()V
    .locals 0

    return-void
.end method

.method public final M()V
    .locals 2

    iget-object v0, p0, LYq;->j:Lar;

    iget-object v0, v0, Lar;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object v1, p0, LYq;->q:Lr0;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final R(ILandroid/view/KeyEvent;)Z
    .locals 4

    invoke-virtual {p0}, LYq;->B0()Landroid/view/Menu;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, -0x1

    :goto_0
    invoke-static {v2}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    invoke-interface {v0, v3}, Landroid/view/Menu;->setQwertyMode(Z)V

    invoke-interface {v0, p1, p2, v1}, Landroid/view/Menu;->performShortcut(ILandroid/view/KeyEvent;I)Z

    move-result p1

    return p1

    :cond_2
    return v1
.end method

.method public final S(Landroid/view/KeyEvent;)Z
    .locals 1

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, LYq;->U()Z

    :cond_0
    return v0
.end method

.method public final U()Z
    .locals 1

    iget-object v0, p0, LYq;->j:Lar;

    iget-object v0, v0, Lar;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->v()Z

    move-result v0

    return v0
.end method

.method public final j()Z
    .locals 1

    iget-object v0, p0, LYq;->j:Lar;

    iget-object v0, v0, Lar;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->t:Ll0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll0;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final j0(Z)V
    .locals 0

    return-void
.end method

.method public final k()Z
    .locals 2

    iget-object v0, p0, LYq;->j:Lar;

    iget-object v0, v0, Lar;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->M:LTq;

    if-eqz v0, :cond_2

    iget-object v1, v0, LTq;->b:Lyi;

    if-eqz v1, :cond_2

    if-nez v0, :cond_0

    const/4 v1, 0x0

    :cond_0
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lyi;->collapseActionView()Z

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public final k0(Z)V
    .locals 2

    iget-object p1, p0, LYq;->j:Lar;

    iget v0, p1, Lar;->b:I

    and-int/lit8 v0, v0, -0x5

    const/4 v1, 0x4

    or-int/2addr v0, v1

    invoke-virtual {p1, v0}, Lar;->a(I)V

    return-void
.end method

.method public final l0(Z)V
    .locals 0

    return-void
.end method

.method public final m0(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x1

    iget-object v1, p0, LYq;->j:Lar;

    iput-boolean v0, v1, Lar;->g:Z

    iput-object p1, v1, Lar;->h:Ljava/lang/CharSequence;

    iget v0, v1, Lar;->b:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    iget-object v0, v1, Lar;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    iget-boolean v1, v1, Lar;->g:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p1}, LGs;->k(Landroid/view/View;Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public final p(Z)V
    .locals 1

    iget-boolean v0, p0, LYq;->o:Z

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, LYq;->o:Z

    iget-object p1, p0, LYq;->p:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_1

    return-void

    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LVo;->l(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final p0(Ljava/lang/CharSequence;)V
    .locals 2

    iget-object v0, p0, LYq;->j:Lar;

    iget-boolean v1, v0, Lar;->g:Z

    if-nez v1, :cond_0

    iput-object p1, v0, Lar;->h:Ljava/lang/CharSequence;

    iget v1, v0, Lar;->b:I

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_0

    iget-object v1, v0, Lar;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v1, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    iget-boolean v0, v0, Lar;->g:Z

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p1}, LGs;->k(Landroid/view/View;Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public final v()I
    .locals 1

    iget-object v0, p0, LYq;->j:Lar;

    iget v0, v0, Lar;->b:I

    return v0
.end method
