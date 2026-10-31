.class public final Lt;
.super LUd;
.source "SourceFile"


# virtual methods
.method public final a0(Lu;Lu;)V
    .locals 0

    iput-object p2, p1, Lu;->b:Lu;

    return-void
.end method

.method public final b0(Lu;Ljava/lang/Thread;)V
    .locals 0

    iput-object p2, p1, Lu;->a:Ljava/lang/Thread;

    return-void
.end method

.method public final f(Lv;Lr;)Z
    .locals 2

    sget-object v0, Lr;->b:Lr;

    monitor-enter p1

    :try_start_0
    iget-object v1, p1, Lv;->b:Lr;

    if-ne v1, p2, :cond_0

    iput-object v0, p1, Lv;->b:Lr;

    monitor-exit p1

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    monitor-exit p1

    const/4 p1, 0x0

    return p1

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public final g(Lv;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lv;->a:Ljava/lang/Object;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Lv;->a:Ljava/lang/Object;

    monitor-exit p1

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    monitor-exit p1

    const/4 p1, 0x0

    return p1

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public final h(Lv;Lu;Lu;)Z
    .locals 1

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lv;->c:Lu;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Lv;->c:Lu;

    monitor-exit p1

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    monitor-exit p1

    const/4 p1, 0x0

    return p1

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method
