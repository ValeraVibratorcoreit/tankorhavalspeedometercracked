.class public final synthetic Lxr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lyr;


# direct methods
.method public synthetic constructor <init>(Lyr;I)V
    .locals 0

    iput p2, p0, Lxr;->a:I

    iput-object p1, p0, Lxr;->b:Lyr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget v0, p0, Lxr;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lxr;->b:Lyr;

    invoke-virtual {v0}, Lyr;->h()V

    return-void

    :pswitch_0
    iget-object v0, p0, Lxr;->b:Lyr;

    iget-object v1, v0, Lyr;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, v0, Lyr;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lyr;->h()V

    :cond_0
    new-instance v1, Lxr;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lxr;-><init>(Lyr;I)V

    iget-object v0, v0, Lyr;->d:Landroid/os/Handler;

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
