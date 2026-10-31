.class public final synthetic Lk4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMj;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;


# direct methods
.method public synthetic constructor <init>(Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;I)V
    .locals 0

    iput p2, p0, Lk4;->a:I

    iput-object p1, p0, Lk4;->b:Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final w(Ljava/lang/Object;)V
    .locals 20

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const-string v2, "persist.vendor.gwm.cfg.project.code"

    const/4 v3, 0x4

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x2

    iget-object v7, v0, Lk4;->b:Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;

    iget v8, v0, Lk4;->a:I

    packed-switch v8, :pswitch_data_0

    move-object/from16 v11, p1

    check-cast v11, Ljava/lang/Float;

    sget v1, Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;->B:I

    iget-object v9, v0, Lk4;->b:Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;

    iget v13, v9, LKf;->d:I

    const v10, 0x7f0b01e0

    const-string v12, " km"

    const/4 v14, -0x1

    const-string v15, "%.0f"

    invoke-virtual/range {v9 .. v15}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    return-void

    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Integer;

    iget-object v2, v7, Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;->v:Landroid/widget/TextView;

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v6, :cond_0

    iget-object v1, v7, LKf;->c:LLf;

    iget-object v1, v1, LLf;->d:Ldr;

    invoke-virtual {v1}, Loj;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-eqz v1, :cond_0

    move v3, v5

    :cond_0
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    return-void

    :pswitch_1
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Integer;

    iget-object v4, v0, Lk4;->b:Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;

    iget-object v2, v4, Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;->v:Landroid/widget/TextView;

    if-eqz v2, :cond_3

    iget-object v7, v4, LKf;->c:LLf;

    iget-object v7, v7, LLf;->c:Ldr;

    invoke-virtual {v7}, Loj;->d()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-ne v7, v6, :cond_2

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-eqz v6, :cond_2

    move v3, v5

    :cond_2
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_3
    iget v8, v4, LKf;->d:I

    const v5, 0x7f0b011b

    const-string v7, ""

    const/4 v9, -0x1

    const-string v10, "%d"

    move-object v6, v1

    invoke-virtual/range {v4 .. v10}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    return-void

    :pswitch_2
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Boolean;

    iget-object v2, v7, Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;->A:Landroid/widget/ImageView;

    if-eqz v2, :cond_5

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_4

    const v1, 0x7f080182

    goto :goto_0

    :cond_4
    const v1, 0x7f080181

    :goto_0
    invoke-static {v7, v1}, LH7;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_5
    return-void

    :pswitch_3
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Float;

    sget v2, Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;->B:I

    iget-object v3, v0, Lk4;->b:Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;

    iget-object v2, v3, LKf;->c:LLf;

    iget-object v2, v2, LLf;->s:Ldr;

    iget-boolean v2, v2, Ldr;->l:Z

    if-eqz v2, :cond_6

    const v2, 0x7f0b01f3

    invoke-virtual {v3, v2}, LKf;->c(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2, v5}, LKf;->p(Landroid/view/View;I)V

    const v2, 0x7f0b01f4

    invoke-virtual {v3, v2}, LKf;->c(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2, v5}, LKf;->p(Landroid/view/View;I)V

    iget v7, v3, LKf;->d:I

    const v4, 0x7f0b01f3

    const-string v6, ""

    const/4 v8, -0x1

    const-string v9, "%.0f"

    move-object v5, v1

    invoke-virtual/range {v3 .. v9}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    :cond_6
    return-void

    :pswitch_4
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Float;

    sget v2, Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;->B:I

    iget-object v2, v0, Lk4;->b:Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;

    iget v14, v2, LKf;->d:I

    const v11, 0x7f0b00c0

    const-string v13, " \u00b0C"

    const/4 v15, -0x1

    const-string v16, "%.0f"

    move-object v10, v2

    move-object v12, v1

    invoke-virtual/range {v10 .. v16}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    iget-object v2, v2, Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;->y:Lqg;

    if-eqz v2, :cond_7

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {v2, v1}, Lqg;->setLevelValue(F)V

    :cond_7
    return-void

    :pswitch_5
    move-object/from16 v5, p1

    check-cast v5, Ljava/lang/Float;

    sget v1, Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;->B:I

    iget-object v6, v0, Lk4;->b:Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v1

    cmpl-float v1, v1, v4

    if-lez v1, :cond_8

    iget v7, v6, LKf;->d:I

    const v4, 0x7f0b0215

    const-string v1, " km"

    const/4 v8, -0x1

    const-string v9, "%.0f"

    move-object v3, v6

    move-object v6, v1

    invoke-virtual/range {v3 .. v9}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    goto :goto_1

    :cond_8
    iget v10, v6, LKf;->d:I

    const-string v8, "---"

    const-string v9, " km"

    const v7, 0x7f0b0215

    const/4 v11, -0x1

    const-string v12, "%s"

    invoke-virtual/range {v6 .. v12}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    :goto_1
    return-void

    :pswitch_6
    move-object/from16 v15, p1

    check-cast v15, Ljava/lang/Float;

    sget v1, Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;->B:I

    iget-object v5, v0, Lk4;->b:Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v15}, Ljava/lang/Float;->floatValue()F

    move-result v1

    cmpl-float v1, v1, v4

    if-lez v1, :cond_9

    iget v1, v5, LKf;->d:I

    const v14, 0x7f0b0214

    const-string v16, " km"

    const/16 v18, -0x1

    const-string v19, "%.0f"

    move-object v13, v5

    move/from16 v17, v1

    invoke-virtual/range {v13 .. v19}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    goto :goto_2

    :cond_9
    iget v9, v5, LKf;->d:I

    const-string v7, "---"

    const-string v8, " km"

    const v6, 0x7f0b0214

    const/4 v10, -0x1

    const-string v11, "%s"

    invoke-virtual/range {v5 .. v11}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    :goto_2
    return-void

    :pswitch_7
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    sget v2, Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;->B:I

    iget-boolean v2, v7, LKf;->h:Z

    if-eqz v2, :cond_a

    goto :goto_3

    :cond_a
    if-eq v1, v6, :cond_b

    goto :goto_3

    :cond_b
    invoke-static {}, LUd;->T()V

    :goto_3
    return-void

    :pswitch_8
    move-object/from16 v9, p1

    check-cast v9, Ljava/lang/Float;

    sget v1, Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;->B:I

    iget-object v10, v0, Lk4;->b:Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v9}, Ljava/lang/Float;->floatValue()F

    move-result v1

    cmpl-float v1, v1, v4

    if-lez v1, :cond_c

    iget v11, v10, LKf;->d:I

    const v8, 0x7f0b00fe

    const-string v1, " km"

    const/4 v12, -0x1

    const-string v13, "%.0f"

    move-object v7, v10

    move-object v10, v1

    invoke-virtual/range {v7 .. v13}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    goto :goto_4

    :cond_c
    iget v14, v10, LKf;->d:I

    const-string v12, "---"

    const-string v13, " km"

    const v11, 0x7f0b00fe

    const/4 v15, -0x1

    const-string v16, "%s"

    invoke-virtual/range {v10 .. v16}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    :goto_4
    return-void

    :pswitch_9
    move-object/from16 v3, p1

    check-cast v3, Ljava/lang/Float;

    sget v4, Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;->B:I

    iget-object v4, v0, Lk4;->b:Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v2}, LTf;->F(Landroid/app/Activity;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v5, v4, LKf;->d:I

    const v2, 0x7f0b00fd

    const-string v6, "%"

    const/4 v7, -0x1

    const-string v8, "%.1f"

    move-object v1, v4

    move-object v4, v6

    move v6, v7

    move-object v7, v8

    invoke-virtual/range {v1 .. v7}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    return-void

    :pswitch_a
    move-object/from16 v11, p1

    check-cast v11, Ljava/lang/Float;

    sget v1, Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;->B:I

    iget-object v9, v0, Lk4;->b:Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;

    iget v13, v9, LKf;->d:I

    const v10, 0x7f0b0083

    const-string v12, "V"

    const/4 v14, -0x1

    const-string v15, "%.1f"

    invoke-virtual/range {v9 .. v15}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    return-void

    :pswitch_b
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Float;

    sget v2, Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;->B:I

    iget-object v3, v0, Lk4;->b:Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float/2addr v1, v2

    div-float v2, v1, v2

    iget-object v4, v3, Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;->x:Lqg;

    if-eqz v4, :cond_d

    invoke-virtual {v4, v2}, Lqg;->setLevelValue(F)V

    :cond_d
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    iget v7, v3, LKf;->d:I

    const v4, 0x7f0b0119

    const-string v6, " L"

    const/4 v8, -0x1

    const-string v9, "%.0f"

    invoke-virtual/range {v3 .. v9}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    return-void

    :pswitch_c
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Float;

    sget v2, Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;->B:I

    iget-object v3, v0, Lk4;->b:Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v2

    const/high16 v4, 0x42c80000    # 100.0f

    cmpg-float v2, v2, v4

    if-gez v2, :cond_e

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-static {}, LTf;->u()F

    move-result v2

    mul-float/2addr v2, v1

    goto :goto_5

    :cond_e
    invoke-static {}, LTf;->t()F

    move-result v2

    :goto_5
    invoke-static {}, LTf;->t()F

    move-result v1

    div-float v1, v2, v1

    mul-float/2addr v1, v4

    iget-object v4, v3, Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;->w:Lqg;

    if-eqz v4, :cond_f

    invoke-virtual {v4, v1}, Lqg;->setLevelValue(F)V

    :cond_f
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    iget v7, v3, LKf;->d:I

    const v4, 0x7f0b0115

    const-string v6, " L"

    const/4 v8, -0x1

    const-string v9, "%.0f"

    invoke-virtual/range {v3 .. v9}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    return-void

    :pswitch_d
    move-object/from16 v12, p1

    check-cast v12, Ljava/lang/Float;

    iget-object v10, v0, Lk4;->b:Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;

    iget-object v3, v10, Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;->z:Lqg;

    if-eqz v3, :cond_10

    invoke-virtual {v12}, Ljava/lang/Float;->floatValue()F

    move-result v4

    invoke-virtual {v3, v4}, Lqg;->setLevelValue(F)V

    :cond_10
    invoke-static {v1, v2}, LTf;->F(Landroid/app/Activity;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v14, v10, LKf;->d:I

    const v11, 0x7f0b00fd

    const-string v13, "%"

    const/4 v15, -0x1

    const-string v16, "%.1f"

    invoke-virtual/range {v10 .. v16}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
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
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
