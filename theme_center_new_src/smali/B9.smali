.class public final synthetic LB9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p4, p0, LB9;->a:I

    iput-object p1, p0, LB9;->b:Ljava/lang/Object;

    iput-object p2, p0, LB9;->c:Ljava/lang/Object;

    iput-object p3, p0, LB9;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    const/4 v0, 0x0

    const/4 v1, 0x1

    iget v2, p0, LB9;->a:I

    packed-switch v2, :pswitch_data_0

    iget-object v0, p0, LB9;->b:Ljava/lang/Object;

    check-cast v0, Lut;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, LB9;->c:Ljava/lang/Object;

    check-cast v2, LPn;

    invoke-virtual {v2}, LPn;->getValue()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, LB9;->d:Ljava/lang/Object;

    check-cast v3, LPn;

    invoke-virtual {v3}, LPn;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    iget-object v4, v0, Lut;->U:Landroid/net/wifi/WifiManager;

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    new-instance v4, Landroid/net/wifi/WifiConfiguration;

    invoke-direct {v4}, Landroid/net/wifi/WifiConfiguration;-><init>()V

    const-string v5, "\""

    invoke-static {v5, v2, v5}, LVo;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v4, Landroid/net/wifi/WifiConfiguration;->SSID:Ljava/lang/String;

    invoke-static {v5, v3, v5}, LVo;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v4, Landroid/net/wifi/WifiConfiguration;->preSharedKey:Ljava/lang/String;

    iget-object v3, v0, Lut;->U:Landroid/net/wifi/WifiManager;

    invoke-virtual {v3, v4}, Landroid/net/wifi/WifiManager;->addNetwork(Landroid/net/wifi/WifiConfiguration;)I

    move-result v3

    iget-object v4, v0, Lut;->U:Landroid/net/wifi/WifiManager;

    invoke-virtual {v4}, Landroid/net/wifi/WifiManager;->disconnect()Z

    iget-object v4, v0, Lut;->U:Landroid/net/wifi/WifiManager;

    invoke-virtual {v4, v3, v1}, Landroid/net/wifi/WifiManager;->enableNetwork(IZ)Z

    iget-object v3, v0, Lut;->U:Landroid/net/wifi/WifiManager;

    invoke-virtual {v3}, Landroid/net/wifi/WifiManager;->reconnect()Z

    invoke-virtual {v0}, Lzc;->I()Landroid/content/Context;

    move-result-object v3

    const v4, 0x7f1301ea

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v4, v2}, Lzc;->m(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_1

    :cond_2
    :goto_0
    invoke-virtual {v0}, Lzc;->I()Landroid/content/Context;

    move-result-object v0

    const v2, 0x7f1301a8

    invoke-static {v0, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :goto_1
    return-void

    :pswitch_0
    iget-object v0, p0, LB9;->b:Ljava/lang/Object;

    check-cast v0, LS3;

    iget-object v1, p0, LB9;->c:Ljava/lang/Object;

    check-cast v1, LUd;

    iget-object v2, p0, LB9;->d:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    iget-object v0, v0, LS3;->b:Landroid/content/Context;

    invoke-static {v0}, LTd;->l(Landroid/content/Context;)Lgc;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v3, v0, Lva;->b:Ljava/lang/Object;

    check-cast v3, Lya;

    check-cast v3, Lfc;

    iget-object v4, v3, Lfc;->d:Ljava/lang/Object;

    monitor-enter v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iput-object v2, v3, Lfc;->f:Ljava/util/concurrent/Executor;

    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-object v0, v0, Lva;->b:Ljava/lang/Object;

    check-cast v0, Lya;

    new-instance v3, LBa;

    invoke-direct {v3, v1, v2}, LBa;-><init>(LUd;Ljava/util/concurrent/ThreadPoolExecutor;)V

    invoke-interface {v0, v3}, Lya;->a(LUd;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_2

    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    throw v0

    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v3, "EmojiCompat font provider not available on this device."

    invoke-direct {v0, v3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_2
    invoke-virtual {v1, v0}, LUd;->X(Ljava/lang/Throwable;)V

    invoke-virtual {v2}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    :goto_3
    return-void

    :pswitch_1
    sget-object v2, Lru/zinovin/tankspeedometer/DownloadActivity;->O:Lmi;

    iget-object v2, p0, LB9;->b:Ljava/lang/Object;

    check-cast v2, Lru/zinovin/tankspeedometer/DownloadActivity;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, p0, LB9;->d:Ljava/lang/Object;

    check-cast v3, Lorg/json/JSONObject;

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "sendDownloadRequest()"

    new-instance v5, LPj;

    invoke-direct {v5}, LPj;-><init>()V

    sget-object v6, Lru/zinovin/tankspeedometer/DownloadActivity;->O:Lmi;

    invoke-static {v6, v3}, Lbb;->a(Lmi;Ljava/lang/String;)Lbb;

    move-result-object v3

    new-instance v6, LH0;

    invoke-direct {v6}, LH0;-><init>()V

    iget-object v7, p0, LB9;->c:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v6, v7}, LH0;->q(Ljava/lang/String;)V

    const-string v7, "POST"

    invoke-virtual {v6, v7, v3}, LH0;->j(Ljava/lang/String;Lbb;)V

    invoke-virtual {v6}, LH0;->a()LT1;

    move-result-object v3

    :try_start_5
    new-instance v6, LDl;

    invoke-direct {v6, v5, v3}, LDl;-><init>(LPj;LT1;)V

    invoke-virtual {v6}, LDl;->c()Ldn;

    move-result-object v3
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    :try_start_6
    invoke-virtual {v3}, Ldn;->w()Z

    move-result v5
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    iget-object v6, v3, Ldn;->g:LJl;

    if-eqz v5, :cond_7

    :try_start_7
    invoke-virtual {v6}, LJl;->x()LP4;

    move-result-object v5

    invoke-interface {v5}, LP4;->v()Ljava/io/InputStream;

    move-result-object v5
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    :try_start_8
    const-string v7, "TankSpeedometer.apk"

    invoke-virtual {v2, v7, v0}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object v7
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    const/16 v8, 0x1000

    :try_start_9
    new-array v8, v8, [B

    invoke-virtual {v6}, LJl;->n()J

    move-result-wide v9

    const-wide/16 v11, 0x0

    :goto_4
    invoke-virtual {v5, v8}, Ljava/io/InputStream;->read([B)I

    move-result v6

    const/4 v13, -0x1

    if-eq v6, v13, :cond_4

    invoke-virtual {v7, v8, v0, v6}, Ljava/io/OutputStream;->write([BII)V

    int-to-long v13, v6

    add-long/2addr v11, v13

    const-wide/16 v13, 0x64

    mul-long/2addr v13, v11

    div-long/2addr v13, v9

    long-to-int v6, v13

    iget-object v13, v2, Lru/zinovin/tankspeedometer/DownloadActivity;->G:Landroid/os/Handler;

    new-instance v14, LF9;

    invoke-direct {v14, v6, v2, v0}, LF9;-><init>(ILjava/lang/Object;I)V

    invoke-virtual {v13, v14}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_4

    :catchall_2
    move-exception v0

    goto :goto_6

    :cond_4
    iget-object v0, v2, Lru/zinovin/tankspeedometer/DownloadActivity;->G:Landroid/os/Handler;

    new-instance v6, Lx9;

    const/4 v8, 0x4

    invoke-direct {v6, v2, v8}, Lx9;-><init>(Lru/zinovin/tankspeedometer/DownloadActivity;I)V

    invoke-virtual {v0, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    if-eqz v7, :cond_5

    :try_start_a
    invoke-virtual {v7}, Ljava/io/OutputStream;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_3

    goto :goto_5

    :catchall_3
    move-exception v0

    goto :goto_8

    :cond_5
    :goto_5
    :try_start_b
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_0
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    goto :goto_b

    :catchall_4
    move-exception v0

    goto :goto_c

    :catch_0
    move-exception v0

    goto :goto_a

    :goto_6
    if-eqz v7, :cond_6

    :try_start_c
    invoke-virtual {v7}, Ljava/io/OutputStream;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    goto :goto_7

    :catchall_5
    move-exception v6

    :try_start_d
    invoke-virtual {v0, v6}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_6
    :goto_7
    throw v0
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    :goto_8
    :try_start_e
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    goto :goto_9

    :catchall_6
    move-exception v5

    :try_start_f
    invoke-virtual {v0, v5}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_9
    throw v0
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_0
    .catchall {:try_start_f .. :try_end_f} :catchall_4

    :goto_a
    :try_start_10
    invoke-virtual {v2, v0, v4}, Lru/zinovin/tankspeedometer/DownloadActivity;->H(Ljava/lang/Exception;Ljava/lang/String;)V

    iget-object v0, v2, Lru/zinovin/tankspeedometer/DownloadActivity;->G:Landroid/os/Handler;

    new-instance v5, Lx9;

    invoke-direct {v5, v2, v1}, Lx9;-><init>(Lru/zinovin/tankspeedometer/DownloadActivity;I)V

    invoke-virtual {v0, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_b

    :cond_7
    invoke-virtual {v6}, LJl;->y()Ljava/lang/String;

    move-result-object v5

    iget-object v6, v2, Lru/zinovin/tankspeedometer/DownloadActivity;->G:Landroid/os/Handler;

    new-instance v7, LE9;

    invoke-direct {v7, v2, v5, v0}, LE9;-><init>(Lru/zinovin/tankspeedometer/DownloadActivity;Ljava/lang/String;I)V

    invoke-virtual {v6, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    :goto_b
    :try_start_11
    invoke-virtual {v3}, Ldn;->close()V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_1

    goto :goto_f

    :catch_1
    move-exception v0

    goto :goto_e

    :goto_c
    :try_start_12
    invoke-virtual {v3}, Ldn;->close()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_7

    goto :goto_d

    :catchall_7
    move-exception v3

    :try_start_13
    invoke-virtual {v0, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_d
    throw v0
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_1

    :goto_e
    invoke-virtual {v2, v0, v4}, Lru/zinovin/tankspeedometer/DownloadActivity;->H(Ljava/lang/Exception;Ljava/lang/String;)V

    iget-object v0, v2, Lru/zinovin/tankspeedometer/DownloadActivity;->G:Landroid/os/Handler;

    new-instance v3, Lx9;

    invoke-direct {v3, v2, v1}, Lx9;-><init>(Lru/zinovin/tankspeedometer/DownloadActivity;I)V

    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_f
    return-void

    :pswitch_2
    iget-object v0, p0, LB9;->b:Ljava/lang/Object;

    check-cast v0, Lru/zinovin/tankspeedometer/DownloadActivity;

    iget-object v1, p0, LB9;->c:Ljava/lang/Object;

    check-cast v1, LP2;

    iget-object v2, p0, LB9;->d:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/CountDownLatch;

    sget-object v3, Lru/zinovin/tankspeedometer/DownloadActivity;->O:Lmi;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v1, LP2;->a:Ljava/lang/String;

    const-string v4, "password"

    invoke-static {v4}, LTf;->H(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "authcode"

    invoke-static {v5}, LTf;->H(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v3, v4, v5}, Lru/zinovin/tankspeedometer/DownloadActivity;->F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    iget-object v4, v0, Lru/zinovin/tankspeedometer/DownloadActivity;->N:Ljava/lang/Object;

    monitor-enter v4

    if-nez v3, :cond_8

    :try_start_14
    iget-object v0, v0, Lru/zinovin/tankspeedometer/DownloadActivity;->M:Ljava/util/ArrayList;

    iget-object v1, v1, LP2;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_10

    :catchall_8
    move-exception v0

    goto :goto_11

    :cond_8
    invoke-virtual {v0}, Lru/zinovin/tankspeedometer/DownloadActivity;->J()Z

    move-result v1

    if-eqz v1, :cond_9

    iget-object v1, v0, Lru/zinovin/tankspeedometer/DownloadActivity;->G:Landroid/os/Handler;

    new-instance v3, Lx9;

    const/4 v5, 0x2

    invoke-direct {v3, v0, v5}, Lx9;-><init>(Lru/zinovin/tankspeedometer/DownloadActivity;I)V

    invoke-virtual {v1, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_9
    :goto_10
    monitor-exit v4
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_8

    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void

    :goto_11
    :try_start_15
    monitor-exit v4
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_8

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
