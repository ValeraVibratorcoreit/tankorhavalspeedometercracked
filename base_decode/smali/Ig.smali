.class public final LIg;
.super Le;
.source "SourceFile"


# instance fields
.field public k:I

.field public l:Landroid/graphics/Paint;

.field public m:Landroid/graphics/Paint;

.field public n:Landroid/graphics/Paint;

.field public o:Lw6;


# virtual methods
.method public final b(Landroid/graphics/Canvas;)V
    .locals 12

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v1

    const/4 v2, 0x3

    new-array v2, v2, [F

    iget v3, p0, LIg;->k:I

    invoke-static {v3, v2}, Landroid/graphics/Color;->colorToHSV(I[F)V

    div-int/lit16 v3, v0, 0x100

    const/4 v4, 0x2

    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    const/4 v5, 0x0

    :goto_0
    if-gt v5, v0, :cond_0

    int-to-float v7, v5

    add-int/lit8 v6, v0, -0x1

    int-to-float v6, v6

    div-float v6, v7, v6

    aput v6, v2, v4

    iget-object v11, p0, LIg;->l:Landroid/graphics/Paint;

    invoke-static {v2}, Landroid/graphics/Color;->HSVToColor([F)I

    move-result v6

    invoke-virtual {v11, v6}, Landroid/graphics/Paint;->setColor(I)V

    add-int/2addr v5, v3

    int-to-float v9, v5

    int-to-float v10, v1

    const/4 v8, 0x0

    move-object v6, p1

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final c(Landroid/graphics/Canvas;FF)V
    .locals 4

    iget-object v0, p0, LIg;->m:Landroid/graphics/Paint;

    iget v1, p0, LIg;->k:I

    iget v2, p0, Le;->h:F

    const/4 v3, 0x3

    new-array v3, v3, [F

    invoke-static {v1, v3}, Landroid/graphics/Color;->colorToHSV(I[F)V

    const/4 v1, 0x2

    aput v2, v3, v1

    invoke-static {v3}, Landroid/graphics/Color;->HSVToColor([F)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-boolean v1, p0, Le;->i:Z

    if-eqz v1, :cond_0

    iget v1, p0, Le;->f:I

    int-to-float v1, v1

    iget-object v2, p0, LIg;->n:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, p3, v1, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :cond_0
    iget v1, p0, Le;->f:I

    int-to-float v1, v1

    const/high16 v2, 0x3f400000    # 0.75f

    mul-float/2addr v1, v2

    invoke-virtual {p1, p2, p3, v1, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public final d(F)V
    .locals 1

    iget-object v0, p0, LIg;->o:Lw6;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lw6;->setLightness(F)V

    :cond_0
    return-void
.end method

.method public setColor(I)V
    .locals 1

    iput p1, p0, LIg;->k:I

    const/4 v0, 0x3

    new-array v0, v0, [F

    invoke-static {p1, v0}, Landroid/graphics/Color;->colorToHSV(I[F)V

    const/4 p1, 0x2

    aget p1, v0, p1

    iput p1, p0, Le;->h:F

    iget-object p1, p0, Le;->c:Landroid/graphics/Bitmap;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Le;->e()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public setColorPicker(Lw6;)V
    .locals 0

    iput-object p1, p0, LIg;->o:Lw6;

    return-void
.end method
