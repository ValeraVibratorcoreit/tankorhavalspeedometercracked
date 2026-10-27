.class public final synthetic LB1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LE3;[Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    const/4 p2, 0x2

    iput p2, p0, LB1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB1;->b:Ljava/lang/Object;

    iput-object p3, p0, LB1;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 2
    iput p2, p0, LB1;->a:I

    iput-object p1, p0, LB1;->b:Ljava/lang/Object;

    iput-object p3, p0, LB1;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 28

    move-object/from16 v1, p0

    const/4 v2, 0x0

    const-string v3, "POST"

    const-string v4, "lang"

    const-string v5, "digits"

    const-string v6, ""

    const-string v7, "token"

    const-string v8, "persist.gwm.vehicle.vin"

    const-string v9, "vin"

    const-string v10, "password"

    const/4 v11, 0x0

    const/4 v12, 0x1

    iget-object v13, v1, LB1;->c:Ljava/lang/Object;

    iget-object v0, v1, LB1;->b:Ljava/lang/Object;

    iget v14, v1, LB1;->a:I

    packed-switch v14, :pswitch_data_0

    check-cast v0, LBr;

    check-cast v13, Landroid/graphics/Typeface;

    invoke-virtual {v0, v13}, LBr;->P(Landroid/graphics/Typeface;)V

    return-void

    :pswitch_0
    check-cast v0, Landroidx/profileinstaller/ProfileInstallerInitializer;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {v0}, Lel;->a(Landroid/os/Looper;)Landroid/os/Handler;

    move-result-object v0

    new-instance v2, Ljava/util/Random;

    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    const/16 v3, 0x3e8

    invoke-static {v3, v12}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/util/Random;->nextInt(I)I

    move-result v2

    new-instance v3, Ly1;

    check-cast v13, Landroid/content/Context;

    invoke-direct {v3, v13, v12}, Ly1;-><init>(Landroid/content/Context;I)V

    add-int/lit16 v2, v2, 0x1388

    int-to-long v4, v2

    invoke-virtual {v0, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :pswitch_1
    sget-object v2, LK9;->d0:Lmi;

    check-cast v0, LK9;

    invoke-virtual {v0}, Lzc;->p()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Lzc;->h()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    check-cast v13, Ljava/lang/Runnable;

    invoke-interface {v13}, Ljava/lang/Runnable;->run()V

    :cond_1
    :goto_0
    return-void

    :pswitch_2
    check-cast v13, Ljava/util/concurrent/atomic/AtomicBoolean;

    sget-object v2, Lru/zinovin/tankspeedometer/DownloadActivity;->O:Lmi;

    move-object v2, v0

    check-cast v2, Lru/zinovin/tankspeedometer/DownloadActivity;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v12, "isCarValid()"

    new-instance v14, Lorg/json/JSONObject;

    invoke-direct {v14}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    invoke-static {v2, v8}, LTf;->F(Landroid/app/Activity;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v9, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {v10}, LTf;->H(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v10, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v14, v7, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "verification"

    const-string v6, "true"

    invoke-virtual {v14, v0, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {v2}, Lru/zinovin/jni/JniUtils;->getData(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v5, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v2}, Lq1;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget-object v0, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    invoke-virtual {v2, v0, v12}, Lru/zinovin/tankspeedometer/DownloadActivity;->H(Ljava/lang/Exception;Ljava/lang/String;)V

    :goto_1
    sget-object v0, Lru/zinovin/tankspeedometer/DownloadActivity;->O:Lmi;

    invoke-virtual {v14}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lbb;->a(Lmi;Ljava/lang/String;)Lbb;

    move-result-object v0

    new-instance v4, LPj;

    invoke-direct {v4}, LPj;-><init>()V

    new-instance v5, LH0;

    invoke-direct {v5}, LH0;-><init>()V

    const-string v6, "https://tankspeedometer.ru:9443/api/v2/cars/check-update"

    invoke-virtual {v5, v6}, LH0;->q(Ljava/lang/String;)V

    invoke-virtual {v5, v3, v0}, LH0;->j(Ljava/lang/String;Lbb;)V

    invoke-virtual {v5}, LH0;->a()LT1;

    move-result-object v0

    :try_start_1
    new-instance v3, LDl;

    invoke-direct {v3, v4, v0}, LDl;-><init>(LPj;LT1;)V

    invoke-virtual {v3}, LDl;->c()Ldn;

    move-result-object v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    invoke-virtual {v3}, Ldn;->w()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, v3, Ldn;->g:LJl;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LJl;->y()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v0, "init_date"

    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v4, v2, Lru/zinovin/tankspeedometer/DownloadActivity;->G:Landroid/os/Handler;

    new-instance v5, Lz9;

    invoke-direct {v5, v0, v11}, Lz9;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v4, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object v4, v0

    goto :goto_3

    :cond_2
    :goto_2
    invoke-virtual {v3}, Ldn;->w()Z

    move-result v0

    invoke-virtual {v13, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_3
    :try_start_3
    invoke-virtual {v3}, Ldn;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_6

    :catch_1
    move-exception v0

    goto :goto_5

    :goto_3
    :try_start_4
    invoke-virtual {v3}, Ldn;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object v3, v0

    :try_start_5
    invoke-virtual {v4, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v4
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    :goto_5
    invoke-virtual {v2, v0, v12}, Lru/zinovin/tankspeedometer/DownloadActivity;->H(Ljava/lang/Exception;Ljava/lang/String;)V

    :goto_6
    return-void

    :pswitch_3
    check-cast v0, LP6;

    const-string v2, "this$0"

    invoke-static {v2, v0}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v13, Lak;

    const-string v2, "$dispatcher"

    invoke-static {v2, v13}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    sget v2, LP6;->r:I

    new-instance v2, LI6;

    invoke-direct {v2, v13, v0}, LI6;-><init>(Lak;LP6;)V

    iget-object v0, v0, LP6;->a:LFg;

    invoke-virtual {v0, v2}, LFg;->a(LCg;)V

    return-void

    :pswitch_4
    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    check-cast v13, Ljava/lang/String;

    invoke-static {v0, v13, v12}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void

    :pswitch_5
    new-instance v3, LQ0;

    check-cast v0, LQ3;

    invoke-virtual {v0}, Lzc;->I()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4}, LQ0;-><init>(Landroid/content/Context;)V

    const v4, 0x7f1301fd

    invoke-virtual {v3, v4}, LQ0;->f(I)LQ0;

    check-cast v13, Ljava/io/File;

    invoke-virtual {v13}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    const v5, 0x7f1301fc

    invoke-virtual {v0, v5, v4}, Lzc;->m(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v4, v3, LQ0;->b:Ljava/lang/Object;

    check-cast v4, LM0;

    iput-object v0, v4, LM0;->f:Ljava/lang/CharSequence;

    const v0, 0x7f1301c4

    invoke-virtual {v3, v0, v2}, LQ0;->e(ILandroid/content/DialogInterface$OnClickListener;)LQ0;

    invoke-virtual {v3}, LQ0;->g()V

    return-void

    :pswitch_6
    check-cast v13, Landroid/net/Uri;

    move-object v2, v0

    check-cast v2, LQ3;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_6
    iget-object v0, v2, LQ3;->U:LS3;

    invoke-virtual {v0, v13}, LS3;->n(Landroid/net/Uri;)Z

    move-result v0

    if-nez v0, :cond_4

    new-instance v0, LO3;

    const/4 v3, 0x2

    invoke-direct {v0, v2, v3}, LO3;-><init>(LQ3;I)V

    invoke-virtual {v2, v0}, LQ3;->c0(Ljava/lang/Runnable;)V

    goto :goto_8

    :catch_2
    move-exception v0

    goto :goto_7

    :cond_4
    iget-object v0, v2, LQ3;->U:LS3;

    invoke-virtual {v0, v13}, LS3;->r(Landroid/net/Uri;)V

    new-instance v0, LO3;

    const/4 v3, 0x3

    invoke-direct {v0, v2, v3}, LO3;-><init>(LQ3;I)V

    invoke-virtual {v2, v0}, LQ3;->c0(Ljava/lang/Runnable;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    goto :goto_8

    :goto_7
    const-string v3, "T500.Backup"

    const-string v4, "Restore from URI failed"

    invoke-static {v3, v4, v0}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v3, LP3;

    invoke-direct {v3, v2, v0, v11}, LP3;-><init>(LQ3;Ljava/lang/Exception;I)V

    invoke-virtual {v2, v3}, LQ3;->c0(Ljava/lang/Runnable;)V

    :goto_8
    return-void

    :pswitch_7
    sget-object v14, LUd;->a:[Ljava/lang/String;

    const-string v15, " "

    move-object v12, v0

    check-cast v12, LE3;

    invoke-virtual {v12}, Lzc;->I()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v11

    const/4 v1, 0x1

    const/4 v2, 0x0

    :goto_9
    const/4 v0, 0x4

    if-ge v2, v0, :cond_8

    aget-object v0, v14, v2

    move-object/from16 v17, v6

    const-string v6, "image_"

    move-object/from16 v18, v14

    const-string v14, ".png"

    invoke-static {v6, v0, v14}, LVo;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    move/from16 v19, v1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v20, v2

    move-object v2, v13

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v21, v13

    const-string v13, "_"

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v13, Ljava/io/File;

    invoke-direct {v13, v11, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v12}, Lzc;->I()Landroid/content/Context;

    move-result-object v14

    sget-object v22, LOm;->a:Lmi;

    move-object/from16 v22, v11

    const-string v11, "T500.ResourceDL"

    move-object/from16 v23, v15

    const-string v15, "Server answer: "

    move-object/from16 v24, v15

    :try_start_7
    new-instance v15, Lorg/json/JSONObject;

    invoke-direct {v15}, Lorg/json/JSONObject;-><init>()V

    move-object/from16 v25, v2

    move-object/from16 v16, v6

    const/4 v2, 0x0

    invoke-static {v2, v8}, LTf;->F(Landroid/app/Activity;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v15, v9, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v6, "version"

    invoke-static {}, LTf;->x()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v15, v6, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {v10}, LTf;->H(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v15, v10, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "authcode"

    invoke-static {v2}, LTf;->H(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v15, v7, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "resource"

    invoke-virtual {v15, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {v14}, Lru/zinovin/jni/JniUtils;->getData(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v15, v5, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v15, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v15}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v6, LOj;

    invoke-direct {v6}, LOj;-><init>()V

    sget-object v14, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-string v15, "unit"

    invoke-static {v15, v14}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_8

    move-object/from16 v26, v4

    move-object v15, v5

    const-wide/16 v4, 0x1e

    move-object/from16 v27, v7

    :try_start_8
    invoke-static {v4, v5, v14}, LRr;->b(JLjava/util/concurrent/TimeUnit;)I

    move-result v7

    iput v7, v6, LOj;->r:I

    invoke-static {v4, v5, v14}, LRr;->b(JLjava/util/concurrent/TimeUnit;)I

    move-result v4

    iput v4, v6, LOj;->s:I

    new-instance v4, LPj;

    invoke-direct {v4, v6}, LPj;-><init>(LOj;)V

    sget-object v5, LOm;->a:Lmi;

    invoke-static {v5, v2}, Lbb;->a(Lmi;Ljava/lang/String;)Lbb;

    move-result-object v2

    new-instance v5, LH0;

    invoke-direct {v5}, LH0;-><init>()V

    const-string v6, "https://tankspeedometer.ru:9443/api/v3/cars/resource"

    invoke-virtual {v5, v6}, LH0;->q(Ljava/lang/String;)V

    invoke-virtual {v5, v3, v2}, LH0;->j(Ljava/lang/String;Lbb;)V

    invoke-virtual {v5}, LH0;->a()LT1;

    move-result-object v2

    new-instance v5, LDl;

    invoke-direct {v5, v4, v2}, LDl;-><init>(LPj;LT1;)V

    invoke-virtual {v5}, LDl;->c()Ldn;

    move-result-object v2
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_6

    :try_start_9
    invoke-virtual {v2}, Ldn;->w()Z

    move-result v4
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    iget-object v5, v2, Ldn;->g:LJl;

    if-eqz v4, :cond_6

    :try_start_a
    invoke-virtual {v5}, LJl;->x()LP4;

    move-result-object v4

    invoke-interface {v4}, LP4;->v()Ljava/io/InputStream;

    move-result-object v4
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    :try_start_b
    new-instance v5, Ljava/io/FileOutputStream;

    invoke-direct {v5, v13}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    const/16 v6, 0x2000

    :try_start_c
    new-array v6, v6, [B

    :goto_a
    invoke-virtual {v4, v6}, Ljava/io/InputStream;->read([B)I

    move-result v7
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    const/4 v14, -0x1

    if-eq v7, v14, :cond_5

    const/4 v14, 0x0

    :try_start_d
    invoke-virtual {v5, v6, v14, v7}, Ljava/io/OutputStream;->write([BII)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    goto :goto_a

    :catchall_2
    move-exception v0

    move-object v13, v0

    move-object/from16 v7, v22

    move-object/from16 v6, v23

    goto/16 :goto_11

    :cond_5
    :try_start_e
    invoke-virtual {v5}, Ljava/io/OutputStream;->close()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    :try_start_f
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " was downloaded to "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v11, v4}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    :try_start_10
    invoke-virtual {v2}, Ldn;->close()V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_6

    invoke-virtual {v12}, Lc4;->T()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "bg_time_"

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "_img"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v4, v16

    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    :try_start_11
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "shortDesc"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v13, v25

    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_5

    move-object/from16 v6, v23

    :try_start_12
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "longDesc"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "imageFileName"

    invoke-virtual {v1, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "protected"

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    invoke-static {v4}, LUd;->u(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/io/FileOutputStream;

    new-instance v5, Ljava/io/File;
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_4

    move-object/from16 v7, v22

    :try_start_13
    invoke-direct {v5, v7, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-direct {v2, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/FileOutputStream;->write([B)V

    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_3

    goto :goto_c

    :catch_3
    move-exception v0

    goto :goto_b

    :catch_4
    move-exception v0

    move-object/from16 v7, v22

    goto :goto_b

    :catch_5
    move-exception v0

    move-object/from16 v7, v22

    move-object/from16 v6, v23

    :goto_b
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Error saving JSON for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "T500.Images"

    invoke-static {v2, v1, v0}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_c
    move/from16 v1, v19

    :goto_d
    const/4 v2, 0x1

    goto/16 :goto_1a

    :catch_6
    move-exception v0

    :goto_e
    move-object/from16 v7, v22

    move-object/from16 v6, v23

    goto/16 :goto_18

    :catchall_3
    move-exception v0

    move-object/from16 v7, v22

    move-object/from16 v6, v23

    :goto_f
    move-object v4, v0

    goto :goto_16

    :catchall_4
    move-exception v0

    move-object/from16 v7, v22

    move-object/from16 v6, v23

    :goto_10
    move-object v5, v0

    goto :goto_13

    :catchall_5
    move-exception v0

    move-object/from16 v7, v22

    move-object/from16 v6, v23

    move-object v13, v0

    :goto_11
    :try_start_14
    invoke-virtual {v5}, Ljava/io/OutputStream;->close()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_6

    goto :goto_12

    :catchall_6
    move-exception v0

    move-object v5, v0

    :try_start_15
    invoke-virtual {v13, v5}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_12
    throw v13
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_7

    :catchall_7
    move-exception v0

    goto :goto_10

    :goto_13
    :try_start_16
    invoke-virtual {v4}, Ljava/io/InputStream;->close()V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_8

    goto :goto_14

    :catchall_8
    move-exception v0

    move-object v4, v0

    :try_start_17
    invoke-virtual {v5, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_14
    throw v5

    :catchall_9
    move-exception v0

    goto :goto_f

    :cond_6
    move-object/from16 v7, v22

    move-object/from16 v6, v23

    if-eqz v5, :cond_7

    invoke-virtual {v5}, LJl;->y()Ljava/lang/String;

    move-result-object v0

    goto :goto_15

    :cond_7
    move-object/from16 v0, v17

    :goto_15
    new-instance v4, Ljava/lang/StringBuilder;

    move-object/from16 v5, v24

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v11, v0}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_9

    :try_start_18
    invoke-virtual {v2}, Ldn;->close()V
    :try_end_18
    .catch Ljava/lang/Exception; {:try_start_18 .. :try_end_18} :catch_7

    goto :goto_19

    :catch_7
    move-exception v0

    goto :goto_18

    :goto_16
    :try_start_19
    invoke-virtual {v2}, Ldn;->close()V
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_a

    goto :goto_17

    :catchall_a
    move-exception v0

    move-object v2, v0

    :try_start_1a
    invoke-virtual {v4, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_17
    throw v4
    :try_end_1a
    .catch Ljava/lang/Exception; {:try_start_1a .. :try_end_1a} :catch_7

    :catch_8
    move-exception v0

    move-object/from16 v26, v4

    move-object v15, v5

    move-object/from16 v27, v7

    goto :goto_e

    :goto_18
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Error downloading to file: "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v11, v1, v0}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_19
    const/4 v1, 0x0

    goto :goto_d

    :goto_1a
    add-int/lit8 v0, v20, 0x1

    move v2, v0

    move-object v11, v7

    move-object v5, v15

    move-object/from16 v14, v18

    move-object/from16 v13, v21

    move-object/from16 v4, v26

    move-object/from16 v7, v27

    move-object v15, v6

    move-object/from16 v6, v17

    goto/16 :goto_9

    :cond_8
    move/from16 v19, v1

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, LF0;

    move/from16 v2, v19

    invoke-direct {v1, v12, v2}, LF0;-><init>(LE3;Z)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :pswitch_8
    move-object/from16 v21, v13

    check-cast v0, LE3;

    invoke-virtual {v0}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0}, Lc4;->T()Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-static {v1, v2}, LF4;->x(Landroid/content/Context;Landroid/content/SharedPreferences;)Z

    move-result v1

    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v3, Ly3;

    move-object/from16 v13, v21

    check-cast v13, Landroid/widget/Button;

    const/4 v4, 0x0

    invoke-direct {v3, v4, v0, v13, v1}, Ly3;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :pswitch_9
    move-object/from16 v21, v13

    move-object/from16 v13, v21

    check-cast v13, Ljava/lang/Runnable;

    move-object v1, v0

    check-cast v1, LC1;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_1b
    invoke-interface {v13}, Ljava/lang/Runnable;->run()V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_b

    invoke-virtual {v1}, LC1;->a()V

    return-void

    :catchall_b
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1}, LC1;->a()V

    throw v2

    :pswitch_data_0
    .packed-switch 0x0
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
