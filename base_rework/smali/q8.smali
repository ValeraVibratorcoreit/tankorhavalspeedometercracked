.class public final Lq8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Class;

.field public final b:Ljava/util/List;

.field public final c:LUm;

.field public final d:LNk;

.field public final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/util/List;LUm;LK2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq8;->a:Ljava/lang/Class;

    iput-object p4, p0, Lq8;->b:Ljava/util/List;

    iput-object p5, p0, Lq8;->c:LUm;

    iput-object p6, p0, Lq8;->d:LNk;

    new-instance p4, Ljava/lang/StringBuilder;

    const-string p5, "Failed DecodePath{"

    invoke-direct {p4, p5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "->"

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "}"

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lq8;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(IILQ0;Le8;Lrk;)LIm;
    .locals 17

    move-object/from16 v7, p0

    move-object/from16 v0, p3

    iget-object v8, v7, Lq8;->d:LNk;

    invoke-interface {v8}, LNk;->b()Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Argument must not be null"

    invoke-static {v2, v1}, LUd;->l(Ljava/lang/String;Ljava/lang/Object;)V

    move-object v9, v1

    check-cast v9, Ljava/util/List;

    move-object/from16 v1, p0

    move-object/from16 v2, p4

    move/from16 v3, p1

    move/from16 v4, p2

    move-object/from16 v5, p5

    move-object v6, v9

    :try_start_0
    invoke-virtual/range {v1 .. v6}, Lq8;->b(Le8;IILrk;Ljava/util/List;)LIm;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v8, v9}, LNk;->a(Ljava/lang/Object;)Z

    iget-object v2, v0, LQ0;->b:Ljava/lang/Object;

    check-cast v2, Lp8;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v1}, LIm;->get()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v15

    const/4 v3, 0x4

    iget v0, v0, LQ0;->a:I

    iget-object v4, v2, Lp8;->a:Ln8;

    const/4 v5, 0x0

    if-eq v0, v3, :cond_0

    invoke-virtual {v4, v15}, Ln8;->f(Ljava/lang/Class;)Lfr;

    move-result-object v3

    iget-object v6, v2, Lp8;->h:LVd;

    iget v8, v2, Lp8;->l:I

    iget v9, v2, Lp8;->m:I

    invoke-interface {v3, v6, v1, v8, v9}, Lfr;->b(Landroid/content/Context;LIm;II)LIm;

    move-result-object v6

    move-object v14, v3

    goto :goto_0

    :cond_0
    move-object v6, v1

    move-object v14, v5

    :goto_0
    invoke-virtual {v1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-interface {v1}, LIm;->e()V

    :cond_1
    iget-object v1, v4, Ln8;->c:LVd;

    invoke-virtual {v1}, LVd;->a()Lsm;

    move-result-object v1

    iget-object v1, v1, Lsm;->d:LYa;

    invoke-interface {v6}, LIm;->d()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1, v3}, LYa;->c(Ljava/lang/Class;)LQm;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v1, v4, Ln8;->c:LVd;

    invoke-virtual {v1}, LVd;->a()Lsm;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v6}, LIm;->d()Ljava/lang/Class;

    move-result-object v3

    iget-object v1, v1, Lsm;->d:LYa;

    invoke-virtual {v1, v3}, LYa;->c(Ljava/lang/Class;)LQm;

    move-result-object v5

    if-eqz v5, :cond_2

    iget-object v1, v2, Lp8;->o:Lrk;

    invoke-interface {v5, v1}, LQm;->i(Lrk;)I

    move-result v1

    goto :goto_1

    :cond_2
    new-instance v0, Lrm;

    invoke-interface {v6}, LIm;->d()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v0, v1}, Lrm;-><init>(Ljava/lang/Class;)V

    throw v0

    :cond_3
    const/4 v1, 0x3

    :goto_1
    iget-object v3, v2, Lp8;->v:Lfg;

    invoke-virtual {v4}, Ln8;->b()Ljava/util/ArrayList;

    move-result-object v8

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v9

    const/4 v13, 0x0

    move v10, v13

    :goto_2
    const/4 v12, 0x1

    if-ge v10, v9, :cond_5

    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LWi;

    iget-object v11, v11, LWi;->a:Lfg;

    invoke-interface {v11, v3}, Lfg;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    move v3, v12

    goto :goto_3

    :cond_4
    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_5
    move v3, v13

    :goto_3
    xor-int/2addr v3, v12

    iget-object v8, v2, Lp8;->n:Lk9;

    invoke-virtual {v8, v0, v1, v3}, Lk9;->d(IIZ)Z

    move-result v0

    if-eqz v0, :cond_c

    if-eqz v5, :cond_b

    invoke-static {v1}, LVo;->o(I)I

    move-result v0

    if-eqz v0, :cond_a

    if-ne v0, v12, :cond_6

    new-instance v0, LKm;

    iget-object v1, v4, Ln8;->c:LVd;

    iget-object v9, v1, LVd;->a:Luh;

    iget-object v10, v2, Lp8;->v:Lfg;

    iget-object v11, v2, Lp8;->i:Lfg;

    iget v1, v2, Lp8;->l:I

    iget v3, v2, Lp8;->m:I

    iget-object v4, v2, Lp8;->o:Lrk;

    move-object v8, v0

    move-object/from16 p1, v0

    move v0, v12

    move v12, v1

    move v1, v13

    move v13, v3

    move-object/from16 v16, v4

    invoke-direct/range {v8 .. v16}, LKm;-><init>(Luh;Lfg;Lfg;IILfr;Ljava/lang/Class;Lrk;)V

    move v3, v1

    move-object/from16 v1, p1

    goto :goto_5

    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const/4 v2, 0x1

    if-eq v1, v2, :cond_9

    const/4 v2, 0x2

    if-eq v1, v2, :cond_8

    const/4 v2, 0x3

    if-eq v1, v2, :cond_7

    const-string v1, "null"

    goto :goto_4

    :cond_7
    const-string v1, "NONE"

    goto :goto_4

    :cond_8
    const-string v1, "TRANSFORMED"

    goto :goto_4

    :cond_9
    const-string v1, "SOURCE"

    :goto_4
    const-string v2, "Unknown strategy: "

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    move v0, v12

    move v3, v13

    new-instance v1, LY7;

    iget-object v4, v2, Lp8;->v:Lfg;

    iget-object v8, v2, Lp8;->i:Lfg;

    invoke-direct {v1, v4, v8}, LY7;-><init>(Lfg;Lfg;)V

    :goto_5
    sget-object v4, Lnh;->e:LK2;

    invoke-virtual {v4}, LK2;->b()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lnh;

    iput-boolean v3, v4, Lnh;->d:Z

    iput-boolean v0, v4, Lnh;->c:Z

    iput-object v6, v4, Lnh;->b:LIm;

    iget-object v0, v2, Lp8;->f:LK2;

    iput-object v1, v0, LK2;->b:Ljava/lang/Object;

    iput-object v5, v0, LK2;->c:Ljava/lang/Object;

    iput-object v4, v0, LK2;->d:Ljava/lang/Object;

    move-object v6, v4

    goto :goto_6

    :cond_b
    new-instance v0, Lrm;

    invoke-interface {v6}, LIm;->get()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-direct {v0, v1}, Lrm;-><init>(Ljava/lang/Class;)V

    throw v0

    :cond_c
    :goto_6
    iget-object v0, v7, Lq8;->c:LUm;

    move-object/from16 v1, p5

    invoke-interface {v0, v6, v1}, LUm;->m(LIm;Lrk;)LIm;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v0

    move-object v1, v0

    invoke-interface {v8, v9}, LNk;->a(Ljava/lang/Object;)Z

    throw v1
