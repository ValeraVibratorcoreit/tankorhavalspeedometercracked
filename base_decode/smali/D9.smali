.class public final synthetic LD9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lru/zinovin/tankspeedometer/DownloadActivity;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Lru/zinovin/tankspeedometer/DownloadActivity;ZI)V
    .locals 0

    iput p3, p0, LD9;->a:I

    iput-object p1, p0, LD9;->b:Lru/zinovin/tankspeedometer/DownloadActivity;

    iput-boolean p2, p0, LD9;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget v0, p0, LD9;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LD9;->b:Lru/zinovin/tankspeedometer/DownloadActivity;

    iget-boolean v1, p0, LD9;->c:Z

    iget-object v2, v0, Lru/zinovin/tankspeedometer/DownloadActivity;->N:Ljava/lang/Object;

    monitor-enter v2

    if-nez v1, :cond_0

    const v1, 0x7f1301a6

    :try_start_0
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lru/zinovin/tankspeedometer/DownloadActivity;->P(Ljava/lang/String;)V

    invoke-virtual {v0}, Lru/zinovin/tankspeedometer/DownloadActivity;->J()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lru/zinovin/tankspeedometer/DownloadActivity;->N()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    iget-object v1, v0, Lru/zinovin/tankspeedometer/DownloadActivity;->M:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lru/zinovin/tankspeedometer/DownloadActivity;->J()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lru/zinovin/tankspeedometer/DownloadActivity;->O()V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lru/zinovin/tankspeedometer/DownloadActivity;->E()V

    :cond_2
    :goto_0
    monitor-exit v2

    return-void

    :goto_1
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :pswitch_0
    iget-boolean v0, p0, LD9;->c:Z

    iget-object v1, p0, LD9;->b:Lru/zinovin/tankspeedometer/DownloadActivity;

    iget-object v2, v1, Lru/zinovin/tankspeedometer/DownloadActivity;->H:Ljava/lang/String;

    const-string v3, "DEMO"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const-string v2, "https://tankspeedometer.ru:9443/api/cars/download"

    goto :goto_2

    :cond_3
    const-string v2, "https://tankspeedometer.ru:9443/api/cars/download"

    :goto_2
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    :try_start_1
    const-string v4, "vin"

    const-string v5, "persist.gwm.vehicle.vin"

    invoke-static {v1, v5}, LTf;->F(Landroid/app/Activity;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v4, "version"

    invoke-static {}, LTf;->x()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v4, "password"

    iget-object v5, v1, Lru/zinovin/tankspeedometer/DownloadActivity;->A:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-virtual {v5}, LW1;->getText()Landroid/text/Editable;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v4, "token"

    iget-object v5, v1, Lru/zinovin/tankspeedometer/DownloadActivity;->B:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-virtual {v5}, LW1;->getText()Landroid/text/Editable;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v4, "beta"

    invoke-virtual {v3, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string v0, "digits"

    invoke-static {v1}, Lru/zinovin/jni/JniUtils;->getData(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "lang"

    invoke-virtual {v1}, Lq1;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v4

    iget-object v4, v4, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v4}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    const-string v4, "downloadAndInstallApk()"

    invoke-virtual {v1, v0, v4}, Lru/zinovin/tankspeedometer/DownloadActivity;->H(Ljava/lang/Exception;Ljava/lang/String;)V

    :goto_3
    new-instance v0, Ljava/lang/Thread;

    new-instance v4, LB9;

    const/4 v5, 0x1

    invoke-direct {v4, v1, v2, v3, v5}, LB9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-direct {v0, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
