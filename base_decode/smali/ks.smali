.class public final Lks;
.super Ltt;
.source "SourceFile"


# instance fields
.field public k:LX8;

.field public l:Li4;


# virtual methods
.method public final a(LV8;)V
    .locals 10

    iget p1, p0, Ltt;->j:I

    invoke-static {p1}, LVo;->o(I)I

    move-result p1

    const/4 v0, 0x1

    const/4 v1, 0x3

    if-eq p1, v1, :cond_e

    iget-object p1, p0, Ltt;->e:Lh9;

    iget-boolean v2, p1, LX8;->c:Z

    const/high16 v3, 0x3f000000    # 0.5f

    const/4 v4, 0x0

    if-eqz v2, :cond_5

    iget-boolean v2, p1, LX8;->j:Z

    if-nez v2, :cond_5

    iget v2, p0, Ltt;->d:I

    if-ne v2, v1, :cond_5

    iget-object v2, p0, Ltt;->b:Lv7;

    iget v5, v2, Lv7;->s:I

    const/4 v6, 0x2

    if-eq v5, v6, :cond_4

    if-eq v5, v1, :cond_0

    goto :goto_3

    :cond_0
    iget-object v5, v2, Lv7;->d:Lwe;

    iget-object v5, v5, Ltt;->e:Lh9;

    iget-boolean v6, v5, LX8;->j:Z

    if-eqz v6, :cond_5

    iget v6, v2, Lv7;->X:I

    const/4 v7, -0x1

    if-eq v6, v7, :cond_3

    if-eqz v6, :cond_2

    if-eq v6, v0, :cond_1

    move v2, v4

    goto :goto_2

    :cond_1
    iget v5, v5, LX8;->g:I

    int-to-float v5, v5

    iget v2, v2, Lv7;->W:F

    :goto_0
    div-float/2addr v5, v2

    :goto_1
    add-float/2addr v5, v3

    float-to-int v2, v5

    goto :goto_2

    :cond_2
    iget v5, v5, LX8;->g:I

    int-to-float v5, v5

    iget v2, v2, Lv7;->W:F

    mul-float/2addr v5, v2

    goto :goto_1

    :cond_3
    iget v5, v5, LX8;->g:I

    int-to-float v5, v5

    iget v2, v2, Lv7;->W:F

    goto :goto_0

    :goto_2
    invoke-virtual {p1, v2}, Lh9;->d(I)V

    goto :goto_3

    :cond_4
    iget-object v5, v2, Lv7;->T:Lv7;

    if-eqz v5, :cond_5

    iget-object v5, v5, Lv7;->e:Lks;

    iget-object v5, v5, Ltt;->e:Lh9;

    iget-boolean v6, v5, LX8;->j:Z

    if-eqz v6, :cond_5

    iget v2, v2, Lv7;->z:F

    iget v5, v5, LX8;->g:I

    int-to-float v5, v5

    mul-float/2addr v5, v2

    add-float/2addr v5, v3

    float-to-int v2, v5

    invoke-virtual {p1, v2}, Lh9;->d(I)V

    :cond_5
    :goto_3
    iget-object v2, p0, Ltt;->h:LX8;

    iget-boolean v5, v2, LX8;->c:Z

    if-eqz v5, :cond_d

    iget-object v5, p0, Ltt;->i:LX8;

    iget-boolean v6, v5, LX8;->c:Z

    if-nez v6, :cond_6

    goto/16 :goto_6

    :cond_6
    iget-boolean v6, v2, LX8;->j:Z

    if-eqz v6, :cond_7

    iget-boolean v6, v5, LX8;->j:Z

    if-eqz v6, :cond_7

    iget-boolean v6, p1, LX8;->j:Z

    if-eqz v6, :cond_7

    return-void

    :cond_7
    iget-boolean v6, p1, LX8;->j:Z

    if-nez v6, :cond_8

    iget v6, p0, Ltt;->d:I

    if-ne v6, v1, :cond_8

    iget-object v6, p0, Ltt;->b:Lv7;

    iget v7, v6, Lv7;->r:I

    if-nez v7, :cond_8

    invoke-virtual {v6}, Lv7;->y()Z

    move-result v6

    if-nez v6, :cond_8

    iget-object v0, v2, LX8;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LX8;

    iget-object v1, v5, LX8;->l:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LX8;

    iget v0, v0, LX8;->g:I

    iget v3, v2, LX8;->f:I

    add-int/2addr v0, v3

    iget v1, v1, LX8;->g:I

    iget v3, v5, LX8;->f:I

    add-int/2addr v1, v3

    sub-int v3, v1, v0

    invoke-virtual {v2, v0}, LX8;->d(I)V

    invoke-virtual {v5, v1}, LX8;->d(I)V

    invoke-virtual {p1, v3}, Lh9;->d(I)V

    return-void

    :cond_8
    iget-boolean v6, p1, LX8;->j:Z

    if-nez v6, :cond_a

    iget v6, p0, Ltt;->d:I

    if-ne v6, v1, :cond_a

    iget v1, p0, Ltt;->a:I

    if-ne v1, v0, :cond_a

    iget-object v0, v2, LX8;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_a

    iget-object v0, v5, LX8;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_a

    iget-object v0, v2, LX8;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LX8;

    iget-object v1, v5, LX8;->l:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LX8;

    iget v0, v0, LX8;->g:I

    iget v6, v2, LX8;->f:I

    add-int/2addr v0, v6

    iget v1, v1, LX8;->g:I

    iget v6, v5, LX8;->f:I

    add-int/2addr v1, v6

    sub-int/2addr v1, v0

    iget v0, p1, Lh9;->m:I

    if-ge v1, v0, :cond_9

    invoke-virtual {p1, v1}, Lh9;->d(I)V

    goto :goto_4

    :cond_9
    invoke-virtual {p1, v0}, Lh9;->d(I)V

    :cond_a
    :goto_4
    iget-boolean v0, p1, LX8;->j:Z

    if-nez v0, :cond_b

    return-void

    :cond_b
    iget-object v0, v2, LX8;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_d

    iget-object v0, v5, LX8;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_d

    iget-object v0, v2, LX8;->l:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LX8;

    iget-object v1, v5, LX8;->l:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LX8;

    iget v4, v0, LX8;->g:I

    iget v6, v2, LX8;->f:I

    add-int/2addr v6, v4

    iget v7, v1, LX8;->g:I

    iget v8, v5, LX8;->f:I

    add-int/2addr v8, v7

    iget-object v9, p0, Ltt;->b:Lv7;

    iget v9, v9, Lv7;->e0:F

    if-ne v0, v1, :cond_c

    move v9, v3

    goto :goto_5

    :cond_c
    move v4, v6

    move v7, v8

    :goto_5
    sub-int/2addr v7, v4

    iget v0, p1, LX8;->g:I

    sub-int/2addr v7, v0

    int-to-float v0, v4

    add-float/2addr v0, v3

    int-to-float v1, v7

    mul-float/2addr v1, v9

    add-float/2addr v1, v0

    float-to-int v0, v1

    invoke-virtual {v2, v0}, LX8;->d(I)V

    iget v0, v2, LX8;->g:I

    iget p1, p1, LX8;->g:I

    add-int/2addr v0, p1

    invoke-virtual {v5, v0}, LX8;->d(I)V

    :cond_d
    :goto_6
    return-void

    :cond_e
    iget-object p1, p0, Ltt;->b:Lv7;

    iget-object v1, p1, Lv7;->J:Lh7;

    iget-object p1, p1, Lv7;->L:Lh7;

    invoke-virtual {p0, v1, p1, v0}, Ltt;->l(Lh7;Lh7;I)V

    return-void
