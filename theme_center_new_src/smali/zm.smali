.class public final Lzm;
.super LZ3;
.source "SourceFile"


# instance fields
.field public final A:Landroid/content/Context;

.field public final B:LEm;

.field public final C:Ljava/lang/Class;

.field public final D:LVd;

.field public E:LHd;

.field public F:Ljava/lang/Object;

.field public G:Ljava/util/ArrayList;

.field public H:Lzm;

.field public I:Lzm;

.field public final J:Z

.field public K:Z

.field public L:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LGm;

    invoke-direct {v0}, LZ3;-><init>()V

    sget-object v1, Lk9;->c:Lk9;

    invoke-virtual {v0, v1}, LZ3;->d(Lk9;)LZ3;

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

.method public constructor <init>(Lcom/bumptech/glide/a;LEm;Ljava/lang/Class;Landroid/content/Context;)V
    .locals 3

    invoke-direct {p0}, LZ3;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lzm;->J:Z

    iput-object p2, p0, Lzm;->B:LEm;

    iput-object p3, p0, Lzm;->C:Ljava/lang/Class;

    iput-object p4, p0, Lzm;->A:Landroid/content/Context;

    iget-object p4, p2, LEm;->a:Lcom/bumptech/glide/a;

    iget-object p4, p4, Lcom/bumptech/glide/a;->c:LVd;

    iget-object p4, p4, LVd;->f:Ljava/util/Map;

    invoke-interface {p4, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LHd;

    if-nez v0, :cond_1

    invoke-interface {p4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p4

    invoke-interface {p4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :cond_0
    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Class;

    invoke-virtual {v2, p3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LHd;

    goto :goto_0

    :cond_1
    if-nez v0, :cond_2

    sget-object v0, LVd;->k:LHd;

    :cond_2
    iput-object v0, p0, Lzm;->E:LHd;

    iget-object p1, p1, Lcom/bumptech/glide/a;->c:LVd;

    iput-object p1, p0, Lzm;->D:LVd;

    iget-object p1, p2, LEm;->i:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    invoke-static {p3}, LVo;->l(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lzm;->s()Lzm;

    goto :goto_1

    :cond_3
    monitor-enter p2

    :try_start_0
    iget-object p1, p2, LEm;->j:LGm;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p2

    invoke-virtual {p0, p1}, Lzm;->t(LZ3;)Lzm;

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p2

    throw p1
.end method


# virtual methods
.method public final bridge synthetic a(LZ3;)LZ3;
    .locals 0

    invoke-virtual {p0, p1}, Lzm;->t(LZ3;)Lzm;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic b()LZ3;
    .locals 1

    invoke-virtual {p0}, Lzm;->v()Lzm;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzm;->v()Lzm;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lzm;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lzm;

    invoke-super {p0, p1}, LZ3;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Lzm;->C:Ljava/lang/Class;

    iget-object v2, p0, Lzm;->C:Ljava/lang/Class;

    invoke-static {v2, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzm;->E:LHd;

    iget-object v2, p1, Lzm;->E:LHd;

    invoke-virtual {v0, v2}, LHd;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzm;->F:Ljava/lang/Object;

    iget-object v2, p1, Lzm;->F:Ljava/lang/Object;

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzm;->G:Ljava/util/ArrayList;

    iget-object v2, p1, Lzm;->G:Ljava/util/ArrayList;

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzm;->H:Lzm;

    iget-object v2, p1, Lzm;->H:Lzm;

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzm;->I:Lzm;

    iget-object v2, p1, Lzm;->I:Lzm;

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lzm;->J:Z

    iget-boolean v2, p1, Lzm;->J:Z

    if-ne v0, v2, :cond_0

    iget-boolean v0, p0, Lzm;->K:Z

    iget-boolean p1, p1, Lzm;->K:Z

    if-ne v0, p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    invoke-super {p0}, LZ3;->hashCode()I

    move-result v0

    iget-object v1, p0, Lzm;->C:Ljava/lang/Class;

    invoke-static {v0, v1}, LQr;->h(ILjava/lang/Object;)I

    move-result v0

    iget-object v1, p0, Lzm;->E:LHd;

    invoke-static {v0, v1}, LQr;->h(ILjava/lang/Object;)I

    move-result v0

    iget-object v1, p0, Lzm;->F:Ljava/lang/Object;

    invoke-static {v0, v1}, LQr;->h(ILjava/lang/Object;)I

    move-result v0

    iget-object v1, p0, Lzm;->G:Ljava/util/ArrayList;

    invoke-static {v0, v1}, LQr;->h(ILjava/lang/Object;)I

    move-result v0

    iget-object v1, p0, Lzm;->H:Lzm;

    invoke-static {v0, v1}, LQr;->h(ILjava/lang/Object;)I

    move-result v0

    iget-object v1, p0, Lzm;->I:Lzm;

    invoke-static {v0, v1}, LQr;->h(ILjava/lang/Object;)I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, LQr;->h(ILjava/lang/Object;)I

    move-result v0

    iget-boolean v1, p0, Lzm;->J:Z

    invoke-static {v1, v0}, LQr;->g(II)I

    move-result v0

    iget-boolean v1, p0, Lzm;->K:Z

    invoke-static {v1, v0}, LQr;->g(II)I

    move-result v0

    return v0
.end method

.method public final s()Lzm;
    .locals 1

    iget-boolean v0, p0, LZ3;->v:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lzm;->v()Lzm;

    move-result-object v0

    invoke-virtual {v0}, Lzm;->s()Lzm;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p0}, LZ3;->k()V

    return-object p0
.end method

.method public final t(LZ3;)Lzm;
    .locals 0

    invoke-static {p1}, LUd;->k(Ljava/lang/Object;)V

    invoke-super {p0, p1}, LZ3;->a(LZ3;)LZ3;

    move-result-object p1

    check-cast p1, Lzm;

    return-object p1
.end method

.method public final u(Ljava/lang/Object;Lgq;LAm;LHd;LUk;IILZ3;)Lxm;
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    move-object/from16 v1, p4

    move-object/from16 v14, p8

    iget-object v2, v0, Lzm;->I:Lzm;

    if-eqz v2, :cond_0

    new-instance v2, Lob;

    move-object/from16 v3, p3

    invoke-direct {v2, v15, v3}, Lob;-><init>(Ljava/lang/Object;LAm;)V

    move-object v12, v2

    move-object v13, v12

    goto :goto_0

    :cond_0
    move-object/from16 v3, p3

    const/4 v2, 0x0

    move-object v13, v2

    move-object v12, v3

    :goto_0
    iget-object v2, v0, Lzm;->H:Lzm;

    if-eqz v2, :cond_8

    iget-boolean v3, v0, Lzm;->L:Z

    if-nez v3, :cond_7

    iget-object v3, v2, Lzm;->E:LHd;

    iget-boolean v4, v2, Lzm;->J:Z

    if-eqz v4, :cond_1

    move-object/from16 v16, v1

    goto :goto_1

    :cond_1
    move-object/from16 v16, v3

    :goto_1
    iget v2, v2, LZ3;->a:I

    const/16 v3, 0x8

    invoke-static {v2, v3}, LZ3;->f(II)Z

    move-result v2

    const/4 v11, 0x1

    if-eqz v2, :cond_2

    iget-object v2, v0, Lzm;->H:Lzm;

    iget-object v2, v2, LZ3;->d:LUk;

    :goto_2
    move-object/from16 v17, v2

    goto :goto_3

    :cond_2
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-eqz v2, :cond_5

    if-eq v2, v11, :cond_5

    const/4 v3, 0x2

    if-eq v2, v3, :cond_4

    const/4 v3, 0x3

    if-ne v2, v3, :cond_3

    sget-object v2, LUk;->c:LUk;

    goto :goto_2

    :cond_3
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "unknown priority: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, v0, LZ3;->d:LUk;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    sget-object v2, LUk;->b:LUk;

    goto :goto_2

    :cond_5
    sget-object v2, LUk;->a:LUk;

    goto :goto_2

    :goto_3
    iget-object v2, v0, Lzm;->H:Lzm;

    iget v3, v2, LZ3;->k:I

    iget v2, v2, LZ3;->j:I

    invoke-static/range {p6 .. p7}, LQr;->i(II)Z

    move-result v4

    if-eqz v4, :cond_6

    iget-object v4, v0, Lzm;->H:Lzm;

    iget v5, v4, LZ3;->k:I

    iget v4, v4, LZ3;->j:I

    invoke-static {v5, v4}, LQr;->i(II)Z

    move-result v4

    if-nez v4, :cond_6

    iget v2, v14, LZ3;->k:I

    iget v3, v14, LZ3;->j:I

    move/from16 v18, v2

    move/from16 v19, v3

    goto :goto_4

    :cond_6
    move/from16 v19, v2

    move/from16 v18, v3

    :goto_4
    new-instance v10, LGq;

    invoke-direct {v10, v15, v12}, LGq;-><init>(Ljava/lang/Object;LAm;)V

    iget-object v5, v0, Lzm;->F:Ljava/lang/Object;

    iget-object v12, v0, Lzm;->G:Ljava/util/ArrayList;

    iget-object v3, v0, Lzm;->D:LVd;

    iget-object v9, v3, LVd;->g:Lfb;

    iget-object v8, v1, LHd;->a:Lmh;

    new-instance v7, LHo;

    iget-object v2, v0, Lzm;->A:Landroid/content/Context;

    iget-object v6, v0, Lzm;->C:Ljava/lang/Class;

    move-object v1, v7

    move-object/from16 v4, p1

    move-object/from16 v20, v7

    move-object/from16 v7, p8

    move-object/from16 v21, v8

    move/from16 v8, p6

    move-object/from16 v22, v9

    move/from16 v9, p7

    move-object/from16 p3, v10

    move-object/from16 v10, p5

    move-object/from16 v11, p2

    move-object/from16 v23, v13

    move-object/from16 v13, p3

    move-object/from16 v14, v22

    move-object/from16 v15, v21

    invoke-direct/range {v1 .. v15}, LHo;-><init>(Landroid/content/Context;LVd;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;LZ3;IILUk;Lgq;Ljava/util/List;LAm;Lfb;Lmh;)V

    const/4 v1, 0x1

    iput-boolean v1, v0, Lzm;->L:Z

    iget-object v9, v0, Lzm;->H:Lzm;

    move-object v1, v9

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, v16

    move-object/from16 v6, v17

    move/from16 v7, v18

    move/from16 v8, v19

    invoke-virtual/range {v1 .. v9}, Lzm;->u(Ljava/lang/Object;Lgq;LAm;LHd;LUk;IILZ3;)Lxm;

    move-result-object v1

    const/4 v2, 0x0

    iput-boolean v2, v0, Lzm;->L:Z

    move-object/from16 v2, p3

    move-object/from16 v3, v20

    iput-object v3, v2, LGq;->c:Lxm;

    iput-object v1, v2, LGq;->d:Lxm;

    move-object v10, v2

    :goto_5
    move-object/from16 v11, v23

    goto :goto_6

    :cond_7
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_8
    move-object/from16 v23, v13

    iget-object v5, v0, Lzm;->F:Ljava/lang/Object;

    iget-object v13, v0, Lzm;->G:Ljava/util/ArrayList;

    iget-object v3, v0, Lzm;->D:LVd;

    iget-object v14, v3, LVd;->g:Lfb;

    iget-object v15, v1, LHd;->a:Lmh;

    new-instance v16, LHo;

    iget-object v2, v0, Lzm;->A:Landroid/content/Context;

    iget-object v6, v0, Lzm;->C:Ljava/lang/Class;

    move-object/from16 v1, v16

    move-object/from16 v4, p1

    move-object/from16 v7, p8

    move/from16 v8, p6

    move/from16 v9, p7

    move-object/from16 v10, p5

    move-object/from16 v11, p2

    move-object/from16 v17, v12

    move-object v12, v13

    move-object/from16 v13, v17

    invoke-direct/range {v1 .. v15}, LHo;-><init>(Landroid/content/Context;LVd;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Class;LZ3;IILUk;Lgq;Ljava/util/List;LAm;Lfb;Lmh;)V

    move-object/from16 v10, v16

    goto :goto_5

    :goto_6
    if-nez v11, :cond_9

    return-object v10

    :cond_9
    iget-object v1, v0, Lzm;->I:Lzm;

    iget v2, v1, LZ3;->k:I

    iget v1, v1, LZ3;->j:I

    invoke-static/range {p6 .. p7}, LQr;->i(II)Z

    move-result v3

    if-eqz v3, :cond_a

    iget-object v3, v0, Lzm;->I:Lzm;

    iget v4, v3, LZ3;->k:I

    iget v3, v3, LZ3;->j:I

    invoke-static {v4, v3}, LQr;->i(II)Z

    move-result v3

    if-nez v3, :cond_a

    move-object/from16 v3, p8

    iget v1, v3, LZ3;->k:I

    iget v2, v3, LZ3;->j:I

    move v7, v1

    move v8, v2

    goto :goto_7

    :cond_a
    move v8, v1

    move v7, v2

    :goto_7
    iget-object v9, v0, Lzm;->I:Lzm;

    iget-object v5, v9, Lzm;->E:LHd;

    iget-object v6, v9, LZ3;->d:LUk;

    move-object v1, v9

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object v4, v11

    invoke-virtual/range {v1 .. v9}, Lzm;->u(Ljava/lang/Object;Lgq;LAm;LHd;LUk;IILZ3;)Lxm;

    move-result-object v1

    iput-object v10, v11, Lob;->c:Lxm;

    iput-object v1, v11, Lob;->d:Lxm;

    return-object v11
.end method

.method public final v()Lzm;
    .locals 3

    invoke-super {p0}, LZ3;->b()LZ3;

    move-result-object v0

    check-cast v0, Lzm;

    iget-object v1, v0, Lzm;->E:LHd;

    invoke-virtual {v1}, LHd;->a()LHd;

    move-result-object v1

    iput-object v1, v0, Lzm;->E:LHd;

    iget-object v1, v0, Lzm;->G:Ljava/util/ArrayList;

    if-eqz v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, v0, Lzm;->G:Ljava/util/ArrayList;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v1, v0, Lzm;->G:Ljava/util/ArrayList;

    :cond_0
    iget-object v1, v0, Lzm;->H:Lzm;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lzm;->v()Lzm;

    move-result-object v1

    iput-object v1, v0, Lzm;->H:Lzm;

    :cond_1
    iget-object v1, v0, Lzm;->I:Lzm;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lzm;->v()Lzm;

    move-result-object v1

    iput-object v1, v0, Lzm;->I:Lzm;

    :cond_2
    return-object v0
.end method

.method public final w(Lgq;LZ3;)V
    .locals 10

    invoke-static {p1}, LUd;->k(Ljava/lang/Object;)V

    iget-boolean v0, p0, Lzm;->K:Z

    if-eqz v0, :cond_5

    new-instance v2, Ljava/lang/Object;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iget-object v5, p0, Lzm;->E:LHd;

    iget-object v6, p2, LZ3;->d:LUk;

    iget v7, p2, LZ3;->k:I

    iget v8, p2, LZ3;->j:I

    const/4 v4, 0x0

    move-object v1, p0

    move-object v3, p1

    move-object v9, p2

    invoke-virtual/range {v1 .. v9}, Lzm;->u(Ljava/lang/Object;Lgq;LAm;LHd;LUk;IILZ3;)Lxm;

    move-result-object v0

    invoke-interface {p1}, Lgq;->g()Lxm;

    move-result-object v1

    invoke-interface {v0, v1}, Lxm;->b(Lxm;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-boolean p2, p2, LZ3;->i:Z

    if-nez p2, :cond_0

    invoke-interface {v1}, Lxm;->j()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, "Argument must not be null"

    invoke-static {p1, v1}, LUd;->l(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1}, Lxm;->isRunning()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-interface {v1}, Lxm;->f()V

    :cond_1
    return-void

    :cond_2
    :goto_0
    iget-object p2, p0, Lzm;->B:LEm;

    invoke-virtual {p2, p1}, LEm;->l(Lgq;)V

    invoke-interface {p1, v0}, Lgq;->b(Lxm;)V

    iget-object p2, p0, Lzm;->B:LEm;

    monitor-enter p2

    :try_start_0
    iget-object v1, p2, LEm;->f:Lhq;

    iget-object v1, v1, Lhq;->a:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object p1, p2, LEm;->d:LLo;

    iget-object v1, p1, LLo;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/Set;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-boolean v1, p1, LLo;->b:Z

    if-nez v1, :cond_3

    invoke-interface {v0}, Lxm;->f()V

    goto :goto_1

    :cond_3
    invoke-interface {v0}, Lxm;->clear()V

    const-string v1, "RequestTracker"

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_4

    const-string v2, "Paused, delaying request"

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    iget-object p1, p1, LLo;->d:Ljava/lang/Object;

    check-cast p1, Ljava/util/HashSet;

    invoke-virtual {p1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    monitor-exit p2

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p2

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "You must call #load() before calling #into()"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final x(Ljava/lang/Object;)Lzm;
    .locals 1

    iget-boolean v0, p0, LZ3;->v:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lzm;->v()Lzm;

    move-result-object v0

    invoke-virtual {v0, p1}, Lzm;->x(Ljava/lang/Object;)Lzm;

    move-result-object p1

    return-object p1

    :cond_0
    iput-object p1, p0, Lzm;->F:Ljava/lang/Object;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lzm;->K:Z

    invoke-virtual {p0}, LZ3;->k()V

    return-object p0
.end method
