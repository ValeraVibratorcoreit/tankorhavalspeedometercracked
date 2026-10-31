.class public final LGe;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltb;


# instance fields
.field public a:LP4;

.field public b:LO4;

.field public c:I

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LPj;LGl;LP4;LO4;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {v0, p2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "source"

    invoke-static {v0, p3}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "sink"

    invoke-static {v0, p4}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGe;->f:Ljava/lang/Object;

    iput-object p2, p0, LGe;->g:Ljava/lang/Object;

    iput-object p3, p0, LGe;->a:LP4;

    iput-object p4, p0, LGe;->b:LO4;

    .line 2
    new-instance p1, LO5;

    invoke-direct {p1, p3}, LO5;-><init>(LP4;)V

    iput-object p1, p0, LGe;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lkq;)V
    .locals 1

    const-string v0, "taskRunner"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGe;->g:Ljava/lang/Object;

    .line 4
    sget-object p1, LKe;->a:LJe;

    iput-object p1, p0, LGe;->f:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(LT1;J)LMo;
    .locals 5

    const-string v0, "request"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object p1, p1, LT1;->e:Ljava/lang/Object;

    check-cast p1, Lse;

    const-string v0, "Transfer-Encoding"

    invoke-virtual {p1, v0}, Lse;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "chunked"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    const-string v0, "state: "

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz p1, :cond_1

    iget p1, p0, LGe;->c:I

    if-ne p1, v2, :cond_0

    iput v1, p0, LGe;->c:I

    new-instance p1, LBe;

    invoke-direct {p1, p0}, LBe;-><init>(LGe;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p2, p0, LGe;->c:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    const-wide/16 v3, -0x1

    cmp-long p1, p2, v3

    if-eqz p1, :cond_3

    iget p1, p0, LGe;->c:I

    if-ne p1, v2, :cond_2

    iput v1, p0, LGe;->c:I

    new-instance p1, LEe;

    invoke-direct {p1, p0}, LEe;-><init>(LGe;)V

    :goto_0
    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p2, p0, LGe;->c:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot stream a request body without chunked encoding or a known content length!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(LT1;)V
    .locals 4

    const-string v0, "request"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, LGe;->g:Ljava/lang/Object;

    check-cast v0, LGl;

    iget-object v0, v0, LGl;->q:Lfn;

    iget-object v0, v0, Lfn;->b:Ljava/net/Proxy;

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    const-string v1, "connection.route().proxy.type()"

    invoke-static {v1, v0}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p1, LT1;->d:Ljava/io/Serializable;

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p1, LT1;->c:Ljava/lang/Object;

    check-cast v2, Lgf;

    iget-boolean v3, v2, Lgf;->a:Z

    if-nez v3, :cond_0

    sget-object v3, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne v0, v3, :cond_0

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lgf;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2}, Lgf;->d()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x3f

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_1
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    const-string v0, " HTTP/1.1"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v1, v0}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object p1, p1, LT1;->e:Ljava/lang/Object;

    check-cast p1, Lse;

    invoke-virtual {p0, p1, v0}, LGe;->j(Lse;Ljava/lang/String;)V

    return-void
.end method

