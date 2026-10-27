.class public final LJ8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, LJ8;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LO8;Ljava/util/ArrayList;Ldp;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LJ8;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ8;->d:Ljava/lang/Object;

    iput-object p2, p0, LJ8;->b:Ljava/lang/Object;

    iput-object p3, p0, LJ8;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;LIt;Lnp;Landroid/animation/ValueAnimator;)V
    .locals 0

    const/4 p2, 0x2

    iput p2, p0, LJ8;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ8;->b:Ljava/lang/Object;

    iput-object p3, p0, LJ8;->c:Ljava/lang/Object;

    iput-object p4, p0, LJ8;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget v0, p0, LJ8;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LJ8;->c:Ljava/lang/Object;

    check-cast v0, Lnp;

    iget-object v1, p0, LJ8;->b:Ljava/lang/Object;

    check-cast v1, Landroid/view/View;

    invoke-static {v1, v0}, LEt;->h(Landroid/view/View;Lnp;)V

    iget-object v0, p0, LJ8;->d:Ljava/lang/Object;

    check-cast v0, Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void

    :pswitch_0
    :try_start_0
    iget-object v0, p0, LJ8;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/Callable;

    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    new-instance v1, Li0;

    iget-object v2, p0, LJ8;->c:Ljava/lang/Object;

    check-cast v2, Ly7;

    check-cast v2, Lic;

    const/4 v3, 0x4

    const/4 v4, 0x0

    invoke-direct {v1, v3, v2, v0, v4}, Li0;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    iget-object v0, p0, LJ8;->d:Ljava/lang/Object;

    check-cast v0, Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :pswitch_1
    iget-object v0, p0, LJ8;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v1, p0, LJ8;->c:Ljava/lang/Object;

    check-cast v1, Ldp;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, LJ8;->d:Ljava/lang/Object;

    check-cast v0, LO8;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v1, Ldp;->c:Lzc;

    iget-object v0, v0, Lzc;->E:Landroid/view/View;

    iget v1, v1, Ldp;->a:I

    invoke-static {v0, v1}, LVo;->a(Landroid/view/View;I)V

    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
