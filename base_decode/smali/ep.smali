.class public final synthetic Lep;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMj;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lru/zinovin/tankspeedometer/SpedometerPanel;


# direct methods
.method public synthetic constructor <init>(Lru/zinovin/tankspeedometer/SpedometerPanel;I)V
    .locals 0

    iput p2, p0, Lep;->a:I

    iput-object p1, p0, Lep;->b:Lru/zinovin/tankspeedometer/SpedometerPanel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final w(Ljava/lang/Object;)V
    .locals 18

    move-object/from16 v0, p0

    const-wide/16 v1, 0x3e8

    const/4 v3, 0x0

    const/4 v4, 0x3

    const/4 v5, -0x1

    const-string v6, "T500.INFO_FR"

    const-string v7, "T500.ACTIVITY"

    const/4 v8, 0x4

    const/4 v9, 0x1

    const/4 v10, 0x2

    iget-object v11, v0, Lep;->b:Lru/zinovin/tankspeedometer/SpedometerPanel;

    const/4 v12, 0x0

    const/4 v13, 0x0

    iget v14, v0, Lep;->a:I

    packed-switch v14, :pswitch_data_0

    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Boolean;

    sget v2, Lru/zinovin/tankspeedometer/SpedometerPanel;->s0:I

    iget-boolean v2, v11, LKf;->h:Z

    if-nez v2, :cond_0

    iget-object v2, v11, Lru/zinovin/tankspeedometer/SpedometerPanel;->V:Ljava/lang/String;

    const-string v3, "3"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "RightFrameActive="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v7, v2}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v2, v11, Lru/zinovin/tankspeedometer/SpedometerPanel;->d0:Z

    invoke-virtual {v11, v2}, Lru/zinovin/tankspeedometer/SpedometerPanel;->z(Z)V

    invoke-virtual {v11, v1}, Lru/zinovin/tankspeedometer/SpedometerPanel;->K(Ljava/lang/Boolean;)V

    const-string v1, "setRightFrameActiveObserver"

    invoke-static {v6, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v11, v13}, Lru/zinovin/tankspeedometer/SpedometerPanel;->x(Z)V

    :cond_0
    return-void

    :pswitch_0
    move-object/from16 v7, p1

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    sget v8, Lru/zinovin/tankspeedometer/SpedometerPanel;->s0:I

    if-eq v7, v9, :cond_b

    iget-object v6, v11, LKf;->c:LLf;

    if-eq v7, v10, :cond_7

    if-eq v7, v4, :cond_6

    const/4 v4, 0x6

    const-string v8, "naviFullscreen"

    if-eq v7, v4, :cond_4

    const/16 v1, 0x9

    if-eq v7, v1, :cond_1

    goto/16 :goto_1

    :cond_1
    iget-object v1, v11, Lru/zinovin/tankspeedometer/SpedometerPanel;->V:Ljava/lang/String;

    const-string v2, "0"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    iput-object v2, v11, Lru/zinovin/tankspeedometer/SpedometerPanel;->V:Ljava/lang/String;

    invoke-static {v13}, LUd;->p0(Z)V

    invoke-virtual {v11}, Lru/zinovin/tankspeedometer/SpedometerPanel;->w()V

    const v1, 0x7f0e0181

    iput v1, v11, LKf;->f:I

    invoke-static {v11}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    invoke-virtual {v2, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v11, v1}, LKf;->o(Landroid/view/View;)V

    invoke-virtual {v11}, Lru/zinovin/tankspeedometer/SpedometerPanel;->u()V

    iput-boolean v9, v11, LKf;->h:Z

    iput-boolean v13, v11, Lru/zinovin/tankspeedometer/SpedometerPanel;->c0:Z

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v6, v1}, LLf;->i(Ljava/lang/Boolean;)V

    goto/16 :goto_1

    :cond_2
    iget-object v1, v6, LLf;->u:Ldr;

    invoke-virtual {v1}, Loj;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, v11, Lru/zinovin/tankspeedometer/SpedometerPanel;->V:Ljava/lang/String;

    iput-boolean v13, v11, LKf;->h:Z

    invoke-static {v8}, LTd;->p(Ljava/lang/String;)Z

    move-result v1

    const-string v2, "useNavi"

    invoke-static {v2}, LTd;->p(Ljava/lang/String;)Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v6, v3}, LLf;->i(Ljava/lang/Boolean;)V

    iput-boolean v2, v11, Lru/zinovin/tankspeedometer/SpedometerPanel;->c0:Z

    if-eqz v2, :cond_3

    invoke-static {}, LUd;->L()Z

    move-result v2

    xor-int/2addr v2, v9

    invoke-static {v2}, LUd;->p0(Z)V

    invoke-static {v1}, LUd;->n0(Z)V

    :cond_3
    const-string v1, ""

    iput-object v1, v11, Lru/zinovin/tankspeedometer/SpedometerPanel;->m0:Ljava/lang/String;

    invoke-virtual {v11, v9}, Lru/zinovin/tankspeedometer/SpedometerPanel;->t(Z)V

    invoke-virtual {v11}, Lru/zinovin/tankspeedometer/SpedometerPanel;->r()V

    goto/16 :goto_1

    :cond_4
    iget-boolean v3, v11, LKf;->h:Z

    if-nez v3, :cond_c

    invoke-virtual {v11}, Lru/zinovin/tankspeedometer/SpedometerPanel;->F()Z

    move-result v3

    if-nez v3, :cond_c

    invoke-static {}, LUd;->A()I

    move-result v3

    if-eq v3, v5, :cond_c

    invoke-static {v13}, LUd;->p0(Z)V

    invoke-static {v8}, LTd;->p(Ljava/lang/String;)Z

    move-result v3

    xor-int/2addr v3, v9

    iget-object v4, v11, LKf;->b:Landroid/content/SharedPreferences;

    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    const-string v5, "usePreferences"

    invoke-interface {v4, v5, v13}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, Lmk;->l(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v7

    const-string v10, "selectedTheme"

    const-string v12, "Audi Virtual Cockpit"

    invoke-interface {v7, v10, v12}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v12, "prefs_"

    invoke-direct {v10, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7, v13}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v7

    const-string v10, "useDefaultSwitchNavi"

    invoke-interface {v7, v10, v9}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v10

    if-eqz v10, :cond_5

    const-string v7, "prefs_Default"

    invoke-virtual {v5, v7, v13}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v7

    :cond_5
    invoke-interface {v7}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v5

    invoke-interface {v5, v8, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v5}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    iget-object v6, v6, LLf;->w:Ldr;

    invoke-virtual {v6, v5}, Ldr;->f(Ljava/lang/Object;)V

    iput-boolean v3, v11, Lru/zinovin/tankspeedometer/SpedometerPanel;->d0:Z

    invoke-static {v3}, LUd;->n0(Z)V

    new-instance v5, Landroid/os/Handler;

    invoke-direct {v5}, Landroid/os/Handler;-><init>()V

    new-instance v6, Ly3;

    invoke-direct {v6, v9, v11, v4, v3}, Ly3;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    invoke-virtual {v5, v6, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto/16 :goto_1

    :cond_6
    iget-boolean v1, v11, LKf;->h:Z

    if-nez v1, :cond_c

    iget-object v1, v11, Lru/zinovin/tankspeedometer/SpedometerPanel;->b0:Lnp;

    iget-object v1, v1, Lnp;->c:Ljava/lang/Object;

    check-cast v1, Ld2;

    iget-object v1, v1, Ld2;->b:Ljava/lang/Object;

    check-cast v1, LMf;

    iget-boolean v1, v1, LMf;->z:Z

    if-eqz v1, :cond_c

    invoke-virtual {v11}, Lru/zinovin/tankspeedometer/SpedometerPanel;->D()Luj;

    move-result-object v1

    iget-boolean v2, v11, Lru/zinovin/tankspeedometer/SpedometerPanel;->f0:Z

    xor-int/2addr v2, v9

    iput-boolean v2, v11, Lru/zinovin/tankspeedometer/SpedometerPanel;->f0:Z

    iget-object v2, v11, LKf;->b:Landroid/content/SharedPreferences;

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v3, "MICROMODE"

    iget-boolean v4, v11, Lru/zinovin/tankspeedometer/SpedometerPanel;->f0:Z

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-virtual {v11, v1}, Lru/zinovin/tankspeedometer/SpedometerPanel;->v(Luj;)V

    goto :goto_1

    :cond_7
    iget-boolean v1, v11, LKf;->h:Z

    if-nez v1, :cond_c

    const-string v1, "useSysNavi"

    invoke-static {v1}, LTd;->p(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8

    iget-boolean v1, v11, Lru/zinovin/tankspeedometer/SpedometerPanel;->c0:Z

    xor-int/2addr v1, v9

    iput-boolean v1, v11, Lru/zinovin/tankspeedometer/SpedometerPanel;->c0:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v6, v1}, LLf;->i(Ljava/lang/Boolean;)V

    invoke-virtual {v11, v13}, Lru/zinovin/tankspeedometer/SpedometerPanel;->t(Z)V

    invoke-virtual {v11}, Lru/zinovin/tankspeedometer/SpedometerPanel;->r()V

    goto :goto_1

    :cond_8
    invoke-static {}, LUd;->L()Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-static {}, LUd;->A()I

    move-result v1

    if-eq v1, v5, :cond_9

    invoke-static {v13}, LUd;->p0(Z)V

    iput-boolean v13, v11, Lru/zinovin/tankspeedometer/SpedometerPanel;->c0:Z

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v6, v1}, LLf;->i(Ljava/lang/Boolean;)V

    goto :goto_0

    :cond_9
    iput-boolean v9, v11, Lru/zinovin/tankspeedometer/SpedometerPanel;->c0:Z

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v6, v1}, LLf;->i(Ljava/lang/Boolean;)V

    iget-boolean v1, v11, Lru/zinovin/tankspeedometer/SpedometerPanel;->d0:Z

    invoke-static {v1}, LUd;->n0(Z)V

    :goto_0
    invoke-virtual {v11, v13}, Lru/zinovin/tankspeedometer/SpedometerPanel;->t(Z)V

    invoke-virtual {v11}, Lru/zinovin/tankspeedometer/SpedometerPanel;->r()V

    goto :goto_1

    :cond_a
    invoke-static {}, LUd;->T()V

    goto :goto_1

    :cond_b
    iget-boolean v1, v11, LKf;->h:Z

    if-nez v1, :cond_c

    const-string v1, "onKeyEvent"

    invoke-static {v6, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v11, v9}, Lru/zinovin/tankspeedometer/SpedometerPanel;->x(Z)V

    invoke-virtual {v11}, Lru/zinovin/tankspeedometer/SpedometerPanel;->J()V

    :cond_c
    :goto_1
    return-void

    :pswitch_1
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Integer;

    sget v1, Lru/zinovin/tankspeedometer/SpedometerPanel;->s0:I

    iget-object v2, v0, Lep;->b:Lru/zinovin/tankspeedometer/SpedometerPanel;

    iget-object v4, v2, LKf;->j:Ljava/lang/String;

    iget v6, v2, LKf;->d:I

    iget v7, v2, LKf;->e:I

    const-string v8, "%s"

    const-string v5, ""

    const v3, 0x7f0b01f4

    invoke-virtual/range {v2 .. v8}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    return-void

    :pswitch_2
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Boolean;

    iget-object v2, v11, Lru/zinovin/tankspeedometer/SpedometerPanel;->G:Landroid/widget/ImageView;

    if-eqz v2, :cond_e

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_d

    const v1, 0x7f080182

    goto :goto_2

    :cond_d
    const v1, 0x7f080181

    :goto_2
    invoke-static {v11, v1}, LH7;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_e
    return-void

    :pswitch_3
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Float;

    sget v2, Lru/zinovin/tankspeedometer/SpedometerPanel;->s0:I

    iget-object v2, v0, Lep;->b:Lru/zinovin/tankspeedometer/SpedometerPanel;

    iget v7, v2, LKf;->d:I

    iget v8, v2, LKf;->e:I

    const-string v9, "%.0f"

    const-string v6, " \u00b0C"

    const v4, 0x7f0b00c0

    move-object v3, v2

    move-object v5, v1

    invoke-virtual/range {v3 .. v9}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    iget-object v3, v2, Lru/zinovin/tankspeedometer/SpedometerPanel;->E:Lqg;

    if-eqz v3, :cond_f

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v4

    invoke-virtual {v3, v4}, Lqg;->setLevelValue(F)V

    :cond_f
    iget-object v3, v2, Lru/zinovin/tankspeedometer/SpedometerPanel;->A:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    if-eqz v3, :cond_10

    iget-object v2, v2, Lru/zinovin/tankspeedometer/SpedometerPanel;->b0:Lnp;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    iget-object v2, v2, Lnp;->c:Ljava/lang/Object;

    check-cast v2, Ld2;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3, v1}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->c(F)V

    :cond_10
    return-void

    :pswitch_4
    move-object/from16 v6, p1

    check-cast v6, Ljava/lang/Float;

    sget v1, Lru/zinovin/tankspeedometer/SpedometerPanel;->s0:I

    iget-object v4, v0, Lep;->b:Lru/zinovin/tankspeedometer/SpedometerPanel;

    iget-object v1, v4, LKf;->c:LLf;

    iget-object v1, v1, LLf;->s:Ldr;

    iget-boolean v1, v1, Ldr;->l:Z

    if-eqz v1, :cond_11

    const v1, 0x7f0b01f3

    invoke-virtual {v4, v1}, LKf;->c(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v13}, LKf;->p(Landroid/view/View;I)V

    const v1, 0x7f0b01f4

    invoke-virtual {v4, v1}, LKf;->c(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, v13}, LKf;->p(Landroid/view/View;I)V

    iget v8, v4, LKf;->d:I

    iget v9, v4, LKf;->e:I

    const-string v10, "%.0f"

    const-string v7, ""

    const v5, 0x7f0b01f3

    invoke-virtual/range {v4 .. v10}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    :cond_11
    return-void

    :pswitch_5
    move-object/from16 v13, p1

    check-cast v13, Ljava/lang/Float;

    sget v1, Lru/zinovin/tankspeedometer/SpedometerPanel;->s0:I

    iget-object v2, v0, Lep;->b:Lru/zinovin/tankspeedometer/SpedometerPanel;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v13}, Ljava/lang/Float;->floatValue()F

    move-result v1

    cmpl-float v1, v1, v12

    if-lez v1, :cond_12

    iget v15, v2, LKf;->d:I

    iget v1, v2, LKf;->e:I

    const-string v17, "%.0f"

    const-string v14, " km"

    const v12, 0x7f0b0215

    move-object v11, v2

    move/from16 v16, v1

    invoke-virtual/range {v11 .. v17}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    goto :goto_3

    :cond_12
    iget v6, v2, LKf;->d:I

    iget v7, v2, LKf;->e:I

    const-string v4, "---"

    const-string v5, " km"

    const v3, 0x7f0b0215

    const-string v8, "%s"

    invoke-virtual/range {v2 .. v8}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    :goto_3
    return-void

    :pswitch_6
    move-object/from16 v11, p1

    check-cast v11, Ljava/lang/Float;

    sget v1, Lru/zinovin/tankspeedometer/SpedometerPanel;->s0:I

    iget-object v2, v0, Lep;->b:Lru/zinovin/tankspeedometer/SpedometerPanel;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v11}, Ljava/lang/Float;->floatValue()F

    move-result v1

    cmpl-float v1, v1, v12

    if-lez v1, :cond_13

    iget v13, v2, LKf;->d:I

    iget v14, v2, LKf;->e:I

    const-string v15, "%.0f"

    const-string v12, " km"

    const v10, 0x7f0b0214

    move-object v9, v2

    invoke-virtual/range {v9 .. v15}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    goto :goto_4

    :cond_13
    iget v6, v2, LKf;->d:I

    iget v7, v2, LKf;->e:I

    const-string v4, "---"

    const-string v5, " km"

    const v3, 0x7f0b0214

    const-string v8, "%s"

    invoke-virtual/range {v2 .. v8}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    :goto_4
    return-void

    :pswitch_7
    move-object/from16 v11, p1

    check-cast v11, Ljava/lang/Float;

    sget v1, Lru/zinovin/tankspeedometer/SpedometerPanel;->s0:I

    iget-object v9, v0, Lep;->b:Lru/zinovin/tankspeedometer/SpedometerPanel;

    iget v13, v9, LKf;->d:I

    iget v14, v9, LKf;->e:I

    const-string v15, "%.0f"

    const-string v12, " km"

    const v10, 0x7f0b01e0

    invoke-virtual/range {v9 .. v15}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    return-void

    :pswitch_8
    move-object/from16 v3, p1

    check-cast v3, Ljava/lang/Float;

    sget v1, Lru/zinovin/tankspeedometer/SpedometerPanel;->s0:I

    iget-object v4, v0, Lep;->b:Lru/zinovin/tankspeedometer/SpedometerPanel;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v1

    cmpl-float v1, v1, v12

    if-lez v1, :cond_14

    iget v5, v4, LKf;->d:I

    iget v6, v4, LKf;->e:I

    const-string v7, "%.0f"

    const-string v8, " km"

    const v2, 0x7f0b00fe

    move-object v1, v4

    move-object v4, v8

    invoke-virtual/range {v1 .. v7}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    goto :goto_5

    :cond_14
    iget v8, v4, LKf;->d:I

    iget v9, v4, LKf;->e:I

    const-string v6, "---"

    const-string v7, " km"

    const v5, 0x7f0b00fe

    const-string v10, "%s"

    invoke-virtual/range {v4 .. v10}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    :goto_5
    return-void

    :pswitch_9
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Float;

    sget v2, Lru/zinovin/tankspeedometer/SpedometerPanel;->s0:I

    iget-object v3, v0, Lep;->b:Lru/zinovin/tankspeedometer/SpedometerPanel;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float/2addr v1, v2

    div-float v2, v1, v2

    iget-object v4, v3, Lru/zinovin/tankspeedometer/SpedometerPanel;->D:Lqg;

    if-eqz v4, :cond_15

    invoke-virtual {v4, v2}, Lqg;->setLevelValue(F)V

    :cond_15
    iget-object v4, v3, Lru/zinovin/tankspeedometer/SpedometerPanel;->z:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    if-eqz v4, :cond_16

    iget-object v5, v3, Lru/zinovin/tankspeedometer/SpedometerPanel;->b0:Lnp;

    iget-object v5, v5, Lnp;->c:Ljava/lang/Object;

    check-cast v5, Ld2;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4, v2}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->c(F)V

    :cond_16
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    iget v7, v3, LKf;->d:I

    iget v8, v3, LKf;->e:I

    const-string v9, "%.0f"

    const-string v6, " L"

    const v4, 0x7f0b0119

    invoke-virtual/range {v3 .. v9}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    return-void

    :pswitch_a
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Float;

    sget v2, Lru/zinovin/tankspeedometer/SpedometerPanel;->s0:I

    iget-object v3, v0, Lep;->b:Lru/zinovin/tankspeedometer/SpedometerPanel;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v2

    const/high16 v4, 0x42c80000    # 100.0f

    cmpg-float v2, v2, v4

    if-gez v2, :cond_17

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-static {}, LTf;->u()F

    move-result v2

    mul-float/2addr v2, v1

    goto :goto_6

    :cond_17
    invoke-static {}, LTf;->t()F

    move-result v2

    :goto_6
    invoke-static {}, LTf;->t()F

    move-result v1

    div-float v1, v2, v1

    mul-float/2addr v1, v4

    iget-object v4, v3, Lru/zinovin/tankspeedometer/SpedometerPanel;->C:Lqg;

    if-eqz v4, :cond_18

    invoke-virtual {v4, v1}, Lqg;->setLevelValue(F)V

    :cond_18
    iget-object v4, v3, Lru/zinovin/tankspeedometer/SpedometerPanel;->y:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    if-eqz v4, :cond_19

    iget-object v5, v3, Lru/zinovin/tankspeedometer/SpedometerPanel;->b0:Lnp;

    iget-object v5, v5, Lnp;->c:Ljava/lang/Object;

    check-cast v5, Ld2;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4, v1}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->c(F)V

    :cond_19
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    iget v7, v3, LKf;->d:I

    iget v8, v3, LKf;->e:I

    const-string v9, "%.0f"

    const-string v6, " L"

    const v4, 0x7f0b0115

    invoke-virtual/range {v3 .. v9}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    return-void

    :pswitch_b
    move-object/from16 v12, p1

    check-cast v12, Ljava/lang/Float;

    iget-object v10, v0, Lep;->b:Lru/zinovin/tankspeedometer/SpedometerPanel;

    iget-object v1, v10, Lru/zinovin/tankspeedometer/SpedometerPanel;->F:Lqg;

    if-eqz v1, :cond_1a

    invoke-virtual {v12}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-virtual {v1, v2}, Lqg;->setLevelValue(F)V

    :cond_1a
    const-string v1, "persist.vendor.gwm.cfg.project.code"

    invoke-static {v3, v1}, LTf;->F(Landroid/app/Activity;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v14, v10, LKf;->d:I

    iget v15, v10, LKf;->e:I

    const-string v16, "%.1f"

    const-string v13, "%"

    const v11, 0x7f0b00fd

    invoke-virtual/range {v10 .. v16}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    return-void

    :pswitch_c
    move-object/from16 v3, p1

    check-cast v3, Ljava/lang/Float;

    sget v1, Lru/zinovin/tankspeedometer/SpedometerPanel;->s0:I

    iget-object v1, v0, Lep;->b:Lru/zinovin/tankspeedometer/SpedometerPanel;

    iget v5, v1, LKf;->d:I

    iget v6, v1, LKf;->e:I

    const-string v7, "%.1f"

    const-string v4, "V"

    const v2, 0x7f0b0083

    invoke-virtual/range {v1 .. v7}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    return-void

    :pswitch_d
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Integer;

    iget-object v2, v11, Lru/zinovin/tankspeedometer/SpedometerPanel;->B:Landroid/widget/TextView;

    if-eqz v2, :cond_1c

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v10, :cond_1b

    iget-object v1, v11, LKf;->c:LLf;

    iget-object v1, v1, LLf;->d:Ldr;

    invoke-virtual {v1}, Loj;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-eqz v1, :cond_1b

    move v8, v13

    :cond_1b
    invoke-virtual {v2, v8}, Landroid/view/View;->setVisibility(I)V

    :cond_1c
    return-void

    :pswitch_e
    move-object/from16 v3, p1

    check-cast v3, Ljava/lang/Integer;

    sget v6, Lru/zinovin/tankspeedometer/SpedometerPanel;->s0:I

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    const v14, 0x7f0b0186

    if-eq v6, v8, :cond_1d

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-ne v6, v10, :cond_1e

    :cond_1d
    iget v6, v11, Lru/zinovin/tankspeedometer/SpedometerPanel;->W:I

    if-ne v6, v4, :cond_1e

    const-string v4, "ignitionOff"

    invoke-static {v7, v4}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v13}, LUd;->p0(Z)V

    invoke-virtual {v11, v14}, LKf;->c(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    invoke-virtual {v4, v12}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    invoke-virtual {v4, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    new-instance v2, Lfp;

    invoke-direct {v2}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    goto :goto_8

    :cond_1e
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-ne v6, v4, :cond_22

    iget v4, v11, Lru/zinovin/tankspeedometer/SpedometerPanel;->W:I

    if-eq v4, v8, :cond_1f

    if-ne v4, v10, :cond_22

    :cond_1f
    const-string v4, "ignitionOn"

    invoke-static {v7, v4}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, LUd;->A()I

    move-result v4

    if-eq v4, v5, :cond_20

    goto :goto_7

    :cond_20
    move v9, v13

    :goto_7
    iget-object v4, v11, LKf;->c:LLf;

    iget-object v5, v4, LLf;->v:Ldr;

    invoke-virtual {v5}, Loj;->d()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    iget-object v4, v4, LLf;->w:Ldr;

    invoke-virtual {v4}, Loj;->d()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-nez v9, :cond_21

    if-eqz v5, :cond_21

    invoke-static {v4}, LUd;->n0(Z)V

    :cond_21
    invoke-virtual {v11, v14}, LKf;->c(I)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4, v12}, Landroid/view/View;->setAlpha(F)V

    invoke-virtual {v4}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-virtual {v4, v5}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    invoke-virtual {v4, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    new-instance v2, Lfp;

    invoke-direct {v2}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    invoke-virtual {v1, v2}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    :cond_22
    :goto_8
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, v11, Lru/zinovin/tankspeedometer/SpedometerPanel;->W:I

    return-void

    :pswitch_f
    move-object/from16 v4, p1

    check-cast v4, Ljava/lang/Integer;

    iget-object v2, v0, Lep;->b:Lru/zinovin/tankspeedometer/SpedometerPanel;

    iget-object v1, v2, Lru/zinovin/tankspeedometer/SpedometerPanel;->B:Landroid/widget/TextView;

    if-eqz v1, :cond_24

    iget-object v3, v2, LKf;->c:LLf;

    iget-object v3, v3, LLf;->c:Ldr;

    invoke-virtual {v3}, Loj;->d()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-ne v3, v10, :cond_23

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-eqz v3, :cond_23

    move v8, v13

    :cond_23
    invoke-virtual {v1, v8}, Landroid/view/View;->setVisibility(I)V

    :cond_24
    iget v6, v2, LKf;->d:I

    iget v7, v2, LKf;->e:I

    const-string v8, "%d"

    const-string v5, ""

    const v3, 0x7f0b011b

    invoke-virtual/range {v2 .. v8}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    return-void

    :pswitch_10
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Float;

    sget v2, Lru/zinovin/tankspeedometer/SpedometerPanel;->s0:I

    iget-object v2, v0, Lep;->b:Lru/zinovin/tankspeedometer/SpedometerPanel;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v3

    cmpl-float v3, v3, v12

    if-ltz v3, :cond_26

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    const/high16 v3, 0x447a0000    # 1000.0f

    div-float/2addr v1, v3

    iget-object v3, v2, Lru/zinovin/tankspeedometer/SpedometerPanel;->b0:Lnp;

    iget-object v3, v3, Lnp;->c:Ljava/lang/Object;

    check-cast v3, Ld2;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/high16 v3, 0x41200000    # 10.0f

    mul-float/2addr v3, v1

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    iget-object v3, v2, Lru/zinovin/tankspeedometer/SpedometerPanel;->v:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    if-eqz v3, :cond_25

    invoke-virtual {v3, v1}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->c(F)V

    :cond_25
    iget v3, v2, Lru/zinovin/tankspeedometer/SpedometerPanel;->o0:F

    sub-float v3, v1, v3

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    float-to-double v3, v3

    const-wide v5, 0x3f847ae147ae147bL    # 0.01

    cmpl-double v3, v3, v5

    if-lez v3, :cond_26

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    iget v8, v2, LKf;->e:I

    const-string v9, "%.1f"

    const-string v6, ""

    const v4, 0x7f0b0227

    move-object v3, v2

    move v7, v8

    invoke-virtual/range {v3 .. v9}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    iput v1, v2, Lru/zinovin/tankspeedometer/SpedometerPanel;->o0:F

    :cond_26
    return-void

    :pswitch_11
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Float;

    sget v2, Lru/zinovin/tankspeedometer/SpedometerPanel;->s0:I

    iget-object v3, v0, Lep;->b:Lru/zinovin/tankspeedometer/SpedometerPanel;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v2

    cmpl-float v2, v2, v12

    if-ltz v2, :cond_28

    iget-object v2, v3, Lru/zinovin/tankspeedometer/SpedometerPanel;->u:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    if-eqz v2, :cond_27

    iget-object v2, v3, Lru/zinovin/tankspeedometer/SpedometerPanel;->b0:Lnp;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v4

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v5

    invoke-virtual {v3, v5}, Lru/zinovin/tankspeedometer/SpedometerPanel;->E(F)F

    move-result v5

    mul-float/2addr v5, v4

    iget-object v2, v2, Lnp;->c:Ljava/lang/Object;

    check-cast v2, Ld2;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v3, Lru/zinovin/tankspeedometer/SpedometerPanel;->u:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    invoke-virtual {v2, v5}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->c(F)V

    :cond_27
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {v3, v1}, Lru/zinovin/tankspeedometer/SpedometerPanel;->E(F)F

    move-result v1

    mul-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    iget v8, v3, LKf;->e:I

    const-string v9, "%.0f"

    const-string v6, ""

    const v4, 0x7f0b025b

    move v7, v8

    invoke-virtual/range {v3 .. v9}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    :cond_28
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
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
