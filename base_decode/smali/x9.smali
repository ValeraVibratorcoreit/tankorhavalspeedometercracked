.class public final synthetic Lx9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lru/zinovin/tankspeedometer/DownloadActivity;


# direct methods
.method public synthetic constructor <init>(Lru/zinovin/tankspeedometer/DownloadActivity;I)V
    .locals 0

    iput p2, p0, Lx9;->a:I

    iput-object p1, p0, Lx9;->b:Lru/zinovin/tankspeedometer/DownloadActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    const/4 v0, 0x0

    const v1, 0x7f1301a2

    const/4 v2, 0x1

    iget v3, p0, Lx9;->a:I

    packed-switch v3, :pswitch_data_0

    sget-object v0, Lru/zinovin/tankspeedometer/DownloadActivity;->O:Lmi;

    iget-object v0, p0, Lx9;->b:Lru/zinovin/tankspeedometer/DownloadActivity;

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lru/zinovin/tankspeedometer/DownloadActivity;->P(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void

    :pswitch_0
    iget-object v0, p0, Lx9;->b:Lru/zinovin/tankspeedometer/DownloadActivity;

    iget-object v1, v0, Lru/zinovin/tankspeedometer/DownloadActivity;->N:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, v0, Lru/zinovin/tankspeedometer/DownloadActivity;->M:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lru/zinovin/tankspeedometer/DownloadActivity;->M()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Lru/zinovin/tankspeedometer/DownloadActivity;->E()V

    :goto_0
    monitor-exit v1

    return-void

    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :pswitch_1
    sget-object v0, Lru/zinovin/tankspeedometer/DownloadActivity;->O:Lmi;

    const v0, 0x7f1301a6

    iget-object v1, p0, Lx9;->b:Lru/zinovin/tankspeedometer/DownloadActivity;

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lru/zinovin/tankspeedometer/DownloadActivity;->P(Ljava/lang/String;)V

    invoke-virtual {v1}, Lru/zinovin/tankspeedometer/DownloadActivity;->N()V

    return-void

    :pswitch_2
    sget-object v1, Lru/zinovin/tankspeedometer/DownloadActivity;->O:Lmi;

    iget-object v1, p0, Lx9;->b:Lru/zinovin/tankspeedometer/DownloadActivity;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "T500.DOWNLOADER"

    const-string v4, "TankSpeedometer.apk was downloaded"

    invoke-static {v3, v4}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, v1, Lru/zinovin/tankspeedometer/DownloadActivity;->G:Landroid/os/Handler;

    new-instance v4, LF9;

    invoke-direct {v4, v0, v1, v0}, LF9;-><init>(ILjava/lang/Object;I)V

    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    invoke-virtual {v1}, Lru/zinovin/tankspeedometer/DownloadActivity;->G()V

    :try_start_1
    new-instance v3, Ljava/io/File;

    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v4

    const-string v5, "TankSpeedometer.apk"

    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ".fileprovider"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4, v3}, Landroidx/core/content/FileProvider;->d(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v3

    new-instance v4, Landroid/content/Intent;

    const-string v5, "android.intent.action.VIEW"

    invoke-direct {v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v5, "application/vnd.android.package-archive"

    invoke-virtual {v4, v3, v5}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    const/high16 v3, 0x10000000

    invoke-virtual {v4, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    invoke-virtual {v4, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {v4, v2}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object v2

    if-eqz v2, :cond_3

    iget-object v2, v1, Lru/zinovin/tankspeedometer/DownloadActivity;->E:Landroid/widget/CheckBox;

    invoke-virtual {v2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, v1, Lru/zinovin/tankspeedometer/DownloadActivity;->H:Ljava/lang/String;

    const-string v3, "DEMO"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_3

    :cond_1
    :goto_2
    const-string v2, "0.0.0"

    const-string v3, "VERSION"

    invoke-static {v3, v2}, LTf;->W(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    const-string v2, "SHOW_ABOUT"

    const-string v3, "true"

    invoke-static {v2, v3}, LTf;->W(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "MICROMODE"

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lmk;->l(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v3

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v3

    invoke-interface {v3, v2, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->apply()V

    const v0, 0x7f1301ad

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lru/zinovin/tankspeedometer/DownloadActivity;->P(Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    goto :goto_4

    :cond_3
    const v0, 0x7f1301c0

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lru/zinovin/tankspeedometer/DownloadActivity;->P(Ljava/lang/String;)V

    goto :goto_4

    :cond_4
    const v0, 0x7f1301bf

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lru/zinovin/tankspeedometer/DownloadActivity;->P(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_4

    :goto_3
    const-string v2, "installApk()"

    invoke-virtual {v1, v0, v2}, Lru/zinovin/tankspeedometer/DownloadActivity;->H(Ljava/lang/Exception;Ljava/lang/String;)V

    :goto_4
    return-void

    :pswitch_3
    sget-object v0, Lru/zinovin/tankspeedometer/DownloadActivity;->O:Lmi;

    iget-object v0, p0, Lx9;->b:Lru/zinovin/tankspeedometer/DownloadActivity;

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lru/zinovin/tankspeedometer/DownloadActivity;->P(Ljava/lang/String;)V

    return-void

    :pswitch_4
    iget-object v0, p0, Lx9;->b:Lru/zinovin/tankspeedometer/DownloadActivity;

    iget v1, v0, Lru/zinovin/tankspeedometer/DownloadActivity;->L:I

    add-int/2addr v1, v2

    iput v1, v0, Lru/zinovin/tankspeedometer/DownloadActivity;->L:I

    invoke-virtual {v0}, Lru/zinovin/tankspeedometer/DownloadActivity;->Q()V

    return-void

    :pswitch_5
    sget-object v0, Lru/zinovin/tankspeedometer/DownloadActivity;->O:Lmi;

    iget-object v0, p0, Lx9;->b:Lru/zinovin/tankspeedometer/DownloadActivity;

    invoke-virtual {v0}, Lru/zinovin/tankspeedometer/DownloadActivity;->G()V

    return-void

    :pswitch_6
    iget-object v0, p0, Lx9;->b:Lru/zinovin/tankspeedometer/DownloadActivity;

    iget v1, v0, Lru/zinovin/tankspeedometer/DownloadActivity;->L:I

    add-int/2addr v1, v2

    iput v1, v0, Lru/zinovin/tankspeedometer/DownloadActivity;->L:I

    invoke-virtual {v0}, Lru/zinovin/tankspeedometer/DownloadActivity;->Q()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
