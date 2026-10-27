.class public abstract LSl;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LNl;

.field public b:Ljava/util/ArrayList;

.field public c:J

.field public d:J

.field public e:J

.field public f:J


# direct methods
.method public static b(Llm;)V
    .locals 2

    iget v0, p0, Llm;->j:I

    invoke-virtual {p0}, Llm;->g()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    and-int/lit8 v0, v0, 0x4

    if-nez v0, :cond_2

    iget-object v0, p0, Llm;->r:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->F(Llm;)I

    :cond_2
    :goto_0
    return-void
.end method


# virtual methods
.method public abstract a(Llm;Llm;LEj;LEj;)Z
.end method

.method public c(Llm;)V
    .locals 0

    invoke-virtual {p0, p1}, LSl;->d(Llm;)V

    return-void
.end method

.method public final d(Llm;)V
    .locals 9

    iget-object v0, p0, LSl;->a:LNl;

    if-eqz v0, :cond_5

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Llm;->o(Z)V

    iget-object v2, p1, Llm;->h:Llm;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    iget-object v2, p1, Llm;->i:Llm;

    if-nez v2, :cond_0

    iput-object v3, p1, Llm;->h:Llm;

    :cond_0
    iput-object v3, p1, Llm;->i:Llm;

    iget v2, p1, Llm;->j:I

    and-int/lit8 v2, v2, 0x10

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, v0, LNl;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->d0()V

    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->e:LK2;

    iget-object v3, v2, LK2;->b:Ljava/lang/Object;

    check-cast v3, LNl;

    iget-object v4, v3, LNl;->a:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v5, p1, Llm;->a:Landroid/view/View;

    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v4

    const/4 v6, -0x1

    const/4 v7, 0x0

    if-ne v4, v6, :cond_2

    invoke-virtual {v2, v5}, LK2;->O(Landroid/view/View;)V

    goto :goto_0

    :cond_2
    iget-object v6, v2, LK2;->c:Ljava/lang/Object;

    check-cast v6, LO5;

    invoke-virtual {v6, v4}, LO5;->d(I)Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-virtual {v6, v4}, LO5;->g(I)Z

    invoke-virtual {v2, v5}, LK2;->O(Landroid/view/View;)V

    invoke-virtual {v3, v4}, LNl;->h(I)V

    goto :goto_0

    :cond_3
    move v1, v7

    :goto_0
    if-eqz v1, :cond_4

    invoke-static {v5}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Llm;

    move-result-object v2

    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->b:Lcm;

    invoke-virtual {v3, v2}, Lcm;->j(Llm;)V

    invoke-virtual {v3, v2}, Lcm;->g(Llm;)V

    :cond_4
    xor-int/lit8 v2, v1, 0x1

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->e0(Z)V

    if-nez v1, :cond_5

    invoke-virtual {p1}, Llm;->k()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-virtual {v0, v5, v7}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    :cond_5
    :goto_1
    return-void
.end method

.method public abstract e(Llm;)V
.end method

.method public abstract f()V
.end method

.method public abstract g()Z
.end method
