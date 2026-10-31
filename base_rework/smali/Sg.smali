.class public final LSg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLi;
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public a:Landroid/content/Context;

.field public b:Landroid/view/LayoutInflater;

.field public c:Lti;

.field public d:Landroidx/appcompat/view/menu/ExpandedMenuView;

.field public e:LKi;

.field public f:LRg;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSg;->a:Landroid/content/Context;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, LSg;->b:Landroid/view/LayoutInflater;

    return-void
.end method


# virtual methods
.method public final b(Lti;Z)V
    .locals 1

    iget-object v0, p0, LSg;->e:LKi;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, LKi;->b(Lti;Z)V

    :cond_0
    return-void
.end method

.method public final c()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final d(Lyi;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final f(LKi;)V
    .locals 0

    iput-object p1, p0, LSg;->e:LKi;

    return-void
.end method

.method public final g(Lyi;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final h()V
    .locals 1

    iget-object v0, p0, LSg;->f:LRg;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LRg;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method public final j(Landroid/content/Context;Lti;)V
    .locals 1

    iget-object v0, p0, LSg;->a:Landroid/content/Context;

    if-eqz v0, :cond_0

    iput-object p1, p0, LSg;->a:Landroid/content/Context;

    iget-object v0, p0, LSg;->b:Landroid/view/LayoutInflater;

    if-nez v0, :cond_0

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, LSg;->b:Landroid/view/LayoutInflater;

    :cond_0
    iput-object p2, p0, LSg;->c:Lti;

    iget-object p1, p0, LSg;->f:LRg;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LRg;->notifyDataSetChanged()V

    :cond_1
    return-void
.end method

.method public final k(LNp;)Z
    .locals 6

    invoke-virtual {p1}, Lti;->hasVisibleItems()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    new-instance v0, Lui;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p1, v0, Lui;->a:Lti;

    new-instance v1, LQ0;

    iget-object v2, p1, Lti;->a:Landroid/content/Context;

    invoke-direct {v1, v2}, LQ0;-><init>(Landroid/content/Context;)V

    new-instance v3, LSg;

    iget-object v4, v1, LQ0;->b:Ljava/lang/Object;

    check-cast v4, LM0;

    iget-object v5, v4, LM0;->a:Landroid/content/Context;

    invoke-direct {v3, v5}, LSg;-><init>(Landroid/content/Context;)V

    iput-object v3, v0, Lui;->c:LSg;

    iput-object v0, v3, LSg;->e:LKi;

    invoke-virtual {p1, v3, v2}, Lti;->b(LLi;Landroid/content/Context;)V

    iget-object v2, v0, Lui;->c:LSg;

    iget-object v3, v2, LSg;->f:LRg;

    if-nez v3, :cond_1

    new-instance v3, LRg;

    invoke-direct {v3, v2}, LRg;-><init>(LSg;)V

    iput-object v3, v2, LSg;->f:LRg;

    :cond_1
    iget-object v2, v2, LSg;->f:LRg;

    iput-object v2, v4, LM0;->p:Landroid/widget/ListAdapter;

    iput-object v0, v4, LM0;->q:Landroid/content/DialogInterface$OnClickListener;

    iget-object v2, p1, Lti;->o:Landroid/view/View;

    if-eqz v2, :cond_2

    iput-object v2, v4, LM0;->e:Landroid/view/View;

    goto :goto_0

    :cond_2
    iget-object v2, p1, Lti;->n:Landroid/graphics/drawable/Drawable;

    iput-object v2, v4, LM0;->c:Landroid/graphics/drawable/Drawable;

    iget-object v2, p1, Lti;->m:Ljava/lang/CharSequence;

    iput-object v2, v4, LM0;->d:Ljava/lang/CharSequence;

    :goto_0
    iput-object v0, v4, LM0;->n:Landroid/content/DialogInterface$OnKeyListener;

    invoke-virtual {v1}, LQ0;->b()LR0;

    move-result-object v1

    iput-object v1, v0, Lui;->b:LR0;

    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iget-object v1, v0, Lui;->b:LR0;

    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    const/16 v2, 0x3eb

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->type:I

    iget v2, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    const/high16 v3, 0x20000

    or-int/2addr v2, v3

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    iget-object v0, v0, Lui;->b:LR0;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    iget-object v0, p0, LSg;->e:LKi;

    if-eqz v0, :cond_3

    invoke-interface {v0, p1}, LKi;->u(Lti;)Z

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    iget-object p1, p0, LSg;->c:Lti;

    iget-object p2, p0, LSg;->f:LRg;

    invoke-virtual {p2, p3}, LRg;->b(I)Lyi;

    move-result-object p2

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p0, p3}, Lti;->q(Landroid/view/MenuItem;LLi;I)Z

    return-void
.end method
