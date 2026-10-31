.class public final LPp;
.super Landroid/view/ActionMode;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lq0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lq0;)V
    .locals 0

    invoke-direct {p0}, Landroid/view/ActionMode;-><init>()V

    iput-object p1, p0, LPp;->a:Landroid/content/Context;

    iput-object p2, p0, LPp;->b:Lq0;

    return-void
.end method


# virtual methods
.method public final finish()V
    .locals 1

    iget-object v0, p0, LPp;->b:Lq0;

    invoke-virtual {v0}, Lq0;->a()V

    return-void
.end method

.method public final getCustomView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, LPp;->b:Lq0;

    invoke-virtual {v0}, Lq0;->b()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public final getMenu()Landroid/view/Menu;
    .locals 3

    new-instance v0, LOi;

    iget-object v1, p0, LPp;->b:Lq0;

    invoke-virtual {v1}, Lq0;->c()Lti;

    move-result-object v1

    iget-object v2, p0, LPp;->a:Landroid/content/Context;

    invoke-direct {v0, v2, v1}, LOi;-><init>(Landroid/content/Context;Lti;)V

    return-object v0
.end method

.method public final getMenuInflater()Landroid/view/MenuInflater;
    .locals 1

    iget-object v0, p0, LPp;->b:Lq0;

    invoke-virtual {v0}, Lq0;->d()Landroid/view/MenuInflater;

    move-result-object v0

    return-object v0
.end method

.method public final getSubtitle()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, LPp;->b:Lq0;

    invoke-virtual {v0}, Lq0;->e()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final getTag()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LPp;->b:Lq0;

    iget-object v0, v0, Lq0;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, LPp;->b:Lq0;

    invoke-virtual {v0}, Lq0;->f()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final getTitleOptionalHint()Z
    .locals 1

    iget-object v0, p0, LPp;->b:Lq0;

    iget-boolean v0, v0, Lq0;->b:Z

    return v0
.end method

.method public final invalidate()V
    .locals 1

    iget-object v0, p0, LPp;->b:Lq0;

    invoke-virtual {v0}, Lq0;->g()V

    return-void
.end method

.method public final isTitleOptional()Z
    .locals 1

    iget-object v0, p0, LPp;->b:Lq0;

    invoke-virtual {v0}, Lq0;->h()Z

    move-result v0

    return v0
.end method

.method public final setCustomView(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, LPp;->b:Lq0;

    invoke-virtual {v0, p1}, Lq0;->i(Landroid/view/View;)V

    return-void
.end method

.method public final setSubtitle(I)V
    .locals 1

    .line 2
    iget-object v0, p0, LPp;->b:Lq0;

    invoke-virtual {v0, p1}, Lq0;->j(I)V

    return-void
.end method

.method public final setSubtitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, LPp;->b:Lq0;

    invoke-virtual {v0, p1}, Lq0;->l(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setTag(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LPp;->b:Lq0;

    iput-object p1, v0, Lq0;->a:Ljava/lang/Object;

    return-void
.end method

.method public final setTitle(I)V
    .locals 1

    .line 2
    iget-object v0, p0, LPp;->b:Lq0;

    invoke-virtual {v0, p1}, Lq0;->m(I)V

    return-void
.end method

.method public final setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, LPp;->b:Lq0;

    invoke-virtual {v0, p1}, Lq0;->o(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setTitleOptionalHint(Z)V
    .locals 1

    iget-object v0, p0, LPp;->b:Lq0;

    invoke-virtual {v0, p1}, Lq0;->p(Z)V

    return-void
.end method
