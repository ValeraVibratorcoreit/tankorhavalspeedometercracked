.class public final synthetic Lhe;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lje;


# direct methods
.method public synthetic constructor <init>(Lje;I)V
    .locals 0

    iput p2, p0, Lhe;->a:I

    iput-object p1, p0, Lhe;->b:Lje;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    iget v0, p0, Lhe;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhe;->b:Lje;

    invoke-virtual {v0}, Lje;->a()V

    return-void

    :pswitch_0
    iget-object v0, p0, Lhe;->b:Lje;

    iget-object v1, v0, Lje;->b:Landroid/os/IBinder;

    const-string v2, "T500.GwmReader"

    if-eqz v1, :cond_0

    iget-object v3, v0, Lje;->c:Lge;

    if-eqz v3, :cond_0

    const-string v3, "transactUnregister error: "

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v5

    :try_start_0
    const-string v6, "com.gwm.android.adapter.IGwmAdapterService"

    invoke-virtual {v4, v6}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    iget-object v6, v0, Lje;->a:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v6, v0, Lje;->c:Lge;

    invoke-virtual {v4, v6}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    const/4 v6, 0x4

    const/4 v7, 0x1

    invoke-interface {v1, v6, v4, v5, v7}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    invoke-virtual {v5}, Landroid/os/Parcel;->recycle()V

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v1

    :try_start_1
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lyr;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :goto_1
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    invoke-virtual {v5}, Landroid/os/Parcel;->recycle()V

    throw v0

    :cond_0
    :goto_2
    iget-object v1, v0, Lje;->h:Lie;

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    iget-object v4, v0, Lje;->b:Landroid/os/IBinder;

    if-eqz v4, :cond_1

    :try_start_2
    invoke-interface {v4, v1, v3}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    :cond_1
    iput-boolean v3, v0, Lje;->d:Z

    iget-object v1, v0, Lje;->g:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    iget-object v1, v0, Lje;->i:Ld2;

    if-eqz v1, :cond_2

    invoke-static {v3}, Ld2;->P(Z)V

    :cond_2
    const/4 v1, 0x0

    iput-object v1, v0, Lje;->b:Landroid/os/IBinder;

    iput-object v1, v0, Lje;->c:Lge;

    iput-object v1, v0, Lje;->h:Lie;

    iget-object v0, v0, Lje;->e:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quitSafely()Z

    const-string v0, "\u041e\u0442\u043a\u043b\u044e\u0447\u0435\u043d\u043e"

    invoke-static {v2, v0}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lhe;->b:Lje;

    iget-boolean v1, v0, Lje;->d:Z

    if-nez v1, :cond_3

    invoke-virtual {v0}, Lje;->a()V

    :cond_3
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
