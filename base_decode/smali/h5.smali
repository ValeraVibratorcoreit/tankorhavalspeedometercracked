.class public final Lh5;
.super Lc3;
.source "SourceFile"


# instance fields
.field public i:I


# virtual methods
.method public final clear()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lh5;->i:I

    invoke-super {p0}, LFo;->clear()V

    return-void
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Lh5;->i:I

    if-nez v0, :cond_0

    invoke-super {p0}, LFo;->hashCode()I

    move-result v0

    iput v0, p0, Lh5;->i:I

    :cond_0
    iget v0, p0, Lh5;->i:I

    return v0
.end method

.method public final i(LFo;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lh5;->i:I

    invoke-super {p0, p1}, LFo;->i(LFo;)V

    return-void
.end method

.method public final j(I)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lh5;->i:I

    invoke-super {p0, p1}, LFo;->j(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final k(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lh5;->i:I

    invoke-super {p0, p1, p2}, LFo;->k(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lh5;->i:I

    invoke-super {p0, p1, p2}, LFo;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
