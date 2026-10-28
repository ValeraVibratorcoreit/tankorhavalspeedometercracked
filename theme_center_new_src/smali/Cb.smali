.class public final LCb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnf;


# virtual methods
.method public final a(Ljava/nio/ByteBuffer;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;
    .locals 0

    sget-object p1, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    return-object p1
.end method

.method public final b(Ljava/io/InputStream;Luh;)I
    .locals 1

    new-instance p2, LBb;

    invoke-direct {p2, p1}, LBb;-><init>(Ljava/io/InputStream;)V

    const-string p1, "Orientation"

    invoke-virtual {p2, p1}, LBb;->c(Ljava/lang/String;)Lxb;

    move-result-object p1

    const/4 v0, 0x1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    iget-object p2, p2, LBb;->f:Ljava/nio/ByteOrder;

    invoke-virtual {p1, p2}, Lxb;->e(Ljava/nio/ByteOrder;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_0
    if-nez v0, :cond_1

    const/4 p1, -0x1

    return p1

    :cond_1
    return v0
.end method

.method public final c(Ljava/nio/ByteBuffer;Luh;)I
    .locals 1

    sget-object v0, Ld5;->a:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Lb5;

    invoke-direct {v0, p1}, Lb5;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-virtual {p0, v0, p2}, LCb;->b(Ljava/io/InputStream;Luh;)I

    move-result p1

    return p1
.end method

.method public final d(Ljava/io/InputStream;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;
    .locals 0

    sget-object p1, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    return-object p1
.end method
