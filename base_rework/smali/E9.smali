.class public final synthetic LE9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lru/zinovin/tankspeedometer/DownloadActivity;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lru/zinovin/tankspeedometer/DownloadActivity;Ljava/lang/String;I)V
    .locals 0

    iput p3, p0, LE9;->a:I

    iput-object p1, p0, LE9;->b:Lru/zinovin/tankspeedometer/DownloadActivity;

    iput-object p2, p0, LE9;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    const-string v0, "T500.DOWNLOADER"

    iget-object v1, p0, LE9;->b:Lru/zinovin/tankspeedometer/DownloadActivity;

    iget-object v2, p0, LE9;->c:Ljava/lang/String;

    iget v3, p0, LE9;->a:I

    packed-switch v3, :pswitch_data_0

    sget-object v3, Lru/zinovin/tankspeedometer/DownloadActivity;->O:Lmi;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const/4 v3, 0x1

    invoke-static {v1, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Error showing toast"

    invoke-static {v0, v2, v1}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void

    :pswitch_0
    sget-object v3, Lru/zinovin/tankspeedometer/DownloadActivity;->O:Lmi;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "message"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Server\'s answer: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const v4, 0x7f1301d2

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lru/zinovin/tankspeedometer/DownloadActivity;->P(Ljava/lang/String;)V

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_2

    :cond_0
    :goto_1
    invoke-virtual {v1}, Lru/zinovin/tankspeedometer/DownloadActivity;->G()V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :goto_2
    const-string v2, "processErrorResponse()"

    invoke-virtual {v1, v0, v2}, Lru/zinovin/tankspeedometer/DownloadActivity;->H(Ljava/lang/Exception;Ljava/lang/String;)V

    :goto_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
