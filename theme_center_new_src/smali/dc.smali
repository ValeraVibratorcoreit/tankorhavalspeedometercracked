.class public final Ldc;
.super Ld;
.source "SourceFile"


# instance fields
.field public c:Landroid/graphics/Paint;

.field public d:[F

.field public e:F


# virtual methods
.method public final c()V
    .locals 26

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

    iget-object v5, v0, Ld;->a:Ljava/lang/Object;

    check-cast v5, Lz6;

    iget v6, v5, Lz6;->a:I

    iget v7, v5, Lz6;->d:F

    iget v8, v5, Lz6;->b:F

    iget v5, v5, Lz6;->c:F

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_0
    if-ge v10, v6, :cond_3

    int-to-float v12, v10

    add-int/lit8 v13, v6, -0x1

    int-to-float v13, v13

    div-float v13, v12, v13

    int-to-float v14, v6

    div-float v15, v14, v4

    sub-float/2addr v12, v15

    div-float/2addr v12, v14

    mul-float/2addr v13, v8

    const/high16 v14, 0x3fc00000    # 1.5f

    add-float/2addr v14, v7

    if-nez v10, :cond_0

    const/4 v12, 0x0

    goto :goto_1

    :cond_0
    iget v15, v0, Ldc;->e:F

    mul-float/2addr v15, v5

    mul-float/2addr v12, v15

    :goto_1
    add-float/2addr v12, v5

    invoke-static {v14, v12}, Ljava/lang/Math;->max(FF)F

    move-result v12

    div-float v14, v12, v13

    float-to-double v14, v14

    invoke-static {v14, v15}, Ljava/lang/Math;->asin(D)D

    move-result-wide v14

    const-wide v16, 0x40088121e29cdd4cL    # 3.063052912151454

    div-double v16, v16, v14

    const-wide/high16 v14, 0x3fe0000000000000L    # 0.5

    add-double v14, v16, v14

    double-to-int v14, v14

    const/4 v15, 0x1

    invoke-static {v15, v14}, Ljava/lang/Math;->max(II)I

    move-result v14

    mul-int/lit8 v4, v6, 0x2

    invoke-static {v14, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    const/4 v14, 0x0

    :goto_2
    if-ge v14, v4, :cond_2

    const-wide v17, 0x401921fb54442d18L    # 6.283185307179586

    move/from16 v19, v10

    int-to-double v9, v14

    mul-double v9, v9, v17

    move/from16 v18, v5

    move/from16 v17, v6

    int-to-double v5, v4

    div-double/2addr v9, v5

    const-wide v20, 0x400921fb54442d18L    # Math.PI

    div-double v5, v20, v5

    add-int/lit8 v22, v19, 0x1

    const/16 v23, 0x2

    rem-int/lit8 v15, v22, 0x2

    move/from16 v22, v14

    int-to-double v14, v15

    mul-double/2addr v5, v14

    add-double/2addr v5, v9

    float-to-double v9, v13

    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    move-result-wide v14

    mul-double/2addr v14, v9

    double-to-float v14, v14

    add-float/2addr v14, v3

    invoke-static {v5, v6}, Ljava/lang/Math;->sin(D)D

    move-result-wide v24

    mul-double v9, v9, v24

    double-to-float v9, v9

    add-float/2addr v9, v3

    const-wide v24, 0x4066800000000000L    # 180.0

    mul-double v5, v5, v24

    div-double v5, v5, v20

    double-to-float v5, v5

    iget-object v6, v0, Ldc;->d:[F

    const/4 v10, 0x0

    aput v5, v6, v10

    div-float v5, v13, v8

    const/4 v15, 0x1

    aput v5, v6, v15

    iget-object v5, v0, Ld;->a:Ljava/lang/Object;

    check-cast v5, Lz6;

    iget v5, v5, Lz6;->f:F

    aput v5, v6, v23

    iget-object v5, v0, Ldc;->c:Landroid/graphics/Paint;

    invoke-static {v6}, Landroid/graphics/Color;->HSVToColor([F)I

    move-result v10

    invoke-virtual {v5, v10}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v10, v0, Ld;->a:Ljava/lang/Object;

    check-cast v10, Lz6;

    iget v10, v10, Lz6;->e:F

    const/high16 v20, 0x437f0000    # 255.0f

    mul-float v10, v10, v20

    invoke-static {v10}, Ljava/lang/Math;->round(F)I

    move-result v10

    invoke-virtual {v5, v10}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v10, v0, Ld;->a:Ljava/lang/Object;

    check-cast v10, Lz6;

    iget-object v10, v10, Lz6;->g:Landroid/graphics/Canvas;

    sub-float v15, v12, v7

    invoke-virtual {v10, v14, v9, v15, v5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    if-lt v11, v2, :cond_1

    new-instance v5, Ls6;

    invoke-direct {v5, v14, v9, v6}, Ls6;-><init>(FF[F)V

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_1
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ls6;

    invoke-virtual {v5, v14, v9, v6}, Ls6;->b(FF[F)V

    :goto_3
    add-int/lit8 v11, v11, 0x1

    add-int/lit8 v14, v22, 0x1

    move/from16 v6, v17

    move/from16 v5, v18

    move/from16 v10, v19

    const/4 v15, 0x1

    goto/16 :goto_2

    :cond_2
    move/from16 v18, v5

    move/from16 v17, v6

    move/from16 v19, v10

    add-int/lit8 v10, v19, 0x1

    const/high16 v4, 0x40000000    # 2.0f

    goto/16 :goto_0

    :cond_3
    return-void
.end method
