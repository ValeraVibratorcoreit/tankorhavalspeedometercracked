.class public final synthetic Ly9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lru/zinovin/tankspeedometer/DownloadActivity;


# direct methods
.method public synthetic constructor <init>(Lru/zinovin/tankspeedometer/DownloadActivity;I)V
    .locals 0

    iput p2, p0, Ly9;->a:I

    iput-object p1, p0, Ly9;->b:Lru/zinovin/tankspeedometer/DownloadActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    iget-object p1, p0, Ly9;->b:Lru/zinovin/tankspeedometer/DownloadActivity;

    iget p2, p0, Ly9;->a:I

    packed-switch p2, :pswitch_data_0

    sget-object p2, Lru/zinovin/tankspeedometer/DownloadActivity;->O:Lmi;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void

    :pswitch_0
    sget-object p2, Lru/zinovin/tankspeedometer/DownloadActivity;->O:Lmi;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LTf;->x()Ljava/lang/String;

    move-result-object p2

    const-string v0, "VERSION"

    invoke-static {v0, p2}, LTf;->W(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lru/zinovin/tankspeedometer/DownloadActivity;->K()Z

    new-instance p2, Landroid/content/Intent;

    const-class v0, Lru/zinovin/tankspeedometer/MainActivity;

    invoke-direct {p2, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void

    :pswitch_1
    sget-object p2, Lru/zinovin/tankspeedometer/DownloadActivity;->O:Lmi;

    invoke-virtual {p1}, Lru/zinovin/tankspeedometer/DownloadActivity;->L()V

    return-void

    :pswitch_2
    sget-object p2, Lru/zinovin/tankspeedometer/DownloadActivity;->O:Lmi;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void

    :pswitch_3
    sget-object p2, Lru/zinovin/tankspeedometer/DownloadActivity;->O:Lmi;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p2, "password"

    invoke-static {p2}, LTf;->H(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "authcode"

    invoke-static {v0}, LTf;->H(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lru/zinovin/tankspeedometer/DownloadActivity;->I(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :pswitch_4
    sget-object p2, Lru/zinovin/tankspeedometer/DownloadActivity;->O:Lmi;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void

    :pswitch_5
    sget-object p2, Lru/zinovin/tankspeedometer/DownloadActivity;->O:Lmi;

    invoke-virtual {p1}, Lru/zinovin/tankspeedometer/DownloadActivity;->L()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
