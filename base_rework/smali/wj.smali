.class public final synthetic Lwj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lxj;


# direct methods
.method public synthetic constructor <init>(Lxj;I)V
    .locals 0

    iput p2, p0, Lwj;->a:I

    iput-object p1, p0, Lwj;->b:Lxj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Lwj;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lwj;->b:Lxj;

    iget-object v1, v0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    iget-object v1, v1, Lru/zinovin/tankspeedometer/MainActivity;->z:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lxj;->f0(Ljava/lang/String;)V

    const-string v0, "naviFullscreen"

    invoke-static {v0}, LTd;->p(Ljava/lang/String;)Z

    move-result v0

    invoke-static {}, LUd;->A()I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    invoke-static {v1}, LUd;->p0(Z)V

    invoke-static {v0}, LUd;->n0(Z)V

    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lwj;->b:Lxj;

    iget-object v1, v0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    iget-object v1, v1, Lru/zinovin/tankspeedometer/MainActivity;->z:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lxj;->c0(Ljava/lang/String;)V

    invoke-virtual {v0}, Lxj;->h0()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
