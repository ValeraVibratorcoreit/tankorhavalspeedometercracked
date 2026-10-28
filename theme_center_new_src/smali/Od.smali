.class public final LOd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, LOd;->a:I

    iput-object p1, p0, LOd;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 3

    iget v0, p0, LOd;->a:I

    packed-switch v0, :pswitch_data_0

    iget v0, p1, Landroid/os/Message;->what:I

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, LOd;->b:Ljava/lang/Object;

    check-cast v0, LL;

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-static {p1}, LVo;->l(Ljava/lang/Object;)V

    iget-object v0, v0, LL;->a:Ljava/lang/Object;

    monitor-enter v0

    const/4 p1, 0x0

    :try_start_0
    throw p1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :pswitch_0
    iget v0, p1, Landroid/os/Message;->what:I

    iget-object v1, p0, LOd;->b:Ljava/lang/Object;

    check-cast v1, LPd;

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, LMd;

    invoke-virtual {v1, p1}, LPd;->b(LMd;)V

    goto :goto_1

    :cond_1
    const/4 v2, 0x2

    if-ne v0, v2, :cond_2

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, LMd;

    iget-object v0, v1, LPd;->d:LEm;

    invoke-virtual {v0, p1}, LEm;->l(Lgq;)V

    :cond_2
    const/4 v2, 0x0

    :goto_1
    return v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
