.class public final Lp8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb8;
.implements Ljava/lang/Runnable;
.implements Ljava/lang/Comparable;
.implements LIb;


# instance fields
.field public volatile A:Z

.field public volatile B:Z

.field public C:Z

.field public D:I

.field public E:I

.field public F:I

.field public final a:Ln8;

.field public final b:Ljava/util/ArrayList;

.field public final c:Lwp;

.field public final d:LG7;

.field public final e:LNk;

.field public final f:LK2;

.field public final g:Lo8;

.field public h:LVd;

.field public i:Lfg;

.field public j:LUk;

.field public k:Llb;

.field public l:I

.field public m:I

.field public n:Lk9;

.field public o:Lrk;

.field public p:Ljb;

.field public q:I

.field public r:J

.field public s:Z

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Thread;

.field public v:Lfg;

.field public w:Lfg;

.field public x:Ljava/lang/Object;

.field public y:La8;

.field public volatile z:Lc8;


# direct methods
.method public constructor <init>(LG7;LK2;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ln8;

    invoke-direct {v0}, Ln8;-><init>()V

    iput-object v0, p0, Lp8;->a:Ln8;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lp8;->b:Ljava/util/ArrayList;

    new-instance v0, Lwp;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lp8;->c:Lwp;

    new-instance v0, LK2;

    const/16 v1, 0x8

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LK2;-><init>(IZ)V

    iput-object v0, p0, Lp8;->f:LK2;

    new-instance v0, Lo8;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lp8;->g:Lo8;

    iput-object p1, p0, Lp8;->d:LG7;

    iput-object p2, p0, Lp8;->e:LNk;

    return-void
.end method


# virtual methods
.method public final a(Lfg;Ljava/lang/Exception;La8;I)V
    .locals 2

    invoke-interface {p3}, La8;->c()V

    new-instance v0, LXd;

    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    const-string v1, "Fetching data failed"

    invoke-direct {v0, v1, p2}, LXd;-><init>(Ljava/lang/String;Ljava/util/List;)V

    invoke-interface {p3}, La8;->a()Ljava/lang/Class;

    move-result-object p2

    iput-object p1, v0, LXd;->b:Lfg;

    iput p4, v0, LXd;->c:I

    iput-object p2, v0, LXd;->d:Ljava/lang/Class;

    iget-object p1, p0, Lp8;->b:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    iget-object p2, p0, Lp8;->u:Ljava/lang/Thread;

    if-eq p1, p2, :cond_0

    const/4 p1, 0x2

    invoke-virtual {p0, p1}, Lp8;->n(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lp8;->o()V

    :goto_0
    return-void
.end method

.method public final b()Lwp;
    .locals 1

    iget-object v0, p0, Lp8;->c:Lwp;

    return-object v0
.end method

.method public final c(Lfg;Ljava/lang/Object;La8;ILfg;)V
    .locals 0

    iput-object p1, p0, Lp8;->v:Lfg;

    iput-object p2, p0, Lp8;->x:Ljava/lang/Object;

    iput-object p3, p0, Lp8;->y:La8;

    iput p4, p0, Lp8;->F:I

    iput-object p5, p0, Lp8;->w:Lfg;

    iget-object p2, p0, Lp8;->a:Ln8;

    invoke-virtual {p2}, Ln8;->a()Ljava/util/ArrayList;

    move-result-object p2

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    if-eq p1, p2, :cond_0

    const/4 p3, 0x1

    :cond_0
    iput-boolean p3, p0, Lp8;->C:Z

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    iget-object p2, p0, Lp8;->u:Ljava/lang/Thread;

    if-eq p1, p2, :cond_1

    const/4 p1, 0x3

    invoke-virtual {p0, p1}, Lp8;->n(I)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lp8;->g()V

    :goto_0
    return-void
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    check-cast p1, Lp8;

    iget-object v0, p0, Lp8;->j:LUk;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    iget-object v1, p1, Lp8;->j:LUk;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    sub-int/2addr v0, v1

    if-nez v0, :cond_0

    iget v0, p0, Lp8;->q:I

    iget p1, p1, Lp8;->q:I

    sub-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public final d()V
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lp8;->n(I)V

    return-void
.end method

.method public final e(La8;Ljava/lang/Object;I)LIm;
    .locals 5

    const-string v0, "Decoded result "

    const/4 v1, 0x0

    if-nez p2, :cond_0

    invoke-interface {p1}, La8;->c()V

    return-object v1

    :cond_0
    :try_start_0
    sget v2, Loh;->b:I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v2

    invoke-virtual {p0, p3, p2}, Lp8;->f(ILjava/lang/Object;)LIm;

    move-result-object p2

    const-string p3, "DecodeJob"

    const/4 v4, 0x2

    invoke-static {p3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p3

    if-eqz p3, :cond_1

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p0, p3, v2, v3, v1}, Lp8;->j(Ljava/lang/String;JLjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_1
    :goto_0
    invoke-interface {p1}, La8;->c()V

    return-object p2

    :goto_1
    invoke-interface {p1}, La8;->c()V

    throw p2
.end method

.method public final f(ILjava/lang/Object;)LIm;
    .locals 8

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    iget-object v1, p0, Lp8;->a:Ln8;

    invoke-virtual {v1, v0}, Ln8;->c(Ljava/lang/Class;)Lfh;

    move-result-object v2

    iget-object v0, p0, Lp8;->o:Lrk;

    const/4 v3, 0x4

    if-eq p1, v3, :cond_1

    iget-boolean v1, v1, Ln8;->r:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    sget-object v3, LN9;->i:Lpk;

    invoke-virtual {v0, v3}, Lrk;->c(Lpk;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_2

    if-eqz v1, :cond_3

    :cond_2
    :goto_2
    move-object v7, v0

    goto :goto_3

    :cond_3
    new-instance v0, Lrk;

    invoke-direct {v0}, Lrk;-><init>()V

    iget-object v4, p0, Lp8;->o:Lrk;

    iget-object v4, v4, Lrk;->b:Lh5;

    iget-object v5, v0, Lrk;->b:Lh5;

    invoke-virtual {v5, v4}, Lh5;->i(LFo;)V

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v5, v3, v1}, Lh5;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :goto_3
    iget-object v0, p0, Lp8;->h:LVd;

    invoke-virtual {v0}, LVd;->a()Lsm;

    move-result-object v0

    invoke-virtual {v0, p2}, Lsm;->g(Ljava/lang/Object;)Le8;

    move-result-object p2

    :try_start_0
    iget v3, p0, Lp8;->l:I

    iget v4, p0, Lp8;->m:I

    new-instance v5, LQ0;

    invoke-direct {v5, p0, p1}, LQ0;-><init>(Ljava/lang/Object;I)V

    move-object v6, p2

    invoke-virtual/range {v2 .. v7}, Lfh;->a(IILQ0;Le8;Lrk;)LIm;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p2}, Le8;->c()V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-interface {p2}, Le8;->c()V

    throw p1
.end method

.method public final g()V
    .locals 10

    const-string v0, "DecodeJob"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Retrieved data"

    iget-wide v1, p0, Lp8;->r:J

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "data: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lp8;->x:Ljava/lang/Object;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ", cache key: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lp8;->v:Lfg;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, ", fetcher: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lp8;->y:La8;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v0, v1, v2, v3}, Lp8;->j(Ljava/lang/String;JLjava/lang/String;)V

    :cond_0
    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lp8;->y:La8;

    iget-object v2, p0, Lp8;->x:Ljava/lang/Object;

    iget v3, p0, Lp8;->F:I

    invoke-virtual {p0, v1, v2, v3}, Lp8;->e(La8;Ljava/lang/Object;I)LIm;

    move-result-object v1
    :try_end_0
    .catch LXd; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    iget-object v2, p0, Lp8;->w:Lfg;

    iget v3, p0, Lp8;->F:I

    iput-object v2, v1, LXd;->b:Lfg;

    iput v3, v1, LXd;->c:I

    iput-object v0, v1, LXd;->d:Ljava/lang/Class;

    iget-object v2, p0, Lp8;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_6

    iget v2, p0, Lp8;->F:I

    iget-boolean v3, p0, Lp8;->C:Z

    instance-of v4, v1, LBf;

    if-eqz v4, :cond_1

    move-object v4, v1

    check-cast v4, LBf;

    invoke-interface {v4}, LBf;->a()V

    :cond_1
    iget-object v4, p0, Lp8;->f:LK2;

    iget-object v4, v4, LK2;->d:Ljava/lang/Object;

    check-cast v4, Lnh;

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    sget-object v0, Lnh;->e:LK2;

    invoke-virtual {v0}, LK2;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnh;

    const/4 v4, 0x0

    iput-boolean v4, v0, Lnh;->d:Z

    iput-boolean v5, v0, Lnh;->c:Z

    iput-object v1, v0, Lnh;->b:LIm;

    move-object v1, v0

    :cond_2
    invoke-virtual {p0, v1, v2, v3}, Lp8;->k(LIm;IZ)V

    const/4 v1, 0x5

    iput v1, p0, Lp8;->D:I

    :try_start_1
    iget-object v1, p0, Lp8;->f:LK2;

    iget-object v2, v1, LK2;->d:Ljava/lang/Object;

    check-cast v2, Lnh;

    if-eqz v2, :cond_3

    iget-object v2, p0, Lp8;->d:LG7;

    iget-object v3, p0, Lp8;->o:Lrk;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v2}, LG7;->a()Lj9;

    move-result-object v2

    iget-object v4, v1, LK2;->b:Ljava/lang/Object;

    check-cast v4, Lfg;

    new-instance v6, LK2;

    iget-object v7, v1, LK2;->c:Ljava/lang/Object;

    check-cast v7, LQm;

    iget-object v8, v1, LK2;->d:Ljava/lang/Object;

    check-cast v8, Lnh;

    const/4 v9, 0x7

    invoke-direct {v6, v7, v8, v3, v9}, LK2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface {v2, v4, v6}, Lj9;->b(Lfg;LK2;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget-object v1, v1, LK2;->d:Ljava/lang/Object;

    check-cast v1, Lnh;

    invoke-virtual {v1}, Lnh;->a()V

    goto :goto_1

    :catchall_0
    move-exception v2

    iget-object v1, v1, LK2;->d:Ljava/lang/Object;

    check-cast v1, Lnh;

    invoke-virtual {v1}, Lnh;->a()V

    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v1

    goto :goto_2

    :cond_3
    :goto_1
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lnh;->a()V

    :cond_4
    iget-object v0, p0, Lp8;->g:Lo8;

    monitor-enter v0

    :try_start_4
    iput-boolean v5, v0, Lo8;->b:Z

    invoke-virtual {v0}, Lo8;->a()Z

    move-result v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    monitor-exit v0

    if-eqz v1, :cond_7

    invoke-virtual {p0}, Lp8;->m()V

    goto :goto_3

    :catchall_2
    move-exception v1

    monitor-exit v0

    throw v1

    :goto_2
    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lnh;->a()V

    :cond_5
    throw v1

    :cond_6
    invoke-virtual {p0}, Lp8;->o()V

    :cond_7
    :goto_3
    return-void
.end method

.method public final h()Lc8;
    .locals 3

    iget v0, p0, Lp8;->D:I

    invoke-static {v0}, LVo;->o(I)I

    move-result v0

    const/4 v1, 0x1

    iget-object v2, p0, Lp8;->a:Ln8;

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    iget v1, p0, Lp8;->D:I

    invoke-static {v1}, LVo;->q(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Unrecognized stage: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, LYo;

    invoke-direct {v0, v2, p0}, LYo;-><init>(Ln8;Lb8;)V

    return-object v0

    :cond_2
    new-instance v0, LX7;

    invoke-virtual {v2}, Ln8;->a()Ljava/util/ArrayList;

    move-result-object v1

    invoke-direct {v0, v1, v2, p0}, LX7;-><init>(Ljava/util/List;Ln8;Lb8;)V

    return-object v0

    :cond_3
    new-instance v0, LJm;

    invoke-direct {v0, v2, p0}, LJm;-><init>(Ln8;Lb8;)V

    return-object v0
.end method

.method public final i(I)I
    .locals 4

    invoke-static {p1}, LVo;->o(I)I

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_6

    const/4 v2, 0x1

    const/4 v3, 0x3

    if-eq v0, v2, :cond_4

    const/4 v2, 0x6

    if-eq v0, v1, :cond_2

    if-eq v0, v3, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {p1}, LVo;->q(I)Ljava/lang/String;

    move-result-object p1

    const-string v1, "Unrecognized stage: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return v2

    :cond_2
    iget-boolean p1, p0, Lp8;->s:Z

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v2, 0x4

    :goto_1
    return v2

    :cond_4
    iget-object p1, p0, Lp8;->n:Lk9;

    invoke-virtual {p1}, Lk9;->a()Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {p0, v3}, Lp8;->i(I)I

    move-result v3

    :goto_2
    return v3

    :cond_6
    iget-object p1, p0, Lp8;->n:Lk9;

    invoke-virtual {p1}, Lk9;->b()Z

    move-result p1

    if-eqz p1, :cond_7

    goto :goto_3

    :cond_7
    invoke-virtual {p0, v1}, Lp8;->i(I)I

    move-result v1

    :goto_3
    return v1
.end method

.method public final j(Ljava/lang/String;JLjava/lang/String;)V
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " in "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2, p3}, Loh;->a(J)D

    move-result-wide p1

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p1, ", load key: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lp8;->k:Llb;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    if-eqz p4, :cond_0

    const-string p1, ", "

    invoke-virtual {p1, p4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", thread: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "DecodeJob"

    invoke-static {p2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final k(LIm;IZ)V
    .locals 7

    invoke-virtual {p0}, Lp8;->q()V

    iget-object v0, p0, Lp8;->p:Ljb;

    monitor-enter v0

    :try_start_0
    iput-object p1, v0, Ljb;->q:LIm;

    iput p2, v0, Ljb;->r:I

    iput-boolean p3, v0, Ljb;->y:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-enter v0

    :try_start_1
    iget-object p1, v0, Ljb;->b:Lwp;

    invoke-virtual {p1}, Lwp;->a()V

    iget-boolean p1, v0, Ljb;->x:Z

    if-eqz p1, :cond_0

    iget-object p1, v0, Ljb;->q:LIm;

    invoke-interface {p1}, LIm;->e()V

    invoke-virtual {v0}, Ljb;->g()V

    monitor-exit v0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_2

    :cond_0
    iget-object p1, v0, Ljb;->a:Lib;

    iget-object p1, p1, Lib;->a:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_3

    iget-boolean p1, v0, Ljb;->s:Z

    if-nez p1, :cond_2

    iget-object p1, v0, Ljb;->e:Lh8;

    iget-object v2, v0, Ljb;->q:LIm;

    iget-boolean v3, v0, Ljb;->m:Z

    iget-object v5, v0, Ljb;->l:Lfg;

    iget-object v6, v0, Ljb;->c:Lmb;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Lnb;

    const/4 v4, 0x1

    move-object v1, p1

    invoke-direct/range {v1 .. v6}, Lnb;-><init>(LIm;ZZLfg;Lmb;)V

    iput-object p1, v0, Ljb;->v:Lnb;

    const/4 p1, 0x1

    iput-boolean p1, v0, Ljb;->s:Z

    iget-object p2, v0, Ljb;->a:Lib;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p3, Ljava/util/ArrayList;

    iget-object p2, p2, Lib;->a:Ljava/util/List;

    invoke-direct {p3, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p2

    add-int/2addr p2, p1

    invoke-virtual {v0, p2}, Ljb;->e(I)V

    iget-object p1, v0, Ljb;->l:Lfg;

    iget-object p2, v0, Ljb;->v:Lnb;

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v1, v0, Ljb;->f:Lkb;

    check-cast v1, Lfb;

    invoke-virtual {v1, v0, p1, p2}, Lfb;->d(Ljb;Lfg;Lnb;)V

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lhb;

    iget-object p3, p2, Lhb;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Lgb;

    iget-object p2, p2, Lhb;->a:LLm;

    const/4 v2, 0x1

    invoke-direct {v1, v0, p2, v2}, Lgb;-><init>(Ljb;LLm;I)V

    invoke-interface {p3, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljb;->d()V

    :goto_1
    return-void

    :cond_2
    :try_start_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Already have resource"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Received a resource without any callbacks to notify"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1
.end method

.method public final l()V
    .locals 7

    invoke-virtual {p0}, Lp8;->q()V

    new-instance v0, LXd;

    const-string v1, "Failed to load resource"

    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Lp8;->b:Ljava/util/ArrayList;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-direct {v0, v1, v2}, LXd;-><init>(Ljava/lang/String;Ljava/util/List;)V

    iget-object v1, p0, Lp8;->p:Ljb;

    monitor-enter v1

    :try_start_0
    iput-object v0, v1, Ljb;->t:LXd;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    monitor-enter v1

    :try_start_1
    iget-object v0, v1, Ljb;->b:Lwp;

    invoke-virtual {v0}, Lwp;->a()V

    iget-boolean v0, v1, Ljb;->x:Z

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Ljb;->g()V

    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_0
    iget-object v0, v1, Ljb;->a:Lib;

    iget-object v0, v0, Lib;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    iget-boolean v0, v1, Ljb;->u:Z

    if-nez v0, :cond_3

    iput-boolean v2, v1, Ljb;->u:Z

    iget-object v0, v1, Ljb;->l:Lfg;

    iget-object v3, v1, Ljb;->a:Lib;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v4, Ljava/util/ArrayList;

    iget-object v3, v3, Lib;->a:Ljava/util/List;

    invoke-direct {v4, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    add-int/2addr v3, v2

    invoke-virtual {v1, v3}, Ljb;->e(I)V

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v3, v1, Ljb;->f:Lkb;

    const/4 v5, 0x0

    check-cast v3, Lfb;

    invoke-virtual {v3, v1, v0, v5}, Lfb;->d(Ljb;Lfg;Lnb;)V

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lhb;

    iget-object v4, v3, Lhb;->b:Ljava/util/concurrent/Executor;

    new-instance v5, Lgb;

    iget-object v3, v3, Lhb;->a:LLm;

    const/4 v6, 0x0

    invoke-direct {v5, v1, v3, v6}, Lgb;-><init>(Ljb;LLm;I)V

    invoke-interface {v4, v5}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljb;->d()V

    :goto_1
    iget-object v0, p0, Lp8;->g:Lo8;

    monitor-enter v0

    :try_start_2
    iput-boolean v2, v0, Lo8;->c:Z

    invoke-virtual {v0}, Lo8;->a()Z

    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v0

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lp8;->m()V

    :cond_2
    return-void

    :catchall_1
    move-exception v1

    monitor-exit v0

    throw v1

    :cond_3
    :try_start_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Already failed once"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Received an exception without any callbacks to notify"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_2
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0

    :catchall_2
    move-exception v0

    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw v0
.end method

.method public final m()V
    .locals 4

    iget-object v0, p0, Lp8;->g:Lo8;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v1, v0, Lo8;->b:Z

    iput-boolean v1, v0, Lo8;->a:Z

    iput-boolean v1, v0, Lo8;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    iget-object v0, p0, Lp8;->f:LK2;

    const/4 v2, 0x0

    iput-object v2, v0, LK2;->b:Ljava/lang/Object;

    iput-object v2, v0, LK2;->c:Ljava/lang/Object;

    iput-object v2, v0, LK2;->d:Ljava/lang/Object;

    iget-object v0, p0, Lp8;->a:Ln8;

    iput-object v2, v0, Ln8;->c:LVd;

    iput-object v2, v0, Ln8;->d:Ljava/lang/Object;

    iput-object v2, v0, Ln8;->n:Lfg;

    iput-object v2, v0, Ln8;->g:Ljava/lang/Class;

    iput-object v2, v0, Ln8;->k:Ljava/lang/Class;

    iput-object v2, v0, Ln8;->i:Lrk;

    iput-object v2, v0, Ln8;->o:LUk;

    iput-object v2, v0, Ln8;->j:Ljava/util/Map;

    iput-object v2, v0, Ln8;->p:Lk9;

    iget-object v3, v0, Ln8;->a:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    iput-boolean v1, v0, Ln8;->l:Z

    iget-object v3, v0, Ln8;->b:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    iput-boolean v1, v0, Ln8;->m:Z

    iput-boolean v1, p0, Lp8;->A:Z

    iput-object v2, p0, Lp8;->h:LVd;

    iput-object v2, p0, Lp8;->i:Lfg;

    iput-object v2, p0, Lp8;->o:Lrk;

    iput-object v2, p0, Lp8;->j:LUk;

    iput-object v2, p0, Lp8;->k:Llb;

    iput-object v2, p0, Lp8;->p:Ljb;

    iput v1, p0, Lp8;->D:I

    iput-object v2, p0, Lp8;->z:Lc8;

    iput-object v2, p0, Lp8;->u:Ljava/lang/Thread;

    iput-object v2, p0, Lp8;->v:Lfg;

    iput-object v2, p0, Lp8;->x:Ljava/lang/Object;

    iput v1, p0, Lp8;->F:I

    iput-object v2, p0, Lp8;->y:La8;

    const-wide/16 v2, 0x0

    iput-wide v2, p0, Lp8;->r:J

    iput-boolean v1, p0, Lp8;->B:Z

    iget-object v0, p0, Lp8;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lp8;->e:LNk;

    invoke-interface {v0, p0}, LNk;->a(Ljava/lang/Object;)Z

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final n(I)V
    .locals 1

    iput p1, p0, Lp8;->E:I

    iget-object p1, p0, Lp8;->p:Ljb;

    iget-boolean v0, p1, Ljb;->n:Z

    if-eqz v0, :cond_0

    iget-object p1, p1, Ljb;->i:LZd;

    goto :goto_0

    :cond_0
    iget-boolean v0, p1, Ljb;->o:Z

    if-eqz v0, :cond_1

    iget-object p1, p1, Ljb;->j:LZd;

    goto :goto_0

    :cond_1
    iget-object p1, p1, Ljb;->h:LZd;

    :goto_0
    invoke-virtual {p1, p0}, LZd;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final o()V
    .locals 3

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    iput-object v0, p0, Lp8;->u:Ljava/lang/Thread;

    sget v0, Loh;->b:I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v0

    iput-wide v0, p0, Lp8;->r:J

    const/4 v0, 0x0

    :cond_0
    iget-boolean v1, p0, Lp8;->B:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Lp8;->z:Lc8;

    if-eqz v1, :cond_1

    iget-object v0, p0, Lp8;->z:Lc8;

    invoke-interface {v0}, Lc8;->b()Z

    move-result v0

    if-nez v0, :cond_1

    iget v1, p0, Lp8;->D:I

    invoke-virtual {p0, v1}, Lp8;->i(I)I

    move-result v1

    iput v1, p0, Lp8;->D:I

    invoke-virtual {p0}, Lp8;->h()Lc8;

    move-result-object v1

    iput-object v1, p0, Lp8;->z:Lc8;

    iget v1, p0, Lp8;->D:I

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lp8;->n(I)V

    return-void

    :cond_1
    iget v1, p0, Lp8;->D:I

    const/4 v2, 0x6

    if-eq v1, v2, :cond_2

    iget-boolean v1, p0, Lp8;->B:Z

    if-eqz v1, :cond_3

    :cond_2
    if-nez v0, :cond_3

    invoke-virtual {p0}, Lp8;->l()V

    :cond_3
    return-void
.end method

.method public final p()V
    .locals 3

    iget v0, p0, Lp8;->E:I

    invoke-static {v0}, LVo;->o(I)I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_5

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lp8;->g()V

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    iget v1, p0, Lp8;->E:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_3

    const/4 v2, 0x2

    if-eq v1, v2, :cond_2

    const/4 v2, 0x3

    if-eq v1, v2, :cond_1

    const-string v1, "null"

    goto :goto_0

    :cond_1
    const-string v1, "DECODE_DATA"

    goto :goto_0

    :cond_2
    const-string v1, "SWITCH_TO_SOURCE_SERVICE"

    goto :goto_0

    :cond_3
    const-string v1, "INITIALIZE"

    :goto_0
    const-string v2, "Unrecognized run reason: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    invoke-virtual {p0}, Lp8;->o()V

    goto :goto_1

    :cond_5
    invoke-virtual {p0, v1}, Lp8;->i(I)I

    move-result v0

    iput v0, p0, Lp8;->D:I

    invoke-virtual {p0}, Lp8;->h()Lc8;

    move-result-object v0

    iput-object v0, p0, Lp8;->z:Lc8;

    invoke-virtual {p0}, Lp8;->o()V

    :goto_1
    return-void
.end method

.method public final q()V
    .locals 3

    iget-object v0, p0, Lp8;->c:Lwp;

    invoke-virtual {v0}, Lwp;->a()V

    iget-boolean v0, p0, Lp8;->A:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lp8;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lp8;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-int/2addr v2, v1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    :goto_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Already notified"

    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    iput-boolean v1, p0, Lp8;->A:Z

    return-void
.end method

.method public final run()V
    .locals 5

    const-string v0, "DecodeJob"

    const-string v1, "DecodeJob threw unexpectedly, isCancelled: "

    iget-object v2, p0, Lp8;->y:La8;

    :try_start_0
    iget-boolean v3, p0, Lp8;->B:Z

    if-eqz v3, :cond_1

    invoke-virtual {p0}, Lp8;->l()V
    :try_end_0
    .catch Ll5; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    invoke-interface {v2}, La8;->c()V

    :cond_0
    return-void

    :catchall_0
    move-exception v3

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_1
    :try_start_1
    invoke-virtual {p0}, Lp8;->p()V
    :try_end_1
    .catch Ll5; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v2, :cond_2

    invoke-interface {v2}, La8;->c()V

    :cond_2
    return-void

    :goto_0
    const/4 v4, 0x3

    :try_start_2
    invoke-static {v0, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v4

    if-eqz v4, :cond_3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Lp8;->B:Z

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", stage: "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lp8;->D:I

    invoke-static {v1}, LVo;->q(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    :catchall_1
    move-exception v0

    goto :goto_3

    :cond_3
    :goto_1
    iget v0, p0, Lp8;->D:I

    const/4 v1, 0x5

    if-eq v0, v1, :cond_4

    iget-object v0, p0, Lp8;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lp8;->l()V

    :cond_4
    iget-boolean v0, p0, Lp8;->B:Z

    if-nez v0, :cond_5

    throw v3

    :cond_5
    throw v3

    :goto_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_3
    if-eqz v2, :cond_6

    invoke-interface {v2}, La8;->c()V

    :cond_6
    throw v0
.end method
