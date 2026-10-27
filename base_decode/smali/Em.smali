.class public final LEm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ComponentCallbacks2;
.implements LBg;


# static fields
.field public static final k:LGm;


# instance fields
.field public final a:Lcom/bumptech/glide/a;

.field public final b:Landroid/content/Context;

.field public final c:Lvg;

.field public final d:LLo;

.field public final e:Lh8;

.field public final f:Lhq;

.field public final g:Lr0;

.field public final h:La7;

.field public final i:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final j:LGm;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LGm;

    invoke-direct {v0}, LZ3;-><init>()V

    const-class v1, Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, LZ3;->c(Ljava/lang/Class;)LZ3;

    move-result-object v0

    check-cast v0, LGm;

    const/4 v1, 0x1

    iput-boolean v1, v0, LZ3;->t:Z

    sput-object v0, LEm;->k:LGm;

    new-instance v0, LGm;

    invoke-direct {v0}, LZ3;-><init>()V

    const-class v2, LId;

    invoke-virtual {v0, v2}, LZ3;->c(Ljava/lang/Class;)LZ3;

    move-result-object v0

    check-cast v0, LGm;

    iput-boolean v1, v0, LZ3;->t:Z

    sget-object v0, Lk9;->c:Lk9;

    new-instance v1, LGm;

    invoke-direct {v1}, LZ3;-><init>()V

    invoke-virtual {v1, v0}, LZ3;->d(Lk9;)LZ3;

    move-result-object v0

    check-cast v0, LGm;

    invoke-virtual {v0}, LZ3;->i()LZ3;

    move-result-object v0

    check-cast v0, LGm;

    invoke-virtual {v0}, LZ3;->n()LZ3;

    move-result-object v0

    check-cast v0, LGm;

    return-void
.end method

