.class public final LBc;
.super LBr;
.source "SourceFile"

# interfaces
.implements Lck;
.implements Ljk;
.implements Lfk;
.implements Lgk;
.implements LSs;
.implements Lbk;
.implements LD0;
.implements Lxn;
.implements LSc;
.implements Lvi;


# instance fields
.field public final j:Landroid/app/Activity;

.field public final k:Landroid/content/Context;

.field public final l:Landroid/os/Handler;

.field public final m:LOc;

.field public final synthetic n:Lq1;


# direct methods
.method public constructor <init>(Lq1;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBc;->n:Lq1;

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v1, LOc;

    invoke-direct {v1}, LOc;-><init>()V

    iput-object v1, p0, LBc;->m:LOc;

    iput-object p1, p0, LBc;->j:Landroid/app/Activity;

    iput-object p1, p0, LBc;->k:Landroid/content/Context;

    iput-object v0, p0, LBc;->l:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public final B0(LIc;)V
    .locals 1

    iget-object v0, p0, LBc;->n:Lq1;

    invoke-virtual {v0, p1}, LP6;->f(LIc;)V

    return-void
.end method

.method public final C0(Ly7;)V
    .locals 1

    iget-object v0, p0, LBc;->n:Lq1;

    invoke-virtual {v0, p1}, LP6;->g(Ly7;)V

    return-void
.end method

.method public final D0(LFc;)V
    .locals 1

    iget-object v0, p0, LBc;->n:Lq1;

    invoke-virtual {v0, p1}, LP6;->i(LFc;)V

    return-void
.end method

.method public final E0(LFc;)V
    .locals 1

    iget-object v0, p0, LBc;->n:Lq1;

    invoke-virtual {v0, p1}, LP6;->j(LFc;)V

    return-void
.end method

.method public final F0(LFc;)V
    .locals 1

    iget-object v0, p0, LBc;->n:Lq1;

    invoke-virtual {v0, p1}, LP6;->k(LFc;)V

    return-void
.end method

.method public final G0(LIc;)V
    .locals 1

    iget-object v0, p0, LBc;->n:Lq1;

    invoke-virtual {v0, p1}, LP6;->o(LIc;)V

    return-void
.end method

.method public final H0(LFc;)V
    .locals 1

    iget-object v0, p0, LBc;->n:Lq1;

    invoke-virtual {v0, p1}, LP6;->p(LFc;)V

    return-void
.end method

.method public final I0(LFc;)V
    .locals 1

    iget-object v0, p0, LBc;->n:Lq1;

    invoke-virtual {v0, p1}, LP6;->q(LFc;)V

    return-void
.end method

.method public final J0(LFc;)V
    .locals 1

    iget-object v0, p0, LBc;->n:Lq1;

    invoke-virtual {v0, p1}, LP6;->r(LFc;)V

    return-void
.end method

.method public final K0(LFc;)V
    .locals 1

    iget-object v0, p0, LBc;->n:Lq1;

    invoke-virtual {v0, p1}, LP6;->s(LFc;)V

    return-void
.end method

.method public final N(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, LBc;->n:Lq1;

    invoke-virtual {v0, p1}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final Q()Z
    .locals 1

    iget-object v0, p0, LBc;->n:Lq1;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final a()V
    .locals 1

    iget-object v0, p0, LBc;->n:Lq1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final b()Lx1;
    .locals 1

    iget-object v0, p0, LBc;->n:Lq1;

    iget-object v0, v0, LP6;->d:LLo;

    iget-object v0, v0, LLo;->d:Ljava/lang/Object;

    check-cast v0, Lx1;

    return-object v0
.end method

.method public final d()LRs;
    .locals 1

    iget-object v0, p0, LBc;->n:Lq1;

    invoke-virtual {v0}, LP6;->d()LRs;

    move-result-object v0

    return-object v0
.end method

.method public final getLifecycle()Lwg;
    .locals 1

    iget-object v0, p0, LBc;->n:Lq1;

    iget-object v0, v0, Lq1;->t:LFg;

    return-object v0
.end method
