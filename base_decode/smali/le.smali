.class public final Lle;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public final a:Landroid/graphics/Paint;

.field public final b:Landroid/graphics/RectF;

.field public final c:Landroid/animation/ArgbEvaluator;

.field public final d:Landroid/view/animation/AccelerateDecelerateInterpolator;

.field public e:Z

.field public f:F

.field public g:Lke;

.field public h:Z

.field public i:J

.field public j:F

.field public k:F

.field public final l:Lr0;

.field public final m:I

.field public final n:I

.field public final o:I

.field public final p:F

.field public final q:F

.field public final r:F

.field public final s:I

.field public final t:I

.field public final u:I

.field public final v:I

.field public final w:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance p1, Landroid/graphics/Paint;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lle;->a:Landroid/graphics/Paint;

    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lle;->b:Landroid/graphics/RectF;

    new-instance p1, Landroid/animation/ArgbEvaluator;

    invoke-direct {p1}, Landroid/animation/ArgbEvaluator;-><init>()V

    iput-object p1, p0, Lle;->c:Landroid/animation/ArgbEvaluator;

    new-instance p1, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {p1}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    iput-object p1, p0, Lle;->d:Landroid/view/animation/AccelerateDecelerateInterpolator;

    new-instance p1, Lr0;

    const/16 v0, 0x9

    invoke-direct {p1, p0, v0}, Lr0;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lle;->l:Lr0;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    const/high16 v0, 0x42820000    # 65.0f

    mul-float/2addr v0, p1

    float-to-int v0, v0

    iput v0, p0, Lle;->n:I

    iput p1, p0, Lle;->r:F

    div-int/lit8 v1, v0, 0xc

    iput v1, p0, Lle;->o:I

    mul-int/lit8 v2, v1, 0x2

    sub-int/2addr v0, v2

    mul-int/lit8 v1, v1, 0x4

    mul-int/lit8 v0, v0, 0x2

    add-int/2addr v0, v1

    iput v0, p0, Lle;->m:I

    const/high16 v0, 0x40000000    # 2.0f

    mul-float/2addr p1, v0

    iput p1, p0, Lle;->p:F

    iput p1, p0, Lle;->q:F

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f06033a

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    iput p1, p0, Lle;->s:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f060338

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    iput p1, p0, Lle;->t:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f060343

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    iput p1, p0, Lle;->u:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f060344

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    iput p1, p0, Lle;->v:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f060337

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    iput p1, p0, Lle;->w:I

    iget-boolean p1, p0, Lle;->e:Z

    if-eqz p1, :cond_0

    const/high16 p1, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput p1, p0, Lle;->f:F

    return-void
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Lle;->c:Landroid/animation/ArgbEvaluator;

    iget v3, v0, Lle;->f:F

    iget v4, v0, Lle;->t:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget v5, v0, Lle;->s:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v2, v3, v4, v5}, Landroid/animation/ArgbEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget v4, v0, Lle;->f:F

    iget v5, v0, Lle;->w:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iget v6, v0, Lle;->s:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v2, v4, v5, v6}, Landroid/animation/ArgbEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget v4, v0, Lle;->r:F

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    iget-object v5, v0, Lle;->b:Landroid/graphics/RectF;

    iget v6, v0, Lle;->m:I

    int-to-float v6, v6

    sub-float/2addr v6, v4

    iget v7, v0, Lle;->n:I

    int-to-float v7, v7

    sub-float/2addr v7, v4

    invoke-virtual {v5, v4, v4, v6, v7}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v4, v0, Lle;->a:Landroid/graphics/Paint;

    sget-object v6, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setColor(I)V

    iget v3, v0, Lle;->p:F

    invoke-virtual {v1, v5, v3, v3, v4}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget v3, v0, Lle;->r:F

    invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget v2, v0, Lle;->p:F

    invoke-virtual {v1, v5, v2, v2, v4}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    iget v2, v0, Lle;->n:I

    iget v3, v0, Lle;->o:I

    mul-int/lit8 v7, v3, 0x2

    sub-int/2addr v2, v7

    int-to-float v7, v3

    iget v8, v0, Lle;->m:I

    sub-int/2addr v8, v3

    sub-int/2addr v8, v2

    int-to-float v8, v8

    sub-float/2addr v8, v7

    iget v9, v0, Lle;->f:F

    mul-float/2addr v8, v9

    add-float/2addr v8, v7

    int-to-float v7, v3

    int-to-float v9, v2

    add-float v10, v8, v9

    add-int/2addr v3, v2

    int-to-float v2, v3

    invoke-virtual {v5, v8, v7, v10, v2}, Landroid/graphics/RectF;->set(FFFF)V

    invoke-virtual {v5}, Landroid/graphics/RectF;->centerX()F

    move-result v12

    invoke-virtual {v5}, Landroid/graphics/RectF;->centerY()F

    move-result v13

    new-instance v2, Landroid/graphics/RadialGradient;

    const v3, 0x3f1eb852    # 0.62f

    mul-float v14, v9, v3

    iget v15, v0, Lle;->u:I

    iget v3, v0, Lle;->v:I

    sget-object v17, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    move-object v11, v2

    move/from16 v16, v3

    invoke-direct/range {v11 .. v17}, Landroid/graphics/RadialGradient;-><init>(FFFIILandroid/graphics/Shader$TileMode;)V

    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    iget v2, v0, Lle;->q:F

    invoke-virtual {v1, v5, v2, v2, v4}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    const/4 v1, 0x0

    invoke-virtual {v4, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    return-void
.end method

.method public final onMeasure(II)V
    .locals 0

    iget p1, p0, Lle;->m:I

    iget p2, p0, Lle;->n:I

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public setChecked(Z)V
    .locals 1

    iget-boolean v0, p0, Lle;->e:Z

    if-eq v0, p1, :cond_1

    iput-boolean p1, p0, Lle;->e:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lle;->h:Z

    iget-object v0, p0, Lle;->l:Lr0;

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    if-eqz p1, :cond_0

    const/high16 p1, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput p1, p0, Lle;->f:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_1
    return-void
.end method

.method public setOnCheckedChange(Lke;)V
    .locals 0

    iput-object p1, p0, Lle;->g:Lke;

    return-void
.end method
