.class public final LO1;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, LO1;->a:I

    iput-object p1, p0, LO1;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const-string v2, "speedFromLeft"

    const-string v3, "useSysNavi"

    const-string v4, "bigMeters"

    const-string v6, "showLabelInMeter"

    const-string v8, "useNavi"

    const-string v10, "infoInCenter"

    const-string v11, "naviFullscreen"

    const/4 v13, 0x1

    const/4 v14, 0x0

    iget-object v15, v0, LO1;->b:Ljava/lang/Object;

    iget v7, v0, LO1;->a:I

    packed-switch v7, :pswitch_data_0

    if-eqz v1, :cond_14

    invoke-virtual/range {p2 .. p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v9, "ru.zinovin.tankspeedometer.T500_IP_SETTINGS_CHANGED"

    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_0

    goto/16 :goto_5

    :cond_0
    sget v7, Lru/zinovin/tankspeedometer/SpedometerPanel;->s0:I

    check-cast v15, Lru/zinovin/tankspeedometer/SpedometerPanel;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v7, "pref_key"

    invoke-virtual {v1, v7}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_14

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v5, "Changed themed preference "

    invoke-direct {v9, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v9, "T500.ACTIVITY"

    invoke-static {v9, v5}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v5, v15, LKf;->c:LLf;

    const-string v7, ""

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v16

    sparse-switch v16, :sswitch_data_0

    :goto_0
    const/4 v1, -0x1

    goto/16 :goto_1

    :sswitch_0
    const-string v12, "speedInCenter"

    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const/16 v1, 0xc

    goto/16 :goto_1

    :sswitch_1
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    const/16 v1, 0xb

    goto/16 :goto_1

    :sswitch_2
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    const/16 v1, 0xa

    goto/16 :goto_1

    :sswitch_3
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    const/16 v1, 0x9

    goto/16 :goto_1

    :sswitch_4
    const-string v12, "transparentBackgroundInCenter"

    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_0

    :cond_5
    const/16 v1, 0x8

    goto :goto_1

    :sswitch_5
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_0

    :cond_6
    const/4 v1, 0x7

    goto :goto_1

    :sswitch_6
    const-string v12, "ALL"

    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto :goto_0

    :cond_7
    const/4 v1, 0x6

    goto :goto_1

    :sswitch_7
    const-string v12, "useDefaultSwitch"

    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_0

    :cond_8
    const/4 v1, 0x5

    goto :goto_1

    :sswitch_8
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    goto :goto_0

    :cond_9
    const/4 v1, 0x4

    goto :goto_1

    :sswitch_9
    const-string v12, "bgMode"

    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    goto :goto_0

    :cond_a
    const/4 v1, 0x3

    goto :goto_1

    :sswitch_a
    invoke-virtual {v1, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    goto :goto_0

    :cond_b
    const/4 v1, 0x2

    goto :goto_1

    :sswitch_b
    invoke-virtual {v1, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    goto :goto_0

    :cond_c
    move v1, v13

    goto :goto_1

    :sswitch_c
    const-string v12, "selectedBackground"

    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    goto/16 :goto_0

    :cond_d
    move v1, v14

    :goto_1
    packed-switch v1, :pswitch_data_1

    goto/16 :goto_5

    :pswitch_0
    invoke-static {v2, v13}, LBr;->s(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, v15, LKf;->n:Z

    invoke-virtual {v15, v13}, Lru/zinovin/tankspeedometer/SpedometerPanel;->t(Z)V

    invoke-virtual {v15}, Lru/zinovin/tankspeedometer/SpedometerPanel;->r()V

    goto/16 :goto_5

    :pswitch_1
    invoke-static {v3}, LTd;->p(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-static {v14}, LUd;->p0(Z)V

    goto :goto_2

    :cond_e
    iget-boolean v1, v15, Lru/zinovin/tankspeedometer/SpedometerPanel;->c0:Z

    if-eqz v1, :cond_f

    iget-boolean v1, v15, Lru/zinovin/tankspeedometer/SpedometerPanel;->d0:Z

    invoke-static {v1}, LUd;->n0(Z)V

    :cond_f
    :goto_2
    invoke-virtual {v15, v13}, Lru/zinovin/tankspeedometer/SpedometerPanel;->t(Z)V

    invoke-virtual {v15}, Lru/zinovin/tankspeedometer/SpedometerPanel;->r()V

    goto/16 :goto_5

    :pswitch_2
    invoke-static {v4, v14}, LBr;->s(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, v15, LKf;->k:Z

    iget-object v2, v15, Lru/zinovin/tankspeedometer/SpedometerPanel;->b0:Lnp;

    iget-object v3, v15, Lru/zinovin/tankspeedometer/SpedometerPanel;->X:Ljava/lang/String;

    invoke-virtual {v2, v3, v1}, Lnp;->b(Ljava/lang/String;Z)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "bigMeters="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v2, v15, LKf;->k:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v9, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v7, v15, Lru/zinovin/tankspeedometer/SpedometerPanel;->m0:Ljava/lang/String;

    invoke-virtual {v15, v13}, Lru/zinovin/tankspeedometer/SpedometerPanel;->t(Z)V

    invoke-virtual {v15}, Lru/zinovin/tankspeedometer/SpedometerPanel;->r()V

    goto/16 :goto_5

    :pswitch_3
    new-instance v1, LAf;

    invoke-virtual {v15}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2, v15}, LAf;-><init>(Landroid/content/Context;LDg;)V

    iput-object v1, v15, Lru/zinovin/tankspeedometer/SpedometerPanel;->Z:LAf;

    goto :goto_3

    :pswitch_4
    invoke-static {v6, v13}, LBr;->s(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, v15, LKf;->m:Z

    invoke-virtual {v15}, Lru/zinovin/tankspeedometer/SpedometerPanel;->I()V

    goto/16 :goto_5

    :pswitch_5
    invoke-virtual {v15}, Lru/zinovin/tankspeedometer/SpedometerPanel;->D()Luj;

    move-result-object v1

    invoke-virtual {v15, v1}, Lru/zinovin/tankspeedometer/SpedometerPanel;->v(Luj;)V

    goto/16 :goto_5

    :pswitch_6
    invoke-static {}, LF4;->O()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v15, Lru/zinovin/tankspeedometer/SpedometerPanel;->Y:Ljava/lang/String;

    iput-object v7, v15, Lru/zinovin/tankspeedometer/SpedometerPanel;->m0:Ljava/lang/String;

    invoke-virtual {v15}, Lru/zinovin/tankspeedometer/SpedometerPanel;->r()V

    invoke-virtual {v15}, Lru/zinovin/tankspeedometer/SpedometerPanel;->G()V

    goto/16 :goto_5

    :goto_3
    :pswitch_7
    iget-object v1, v15, Lru/zinovin/tankspeedometer/SpedometerPanel;->Z:LAf;

    invoke-static {v10, v14}, LBr;->s(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_10

    iget-object v3, v1, LAf;->b:LBq;

    iget-object v3, v3, LBq;->b:LK2;

    goto :goto_4

    :cond_10
    iget-object v3, v1, LAf;->b:LBq;

    iget-object v3, v3, LBq;->a:LK2;

    :goto_4
    iget-boolean v4, v1, LAf;->f:Z

    if-eq v2, v4, :cond_11

    invoke-virtual {v3}, LK2;->w()[Lzf;

    move-result-object v4

    array-length v4, v4

    sub-int/2addr v4, v13

    invoke-static {v4, v14}, Ljava/lang/Math;->min(II)I

    move-result v4

    iput v4, v1, LAf;->c:I

    invoke-virtual {v3}, LK2;->y()[Lzf;

    move-result-object v4

    array-length v4, v4

    sub-int/2addr v4, v13

    invoke-static {v4, v14}, Ljava/lang/Math;->min(II)I

    move-result v4

    iput v4, v1, LAf;->d:I

    invoke-virtual {v3}, LK2;->l()[Lzf;

    move-result-object v3

    array-length v3, v3

    sub-int/2addr v3, v13

    invoke-static {v3, v14}, Ljava/lang/Math;->min(II)I

    move-result v3

    iput v3, v1, LAf;->e:I

    :cond_11
    invoke-virtual {v1}, LAf;->f()V

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "changed centralMode="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "T500.INFO_PANEL"

    invoke-static {v4, v3}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "indexL="

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v5, v1, LAf;->c:I

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "indexR="

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v5, v1, LAf;->d:I

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "indexC="

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v5, v1, LAf;->e:I

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    iput-boolean v2, v1, LAf;->f:Z

    invoke-virtual {v15, v13}, Lru/zinovin/tankspeedometer/SpedometerPanel;->t(Z)V

    invoke-virtual {v15}, Lru/zinovin/tankspeedometer/SpedometerPanel;->r()V

    goto :goto_5

    :pswitch_8
    iget-object v1, v15, LKf;->b:Landroid/content/SharedPreferences;

    const-string v2, "usePreferences"

    invoke-interface {v1, v2, v13}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-static {v11}, LTd;->p(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, v15, Lru/zinovin/tankspeedometer/SpedometerPanel;->d0:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iget-object v3, v5, LLf;->w:Ldr;

    invoke-virtual {v3, v2}, Ldr;->f(Ljava/lang/Object;)V

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "processSettingsChanges.naviFullscreen="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v3, v15, Lru/zinovin/tankspeedometer/SpedometerPanel;->d0:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v9, v2}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, LUd;->A()I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_14

    if-nez v1, :cond_12

    goto :goto_5

    :cond_12
    :pswitch_9
    invoke-static {v8}, LTd;->p(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, v15, Lru/zinovin/tankspeedometer/SpedometerPanel;->c0:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v5, v1}, LLf;->i(Ljava/lang/Boolean;)V

    invoke-static {v14}, LUd;->p0(Z)V

    iget-boolean v1, v15, Lru/zinovin/tankspeedometer/SpedometerPanel;->c0:Z

    if-eqz v1, :cond_13

    iget-boolean v1, v15, Lru/zinovin/tankspeedometer/SpedometerPanel;->d0:Z

    invoke-static {v1}, LUd;->n0(Z)V

    :cond_13
    invoke-virtual {v15, v13}, Lru/zinovin/tankspeedometer/SpedometerPanel;->t(Z)V

    invoke-virtual {v15}, Lru/zinovin/tankspeedometer/SpedometerPanel;->r()V

    goto :goto_5

    :pswitch_a
    invoke-static {}, LF4;->O()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v15, Lru/zinovin/tankspeedometer/SpedometerPanel;->Y:Ljava/lang/String;

    invoke-virtual {v15}, Lru/zinovin/tankspeedometer/SpedometerPanel;->r()V

    invoke-virtual {v15}, Lru/zinovin/tankspeedometer/SpedometerPanel;->G()V

    :cond_14
    :goto_5
    return-void

    :pswitch_b
    if-eqz v1, :cond_17

    invoke-virtual/range {p2 .. p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v15, LKf;

    const-string v2, "ru.zinovin.tankspeedometer.T500_IP_STOP"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_16

    const-string v2, "ru.zinovin.tankspeedometer.T500_INDICATOR_COLOR_CHANGED"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    goto :goto_6

    :cond_15
    invoke-virtual {v15}, LKf;->d()V

    goto :goto_6

    :cond_16
    invoke-virtual {v15}, Landroid/app/Service;->stopSelf()V

    :cond_17
    :goto_6
    return-void

    :pswitch_c
    const/4 v3, -0x1

    if-eqz v1, :cond_1d

    invoke-virtual/range {p2 .. p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v4, 0x7f0b0138

    check-cast v15, Lru/zinovin/tankspeedometer/HudActivity;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_1

    :goto_7
    move v9, v3

    goto :goto_8

    :sswitch_d
    const-string v5, "ru.zinovin.tankspeedometer.T500_NAVI_MANEUVER_VISIBILITY"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_18

    goto :goto_7

    :cond_18
    const/4 v9, 0x2

    goto :goto_8

    :sswitch_e
    const-string v5, "ru.zinovin.tankspeedometer.T500_NAVI_MANEUVER"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_19

    goto :goto_7

    :cond_19
    move v9, v13

    goto :goto_8

    :sswitch_f
    const-string v5, "ru.zinovin.tankspeedometer.T500_HUD_STOP"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1a

    goto :goto_7

    :cond_1a
    move v9, v14

    :goto_8
    packed-switch v9, :pswitch_data_2

    goto/16 :goto_b

    :pswitch_d
    const-string v2, "visibility"

    invoke-virtual {v1, v2, v14}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v15, v4}, Lq1;->findViewById(I)Landroid/view/View;

    move-result-object v2

    if-eqz v1, :cond_1b

    move v7, v14

    goto :goto_9

    :cond_1b
    const/4 v7, 0x4

    :goto_9
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    goto :goto_b

    :pswitch_e
    invoke-virtual {v15, v4}, Lq1;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v14}, Landroid/view/View;->setVisibility(I)V

    const v2, 0x7f0b0136

    invoke-virtual {v15, v2}, Lq1;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v3, 0x7f0b013a

    invoke-virtual {v15, v3}, Lq1;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    const v4, 0x7f0b0139

    invoke-virtual {v15, v4}, Lq1;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    const-string v5, "distance"

    invoke-virtual {v1, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "unit"

    invoke-virtual {v1, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "imageId"

    invoke-virtual {v1, v7}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "street"

    invoke-virtual {v1, v8}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz v1, :cond_1c

    invoke-virtual {v4, v14}, Landroid/view/View;->setVisibility(I)V

    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    invoke-virtual {v4, v13}, Landroid/widget/TextView;->setMaxLines(I)V

    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_a

    :cond_1c
    const/16 v1, 0x8

    invoke-virtual {v4, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_a
    invoke-virtual {v15}, Lq1;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v2, "drawable"

    invoke-virtual {v15}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v7, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    const v2, 0x7f0b0137

    invoke-virtual {v15, v2}, Lq1;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_b

    :pswitch_f
    invoke-virtual {v15}, Landroid/app/Activity;->finish()V

    :cond_1d
    :goto_b
    return-void

    :pswitch_10
    check-cast v15, Ld;

    invoke-virtual {v15}, Ld;->i()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_10
        :pswitch_c
        :pswitch_b
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        -0x7c5e21d7 -> :sswitch_c
        -0x77fd03ff -> :sswitch_b
        -0x6cb42f58 -> :sswitch_a
        -0x52f4f078 -> :sswitch_9
        -0x8d56633 -> :sswitch_8
        -0x4741d72 -> :sswitch_7
        0xfd81 -> :sswitch_6
        0x305d76d -> :sswitch_5
        0x5f06a1a -> :sswitch_4
        0x2f5a6f2a -> :sswitch_3
        0x37be5c8c -> :sswitch_2
        0x462a7438 -> :sswitch_1
        0x5ebec341 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_a
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_9
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_3
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x5263d5bd -> :sswitch_f
        0x40b92c19 -> :sswitch_e
        0x5beb1ef8 -> :sswitch_d
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
    .end packed-switch
.end method