.end method

.method public final d()V
    .locals 14

    iget-object v0, p0, Ltt;->b:Lv7;

    iget-boolean v1, v0, Lv7;->a:Z

    iget-object v2, p0, Ltt;->e:Lh9;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lv7;->k()I

    move-result v0

    invoke-virtual {v2, v0}, Lh9;->d(I)V

    :cond_0
    iget-boolean v0, v2, LX8;->j:Z

    iget-object v1, p0, Ltt;->i:LX8;

    iget-object v3, p0, Ltt;->h:LX8;

    const/4 v4, 0x3

    const/4 v5, 0x1

    const/4 v6, 0x4

    if-nez v0, :cond_3

    iget-object v0, p0, Ltt;->b:Lv7;

    iget-object v7, v0, Lv7;->p0:[I

    aget v7, v7, v5

    iput v7, p0, Ltt;->d:I

    iget-boolean v0, v0, Lv7;->E:Z

    if-eqz v0, :cond_1

    new-instance v0, Li4;

    invoke-direct {v0, p0}, Lh9;-><init>(Ltt;)V

    iput-object v0, p0, Lks;->l:Li4;

    :cond_1
    iget v0, p0, Ltt;->d:I

    if-eq v0, v4, :cond_4

    if-ne v0, v6, :cond_2

    iget-object v7, p0, Ltt;->b:Lv7;

    iget-object v7, v7, Lv7;->T:Lv7;

    if-eqz v7, :cond_2

    iget-object v8, v7, Lv7;->p0:[I

    aget v8, v8, v5

    if-ne v8, v5, :cond_2

    invoke-virtual {v7}, Lv7;->k()I

    move-result v0

    iget-object v4, p0, Ltt;->b:Lv7;

    iget-object v4, v4, Lv7;->J:Lh7;

    invoke-virtual {v4}, Lh7;->e()I

    move-result v4

    sub-int/2addr v0, v4

    iget-object v4, p0, Ltt;->b:Lv7;

    iget-object v4, v4, Lv7;->L:Lh7;

    invoke-virtual {v4}, Lh7;->e()I

    move-result v4

    sub-int/2addr v0, v4

    iget-object v4, v7, Lv7;->e:Lks;

    iget-object v4, v4, Ltt;->h:LX8;

    iget-object v5, p0, Ltt;->b:Lv7;

    iget-object v5, v5, Lv7;->J:Lh7;

    invoke-virtual {v5}, Lh7;->e()I

    move-result v5

    invoke-static {v3, v4, v5}, Ltt;->b(LX8;LX8;I)V

    iget-object v3, v7, Lv7;->e:Lks;

    iget-object v3, v3, Ltt;->i:LX8;

    iget-object v4, p0, Ltt;->b:Lv7;

    iget-object v4, v4, Lv7;->L:Lh7;

    invoke-virtual {v4}, Lh7;->e()I

    move-result v4

    neg-int v4, v4

    invoke-static {v1, v3, v4}, Ltt;->b(LX8;LX8;I)V

    invoke-virtual {v2, v0}, Lh9;->d(I)V

    return-void

    :cond_2
    if-ne v0, v5, :cond_4

    iget-object v0, p0, Ltt;->b:Lv7;

    invoke-virtual {v0}, Lv7;->k()I

    move-result v0

    invoke-virtual {v2, v0}, Lh9;->d(I)V

    goto :goto_0

    :cond_3
    iget v0, p0, Ltt;->d:I

    if-ne v0, v6, :cond_4

    iget-object v0, p0, Ltt;->b:Lv7;

    iget-object v7, v0, Lv7;->T:Lv7;

    if-eqz v7, :cond_4

    iget-object v8, v7, Lv7;->p0:[I

    aget v8, v8, v5

    if-ne v8, v5, :cond_4

    iget-object v2, v7, Lv7;->e:Lks;

    iget-object v2, v2, Ltt;->h:LX8;

    iget-object v0, v0, Lv7;->J:Lh7;

    invoke-virtual {v0}, Lh7;->e()I

    move-result v0

    invoke-static {v3, v2, v0}, Ltt;->b(LX8;LX8;I)V

    iget-object v0, v7, Lv7;->e:Lks;

    iget-object v0, v0, Ltt;->i:LX8;

    iget-object v2, p0, Ltt;->b:Lv7;

    iget-object v2, v2, Lv7;->L:Lh7;

    invoke-virtual {v2}, Lh7;->e()I

    move-result v2

    neg-int v2, v2

    invoke-static {v1, v0, v2}, Ltt;->b(LX8;LX8;I)V

    return-void

    :cond_4
    :goto_0
    iget-boolean v0, v2, LX8;->j:Z

    iget-object v7, p0, Lks;->k:LX8;

    const/4 v8, 0x0

    const/4 v9, 0x2

    if-eqz v0, :cond_d

    iget-object v10, p0, Ltt;->b:Lv7;

    iget-boolean v11, v10, Lv7;->a:Z

    if-eqz v11, :cond_d

    iget-object v0, v10, Lv7;->Q:[Lh7;

    aget-object v11, v0, v9

    iget-object v12, v11, Lh7;->f:Lh7;

    if-eqz v12, :cond_8

    aget-object v13, v0, v4

    iget-object v13, v13, Lh7;->f:Lh7;

    if-eqz v13, :cond_8

    invoke-virtual {v10}, Lv7;->y()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Ltt;->b:Lv7;

    iget-object v0, v0, Lv7;->Q:[Lh7;

    aget-object v0, v0, v9

    invoke-virtual {v0}, Lh7;->e()I

    move-result v0

    iput v0, v3, LX8;->f:I

    iget-object v0, p0, Ltt;->b:Lv7;

    iget-object v0, v0, Lv7;->Q:[Lh7;

    aget-object v0, v0, v4

    invoke-virtual {v0}, Lh7;->e()I

    move-result v0

    neg-int v0, v0

    iput v0, v1, LX8;->f:I

    goto :goto_1

    :cond_5
    iget-object v0, p0, Ltt;->b:Lv7;

    iget-object v0, v0, Lv7;->Q:[Lh7;

    aget-object v0, v0, v9

    invoke-static {v0}, Ltt;->h(Lh7;)LX8;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v2, p0, Ltt;->b:Lv7;

    iget-object v2, v2, Lv7;->Q:[Lh7;

    aget-object v2, v2, v9

    invoke-virtual {v2}, Lh7;->e()I

    move-result v2

    invoke-static {v3, v0, v2}, Ltt;->b(LX8;LX8;I)V

    :cond_6
    iget-object v0, p0, Ltt;->b:Lv7;

    iget-object v0, v0, Lv7;->Q:[Lh7;

    aget-object v0, v0, v4

    invoke-static {v0}, Ltt;->h(Lh7;)LX8;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-object v2, p0, Ltt;->b:Lv7;

    iget-object v2, v2, Lv7;->Q:[Lh7;

    aget-object v2, v2, v4

    invoke-virtual {v2}, Lh7;->e()I

    move-result v2

    neg-int v2, v2

    invoke-static {v1, v0, v2}, Ltt;->b(LX8;LX8;I)V

    :cond_7
    iput-boolean v5, v3, LX8;->b:Z

    iput-boolean v5, v1, LX8;->b:Z

    :goto_1
    iget-object v0, p0, Ltt;->b:Lv7;

    iget-boolean v1, v0, Lv7;->E:Z

    if-eqz v1, :cond_1e

    iget v0, v0, Lv7;->a0:I

    invoke-static {v7, v3, v0}, Ltt;->b(LX8;LX8;I)V

    goto/16 :goto_5

    :cond_8
    if-eqz v12, :cond_9

    invoke-static {v11}, Ltt;->h(Lh7;)LX8;

    move-result-object v0

    if-eqz v0, :cond_1e

    iget-object v4, p0, Ltt;->b:Lv7;

    iget-object v4, v4, Lv7;->Q:[Lh7;

    aget-object v4, v4, v9

    invoke-virtual {v4}, Lh7;->e()I

    move-result v4

    invoke-static {v3, v0, v4}, Ltt;->b(LX8;LX8;I)V

    iget v0, v2, LX8;->g:I

    invoke-static {v1, v3, v0}, Ltt;->b(LX8;LX8;I)V

    iget-object v0, p0, Ltt;->b:Lv7;

    iget-boolean v1, v0, Lv7;->E:Z

    if-eqz v1, :cond_1e

    iget v0, v0, Lv7;->a0:I

    invoke-static {v7, v3, v0}, Ltt;->b(LX8;LX8;I)V

    goto/16 :goto_5

    :cond_9
    aget-object v5, v0, v4

    iget-object v9, v5, Lh7;->f:Lh7;

    if-eqz v9, :cond_b

    invoke-static {v5}, Ltt;->h(Lh7;)LX8;

    move-result-object v0

    if-eqz v0, :cond_a

    iget-object v5, p0, Ltt;->b:Lv7;

    iget-object v5, v5, Lv7;->Q:[Lh7;

    aget-object v4, v5, v4

    invoke-virtual {v4}, Lh7;->e()I

    move-result v4

    neg-int v4, v4

    invoke-static {v1, v0, v4}, Ltt;->b(LX8;LX8;I)V

    iget v0, v2, LX8;->g:I

    neg-int v0, v0

    invoke-static {v3, v1, v0}, Ltt;->b(LX8;LX8;I)V

    :cond_a
    iget-object v0, p0, Ltt;->b:Lv7;

    iget-boolean v1, v0, Lv7;->E:Z

    if-eqz v1, :cond_1e

    iget v0, v0, Lv7;->a0:I

    invoke-static {v7, v3, v0}, Ltt;->b(LX8;LX8;I)V

    goto/16 :goto_5

    :cond_b
    aget-object v0, v0, v6

    iget-object v4, v0, Lh7;->f:Lh7;

    if-eqz v4, :cond_c

    invoke-static {v0}, Ltt;->h(Lh7;)LX8;

    move-result-object v0

    if-eqz v0, :cond_1e

    invoke-static {v7, v0, v8}, Ltt;->b(LX8;LX8;I)V

    iget-object v0, p0, Ltt;->b:Lv7;

    iget v0, v0, Lv7;->a0:I

    neg-int v0, v0

    invoke-static {v3, v7, v0}, Ltt;->b(LX8;LX8;I)V

    iget v0, v2, LX8;->g:I

    invoke-static {v1, v3, v0}, Ltt;->b(LX8;LX8;I)V

    goto/16 :goto_5

    :cond_c
    instance-of v0, v10, Lve;

    if-nez v0, :cond_1e

    iget-object v0, v10, Lv7;->T:Lv7;

    if-eqz v0, :cond_1e

    const/4 v0, 0x7

    invoke-virtual {v10, v0}, Lv7;->i(I)Lh7;

    move-result-object v0

    iget-object v0, v0, Lh7;->f:Lh7;

    if-nez v0, :cond_1e

    iget-object v0, p0, Ltt;->b:Lv7;

    iget-object v4, v0, Lv7;->T:Lv7;

    iget-object v4, v4, Lv7;->e:Lks;

    iget-object v4, v4, Ltt;->h:LX8;

    invoke-virtual {v0}, Lv7;->s()I

    move-result v0

    invoke-static {v3, v4, v0}, Ltt;->b(LX8;LX8;I)V

    iget v0, v2, LX8;->g:I

    invoke-static {v1, v3, v0}, Ltt;->b(LX8;LX8;I)V

    iget-object v0, p0, Ltt;->b:Lv7;

    iget-boolean v1, v0, Lv7;->E:Z

    if-eqz v1, :cond_1e

    iget v0, v0, Lv7;->a0:I

    invoke-static {v7, v3, v0}, Ltt;->b(LX8;LX8;I)V

    goto/16 :goto_5

    :cond_d
    if-nez v0, :cond_12

    iget v0, p0, Ltt;->d:I

    if-ne v0, v4, :cond_12

    iget-object v0, p0, Ltt;->b:Lv7;

    iget v10, v0, Lv7;->s:I

    if-eq v10, v9, :cond_10

    if-eq v10, v4, :cond_e

    goto :goto_2

    :cond_e
    invoke-virtual {v0}, Lv7;->y()Z

    move-result v0

    if-nez v0, :cond_13

    iget-object v0, p0, Ltt;->b:Lv7;

    iget v10, v0, Lv7;->r:I

    if-ne v10, v4, :cond_f

    goto :goto_2

    :cond_f
    iget-object v0, v0, Lv7;->d:Lwe;

    iget-object v0, v0, Ltt;->e:Lh9;

    iget-object v10, v2, LX8;->l:Ljava/util/ArrayList;

    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v0, LX8;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-boolean v5, v2, LX8;->b:Z

    iget-object v0, v2, LX8;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v2, LX8;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_10
    iget-object v0, v0, Lv7;->T:Lv7;

    if-nez v0, :cond_11

    goto :goto_2

    :cond_11
    iget-object v0, v0, Lv7;->e:Lks;

    iget-object v0, v0, Ltt;->e:Lh9;

    iget-object v10, v2, LX8;->l:Ljava/util/ArrayList;

    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v0, LX8;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-boolean v5, v2, LX8;->b:Z

    iget-object v0, v2, LX8;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v2, LX8;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_12
    invoke-virtual {v2, p0}, LX8;->b(LV8;)V

    :cond_13
    :goto_2
    iget-object v0, p0, Ltt;->b:Lv7;

    iget-object v10, v0, Lv7;->Q:[Lh7;

    aget-object v11, v10, v9

    iget-object v12, v11, Lh7;->f:Lh7;

    if-eqz v12, :cond_17

    aget-object v13, v10, v4

    iget-object v13, v13, Lh7;->f:Lh7;

    if-eqz v13, :cond_17

    invoke-virtual {v0}, Lv7;->y()Z

    move-result v0

    if-eqz v0, :cond_14

    iget-object v0, p0, Ltt;->b:Lv7;

    iget-object v0, v0, Lv7;->Q:[Lh7;

    aget-object v0, v0, v9

    invoke-virtual {v0}, Lh7;->e()I

    move-result v0

    iput v0, v3, LX8;->f:I

    iget-object v0, p0, Ltt;->b:Lv7;

    iget-object v0, v0, Lv7;->Q:[Lh7;

    aget-object v0, v0, v4

    invoke-virtual {v0}, Lh7;->e()I

    move-result v0

    neg-int v0, v0

    iput v0, v1, LX8;->f:I

    goto :goto_3

    :cond_14
    iget-object v0, p0, Ltt;->b:Lv7;

    iget-object v0, v0, Lv7;->Q:[Lh7;

    aget-object v0, v0, v9

    invoke-static {v0}, Ltt;->h(Lh7;)LX8;

    move-result-object v0

    iget-object v1, p0, Ltt;->b:Lv7;

    iget-object v1, v1, Lv7;->Q:[Lh7;

    aget-object v1, v1, v4

    invoke-static {v1}, Ltt;->h(Lh7;)LX8;

    move-result-object v1

    if-eqz v0, :cond_15

    invoke-virtual {v0, p0}, LX8;->b(LV8;)V

    :cond_15
    if-eqz v1, :cond_16

    invoke-virtual {v1, p0}, LX8;->b(LV8;)V

    :cond_16
    iput v6, p0, Ltt;->j:I

    :goto_3
    iget-object v0, p0, Ltt;->b:Lv7;

    iget-boolean v0, v0, Lv7;->E:Z

    if-eqz v0, :cond_1d

    iget-object v0, p0, Lks;->l:Li4;

    invoke-virtual {p0, v7, v3, v5, v0}, Ltt;->c(LX8;LX8;ILh9;)V

    goto/16 :goto_4

    :cond_17
    const/4 v13, 0x0

    if-eqz v12, :cond_19

    invoke-static {v11}, Ltt;->h(Lh7;)LX8;

    move-result-object v0

    if-eqz v0, :cond_1d

    iget-object v6, p0, Ltt;->b:Lv7;

    iget-object v6, v6, Lv7;->Q:[Lh7;

    aget-object v6, v6, v9

    invoke-virtual {v6}, Lh7;->e()I

    move-result v6

    invoke-static {v3, v0, v6}, Ltt;->b(LX8;LX8;I)V

    invoke-virtual {p0, v1, v3, v5, v2}, Ltt;->c(LX8;LX8;ILh9;)V

    iget-object v0, p0, Ltt;->b:Lv7;

    iget-boolean v0, v0, Lv7;->E:Z

    if-eqz v0, :cond_18

    iget-object v0, p0, Lks;->l:Li4;

    invoke-virtual {p0, v7, v3, v5, v0}, Ltt;->c(LX8;LX8;ILh9;)V

    :cond_18
    iget v0, p0, Ltt;->d:I

    if-ne v0, v4, :cond_1d

    iget-object v0, p0, Ltt;->b:Lv7;

    iget v1, v0, Lv7;->W:F

    cmpl-float v1, v1, v13

    if-lez v1, :cond_1d

    iget-object v0, v0, Lv7;->d:Lwe;

    iget v1, v0, Ltt;->d:I

    if-ne v1, v4, :cond_1d

    iget-object v0, v0, Ltt;->e:Lh9;

    iget-object v0, v0, LX8;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v2, LX8;->l:Ljava/util/ArrayList;

    iget-object v1, p0, Ltt;->b:Lv7;

    iget-object v1, v1, Lv7;->d:Lwe;

    iget-object v1, v1, Ltt;->e:Lh9;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-object p0, v2, LX8;->a:Ltt;

    goto/16 :goto_4

    :cond_19
    aget-object v9, v10, v4

    iget-object v11, v9, Lh7;->f:Lh7;

    const/4 v12, -0x1

    if-eqz v11, :cond_1a

    invoke-static {v9}, Ltt;->h(Lh7;)LX8;

    move-result-object v0

    if-eqz v0, :cond_1d

    iget-object v6, p0, Ltt;->b:Lv7;

    iget-object v6, v6, Lv7;->Q:[Lh7;

    aget-object v4, v6, v4

    invoke-virtual {v4}, Lh7;->e()I

    move-result v4

    neg-int v4, v4

    invoke-static {v1, v0, v4}, Ltt;->b(LX8;LX8;I)V

    invoke-virtual {p0, v3, v1, v12, v2}, Ltt;->c(LX8;LX8;ILh9;)V

    iget-object v0, p0, Ltt;->b:Lv7;

    iget-boolean v0, v0, Lv7;->E:Z

    if-eqz v0, :cond_1d

    iget-object v0, p0, Lks;->l:Li4;

    invoke-virtual {p0, v7, v3, v5, v0}, Ltt;->c(LX8;LX8;ILh9;)V

    goto :goto_4

    :cond_1a
    aget-object v6, v10, v6

    iget-object v9, v6, Lh7;->f:Lh7;

    if-eqz v9, :cond_1b

    invoke-static {v6}, Ltt;->h(Lh7;)LX8;

    move-result-object v0

    if-eqz v0, :cond_1d

    invoke-static {v7, v0, v8}, Ltt;->b(LX8;LX8;I)V

    iget-object v0, p0, Lks;->l:Li4;

    invoke-virtual {p0, v3, v7, v12, v0}, Ltt;->c(LX8;LX8;ILh9;)V

    invoke-virtual {p0, v1, v3, v5, v2}, Ltt;->c(LX8;LX8;ILh9;)V

    goto :goto_4

    :cond_1b
    instance-of v6, v0, Lve;

    if-nez v6, :cond_1d

    iget-object v6, v0, Lv7;->T:Lv7;

    if-eqz v6, :cond_1d

    iget-object v6, v6, Lv7;->e:Lks;

    iget-object v6, v6, Ltt;->h:LX8;

    invoke-virtual {v0}, Lv7;->s()I

    move-result v0

    invoke-static {v3, v6, v0}, Ltt;->b(LX8;LX8;I)V

    invoke-virtual {p0, v1, v3, v5, v2}, Ltt;->c(LX8;LX8;ILh9;)V

    iget-object v0, p0, Ltt;->b:Lv7;

    iget-boolean v0, v0, Lv7;->E:Z

    if-eqz v0, :cond_1c

    iget-object v0, p0, Lks;->l:Li4;

    invoke-virtual {p0, v7, v3, v5, v0}, Ltt;->c(LX8;LX8;ILh9;)V

    :cond_1c
    iget v0, p0, Ltt;->d:I

    if-ne v0, v4, :cond_1d

    iget-object v0, p0, Ltt;->b:Lv7;

    iget v1, v0, Lv7;->W:F

    cmpl-float v1, v1, v13

    if-lez v1, :cond_1d

    iget-object v0, v0, Lv7;->d:Lwe;

    iget v1, v0, Ltt;->d:I

    if-ne v1, v4, :cond_1d

    iget-object v0, v0, Ltt;->e:Lh9;

    iget-object v0, v0, LX8;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, v2, LX8;->l:Ljava/util/ArrayList;

    iget-object v1, p0, Ltt;->b:Lv7;

    iget-object v1, v1, Lv7;->d:Lwe;

    iget-object v1, v1, Ltt;->e:Lh9;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-object p0, v2, LX8;->a:Ltt;

    :cond_1d
    :goto_4
    iget-object v0, v2, LX8;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1e

    iput-boolean v5, v2, LX8;->c:Z

    :cond_1e
    :goto_5
    return-void
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, Ltt;->h:LX8;

    iget-boolean v1, v0, LX8;->j:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Ltt;->b:Lv7;

    iget v0, v0, LX8;->g:I

    iput v0, v1, Lv7;->Z:I

    :cond_0
    return-void
.end method

.method public final f()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Ltt;->c:Ljn;

    iget-object v0, p0, Ltt;->h:LX8;

    invoke-virtual {v0}, LX8;->c()V

    iget-object v0, p0, Ltt;->i:LX8;

    invoke-virtual {v0}, LX8;->c()V

    iget-object v0, p0, Lks;->k:LX8;

    invoke-virtual {v0}, LX8;->c()V

    iget-object v0, p0, Ltt;->e:Lh9;

    invoke-virtual {v0}, LX8;->c()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ltt;->g:Z

    return-void
.end method

.method public final k()Z
    .locals 3

    iget v0, p0, Ltt;->d:I

    const/4 v1, 0x3

    const/4 v2, 0x1

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Ltt;->b:Lv7;

    iget v0, v0, Lv7;->s:I

    if-nez v0, :cond_0

    return v2

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    return v2
.end method

.method public final m()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Ltt;->g:Z

    iget-object v1, p0, Ltt;->h:LX8;

    invoke-virtual {v1}, LX8;->c()V

    iput-boolean v0, v1, LX8;->j:Z

    iget-object v1, p0, Ltt;->i:LX8;

    invoke-virtual {v1}, LX8;->c()V

    iput-boolean v0, v1, LX8;->j:Z

    iget-object v1, p0, Lks;->k:LX8;

    invoke-virtual {v1}, LX8;->c()V

    iput-boolean v0, v1, LX8;->j:Z

    iget-object v1, p0, Ltt;->e:Lh9;

    iput-boolean v0, v1, LX8;->j:Z

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "VerticalRun "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ltt;->b:Lv7;

    iget-object v1, v1, Lv7;->h0:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
