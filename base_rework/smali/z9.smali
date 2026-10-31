.class public final synthetic Lz9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    iput p2, p0, Lz9;->a:I

    iput-object p1, p0, Lz9;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lz9;->b:Ljava/lang/String;

    const-string v1, "LALALA"

    iget v2, p0, Lz9;->a:I

    packed-switch v2, :pswitch_data_0

    sget-object v2, Lru/zinovin/tankspeedometer/DownloadActivity;->O:Lmi;

    invoke-static {v1, v0}, LTf;->W(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :pswitch_0
    sget-object v2, Lru/zinovin/tankspeedometer/DownloadActivity;->O:Lmi;

    invoke-static {v1, v0}, LTf;->W(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
