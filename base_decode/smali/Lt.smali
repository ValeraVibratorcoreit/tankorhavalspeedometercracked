.class public LLt;
.super LNt;
.source "SourceFile"


# instance fields
.field public final c:Landroid/view/WindowInsets$Builder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LNt;-><init>()V

    .line 2
    invoke-static {}, Ljt;->b()Landroid/view/WindowInsets$Builder;

    move-result-object v0

    iput-object v0, p0, LLt;->c:Landroid/view/WindowInsets$Builder;

    return-void
.end method

.method public constructor <init>(LVt;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, LNt;-><init>(LVt;)V

    .line 4
    invoke-virtual {p1}, LVt;->f()Landroid/view/WindowInsets;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 5
    invoke-static {p1}, Ljt;->c(Landroid/view/WindowInsets;)Landroid/view/WindowInsets$Builder;

    move-result-object p1

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, Ljt;->b()Landroid/view/WindowInsets$Builder;

    move-result-object p1

    :goto_0
    iput-object p1, p0, LLt;->c:Landroid/view/WindowInsets$Builder;

    return-void
.end method


# virtual methods
.method public b()LVt;
    .locals 3

    invoke-virtual {p0}, LNt;->a()V

    iget-object v0, p0, LLt;->c:Landroid/view/WindowInsets$Builder;

    invoke-static {v0}, Ljt;->d(Landroid/view/WindowInsets$Builder;)Landroid/view/WindowInsets;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, LVt;->g(Landroid/view/View;Landroid/view/WindowInsets;)LVt;

    move-result-object v0

    iget-object v1, p0, LNt;->b:[LHf;

    iget-object v2, v0, LVt;->a:LTt;

    invoke-virtual {v2, v1}, LTt;->o([LHf;)V

    return-object v0
.end method

.method public d(LHf;)V
    .locals 1

    iget-object v0, p0, LLt;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, LHf;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, Ljt;->l(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    return-void
.end method

.method public e(LHf;)V
    .locals 1

    iget-object v0, p0, LLt;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, LHf;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, Ljt;->i(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    return-void
.end method

.method public f(LHf;)V
    .locals 1

    iget-object v0, p0, LLt;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, LHf;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, Ljt;->k(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    return-void
.end method

.method public g(LHf;)V
    .locals 1

    iget-object v0, p0, LLt;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, LHf;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, Ljt;->g(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    return-void
.end method

.method public h(LHf;)V
    .locals 1

    iget-object v0, p0, LLt;->c:Landroid/view/WindowInsets$Builder;

    invoke-virtual {p1}, LHf;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {v0, p1}, Ljt;->m(Landroid/view/WindowInsets$Builder;Landroid/graphics/Insets;)V

    return-void
.end method
