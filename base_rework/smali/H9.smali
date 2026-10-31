.class public final synthetic LH9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LKf;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, LH9;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LH9;->e:Ljava/lang/Object;

    iput-object p2, p0, LH9;->c:Ljava/lang/Object;

    iput-object p3, p0, LH9;->b:Ljava/lang/String;

    iput-object p4, p0, LH9;->d:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lorg/json/JSONObject;Ljava/lang/String;I)V
    .locals 0

    .line 2
    iput p4, p0, LH9;->a:I

    iput-object p1, p0, LH9;->e:Ljava/lang/Object;

    const-string p1, "https://tankspeedometer.ru:9443/api/v3/cars/download-app"

    iput-object p1, p0, LH9;->b:Ljava/lang/String;

    iput-object p2, p0, LH9;->c:Ljava/lang/Object;

    iput-object p3, p0, LH9;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 20

    move-object/from16 v1, p0

    const-wide/16 v4, 0x64

    const/4 v0, -0x1

    const/16 v8, 0x1000

    const-string v9, "POST"

    const-string v10, "sendDownloadRequest()"

    const-string v11, ""

    const/4 v12, 0x2

    const/4 v13, 0x0

    iget-object v14, v1, LH9;->e:Ljava/lang/Object;

    iget-object v15, v1, LH9;->d:Ljava/lang/String;

    iget-object v6, v1, LH9;->b:Ljava/lang/String;

    iget-object v7, v1, LH9;->c:Ljava/lang/Object;

    const/4 v2, 0x1

    iget v3, v1, LH9;->a:I

    packed-switch v3, :pswitch_data_0

    check-cast v7, Landroid/content/Context;

    check-cast v14, LKf;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "{\u0412\u0430\u0448\u041b\u043e\u0433\u0438\u043d}"

    const-string v3, "yandexmusic://playlist/daily?play=1"

    const-string v4, "Yandex Music uri="

    const-string v5, "Yandex Music user="

    :try_start_0
    invoke-virtual {v7}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v8

    invoke-virtual {v8, v6}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v8
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v9, "T500.ACTIVITY"

    if-eqz v8, :cond_2

    :try_start_1
    const-string v6, "ym"

    invoke-virtual {v15, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    iget-object v6, v14, LKf;->b:Landroid/content/SharedPreferences;

    const-string v8, "ymUser"

    invoke-interface {v6, v8, v11}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iget-object v8, v14, LKf;->b:Landroid/content/SharedPreferences;

    const-string v10, "ymPlayMode"

    invoke-interface {v8, v10, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    iget-object v10, v14, LKf;->b:Landroid/content/SharedPreferences;

    const-string v11, "ymListId"

    const-string v12, "3"

    invoke-interface {v10, v11, v12}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v11

    if-eqz v11, :cond_0

    invoke-virtual {v6}, Ljava/lang/String;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_0

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    invoke-virtual {v8, v0, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "{list_id}"

    invoke-virtual {v0, v3, v10}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v3

    :goto_0
    const-string v0, "android.intent.action.VIEW"

    new-instance v8, Landroid/content/Intent;

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v10

    invoke-direct {v8, v0, v10}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-static {}, Landroid/app/ActivityOptions;->makeBasic()Landroid/app/ActivityOptions;

    move-result-object v0

    invoke-virtual {v0, v13}, Landroid/app/ActivityOptions;->setLaunchDisplayId(I)Landroid/app/ActivityOptions;

    const v3, 0x10000004

    invoke-virtual {v8, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {v0}, Landroid/app/ActivityOptions;->toBundle()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v7, v8, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V

    const-string v0, "ym.auto"

    invoke-virtual {v15, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " is not installed"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "ERROR "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v7, v3, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    const-string v2, "T500.ERROR"

    const-string v3, "ERROR in startMusicPlay()"

    invoke-static {v2, v3, v0}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    return-void

    :pswitch_0
    sget-object v3, LK9;->d0:Lmi;

    check-cast v14, LK9;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v7, Lorg/json/JSONObject;

    invoke-virtual {v7}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v7, LPj;

    invoke-direct {v7}, LPj;-><init>()V

    sget-object v2, LK9;->d0:Lmi;

    invoke-static {v2, v3}, Lbb;->a(Lmi;Ljava/lang/String;)Lbb;

    move-result-object v2

    new-instance v3, LH0;

    invoke-direct {v3}, LH0;-><init>()V

    invoke-virtual {v3, v6}, LH0;->q(Ljava/lang/String;)V

    invoke-virtual {v3, v9, v2}, LH0;->j(Ljava/lang/String;Lbb;)V

    invoke-virtual {v3}, LH0;->a()LT1;

    move-result-object v2

    :try_start_2
    new-instance v3, LDl;

    invoke-direct {v3, v7, v2}, LDl;-><init>(LPj;LT1;)V

    invoke-virtual {v3}, LDl;->c()Ldn;

    move-result-object v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    :try_start_3
    invoke-virtual {v2}, Ldn;->w()Z

    move-result v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    iget-object v6, v2, Ldn;->g:LJl;

    if-eqz v3, :cond_6

    :try_start_4
    invoke-virtual {v6}, LJl;->x()LP4;

    move-result-object v3

    invoke-interface {v3}, LP4;->v()Ljava/io/InputStream;

    move-result-object v3
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :try_start_5
    iget-object v7, v14, LK9;->c0:Landroid/content/Context;

    invoke-virtual {v7, v15, v13}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object v7
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :try_start_6
    new-array v8, v8, [B

    invoke-virtual {v6}, LJl;->n()J

    move-result-wide v18

    const-wide/16 v16, 0x0

    :goto_3
    invoke-virtual {v3, v8}, Ljava/io/InputStream;->read([B)I

    move-result v6

    if-eq v6, v0, :cond_3

    invoke-virtual {v7, v8, v13, v6}, Ljava/io/OutputStream;->write([BII)V

    int-to-long v0, v6

    add-long v16, v16, v0

    mul-long v0, v16, v4

    div-long v0, v0, v18

    long-to-int v0, v0

    new-instance v1, LF9;

    invoke-direct {v1, v0, v14, v12}, LF9;-><init>(ILjava/lang/Object;I)V

    invoke-virtual {v14, v1}, LK9;->Q(Ljava/lang/Runnable;)V

    move-object/from16 v1, p0

    const/4 v0, -0x1

    goto :goto_3

    :goto_4
    move-object v1, v0

    goto :goto_6

    :catchall_0
    move-exception v0

    goto :goto_4

    :cond_3
    new-instance v0, LJ9;

    const/4 v1, 0x1

    invoke-direct {v0, v14, v15, v1}, LJ9;-><init>(LK9;Ljava/lang/String;I)V

    invoke-virtual {v14, v0}, LK9;->Q(Ljava/lang/Runnable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    if-eqz v7, :cond_4

    :try_start_7
    invoke-virtual {v7}, Ljava/io/OutputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_5

    :catchall_1
    move-exception v0

    move-object v1, v0

    goto :goto_8

    :cond_4
    :goto_5
    :try_start_8
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    goto :goto_d

    :catchall_2
    move-exception v0

    move-object v1, v0

    goto :goto_e

    :catch_1
    move-exception v0

    goto :goto_a

    :goto_6
    if-eqz v7, :cond_5

    :try_start_9
    invoke-virtual {v7}, Ljava/io/OutputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_7

    :catchall_3
    move-exception v0

    move-object v4, v0

    :try_start_a
    invoke-virtual {v1, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_5
    :goto_7
    throw v1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    :goto_8
    :try_start_b
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    goto :goto_9

    :catchall_4
    move-exception v0

    move-object v3, v0

    :try_start_c
    invoke-virtual {v1, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_9
    throw v1
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_1
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    :goto_a
    :try_start_d
    invoke-virtual {v14, v0, v10}, LK9;->P(Ljava/lang/Exception;Ljava/lang/String;)V

    new-instance v0, Lt5;

    const/4 v1, 0x5

    invoke-direct {v0, v14, v1}, Lt5;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v14, v0}, LK9;->Q(Ljava/lang/Runnable;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    goto :goto_d

    :cond_6
    if-eqz v6, :cond_7

    :try_start_e
    invoke-virtual {v6}, LJl;->y()Ljava/lang/String;

    move-result-object v11

    goto :goto_b

    :catch_2
    move-exception v0

    goto :goto_c

    :cond_7
    :goto_b
    new-instance v0, LJ9;

    invoke-direct {v0, v14, v11, v12}, LJ9;-><init>(LK9;Ljava/lang/String;I)V

    invoke-virtual {v14, v0}, LK9;->Q(Ljava/lang/Runnable;)V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_2
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    goto :goto_d

    :goto_c
    :try_start_f
    const-string v1, "processErrorResponse()"

    invoke-virtual {v14, v0, v1}, LK9;->P(Ljava/lang/Exception;Ljava/lang/String;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    :goto_d
    :try_start_10
    invoke-virtual {v2}, Ldn;->close()V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_3

    goto :goto_11

    :catch_3
    move-exception v0

    goto :goto_10

    :goto_e
    :try_start_11
    invoke-virtual {v2}, Ldn;->close()V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_5

    goto :goto_f

    :catchall_5
    move-exception v0

    move-object v2, v0

    :try_start_12
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_f
    throw v1
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_3

    :goto_10
    invoke-virtual {v14, v0, v10}, LK9;->P(Ljava/lang/Exception;Ljava/lang/String;)V

    new-instance v0, Lt5;

    const/4 v1, 0x5

    invoke-direct {v0, v14, v1}, Lt5;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v14, v0}, LK9;->Q(Ljava/lang/Runnable;)V

    :goto_11
    return-void

    :pswitch_1
    sget-object v0, Lru/zinovin/tankspeedometer/DownloadActivity2;->G:Lmi;

    check-cast v14, Lru/zinovin/tankspeedometer/DownloadActivity2;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v7, Lorg/json/JSONObject;

    invoke-virtual {v7}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, LPj;

    invoke-direct {v1}, LPj;-><init>()V

    sget-object v2, Lru/zinovin/tankspeedometer/DownloadActivity2;->G:Lmi;

    invoke-static {v2, v0}, Lbb;->a(Lmi;Ljava/lang/String;)Lbb;

    move-result-object v0

    new-instance v2, LH0;

    invoke-direct {v2}, LH0;-><init>()V

    invoke-virtual {v2, v6}, LH0;->q(Ljava/lang/String;)V

    invoke-virtual {v2, v9, v0}, LH0;->j(Ljava/lang/String;Lbb;)V

    invoke-virtual {v2}, LH0;->a()LT1;

    move-result-object v0

    :try_start_13
    new-instance v2, LDl;

    invoke-direct {v2, v1, v0}, LDl;-><init>(LPj;LT1;)V

    invoke-virtual {v2}, LDl;->c()Ldn;

    move-result-object v1
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_5

    :try_start_14
    invoke-virtual {v1}, Ldn;->w()Z

    move-result v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_8

    iget-object v2, v1, Ldn;->g:LJl;

    if-eqz v0, :cond_b

    :try_start_15
    invoke-virtual {v2}, LJl;->x()LP4;

    move-result-object v0

    invoke-interface {v0}, LP4;->v()Ljava/io/InputStream;

    move-result-object v3
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_15 .. :try_end_15} :catch_4
    .catchall {:try_start_15 .. :try_end_15} :catchall_8

    :try_start_16
    invoke-virtual {v14, v15, v13}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object v6
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_7

    :try_start_17
    new-array v0, v8, [B

    invoke-virtual {v2}, LJl;->n()J

    move-result-wide v7

    const-wide/16 v16, 0x0

    :goto_12
    invoke-virtual {v3, v0}, Ljava/io/InputStream;->read([B)I

    move-result v2

    const/4 v9, -0x1

    if-eq v2, v9, :cond_8

    invoke-virtual {v6, v0, v13, v2}, Ljava/io/OutputStream;->write([BII)V

    int-to-long v11, v2

    add-long v16, v16, v11

    mul-long v11, v16, v4

    div-long/2addr v11, v7

    long-to-int v2, v11

    iget-object v11, v14, Lru/zinovin/tankspeedometer/DownloadActivity2;->E:Landroid/os/Handler;

    new-instance v12, LF9;

    const/4 v4, 0x1

    invoke-direct {v12, v2, v14, v4}, LF9;-><init>(ILjava/lang/Object;I)V

    invoke-virtual {v11, v12}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    const-wide/16 v4, 0x64

    goto :goto_12

    :goto_13
    move-object v2, v0

    goto :goto_15

    :catchall_6
    move-exception v0

    goto :goto_13

    :cond_8
    iget-object v0, v14, Lru/zinovin/tankspeedometer/DownloadActivity2;->E:Landroid/os/Handler;

    new-instance v2, LI9;

    const/4 v4, 0x1

    invoke-direct {v2, v14, v15, v4}, LI9;-><init>(Lru/zinovin/tankspeedometer/DownloadActivity2;Ljava/lang/String;I)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_6

    if-eqz v6, :cond_9

    :try_start_18
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_7

    goto :goto_14

    :catchall_7
    move-exception v0

    move-object v2, v0

    goto :goto_17

    :cond_9
    :goto_14
    :try_start_19
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_4
    .catchall {:try_start_19 .. :try_end_19} :catchall_8

    goto :goto_1a

    :catchall_8
    move-exception v0

    move-object v2, v0

    goto :goto_1b

    :catch_4
    move-exception v0

    goto :goto_19

    :goto_15
    if-eqz v6, :cond_a

    :try_start_1a
    invoke-virtual {v6}, Ljava/io/OutputStream;->close()V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_9

    goto :goto_16

    :catchall_9
    move-exception v0

    move-object v4, v0

    :try_start_1b
    invoke-virtual {v2, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_a
    :goto_16
    throw v2
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_7

    :goto_17
    :try_start_1c
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_a

    goto :goto_18

    :catchall_a
    move-exception v0

    move-object v3, v0

    :try_start_1d
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_18
    throw v2
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_1d} :catch_4
    .catchall {:try_start_1d .. :try_end_1d} :catchall_8

    :goto_19
    :try_start_1e
    invoke-virtual {v14, v0, v10}, Lru/zinovin/tankspeedometer/DownloadActivity2;->F(Ljava/lang/Exception;Ljava/lang/String;)V

    iget-object v0, v14, Lru/zinovin/tankspeedometer/DownloadActivity2;->E:Landroid/os/Handler;

    new-instance v2, Lt5;

    const/4 v3, 0x4

    invoke-direct {v2, v14, v3}, Lt5;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_1a

    :cond_b
    invoke-virtual {v2}, LJl;->y()Ljava/lang/String;

    move-result-object v0

    iget-object v2, v14, Lru/zinovin/tankspeedometer/DownloadActivity2;->E:Landroid/os/Handler;

    new-instance v3, LI9;

    invoke-direct {v3, v14, v0, v12}, LI9;-><init>(Lru/zinovin/tankspeedometer/DownloadActivity2;Ljava/lang/String;I)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_8

    :goto_1a
    :try_start_1f
    invoke-virtual {v1}, Ldn;->close()V
    :try_end_1f
    .catch Ljava/lang/Exception; {:try_start_1f .. :try_end_1f} :catch_5

    goto :goto_1e

    :catch_5
    move-exception v0

    goto :goto_1d

    :goto_1b
    :try_start_20
    invoke-virtual {v1}, Ldn;->close()V
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_b

    goto :goto_1c

    :catchall_b
    move-exception v0

    move-object v1, v0

    :try_start_21
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1c
    throw v2
    :try_end_21
    .catch Ljava/lang/Exception; {:try_start_21 .. :try_end_21} :catch_5

    :goto_1d
    invoke-virtual {v14, v0, v10}, Lru/zinovin/tankspeedometer/DownloadActivity2;->F(Ljava/lang/Exception;Ljava/lang/String;)V

    iget-object v0, v14, Lru/zinovin/tankspeedometer/DownloadActivity2;->E:Landroid/os/Handler;

    new-instance v1, Lt5;

    const/4 v2, 0x4

    invoke-direct {v1, v14, v2}, Lt5;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_1e
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
