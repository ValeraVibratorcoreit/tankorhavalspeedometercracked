.class public final synthetic Lw9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicBoolean;I)V
    .locals 0

    iput p2, p0, Lw9;->a:I

    iput-object p1, p0, Lw9;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lw9;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget v1, p0, Lw9;->a:I

    packed-switch v1, :pswitch_data_0

    sget-object v1, LK9;->d0:Lmi;

    invoke-static {}, LUd;->N()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void

    :pswitch_0
    sget-object v1, Lru/zinovin/tankspeedometer/DownloadActivity2;->G:Lmi;

    invoke-static {}, LUd;->N()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void

    :pswitch_1
    sget-object v1, Lru/zinovin/tankspeedometer/DownloadActivity;->O:Lmi;

    invoke-static {}, LUd;->N()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void

    :pswitch_2
    sget-object v1, Lru/zinovin/tankspeedometer/DownloadActivity;->O:Lmi;

    invoke-static {}, LUd;->N()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
