.class public final LXe;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMo;


# instance fields
.field public final a:LL4;

.field public b:Z

.field public final c:Z

.field public final synthetic d:Laf;


# direct methods
.method public constructor <init>(Laf;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LXe;->d:Laf;

    iput-boolean p2, p0, LXe;->c:Z

    new-instance p1, LL4;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LXe;->a:LL4;

    return-void
.end method


# virtual methods
.method public final b()LJq;
    .locals 1

    iget-object v0, p0, LXe;->d:Laf;

    iget-object v0, v0, Laf;->j:LZe;

    return-object v0
.end method

.method public final close()V
    .locals 13

    iget-object v0, p0, LXe;->d:Laf;

    sget-object v1, LRr;->a:[B

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, LXe;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    :try_start_1
    iget-object v1, p0, LXe;->d:Laf;

    monitor-enter v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    iget v2, v1, Laf;->k:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    const/4 v1, 0x1

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    monitor-exit v0

    iget-object v0, p0, LXe;->d:Laf;

    iget-object v3, v0, Laf;->h:LXe;

    iget-boolean v3, v3, LXe;->c:Z

    if-nez v3, :cond_3

    iget-object v3, p0, LXe;->a:LL4;

    iget-wide v3, v3, LL4;->b:J

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    if-lez v3, :cond_2

    :goto_1
    iget-object v0, p0, LXe;->a:LL4;

    iget-wide v2, v0, LL4;->b:J

    cmp-long v0, v2, v5

    if-lez v0, :cond_3

    invoke-virtual {p0, v1}, LXe;->n(Z)V

    goto :goto_1

    :cond_2
    if-eqz v2, :cond_3

    iget-object v7, v0, Laf;->n:LTe;

    iget v8, v0, Laf;->m:I

    const-wide/16 v11, 0x0

    const/4 v9, 0x1

    const/4 v10, 0x0

    invoke-virtual/range {v7 .. v12}, LTe;->B(IZLL4;J)V

    :cond_3
    iget-object v0, p0, LXe;->d:Laf;

    monitor-enter v0

    :try_start_4
    iput-boolean v1, p0, LXe;->b:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit v0

    iget-object v0, p0, LXe;->d:Laf;

    iget-object v0, v0, Laf;->n:LTe;

    invoke-virtual {v0}, LTe;->flush()V

    iget-object v0, p0, LXe;->d:Laf;

    invoke-virtual {v0}, Laf;->a()V

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    :catchall_1
    move-exception v2

    :try_start_5
    monitor-exit v1

    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final d(LL4;J)V
    .locals 3

    const-string v0, "source"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v0, LRr;->a:[B

    iget-object v0, p0, LXe;->a:LL4;

    invoke-virtual {v0, p1, p2, p3}, LL4;->d(LL4;J)V

    :goto_0
    iget-wide p1, v0, LL4;->b:J

    const-wide/16 v1, 0x4000

    cmp-long p1, p1, v1

    if-ltz p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, LXe;->n(Z)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final flush()V
    .locals 4

    iget-object v0, p0, LXe;->d:Laf;

    sget-object v1, LRr;->a:[B

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LXe;->d:Laf;

    invoke-virtual {v1}, Laf;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    :goto_0
    iget-object v0, p0, LXe;->a:LL4;

    iget-wide v0, v0, LL4;->b:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LXe;->n(Z)V

    iget-object v0, p0, LXe;->d:Laf;

    iget-object v0, v0, Laf;->n:LTe;

    invoke-virtual {v0}, LTe;->flush()V

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final n(Z)V
    .locals 12

    iget-object v0, p0, LXe;->d:Laf;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LXe;->d:Laf;

    iget-object v1, v1, Laf;->j:LZe;

    invoke-virtual {v1}, Ln3;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    :goto_0
    :try_start_1
    iget-object v1, p0, LXe;->d:Laf;

    iget-wide v2, v1, Laf;->c:J

    iget-wide v4, v1, Laf;->d:J

    cmp-long v2, v2, v4

    if-ltz v2, :cond_0

    iget-boolean v2, p0, LXe;->c:Z

    if-nez v2, :cond_0

    iget-boolean v2, p0, LXe;->b:Z

    if-nez v2, :cond_0

    monitor-enter v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget v2, v1, Laf;->k:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    monitor-exit v1

    if-nez v2, :cond_0

    iget-object v1, p0, LXe;->d:Laf;

    invoke-virtual {v1}, Laf;->k()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :catchall_1
    move-exception p1

    monitor-exit v1

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_0
    :try_start_4
    iget-object v1, p0, LXe;->d:Laf;

    iget-object v1, v1, Laf;->j:LZe;

    invoke-virtual {v1}, LZe;->l()V

    iget-object v1, p0, LXe;->d:Laf;

    invoke-virtual {v1}, Laf;->b()V

    iget-object v1, p0, LXe;->d:Laf;

    iget-wide v2, v1, Laf;->d:J

    iget-wide v4, v1, Laf;->c:J

    sub-long/2addr v2, v4

    iget-object v1, p0, LXe;->a:LL4;

    iget-wide v4, v1, LL4;->b:J

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v10

    iget-object v1, p0, LXe;->d:Laf;

    iget-wide v2, v1, Laf;->c:J

    add-long/2addr v2, v10

    iput-wide v2, v1, Laf;->c:J

    if-eqz p1, :cond_1

    iget-object p1, p0, LXe;->a:LL4;

    iget-wide v2, p1, LL4;->b:J

    cmp-long p1, v10, v2

    if-nez p1, :cond_1

    monitor-enter v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :try_start_5
    iget p1, v1, Laf;->k:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :try_start_6
    monitor-exit v1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    :goto_1
    move v8, p1

    goto :goto_2

    :catchall_2
    move-exception p1

    monitor-exit v1

    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    :catchall_3
    move-exception p1

    goto :goto_4

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :goto_2
    monitor-exit v0

    iget-object p1, p0, LXe;->d:Laf;

    iget-object p1, p1, Laf;->j:LZe;

    invoke-virtual {p1}, Ln3;->h()V

    :try_start_7
    iget-object p1, p0, LXe;->d:Laf;

    iget-object v6, p1, Laf;->n:LTe;

    iget v7, p1, Laf;->m:I

    iget-object v9, p0, LXe;->a:LL4;

    invoke-virtual/range {v6 .. v11}, LTe;->B(IZLL4;J)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    iget-object p1, p0, LXe;->d:Laf;

    iget-object p1, p1, Laf;->j:LZe;

    invoke-virtual {p1}, LZe;->l()V

    return-void

    :catchall_4
    move-exception p1

    iget-object v0, p0, LXe;->d:Laf;

    iget-object v0, v0, Laf;->j:LZe;

    invoke-virtual {v0}, LZe;->l()V

    throw p1

    :goto_3
    :try_start_8
    iget-object v1, p0, LXe;->d:Laf;

    iget-object v1, v1, Laf;->j:LZe;

    invoke-virtual {v1}, LZe;->l()V

    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :goto_4
    monitor-exit v0

    throw p1
.end method