.method public constructor <init>(Lcom/bumptech/glide/a;Lvg;Lh8;Landroid/content/Context;)V
    .locals 6

    new-instance v0, LLo;

    invoke-direct {v0}, LLo;-><init>()V

    iget-object v1, p1, Lcom/bumptech/glide/a;->f:Lh8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v2, Lhq;

    invoke-direct {v2}, Lhq;-><init>()V

    iput-object v2, p0, LEm;->f:Lhq;

    new-instance v2, Lr0;

    const/16 v3, 0xd

    invoke-direct {v2, p0, v3}, Lr0;-><init>(Ljava/lang/Object;I)V

    iput-object v2, p0, LEm;->g:Lr0;

    iput-object p1, p0, LEm;->a:Lcom/bumptech/glide/a;

    iput-object p2, p0, LEm;->c:Lvg;

    iput-object p3, p0, LEm;->e:Lh8;

    iput-object v0, p0, LEm;->d:LLo;

    iput-object p4, p0, LEm;->b:Landroid/content/Context;

    invoke-virtual {p4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p3

    new-instance p4, LDm;

    invoke-direct {p4, p0, v0}, LDm;-><init>(LEm;LLo;)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "android.permission.ACCESS_NETWORK_STATE"

    invoke-static {p3, v0}, LF4;->j(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    const/4 v3, 0x1

    if-nez v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const-string v4, "ConnectivityMonitor"

    const/4 v5, 0x3

    invoke-static {v4, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_2

    if-eqz v0, :cond_1

    const-string v5, "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor"

    goto :goto_1

    :cond_1
    const-string v5, "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor"

    :goto_1
    invoke-static {v4, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    if-eqz v0, :cond_3

    new-instance v0, Lt8;

    invoke-direct {v0, p3, p4}, Lt8;-><init>(Landroid/content/Context;LDm;)V

    goto :goto_2

    :cond_3
    new-instance v0, LIj;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    :goto_2
    iput-object v0, p0, LEm;->h:La7;

    iget-object p3, p1, Lcom/bumptech/glide/a;->g:Ljava/util/ArrayList;

    monitor-enter p3

    :try_start_0
    iget-object p4, p1, Lcom/bumptech/glide/a;->g:Ljava/util/ArrayList;

    invoke-virtual {p4, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p4

    if-nez p4, :cond_9

    iget-object p4, p1, Lcom/bumptech/glide/a;->g:Ljava/util/ArrayList;

    invoke-virtual {p4, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-exit p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    sget-object p3, LQr;->a:[C

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p3

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p4

    if-ne p3, p4, :cond_4

    move v1, v3

    :cond_4
    xor-int/lit8 p3, v1, 0x1

    if-eqz p3, :cond_5

    invoke-static {}, LQr;->f()Landroid/os/Handler;

    move-result-object p3

    invoke-virtual {p3, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_3

    :cond_5
    invoke-interface {p2, p0}, Lvg;->g(LBg;)V

    :goto_3
    invoke-interface {p2, v0}, Lvg;->g(LBg;)V

    new-instance p2, Ljava/util/concurrent/CopyOnWriteArrayList;

    iget-object p3, p1, Lcom/bumptech/glide/a;->c:LVd;

    iget-object p3, p3, LVd;->e:Ljava/util/List;

    invoke-direct {p2, p3}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    iput-object p2, p0, LEm;->i:Ljava/util/concurrent/CopyOnWriteArrayList;

    iget-object p1, p1, Lcom/bumptech/glide/a;->c:LVd;

    monitor-enter p1

    :try_start_1
    iget-object p2, p1, LVd;->j:LGm;

    if-nez p2, :cond_6

    iget-object p2, p1, LVd;->d:Lh8;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p2, LGm;

    invoke-direct {p2}, LZ3;-><init>()V

    iput-boolean v3, p2, LZ3;->t:Z

    iput-object p2, p1, LVd;->j:LGm;

    goto :goto_4

    :catchall_0
    move-exception p2

    goto :goto_6

    :cond_6
    :goto_4
    iget-object p2, p1, LVd;->j:LGm;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p1

    monitor-enter p0

    :try_start_2
    invoke-virtual {p2}, LZ3;->b()LZ3;

    move-result-object p1

    check-cast p1, LGm;

    iget-boolean p2, p1, LZ3;->t:Z

    if-eqz p2, :cond_8

    iget-boolean p2, p1, LZ3;->v:Z

    if-eqz p2, :cond_7

    goto :goto_5

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "You cannot auto lock an already locked options object, try clone() first"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    :goto_5
    iput-boolean v3, p1, LZ3;->v:Z

    iput-boolean v3, p1, LZ3;->t:Z

    iput-object p1, p0, LEm;->j:LGm;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit p0

    return-void

    :catchall_1
    move-exception p1

    monitor-exit p0

    throw p1

    :goto_6
    monitor-exit p1

    throw p2

    :catchall_2
    move-exception p1

    goto :goto_7

    :cond_9
    :try_start_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot register already registered manager"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_7
    monitor-exit p3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw p1
.end method


# virtual methods
.method public final declared-synchronized f()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LEm;->f:Lhq;

    invoke-virtual {v0}, Lhq;->f()V

    invoke-virtual {p0}, LEm;->m()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized j()V
    .locals 1

    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, LEm;->n()V

    iget-object v0, p0, LEm;->f:Lhq;

    invoke-virtual {v0}, Lhq;->j()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized k()V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LEm;->f:Lhq;

    invoke-virtual {v0}, Lhq;->k()V

    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v0, p0, LEm;->f:Lhq;

    iget-object v0, v0, Lhq;->a:Ljava/util/Set;

    invoke-static {v0}, LQr;->e(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lgq;

    invoke-virtual {p0, v1}, LEm;->l(Lgq;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_0
    iget-object v0, p0, LEm;->f:Lhq;

    iget-object v0, v0, Lhq;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit p0

    iget-object v0, p0, LEm;->d:LLo;

    iget-object v1, v0, LLo;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/Set;

    invoke-static {v1}, LQr;->e(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lxm;

    invoke-virtual {v0, v2}, LLo;->a(Lxm;)Z

    goto :goto_1

    :cond_1
    iget-object v0, v0, LLo;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    iget-object v0, p0, LEm;->c:Lvg;

    invoke-interface {v0, p0}, Lvg;->f(LBg;)V

    iget-object v0, p0, LEm;->c:Lvg;

    iget-object v1, p0, LEm;->h:La7;

    invoke-interface {v0, v1}, Lvg;->f(LBg;)V

    iget-object v0, p0, LEm;->g:Lr0;

    invoke-static {}, LQr;->f()Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, LEm;->a:Lcom/bumptech/glide/a;

    invoke-virtual {v0, p0}, Lcom/bumptech/glide/a;->c(LEm;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit p0

    return-void

    :catchall_1
    move-exception v0

    goto :goto_3

    :goto_2
    :try_start_3
    monitor-exit p0

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_3
    monitor-exit p0

    throw v0
.end method

.method public final l(Lgq;)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, LEm;->o(Lgq;)Z

    move-result v0

    invoke-interface {p1}, Lgq;->g()Lxm;

    move-result-object v1

    if-nez v0, :cond_3

    iget-object v0, p0, LEm;->a:Lcom/bumptech/glide/a;

    iget-object v2, v0, Lcom/bumptech/glide/a;->g:Ljava/util/ArrayList;

    monitor-enter v2

    :try_start_0
    iget-object v0, v0, Lcom/bumptech/glide/a;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LEm;

    invoke-virtual {v3, p1}, LEm;->o(Lgq;)Z

    move-result v3

    if-eqz v3, :cond_1

    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_2
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_3

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lgq;->b(Lxm;)V

    invoke-interface {v1}, Lxm;->clear()V

    goto :goto_1

    :goto_0
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_3
    :goto_1
    return-void
.end method

.method public final declared-synchronized m()V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LEm;->d:LLo;

    const/4 v1, 0x1

    iput-boolean v1, v0, LLo;->b:Z

    iget-object v1, v0, LLo;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/Set;

    invoke-static {v1}, LQr;->e(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lxm;

    invoke-interface {v2}, Lxm;->isRunning()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Lxm;->d()V

    iget-object v3, v0, LLo;->d:Ljava/lang/Object;

    check-cast v3, Ljava/util/HashSet;

    invoke-virtual {v3, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized n()V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LEm;->d:LLo;

    const/4 v1, 0x0

    iput-boolean v1, v0, LLo;->b:Z

    iget-object v1, v0, LLo;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/Set;

    invoke-static {v1}, LQr;->e(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lxm;

    invoke-interface {v2}, Lxm;->j()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-interface {v2}, Lxm;->isRunning()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-interface {v2}, Lxm;->f()V

    goto :goto_0

    :cond_1
    iget-object v0, v0, LLo;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized o(Lgq;)Z
    .locals 3

    monitor-enter p0

    :try_start_0
    invoke-interface {p1}, Lgq;->g()Lxm;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    monitor-exit p0

    return v1

    :cond_0
    :try_start_1
    iget-object v2, p0, LEm;->d:LLo;

    invoke-virtual {v2, v0}, LLo;->a(Lxm;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LEm;->f:Lhq;

    iget-object v0, v0, Lhq;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lgq;->b(Lxm;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return v1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    monitor-exit p0

    const/4 p1, 0x0

    return p1

    :goto_0
    monitor-exit p0

    throw p1
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    return-void
.end method

.method public final onLowMemory()V
    .locals 0

    return-void
.end method

.method public final onTrimMemory(I)V
    .locals 0

    return-void
.end method

.method public final declared-synchronized toString()Ljava/lang/String;
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{tracker="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LEm;->d:LLo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", treeNode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LEm;->e:Lh8;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
