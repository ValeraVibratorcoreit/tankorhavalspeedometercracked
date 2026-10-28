.class public final Ldn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final a:LT1;

.field public final b:Lil;

.field public final c:Ljava/lang/String;

.field public final d:I

.field public final e:Loe;

.field public final f:Lse;

.field public final g:LJl;

.field public final h:Ldn;

.field public final i:Ldn;

.field public final j:Ldn;

.field public final k:J

.field public final l:J

.field public final m:Lsb;


# direct methods
.method public constructor <init>(LT1;Lil;Ljava/lang/String;ILoe;Lse;LJl;Ldn;Ldn;Ldn;JJLsb;)V
    .locals 5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    const-string v4, "request"

    invoke-static {v4, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v4, "protocol"

    invoke-static {v4, p2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v4, "message"

    invoke-static {v4, p3}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, Ldn;->a:LT1;

    iput-object v2, v0, Ldn;->b:Lil;

    iput-object v3, v0, Ldn;->c:Ljava/lang/String;

    move v1, p4

    iput v1, v0, Ldn;->d:I

    move-object v1, p5

    iput-object v1, v0, Ldn;->e:Loe;

    move-object v1, p6

    iput-object v1, v0, Ldn;->f:Lse;

    move-object v1, p7

    iput-object v1, v0, Ldn;->g:LJl;

    move-object v1, p8

    iput-object v1, v0, Ldn;->h:Ldn;

    move-object v1, p9

    iput-object v1, v0, Ldn;->i:Ldn;

    move-object v1, p10

    iput-object v1, v0, Ldn;->j:Ldn;

    move-wide/from16 v1, p11

    iput-wide v1, v0, Ldn;->k:J

    move-wide/from16 v1, p13

    iput-wide v1, v0, Ldn;->l:J

    move-object/from16 v1, p15

    iput-object v1, v0, Ldn;->m:Lsb;

    return-void
.end method

.method public static n(Ldn;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p0, p0, Ldn;->f:Lse;

    invoke-virtual {p0, p1}, Lse;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method


# virtual methods
.method public final close()V
    .locals 2

    iget-object v0, p0, Ldn;->g:LJl;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LJl;->close()V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "response is not eligible for a body and must not be closed"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Response{protocol="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ldn;->b:Lil;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", code="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ldn;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldn;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ldn;->a:LT1;

    iget-object v1, v1, LT1;->c:Ljava/lang/Object;

    check-cast v1, Lgf;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final w()Z
    .locals 2

    const/16 v0, 0xc8

    iget v1, p0, Ldn;->d:I

    if-le v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x12b

    if-lt v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public final x()Lcn;
    .locals 3

    new-instance v0, Lcn;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Ldn;->a:LT1;

    iput-object v1, v0, Lcn;->a:LT1;

    iget-object v1, p0, Ldn;->b:Lil;

    iput-object v1, v0, Lcn;->b:Lil;

    iget v1, p0, Ldn;->d:I

    iput v1, v0, Lcn;->c:I

    iget-object v1, p0, Ldn;->c:Ljava/lang/String;

    iput-object v1, v0, Lcn;->d:Ljava/lang/String;

    iget-object v1, p0, Ldn;->e:Loe;

    iput-object v1, v0, Lcn;->e:Loe;

    iget-object v1, p0, Ldn;->f:Lse;

    invoke-virtual {v1}, Lse;->c()LYa;

    move-result-object v1

    iput-object v1, v0, Lcn;->f:LYa;

    iget-object v1, p0, Ldn;->g:LJl;

    iput-object v1, v0, Lcn;->g:LJl;

    iget-object v1, p0, Ldn;->h:Ldn;

    iput-object v1, v0, Lcn;->h:Ldn;

    iget-object v1, p0, Ldn;->i:Ldn;

    iput-object v1, v0, Lcn;->i:Ldn;

    iget-object v1, p0, Ldn;->j:Ldn;

    iput-object v1, v0, Lcn;->j:Ldn;

    iget-wide v1, p0, Ldn;->k:J

    iput-wide v1, v0, Lcn;->k:J

    iget-wide v1, p0, Ldn;->l:J

    iput-wide v1, v0, Lcn;->l:J

    iget-object v1, p0, Ldn;->m:Lsb;

    iput-object v1, v0, Lcn;->m:Lsb;

    return-object v0
.end method
