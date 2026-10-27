.class public final LUe;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltb;


# static fields
.field public static final g:Ljava/util/List;

.field public static final h:Ljava/util/List;


# instance fields
.field public volatile a:Laf;

.field public final b:Lil;

.field public volatile c:Z

.field public final d:LGl;

.field public final e:LIl;

.field public final f:LTe;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const-string v8, ":method"

    const-string v9, ":path"

    const-string v0, "connection"

    const-string v1, "host"

    const-string v2, "keep-alive"

    const-string v3, "proxy-connection"

    const-string v4, "te"

    const-string v5, "transfer-encoding"

    const-string v6, "encoding"

    const-string v7, "upgrade"

    const-string v10, ":scheme"

    const-string v11, ":authority"

    filled-new-array/range {v0 .. v11}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LRr;->l([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, LUe;->g:Ljava/util/List;

    const-string v5, "te"

    const-string v6, "transfer-encoding"

    const-string v1, "connection"

    const-string v2, "host"

    const-string v3, "keep-alive"

    const-string v4, "proxy-connection"

    const-string v7, "encoding"

    const-string v8, "upgrade"

    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LRr;->l([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, LUe;->h:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(LPj;LGl;LIl;LTe;)V
    .locals 1

    const-string v0, "client"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "connection"

    invoke-static {v0, p2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "http2Connection"

    invoke-static {v0, p4}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LUe;->d:LGl;

    iput-object p3, p0, LUe;->e:LIl;

    iput-object p4, p0, LUe;->f:LTe;

    sget-object p2, Lil;->f:Lil;

    iget-object p1, p1, LPj;->r:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p2, Lil;->e:Lil;

    :goto_0
    iput-object p2, p0, LUe;->b:Lil;

    return-void
.end method


# virtual methods
.method public final a(LT1;J)LMo;
    .locals 0

    const-string p2, "request"

    invoke-static {p2, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object p1, p0, LUe;->a:Laf;

    invoke-static {p1}, LTf;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, Laf;->f()LXe;

    move-result-object p1

    return-object p1
.end method

.method public final b(LT1;)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const-string v2, "request"

    invoke-static {v2, v0}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v2, v1, LUe;->a:Laf;

    if-eqz v2, :cond_0

    return-void

    :cond_0
    iget-object v2, v0, LT1;->f:Ljava/lang/Object;

    check-cast v2, Lbb;

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    move v2, v4

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    new-instance v5, Ljava/util/ArrayList;

    iget-object v6, v0, LT1;->e:Ljava/lang/Object;

    check-cast v6, Lse;

    invoke-virtual {v6}, Lse;->size()I

    move-result v7

    const/4 v8, 0x4

    add-int/2addr v7, v8

    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v7, Lre;

    sget-object v9, Lre;->f:Le5;

    iget-object v10, v0, LT1;->d:Ljava/io/Serializable;

    check-cast v10, Ljava/lang/String;

    invoke-direct {v7, v9, v10}, Lre;-><init>(Le5;Ljava/lang/String;)V

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v7, Lre;

    sget-object v9, Lre;->g:Le5;

    const-string v10, "url"

    iget-object v11, v0, LT1;->c:Ljava/lang/Object;

    check-cast v11, Lgf;

    invoke-static {v10, v11}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v11}, Lgf;->b()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v11}, Lgf;->d()Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_2

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v10, 0x3f

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    :cond_2
    invoke-direct {v7, v9, v10}, Lre;-><init>(Le5;Ljava/lang/String;)V

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v7, "Host"

    iget-object v0, v0, LT1;->e:Ljava/lang/Object;

    check-cast v0, Lse;

    invoke-virtual {v0, v7}, Lse;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    new-instance v7, Lre;

    sget-object v9, Lre;->i:Le5;

    invoke-direct {v7, v9, v0}, Lre;-><init>(Le5;Ljava/lang/String;)V

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    new-instance v0, Lre;

    sget-object v7, Lre;->h:Le5;

    iget-object v9, v11, Lgf;->b:Ljava/lang/String;

    invoke-direct {v0, v7, v9}, Lre;-><init>(Le5;Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v6}, Lse;->size()I

    move-result v0

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v0, :cond_7

    invoke-virtual {v6, v7}, Lse;->b(I)Ljava/lang/String;

    move-result-object v9

    sget-object v10, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v11, "Locale.US"

    invoke-static {v11, v10}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    if-eqz v9, :cond_6

    invoke-virtual {v9, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "(this as java.lang.String).toLowerCase(locale)"

    invoke-static {v10, v9}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v10, LUe;->g:Ljava/util/List;

    invoke-interface {v10, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    const-string v10, "te"

    invoke-virtual {v9, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    invoke-virtual {v6, v7}, Lse;->d(I)Ljava/lang/String;

    move-result-object v10

    const-string v11, "trailers"

    invoke-static {v10, v11}, LTf;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    :cond_4
    new-instance v10, Lre;

    invoke-virtual {v6, v7}, Lse;->d(I)Ljava/lang/String;

    move-result-object v11

    invoke-direct {v10, v9, v11}, Lre;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_6
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v2, "null cannot be cast to non-null type java.lang.String"

    invoke-direct {v0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    iget-object v6, v1, LUe;->f:LTe;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    xor-int/lit8 v0, v2, 0x1

    iget-object v7, v6, LTe;->y:Lbf;

    monitor-enter v7

    :try_start_0
    monitor-enter v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    iget v9, v6, LTe;->f:I

    const v10, 0x3fffffff    # 1.9999999f

    if-le v9, v10, :cond_8

    const/16 v9, 0x8

    invoke-virtual {v6, v9}, LTe;->z(I)V

    goto :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_8

    :cond_8
    :goto_2
    iget-boolean v9, v6, LTe;->g:Z

    if-nez v9, :cond_12

    iget v15, v6, LTe;->f:I

    add-int/lit8 v9, v15, 0x2

    iput v9, v6, LTe;->f:I

    new-instance v14, Laf;

    const/16 v16, 0x0

    const/4 v13, 0x0

    move-object v9, v14

    move v10, v15

    move-object v11, v6

    move v12, v0

    move-object v3, v14

    move-object/from16 v14, v16

    invoke-direct/range {v9 .. v14}, Laf;-><init>(ILTe;ZZLse;)V

    if-eqz v2, :cond_a

    iget-wide v9, v6, LTe;->v:J

    iget-wide v11, v6, LTe;->w:J

    cmp-long v2, v9, v11

    if-gez v2, :cond_a

    iget-wide v9, v3, Laf;->c:J

    iget-wide v11, v3, Laf;->d:J

    cmp-long v2, v9, v11

    if-ltz v2, :cond_9

    goto :goto_3

    :cond_9
    const/4 v2, 0x0

    goto :goto_4

    :cond_a
    :goto_3
    move v2, v4

    :goto_4
    invoke-virtual {v3}, Laf;->h()Z

    move-result v9

    if-eqz v9, :cond_b

    iget-object v9, v6, LTe;->c:Ljava/util/LinkedHashMap;

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v9, v10, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_b
    :try_start_2
    monitor-exit v6

    iget-object v9, v6, LTe;->y:Lbf;

    monitor-enter v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    iget-boolean v10, v9, Lbf;->c:Z

    if-nez v10, :cond_11

    iget-object v10, v9, Lbf;->d:Lye;

    invoke-virtual {v10, v5}, Lye;->d(Ljava/util/ArrayList;)V

    iget-object v5, v9, Lbf;->a:LL4;

    iget-wide v10, v5, LL4;->b:J

    iget v5, v9, Lbf;->b:I

    int-to-long v12, v5

    invoke-static {v12, v13, v10, v11}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v12

    cmp-long v5, v10, v12

    if-nez v5, :cond_c

    move/from16 v17, v8

    goto :goto_5

    :cond_c
    const/16 v17, 0x0

    :goto_5
    if-eqz v0, :cond_d

    or-int/lit8 v17, v17, 0x1

    :cond_d
    move/from16 v0, v17

    long-to-int v8, v12

    invoke-virtual {v9, v15, v8, v4, v0}, Lbf;->x(IIII)V

    iget-object v0, v9, Lbf;->e:LO4;

    iget-object v4, v9, Lbf;->a:LL4;

    invoke-interface {v0, v4, v12, v13}, LMo;->d(LL4;J)V

    if-lez v5, :cond_e

    sub-long/2addr v10, v12

    invoke-virtual {v9, v10, v11, v15}, Lbf;->C(JI)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_6

    :catchall_1
    move-exception v0

    goto :goto_7

    :cond_e
    :goto_6
    :try_start_4
    monitor-exit v9
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    monitor-exit v7

    if-eqz v2, :cond_f

    iget-object v0, v6, LTe;->y:Lbf;

    invoke-virtual {v0}, Lbf;->flush()V

    :cond_f
    iput-object v3, v1, LUe;->a:Laf;

    iget-boolean v0, v1, LUe;->c:Z

    if-nez v0, :cond_10

    iget-object v0, v1, LUe;->a:Laf;

    invoke-static {v0}, LTf;->f(Ljava/lang/Object;)V

    iget-object v0, v0, Laf;->i:LZe;

    iget-object v2, v1, LUe;->e:LIl;

    iget v2, v2, LIl;->h:I

    int-to-long v2, v2

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v2, v3, v4}, LJq;->g(JLjava/util/concurrent/TimeUnit;)LJq;

    iget-object v0, v1, LUe;->a:Laf;

    invoke-static {v0}, LTf;->f(Ljava/lang/Object;)V

    iget-object v0, v0, Laf;->j:LZe;

    iget-object v2, v1, LUe;->e:LIl;

    iget v2, v2, LIl;->i:I

    int-to-long v2, v2

    invoke-virtual {v0, v2, v3, v4}, LJq;->g(JLjava/util/concurrent/TimeUnit;)LJq;

    return-void

    :cond_10
    iget-object v0, v1, LUe;->a:Laf;

    invoke-static {v0}, LTf;->f(Ljava/lang/Object;)V

    const/16 v2, 0x9

    invoke-virtual {v0, v2}, Laf;->e(I)V

    new-instance v0, Ljava/io/IOException;

    const-string v2, "Canceled"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    :try_start_5
    new-instance v0, Ljava/io/IOException;

    const-string v2, "closed"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :goto_7
    :try_start_6
    monitor-exit v9

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception v0

    goto :goto_9

    :cond_12
    :try_start_7
    new-instance v0, LV6;

    invoke-direct {v0}, Ljava/io/IOException;-><init>()V

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :goto_8
    :try_start_8
    monitor-exit v6

    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :goto_9
    monitor-exit v7

    throw v0
.end method

.method public final c(Ldn;)LXo;
    .locals 0

    iget-object p1, p0, LUe;->a:Laf;

    invoke-static {p1}, LTf;->f(Ljava/lang/Object;)V

    iget-object p1, p1, Laf;->g:LYe;

    return-object p1
.end method

.method public final cancel()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, LUe;->c:Z

    iget-object v0, p0, LUe;->a:Laf;

    if-eqz v0, :cond_0

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Laf;->e(I)V

    :cond_0
    return-void
.end method

.method public final d()V
    .locals 1

    iget-object v0, p0, LUe;->a:Laf;

    invoke-static {v0}, LTf;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, Laf;->f()LXe;

    move-result-object v0

    invoke-virtual {v0}, LXe;->close()V

    return-void
.end method

.method public final e()V
    .locals 1

    iget-object v0, p0, LUe;->f:LTe;

    invoke-virtual {v0}, LTe;->flush()V

    return-void
.end method

.method public final f(Z)Lcn;
    .locals 11

    iget-object v0, p0, LUe;->a:Laf;

    invoke-static {v0}, LTf;->f(Ljava/lang/Object;)V

    monitor-enter v0

    :try_start_0
    iget-object v1, v0, Laf;->i:LZe;

    invoke-virtual {v1}, Ln3;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :goto_0
    :try_start_1
    iget-object v1, v0, Laf;->e:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, v0, Laf;->k:I

    if-nez v1, :cond_0

    invoke-virtual {v0}, Laf;->k()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :cond_0
    :try_start_2
    iget-object v1, v0, Laf;->i:LZe;

    invoke-virtual {v1}, LZe;->l()V

    iget-object v1, v0, Laf;->e:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_7

    iget-object v1, v0, Laf;->e:Ljava/util/ArrayDeque;

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "headersQueue.removeFirst()"

    invoke-static {v2, v1}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v1, Lse;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v0

    iget-object v0, p0, LUe;->b:Lil;

    const-string v2, "protocol"

    invoke-static {v2, v0}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0x14

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, Lse;->size()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v7, v4

    move v6, v5

    :goto_1
    if-ge v6, v3, :cond_3

    invoke-virtual {v1, v6}, Lse;->b(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v6}, Lse;->d(I)Ljava/lang/String;

    move-result-object v9

    const-string v10, ":status"

    invoke-static {v8, v10}, LTf;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "HTTP/1.1 "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lmk;->E(Ljava/lang/String;)LZ1;

    move-result-object v7

    goto :goto_2

    :cond_1
    sget-object v10, LUe;->h:Ljava/util/List;

    invoke-interface {v10, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_2

    const-string v10, "name"

    invoke-static {v10, v8}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v10, "value"

    invoke-static {v10, v9}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v9}, LMp;->W0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_3
    if-eqz v7, :cond_6

    new-instance v1, Lcn;

    invoke-direct {v1}, Lcn;-><init>()V

    iput-object v0, v1, Lcn;->b:Lil;

    iget v0, v7, LZ1;->b:I

    iput v0, v1, Lcn;->c:I

    iget-object v0, v7, LZ1;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iput-object v0, v1, Lcn;->d:Ljava/lang/String;

    new-array v0, v5, [Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_5

    check-cast v0, [Ljava/lang/String;

    new-instance v2, LYa;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, LYa;-><init>(I)V

    iget-object v3, v2, LYa;->a:Ljava/util/ArrayList;

    const-string v5, "<this>"

    invoke-static {v5, v3}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const-string v5, "asList(this)"

    invoke-static {v5, v0}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iput-object v2, v1, Lcn;->f:LYa;

    if-eqz p1, :cond_4

    iget p1, v1, Lcn;->c:I

    const/16 v0, 0x64

    if-ne p1, v0, :cond_4

    goto :goto_3

    :cond_4
    move-object v4, v1

    :goto_3
    return-object v4

    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type kotlin.Array<T>"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/net/ProtocolException;

    const-string v0, "Expected \':status\' header not present"

    invoke-direct {p1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_1
    move-exception p1

    goto :goto_6

    :cond_7
    :try_start_3
    iget-object p1, v0, Laf;->l:Ljava/io/IOException;

    if-eqz p1, :cond_8

    goto :goto_4

    :cond_8
    new-instance p1, LBp;

    iget v1, v0, Laf;->k:I

    invoke-static {v1}, LVo;->i(I)V

    invoke-direct {p1, v1}, LBp;-><init>(I)V

    :goto_4
    throw p1

    :goto_5
    iget-object v1, v0, Laf;->i:LZe;

    invoke-virtual {v1}, LZe;->l()V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_6
    monitor-exit v0

    throw p1
.end method

.method public final g(Ldn;)J
    .locals 2

    invoke-static {p1}, Lef;->a(Ldn;)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1}, LRr;->k(Ldn;)J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public final h()LGl;
    .locals 1

    iget-object v0, p0, LUe;->d:LGl;

    return-object v0
.end method
