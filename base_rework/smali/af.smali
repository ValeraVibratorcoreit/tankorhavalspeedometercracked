.class public final Laf;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:J

.field public b:J

.field public c:J

.field public d:J

.field public final e:Ljava/util/ArrayDeque;

.field public f:Z

.field public final g:LYe;

.field public final h:LXe;

.field public final i:LZe;

.field public final j:LZe;

.field public k:I

.field public l:Ljava/io/IOException;

.field public final m:I

.field public final n:LTe;


# direct methods
.method public constructor <init>(ILTe;ZZLse;)V
    .locals 3

    const-string v0, "connection"

    invoke-static {v0, p2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Laf;->m:I

    iput-object p2, p0, Laf;->n:LTe;

    iget-object p1, p2, LTe;->s:Lco;

    invoke-virtual {p1}, Lco;->a()I

    move-result p1

    int-to-long v0, p1

    iput-wide v0, p0, Laf;->d:J

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Laf;->e:Ljava/util/ArrayDeque;

    new-instance v0, LYe;

    iget-object p2, p2, LTe;->r:Lco;

    invoke-virtual {p2}, Lco;->a()I

    move-result p2

    int-to-long v1, p2

    invoke-direct {v0, p0, v1, v2, p4}, LYe;-><init>(Laf;JZ)V

    iput-object v0, p0, Laf;->g:LYe;

    new-instance p2, LXe;

    invoke-direct {p2, p0, p3}, LXe;-><init>(Laf;Z)V

    iput-object p2, p0, Laf;->h:LXe;

    new-instance p2, LZe;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p3}, LZe;-><init>(Ljava/lang/Object;I)V

    iput-object p2, p0, Laf;->i:LZe;

    new-instance p2, LZe;

    invoke-direct {p2, p0, p3}, LZe;-><init>(Ljava/lang/Object;I)V

    iput-object p2, p0, Laf;->j:LZe;

    if-eqz p5, :cond_1

    invoke-virtual {p0}, Laf;->g()Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    invoke-interface {p1, p5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "locally-initiated streams shouldn\'t have headers yet"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {p0}, Laf;->g()Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "remotely-initiated streams should have headers"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a()V
    .locals 2

    sget-object v0, LRr;->a:[B

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Laf;->g:LYe;

    iget-boolean v1, v0, LYe;->e:Z

    if-nez v1, :cond_1

    iget-boolean v0, v0, LYe;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Laf;->h:LXe;

    iget-boolean v1, v0, LXe;->c:Z

    if-nez v1, :cond_0

    iget-boolean v0, v0, LXe;->b:Z

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Laf;->h()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    if-eqz v0, :cond_2

    const/16 v0, 0x9

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Laf;->c(ILjava/io/IOException;)V

    goto :goto_1

    :cond_2
    if-nez v1, :cond_3

    iget-object v0, p0, Laf;->n:LTe;

    iget v1, p0, Laf;->m:I

    invoke-virtual {v0, v1}, LTe;->y(I)Laf;

    :cond_3
    :goto_1
    return-void

    :goto_2
    monitor-exit p0

    throw v0
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Laf;->h:LXe;

    iget-boolean v1, v0, LXe;->b:Z

    if-nez v1, :cond_3

    iget-boolean v0, v0, LXe;->c:Z

    if-nez v0, :cond_2

    iget v0, p0, Laf;->k:I

    if-eqz v0, :cond_1

    iget-object v0, p0, Laf;->l:Ljava/io/IOException;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, LBp;

    iget v1, p0, Laf;->k:I

    invoke-static {v1}, LVo;->i(I)V

    invoke-direct {v0, v1}, LBp;-><init>(I)V

    :goto_0
    throw v0

    :cond_1
    return-void

    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "stream finished"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "stream closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c(ILjava/io/IOException;)V
    .locals 1

    const-string v0, "rstStatusCode"

    invoke-static {p1, v0}, LVo;->j(ILjava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Laf;->d(ILjava/io/IOException;)Z

    move-result p2

    if-nez p2, :cond_0

    return-void

    :cond_0
    iget-object p2, p0, Laf;->n:LTe;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "statusCode"

    invoke-static {p1, v0}, LVo;->j(ILjava/lang/String;)V

    iget-object p2, p2, LTe;->y:Lbf;

    iget v0, p0, Laf;->m:I

    invoke-virtual {p2, v0, p1}, Lbf;->A(II)V

    return-void
.end method

.method public final d(ILjava/io/IOException;)Z
    .locals 2

    sget-object v0, LRr;->a:[B

    monitor-enter p0

    :try_start_0
    iget v0, p0, Laf;->k:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    monitor-exit p0

    return v1

    :cond_0
    :try_start_1
    iget-object v0, p0, Laf;->g:LYe;

    iget-boolean v0, v0, LYe;->e:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Laf;->h:LXe;

    iget-boolean v0, v0, LXe;->c:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_1

    monitor-exit p0

    return v1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    :try_start_2
    iput p1, p0, Laf;->k:I

    iput-object p2, p0, Laf;->l:Ljava/io/IOException;

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    iget-object p1, p0, Laf;->n:LTe;

    iget p2, p0, Laf;->m:I

    invoke-virtual {p1, p2}, LTe;->y(I)Laf;

    const/4 p1, 0x1

    return p1

    :goto_0
    monitor-exit p0

    throw p1
.end method

.method public final e(I)V
    .locals 2

    const-string v0, "errorCode"

    invoke-static {p1, v0}, LVo;->j(ILjava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Laf;->d(ILjava/io/IOException;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Laf;->n:LTe;

    iget v1, p0, Laf;->m:I

    invoke-virtual {v0, v1, p1}, LTe;->C(II)V

    return-void
.end method

.method public final f()LXe;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Laf;->f:Z

    if-nez v0, :cond_1

    invoke-virtual {p0}, Laf;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "reply before requesting the sink"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit p0

    iget-object v0, p0, Laf;->h:LXe;

    return-object v0

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method public final g()Z
    .locals 4

    iget v0, p0, Laf;->m:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iget-object v3, p0, Laf;->n:LTe;

    iget-boolean v3, v3, LTe;->a:Z

    if-ne v3, v0, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    return v1
.end method

.method public final declared-synchronized h()Z
    .locals 3

    monitor-enter p0

    :try_start_0
    iget v0, p0, Laf;->k:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    monitor-exit p0

    return v1

    :cond_0
    :try_start_1
    iget-object v0, p0, Laf;->g:LYe;

    iget-boolean v2, v0, LYe;->e:Z

    if-nez v2, :cond_1

    iget-boolean v0, v0, LYe;->c:Z

    if-eqz v0, :cond_3

    :cond_1
    iget-object v0, p0, Laf;->h:LXe;

    iget-boolean v2, v0, LXe;->c:Z

    if-nez v2, :cond_2

    iget-boolean v0, v0, LXe;->b:Z

    if-eqz v0, :cond_3

    :cond_2
    iget-boolean v0, p0, Laf;->f:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_3

    monitor-exit p0

    return v1

    :cond_3
    monitor-exit p0

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final i(Lse;Z)V
    .locals 2

    const-string v0, "headers"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v0, LRr;->a:[B

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Laf;->f:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Laf;->g:LYe;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_0
    iput-boolean v1, p0, Laf;->f:Z

    iget-object v0, p0, Laf;->e:Ljava/util/ArrayDeque;

    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    :goto_1
    if-eqz p2, :cond_2

    iget-object p1, p0, Laf;->g:LYe;

    iput-boolean v1, p1, LYe;->e:Z

    :cond_2
    invoke-virtual {p0}, Laf;->h()Z

    move-result p1

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    if-nez p1, :cond_3

    iget-object p1, p0, Laf;->n:LTe;

    iget p2, p0, Laf;->m:I

    invoke-virtual {p1, p2}, LTe;->y(I)Laf;

    :cond_3
    return-void

    :goto_2
    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized j(I)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "errorCode"

    invoke-static {p1, v0}, LVo;->j(ILjava/lang/String;)V

    iget v0, p0, Laf;->k:I

    if-nez v0, :cond_0

    iput p1, p0, Laf;->k:I

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0

    throw p1
.end method

.method public final k()V
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    new-instance v0, Ljava/io/InterruptedIOException;

    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    throw v0
.end method
