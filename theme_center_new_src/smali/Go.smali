.class public final LGo;
.super Ld;
.source "SourceFile"


# instance fields
.field public c:Landroid/graphics/Paint;

.field public d:[F


# virtual methods
.method public final c()V
    .locals 23

    move-object/from16 v0, p0

    iget-object v1, v0, Ld;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    iget-object v3, v0, Ld;->a:Ljava/lang/Object;

    check-cast v3, Lz6;

    iget-object v3, v3, Lz6;->g:Landroid/graphics/Canvas;

    invoke-virtual {v3}, Landroid/graphics/Canvas;->getWidth()I

    move-result v3

    int-to-float v3, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    iget-object v4, v0, Ld;->a:Ljava/lang/Object;

    check-cast v4, Lz6;

    iget v5, v4, Lz6;->a:I

    iget v4, v4, Lz6;->b:F

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_0
    if-ge v7, v5, :cond_2

    int-to-float v9, v7

    add-int/lit8 v10, v5, -0x1

    int-to-float v10, v10

    div-float/2addr v9, v10

    mul-float/2addr v9, v4

    iget-object v10, v0, Ld;->a:Ljava/lang/Object;

    check-cast v10, Lz6;

    iget v10, v10, Lz6;->c:F

    div-float v11, v10, v9

    float-to-double v11, v11

    invoke-static {v11, v12}, Ljava/lang/Math;->asin(D)D

    move-result-wide v11

    const-wide v13, 0x40088121e29cdd4cL    # 3.063052912151454

    div-double/2addr v13, v11

    const-wide/high16 v11, 0x3fe0000000000000L    # 0.5

    add-double/2addr v13, v11

    double-to-int v11, v13

    const/4 v12, 0x1

    invoke-static {v12, v11}, Ljava/lang/Math;->max(II)I

    move-result v11

    const/4 v13, 0x0

    :goto_1
    if-ge v13, v11, :cond_1

    const-wide v14, 0x401921fb54442d18L    # 6.283185307179586

    move/from16 v16, v7

    int-to-double v6, v13

    mul-double/2addr v6, v14

    int-to-double v14, v11

    div-double/2addr v6, v14

    const-wide v17, 0x400921fb54442d18L    # Math.PI

    div-double v14, v17, v14

    add-int/lit8 v19, v16, 0x1

    const/16 v20, 0x2

    rem-int/lit8 v12, v19, 0x2

    move/from16 v19, v11

    int-to-double v11, v12

    mul-double/2addr v14, v11

    add-double/2addr v14, v6

    float-to-double v6, v9

    invoke-static {v14, v15}, Ljava/lang/Math;->cos(D)D

    move-result-wide v11

    mul-double/2addr v11, v6

    double-to-float v11, v11

    add-float/2addr v11, v3

    invoke-static {v14, v15}, Ljava/lang/Math;->sin(D)D

    move-result-wide v21

    mul-double v6, v6, v21

    double-to-float v6, v6

    add-float/2addr v6, v3

    const-wide v21, 0x4066800000000000L    # 180.0

    mul-double v14, v14, v21

    div-double v14, v14, v17

    double-to-float v7, v14

    iget-object v12, v0, LGo;->d:[F

    const/4 v14, 0x0

    aput v7, v12, v14

    div-float v7, v9, v4

    const/4 v15, 0x1

    aput v7, v12, v15

    iget-object v7, v0, Ld;->a:Ljava/lang/Object;

    check-cast v7, Lz6;

    iget v7, v7, Lz6;->f:F

    aput v7, v12, v20

    iget-object v7, v0, LGo;->c:Landroid/graphics/Paint;

    invoke-static {v12}, Landroid/graphics/Color;->HSVToColor([F)I

    move-result v14

    invoke-virtual {v7, v14}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v14, v0, Ld;->a:Ljava/lang/Object;

    check-cast v14, Lz6;

    iget v14, v14, Lz6;->e:F

    const/high16 v17, 0x437f0000    # 255.0f

    mul-float v14, v14, v17

    invoke-static {v14}, Ljava/lang/Math;->round(F)I

    move-result v14

    invoke-virtual {v7, v14}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v14, v0, Ld;->a:Ljava/lang/Object;

    check-cast v14, Lz6;

    iget-object v15, v14, Lz6;->g:Landroid/graphics/Canvas;

    iget v14, v14, Lz6;->d:F

    sub-float v14, v10, v14

    invoke-virtual {v15, v11, v6, v14, v7}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    if-lt v8, v2, :cond_0

    new-instance v7, Ls6;

    invoke-direct {v7, v11, v6, v12}, Ls6;-><init>(FF[F)V

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_0
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ls6;

    invoke-virtual {v7, v11, v6, v12}, Ls6;->b(FF[F)V

    :goto_2
    add-int/lit8 v8, v8, 0x1

    add-int/lit8 v13, v13, 0x1

    move/from16 v7, v16

    move/from16 v11, v19

    const/4 v12, 0x1

    goto/16 :goto_1

    :cond_1
    move/from16 v16, v7

    add-int/lit8 v7, v16, 0x1

    goto/16 :goto_0

    :cond_2
    return-void
.end method
