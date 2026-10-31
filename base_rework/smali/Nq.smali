.class public final synthetic LNq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMj;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LOq;


# direct methods
.method public synthetic constructor <init>(LOq;I)V
    .locals 0

    iput p2, p0, LNq;->a:I

    iput-object p1, p0, LNq;->b:LOq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final w(Ljava/lang/Object;)V
    .locals 4

    iget v0, p0, LNq;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Integer;

    iget-object v0, p0, LNq;->b:LOq;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    const/4 v1, 0x3

    if-eq p1, v1, :cond_0

    const-string p1, "kPa"

    goto :goto_0

    :cond_0
    const-string p1, "bar"

    goto :goto_0

    :cond_1
    const-string p1, "psi"

    :goto_0
    iput-object p1, v0, LOq;->p:Ljava/lang/String;

    invoke-virtual {v0}, LOq;->gettColor()I

    move-result p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v0, LOq;->p:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v0, LOq;->o:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const v2, 0x7f0b0296

    const-string v3, "%s"

    invoke-virtual {v0, v2, p1, v3, v1}, LOq;->d(IILjava/lang/String;[Ljava/lang/Object;)V

    return-void

    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    iget-object v0, p0, LNq;->b:LOq;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_2

    const-string p1, "\u00b0F"

    goto :goto_1

    :cond_2
    const-string p1, "\u00b0C"

    :goto_1
    iput-object p1, v0, LOq;->o:Ljava/lang/String;

    invoke-virtual {v0}, LOq;->gettColor()I

    move-result p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, v0, LOq;->p:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v0, LOq;->o:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const v2, 0x7f0b0296

    const-string v3, "%s"

    invoke-virtual {v0, v2, p1, v3, v1}, LOq;->d(IILjava/lang/String;[Ljava/lang/Object;)V

    return-void

    :pswitch_1
    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, LNq;->b:LOq;

    invoke-virtual {v0, p1}, LOq;->e(Ljava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
