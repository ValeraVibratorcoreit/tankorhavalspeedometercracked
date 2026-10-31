.class public abstract LWl;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LK2;

.field public b:Landroidx/recyclerview/widget/RecyclerView;

.field public final c:Lnp;

.field public final d:Lnp;

.field public e:LPg;

.field public f:Z

.field public g:Z

.field public final h:Z

.field public final i:Z

.field public j:I

.field public k:Z

.field public l:I

.field public m:I

.field public n:I

.field public o:I


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LUl;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LUl;-><init>(LWl;I)V

    new-instance v1, LUl;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, LUl;-><init>(LWl;I)V

    new-instance v2, Lnp;

    invoke-direct {v2, v0}, Lnp;-><init>(LUl;)V

    iput-object v2, p0, LWl;->c:Lnp;

    new-instance v0, Lnp;

    invoke-direct {v0, v1}, Lnp;-><init>(LUl;)V

    iput-object v0, p0, LWl;->d:Lnp;

    const/4 v0, 0x0

    iput-boolean v0, p0, LWl;->f:Z

    iput-boolean v0, p0, LWl;->g:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, LWl;->h:Z

    iput-boolean v0, p0, LWl;->i:Z

    return-void
.end method

.method public static A(Landroid/view/View;)I
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, LXl;

    iget-object v0, v0, LXl;->b:Landroid/graphics/Rect;

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p0

    iget v1, v0, Landroid/graphics/Rect;->left:I

    add-int/2addr p0, v1

    iget v0, v0, Landroid/graphics/Rect;->right:I

    add-int/2addr p0, v0

    return p0
.end method

.method public static H(Landroid/view/View;)I
    .locals 0

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p0

    check-cast p0, LXl;

    iget-object p0, p0, LXl;->a:Llm;

    invoke-virtual {p0}, Llm;->b()I

    move-result p0

    return p0
.end method

