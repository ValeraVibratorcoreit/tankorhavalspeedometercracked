.class public final Lje;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final j:[Ljava/lang/String;

.field public static final k:Ljava/util/List;


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Landroid/os/IBinder;

.field public c:Lge;

.field public d:Z

.field public final e:Landroid/os/HandlerThread;

.field public final f:Landroid/os/Handler;

.field public final g:Ljava/util/concurrent/ConcurrentHashMap;

.field public h:Lie;

.field public final i:Ld2;


# direct methods
.method static constructor <clinit>()V
    .locals 32

    const-string v30, "car.basic.current_gear"

    const-string v31, "car.basic.gear_status"

    const-string v0, "car.basic.vehicle_speed"

    const-string v1, "car.basic.chief_deputy_oil_box_setting.state"

    const-string v2, "car.basic.remain_fuel_percentage"

    const-string v3, "car.basic.coolant_temp"

    const-string v4, "car.basic.battery_voltage"

    const-string v5, "car.basic.master.oil.tank.level"

    const-string v6, "car.basic.auxiliary.oil.tank.level"

    const-string v7, "car.basic.avg_fuel_consumption"

    const-string v8, "car.basic.cur_journey_avg_fuel_consumption_a"

    const-string v9, "car.basic.cur_journey_avg_speed_a"

    const-string v10, "car.basic.cur_journey_drivetime"

    const-string v11, "car.basic.cur_journey_odometer"

    const-string v12, "car.basic.accumulated_odometer"

    const-string v13, "car.basic.total_odometer"

    const-string v14, "car.basic.battery_voltage"

    const-string v15, "car.basic.remain_odometer"

    const-string v16, "car.basic.main_tank_remain_odometer"

    const-string v17, "car.basic.sub_tank_remain_odometer"

    const-string v18, "car.ev_info.electric_mode_remain_odometer"

    const-string v19, "car.basic.outside_temp"

    const-string v20, "car.basic.tpms_status"

    const-string v21, "car.basic.tpms_units"

    const-string v22, "car.basic.tire_temp_unit"

    const-string v23, "car.unit_setting.temperature"

    const-string v24, "sys.settings.language"

    const-string v25, "sys.basic.ivi_power_mode"

    const-string v26, "sys.other.keyevent_notify"

    const-string v27, "car.ev_info.cur_battery_power_percentage"

    const-string v28, "car.basic.inside_temp"

    const-string v29, "car.basic.battery_power_level"

    filled-new-array/range {v0 .. v31}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lje;->j:[Ljava/lang/String;

    const-string v0, "sys.other.keyevent_notify"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lje;->k:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ld2;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lje;->g:Ljava/util/concurrent/ConcurrentHashMap;

    iput-object p1, p0, Lje;->a:Landroid/content/Context;

    iput-object p2, p0, Lje;->i:Ld2;

    new-instance p1, Landroid/os/HandlerThread;

    const-string p2, "GwmAdapter"

    invoke-direct {p1, p2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lje;->e:Landroid/os/HandlerThread;

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    new-instance p2, Landroid/os/Handler;

    invoke-virtual {p1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object p1

    invoke-direct {p2, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p2, p0, Lje;->f:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    const-string v0, "T500.GwmReader"

    const-string v1, "linkToDeath error: "

    :try_start_0
    const-string v2, "android.os.ServiceManager"

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const-string v3, "getService"

    const-class v4, Ljava/lang/String;

    filled-new-array {v4}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    const-string v3, "gwm_adapter"

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v2, v4, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Landroid/os/IBinder;

    if-eqz v3, :cond_0

    move-object v4, v2

    check-cast v4, Landroid/os/IBinder;

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_3

    :cond_0
    :goto_0
    if-eqz v4, :cond_3

    invoke-interface {v4}, Landroid/os/IBinder;->isBinderAlive()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_2

    :cond_1
    iput-object v4, p0, Lje;->b:Landroid/os/IBinder;

    const-string v2, "\u0421\u0435\u0440\u0432\u0438\u0441 gwm_adapter \u043d\u0430\u0439\u0434\u0435\u043d"

    invoke-static {v0, v2}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Lge;

    invoke-direct {v2, p0}, Lge;-><init>(Lje;)V

    iput-object v2, p0, Lje;->c:Lge;

    new-instance v2, Lie;

    invoke-direct {v2, p0}, Lie;-><init>(Lje;)V

    iput-object v2, p0, Lje;->h:Lie;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v3, 0x0

    :try_start_1
    invoke-interface {v4, v2, v3}, Landroid/os/IBinder;->linkToDeath(Landroid/os/IBinder$DeathRecipient;I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v2

    :try_start_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lyr;->b(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    invoke-virtual {p0}, Lje;->c()V

    invoke-virtual {p0, v4}, Lje;->d(Landroid/os/IBinder;)V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lje;->d:Z

    iget-object v2, p0, Lje;->i:Ld2;

    if-eqz v2, :cond_2

    invoke-static {v1}, Ld2;->P(Z)V

    :cond_2
    const-string v1, "\u041f\u043e\u0434\u043a\u043b\u044e\u0447\u0435\u043d\u043e. \u0418\u0441\u0442\u043e\u0447\u043d\u0438\u043a: GWM_ADAPTER"

    invoke-static {v0, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    :goto_2
    const-string v1, "\u0421\u0435\u0440\u0432\u0438\u0441 gwm_adapter \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d \u0438\u043b\u0438 \u043d\u0435 \u0430\u043a\u0442\u0438\u0432\u0435\u043d"

    invoke-static {v0, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :goto_3
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "\u041e\u0448\u0438\u0431\u043a\u0430 \u043f\u043e\u0434\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u044f: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2, v1}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const/16 v9, 0xe

    const/16 v10, 0xd

    const/16 v11, 0xc

    const/16 v12, 0xb

    const/16 v13, 0xa

    const/4 v14, 0x5

    const/4 v15, 0x3

    const/16 v16, 0x9

    const/16 v17, 0x7

    const/16 v18, 0x6

    const/16 v19, 0x4

    const/16 v20, 0x2

    const/16 v3, 0x8

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/16 v21, 0x1

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->isEmpty()Z

    move-result v22

    if-eqz v22, :cond_0

    return-void

    :cond_0
    iget-object v6, v0, Lje;->g:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v6, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v23

    move-object/from16 v7, v23

    check-cast v7, Ljava/lang/String;

    if-eqz v7, :cond_1

    invoke-virtual {v7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    return-void

    :cond_1
    invoke-virtual {v6, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v6, v0, Lje;->i:Ld2;

    if-eqz v6, :cond_38

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v7, v6, Ld2;->b:Ljava/lang/Object;

    check-cast v7, LLf;

    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->hashCode()I

    move-result v23

    sparse-switch v23, :sswitch_data_0

    :goto_0
    move v1, v4

    goto/16 :goto_1

    :sswitch_0
    const-string v8, "car.basic.current_gear"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    const/16 v1, 0x1d

    goto/16 :goto_1

    :sswitch_1
    const-string v8, "sys.basic.ivi_power_mode"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    const/16 v1, 0x1c

    goto/16 :goto_1

    :sswitch_2
    const-string v8, "car.basic.engine_speed"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    const/16 v1, 0x1b

    goto/16 :goto_1

    :sswitch_3
    const-string v8, "car.basic.auxiliary.oil.tank.level"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_0

    :cond_5
    const/16 v1, 0x1a

    goto/16 :goto_1

    :sswitch_4
    const-string v8, "car.unit_setting.temperature"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_0

    :cond_6
    const/16 v1, 0x19

    goto/16 :goto_1

    :sswitch_5
    const-string v8, "car.ev_info.cur_battery_power_percentage"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto :goto_0

    :cond_7
    const/16 v1, 0x18

    goto/16 :goto_1

    :sswitch_6
    const-string v8, "car.basic.total_odometer"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_0

    :cond_8
    const/16 v1, 0x17

    goto/16 :goto_1

    :sswitch_7
    const-string v8, "car.basic.chief_deputy_oil_box_setting.state"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    goto :goto_0

    :cond_9
    const/16 v1, 0x16

    goto/16 :goto_1

    :sswitch_8
    const-string v8, "car.basic.accumulated_odometer"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    goto :goto_0

    :cond_a
    const/16 v1, 0x15

    goto/16 :goto_1

    :sswitch_9
    const-string v8, "car.basic.remain_odometer"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    goto/16 :goto_0

    :cond_b
    const/16 v1, 0x14

    goto/16 :goto_1

    :sswitch_a
    const-string v8, "car.ev_info.electric_mode_remain_odometer"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    goto/16 :goto_0

    :cond_c
    const/16 v1, 0x13

    goto/16 :goto_1

    :sswitch_b
    const-string v8, "sys.settings.language"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    goto/16 :goto_0

    :cond_d
    const/16 v1, 0x12

    goto/16 :goto_1

    :sswitch_c
    const-string v8, "car.basic.cur_journey_avg_speed_a"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    goto/16 :goto_0

    :cond_e
    const/16 v1, 0x11

    goto/16 :goto_1

    :sswitch_d
    const-string v8, "car.basic.tpms_units"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    goto/16 :goto_0

    :cond_f
    const/16 v1, 0x10

    goto/16 :goto_1

    :sswitch_e
    const-string v8, "car.basic.main_tank_remain_odometer"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    goto/16 :goto_0

    :cond_10
    const/16 v1, 0xf

    goto/16 :goto_1

    :sswitch_f
    const-string v8, "car.basic.avg_fuel_consumption"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    goto/16 :goto_0

    :cond_11
    move v1, v9

    goto/16 :goto_1

    :sswitch_10
    const-string v8, "car.basic.tpms_status"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_12

    goto/16 :goto_0

    :cond_12
    move v1, v10

    goto/16 :goto_1

    :sswitch_11
    const-string v8, "car.basic.cur_journey_odometer"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    goto/16 :goto_0

    :cond_13
    move v1, v11

    goto/16 :goto_1

    :sswitch_12
    const-string v8, "car.basic.coolant_temp"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_14

    goto/16 :goto_0

    :cond_14
    move v1, v12

    goto/16 :goto_1

    :sswitch_13
    const-string v8, "car.basic.battery_voltage"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    goto/16 :goto_0

    :cond_15
    move v1, v13

    goto/16 :goto_1

    :sswitch_14
    const-string v8, "car.basic.master.oil.tank.level"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    goto/16 :goto_0

    :cond_16
    move/from16 v1, v16

    goto/16 :goto_1

    :sswitch_15
    const-string v8, "car.basic.sub_tank_remain_odometer"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    goto/16 :goto_0

    :cond_17
    move v1, v3

    goto/16 :goto_1

    :sswitch_16
    const-string v8, "car.basic.remain_fuel_percentage"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_18

    goto/16 :goto_0

    :cond_18
    move/from16 v1, v17

    goto :goto_1

    :sswitch_17
    const-string v8, "car.basic.cur_journey_avg_fuel_consumption_a"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    goto/16 :goto_0

    :cond_19
    move/from16 v1, v18

    goto :goto_1

    :sswitch_18
    const-string v8, "car.basic.outside_temp"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    goto/16 :goto_0

    :cond_1a
    move v1, v14

    goto :goto_1

    :sswitch_19
    const-string v8, "car.basic.gear_status"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    goto/16 :goto_0

    :cond_1b
    move/from16 v1, v19

    goto :goto_1

    :sswitch_1a
    const-string v8, "car.basic.cur_journey_drivetime"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    goto/16 :goto_0

    :cond_1c
    move v1, v15

    goto :goto_1

    :sswitch_1b
    const-string v8, "sys.other.keyevent_notify"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    goto/16 :goto_0

    :cond_1d
    move/from16 v1, v20

    goto :goto_1

    :sswitch_1c
    const-string v8, "car.basic.tire_temp_unit"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1e

    goto/16 :goto_0

    :cond_1e
    move/from16 v1, v21

    goto :goto_1

    :sswitch_1d
    const-string v8, "car.basic.vehicle_speed"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1f

    goto/16 :goto_0

    :cond_1f
    move v1, v5

    :goto_1
    packed-switch v1, :pswitch_data_0

    goto/16 :goto_3

    :pswitch_0
    invoke-static/range {p2 .. p2}, Ld2;->H(Ljava/lang/String;)I

    move-result v1

    if-le v1, v3, :cond_20

    add-int/lit8 v1, v1, -0x1

    :cond_20
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, v7, LLf;->d:Ldr;

    invoke-virtual {v2, v1}, Ldr;->f(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_1
    invoke-static/range {p2 .. p2}, Ld2;->H(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, v7, LLf;->G:Ldr;

    invoke-virtual {v2, v1}, Ldr;->f(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_2
    invoke-static/range {p2 .. p2}, Ld2;->G(Ljava/lang/String;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget-object v2, v7, LLf;->b:Ldr;

    invoke-virtual {v2, v1}, Ldr;->f(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_3
    invoke-static/range {p2 .. p2}, Ld2;->G(Ljava/lang/String;)F

    move-result v1

    invoke-virtual {v7}, LLf;->c()Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    cmpl-float v2, v1, v2

    if-eqz v2, :cond_38

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget-object v2, v7, LLf;->h:Ldr;

    invoke-virtual {v2, v1}, Ldr;->f(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_4
    invoke-static/range {p2 .. p2}, Ld2;->H(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, v7, LLf;->B:Ldr;

    invoke-virtual {v2, v1}, Ldr;->f(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_5
    invoke-static/range {p2 .. p2}, Ld2;->G(Ljava/lang/String;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    if-eq v1, v4, :cond_38

    invoke-static/range {p2 .. p2}, Ld2;->G(Ljava/lang/String;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget-object v2, v7, LLf;->f:Ldr;

    invoke-virtual {v2, v1}, Ldr;->f(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_6
    invoke-static/range {p2 .. p2}, Ld2;->G(Ljava/lang/String;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget-object v2, v7, LLf;->p:Ldr;

    invoke-virtual {v2, v1}, Ldr;->f(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_7
    invoke-static/range {p2 .. p2}, Ld2;->H(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, v7, LLf;->H:Ldr;

    invoke-virtual {v2, v1}, Ldr;->f(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_8
    invoke-static/range {p2 .. p2}, Ld2;->G(Ljava/lang/String;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget-object v2, v7, LLf;->q:Ldr;

    invoke-virtual {v2, v1}, Ldr;->f(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_9
    invoke-static/range {p2 .. p2}, Ld2;->G(Ljava/lang/String;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget-object v2, v7, LLf;->i:Ldr;

    invoke-virtual {v2, v1}, Ldr;->f(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_a
    invoke-static/range {p2 .. p2}, Ld2;->G(Ljava/lang/String;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget-object v2, v7, LLf;->F:Ldr;

    invoke-virtual {v2, v1}, Ldr;->f(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_b
    invoke-static/range {p2 .. p2}, Ld2;->H(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, v7, LLf;->D:Ldr;

    invoke-virtual {v2, v1}, Ldr;->f(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_c
    invoke-static/range {p2 .. p2}, Ld2;->G(Ljava/lang/String;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget-object v2, v7, LLf;->m:Ldr;

    invoke-virtual {v2, v1}, Ldr;->f(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_d
    invoke-static/range {p2 .. p2}, Ld2;->H(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, v7, LLf;->A:Ldr;

    invoke-virtual {v2, v1}, Ldr;->f(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_e
    iget-object v1, v7, LLf;->H:Ldr;

    invoke-virtual {v1}, Loj;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-le v1, v4, :cond_38

    invoke-static/range {p2 .. p2}, Ld2;->G(Ljava/lang/String;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget-object v2, v7, LLf;->i:Ldr;

    invoke-virtual {v2, v1}, Ldr;->f(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_f
    invoke-static/range {p2 .. p2}, Ld2;->G(Ljava/lang/String;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget-object v2, v7, LLf;->k:Ldr;

    invoke-virtual {v2, v1}, Ldr;->f(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_10
    const-string v1, "[0.0,-50.0,0.0,-50.0,0.0,-50.0,0.0,-50.0]"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_38

    iget-object v1, v7, LLf;->z:Ldr;

    invoke-virtual {v1, v2}, Ldr;->f(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_11
    invoke-static/range {p2 .. p2}, Ld2;->G(Ljava/lang/String;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget-object v2, v7, LLf;->o:Ldr;

    invoke-virtual {v2, v1}, Ldr;->f(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_12
    invoke-static/range {p2 .. p2}, Ld2;->G(Ljava/lang/String;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget-object v2, v7, LLf;->r:Ldr;

    invoke-virtual {v2, v1}, Ldr;->f(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_13
    invoke-static/range {p2 .. p2}, Ld2;->G(Ljava/lang/String;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget-object v2, v7, LLf;->e:Ldr;

    invoke-virtual {v2, v1}, Ldr;->f(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_14
    iget-object v1, v6, Ld2;->c:Ljava/lang/Object;

    check-cast v1, Landroid/content/SharedPreferences;

    const-string v3, "fuel_tank_fix"

    invoke-interface {v1, v3, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_21

    invoke-static/range {p2 .. p2}, Ld2;->G(Ljava/lang/String;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v7, v1}, LLf;->g(Ljava/lang/Float;)V

    goto/16 :goto_3

    :cond_21
    invoke-static/range {p2 .. p2}, Ld2;->G(Ljava/lang/String;)F

    move-result v1

    const/high16 v2, 0x41200000    # 10.0f

    div-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v7, v1}, LLf;->g(Ljava/lang/Float;)V

    goto/16 :goto_3

    :pswitch_15
    invoke-static/range {p2 .. p2}, Ld2;->G(Ljava/lang/String;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget-object v2, v7, LLf;->j:Ldr;

    invoke-virtual {v2, v1}, Ldr;->f(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_16
    invoke-static/range {p2 .. p2}, Ld2;->G(Ljava/lang/String;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v7, v1}, LLf;->g(Ljava/lang/Float;)V

    goto/16 :goto_3

    :pswitch_17
    invoke-static/range {p2 .. p2}, Ld2;->G(Ljava/lang/String;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget-object v2, v7, LLf;->l:Ldr;

    invoke-virtual {v2, v1}, Ldr;->f(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_18
    invoke-static/range {p2 .. p2}, Ld2;->G(Ljava/lang/String;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    const/16 v3, -0x3e8

    if-le v1, v3, :cond_38

    invoke-static/range {p2 .. p2}, Ld2;->G(Ljava/lang/String;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget-object v2, v7, LLf;->s:Ldr;

    invoke-virtual {v2, v1}, Ldr;->f(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_19
    invoke-static/range {p2 .. p2}, Ld2;->H(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, v7, LLf;->c:Ldr;

    invoke-virtual {v2, v1}, Ldr;->f(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_1a
    invoke-static/range {p2 .. p2}, Ld2;->H(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, v7, LLf;->n:Ldr;

    invoke-virtual {v2, v1}, Ldr;->f(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_1b
    const-string v1, "keyevent_notify="

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v6, "T500.SERVICE"

    invoke-static {v6, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_1

    goto/16 :goto_2

    :sswitch_1e
    const-string v1, "[1007,4]"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_22

    goto/16 :goto_2

    :cond_22
    const/16 v4, 0x14

    goto/16 :goto_2

    :sswitch_1f
    const-string v1, "[1007,3]"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_23

    goto/16 :goto_2

    :cond_23
    const/16 v4, 0x13

    goto/16 :goto_2

    :sswitch_20
    const-string v1, "[1007,1]"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_24

    goto/16 :goto_2

    :cond_24
    const/16 v4, 0x12

    goto/16 :goto_2

    :sswitch_21
    const-string v1, "[1006,4]"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_25

    goto/16 :goto_2

    :cond_25
    const/16 v4, 0x11

    goto/16 :goto_2

    :sswitch_22
    const-string v1, "[1006,3]"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_26

    goto/16 :goto_2

    :cond_26
    const/16 v4, 0x10

    goto/16 :goto_2

    :sswitch_23
    const-string v1, "[1006,1]"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_27

    goto/16 :goto_2

    :cond_27
    const/16 v4, 0xf

    goto/16 :goto_2

    :sswitch_24
    const-string v1, "[2007,4]"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_28

    goto/16 :goto_2

    :cond_28
    move v4, v9

    goto/16 :goto_2

    :sswitch_25
    const-string v1, "[2007,3]"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_29

    goto/16 :goto_2

    :cond_29
    move v4, v10

    goto/16 :goto_2

    :sswitch_26
    const-string v1, "[2007,1]"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2a

    goto/16 :goto_2

    :cond_2a
    move v4, v11

    goto/16 :goto_2

    :sswitch_27
    const-string v1, "[2006,4]"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2b

    goto/16 :goto_2

    :cond_2b
    move v4, v12

    goto/16 :goto_2

    :sswitch_28
    const-string v1, "[2006,3]"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2c

    goto/16 :goto_2

    :cond_2c
    move v4, v13

    goto/16 :goto_2

    :sswitch_29
    const-string v1, "[2006,1]"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2d

    goto/16 :goto_2

    :cond_2d
    move/from16 v4, v16

    goto/16 :goto_2

    :sswitch_2a
    const-string v1, "[2004,3]"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2e

    goto/16 :goto_2

    :cond_2e
    move v4, v3

    goto/16 :goto_2

    :sswitch_2b
    const-string v1, "[2003,2]"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2f

    goto/16 :goto_2

    :cond_2f
    move/from16 v4, v17

    goto :goto_2

    :sswitch_2c
    const-string v1, "[2003,0]"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_30

    goto :goto_2

    :cond_30
    move/from16 v4, v18

    goto :goto_2

    :sswitch_2d
    const-string v1, "[2002,2]"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_31

    goto :goto_2

    :cond_31
    move v4, v14

    goto :goto_2

    :sswitch_2e
    const-string v1, "[2002,0]"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_32

    goto :goto_2

    :cond_32
    move/from16 v4, v19

    goto :goto_2

    :sswitch_2f
    const-string v1, "[2001,2]"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_33

    goto :goto_2

    :cond_33
    move v4, v15

    goto :goto_2

    :sswitch_30
    const-string v1, "[2001,0]"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_34

    goto :goto_2

    :cond_34
    move/from16 v4, v20

    goto :goto_2

    :sswitch_31
    const-string v1, "[2000,2]"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_35

    goto :goto_2

    :cond_35
    move/from16 v4, v21

    goto :goto_2

    :sswitch_32
    const-string v1, "[2000,0]"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_36

    goto :goto_2

    :cond_36
    move v4, v5

    :goto_2
    packed-switch v4, :pswitch_data_1

    goto/16 :goto_3

    :pswitch_1c
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v7, v1}, LLf;->e(Ljava/lang/Integer;)V

    goto/16 :goto_3

    :pswitch_1d
    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v7, v1}, LLf;->e(Ljava/lang/Integer;)V

    goto/16 :goto_3

    :pswitch_1e
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v7, v1}, LLf;->e(Ljava/lang/Integer;)V

    goto/16 :goto_3

    :pswitch_1f
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v7, v1}, LLf;->e(Ljava/lang/Integer;)V

    goto/16 :goto_3

    :pswitch_20
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v7, v1}, LLf;->e(Ljava/lang/Integer;)V

    goto :goto_3

    :pswitch_21
    new-array v1, v5, [Ljava/lang/Object;

    const-string v2, "MicroMode.class"

    invoke-static {v2, v1}, LTf;->q(Ljava/lang/String;[Ljava/lang/Object;)LL;

    goto :goto_3

    :pswitch_22
    invoke-static/range {v20 .. v20}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v7, v1}, LLf;->e(Ljava/lang/Integer;)V

    goto :goto_3

    :pswitch_23
    invoke-virtual {v7}, LLf;->d()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_37

    invoke-static/range {v21 .. v21}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v7, v1}, LLf;->e(Ljava/lang/Integer;)V

    goto :goto_3

    :cond_37
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v7, v1}, LLf;->h(Ljava/lang/Boolean;)V

    goto :goto_3

    :pswitch_24
    invoke-virtual {v7}, LLf;->d()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v7, v1}, LLf;->h(Ljava/lang/Boolean;)V

    goto :goto_3

    :pswitch_25
    invoke-virtual {v7}, LLf;->d()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_38

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v7, v1}, LLf;->h(Ljava/lang/Boolean;)V

    goto :goto_3

    :pswitch_26
    invoke-static/range {p2 .. p2}, Ld2;->H(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, v7, LLf;->C:Ldr;

    invoke-virtual {v2, v1}, Ldr;->f(Ljava/lang/Object;)V

    goto :goto_3

    :pswitch_27
    invoke-static/range {p2 .. p2}, Ld2;->G(Ljava/lang/String;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget-object v2, v7, LLf;->a:Ldr;

    invoke-virtual {v2, v1}, Ldr;->f(Ljava/lang/Object;)V

    :cond_38
    :goto_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x74292566 -> :sswitch_1d
        -0x71bf156e -> :sswitch_1c
        -0x69735ad2 -> :sswitch_1b
        -0x636f1f81 -> :sswitch_1a
        -0x559590b8 -> :sswitch_19
        -0x3ff32fb8 -> :sswitch_18
        -0x1d33ffa7 -> :sswitch_17
        -0x1c893576 -> :sswitch_16
        -0x727369a -> :sswitch_15
        -0x53c10b2 -> :sswitch_14
        -0x208652e -> :sswitch_13
        -0x163c471 -> :sswitch_12
        0x3f9a467 -> :sswitch_11
        0x1445c055 -> :sswitch_10
        0x1791c879 -> :sswitch_f
        0x1ad19499 -> :sswitch_e
        0x2a0b4eac -> :sswitch_d
        0x2e166524 -> :sswitch_c
        0x2feee7e2 -> :sswitch_b
        0x318a40bc -> :sswitch_a
        0x44c4e2a8 -> :sswitch_9
        0x45461706 -> :sswitch_8
        0x4b4b8932 -> :sswitch_7
        0x50fe20c4 -> :sswitch_6
        0x53163231 -> :sswitch_5
        0x59841c75 -> :sswitch_4
        0x5c7b345e -> :sswitch_3
        0x619b6e24 -> :sswitch_2
        0x6c9e5221 -> :sswitch_1
        0x71ee22af -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_27
        :pswitch_26
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
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

    :sswitch_data_1
    .sparse-switch
        -0x6959f6e0 -> :sswitch_32
        -0x6959f6a2 -> :sswitch_31
        -0x69598281 -> :sswitch_30
        -0x69598243 -> :sswitch_2f
        -0x69590e22 -> :sswitch_2e
        -0x69590de4 -> :sswitch_2d
        -0x695899c3 -> :sswitch_2c
        -0x69589985 -> :sswitch_2b
        -0x69582507 -> :sswitch_2a
        -0x69573c87 -> :sswitch_29
        -0x69573c49 -> :sswitch_28
        -0x69573c2a -> :sswitch_27
        -0x6956c828 -> :sswitch_26
        -0x6956c7ea -> :sswitch_25
        -0x6956c7cb -> :sswitch_24
        0x61c28838 -> :sswitch_23
        0x61c28876 -> :sswitch_22
        0x61c28895 -> :sswitch_21
        0x61c2fc97 -> :sswitch_20
        0x61c2fcd5 -> :sswitch_1f
        0x61c2fcf4 -> :sswitch_1e
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_24
        :pswitch_1c
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
    .end packed-switch
.end method

.method public final c()V
    .locals 10

    iget-object v0, p0, Lje;->b:Landroid/os/IBinder;

    if-eqz v0, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "\u0417\u0430\u043f\u0440\u043e\u0441 \u043f\u0430\u0440\u0430\u043c\u0435\u0442\u0440\u043e\u0432: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Lje;->j:[Ljava/lang/String;

    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "T500.GwmReader"

    invoke-static {v2, v0}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lje;->b:Landroid/os/IBinder;

    const-string v3, "transactGetValues error: "

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    :try_start_0
    const-string v8, "com.gwm.android.adapter.IGwmAdapterService"

    invoke-virtual {v4, v8}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    const/4 v8, 0x1

    invoke-virtual {v4, v8}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v9, p0, Lje;->a:Landroid/content/Context;

    invoke-virtual {v9}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_0

    const-string v9, "ru.zinovin.tankspeedometer"

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_6

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_0
    :goto_0
    invoke-virtual {v4, v9}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    invoke-virtual {v4, v7}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    invoke-virtual {v4, v8}, Landroid/os/Parcel;->writeInt(I)V

    invoke-interface {v0, v8, v4, v5, v6}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v5}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v5}, Landroid/os/Parcel;->createStringArray()[Ljava/lang/String;

    move-result-object v7
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    :goto_1
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    invoke-virtual {v5}, Landroid/os/Parcel;->recycle()V

    goto :goto_3

    :goto_2
    :try_start_1
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lyr;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :goto_3
    if-eqz v7, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "\u041d\u0430\u0447\u0430\u043b\u044c\u043d\u044b\u0435 \u0437\u043d\u0430\u0447\u0435\u043d\u0438\u044f: "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v7}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_4
    array-length v0, v7

    if-ge v6, v0, :cond_4

    const/16 v0, 0x20

    if-ge v6, v0, :cond_4

    aget-object v0, v1, v6

    sget-object v2, Lje;->k:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_5

    :cond_2
    aget-object v0, v7, v6

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    aget-object v2, v1, v6

    invoke-virtual {p0, v2, v0}, Lje;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_5
    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :goto_6
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    invoke-virtual {v5}, Landroid/os/Parcel;->recycle()V

    throw v0

    :cond_4
    return-void
.end method

.method public final d(Landroid/os/IBinder;)V
    .locals 5

    const-string v0, "transactRegister error: "

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v2

    :try_start_0
    const-string v3, "com.gwm.android.adapter.IGwmAdapterService"

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    iget-object v3, p0, Lje;->a:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_0

    const-string v3, "ru.zinovin.tankspeedometer"

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    sget-object v3, Lje;->j:[Ljava/lang/String;

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    iget-object v3, p0, Lje;->c:Lge;

    invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    const/4 v3, 0x3

    const/4 v4, 0x0

    invoke-interface {p1, v3, v1, v2, v4}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    :goto_1
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V

    return-void

    :goto_2
    :try_start_1
    const-string v3, "T500.GwmReader"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Lyr;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :goto_3
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V

    throw p1
.end method
