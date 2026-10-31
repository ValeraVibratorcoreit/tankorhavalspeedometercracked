.class public final Lqj;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public a:Landroid/graphics/Paint;

.field public b:Landroid/graphics/Path;

.field public c:Landroid/graphics/RectF;

.field public d:F


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 16

    move-object/from16 v0, p0

    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    iget v9, v0, Lqj;->d:F

    sub-float v7, v2, v9

    iget-object v8, v0, Lqj;->a:Landroid/graphics/Paint;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v3, p1

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    int-to-float v1, v1

    iget v4, v0, Lqj;->d:F

    sub-float v6, v1, v4

    iget-object v8, v0, Lqj;->a:Landroid/graphics/Paint;

    move v5, v2

    move v7, v2

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    sub-float v14, v2, v9

    iget-object v15, v0, Lqj;->a:Landroid/graphics/Paint;

    const/4 v12, 0x0

    move-object/from16 v10, p1

    move v11, v1

    move v13, v1

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    iget-object v3, v0, Lqj;->b:Landroid/graphics/Path;

    invoke-virtual {v3}, Landroid/graphics/Path;->reset()V

    iget-object v3, v0, Lqj;->c:Landroid/graphics/RectF;

    const/high16 v4, 0x40000000    # 2.0f

    mul-float v5, v9, v4

    sub-float v5, v1, v5

    mul-float v6, v9, v4

    sub-float v6, v2, v6

    invoke-virtual {v3, v5, v6, v1, v2}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v1, v0, Lqj;->b:Landroid/graphics/Path;

    iget-object v3, v0, Lqj;->c:Landroid/graphics/RectF;

    const/4 v5, 0x0

    const/high16 v6, 0x42b40000    # 90.0f

    invoke-virtual {v1, v3, v5, v6}, Landroid/graphics/Path;->addArc(Landroid/graphics/RectF;FF)V

    iget-object v1, v0, Lqj;->c:Landroid/graphics/RectF;

    mul-float v3, v9, v4

    sub-float v3, v2, v3

    mul-float/2addr v9, v4

    invoke-virtual {v1, v5, v3, v9, v2}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object v1, v0, Lqj;->b:Landroid/graphics/Path;

    iget-object v2, v0, Lqj;->c:Landroid/graphics/RectF;

    invoke-virtual {v1, v2, v6, v6}, Landroid/graphics/Path;->arcTo(Landroid/graphics/RectF;FF)V

    iget-object v1, v0, Lqj;->b:Landroid/graphics/Path;

    iget-object v2, v0, Lqj;->a:Landroid/graphics/Paint;

    move-object/from16 v3, p1

    invoke-virtual {v3, v1, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method