.end method

.method public final b(Le8;IILrk;Ljava/util/List;)LIm;
    .locals 9

    iget-object v0, p0, Lq8;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_3

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LMm;

    :try_start_0
    invoke-interface {p1}, Le8;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4, v5, p4}, LMm;->b(Ljava/lang/Object;Lrk;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {p1}, Le8;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4, v5, p2, p3, p4}, LMm;->a(Ljava/lang/Object;IILrk;)LIm;

    move-result-object v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v5

    goto :goto_1

    :catch_1
    move-exception v5

    goto :goto_1

    :catch_2
    move-exception v5

    :goto_1
    const-string v6, "DecodePath"

    const/4 v7, 0x2

    invoke-static {v6, v7}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v7

    if-eqz v7, :cond_0

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Failed to decode data for "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v6, v4, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    invoke-interface {p5, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_2
    if-eqz v2, :cond_2

    goto :goto_3

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    :goto_3
    if-eqz v2, :cond_4

    return-object v2

    :cond_4
    new-instance p1, LXd;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2, p5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object p3, p0, Lq8;->e:Ljava/lang/String;

    invoke-direct {p1, p3, p2}, LXd;-><init>(Ljava/lang/String;Ljava/util/List;)V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DecodePath{ dataClass="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lq8;->a:Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", decoders="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lq8;->b:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transcoder="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lq8;->c:LUm;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
