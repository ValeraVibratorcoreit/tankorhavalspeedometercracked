.class public Landroidx/constraintlayout/widget/ConstraintLayout;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# static fields
.field public static r:LBo;


# instance fields
.field public final a:Landroid/util/SparseArray;

.field public final b:Ljava/util/ArrayList;

.field public final c:Lw7;

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:Z

.field public i:I

.field public j:Lu7;

.field public k:Ld2;

.field public l:I

.field public m:Ljava/util/HashMap;

.field public final n:Landroid/util/SparseArray;

.field public final o:Lm7;

.field public p:I

.field public q:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    .line 3
    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ljava/util/ArrayList;

    .line 4
    new-instance p1, Lw7;

    invoke-direct {p1}, Lw7;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lw7;

    const/4 p1, 0x0

    .line 5
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    .line 6
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    const v0, 0x7fffffff

    .line 7
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    .line 8
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Z

    const/16 v0, 0x101

    .line 10
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Lu7;

    .line 12
    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:Ld2;

    const/4 v0, -0x1

    .line 13
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    .line 14
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Ljava/util/HashMap;

    .line 15
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Landroid/util/SparseArray;

    .line 16
    new-instance v0, Lm7;

    invoke-direct {v0, p0, p0}, Lm7;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;)V

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Lm7;

    .line 17
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:I

    .line 18
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->q:I

    .line 19
    invoke-virtual {p0, p2, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->h(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 20
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 21
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    .line 22
    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ljava/util/ArrayList;

    .line 23
    new-instance p1, Lw7;

    invoke-direct {p1}, Lw7;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lw7;

    const/4 p1, 0x0

    .line 24
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    .line 25
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    const v0, 0x7fffffff

    .line 26
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    .line 27
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    const/4 v0, 0x1

    .line 28
    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Z

    const/16 v0, 0x101

    .line 29
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    const/4 v0, 0x0

    .line 30
    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Lu7;

    .line 31
    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:Ld2;

    const/4 v0, -0x1

    .line 32
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    .line 33
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Ljava/util/HashMap;

    .line 34
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Landroid/util/SparseArray;

    .line 35
    new-instance v0, Lm7;

    invoke-direct {v0, p0, p0}, Lm7;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;)V

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Lm7;

    .line 36
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->p:I

    .line 37
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->q:I

    .line 38
    invoke-virtual {p0, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;->h(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private getPaddingWidth()I
    .locals 4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    add-int/2addr v2, v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    move-result v3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    add-int/2addr v1, v0

    if-lez v1, :cond_0

    move v2, v1

    :cond_0
    return v2
.end method

.method public static getSharedValues()LBo;
    .locals 2

    sget-object v0, Landroidx/constraintlayout/widget/ConstraintLayout;->r:LBo;

    if-nez v0, :cond_0

    new-instance v0, LBo;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Landroid/util/SparseIntArray;

    invoke-direct {v1}, Landroid/util/SparseIntArray;-><init>()V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Landroidx/constraintlayout/widget/ConstraintLayout;->r:LBo;

    :cond_0
    sget-object v0, Landroidx/constraintlayout/widget/ConstraintLayout;->r:LBo;

    return-object v0
.end method


# virtual methods
.method public final checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    instance-of p1, p1, Ll7;

    return p1
.end method

.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 18

    move-object/from16 v0, p0

    const/4 v1, 0x0

    iget-object v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ljava/util/ArrayList;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_0

    move v4, v1

    :goto_0
    if-ge v4, v3, :cond_0

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lj7;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-super/range {p0 .. p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->isInEditMode()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v4

    move v5, v1

    :goto_1
    if-ge v5, v4, :cond_3

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v7

    const/16 v8, 0x8

    if-ne v7, v8, :cond_1

    goto/16 :goto_2

    :cond_1
    invoke-virtual {v6}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_2

    instance-of v7, v6, Ljava/lang/String;

    if-eqz v7, :cond_2

    check-cast v6, Ljava/lang/String;

    const-string v7, ","

    invoke-virtual {v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    array-length v7, v6

    const/4 v8, 0x4

    if-ne v7, v8, :cond_2

    aget-object v7, v6, v1

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    const/4 v8, 0x1

    aget-object v8, v6, v8

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    const/4 v9, 0x2

    aget-object v9, v6, v9

    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    const/4 v10, 0x3

    aget-object v6, v6, v10

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    int-to-float v7, v7

    const/high16 v10, 0x44870000    # 1080.0f

    div-float/2addr v7, v10

    mul-float/2addr v7, v2

    float-to-int v7, v7

    int-to-float v8, v8

    const/high16 v11, 0x44f00000    # 1920.0f

    div-float/2addr v8, v11

    mul-float/2addr v8, v3

    float-to-int v8, v8

    int-to-float v9, v9

    div-float/2addr v9, v10

    mul-float/2addr v9, v2

    float-to-int v9, v9

    int-to-float v6, v6

    div-float/2addr v6, v11

    mul-float/2addr v6, v3

    float-to-int v6, v6

    new-instance v15, Landroid/graphics/Paint;

    invoke-direct {v15}, Landroid/graphics/Paint;-><init>()V

    const/high16 v10, -0x10000

    invoke-virtual {v15, v10}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v14, v7

    int-to-float v13, v8

    add-int/2addr v7, v9

    int-to-float v7, v7

    move-object/from16 v10, p1

    move v11, v14

    move v12, v13

    move v9, v13

    move v13, v7

    move/from16 v16, v14

    move v14, v9

    move-object/from16 v17, v15

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    add-int/2addr v8, v6

    int-to-float v6, v8

    move v11, v7

    move v12, v9

    move v14, v6

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move v12, v6

    move/from16 v13, v16

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move/from16 v11, v16

    move v14, v9

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    const v8, -0xff0100

    invoke-virtual {v15, v8}, Landroid/graphics/Paint;->setColor(I)V

    move v12, v9

    move v13, v7

    move v14, v6

    move-object v8, v15

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move v12, v6

    move v14, v9

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :cond_2
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_1

    :cond_3
    return-void
.end method

.method public final forceLayout()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Z

    invoke-super {p0}, Landroid/view/View;->forceLayout()V

    return-void
.end method

.method public final g(Landroid/view/View;)Lv7;
    .locals 1

    if-ne p1, p0, :cond_0

    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lw7;

    return-object p1

    :cond_0
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v0, v0, Ll7;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Ll7;

    iget-object p1, p1, Ll7;->p0:Lv7;

    return-object p1

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/constraintlayout/widget/ConstraintLayout;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    instance-of v0, v0, Ll7;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Ll7;

    iget-object p1, p1, Ll7;->p0:Lv7;

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public final generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    new-instance v0, Ll7;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Ll7;-><init>(II)V

    return-object v0
.end method

.method public final generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 12

    .line 1
    new-instance v0, Ll7;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 2
    invoke-direct {v0, v1, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v2, -0x1

    .line 3
    iput v2, v0, Ll7;->a:I

    .line 4
    iput v2, v0, Ll7;->b:I

    const/high16 v3, -0x40800000    # -1.0f

    .line 5
    iput v3, v0, Ll7;->c:F

    const/4 v4, 0x1

    .line 6
    iput-boolean v4, v0, Ll7;->d:Z

    .line 7
    iput v2, v0, Ll7;->e:I

    .line 8
    iput v2, v0, Ll7;->f:I

    .line 9
    iput v2, v0, Ll7;->g:I

    .line 10
    iput v2, v0, Ll7;->h:I

    .line 11
    iput v2, v0, Ll7;->i:I

    .line 12
    iput v2, v0, Ll7;->j:I

    .line 13
    iput v2, v0, Ll7;->k:I

    .line 14
    iput v2, v0, Ll7;->l:I

    .line 15
    iput v2, v0, Ll7;->m:I

    .line 16
    iput v2, v0, Ll7;->n:I

    .line 17
    iput v2, v0, Ll7;->o:I

    .line 18
    iput v2, v0, Ll7;->p:I

    const/4 v5, 0x0

    .line 19
    iput v5, v0, Ll7;->q:I

    const/4 v6, 0x0

    .line 20
    iput v6, v0, Ll7;->r:F

    .line 21
    iput v2, v0, Ll7;->s:I

    .line 22
    iput v2, v0, Ll7;->t:I

    .line 23
    iput v2, v0, Ll7;->u:I

    .line 24
    iput v2, v0, Ll7;->v:I

    const/high16 v7, -0x80000000

    .line 25
    iput v7, v0, Ll7;->w:I

    .line 26
    iput v7, v0, Ll7;->x:I

    .line 27
    iput v7, v0, Ll7;->y:I

    .line 28
    iput v7, v0, Ll7;->z:I

    .line 29
    iput v7, v0, Ll7;->A:I

    .line 30
    iput v7, v0, Ll7;->B:I

    .line 31
    iput v7, v0, Ll7;->C:I

    .line 32
    iput v5, v0, Ll7;->D:I

    const/high16 v8, 0x3f000000    # 0.5f

    .line 33
    iput v8, v0, Ll7;->E:F

    .line 34
    iput v8, v0, Ll7;->F:F

    const/4 v9, 0x0

    .line 35
    iput-object v9, v0, Ll7;->G:Ljava/lang/String;

    .line 36
    iput v3, v0, Ll7;->H:F

    .line 37
    iput v3, v0, Ll7;->I:F

    .line 38
    iput v5, v0, Ll7;->J:I

    .line 39
    iput v5, v0, Ll7;->K:I

    .line 40
    iput v5, v0, Ll7;->L:I

    .line 41
    iput v5, v0, Ll7;->M:I

    .line 42
    iput v5, v0, Ll7;->N:I

    .line 43
    iput v5, v0, Ll7;->O:I

    .line 44
    iput v5, v0, Ll7;->P:I

    .line 45
    iput v5, v0, Ll7;->Q:I

    const/high16 v3, 0x3f800000    # 1.0f

    .line 46
    iput v3, v0, Ll7;->R:F

    .line 47
    iput v3, v0, Ll7;->S:F

    .line 48
    iput v2, v0, Ll7;->T:I

    .line 49
    iput v2, v0, Ll7;->U:I

    .line 50
    iput v2, v0, Ll7;->V:I

    .line 51
    iput-boolean v5, v0, Ll7;->W:Z

    .line 52
    iput-boolean v5, v0, Ll7;->X:Z

    .line 53
    iput-object v9, v0, Ll7;->Y:Ljava/lang/String;

    .line 54
    iput v5, v0, Ll7;->Z:I

    .line 55
    iput-boolean v4, v0, Ll7;->a0:Z

    .line 56
    iput-boolean v4, v0, Ll7;->b0:Z

    .line 57
    iput-boolean v5, v0, Ll7;->c0:Z

    .line 58
    iput-boolean v5, v0, Ll7;->d0:Z

    .line 59
    iput-boolean v5, v0, Ll7;->e0:Z

    .line 60
    iput v2, v0, Ll7;->f0:I

    .line 61
    iput v2, v0, Ll7;->g0:I

    .line 62
    iput v2, v0, Ll7;->h0:I

    .line 63
    iput v2, v0, Ll7;->i0:I

    .line 64
    iput v7, v0, Ll7;->j0:I

    .line 65
    iput v7, v0, Ll7;->k0:I

    .line 66
    iput v8, v0, Ll7;->l0:F

    .line 67
    new-instance v3, Lv7;

    invoke-direct {v3}, Lv7;-><init>()V

    iput-object v3, v0, Ll7;->p0:Lv7;

    .line 68
    sget-object v3, Lnl;->b:[I

    invoke-virtual {v1, p1, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 69
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v1

    move v3, v5

    :goto_0
    if-ge v3, v1, :cond_1

    .line 70
    invoke-virtual {p1, v3}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v7

    .line 71
    sget-object v8, Lk7;->a:Landroid/util/SparseIntArray;

    invoke-virtual {v8, v7}, Landroid/util/SparseIntArray;->get(I)I

    move-result v8

    .line 72
    const-string v9, "ConstraintLayout"

    const/4 v10, 0x2

    const/4 v11, -0x2

    packed-switch v8, :pswitch_data_0

    packed-switch v8, :pswitch_data_1

    packed-switch v8, :pswitch_data_2

    goto/16 :goto_1

    .line 73
    :pswitch_0
    iget-boolean v8, v0, Ll7;->d:Z

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v7

    iput-boolean v7, v0, Ll7;->d:Z

    goto/16 :goto_1

    .line 74
    :pswitch_1
    iget v8, v0, Ll7;->Z:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ll7;->Z:I

    goto/16 :goto_1

    .line 75
    :pswitch_2
    invoke-static {v0, p1, v7, v4}, Lu7;->j(Ljava/lang/Object;Landroid/content/res/TypedArray;II)V

    goto/16 :goto_1

    .line 76
    :pswitch_3
    invoke-static {v0, p1, v7, v5}, Lu7;->j(Ljava/lang/Object;Landroid/content/res/TypedArray;II)V

    goto/16 :goto_1

    .line 77
    :pswitch_4
    iget v8, v0, Ll7;->C:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Ll7;->C:I

    goto/16 :goto_1

    .line 78
    :pswitch_5
    iget v8, v0, Ll7;->D:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Ll7;->D:I

    goto/16 :goto_1

    .line 79
    :pswitch_6
    iget v8, v0, Ll7;->o:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Ll7;->o:I

    if-ne v8, v2, :cond_0

    .line 80
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ll7;->o:I

    goto/16 :goto_1

    .line 81
    :pswitch_7
    iget v8, v0, Ll7;->n:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Ll7;->n:I

    if-ne v8, v2, :cond_0

    .line 82
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ll7;->n:I

    goto/16 :goto_1

    .line 83
    :pswitch_8
    invoke-virtual {p1, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v0, Ll7;->Y:Ljava/lang/String;

    goto/16 :goto_1

    .line 84
    :pswitch_9
    iget v8, v0, Ll7;->U:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v7

    iput v7, v0, Ll7;->U:I

    goto/16 :goto_1

    .line 85
    :pswitch_a
    iget v8, v0, Ll7;->T:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v7

    iput v7, v0, Ll7;->T:I

    goto/16 :goto_1

    .line 86
    :pswitch_b
    invoke-virtual {p1, v7, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ll7;->K:I

    goto/16 :goto_1

    .line 87
    :pswitch_c
    invoke-virtual {p1, v7, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ll7;->J:I

    goto/16 :goto_1

    .line 88
    :pswitch_d
    iget v8, v0, Ll7;->I:F

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    iput v7, v0, Ll7;->I:F

    goto/16 :goto_1

    .line 89
    :pswitch_e
    iget v8, v0, Ll7;->H:F

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    iput v7, v0, Ll7;->H:F

    goto/16 :goto_1

    .line 90
    :pswitch_f
    invoke-virtual {p1, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v0, v7}, Lu7;->k(Ll7;Ljava/lang/String;)V

    goto/16 :goto_1

    .line 91
    :pswitch_10
    iget v8, v0, Ll7;->S:F

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    invoke-static {v6, v7}, Ljava/lang/Math;->max(FF)F

    move-result v7

    iput v7, v0, Ll7;->S:F

    .line 92
    iput v10, v0, Ll7;->M:I

    goto/16 :goto_1

    .line 93
    :pswitch_11
    :try_start_0
    iget v8, v0, Ll7;->Q:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v8

    iput v8, v0, Ll7;->Q:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_1

    .line 94
    :catch_0
    iget v8, v0, Ll7;->Q:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    if-ne v7, v11, :cond_0

    .line 95
    iput v11, v0, Ll7;->Q:I

    goto/16 :goto_1

    .line 96
    :pswitch_12
    :try_start_1
    iget v8, v0, Ll7;->O:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v8

    iput v8, v0, Ll7;->O:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_1

    .line 97
    :catch_1
    iget v8, v0, Ll7;->O:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    if-ne v7, v11, :cond_0

    .line 98
    iput v11, v0, Ll7;->O:I

    goto/16 :goto_1

    .line 99
    :pswitch_13
    iget v8, v0, Ll7;->R:F

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    invoke-static {v6, v7}, Ljava/lang/Math;->max(FF)F

    move-result v7

    iput v7, v0, Ll7;->R:F

    .line 100
    iput v10, v0, Ll7;->L:I

    goto/16 :goto_1

    .line 101
    :pswitch_14
    :try_start_2
    iget v8, v0, Ll7;->P:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v8

    iput v8, v0, Ll7;->P:I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_1

    .line 102
    :catch_2
    iget v8, v0, Ll7;->P:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    if-ne v7, v11, :cond_0

    .line 103
    iput v11, v0, Ll7;->P:I

    goto/16 :goto_1

    .line 104
    :pswitch_15
    :try_start_3
    iget v8, v0, Ll7;->N:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v8

    iput v8, v0, Ll7;->N:I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    goto/16 :goto_1

    .line 105
    :catch_3
    iget v8, v0, Ll7;->N:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    if-ne v7, v11, :cond_0

    .line 106
    iput v11, v0, Ll7;->N:I

    goto/16 :goto_1

    .line 107
    :pswitch_16
    invoke-virtual {p1, v7, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ll7;->M:I

    if-ne v7, v4, :cond_0

    .line 108
    const-string v7, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead."

    invoke-static {v9, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_1

    .line 109
    :pswitch_17
    invoke-virtual {p1, v7, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ll7;->L:I

    if-ne v7, v4, :cond_0

    .line 110
    const-string v7, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead."

    invoke-static {v9, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_1

    .line 111
    :pswitch_18
    iget v8, v0, Ll7;->F:F

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    iput v7, v0, Ll7;->F:F

    goto/16 :goto_1

    .line 112
    :pswitch_19
    iget v8, v0, Ll7;->E:F

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    iput v7, v0, Ll7;->E:F

    goto/16 :goto_1

    .line 113
    :pswitch_1a
    iget-boolean v8, v0, Ll7;->X:Z

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v7

    iput-boolean v7, v0, Ll7;->X:Z

    goto/16 :goto_1

    .line 114
    :pswitch_1b
    iget-boolean v8, v0, Ll7;->W:Z

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v7

    iput-boolean v7, v0, Ll7;->W:Z

    goto/16 :goto_1

    .line 115
    :pswitch_1c
    iget v8, v0, Ll7;->B:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Ll7;->B:I

    goto/16 :goto_1

    .line 116
    :pswitch_1d
    iget v8, v0, Ll7;->A:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Ll7;->A:I

    goto/16 :goto_1

    .line 117
    :pswitch_1e
    iget v8, v0, Ll7;->z:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Ll7;->z:I

    goto/16 :goto_1

    .line 118
    :pswitch_1f
    iget v8, v0, Ll7;->y:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Ll7;->y:I

    goto/16 :goto_1

    .line 119
    :pswitch_20
    iget v8, v0, Ll7;->x:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Ll7;->x:I

    goto/16 :goto_1

    .line 120
    :pswitch_21
    iget v8, v0, Ll7;->w:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Ll7;->w:I

    goto/16 :goto_1

    .line 121
    :pswitch_22
    iget v8, v0, Ll7;->v:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Ll7;->v:I

    if-ne v8, v2, :cond_0

    .line 122
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ll7;->v:I

    goto/16 :goto_1

    .line 123
    :pswitch_23
    iget v8, v0, Ll7;->u:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Ll7;->u:I

    if-ne v8, v2, :cond_0

    .line 124
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ll7;->u:I

    goto/16 :goto_1

    .line 125
    :pswitch_24
    iget v8, v0, Ll7;->t:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Ll7;->t:I

    if-ne v8, v2, :cond_0

    .line 126
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ll7;->t:I

    goto/16 :goto_1

    .line 127
    :pswitch_25
    iget v8, v0, Ll7;->s:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Ll7;->s:I

    if-ne v8, v2, :cond_0

    .line 128
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ll7;->s:I

    goto/16 :goto_1

    .line 129
    :pswitch_26
    iget v8, v0, Ll7;->m:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Ll7;->m:I

    if-ne v8, v2, :cond_0

    .line 130
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ll7;->m:I

    goto/16 :goto_1

    .line 131
    :pswitch_27
    iget v8, v0, Ll7;->l:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Ll7;->l:I

    if-ne v8, v2, :cond_0

    .line 132
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ll7;->l:I

    goto/16 :goto_1

    .line 133
    :pswitch_28
    iget v8, v0, Ll7;->k:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Ll7;->k:I

    if-ne v8, v2, :cond_0

    .line 134
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ll7;->k:I

    goto/16 :goto_1

    .line 135
    :pswitch_29
    iget v8, v0, Ll7;->j:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Ll7;->j:I

    if-ne v8, v2, :cond_0

    .line 136
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ll7;->j:I

    goto/16 :goto_1

    .line 137
    :pswitch_2a
    iget v8, v0, Ll7;->i:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Ll7;->i:I

    if-ne v8, v2, :cond_0

    .line 138
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ll7;->i:I

    goto/16 :goto_1

    .line 139
    :pswitch_2b
    iget v8, v0, Ll7;->h:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Ll7;->h:I

    if-ne v8, v2, :cond_0

    .line 140
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ll7;->h:I

    goto/16 :goto_1

    .line 141
    :pswitch_2c
    iget v8, v0, Ll7;->g:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Ll7;->g:I

    if-ne v8, v2, :cond_0

    .line 142
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ll7;->g:I

    goto/16 :goto_1

    .line 143
    :pswitch_2d
    iget v8, v0, Ll7;->f:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Ll7;->f:I

    if-ne v8, v2, :cond_0

    .line 144
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ll7;->f:I

    goto :goto_1

    .line 145
    :pswitch_2e
    iget v8, v0, Ll7;->e:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Ll7;->e:I

    if-ne v8, v2, :cond_0

    .line 146
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ll7;->e:I

    goto :goto_1

    .line 147
    :pswitch_2f
    iget v8, v0, Ll7;->c:F

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    iput v7, v0, Ll7;->c:F

    goto :goto_1

    .line 148
    :pswitch_30
    iget v8, v0, Ll7;->b:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v7

    iput v7, v0, Ll7;->b:I

    goto :goto_1

    .line 149
    :pswitch_31
    iget v8, v0, Ll7;->a:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v7

    iput v7, v0, Ll7;->a:I

    goto :goto_1

    .line 150
    :pswitch_32
    iget v8, v0, Ll7;->r:F

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    const/high16 v8, 0x43b40000    # 360.0f

    rem-float/2addr v7, v8

    iput v7, v0, Ll7;->r:F

    cmpg-float v9, v7, v6

    if-gez v9, :cond_0

    sub-float v7, v8, v7

    rem-float/2addr v7, v8

    .line 151
    iput v7, v0, Ll7;->r:F

    goto :goto_1

    .line 152
    :pswitch_33
    iget v8, v0, Ll7;->q:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    iput v7, v0, Ll7;->q:I

    goto :goto_1

    .line 153
    :pswitch_34
    iget v8, v0, Ll7;->p:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    iput v8, v0, Ll7;->p:I

    if-ne v8, v2, :cond_0

    .line 154
    invoke-virtual {p1, v7, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ll7;->p:I

    goto :goto_1

    .line 155
    :pswitch_35
    iget v8, v0, Ll7;->V:I

    invoke-virtual {p1, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    iput v7, v0, Ll7;->V:I

    :cond_0
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 156
    :cond_1
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 157
    invoke-virtual {v0}, Ll7;->a()V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x2c
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x40
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 7

    .line 158
    new-instance v0, Ll7;

    .line 159
    invoke-direct {v0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 p1, -0x1

    .line 160
    iput p1, v0, Ll7;->a:I

    .line 161
    iput p1, v0, Ll7;->b:I

    const/high16 v1, -0x40800000    # -1.0f

    .line 162
    iput v1, v0, Ll7;->c:F

    const/4 v2, 0x1

    .line 163
    iput-boolean v2, v0, Ll7;->d:Z

    .line 164
    iput p1, v0, Ll7;->e:I

    .line 165
    iput p1, v0, Ll7;->f:I

    .line 166
    iput p1, v0, Ll7;->g:I

    .line 167
    iput p1, v0, Ll7;->h:I

    .line 168
    iput p1, v0, Ll7;->i:I

    .line 169
    iput p1, v0, Ll7;->j:I

    .line 170
    iput p1, v0, Ll7;->k:I

    .line 171
    iput p1, v0, Ll7;->l:I

    .line 172
    iput p1, v0, Ll7;->m:I

    .line 173
    iput p1, v0, Ll7;->n:I

    .line 174
    iput p1, v0, Ll7;->o:I

    .line 175
    iput p1, v0, Ll7;->p:I

    const/4 v3, 0x0

    .line 176
    iput v3, v0, Ll7;->q:I

    const/4 v4, 0x0

    .line 177
    iput v4, v0, Ll7;->r:F

    .line 178
    iput p1, v0, Ll7;->s:I

    .line 179
    iput p1, v0, Ll7;->t:I

    .line 180
    iput p1, v0, Ll7;->u:I

    .line 181
    iput p1, v0, Ll7;->v:I

    const/high16 v4, -0x80000000

    .line 182
    iput v4, v0, Ll7;->w:I

    .line 183
    iput v4, v0, Ll7;->x:I

    .line 184
    iput v4, v0, Ll7;->y:I

    .line 185
    iput v4, v0, Ll7;->z:I

    .line 186
    iput v4, v0, Ll7;->A:I

    .line 187
    iput v4, v0, Ll7;->B:I

    .line 188
    iput v4, v0, Ll7;->C:I

    .line 189
    iput v3, v0, Ll7;->D:I

    const/high16 v5, 0x3f000000    # 0.5f

    .line 190
    iput v5, v0, Ll7;->E:F

    .line 191
    iput v5, v0, Ll7;->F:F

    const/4 v6, 0x0

    .line 192
    iput-object v6, v0, Ll7;->G:Ljava/lang/String;

    .line 193
    iput v1, v0, Ll7;->H:F

    .line 194
    iput v1, v0, Ll7;->I:F

    .line 195
    iput v3, v0, Ll7;->J:I

    .line 196
    iput v3, v0, Ll7;->K:I

    .line 197
    iput v3, v0, Ll7;->L:I

    .line 198
    iput v3, v0, Ll7;->M:I

    .line 199
    iput v3, v0, Ll7;->N:I

    .line 200
    iput v3, v0, Ll7;->O:I

    .line 201
    iput v3, v0, Ll7;->P:I

    .line 202
    iput v3, v0, Ll7;->Q:I

    const/high16 v1, 0x3f800000    # 1.0f

    .line 203
    iput v1, v0, Ll7;->R:F

    .line 204
    iput v1, v0, Ll7;->S:F

    .line 205
    iput p1, v0, Ll7;->T:I

    .line 206
    iput p1, v0, Ll7;->U:I

    .line 207
    iput p1, v0, Ll7;->V:I

    .line 208
    iput-boolean v3, v0, Ll7;->W:Z

    .line 209
    iput-boolean v3, v0, Ll7;->X:Z

    .line 210
    iput-object v6, v0, Ll7;->Y:Ljava/lang/String;

    .line 211
    iput v3, v0, Ll7;->Z:I

    .line 212
    iput-boolean v2, v0, Ll7;->a0:Z

    .line 213
    iput-boolean v2, v0, Ll7;->b0:Z

    .line 214
    iput-boolean v3, v0, Ll7;->c0:Z

    .line 215
    iput-boolean v3, v0, Ll7;->d0:Z

    .line 216
    iput-boolean v3, v0, Ll7;->e0:Z

    .line 217
    iput p1, v0, Ll7;->f0:I

    .line 218
    iput p1, v0, Ll7;->g0:I

    .line 219
    iput p1, v0, Ll7;->h0:I

    .line 220
    iput p1, v0, Ll7;->i0:I

    .line 221
    iput v4, v0, Ll7;->j0:I

    .line 222
    iput v4, v0, Ll7;->k0:I

    .line 223
    iput v5, v0, Ll7;->l0:F

    .line 224
    new-instance p1, Lv7;

    invoke-direct {p1}, Lv7;-><init>()V

    iput-object p1, v0, Ll7;->p0:Lv7;

    return-object v0
.end method

.method public getMaxHeight()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    return v0
.end method

.method public getMaxWidth()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    return v0
.end method

.method public getMinHeight()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    return v0
.end method

.method public getMinWidth()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    return v0
.end method

.method public getOptimizationLevel()I
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lw7;

    iget v0, v0, Lw7;->D0:I

    return v0
.end method

.method public getSceneString()Ljava/lang/String;
    .locals 9

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lw7;

    iget-object v2, v1, Lv7;->j:Ljava/lang/String;

    const/4 v3, -0x1

    if-nez v2, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v2

    if-eq v2, v3, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lv7;->j:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v2, "parent"

    iput-object v2, v1, Lv7;->j:Ljava/lang/String;

    :cond_1
    :goto_0
    iget-object v2, v1, Lv7;->h0:Ljava/lang/String;

    const-string v4, " setDebugName "

    const-string v5, "ConstraintLayout"

    if-nez v2, :cond_2

    iget-object v2, v1, Lv7;->j:Ljava/lang/String;

    iput-object v2, v1, Lv7;->h0:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v6, v1, Lv7;->h0:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    iget-object v2, v1, Lw7;->q0:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lv7;

    iget-object v7, v6, Lv7;->f0:Ljava/lang/Object;

    check-cast v7, Landroid/view/View;

    if-eqz v7, :cond_3

    iget-object v8, v6, Lv7;->j:Ljava/lang/String;

    if-nez v8, :cond_4

    invoke-virtual {v7}, Landroid/view/View;->getId()I

    move-result v7

    if-eq v7, v3, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8, v7}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v7

    iput-object v7, v6, Lv7;->j:Ljava/lang/String;

    :cond_4
    iget-object v7, v6, Lv7;->h0:Ljava/lang/String;

    if-nez v7, :cond_3

    iget-object v7, v6, Lv7;->j:Ljava/lang/String;

    iput-object v7, v6, Lv7;->h0:Ljava/lang/String;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v6, v6, Lv7;->h0:Ljava/lang/String;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    :cond_5
    invoke-virtual {v1, v0}, Lw7;->n(Ljava/lang/StringBuilder;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final h(Landroid/util/AttributeSet;I)V
    .locals 7

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lw7;

    iput-object p0, v0, Lv7;->f0:Ljava/lang/Object;

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Lm7;

    iput-object v1, v0, Lw7;->u0:Lm7;

    iget-object v2, v0, Lw7;->s0:LW8;

    iput-object v1, v2, LW8;->f:Lm7;

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v2

    invoke-virtual {v1, v2, p0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/4 v1, 0x0

    iput-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Lu7;

    if-eqz p1, :cond_8

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    sget-object v3, Lnl;->b:[I

    const/4 v4, 0x0

    invoke-virtual {v2, p1, v3, p2, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result p2

    move v2, v4

    :goto_0
    if-ge v2, p2, :cond_7

    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v3

    const/16 v5, 0x10

    if-ne v3, v5, :cond_0

    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    goto :goto_2

    :cond_0
    const/16 v5, 0x11

    if-ne v3, v5, :cond_1

    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    goto :goto_2

    :cond_1
    const/16 v5, 0xe

    if-ne v3, v5, :cond_2

    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    goto :goto_2

    :cond_2
    const/16 v5, 0xf

    if-ne v3, v5, :cond_3

    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    goto :goto_2

    :cond_3
    const/16 v5, 0x71

    if-ne v3, v5, :cond_4

    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    goto :goto_2

    :cond_4
    const/16 v5, 0x38

    if-ne v3, v5, :cond_5

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    if-eqz v3, :cond_6

    :try_start_0
    invoke-virtual {p0, v3}, Landroidx/constraintlayout/widget/ConstraintLayout;->i(I)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    iput-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:Ld2;

    goto :goto_2

    :cond_5
    const/16 v5, 0x22

    if-ne v3, v5, :cond_6

    invoke-virtual {p1, v3, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    :try_start_1
    new-instance v5, Lu7;

    invoke-direct {v5}, Lu7;-><init>()V

    iput-object v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Lu7;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v5, v6, v3}, Lu7;->h(Landroid/content/Context;I)V
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    iput-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Lu7;

    :goto_1
    iput v3, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    :cond_6
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_7
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_8
    iget p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    iput p1, v0, Lw7;->D0:I

    const/16 p1, 0x200

    invoke-virtual {v0, p1}, Lw7;->W(I)Z

    move-result p1

    sput-boolean p1, LQg;->p:Z

    return-void
.end method

.method public final i(I)V
    .locals 9

    new-instance v0, Ld2;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const/16 v2, 0x9

    invoke-direct {v0, v2}, Ld2;-><init>(I)V

    new-instance v2, Landroid/util/SparseArray;

    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    iput-object v2, v0, Ld2;->b:Ljava/lang/Object;

    new-instance v2, Landroid/util/SparseArray;

    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    iput-object v2, v0, Ld2;->c:Ljava/lang/Object;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object p1

    :try_start_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x1

    if-eq v2, v4, :cond_7

    if-eqz v2, :cond_5

    const/4 v5, 0x2

    if-eq v2, v5, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v6

    const/4 v7, 0x4

    const/4 v8, 0x3

    sparse-switch v6, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v4, "Variant"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    move v4, v8

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_4

    :catch_1
    move-exception p1

    goto/16 :goto_5

    :sswitch_1
    const-string v4, "layoutDescription"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v4, 0x0

    goto :goto_2

    :sswitch_2
    const-string v6, "StateSet"

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_2

    :sswitch_3
    const-string v4, "State"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    move v4, v5

    goto :goto_2

    :sswitch_4
    const-string v4, "ConstraintSet"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    move v4, v7

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v4, -0x1

    :goto_2
    if-eq v4, v5, :cond_4

    if-eq v4, v8, :cond_3

    if-eq v4, v7, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {v0, v1, p1}, Ld2;->S(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    goto :goto_3

    :cond_3
    new-instance v2, Ln7;

    invoke-direct {v2, v1, p1}, Ln7;-><init>(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    if-eqz v3, :cond_6

    iget-object v4, v3, Lc5;->c:Ljava/lang/Object;

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    new-instance v3, Lc5;

    invoke-direct {v3, v1, p1}, Lc5;-><init>(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    iget-object v2, v0, Ld2;->b:Ljava/lang/Object;

    check-cast v2, Landroid/util/SparseArray;

    iget v4, v3, Lc5;->a:I

    invoke-virtual {v2, v4, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_3

    :cond_5
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    :cond_6
    :goto_3
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v2
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :goto_4
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_6

    :goto_5
    invoke-virtual {p1}, Lorg/xmlpull/v1/XmlPullParserException;->printStackTrace()V

    :cond_7
    :goto_6
    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:Ld2;

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x50764adb -> :sswitch_4
        0x4c7d471 -> :sswitch_3
        0x526c4e31 -> :sswitch_2
        0x62ce7272 -> :sswitch_1
        0x7155a865 -> :sswitch_0
    .end sparse-switch
.end method

.method public final j(Lw7;III)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    invoke-static/range {p3 .. p3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v3

    invoke-static/range {p3 .. p3}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v4

    invoke-static/range {p4 .. p4}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v5

    invoke-static/range {p4 .. p4}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v6

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingTop()I

    move-result v7

    const/4 v8, 0x0

    invoke-static {v8, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    add-int v10, v7, v9

    invoke-direct/range {p0 .. p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getPaddingWidth()I

    move-result v11

    iget-object v12, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Lm7;

    iput v7, v12, Lm7;->b:I

    iput v9, v12, Lm7;->c:I

    iput v11, v12, Lm7;->d:I

    iput v10, v12, Lm7;->e:I

    move/from16 v9, p3

    iput v9, v12, Lm7;->f:I

    move/from16 v9, p4

    iput v9, v12, Lm7;->g:I

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingStart()I

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingEnd()I

    move-result v13

    invoke-static {v8, v13}, Ljava/lang/Math;->max(II)I

    move-result v13

    const/4 v14, 0x1

    if-gtz v9, :cond_1

    if-lez v13, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v15

    invoke-virtual {v15}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v15

    iget v15, v15, Landroid/content/pm/ApplicationInfo;->flags:I

    const/high16 v16, 0x400000

    and-int v15, v15, v16

    if-eqz v15, :cond_2

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v15

    if-ne v14, v15, :cond_2

    move v9, v13

    :cond_2
    :goto_1
    sub-int/2addr v4, v11

    sub-int/2addr v6, v10

    iget v10, v12, Lm7;->e:I

    iget v11, v12, Lm7;->d:I

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v12

    const/high16 v15, 0x40000000    # 2.0f

    const/high16 v13, -0x80000000

    if-eq v3, v13, :cond_6

    if-eqz v3, :cond_4

    if-eq v3, v15, :cond_3

    move/from16 v17, v8

    goto :goto_4

    :cond_3
    iget v14, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    sub-int/2addr v14, v11

    invoke-static {v14, v4}, Ljava/lang/Math;->min(II)I

    move-result v14

    move/from16 v17, v14

    const/4 v14, 0x1

    goto :goto_4

    :cond_4
    if-nez v12, :cond_5

    iget v14, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    invoke-static {v8, v14}, Ljava/lang/Math;->max(II)I

    move-result v14

    :goto_2
    move/from16 v17, v14

    :goto_3
    const/4 v14, 0x2

    goto :goto_4

    :cond_5
    move/from16 v17, v8

    goto :goto_3

    :cond_6
    if-nez v12, :cond_7

    iget v14, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    invoke-static {v8, v14}, Ljava/lang/Math;->max(II)I

    move-result v14

    goto :goto_2

    :cond_7
    move/from16 v17, v4

    goto :goto_3

    :goto_4
    if-eq v5, v13, :cond_b

    if-eqz v5, :cond_9

    if-eq v5, v15, :cond_8

    move v13, v8

    :goto_5
    const/4 v12, 0x1

    goto :goto_8

    :cond_8
    iget v12, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    sub-int/2addr v12, v10

    invoke-static {v12, v6}, Ljava/lang/Math;->min(II)I

    move-result v12

    move v13, v12

    goto :goto_5

    :cond_9
    if-nez v12, :cond_a

    iget v12, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    invoke-static {v8, v12}, Ljava/lang/Math;->max(II)I

    move-result v12

    :goto_6
    move v13, v12

    :goto_7
    const/4 v12, 0x2

    goto :goto_8

    :cond_a
    move v13, v8

    goto :goto_7

    :cond_b
    if-nez v12, :cond_c

    iget v12, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    invoke-static {v8, v12}, Ljava/lang/Math;->max(II)I

    move-result v12

    goto :goto_6

    :cond_c
    move v13, v6

    goto :goto_7

    :goto_8
    invoke-virtual/range {p1 .. p1}, Lv7;->q()I

    move-result v15

    iget-object v8, v1, Lw7;->s0:LW8;

    move/from16 v19, v6

    move/from16 v6, v17

    if-ne v6, v15, :cond_d

    invoke-virtual/range {p1 .. p1}, Lv7;->k()I

    move-result v15

    if-eq v13, v15, :cond_e

    :cond_d
    const/4 v15, 0x1

    goto :goto_a

    :cond_e
    :goto_9
    const/4 v15, 0x0

    goto :goto_b

    :goto_a
    iput-boolean v15, v8, LW8;->c:Z

    goto :goto_9

    :goto_b
    iput v15, v1, Lv7;->Y:I

    iput v15, v1, Lv7;->Z:I

    iget v15, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    sub-int/2addr v15, v11

    move-object/from16 v17, v8

    iget-object v8, v1, Lv7;->C:[I

    move/from16 v20, v4

    const/4 v4, 0x0

    aput v15, v8, v4

    iget v15, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    sub-int/2addr v15, v10

    const/16 v18, 0x1

    aput v15, v8, v18

    iput v4, v1, Lv7;->b0:I

    iput v4, v1, Lv7;->c0:I

    invoke-virtual {v1, v14}, Lv7;->M(I)V

    invoke-virtual {v1, v6}, Lv7;->O(I)V

    invoke-virtual {v1, v12}, Lv7;->N(I)V

    invoke-virtual {v1, v13}, Lv7;->L(I)V

    iget v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    sub-int/2addr v6, v11

    if-gez v6, :cond_f

    iput v4, v1, Lv7;->b0:I

    goto :goto_c

    :cond_f
    iput v6, v1, Lv7;->b0:I

    :goto_c
    iget v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    sub-int/2addr v6, v10

    if-gez v6, :cond_10

    iput v4, v1, Lv7;->c0:I

    goto :goto_d

    :cond_10
    iput v6, v1, Lv7;->c0:I

    :goto_d
    iput v9, v1, Lw7;->x0:I

    iput v7, v1, Lw7;->y0:I

    iget-object v4, v1, Lw7;->r0:LK2;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v6, v1, Lw7;->u0:Lm7;

    iget-object v7, v1, Lw7;->q0:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    invoke-virtual/range {p1 .. p1}, Lv7;->q()I

    move-result v9

    invoke-virtual/range {p1 .. p1}, Lv7;->k()I

    move-result v10

    const/16 v11, 0x80

    invoke-static {v2, v11}, LTf;->p(II)Z

    move-result v11

    const/16 v12, 0x40

    if-nez v11, :cond_12

    invoke-static {v2, v12}, LTf;->p(II)Z

    move-result v2

    if-eqz v2, :cond_11

    goto :goto_e

    :cond_11
    const/4 v2, 0x0

    goto :goto_f

    :cond_12
    :goto_e
    const/4 v2, 0x1

    :goto_f
    const/4 v13, 0x3

    if-eqz v2, :cond_1b

    const/4 v15, 0x0

    :goto_10
    if-ge v15, v7, :cond_1b

    iget-object v12, v1, Lw7;->q0:Ljava/util/ArrayList;

    invoke-virtual {v12, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lv7;

    iget-object v14, v12, Lv7;->p0:[I

    const/16 v18, 0x0

    aget v0, v14, v18

    if-ne v0, v13, :cond_13

    const/4 v0, 0x1

    :goto_11
    const/16 v22, 0x1

    goto :goto_12

    :cond_13
    const/4 v0, 0x0

    goto :goto_11

    :goto_12
    aget v14, v14, v22

    if-ne v14, v13, :cond_14

    const/4 v14, 0x1

    goto :goto_13

    :cond_14
    const/4 v14, 0x0

    :goto_13
    if-eqz v0, :cond_15

    if-eqz v14, :cond_15

    iget v0, v12, Lv7;->W:F

    const/4 v14, 0x0

    cmpl-float v0, v0, v14

    if-lez v0, :cond_15

    const/4 v0, 0x1

    goto :goto_14

    :cond_15
    const/4 v0, 0x0

    :goto_14
    invoke-virtual {v12}, Lv7;->x()Z

    move-result v14

    if-eqz v14, :cond_17

    if-eqz v0, :cond_17

    :cond_16
    :goto_15
    const/high16 v0, 0x40000000    # 2.0f

    const/4 v2, 0x0

    goto :goto_16

    :cond_17
    invoke-virtual {v12}, Lv7;->y()Z

    move-result v14

    if-eqz v14, :cond_18

    if-eqz v0, :cond_18

    goto :goto_15

    :cond_18
    instance-of v0, v12, Lcc;

    if-eqz v0, :cond_19

    goto :goto_15

    :cond_19
    invoke-virtual {v12}, Lv7;->x()Z

    move-result v0

    if-nez v0, :cond_16

    invoke-virtual {v12}, Lv7;->y()Z

    move-result v0

    if-eqz v0, :cond_1a

    goto :goto_15

    :cond_1a
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v0, p0

    const/16 v12, 0x40

    goto :goto_10

    :cond_1b
    const/high16 v0, 0x40000000    # 2.0f

    :goto_16
    if-ne v3, v0, :cond_1c

    if-eq v5, v0, :cond_1d

    :cond_1c
    if-eqz v11, :cond_1e

    :cond_1d
    const/4 v0, 0x1

    goto :goto_17

    :cond_1e
    const/4 v0, 0x0

    :goto_17
    and-int/2addr v0, v2

    if-eqz v0, :cond_3d

    const/4 v12, 0x0

    aget v14, v8, v12

    move/from16 v12, v20

    invoke-static {v14, v12}, Ljava/lang/Math;->min(II)I

    move-result v12

    const/4 v14, 0x1

    aget v8, v8, v14

    move/from16 v15, v19

    invoke-static {v8, v15}, Ljava/lang/Math;->min(II)I

    move-result v8

    const/high16 v15, 0x40000000    # 2.0f

    if-ne v3, v15, :cond_1f

    invoke-virtual/range {p1 .. p1}, Lv7;->q()I

    move-result v13

    if-eq v13, v12, :cond_1f

    invoke-virtual {v1, v12}, Lv7;->O(I)V

    iget-object v12, v1, Lw7;->s0:LW8;

    iput-boolean v14, v12, LW8;->b:Z

    :cond_1f
    if-ne v5, v15, :cond_20

    invoke-virtual/range {p1 .. p1}, Lv7;->k()I

    move-result v12

    if-eq v12, v8, :cond_20

    invoke-virtual {v1, v8}, Lv7;->L(I)V

    iget-object v8, v1, Lw7;->s0:LW8;

    iput-boolean v14, v8, LW8;->b:Z

    :cond_20
    if-ne v3, v15, :cond_36

    if-ne v5, v15, :cond_36

    move-object/from16 v8, v17

    iget-boolean v12, v8, LW8;->b:Z

    iget-object v13, v8, LW8;->a:Lw7;

    if-nez v12, :cond_22

    iget-boolean v12, v8, LW8;->c:Z

    if-eqz v12, :cond_21

    goto :goto_18

    :cond_21
    const/4 v15, 0x0

    goto :goto_1a

    :cond_22
    :goto_18
    iget-object v12, v13, Lw7;->q0:Ljava/util/ArrayList;

    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_19
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_23

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lv7;

    invoke-virtual {v14}, Lv7;->h()V

    const/4 v15, 0x0

    iput-boolean v15, v14, Lv7;->a:Z

    iget-object v2, v14, Lv7;->d:Lwe;

    invoke-virtual {v2}, Lwe;->n()V

    iget-object v2, v14, Lv7;->e:Lks;

    invoke-virtual {v2}, Lks;->m()V

    goto :goto_19

    :cond_23
    const/4 v15, 0x0

    invoke-virtual {v13}, Lv7;->h()V

    iput-boolean v15, v13, Lv7;->a:Z

    iget-object v2, v13, Lv7;->d:Lwe;

    invoke-virtual {v2}, Lwe;->n()V

    iget-object v2, v13, Lv7;->e:Lks;

    invoke-virtual {v2}, Lks;->m()V

    iput-boolean v15, v8, LW8;->c:Z

    :goto_1a
    iget-object v2, v8, LW8;->d:Lw7;

    invoke-virtual {v8, v2}, LW8;->b(Lw7;)V

    iput v15, v13, Lv7;->Y:I

    iput v15, v13, Lv7;->Z:I

    invoke-virtual {v13, v15}, Lv7;->j(I)I

    move-result v2

    const/4 v12, 0x1

    invoke-virtual {v13, v12}, Lv7;->j(I)I

    move-result v14

    iget-boolean v12, v8, LW8;->b:Z

    if-eqz v12, :cond_24

    invoke-virtual {v8}, LW8;->c()V

    :cond_24
    invoke-virtual {v13}, Lv7;->r()I

    move-result v12

    invoke-virtual {v13}, Lv7;->s()I

    move-result v15

    move/from16 v20, v0

    iget-object v0, v13, Lv7;->d:Lwe;

    iget-object v0, v0, Ltt;->h:LX8;

    invoke-virtual {v0, v12}, LX8;->d(I)V

    iget-object v0, v13, Lv7;->e:Lks;

    iget-object v0, v0, Ltt;->h:LX8;

    invoke-virtual {v0, v15}, LX8;->d(I)V

    invoke-virtual {v8}, LW8;->g()V

    iget-object v0, v8, LW8;->e:Ljava/util/ArrayList;

    move-object/from16 v22, v6

    const/4 v6, 0x2

    if-eq v2, v6, :cond_27

    if-ne v14, v6, :cond_25

    goto :goto_1b

    :cond_25
    move/from16 v23, v9

    :cond_26
    const/4 v6, 0x1

    goto :goto_1d

    :cond_27
    :goto_1b
    if-eqz v11, :cond_29

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_28
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v23

    if-eqz v23, :cond_29

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v23

    check-cast v23, Ltt;

    invoke-virtual/range {v23 .. v23}, Ltt;->k()Z

    move-result v23

    if-nez v23, :cond_28

    const/4 v11, 0x0

    :cond_29
    if-eqz v11, :cond_2a

    const/4 v6, 0x2

    if-ne v2, v6, :cond_2a

    const/4 v6, 0x1

    invoke-virtual {v13, v6}, Lv7;->M(I)V

    move/from16 v23, v9

    const/4 v6, 0x0

    invoke-virtual {v8, v13, v6}, LW8;->d(Lw7;I)I

    move-result v9

    invoke-virtual {v13, v9}, Lv7;->O(I)V

    iget-object v6, v13, Lv7;->d:Lwe;

    iget-object v6, v6, Ltt;->e:Lh9;

    invoke-virtual {v13}, Lv7;->q()I

    move-result v9

    invoke-virtual {v6, v9}, Lh9;->d(I)V

    goto :goto_1c

    :cond_2a
    move/from16 v23, v9

    :goto_1c
    if-eqz v11, :cond_26

    const/4 v6, 0x2

    if-ne v14, v6, :cond_26

    const/4 v6, 0x1

    invoke-virtual {v13, v6}, Lv7;->N(I)V

    invoke-virtual {v8, v13, v6}, LW8;->d(Lw7;I)I

    move-result v9

    invoke-virtual {v13, v9}, Lv7;->L(I)V

    iget-object v9, v13, Lv7;->e:Lks;

    iget-object v9, v9, Ltt;->e:Lh9;

    invoke-virtual {v13}, Lv7;->k()I

    move-result v11

    invoke-virtual {v9, v11}, Lh9;->d(I)V

    :goto_1d
    iget-object v9, v13, Lv7;->p0:[I

    move/from16 v24, v10

    const/4 v11, 0x0

    aget v10, v9, v11

    if-eq v10, v6, :cond_2c

    const/4 v6, 0x4

    if-ne v10, v6, :cond_2b

    goto :goto_1e

    :cond_2b
    const/4 v6, 0x0

    goto :goto_1f

    :cond_2c
    :goto_1e
    invoke-virtual {v13}, Lv7;->q()I

    move-result v6

    add-int/2addr v6, v12

    iget-object v10, v13, Lv7;->d:Lwe;

    iget-object v10, v10, Ltt;->i:LX8;

    invoke-virtual {v10, v6}, LX8;->d(I)V

    iget-object v10, v13, Lv7;->d:Lwe;

    iget-object v10, v10, Ltt;->e:Lh9;

    sub-int/2addr v6, v12

    invoke-virtual {v10, v6}, Lh9;->d(I)V

    invoke-virtual {v8}, LW8;->g()V

    const/4 v6, 0x1

    aget v9, v9, v6

    if-eq v9, v6, :cond_2d

    const/4 v6, 0x4

    if-ne v9, v6, :cond_2e

    :cond_2d
    invoke-virtual {v13}, Lv7;->k()I

    move-result v6

    add-int/2addr v6, v15

    iget-object v9, v13, Lv7;->e:Lks;

    iget-object v9, v9, Ltt;->i:LX8;

    invoke-virtual {v9, v6}, LX8;->d(I)V

    iget-object v9, v13, Lv7;->e:Lks;

    iget-object v9, v9, Ltt;->e:Lh9;

    sub-int/2addr v6, v15

    invoke-virtual {v9, v6}, Lh9;->d(I)V

    :cond_2e
    invoke-virtual {v8}, LW8;->g()V

    const/4 v6, 0x1

    :goto_1f
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_20
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_30

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ltt;

    iget-object v10, v9, Ltt;->b:Lv7;

    if-ne v10, v13, :cond_2f

    iget-boolean v10, v9, Ltt;->g:Z

    if-nez v10, :cond_2f

    goto :goto_20

    :cond_2f
    invoke-virtual {v9}, Ltt;->e()V

    goto :goto_20

    :cond_30
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_31
    :goto_21
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_35

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ltt;

    if-nez v6, :cond_32

    iget-object v9, v8, Ltt;->b:Lv7;

    if-ne v9, v13, :cond_32

    goto :goto_21

    :cond_32
    iget-object v9, v8, Ltt;->h:LX8;

    iget-boolean v9, v9, LX8;->j:Z

    if-nez v9, :cond_33

    :goto_22
    const/4 v0, 0x0

    goto :goto_23

    :cond_33
    iget-object v9, v8, Ltt;->i:LX8;

    iget-boolean v9, v9, LX8;->j:Z

    if-nez v9, :cond_34

    instance-of v9, v8, Lfe;

    if-nez v9, :cond_34

    goto :goto_22

    :cond_34
    iget-object v9, v8, Ltt;->e:Lh9;

    iget-boolean v9, v9, LX8;->j:Z

    if-nez v9, :cond_31

    instance-of v9, v8, LF5;

    if-nez v9, :cond_31

    instance-of v8, v8, Lfe;

    if-nez v8, :cond_31

    goto :goto_22

    :cond_35
    const/4 v0, 0x1

    :goto_23
    invoke-virtual {v13, v2}, Lv7;->M(I)V

    invoke-virtual {v13, v14}, Lv7;->N(I)V

    move v6, v0

    const/high16 v0, 0x40000000    # 2.0f

    const/4 v2, 0x2

    goto/16 :goto_27

    :cond_36
    move/from16 v20, v0

    move-object/from16 v22, v6

    move/from16 v23, v9

    move/from16 v24, v10

    move-object/from16 v8, v17

    iget-boolean v0, v8, LW8;->b:Z

    iget-object v2, v8, LW8;->a:Lw7;

    if-eqz v0, :cond_38

    iget-object v0, v2, Lw7;->q0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_24
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_37

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lv7;

    invoke-virtual {v6}, Lv7;->h()V

    const/4 v9, 0x0

    iput-boolean v9, v6, Lv7;->a:Z

    iget-object v10, v6, Lv7;->d:Lwe;

    iget-object v12, v10, Ltt;->e:Lh9;

    iput-boolean v9, v12, LX8;->j:Z

    iput-boolean v9, v10, Ltt;->g:Z

    invoke-virtual {v10}, Lwe;->n()V

    iget-object v6, v6, Lv7;->e:Lks;

    iget-object v10, v6, Ltt;->e:Lh9;

    iput-boolean v9, v10, LX8;->j:Z

    iput-boolean v9, v6, Ltt;->g:Z

    invoke-virtual {v6}, Lks;->m()V

    goto :goto_24

    :cond_37
    const/4 v9, 0x0

    invoke-virtual {v2}, Lv7;->h()V

    iput-boolean v9, v2, Lv7;->a:Z

    iget-object v0, v2, Lv7;->d:Lwe;

    iget-object v6, v0, Ltt;->e:Lh9;

    iput-boolean v9, v6, LX8;->j:Z

    iput-boolean v9, v0, Ltt;->g:Z

    invoke-virtual {v0}, Lwe;->n()V

    iget-object v0, v2, Lv7;->e:Lks;

    iget-object v6, v0, Ltt;->e:Lh9;

    iput-boolean v9, v6, LX8;->j:Z

    iput-boolean v9, v0, Ltt;->g:Z

    invoke-virtual {v0}, Lks;->m()V

    invoke-virtual {v8}, LW8;->c()V

    goto :goto_25

    :cond_38
    const/4 v9, 0x0

    :goto_25
    iget-object v0, v8, LW8;->d:Lw7;

    invoke-virtual {v8, v0}, LW8;->b(Lw7;)V

    iput v9, v2, Lv7;->Y:I

    iput v9, v2, Lv7;->Z:I

    iget-object v0, v2, Lv7;->d:Lwe;

    iget-object v0, v0, Ltt;->h:LX8;

    invoke-virtual {v0, v9}, LX8;->d(I)V

    iget-object v0, v2, Lv7;->e:Lks;

    iget-object v0, v0, Ltt;->h:LX8;

    invoke-virtual {v0, v9}, LX8;->d(I)V

    const/high16 v0, 0x40000000    # 2.0f

    if-ne v3, v0, :cond_39

    invoke-virtual {v1, v9, v11}, Lw7;->T(IZ)Z

    move-result v2

    move v6, v2

    const/4 v2, 0x1

    goto :goto_26

    :cond_39
    const/4 v2, 0x0

    const/4 v6, 0x1

    :goto_26
    if-ne v5, v0, :cond_3a

    const/4 v8, 0x1

    invoke-virtual {v1, v8, v11}, Lw7;->T(IZ)Z

    move-result v9

    and-int/2addr v6, v9

    add-int/lit8 v2, v2, 0x1

    :cond_3a
    :goto_27
    if-eqz v6, :cond_3e

    if-ne v3, v0, :cond_3b

    const/4 v3, 0x1

    goto :goto_28

    :cond_3b
    const/4 v3, 0x0

    :goto_28
    if-ne v5, v0, :cond_3c

    const/4 v0, 0x1

    goto :goto_29

    :cond_3c
    const/4 v0, 0x0

    :goto_29
    invoke-virtual {v1, v3, v0}, Lw7;->P(ZZ)V

    goto :goto_2a

    :cond_3d
    move/from16 v20, v0

    move-object/from16 v22, v6

    move/from16 v23, v9

    move/from16 v24, v10

    const/4 v2, 0x0

    const/4 v6, 0x0

    :cond_3e
    :goto_2a
    if-eqz v6, :cond_3f

    const/4 v0, 0x2

    if-eq v2, v0, :cond_67

    :cond_3f
    iget v0, v1, Lw7;->D0:I

    if-lez v7, :cond_4e

    iget-object v2, v1, Lw7;->q0:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/16 v3, 0x40

    invoke-virtual {v1, v3}, Lw7;->W(I)Z

    move-result v3

    iget-object v5, v1, Lw7;->u0:Lm7;

    const/4 v15, 0x0

    :goto_2b
    if-ge v15, v2, :cond_4c

    iget-object v6, v1, Lw7;->q0:Ljava/util/ArrayList;

    invoke-virtual {v6, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lv7;

    instance-of v8, v6, Lee;

    if-eqz v8, :cond_40

    :goto_2c
    const/4 v8, 0x3

    const/4 v10, 0x0

    goto/16 :goto_31

    :cond_40
    instance-of v8, v6, LX3;

    if-eqz v8, :cond_41

    goto :goto_2c

    :cond_41
    iget-boolean v8, v6, Lv7;->F:Z

    if-eqz v8, :cond_42

    goto :goto_2c

    :cond_42
    if-eqz v3, :cond_43

    iget-object v8, v6, Lv7;->d:Lwe;

    if-eqz v8, :cond_43

    iget-object v9, v6, Lv7;->e:Lks;

    if-eqz v9, :cond_43

    iget-object v8, v8, Ltt;->e:Lh9;

    iget-boolean v8, v8, LX8;->j:Z

    if-eqz v8, :cond_43

    iget-object v8, v9, Ltt;->e:Lh9;

    iget-boolean v8, v8, LX8;->j:Z

    if-eqz v8, :cond_43

    goto :goto_2c

    :cond_43
    const/4 v8, 0x0

    invoke-virtual {v6, v8}, Lv7;->j(I)I

    move-result v9

    const/4 v8, 0x1

    invoke-virtual {v6, v8}, Lv7;->j(I)I

    move-result v10

    const/4 v11, 0x3

    if-ne v9, v11, :cond_44

    iget v12, v6, Lv7;->r:I

    if-eq v12, v8, :cond_44

    if-ne v10, v11, :cond_44

    iget v11, v6, Lv7;->s:I

    if-eq v11, v8, :cond_44

    move v11, v8

    goto :goto_2d

    :cond_44
    const/4 v11, 0x0

    :goto_2d
    if-nez v11, :cond_49

    invoke-virtual {v1, v8}, Lw7;->W(I)Z

    move-result v12

    if-eqz v12, :cond_49

    instance-of v8, v6, Lcc;

    if-nez v8, :cond_49

    const/4 v8, 0x3

    if-ne v9, v8, :cond_45

    iget v12, v6, Lv7;->r:I

    if-nez v12, :cond_45

    if-eq v10, v8, :cond_45

    invoke-virtual {v6}, Lv7;->x()Z

    move-result v12

    if-nez v12, :cond_45

    const/4 v11, 0x1

    :cond_45
    if-ne v10, v8, :cond_46

    iget v12, v6, Lv7;->s:I

    if-nez v12, :cond_46

    if-eq v9, v8, :cond_46

    invoke-virtual {v6}, Lv7;->x()Z

    move-result v12

    if-nez v12, :cond_46

    const/4 v11, 0x1

    :cond_46
    if-eq v9, v8, :cond_48

    if-ne v10, v8, :cond_47

    goto :goto_2f

    :cond_47
    :goto_2e
    const/4 v10, 0x0

    goto :goto_30

    :cond_48
    :goto_2f
    iget v9, v6, Lv7;->W:F

    const/4 v10, 0x0

    cmpl-float v9, v9, v10

    if-lez v9, :cond_4a

    const/4 v11, 0x1

    goto :goto_30

    :cond_49
    const/4 v8, 0x3

    goto :goto_2e

    :cond_4a
    :goto_30
    if-eqz v11, :cond_4b

    goto :goto_31

    :cond_4b
    const/4 v9, 0x0

    invoke-virtual {v4, v9, v5, v6}, LK2;->F(ILm7;Lv7;)Z

    :goto_31
    add-int/lit8 v15, v15, 0x1

    goto/16 :goto_2b

    :cond_4c
    iget-object v2, v5, Lm7;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    const/4 v15, 0x0

    :goto_32
    if-ge v15, v3, :cond_4d

    invoke-virtual {v2, v15}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    add-int/lit8 v15, v15, 0x1

    goto :goto_32

    :cond_4d
    iget-object v2, v2, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_4e

    const/4 v15, 0x0

    :goto_33
    if-ge v15, v3, :cond_4e

    invoke-virtual {v2, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lj7;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v15, v15, 0x1

    goto :goto_33

    :cond_4e
    invoke-virtual {v4, v1}, LK2;->Q(Lw7;)V

    iget-object v2, v4, LK2;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    move/from16 v5, v23

    move/from16 v6, v24

    const/4 v15, 0x0

    if-lez v7, :cond_4f

    invoke-virtual {v4, v1, v15, v5, v6}, LK2;->K(Lw7;III)V

    :cond_4f
    if-lez v3, :cond_66

    iget-object v7, v1, Lv7;->p0:[I

    aget v8, v7, v15

    const/4 v9, 0x2

    if-ne v8, v9, :cond_50

    const/4 v8, 0x1

    :goto_34
    const/4 v10, 0x1

    goto :goto_35

    :cond_50
    move v8, v15

    goto :goto_34

    :goto_35
    aget v7, v7, v10

    if-ne v7, v9, :cond_51

    const/4 v7, 0x1

    goto :goto_36

    :cond_51
    move v7, v15

    :goto_36
    invoke-virtual/range {p1 .. p1}, Lv7;->q()I

    move-result v9

    iget-object v10, v4, LK2;->d:Ljava/lang/Object;

    check-cast v10, Lw7;

    iget v11, v10, Lv7;->b0:I

    invoke-static {v9, v11}, Ljava/lang/Math;->max(II)I

    move-result v9

    invoke-virtual/range {p1 .. p1}, Lv7;->k()I

    move-result v11

    iget v10, v10, Lv7;->c0:I

    invoke-static {v11, v10}, Ljava/lang/Math;->max(II)I

    move-result v10

    move v11, v15

    move v12, v11

    :goto_37
    if-ge v11, v3, :cond_57

    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lv7;

    instance-of v15, v14, Lcc;

    if-nez v15, :cond_52

    move/from16 v16, v0

    move-object/from16 v1, v22

    goto/16 :goto_39

    :cond_52
    invoke-virtual {v14}, Lv7;->q()I

    move-result v15

    invoke-virtual {v14}, Lv7;->k()I

    move-result v13

    move/from16 v16, v0

    move-object/from16 v1, v22

    const/4 v0, 0x1

    invoke-virtual {v4, v0, v1, v14}, LK2;->F(ILm7;Lv7;)Z

    move-result v19

    or-int v0, v12, v19

    invoke-virtual {v14}, Lv7;->q()I

    move-result v12

    move/from16 v19, v0

    invoke-virtual {v14}, Lv7;->k()I

    move-result v0

    if-eq v12, v15, :cond_54

    invoke-virtual {v14, v12}, Lv7;->O(I)V

    if-eqz v8, :cond_53

    invoke-virtual {v14}, Lv7;->r()I

    move-result v12

    iget v15, v14, Lv7;->U:I

    add-int/2addr v12, v15

    if-le v12, v9, :cond_53

    invoke-virtual {v14}, Lv7;->r()I

    move-result v12

    iget v15, v14, Lv7;->U:I

    add-int/2addr v12, v15

    const/4 v15, 0x4

    invoke-virtual {v14, v15}, Lv7;->i(I)Lh7;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Lh7;->e()I

    move-result v15

    add-int/2addr v15, v12

    invoke-static {v9, v15}, Ljava/lang/Math;->max(II)I

    move-result v9

    :cond_53
    const/4 v15, 0x1

    goto :goto_38

    :cond_54
    move/from16 v15, v19

    :goto_38
    if-eq v0, v13, :cond_56

    invoke-virtual {v14, v0}, Lv7;->L(I)V

    if-eqz v7, :cond_55

    invoke-virtual {v14}, Lv7;->s()I

    move-result v0

    iget v12, v14, Lv7;->V:I

    add-int/2addr v0, v12

    if-le v0, v10, :cond_55

    invoke-virtual {v14}, Lv7;->s()I

    move-result v0

    iget v12, v14, Lv7;->V:I

    add-int/2addr v0, v12

    const/4 v12, 0x5

    invoke-virtual {v14, v12}, Lv7;->i(I)Lh7;

    move-result-object v12

    invoke-virtual {v12}, Lh7;->e()I

    move-result v12

    add-int/2addr v12, v0

    invoke-static {v10, v12}, Ljava/lang/Math;->max(II)I

    move-result v10

    :cond_55
    const/4 v15, 0x1

    :cond_56
    check-cast v14, Lcc;

    iget-boolean v0, v14, Lcc;->y0:Z

    or-int/2addr v0, v15

    move v12, v0

    :goto_39
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v22, v1

    move/from16 v0, v16

    const/4 v15, 0x0

    move-object/from16 v1, p1

    goto/16 :goto_37

    :cond_57
    move/from16 v16, v0

    move-object/from16 v1, v22

    const/4 v0, 0x0

    :goto_3a
    const/4 v15, 0x2

    if-ge v0, v15, :cond_65

    const/4 v11, 0x0

    :goto_3b
    if-ge v11, v3, :cond_64

    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lv7;

    instance-of v14, v13, Lve;

    if-eqz v14, :cond_58

    instance-of v14, v13, Lcc;

    if-eqz v14, :cond_5c

    :cond_58
    instance-of v14, v13, Lee;

    if-eqz v14, :cond_59

    goto :goto_3c

    :cond_59
    iget v14, v13, Lv7;->g0:I

    const/16 v15, 0x8

    if-ne v14, v15, :cond_5a

    goto :goto_3c

    :cond_5a
    if-eqz v20, :cond_5b

    iget-object v14, v13, Lv7;->d:Lwe;

    iget-object v14, v14, Ltt;->e:Lh9;

    iget-boolean v14, v14, LX8;->j:Z

    if-eqz v14, :cond_5b

    iget-object v14, v13, Lv7;->e:Lks;

    iget-object v14, v14, Ltt;->e:Lh9;

    iget-boolean v14, v14, LX8;->j:Z

    if-eqz v14, :cond_5b

    goto :goto_3c

    :cond_5b
    instance-of v14, v13, Lcc;

    if-eqz v14, :cond_5d

    :cond_5c
    :goto_3c
    move-object/from16 v22, v1

    move-object/from16 v19, v2

    move/from16 v21, v3

    const/4 v14, 0x4

    const/4 v15, 0x5

    goto/16 :goto_41

    :cond_5d
    invoke-virtual {v13}, Lv7;->q()I

    move-result v14

    invoke-virtual {v13}, Lv7;->k()I

    move-result v15

    move-object/from16 v19, v2

    iget v2, v13, Lv7;->a0:I

    move/from16 v21, v3

    const/4 v3, 0x1

    if-ne v0, v3, :cond_5e

    const/4 v3, 0x2

    :cond_5e
    invoke-virtual {v4, v3, v1, v13}, LK2;->F(ILm7;Lv7;)Z

    move-result v3

    or-int/2addr v3, v12

    invoke-virtual {v13}, Lv7;->q()I

    move-result v12

    move-object/from16 v22, v1

    invoke-virtual {v13}, Lv7;->k()I

    move-result v1

    if-eq v12, v14, :cond_60

    invoke-virtual {v13, v12}, Lv7;->O(I)V

    if-eqz v8, :cond_5f

    invoke-virtual {v13}, Lv7;->r()I

    move-result v3

    iget v12, v13, Lv7;->U:I

    add-int/2addr v3, v12

    if-le v3, v9, :cond_5f

    invoke-virtual {v13}, Lv7;->r()I

    move-result v3

    iget v12, v13, Lv7;->U:I

    add-int/2addr v3, v12

    const/4 v14, 0x4

    invoke-virtual {v13, v14}, Lv7;->i(I)Lh7;

    move-result-object v12

    invoke-virtual {v12}, Lh7;->e()I

    move-result v12

    add-int/2addr v12, v3

    invoke-static {v9, v12}, Ljava/lang/Math;->max(II)I

    move-result v9

    goto :goto_3d

    :cond_5f
    const/4 v14, 0x4

    :goto_3d
    const/4 v3, 0x1

    goto :goto_3e

    :cond_60
    const/4 v14, 0x4

    :goto_3e
    if-eq v1, v15, :cond_62

    invoke-virtual {v13, v1}, Lv7;->L(I)V

    if-eqz v7, :cond_61

    invoke-virtual {v13}, Lv7;->s()I

    move-result v1

    iget v3, v13, Lv7;->V:I

    add-int/2addr v1, v3

    if-le v1, v10, :cond_61

    invoke-virtual {v13}, Lv7;->s()I

    move-result v1

    iget v3, v13, Lv7;->V:I

    add-int/2addr v1, v3

    const/4 v15, 0x5

    invoke-virtual {v13, v15}, Lv7;->i(I)Lh7;

    move-result-object v3

    invoke-virtual {v3}, Lh7;->e()I

    move-result v3

    add-int/2addr v3, v1

    invoke-static {v10, v3}, Ljava/lang/Math;->max(II)I

    move-result v10

    goto :goto_3f

    :cond_61
    const/4 v15, 0x5

    :goto_3f
    const/4 v3, 0x1

    goto :goto_40

    :cond_62
    const/4 v15, 0x5

    :goto_40
    iget-boolean v1, v13, Lv7;->E:Z

    if-eqz v1, :cond_63

    iget v1, v13, Lv7;->a0:I

    if-eq v2, v1, :cond_63

    const/4 v12, 0x1

    goto :goto_41

    :cond_63
    move v12, v3

    :goto_41
    add-int/lit8 v11, v11, 0x1

    move-object/from16 v2, v19

    move/from16 v3, v21

    move-object/from16 v1, v22

    const/4 v15, 0x2

    goto/16 :goto_3b

    :cond_64
    move-object/from16 v22, v1

    move-object/from16 v19, v2

    move/from16 v21, v3

    const/4 v14, 0x4

    const/4 v15, 0x5

    if-eqz v12, :cond_65

    add-int/lit8 v0, v0, 0x1

    move-object/from16 v1, p1

    move-object/from16 v2, v22

    invoke-virtual {v4, v1, v0, v5, v6}, LK2;->K(Lw7;III)V

    move-object v1, v2

    move-object/from16 v2, v19

    move/from16 v3, v21

    const/4 v12, 0x0

    goto/16 :goto_3a

    :cond_65
    move-object/from16 v1, p1

    move/from16 v0, v16

    :cond_66
    iput v0, v1, Lw7;->D0:I

    const/16 v0, 0x200

    invoke-virtual {v1, v0}, Lw7;->W(I)Z

    move-result v0

    sput-boolean v0, LQg;->p:Z

    :cond_67
    return-void
.end method

.method public final k(Lv7;Ll7;Landroid/util/SparseArray;II)V
    .locals 2

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, p4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {p3, p4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lv7;

    if-eqz p3, :cond_1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p4

    instance-of p4, p4, Ll7;

    if-eqz p4, :cond_1

    const/4 p4, 0x1

    iput-boolean p4, p2, Ll7;->c0:Z

    const/4 v1, 0x6

    if-ne p5, v1, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll7;

    iput-boolean p4, v0, Ll7;->c0:Z

    iget-object v0, v0, Ll7;->p0:Lv7;

    iput-boolean p4, v0, Lv7;->E:Z

    :cond_0
    invoke-virtual {p1, v1}, Lv7;->i(I)Lh7;

    move-result-object v0

    invoke-virtual {p3, p5}, Lv7;->i(I)Lh7;

    move-result-object p3

    iget p5, p2, Ll7;->D:I

    iget p2, p2, Ll7;->C:I

    invoke-virtual {v0, p3, p5, p2, p4}, Lh7;->b(Lh7;IIZ)Z

    iput-boolean p4, p1, Lv7;->E:Z

    const/4 p2, 0x3

    invoke-virtual {p1, p2}, Lv7;->i(I)Lh7;

    move-result-object p2

    invoke-virtual {p2}, Lh7;->j()V

    const/4 p2, 0x5

    invoke-virtual {p1, p2}, Lv7;->i(I)Lh7;

    move-result-object p1

    invoke-virtual {p1}, Lh7;->j()V

    :cond_1
    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result p2

    const/4 p3, 0x0

    move p4, p3

    :goto_0
    if-ge p4, p1, :cond_1

    invoke-virtual {p0, p4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p5

    invoke-virtual {p5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll7;

    iget-object v1, v0, Ll7;->p0:Lv7;

    invoke-virtual {p5}, Landroid/view/View;->getVisibility()I

    move-result v2

    const/16 v3, 0x8

    if-ne v2, v3, :cond_0

    iget-boolean v2, v0, Ll7;->d0:Z

    if-nez v2, :cond_0

    iget-boolean v0, v0, Ll7;->e0:Z

    if-nez v0, :cond_0

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Lv7;->r()I

    move-result v0

    invoke-virtual {v1}, Lv7;->s()I

    move-result v2

    invoke-virtual {v1}, Lv7;->q()I

    move-result v3

    add-int/2addr v3, v0

    invoke-virtual {v1}, Lv7;->k()I

    move-result v1

    add-int/2addr v1, v2

    invoke-virtual {p5, v0, v2, v3, v1}, Landroid/view/View;->layout(IIII)V

    :goto_1
    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lez p2, :cond_2

    :goto_2
    if-ge p3, p2, :cond_2

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Lj7;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 p3, p3, 0x1

    goto :goto_2

    :cond_2
    return-void
.end method

.method public onMeasure(II)V
    .locals 23

    move-object/from16 v6, p0

    move/from16 v7, p1

    move/from16 v8, p2

    iget v0, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->p:I

    if-ne v0, v7, :cond_0

    iget v0, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->q:I

    :cond_0
    iget-boolean v0, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Z

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-nez v0, :cond_2

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    move v1, v9

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {v6, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->isLayoutRequested()Z

    move-result v2

    if-eqz v2, :cond_1

    iput-boolean v10, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Z

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    iput v7, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->p:I

    iput v8, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->q:I

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    const/high16 v1, 0x400000

    and-int/2addr v0, v1

    if-eqz v0, :cond_3

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v0

    if-ne v10, v0, :cond_3

    move v0, v10

    goto :goto_2

    :cond_3
    move v0, v9

    :goto_2
    iget-object v11, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lw7;

    iput-boolean v0, v11, Lw7;->v0:Z

    iget-boolean v0, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Z

    if-eqz v0, :cond_4e

    iput-boolean v9, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Z

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    move v1, v9

    :goto_3
    if-ge v1, v0, :cond_5

    invoke-virtual {v6, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->isLayoutRequested()Z

    move-result v2

    if-eqz v2, :cond_4

    move v12, v10

    goto :goto_4

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_5
    move v12, v9

    :goto_4
    if-eqz v12, :cond_4d

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->isInEditMode()Z

    move-result v13

    invoke-virtual/range {p0 .. p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v14

    move v0, v9

    :goto_5
    if-ge v0, v14, :cond_7

    invoke-virtual {v6, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v6, v1}, Landroidx/constraintlayout/widget/ConstraintLayout;->g(Landroid/view/View;)Lv7;

    move-result-object v1

    if-nez v1, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Lv7;->C()V

    :goto_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_7
    const/4 v0, 0x0

    const/4 v15, -0x1

    if-eqz v13, :cond_10

    move v1, v9

    :goto_7
    if-ge v1, v14, :cond_10

    invoke-virtual {v6, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    :try_start_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    instance-of v5, v3, Ljava/lang/String;

    if-eqz v5, :cond_a

    iget-object v5, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Ljava/util/HashMap;

    if-nez v5, :cond_8

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    iput-object v5, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Ljava/util/HashMap;

    :cond_8
    const-string v5, "/"

    invoke-virtual {v3, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    if-eq v5, v15, :cond_9

    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v3, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_8

    :cond_9
    move-object v5, v3

    :goto_8
    iget-object v10, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Ljava/util/HashMap;

    invoke-virtual {v10, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a
    const/16 v4, 0x2f

    invoke-virtual {v3, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    if-eq v4, v15, :cond_b

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v3, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    :cond_b
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v2

    if-nez v2, :cond_c

    :goto_9
    move-object v2, v11

    goto :goto_a

    :cond_c
    iget-object v4, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    invoke-virtual {v4, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    if-nez v4, :cond_d

    invoke-virtual {v6, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    if-eqz v4, :cond_d

    if-eq v4, v6, :cond_d

    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-ne v2, v6, :cond_d

    invoke-virtual {v6, v4}, Landroidx/constraintlayout/widget/ConstraintLayout;->onViewAdded(Landroid/view/View;)V

    :cond_d
    if-ne v4, v6, :cond_e

    goto :goto_9

    :cond_e
    if-nez v4, :cond_f

    move-object v2, v0

    goto :goto_a

    :cond_f
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Ll7;

    iget-object v2, v2, Ll7;->p0:Lv7;

    :goto_a
    iput-object v3, v2, Lv7;->h0:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    add-int/lit8 v1, v1, 0x1

    const/4 v10, 0x1

    goto/16 :goto_7

    :cond_10
    iget v1, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    if-eq v1, v15, :cond_11

    move v1, v9

    :goto_b
    if-ge v1, v14, :cond_11

    invoke-virtual {v6, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    add-int/lit8 v1, v1, 0x1

    goto :goto_b

    :cond_11
    iget-object v1, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Lu7;

    if-eqz v1, :cond_12

    invoke-virtual {v1, v6}, Lu7;->a(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    :cond_12
    iget-object v1, v11, Lw7;->q0:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v1, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_1a

    move v3, v9

    :goto_c
    if-ge v3, v2, :cond_1a

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lj7;

    invoke-virtual {v4}, Landroid/view/View;->isInEditMode()Z

    move-result v5

    if-eqz v5, :cond_13

    iget-object v5, v4, Lj7;->e:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lj7;->setIds(Ljava/lang/String;)V

    :cond_13
    iget-object v5, v4, Lj7;->d:Lve;

    if-nez v5, :cond_14

    move-object/from16 v17, v1

    goto/16 :goto_10

    :cond_14
    iput v9, v5, Lve;->r0:I

    iget-object v5, v5, Lve;->q0:[Lv7;

    invoke-static {v5, v0}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    move v5, v9

    :goto_d
    iget v0, v4, Lj7;->b:I

    if-ge v5, v0, :cond_19

    iget-object v0, v4, Lj7;->a:[I

    aget v0, v0, v5

    iget-object v15, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    invoke-virtual {v15, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Landroid/view/View;

    if-nez v15, :cond_15

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v9, v4, Lj7;->g:Ljava/util/HashMap;

    invoke-virtual {v9, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v4, v6, v0}, Lj7;->f(Landroidx/constraintlayout/widget/ConstraintLayout;Ljava/lang/String;)I

    move-result v10

    if-eqz v10, :cond_15

    iget-object v15, v4, Lj7;->a:[I

    aput v10, v15, v5

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-virtual {v9, v15, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    invoke-virtual {v0, v10}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Landroid/view/View;

    :cond_15
    if-eqz v15, :cond_18

    iget-object v0, v4, Lj7;->d:Lve;

    invoke-virtual {v6, v15}, Landroidx/constraintlayout/widget/ConstraintLayout;->g(Landroid/view/View;)Lv7;

    move-result-object v9

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eq v9, v0, :cond_18

    if-nez v9, :cond_16

    goto :goto_e

    :cond_16
    iget v10, v0, Lve;->r0:I

    const/4 v15, 0x1

    add-int/2addr v10, v15

    iget-object v15, v0, Lve;->q0:[Lv7;

    move-object/from16 v17, v1

    array-length v1, v15

    if-le v10, v1, :cond_17

    array-length v1, v15

    const/4 v10, 0x2

    mul-int/2addr v1, v10

    invoke-static {v15, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lv7;

    iput-object v1, v0, Lve;->q0:[Lv7;

    :cond_17
    iget-object v1, v0, Lve;->q0:[Lv7;

    iget v10, v0, Lve;->r0:I

    aput-object v9, v1, v10

    const/4 v1, 0x1

    add-int/2addr v10, v1

    iput v10, v0, Lve;->r0:I

    goto :goto_f

    :cond_18
    :goto_e
    move-object/from16 v17, v1

    :goto_f
    add-int/lit8 v5, v5, 0x1

    move-object/from16 v1, v17

    const/4 v9, 0x0

    const/4 v15, -0x1

    goto :goto_d

    :cond_19
    move-object/from16 v17, v1

    iget-object v0, v4, Lj7;->d:Lve;

    invoke-virtual {v0}, Lve;->S()V

    :goto_10
    add-int/lit8 v3, v3, 0x1

    move-object/from16 v1, v17

    const/4 v0, 0x0

    const/4 v9, 0x0

    const/4 v15, -0x1

    goto/16 :goto_c

    :cond_1a
    const/4 v0, 0x0

    :goto_11
    if-ge v0, v14, :cond_1b

    invoke-virtual {v6, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    add-int/lit8 v0, v0, 0x1

    goto :goto_11

    :cond_1b
    iget-object v9, v6, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Landroid/util/SparseArray;

    invoke-virtual {v9}, Landroid/util/SparseArray;->clear()V

    const/4 v0, 0x0

    invoke-virtual {v9, v0, v11}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getId()I

    move-result v0

    invoke-virtual {v9, v0, v11}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/4 v0, 0x0

    :goto_12
    if-ge v0, v14, :cond_1c

    invoke-virtual {v6, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v6, v1}, Landroidx/constraintlayout/widget/ConstraintLayout;->g(Landroid/view/View;)Lv7;

    move-result-object v2

    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v1

    invoke-virtual {v9, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_12

    :cond_1c
    const/4 v10, 0x0

    :goto_13
    if-ge v10, v14, :cond_4d

    invoke-virtual {v6, v10}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroidx/constraintlayout/widget/ConstraintLayout;->g(Landroid/view/View;)Lv7;

    move-result-object v15

    if-nez v15, :cond_1e

    :cond_1d
    :goto_14
    move/from16 v16, v14

    const/4 v0, 0x2

    const/4 v3, 0x1

    const/4 v4, -0x1

    goto/16 :goto_29

    :cond_1e
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Ll7;

    iget-object v1, v11, Lw7;->q0:Ljava/util/ArrayList;

    invoke-virtual {v1, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, v15, Lv7;->T:Lv7;

    if-eqz v1, :cond_1f

    check-cast v1, Lw7;

    iget-object v1, v1, Lw7;->q0:Ljava/util/ArrayList;

    invoke-virtual {v1, v15}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v15}, Lv7;->C()V

    :cond_1f
    iput-object v11, v15, Lv7;->T:Lv7;

    invoke-virtual {v5}, Ll7;->a()V

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    iput v1, v15, Lv7;->g0:I

    iput-object v0, v15, Lv7;->f0:Ljava/lang/Object;

    instance-of v1, v0, Lj7;

    if-eqz v1, :cond_20

    check-cast v0, Lj7;

    iget-boolean v1, v11, Lw7;->v0:Z

    invoke-virtual {v0, v15, v1}, Lj7;->h(Lv7;Z)V

    :cond_20
    iget-boolean v0, v5, Ll7;->d0:Z

    if-eqz v0, :cond_24

    check-cast v15, Lee;

    iget v0, v5, Ll7;->m0:I

    iget v1, v5, Ll7;->n0:I

    iget v2, v5, Ll7;->o0:F

    const/high16 v3, -0x40800000    # -1.0f

    cmpl-float v4, v2, v3

    if-eqz v4, :cond_22

    if-lez v4, :cond_21

    iput v2, v15, Lee;->q0:F

    const/4 v2, -0x1

    iput v2, v15, Lee;->r0:I

    iput v2, v15, Lee;->s0:I

    goto :goto_14

    :cond_21
    const/4 v2, -0x1

    goto :goto_14

    :cond_22
    const/4 v2, -0x1

    if-eq v0, v2, :cond_23

    if-le v0, v2, :cond_1d

    iput v3, v15, Lee;->q0:F

    iput v0, v15, Lee;->r0:I

    iput v2, v15, Lee;->s0:I

    goto :goto_14

    :cond_23
    if-eq v1, v2, :cond_1d

    if-le v1, v2, :cond_1d

    iput v3, v15, Lee;->q0:F

    iput v2, v15, Lee;->r0:I

    iput v1, v15, Lee;->s0:I

    goto :goto_14

    :cond_24
    iget v0, v5, Ll7;->f0:I

    iget v1, v5, Ll7;->g0:I

    iget v2, v5, Ll7;->h0:I

    iget v3, v5, Ll7;->i0:I

    iget v4, v5, Ll7;->j0:I

    move/from16 v16, v14

    iget v14, v5, Ll7;->k0:I

    iget v7, v5, Ll7;->l0:F

    iget v8, v5, Ll7;->p:I

    const/4 v6, -0x1

    if-eq v8, v6, :cond_26

    invoke-virtual {v9, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v22, v0

    check-cast v22, Lv7;

    if-eqz v22, :cond_25

    iget v0, v5, Ll7;->r:F

    iget v1, v5, Ll7;->q:I

    const/16 v19, 0x7

    const/16 v21, 0x0

    move-object/from16 v17, v15

    move/from16 v18, v19

    move/from16 v20, v1

    invoke-virtual/range {v17 .. v22}, Lv7;->v(IIIILv7;)V

    iput v0, v15, Lv7;->D:F

    :cond_25
    move-object v14, v5

    goto/16 :goto_1c

    :cond_26
    if-eq v0, v6, :cond_28

    invoke-virtual {v9, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v22, v0

    check-cast v22, Lv7;

    if-eqz v22, :cond_27

    iget v0, v5, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    move-object/from16 v17, v15

    const/4 v1, 0x2

    move/from16 v18, v1

    move/from16 v19, v1

    move/from16 v20, v0

    move/from16 v21, v4

    invoke-virtual/range {v17 .. v22}, Lv7;->v(IIIILv7;)V

    :cond_27
    :goto_15
    const/4 v0, -0x1

    goto :goto_16

    :cond_28
    move v0, v6

    if-eq v1, v0, :cond_29

    invoke-virtual {v9, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v22, v0

    check-cast v22, Lv7;

    if-eqz v22, :cond_27

    iget v0, v5, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    move-object/from16 v17, v15

    const/4 v1, 0x2

    move/from16 v18, v1

    const/4 v1, 0x4

    move/from16 v19, v1

    move/from16 v20, v0

    move/from16 v21, v4

    invoke-virtual/range {v17 .. v22}, Lv7;->v(IIIILv7;)V

    goto :goto_15

    :cond_29
    :goto_16
    if-eq v2, v0, :cond_2a

    invoke-virtual {v9, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v22, v0

    check-cast v22, Lv7;

    if-eqz v22, :cond_2b

    iget v0, v5, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    move-object/from16 v17, v15

    const/4 v1, 0x4

    move/from16 v18, v1

    const/4 v1, 0x2

    move/from16 v19, v1

    move/from16 v20, v0

    move/from16 v21, v14

    invoke-virtual/range {v17 .. v22}, Lv7;->v(IIIILv7;)V

    goto :goto_17

    :cond_2a
    if-eq v3, v0, :cond_2b

    invoke-virtual {v9, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v22, v0

    check-cast v22, Lv7;

    if-eqz v22, :cond_2b

    iget v0, v5, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    move-object/from16 v17, v15

    const/4 v1, 0x4

    move/from16 v18, v1

    move/from16 v19, v1

    move/from16 v20, v0

    move/from16 v21, v14

    invoke-virtual/range {v17 .. v22}, Lv7;->v(IIIILv7;)V

    :cond_2b
    :goto_17
    iget v0, v5, Ll7;->i:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2c

    invoke-virtual {v9, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v22, v0

    check-cast v22, Lv7;

    if-eqz v22, :cond_2d

    iget v0, v5, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v1, v5, Ll7;->x:I

    move-object/from16 v17, v15

    const/4 v2, 0x3

    move/from16 v18, v2

    move/from16 v19, v2

    move/from16 v20, v0

    move/from16 v21, v1

    invoke-virtual/range {v17 .. v22}, Lv7;->v(IIIILv7;)V

    goto :goto_18

    :cond_2c
    iget v0, v5, Ll7;->j:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2d

    invoke-virtual {v9, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v22, v0

    check-cast v22, Lv7;

    if-eqz v22, :cond_2d

    iget v0, v5, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v1, v5, Ll7;->x:I

    move-object/from16 v17, v15

    const/4 v2, 0x3

    move/from16 v18, v2

    const/4 v2, 0x5

    move/from16 v19, v2

    move/from16 v20, v0

    move/from16 v21, v1

    invoke-virtual/range {v17 .. v22}, Lv7;->v(IIIILv7;)V

    :cond_2d
    :goto_18
    iget v0, v5, Ll7;->k:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2e

    invoke-virtual {v9, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v22, v0

    check-cast v22, Lv7;

    if-eqz v22, :cond_2f

    iget v0, v5, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v1, v5, Ll7;->z:I

    move-object/from16 v17, v15

    const/4 v2, 0x5

    move/from16 v18, v2

    const/4 v2, 0x3

    move/from16 v19, v2

    move/from16 v20, v0

    move/from16 v21, v1

    invoke-virtual/range {v17 .. v22}, Lv7;->v(IIIILv7;)V

    goto :goto_19

    :cond_2e
    iget v0, v5, Ll7;->l:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2f

    invoke-virtual {v9, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v22, v0

    check-cast v22, Lv7;

    if-eqz v22, :cond_2f

    iget v0, v5, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v1, v5, Ll7;->z:I

    move-object/from16 v17, v15

    const/4 v2, 0x5

    move/from16 v18, v2

    move/from16 v19, v2

    move/from16 v20, v0

    move/from16 v21, v1

    invoke-virtual/range {v17 .. v22}, Lv7;->v(IIIILv7;)V

    :cond_2f
    :goto_19
    iget v4, v5, Ll7;->m:I

    const/4 v6, -0x1

    if-eq v4, v6, :cond_31

    const/4 v8, 0x6

    move-object/from16 v0, p0

    move-object v1, v15

    move-object v2, v5

    move-object v3, v9

    move-object v14, v5

    move v5, v8

    invoke-virtual/range {v0 .. v5}, Landroidx/constraintlayout/widget/ConstraintLayout;->k(Lv7;Ll7;Landroid/util/SparseArray;II)V

    :cond_30
    :goto_1a
    const/4 v0, 0x0

    goto :goto_1b

    :cond_31
    move-object v14, v5

    iget v4, v14, Ll7;->n:I

    if-eq v4, v6, :cond_32

    move-object/from16 v0, p0

    move-object v1, v15

    move-object v2, v14

    move-object v3, v9

    const/4 v8, 0x3

    move v5, v8

    invoke-virtual/range {v0 .. v5}, Landroidx/constraintlayout/widget/ConstraintLayout;->k(Lv7;Ll7;Landroid/util/SparseArray;II)V

    goto :goto_1a

    :cond_32
    iget v4, v14, Ll7;->o:I

    if-eq v4, v6, :cond_30

    move-object/from16 v0, p0

    move-object v1, v15

    move-object v2, v14

    move-object v3, v9

    const/4 v6, 0x5

    move v5, v6

    invoke-virtual/range {v0 .. v5}, Landroidx/constraintlayout/widget/ConstraintLayout;->k(Lv7;Ll7;Landroid/util/SparseArray;II)V

    goto :goto_1a

    :goto_1b
    cmpl-float v1, v7, v0

    if-ltz v1, :cond_33

    iput v7, v15, Lv7;->d0:F

    :cond_33
    iget v1, v14, Ll7;->F:F

    cmpl-float v2, v1, v0

    if-ltz v2, :cond_34

    iput v1, v15, Lv7;->e0:F

    :cond_34
    :goto_1c
    if-eqz v13, :cond_36

    iget v0, v14, Ll7;->T:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_35

    iget v2, v14, Ll7;->U:I

    if-eq v2, v1, :cond_36

    :cond_35
    iget v1, v14, Ll7;->U:I

    iput v0, v15, Lv7;->Y:I

    iput v1, v15, Lv7;->Z:I

    :cond_36
    iget-boolean v0, v14, Ll7;->a0:Z

    const/4 v1, 0x3

    const/4 v2, 0x4

    const/4 v3, -0x2

    if-nez v0, :cond_39

    iget v0, v14, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    const/4 v4, -0x1

    if-ne v0, v4, :cond_38

    iget-boolean v0, v14, Ll7;->W:Z

    if-eqz v0, :cond_37

    invoke-virtual {v15, v1}, Lv7;->M(I)V

    :goto_1d
    const/4 v0, 0x2

    goto :goto_1e

    :cond_37
    invoke-virtual {v15, v2}, Lv7;->M(I)V

    goto :goto_1d

    :goto_1e
    invoke-virtual {v15, v0}, Lv7;->i(I)Lh7;

    move-result-object v0

    iget v4, v14, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v4, v0, Lh7;->g:I

    const/4 v0, 0x4

    invoke-virtual {v15, v0}, Lv7;->i(I)Lh7;

    move-result-object v0

    iget v4, v14, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iput v4, v0, Lh7;->g:I

    goto :goto_1f

    :cond_38
    invoke-virtual {v15, v1}, Lv7;->M(I)V

    const/4 v0, 0x0

    invoke-virtual {v15, v0}, Lv7;->O(I)V

    goto :goto_1f

    :cond_39
    const/4 v0, 0x1

    invoke-virtual {v15, v0}, Lv7;->M(I)V

    iget v0, v14, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-virtual {v15, v0}, Lv7;->O(I)V

    iget v0, v14, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    if-ne v0, v3, :cond_3a

    const/4 v0, 0x2

    invoke-virtual {v15, v0}, Lv7;->M(I)V

    :cond_3a
    :goto_1f
    iget-boolean v0, v14, Ll7;->b0:Z

    if-nez v0, :cond_3d

    iget v0, v14, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    const/4 v4, -0x1

    if-ne v0, v4, :cond_3c

    iget-boolean v0, v14, Ll7;->X:Z

    if-eqz v0, :cond_3b

    invoke-virtual {v15, v1}, Lv7;->N(I)V

    :goto_20
    const/4 v0, 0x3

    goto :goto_21

    :cond_3b
    invoke-virtual {v15, v2}, Lv7;->N(I)V

    goto :goto_20

    :goto_21
    invoke-virtual {v15, v0}, Lv7;->i(I)Lh7;

    move-result-object v0

    iget v2, v14, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput v2, v0, Lh7;->g:I

    const/4 v0, 0x5

    invoke-virtual {v15, v0}, Lv7;->i(I)Lh7;

    move-result-object v0

    iget v2, v14, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iput v2, v0, Lh7;->g:I

    goto :goto_22

    :cond_3c
    invoke-virtual {v15, v1}, Lv7;->N(I)V

    const/4 v0, 0x0

    invoke-virtual {v15, v0}, Lv7;->L(I)V

    goto :goto_22

    :cond_3d
    const/4 v0, 0x1

    const/4 v4, -0x1

    invoke-virtual {v15, v0}, Lv7;->N(I)V

    iget v0, v14, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-virtual {v15, v0}, Lv7;->L(I)V

    iget v0, v14, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    if-ne v0, v3, :cond_3e

    const/4 v0, 0x2

    invoke-virtual {v15, v0}, Lv7;->N(I)V

    :cond_3e
    :goto_22
    iget-object v0, v14, Ll7;->G:Ljava/lang/String;

    if-eqz v0, :cond_3f

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_40

    :cond_3f
    const/4 v2, 0x0

    goto/16 :goto_27

    :cond_40
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x2c

    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    if-lez v3, :cond_43

    add-int/lit8 v5, v2, -0x1

    if-ge v3, v5, :cond_43

    const/4 v5, 0x0

    invoke-virtual {v0, v5, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    const-string v5, "W"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_41

    const/4 v5, 0x0

    goto :goto_23

    :cond_41
    const-string v5, "H"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_42

    const/4 v5, 0x1

    goto :goto_23

    :cond_42
    move v5, v4

    :goto_23
    add-int/lit8 v3, v3, 0x1

    goto :goto_24

    :cond_43
    move v5, v4

    const/4 v3, 0x0

    :goto_24
    const/16 v6, 0x3a

    invoke-virtual {v0, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    if-ltz v6, :cond_45

    add-int/lit8 v2, v2, -0x1

    if-ge v6, v2, :cond_45

    invoke-virtual {v0, v3, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v0, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_46

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_46

    :try_start_1
    invoke-static {v2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v2

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    const/4 v3, 0x0

    cmpl-float v6, v2, v3

    if-lez v6, :cond_46

    cmpl-float v6, v0, v3

    if-lez v6, :cond_46

    const/4 v3, 0x1

    if-ne v5, v3, :cond_44

    div-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    goto :goto_25

    :cond_44
    div-float/2addr v2, v0

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_25
    const/4 v2, 0x0

    goto :goto_26

    :cond_45
    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_46

    :try_start_2
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_25

    :catch_1
    :cond_46
    const/4 v0, 0x0

    goto :goto_25

    :goto_26
    cmpl-float v3, v0, v2

    if-lez v3, :cond_47

    iput v0, v15, Lv7;->W:F

    iput v5, v15, Lv7;->X:I

    goto :goto_28

    :goto_27
    iput v2, v15, Lv7;->W:F

    :cond_47
    :goto_28
    iget v0, v14, Ll7;->H:F

    iget-object v2, v15, Lv7;->k0:[F

    const/4 v3, 0x0

    aput v0, v2, v3

    iget v0, v14, Ll7;->I:F

    const/4 v3, 0x1

    aput v0, v2, v3

    iget v0, v14, Ll7;->J:I

    iput v0, v15, Lv7;->i0:I

    iget v0, v14, Ll7;->K:I

    iput v0, v15, Lv7;->j0:I

    iget v0, v14, Ll7;->Z:I

    if-ltz v0, :cond_48

    if-gt v0, v1, :cond_48

    iput v0, v15, Lv7;->q:I

    :cond_48
    iget v0, v14, Ll7;->L:I

    iget v1, v14, Ll7;->N:I

    iget v2, v14, Ll7;->P:I

    iget v5, v14, Ll7;->R:F

    iput v0, v15, Lv7;->r:I

    iput v1, v15, Lv7;->u:I

    const v1, 0x7fffffff

    if-ne v2, v1, :cond_49

    const/4 v2, 0x0

    :cond_49
    iput v2, v15, Lv7;->v:I

    iput v5, v15, Lv7;->w:F

    const/4 v2, 0x0

    cmpl-float v6, v5, v2

    const/high16 v2, 0x3f800000    # 1.0f

    if-lez v6, :cond_4a

    cmpg-float v5, v5, v2

    if-gez v5, :cond_4a

    if-nez v0, :cond_4a

    const/4 v0, 0x2

    iput v0, v15, Lv7;->r:I

    :cond_4a
    iget v0, v14, Ll7;->M:I

    iget v5, v14, Ll7;->O:I

    iget v6, v14, Ll7;->Q:I

    iget v7, v14, Ll7;->S:F

    iput v0, v15, Lv7;->s:I

    iput v5, v15, Lv7;->x:I

    if-ne v6, v1, :cond_4b

    const/4 v6, 0x0

    :cond_4b
    iput v6, v15, Lv7;->y:I

    iput v7, v15, Lv7;->z:F

    const/4 v1, 0x0

    cmpl-float v1, v7, v1

    if-lez v1, :cond_4c

    cmpg-float v1, v7, v2

    if-gez v1, :cond_4c

    if-nez v0, :cond_4c

    const/4 v0, 0x2

    iput v0, v15, Lv7;->s:I

    goto :goto_29

    :cond_4c
    const/4 v0, 0x2

    :goto_29
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v6, p0

    move/from16 v7, p1

    move/from16 v8, p2

    move/from16 v14, v16

    goto/16 :goto_13

    :cond_4d
    if-eqz v12, :cond_4e

    iget-object v0, v11, Lw7;->r0:LK2;

    invoke-virtual {v0, v11}, LK2;->Q(Lw7;)V

    :cond_4e
    move-object/from16 v0, p0

    iget v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    move/from16 v2, p1

    move/from16 v3, p2

    invoke-virtual {v0, v11, v1, v2, v3}, Landroidx/constraintlayout/widget/ConstraintLayout;->j(Lw7;III)V

    invoke-virtual {v11}, Lv7;->q()I

    move-result v1

    invoke-virtual {v11}, Lv7;->k()I

    move-result v4

    iget-boolean v5, v11, Lw7;->E0:Z

    iget-boolean v6, v11, Lw7;->F0:Z

    iget-object v7, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Lm7;

    iget v8, v7, Lm7;->e:I

    iget v7, v7, Lm7;->d:I

    add-int/2addr v1, v7

    add-int/2addr v4, v8

    const/4 v7, 0x0

    invoke-static {v1, v2, v7}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v1

    invoke-static {v4, v3, v7}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v2

    const v3, 0xffffff

    and-int/2addr v1, v3

    and-int/2addr v2, v3

    iget v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    invoke-static {v3, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    iget v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    const/high16 v3, 0x1000000

    if-eqz v5, :cond_4f

    or-int/2addr v1, v3

    :cond_4f
    if-eqz v6, :cond_50

    or-int/2addr v2, v3

    :cond_50
    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public final onViewAdded(Landroid/view/View;)V
    .locals 4

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onViewAdded(Landroid/view/View;)V

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->g(Landroid/view/View;)Lv7;

    move-result-object v0

    instance-of v1, p1, Landroidx/constraintlayout/widget/Guideline;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    instance-of v0, v0, Lee;

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll7;

    new-instance v1, Lee;

    invoke-direct {v1}, Lee;-><init>()V

    iput-object v1, v0, Ll7;->p0:Lv7;

    iput-boolean v2, v0, Ll7;->d0:Z

    iget v0, v0, Ll7;->V:I

    invoke-virtual {v1, v0}, Lee;->S(I)V

    :cond_0
    instance-of v0, p1, Lj7;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lj7;

    invoke-virtual {v0}, Lj7;->i()V

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Ll7;

    iput-boolean v2, v1, Ll7;->e0:Z

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    invoke-virtual {v1, v0, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iput-boolean v2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Z

    return-void
.end method

.method public onViewRemoved(Landroid/view/View;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onViewRemoved(Landroid/view/View;)V

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->remove(I)V

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->g(Landroid/view/View;)Lv7;

    move-result-object v0

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lw7;

    iget-object v1, v1, Lw7;->q0:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lv7;->C()V

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Z

    return-void
.end method

.method public final requestLayout()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Z

    invoke-super {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setConstraintSet(Lu7;)V
    .locals 0

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Lu7;

    return-void
.end method

.method public setId(I)V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v0

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->remove(I)V

    invoke-super {p0, p1}, Landroid/view/View;->setId(I)V

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result p1

    invoke-virtual {v1, p1, p0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void
.end method

.method public setMaxHeight(I)V
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setMaxWidth(I)V
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setMinHeight(I)V
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setMinWidth(I)V
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setOnConstraintsChanged(Lx7;)V
    .locals 0

    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:Ld2;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    return-void
.end method

.method public setOptimizationLevel(I)V
    .locals 1

    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:Lw7;

    iput p1, v0, Lw7;->D0:I

    const/16 p1, 0x200

    invoke-virtual {v0, p1}, Lw7;->W(I)Z

    move-result p1

    sput-boolean p1, LQg;->p:Z

    return-void
.end method

.method public final shouldDelayChildPressedState()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
