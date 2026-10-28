.class public final LTe;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final B:Lco;


# instance fields
.field public final A:Ljava/util/LinkedHashSet;

.field public final a:Z

.field public final b:LKe;

.field public final c:Ljava/util/LinkedHashMap;

.field public final d:Ljava/lang/String;

.field public e:I

.field public f:I

.field public g:Z

.field public final h:Lkq;

.field public final i:Ljq;

.field public final j:Ljq;

.field public final k:Ljq;

.field public final l:Lpa;

.field public m:J

.field public n:J

.field public o:J

.field public p:J

.field public q:J

.field public final r:Lco;

.field public s:Lco;

.field public t:J

.field public u:J

.field public v:J

.field public w:J

.field public final x:Ljava/net/Socket;

.field public final y:Lbf;

.field public final z:LNe;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lco;

    invoke-direct {v0}, Lco;-><init>()V

    const/4 v1, 0x7

    const v2, 0xffff

    invoke-virtual {v0, v1, v2}, Lco;->c(II)V

    const/4 v1, 0x5

    const/16 v2, 0x4000

    invoke-virtual {v0, v1, v2}, Lco;->c(II)V

    sput-object v0, LTe;->B:Lco;

    return-void
.end method

.method public constructor <init>(LGe;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, LTe;->a:Z

    iget-object v1, p1, LGe;->f:Ljava/lang/Object;

    check-cast v1, LKe;

    iput-object v1, p0, LTe;->b:LKe;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v1, p0, LTe;->c:Ljava/util/LinkedHashMap;

    iget-object v1, p1, LGe;->e:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    iput-object v1, p0, LTe;->d:Ljava/lang/String;

    const/4 v3, 0x3

    iput v3, p0, LTe;->f:I

    iget-object v3, p1, LGe;->g:Ljava/lang/Object;

    check-cast v3, Lkq;

    iput-object v3, p0, LTe;->h:Lkq;

    invoke-virtual {v3}, Lkq;->f()Ljq;

    move-result-object v4

    iput-object v4, p0, LTe;->i:Ljq;

    invoke-virtual {v3}, Lkq;->f()Ljq;

    move-result-object v5

    iput-object v5, p0, LTe;->j:Ljq;

    invoke-virtual {v3}, Lkq;->f()Ljq;

    move-result-object v3

    iput-object v3, p0, LTe;->k:Ljq;

    sget-object v3, Lpa;->j:Lpa;

    iput-object v3, p0, LTe;->l:Lpa;

    new-instance v3, Lco;

    invoke-direct {v3}, Lco;-><init>()V

    const/4 v5, 0x7

    const/high16 v6, 0x1000000

    invoke-virtual {v3, v5, v6}, Lco;->c(II)V

    iput-object v3, p0, LTe;->r:Lco;

    sget-object v3, LTe;->B:Lco;

    iput-object v3, p0, LTe;->s:Lco;

    invoke-virtual {v3}, Lco;->a()I

    move-result v3

    int-to-long v5, v3

    iput-wide v5, p0, LTe;->w:J

    iget-object v3, p1, LGe;->d:Ljava/lang/Object;

    check-cast v3, Ljava/net/Socket;

    if-eqz v3, :cond_3

    iput-object v3, p0, LTe;->x:Ljava/net/Socket;

    new-instance v3, Lbf;

    iget-object v5, p1, LGe;->b:LO4;

    if-eqz v5, :cond_2

    invoke-direct {v3, v5, v0}, Lbf;-><init>(LO4;Z)V

    iput-object v3, p0, LTe;->y:Lbf;

    new-instance v3, LNe;

    new-instance v5, LWe;

    iget-object v6, p1, LGe;->a:LP4;

    if-eqz v6, :cond_1

    invoke-direct {v5, v6, v0}, LWe;-><init>(LP4;Z)V

    invoke-direct {v3, p0, v5}, LNe;-><init>(LTe;LWe;)V

    iput-object v3, p0, LTe;->z:LNe;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, LTe;->A:Ljava/util/LinkedHashSet;

    iget p1, p1, LGe;->c:I

    if-eqz p1, :cond_0

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    int-to-long v2, p1

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v2

    const-string p1, " ping"

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, LIe;

    invoke-direct {v0, p1, p0, v2, v3}, LIe;-><init>(Ljava/lang/String;LTe;J)V

    invoke-virtual {v4, v0, v2, v3}, Ljq;->c(Liq;J)V

    :cond_0
    return-void

    :cond_1
    const-string p1, "source"

    invoke-static {p1}, LTf;->a0(Ljava/lang/String;)V

    throw v2

    :cond_2
    const-string p1, "sink"

    invoke-static {p1}, LTf;->a0(Ljava/lang/String;)V

    throw v2

    :cond_3
    const-string p1, "socket"

    invoke-static {p1}, LTf;->a0(Ljava/lang/String;)V

    throw v2

    :cond_4
    const-string p1, "connectionName"

    invoke-static {p1}, LTf;->a0(Ljava/lang/String;)V

    throw v2
.end method


# virtual methods
.method public final declared-synchronized A(J)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-wide v0, p0, LTe;->t:J

    add-long/2addr v0, p1

    iput-wide v0, p0, LTe;->t:J

    iget-wide p1, p0, LTe;->u:J

    sub-long/2addr v0, p1

    iget-object p1, p0, LTe;->r:Lco;

    invoke-virtual {p1}, Lco;->a()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    int-to-long p1, p1

    cmp-long p1, v0, p1

    if-ltz p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, v0, v1, p1}, LTe;->D(JI)V

    iget-wide p1, p0, LTe;->u:J

    add-long/2addr p1, v0

    iput-wide p1, p0, LTe;->u:J
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