.method public static I(Landroid/content/Context;Landroid/util/AttributeSet;II)LVl;
    .locals 2

    new-instance v0, LVl;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sget-object v1, Lsl;->a:[I

    invoke-virtual {p0, p1, v1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p0

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p3

    iput p3, v0, LVl;->a:I

    const/16 p3, 0xa

    invoke-virtual {p0, p3, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, v0, LVl;->b:I

    const/16 p2, 0x9

    invoke-virtual {p0, p2, p1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, v0, LVl;->c:Z

    const/16 p2, 0xb

    invoke-virtual {p0, p2, p1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, v0, LVl;->d:Z

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    return-object v0
.end method

.method public static M(III)Z
    .locals 3

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    const/4 v1, 0x0

    if-lez p2, :cond_0

    if-eq p0, p2, :cond_0

    return v1

    :cond_0
    const/high16 p2, -0x80000000

    const/4 v2, 0x1

    if-eq v0, p2, :cond_4

    if-eqz v0, :cond_3

    const/high16 p2, 0x40000000    # 2.0f

    if-eq v0, p2, :cond_1

    return v1

    :cond_1
    if-ne p1, p0, :cond_2

    move v1, v2

    :cond_2
    return v1

    :cond_3
    return v2

    :cond_4
    if-lt p1, p0, :cond_5

    move v1, v2

    :cond_5
    return v1
.end method

.method public static N(Landroid/view/View;IIII)V
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, LXl;

    iget-object v1, v0, LXl;->b:Landroid/graphics/Rect;

    iget v2, v1, Landroid/graphics/Rect;->left:I

    add-int/2addr p1, v2

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr p1, v2

    iget v2, v1, Landroid/graphics/Rect;->top:I

    add-int/2addr p2, v2

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr p2, v2

    iget v2, v1, Landroid/graphics/Rect;->right:I

    sub-int/2addr p3, v2

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    sub-int/2addr p3, v2

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p4, v1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int/2addr p4, v0

    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method public static g(III)I
    .locals 2

    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p0

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_1

    const/high16 v1, 0x40000000    # 2.0f

    if-eq v0, v1, :cond_0

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p0

    :cond_0
    return p0

    :cond_1
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    move-result p0

    return p0
.end method

.method public static w(ZIIII)I
    .locals 4

    sub-int/2addr p1, p3

    const/4 p3, 0x0

    invoke-static {p3, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    const/4 v0, -0x2

    const/4 v1, -0x1

    const/high16 v2, -0x80000000

    const/high16 v3, 0x40000000    # 2.0f

    if-eqz p0, :cond_2

    if-ltz p4, :cond_0

    :goto_0
    move p2, v3

    goto :goto_2

    :cond_0
    if-ne p4, v1, :cond_1

    if-eq p2, v2, :cond_4

    if-eqz p2, :cond_1

    if-eq p2, v3, :cond_4

    :cond_1
    move p2, p3

    move p4, p2

    goto :goto_2

    :cond_2
    if-ltz p4, :cond_3

    goto :goto_0

    :cond_3
    if-ne p4, v1, :cond_5

    :cond_4
    move p4, p1

    goto :goto_2

    :cond_5
    if-ne p4, v0, :cond_1

    if-eq p2, v2, :cond_7

    if-ne p2, v3, :cond_6

    goto :goto_1

    :cond_6
    move p4, p1

    move p2, p3

    goto :goto_2

    :cond_7
    :goto_1
    move p4, p1

    move p2, v2

    :goto_2
    invoke-static {p4, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p0

    return p0
.end method

.method public static z(Landroid/view/View;)I
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, LXl;

    iget-object v0, v0, LXl;->b:Landroid/graphics/Rect;

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p0

    iget v1, v0, Landroid/graphics/Rect;->top:I

    add-int/2addr p0, v1

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr p0, v0

    return p0
.end method


# virtual methods
.method public A0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final B()I
    .locals 1

    iget-object v0, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()LOl;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, LOl;->a()I

    move-result v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public final C()I
    .locals 2

    iget-object v0, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    sget-object v1, LGs;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    move-result v0

    return v0
.end method

.method public final D()I
    .locals 1

    iget-object v0, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final E()I
    .locals 1

    iget-object v0, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final F()I
    .locals 1

    iget-object v0, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final G()I
    .locals 1

    iget-object v0, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public J(Lcm;Lim;)I
    .locals 0

    iget-object p1, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    const/4 p2, 0x1

    if-eqz p1, :cond_1

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->k:LOl;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LWl;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->k:LOl;

    invoke-virtual {p1}, LOl;->a()I

    move-result p2

    :cond_1
    :goto_0
    return p2
.end method

.method public final K(Landroid/graphics/Rect;Landroid/view/View;)V
    .locals 6

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, LXl;

    iget-object v0, v0, LXl;->b:Landroid/graphics/Rect;

    iget v1, v0, Landroid/graphics/Rect;->left:I

    neg-int v1, v1

    iget v2, v0, Landroid/graphics/Rect;->top:I

    neg-int v2, v2

    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    move-result v3

    iget v4, v0, Landroid/graphics/Rect;->right:I

    add-int/2addr v3, v4

    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result v4

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v4, v0

    invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v0, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Matrix;->isIdentity()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->j:Landroid/graphics/RectF;

    invoke-virtual {v1, p1}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    iget v0, v1, Landroid/graphics/RectF;->left:F

    float-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-int v0, v2

    iget v2, v1, Landroid/graphics/RectF;->top:F

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-int v2, v2

    iget v3, v1, Landroid/graphics/RectF;->right:F

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-int v3, v3

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    float-to-double v4, v1

    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v4

    double-to-int v1, v4

    invoke-virtual {p1, v0, v2, v3, v1}, Landroid/graphics/Rect;->set(IIII)V

    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result v0

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result p2

    invoke-virtual {p1, v0, p2}, Landroid/graphics/Rect;->offset(II)V

    return-void
.end method

.method public abstract L()Z
.end method

.method public O(I)V
    .locals 4

    iget-object v0, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->e:LK2;

    invoke-virtual {v1}, LK2;->o()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->e:LK2;

    invoke-virtual {v3, v2}, LK2;->n(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, p1}, Landroid/view/View;->offsetLeftAndRight(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public P(I)V
    .locals 4

    iget-object v0, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->e:LK2;

    invoke-virtual {v1}, LK2;->o()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->e:LK2;

    invoke-virtual {v3, v2}, LK2;->n(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, p1}, Landroid/view/View;->offsetTopAndBottom(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public Q(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    return-void
.end method

.method public abstract R(Landroidx/recyclerview/widget/RecyclerView;)V
.end method

.method public abstract S(Landroid/view/View;ILcm;Lim;)Landroid/view/View;
.end method

.method public T(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 3

    iget-object v0, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->b:Lcm;

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->c0:Lim;

    if-eqz v0, :cond_3

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v2, -0x1

    invoke-virtual {v0, v2}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v2}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :cond_2
    :goto_0
    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityRecord;->setScrollable(Z)V

    iget-object v0, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->k:LOl;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LOl;->a()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setItemCount(I)V

    :cond_3
    :goto_1
    return-void
.end method

.method public U(Lcm;Lim;Landroid/view/View;LJ;)V
    .locals 1

    invoke-virtual {p0}, LWl;->e()Z

    move-result p1

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    invoke-static {p3}, LWl;->H(Landroid/view/View;)I

    move-result p1

    goto :goto_0

    :cond_0
    move p1, p2

    :goto_0
    invoke-virtual {p0}, LWl;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p3}, LWl;->H(Landroid/view/View;)I

    move-result p3

    goto :goto_1

    :cond_1
    move p3, p2

    :goto_1
    const/4 v0, 0x1

    invoke-static {p2, p1, v0, p3, v0}, LI;->a(ZIIII)LI;

    move-result-object p1

    invoke-virtual {p4, p1}, LJ;->h(LI;)V

    return-void
.end method

.method public final V(Landroid/view/View;LJ;)V
    .locals 2

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Llm;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Llm;->i()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, LWl;->a:LK2;

    iget-object v1, v1, LK2;->d:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    iget-object v0, v0, Llm;->a:Landroid/view/View;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->b:Lcm;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->c0:Lim;

    invoke-virtual {p0, v1, v0, p1, p2}, LWl;->U(Lcm;Lim;Landroid/view/View;LJ;)V

    :cond_0
    return-void
.end method

.method public W(II)V
    .locals 0

    return-void
.end method

.method public X()V
    .locals 0

    return-void
.end method

.method public Y(II)V
    .locals 0

    return-void
.end method

.method public Z(II)V
    .locals 0

    return-void
.end method

.method public a0(II)V
    .locals 0

    return-void
.end method

.method public final b(Landroid/view/View;IZ)V
    .locals 8

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Llm;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez p3, :cond_1

    invoke-virtual {v0}, Llm;->i()Z

    move-result p3

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    iget-object p3, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p3, p3, Landroidx/recyclerview/widget/RecyclerView;->f:Lnp;

    invoke-virtual {p3, v0}, Lnp;->n(Llm;)V

    goto :goto_1

    :cond_1
    :goto_0
    iget-object p3, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p3, p3, Landroidx/recyclerview/widget/RecyclerView;->f:Lnp;

    iget-object p3, p3, Lnp;->b:Ljava/lang/Object;

    check-cast p3, LFo;

    invoke-virtual {p3, v0, v1}, LFo;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LNs;

    if-nez v3, :cond_2

    invoke-static {}, LNs;->a()LNs;

    move-result-object v3

    invoke-virtual {p3, v0, v3}, LFo;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget p3, v3, LNs;->a:I

    or-int/2addr p3, v2

    iput p3, v3, LNs;->a:I

    :goto_1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    check-cast p3, LXl;

    invoke-virtual {v0}, Llm;->q()Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_d

    invoke-virtual {v0}, Llm;->j()Z

    move-result v3

    if-eqz v3, :cond_3

    goto/16 :goto_5

    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    iget-object v5, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v6, -0x1

    if-ne v3, v5, :cond_b

    iget-object v3, p0, LWl;->a:LK2;

    iget-object v5, v3, LK2;->b:Ljava/lang/Object;

    check-cast v5, LNl;

    iget-object v5, v5, LNl;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v5, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v5

    if-ne v5, v6, :cond_4

    :goto_2
    move v5, v6

    goto :goto_3

    :cond_4
    iget-object v3, v3, LK2;->c:Ljava/lang/Object;

    check-cast v3, LO5;

    invoke-virtual {v3, v5}, LO5;->d(I)Z

    move-result v7

    if-eqz v7, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v3, v5}, LO5;->b(I)I

    move-result v3

    sub-int/2addr v5, v3

    :goto_3
    if-ne p2, v6, :cond_6

    iget-object p2, p0, LWl;->a:LK2;

    invoke-virtual {p2}, LK2;->o()I

    move-result p2

    :cond_6
    if-eq v5, v6, :cond_a

    if-eq v5, p2, :cond_f

    iget-object p1, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->l:LWl;

    invoke-virtual {p1, v5}, LWl;->u(I)Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-virtual {p1, v5}, LWl;->u(I)Landroid/view/View;

    iget-object v6, p1, LWl;->a:LK2;

    invoke-virtual {v6, v5}, LK2;->i(I)V

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, LXl;

    invoke-static {v3}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Llm;

    move-result-object v6

    invoke-virtual {v6}, Llm;->i()Z

    move-result v7

    if-eqz v7, :cond_8

    iget-object v7, p1, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v7, v7, Landroidx/recyclerview/widget/RecyclerView;->f:Lnp;

    iget-object v7, v7, Lnp;->b:Ljava/lang/Object;

    check-cast v7, LFo;

    invoke-virtual {v7, v6, v1}, LFo;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LNs;

    if-nez v1, :cond_7

    invoke-static {}, LNs;->a()LNs;

    move-result-object v1

    invoke-virtual {v7, v6, v1}, LFo;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    iget v7, v1, LNs;->a:I

    or-int/2addr v2, v7

    iput v2, v1, LNs;->a:I

    goto :goto_4

    :cond_8
    iget-object v1, p1, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->f:Lnp;

    invoke-virtual {v1, v6}, Lnp;->n(Llm;)V

    :goto_4
    iget-object p1, p1, LWl;->a:LK2;

    invoke-virtual {v6}, Llm;->i()Z

    move-result v1

    invoke-virtual {p1, v3, p2, v5, v1}, LK2;->e(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V

    goto/16 :goto_7

    :cond_9
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Cannot move a child from non-existing index:"

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object p1, p1, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_a
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Added View has RecyclerView as parent but view is not a real child. Unfiltered index:"

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object p1, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_b
    iget-object v1, p0, LWl;->a:LK2;

    invoke-virtual {v1, p1, p2, v4}, LK2;->d(Landroid/view/View;IZ)V

    iput-boolean v2, p3, LXl;->c:Z

    iget-object p2, p0, LWl;->e:LPg;

    if-eqz p2, :cond_f

    iget-boolean v1, p2, LPg;->e:Z

    if-eqz v1, :cond_f

    iget-object v1, p2, LPg;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Llm;

    move-result-object v1

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Llm;->b()I

    move-result v6

    :cond_c
    iget v1, p2, LPg;->a:I

    if-ne v6, v1, :cond_f

    iput-object p1, p2, LPg;->f:Landroid/view/View;

    goto :goto_7

    :cond_d
    :goto_5
    invoke-virtual {v0}, Llm;->j()Z

    move-result v1

    if-eqz v1, :cond_e

    iget-object v1, v0, Llm;->n:Lcm;

    invoke-virtual {v1, v0}, Lcm;->j(Llm;)V

    goto :goto_6

    :cond_e
    iget v1, v0, Llm;->j:I

    and-int/lit8 v1, v1, -0x21

    iput v1, v0, Llm;->j:I

    :goto_6
    iget-object v1, p0, LWl;->a:LK2;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    invoke-virtual {v1, p1, p2, v2, v4}, LK2;->e(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V

    :cond_f
    :goto_7
    iget-boolean p1, p3, LXl;->d:Z

    if-eqz p1, :cond_10

    iget-object p1, v0, Llm;->a:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    iput-boolean v4, p3, LXl;->d:Z

    :cond_10
    return-void
.end method

.method public abstract b0(Lcm;Lim;)V
.end method

.method public c(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->i(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public abstract c0(Lim;)V
.end method

.method public abstract d()Z
.end method

.method public d0(Landroid/os/Parcelable;)V
    .locals 0

    return-void
.end method

.method public abstract e()Z
.end method

.method public e0()Landroid/os/Parcelable;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public f(LXl;)Z
    .locals 0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public f0(I)V
    .locals 0

    return-void
.end method

.method public g0()V
    .locals 0

    invoke-virtual {p0}, LWl;->m0()V

    return-void
.end method

.method public h(IILim;LBd;)V
    .locals 0

    return-void
.end method

.method public final h0(Lcm;)V
    .locals 2

    invoke-virtual {p0}, LWl;->v()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    invoke-virtual {p0, v0}, LWl;->u(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Llm;

    move-result-object v1

    invoke-virtual {v1}, Llm;->p()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0, v0}, LWl;->u(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, v0}, LWl;->k0(I)V

    invoke-virtual {p1, v1}, Lcm;->f(Landroid/view/View;)V

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public i(ILBd;)V
    .locals 0

    return-void
.end method

.method public final i0(Lcm;)V
    .locals 6

    iget-object v0, p1, Lcm;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v1, v0, -0x1

    :goto_0
    iget-object v2, p1, Lcm;->a:Ljava/util/ArrayList;

    if-ltz v1, :cond_3

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llm;

    iget-object v2, v2, Llm;->a:Landroid/view/View;

    invoke-static {v2}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Llm;

    move-result-object v3

    invoke-virtual {v3}, Llm;->p()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Llm;->o(Z)V

    invoke-virtual {v3}, Llm;->k()Z

    move-result v5

    if-eqz v5, :cond_1

    iget-object v5, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v5, v2, v4}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    :cond_1
    iget-object v5, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v5, v5, Landroidx/recyclerview/widget/RecyclerView;->H:LSl;

    if-eqz v5, :cond_2

    invoke-virtual {v5, v3}, LSl;->e(Llm;)V

    :cond_2
    const/4 v5, 0x1

    invoke-virtual {v3, v5}, Llm;->o(Z)V

    invoke-static {v2}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Llm;

    move-result-object v2

    const/4 v3, 0x0

    iput-object v3, v2, Llm;->n:Lcm;

    iput-boolean v4, v2, Llm;->o:Z

    iget v3, v2, Llm;->j:I

    and-int/lit8 v3, v3, -0x21

    iput v3, v2, Llm;->j:I

    invoke-virtual {p1, v2}, Lcm;->g(Llm;)V

    :goto_1
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    iget-object p1, p1, Lcm;->b:Ljava/util/ArrayList;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    :cond_4
    if-lez v0, :cond_5

    iget-object p1, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_5
    return-void
.end method

.method public abstract j(Lim;)I
.end method

.method public final j0(Landroid/view/View;Lcm;)V
    .locals 4

    iget-object v0, p0, LWl;->a:LK2;

    iget-object v1, v0, LK2;->b:Ljava/lang/Object;

    check-cast v1, LNl;

    iget-object v2, v1, LNl;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v2

    if-gez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, v0, LK2;->c:Ljava/lang/Object;

    check-cast v3, LO5;

    invoke-virtual {v3, v2}, LO5;->g(I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v0, p1}, LK2;->O(Landroid/view/View;)V

    :cond_1
    invoke-virtual {v1, v2}, LNl;->h(I)V

    :goto_0
    invoke-virtual {p2, p1}, Lcm;->f(Landroid/view/View;)V

    return-void
.end method

.method public abstract k(Lim;)I
.end method

.method public final k0(I)V
    .locals 4

    invoke-virtual {p0, p1}, LWl;->u(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LWl;->a:LK2;

    invoke-virtual {v0, p1}, LK2;->x(I)I

    move-result p1

    iget-object v1, v0, LK2;->b:Ljava/lang/Object;

    check-cast v1, LNl;

    iget-object v2, v1, LNl;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, v0, LK2;->c:Ljava/lang/Object;

    check-cast v3, LO5;

    invoke-virtual {v3, p1}, LO5;->g(I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v0, v2}, LK2;->O(Landroid/view/View;)V

    :cond_1
    invoke-virtual {v1, p1}, LNl;->h(I)V

    :cond_2
    :goto_0
    return-void
.end method

.method public abstract l(Lim;)I
.end method

.method public l0(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/graphics/Rect;ZZ)Z
    .locals 8

    invoke-virtual {p0}, LWl;->E()I

    move-result v0

    invoke-virtual {p0}, LWl;->G()I

    move-result v1

    iget v2, p0, LWl;->n:I

    invoke-virtual {p0}, LWl;->F()I

    move-result v3

    sub-int/2addr v2, v3

    iget v3, p0, LWl;->o:I

    invoke-virtual {p0}, LWl;->D()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result v4

    iget v5, p3, Landroid/graphics/Rect;->left:I

    add-int/2addr v4, v5

    invoke-virtual {p2}, Landroid/view/View;->getScrollX()I

    move-result v5

    sub-int/2addr v4, v5

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result v5

    iget v6, p3, Landroid/graphics/Rect;->top:I

    add-int/2addr v5, v6

    invoke-virtual {p2}, Landroid/view/View;->getScrollY()I

    move-result p2

    sub-int/2addr v5, p2

    invoke-virtual {p3}, Landroid/graphics/Rect;->width()I

    move-result p2

    add-int/2addr p2, v4

    invoke-virtual {p3}, Landroid/graphics/Rect;->height()I

    move-result p3

    add-int/2addr p3, v5

    sub-int/2addr v4, v0

    const/4 v0, 0x0

    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    move-result v6

    sub-int/2addr v5, v1

    invoke-static {v0, v5}, Ljava/lang/Math;->min(II)I

    move-result v1

    sub-int/2addr p2, v2

    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    move-result v2

    sub-int/2addr p3, v3

    invoke-static {v0, p3}, Ljava/lang/Math;->max(II)I

    move-result p3

    invoke-virtual {p0}, LWl;->C()I

    move-result v3

    const/4 v7, 0x1

    if-ne v3, v7, :cond_1

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v6, p2}, Ljava/lang/Math;->max(II)I

    move-result v2

    goto :goto_1

    :cond_1
    if-eqz v6, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {v4, v2}, Ljava/lang/Math;->min(II)I

    move-result v6

    :goto_0
    move v2, v6

    :goto_1
    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    invoke-static {v5, p3}, Ljava/lang/Math;->min(II)I

    move-result v1

    :goto_2
    filled-new-array {v2, v1}, [I

    move-result-object p2

    aget p3, p2, v0

    aget p2, p2, v7

    if-eqz p5, :cond_5

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    move-result-object p5

    if-nez p5, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {p0}, LWl;->E()I

    move-result v1

    invoke-virtual {p0}, LWl;->G()I

    move-result v2

    iget v3, p0, LWl;->n:I

    invoke-virtual {p0}, LWl;->F()I

    move-result v4

    sub-int/2addr v3, v4

    iget v4, p0, LWl;->o:I

    invoke-virtual {p0}, LWl;->D()I

    move-result v5

    sub-int/2addr v4, v5

    iget-object v5, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v5, v5, Landroidx/recyclerview/widget/RecyclerView;->h:Landroid/graphics/Rect;

    invoke-virtual {p0, v5, p5}, LWl;->y(Landroid/graphics/Rect;Landroid/view/View;)V

    iget p5, v5, Landroid/graphics/Rect;->left:I

    sub-int/2addr p5, p3

    if-ge p5, v3, :cond_6

    iget p5, v5, Landroid/graphics/Rect;->right:I

    sub-int/2addr p5, p3

    if-le p5, v1, :cond_6

    iget p5, v5, Landroid/graphics/Rect;->top:I

    sub-int/2addr p5, p2

    if-ge p5, v4, :cond_6

    iget p5, v5, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p5, p2

    if-gt p5, v2, :cond_5

    goto :goto_3

    :cond_5
    if-nez p3, :cond_7

    if-eqz p2, :cond_6

    goto :goto_4

    :cond_6
    :goto_3
    return v0

    :cond_7
    :goto_4
    if-eqz p4, :cond_8

    invoke-virtual {p1, p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    goto :goto_5

    :cond_8
    invoke-virtual {p1, p3, p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->c0(IIZ)V

    :goto_5
    return v7
.end method

.method public abstract m(Lim;)I
.end method

.method public final m0()V
    .locals 1

    iget-object v0, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    :cond_0
    return-void
.end method

.method public abstract n(Lim;)I
.end method

.method public abstract n0(ILcm;Lim;)I
.end method

.method public abstract o(Lim;)I
.end method

.method public abstract o0(I)V
.end method

.method public final p(Lcm;)V
    .locals 4

    invoke-virtual {p0}, LWl;->v()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_2

    invoke-virtual {p0, v0}, LWl;->u(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Llm;

    move-result-object v2

    invoke-virtual {v2}, Llm;->p()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v2}, Llm;->g()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Llm;->i()Z

    move-result v3

    if-nez v3, :cond_1

    iget-object v3, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v3, v3, Landroidx/recyclerview/widget/RecyclerView;->k:LOl;

    iget-boolean v3, v3, LOl;->b:Z

    if-nez v3, :cond_1

    invoke-virtual {p0, v0}, LWl;->k0(I)V

    invoke-virtual {p1, v2}, Lcm;->g(Llm;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v0}, LWl;->u(I)Landroid/view/View;

    iget-object v3, p0, LWl;->a:LK2;

    invoke-virtual {v3, v0}, LK2;->i(I)V

    invoke-virtual {p1, v1}, Lcm;->h(Landroid/view/View;)V

    iget-object v1, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->f:Lnp;

    invoke-virtual {v1, v2}, Lnp;->n(Llm;)V

    :goto_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public abstract p0(ILcm;Lim;)I
.end method

.method public q(I)Landroid/view/View;
    .locals 5

    invoke-virtual {p0}, LWl;->v()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_3

    invoke-virtual {p0, v1}, LWl;->u(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Llm;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v3}, Llm;->b()I

    move-result v4

    if-ne v4, p1, :cond_2

    invoke-virtual {v3}, Llm;->p()Z

    move-result v4

    if-nez v4, :cond_2

    iget-object v4, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v4, v4, Landroidx/recyclerview/widget/RecyclerView;->c0:Lim;

    iget-boolean v4, v4, Lim;->g:Z

    if-nez v4, :cond_1

    invoke-virtual {v3}, Llm;->i()Z

    move-result v3

    if-nez v3, :cond_2

    :cond_1
    return-object v2

    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public final q0(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    invoke-static {p1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    invoke-virtual {p0, v0, p1}, LWl;->r0(II)V

    return-void
.end method

.method public abstract r()LXl;
.end method

.method public final r0(II)V
    .locals 1

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    iput v0, p0, LWl;->n:I

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p1

    iput p1, p0, LWl;->l:I

    if-nez p1, :cond_0

    sget-object p1, Landroidx/recyclerview/widget/RecyclerView;->s0:[I

    :cond_0
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    iput p1, p0, LWl;->o:I

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p1

    iput p1, p0, LWl;->m:I

    if-nez p1, :cond_1

    sget-object p1, Landroidx/recyclerview/widget/RecyclerView;->s0:[I

    :cond_1
    return-void
.end method

.method public s(Landroid/content/Context;Landroid/util/AttributeSet;)LXl;
    .locals 1

    new-instance v0, LXl;

    invoke-direct {v0, p1, p2}, LXl;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public s0(Landroid/graphics/Rect;II)V
    .locals 3

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v0

    invoke-virtual {p0}, LWl;->E()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p0}, LWl;->F()I

    move-result v0

    add-int/2addr v0, v1

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    invoke-virtual {p0}, LWl;->G()I

    move-result v1

    add-int/2addr v1, p1

    invoke-virtual {p0}, LWl;->D()I

    move-result p1

    add-int/2addr p1, v1

    iget-object v1, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    sget-object v2, LGs;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v1}, Landroid/view/View;->getMinimumWidth()I

    move-result v1

    invoke-static {p2, v0, v1}, LWl;->g(III)I

    move-result p2

    iget-object v0, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/view/View;->getMinimumHeight()I

    move-result v0

    invoke-static {p3, p1, v0}, LWl;->g(III)I

    move-result p1

    iget-object p3, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {p3, p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->e(Landroidx/recyclerview/widget/RecyclerView;II)V

    return-void
.end method

.method public t(Landroid/view/ViewGroup$LayoutParams;)LXl;
    .locals 1

    instance-of v0, p1, LXl;

    if-eqz v0, :cond_0

    new-instance v0, LXl;

    check-cast p1, LXl;

    invoke-direct {v0, p1}, LXl;-><init>(LXl;)V

    return-object v0

    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_1

    new-instance v0, LXl;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, p1}, LXl;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-object v0

    :cond_1
    new-instance v0, LXl;

    invoke-direct {v0, p1}, LXl;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public final t0(II)V
    .locals 8

    invoke-virtual {p0}, LWl;->v()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->n(II)V

    return-void

    :cond_0
    const/high16 v1, -0x80000000

    const v2, 0x7fffffff

    const/4 v3, 0x0

    move v4, v2

    move v5, v3

    move v2, v1

    move v3, v4

    :goto_0
    if-ge v5, v0, :cond_5

    invoke-virtual {p0, v5}, LWl;->u(I)Landroid/view/View;

    move-result-object v6

    iget-object v7, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v7, v7, Landroidx/recyclerview/widget/RecyclerView;->h:Landroid/graphics/Rect;

    invoke-virtual {p0, v7, v6}, LWl;->y(Landroid/graphics/Rect;Landroid/view/View;)V

    iget v6, v7, Landroid/graphics/Rect;->left:I

    if-ge v6, v3, :cond_1

    move v3, v6

    :cond_1
    iget v6, v7, Landroid/graphics/Rect;->right:I

    if-le v6, v1, :cond_2

    move v1, v6

    :cond_2
    iget v6, v7, Landroid/graphics/Rect;->top:I

    if-ge v6, v4, :cond_3

    move v4, v6

    :cond_3
    iget v6, v7, Landroid/graphics/Rect;->bottom:I

    if-le v6, v2, :cond_4

    move v2, v6

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_5
    iget-object v0, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->h:Landroid/graphics/Rect;

    invoke-virtual {v0, v3, v4, v1, v2}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v0, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->h:Landroid/graphics/Rect;

    invoke-virtual {p0, v0, p1, p2}, LWl;->s0(Landroid/graphics/Rect;II)V

    return-void
.end method

.method public final u(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, LWl;->a:LK2;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LK2;->n(I)Landroid/view/View;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final u0(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p1, p0, LWl;->a:LK2;

    const/4 p1, 0x0

    iput p1, p0, LWl;->n:I

    iput p1, p0, LWl;->o:I

    goto :goto_0

    :cond_0
    iput-object p1, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView;->e:LK2;

    iput-object v0, p0, LWl;->a:LK2;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    iput v0, p0, LWl;->n:I

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    iput p1, p0, LWl;->o:I

    :goto_0
    const/high16 p1, 0x40000000    # 2.0f

    iput p1, p0, LWl;->l:I

    iput p1, p0, LWl;->m:I

    return-void
.end method

.method public final v()I
    .locals 1

    iget-object v0, p0, LWl;->a:LK2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LK2;->o()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final v0(Landroid/view/View;IILXl;)Z
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->isLayoutRequested()Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, LWl;->h:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    iget v1, p4, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-static {v0, p2, v1}, LWl;->M(III)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    iget p2, p4, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-static {p1, p3, p2}, LWl;->M(III)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public w0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public x(Lcm;Lim;)I
    .locals 0

    iget-object p1, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    const/4 p2, 0x1

    if-eqz p1, :cond_1

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->k:LOl;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LWl;->d()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->k:LOl;

    invoke-virtual {p1}, LOl;->a()I

    move-result p2

    :cond_1
    :goto_0
    return p2
.end method

.method public final x0(Landroid/view/View;IILXl;)Z
    .locals 2

    iget-boolean v0, p0, LWl;->h:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    iget v1, p4, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-static {v0, p2, v1}, LWl;->M(III)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    iget p2, p4, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-static {p1, p3, p2}, LWl;->M(III)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public y(Landroid/graphics/Rect;Landroid/view/View;)V
    .locals 0

    invoke-static {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->J(Landroid/graphics/Rect;Landroid/view/View;)V

    return-void
.end method

.method public abstract y0(Landroidx/recyclerview/widget/RecyclerView;I)V
.end method

.method public final z0(LPg;)V
    .locals 3

    iget-object v0, p0, LWl;->e:LPg;

    if-eqz v0, :cond_0

    if-eq p1, v0, :cond_0

    iget-boolean v1, v0, LPg;->e:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0}, LPg;->i()V

    :cond_0
    iput-object p1, p0, LWl;->e:LPg;

    iget-object v0, p0, LWl;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->W:Lkm;

    iget-object v2, v1, Lkm;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v1, v1, Lkm;->c:Landroid/widget/OverScroller;

    invoke-virtual {v1}, Landroid/widget/OverScroller;->abortAnimation()V

    iget-boolean v1, p1, LPg;->h:Z

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "An instance of "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " was started more than once. Each instance of"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " is intended to only be used once. You should create a new instance for each use."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "RecyclerView"

    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    iput-object v0, p1, LPg;->b:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p0, p1, LPg;->c:LWl;

    iget v1, p1, LPg;->a:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_2

    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->c0:Lim;

    iput v1, v2, Lim;->a:I

    const/4 v2, 0x1

    iput-boolean v2, p1, LPg;->e:Z

    iput-boolean v2, p1, LPg;->d:Z

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->l:LWl;

    invoke-virtual {v0, v1}, LWl;->q(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p1, LPg;->f:Landroid/view/View;

    iget-object v0, p1, LPg;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->W:Lkm;

    invoke-virtual {v0}, Lkm;->a()V

    iput-boolean v2, p1, LPg;->h:Z

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid target position"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
