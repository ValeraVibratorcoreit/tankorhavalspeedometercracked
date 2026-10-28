.class public final LHo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxm;
.implements LQo;
.implements LLm;


# static fields
.field public static final C:Z


# instance fields
.field public final A:Ljava/lang/RuntimeException;

.field public B:I

.field public final a:Ljava/lang/String;

.field public final b:Lwp;

.field public final c:Ljava/lang/Object;

.field public final d:LAm;

.field public final e:Landroid/content/Context;

.field public final f:LVd;

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/lang/Class;

.field public final i:LZ3;

.field public final j:I

.field public final k:I

.field public final l:LUk;

.field public final m:Lgq;

.field public final n:Ljava/util/List;

.field public final o:Lmh;

.field public final p:Ljava/util/concurrent/Executor;

.field public q:LIm;

.field public r:LK2;

.field public s:J

.field public volatile t:Lfb;

.field public u:Landroid/graphics/drawable/Drawable;

.field public v:Landroid/graphics/drawable/Drawable;

.field public w:Landroid/graphics/drawable/Drawable;

.field public x:I

.field public y:I

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "GlideRequest"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    sput-boolean v0, LHo;->C:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LVd;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;LZ3;IILUk;Lgq;Ljava/util/List;LAm;Lfb;Lmh;)V
    .locals 4

    move-object v0, p0

    move-object v1, p2

    sget-object v2, Lmk;->e:LD1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-boolean v3, LHo;->C:Z

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iput-object v3, v0, LHo;->a:Ljava/lang/String;

    new-instance v3, Lwp;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput-object v3, v0, LHo;->b:Lwp;

    move-object v3, p3

    iput-object v3, v0, LHo;->c:Ljava/lang/Object;

    move-object v3, p1

    iput-object v3, v0, LHo;->e:Landroid/content/Context;

    iput-object v1, v0, LHo;->f:LVd;

    move-object v3, p4

    iput-object v3, v0, LHo;->g:Ljava/lang/Object;

    move-object v3, p5

    iput-object v3, v0, LHo;->h:Ljava/lang/Class;

    move-object v3, p6

    iput-object v3, v0, LHo;->i:LZ3;

    move v3, p7

    iput v3, v0, LHo;->j:I

    move v3, p8

    iput v3, v0, LHo;->k:I

    move-object v3, p9

    iput-object v3, v0, LHo;->l:LUk;

    move-object v3, p10

    iput-object v3, v0, LHo;->m:Lgq;

    move-object v3, p11

    iput-object v3, v0, LHo;->n:Ljava/util/List;

    move-object/from16 v3, p12

    iput-object v3, v0, LHo;->d:LAm;

    move-object/from16 v3, p13

    iput-object v3, v0, LHo;->t:Lfb;

    move-object/from16 v3, p14

    iput-object v3, v0, LHo;->o:Lmh;

    iput-object v2, v0, LHo;->p:Ljava/util/concurrent/Executor;

    const/4 v2, 0x1

    iput v2, v0, LHo;->B:I

    iget-object v2, v0, LHo;->A:Ljava/lang/RuntimeException;

    if-nez v2, :cond_1

    iget-object v1, v1, LVd;->h:Lk0;

    iget-object v1, v1, Lk0;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    const-class v2, LUd;

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Glide request origin trace"

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    iput-object v1, v0, LHo;->A:Ljava/lang/RuntimeException;

    :cond_1
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 3

    iget-object v0, p0, LHo;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, LHo;->B:I

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

