.class public final Lx4;
.super Ljava/util/TimerTask;
.source "SourceFile"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lx4;->a:I

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget v0, p0, Lx4;->a:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "lala"

    invoke-static {v1, v0}, LTf;->q(Ljava/lang/String;[Ljava/lang/Object;)LL;

    return-void

    :pswitch_0
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "lala"

    invoke-static {v1, v0}, LTf;->q(Ljava/lang/String;[Ljava/lang/Object;)LL;

    return-void

    :pswitch_1
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "lala"

    invoke-static {v1, v0}, LTf;->q(Ljava/lang/String;[Ljava/lang/Object;)LL;

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
