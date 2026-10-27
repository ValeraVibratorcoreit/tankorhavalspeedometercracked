.class public LRt;
.super LQt;
.source "SourceFile"


# instance fields
.field public n:LHf;

.field public o:LHf;

.field public p:LHf;


# direct methods
.method public constructor <init>(LVt;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LQt;-><init>(LVt;Landroid/view/WindowInsets;)V

    const/4 p1, 0x0

    iput-object p1, p0, LRt;->n:LHf;

    iput-object p1, p0, LRt;->o:LHf;

    iput-object p1, p0, LRt;->p:LHf;

    return-void
.end method


# virtual methods
.method public g()LHf;
    .locals 1

    iget-object v0, p0, LRt;->o:LHf;

    if-nez v0, :cond_0

    iget-object v0, p0, LOt;->c:Landroid/view/WindowInsets;

    invoke-static {v0}, Ljt;->h(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, LHf;->c(Landroid/graphics/Insets;)LHf;

    move-result-object v0

    iput-object v0, p0, LRt;->o:LHf;

    :cond_0
    iget-object v0, p0, LRt;->o:LHf;

    return-object v0
.end method

.method public i()LHf;
    .locals 1

    iget-object v0, p0, LRt;->n:LHf;

    if-nez v0, :cond_0

    iget-object v0, p0, LOt;->c:Landroid/view/WindowInsets;

    invoke-static {v0}, Ljt;->j(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, LHf;->c(Landroid/graphics/Insets;)LHf;

    move-result-object v0

    iput-object v0, p0, LRt;->n:LHf;

    :cond_0
    iget-object v0, p0, LRt;->n:LHf;

    return-object v0
.end method

.method public k()LHf;
    .locals 1

    iget-object v0, p0, LRt;->p:LHf;

    if-nez v0, :cond_0

    iget-object v0, p0, LOt;->c:Landroid/view/WindowInsets;

    invoke-static {v0}, Ljt;->a(Landroid/view/WindowInsets;)Landroid/graphics/Insets;

    move-result-object v0

    invoke-static {v0}, LHf;->c(Landroid/graphics/Insets;)LHf;

    move-result-object v0

    iput-object v0, p0, LRt;->p:LHf;

    :cond_0
    iget-object v0, p0, LRt;->p:LHf;

    return-object v0
.end method

.method public l(IIII)LVt;
    .locals 1

    iget-object v0, p0, LOt;->c:Landroid/view/WindowInsets;

    invoke-static {v0, p1, p2, p3, p4}, Ljt;->e(Landroid/view/WindowInsets;IIII)Landroid/view/WindowInsets;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p2, p1}, LVt;->g(Landroid/view/View;Landroid/view/WindowInsets;)LVt;

    move-result-object p1

    return-object p1
.end method

.method public q(LHf;)V
    .locals 0

    return-void
.end method
