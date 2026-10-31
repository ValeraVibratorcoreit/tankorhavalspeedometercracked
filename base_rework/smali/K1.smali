.class public final synthetic LK1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/window/OnBackInvokedCallback;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, LK1;->a:I

    iput-object p1, p0, LK1;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onBackInvoked()V
    .locals 2

    iget v0, p0, LK1;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LK1;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void

    :pswitch_0
    iget-object v0, p0, LK1;->b:Ljava/lang/Object;

    check-cast v0, Ldd;

    const-string v1, "$onBackInvoked"

    invoke-static {v1, v0}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0}, Ldd;->a()Ljava/lang/Object;

    return-void

    :pswitch_1
    iget-object v0, p0, LK1;->b:Ljava/lang/Object;

    check-cast v0, LR1;

    invoke-virtual {v0}, LR1;->D()Z

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