.method public final B(IZLL4;J)V
    .locals 8

    const-wide/16 v0, 0x0

    cmp-long v2, p4, v0

    const/4 v3, 0x0

    if-nez v2, :cond_0

    iget-object p4, p0, LTe;->y:Lbf;

    invoke-virtual {p4, p2, p1, p3, v3}, Lbf;->w(ZILL4;I)V

    return-void

    :cond_0
    :goto_0
    cmp-long v2, p4, v0

    if-lez v2, :cond_4

    monitor-enter p0

    :goto_1
    :try_start_0
    iget-wide v4, p0, LTe;->v:J

    iget-wide v6, p0, LTe;->w:J

    cmp-long v2, v4, v6

    if-ltz v2, :cond_2

    iget-object v2, p0, LTe;->c:Ljava/util/LinkedHashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Ljava/lang/Object;->wait()V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "stream closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    sub-long/2addr v6, v4

    :try_start_1
    invoke-static {p4, p5, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    long-to-int v2, v4

    iget-object v4, p0, LTe;->y:Lbf;

    iget v4, v4, Lbf;->b:I

    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    iget-wide v4, p0, LTe;->v:J

    int-to-long v6, v2

    add-long/2addr v4, v6

    iput-wide v4, p0, LTe;->v:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    sub-long/2addr p4, v6

    iget-object v4, p0, LTe;->y:Lbf;

    if-eqz p2, :cond_3

    cmp-long v5, p4, v0

    if-nez v5, :cond_3

    const/4 v5, 0x1

    goto :goto_2

    :cond_3
    move v5, v3

    :goto_2
    invoke-virtual {v4, v5, p1, p3, v2}, Lbf;->w(ZILL4;I)V

    goto :goto_0

    :catch_0
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    new-instance p1, Ljava/io/InterruptedIOException;

    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_3
    monitor-exit p0

    throw p1

    :cond_4
    return-void
.end method

.method public final C(II)V
    .locals 8

    const-string v0, "errorCode"

    invoke-static {p2, v0}, LVo;->j(ILjava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LTe;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] writeSynReset"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v0, LQe;

    const/4 v7, 0x1

    move-object v2, v0

    move-object v4, p0

    move v5, p1

    move v6, p2

    invoke-direct/range {v2 .. v7}, LQe;-><init>(Ljava/lang/String;Ljava/lang/Object;III)V

    iget-object p1, p0, LTe;->i:Ljq;

    const-wide/16 v1, 0x0

    invoke-virtual {p1, v0, v1, v2}, Ljq;->c(Liq;J)V

    return-void
.end method

.method public final D(JI)V
    .locals 8

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LTe;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] windowUpdate"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v0, LSe;

    move-object v2, v0

    move-object v4, p0

    move v5, p3

    move-wide v6, p1

    invoke-direct/range {v2 .. v7}, LSe;-><init>(Ljava/lang/String;LTe;IJ)V

    iget-object p1, p0, LTe;->i:Ljq;

    const-wide/16 p2, 0x0

    invoke-virtual {p1, v0, p2, p3}, Ljq;->c(Liq;J)V

    return-void
