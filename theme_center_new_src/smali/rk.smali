.class public final Lrk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfg;


# instance fields
.field public final b:Lh5;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lh5;

    invoke-direct {v0}, LFo;-><init>()V

    iput-object v0, p0, Lrk;->b:Lh5;

    return-void
.end method


# virtual methods
.method public final a(Ljava/security/MessageDigest;)V
    .locals 6

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lrk;->b:Lh5;

    iget v2, v1, LFo;->c:I

    if-ge v0, v2, :cond_1

    invoke-virtual {v1, v0}, LFo;->h(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpk;

    iget-object v2, p0, Lrk;->b:Lh5;

    invoke-virtual {v2, v0}, LFo;->l(I)Ljava/lang/Object;

    move-result-object v2

    iget-object v3, v1, Lpk;->b:Lok;

    iget-object v4, v1, Lpk;->d:[B

    if-nez v4, :cond_0

    iget-object v4, v1, Lpk;->c:Ljava/lang/String;

    sget-object v5, Lfg;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v4, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v4

    iput-object v4, v1, Lpk;->d:[B

    :cond_0
    iget-object v1, v1, Lpk;->d:[B

    invoke-interface {v3, v1, v2, p1}, Lok;->e([BLjava/lang/Object;Ljava/security/MessageDigest;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final c(Lpk;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lrk;->b:Lh5;

    invoke-virtual {v0, p1}, LFo;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, LFo;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p1, Lpk;->a:Ljava/lang/Object;

    :goto_0
    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lrk;

    if-eqz v0, :cond_0

    check-cast p1, Lrk;

    iget-object v0, p0, Lrk;->b:Lh5;

    iget-object p1, p1, Lrk;->b:Lh5;

    invoke-virtual {v0, p1}, LFo;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lrk;->b:Lh5;

    invoke-virtual {v0}, Lh5;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Options{values="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lrk;->b:Lh5;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
