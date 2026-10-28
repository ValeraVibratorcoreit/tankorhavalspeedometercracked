.class public LFi;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lti;

.field public final c:Z

.field public final d:I

.field public final e:I

.field public f:Landroid/view/View;

.field public g:I

.field public h:Z

.field public i:LKi;

.field public j:LDi;

.field public k:Landroid/widget/PopupWindow$OnDismissListener;

.field public final l:LEi;


# direct methods
.method public constructor <init>(IILti;Landroid/content/Context;Landroid/view/View;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x800003

    iput v0, p0, LFi;->g:I

    new-instance v0, LEi;

    invoke-direct {v0, p0}, LEi;-><init>(LFi;)V

    iput-object v0, p0, LFi;->l:LEi;

    iput-object p4, p0, LFi;->a:Landroid/content/Context;

    iput-object p3, p0, LFi;->b:Lti;

    iput-object p5, p0, LFi;->f:Landroid/view/View;

    iput-boolean p6, p0, LFi;->c:Z

    iput p1, p0, LFi;->d:I

    iput p2, p0, LFi;->e:I

    return-void
.end method


# virtual methods
.method public final a()LDi;
    .locals 15

    iget-object v0, p0, LFi;->j:LDi;

    if-nez v0, :cond_1

    const-string v0, "window"

    iget-object v1, p0, LFi;->a:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    new-instance v2, Landroid/graphics/Point;

    invoke-direct {v2}, Landroid/graphics/Point;-><init>()V

    invoke-virtual {v0, v2}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    iget v0, v2, Landroid/graphics/Point;->x:I

    iget v2, v2, Landroid/graphics/Point;->y:I

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070016

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    if-lt v0, v1, :cond_0

    new-instance v0, LA5;

    iget-object v4, p0, LFi;->f:Landroid/view/View;

    iget v6, p0, LFi;->e:I

    iget-boolean v7, p0, LFi;->c:Z

    iget-object v3, p0, LFi;->a:Landroid/content/Context;

    iget v5, p0, LFi;->d:I

    move-object v2, v0

    invoke-direct/range {v2 .. v7}, LA5;-><init>(Landroid/content/Context;Landroid/view/View;IIZ)V

    goto :goto_0

    :cond_0
    new-instance v0, Ltp;

    iget-object v13, p0, LFi;->f:Landroid/view/View;

    iget v10, p0, LFi;->e:I

    iget-boolean v14, p0, LFi;->c:Z

    iget-object v12, p0, LFi;->a:Landroid/content/Context;

    iget-object v11, p0, LFi;->b:Lti;

    iget v9, p0, LFi;->d:I

    move-object v8, v0

    invoke-direct/range {v8 .. v14}, Ltp;-><init>(IILti;Landroid/content/Context;Landroid/view/View;Z)V

    :goto_0
    iget-object v1, p0, LFi;->b:Lti;

    invoke-virtual {v0, v1}, LDi;->l(Lti;)V

    iget-object v1, p0, LFi;->l:LEi;

    invoke-virtual {v0, v1}, LDi;->r(Landroid/widget/PopupWindow$OnDismissListener;)V

    iget-object v1, p0, LFi;->f:Landroid/view/View;

    invoke-virtual {v0, v1}, LDi;->n(Landroid/view/View;)V

    iget-object v1, p0, LFi;->i:LKi;

    invoke-interface {v0, v1}, LLi;->f(LKi;)V

    iget-boolean v1, p0, LFi;->h:Z

    invoke-virtual {v0, v1}, LDi;->o(Z)V

    iget v1, p0, LFi;->g:I

    invoke-virtual {v0, v1}, LDi;->p(I)V

    iput-object v0, p0, LFi;->j:LDi;

    :cond_1
    iget-object v0, p0, LFi;->j:LDi;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-object v0, p0, LFi;->j:LDi;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LCo;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, LFi;->j:LDi;

    iget-object v0, p0, LFi;->k:Landroid/widget/PopupWindow$OnDismissListener;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/widget/PopupWindow$OnDismissListener;->onDismiss()V

    :cond_0
    return-void
.end method

.method public final d(IIZZ)V
    .locals 3

    invoke-virtual {p0}, LFi;->a()LDi;

    move-result-object v0

    invoke-virtual {v0, p4}, LDi;->s(Z)V

    if-eqz p3, :cond_1

    iget p3, p0, LFi;->g:I

    iget-object p4, p0, LFi;->f:Landroid/view/View;

    invoke-virtual {p4}, Landroid/view/View;->getLayoutDirection()I

    move-result p4

    invoke-static {p3, p4}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result p3

    and-int/lit8 p3, p3, 0x7

    const/4 p4, 0x5

    if-ne p3, p4, :cond_0

    iget-object p3, p0, LFi;->f:Landroid/view/View;

    invoke-virtual {p3}, Landroid/view/View;->getWidth()I

    move-result p3

    sub-int/2addr p1, p3

    :cond_0
    invoke-virtual {v0, p1}, LDi;->q(I)V

    invoke-virtual {v0, p2}, LDi;->t(I)V

    iget-object p3, p0, LFi;->a:Landroid/content/Context;

    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p3

    iget p3, p3, Landroid/util/DisplayMetrics;->density:F

    const/high16 p4, 0x42400000    # 48.0f

    mul-float/2addr p3, p4

    const/high16 p4, 0x40000000    # 2.0f

    div-float/2addr p3, p4

    float-to-int p3, p3

    new-instance p4, Landroid/graphics/Rect;

    sub-int v1, p1, p3

    sub-int v2, p2, p3

    add-int/2addr p1, p3

    add-int/2addr p2, p3

    invoke-direct {p4, v1, v2, p1, p2}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object p4, v0, LDi;->a:Landroid/graphics/Rect;

    :cond_1
    invoke-interface {v0}, LCo;->e()V

    return-void
.end method
