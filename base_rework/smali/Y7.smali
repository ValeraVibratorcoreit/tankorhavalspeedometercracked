.class public final LY7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfg;


# instance fields
.field public final b:Lfg;

.field public final c:Lfg;


# direct methods
.method public constructor <init>(Lfg;Lfg;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LY7;->b:Lfg;

    iput-object p2, p0, LY7;->c:Lfg;

    return-void
.end method


# virtual methods
.method public final a(Ljava/security/MessageDigest;)V
    .locals 1

    iget-object v0, p0, LY7;->b:Lfg;

    invoke-interface {v0, p1}, Lfg;->a(Ljava/security/MessageDigest;)V

    iget-object v0, p0, LY7;->c:Lfg;

    invoke-interface {v0, p1}, Lfg;->a(Ljava/security/MessageDigest;)V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, LY7;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, LY7;

    iget-object v0, p1, LY7;->b:Lfg;

    iget-object v2, p0, LY7;->b:Lfg;

    invoke-interface {v2, v0}, Lfg;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LY7;->c:Lfg;

    iget-object p1, p1, LY7;->c:Lfg;

    invoke-interface {v0, p1}, Lfg;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, LY7;->b:Lfg;

    invoke-interface {v0}, Lfg;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LY7;->c:Lfg;

    invoke-interface {v1}, Lfg;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DataCacheKey{sourceKey="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, LY7;->b:Lfg;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", signature="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LY7;->c:Lfg;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
