.class public Landroidx/appcompat/widget/ActionMenuView;
.super LKg;
.source "SourceFile"

# interfaces
.implements Lsi;
.implements LNi;


# instance fields
.field public A:Lo0;

.field public p:Lti;

.field public q:Landroid/content/Context;

.field public r:I

.field public s:Z

.field public t:Ll0;

.field public u:LKi;

.field public v:Lri;

.field public w:Z

.field public x:I

.field public final y:I

.field public final z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    invoke-direct {p0, p1, p2}, LKg;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p2, 0x0

    invoke-virtual {p0, p2}, LKg;->setBaselineAligned(Z)V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    const/high16 v1, 0x42600000    # 56.0f

    mul-float/2addr v1, v0

    float-to-int v1, v1

    iput v1, p0, Landroidx/appcompat/widget/ActionMenuView;->y:I

    const/high16 v1, 0x40800000    # 4.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Landroidx/appcompat/widget/ActionMenuView;->z:I

    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->q:Landroid/content/Context;

    iput p2, p0, Landroidx/appcompat/widget/ActionMenuView;->r:I

    return-void
.end method

.method public static j()Ln0;
    .locals 2

    new-instance v0, Ln0;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/4 v1, 0x0

    iput-boolean v1, v0, Ln0;->a:Z

    const/16 v1, 0x10

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    return-object v0
.end method

.method public static k(Landroid/view/ViewGroup$LayoutParams;)Ln0;
    .locals 1

    if-eqz p0, :cond_2

    instance-of v0, p0, Ln0;

    if-eqz v0, :cond_0

    new-instance v0, Ln0;

    check-cast p0, Ln0;

    invoke-direct {v0, p0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    iget-boolean p0, p0, Ln0;->a:Z

    iput-boolean p0, v0, Ln0;->a:Z

    goto :goto_0

    :cond_0
    new-instance v0, Ln0;

    invoke-direct {v0, p0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    :goto_0
    iget p0, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    if-gtz p0, :cond_1

    const/16 p0, 0x10

    iput p0, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    :cond_1
    return-object v0

    :cond_2
    invoke-static {}, Landroidx/appcompat/widget/ActionMenuView;->j()Ln0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lyi;)Z
    .locals 3

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->p:Lti;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2}, Lti;->q(Landroid/view/MenuItem;LLi;I)Z

    move-result p1

    return p1
.end method

