.class public final Lfb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkb;
.implements Lni;
.implements Lmb;


# static fields
.field public static final h:Z


# instance fields
.field public final a:Lbg;

.field public final b:Lh8;

.field public final c:LAh;

.field public final d:Leb;

.field public final e:LB4;

.field public final f:LZ1;

.field public final g:LK2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "Engine"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    sput-boolean v0, Lfb;->h:Z

    return-void
.end method

.method public constructor <init>(LAh;Lk0;LZd;LZd;LZd;LZd;)V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfb;->c:LAh;

    new-instance v0, LG7;

    invoke-direct {v0, p2}, LG7;-><init>(Ljava/lang/Object;)V

    new-instance p2, LK2;

    const/4 v1, 0x1

    invoke-direct {p2, v1}, LK2;-><init>(I)V

    iput-object p2, p0, Lfb;->g:LK2;

    monitor-enter p0

    :try_start_0
    monitor-enter p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iput-object p0, p2, LK2;->d:Ljava/lang/Object;

    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    new-instance p2, Lh8;

    const/16 v1, 0xb

    invoke-direct {p2, v1}, Lh8;-><init>(I)V

    iput-object p2, p0, Lfb;->b:Lh8;

    new-instance p2, Lbg;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p2, Lbg;->a:Ljava/util/HashMap;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p2, Lbg;->b:Ljava/util/HashMap;

    iput-object p2, p0, Lfb;->a:Lbg;

    new-instance p2, Leb;

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object v7, p0

    move-object v8, p0

    invoke-direct/range {v2 .. v8}, Leb;-><init>(LZd;LZd;LZd;LZd;Lkb;Lmb;)V

    iput-object p2, p0, Lfb;->d:Leb;

    new-instance p2, LZ1;

    invoke-direct {p2, v0}, LZ1;-><init>(LG7;)V

    iput-object p2, p0, Lfb;->f:LZ1;

    new-instance p2, LB4;

    invoke-direct {p2}, LB4;-><init>()V

    iput-object p2, p0, Lfb;->e:LB4;

    iput-object p0, p1, LAh;->d:Lni;

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :catchall_1
    move-exception p1

    :try_start_3
    monitor-exit p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    throw p1

    :goto_0
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method

