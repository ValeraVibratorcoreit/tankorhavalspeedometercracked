.class public final Lk5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LRf;


# instance fields
.field public final a:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lk5;->a:Z

    return-void
.end method


# virtual methods
.method public final a(LIl;)Ldn;
    .locals 16

    move-object/from16 v0, p1

    const-string v1, "call"

    iget-object v2, v0, LIl;->e:Lsb;

    invoke-static {v2}, LTf;->f(Ljava/lang/Object;)V

    iget-object v3, v2, Lsb;->f:Ltb;

    iget-object v4, v2, Lsb;->d:Lpa;

    iget-object v5, v2, Lsb;->c:LDl;

    iget-object v0, v0, LIl;->f:LT1;

    iget-object v6, v0, LT1;->f:Ljava/lang/Object;

    check-cast v6, Lbb;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    :try_start_0
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v5}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v3, v0}, Ltb;->b(LT1;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3

    iget-object v9, v0, LT1;->d:Ljava/io/Serializable;

    check-cast v9, Ljava/lang/String;

    invoke-static {v9}, LBr;->W(Ljava/lang/String;)Z

    move-result v9

    const/4 v11, 0x1

    const/4 v12, 0x0

    iget-object v13, v2, Lsb;->b:LGl;

    if-eqz v9, :cond_3

    if-eqz v6, :cond_3

    iget-object v9, v0, LT1;->e:Ljava/lang/Object;

    check-cast v9, Lse;

    const-string v14, "Expect"

    invoke-virtual {v9, v14}, Lse;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v14, "100-continue"

    invoke-virtual {v14, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_0

    :try_start_1
    invoke-interface {v3}, Ltb;->e()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    invoke-virtual {v2, v11}, Lsb;->b(Z)Lcn;

    move-result-object v9

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v5}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    move v14, v12

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v3, v0

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v5}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Lsb;->c(Ljava/io/IOException;)V

    throw v3

    :cond_0
    move v14, v11

    const/4 v9, 0x0

    :goto_0
    if-nez v9, :cond_1

    iput-boolean v12, v2, Lsb;->a:Z

    iget-object v11, v0, LT1;->f:Ljava/lang/Object;

    check-cast v11, Lbb;

    invoke-static {v11}, LTf;->f(Ljava/lang/Object;)V

    iget v11, v11, Lbb;->a:I

    int-to-long v10, v11

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v5}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v3, v0, v10, v11}, Ltb;->a(LT1;J)LMo;

    move-result-object v15

    new-instance v12, Lqb;

    invoke-direct {v12, v2, v15, v10, v11}, Lqb;-><init>(Lsb;LMo;J)V

    new-instance v10, LAl;

    invoke-direct {v10, v12}, LAl;-><init>(LMo;)V

    iget-object v11, v6, Lbb;->c:Ljava/lang/Cloneable;

    check-cast v11, [B

    iget v12, v6, Lbb;->b:I

    iget v6, v6, Lbb;->a:I

    invoke-virtual {v10, v12, v6, v11}, LAl;->w(II[B)LO4;

    invoke-virtual {v10}, LAl;->close()V

    goto :goto_1

    :cond_1
    move v10, v12

    const/4 v6, 0x0

    invoke-virtual {v5, v2, v11, v10, v6}, LDl;->f(Lsb;ZZLjava/io/IOException;)Ljava/io/IOException;

    iget-object v6, v13, LGl;->f:LTe;

    if-eqz v6, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {v3}, Ltb;->h()LGl;

    move-result-object v6

    invoke-virtual {v6}, LGl;->k()V

    :goto_1
    move-object v10, v9

    move v11, v14

    const/4 v6, 0x0

    const/4 v9, 0x0

    goto :goto_2

    :cond_3
    move v9, v12

    const/4 v6, 0x0

    invoke-virtual {v5, v2, v11, v9, v6}, LDl;->f(Lsb;ZZLjava/io/IOException;)Ljava/io/IOException;

    move-object v10, v6

    :goto_2
    :try_start_2
    invoke-interface {v3}, Ltb;->d()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    if-nez v10, :cond_4

    invoke-virtual {v2, v9}, Lsb;->b(Z)Lcn;

    move-result-object v10

    invoke-static {v10}, LTf;->f(Ljava/lang/Object;)V

    if-eqz v11, :cond_4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v5}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v11, 0x0

    :cond_4
    iput-object v0, v10, Lcn;->a:LT1;

    iget-object v9, v13, LGl;->d:Loe;

    iput-object v9, v10, Lcn;->e:Loe;

    iput-wide v7, v10, Lcn;->k:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    iput-wide v14, v10, Lcn;->l:J

    invoke-virtual {v10}, Lcn;->a()Ldn;

    move-result-object v9

    const/16 v10, 0x64

    iget v12, v9, Ldn;->d:I

    if-ne v12, v10, :cond_6

    const/4 v10, 0x0

    invoke-virtual {v2, v10}, Lsb;->b(Z)Lcn;

    move-result-object v9

    invoke-static {v9}, LTf;->f(Ljava/lang/Object;)V

    if-eqz v11, :cond_5

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v5}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_5
    iput-object v0, v9, Lcn;->a:LT1;

    iget-object v0, v13, LGl;->d:Loe;

    iput-object v0, v9, Lcn;->e:Loe;

    iput-wide v7, v9, Lcn;->k:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, v9, Lcn;->l:J

    invoke-virtual {v9}, Lcn;->a()Ldn;

    move-result-object v9

    iget v12, v9, Ldn;->d:I

    :cond_6
    move-object/from16 v7, p0

    iget-boolean v0, v7, Lk5;->a:Z

    if-eqz v0, :cond_7

    const/16 v0, 0x65

    if-ne v12, v0, :cond_7

    invoke-virtual {v9}, Ldn;->x()Lcn;

    move-result-object v0

    sget-object v1, LRr;->c:LJl;

    iput-object v1, v0, Lcn;->g:LJl;

    invoke-virtual {v0}, Lcn;->a()Ldn;

    move-result-object v0

    goto :goto_3

    :cond_7
    invoke-virtual {v9}, Ldn;->x()Lcn;

    move-result-object v0

    :try_start_3
    const-string v1, "Content-Type"

    invoke-static {v9, v1}, Ldn;->n(Ldn;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v9}, Ltb;->g(Ldn;)J

    move-result-wide v4

    invoke-interface {v3, v9}, Ltb;->c(Ldn;)LXo;

    move-result-object v8

    new-instance v9, Lrb;

    invoke-direct {v9, v2, v8, v4, v5}, Lrb;-><init>(Lsb;LXo;J)V

    new-instance v8, LJl;

    new-instance v10, LBl;

    invoke-direct {v10, v9}, LBl;-><init>(LXo;)V

    invoke-direct {v8, v1, v4, v5, v10}, LJl;-><init>(Ljava/lang/String;JLBl;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    iput-object v8, v0, Lcn;->g:LJl;

    invoke-virtual {v0}, Lcn;->a()Ldn;

    move-result-object v0

    :goto_3
    iget-object v1, v0, Ldn;->a:LT1;

    iget-object v1, v1, LT1;->e:Ljava/lang/Object;

    check-cast v1, Lse;

    const-string v2, "Connection"

    invoke-virtual {v1, v2}, Lse;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v4, "close"

    invoke-virtual {v4, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_8

    invoke-static {v0, v2}, Ldn;->n(Ldn;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9

    :cond_8
    invoke-interface {v3}, Ltb;->h()LGl;

    move-result-object v1

    invoke-virtual {v1}, LGl;->k()V

    :cond_9
    const/16 v1, 0xcc

    if-eq v12, v1, :cond_a

    const/16 v1, 0xcd

    if-ne v12, v1, :cond_d

    :cond_a
    iget-object v1, v0, Ldn;->g:LJl;

    if-eqz v1, :cond_b

    invoke-virtual {v1}, LJl;->n()J

    move-result-wide v2

    goto :goto_4

    :cond_b
    const-wide/16 v2, -0x1

    :goto_4
    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-lez v2, :cond_d

    new-instance v0, Ljava/net/ProtocolException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "HTTP "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " had non-zero Content-Length: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v1, :cond_c

    invoke-virtual {v1}, LJl;->n()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    goto :goto_5

    :cond_c
    move-object v10, v6

    :goto_5
    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    return-object v0

    :catch_1
    move-exception v0

    invoke-virtual {v2, v0}, Lsb;->c(Ljava/io/IOException;)V

    throw v0

    :catch_2
    move-exception v0

    move-object/from16 v7, p0

    move-object v1, v0

    invoke-virtual {v2, v1}, Lsb;->c(Ljava/io/IOException;)V

    throw v1

    :catch_3
    move-exception v0

    move-object/from16 v7, p0

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1, v5}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v2, v0}, Lsb;->c(Ljava/io/IOException;)V

    throw v0
.end method
