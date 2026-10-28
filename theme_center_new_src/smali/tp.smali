.class public final Ltp;
.super LDi;
.source "SourceFile"

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;
.implements Landroid/view/View$OnKeyListener;


# instance fields
.field public final b:Landroid/content/Context;

.field public final c:Lti;

.field public final d:Lqi;

.field public final e:Z

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:LJi;

.field public final j:Lk2;

.field public final k:Lx5;

.field public l:Landroid/widget/PopupWindow$OnDismissListener;

.field public m:Landroid/view/View;

.field public n:Landroid/view/View;

.field public o:LKi;

.field public p:Landroid/view/ViewTreeObserver;

.field public q:Z

.field public r:Z

.field public s:I

.field public t:I

.field public u:Z


# direct methods
.method public constructor <init>(IILti;Landroid/content/Context;Landroid/view/View;Z)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lk2;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Lk2;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Ltp;->j:Lk2;

    new-instance v0, Lx5;

    invoke-direct {v0, p0, v1}, Lx5;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Ltp;->k:Lx5;

    const/4 v0, 0x0

    iput v0, p0, Ltp;->t:I

    iput-object p4, p0, Ltp;->b:Landroid/content/Context;

    iput-object p3, p0, Ltp;->c:Lti;

    iput-boolean p6, p0, Ltp;->e:Z

    invoke-static {p4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    new-instance v1, Lqi;

    const v2, 0x7f0e0013

    invoke-direct {v1, p3, v0, p6, v2}, Lqi;-><init>(Lti;Landroid/view/LayoutInflater;ZI)V

    iput-object v1, p0, Ltp;->d:Lqi;

    iput p1, p0, Ltp;->g:I

    iput p2, p0, Ltp;->h:I

    invoke-virtual {p4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p6

    invoke-virtual {p6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    div-int/lit8 v0, v0, 0x2

    const v1, 0x7f070017

    invoke-virtual {p6, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p6

    invoke-static {v0, p6}, Ljava/lang/Math;->max(II)I

    move-result p6

    iput p6, p0, Ltp;->f:I

    iput-object p5, p0, Ltp;->m:Landroid/view/View;

    new-instance p5, LJi;

    const/4 p6, 0x0

    invoke-direct {p5, p4, p6, p1, p2}, Lah;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    iput-object p5, p0, Ltp;->i:LJi;

    invoke-virtual {p3, p0, p4}, Lti;->b(LLi;Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Ltp;->q:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ltp;->i:LJi;

    iget-object v0, v0, Lah;->z:Lc2;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final b(Lti;Z)V
    .locals 1

    iget-object v0, p0, Ltp;->c:Lti;

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Ltp;->dismiss()V

    iget-object v0, p0, Ltp;->o:LKi;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2}, LKi;->b(Lti;Z)V

    :cond_1
    return-void
.end method

.method public final c()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final dismiss()V
    .locals 1

    invoke-virtual {p0}, Ltp;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ltp;->i:LJi;

    invoke-virtual {v0}, Lah;->dismiss()V

    :cond_0
    return-void
.end method

.method public final e()V
    .locals 8

    invoke-virtual {p0}, Ltp;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-boolean v0, p0, Ltp;->q:Z

    if-nez v0, :cond_7

    iget-object v0, p0, Ltp;->m:Landroid/view/View;

    if-eqz v0, :cond_7

    iput-object v0, p0, Ltp;->n:Landroid/view/View;

    iget-object v0, p0, Ltp;->i:LJi;

    iget-object v1, v0, Lah;->z:Lc2;

    invoke-virtual {v1, p0}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    iput-object p0, v0, Lah;->p:Landroid/widget/AdapterView$OnItemClickListener;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lah;->y:Z

    iget-object v2, v0, Lah;->z:Lc2;

    invoke-virtual {v2, v1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    iget-object v2, p0, Ltp;->n:Landroid/view/View;

    iget-object v3, p0, Ltp;->p:Landroid/view/ViewTreeObserver;

    const/4 v4, 0x0

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_0

    :cond_1
    move v3, v4

    :goto_0
    invoke-virtual {v2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v5

    iput-object v5, p0, Ltp;->p:Landroid/view/ViewTreeObserver;

    if-eqz v3, :cond_2

    iget-object v3, p0, Ltp;->j:Lk2;

    invoke-virtual {v5, v3}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_2
    iget-object v3, p0, Ltp;->k:Lx5;

    invoke-virtual {v2, v3}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    iput-object v2, v0, Lah;->o:Landroid/view/View;

    iget v2, p0, Ltp;->t:I

    iput v2, v0, Lah;->l:I

    iget-boolean v2, p0, Ltp;->r:Z

    iget-object v3, p0, Ltp;->b:Landroid/content/Context;

    iget-object v5, p0, Ltp;->d:Lqi;

    if-nez v2, :cond_3

    iget v2, p0, Ltp;->f:I

    invoke-static {v5, v3, v2}, LDi;->m(Landroid/widget/ListAdapter;Landroid/content/Context;I)I

    move-result v2

    iput v2, p0, Ltp;->s:I

    iput-boolean v1, p0, Ltp;->r:Z

    :cond_3
    iget v1, p0, Ltp;->s:I

    invoke-virtual {v0, v1}, Lah;->p(I)V

    const/4 v1, 0x2

    iget-object v2, v0, Lah;->z:Lc2;

    invoke-virtual {v2, v1}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    iget-object v1, p0, LDi;->a:Landroid/graphics/Rect;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    new-instance v6, Landroid/graphics/Rect;

    invoke-direct {v6, v1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    goto :goto_1

    :cond_4
    move-object v6, v2

    :goto_1
    iput-object v6, v0, Lah;->x:Landroid/graphics/Rect;

    invoke-virtual {v0}, Lah;->e()V

    iget-object v1, v0, Lah;->c:Lca;

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    iget-boolean v6, p0, Ltp;->u:Z

    if-eqz v6, :cond_6

    iget-object v6, p0, Ltp;->c:Lti;

    iget-object v7, v6, Lti;->m:Ljava/lang/CharSequence;

    if-eqz v7, :cond_6

    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    const v7, 0x7f0e0012

    invoke-virtual {v3, v7, v1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/FrameLayout;

    const v7, 0x1020016

    invoke-virtual {v3, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    if-eqz v7, :cond_5

    iget-object v6, v6, Lti;->m:Ljava/lang/CharSequence;

    invoke-virtual {v7, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_5
    invoke-virtual {v3, v4}, Landroid/view/View;->setEnabled(Z)V

    invoke-virtual {v1, v3, v2, v4}, Landroid/widget/ListView;->addHeaderView(Landroid/view/View;Ljava/lang/Object;Z)V

    :cond_6
    invoke-virtual {v0, v5}, Lah;->m(Landroid/widget/ListAdapter;)V

    invoke-virtual {v0}, Lah;->e()V

    :goto_2
    return-void

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "StandardMenuPopup cannot be used without an anchor"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final f(LKi;)V
    .locals 0

    iput-object p1, p0, Ltp;->o:LKi;

    return-void
.end method

.method public final h()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Ltp;->r:Z

    iget-object v0, p0, Ltp;->d:Lqi;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lqi;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method public final i()Lca;
    .locals 1

    iget-object v0, p0, Ltp;->i:LJi;

    iget-object v0, v0, Lah;->c:Lca;

    return-object v0
.end method

.method public final k(LNp;)Z
    .locals 9

    invoke-virtual {p1}, Lti;->hasVisibleItems()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    new-instance v0, LFi;

    iget-object v7, p0, Ltp;->n:Landroid/view/View;

    iget-object v6, p0, Ltp;->b:Landroid/content/Context;

    iget-boolean v8, p0, Ltp;->e:Z

    iget v3, p0, Ltp;->g:I

    iget v4, p0, Ltp;->h:I

    move-object v2, v0

    move-object v5, p1

    invoke-direct/range {v2 .. v8}, LFi;-><init>(IILti;Landroid/content/Context;Landroid/view/View;Z)V

    iget-object v2, p0, Ltp;->o:LKi;

    iput-object v2, v0, LFi;->i:LKi;

    iget-object v3, v0, LFi;->j:LDi;

    if-eqz v3, :cond_0

    invoke-interface {v3, v2}, LLi;->f(LKi;)V

    :cond_0
    invoke-static {p1}, LDi;->u(Lti;)Z

    move-result v2

    iput-boolean v2, v0, LFi;->h:Z

    iget-object v3, v0, LFi;->j:LDi;

    if-eqz v3, :cond_1

    invoke-virtual {v3, v2}, LDi;->o(Z)V

    :cond_1
    iget-object v2, p0, Ltp;->l:Landroid/widget/PopupWindow$OnDismissListener;

    iput-object v2, v0, LFi;->k:Landroid/widget/PopupWindow$OnDismissListener;

    const/4 v2, 0x0

    iput-object v2, p0, Ltp;->l:Landroid/widget/PopupWindow$OnDismissListener;

    iget-object v2, p0, Ltp;->c:Lti;

    invoke-virtual {v2, v1}, Lti;->c(Z)V

    iget-object v2, p0, Ltp;->i:LJi;

    iget v3, v2, Lah;->f:I

    invoke-virtual {v2}, Lah;->f()I

    move-result v2

    iget v4, p0, Ltp;->t:I

    iget-object v5, p0, Ltp;->m:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getLayoutDirection()I

    move-result v5

    invoke-static {v4, v5}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result v4

    and-int/lit8 v4, v4, 0x7

    const/4 v5, 0x5

    if-ne v4, v5, :cond_2

    iget-object v4, p0, Ltp;->m:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v4

    add-int/2addr v3, v4

    :cond_2
    invoke-virtual {v0}, LFi;->b()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_3

    goto :goto_0

    :cond_3
    iget-object v4, v0, LFi;->f:Landroid/view/View;

    if-nez v4, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {v0, v3, v2, v5, v5}, LFi;->d(IIZZ)V

    :goto_0
    iget-object v0, p0, Ltp;->o:LKi;

    if-eqz v0, :cond_5

    invoke-interface {v0, p1}, LKi;->u(Lti;)Z

    :cond_5
    return v5

    :cond_6
    :goto_1
    return v1
.end method

.method public final l(Lti;)V
    .locals 0

    return-void
.end method

.method public final n(Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Ltp;->m:Landroid/view/View;

    return-void
.end method

.method public final o(Z)V
    .locals 1

    iget-object v0, p0, Ltp;->d:Lqi;

    iput-boolean p1, v0, Lqi;->c:Z

    return-void
.end method

.method public final onDismiss()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Ltp;->q:Z

    iget-object v1, p0, Ltp;->c:Lti;

    invoke-virtual {v1, v0}, Lti;->c(Z)V

    iget-object v0, p0, Ltp;->p:Landroid/view/ViewTreeObserver;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ltp;->n:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iput-object v0, p0, Ltp;->p:Landroid/view/ViewTreeObserver;

    :cond_0
    iget-object v0, p0, Ltp;->p:Landroid/view/ViewTreeObserver;

    iget-object v1, p0, Ltp;->j:Lk2;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    const/4 v0, 0x0

    iput-object v0, p0, Ltp;->p:Landroid/view/ViewTreeObserver;

    :cond_1
    iget-object v0, p0, Ltp;->n:Landroid/view/View;

    iget-object v1, p0, Ltp;->k:Lx5;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    iget-object v0, p0, Ltp;->l:Landroid/widget/PopupWindow$OnDismissListener;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Landroid/widget/PopupWindow$OnDismissListener;->onDismiss()V

    :cond_2
    return-void
.end method

.method public final onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 0

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    const/4 p3, 0x1

    if-ne p1, p3, :cond_0

    const/16 p1, 0x52

    if-ne p2, p1, :cond_0

    invoke-virtual {p0}, Ltp;->dismiss()V

    return p3

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final p(I)V
    .locals 0

    iput p1, p0, Ltp;->t:I

    return-void
.end method

.method public final q(I)V
    .locals 1

    iget-object v0, p0, Ltp;->i:LJi;

    iput p1, v0, Lah;->f:I

    return-void
.end method

.method public final r(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 0

    iput-object p1, p0, Ltp;->l:Landroid/widget/PopupWindow$OnDismissListener;

    return-void
.end method

.method public final s(Z)V
    .locals 0

    iput-boolean p1, p0, Ltp;->u:Z

    return-void
.end method

.method public final t(I)V
    .locals 1

    iget-object v0, p0, Ltp;->i:LJi;

    invoke-virtual {v0, p1}, Lah;->l(I)V

    return-void
.end method
