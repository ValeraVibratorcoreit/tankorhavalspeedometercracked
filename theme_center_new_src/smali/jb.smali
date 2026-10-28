.class public final Ljb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LIb;


# static fields
.field public static final z:Lh8;


# instance fields
.field public final a:Lib;

.field public final b:Lwp;

.field public final c:Lmb;

.field public final d:LNk;

.field public final e:Lh8;

.field public final f:Lkb;

.field public final g:LZd;

.field public final h:LZd;

.field public final i:LZd;

.field public final j:LZd;

.field public final k:Ljava/util/concurrent/atomic/AtomicInteger;

.field public l:Lfg;

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:LIm;

.field public r:I

.field public s:Z

.field public t:LXd;

.field public u:Z

.field public v:Lnb;

.field public w:Lp8;

.field public volatile x:Z

.field public y:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh8;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lh8;-><init>(I)V

    sput-object v0, Ljb;->z:Lh8;

    return-void
.end method

.method public constructor <init>(LZd;LZd;LZd;LZd;Lkb;Lmb;LK2;)V
    .locals 4

    sget-object v0, Ljb;->z:Lh8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lib;

    new-instance v2, Ljava/util/ArrayList;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-direct {v1, v2}, Lib;-><init>(Ljava/util/ArrayList;)V

    iput-object v1, p0, Ljb;->a:Lib;

    new-instance v1, Lwp;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Ljb;->b:Lwp;

    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v1, p0, Ljb;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p1, p0, Ljb;->g:LZd;

    iput-object p2, p0, Ljb;->h:LZd;

    iput-object p3, p0, Ljb;->i:LZd;

    iput-object p4, p0, Ljb;->j:LZd;

    iput-object p5, p0, Ljb;->f:Lkb;

    iput-object p6, p0, Ljb;->c:Lmb;

    iput-object p7, p0, Ljb;->d:LNk;

    iput-object v0, p0, Ljb;->e:Lh8;

    return-void
.end method


# virtual methods
.method public final declared-synchronized a(LLm;Ljava/util/concurrent/Executor;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Ljb;->b:Lwp;

    invoke-virtual {v0}, Lwp;->a()V

    iget-object v0, p0, Ljb;->a:Lib;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lhb;

    invoke-direct {v1, p1, p2}, Lhb;-><init>(LLm;Ljava/util/concurrent/Executor;)V

    iget-object v0, v0, Lib;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-boolean v0, p0, Ljb;->s:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p0, v1}, Ljb;->e(I)V

    new-instance v0, Lgb;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Lgb;-><init>(Ljb;LLm;I)V

    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-boolean v0, p0, Ljb;->u:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0, v1}, Ljb;->e(I)V

    new-instance v0, Lgb;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lgb;-><init>(Ljb;LLm;I)V

    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_1
    iget-boolean p1, p0, Ljb;->x:Z

    xor-int/2addr p1, v1

    const-string p2, "Cannot add callbacks to a cancelled EngineJob"

    invoke-static {p2, p1}, LUd;->i(Ljava/lang/String;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0

    throw p1
.end method

.method public final b()Lwp;
    .locals 1

    iget-object v0, p0, Ljb;->b:Lwp;

    return-object v0
.end method

.method public final c()V
    .locals 4

    invoke-virtual {p0}, Ljb;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Ljb;->x:Z

    iget-object v1, p0, Ljb;->w:Lp8;

    iput-boolean v0, v1, Lp8;->B:Z

    iget-object v0, v1, Lp8;->z:Lc8;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lc8;->cancel()V

    :cond_1
    iget-object v0, p0, Ljb;->f:Lkb;

    iget-object v1, p0, Ljb;->l:Lfg;

    check-cast v0, Lfb;

    monitor-enter v0

    :try_start_0
    iget-object v2, v0, Lfb;->a:Lbg;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v3, p0, Ljb;->p:Z

    if-eqz v3, :cond_2

    iget-object v2, v2, Lbg;->b:Ljava/util/HashMap;

    goto :goto_0

    :cond_2
    iget-object v2, v2, Lbg;->a:Ljava/util/HashMap;

    :goto_0
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final d()V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Ljb;->b:Lwp;

    invoke-virtual {v0}, Lwp;->a()V

    invoke-virtual {p0}, Ljb;->f()Z

    move-result v0

    const-string v1, "Not yet complete!"

    invoke-static {v1, v0}, LUd;->i(Ljava/lang/String;Z)V

    iget-object v0, p0, Ljb;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-ltz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "Can\'t decrement below 0"

    invoke-static {v2, v1}, LUd;->i(Ljava/lang/String;Z)V

    if-nez v0, :cond_1

    iget-object v0, p0, Ljb;->v:Lnb;

    invoke-virtual {p0}, Ljb;->g()V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    const/4 v0, 0x0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lnb;->b()V

    :cond_2
    return-void

    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final declared-synchronized e(I)V
    .locals 2

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Ljb;->f()Z

    move-result v0

    const-string v1, "Not yet complete!"

    invoke-static {v1, v0}, LUd;->i(Ljava/lang/String;Z)V

    iget-object v0, p0, Ljb;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndAdd(I)I

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Ljb;->v:Lnb;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lnb;->a()V
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

.method public final f()Z
    .locals 1

    iget-boolean v0, p0, Ljb;->u:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ljb;->s:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Ljb;->x:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public final declared-synchronized g()V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Ljb;->l:Lfg;

    if-eqz v0, :cond_1

    iget-object v0, p0, Ljb;->a:Lib;

    iget-object v0, v0, Lib;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const/4 v0, 0x0

    iput-object v0, p0, Ljb;->l:Lfg;

    iput-object v0, p0, Ljb;->v:Lnb;

    iput-object v0, p0, Ljb;->q:LIm;

    const/4 v1, 0x0

    iput-boolean v1, p0, Ljb;->u:Z

    iput-boolean v1, p0, Ljb;->x:Z

    iput-boolean v1, p0, Ljb;->s:Z

    iput-boolean v1, p0, Ljb;->y:Z

    iget-object v2, p0, Ljb;->w:Lp8;

    iget-object v3, v2, Lp8;->g:Lo8;

    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v4, 0x1

    :try_start_1
    iput-boolean v4, v3, Lo8;->a:Z

    invoke-virtual {v3}, Lo8;->a()Z

    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    monitor-exit v3

    if-eqz v4, :cond_0

    invoke-virtual {v2}, Lp8;->m()V

    :cond_0
    iput-object v0, p0, Ljb;->w:Lp8;

    iput-object v0, p0, Ljb;->t:LXd;

    iput v1, p0, Ljb;->r:I

    iget-object v0, p0, Ljb;->d:LNk;

    invoke-interface {v0, p0}, LNk;->a(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_3
    monitor-exit v3

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_0
    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized h(LLm;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Ljb;->b:Lwp;

    invoke-virtual {v0}, Lwp;->a()V

    iget-object v0, p0, Ljb;->a:Lib;

    new-instance v1, Lhb;

    sget-object v2, Lmk;->f:LD1;

    invoke-direct {v1, p1, v2}, Lhb;-><init>(LLm;Ljava/util/concurrent/Executor;)V

    iget-object p1, v0, Lib;->a:Ljava/util/List;

    invoke-interface {p1, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Ljb;->a:Lib;

    iget-object p1, p1, Lib;->a:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Ljb;->c()V

    iget-boolean p1, p0, Ljb;->s:Z

    if-nez p1, :cond_0

    iget-boolean p1, p0, Ljb;->u:Z

    if-eqz p1, :cond_1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object p1, p0, Ljb;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Ljb;->g()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0

    throw p1
.end method
