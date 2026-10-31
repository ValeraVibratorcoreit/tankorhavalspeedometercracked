.class public final LVk;
.super Ld3;
.source "SourceFile"


# instance fields
.field public f:[LWo;

.field public g:[LWo;

.field public h:I

.field public i:Ld2;


# virtual methods
.method public final d([Z)LWo;
    .locals 9

    const/4 v0, -0x1

    const/4 v1, 0x0

    move v2, v0

    :goto_0
    iget v3, p0, LVk;->h:I

    if-ge v1, v3, :cond_6

    iget-object v3, p0, LVk;->f:[LWo;

    aget-object v4, v3, v1

    iget v5, v4, LWo;->b:I

    aget-boolean v5, p1, v5

    if-eqz v5, :cond_0

    goto :goto_4

    :cond_0
    iget-object v5, p0, LVk;->i:Ld2;

    iput-object v4, v5, Ld2;->b:Ljava/lang/Object;

    const/16 v4, 0x8

    if-ne v2, v0, :cond_3

    :goto_1
    if-ltz v4, :cond_5

    iget-object v3, v5, Ld2;->b:Ljava/lang/Object;

    check-cast v3, LWo;

    iget-object v3, v3, LWo;->h:[F

    aget v3, v3, v4

    const/4 v6, 0x0

    cmpl-float v7, v3, v6

    if-lez v7, :cond_1

    goto :goto_4

    :cond_1
    cmpg-float v3, v3, v6

    if-gez v3, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v4, v4, -0x1

    goto :goto_1

    :cond_3
    aget-object v3, v3, v2

    :goto_2
    if-ltz v4, :cond_5

    iget-object v6, v3, LWo;->h:[F

    aget v6, v6, v4

    iget-object v7, v5, Ld2;->b:Ljava/lang/Object;

    check-cast v7, LWo;

    iget-object v7, v7, LWo;->h:[F

    aget v7, v7, v4

    cmpl-float v8, v7, v6

    if-nez v8, :cond_4

    add-int/lit8 v4, v4, -0x1

    goto :goto_2

    :cond_4
    cmpg-float v3, v7, v6

    if-gez v3, :cond_5

    :goto_3
    move v2, v1

    :cond_5
    :goto_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_6
    if-ne v2, v0, :cond_7

    const/4 p1, 0x0

    return-object p1

    :cond_7
    iget-object p1, p0, LVk;->f:[LWo;

    aget-object p1, p1, v2

    return-object p1
.end method

.method public final e()Z
    .locals 1

    iget v0, p0, LVk;->h:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final i(LQg;Ld3;Z)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    iget-object v2, v1, Ld3;->a:LWo;

    if-nez v2, :cond_0

    return-void

    :cond_0
    iget-object v3, v1, Ld3;->d:La3;

    invoke-virtual {v3}, La3;->f()I

    move-result v4

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v4, :cond_8

    invoke-virtual {v3, v6}, La3;->g(I)LWo;

    move-result-object v7

    invoke-virtual {v3, v6}, La3;->h(I)F

    move-result v8

    iget-object v9, v0, LVk;->i:Ld2;

    iput-object v7, v9, Ld2;->b:Ljava/lang/Object;

    iget-boolean v10, v7, LWo;->a:Z

    iget-object v11, v2, LWo;->h:[F

    const v12, 0x38d1b717    # 1.0E-4f

    const/16 v13, 0x9

    const/4 v14, 0x0

    if-eqz v10, :cond_3

    const/4 v7, 0x1

    const/4 v10, 0x0

    :goto_1
    if-ge v10, v13, :cond_2

    iget-object v15, v9, Ld2;->b:Ljava/lang/Object;

    check-cast v15, LWo;

    iget-object v15, v15, LWo;->h:[F

    aget v16, v15, v10

    aget v17, v11, v10

    mul-float v17, v17, v8

    add-float v17, v17, v16

    aput v17, v15, v10

    invoke-static/range {v17 .. v17}, Ljava/lang/Math;->abs(F)F

    move-result v15

    cmpg-float v15, v15, v12

    if-gez v15, :cond_1

    iget-object v15, v9, Ld2;->b:Ljava/lang/Object;

    check-cast v15, LWo;

    iget-object v15, v15, LWo;->h:[F

    aput v14, v15, v10

    goto :goto_2

    :cond_1
    const/4 v7, 0x0

    :goto_2
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_2
    if-eqz v7, :cond_7

    iget-object v7, v9, Ld2;->b:Ljava/lang/Object;

    check-cast v7, LWo;

    iget-object v9, v9, Ld2;->c:Ljava/lang/Object;

    check-cast v9, LVk;

    invoke-virtual {v9, v7}, LVk;->k(LWo;)V

    goto :goto_5

    :cond_3
    const/4 v10, 0x0

    :goto_3
    if-ge v10, v13, :cond_6

    aget v15, v11, v10

    cmpl-float v16, v15, v14

    if-eqz v16, :cond_5

    mul-float/2addr v15, v8

    invoke-static {v15}, Ljava/lang/Math;->abs(F)F

    move-result v16

    cmpg-float v16, v16, v12

    if-gez v16, :cond_4

    move v15, v14

    :cond_4
    iget-object v5, v9, Ld2;->b:Ljava/lang/Object;

    check-cast v5, LWo;

    iget-object v5, v5, LWo;->h:[F

    aput v15, v5, v10

    goto :goto_4

    :cond_5
    iget-object v5, v9, Ld2;->b:Ljava/lang/Object;

    check-cast v5, LWo;

    iget-object v5, v5, LWo;->h:[F

    aput v14, v5, v10

    :goto_4
    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    :cond_6
    invoke-virtual {v0, v7}, LVk;->j(LWo;)V

    :cond_7
    :goto_5
    iget v5, v0, Ld3;->b:F

    iget v7, v1, Ld3;->b:F

    mul-float/2addr v7, v8

    add-float/2addr v7, v5

    iput v7, v0, Ld3;->b:F

    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    :cond_8
    invoke-virtual {v0, v2}, LVk;->k(LWo;)V

    return-void
.end method

.method public final j(LWo;)V
    .locals 6

    iget v0, p0, LVk;->h:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iget-object v2, p0, LVk;->f:[LWo;

    array-length v3, v2

    if-le v0, v3, :cond_0

    array-length v0, v2

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LWo;

    iput-object v0, p0, LVk;->f:[LWo;

    array-length v2, v0

    mul-int/lit8 v2, v2, 0x2

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LWo;

    iput-object v0, p0, LVk;->g:[LWo;

    :cond_0
    iget-object v0, p0, LVk;->f:[LWo;

    iget v2, p0, LVk;->h:I

    aput-object p1, v0, v2

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, LVk;->h:I

    if-le v3, v1, :cond_2

    aget-object v0, v0, v2

    iget v0, v0, LWo;->b:I

    iget v2, p1, LWo;->b:I

    if-le v0, v2, :cond_2

    const/4 v0, 0x0

    move v2, v0

    :goto_0
    iget v3, p0, LVk;->h:I

    if-ge v2, v3, :cond_1

    iget-object v3, p0, LVk;->g:[LWo;

    iget-object v4, p0, LVk;->f:[LWo;

    aget-object v4, v4, v2

    aput-object v4, v3, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-object v2, p0, LVk;->g:[LWo;

    new-instance v4, LV5;

    const/4 v5, 0x3

    invoke-direct {v4, v5}, LV5;-><init>(I)V

    invoke-static {v2, v0, v3, v4}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    :goto_1
    iget v2, p0, LVk;->h:I

    if-ge v0, v2, :cond_2

    iget-object v2, p0, LVk;->f:[LWo;

    iget-object v3, p0, LVk;->g:[LWo;

    aget-object v3, v3, v0

    aput-object v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    iput-boolean v1, p1, LWo;->a:Z

    invoke-virtual {p1, p0}, LWo;->a(Ld3;)V

    return-void
.end method

.method public final k(LWo;)V
    .locals 5

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget v2, p0, LVk;->h:I

    if-ge v1, v2, :cond_2

    iget-object v2, p0, LVk;->f:[LWo;

    aget-object v2, v2, v1

    if-ne v2, p1, :cond_1

    :goto_1
    iget v2, p0, LVk;->h:I

    add-int/lit8 v3, v2, -0x1

    if-ge v1, v3, :cond_0

    iget-object v2, p0, LVk;->f:[LWo;

    add-int/lit8 v3, v1, 0x1

    aget-object v4, v2, v3

    aput-object v4, v2, v1

    move v1, v3

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, -0x1

    iput v2, p0, LVk;->h:I

    iput-boolean v0, p1, LWo;->a:Z

    return-void

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, " goal -> ("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ld3;->b:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ") : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, LVk;->h:I

    if-ge v1, v2, :cond_0

    iget-object v2, p0, LVk;->f:[LWo;

    aget-object v2, v2, v1

    iget-object v3, p0, LVk;->i:Ld2;

    iput-object v2, v3, Ld2;->b:Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method
