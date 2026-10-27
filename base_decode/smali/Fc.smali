.class public final synthetic LFc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly7;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LOc;


# direct methods
.method public synthetic constructor <init>(LOc;I)V
    .locals 0

    iput p2, p0, LFc;->a:I

    iput-object p1, p0, LFc;->b:LOc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget v0, p0, LFc;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, LFk;

    iget-object v0, p0, LFc;->b:LOc;

    invoke-virtual {v0}, LOc;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean p1, p1, LFk;->a:Z

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, LOc;->r(ZZ)V

    :cond_0
    return-void

    :pswitch_0
    check-cast p1, Lkj;

    iget-object v0, p0, LFc;->b:LOc;

    invoke-virtual {v0}, LOc;->H()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-boolean p1, p1, Lkj;->a:Z

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, LOc;->m(ZZ)V

    :cond_1
    return-void

    :pswitch_1
    check-cast p1, Ljava/lang/Integer;

    iget-object v0, p0, LFc;->b:LOc;

    invoke-virtual {v0}, LOc;->H()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/16 v1, 0x50

    if-ne p1, v1, :cond_2

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, LOc;->l(Z)V

    :cond_2
    return-void

    :pswitch_2
    check-cast p1, Landroid/content/res/Configuration;

    iget-object p1, p0, LFc;->b:LOc;

    invoke-virtual {p1}, LOc;->H()Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LOc;->h(Z)V

    :cond_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
