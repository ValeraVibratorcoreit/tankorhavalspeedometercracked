.class public final LVh;
.super Landroidx/recyclerview/widget/LinearLayoutManager;
.source "SourceFile"


# instance fields
.field public final synthetic E:I

.field public final synthetic F:LYh;


# direct methods
.method public constructor <init>(LYh;II)V
    .locals 0

    iput-object p1, p0, LVh;->F:LYh;

    iput p3, p0, LVh;->E:I

    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final B0(Lim;[I)V
    .locals 3

    iget p1, p0, LVh;->E:I

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v2, p0, LVh;->F:LYh;

    if-nez p1, :cond_0

    iget-object p1, v2, LYh;->a0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    aput p1, p2, v1

    iget-object p1, v2, LYh;->a0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    aput p1, p2, v0

    goto :goto_0

    :cond_0
    iget-object p1, v2, LYh;->a0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    aput p1, p2, v1

    iget-object p1, v2, LYh;->a0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    aput p1, p2, v0

    :goto_0
    return-void
.end method

.method public final y0(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 1

    new-instance v0, LRo;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, LPg;-><init>(Landroid/content/Context;)V

    iput p2, v0, LPg;->a:I

    invoke-virtual {p0, v0}, LWl;->z0(LPg;)V

    return-void
.end method
