.class public final synthetic Lv9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lru/zinovin/tankspeedometer/DownloadActivity;


# direct methods
.method public synthetic constructor <init>(Lru/zinovin/tankspeedometer/DownloadActivity;I)V
    .locals 0

    iput p2, p0, Lv9;->a:I

    iput-object p1, p0, Lv9;->b:Lru/zinovin/tankspeedometer/DownloadActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 7

    const/4 p1, 0x1

    const/4 v0, 0x0

    iget-object v1, p0, Lv9;->b:Lru/zinovin/tankspeedometer/DownloadActivity;

    iget v2, p0, Lv9;->a:I

    packed-switch v2, :pswitch_data_0

    sget-object v2, Lru/zinovin/tankspeedometer/DownloadActivity;->O:Lmi;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v2, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    new-instance v3, Ljava/lang/Thread;

    new-instance v4, Lw9;

    invoke-direct {v4, v2, v0}, Lw9;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;I)V

    invoke-direct {v3, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v3}, Ljava/lang/Thread;->start()V

    :try_start_0
    invoke-virtual {v3}, Ljava/lang/Thread;->join()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    const-string v4, "allowAction()"

    invoke-virtual {v1, v3, v4}, Lru/zinovin/tankspeedometer/DownloadActivity;->H(Ljava/lang/Exception;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-nez v2, :cond_0

    const p1, 0x7f1301c1

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lru/zinovin/tankspeedometer/DownloadActivity;->P(Ljava/lang/String;)V

    goto/16 :goto_3

    :cond_0
    iget-object v2, v1, Lru/zinovin/tankspeedometer/DownloadActivity;->A:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-virtual {v2}, LW1;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    const p1, 0x7f1301a9

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lru/zinovin/tankspeedometer/DownloadActivity;->P(Ljava/lang/String;)V

    goto/16 :goto_3

    :cond_1
    iget-object v2, v1, Lru/zinovin/tankspeedometer/DownloadActivity;->y:Landroid/widget/Button;

    invoke-virtual {v2, v0}, Landroid/view/View;->setEnabled(Z)V

    iget-object v2, v1, Lru/zinovin/tankspeedometer/DownloadActivity;->z:Landroid/widget/Button;

    invoke-virtual {v2, v0}, Landroid/view/View;->setEnabled(Z)V

    iget-object v2, v1, Lru/zinovin/tankspeedometer/DownloadActivity;->A:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-virtual {v2}, LW1;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    const-string v3, "password"

    invoke-static {v3, v2}, LTf;->W(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, v1, Lru/zinovin/tankspeedometer/DownloadActivity;->B:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-virtual {v2}, LW1;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    const-string v3, "authcode"

    invoke-static {v3, v2}, LTf;->W(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, v1, Lru/zinovin/tankspeedometer/DownloadActivity;->C:Landroid/widget/ProgressBar;

    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object v2, v1, Lru/zinovin/tankspeedometer/DownloadActivity;->D:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object v2, v1, Lru/zinovin/tankspeedometer/DownloadActivity;->H:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, -0x1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_0

    :goto_1
    move p1, v3

    goto :goto_2

    :sswitch_0
    const-string p1, "DEMO"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    const/4 p1, 0x2

    goto :goto_2

    :sswitch_1
    const-string v0, "UPDATE"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_1

    :sswitch_2
    const-string p1, "DOWNLOAD"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    move p1, v0

    :cond_4
    :goto_2
    packed-switch p1, :pswitch_data_1

    goto :goto_3

    :pswitch_0
    iget-object p1, v1, Lru/zinovin/tankspeedometer/DownloadActivity;->E:Landroid/widget/CheckBox;

    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    iget-object v0, v1, Lru/zinovin/tankspeedometer/DownloadActivity;->F:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    new-instance v2, Ljava/lang/Thread;

    new-instance v3, LA9;

    invoke-direct {v3, v1, p1, v0}, LA9;-><init>(Lru/zinovin/tankspeedometer/DownloadActivity;ZZ)V

    invoke-direct {v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    goto :goto_3

    :pswitch_1
    iget-object p1, v1, Lru/zinovin/tankspeedometer/DownloadActivity;->E:Landroid/widget/CheckBox;

    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    iget-object v0, v1, Lru/zinovin/tankspeedometer/DownloadActivity;->F:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    new-instance v2, Ljava/lang/Thread;

    new-instance v3, LA9;

    invoke-direct {v3, v1, p1, v0}, LA9;-><init>(Lru/zinovin/tankspeedometer/DownloadActivity;ZZ)V

    invoke-direct {v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    goto :goto_3

    :pswitch_2
    iget-object p1, v1, Lru/zinovin/tankspeedometer/DownloadActivity;->A:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-virtual {p1}, LW1;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, v1, Lru/zinovin/tankspeedometer/DownloadActivity;->B:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-virtual {v0}, LW1;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, p1, v0}, Lru/zinovin/tankspeedometer/DownloadActivity;->I(Ljava/lang/String;Ljava/lang/String;)V

    :goto_3
    return-void

    :pswitch_3
    sget-object p1, Lru/zinovin/tankspeedometer/DownloadActivity;->O:Lmi;

    invoke-virtual {v1}, Lru/zinovin/tankspeedometer/DownloadActivity;->L()V

    return-void

    :pswitch_4
    sget-object v0, Lru/zinovin/tankspeedometer/DownloadActivity;->O:Lmi;

    const v0, 0x7f0b02cb

    invoke-virtual {v1, v0}, Lq1;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    const v2, 0x7f0b02cd

    invoke-virtual {v1, v2}, Lq1;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_6

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "wifi"

    invoke-virtual {v3, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/net/wifi/WifiManager;

    new-instance v4, Landroid/net/wifi/WifiConfiguration;

    invoke-direct {v4}, Landroid/net/wifi/WifiConfiguration;-><init>()V

    const-string v5, "\""

    invoke-static {v5, v0, v5}, LVo;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v4, Landroid/net/wifi/WifiConfiguration;->SSID:Ljava/lang/String;

    invoke-static {v5, v2, v5}, LVo;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v4, Landroid/net/wifi/WifiConfiguration;->preSharedKey:Ljava/lang/String;

    invoke-virtual {v3, v4}, Landroid/net/wifi/WifiManager;->addNetwork(Landroid/net/wifi/WifiConfiguration;)I

    move-result v2

    invoke-virtual {v3}, Landroid/net/wifi/WifiManager;->disconnect()Z

    invoke-virtual {v3, v2, p1}, Landroid/net/wifi/WifiManager;->enableNetwork(IZ)Z

    invoke-virtual {v3}, Landroid/net/wifi/WifiManager;->reconnect()Z

    const p1, 0x7f1301ea

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lru/zinovin/tankspeedometer/DownloadActivity;->P(Ljava/lang/String;)V

    goto :goto_5

    :cond_6
    :goto_4
    const p1, 0x7f1301a8

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lru/zinovin/tankspeedometer/DownloadActivity;->P(Ljava/lang/String;)V

    :goto_5
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        -0x7c3f4778 -> :sswitch_2
        -0x6a6cd337 -> :sswitch_1
        0x1ff5e3 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
