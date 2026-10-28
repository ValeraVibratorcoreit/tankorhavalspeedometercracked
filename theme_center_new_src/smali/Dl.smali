.class public final LDl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public final a:LHl;

.field public final b:Lpa;

.field public final c:LZe;

.field public final d:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public e:Ljava/lang/Object;

.field public f:Lub;

.field public g:LGl;

.field public h:Z

.field public i:Lsb;

.field public j:Z

.field public k:Z

.field public l:Z

.field public volatile m:Z

.field public volatile n:Lsb;

.field public volatile o:LGl;

.field public final p:LPj;

.field public final q:LT1;

.field public final r:Z


# direct methods
.method public constructor <init>(LPj;LT1;)V
    .locals 2

    const-string v0, "client"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDl;->p:LPj;

    iput-object p2, p0, LDl;->q:LT1;

    const/4 p2, 0x0

    iput-boolean p2, p0, LDl;->r:Z

    iget-object v0, p1, LPj;->b:Lk0;

    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;

    check-cast v0, LHl;

    iput-object v0, p0, LDl;->a:LHl;

    iget-object p1, p1, LPj;->e:LVi;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, LVi;->a:Ljava/lang/Object;

    check-cast p1, Lpa;

    iput-object p1, p0, LDl;->b:Lpa;

    new-instance p1, LZe;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, LZe;-><init>(Ljava/lang/Object;I)V

    int-to-long v0, p2

    sget-object p2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, p2}, LJq;->g(JLjava/util/concurrent/TimeUnit;)LJq;

    iput-object p1, p0, LDl;->c:LZe;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object p1, p0, LDl;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p1, 0x1

    iput-boolean p1, p0, LDl;->l:Z

    return-void
.end method