.end method

.method public final close()V
    .locals 3

    const/16 v0, 0x9

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {p0, v2, v0, v1}, LTe;->n(IILjava/io/IOException;)V

    return-void
.end method

.method public final flush()V
    .locals 1

    iget-object v0, p0, LTe;->y:Lbf;

    invoke-virtual {v0}, Lbf;->flush()V

    return-void
.end method

.method public final n(IILjava/io/IOException;)V
    .locals 3

    const-string v0, "connectionCode"

    invoke-static {p1, v0}, LVo;->j(ILjava/lang/String;)V

    const-string v0, "streamCode"

    invoke-static {p2, v0}, LVo;->j(ILjava/lang/String;)V

    sget-object v0, LRr;->a:[B

    :try_start_0
    invoke-virtual {p0, p1}, LTe;->z(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    monitor-enter p0

    :try_start_1
    iget-object p1, p0, LTe;->c:Ljava/util/LinkedHashMap;

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-object p1, p0, LTe;->c:Ljava/util/LinkedHashMap;

    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p1

    new-array v1, v0, [Laf;

    invoke-interface {p1, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, [Laf;

    iget-object v1, p0, LTe;->c:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->clear()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type kotlin.Array<T>"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    monitor-exit p0

    if-eqz p1, :cond_2

    array-length v1, p1

    :goto_1
    if-ge v0, v1, :cond_2

    aget-object v2, p1, v0

    :try_start_2
    invoke-virtual {v2, p2, p3}, Laf;->c(ILjava/io/IOException;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    :try_start_3
    iget-object p1, p0, LTe;->y:Lbf;

    invoke-virtual {p1}, Lbf;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    :catch_2
    :try_start_4
    iget-object p1, p0, LTe;->x:Ljava/net/Socket;

    invoke-virtual {p1}, Ljava/net/Socket;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    :catch_3
    iget-object p1, p0, LTe;->i:Ljq;

    invoke-virtual {p1}, Ljq;->e()V

    iget-object p1, p0, LTe;->j:Ljq;

    invoke-virtual {p1}, Ljq;->e()V

    iget-object p1, p0, LTe;->k:Ljq;

    invoke-virtual {p1}, Ljq;->e()V

    return-void

    :goto_2
    monitor-exit p0

    throw p1
.end method

.method public final w(Ljava/io/IOException;)V
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, v0, v0, p1}, LTe;->n(IILjava/io/IOException;)V

    return-void
.end method

.method public final declared-synchronized x(I)Laf;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LTe;->c:Ljava/util/LinkedHashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Laf;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized y(I)Laf;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LTe;->c:Ljava/util/LinkedHashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Laf;

    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final z(I)V
    .locals 4

    const-string v0, "statusCode"

    invoke-static {p1, v0}, LVo;->j(ILjava/lang/String;)V

    iget-object v0, p0, LTe;->y:Lbf;

    monitor-enter v0

    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-boolean v1, p0, LTe;->g:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v1, :cond_0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    :try_start_3
    iput-boolean v1, p0, LTe;->g:Z

    iget v1, p0, LTe;->e:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    monitor-exit p0

    iget-object v2, p0, LTe;->y:Lbf;

    sget-object v3, LRr;->a:[B

    invoke-virtual {v2, v1, p1, v3}, Lbf;->y(II[B)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit v0

    return-void

    :catchall_1
    move-exception p1

    :try_start_5
    monitor-exit p0

    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_0
    monitor-exit v0

    throw p1
.end method
