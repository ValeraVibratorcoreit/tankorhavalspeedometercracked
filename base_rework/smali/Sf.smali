.class public final LSf;
.super Ljava/util/TimerTask;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, LSf;->a:I

    iput-object p1, p0, LSf;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 21

    move-object/from16 v1, p0

    const-string v2, "ERROR in logReadingTask()"

    const-string v3, "T500.ERROR"

    iget-object v4, v1, LSf;->b:Ljava/lang/Object;

    check-cast v4, Lru/zinovin/tankspeedometer/service/LogcatService;

    const-string v5, "T500.SERVICE"

    const-string v6, "START reading logcat"

    invoke-static {v5, v6}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v6

    const-string v7, "logcat"

    invoke-virtual {v6, v7}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v6
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_22

    new-instance v7, Ljava/io/BufferedReader;

    new-instance v8, Ljava/io/InputStreamReader;

    invoke-virtual {v6}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    const/16 v9, 0x2000

    invoke-direct {v7, v8, v9}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v8

    invoke-static {v8}, Lmk;->l(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v8

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_0
    :try_start_1
    iget-boolean v9, v4, Lru/zinovin/tankspeedometer/service/LogcatService;->a:Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_20
    .catchall {:try_start_1 .. :try_end_1} :catchall_1f

    if-nez v9, :cond_43

    :goto_1
    :try_start_2
    invoke-virtual {v7}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_41

    iget-boolean v1, v4, Lru/zinovin/tankspeedometer/service/LogcatService;->a:Z

    if-nez v1, :cond_41

    add-int/lit8 v10, v10, 0x1

    iget v1, v4, Lru/zinovin/tankspeedometer/service/LogcatService;->c:I

    if-lez v1, :cond_0

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->c(Lru/zinovin/tankspeedometer/service/LogcatService;)V

    iget v1, v4, Lru/zinovin/tankspeedometer/service/LogcatService;->c:I

    if-nez v1, :cond_0

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    move-object/from16 v17, v2

    const/16 v16, 0x0

    :try_start_3
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, LLf;->e(Ljava/lang/Integer;)V

    goto :goto_6

    :catchall_0
    move-exception v0

    :goto_2
    move-object/from16 v4, p0

    move-object v2, v0

    :goto_3
    move-object/from16 v1, v17

    goto/16 :goto_1d

    :catch_0
    move-exception v0

    :goto_4
    move-object/from16 v4, p0

    move-object v2, v0

    :goto_5
    move-object/from16 v1, v17

    goto/16 :goto_1c

    :catchall_1
    move-exception v0

    move-object/from16 v17, v2

    goto :goto_2

    :catch_1
    move-exception v0

    move-object/from16 v17, v2

    goto :goto_4

    :cond_0
    move-object/from16 v17, v2

    :goto_6
    const-string v1, "GA-server: setData"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_37

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    const-string v1, "car.basic.engine_speed"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    invoke-static {v4, v9}, Lru/zinovin/tankspeedometer/service/LogcatService;->f(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    iget-object v1, v1, LLf;->b:Ldr;

    invoke-virtual {v1, v2}, Ldr;->f(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :cond_1
    :goto_7
    move-object/from16 v19, v8

    :cond_2
    :goto_8
    move/from16 v20, v15

    goto/16 :goto_16

    :goto_9
    move-object v1, v0

    goto :goto_b

    :goto_a
    move-object v1, v0

    goto :goto_c

    :catchall_2
    move-exception v0

    goto :goto_9

    :goto_b
    move-object/from16 v4, p0

    move-object v2, v1

    goto :goto_3

    :catch_2
    move-exception v0

    goto :goto_a

    :goto_c
    move-object/from16 v4, p0

    move-object v2, v1

    goto :goto_5

    :cond_3
    :try_start_5
    const-string v1, "car.basic.vehicle_speed"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    invoke-static {v4, v9}, Lru/zinovin/tankspeedometer/service/LogcatService;->f(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    iget-object v1, v1, LLf;->a:Ldr;

    invoke-virtual {v1, v2}, Ldr;->f(Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_7

    :catchall_3
    move-exception v0

    goto :goto_9

    :catch_3
    move-exception v0

    goto :goto_a

    :cond_4
    :try_start_7
    const-string v1, "car.basic.gear_status"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    invoke-static {v4, v9}, Lru/zinovin/tankspeedometer/service/LogcatService;->g(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :try_start_8
    iget-object v1, v1, LLf;->c:Ldr;

    invoke-virtual {v1, v2}, Ldr;->f(Ljava/lang/Object;)V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_4
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    goto :goto_7

    :catchall_4
    move-exception v0

    goto :goto_9

    :catch_4
    move-exception v0

    goto :goto_a

    :cond_5
    :try_start_9
    const-string v1, "car.basic.current_gear"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    const/16 v2, 0x8

    if-eqz v1, :cond_7

    invoke-static {v4, v9}, Lru/zinovin/tankspeedometer/service/LogcatService;->g(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)I

    move-result v1

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v9

    if-le v1, v2, :cond_6

    add-int/lit8 v1, v1, -0x1

    :cond_6
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_0
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    :try_start_a
    iget-object v2, v9, LLf;->d:Ldr;

    invoke-virtual {v2, v1}, Ldr;->f(Ljava/lang/Object;)V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_5
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    goto :goto_7

    :catchall_5
    move-exception v0

    goto :goto_9

    :catch_5
    move-exception v0

    goto :goto_a

    :cond_7
    :try_start_b
    const-string v1, "car.basic.remain_fuel_percentage"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_8

    if-nez v15, :cond_1

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    invoke-static {v4, v9}, Lru/zinovin/tankspeedometer/service/LogcatService;->f(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v1, v2}, LLf;->g(Ljava/lang/Float;)V

    goto/16 :goto_7

    :cond_8
    const-string v1, "car.basic.master.oil.tank.level"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_b

    const-string v1, "fuel_tank_fix"

    const/4 v2, 0x0

    invoke-interface {v8, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    invoke-static {v4, v9}, Lru/zinovin/tankspeedometer/service/LogcatService;->f(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)F

    move-result v9

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    invoke-virtual {v1, v9}, LLf;->g(Ljava/lang/Float;)V

    goto :goto_d

    :cond_9
    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    invoke-static {v4, v9}, Lru/zinovin/tankspeedometer/service/LogcatService;->f(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)F

    move-result v9

    const/high16 v15, 0x41200000    # 10.0f

    div-float/2addr v9, v15

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    invoke-virtual {v1, v9}, LLf;->g(Ljava/lang/Float;)V

    :cond_a
    :goto_d
    move-object/from16 v19, v8

    const/4 v15, 0x1

    goto/16 :goto_17

    :cond_b
    const-string v1, "car.basic.auxiliary.oil.tank.level"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-static {v4, v9}, Lru/zinovin/tankspeedometer/service/LogcatService;->f(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)F

    move-result v1

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v2

    invoke-virtual {v2}, LLf;->c()Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    cmpl-float v2, v1, v2

    if-eqz v2, :cond_a

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_0
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    :try_start_c
    iget-object v2, v2, LLf;->h:Ldr;

    invoke-virtual {v2, v1}, Ldr;->f(Ljava/lang/Object;)V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_6
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    goto :goto_d

    :catchall_6
    move-exception v0

    goto/16 :goto_9

    :catch_6
    move-exception v0

    goto/16 :goto_a

    :cond_c
    :try_start_d
    const-string v1, "car.basic.avg_fuel_consumption"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_d

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    invoke-static {v4, v9}, Lru/zinovin/tankspeedometer/service/LogcatService;->f(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_0
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    :try_start_e
    iget-object v1, v1, LLf;->k:Ldr;

    invoke-virtual {v1, v2}, Ldr;->f(Ljava/lang/Object;)V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_7
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    goto/16 :goto_7

    :catchall_7
    move-exception v0

    goto/16 :goto_9

    :catch_7
    move-exception v0

    goto/16 :goto_a

    :cond_d
    :try_start_f
    const-string v1, "car.basic.cur_journey_avg_fuel_consumption_a"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    invoke-static {v4, v9}, Lru/zinovin/tankspeedometer/service/LogcatService;->f(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_0
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    :try_start_10
    iget-object v1, v1, LLf;->l:Ldr;

    invoke-virtual {v1, v2}, Ldr;->f(Ljava/lang/Object;)V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_8
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    goto/16 :goto_7

    :catchall_8
    move-exception v0

    goto/16 :goto_9

    :catch_8
    move-exception v0

    goto/16 :goto_a

    :cond_e
    :try_start_11
    const-string v1, "car.basic.cur_journey_avg_speed_a"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    invoke-static {v4, v9}, Lru/zinovin/tankspeedometer/service/LogcatService;->f(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_0
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    :try_start_12
    iget-object v1, v1, LLf;->m:Ldr;

    invoke-virtual {v1, v2}, Ldr;->f(Ljava/lang/Object;)V
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_9
    .catchall {:try_start_12 .. :try_end_12} :catchall_9

    goto/16 :goto_7

    :catchall_9
    move-exception v0

    goto/16 :goto_9

    :catch_9
    move-exception v0

    goto/16 :goto_a

    :cond_f
    :try_start_13
    const-string v1, "car.basic.cur_journey_drivetime"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    invoke-static {v4, v9}, Lru/zinovin/tankspeedometer/service/LogcatService;->g(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_0
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    :try_start_14
    iget-object v1, v1, LLf;->n:Ldr;

    invoke-virtual {v1, v2}, Ldr;->f(Ljava/lang/Object;)V
    :try_end_14
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_a
    .catchall {:try_start_14 .. :try_end_14} :catchall_a

    goto/16 :goto_7

    :catchall_a
    move-exception v0

    goto/16 :goto_9

    :catch_a
    move-exception v0

    goto/16 :goto_a

    :cond_10
    :try_start_15
    const-string v1, "car.basic.cur_journey_odometer"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    invoke-static {v4, v9}, Lru/zinovin/tankspeedometer/service/LogcatService;->f(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2
    :try_end_15
    .catch Ljava/io/IOException; {:try_start_15 .. :try_end_15} :catch_0
    .catchall {:try_start_15 .. :try_end_15} :catchall_0

    :try_start_16
    iget-object v1, v1, LLf;->o:Ldr;

    invoke-virtual {v1, v2}, Ldr;->f(Ljava/lang/Object;)V
    :try_end_16
    .catch Ljava/io/IOException; {:try_start_16 .. :try_end_16} :catch_b
    .catchall {:try_start_16 .. :try_end_16} :catchall_b

    goto/16 :goto_7

    :catchall_b
    move-exception v0

    goto/16 :goto_9

    :catch_b
    move-exception v0

    goto/16 :goto_a

    :cond_11
    :try_start_17
    const-string v1, "car.basic.accumulated_odometer"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_12

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    invoke-static {v4, v9}, Lru/zinovin/tankspeedometer/service/LogcatService;->f(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2
    :try_end_17
    .catch Ljava/io/IOException; {:try_start_17 .. :try_end_17} :catch_0
    .catchall {:try_start_17 .. :try_end_17} :catchall_0

    :try_start_18
    iget-object v1, v1, LLf;->q:Ldr;

    invoke-virtual {v1, v2}, Ldr;->f(Ljava/lang/Object;)V
    :try_end_18
    .catch Ljava/io/IOException; {:try_start_18 .. :try_end_18} :catch_c
    .catchall {:try_start_18 .. :try_end_18} :catchall_c

    goto/16 :goto_7

    :catchall_c
    move-exception v0

    goto/16 :goto_9

    :catch_c
    move-exception v0

    goto/16 :goto_a

    :cond_12
    :try_start_19
    const-string v1, "car.basic.total_odometer"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_13

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    invoke-static {v4, v9}, Lru/zinovin/tankspeedometer/service/LogcatService;->f(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2
    :try_end_19
    .catch Ljava/io/IOException; {:try_start_19 .. :try_end_19} :catch_0
    .catchall {:try_start_19 .. :try_end_19} :catchall_0

    :try_start_1a
    iget-object v1, v1, LLf;->p:Ldr;

    invoke-virtual {v1, v2}, Ldr;->f(Ljava/lang/Object;)V
    :try_end_1a
    .catch Ljava/io/IOException; {:try_start_1a .. :try_end_1a} :catch_d
    .catchall {:try_start_1a .. :try_end_1a} :catchall_d

    goto/16 :goto_7

    :catchall_d
    move-exception v0

    goto/16 :goto_9

    :catch_d
    move-exception v0

    goto/16 :goto_a

    :cond_13
    :try_start_1b
    const-string v1, "car.basic.battery_voltage"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_14

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    invoke-static {v4, v9}, Lru/zinovin/tankspeedometer/service/LogcatService;->f(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2
    :try_end_1b
    .catch Ljava/io/IOException; {:try_start_1b .. :try_end_1b} :catch_0
    .catchall {:try_start_1b .. :try_end_1b} :catchall_0

    :try_start_1c
    iget-object v1, v1, LLf;->e:Ldr;

    invoke-virtual {v1, v2}, Ldr;->f(Ljava/lang/Object;)V
    :try_end_1c
    .catch Ljava/io/IOException; {:try_start_1c .. :try_end_1c} :catch_e
    .catchall {:try_start_1c .. :try_end_1c} :catchall_e

    goto/16 :goto_7

    :catchall_e
    move-exception v0

    goto/16 :goto_9

    :catch_e
    move-exception v0

    goto/16 :goto_a

    :cond_14
    :try_start_1d
    const-string v1, "car.basic.remain_odometer"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_15

    if-nez v15, :cond_1

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    invoke-static {v4, v9}, Lru/zinovin/tankspeedometer/service/LogcatService;->f(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2
    :try_end_1d
    .catch Ljava/io/IOException; {:try_start_1d .. :try_end_1d} :catch_0
    .catchall {:try_start_1d .. :try_end_1d} :catchall_0

    :try_start_1e
    iget-object v1, v1, LLf;->i:Ldr;

    invoke-virtual {v1, v2}, Ldr;->f(Ljava/lang/Object;)V
    :try_end_1e
    .catch Ljava/io/IOException; {:try_start_1e .. :try_end_1e} :catch_f
    .catchall {:try_start_1e .. :try_end_1e} :catchall_f

    goto/16 :goto_7

    :catchall_f
    move-exception v0

    goto/16 :goto_9

    :catch_f
    move-exception v0

    goto/16 :goto_a

    :cond_15
    :try_start_1f
    const-string v1, "car.basic.main_tank_remain_odometer"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    invoke-static {v4, v9}, Lru/zinovin/tankspeedometer/service/LogcatService;->f(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2
    :try_end_1f
    .catch Ljava/io/IOException; {:try_start_1f .. :try_end_1f} :catch_0
    .catchall {:try_start_1f .. :try_end_1f} :catchall_0

    :try_start_20
    iget-object v1, v1, LLf;->i:Ldr;

    invoke-virtual {v1, v2}, Ldr;->f(Ljava/lang/Object;)V
    :try_end_20
    .catch Ljava/io/IOException; {:try_start_20 .. :try_end_20} :catch_10
    .catchall {:try_start_20 .. :try_end_20} :catchall_10

    goto/16 :goto_d

    :catchall_10
    move-exception v0

    goto/16 :goto_9

    :catch_10
    move-exception v0

    goto/16 :goto_a

    :cond_16
    :try_start_21
    const-string v1, "car.basic.sub_tank_remain_odometer"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_17

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    invoke-static {v4, v9}, Lru/zinovin/tankspeedometer/service/LogcatService;->f(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2
    :try_end_21
    .catch Ljava/io/IOException; {:try_start_21 .. :try_end_21} :catch_0
    .catchall {:try_start_21 .. :try_end_21} :catchall_0

    :try_start_22
    iget-object v1, v1, LLf;->j:Ldr;

    invoke-virtual {v1, v2}, Ldr;->f(Ljava/lang/Object;)V
    :try_end_22
    .catch Ljava/io/IOException; {:try_start_22 .. :try_end_22} :catch_11
    .catchall {:try_start_22 .. :try_end_22} :catchall_11

    goto/16 :goto_d

    :catchall_11
    move-exception v0

    goto/16 :goto_9

    :catch_11
    move-exception v0

    goto/16 :goto_a

    :cond_17
    :try_start_23
    const-string v1, "car.ev_info.electric_mode_remain_odometer"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_18

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    invoke-static {v4, v9}, Lru/zinovin/tankspeedometer/service/LogcatService;->f(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2
    :try_end_23
    .catch Ljava/io/IOException; {:try_start_23 .. :try_end_23} :catch_0
    .catchall {:try_start_23 .. :try_end_23} :catchall_0

    :try_start_24
    iget-object v1, v1, LLf;->F:Ldr;

    invoke-virtual {v1, v2}, Ldr;->f(Ljava/lang/Object;)V
    :try_end_24
    .catch Ljava/io/IOException; {:try_start_24 .. :try_end_24} :catch_12
    .catchall {:try_start_24 .. :try_end_24} :catchall_12

    goto/16 :goto_7

    :catchall_12
    move-exception v0

    goto/16 :goto_9

    :catch_12
    move-exception v0

    goto/16 :goto_a

    :cond_18
    :try_start_25
    const-string v1, "car.basic.coolant_temp"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_19

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    invoke-static {v4, v9}, Lru/zinovin/tankspeedometer/service/LogcatService;->f(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2
    :try_end_25
    .catch Ljava/io/IOException; {:try_start_25 .. :try_end_25} :catch_0
    .catchall {:try_start_25 .. :try_end_25} :catchall_0

    :try_start_26
    iget-object v1, v1, LLf;->r:Ldr;

    invoke-virtual {v1, v2}, Ldr;->f(Ljava/lang/Object;)V
    :try_end_26
    .catch Ljava/io/IOException; {:try_start_26 .. :try_end_26} :catch_13
    .catchall {:try_start_26 .. :try_end_26} :catchall_13

    goto/16 :goto_7

    :catchall_13
    move-exception v0

    goto/16 :goto_9

    :catch_13
    move-exception v0

    goto/16 :goto_a

    :cond_19
    :try_start_27
    const-string v1, "car.ev_info.cur_battery_power_percentage"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1a

    invoke-static {v4, v9}, Lru/zinovin/tankspeedometer/service/LogcatService;->f(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    invoke-static {v4, v9}, Lru/zinovin/tankspeedometer/service/LogcatService;->f(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2
    :try_end_27
    .catch Ljava/io/IOException; {:try_start_27 .. :try_end_27} :catch_0
    .catchall {:try_start_27 .. :try_end_27} :catchall_0

    :try_start_28
    iget-object v1, v1, LLf;->f:Ldr;

    invoke-virtual {v1, v2}, Ldr;->f(Ljava/lang/Object;)V
    :try_end_28
    .catch Ljava/io/IOException; {:try_start_28 .. :try_end_28} :catch_14
    .catchall {:try_start_28 .. :try_end_28} :catchall_14

    goto/16 :goto_7

    :catchall_14
    move-exception v0

    goto/16 :goto_9

    :catch_14
    move-exception v0

    goto/16 :goto_a

    :cond_1a
    :try_start_29
    const-string v1, "car.basic.outside_temp"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1b

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "outside_temp="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4, v9}, Lru/zinovin/tankspeedometer/service/LogcatService;->f(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v4, v9}, Lru/zinovin/tankspeedometer/service/LogcatService;->f(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    const/16 v2, -0x3e9

    if-eq v1, v2, :cond_1

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    invoke-static {v4, v9}, Lru/zinovin/tankspeedometer/service/LogcatService;->f(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2
    :try_end_29
    .catch Ljava/io/IOException; {:try_start_29 .. :try_end_29} :catch_0
    .catchall {:try_start_29 .. :try_end_29} :catchall_0

    :try_start_2a
    iget-object v1, v1, LLf;->s:Ldr;

    invoke-virtual {v1, v2}, Ldr;->f(Ljava/lang/Object;)V
    :try_end_2a
    .catch Ljava/io/IOException; {:try_start_2a .. :try_end_2a} :catch_15
    .catchall {:try_start_2a .. :try_end_2a} :catchall_15

    goto/16 :goto_7

    :catchall_15
    move-exception v0

    goto/16 :goto_9

    :catch_15
    move-exception v0

    goto/16 :goto_a

    :cond_1b
    :try_start_2b
    const-string v1, "car.basic.tpms_status"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1
    :try_end_2b
    .catch Ljava/io/IOException; {:try_start_2b .. :try_end_2b} :catch_0
    .catchall {:try_start_2b .. :try_end_2b} :catchall_0

    const-string v18, ""

    const-string v2, "="

    if-eqz v1, :cond_1d

    :try_start_2c
    const-string v1, "0.0,-50.0,0.0,-50.0,0.0,-50.0,0.0,-50.0"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1
    :try_end_2c
    .catch Ljava/io/IOException; {:try_start_2c .. :try_end_2c} :catch_0
    .catchall {:try_start_2c .. :try_end_2c} :catchall_0

    :try_start_2d
    invoke-virtual {v9, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    array-length v9, v2

    move-object/from16 v19, v8

    const/4 v8, 0x1

    if-le v9, v8, :cond_1c

    aget-object v18, v2, v8
    :try_end_2d
    .catch Ljava/io/IOException; {:try_start_2d .. :try_end_2d} :catch_17
    .catchall {:try_start_2d .. :try_end_2d} :catchall_17

    :cond_1c
    move-object/from16 v2, v18

    :try_start_2e
    iget-object v1, v1, LLf;->z:Ldr;

    invoke-virtual {v1, v2}, Ldr;->f(Ljava/lang/Object;)V
    :try_end_2e
    .catch Ljava/io/IOException; {:try_start_2e .. :try_end_2e} :catch_16
    .catchall {:try_start_2e .. :try_end_2e} :catchall_16

    goto/16 :goto_8

    :catchall_16
    move-exception v0

    goto/16 :goto_9

    :catch_16
    move-exception v0

    goto/16 :goto_a

    :catchall_17
    move-exception v0

    goto/16 :goto_9

    :catch_17
    move-exception v0

    goto/16 :goto_a

    :cond_1d
    move-object/from16 v19, v8

    :try_start_2f
    const-string v1, "car.basic.tpms_units"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1e

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    invoke-static {v4, v9}, Lru/zinovin/tankspeedometer/service/LogcatService;->g(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2
    :try_end_2f
    .catch Ljava/io/IOException; {:try_start_2f .. :try_end_2f} :catch_0
    .catchall {:try_start_2f .. :try_end_2f} :catchall_0

    :try_start_30
    iget-object v1, v1, LLf;->A:Ldr;

    invoke-virtual {v1, v2}, Ldr;->f(Ljava/lang/Object;)V
    :try_end_30
    .catch Ljava/io/IOException; {:try_start_30 .. :try_end_30} :catch_18
    .catchall {:try_start_30 .. :try_end_30} :catchall_18

    goto/16 :goto_8

    :catchall_18
    move-exception v0

    goto/16 :goto_9

    :catch_18
    move-exception v0

    goto/16 :goto_a

    :cond_1e
    :try_start_31
    const-string v1, "car.basic.tire_temp_unit"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1f

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    invoke-static {v4, v9}, Lru/zinovin/tankspeedometer/service/LogcatService;->g(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2
    :try_end_31
    .catch Ljava/io/IOException; {:try_start_31 .. :try_end_31} :catch_0
    .catchall {:try_start_31 .. :try_end_31} :catchall_0

    :try_start_32
    iget-object v1, v1, LLf;->C:Ldr;

    invoke-virtual {v1, v2}, Ldr;->f(Ljava/lang/Object;)V
    :try_end_32
    .catch Ljava/io/IOException; {:try_start_32 .. :try_end_32} :catch_19
    .catchall {:try_start_32 .. :try_end_32} :catchall_19

    goto/16 :goto_8

    :catchall_19
    move-exception v0

    goto/16 :goto_9

    :catch_19
    move-exception v0

    goto/16 :goto_a

    :cond_1f
    :try_start_33
    const-string v1, "car.unit_setting.temperature"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_20

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    invoke-static {v4, v9}, Lru/zinovin/tankspeedometer/service/LogcatService;->g(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2
    :try_end_33
    .catch Ljava/io/IOException; {:try_start_33 .. :try_end_33} :catch_0
    .catchall {:try_start_33 .. :try_end_33} :catchall_0

    :try_start_34
    iget-object v1, v1, LLf;->B:Ldr;

    invoke-virtual {v1, v2}, Ldr;->f(Ljava/lang/Object;)V
    :try_end_34
    .catch Ljava/io/IOException; {:try_start_34 .. :try_end_34} :catch_1a
    .catchall {:try_start_34 .. :try_end_34} :catchall_1a

    goto/16 :goto_8

    :catchall_1a
    move-exception v0

    goto/16 :goto_9

    :catch_1a
    move-exception v0

    goto/16 :goto_a

    :cond_20
    :try_start_35
    const-string v1, "sys.settings.language"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_21

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    invoke-static {v4, v9}, Lru/zinovin/tankspeedometer/service/LogcatService;->g(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2
    :try_end_35
    .catch Ljava/io/IOException; {:try_start_35 .. :try_end_35} :catch_0
    .catchall {:try_start_35 .. :try_end_35} :catchall_0

    :try_start_36
    iget-object v1, v1, LLf;->D:Ldr;

    invoke-virtual {v1, v2}, Ldr;->f(Ljava/lang/Object;)V
    :try_end_36
    .catch Ljava/io/IOException; {:try_start_36 .. :try_end_36} :catch_1b
    .catchall {:try_start_36 .. :try_end_36} :catchall_1b

    goto/16 :goto_8

    :catchall_1b
    move-exception v0

    goto/16 :goto_9

    :catch_1b
    move-exception v0

    goto/16 :goto_a

    :cond_21
    :try_start_37
    const-string v1, "sys.basic.ivi_power_mode"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_22

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    invoke-static {v4, v9}, Lru/zinovin/tankspeedometer/service/LogcatService;->g(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2
    :try_end_37
    .catch Ljava/io/IOException; {:try_start_37 .. :try_end_37} :catch_0
    .catchall {:try_start_37 .. :try_end_37} :catchall_0

    :try_start_38
    iget-object v1, v1, LLf;->G:Ldr;

    invoke-virtual {v1, v2}, Ldr;->f(Ljava/lang/Object;)V
    :try_end_38
    .catch Ljava/io/IOException; {:try_start_38 .. :try_end_38} :catch_1c
    .catchall {:try_start_38 .. :try_end_38} :catchall_1c

    goto/16 :goto_8

    :catchall_1c
    move-exception v0

    goto/16 :goto_9

    :catch_1c
    move-exception v0

    goto/16 :goto_a

    :cond_22
    :try_start_39
    const-string v1, "car.basic.chief_deputy_oil_box_setting.state"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_23

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    invoke-static {v4, v9}, Lru/zinovin/tankspeedometer/service/LogcatService;->g(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2
    :try_end_39
    .catch Ljava/io/IOException; {:try_start_39 .. :try_end_39} :catch_0
    .catchall {:try_start_39 .. :try_end_39} :catchall_0

    :try_start_3a
    iget-object v1, v1, LLf;->H:Ldr;

    invoke-virtual {v1, v2}, Ldr;->f(Ljava/lang/Object;)V
    :try_end_3a
    .catch Ljava/io/IOException; {:try_start_3a .. :try_end_3a} :catch_1d
    .catchall {:try_start_3a .. :try_end_3a} :catchall_1d

    goto/16 :goto_8

    :catchall_1d
    move-exception v0

    goto/16 :goto_9

    :catch_1d
    move-exception v0

    goto/16 :goto_a

    :cond_23
    :try_start_3b
    const-string v1, "sys.other.keyevent_notify"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "keyevent_notify="

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_3b
    .catch Ljava/io/IOException; {:try_start_3b .. :try_end_3b} :catch_0
    .catchall {:try_start_3b .. :try_end_3b} :catchall_0

    :try_start_3c
    invoke-virtual {v9, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    array-length v8, v2

    move/from16 v20, v15

    const/4 v15, 0x1

    if-le v8, v15, :cond_24

    aget-object v18, v2, v15
    :try_end_3c
    .catch Ljava/io/IOException; {:try_start_3c .. :try_end_3c} :catch_1e
    .catchall {:try_start_3c .. :try_end_3c} :catchall_1e

    :cond_24
    move-object/from16 v2, v18

    :try_start_3d
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "2006,1"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_26

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    invoke-virtual {v1}, LLf;->d()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_25

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, LLf;->e(Ljava/lang/Integer;)V

    :cond_25
    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->b(Lru/zinovin/tankspeedometer/service/LogcatService;)V

    goto/16 :goto_16

    :cond_26
    const-string v1, "2006,3"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_27

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, LLf;->e(Ljava/lang/Integer;)V

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->b(Lru/zinovin/tankspeedometer/service/LogcatService;)V

    goto/16 :goto_16

    :cond_27
    const-string v1, "2006,4"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_28

    invoke-static {}, Lru/zinovin/tankspeedometer/service/LogcatService;->h()V

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->b(Lru/zinovin/tankspeedometer/service/LogcatService;)V

    goto/16 :goto_16

    :cond_28
    const-string v1, "1006,1"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_29

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, LLf;->e(Ljava/lang/Integer;)V

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->b(Lru/zinovin/tankspeedometer/service/LogcatService;)V

    goto/16 :goto_16

    :cond_29
    const-string v1, "1006,4"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2a

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    const/4 v2, 0x6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, LLf;->e(Ljava/lang/Integer;)V

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->b(Lru/zinovin/tankspeedometer/service/LogcatService;)V

    goto/16 :goto_16

    :cond_2a
    const-string v1, "2007,1"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_36

    const-string v1, "1007,1"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2b

    goto/16 :goto_12

    :cond_2b
    const-string v1, "2007,3"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_35

    const-string v1, "1007,3"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2c

    goto/16 :goto_11

    :cond_2c
    const-string v1, "2007,4"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_34

    const-string v1, "1007,4"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2d

    goto :goto_10

    :cond_2d
    const-string v1, "2003,0"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_33

    const-string v1, "2003,2"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2e

    goto :goto_f

    :cond_2e
    const-string v1, "2002,0"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_32

    const-string v1, "2002,2"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2f

    goto :goto_e

    :cond_2f
    const-string v1, "2004,0"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_30

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->b(Lru/zinovin/tankspeedometer/service/LogcatService;)V

    move/from16 v15, v20

    const/4 v14, 0x1

    goto/16 :goto_17

    :cond_30
    const-string v1, "2004,3"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_31

    const-string v1, "1006,3"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3f

    :cond_31
    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, LLf;->h(Ljava/lang/Boolean;)V

    goto/16 :goto_16

    :cond_32
    :goto_e
    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->b(Lru/zinovin/tankspeedometer/service/LogcatService;)V

    move/from16 v15, v20

    const/4 v13, 0x1

    goto/16 :goto_17

    :cond_33
    :goto_f
    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->b(Lru/zinovin/tankspeedometer/service/LogcatService;)V

    move/from16 v15, v20

    const/4 v12, 0x1

    goto/16 :goto_17

    :cond_34
    :goto_10
    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    const/16 v2, 0x9

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, LLf;->e(Ljava/lang/Integer;)V

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->b(Lru/zinovin/tankspeedometer/service/LogcatService;)V

    goto/16 :goto_16

    :cond_35
    :goto_11
    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    const/16 v2, 0x8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, LLf;->e(Ljava/lang/Integer;)V

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->b(Lru/zinovin/tankspeedometer/service/LogcatService;)V

    goto/16 :goto_16

    :cond_36
    :goto_12
    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    const/4 v2, 0x7

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, LLf;->e(Ljava/lang/Integer;)V

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->b(Lru/zinovin/tankspeedometer/service/LogcatService;)V

    goto/16 :goto_16

    :catchall_1e
    move-exception v0

    goto/16 :goto_9

    :catch_1e
    move-exception v0

    goto/16 :goto_a

    :cond_37
    move-object/from16 v19, v8

    move/from16 v20, v15

    const-string v1, "GW_MultiDisplay::"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3f

    const-string v1, "PageView{updateContentOnly=false"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3f

    const-string v1, "PageView{updateContentOnly=false, cnt=1, cur=0, oriPage=null, curPage=null}"

    invoke-virtual {v9, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3f

    if-eqz v12, :cond_3a

    invoke-static {v4, v9}, Lru/zinovin/tankspeedometer/service/LogcatService;->i(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_38

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, LLf;->h(Ljava/lang/Boolean;)V

    :goto_13
    const/4 v13, 0x0

    goto :goto_14

    :cond_38
    invoke-static {v4, v9}, Lru/zinovin/tankspeedometer/service/LogcatService;->j(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_39

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, LLf;->h(Ljava/lang/Boolean;)V

    goto :goto_13

    :cond_39
    :goto_14
    move/from16 v15, v20

    const/4 v12, 0x0

    goto :goto_17

    :cond_3a
    if-eqz v13, :cond_3d

    invoke-static {v4, v9}, Lru/zinovin/tankspeedometer/service/LogcatService;->k(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3b

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, LLf;->h(Ljava/lang/Boolean;)V

    goto :goto_15

    :cond_3b
    invoke-static {v4, v9}, Lru/zinovin/tankspeedometer/service/LogcatService;->a(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3c

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, LLf;->h(Ljava/lang/Boolean;)V

    :cond_3c
    :goto_15
    move/from16 v15, v20

    const/4 v13, 0x0

    goto :goto_17

    :cond_3d
    if-nez v14, :cond_3e

    const-string v1, "oriPage=Page{packageName"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3e

    const-string v1, "curPage=null}"

    invoke-virtual {v9, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3e

    const-string v1, "type=21"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3e

    const-string v1, "com.gwm.navi.app"

    invoke-virtual {v9, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3e

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, LLf;->h(Ljava/lang/Boolean;)V

    :cond_3e
    move/from16 v15, v20

    const/4 v14, 0x0

    goto :goto_17

    :cond_3f
    :goto_16
    move/from16 v15, v20

    :goto_17
    const/16 v1, 0x3e8

    if-le v10, v1, :cond_40

    invoke-static {v4}, Lru/zinovin/tankspeedometer/service/LogcatService;->d(Lru/zinovin/tankspeedometer/service/LogcatService;)V

    move-object/from16 v1, p0

    move-object/from16 v2, v17

    move-object/from16 v8, v19

    const/4 v10, 0x0

    goto/16 :goto_1

    :cond_40
    move-object/from16 v1, p0

    move-object/from16 v2, v17

    move-object/from16 v8, v19

    goto/16 :goto_1

    :cond_41
    move-object/from16 v17, v2

    move-object/from16 v19, v8

    move/from16 v20, v15

    const/4 v1, 0x1

    add-int/2addr v11, v1

    const-string v1, "exit from while"

    invoke-static {v5, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "isServiceStopped=["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, v4, Lru/zinovin/tankspeedometer/service/LogcatService;->a:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3d
    .catch Ljava/io/IOException; {:try_start_3d .. :try_end_3d} :catch_0
    .catchall {:try_start_3d .. :try_end_3d} :catchall_0

    const/4 v1, 0x2

    if-le v11, v1, :cond_42

    goto :goto_18

    :cond_42
    move-object/from16 v1, p0

    move-object/from16 v2, v17

    move-object/from16 v8, v19

    move/from16 v15, v20

    goto/16 :goto_0

    :cond_43
    move-object/from16 v17, v2

    :goto_18
    :try_start_3e
    invoke-virtual {v7}, Ljava/io/BufferedReader;->close()V

    invoke-virtual {v6}, Ljava/lang/Process;->destroy()V
    :try_end_3e
    .catch Ljava/io/IOException; {:try_start_3e .. :try_end_3e} :catch_1f

    goto :goto_19

    :catch_1f
    move-exception v0

    move-object v2, v0

    move-object/from16 v1, v17

    invoke-static {v3, v1, v2}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_19
    iget-boolean v1, v4, Lru/zinovin/tankspeedometer/service/LogcatService;->a:Z

    if-eqz v1, :cond_44

    const-string v1, "STOP reading logcat"

    invoke-static {v5, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v4, p0

    goto :goto_1a

    :cond_44
    const-string v1, "RESTART reading logcat"

    invoke-static {v5, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Ljava/util/Timer;

    invoke-direct {v1}, Ljava/util/Timer;-><init>()V

    new-instance v2, LSf;

    const/4 v3, 0x1

    move-object/from16 v4, p0

    invoke-direct {v2, v4, v3}, LSf;-><init>(Ljava/lang/Object;I)V

    const-wide/16 v5, 0x0

    invoke-virtual {v1, v2, v5, v6}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V

    :goto_1a
    return-void

    :catchall_1f
    move-exception v0

    move-object v4, v1

    move-object v1, v2

    :goto_1b
    move-object v2, v0

    goto :goto_1d

    :catch_20
    move-exception v0

    move-object v4, v1

    move-object v1, v2

    move-object v2, v0

    :goto_1c
    :try_start_3f
    new-instance v5, Ljava/lang/RuntimeException;

    invoke-direct {v5, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v5
    :try_end_3f
    .catchall {:try_start_3f .. :try_end_3f} :catchall_20

    :catchall_20
    move-exception v0

    goto :goto_1b

    :goto_1d
    :try_start_40
    invoke-virtual {v7}, Ljava/io/BufferedReader;->close()V

    invoke-virtual {v6}, Ljava/lang/Process;->destroy()V
    :try_end_40
    .catch Ljava/io/IOException; {:try_start_40 .. :try_end_40} :catch_21

    goto :goto_1e

    :catch_21
    move-exception v0

    move-object v5, v0

    invoke-static {v3, v1, v5}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1e
    throw v2

    :catch_22
    move-exception v0

    move-object v4, v1

    move-object v1, v0

    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v2
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, LSf;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/Thread;

    iget-object v1, p0, LSf;->b:Ljava/lang/Object;

    check-cast v1, Lru/zinovin/tankspeedometer/service/YnActivatingService;

    iget-object v1, v1, Lru/zinovin/tankspeedometer/service/YnActivatingService;->c:Lt5;

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void

    :pswitch_0
    new-instance v0, Ljava/lang/Thread;

    iget-object v1, p0, LSf;->b:Ljava/lang/Object;

    check-cast v1, Lru/zinovin/tankspeedometer/service/TboxMonitorService;

    iget-object v1, v1, Lru/zinovin/tankspeedometer/service/TboxMonitorService;->c:Lt5;

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void

    :pswitch_1
    invoke-direct {p0}, LSf;->a()V

    return-void

    :pswitch_2
    new-instance v0, Ljava/lang/Thread;

    iget-object v1, p0, LSf;->b:Ljava/lang/Object;

    check-cast v1, LSf;

    iget-object v1, v1, LSf;->b:Ljava/lang/Object;

    check-cast v1, Lru/zinovin/tankspeedometer/service/LogcatService;

    iget-object v1, v1, Lru/zinovin/tankspeedometer/service/LogcatService;->d:Lt5;

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void

    :pswitch_3
    new-instance v0, Ljava/lang/Thread;

    iget-object v1, p0, LSf;->b:Ljava/lang/Object;

    check-cast v1, Lru/zinovin/tankspeedometer/service/InternetMonitorService;

    iget-object v1, v1, Lru/zinovin/tankspeedometer/service/InternetMonitorService;->c:Lt5;

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
