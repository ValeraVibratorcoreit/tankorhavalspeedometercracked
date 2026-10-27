.class public final synthetic LA9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lru/zinovin/tankspeedometer/DownloadActivity;

.field public final synthetic b:Z

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Lru/zinovin/tankspeedometer/DownloadActivity;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA9;->a:Lru/zinovin/tankspeedometer/DownloadActivity;

    iput-boolean p2, p0, LA9;->b:Z

    iput-boolean p3, p0, LA9;->c:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    const/4 v0, 0x0

    const/4 v1, 0x1

    iget-boolean v2, p0, LA9;->c:Z

    sget-object v3, Lru/zinovin/tankspeedometer/DownloadActivity;->O:Lmi;

    iget-object v3, p0, LA9;->a:Lru/zinovin/tankspeedometer/DownloadActivity;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "checkForUpdate()"

    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v6, "vin"

    const-string v7, "persist.gwm.vehicle.vin"

    invoke-static {v3, v7}, LTf;->F(Landroid/app/Activity;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v6, "password"

    iget-object v7, v3, Lru/zinovin/tankspeedometer/DownloadActivity;->A:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-virtual {v7}, LW1;->getText()Landroid/text/Editable;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v6, "token"

    iget-object v7, v3, Lru/zinovin/tankspeedometer/DownloadActivity;->B:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-virtual {v7}, LW1;->getText()Landroid/text/Editable;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v6, "digits"

    invoke-static {v3}, Lru/zinovin/jni/JniUtils;->getData(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v6, "lang"

    invoke-virtual {v3}, Lq1;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v7

    iget-object v7, v7, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v7}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v6

    invoke-virtual {v3, v6, v4}, Lru/zinovin/tankspeedometer/DownloadActivity;->H(Ljava/lang/Exception;Ljava/lang/String;)V

    :goto_0
    sget-object v6, Lru/zinovin/tankspeedometer/DownloadActivity;->O:Lmi;

    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v6, v5}, Lbb;->a(Lmi;Ljava/lang/String;)Lbb;

    move-result-object v5

    new-instance v6, LPj;

    invoke-direct {v6}, LPj;-><init>()V

    new-instance v7, LH0;

    invoke-direct {v7}, LH0;-><init>()V

    const-string v8, "https://tankspeedometer.ru:9443/api/v2/cars/check-update"

    invoke-virtual {v7, v8}, LH0;->q(Ljava/lang/String;)V

    const-string v8, "POST"

    invoke-virtual {v7, v8, v5}, LH0;->j(Ljava/lang/String;Lbb;)V

    invoke-virtual {v7}, LH0;->a()LT1;

    move-result-object v5

    :try_start_1
    new-instance v7, LDl;

    invoke-direct {v7, v6, v5}, LDl;-><init>(LPj;LT1;)V

    invoke-virtual {v7}, LDl;->c()Ldn;

    move-result-object v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    invoke-virtual {v5}, Ldn;->w()Z

    move-result v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v7, v5, Ldn;->g:LJl;

    if-eqz v6, :cond_4

    if-eqz v7, :cond_3

    :try_start_3
    invoke-virtual {v7}, LJl;->y()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v6, "version"

    invoke-virtual {v7, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v8, "url"

    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    const-string v8, "init_date"

    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iget-object v8, v3, Lru/zinovin/tankspeedometer/DownloadActivity;->G:Landroid/os/Handler;

    new-instance v9, Lz9;

    invoke-direct {v9, v7, v1}, Lz9;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v8, v9}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    iget-boolean v7, p0, LA9;->b:Z

    if-nez v7, :cond_2

    :try_start_4
    invoke-static {}, LTf;->x()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v6}, LTf;->l(Ljava/lang/String;Ljava/lang/String;)I

    move-result v6

    if-gez v6, :cond_0

    goto :goto_1

    :cond_0
    iget-object v6, v3, Lru/zinovin/tankspeedometer/DownloadActivity;->H:Ljava/lang/String;

    const-string v7, "DEMO"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    const v0, 0x7f1301b5

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lru/zinovin/tankspeedometer/DownloadActivity;->P(Ljava/lang/String;)V

    iget-object v0, v3, Lru/zinovin/tankspeedometer/DownloadActivity;->G:Landroid/os/Handler;

    new-instance v2, Lx9;

    invoke-direct {v2, v3, v1}, Lx9;-><init>(Lru/zinovin/tankspeedometer/DownloadActivity;I)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_2
    :goto_1
    iget-object v6, v3, Lru/zinovin/tankspeedometer/DownloadActivity;->G:Landroid/os/Handler;

    new-instance v7, LD9;

    invoke-direct {v7, v3, v2, v0}, LD9;-><init>(Lru/zinovin/tankspeedometer/DownloadActivity;ZI)V

    invoke-virtual {v6, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_2

    :cond_3
    const v0, 0x7f1301a7

    invoke-virtual {v3, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lru/zinovin/tankspeedometer/DownloadActivity;->P(Ljava/lang/String;)V

    iget-object v0, v3, Lru/zinovin/tankspeedometer/DownloadActivity;->G:Landroid/os/Handler;

    new-instance v2, Lx9;

    invoke-direct {v2, v3, v1}, Lx9;-><init>(Lru/zinovin/tankspeedometer/DownloadActivity;I)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_2

    :cond_4
    invoke-virtual {v7}, LJl;->y()Ljava/lang/String;

    move-result-object v2

    iget-object v6, v3, Lru/zinovin/tankspeedometer/DownloadActivity;->G:Landroid/os/Handler;

    new-instance v7, LE9;

    invoke-direct {v7, v3, v2, v0}, LE9;-><init>(Lru/zinovin/tankspeedometer/DownloadActivity;Ljava/lang/String;I)V

    invoke-virtual {v6, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    iget-object v0, v3, Lru/zinovin/tankspeedometer/DownloadActivity;->G:Landroid/os/Handler;

    new-instance v2, Lx9;

    invoke-direct {v2, v3, v1}, Lx9;-><init>(Lru/zinovin/tankspeedometer/DownloadActivity;I)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_2
    :try_start_5
    invoke-virtual {v5}, Ldn;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_6

    :catch_1
    move-exception v0

    goto :goto_5

    :goto_3
    :try_start_6
    invoke-virtual {v5}, Ldn;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v2

    :try_start_7
    invoke-virtual {v0, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    :goto_5
    invoke-virtual {v3, v0, v4}, Lru/zinovin/tankspeedometer/DownloadActivity;->H(Ljava/lang/Exception;Ljava/lang/String;)V

    iget-object v0, v3, Lru/zinovin/tankspeedometer/DownloadActivity;->G:Landroid/os/Handler;

    new-instance v2, Lx9;

    invoke-direct {v2, v3, v1}, Lx9;-><init>(Lru/zinovin/tankspeedometer/DownloadActivity;I)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_6
    return-void
.end method
