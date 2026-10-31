.class public final Lne;
.super Ljg;
.source "SourceFile"

# interfaces
.implements Ldd;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lne;->b:I

    iput-object p1, p0, Lne;->c:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ljg;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lne;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lne;->c:Ljava/lang/Object;

    check-cast v0, LSs;

    invoke-static {v0}, LTf;->G(LSs;)Lun;

    move-result-object v0

    return-object v0

    :pswitch_0
    :try_start_0
    iget-object v0, p0, Lne;->c:Ljava/lang/Object;

    check-cast v0, Ldd;

    invoke-interface {v0}, Ldd;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v0, LSa;->a:LSa;

    :goto_0
    return-object v0

    :pswitch_1
    iget-object v0, p0, Lne;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