.method public static c(Ljava/lang/String;JLfg;)V
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " in "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1, p2}, Loh;->a(J)D

    move-result-wide p0

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p0, "ms, key: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "Engine"

    invoke-static {p1, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static f(LIm;)V
    .locals 1

    instance-of v0, p0, Lnb;

    if-eqz v0, :cond_0

    check-cast p0, Lnb;

    invoke-virtual {p0}, Lnb;->b()V

    return-void

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot release anything but an EngineResource"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final a(LVd;Ljava/lang/Object;Lfg;IILjava/lang/Class;Ljava/lang/Class;LUk;Lk9;Lh5;ZZLrk;ZZZZLLm;Ljava/util/concurrent/Executor;)LK2;
    .locals 24

    move-object/from16 v15, p0

    sget-boolean v0, Lfb;->h:Z

    if-eqz v0, :cond_0

    sget v0, Loh;->b:I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v0

    :goto_0
    move-wide v13, v0

    goto :goto_1

    :cond_0
    const-wide/16 v0, 0x0

    goto :goto_0

    :goto_1
    iget-object v0, v15, Lfb;->b:Lh8;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Llb;

    move-object v1, v0

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p10

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p13

    invoke-direct/range {v1 .. v9}, Llb;-><init>(Ljava/lang/Object;Lfg;IILh5;Ljava/lang/Class;Ljava/lang/Class;Lrk;)V

    monitor-enter p0

    move/from16 v12, p14

    :try_start_0
    invoke-virtual {v15, v0, v12, v13, v14}, Lfb;->b(Llb;ZJ)Lnb;

    move-result-object v1

    if-nez v1, :cond_1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v12, p11

    move-wide/from16 v22, v13

    move/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v15, p14

    move/from16 v16, p15

    move/from16 v17, p16

    move/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, v0

    invoke-virtual/range {v1 .. v23}, Lfb;->g(LVd;Ljava/lang/Object;Lfg;IILjava/lang/Class;Ljava/lang/Class;LUk;Lk9;Lh5;ZZLrk;ZZZZLLm;Ljava/util/concurrent/Executor;Llb;J)LK2;

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    move-object/from16 v2, p18

    check-cast v2, LHo;

    const/4 v3, 0x5

    invoke-virtual {v2, v1, v3, v0}, LHo;->i(LIm;IZ)V

    const/4 v0, 0x0

    return-object v0

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final b(Llb;ZJ)Lnb;
    .locals 8

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return-object v0

    :cond_0
    iget-object p2, p0, Lfb;->g:LK2;

    monitor-enter p2

    :try_start_0
    iget-object v1, p2, LK2;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_1

    monitor-exit p2

    move-object v2, v0

    goto :goto_1

    :cond_1
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lnb;

    if-nez v2, :cond_2

    invoke-virtual {p2, v1}, LK2;->f(Lt0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_2
    :goto_0
    monitor-exit p2

    :goto_1
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lnb;->a()V

    :cond_3
    if-eqz v2, :cond_5

    sget-boolean p2, Lfb;->h:Z

    if-eqz p2, :cond_4

    const-string p2, "Loaded resource from active resources"

    invoke-static {p2, p3, p4, p1}, Lfb;->c(Ljava/lang/String;JLfg;)V

    :cond_4
    return-object v2

    :cond_5
    iget-object p2, p0, Lfb;->c:LAh;

    monitor-enter p2

    :try_start_2
    iget-object v1, p2, Lxh;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwh;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-nez v1, :cond_6

    monitor-exit p2

    move-object v1, v0

    goto :goto_2

    :cond_6
    :try_start_3
    iget-wide v2, p2, Lxh;->c:J

    iget v4, v1, Lwh;->b:I

    int-to-long v4, v4

    sub-long/2addr v2, v4

    iput-wide v2, p2, Lxh;->c:J

    iget-object v1, v1, Lwh;->a:Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit p2

    :goto_2
    move-object v3, v1

    check-cast v3, LIm;

    if-nez v3, :cond_7

    move-object v3, v0

    goto :goto_3

    :cond_7
    instance-of p2, v3, Lnb;

    if-eqz p2, :cond_8

    check-cast v3, Lnb;

    goto :goto_3

    :cond_8
    new-instance p2, Lnb;

    const/4 v4, 0x1

    const/4 v5, 0x1

    move-object v2, p2

    move-object v6, p1

    move-object v7, p0

    invoke-direct/range {v2 .. v7}, Lnb;-><init>(LIm;ZZLfg;Lmb;)V

    move-object v3, p2

    :goto_3
    if-eqz v3, :cond_9

    invoke-virtual {v3}, Lnb;->a()V

    iget-object p2, p0, Lfb;->g:LK2;

    invoke-virtual {p2, p1, v3}, LK2;->c(Lfg;Lnb;)V

    :cond_9
    if-eqz v3, :cond_b

    sget-boolean p2, Lfb;->h:Z

    if-eqz p2, :cond_a

    const-string p2, "Loaded resource from cache"

    invoke-static {p2, p3, p4, p1}, Lfb;->c(Ljava/lang/String;JLfg;)V

    :cond_a
    return-object v3

    :cond_b
    return-object v0

    :catchall_1
    move-exception p1

    monitor-exit p2

    throw p1

    :goto_4
    monitor-exit p2

    throw p1
.end method

.method public final declared-synchronized d(Ljb;Lfg;Lnb;)V
    .locals 1

    monitor-enter p0

    if-eqz p3, :cond_0

    :try_start_0
    iget-boolean v0, p3, Lnb;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lfb;->g:LK2;

    invoke-virtual {v0, p2, p3}, LK2;->c(Lfg;Lnb;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    iget-object p3, p0, Lfb;->a:Lbg;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v0, p1, Ljb;->p:Z

    if-eqz v0, :cond_1

    iget-object p3, p3, Lbg;->b:Ljava/util/HashMap;

    goto :goto_1

    :cond_1
    iget-object p3, p3, Lbg;->a:Ljava/util/HashMap;

    :goto_1
    invoke-interface {p3, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-interface {p3, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    monitor-exit p0

    return-void

    :goto_2
    monitor-exit p0

    throw p1
.end method

.method public final e(Lfg;Lnb;)V
    .locals 3

    iget-object v0, p0, Lfb;->g:LK2;

    monitor-enter v0

    :try_start_0
    iget-object v1, v0, LK2;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt0;

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    iput-object v2, v1, Lt0;->c:LIm;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v0

    iget-boolean v0, p2, Lnb;->a:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lfb;->c:LAh;

    invoke-virtual {v0, p1, p2}, Lxh;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LIm;

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lfb;->e:LB4;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, LB4;->d(LIm;Z)V

    :goto_0
    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final g(LVd;Ljava/lang/Object;Lfg;IILjava/lang/Class;Ljava/lang/Class;LUk;Lk9;Lh5;ZZLrk;ZZZZLLm;Ljava/util/concurrent/Executor;Llb;J)LK2;
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    move-object/from16 v6, p8

    move-object/from16 v7, p9

    move-object/from16 v8, p13

    move/from16 v9, p17

    move-object/from16 v10, p18

    move-object/from16 v11, p19

    move-object/from16 v12, p20

    move-wide/from16 v13, p21

    iget-object v15, v1, Lfb;->a:Lbg;

    if-eqz v9, :cond_0

    iget-object v15, v15, Lbg;->b:Ljava/util/HashMap;

    goto :goto_0

    :cond_0
    iget-object v15, v15, Lbg;->a:Ljava/util/HashMap;

    :goto_0
    invoke-interface {v15, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljb;

    if-eqz v15, :cond_2

    invoke-virtual {v15, v10, v11}, Ljb;->a(LLm;Ljava/util/concurrent/Executor;)V

    sget-boolean v0, Lfb;->h:Z

    if-eqz v0, :cond_1

    const-string v0, "Added to existing load"

    invoke-static {v0, v13, v14, v12}, Lfb;->c(Ljava/lang/String;JLfg;)V

    :cond_1
    new-instance v0, LK2;

    invoke-direct {v0, v1, v10, v15}, LK2;-><init>(Lfb;LLm;Ljb;)V

    return-object v0

    :cond_2
    iget-object v15, v1, Lfb;->d:Leb;

    iget-object v15, v15, Leb;->g:LK2;

    invoke-virtual {v15}, LK2;->b()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljb;

    monitor-enter v15

    :try_start_0
    iput-object v12, v15, Ljb;->l:Lfg;

    move/from16 v13, p14

    iput-boolean v13, v15, Ljb;->m:Z

    move/from16 v13, p15

    iput-boolean v13, v15, Ljb;->n:Z

    move/from16 v13, p16

    iput-boolean v13, v15, Ljb;->o:Z

    iput-boolean v9, v15, Ljb;->p:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v15

    iget-object v13, v1, Lfb;->f:LZ1;

    iget-object v14, v13, LZ1;->d:Ljava/lang/Object;

    check-cast v14, LK2;

    invoke-virtual {v14}, LK2;->b()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lp8;

    iget v10, v13, LZ1;->b:I

    add-int/lit8 v11, v10, 0x1

    iput v11, v13, LZ1;->b:I

    iget-object v11, v14, Lp8;->a:Ln8;

    iput-object v0, v11, Ln8;->c:LVd;

    iput-object v2, v11, Ln8;->d:Ljava/lang/Object;

    iput-object v3, v11, Ln8;->n:Lfg;

    iput v4, v11, Ln8;->e:I

    iput v5, v11, Ln8;->f:I

    iput-object v7, v11, Ln8;->p:Lk9;

    move-object/from16 v13, p6

    iput-object v13, v11, Ln8;->g:Ljava/lang/Class;

    iget-object v13, v14, Lp8;->d:LG7;

    iput-object v13, v11, Ln8;->h:LG7;

    move-object/from16 v13, p7

    iput-object v13, v11, Ln8;->k:Ljava/lang/Class;

    iput-object v6, v11, Ln8;->o:LUk;

    iput-object v8, v11, Ln8;->i:Lrk;

    move-object/from16 v13, p10

    iput-object v13, v11, Ln8;->j:Ljava/util/Map;

    move/from16 v13, p11

    iput-boolean v13, v11, Ln8;->q:Z

    move/from16 v13, p12

    iput-boolean v13, v11, Ln8;->r:Z

    iput-object v0, v14, Lp8;->h:LVd;

    iput-object v3, v14, Lp8;->i:Lfg;

    iput-object v6, v14, Lp8;->j:LUk;

    iput-object v12, v14, Lp8;->k:Llb;

    iput v4, v14, Lp8;->l:I

    iput v5, v14, Lp8;->m:I

    iput-object v7, v14, Lp8;->n:Lk9;

    iput-boolean v9, v14, Lp8;->s:Z

    iput-object v8, v14, Lp8;->o:Lrk;

    iput-object v15, v14, Lp8;->p:Ljb;

    iput v10, v14, Lp8;->q:I

    const/4 v0, 0x1

    iput v0, v14, Lp8;->E:I

    iput-object v2, v14, Lp8;->t:Ljava/lang/Object;

    iget-object v2, v1, Lfb;->a:Lbg;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v3, v15, Ljb;->p:Z

    if-eqz v3, :cond_3

    iget-object v2, v2, Lbg;->b:Ljava/util/HashMap;

    goto :goto_1

    :cond_3
    iget-object v2, v2, Lbg;->a:Ljava/util/HashMap;

    :goto_1
    invoke-interface {v2, v12, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v2, p18

    move-object/from16 v3, p19

    invoke-virtual {v15, v2, v3}, Ljb;->a(LLm;Ljava/util/concurrent/Executor;)V

    monitor-enter v15

    :try_start_1
    iput-object v14, v15, Ljb;->w:Lp8;

    invoke-virtual {v14, v0}, Lp8;->i(I)I

    move-result v0

    const/4 v3, 0x2

    if-eq v0, v3, :cond_7

    const/4 v3, 0x3

    if-ne v0, v3, :cond_4

    goto :goto_2

    :cond_4
    iget-boolean v0, v15, Ljb;->n:Z

    if-eqz v0, :cond_5

    iget-object v0, v15, Ljb;->i:LZd;

    goto :goto_3

    :cond_5
    iget-boolean v0, v15, Ljb;->o:Z

    if-eqz v0, :cond_6

    iget-object v0, v15, Ljb;->j:LZd;

    goto :goto_3

    :cond_6
    iget-object v0, v15, Ljb;->h:LZd;

    goto :goto_3

    :cond_7
    :goto_2
    iget-object v0, v15, Ljb;->g:LZd;

    :goto_3
    invoke-virtual {v0, v14}, LZd;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v15

    sget-boolean v0, Lfb;->h:Z

    if-eqz v0, :cond_8

    const-string v0, "Started new load"

    move-wide/from16 v3, p21

    invoke-static {v0, v3, v4, v12}, Lfb;->c(Ljava/lang/String;JLfg;)V

    :cond_8
    new-instance v0, LK2;

    invoke-direct {v0, v1, v2, v15}, LK2;-><init>(Lfb;LLm;Ljb;)V

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v15

    throw v0

    :catchall_1
    move-exception v0

    monitor-exit v15

    throw v0
.end method
