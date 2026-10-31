.class public abstract Lxl;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# instance fields
.field public final s:Lt5;

.field public t:I

.field public final u:Lgi;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    const v0, 0x7f040319

    invoke-direct {p0, p1, p2, v0}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0e00c0

    invoke-virtual {v1, v2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    new-instance v1, Lgi;

    invoke-direct {v1}, Lgi;-><init>()V

    iput-object v1, p0, Lxl;->u:Lgi;

    new-instance v2, Ltm;

    const/high16 v3, 0x3f000000    # 0.5f

    invoke-direct {v2, v3}, Ltm;-><init>(F)V

    iget-object v3, v1, Lgi;->a:Lfi;

    iget-object v3, v3, Lfi;->a:Lpo;

    invoke-virtual {v3}, Lpo;->e()Loo;

    move-result-object v3

    iput-object v2, v3, Loo;->e:LR7;

    iput-object v2, v3, Loo;->f:LR7;

    iput-object v2, v3, Loo;->g:LR7;

    iput-object v2, v3, Loo;->h:LR7;

    invoke-virtual {v3}, Loo;->a()Lpo;

    move-result-object v2

    invoke-virtual {v1, v2}, Lgi;->setShapeAppearanceModel(Lpo;)V

    iget-object v1, p0, Lxl;->u:Lgi;

    const/4 v2, -0x1

    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v1, v2}, Lgi;->l(Landroid/content/res/ColorStateList;)V

    iget-object v1, p0, Lxl;->u:Lgi;

    sget-object v2, LGs;->a:Ljava/util/WeakHashMap;

    invoke-virtual {p0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    sget-object v1, Lul;->v:[I

    const/4 v2, 0x0

    invoke-virtual {p1, p2, v1, v0, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1, v2, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    iput p2, p0, Lxl;->t:I

    new-instance p2, Lt5;

    const/16 v0, 0x11

    invoke-direct {p2, p0, v0}, Lt5;-><init>(Ljava/lang/Object;I)V

    iput-object p2, p0, Lxl;->s:Lt5;

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method


# virtual methods
.method public final addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p2

    const/4 p3, -0x1

    if-ne p2, p3, :cond_0

    sget-object p2, LGs;->a:Ljava/util/WeakHashMap;

    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setId(I)V

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p2, p0, Lxl;->s:Lt5;

    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void
.end method

.method public abstract l()V
.end method

.method public final onFinishInflate()V
    .locals 0

    invoke-super {p0}, Landroid/view/View;->onFinishInflate()V

    invoke-virtual {p0}, Lxl;->l()V

    return-void
.end method

.method public final onViewRemoved(Landroid/view/View;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->onViewRemoved(Landroid/view/View;)V

    invoke-virtual {p0}, Landroid/view/View;->getHandler()Landroid/os/Handler;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lxl;->s:Lt5;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final setBackgroundColor(I)V
    .locals 1

    iget-object v0, p0, Lxl;->u:Lgi;

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {v0, p1}, Lgi;->l(Landroid/content/res/ColorStateList;)V

    return-void
.end method