.method public final b(Lxm;)Z
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    instance-of v2, v0, LHo;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    return v3

    :cond_0
    iget-object v2, v1, LHo;->c:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget v4, v1, LHo;->j:I

    iget v5, v1, LHo;->k:I

    iget-object v6, v1, LHo;->g:Ljava/lang/Object;

    iget-object v7, v1, LHo;->h:Ljava/lang/Class;

    iget-object v8, v1, LHo;->i:LZ3;

    iget-object v9, v1, LHo;->l:LUk;

    iget-object v10, v1, LHo;->n:Ljava/util/List;

    if-eqz v10, :cond_1

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v10

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_6

    :cond_1
    move v10, v3

    :goto_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    check-cast v0, LHo;

    iget-object v11, v0, LHo;->c:Ljava/lang/Object;

    monitor-enter v11

    :try_start_1
    iget v2, v0, LHo;->j:I

    iget v12, v0, LHo;->k:I

    iget-object v13, v0, LHo;->g:Ljava/lang/Object;

    iget-object v14, v0, LHo;->h:Ljava/lang/Class;

    iget-object v15, v0, LHo;->i:LZ3;

    iget-object v3, v0, LHo;->l:LUk;

    iget-object v0, v0, LHo;->n:Ljava/util/List;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_1

    :catchall_1
    move-exception v0

    goto :goto_5

    :cond_2
    const/4 v0, 0x0

    :goto_1
    monitor-exit v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v4, v2, :cond_7

    if-ne v5, v12, :cond_7

    sget-object v2, LQr;->a:[C

    const/4 v2, 0x1

    if-nez v6, :cond_4

    if-nez v13, :cond_3

    move v4, v2

    goto :goto_2

    :cond_3
    const/4 v4, 0x0

    goto :goto_2

    :cond_4
    invoke-virtual {v6, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    :goto_2
    if-eqz v4, :cond_7

    invoke-virtual {v7, v14}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    if-nez v8, :cond_6

    if-nez v15, :cond_5

    move v4, v2

    goto :goto_3

    :cond_5
    const/4 v4, 0x0

    goto :goto_3

    :cond_6
    invoke-virtual {v8, v15}, LZ3;->e(LZ3;)Z

    move-result v4

    :goto_3
    if-eqz v4, :cond_7

    if-ne v9, v3, :cond_7

    if-ne v10, v0, :cond_7

    move v3, v2

    goto :goto_4

    :cond_7
    const/4 v3, 0x0

    :goto_4
    return v3

    :goto_5
    :try_start_2
    monitor-exit v11
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    :goto_6
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method

.method public final c()V
    .locals 3

    iget-boolean v0, p0, LHo;->z:Z

    if-nez v0, :cond_1

    iget-object v0, p0, LHo;->b:Lwp;

    invoke-virtual {v0}, Lwp;->a()V

    iget-object v0, p0, LHo;->m:Lgq;

    invoke-interface {v0, p0}, Lgq;->d(LQo;)V

    iget-object v0, p0, LHo;->r:LK2;

    if-eqz v0, :cond_0

    iget-object v1, v0, LK2;->d:Ljava/lang/Object;

    check-cast v1, Lfb;

    monitor-enter v1

    :try_start_0
    iget-object v2, v0, LK2;->b:Ljava/lang/Object;

    check-cast v2, Ljb;

    iget-object v0, v0, LK2;->c:Ljava/lang/Object;

    check-cast v0, LLm;

    invoke-virtual {v2, v0}, Ljb;->h(LLm;)V

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    iput-object v0, p0, LHo;->r:LK2;

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_0
    :goto_0
    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You can\'t start or clear loads in RequestListener or Target callbacks. If you\'re trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final clear()V
    .locals 5

    iget-object v0, p0, LHo;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, LHo;->z:Z

    if-nez v1, :cond_5

    iget-object v1, p0, LHo;->b:Lwp;

    invoke-virtual {v1}, Lwp;->a()V

    iget v1, p0, LHo;->B:I

    const/4 v2, 0x6

    if-ne v1, v2, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, LHo;->c()V

    iget-object v1, p0, LHo;->q:LIm;

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    iput-object v3, p0, LHo;->q:LIm;

    goto :goto_0

    :cond_1
    move-object v1, v3

    :goto_0
    iget-object v3, p0, LHo;->d:LAm;

    if-eqz v3, :cond_2

    invoke-interface {v3, p0}, LAm;->e(Lxm;)Z

    move-result v3

    if-eqz v3, :cond_3

    :cond_2
    iget-object v3, p0, LHo;->m:Lgq;

    invoke-virtual {p0}, LHo;->e()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-interface {v3, v4}, Lgq;->h(Landroid/graphics/drawable/Drawable;)V

    :cond_3
    iput v2, p0, LHo;->B:I

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_4

    iget-object v0, p0, LHo;->t:Lfb;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lfb;->f(LIm;)V

    :cond_4
    return-void

    :cond_5
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "You can\'t start or clear loads in RequestListener or Target callbacks. If you\'re trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, LHo;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, LHo;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, LHo;->clear()V

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

.method public final e()Landroid/graphics/drawable/Drawable;
    .locals 3

    iget-object v0, p0, LHo;->v:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_1

    iget-object v0, p0, LHo;->i:LZ3;

    iget-object v1, v0, LZ3;->g:Landroid/graphics/drawable/Drawable;

    iput-object v1, p0, LHo;->v:Landroid/graphics/drawable/Drawable;

    if-nez v1, :cond_1

    iget v1, v0, LZ3;->h:I

    if-lez v1, :cond_1

    iget-object v0, v0, LZ3;->u:Landroid/content/res/Resources$Theme;

    iget-object v2, p0, LHo;->e:Landroid/content/Context;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    :goto_0
    invoke-static {v2, v2, v1, v0}, LTf;->A(Landroid/content/Context;Landroid/content/Context;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, LHo;->v:Landroid/graphics/drawable/Drawable;

    :cond_1
    iget-object v0, p0, LHo;->v:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final f()V
    .locals 6

    iget-object v0, p0, LHo;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, LHo;->z:Z

    if-nez v1, :cond_e

    iget-object v1, p0, LHo;->b:Lwp;

    invoke-virtual {v1}, Lwp;->a()V

    sget v1, Loh;->b:I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v1

    iput-wide v1, p0, LHo;->s:J

    iget-object v1, p0, LHo;->g:Ljava/lang/Object;

    const/4 v2, 0x3

    const/4 v3, 0x5

    if-nez v1, :cond_4

    iget v1, p0, LHo;->j:I

    iget v4, p0, LHo;->k:I

    invoke-static {v1, v4}, LQr;->i(II)Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, p0, LHo;->j:I

    iput v1, p0, LHo;->x:I

    iget v1, p0, LHo;->k:I

    iput v1, p0, LHo;->y:I

    goto :goto_0

    :catchall_0
    move-exception v1

    goto/16 :goto_5

    :cond_0
    :goto_0
    iget-object v1, p0, LHo;->w:Landroid/graphics/drawable/Drawable;

    if-nez v1, :cond_2

    iget-object v1, p0, LHo;->i:LZ3;

    iget-object v4, v1, LZ3;->o:Landroid/graphics/drawable/Drawable;

    iput-object v4, p0, LHo;->w:Landroid/graphics/drawable/Drawable;

    if-nez v4, :cond_2

    iget v4, v1, LZ3;->p:I

    if-lez v4, :cond_2

    iget-object v1, v1, LZ3;->u:Landroid/content/res/Resources$Theme;

    iget-object v5, p0, LHo;->e:Landroid/content/Context;

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    :goto_1
    invoke-static {v5, v5, v4, v1}, LTf;->A(Landroid/content/Context;Landroid/content/Context;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, p0, LHo;->w:Landroid/graphics/drawable/Drawable;

    :cond_2
    iget-object v1, p0, LHo;->w:Landroid/graphics/drawable/Drawable;

    if-nez v1, :cond_3

    move v2, v3

    :cond_3
    new-instance v1, LXd;

    const-string v3, "Received null model"

    invoke-direct {v1, v3}, LXd;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v1, v2}, LHo;->h(LXd;I)V

    monitor-exit v0

    return-void

    :cond_4
    iget v1, p0, LHo;->B:I

    const/4 v4, 0x2

    if-eq v1, v4, :cond_d

    const/4 v5, 0x4

    if-ne v1, v5, :cond_5

    iget-object v1, p0, LHo;->q:LIm;

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v3, v2}, LHo;->i(LIm;IZ)V

    monitor-exit v0

    return-void

    :cond_5
    iget-object v1, p0, LHo;->n:Ljava/util/List;

    if-nez v1, :cond_6

    goto :goto_3

    :cond_6
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, LVo;->l(Ljava/lang/Object;)V

    goto :goto_2

    :cond_7
    :goto_3
    iput v2, p0, LHo;->B:I

    iget v1, p0, LHo;->j:I

    iget v3, p0, LHo;->k:I

    invoke-static {v1, v3}, LQr;->i(II)Z

    move-result v1

    if-eqz v1, :cond_8

    iget v1, p0, LHo;->j:I

    iget v3, p0, LHo;->k:I

    invoke-virtual {p0, v1, v3}, LHo;->m(II)V

    goto :goto_4

    :cond_8
    iget-object v1, p0, LHo;->m:Lgq;

    invoke-interface {v1, p0}, Lgq;->a(LQo;)V

    :goto_4
    iget v1, p0, LHo;->B:I

    if-eq v1, v4, :cond_9

    if-ne v1, v2, :cond_b

    :cond_9
    iget-object v1, p0, LHo;->d:LAm;

    if-eqz v1, :cond_a

    invoke-interface {v1, p0}, LAm;->g(Lxm;)Z

    move-result v1

    if-eqz v1, :cond_b

    :cond_a
    iget-object v1, p0, LHo;->m:Lgq;

    invoke-virtual {p0}, LHo;->e()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-interface {v1, v2}, Lgq;->c(Landroid/graphics/drawable/Drawable;)V

    :cond_b
    sget-boolean v1, LHo;->C:Z

    if-eqz v1, :cond_c

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "finished run method in "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, LHo;->s:J

    invoke-static {v2, v3}, Loh;->a(J)D

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, LHo;->g(Ljava/lang/String;)V

    :cond_c
    monitor-exit v0

    return-void

    :cond_d
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot restart a running request"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_e
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "You can\'t start or clear loads in RequestListener or Target callbacks. If you\'re trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :goto_5
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final g(Ljava/lang/String;)V
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " this: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, LHo;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "GlideRequest"

    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final h(LXd;I)V
    .locals 4

    const-string v0, "Load failed for ["

    iget-object v1, p0, LHo;->b:Lwp;

    invoke-virtual {v1}, Lwp;->a()V

    iget-object v1, p0, LHo;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, LHo;->f:LVd;

    iget v2, v2, LVd;->i:I

    if-gt v2, p2, :cond_0

    const-string p2, "Glide"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, LHo;->g:Ljava/lang/Object;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "] with dimensions ["

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, LHo;->x:I

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "x"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, LHo;->y:I

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 p2, 0x4

    if-gt v2, p2, :cond_0

    invoke-virtual {p1}, LXd;->d()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :cond_0
    :goto_0
    const/4 p1, 0x0

    iput-object p1, p0, LHo;->r:LK2;

    const/4 p2, 0x5

    iput p2, p0, LHo;->B:I

    iget-object p2, p0, LHo;->d:LAm;

    if-eqz p2, :cond_1

    invoke-interface {p2, p0}, LAm;->h(Lxm;)V

    :cond_1
    const/4 p2, 0x1

    iput-boolean p2, p0, LHo;->z:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p2, 0x0

    :try_start_1
    iget-object v0, p0, LHo;->n:Ljava/util/List;

    if-eqz v0, :cond_4

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LVo;->l(Ljava/lang/Object;)V

    iget-object v0, p0, LHo;->d:LAm;

    if-eqz v0, :cond_3

    invoke-interface {v0}, LAm;->c()LAm;

    move-result-object v0

    invoke-interface {v0}, LAm;->a()Z

    :cond_3
    throw p1

    :catchall_1
    move-exception p1

    goto :goto_4

    :cond_4
    :goto_1
    iget-object v0, p0, LHo;->d:LAm;

    if-eqz v0, :cond_5

    invoke-interface {v0, p0}, LAm;->g(Lxm;)Z

    move-result v0

    if-eqz v0, :cond_d

    :cond_5
    iget-object v0, p0, LHo;->g:Ljava/lang/Object;

    if-nez v0, :cond_8

    iget-object p1, p0, LHo;->w:Landroid/graphics/drawable/Drawable;

    if-nez p1, :cond_7

    iget-object p1, p0, LHo;->i:LZ3;

    iget-object v0, p1, LZ3;->o:Landroid/graphics/drawable/Drawable;

    iput-object v0, p0, LHo;->w:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_7

    iget v0, p1, LZ3;->p:I

    if-lez v0, :cond_7

    iget-object p1, p1, LZ3;->u:Landroid/content/res/Resources$Theme;

    iget-object v2, p0, LHo;->e:Landroid/content/Context;

    if-eqz p1, :cond_6

    goto :goto_2

    :cond_6
    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    :goto_2
    invoke-static {v2, v2, v0, p1}, LTf;->A(Landroid/content/Context;Landroid/content/Context;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, LHo;->w:Landroid/graphics/drawable/Drawable;

    :cond_7
    iget-object p1, p0, LHo;->w:Landroid/graphics/drawable/Drawable;

    :cond_8
    if-nez p1, :cond_b

    iget-object p1, p0, LHo;->u:Landroid/graphics/drawable/Drawable;

    if-nez p1, :cond_a

    iget-object p1, p0, LHo;->i:LZ3;

    iget-object v0, p1, LZ3;->e:Landroid/graphics/drawable/Drawable;

    iput-object v0, p0, LHo;->u:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_a

    iget v0, p1, LZ3;->f:I

    if-lez v0, :cond_a

    iget-object p1, p1, LZ3;->u:Landroid/content/res/Resources$Theme;

    iget-object v2, p0, LHo;->e:Landroid/content/Context;

    if-eqz p1, :cond_9

    goto :goto_3

    :cond_9
    invoke-virtual {v2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    :goto_3
    invoke-static {v2, v2, v0, p1}, LTf;->A(Landroid/content/Context;Landroid/content/Context;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, LHo;->u:Landroid/graphics/drawable/Drawable;

    :cond_a
    iget-object p1, p0, LHo;->u:Landroid/graphics/drawable/Drawable;

    :cond_b
    if-nez p1, :cond_c

    invoke-virtual {p0}, LHo;->e()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    :cond_c
    iget-object v0, p0, LHo;->m:Lgq;

    invoke-interface {v0, p1}, Lgq;->e(Landroid/graphics/drawable/Drawable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :cond_d
    :try_start_2
    iput-boolean p2, p0, LHo;->z:Z

    monitor-exit v1

    return-void

    :goto_4
    iput-boolean p2, p0, LHo;->z:Z

    throw p1

    :goto_5
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final i(LIm;IZ)V
    .locals 6

    const-string p3, "Expected to receive an object of "

    const-string v0, "Expected to receive a Resource<R> with an object of "

    iget-object v1, p0, LHo;->b:Lwp;

    invoke-virtual {v1}, Lwp;->a()V

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, LHo;->c:Ljava/lang/Object;

    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    iput-object v1, p0, LHo;->r:LK2;

    const/4 v3, 0x5

    if-nez p1, :cond_0

    new-instance p1, LXd;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p3, p0, LHo;->h:Ljava/lang/Class;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " inside, but instead got null."

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, LXd;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, v3}, LHo;->h(LXd;I)V

    monitor-exit v2

    return-void

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :cond_0
    invoke-interface {p1}, LIm;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v4, p0, LHo;->h:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    iget-object p3, p0, LHo;->d:LAm;

    if-eqz p3, :cond_3

    invoke-interface {p3, p0}, LAm;->i(Lxm;)Z

    move-result p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p3, :cond_2

    goto :goto_0

    :cond_2
    :try_start_2
    iput-object v1, p0, LHo;->q:LIm;

    const/4 p2, 0x4

    iput p2, p0, LHo;->B:I

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iget-object p2, p0, LHo;->t:Lfb;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lfb;->f(LIm;)V

    return-void

    :catchall_1
    move-exception p2

    move-object v1, p1

    move-object p1, p2

    goto :goto_4

    :cond_3
    :goto_0
    :try_start_3
    invoke-virtual {p0, p1, v0, p2}, LHo;->k(LIm;Ljava/lang/Object;I)V

    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    return-void

    :cond_4
    :goto_1
    :try_start_4
    iput-object v1, p0, LHo;->q:LIm;

    new-instance p2, LXd;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p3, p0, LHo;->h:Ljava/lang/Class;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " but instead got "

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    goto :goto_2

    :cond_5
    const-string p3, ""

    :goto_2
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, "{"

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, "} inside Resource{"

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, "}."

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v0, :cond_6

    const-string p3, ""

    goto :goto_3

    :cond_6
    const-string p3, " To indicate failure return a null Resource object, rather than a Resource object containing null data."

    :goto_3
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, LXd;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p2, v3}, LHo;->h(LXd;I)V

    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    iget-object p2, p0, LHo;->t:Lfb;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lfb;->f(LIm;)V

    return-void

    :goto_4
    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception p1

    if-eqz v1, :cond_7

    iget-object p2, p0, LHo;->t:Lfb;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lfb;->f(LIm;)V

    :cond_7
    throw p1
.end method

.method public final isRunning()Z
    .locals 3

    iget-object v0, p0, LHo;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, LHo;->B:I

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final j()Z
    .locals 3

    iget-object v0, p0, LHo;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, LHo;->B:I

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

.method public final k(LIm;Ljava/lang/Object;I)V
    .locals 3

    iget-object v0, p0, LHo;->d:LAm;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LAm;->c()LAm;

    move-result-object v1

    invoke-interface {v1}, LAm;->a()Z

    :cond_0
    const/4 v1, 0x4

    iput v1, p0, LHo;->B:I

    iput-object p1, p0, LHo;->q:LIm;

    iget-object p1, p0, LHo;->f:LVd;

    iget p1, p1, LVd;->i:I

    const/4 v1, 0x3

    if-gt p1, v1, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Finished loading "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " from "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p3}, LVo;->p(I)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " for "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, LHo;->g:Ljava/lang/Object;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, " with size ["

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p3, p0, LHo;->x:I

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, "x"

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p3, p0, LHo;->y:I

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, "] in "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, LHo;->s:J

    invoke-static {v1, v2}, Loh;->a(J)D

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p3, " ms"

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p3, "Glide"

    invoke-static {p3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    if-eqz v0, :cond_2

    invoke-interface {v0, p0}, LAm;->k(Lxm;)V

    :cond_2
    const/4 p1, 0x1

    iput-boolean p1, p0, LHo;->z:Z

    const/4 p1, 0x0

    :try_start_0
    iget-object p3, p0, LHo;->n:Ljava/util/List;

    if-eqz p3, :cond_4

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, LVo;->l(Ljava/lang/Object;)V

    const/4 p2, 0x0

    throw p2

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_4
    :goto_0
    iget-object p3, p0, LHo;->o:Lmh;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p3, p0, LHo;->m:Lgq;

    invoke-interface {p3, p2}, Lgq;->i(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean p1, p0, LHo;->z:Z

    return-void

    :goto_1
    iput-boolean p1, p0, LHo;->z:Z

    throw p2
.end method

.method public final l()Z
    .locals 3

    iget-object v0, p0, LHo;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, LHo;->B:I

    const/4 v2, 0x6

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

.method public final m(II)V
    .locals 24

    move-object/from16 v15, p0

    move/from16 v0, p1

    move/from16 v1, p2

    const-string v14, "finished onSizeReady in "

    const-string v2, "finished setup for calling load in "

    const-string v3, "Got onSizeReady in "

    iget-object v4, v15, LHo;->b:Lwp;

    invoke-virtual {v4}, Lwp;->a()V

    iget-object v13, v15, LHo;->c:Ljava/lang/Object;

    monitor-enter v13

    :try_start_0
    sget-boolean v21, LHo;->C:Z

    if-eqz v21, :cond_0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v5, v15, LHo;->s:J

    invoke-static {v5, v6}, Loh;->a(J)D

    move-result-wide v5

    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v15, v3}, LHo;->g(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object/from16 v22, v13

    move-object v1, v15

    goto/16 :goto_4

    :cond_0
    :goto_0
    iget v3, v15, LHo;->B:I

    const/4 v4, 0x3

    if-eq v3, v4, :cond_1

    monitor-exit v13

    return-void

    :cond_1
    const/4 v12, 0x2

    iput v12, v15, LHo;->B:I

    iget-object v3, v15, LHo;->i:LZ3;

    iget v3, v3, LZ3;->b:F

    const/high16 v4, -0x80000000

    if-ne v0, v4, :cond_2

    goto :goto_1

    :cond_2
    int-to-float v0, v0

    mul-float/2addr v0, v3

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    :goto_1
    iput v0, v15, LHo;->x:I

    if-ne v1, v4, :cond_3

    move v0, v1

    goto :goto_2

    :cond_3
    int-to-float v0, v1

    mul-float/2addr v3, v0

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v0

    :goto_2
    iput v0, v15, LHo;->y:I

    if-eqz v21, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, v15, LHo;->s:J

    invoke-static {v1, v2}, Loh;->a(J)D

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v15, v0}, LHo;->g(Ljava/lang/String;)V

    :cond_4
    iget-object v1, v15, LHo;->t:Lfb;

    iget-object v2, v15, LHo;->f:LVd;

    iget-object v3, v15, LHo;->g:Ljava/lang/Object;

    iget-object v0, v15, LHo;->i:LZ3;

    iget-object v4, v0, LZ3;->l:Lfg;

    iget v5, v15, LHo;->x:I

    iget v6, v15, LHo;->y:I

    iget-object v7, v0, LZ3;->s:Ljava/lang/Class;

    iget-object v8, v15, LHo;->h:Ljava/lang/Class;

    iget-object v9, v15, LHo;->l:LUk;

    iget-object v10, v0, LZ3;->c:Lk9;

    iget-object v11, v0, LZ3;->r:Lh5;

    iget-boolean v12, v0, LZ3;->m:Z

    move-object/from16 v17, v14

    iget-boolean v14, v0, LZ3;->y:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v18, v13

    :try_start_1
    iget-object v13, v0, LZ3;->q:Lrk;

    move-object/from16 v19, v13

    iget-boolean v13, v0, LZ3;->i:Z

    move/from16 v20, v13

    iget-boolean v13, v0, LZ3;->w:Z

    move/from16 p1, v13

    iget-boolean v13, v0, LZ3;->z:Z

    iget-boolean v0, v0, LZ3;->x:Z

    move/from16 p2, v0

    iget-object v0, v15, LHo;->p:Ljava/util/concurrent/Executor;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    move-object/from16 v22, v18

    move-object/from16 v16, v19

    move/from16 v18, v20

    move/from16 v19, p1

    move/from16 v20, v13

    move v13, v14

    move-object/from16 v23, v17

    move-object/from16 v14, v16

    move/from16 v15, v18

    move/from16 v16, v19

    move/from16 v17, v20

    move/from16 v18, p2

    move-object/from16 v19, p0

    move-object/from16 v20, v0

    :try_start_2
    invoke-virtual/range {v1 .. v20}, Lfb;->a(LVd;Ljava/lang/Object;Lfg;IILjava/lang/Class;Ljava/lang/Class;LUk;Lk9;Lh5;ZZLrk;ZZZZLLm;Ljava/util/concurrent/Executor;)LK2;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object/from16 v1, p0

    :try_start_3
    iput-object v0, v1, LHo;->r:LK2;

    iget v0, v1, LHo;->B:I

    const/4 v2, 0x2

    if-eq v0, v2, :cond_5

    const/4 v0, 0x0

    iput-object v0, v1, LHo;->r:LK2;

    goto :goto_3

    :catchall_1
    move-exception v0

    goto :goto_4

    :cond_5
    :goto_3
    if-eqz v21, :cond_6

    new-instance v0, Ljava/lang/StringBuilder;

    move-object/from16 v2, v23

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, v1, LHo;->s:J

    invoke-static {v2, v3}, Loh;->a(J)D

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, LHo;->g(Ljava/lang/String;)V

    :cond_6
    monitor-exit v22

    return-void

    :catchall_2
    move-exception v0

    move-object/from16 v1, p0

    goto :goto_4

    :catchall_3
    move-exception v0

    move-object v1, v15

    move-object/from16 v22, v18

    :goto_4
    monitor-exit v22
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, LHo;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LHo;->g:Ljava/lang/Object;

    iget-object v2, p0, LHo;->h:Ljava/lang/Class;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "[model="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transcodeClass="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
