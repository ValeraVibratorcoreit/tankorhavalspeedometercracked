.class public final LO6;
.super Ljg;
.source "SourceFile"

# interfaces
.implements Ldd;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:LP6;


# direct methods
.method public synthetic constructor <init>(LP6;I)V
    .locals 0

    iput p2, p0, LO6;->b:I

    iput-object p1, p0, LO6;->c:LP6;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ljg;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 5

    iget v0, p0, LO6;->b:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lak;

    new-instance v1, LE6;

    iget-object v2, p0, LO6;->c:LP6;

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, LE6;-><init>(LP6;I)V

    invoke-direct {v0, v1}, Lak;-><init>(Ljava/lang/Runnable;)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x21

    if-lt v1, v3, :cond_1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-static {v1, v3}, LTf;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v1, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v3, LB1;

    const/4 v4, 0x6

    invoke-direct {v3, v2, v4, v0}, LB1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v1, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, LI6;

    invoke-direct {v1, v0, v2}, LI6;-><init>(Lak;LP6;)V

    iget-object v2, v2, LP6;->a:LFg;

    invoke-virtual {v2, v1}, LFg;->a(LCg;)V

    :cond_1
    :goto_0
    return-object v0

    :pswitch_0
    new-instance v0, Lcd;

    iget-object v1, p0, LO6;->c:LP6;

    iget-object v2, v1, LP6;->f:LL6;

    new-instance v3, LO6;

    const/4 v4, 0x0

    invoke-direct {v3, v1, v4}, LO6;-><init>(LP6;I)V

    invoke-direct {v0, v2, v3}, Lcd;-><init>(Ljava/util/concurrent/Executor;LO6;)V

    return-object v0

    :pswitch_1
    iget-object v0, p0, LO6;->c:LP6;

    invoke-virtual {v0}, LP6;->reportFullyDrawn()V

    sget-object v0, Lpa;->m:Lpa;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
