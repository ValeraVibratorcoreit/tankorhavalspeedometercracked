.class public final Lob;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LAm;
.implements Lxm;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:LAm;

.field public volatile c:Lxm;

.field public volatile d:Lxm;

.field public e:I

.field public f:I


# direct methods
.method public constructor <init>(Ljava/lang/Object;LAm;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    iput v0, p0, Lob;->e:I

    iput v0, p0, Lob;->f:I

    iput-object p1, p0, Lob;->a:Ljava/lang/Object;

    iput-object p2, p0, Lob;->b:LAm;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    iget-object v0, p0, Lob;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lob;->c:Lxm;

    invoke-interface {v1}, Lxm;->a()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lob;->d:Lxm;

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

    instance-of v0, p1, Lob;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lob;

    iget-object v0, p0, Lob;->c:Lxm;

    iget-object v2, p1, Lob;->c:Lxm;

    invoke-interface {v0, v2}, Lxm;->b(Lxm;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lob;->d:Lxm;

    iget-object p1, p1, Lob;->d:Lxm;

    invoke-interface {v0, p1}, Lxm;->b(Lxm;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public final c()LAm;
    .locals 2

    iget-object v0, p0, Lob;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lob;->b:LAm;

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
    .locals 3

    iget-object v0, p0, Lob;->a:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x3

    :try_start_0
    iput v1, p0, Lob;->e:I

    iget-object v2, p0, Lob;->c:Lxm;

    invoke-interface {v2}, Lxm;->clear()V

    iget v2, p0, Lob;->f:I

    if-eq v2, v1, :cond_0

    iput v1, p0, Lob;->f:I

    iget-object v1, p0, Lob;->d:Lxm;

    invoke-interface {v1}, Lxm;->clear()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final d()V
    .locals 4

    iget-object v0, p0, Lob;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lob;->e:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    iput v2, p0, Lob;->e:I

    iget-object v1, p0, Lob;->c:Lxm;

    invoke-interface {v1}, Lxm;->d()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iget v1, p0, Lob;->f:I

    if-ne v1, v3, :cond_1

    iput v2, p0, Lob;->f:I

    iget-object v1, p0, Lob;->d:Lxm;

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

    iget-object v0, p0, Lob;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lob;->b:LAm;

    if-eqz v1, :cond_0

    invoke-interface {v1, p0}, LAm;->e(Lxm;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    iget-object v1, p0, Lob;->c:Lxm;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final f()V
    .locals 3

    iget-object v0, p0, Lob;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lob;->e:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    iput v2, p0, Lob;->e:I

    iget-object v1, p0, Lob;->c:Lxm;

    invoke-interface {v1}, Lxm;->f()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final g(Lxm;)Z
    .locals 5

    iget-object v0, p0, Lob;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lob;->b:LAm;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-interface {v1, p0}, LAm;->g(Lxm;)Z

    move-result v1

    if-eqz v1, :cond_4

    :cond_0
    iget v1, p0, Lob;->e:I

    const/4 v3, 0x5

    const/4 v4, 0x1

    if-eq v1, v3, :cond_1

    iget-object v1, p0, Lob;->c:Lxm;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lob;->d:Lxm;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget p1, p0, Lob;->f:I

    const/4 v1, 0x4

    if-eq p1, v1, :cond_2

    if-ne p1, v3, :cond_3

    :cond_2
    move p1, v4

    goto :goto_0

    :cond_3
    move p1, v2

    :goto_0
    if-eqz p1, :cond_4

    move v2, v4

    :cond_4
    monitor-exit v0

    return v2

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final h(Lxm;)V
    .locals 2

    iget-object v0, p0, Lob;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lob;->d:Lxm;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 v1, 0x5

    if-nez p1, :cond_1

    iput v1, p0, Lob;->e:I

    iget p1, p0, Lob;->f:I

    const/4 v1, 0x1

    if-eq p1, v1, :cond_0

    iput v1, p0, Lob;->f:I

    iget-object p1, p0, Lob;->d:Lxm;

    invoke-interface {p1}, Lxm;->f()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :cond_1
    iput v1, p0, Lob;->f:I

    iget-object p1, p0, Lob;->b:LAm;

    if-eqz p1, :cond_2

    invoke-interface {p1, p0}, LAm;->h(Lxm;)V

    :cond_2
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final i(Lxm;)Z
    .locals 1

    iget-object p1, p0, Lob;->a:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lob;->b:LAm;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, LAm;->i(Lxm;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    monitor-exit p1

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final isRunning()Z
    .locals 3

    iget-object v0, p0, Lob;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lob;->e:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    iget v1, p0, Lob;->f:I

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit v0

    return v2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final j()Z
    .locals 3

    iget-object v0, p0, Lob;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lob;->e:I

    const/4 v2, 0x4

    if-eq v1, v2, :cond_1

    iget v1, p0, Lob;->f:I

    if-ne v1, v2, :cond_0

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

.method public final k(Lxm;)V
    .locals 3

    iget-object v0, p0, Lob;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lob;->c:Lxm;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x4

    if-eqz v1, :cond_0

    iput v2, p0, Lob;->e:I

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lob;->d:Lxm;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iput v2, p0, Lob;->f:I

    :cond_1
    :goto_0
    iget-object p1, p0, Lob;->b:LAm;

    if-eqz p1, :cond_2

    invoke-interface {p1, p0}, LAm;->k(Lxm;)V

    :cond_2
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final l()Z
    .locals 3

    iget-object v0, p0, Lob;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lob;->e:I

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    iget v1, p0, Lob;->f:I

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