# virtual methods
.method public final a(LGl;)V
    .locals 2

    sget-object v0, LRr;->a:[B

    iget-object v0, p0, LDl;->g:LGl;

    if-nez v0, :cond_0

    iput-object p1, p0, LDl;->g:LGl;

    iget-object p1, p1, LGl;->o:Ljava/util/ArrayList;

    new-instance v0, LCl;

    iget-object v1, p0, LDl;->e:Ljava/lang/Object;

    invoke-direct {v0, p0, v1}, LCl;-><init>(LDl;Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    sget-object v0, LRr;->a:[B

    iget-object v0, p0, LDl;->g:LGl;

    if-eqz v0, :cond_3

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, LDl;->h()Ljava/net/Socket;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    iget-object v0, p0, LDl;->g:LGl;

    if-nez v0, :cond_1

    if-eqz v1, :cond_0

    invoke-static {v1}, LRr;->e(Ljava/net/Socket;)V

    :cond_0
    iget-object v0, p0, LDl;->b:Lpa;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    const-string p1, "Check failed."

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    :cond_3
    :goto_0
    iget-boolean v0, p0, LDl;->h:Z

    if-eqz v0, :cond_4

    :goto_1
    move-object v0, p1

    goto :goto_2

    :cond_4
    iget-object v0, p0, LDl;->c:LZe;

    invoke-virtual {v0}, Ln3;->i()Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_1

    :cond_5
    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_6

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_6
    :goto_2
    if-eqz p1, :cond_7

    iget-object p1, p0, LDl;->b:Lpa;

    invoke-static {v0}, LTf;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_3

    :cond_7
    iget-object p1, p0, LDl;->b:Lpa;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_3
    return-object v0
.end method

.method public final c()Ldn;
    .locals 3

    iget-object v0, p0, LDl;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LDl;->c:LZe;

    invoke-virtual {v0}, Ln3;->h()V

    sget-object v0, LGk;->a:LGk;

    sget-object v0, LGk;->a:LGk;

    invoke-virtual {v0}, LGk;->g()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, LDl;->e:Ljava/lang/Object;

    iget-object v0, p0, LDl;->b:Lpa;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    iget-object v0, p0, LDl;->p:LPj;

    iget-object v0, v0, LPj;->a:Ljj;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v1, v0, Ljj;->d:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayDeque;

    invoke-virtual {v1, p0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    monitor-exit v0

    invoke-virtual {p0}, LDl;->e()Ldn;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v1, p0, LDl;->p:LPj;

    iget-object v1, v1, LPj;->a:Ljj;

    invoke-virtual {v1, p0}, Ljj;->l(LDl;)V

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v1

    :try_start_3
    monitor-exit v0

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_0
    iget-object v1, p0, LDl;->p:LPj;

    iget-object v1, v1, LPj;->a:Ljj;

    invoke-virtual {v1, p0}, Ljj;->l(LDl;)V

    throw v0

    :cond_0
    const-string v0, "Already Executed"

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final clone()Ljava/lang/Object;
    .locals 3

    new-instance v0, LDl;

    iget-object v1, p0, LDl;->p:LPj;

    iget-object v2, p0, LDl;->q:LT1;

    invoke-direct {v0, v1, v2}, LDl;-><init>(LPj;LT1;)V

    return-object v0
.end method

.method public final d(Z)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LDl;->l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    monitor-exit p0

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object p1, p0, LDl;->n:Lsb;

    if-eqz p1, :cond_0

    iget-object v1, p1, Lsb;->f:Ltb;

    invoke-interface {v1}, Ltb;->cancel()V

    const/4 v1, 0x1

    iget-object v2, p1, Lsb;->c:LDl;

    invoke-virtual {v2, p1, v1, v1, v0}, LDl;->f(Lsb;ZZLjava/io/IOException;)Ljava/io/IOException;

    :cond_0
    iput-object v0, p0, LDl;->i:Lsb;

    return-void

    :cond_1
    :try_start_1
    const-string p1, "released"

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final e()Ldn;
    .locals 11

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, LDl;->p:LPj;

    iget-object v0, v0, LPj;->c:Ljava/util/List;

    invoke-static {v2, v0}, Lq6;->v0(Ljava/util/ArrayList;Ljava/lang/Iterable;)V

    new-instance v0, LJ4;

    iget-object v1, p0, LDl;->p:LPj;

    invoke-direct {v0, v1}, LJ4;-><init>(LPj;)V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, LJ4;

    iget-object v1, p0, LDl;->p:LPj;

    iget-object v1, v1, LPj;->j:Lpa;

    invoke-direct {v0, v1}, LJ4;-><init>(Lpa;)V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lg5;

    iget-object v1, p0, LDl;->p:LPj;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lg5;-><init>(I)V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v0, Lg5;->b:Lg5;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-boolean v0, p0, LDl;->r:Z

    if-nez v0, :cond_0

    iget-object v0, p0, LDl;->p:LPj;

    iget-object v0, v0, LPj;->d:Ljava/util/List;

    invoke-static {v2, v0}, Lq6;->v0(Ljava/util/ArrayList;Ljava/lang/Iterable;)V

    :cond_0
    new-instance v0, Lk5;

    iget-boolean v1, p0, LDl;->r:Z

    invoke-direct {v0, v1}, Lk5;-><init>(Z)V

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v9, LIl;

    iget-object v5, p0, LDl;->q:LT1;

    iget-object v0, p0, LDl;->p:LPj;

    iget v6, v0, LPj;->v:I

    iget v7, v0, LPj;->w:I

    iget v8, v0, LPj;->x:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, v9

    move-object v1, p0

    invoke-direct/range {v0 .. v8}, LIl;-><init>(LDl;Ljava/util/List;ILsb;LT1;III)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, LDl;->q:LT1;

    invoke-virtual {v9, v2}, LIl;->b(LT1;)Ldn;

    move-result-object v2

    iget-boolean v3, p0, LDl;->m:Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_1

    invoke-virtual {p0, v0}, LDl;->g(Ljava/io/IOException;)Ljava/io/IOException;

    return-object v2

    :cond_1
    :try_start_1
    invoke-static {v2}, LRr;->d(Ljava/io/Closeable;)V

    new-instance v2, Ljava/io/IOException;

    const-string v3, "Canceled"

    invoke-direct {v2, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v2

    goto :goto_0

    :catch_0
    move-exception v1

    const/4 v2, 0x1

    :try_start_2
    invoke-virtual {p0, v1}, LDl;->g(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v1

    if-nez v1, :cond_2

    new-instance v1, Ljava/lang/NullPointerException;

    const-string v3, "null cannot be cast to non-null type kotlin.Throwable"

    invoke-direct {v1, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_1
    move-exception v1

    move v10, v2

    move-object v2, v1

    move v1, v10

    goto :goto_0

    :cond_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_0
    if-nez v1, :cond_3

    invoke-virtual {p0, v0}, LDl;->g(Ljava/io/IOException;)Ljava/io/IOException;

    :cond_3
    throw v2
.end method

.method public final f(Lsb;ZZLjava/io/IOException;)Ljava/io/IOException;
    .locals 2

    const-string v0, "exchange"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, LDl;->n:Lsb;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x1

    xor-int/2addr p1, v0

    if-eqz p1, :cond_0

    return-object p4

    :cond_0
    monitor-enter p0

    const/4 p1, 0x0

    if-eqz p2, :cond_1

    :try_start_0
    iget-boolean v1, p0, LDl;->j:Z

    if-nez v1, :cond_2

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_0
    if-eqz p3, :cond_7

    iget-boolean v1, p0, LDl;->k:Z

    if-eqz v1, :cond_7

    :cond_2
    if-eqz p2, :cond_3

    iput-boolean p1, p0, LDl;->j:Z

    :cond_3
    if-eqz p3, :cond_4

    iput-boolean p1, p0, LDl;->k:Z

    :cond_4
    iget-boolean p2, p0, LDl;->j:Z

    if-nez p2, :cond_5

    iget-boolean p3, p0, LDl;->k:Z

    if-nez p3, :cond_5

    move p3, v0

    goto :goto_1

    :cond_5
    move p3, p1

    :goto_1
    if-nez p2, :cond_6

    iget-boolean p2, p0, LDl;->k:Z

    if-nez p2, :cond_6

    iget-boolean p2, p0, LDl;->l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p2, :cond_6

    move p1, v0

    :cond_6
    move p2, p1

    move p1, p3

    goto :goto_3

    :goto_2
    monitor-exit p0

    throw p1

    :cond_7
    move p2, p1

    :goto_3
    monitor-exit p0

    if-eqz p1, :cond_8

    const/4 p1, 0x0

    iput-object p1, p0, LDl;->n:Lsb;

    iget-object p1, p0, LDl;->g:LGl;

    if-eqz p1, :cond_8

    monitor-enter p1

    :try_start_1
    iget p3, p1, LGl;->l:I

    add-int/2addr p3, v0

    iput p3, p1, LGl;->l:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit p1

    goto :goto_4

    :catchall_1
    move-exception p2

    monitor-exit p1

    throw p2

    :cond_8
    :goto_4
    if-eqz p2, :cond_9

    invoke-virtual {p0, p4}, LDl;->b(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    return-object p1

    :cond_9
    return-object p4
.end method

.method public final g(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LDl;->l:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-boolean v1, p0, LDl;->l:Z

    iget-boolean v0, p0, LDl;->j:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, LDl;->k:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    if-eqz v1, :cond_1

    invoke-virtual {p0, p1}, LDl;->b(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    :cond_1
    return-object p1

    :goto_1
    monitor-exit p0

    throw p1
.end method

.method public final h()Ljava/net/Socket;
    .locals 7

    const/4 v0, 0x1

    iget-object v1, p0, LDl;->g:LGl;

    invoke-static {v1}, LTf;->f(Ljava/lang/Object;)V

    sget-object v2, LRr;->a:[B

    iget-object v2, v1, LGl;->o:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, -0x1

    if-eqz v5, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/ref/Reference;

    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LDl;

    invoke-static {v5, p0}, LTf;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    add-int/2addr v4, v0

    goto :goto_0

    :cond_1
    move v4, v6

    :goto_1
    if-eq v4, v6, :cond_6

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    const/4 v3, 0x0

    iput-object v3, p0, LDl;->g:LGl;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    iput-wide v4, v1, LGl;->p:J

    iget-object v2, p0, LDl;->a:LHl;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, LRr;->a:[B

    iget-boolean v4, v1, LGl;->i:Z

    iget-object v5, v2, LHl;->b:Ljq;

    if-nez v4, :cond_3

    iget v4, v2, LHl;->e:I

    if-nez v4, :cond_2

    goto :goto_2

    :cond_2
    const-wide/16 v0, 0x0

    iget-object v2, v2, LHl;->c:LRe;

    invoke-virtual {v5, v2, v0, v1}, Ljq;->c(Liq;J)V

    goto :goto_3

    :cond_3
    :goto_2
    iput-boolean v0, v1, LGl;->i:Z

    iget-object v0, v2, LHl;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v5}, Ljq;->a()V

    :cond_4
    iget-object v0, v1, LGl;->c:Ljava/net/Socket;

    invoke-static {v0}, LTf;->f(Ljava/lang/Object;)V

    return-object v0

    :cond_5
    :goto_3
    return-object v3

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Check failed."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
