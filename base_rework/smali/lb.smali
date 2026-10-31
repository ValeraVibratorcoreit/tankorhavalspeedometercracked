.class public final Llb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfg;


# instance fields
.field public final b:Ljava/lang/Object;

.field public final c:I

.field public final d:I

.field public final e:Ljava/lang/Class;

.field public final f:Ljava/lang/Class;

.field public final g:Lfg;

.field public final h:Ljava/util/Map;

.field public final i:Lrk;

.field public j:I


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lfg;IILh5;Ljava/lang/Class;Ljava/lang/Class;Lrk;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Argument must not be null"

    invoke-static {v0, p1}, LUd;->l(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p1, p0, Llb;->b:Ljava/lang/Object;

    const-string p1, "Signature must not be null"

    invoke-static {p1, p2}, LUd;->l(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p2, p0, Llb;->g:Lfg;

    iput p3, p0, Llb;->c:I

    iput p4, p0, Llb;->d:I

    invoke-static {v0, p5}, LUd;->l(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p5, p0, Llb;->h:Ljava/util/Map;

    const-string p1, "Resource class must not be null"

    invoke-static {p1, p6}, LUd;->l(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p6, p0, Llb;->e:Ljava/lang/Class;

    const-string p1, "Transcode class must not be null"

    invoke-static {p1, p7}, LUd;->l(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p7, p0, Llb;->f:Ljava/lang/Class;

    invoke-static {v0, p8}, LUd;->l(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p8, p0, Llb;->i:Lrk;

    return-void
.end method


# virtual methods
.method public final a(Ljava/security/MessageDigest;)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Llb;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Llb;

    iget-object v0, p1, Llb;->b:Ljava/lang/Object;

    iget-object v2, p0, Llb;->b:Ljava/lang/Object;

    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Llb;->g:Lfg;

    iget-object v2, p1, Llb;->g:Lfg;

    invoke-interface {v0, v2}, Lfg;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Llb;->d:I

    iget v2, p1, Llb;->d:I

    if-ne v0, v2, :cond_0

    iget v0, p0, Llb;->c:I

    iget v2, p1, Llb;->c:I

    if-ne v0, v2, :cond_0

    iget-object v0, p0, Llb;->h:Ljava/util/Map;

    iget-object v2, p1, Llb;->h:Ljava/util/Map;

    invoke-interface {v0, v2}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Llb;->e:Ljava/lang/Class;

    iget-object v2, p1, Llb;->e:Ljava/lang/Class;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Llb;->f:Ljava/lang/Class;

    iget-object v2, p1, Llb;->f:Ljava/lang/Class;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Llb;->i:Lrk;

    iget-object p1, p1, Llb;->i:Lrk;

    invoke-virtual {v0, p1}, Lrk;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Llb;->j:I

    if-nez v0, :cond_0

    iget-object v0, p0, Llb;->b:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    iput v0, p0, Llb;->j:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llb;->g:Lfg;

    invoke-interface {v1}, Lfg;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Llb;->c:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Llb;->d:I

    add-int/2addr v1, v0

    iput v1, p0, Llb;->j:I

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Llb;->h:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    iput v0, p0, Llb;->j:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llb;->e:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, Llb;->j:I

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Llb;->f:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    iput v0, p0, Llb;->j:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llb;->i:Lrk;

    iget-object v1, v1, Lrk;->b:Lh5;

    invoke-virtual {v1}, Lh5;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, p0, Llb;->j:I

    :cond_0
    iget v0, p0, Llb;->j:I

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "EngineKey{model="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llb;->b:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", width="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Llb;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", height="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Llb;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", resourceClass="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llb;->e:Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transcodeClass="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llb;->f:Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", signature="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llb;->g:Lfg;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", hashCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Llb;->j:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", transformations="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llb;->h:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", options="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llb;->i:Lrk;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
