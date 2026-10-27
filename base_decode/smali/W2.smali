.class public final LW2;
.super Lqg;
.source "SourceFile"


# instance fields
.field public b:LU2;

.field public c:F

.field public d:F

.field public e:F

.field public f:F

.field public g:F

.field public h:F

.field public i:I

.field public j:I

.field public k:I

.field public l:I

.field public m:F

.field public n:F

.field public o:F

.field public p:Landroid/graphics/Paint;

.field public q:Landroid/graphics/Paint;

.field public r:Landroid/graphics/Paint;


# virtual methods
.method public final a()V
    .locals 1

    const-string v0, "coolant_color"

    invoke-static {v0}, LTf;->w(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, LW2;->setColor(I)V

    const-string v0, "coolant_warn_color"

    invoke-static {v0}, LTf;->w(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, LW2;->setWarnColor(I)V

    const-string v0, "coolant_critical_color"

    invoke-static {v0}, LTf;->w(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, LW2;->setCriticalColor(I)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    iget-object v0, p0, LW2;->b:LU2;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lqg;->a:Landroid/content/SharedPreferences;

    invoke-interface {v1, v0}, Landroid/content/SharedPreferences;->unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    :cond_0
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 24

    move-object/from16 v0, p0

    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v2

    iget v3, v0, LW2;->n:F

    iget v4, v0, LW2;->m:F

    sub-float/2addr v3, v4

    iget v5, v0, LW2;->o:F

    const/high16 v6, 0x40400000    # 3.0f

    mul-float/2addr v6, v5

    sub-float/2addr v3, v6

    const/high16 v6, 0x40800000    # 4.0f

    div-float/2addr v3, v6

    const/high16 v6, 0x41200000    # 10.0f

    div-float v6, v3, v6

    iget v7, v0, LW2;->c:F

    iget v8, v0, LW2;->e:F

    sub-float v9, v7, v8

    iget v10, v0, LW2;->g:F

    cmpl-float v9, v9, v10

    if-ltz v9, :cond_0

    iget-object v7, v0, LW2;->r:Landroid/graphics/Paint;

    :goto_0
    move-object/from16 v16, v7

    goto :goto_1

    :cond_0
    sub-float/2addr v7, v8

    iget v8, v0, LW2;->f:F

    cmpl-float v7, v7, v8

    if-ltz v7, :cond_1

    iget-object v7, v0, LW2;->q:Landroid/graphics/Paint;

    goto :goto_0

    :cond_1
    iget-object v7, v0, LW2;->p:Landroid/graphics/Paint;

    goto :goto_0

    :goto_1
    const/4 v7, 0x3

    move v15, v7

    :goto_2
    if-ltz v15, :cond_4

    int-to-float v7, v15

    add-float v8, v3, v5

    mul-float/2addr v8, v7

    add-float v17, v8, v4

    iget v7, v0, LW2;->h:F

    int-to-float v8, v1

    mul-float v18, v7, v8

    int-to-float v9, v2

    mul-float v19, v7, v9

    const/high16 v10, 0x3f800000    # 1.0f

    sub-float v11, v10, v7

    mul-float v20, v11, v8

    sub-float/2addr v10, v7

    mul-float v21, v10, v9

    const/16 v7, 0x9

    move v14, v7

    :goto_3
    if-ltz v14, :cond_3

    int-to-float v7, v14

    mul-float/2addr v7, v6

    add-float v12, v7, v17

    rsub-int/lit8 v7, v15, 0x3

    mul-int/lit8 v7, v7, 0xa

    rsub-int/lit8 v8, v14, 0x9

    add-int/2addr v8, v7

    int-to-float v7, v8

    iget v8, v0, LW2;->d:F

    iget v9, v0, LW2;->e:F

    sub-float/2addr v8, v9

    const/high16 v10, 0x42200000    # 40.0f

    div-float/2addr v8, v10

    mul-float/2addr v8, v7

    iget v7, v0, LW2;->c:F

    sub-float/2addr v7, v9

    cmpl-float v7, v7, v8

    if-ltz v7, :cond_2

    const/16 v22, 0x0

    move-object/from16 v7, p1

    move/from16 v8, v18

    move/from16 v9, v19

    move/from16 v10, v20

    move/from16 v11, v21

    move v13, v6

    move/from16 v23, v14

    move/from16 v14, v22

    move/from16 v22, v15

    move-object/from16 v15, v16

    invoke-virtual/range {v7 .. v15}, Landroid/graphics/Canvas;->drawArc(FFFFFFZLandroid/graphics/Paint;)V

    goto :goto_4

    :cond_2
    move/from16 v23, v14

    move/from16 v22, v15

    :goto_4
    add-int/lit8 v14, v23, -0x1

    move/from16 v15, v22

    goto :goto_3

    :cond_3
    move/from16 v22, v15

    add-int/lit8 v15, v22, -0x1

    goto :goto_2

    :cond_4
    return-void
.end method

.method public setColor(I)V
    .locals 1

    iput p1, p0, LW2;->j:I

    iget-object v0, p0, LW2;->p:Landroid/graphics/Paint;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    :cond_0
    return-void
.end method

.method public setCriticalColor(I)V
    .locals 1

    iput p1, p0, LW2;->l:I

    iget-object v0, p0, LW2;->r:Landroid/graphics/Paint;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    :cond_0
    return-void
.end method

.method public setCriticalLevel(F)V
    .locals 1

    iget v0, p0, LW2;->e:F

    sub-float/2addr p1, v0

    iput p1, p0, LW2;->g:F

    return-void
.end method

.method public setLevelValue(F)V
    .locals 0

    iput p1, p0, LW2;->c:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setMarginKoef(F)V
    .locals 0

    iput p1, p0, LW2;->h:F

    return-void
.end method

.method public setMaxValue(F)V
    .locals 0

    iput p1, p0, LW2;->d:F

    return-void
.end method

.method public setMinValue(F)V
    .locals 0

    iput p1, p0, LW2;->e:F

    return-void
.end method

.method public setStrokeWidth(I)V
    .locals 0

    iput p1, p0, LW2;->i:I

    return-void
.end method

.method public setWarnColor(I)V
    .locals 1

    iput p1, p0, LW2;->k:I

    iget-object v0, p0, LW2;->q:Landroid/graphics/Paint;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    :cond_0
    return-void
.end method

.method public setWarnLevel(F)V
    .locals 1

    iget v0, p0, LW2;->e:F

    sub-float/2addr p1, v0

    iput p1, p0, LW2;->f:F

    return-void
.end method
