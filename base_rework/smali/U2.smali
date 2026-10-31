.class public final synthetic LU2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, LU2;->a:I

    iput-object p1, p0, LU2;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onSharedPreferenceChanged(Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v4, "fuel_custom_tank_enabled"

    const-string v5, "fuel_tank_capacity"

    const-string v6, "fuel_conversion_coef"

    const-string v7, "Changed preference "

    const-string v8, "1.055"

    const-string v9, "1.046"

    const-string v10, "1.042"

    const-string v11, "76"

    const-string v12, "96"

    const-string v13, "ipSpeed2"

    const-string v14, "ipSpeed1"

    const-string v15, "ipSpeedK2"

    const-string v3, "ipSpeedK1"

    move-object/from16 v17, v7

    const-string v7, "ipSpeedKDefault"

    const/16 v18, 0x4

    const/16 v19, 0x3

    const/16 v20, 0x2

    move-object/from16 v21, v6

    iget-object v6, v0, LU2;->b:Ljava/lang/Object;

    move-object/from16 v22, v5

    iget v5, v0, LU2;->a:I

    packed-switch v5, :pswitch_data_0

    check-cast v6, LOq;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "tiresLowValue"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "210"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    iput v1, v6, LOq;->l:F

    iget-object v1, v6, LOq;->e:LLf;

    iget-object v1, v1, LLf;->z:Ldr;

    invoke-virtual {v1}, Loj;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v6, v1}, LOq;->e(Ljava/lang/String;)V

    :cond_0
    return-void

    :pswitch_0
    check-cast v6, Lgp;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_0

    :goto_0
    const/16 v18, -0x1

    goto :goto_1

    :sswitch_0
    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    goto :goto_0

    :sswitch_1
    invoke-virtual {v2, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    move/from16 v18, v19

    goto :goto_1

    :sswitch_2
    invoke-virtual {v2, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_0

    :cond_2
    move/from16 v18, v20

    goto :goto_1

    :sswitch_3
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    const/16 v18, 0x1

    goto :goto_1

    :sswitch_4
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_0

    :cond_4
    const/16 v18, 0x0

    :cond_5
    :goto_1
    packed-switch v18, :pswitch_data_1

    goto :goto_2

    :pswitch_1
    invoke-interface {v1, v2, v12}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    iput v1, v6, Lgp;->l:F

    goto :goto_2

    :pswitch_2
    invoke-interface {v1, v2, v11}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    iput v1, v6, Lgp;->k:F

    goto :goto_2

    :pswitch_3
    invoke-interface {v1, v2, v10}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    iput v1, v6, Lgp;->j:F

    goto :goto_2

    :pswitch_4
    invoke-interface {v1, v2, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    iput v1, v6, Lgp;->i:F

    goto :goto_2

    :pswitch_5
    invoke-interface {v1, v2, v8}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    iput v1, v6, Lgp;->h:F

    :goto_2
    return-void

    :pswitch_6
    sget v5, Lru/zinovin/tankspeedometer/SpedometerPanel;->s0:I

    check-cast v6, Lru/zinovin/tankspeedometer/SpedometerPanel;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v5, "T500.ACTIVITY"

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->hashCode()I

    move-result v23

    sparse-switch v23, :sswitch_data_1

    :goto_3
    const/4 v3, -0x1

    goto/16 :goto_4

    :sswitch_5
    const-string v3, "selectedTheme"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    goto :goto_3

    :cond_6
    const/16 v3, 0xa

    goto/16 :goto_4

    :sswitch_6
    invoke-virtual {v2, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    goto :goto_3

    :cond_7
    const/16 v3, 0x9

    goto/16 :goto_4

    :sswitch_7
    invoke-virtual {v2, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_8

    goto :goto_3

    :cond_8
    const/16 v3, 0x8

    goto/16 :goto_4

    :sswitch_8
    const-string v3, "extFirmware"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    goto :goto_3

    :cond_9
    const/4 v3, 0x7

    goto :goto_4

    :sswitch_9
    invoke-virtual {v2, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    goto :goto_3

    :cond_a
    const/4 v3, 0x6

    goto :goto_4

    :sswitch_a
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    goto :goto_3

    :cond_b
    const/4 v3, 0x5

    goto :goto_4

    :sswitch_b
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    goto :goto_3

    :cond_c
    move/from16 v3, v18

    goto :goto_4

    :sswitch_c
    move-object/from16 v3, v22

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    goto :goto_3

    :cond_d
    move/from16 v3, v19

    goto :goto_4

    :sswitch_d
    move-object/from16 v7, v21

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_e

    goto :goto_3

    :cond_e
    move/from16 v3, v20

    goto :goto_4

    :sswitch_e
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_f

    goto :goto_3

    :cond_f
    const/4 v3, 0x1

    goto :goto_4

    :sswitch_f
    const-string v3, "showNaviBorder"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_10

    goto :goto_3

    :cond_10
    const/4 v3, 0x0

    :goto_4
    packed-switch v3, :pswitch_data_2

    goto/16 :goto_5

    :pswitch_7
    move-object/from16 v3, v17

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v6}, Lru/zinovin/tankspeedometer/SpedometerPanel;->D()Luj;

    move-result-object v1

    invoke-virtual {v6, v1}, Lru/zinovin/tankspeedometer/SpedometerPanel;->v(Luj;)V

    goto/16 :goto_5

    :pswitch_8
    invoke-interface {v1, v2, v12}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    iput v1, v6, Lru/zinovin/tankspeedometer/SpedometerPanel;->U:F

    goto/16 :goto_5

    :pswitch_9
    invoke-interface {v1, v2, v11}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    iput v1, v6, Lru/zinovin/tankspeedometer/SpedometerPanel;->T:F

    goto/16 :goto_5

    :pswitch_a
    move-object/from16 v3, v17

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v3}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x1

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, v6, LKf;->l:Z

    new-instance v1, LAf;

    invoke-virtual {v6}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2, v6}, LAf;-><init>(Landroid/content/Context;LDg;)V

    iput-object v1, v6, Lru/zinovin/tankspeedometer/SpedometerPanel;->Z:LAf;

    invoke-virtual {v6, v3}, Lru/zinovin/tankspeedometer/SpedometerPanel;->t(Z)V

    invoke-virtual {v6}, Lru/zinovin/tankspeedometer/SpedometerPanel;->r()V

    goto/16 :goto_5

    :pswitch_b
    invoke-interface {v1, v2, v10}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    iput v1, v6, Lru/zinovin/tankspeedometer/SpedometerPanel;->S:F

    goto :goto_5

    :pswitch_c
    invoke-interface {v1, v2, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    iput v1, v6, Lru/zinovin/tankspeedometer/SpedometerPanel;->R:F

    goto :goto_5

    :pswitch_d
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Fuel settings changed ("

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "), refreshing display"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, v6, LKf;->c:LLf;

    invoke-virtual {v1}, LLf;->c()Ljava/lang/Float;

    move-result-object v2

    if-eqz v2, :cond_12

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v3

    const/4 v4, 0x0

    cmpl-float v3, v3, v4

    if-ltz v3, :cond_12

    invoke-virtual {v1, v2}, LLf;->g(Ljava/lang/Float;)V

    goto :goto_5

    :pswitch_e
    invoke-interface {v1, v2, v8}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    iput v1, v6, Lru/zinovin/tankspeedometer/SpedometerPanel;->Q:F

    goto :goto_5

    :pswitch_f
    move-object/from16 v3, v17

    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v5, v3}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v3, v6, Lru/zinovin/tankspeedometer/SpedometerPanel;->c0:Z

    if-eqz v3, :cond_12

    const/4 v3, 0x1

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-virtual {v6}, Lru/zinovin/tankspeedometer/SpedometerPanel;->F()Z

    move-result v1

    iget-boolean v2, v6, Lru/zinovin/tankspeedometer/SpedometerPanel;->d0:Z

    invoke-virtual {v6, v1, v2}, LKf;->a(ZZ)V

    goto :goto_5

    :cond_11
    const v1, 0x7f0b01c5

    invoke-virtual {v6, v1}, LKf;->c(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz v1, :cond_12

    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    :cond_12
    :goto_5
    return-void

    :pswitch_10
    move-object/from16 v3, v17

    sget v4, Lru/zinovin/tankspeedometer/MainActivity;->M:I

    check-cast v6, Lru/zinovin/tankspeedometer/MainActivity;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "T500.MAIN"

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_2

    :goto_6
    const/16 v16, -0x1

    goto :goto_7

    :sswitch_10
    const-string v5, "usePreferences"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_13

    goto :goto_6

    :cond_13
    const/16 v16, 0x5

    goto :goto_7

    :sswitch_11
    const-string v5, "carModel"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_14

    goto :goto_6

    :cond_14
    move/from16 v16, v18

    goto :goto_7

    :sswitch_12
    const-string v5, "useHud"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_15

    goto :goto_6

    :cond_15
    move/from16 v16, v19

    goto :goto_7

    :sswitch_13
    const-string v5, "ipType"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_16

    goto :goto_6

    :cond_16
    move/from16 v16, v20

    goto :goto_7

    :sswitch_14
    const-string v5, "naviPackage"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_17

    goto :goto_6

    :cond_17
    const/16 v16, 0x1

    goto :goto_7

    :sswitch_15
    const-string v5, "language"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_18

    goto :goto_6

    :cond_18
    const/16 v16, 0x0

    :goto_7
    packed-switch v16, :pswitch_data_3

    goto/16 :goto_8

    :pswitch_11
    const/4 v3, 0x1

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, v6, Lru/zinovin/tankspeedometer/MainActivity;->K:Z

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Changed usePreferences="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v2, v6, Lru/zinovin/tankspeedometer/MainActivity;->K:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_8

    :pswitch_12
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_19

    invoke-static {}, LUd;->m0()V

    goto/16 :goto_8

    :cond_19
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    const-string v2, "ru.zinovin.tankspeedometer.T500_HUD_STOP"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v6, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_8

    :pswitch_13
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, LUd;->o0()V

    goto :goto_8

    :pswitch_14
    const/4 v3, 0x0

    iget-object v4, v6, Lru/zinovin/tankspeedometer/MainActivity;->I:Landroid/content/SharedPreferences;

    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-static {}, LUd;->A()I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_1a

    const/4 v4, 0x1

    invoke-static {v4}, LUd;->p0(Z)V

    move v3, v4

    :cond_1a
    const-string v4, "ru.yandex.yandexnavi"

    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget-object v7, v6, Lru/zinovin/tankspeedometer/MainActivity;->L:LLf;

    iget-object v7, v7, LLf;->I:Ldr;

    invoke-virtual {v7, v5}, Ldr;->f(Ljava/lang/Object;)V

    new-instance v5, Landroid/os/Handler;

    invoke-direct {v5}, Landroid/os/Handler;-><init>()V

    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    const-string v4, "ru.zinovin.tankspeedometer.T500_NAVIPACKAGE_CHANGED"

    invoke-virtual {v2, v4}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v4, "naviPackage"

    invoke-virtual {v2, v4, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "ru.zinovin.tankspeedometer.NAVIPACKAGE_CHANGED_PERMISSION"

    invoke-virtual {v6, v2, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    if-eqz v3, :cond_1b

    new-instance v1, Lt5;

    const/16 v2, 0xd

    invoke-direct {v1, v6, v2}, Lt5;-><init>(Ljava/lang/Object;I)V

    const-wide/16 v2, 0x64

    invoke-virtual {v5, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_8

    :pswitch_15
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "sys"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v6}, Landroid/app/Activity;->recreate()V

    :cond_1b
    :goto_8
    return-void

    :pswitch_16
    sget v3, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->p:I

    check-cast v6, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "coolant_warn_level"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1d

    const-string v3, "coolant_critical_level"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1c

    goto :goto_9

    :cond_1c
    const-string v3, "120.0"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    invoke-virtual {v6, v1}, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->setCriticalLevel(F)V

    invoke-virtual {v6}, Landroid/view/View;->invalidate()V

    goto :goto_9

    :cond_1d
    const-string v3, "105.0"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    invoke-virtual {v6, v1}, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->setWarnLevel(F)V

    invoke-virtual {v6}, Landroid/view/View;->invalidate()V

    :goto_9
    return-void

    :pswitch_17
    sget v3, Lru/zinovin/tankspeedometer/view/FuelLevelIndicatorView;->n:I

    check-cast v6, Lru/zinovin/tankspeedometer/view/FuelLevelIndicatorView;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "fuel_critical_level"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1f

    const-string v3, "fuel_low_level"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1e

    goto :goto_a

    :cond_1e
    const-string v3, "20.0"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    invoke-virtual {v6, v1}, LB6;->setNormalLevel(F)V

    invoke-virtual {v6}, Landroid/view/View;->invalidate()V

    goto :goto_a

    :cond_1f
    const-string v3, "12.5"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    invoke-virtual {v6, v1}, LB6;->setWarnLevel(F)V

    invoke-virtual {v6}, Landroid/view/View;->invalidate()V

    :goto_a
    return-void

    :pswitch_18
    sget v3, Lru/zinovin/tankspeedometer/view/BatteryLevelIndicatorView;->n:I

    check-cast v6, Lru/zinovin/tankspeedometer/view/BatteryLevelIndicatorView;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "battery_low_level"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_21

    const-string v3, "battery_critical_level"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_20

    goto :goto_b

    :cond_20
    const-string v3, "10"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    invoke-virtual {v6, v1}, LB6;->setWarnLevel(F)V

    invoke-virtual {v6}, Landroid/view/View;->invalidate()V

    goto :goto_b

    :cond_21
    const-string v3, "20"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    invoke-virtual {v6, v1}, LB6;->setNormalLevel(F)V

    invoke-virtual {v6}, Landroid/view/View;->invalidate()V

    :goto_b
    return-void

    :pswitch_19
    move-object/from16 v7, v21

    move-object/from16 v3, v22

    sget v1, Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;->B:I

    check-cast v6, Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_22

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_22

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_23

    :cond_22
    iget-object v1, v6, LKf;->c:LLf;

    invoke-virtual {v1}, LLf;->c()Ljava/lang/Float;

    move-result-object v3

    if-eqz v3, :cond_23

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v4

    const/4 v5, 0x0

    cmpl-float v4, v4, v5

    if-ltz v4, :cond_23

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Fuel settings changed ("

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "), refreshing display"

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v4, "T500.BasicInstrPanel"

    invoke-static {v4, v2}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, LLf;->g(Ljava/lang/Float;)V

    :cond_23
    return-void

    :pswitch_1a
    check-cast v6, LW2;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "coolant_warn_level"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_25

    const-string v3, "coolant_critical_level"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_24

    goto :goto_c

    :cond_24
    const-string v3, "120.0"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    invoke-virtual {v6, v1}, LW2;->setCriticalLevel(F)V

    invoke-virtual {v6}, Landroid/view/View;->invalidate()V

    goto :goto_c

    :cond_25
    const-string v3, "105.0"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    invoke-virtual {v6, v1}, LW2;->setWarnLevel(F)V

    invoke-virtual {v6}, Landroid/view/View;->invalidate()V

    :goto_c
    return-void

    :pswitch_1b
    check-cast v6, LV2;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "fuel_critical_level"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_27

    const-string v3, "fuel_low_level"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_26

    goto :goto_d

    :cond_26
    const-string v3, "20.0"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    invoke-virtual {v6, v1}, LV2;->setNormalLevel(F)V

    invoke-virtual {v6}, Landroid/view/View;->invalidate()V

    goto :goto_d

    :cond_27
    const-string v3, "12.5"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    invoke-virtual {v6, v1}, LV2;->setWarnLevel(F)V

    invoke-virtual {v6}, Landroid/view/View;->invalidate()V

    :goto_d
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_10
        :pswitch_6
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        -0x6991a92a -> :sswitch_4
        0x2e17d4a6 -> :sswitch_3
        0x2e17d4a7 -> :sswitch_2
        0x541148d1 -> :sswitch_1
        0x541148d2 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x705519b1 -> :sswitch_f
        -0x6991a92a -> :sswitch_e
        -0x471ed4f3 -> :sswitch_d
        -0x3d24a5a -> :sswitch_c
        0x23ba52f1 -> :sswitch_b
        0x2e17d4a6 -> :sswitch_a
        0x2e17d4a7 -> :sswitch_9
        0x526a76fc -> :sswitch_8
        0x541148d1 -> :sswitch_7
        0x541148d2 -> :sswitch_6
        0x5630fbee -> :sswitch_5
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
    .end packed-switch

    :sswitch_data_2
    .sparse-switch
        -0x602d6ca8 -> :sswitch_15
        -0x4fe2f640 -> :sswitch_14
        -0x4680daff -> :sswitch_13
        -0x31d56a10 -> :sswitch_12
        -0x1b5b04b -> :sswitch_11
        0x4253d6f1 -> :sswitch_10
    .end sparse-switch

    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_13
        :pswitch_11
    .end packed-switch
.end method
