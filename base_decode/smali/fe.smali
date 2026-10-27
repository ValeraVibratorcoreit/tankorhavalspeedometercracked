.class public final Lfe;
.super Ltt;
.source "SourceFile"


# virtual methods
.method public final a(LV8;)V
    .locals 2

    iget-object p1, p0, Ltt;->h:LX8;

    iget-boolean v0, p1, LX8;->c:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p1, LX8;->j:Z

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p1, LX8;->l:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LX8;

    iget-object v1, p0, Ltt;->b:Lv7;

    check-cast v1, Lee;

    iget v0, v0, LX8;->g:I

    int-to-float v0, v0

    iget v1, v1, Lee;->q0:F

    mul-float/2addr v0, v1

    const/high16 v1, 0x3f000000    # 0.5f

    add-float/2addr v0, v1

    float-to-int v0, v0

    invoke-virtual {p1, v0}, LX8;->d(I)V

    return-void
.end method

.method public final d()V
    .locals 7

    iget-object v0, p0, Ltt;->b:Lv7;

    move-object v1, v0

    check-cast v1, Lee;

    iget v2, v1, Lee;->r0:I

    iget v3, v1, Lee;->s0:I

    iget v1, v1, Lee;->u0:I

    iget-object v4, p0, Ltt;->h:LX8;

    const/4 v5, 0x1

    const/4 v6, -0x1

    if-ne v1, v5, :cond_2

    if-eq v2, v6, :cond_0

    iget-object v1, v4, LX8;->l:Ljava/util/ArrayList;

    iget-object v0, v0, Lv7;->T:Lv7;

    iget-object v0, v0, Lv7;->d:Lwe;

    iget-object v0, v0, Ltt;->h:LX8;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ltt;->b:Lv7;

    iget-object v0, v0, Lv7;->T:Lv7;

    iget-object v0, v0, Lv7;->d:Lwe;

    iget-object v0, v0, Ltt;->h:LX8;

    iget-object v0, v0, LX8;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput v2, v4, LX8;->f:I

    goto :goto_0

    :cond_0
    if-eq v3, v6, :cond_1

    iget-object v1, v4, LX8;->l:Ljava/util/ArrayList;

    iget-object v0, v0, Lv7;->T:Lv7;

    iget-object v0, v0, Lv7;->d:Lwe;

    iget-object v0, v0, Ltt;->i:LX8;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ltt;->b:Lv7;

    iget-object v0, v0, Lv7;->T:Lv7;

    iget-object v0, v0, Lv7;->d:Lwe;

    iget-object v0, v0, Ltt;->i:LX8;

    iget-object v0, v0, LX8;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-int v0, v3

    iput v0, v4, LX8;->f:I

    goto :goto_0

    :cond_1
    iput-boolean v5, v4, LX8;->b:Z

    iget-object v1, v4, LX8;->l:Ljava/util/ArrayList;

    iget-object v0, v0, Lv7;->T:Lv7;

    iget-object v0, v0, Lv7;->d:Lwe;

    iget-object v0, v0, Ltt;->i:LX8;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ltt;->b:Lv7;

    iget-object v0, v0, Lv7;->T:Lv7;

    iget-object v0, v0, Lv7;->d:Lwe;

    iget-object v0, v0, Ltt;->i:LX8;

    iget-object v0, v0, LX8;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    iget-object v0, p0, Ltt;->b:Lv7;

    iget-object v0, v0, Lv7;->d:Lwe;

    iget-object v0, v0, Ltt;->h:LX8;

    invoke-virtual {p0, v0}, Lfe;->m(LX8;)V

    iget-object v0, p0, Ltt;->b:Lv7;

    iget-object v0, v0, Lv7;->d:Lwe;

    iget-object v0, v0, Ltt;->i:LX8;

    invoke-virtual {p0, v0}, Lfe;->m(LX8;)V

    goto :goto_2

    :cond_2
    if-eq v2, v6, :cond_3

    iget-object v1, v4, LX8;->l:Ljava/util/ArrayList;

    iget-object v0, v0, Lv7;->T:Lv7;

    iget-object v0, v0, Lv7;->e:Lks;

    iget-object v0, v0, Ltt;->h:LX8;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ltt;->b:Lv7;

    iget-object v0, v0, Lv7;->T:Lv7;

    iget-object v0, v0, Lv7;->e:Lks;

    iget-object v0, v0, Ltt;->h:LX8;

    iget-object v0, v0, LX8;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput v2, v4, LX8;->f:I

    goto :goto_1

    :cond_3
    if-eq v3, v6, :cond_4

    iget-object v1, v4, LX8;->l:Ljava/util/ArrayList;

    iget-object v0, v0, Lv7;->T:Lv7;

    iget-object v0, v0, Lv7;->e:Lks;

    iget-object v0, v0, Ltt;->i:LX8;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ltt;->b:Lv7;

    iget-object v0, v0, Lv7;->T:Lv7;

    iget-object v0, v0, Lv7;->e:Lks;

    iget-object v0, v0, Ltt;->i:LX8;

    iget-object v0, v0, LX8;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    neg-int v0, v3

    iput v0, v4, LX8;->f:I

    goto :goto_1

    :cond_4
    iput-boolean v5, v4, LX8;->b:Z

    iget-object v1, v4, LX8;->l:Ljava/util/ArrayList;

    iget-object v0, v0, Lv7;->T:Lv7;

    iget-object v0, v0, Lv7;->e:Lks;

    iget-object v0, v0, Ltt;->i:LX8;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Ltt;->b:Lv7;

    iget-object v0, v0, Lv7;->T:Lv7;

    iget-object v0, v0, Lv7;->e:Lks;

    iget-object v0, v0, Ltt;->i:LX8;

    iget-object v0, v0, LX8;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    iget-object v0, p0, Ltt;->b:Lv7;

    iget-object v0, v0, Lv7;->e:Lks;

    iget-object v0, v0, Ltt;->h:LX8;

    invoke-virtual {p0, v0}, Lfe;->m(LX8;)V

    iget-object v0, p0, Ltt;->b:Lv7;

    iget-object v0, v0, Lv7;->e:Lks;

    iget-object v0, v0, Ltt;->i:LX8;

    invoke-virtual {p0, v0}, Lfe;->m(LX8;)V

    :goto_2
    return-void
.end method

.method public final e()V
    .locals 4

    iget-object v0, p0, Ltt;->b:Lv7;

    move-object v1, v0

    check-cast v1, Lee;

    iget v1, v1, Lee;->u0:I

    const/4 v2, 0x1

    iget-object v3, p0, Ltt;->h:LX8;

    if-ne v1, v2, :cond_0

    iget v1, v3, LX8;->g:I

    iput v1, v0, Lv7;->Y:I

    goto :goto_0

    :cond_0
    iget v1, v3, LX8;->g:I

    iput v1, v0, Lv7;->Z:I

    :goto_0
    return-void
.end method

.method public final f()V
    .locals 1

    iget-object v0, p0, Ltt;->h:LX8;

    invoke-virtual {v0}, LX8;->c()V

    return-void
.end method

.method public final k()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final m(LX8;)V
    .locals 2

    iget-object v0, p0, Ltt;->h:LX8;

    iget-object v1, v0, LX8;->k:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p1, LX8;->l:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
