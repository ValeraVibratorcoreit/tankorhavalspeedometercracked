.class public Lru/zinovin/tankspeedometer/service/LogcatService;
.super Landroid/app/Service;
.source "SourceFile"


# static fields
.field public static final synthetic e:I


# instance fields
.field public a:Z

.field public final b:LLf;

.field public c:I

.field public final d:Lt5;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lru/zinovin/tankspeedometer/service/LogcatService;->a:Z

    invoke-static {}, LLf;->a()LLf;

    move-result-object v0

    iput-object v0, p0, Lru/zinovin/tankspeedometer/service/LogcatService;->b:LLf;

    new-instance v0, Lt5;

    const/16 v1, 0xc

    invoke-direct {v0, p0, v1}, Lt5;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lru/zinovin/tankspeedometer/service/LogcatService;->d:Lt5;

    return-void
.end method

.method public static a(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)Z
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "persist.vendor.gwm.cfg.project.code"

    const/4 v3, 0x0

    invoke-static {v3, v2}, LTf;->F(Landroid/app/Activity;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "curPage=Page{packageName=\'com.gwm.app.scenemode\'"

    const/4 v4, -0x1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v5, "250"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v4, 0xe

    goto/16 :goto_0

    :sswitch_1
    const-string v5, "245"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v4, 0xd

    goto/16 :goto_0

    :sswitch_2
    const-string v5, "215"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v4, 0xc

    goto/16 :goto_0

    :sswitch_3
    const-string v5, "213"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v4, 0xb

    goto/16 :goto_0

    :sswitch_4
    const-string v5, "203"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v4, 0xa

    goto/16 :goto_0

    :sswitch_5
    const-string v5, "195"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v4, 0x9

    goto/16 :goto_0

    :sswitch_6
    const-string v5, "193"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 v4, 0x8

    goto/16 :goto_0

    :sswitch_7
    const-string v5, "190"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_0

    :cond_7
    const/4 v4, 0x7

    goto :goto_0

    :sswitch_8
    const-string v5, "189"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_0

    :cond_8
    const/4 v4, 0x6

    goto :goto_0

    :sswitch_9
    const-string v5, "175"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    goto :goto_0

    :cond_9
    const/4 v4, 0x5

    goto :goto_0

    :sswitch_a
    const-string v5, "138"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    goto :goto_0

    :cond_a
    const/4 v4, 0x4

    goto :goto_0

    :sswitch_b
    const-string v5, "134"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    goto :goto_0

    :cond_b
    const/4 v4, 0x3

    goto :goto_0

    :sswitch_c
    const-string v5, "128"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    goto :goto_0

    :cond_c
    const/4 v4, 0x2

    goto :goto_0

    :sswitch_d
    const-string v5, "126"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    goto :goto_0

    :cond_d
    move v4, v0

    goto :goto_0

    :sswitch_e
    const-string v5, "112"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    goto :goto_0

    :cond_e
    move v4, v1

    :goto_0
    packed-switch v4, :pswitch_data_0

    const-string v3, ""

    goto :goto_1

    :pswitch_0
    invoke-static {p0}, Lmk;->l(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p0

    const-string v2, "extFirmware"

    invoke-interface {p0, v2, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    if-eqz p0, :cond_f

    goto :goto_1

    :cond_f
    const-string p0, "curPage=Page{packageName=\'com.gwm.app.carphone\'"

    invoke-virtual {p1, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_11

    const-string p0, "curPage=Page{packageName=\'com.gdc.carplay\'"

    invoke-virtual {p1, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_10

    goto :goto_2

    :cond_10
    move v0, v1

    goto :goto_2

    :goto_1
    :pswitch_1
    invoke-virtual {p1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    :cond_11
    :goto_2
    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        0xbe12 -> :sswitch_e
        0xbe35 -> :sswitch_d
        0xbe37 -> :sswitch_c
        0xbe52 -> :sswitch_b
        0xbe56 -> :sswitch_a
        0xbecf -> :sswitch_9
        0xbef2 -> :sswitch_8
        0xbf08 -> :sswitch_7
        0xbf0b -> :sswitch_6
        0xbf0d -> :sswitch_5
        0xc1b5 -> :sswitch_4
        0xc1d4 -> :sswitch_3
        0xc1d6 -> :sswitch_2
        0xc233 -> :sswitch_1
        0xc24d -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public static synthetic b(Lru/zinovin/tankspeedometer/service/LogcatService;)V
    .locals 1

    const/16 v0, 0x32

    iput v0, p0, Lru/zinovin/tankspeedometer/service/LogcatService;->c:I

    return-void
.end method

.method public static synthetic c(Lru/zinovin/tankspeedometer/service/LogcatService;)V
    .locals 1

    iget v0, p0, Lru/zinovin/tankspeedometer/service/LogcatService;->c:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lru/zinovin/tankspeedometer/service/LogcatService;->c:I

    return-void
.end method

.method public static d(Lru/zinovin/tankspeedometer/service/LogcatService;)V
    .locals 5

    const-string v0, "DATA_PREFS"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object p0, p0, Lru/zinovin/tankspeedometer/service/LogcatService;->b:LLf;

    iget-object v1, p0, LLf;->q:Ldr;

    iget-boolean v2, v1, Ldr;->l:Z

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Loj;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    const-string v2, "ODO_ACCUMULATED"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    :cond_0
    iget-object v1, p0, LLf;->o:Ldr;

    iget-boolean v2, v1, Ldr;->l:Z

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Loj;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    const-string v2, "ODO_JOURNEY"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    :cond_1
    invoke-static {}, Ljava/time/LocalDateTime;->now()Ljava/time/LocalDateTime;

    move-result-object v1

    const-string v2, "yyyyMMddHHmmss"

    invoke-static {v2}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/time/LocalDateTime;->format(Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "ODO_JOURNEY_TIME"

    invoke-interface {v0, v3, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    iget-object v1, p0, LLf;->k:Ldr;

    iget-boolean v3, v1, Ldr;->l:Z

    if-eqz v3, :cond_2

    iget-object v3, p0, LLf;->l:Ldr;

    invoke-virtual {v3}, Loj;->d()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    const-string v4, "AVG_FUEL_CONS_JOURNEY"

    invoke-interface {v0, v4, v3}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    :cond_2
    iget-object v3, p0, LLf;->m:Ldr;

    iget-boolean v4, v3, Ldr;->l:Z

    if-eqz v4, :cond_3

    invoke-virtual {v3}, Loj;->d()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    const-string v4, "AVG_SPEED_JOURNEY"

    invoke-interface {v0, v4, v3}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    :cond_3
    iget-object v3, p0, LLf;->n:Ldr;

    iget-boolean v4, v3, Ldr;->l:Z

    if-eqz v4, :cond_4

    invoke-virtual {v3}, Loj;->d()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const-string v4, "DRIVE_TIME_JOURNEY"

    invoke-interface {v0, v4, v3}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    :cond_4
    iget-object v3, p0, LLf;->p:Ldr;

    iget-boolean v4, v3, Ldr;->l:Z

    if-eqz v4, :cond_5

    invoke-virtual {v3}, Loj;->d()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    const-string v4, "ODO_TOTAL"

    invoke-interface {v0, v4, v3}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    :cond_5
    iget-object v3, p0, LLf;->g:Ldr;

    iget-boolean v3, v3, Ldr;->l:Z

    if-eqz v3, :cond_6

    invoke-virtual {p0}, LLf;->c()Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    const-string v4, "REMAIN_FUEL"

    invoke-interface {v0, v4, v3}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    :cond_6
    iget-object v3, p0, LLf;->h:Ldr;

    iget-boolean v4, v3, Ldr;->l:Z

    if-eqz v4, :cond_7

    invoke-virtual {v3}, Loj;->d()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    const-string v4, "REMAIN_SUB_FUEL"

    invoke-interface {v0, v4, v3}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    :cond_7
    iget-boolean v1, v1, Ldr;->l:Z

    if-eqz v1, :cond_8

    iget-object v1, p0, LLf;->k:Ldr;

    invoke-virtual {v1}, Loj;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    const-string v3, "AVG_FUEL_CONS"

    invoke-interface {v0, v3, v1}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    :cond_8
    iget-object v1, p0, LLf;->i:Ldr;

    iget-boolean v3, v1, Ldr;->l:Z

    if-eqz v3, :cond_9

    invoke-virtual {v1}, Loj;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    const-string v3, "REMAIN_ODOMETER"

    invoke-interface {v0, v3, v1}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    :cond_9
    iget-object v1, p0, LLf;->j:Ldr;

    iget-boolean v3, v1, Ldr;->l:Z

    if-eqz v3, :cond_a

    invoke-virtual {v1}, Loj;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    const-string v3, "REMAIN_SUB_ODOMETER"

    invoke-interface {v0, v3, v1}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    :cond_a
    iget-object v1, p0, LLf;->z:Ldr;

    invoke-virtual {v1}, Loj;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v3, "0.0,-50.0,0.0,-50.0,0.0,-50.0,0.0,-50.0"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    iget-object v1, p0, LLf;->z:Ldr;

    iget-boolean v3, v1, Ldr;->l:Z

    if-eqz v3, :cond_b

    invoke-virtual {v1}, Loj;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v3, "TIRES"

    invoke-interface {v0, v3, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    :cond_b
    iget-object v1, p0, LLf;->s:Ldr;

    iget-boolean v1, v1, Ldr;->l:Z

    if-eqz v1, :cond_c

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "SAVE OUTSIDE_TEMP="

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, LLf;->b()Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "T500.SERVICE"

    invoke-static {v3, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, LLf;->b()Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    const-string v3, "OUTSIDE_TEMP"

    invoke-interface {v0, v3, v1}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    invoke-static {}, Ljava/time/LocalDateTime;->now()Ljava/time/LocalDateTime;

    move-result-object v1

    invoke-static {v2}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/time/LocalDateTime;->format(Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "OUTSIDE_TEMP_TIME"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    :cond_c
    iget-object v1, p0, LLf;->B:Ldr;

    iget-boolean v2, v1, Ldr;->l:Z

    if-eqz v2, :cond_d

    invoke-virtual {v1}, Loj;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const-string v2, "TEMP_UNIT"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    :cond_d
    iget-object v1, p0, LLf;->C:Ldr;

    iget-boolean v2, v1, Ldr;->l:Z

    if-eqz v2, :cond_e

    invoke-virtual {v1}, Loj;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const-string v2, "TIRE_TEMP_UNIT"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    :cond_e
    iget-object v1, p0, LLf;->A:Ldr;

    iget-boolean v2, v1, Ldr;->l:Z

    if-eqz v2, :cond_f

    invoke-virtual {v1}, Loj;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const-string v2, "TPMS_UNIT"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    :cond_f
    iget-object v1, p0, LLf;->D:Ldr;

    iget-boolean v2, v1, Ldr;->l:Z

    if-eqz v2, :cond_10

    invoke-virtual {v1}, Loj;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const-string v2, "LANGUAGE"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    :cond_10
    iget-object v1, p0, LLf;->E:Ldr;

    iget-boolean v1, v1, Ldr;->l:Z

    if-eqz v1, :cond_11

    invoke-virtual {p0}, LLf;->d()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const-string v2, "RIGHT_FRAME_ACTIVE"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    :cond_11
    iget-object v1, p0, LLf;->H:Ldr;

    iget-boolean v2, v1, Ldr;->l:Z

    if-eqz v2, :cond_12

    invoke-virtual {v1}, Loj;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const-string v2, "SUB_TANK_STATE"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    :cond_12
    iget-object v1, p0, LLf;->f:Ldr;

    iget-boolean v2, v1, Ldr;->l:Z

    if-eqz v2, :cond_13

    invoke-virtual {v1}, Loj;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    const-string v2, "EV_BATTERY"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    :cond_13
    iget-object p0, p0, LLf;->F:Ldr;

    iget-boolean v1, p0, Ldr;->l:Z

    if-eqz v1, :cond_14

    invoke-virtual {p0}, Loj;->d()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Float;

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    const-string v1, "EV_REMAIN_ODOMETER"

    invoke-interface {v0, v1, p0}, Landroid/content/SharedPreferences$Editor;->putFloat(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;

    :cond_14
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public static synthetic e(Lru/zinovin/tankspeedometer/service/LogcatService;)LLf;
    .locals 0

    iget-object p0, p0, Lru/zinovin/tankspeedometer/service/LogcatService;->b:LLf;

    return-object p0
.end method

.method public static f(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)F
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p0, "="

    invoke-virtual {p1, p0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    array-length p1, p0

    const/4 v0, 0x1

    if-le p1, v0, :cond_0

    aget-object p0, p0, v0

    goto :goto_0

    :cond_0
    const-string p0, ""

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p0

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    :goto_1
    return p0
.end method

.method public static g(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)I
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p0, "="

    invoke-virtual {p1, p0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    array-length p1, p0

    const/4 v0, 0x1

    if-le p1, v0, :cond_0

    aget-object p0, p0, v0

    goto :goto_0

    :cond_0
    const-string p0, ""

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    :goto_1
    return p0
.end method

.method public static h()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "MicroMode.class"

    invoke-static {v1, v0}, LTf;->q(Ljava/lang/String;[Ljava/lang/Object;)LL;

    return-void
.end method

.method public static i(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)Z
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p0, "curPage=Page{packageName=\'com.gwm.media.entry\'"

    invoke-virtual {p1, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    return p0
.end method

.method public static j(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)Z
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "persist.vendor.gwm.cfg.project.code"

    const/4 v3, 0x0

    invoke-static {v3, v2}, LTf;->F(Landroid/app/Activity;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "oriPage=Page{packageName=\'com.gwm.app.scenemode\'"

    const/4 v4, -0x1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v5, "250"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v4, 0xe

    goto/16 :goto_0

    :sswitch_1
    const-string v5, "245"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v4, 0xd

    goto/16 :goto_0

    :sswitch_2
    const-string v5, "215"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v4, 0xc

    goto/16 :goto_0

    :sswitch_3
    const-string v5, "213"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v4, 0xb

    goto/16 :goto_0

    :sswitch_4
    const-string v5, "203"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v4, 0xa

    goto/16 :goto_0

    :sswitch_5
    const-string v5, "195"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v4, 0x9

    goto/16 :goto_0

    :sswitch_6
    const-string v5, "193"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 v4, 0x8

    goto/16 :goto_0

    :sswitch_7
    const-string v5, "190"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    goto :goto_0

    :cond_7
    const/4 v4, 0x7

    goto :goto_0

    :sswitch_8
    const-string v5, "189"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_0

    :cond_8
    const/4 v4, 0x6

    goto :goto_0

    :sswitch_9
    const-string v5, "175"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    goto :goto_0

    :cond_9
    const/4 v4, 0x5

    goto :goto_0

    :sswitch_a
    const-string v5, "138"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    goto :goto_0

    :cond_a
    const/4 v4, 0x4

    goto :goto_0

    :sswitch_b
    const-string v5, "134"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    goto :goto_0

    :cond_b
    const/4 v4, 0x3

    goto :goto_0

    :sswitch_c
    const-string v5, "128"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    goto :goto_0

    :cond_c
    const/4 v4, 0x2

    goto :goto_0

    :sswitch_d
    const-string v5, "126"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    goto :goto_0

    :cond_d
    move v4, v0

    goto :goto_0

    :sswitch_e
    const-string v5, "112"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    goto :goto_0

    :cond_e
    move v4, v1

    :goto_0
    packed-switch v4, :pswitch_data_0

    const-string v3, ""

    goto :goto_1

    :pswitch_0
    invoke-static {p0}, Lmk;->l(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p0

    const-string v2, "extFirmware"

    invoke-interface {p0, v2, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    if-eqz p0, :cond_f

    goto :goto_1

    :cond_f
    const-string p0, "oriPage=Page{packageName=\'com.gwm.app.carphone\'"

    invoke-virtual {p1, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_11

    const-string p0, "oriPage=Page{packageName=\'com.gdc.carplay\'"

    invoke-virtual {p1, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_10

    goto :goto_2

    :cond_10
    move v0, v1

    goto :goto_2

    :goto_1
    :pswitch_1
    invoke-virtual {p1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    :cond_11
    :goto_2
    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        0xbe12 -> :sswitch_e
        0xbe35 -> :sswitch_d
        0xbe37 -> :sswitch_c
        0xbe52 -> :sswitch_b
        0xbe56 -> :sswitch_a
        0xbecf -> :sswitch_9
        0xbef2 -> :sswitch_8
        0xbf08 -> :sswitch_7
        0xbf0b -> :sswitch_6
        0xbf0d -> :sswitch_5
        0xc1b5 -> :sswitch_4
        0xc1d4 -> :sswitch_3
        0xc1d6 -> :sswitch_2
        0xc233 -> :sswitch_1
        0xc24d -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public static k(Lru/zinovin/tankspeedometer/service/LogcatService;Ljava/lang/String;)Z
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p0, "oriPage=Page{packageName=\'com.gwm.media.entry\'"

    invoke-virtual {p1, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final l()V
    .locals 4

    :try_start_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    const-string v1, "logcat -c"

    invoke-virtual {v0, v1}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    new-instance v1, LSf;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, LSf;-><init>(Ljava/lang/Object;I)V

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, v2, v3}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final onCreate()V
    .locals 2

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    const-string v0, "T500.SERVICE"

    const-string v1, "LogcatService.onCreate()"

    invoke-static {v0, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/service/LogcatService;->l()V

    return-void
.end method

.method public final onDestroy()V
    .locals 1

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lru/zinovin/tankspeedometer/service/LogcatService;->a:Z

    return-void
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 1

    const/4 p2, 0x1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p3, "T500.SERVICE"

    const-string v0, "ACTION_STOP_SERVICE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "ACTION_START_OR_RESUME_SERVICE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "ACTION_START_SERVICE received"

    invoke-static {p3, p1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const-string p1, "ACTION_STOP_SERVICE received"

    invoke-static {p3, p1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    iput-boolean p2, p0, Lru/zinovin/tankspeedometer/service/LogcatService;->a:Z

    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    :cond_2
    :goto_0
    return p2
.end method
