.class public final Ln8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public final b:Ljava/util/ArrayList;

.field public c:LVd;

.field public d:Ljava/lang/Object;

.field public e:I

.field public f:I

.field public g:Ljava/lang/Class;

.field public h:LG7;

.field public i:Lrk;

.field public j:Ljava/util/Map;

.field public k:Ljava/lang/Class;

.field public l:Z

.field public m:Z

.field public n:Lfg;

.field public o:LUk;

.field public p:Lk9;

.field public q:Z

.field public r:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ln8;->a:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ln8;->b:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/ArrayList;
    .locals 9

    iget-boolean v0, p0, Ln8;->m:Z

    iget-object v1, p0, Ln8;->b:Ljava/util/ArrayList;

    if-nez v0, :cond_3

    const/4 v0, 0x1

    iput-boolean v0, p0, Ln8;->m:Z

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {p0}, Ln8;->b()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_3

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LWi;

    iget-object v6, v5, LWi;->a:Lfg;

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_0

    iget-object v6, v5, LWi;->a:Lfg;

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    move v6, v3

    :goto_1
    iget-object v7, v5, LWi;->b:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v8

    if-ge v6, v8, :cond_2

    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1

    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    return-object v1
.end method

.method public final b()Ljava/util/ArrayList;
    .locals 9

    iget-boolean v0, p0, Ln8;->l:Z

    iget-object v1, p0, Ln8;->a:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ln8;->l:Z

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Ln8;->c:LVd;

    invoke-virtual {v0}, LVd;->a()Lsm;

    move-result-object v0

    iget-object v2, p0, Ln8;->d:Ljava/lang/Object;

    invoke-virtual {v0, v2}, Lsm;->f(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LXi;

    iget-object v5, p0, Ln8;->d:Ljava/lang/Object;

    iget v6, p0, Ln8;->e:I

    iget v7, p0, Ln8;->f:I

    iget-object v8, p0, Ln8;->i:Lrk;

    invoke-interface {v4, v5, v6, v7, v8}, LXi;->b(Ljava/lang/Object;IILrk;)LWi;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public final c(Ljava/lang/Class;)Lfh;
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget-object v2, v1, Ln8;->c:LVd;

    invoke-virtual {v2}, LVd;->a()Lsm;

    move-result-object v9

    iget-object v10, v1, Ln8;->g:Ljava/lang/Class;

    iget-object v11, v1, Ln8;->k:Ljava/lang/Class;

    iget-object v2, v9, Lsm;->i:Lgh;

    iget-object v3, v2, Lgh;->b:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v12, 0x0

    invoke-virtual {v3, v12}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lgj;

    if-nez v3, :cond_0

    new-instance v3, Lgj;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    :cond_0
    iput-object v0, v3, Lgj;->a:Ljava/lang/Class;

    iput-object v10, v3, Lgj;->b:Ljava/lang/Class;

    iput-object v11, v3, Lgj;->c:Ljava/lang/Class;

    iget-object v4, v2, Lgh;->a:Lc3;

    monitor-enter v4

    :try_start_0
    iget-object v5, v2, Lgh;->a:Lc3;

    invoke-virtual {v5, v3, v12}, LFo;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lfh;

    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    iget-object v2, v2, Lgh;->b:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object v2, v9, Lsm;->i:Lgh;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lgh;->c:Lfh;

    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto/16 :goto_a

    :cond_1
    if-nez v5, :cond_d

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, v9, Lsm;->c:Ld2;

    invoke-virtual {v2, v0, v10}, Ld2;->K(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :cond_2
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Ljava/lang/Class;

    iget-object v2, v9, Lsm;->f:LYa;

    invoke-virtual {v2, v15, v11}, LYa;->d(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_0
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Ljava/lang/Class;

    iget-object v2, v9, Lsm;->c:Ld2;

    monitor-enter v2

    :try_start_1
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iget-object v3, v2, Ld2;->b:Ljava/lang/Object;

    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    iget-object v7, v2, Ld2;->c:Ljava/lang/Object;

    check-cast v7, Ljava/util/HashMap;

    invoke-virtual {v7, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    if-nez v4, :cond_4

    goto :goto_1

    :cond_4
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_5
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LNm;

    iget-object v8, v7, LNm;->a:Ljava/lang/Class;

    invoke-virtual {v8, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v8

    if-eqz v8, :cond_5

    iget-object v8, v7, LNm;->b:Ljava/lang/Class;

    invoke-virtual {v15, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v8

    if-eqz v8, :cond_5

    iget-object v7, v7, LNm;->c:LMm;

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :cond_6
    monitor-exit v2

    iget-object v2, v9, Lsm;->f:LYa;

    monitor-enter v2

    :try_start_2
    invoke-virtual {v5, v15}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_7

    sget-object v3, Lpa;->o:Lpa;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v2

    :goto_3
    move-object v7, v3

    goto :goto_5

    :cond_7
    :try_start_3
    iget-object v3, v2, LYa;->a:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ler;

    iget-object v7, v4, Ler;->a:Ljava/lang/Class;

    invoke-virtual {v7, v15}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v7

    if-eqz v7, :cond_8

    iget-object v7, v4, Ler;->b:Ljava/lang/Class;

    invoke-virtual {v5, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v7

    if-eqz v7, :cond_8

    iget-object v3, v4, Ler;->c:LUm;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit v2

    goto :goto_3

    :goto_5
    new-instance v8, Lq8;

    iget-object v4, v9, Lsm;->j:LK2;

    move-object v2, v8

    move-object/from16 v3, p1

    move-object/from16 v17, v4

    move-object v4, v15

    move-object v12, v8

    move-object/from16 v8, v17

    invoke-direct/range {v2 .. v8}, Lq8;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/List;LUm;LK2;)V

    invoke-virtual {v13, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v12, 0x0

    goto/16 :goto_0

    :catchall_1
    move-exception v0

    goto :goto_6

    :cond_8
    const/4 v12, 0x0

    goto :goto_4

    :cond_9
    :try_start_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "No transcoder registered to transcode from "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " to "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_6
    monitor-exit v2

    throw v0

    :goto_7
    monitor-exit v2

    throw v0

    :cond_a
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_b

    const/4 v12, 0x0

    goto :goto_8

    :cond_b
    new-instance v12, Lfh;

    iget-object v7, v9, Lsm;->j:LK2;

    move-object v2, v12

    move-object/from16 v3, p1

    move-object v4, v10

    move-object v5, v11

    move-object v6, v13

    invoke-direct/range {v2 .. v7}, Lfh;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/List;LK2;)V

    :goto_8
    iget-object v2, v9, Lsm;->i:Lgh;

    iget-object v3, v2, Lgh;->a:Lc3;

    monitor-enter v3

    :try_start_5
    iget-object v2, v2, Lgh;->a:Lc3;

    new-instance v4, Lgj;

    invoke-direct {v4, v0, v10, v11}, Lgj;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    if-eqz v12, :cond_c

    move-object v0, v12

    goto :goto_9

    :cond_c
    sget-object v0, Lgh;->c:Lfh;

    :goto_9
    invoke-virtual {v2, v4, v0}, LFo;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v3

    goto :goto_a

    :catchall_2
    move-exception v0

    monitor-exit v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw v0

    :cond_d
    move-object v12, v5

    :goto_a
    return-object v12

    :catchall_3
    move-exception v0

    :try_start_6
    monitor-exit v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    throw v0
.end method

.method public final d()Ljava/util/List;
    .locals 9

    iget-object v0, p0, Ln8;->c:LVd;

    invoke-virtual {v0}, LVd;->a()Lsm;

    move-result-object v0

    iget-object v1, p0, Ln8;->d:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    iget-object v2, p0, Ln8;->g:Ljava/lang/Class;

    iget-object v3, p0, Ln8;->k:Ljava/lang/Class;

    iget-object v4, v0, Lsm;->h:Ld2;

    iget-object v5, v4, Ld2;->b:Ljava/lang/Object;

    check-cast v5, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lgj;

    if-nez v5, :cond_0

    new-instance v5, Lgj;

    invoke-direct {v5, v1, v2, v3}, Lgj;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    goto :goto_0

    :cond_0
    iput-object v1, v5, Lgj;->a:Ljava/lang/Class;

    iput-object v2, v5, Lgj;->b:Ljava/lang/Class;

    iput-object v3, v5, Lgj;->c:Ljava/lang/Class;

    :goto_0
    iget-object v7, v4, Ld2;->c:Ljava/lang/Object;

    check-cast v7, Lc3;

    monitor-enter v7

    :try_start_0
    iget-object v8, v4, Ld2;->c:Ljava/lang/Object;

    check-cast v8, Lc3;

    invoke-virtual {v8, v5, v6}, LFo;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    monitor-exit v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    iget-object v4, v4, Ld2;->b:Ljava/lang/Object;

    check-cast v4, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v4, v5}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    if-nez v6, :cond_4

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iget-object v4, v0, Lsm;->a:Ld2;

    monitor-enter v4

    :try_start_1
    iget-object v5, v4, Ld2;->b:Ljava/lang/Object;

    check-cast v5, Ljj;

    invoke-virtual {v5, v1}, Ljj;->q(Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v4

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Class;

    iget-object v7, v0, Lsm;->c:Ld2;

    invoke-virtual {v7, v5, v2}, Ld2;->K(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Class;

    iget-object v8, v0, Lsm;->f:LYa;

    invoke-virtual {v8, v7, v3}, LYa;->d(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/ArrayList;

    move-result-object v8

    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_2

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    iget-object v0, v0, Lsm;->h:Ld2;

    invoke-static {v6}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    iget-object v5, v0, Ld2;->c:Ljava/lang/Object;

    check-cast v5, Lc3;

    monitor-enter v5

    :try_start_2
    iget-object v0, v0, Ld2;->c:Ljava/lang/Object;

    check-cast v0, Lc3;

    new-instance v7, Lgj;

    invoke-direct {v7, v1, v2, v3}, Lgj;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    invoke-virtual {v0, v7, v4}, LFo;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v5

    goto :goto_2

    :catchall_0
    move-exception v0

    monitor-exit v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catchall_1
    move-exception v0

    monitor-exit v4

    throw v0

    :cond_4
    :goto_2
    return-object v6

    :catchall_2
    move-exception v0

    :try_start_3
    monitor-exit v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw v0
.end method

.method public final e(Ljava/lang/Object;)LWa;
    .locals 5

    iget-object v0, p0, Ln8;->c:LVd;

    invoke-virtual {v0}, LVd;->a()Lsm;

    move-result-object v0

    iget-object v0, v0, Lsm;->b:LYa;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    monitor-enter v0

    :try_start_0
    iget-object v2, v0, LYa;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LXa;

    iget-object v4, v3, LXa;->a:Ljava/lang/Class;

    invoke-virtual {v4, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v1, v3, LXa;->b:LWa;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    monitor-exit v0

    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    return-object v1

    :cond_2
    new-instance v0, Lrm;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to find source encoder for data class: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_1
    monitor-exit v0

    throw p1
.end method

.method public final f(Ljava/lang/Class;)Lfr;
    .locals 4

    iget-object v0, p0, Ln8;->j:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfr;

    if-nez v0, :cond_1

    iget-object v1, p0, Ln8;->j:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Class;

    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfr;

    :cond_1
    if-nez v0, :cond_4

    iget-object v0, p0, Ln8;->j:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Ln8;->q:Z

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Missing transformation for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ". If you wish to ignore unknown resource types, use the optional transformation methods."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_0
    sget-object p1, LIr;->b:LIr;

    return-object p1

    :cond_4
    return-object v0
.end method
