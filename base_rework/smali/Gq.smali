.class public final LGq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LAm;
.implements Lxm;


# instance fields
.field public final a:LAm;

.field public final b:Ljava/lang/Object;

.field public volatile c:Lxm;

.field public volatile d:Lxm;

.field public e:I

.field public f:I

.field public g:Z


# direct methods
.method public constructor <init>(Ljava/lang/Object;LAm;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, LGq;->e:I

    iput v0, p0, LGq;->f:I

    iput-object p1, p0, LGq;->b:Ljava/lang/Object;

    iput-object p2, p0, LGq;->a:LAm;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    iget-object v0, p0, LGq;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LGq;->d:Lxm;

    invoke-interface {v1}, Lxm;->a()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, LGq;->c:Lxm;

    invoke-interface {v1}, Lxm;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    monitor-exit v0

    return v1

    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final b(Lxm;)Z
    .locals 3

    instance-of v0, p1, LGq;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    check-cast p1, LGq;

    iget-object v0, p0, LGq;->c:Lxm;

    if-nez v0, :cond_0

    iget-object v0, p1, LGq;->c:Lxm;

    if-nez v0, :cond_2

    goto :goto_0

    :cond_0
    iget-object v0, p0, LGq;->c:Lxm;

    iget-object v2, p1, LGq;->c:Lxm;

    invoke-interface {v0, v2}, Lxm;->b(Lxm;)Z

    move-result v0

    if-eqz v0, :cond_2

    :goto_0
    iget-object v0, p0, LGq;->d:Lxm;

    if-nez v0, :cond_1

    iget-object p1, p1, LGq;->d:Lxm;

    if-nez p1, :cond_2

    goto :goto_1

    :cond_1
    iget-object v0, p0, LGq;->d:Lxm;

    iget-object p1, p1, LGq;->d:Lxm;

    invoke-interface {v0, p1}, Lxm;->b(Lxm;)Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_1
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public final c()LAm;
    .locals 2

    iget-object v0, p0, LGq;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LGq;->a:LAm;

    if-eqz v1, :cond_0

    invoke-interface {v1}, LAm;->c()LAm;

    move-result-object v1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    move-object v1, p0

    :goto_0
    monitor-exit v0

    return-object v1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final clear()V
    .locals 2

    iget-object v0, p0, LGq;->b:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v1, p0, LGq;->g:Z

    const/4 v1, 0x3

    iput v1, p0, LGq;->e:I

    iput v1, p0, LGq;->f:I

    iget-object v1, p0, LGq;->d:Lxm;

    invoke-interface {v1}, Lxm;->clear()V

    iget-object v1, p0, LGq;->c:Lxm;

    invoke-interface {v1}, Lxm;->clear()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final d()V
    .locals 3

    iget-object v0, p0, LGq;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, LGq;->f:I

    invoke-static {v1}, LVo;->d(I)Z

    move-result v1

    const/4 v2, 0x2

    if-nez v1, :cond_0

    iput v2, p0, LGq;->f:I

    iget-object v1, p0, LGq;->d:Lxm;

    invoke-interface {v1}, Lxm;->d()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iget v1, p0, LGq;->e:I

    invoke-static {v1}, LVo;->d(I)Z

    move-result v1

    if-nez v1, :cond_1

    iput v2, p0, LGq;->e:I

    iget-object v1, p0, LGq;->c:Lxm;

    invoke-interface {v1}, Lxm;->d()V

    :cond_1
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final e(Lxm;)Z
    .locals 2

    iget-object v0, p0, LGq;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LGq;->a:LAm;

    if-eqz v1, :cond_0

    invoke-interface {v1, p0}, LAm;->e(Lxm;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    iget-object v1, p0, LGq;->c:Lxm;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget p1, p0, LGq;->e:I

    const/4 v1, 0x2

    if-eq p1, v1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    return p1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final f()V
    .locals 5

    iget-object v0, p0, LGq;->b:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, LGq;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v2, 0x0

    :try_start_1
    iget v3, p0, LGq;->e:I

    const/4 v4, 0x4

    if-eq v3, v4, :cond_0

    iget v3, p0, LGq;->f:I

    if-eq v3, v1, :cond_0

    iput v1, p0, LGq;->f:I

    iget-object v3, p0, LGq;->d:Lxm;

    invoke-interface {v3}, Lxm;->f()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iget-boolean v3, p0, LGq;->g:Z

    if-eqz v3, :cond_1

    iget v3, p0, LGq;->e:I

    if-eq v3, v1, :cond_1

    iput v1, p0, LGq;->e:I

    iget-object v1, p0, LGq;->c:Lxm;

    invoke-interface {v1}, Lxm;->f()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    :try_start_2
    iput-boolean v2, p0, LGq;->g:Z

    monitor-exit v0

    return-void

    :catchall_1
    move-exception v1

    goto :goto_2

    :goto_1
    iput-boolean v2, p0, LGq;->g:Z

    throw v1

    :goto_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1
.end method

.method public final g(Lxm;)Z
    .locals 2

    iget-object v0, p0, LGq;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LGq;->a:LAm;

    if-eqz v1, :cond_0

    invoke-interface {v1, p0}, LAm;->g(Lxm;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    iget-object v1, p0, LGq;->c:Lxm;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, LGq;->a()Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    return p1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final h(Lxm;)V
    .locals 2

    iget-object v0, p0, LGq;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LGq;->c:Lxm;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 v1, 0x5

    if-nez p1, :cond_0

    iput v1, p0, LGq;->f:I

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    iput v1, p0, LGq;->e:I

    iget-object p1, p0, LGq;->a:LAm;

    if-eqz p1, :cond_1

    invoke-interface {p1, p0}, LAm;->h(Lxm;)V

    :cond_1
    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final i(Lxm;)Z
    .locals 2

    iget-object v0, p0, LGq;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LGq;->a:LAm;

    if-eqz v1, :cond_0

    invoke-interface {v1, p0}, LAm;->i(Lxm;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    iget-object v1, p0, LGq;->c:Lxm;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    iget p1, p0, LGq;->e:I

    const/4 v1, 0x4

    if-eq p1, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    :goto_0
    const/4 p1, 0x1

    :goto_1
    monitor-exit v0

    return p1

    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final isRunning()Z
    .locals 3

    iget-object v0, p0, LGq;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, LGq;->e:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    monitor-exit v0

    return v2

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final j()Z
    .locals 3

    iget-object v0, p0, LGq;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, LGq;->e:I

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final k(Lxm;)V
    .locals 2

    iget-object v0, p0, LGq;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LGq;->d:Lxm;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 v1, 0x4

    if-eqz p1, :cond_0

    iput v1, p0, LGq;->f:I

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    iput v1, p0, LGq;->e:I

    iget-object p1, p0, LGq;->a:LAm;

    if-eqz p1, :cond_1

    invoke-interface {p1, p0}, LAm;->k(Lxm;)V

    :cond_1
    iget p1, p0, LGq;->f:I

    invoke-static {p1}, LVo;->d(I)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, LGq;->d:Lxm;

    invoke-interface {p1}, Lxm;->clear()V

    :cond_2
    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final l()Z
    .locals 3

    iget-object v0, p0, LGq;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, LGq;->e:I

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
