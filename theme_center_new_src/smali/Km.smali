.class public final LKm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfg;


# static fields
.field public static final j:Lxh;


# instance fields
.field public final b:Luh;

.field public final c:Lfg;

.field public final d:Lfg;

.field public final e:I

.field public final f:I

.field public final g:Ljava/lang/Class;

.field public final h:Lrk;

.field public final i:Lfr;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lxh;

    const-wide/16 v1, 0x32

    invoke-direct {v0, v1, v2}, Lxh;-><init>(J)V

    sput-object v0, LKm;->j:Lxh;

    return-void
.end method

.method public constructor <init>(Luh;Lfg;Lfg;IILfr;Ljava/lang/Class;Lrk;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LKm;->b:Luh;

    iput-object p2, p0, LKm;->c:Lfg;

    iput-object p3, p0, LKm;->d:Lfg;

    iput p4, p0, LKm;->e:I

    iput p5, p0, LKm;->f:I

    iput-object p6, p0, LKm;->i:Lfr;

    iput-object p7, p0, LKm;->g:Ljava/lang/Class;

    iput-object p8, p0, LKm;->h:Lrk;

    return-void
.end method


# virtual methods
.method public final a(Ljava/security/MessageDigest;)V
    .locals 5

    iget-object v0, p0, LKm;->b:Luh;

    const-class v1, [B

    monitor-enter v0

    :try_start_0
    iget-object v2, v0, Luh;->b:Lth;

    iget-object v3, v2, LY3;->a:Ljava/lang/Object;

    check-cast v3, Ljava/util/ArrayDeque;

    invoke-virtual {v3}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LMk;

    if-nez v3, :cond_0

    invoke-virtual {v2}, Lth;->b()LMk;

    move-result-object v3

    :cond_0
    check-cast v3, Lsh;

    const/16 v2, 0x8

    iput v2, v3, Lsh;->b:I

    iput-object v1, v3, Lsh;->c:Ljava/lang/Class;

    invoke-virtual {v0, v3, v1}, Luh;->e(Lsh;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    check-cast v1, [B

    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget v2, p0, LKm;->e:I

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget v2, p0, LKm;->f:I

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    iget-object v0, p0, LKm;->d:Lfg;

    invoke-interface {v0, p1}, Lfg;->a(Ljava/security/MessageDigest;)V

    iget-object v0, p0, LKm;->c:Lfg;

    invoke-interface {v0, p1}, Lfg;->a(Ljava/security/MessageDigest;)V

    invoke-virtual {p1, v1}, Ljava/security/MessageDigest;->update([B)V

    iget-object v0, p0, LKm;->i:Lfr;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lfg;->a(Ljava/security/MessageDigest;)V

    :cond_1
    iget-object v0, p0, LKm;->h:Lrk;

    invoke-virtual {v0, p1}, Lrk;->a(Ljava/security/MessageDigest;)V

    sget-object v0, LKm;->j:Lxh;

    iget-object v2, p0, LKm;->g:Ljava/lang/Class;

    invoke-virtual {v0, v2}, Lxh;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    if-nez v3, :cond_2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lfg;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v3, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lxh;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-virtual {p1, v3}, Ljava/security/MessageDigest;->update([B)V

    iget-object p1, p0, LKm;->b:Luh;

    invoke-virtual {p1, v1}, Luh;->g(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, LKm;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, LKm;

    iget v0, p1, LKm;->f:I

    iget v2, p0, LKm;->f:I

    if-ne v2, v0, :cond_0

    iget v0, p0, LKm;->e:I

    iget v2, p1, LKm;->e:I

    if-ne v0, v2, :cond_0

    iget-object v0, p0, LKm;->i:Lfr;

    iget-object v2, p1, LKm;->i:Lfr;

    invoke-static {v0, v2}, LQr;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LKm;->g:Ljava/lang/Class;

    iget-object v2, p1, LKm;->g:Ljava/lang/Class;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LKm;->c:Lfg;

    iget-object v2, p1, LKm;->c:Lfg;

    invoke-interface {v0, v2}, Lfg;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LKm;->d:Lfg;

    iget-object v2, p1, LKm;->d:Lfg;

    invoke-interface {v0, v2}, Lfg;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LKm;->h:Lrk;

    iget-object p1, p1, LKm;->h:Lrk;

    invoke-virtual {v0, p1}, Lrk;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, LKm;->c:Lfg;

    invoke-interface {v0}, Lfg;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LKm;->d:Lfg;

    invoke-interface {v1}, Lfg;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, LKm;->e:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, LKm;->f:I

    add-int/2addr v1, v0

    iget-object v0, p0, LKm;->i:Lfr;

    if-eqz v0, :cond_0

    mul-int/lit8 v1, v1, 0x1f

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    :cond_0
    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, LKm;->g:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LKm;->h:Lrk;

    iget-object v1, v1, Lrk;->b:Lh5;

    invoke-virtual {v1}, Lh5;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ResourceCacheKey{sourceKey="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, LKm;->c:Lfg;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", signature="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LKm;->d:Lfg;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", width="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LKm;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", height="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LKm;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", decodedResourceClass="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LKm;->g:Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transformation=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LKm;->i:Lfr;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "\', options="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LKm;->h:Lrk;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