.method public final b(Lti;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->p:Lti;

    return-void
.end method

.method public final checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    instance-of p1, p1, Ln0;

    return p1
.end method

.method public final dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final bridge synthetic f()LJg;
    .locals 1

    invoke-static {}, Landroidx/appcompat/widget/ActionMenuView;->j()Ln0;

    move-result-object v0

    return-object v0
.end method

.method public final g(Landroid/util/AttributeSet;)LJg;
    .locals 2

    new-instance v0, Ln0;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public final bridge synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    invoke-static {}, Landroidx/appcompat/widget/ActionMenuView;->j()Ln0;

    move-result-object v0

    return-object v0
.end method

.method public final generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 2
    new-instance v0, Ln0;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 3
    invoke-direct {v0, v1, p1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public final bridge synthetic generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0

    .line 1
    invoke-static {p1}, Landroidx/appcompat/widget/ActionMenuView;->k(Landroid/view/ViewGroup$LayoutParams;)Ln0;

    move-result-object p1

    return-object p1
.end method

.method public getMenu()Landroid/view/Menu;
    .locals 4

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->p:Lti;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lti;

    invoke-direct {v1, v0}, Lti;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Landroidx/appcompat/widget/ActionMenuView;->p:Lti;

    new-instance v2, Lk0;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, Lk0;-><init>(Ljava/lang/Object;I)V

    iput-object v2, v1, Lti;->e:Lri;

    new-instance v1, Ll0;

    invoke-direct {v1, v0}, Ll0;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Landroidx/appcompat/widget/ActionMenuView;->t:Ll0;

    const/4 v0, 0x1

    iput-boolean v0, v1, Ll0;->l:Z

    iput-boolean v0, v1, Ll0;->m:Z

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->u:LKi;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lpa;

    const/16 v2, 0xe

    invoke-direct {v0, v2}, Lpa;-><init>(I)V

    :goto_0
    iput-object v0, v1, Ll0;->e:LKi;

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->p:Lti;

    iget-object v2, p0, Landroidx/appcompat/widget/ActionMenuView;->q:Landroid/content/Context;

    invoke-virtual {v0, v1, v2}, Lti;->b(LLi;Landroid/content/Context;)V

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->t:Ll0;

    iput-object p0, v0, Ll0;->h:LNi;

    iget-object v0, v0, Ll0;->c:Lti;

    iput-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->p:Lti;

    :cond_1
    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->p:Lti;

    return-object v0
.end method

.method public getOverflowIcon()Landroid/graphics/drawable/Drawable;
    .locals 2

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuView;->getMenu()Landroid/view/Menu;

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->t:Ll0;

    iget-object v1, v0, Ll0;->i:Lj0;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-boolean v1, v0, Ll0;->k:Z

    if-eqz v1, :cond_1

    iget-object v0, v0, Ll0;->j:Landroid/graphics/drawable/Drawable;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getPopupTheme()I
    .locals 1

    iget v0, p0, Landroidx/appcompat/widget/ActionMenuView;->r:I

    return v0
.end method

.method public getWindowAnimations()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final bridge synthetic h(Landroid/view/ViewGroup$LayoutParams;)LJg;
    .locals 0

    invoke-static {p1}, Landroidx/appcompat/widget/ActionMenuView;->k(Landroid/view/ViewGroup$LayoutParams;)Ln0;

    move-result-object p1

    return-object p1
.end method

.method public final l(I)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    add-int/lit8 v1, p1, -0x1

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    if-ge p1, v3, :cond_1

    instance-of v3, v1, Lm0;

    if-eqz v3, :cond_1

    check-cast v1, Lm0;

    invoke-interface {v1}, Lm0;->a()Z

    move-result v0

    :cond_1
    if-lez p1, :cond_2

    instance-of p1, v2, Lm0;

    if-eqz p1, :cond_2

    check-cast v2, Lm0;

    invoke-interface {v2}, Lm0;->b()Z

    move-result p1

    or-int/2addr v0, p1

    :cond_2
    return v0
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    iget-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->t:Ll0;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ll0;->h()V

    iget-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->t:Ll0;

    invoke-virtual {p1}, Ll0;->i()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->t:Ll0;

    invoke-virtual {p1}, Ll0;->e()Z

    iget-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->t:Ll0;

    invoke-virtual {p1}, Ll0;->l()Z

    :cond_0
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->t:Ll0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll0;->e()Z

    iget-object v0, v0, Ll0;->t:Lg0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LFi;->b()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, LFi;->j:LDi;

    invoke-interface {v0}, LCo;->dismiss()V

    :cond_0
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 17

    move-object/from16 v0, p0

    iget-boolean v1, v0, Landroidx/appcompat/widget/ActionMenuView;->w:Z

    if-nez v1, :cond_0

    invoke-super/range {p0 .. p5}, LKg;->onLayout(ZIIII)V

    return-void

    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    sub-int v2, p5, p3

    div-int/lit8 v2, v2, 0x2

    invoke-virtual/range {p0 .. p0}, LKg;->getDividerWidth()I

    move-result v3

    sub-int v4, p4, p2

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v5

    sub-int v5, v4, v5

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v6

    sub-int/2addr v5, v6

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v6

    const/4 v7, 0x1

    if-ne v6, v7, :cond_1

    move v6, v7

    goto :goto_0

    :cond_1
    const/4 v6, 0x0

    :goto_0
    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_1
    const/16 v12, 0x8

    if-ge v9, v1, :cond_6

    invoke-virtual {v0, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v13

    invoke-virtual {v13}, Landroid/view/View;->getVisibility()I

    move-result v14

    if-ne v14, v12, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {v13}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v12

    check-cast v12, Ln0;

    iget-boolean v14, v12, Ln0;->a:Z

    if-eqz v14, :cond_5

    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v10

    invoke-virtual {v0, v9}, Landroidx/appcompat/widget/ActionMenuView;->l(I)Z

    move-result v14

    if-eqz v14, :cond_3

    add-int/2addr v10, v3

    :cond_3
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredHeight()I

    move-result v14

    if-eqz v6, :cond_4

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v15

    iget v12, v12, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v15, v12

    add-int v12, v15, v10

    goto :goto_2

    :cond_4
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v15

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v16

    sub-int v15, v15, v16

    iget v12, v12, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    sub-int v12, v15, v12

    sub-int v15, v12, v10

    :goto_2
    div-int/lit8 v16, v14, 0x2

    sub-int v8, v2, v16

    add-int/2addr v14, v8

    invoke-virtual {v13, v15, v8, v12, v14}, Landroid/view/View;->layout(IIII)V

    sub-int/2addr v5, v10

    move v10, v7

    goto :goto_3

    :cond_5
    invoke-virtual {v13}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    iget v13, v12, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v8, v13

    iget v12, v12, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v8, v12

    sub-int/2addr v5, v8

    invoke-virtual {v0, v9}, Landroidx/appcompat/widget/ActionMenuView;->l(I)Z

    add-int/lit8 v11, v11, 0x1

    :goto_3
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_6
    if-ne v1, v7, :cond_7

    if-nez v10, :cond_7

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    div-int/lit8 v4, v4, 0x2

    div-int/lit8 v6, v3, 0x2

    sub-int/2addr v4, v6

    div-int/lit8 v6, v5, 0x2

    sub-int/2addr v2, v6

    add-int/2addr v3, v4

    add-int/2addr v5, v2

    invoke-virtual {v1, v4, v2, v3, v5}, Landroid/view/View;->layout(IIII)V

    return-void

    :cond_7
    xor-int/lit8 v3, v10, 0x1

    sub-int/2addr v11, v3

    if-lez v11, :cond_8

    div-int v3, v5, v11

    :goto_4
    const/4 v4, 0x0

    goto :goto_5

    :cond_8
    const/4 v3, 0x0

    goto :goto_4

    :goto_5
    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    if-eqz v6, :cond_b

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v5

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v6

    sub-int/2addr v5, v6

    move v8, v4

    :goto_6
    if-ge v8, v1, :cond_e

    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Ln0;

    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v7

    if-eq v7, v12, :cond_a

    iget-boolean v7, v6, Ln0;->a:Z

    if-eqz v7, :cond_9

    goto :goto_7

    :cond_9
    iget v7, v6, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    sub-int/2addr v5, v7

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v9

    div-int/lit8 v10, v9, 0x2

    sub-int v10, v2, v10

    sub-int v11, v5, v7

    add-int/2addr v9, v10

    invoke-virtual {v4, v11, v10, v5, v9}, Landroid/view/View;->layout(IIII)V

    iget v4, v6, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v7, v4

    add-int/2addr v7, v3

    sub-int/2addr v5, v7

    :cond_a
    :goto_7
    add-int/lit8 v8, v8, 0x1

    goto :goto_6

    :cond_b
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v5

    move v8, v4

    :goto_8
    if-ge v8, v1, :cond_e

    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Ln0;

    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v7

    if-eq v7, v12, :cond_d

    iget-boolean v7, v6, Ln0;->a:Z

    if-eqz v7, :cond_c

    goto :goto_9

    :cond_c
    iget v7, v6, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/2addr v5, v7

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v9

    div-int/lit8 v10, v9, 0x2

    sub-int v10, v2, v10

    add-int v11, v5, v7

    add-int/2addr v9, v10

    invoke-virtual {v4, v5, v10, v11, v9}, Landroid/view/View;->layout(IIII)V

    iget v4, v6, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    add-int/2addr v7, v4

    add-int/2addr v7, v3

    add-int/2addr v7, v5

    move v5, v7

    :cond_d
    :goto_9
    add-int/lit8 v8, v8, 0x1

    goto :goto_8

    :cond_e
    return-void
.end method

.method public final onMeasure(II)V
    .locals 32

    move-object/from16 v0, p0

    iget-boolean v1, v0, Landroidx/appcompat/widget/ActionMenuView;->w:Z

    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/high16 v5, 0x40000000    # 2.0f

    if-ne v2, v5, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    iput-boolean v2, v0, Landroidx/appcompat/widget/ActionMenuView;->w:Z

    if-eq v1, v2, :cond_1

    iput v3, v0, Landroidx/appcompat/widget/ActionMenuView;->x:I

    :cond_1
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    iget-boolean v2, v0, Landroidx/appcompat/widget/ActionMenuView;->w:Z

    if-eqz v2, :cond_2

    iget-object v2, v0, Landroidx/appcompat/widget/ActionMenuView;->p:Lti;

    if-eqz v2, :cond_2

    iget v6, v0, Landroidx/appcompat/widget/ActionMenuView;->x:I

    if-eq v1, v6, :cond_2

    iput v1, v0, Landroidx/appcompat/widget/ActionMenuView;->x:I

    invoke-virtual {v2, v4}, Lti;->p(Z)V

    :cond_2
    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    iget-boolean v2, v0, Landroidx/appcompat/widget/ActionMenuView;->w:Z

    if-eqz v2, :cond_2f

    if-lez v1, :cond_2f

    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v2

    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v6

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v7

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingRight()I

    move-result v8

    add-int/2addr v8, v7

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v7

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v9

    add-int/2addr v9, v7

    const/4 v7, -0x2

    move/from16 v10, p2

    invoke-static {v10, v9, v7}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result v7

    sub-int/2addr v2, v8

    iget v8, v0, Landroidx/appcompat/widget/ActionMenuView;->y:I

    div-int v10, v2, v8

    rem-int v11, v2, v8

    if-nez v10, :cond_3

    invoke-virtual {v0, v2, v3}, Landroid/view/View;->setMeasuredDimension(II)V

    goto/16 :goto_1d

    :cond_3
    div-int/2addr v11, v10

    add-int/2addr v11, v8

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v8

    move v12, v3

    move v13, v12

    move v14, v13

    move v15, v14

    move/from16 v18, v15

    move/from16 v19, v18

    const-wide/16 v16, 0x0

    :goto_1
    iget v5, v0, Landroidx/appcompat/widget/ActionMenuView;->z:I

    if-ge v14, v8, :cond_12

    invoke-virtual {v0, v14}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v3

    move/from16 v21, v6

    const/16 v6, 0x8

    if-ne v3, v6, :cond_4

    move/from16 v24, v2

    move/from16 v22, v9

    goto/16 :goto_8

    :cond_4
    instance-of v3, v4, Landroidx/appcompat/view/menu/ActionMenuItemView;

    add-int/lit8 v12, v12, 0x1

    const/4 v6, 0x0

    if-eqz v3, :cond_5

    invoke-virtual {v4, v5, v6, v5, v6}, Landroid/view/View;->setPadding(IIII)V

    :cond_5
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Ln0;

    iput-boolean v6, v5, Ln0;->f:Z

    iput v6, v5, Ln0;->c:I

    iput v6, v5, Ln0;->b:I

    iput-boolean v6, v5, Ln0;->d:Z

    iput v6, v5, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    iput v6, v5, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    if-eqz v3, :cond_6

    move-object v6, v4

    check-cast v6, Landroidx/appcompat/view/menu/ActionMenuItemView;

    invoke-virtual {v6}, LC2;->getText()Ljava/lang/CharSequence;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    const/16 v20, 0x1

    xor-int/lit8 v6, v6, 0x1

    if-eqz v6, :cond_6

    const/4 v6, 0x1

    goto :goto_2

    :cond_6
    const/4 v6, 0x0

    :goto_2
    iput-boolean v6, v5, Ln0;->e:Z

    iget-boolean v6, v5, Ln0;->a:Z

    if-eqz v6, :cond_7

    const/4 v6, 0x1

    goto :goto_3

    :cond_7
    move v6, v10

    :goto_3
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v22

    move/from16 v23, v12

    move-object/from16 v12, v22

    check-cast v12, Ln0;

    invoke-static {v7}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v22

    move/from16 v24, v2

    sub-int v2, v22, v9

    move/from16 v22, v9

    invoke-static {v7}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v9

    invoke-static {v2, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    if-eqz v3, :cond_8

    move-object v3, v4

    check-cast v3, Landroidx/appcompat/view/menu/ActionMenuItemView;

    goto :goto_4

    :cond_8
    const/4 v3, 0x0

    :goto_4
    if-eqz v3, :cond_9

    invoke-virtual {v3}, LC2;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    const/4 v9, 0x1

    xor-int/2addr v3, v9

    if-eqz v3, :cond_9

    const/4 v3, 0x1

    goto :goto_5

    :cond_9
    const/4 v3, 0x0

    :goto_5
    if-lez v6, :cond_c

    if-eqz v3, :cond_a

    const/4 v9, 0x2

    if-lt v6, v9, :cond_c

    :cond_a
    mul-int/2addr v6, v11

    const/high16 v9, -0x80000000

    invoke-static {v6, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    invoke-virtual {v4, v6, v2}, Landroid/view/View;->measure(II)V

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v6

    div-int v9, v6, v11

    rem-int/2addr v6, v11

    if-eqz v6, :cond_b

    add-int/lit8 v9, v9, 0x1

    :cond_b
    if-eqz v3, :cond_d

    const/4 v6, 0x2

    if-ge v9, v6, :cond_d

    const/4 v9, 0x2

    goto :goto_6

    :cond_c
    const/4 v9, 0x0

    :cond_d
    :goto_6
    iget-boolean v6, v12, Ln0;->a:Z

    if-nez v6, :cond_e

    if-eqz v3, :cond_e

    const/4 v3, 0x1

    goto :goto_7

    :cond_e
    const/4 v3, 0x0

    :goto_7
    iput-boolean v3, v12, Ln0;->d:Z

    iput v9, v12, Ln0;->b:I

    mul-int v3, v9, v11

    const/high16 v6, 0x40000000    # 2.0f

    invoke-static {v3, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    invoke-virtual {v4, v3, v2}, Landroid/view/View;->measure(II)V

    invoke-static {v13, v9}, Ljava/lang/Math;->max(II)I

    move-result v13

    iget-boolean v2, v5, Ln0;->d:Z

    if-eqz v2, :cond_f

    add-int/lit8 v18, v18, 0x1

    :cond_f
    iget-boolean v2, v5, Ln0;->a:Z

    if-eqz v2, :cond_10

    const/4 v15, 0x1

    :cond_10
    sub-int/2addr v10, v9

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    move/from16 v3, v19

    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v19

    const/4 v2, 0x1

    if-ne v9, v2, :cond_11

    shl-int v3, v2, v14

    int-to-long v2, v3

    or-long v2, v16, v2

    move-wide/from16 v16, v2

    :cond_11
    move/from16 v12, v23

    :goto_8
    add-int/lit8 v14, v14, 0x1

    move/from16 v6, v21

    move/from16 v9, v22

    move/from16 v2, v24

    const/4 v3, 0x0

    const/4 v4, 0x1

    goto/16 :goto_1

    :cond_12
    move/from16 v24, v2

    move/from16 v21, v6

    move/from16 v3, v19

    if-eqz v15, :cond_13

    const/4 v2, 0x2

    if-ne v12, v2, :cond_13

    const/4 v2, 0x1

    goto :goto_9

    :cond_13
    const/4 v2, 0x0

    :goto_9
    const/4 v4, 0x0

    :goto_a
    const-wide/16 v22, 0x1

    if-lez v18, :cond_1e

    if-lez v10, :cond_1e

    const v6, 0x7fffffff

    const/4 v9, 0x0

    const/4 v14, 0x0

    const-wide/16 v25, 0x0

    :goto_b
    if-ge v14, v8, :cond_17

    invoke-virtual {v0, v14}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v19

    move/from16 v27, v3

    move-object/from16 v3, v19

    check-cast v3, Ln0;

    move/from16 v19, v4

    iget-boolean v4, v3, Ln0;->d:Z

    if-nez v4, :cond_14

    goto :goto_c

    :cond_14
    iget v3, v3, Ln0;->b:I

    if-ge v3, v6, :cond_15

    shl-long v25, v22, v14

    move v6, v3

    const/4 v9, 0x1

    goto :goto_c

    :cond_15
    if-ne v3, v6, :cond_16

    shl-long v3, v22, v14

    or-long v3, v25, v3

    add-int/lit8 v9, v9, 0x1

    move-wide/from16 v25, v3

    :cond_16
    :goto_c
    add-int/lit8 v14, v14, 0x1

    move/from16 v4, v19

    move/from16 v3, v27

    goto :goto_b

    :cond_17
    move/from16 v27, v3

    move/from16 v19, v4

    or-long v16, v16, v25

    if-le v9, v10, :cond_18

    move/from16 v28, v1

    :goto_d
    move v14, v7

    move/from16 v29, v8

    goto :goto_11

    :cond_18
    add-int/lit8 v6, v6, 0x1

    const/4 v3, 0x0

    :goto_e
    if-ge v3, v8, :cond_1d

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    check-cast v9, Ln0;

    move/from16 v28, v1

    const/4 v14, 0x1

    shl-int v1, v14, v3

    move v14, v7

    move/from16 v29, v8

    int-to-long v7, v1

    and-long v22, v25, v7

    const-wide/16 v30, 0x0

    cmp-long v1, v22, v30

    if-nez v1, :cond_19

    iget v1, v9, Ln0;->b:I

    if-ne v1, v6, :cond_1c

    or-long v16, v16, v7

    goto :goto_10

    :cond_19
    if-eqz v2, :cond_1a

    iget-boolean v1, v9, Ln0;->e:Z

    if-eqz v1, :cond_1a

    const/4 v1, 0x1

    if-ne v10, v1, :cond_1b

    add-int v7, v5, v11

    const/4 v8, 0x0

    invoke-virtual {v4, v7, v8, v5, v8}, Landroid/view/View;->setPadding(IIII)V

    goto :goto_f

    :cond_1a
    const/4 v1, 0x1

    :cond_1b
    :goto_f
    iget v4, v9, Ln0;->b:I

    add-int/2addr v4, v1

    iput v4, v9, Ln0;->b:I

    iput-boolean v1, v9, Ln0;->f:Z

    add-int/lit8 v10, v10, -0x1

    :cond_1c
    :goto_10
    add-int/lit8 v3, v3, 0x1

    move v7, v14

    move/from16 v1, v28

    move/from16 v8, v29

    goto :goto_e

    :cond_1d
    move/from16 v3, v27

    const/4 v4, 0x1

    goto/16 :goto_a

    :cond_1e
    move/from16 v28, v1

    move/from16 v27, v3

    move/from16 v19, v4

    goto :goto_d

    :goto_11
    const/4 v1, 0x1

    if-nez v15, :cond_1f

    if-ne v12, v1, :cond_1f

    move v2, v1

    goto :goto_12

    :cond_1f
    const/4 v2, 0x0

    :goto_12
    if-lez v10, :cond_20

    const-wide/16 v3, 0x0

    cmp-long v5, v16, v3

    if-eqz v5, :cond_20

    sub-int/2addr v12, v1

    if-lt v10, v12, :cond_21

    if-nez v2, :cond_21

    if-le v13, v1, :cond_20

    goto :goto_13

    :cond_20
    move/from16 v2, v29

    goto/16 :goto_18

    :cond_21
    :goto_13
    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->bitCount(J)I

    move-result v1

    int-to-float v1, v1

    if-nez v2, :cond_23

    and-long v2, v16, v22

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    const/high16 v3, 0x3f000000    # 0.5f

    if-eqz v2, :cond_22

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Ln0;

    iget-boolean v2, v2, Ln0;->e:Z

    if-nez v2, :cond_22

    sub-float/2addr v1, v3

    :cond_22
    add-int/lit8 v8, v29, -0x1

    const/4 v2, 0x1

    shl-int v4, v2, v8

    int-to-long v4, v4

    and-long v4, v16, v4

    const-wide/16 v6, 0x0

    cmp-long v2, v4, v6

    if-eqz v2, :cond_23

    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Ln0;

    iget-boolean v2, v2, Ln0;->e:Z

    if-nez v2, :cond_23

    sub-float/2addr v1, v3

    :cond_23
    const/4 v2, 0x0

    cmpl-float v2, v1, v2

    if-lez v2, :cond_24

    mul-int/2addr v10, v11

    int-to-float v2, v10

    div-float/2addr v2, v1

    float-to-int v6, v2

    goto :goto_14

    :cond_24
    const/4 v6, 0x0

    :goto_14
    move/from16 v2, v29

    const/4 v1, 0x0

    :goto_15
    if-ge v1, v2, :cond_2b

    const/4 v3, 0x1

    shl-int v4, v3, v1

    int-to-long v3, v4

    and-long v3, v16, v3

    const-wide/16 v7, 0x0

    cmp-long v3, v3, v7

    if-nez v3, :cond_25

    const/4 v3, 0x1

    const/4 v5, 0x2

    goto :goto_17

    :cond_25
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Ln0;

    instance-of v3, v3, Landroidx/appcompat/view/menu/ActionMenuItemView;

    if-eqz v3, :cond_27

    iput v6, v4, Ln0;->c:I

    const/4 v3, 0x1

    iput-boolean v3, v4, Ln0;->f:Z

    if-nez v1, :cond_26

    iget-boolean v3, v4, Ln0;->e:Z

    if-nez v3, :cond_26

    neg-int v3, v6

    const/4 v5, 0x2

    div-int/2addr v3, v5

    iput v3, v4, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    goto :goto_16

    :cond_26
    const/4 v5, 0x2

    :goto_16
    const/4 v3, 0x1

    const/16 v19, 0x1

    goto :goto_17

    :cond_27
    const/4 v5, 0x2

    iget-boolean v3, v4, Ln0;->a:Z

    if-eqz v3, :cond_28

    iput v6, v4, Ln0;->c:I

    const/4 v3, 0x1

    iput-boolean v3, v4, Ln0;->f:Z

    neg-int v9, v6

    div-int/2addr v9, v5

    iput v9, v4, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    move/from16 v19, v3

    goto :goto_17

    :cond_28
    const/4 v3, 0x1

    if-eqz v1, :cond_29

    div-int/lit8 v9, v6, 0x2

    iput v9, v4, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    :cond_29
    add-int/lit8 v9, v2, -0x1

    if-eq v1, v9, :cond_2a

    div-int/lit8 v9, v6, 0x2

    iput v9, v4, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    :cond_2a
    :goto_17
    add-int/lit8 v1, v1, 0x1

    goto :goto_15

    :cond_2b
    :goto_18
    move/from16 v4, v19

    if-eqz v4, :cond_2d

    const/4 v3, 0x0

    :goto_19
    if-ge v3, v2, :cond_2d

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Ln0;

    iget-boolean v5, v4, Ln0;->f:Z

    if-nez v5, :cond_2c

    move v6, v14

    const/high16 v4, 0x40000000    # 2.0f

    goto :goto_1a

    :cond_2c
    iget v5, v4, Ln0;->b:I

    mul-int/2addr v5, v11

    iget v4, v4, Ln0;->c:I

    add-int/2addr v5, v4

    const/high16 v4, 0x40000000    # 2.0f

    invoke-static {v5, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v5

    move v6, v14

    invoke-virtual {v1, v5, v6}, Landroid/view/View;->measure(II)V

    :goto_1a
    add-int/lit8 v3, v3, 0x1

    move v14, v6

    goto :goto_19

    :cond_2d
    const/high16 v4, 0x40000000    # 2.0f

    move/from16 v1, v28

    if-eq v1, v4, :cond_2e

    move/from16 v2, v24

    move/from16 v6, v27

    goto :goto_1b

    :cond_2e
    move/from16 v6, v21

    move/from16 v2, v24

    :goto_1b
    invoke-virtual {v0, v2, v6}, Landroid/view/View;->setMeasuredDimension(II)V

    goto :goto_1d

    :cond_2f
    move/from16 v10, p2

    const/4 v6, 0x0

    :goto_1c
    if-ge v6, v1, :cond_30

    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Ln0;

    const/4 v3, 0x0

    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    iput v3, v2, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    add-int/lit8 v6, v6, 0x1

    goto :goto_1c

    :cond_30
    invoke-super/range {p0 .. p2}, LKg;->onMeasure(II)V

    :goto_1d
    return-void
.end method

.method public setExpandedActionViewsExclusive(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->t:Ll0;

    iput-boolean p1, v0, Ll0;->q:Z

    return-void
.end method

.method public setOnMenuItemClickListener(Lo0;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->A:Lo0;

    return-void
.end method

.method public setOverflowIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    invoke-virtual {p0}, Landroidx/appcompat/widget/ActionMenuView;->getMenu()Landroid/view/Menu;

    iget-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->t:Ll0;

    iget-object v1, v0, Ll0;->i:Lj0;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, La2;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, v0, Ll0;->k:Z

    iput-object p1, v0, Ll0;->j:Landroid/graphics/drawable/Drawable;

    :goto_0
    return-void
.end method

.method public setOverflowReserved(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/appcompat/widget/ActionMenuView;->s:Z

    return-void
.end method

.method public setPopupTheme(I)V
    .locals 2

    iget v0, p0, Landroidx/appcompat/widget/ActionMenuView;->r:I

    if-eq v0, p1, :cond_1

    iput p1, p0, Landroidx/appcompat/widget/ActionMenuView;->r:I

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->q:Landroid/content/Context;

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/view/ContextThemeWrapper;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Landroidx/appcompat/widget/ActionMenuView;->q:Landroid/content/Context;

    :cond_1
    :goto_0
    return-void
.end method

.method public setPresenter(Ll0;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->t:Ll0;

    iput-object p0, p1, Ll0;->h:LNi;

    iget-object p1, p1, Ll0;->c:Lti;

    iput-object p1, p0, Landroidx/appcompat/widget/ActionMenuView;->p:Lti;

    return-void
.end method
