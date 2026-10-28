.class public Lru/zinovin/tankspeedometer/BootReceiver;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# instance fields
.field public final a:LLf;

.field public b:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    invoke-static {}, LLf;->a()LLf;

    move-result-object v0

    iput-object v0, p0, Lru/zinovin/tankspeedometer/BootReceiver;->a:LLf;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lru/zinovin/tankspeedometer/BootReceiver;->b:Z

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    const-string v3, "1"

    iget-object v4, v1, Lru/zinovin/tankspeedometer/BootReceiver;->a:LLf;

    const-string v5, "T500.BOOTRECEIVER"

    const-string v6, "naviFullScreen="

    const-string v7, "useNavi="

    const-string v8, "ipType="

    const-string v9, "isNeedDownload="

    const-string v10, "version in settings "

    const-string v11, "autoStart="

    const-string v12, "Received action: "

    :try_start_0
    sget-object v14, Ln1;->a:Landroid/content/Context;

    if-nez v14, :cond_0

    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v14

    sput-object v14, Ln1;->a:Landroid/content/Context;

    :cond_0
    invoke-static/range {p1 .. p1}, Lyr;->f(Landroid/content/Context;)V

    invoke-static/range {p1 .. p1}, Lmk;->l(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v14

    const-string v15, "autoStart"

    const/4 v13, 0x0

    invoke-interface {v14, v15, v13}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v15

    invoke-static {}, LTf;->s()Ljava/lang/String;

    move-result-object v13
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_5

    :try_start_1
    const-string v1, "0.0"

    invoke-virtual {v13, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-static {}, LTf;->x()Ljava/lang/String;

    move-result-object v1

    invoke-static {v13, v1}, LTf;->l(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4

    if-gez v1, :cond_1

    goto :goto_2

    :cond_1
    const/4 v1, 0x0

    goto :goto_3

    :goto_0
    move-object v3, v2

    :goto_1
    move-object/from16 v2, p0

    goto/16 :goto_c

    :cond_2
    :goto_2
    const/4 v1, 0x1

    :goto_3
    if-eqz v0, :cond_3

    :try_start_2
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {p2 .. p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_4

    :catch_0
    move-exception v0

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    goto/16 :goto_c

    :cond_3
    const-string v2, "Intent is NULL"

    :goto_4
    invoke-static {v5, v2}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v2}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v10, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v2}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v2}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v0, :cond_5

    invoke-virtual/range {p2 .. p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v9
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    const-string v11, "ru.zinovin.tankspeedometer.T500_IP_RESTART"

    const/4 v12, 0x2

    sparse-switch v9, :sswitch_data_0

    goto :goto_5

    :sswitch_0
    :try_start_3
    const-string v9, "android.intent.action.USER_PRESENT"

    invoke-virtual {v2, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    move-object v13, v11

    move v2, v12

    goto :goto_6

    :sswitch_1
    const-string v9, "android.intent.action.BOOT_COMPLETED"

    invoke-virtual {v2, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    move-object v13, v11

    const/4 v2, 0x1

    goto :goto_6

    :sswitch_2
    invoke-virtual {v2, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    move-object v13, v11

    const/4 v2, 0x3

    goto :goto_6

    :sswitch_3
    const-string v9, "android.intent.action.LOCKED_BOOT_COMPLETED"

    invoke-virtual {v2, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    if-eqz v2, :cond_4

    move-object v13, v11

    const/4 v2, 0x0

    goto :goto_6

    :cond_4
    :goto_5
    const/4 v2, -0x1

    move-object v13, v11

    :goto_6
    const-wide/32 v10, 0x493e0

    if-eqz v2, :cond_a

    const/4 v9, 0x1

    if-eq v2, v9, :cond_a

    if-eq v2, v12, :cond_a

    const/4 v9, 0x3

    if-eq v2, v9, :cond_6

    :cond_5
    :goto_7
    move-object/from16 v2, p0

    goto/16 :goto_d

    :cond_6
    :try_start_4
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v1

    move-object v9, v13

    long-to-double v12, v10

    mul-double/2addr v1, v12

    double-to-long v1, v1

    add-long/2addr v1, v10

    new-instance v10, Ljava/util/Timer;

    invoke-direct {v10}, Ljava/util/Timer;-><init>()V

    new-instance v11, Lx4;

    const/4 v12, 0x1

    invoke-direct {v11, v12}, Lx4;-><init>(I)V

    invoke-virtual {v10, v11, v1, v2}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    const-string v1, "useNavi"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v4, v1}, LLf;->i(Ljava/lang/Boolean;)V

    const-string v1, "ipType"

    invoke-interface {v14, v1, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, v4, LLf;->u:Ldr;

    invoke-virtual {v2}, Loj;->d()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    if-nez v2, :cond_7

    :try_start_5
    invoke-static {}, LUd;->e0()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    :cond_7
    :try_start_6
    iget-object v2, v4, LLf;->u:Ldr;

    invoke-virtual {v2, v1}, Ldr;->f(Ljava/lang/Object;)V

    const-string v2, "3"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    if-eqz v2, :cond_8

    :try_start_7
    const-string v2, "naviFullscreen"

    invoke-static {v2}, LTd;->p(Ljava/lang/String;)Z

    move-result v2
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    if-eqz v2, :cond_8

    const/4 v2, 0x1

    goto :goto_8

    :cond_8
    const/4 v2, 0x0

    :goto_8
    :try_start_8
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    iget-object v11, v4, LLf;->w:Ldr;

    invoke-virtual {v11, v10}, Ldr;->f(Ljava/lang/Object;)V

    const-string v10, "T500_IP_RESTART received"

    invoke-static {v5, v10}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v8, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v5, v8}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iget-object v7, v4, LLf;->y:Ldr;

    invoke-virtual {v7, v6}, Ldr;->f(Ljava/lang/Object;)V

    const/4 v6, 0x1

    invoke-static {v6}, LUd;->p0(Z)V

    const-string v6, "naviPackage"

    const-string v7, "ru.yandex.yandexnavi"

    invoke-interface {v14, v6, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iget-object v4, v4, LLf;->I:Ldr;

    invoke-virtual {v4, v6}, Ldr;->f(Ljava/lang/Object;)V

    new-instance v4, Landroid/content/Intent;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2

    if-eqz v1, :cond_9

    :try_start_9
    const-class v1, Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0

    :goto_9
    move-object/from16 v3, p1

    goto :goto_a

    :cond_9
    :try_start_a
    const-class v1, Lru/zinovin/tankspeedometer/SpedometerPanel;
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_2

    goto :goto_9

    :goto_a
    :try_start_b
    invoke-direct {v4, v3, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    move-object v1, v9

    invoke-virtual {v4, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-interface {v14}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v6, "usePreferences"

    const/4 v7, 0x1

    invoke-interface {v1, v6, v7}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-virtual {v3, v4}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    if-eqz v0, :cond_5

    invoke-static {v2}, LUd;->n0(Z)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_1

    goto/16 :goto_7

    :catch_1
    move-exception v0

    goto/16 :goto_1

    :catch_2
    move-exception v0

    move-object/from16 v3, p1

    goto/16 :goto_1

    :cond_a
    move-object/from16 v3, p1

    move-object/from16 v2, p0

    :try_start_c
    iget-boolean v0, v2, Lru/zinovin/tankspeedometer/BootReceiver;->b:Z

    if-nez v0, :cond_c

    new-instance v0, Landroid/content/Intent;

    const-class v4, Lru/zinovin/tankspeedometer/ServicesStartActivity;

    invoke-direct {v0, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v4, 0x14000000

    invoke-virtual {v0, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {v3, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v6

    long-to-double v8, v10

    mul-double/2addr v6, v8

    double-to-long v6, v6

    add-long/2addr v6, v10

    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    new-instance v4, Lx4;

    const/4 v8, 0x0

    invoke-direct {v4, v8}, Lx4;-><init>(I)V

    invoke-virtual {v0, v4, v6, v7}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    if-eqz v15, :cond_b

    if-nez v1, :cond_b

    const/4 v1, 0x1

    invoke-static {v1}, LUd;->p0(Z)V

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lmk;->l(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "musicAutoPlay"

    const/4 v4, 0x0

    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, LUd;->l0(Z)V

    :cond_b
    const/4 v1, 0x1

    goto :goto_b

    :catch_3
    move-exception v0

    goto :goto_c

    :goto_b
    iput-boolean v1, v2, Lru/zinovin/tankspeedometer/BootReceiver;->b:Z
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_3

    goto :goto_d

    :catch_4
    move-exception v0

    goto/16 :goto_0

    :catch_5
    move-exception v0

    move-object v3, v2

    move-object v2, v1

    :goto_c
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "ERROR "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x1

    invoke-static {v3, v1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    const-string v1, "BOOT ERROR"

    invoke-static {v5, v1, v0}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_c
    :goto_d
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x35f22cb2 -> :sswitch_3
        -0xcb33390 -> :sswitch_2
        0x2f94f923 -> :sswitch_1
        0x311a1d6c -> :sswitch_0
    .end sparse-switch
.end method
