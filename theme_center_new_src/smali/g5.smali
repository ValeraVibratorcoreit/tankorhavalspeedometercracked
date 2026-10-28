.class public final Lg5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LRf;


# static fields
.field public static final b:Lg5;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lg5;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lg5;-><init>(I)V

    sput-object v0, Lg5;->b:Lg5;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lg5;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LIl;)Ldn;
    .locals 16

    move-object/from16 v0, p1

    const/4 v1, 0x6

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    move-object/from16 v5, p0

    iget v6, v5, Lg5;->a:I

    packed-switch v6, :pswitch_data_0

    iget-object v1, v0, LIl;->b:LDl;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    monitor-enter v1

    :try_start_0
    iget-boolean v6, v1, LDl;->l:Z

    if-eqz v6, :cond_3

    iget-boolean v6, v1, LDl;->k:Z

    xor-int/2addr v6, v4

    if-eqz v6, :cond_2

    iget-boolean v6, v1, LDl;->j:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    xor-int/2addr v6, v4

    if-eqz v6, :cond_1

    monitor-exit v1

    iget-object v6, v1, LDl;->f:Lub;

    invoke-static {v6}, LTf;->f(Ljava/lang/Object;)V

    iget-object v13, v1, LDl;->p:LPj;

    const-string v7, "client"

    invoke-static {v7, v13}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    :try_start_1
    iget v8, v0, LIl;->g:I

    iget v9, v0, LIl;->h:I

    iget v10, v0, LIl;->i:I

    iget-boolean v11, v13, LPj;->f:Z

    iget-object v7, v0, LIl;->f:LT1;

    iget-object v7, v7, LT1;->d:Ljava/io/Serializable;

    check-cast v7, Ljava/lang/String;

    const-string v12, "GET"

    invoke-static {v7, v12}, LTf;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    xor-int/lit8 v12, v7, 0x1

    move-object v7, v6

    invoke-virtual/range {v7 .. v12}, Lub;->a(IIIZZ)LGl;

    move-result-object v7

    invoke-virtual {v7, v13, v0}, LGl;->j(LPj;LIl;)Ltb;

    move-result-object v7
    :try_end_1
    .catch Lgn; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    new-instance v8, Lsb;

    invoke-direct {v8, v1, v6, v7}, Lsb;-><init>(LDl;Lub;Ltb;)V

    iput-object v8, v1, LDl;->i:Lsb;

    iput-object v8, v1, LDl;->n:Lsb;

    monitor-enter v1

    :try_start_2
    iput-boolean v4, v1, LDl;->j:Z

    iput-boolean v4, v1, LDl;->k:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v1

    iget-boolean v1, v1, LDl;->m:Z

    if-nez v1, :cond_0

    const/16 v1, 0x3d

    invoke-static {v0, v3, v8, v2, v1}, LIl;->a(LIl;ILsb;LT1;I)LIl;

    move-result-object v1

    iget-object v0, v0, LIl;->f:LT1;

    invoke-virtual {v1, v0}, LIl;->b(LT1;)Ldn;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Canceled"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    monitor-exit v1

    throw v0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_1

    :goto_0
    invoke-virtual {v6, v0}, Lub;->c(Ljava/io/IOException;)V

    new-instance v1, Lgn;

    invoke-direct {v1, v0}, Lgn;-><init>(Ljava/io/IOException;)V

    throw v1

    :goto_1
    iget-object v1, v0, Lgn;->a:Ljava/io/IOException;

    invoke-virtual {v6, v1}, Lub;->c(Ljava/io/IOException;)V

    throw v0

    :cond_1
    :try_start_3
    const-string v0, "Check failed."

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :catchall_1
    move-exception v0

    goto :goto_2

    :cond_2
    const-string v0, "Check failed."

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_3
    const-string v0, "released"

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_2
    monitor-exit v1

    throw v0

    :pswitch_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    iget-object v6, v0, LIl;->f:LT1;

    const-string v7, "request"

    invoke-static {v7, v6}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v7, Ld2;

    invoke-direct {v7, v6, v1, v2}, Ld2;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    iget-object v8, v6, LT1;->b:Ljava/lang/Object;

    check-cast v8, Lf5;

    if-nez v8, :cond_4

    sget v8, Lf5;->n:I

    iget-object v8, v6, LT1;->e:Ljava/lang/Object;

    check-cast v8, Lse;

    invoke-static {v8}, LUd;->Z(Lse;)Lf5;

    move-result-object v8

    iput-object v8, v6, LT1;->b:Ljava/lang/Object;

    :cond_4
    iget-boolean v8, v8, Lf5;->j:Z

    if-eqz v8, :cond_5

    new-instance v7, Ld2;

    invoke-direct {v7, v2, v1, v2}, Ld2;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    :cond_5
    iget-object v1, v0, LIl;->b:LDl;

    instance-of v8, v1, LDl;

    if-nez v8, :cond_6

    move-object v8, v2

    goto :goto_3

    :cond_6
    move-object v8, v1

    :goto_3
    if-eqz v8, :cond_7

    iget-object v8, v8, LDl;->b:Lpa;

    :cond_7
    const-string v8, "call"

    iget-object v9, v7, Ld2;->b:Ljava/lang/Object;

    check-cast v9, LT1;

    iget-object v7, v7, Ld2;->c:Ljava/lang/Object;

    check-cast v7, Ldn;

    if-nez v9, :cond_8

    if-nez v7, :cond_8

    new-instance v0, Lcn;

    invoke-direct {v0}, Lcn;-><init>()V

    iput-object v6, v0, Lcn;->a:LT1;

    sget-object v2, Lil;->c:Lil;

    iput-object v2, v0, Lcn;->b:Lil;

    const/16 v2, 0x1f8

    iput v2, v0, Lcn;->c:I

    const-string v2, "Unsatisfiable Request (only-if-cached)"

    iput-object v2, v0, Lcn;->d:Ljava/lang/String;

    sget-object v2, LRr;->c:LJl;

    iput-object v2, v0, Lcn;->g:LJl;

    const-wide/16 v2, -0x1

    iput-wide v2, v0, Lcn;->k:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, v0, Lcn;->l:J

    invoke-virtual {v0}, Lcn;->a()Ldn;

    move-result-object v0

    invoke-static {v8, v1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_a

    :cond_8
    const-string v6, "cacheResponse"

    if-nez v9, :cond_9

    invoke-static {v7}, LTf;->f(Ljava/lang/Object;)V

    invoke-virtual {v7}, Ldn;->x()Lcn;

    move-result-object v0

    invoke-static {v7}, Lpa;->p(Ldn;)Ldn;

    move-result-object v2

    invoke-static {v2, v6}, Lcn;->b(Ldn;Ljava/lang/String;)V

    iput-object v2, v0, Lcn;->i:Ldn;

    invoke-virtual {v0}, Lcn;->a()Ldn;

    move-result-object v0

    invoke-static {v8, v1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_a

    :cond_9
    if-eqz v7, :cond_a

    invoke-static {v8, v1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_a
    invoke-virtual {v0, v9}, LIl;->b(LT1;)Ldn;

    move-result-object v0

    const-string v1, "networkResponse"

    if-eqz v7, :cond_15

    const/16 v8, 0x130

    iget v9, v0, Ldn;->d:I

    if-ne v9, v8, :cond_14

    invoke-virtual {v7}, Ldn;->x()Lcn;

    move-result-object v8

    new-instance v9, LYa;

    invoke-direct {v9, v4}, LYa;-><init>(I)V

    iget-object v10, v7, Ldn;->f:Lse;

    invoke-virtual {v10}, Lse;->size()I

    move-result v11

    move v12, v3

    :goto_4
    const-string v13, "Content-Type"

    const-string v14, "Content-Encoding"

    const-string v15, "Content-Length"

    iget-object v2, v0, Ldn;->f:Lse;

    if-ge v12, v11, :cond_10

    invoke-virtual {v10, v12}, Lse;->b(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v10, v12}, Lse;->d(I)Ljava/lang/String;

    move-result-object v3

    const-string v5, "Warning"

    invoke-virtual {v5, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_c

    const-string v5, "1"

    move-object/from16 p1, v10

    const/4 v10, 0x0

    invoke-static {v3, v5, v10}, LMp;->U0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_d

    :cond_b
    :goto_5
    const/4 v2, 0x1

    goto :goto_7

    :cond_c
    move-object/from16 p1, v10

    const/4 v10, 0x0

    :cond_d
    invoke-virtual {v15, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_f

    invoke-virtual {v14, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_f

    invoke-virtual {v13, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_e

    goto :goto_6

    :cond_e
    invoke-static {v4}, Lpa;->z(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_f

    invoke-virtual {v2, v4}, Lse;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_b

    :cond_f
    :goto_6
    invoke-virtual {v9, v4, v3}, LYa;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    :goto_7
    add-int/2addr v12, v2

    move-object/from16 v5, p0

    move v4, v2

    move v3, v10

    const/4 v2, 0x0

    move-object/from16 v10, p1

    goto :goto_4

    :cond_10
    move v10, v3

    invoke-virtual {v2}, Lse;->size()I

    move-result v3

    :goto_8
    if-ge v10, v3, :cond_13

    invoke-virtual {v2, v10}, Lse;->b(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v15, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_12

    invoke-virtual {v14, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_12

    invoke-virtual {v13, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_11

    goto :goto_9

    :cond_11
    invoke-static {v4}, Lpa;->z(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_12

    invoke-virtual {v2, v10}, Lse;->d(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v9, v4, v5}, LYa;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_12
    :goto_9
    const/4 v4, 0x1

    add-int/2addr v10, v4

    goto :goto_8

    :cond_13
    invoke-virtual {v9}, LYa;->b()Lse;

    move-result-object v2

    invoke-virtual {v2}, Lse;->c()LYa;

    move-result-object v2

    iput-object v2, v8, Lcn;->f:LYa;

    iget-wide v2, v0, Ldn;->k:J

    iput-wide v2, v8, Lcn;->k:J

    iget-wide v2, v0, Ldn;->l:J

    iput-wide v2, v8, Lcn;->l:J

    invoke-static {v7}, Lpa;->p(Ldn;)Ldn;

    move-result-object v2

    invoke-static {v2, v6}, Lcn;->b(Ldn;Ljava/lang/String;)V

    iput-object v2, v8, Lcn;->i:Ldn;

    invoke-static {v0}, Lpa;->p(Ldn;)Ldn;

    move-result-object v2

    invoke-static {v2, v1}, Lcn;->b(Ldn;Ljava/lang/String;)V

    iput-object v2, v8, Lcn;->h:Ldn;

    invoke-virtual {v8}, Lcn;->a()Ldn;

    iget-object v0, v0, Ldn;->g:LJl;

    invoke-static {v0}, LTf;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, LJl;->close()V

    const/4 v0, 0x0

    invoke-static {v0}, LTf;->f(Ljava/lang/Object;)V

    throw v0

    :cond_14
    iget-object v2, v7, Ldn;->g:LJl;

    if-eqz v2, :cond_15

    invoke-static {v2}, LRr;->d(Ljava/io/Closeable;)V

    :cond_15
    invoke-virtual {v0}, Ldn;->x()Lcn;

    move-result-object v2

    invoke-static {v7}, Lpa;->p(Ldn;)Ldn;

    move-result-object v3

    invoke-static {v3, v6}, Lcn;->b(Ldn;Ljava/lang/String;)V

    iput-object v3, v2, Lcn;->i:Ldn;

    invoke-static {v0}, Lpa;->p(Ldn;)Ldn;

    move-result-object v0

    invoke-static {v0, v1}, Lcn;->b(Ldn;Ljava/lang/String;)V

    iput-object v0, v2, Lcn;->h:Ldn;

    invoke-virtual {v2}, Lcn;->a()Ldn;

    move-result-object v0

    :goto_a
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