.method public c(Ldn;)LXo;
    .locals 8

    invoke-static {p1}, Lef;->a(Ldn;)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, LGe;->i(J)LDe;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string v0, "Transfer-Encoding"

    invoke-static {p1, v0}, Ldn;->n(Ldn;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "chunked"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    const-string v1, "state: "

    const/4 v2, 0x5

    const/4 v3, 0x4

    if-eqz v0, :cond_2

    iget-object p1, p1, Ldn;->a:LT1;

    iget-object p1, p1, LT1;->c:Ljava/lang/Object;

    check-cast p1, Lgf;

    iget v0, p0, LGe;->c:I

    if-ne v0, v3, :cond_1

    iput v2, p0, LGe;->c:I

    new-instance v0, LCe;

    invoke-direct {v0, p0, p1}, LCe;-><init>(LGe;Lgf;)V

    move-object p1, v0

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, p0, LGe;->c:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {p1}, LRr;->k(Ldn;)J

    move-result-wide v4

    const-wide/16 v6, -0x1

    cmp-long p1, v4, v6

    if-eqz p1, :cond_3

    invoke-virtual {p0, v4, v5}, LGe;->i(J)LDe;

    move-result-object p1

    goto :goto_0

    :cond_3
    iget p1, p0, LGe;->c:I

    if-ne p1, v3, :cond_4

    iput v2, p0, LGe;->c:I

    iget-object p1, p0, LGe;->g:Ljava/lang/Object;

    check-cast p1, LGl;

    invoke-virtual {p1}, LGl;->k()V

    new-instance p1, LFe;

    invoke-direct {p1, p0}, LAe;-><init>(LGe;)V

    :goto_0
    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, p0, LGe;->c:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, LGe;->g:Ljava/lang/Object;

    check-cast v0, LGl;

    iget-object v0, v0, LGl;->b:Ljava/net/Socket;

    if-eqz v0, :cond_0

    invoke-static {v0}, LRr;->e(Ljava/net/Socket;)V

    :cond_0
    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, LGe;->b:LO4;

    invoke-interface {v0}, LO4;->flush()V

    return-void
.end method

.method public e()V
    .locals 1

    iget-object v0, p0, LGe;->b:LO4;

    invoke-interface {v0}, LO4;->flush()V

    return-void
.end method

.method public f(Z)Lcn;
    .locals 11

    iget-object v0, p0, LGe;->d:Ljava/lang/Object;

    check-cast v0, LO5;

    iget v1, p0, LGe;->c:I

    const/4 v2, 0x1

    const/4 v3, 0x3

    if-eq v1, v2, :cond_1

    if-ne v1, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "state: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, p0, LGe;->c:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    const/4 v1, 0x0

    :try_start_0
    iget-object v2, v0, LO5;->c:Ljava/lang/Object;

    check-cast v2, LP4;

    iget-wide v4, v0, LO5;->b:J

    invoke-interface {v2, v4, v5}, LP4;->h(J)Ljava/lang/String;

    move-result-object v2

    iget-wide v4, v0, LO5;->b:J

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v6

    int-to-long v6, v6

    sub-long/2addr v4, v6

    iput-wide v4, v0, LO5;->b:J

    invoke-static {v2}, Lmk;->E(Ljava/lang/String;)LZ1;

    move-result-object v2
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    iget v4, v2, LZ1;->b:I

    :try_start_1
    new-instance v5, Lcn;

    invoke-direct {v5}, Lcn;-><init>()V

    iget-object v6, v2, LZ1;->c:Ljava/lang/Object;

    check-cast v6, Lil;

    iput-object v6, v5, Lcn;->b:Lil;

    iput v4, v5, Lcn;->c:I

    iget-object v2, v2, LZ1;->d:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iput-object v2, v5, Lcn;->d:Ljava/lang/String;

    invoke-virtual {v0}, LO5;->f()Lse;

    move-result-object v0

    invoke-virtual {v0}, Lse;->c()LYa;

    move-result-object v0

    iput-object v0, v5, Lcn;->f:LYa;

    const/16 v0, 0x64

    if-eqz p1, :cond_2

    if-ne v4, v0, :cond_2

    goto :goto_2

    :cond_2
    if-ne v4, v0, :cond_3

    iput v3, p0, LGe;->c:I

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_3

    :cond_3
    const/4 p1, 0x4

    iput p1, p0, LGe;->c:I
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0

    :goto_1
    move-object v1, v5

    :goto_2
    return-object v1

    :goto_3
    iget-object v0, p0, LGe;->g:Ljava/lang/Object;

    check-cast v0, LGl;

    iget-object v0, v0, LGl;->q:Lfn;

    iget-object v0, v0, Lfn;->a:LI0;

    iget-object v0, v0, LI0;->a:Lgf;

    const-string v2, "/..."

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_2
    new-instance v3, Lff;

    invoke-direct {v3}, Lff;-><init>()V

    invoke-virtual {v3, v0, v2}, Lff;->d(Lgf;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1

    move-object v1, v3

    :catch_1
    invoke-static {v1}, LTf;->f(Ljava/lang/Object;)V

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-string v2, ""

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, " \"\':;<=>@[]^`{}|/\\?#"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v10, 0xfb

    invoke-static/range {v2 .. v10}, Lh8;->g(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lff;->e:Ljava/lang/Object;

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-string v2, ""

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, " \"\':;<=>@[]^`{}|/\\?#"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v10, 0xfb

    invoke-static/range {v2 .. v10}, Lh8;->g(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lff;->f:Ljava/lang/Object;

    invoke-virtual {v1}, Lff;->a()Lgf;

    move-result-object v0

    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "unexpected end of stream on "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Lgf;->i:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public g(Ldn;)J
    .locals 2

    invoke-static {p1}, Lef;->a(Ldn;)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "Transfer-Encoding"

    invoke-static {p1, v0}, Ldn;->n(Ldn;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "chunked"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-wide/16 v0, -0x1

    goto :goto_0

    :cond_1
    invoke-static {p1}, LRr;->k(Ldn;)J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public h()LGl;
    .locals 1

    iget-object v0, p0, LGe;->g:Ljava/lang/Object;

    check-cast v0, LGl;

    return-object v0
.end method

.method public i(J)LDe;
    .locals 2

    iget v0, p0, LGe;->c:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x5

    iput v0, p0, LGe;->c:I

    new-instance v0, LDe;

    invoke-direct {v0, p0, p1, p2}, LDe;-><init>(LGe;J)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "state: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p2, p0, LGe;->c:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public j(Lse;Ljava/lang/String;)V
    .locals 5

    const-string v0, "headers"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "requestLine"

    invoke-static {v0, p2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iget v0, p0, LGe;->c:I

    if-nez v0, :cond_1

    iget-object v0, p0, LGe;->b:LO4;

    invoke-interface {v0, p2}, LO4;->m(Ljava/lang/String;)LO4;

    move-result-object p2

    const-string v1, "\r\n"

    invoke-interface {p2, v1}, LO4;->m(Ljava/lang/String;)LO4;

    invoke-virtual {p1}, Lse;->size()I

    move-result p2

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p2, :cond_0

    invoke-virtual {p1, v2}, Lse;->b(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, LO4;->m(Ljava/lang/String;)LO4;

    move-result-object v3

    const-string v4, ": "

    invoke-interface {v3, v4}, LO4;->m(Ljava/lang/String;)LO4;

    move-result-object v3

    invoke-virtual {p1, v2}, Lse;->d(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, LO4;->m(Ljava/lang/String;)LO4;

    move-result-object v3

    invoke-interface {v3, v1}, LO4;->m(Ljava/lang/String;)LO4;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {v0, v1}, LO4;->m(Ljava/lang/String;)LO4;

    const/4 p1, 0x1

    iput p1, p0, LGe;->c:I

    return-void

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "state: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p2, p0, LGe;->c:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
