.class public final LAh;
.super Lxh;
.source "SourceFile"


# instance fields
.field public d:Lni;


# virtual methods
.method public final b(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LIm;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LIm;->c()I

    move-result p1

    :goto_0
    return p1
.end method

.method public final c(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Lfg;

    check-cast p2, LIm;

    iget-object p1, p0, LAh;->d:Lni;

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    check-cast p1, Lfb;

    iget-object p1, p1, Lfb;->e:LB4;

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, LB4;->d(LIm;Z)V

    :cond_0
    return-void
.end method
