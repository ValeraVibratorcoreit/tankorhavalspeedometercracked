.class public final LJ4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LRf;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LPj;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LJ4;->a:I

    const-string v0, "client"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ4;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lpa;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LJ4;->a:I

    const-string v0, "cookieJar"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJ4;->b:Ljava/lang/Object;

    return-void
.end method

.method public static d(Ldn;I)I
    .locals 1

    const-string v0, "Retry-After"

    invoke-static {p0, v0}, Ldn;->n(Ldn;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    const-string p1, "\\d+"

    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object p1

    const-string v0, "compile(pattern)"

    invoke-static {v0, p1}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p0

    const-string p1, "Integer.valueOf(header)"

    invoke-static {p1, p0}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    :cond_0
    const p0, 0x7fffffff

    return p0

    :cond_1
    return p1
.end method


# virtual methods
.method public final a(LIl;)Ldn;
    .locals 30

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    iget v0, v1, LJ4;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, v2, LIl;->f:LT1;

    iget-object v3, v2, LIl;->b:LDl;

    sget-object v4, LSa;->a:LSa;

    const/4 v5, 0x1

    move-object v8, v4

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v4, v0

    move v0, v5

    :goto_0
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v11, "request"

    invoke-static {v11, v4}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v11, v3, LDl;->i:Lsb;

    if-nez v11, :cond_f

    monitor-enter v3

    :try_start_0
    iget-boolean v11, v3, LDl;->k:Z

    xor-int/2addr v11, v5

    if-eqz v11, :cond_e

    iget-boolean v11, v3, LDl;->j:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    xor-int/2addr v11, v5

    if-eqz v11, :cond_d

    monitor-exit v3

    if-eqz v0, :cond_2

    new-instance v0, Lub;

    iget-object v11, v3, LDl;->a:LHl;

    iget-object v12, v4, LT1;->c:Ljava/lang/Object;

    check-cast v12, Lgf;

    iget-boolean v13, v12, Lgf;->a:Z

    iget-object v14, v3, LDl;->p:LPj;

    if-eqz v13, :cond_1

    iget-object v13, v14, LPj;->o:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v13, :cond_0

    iget-object v15, v14, LPj;->s:Ljavax/net/ssl/HostnameVerifier;

    iget-object v7, v14, LPj;->t:LD5;

    move-object/from16 v23, v7

    move-object/from16 v21, v13

    move-object/from16 v22, v15

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "CLEARTEXT-only client"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    :goto_1
    new-instance v7, LI0;

    iget-object v13, v14, LPj;->k:Lpa;

    iget-object v15, v14, LPj;->n:Ljavax/net/SocketFactory;

    iget-object v5, v14, LPj;->m:Lpa;

    iget-object v6, v14, LPj;->r:Ljava/util/List;

    move-object/from16 v28, v8

    iget-object v8, v14, LPj;->q:Ljava/util/List;

    iget-object v14, v14, LPj;->l:Ljava/net/ProxySelector;

    move/from16 v29, v10

    iget-object v10, v12, Lgf;->e:Ljava/lang/String;

    iget v12, v12, Lgf;->f:I

    move-object/from16 v16, v7

    move-object/from16 v17, v10

    move/from16 v18, v12

    move-object/from16 v19, v13

    move-object/from16 v20, v15

    move-object/from16 v24, v5

    move-object/from16 v25, v6

    move-object/from16 v26, v8

    move-object/from16 v27, v14

    invoke-direct/range {v16 .. v27}, LI0;-><init>(Ljava/lang/String;ILpa;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;LD5;Lpa;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V

    invoke-direct {v0, v11, v7, v3}, Lub;-><init>(LHl;LI0;LDl;)V

    iput-object v0, v3, LDl;->f:Lub;

    goto :goto_2

    :cond_2
    move-object/from16 v28, v8

    move/from16 v29, v10

    :goto_2
    :try_start_1
    iget-boolean v0, v3, LDl;->m:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_c

    :try_start_2
    invoke-virtual {v2, v4}, LIl;->b(LT1;)Ldn;

    move-result-object v0
    :try_end_2
    .catch Lgn; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v9, :cond_4

    :try_start_3
    invoke-virtual {v0}, Ldn;->x()Lcn;

    move-result-object v0

    invoke-virtual {v9}, Ldn;->x()Lcn;

    move-result-object v4

    const/4 v5, 0x0

    iput-object v5, v4, Lcn;->g:LJl;

    invoke-virtual {v4}, Lcn;->a()Ldn;

    move-result-object v4

    iget-object v6, v4, Ldn;->g:LJl;

    if-nez v6, :cond_3

    iput-object v4, v0, Lcn;->j:Ldn;

    invoke-virtual {v0}, Lcn;->a()Ldn;

    move-result-object v0

    :goto_3
    move-object v9, v0

    goto :goto_4

    :catchall_0
    move-exception v0

    const/4 v2, 0x1

    goto/16 :goto_6

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "priorResponse.body != null"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    const/4 v5, 0x0

    goto :goto_3

    :goto_4
    iget-object v0, v3, LDl;->i:Lsb;

    invoke-virtual {v1, v9, v0}, LJ4;->b(Ldn;Lsb;)LT1;

    move-result-object v4

    if-nez v4, :cond_7

    if-eqz v0, :cond_5

    iget-boolean v0, v0, Lsb;->a:Z

    if-eqz v0, :cond_5

    iget-boolean v0, v3, LDl;->h:Z

    const/4 v2, 0x1

    xor-int/2addr v0, v2

    if-eqz v0, :cond_6

    iput-boolean v2, v3, LDl;->h:Z

    iget-object v0, v3, LDl;->c:LZe;

    invoke-virtual {v0}, Ln3;->i()Z

    :cond_5
    const/4 v2, 0x0

    goto :goto_5

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Check failed."

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_5
    invoke-virtual {v3, v2}, LDl;->d(Z)V

    return-object v9

    :cond_7
    :try_start_4
    iget-object v0, v9, Ldn;->g:LJl;

    if-eqz v0, :cond_8

    invoke-static {v0}, LRr;->d(Ljava/io/Closeable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_8
    add-int/lit8 v10, v29, 0x1

    const/16 v0, 0x14

    if-gt v10, v0, :cond_9

    const/4 v6, 0x1

    invoke-virtual {v3, v6}, LDl;->d(Z)V

    move-object/from16 v8, v28

    const/4 v0, 0x1

    const/4 v5, 0x1

    goto/16 :goto_0

    :cond_9
    :try_start_5
    new-instance v0, Ljava/net/ProtocolException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Too many follow-up requests: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_0
    move-exception v0

    const/4 v5, 0x0

    move-object v6, v0

    nop

    instance-of v0, v6, LV6;

    const/4 v7, 0x1

    xor-int/2addr v0, v7

    invoke-virtual {v1, v6, v3, v4, v0}, LJ4;->c(Ljava/io/IOException;LDl;LT1;Z)Z

    move-result v0

    if-eqz v0, :cond_a

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface/range {v28 .. v28}, Ljava/util/Collection;->size()I

    move-result v8

    add-int/2addr v8, v7

    invoke-direct {v0, v8}, Ljava/util/ArrayList;-><init>(I)V

    move-object/from16 v8, v28

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    invoke-virtual {v3, v7}, LDl;->d(Z)V

    move-object v8, v0

    move v5, v7

    move/from16 v10, v29

    const/4 v0, 0x0

    goto/16 :goto_0

    :cond_a
    move-object/from16 v8, v28

    :try_start_6
    invoke-static {v6, v8}, LRr;->z(Ljava/lang/Exception;Ljava/util/List;)V

    throw v6

    :catch_1
    move-exception v0

    move-object/from16 v8, v28

    const/4 v5, 0x0

    move-object v6, v0

    iget-object v0, v6, Lgn;->a:Ljava/io/IOException;

    const/4 v7, 0x0

    invoke-virtual {v1, v0, v3, v4, v7}, LJ4;->c(Ljava/io/IOException;LDl;LT1;Z)Z

    move-result v0

    if-eqz v0, :cond_b

    iget-object v0, v6, Lgn;->b:Ljava/io/IOException;

    new-instance v6, Ljava/util/ArrayList;

    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v10

    const/4 v11, 0x1

    add-int/2addr v10, v11

    invoke-direct {v6, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    invoke-virtual {v3, v11}, LDl;->d(Z)V

    move-object v8, v6

    move v0, v7

    move v5, v11

    move/from16 v10, v29

    goto/16 :goto_0

    :cond_b
    :try_start_7
    iget-object v0, v6, Lgn;->b:Ljava/io/IOException;

    invoke-static {v0, v8}, LRr;->z(Ljava/lang/Exception;Ljava/util/List;)V

    throw v0

    :cond_c
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Canceled"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :goto_6
    invoke-virtual {v3, v2}, LDl;->d(Z)V

    throw v0

    :cond_d
    :try_start_8
    const-string v0, "Check failed."

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :catchall_1
    move-exception v0

    goto :goto_7

    :cond_e
    const-string v0, "cannot make a new request because the previous response is still open: please call response.close()"

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    :goto_7
    monitor-exit v3

    throw v0

    :cond_f
    const-string v0, "Check failed."

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :pswitch_0
    iget-object v0, v2, LIl;->f:LT1;

    invoke-virtual {v0}, LT1;->e()LH0;

    move-result-object v3

    const-wide/16 v4, -0x1

    const-string v6, "Content-Type"

    const-string v7, "Content-Length"

    iget-object v8, v0, LT1;->f:Ljava/lang/Object;

    check-cast v8, Lbb;

    if-eqz v8, :cond_12

    iget-object v9, v8, Lbb;->d:Ljava/lang/Object;

    check-cast v9, Lmi;

    if-eqz v9, :cond_10

    iget-object v9, v9, Lmi;->a:Ljava/lang/String;

    invoke-virtual {v3, v6, v9}, LH0;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_10
    iget v8, v8, Lbb;->a:I

    int-to-long v8, v8

    cmp-long v10, v8, v4

    const-string v11, "Transfer-Encoding"

    if-eqz v10, :cond_11

    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v7, v8}, LH0;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v8, v3, LH0;->d:Ljava/lang/Object;

    check-cast v8, LYa;

    invoke-virtual {v8, v11}, LYa;->e(Ljava/lang/String;)V

    goto :goto_8

    :cond_11
    const-string v8, "chunked"

    invoke-virtual {v3, v11, v8}, LH0;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v8, v3, LH0;->d:Ljava/lang/Object;

    check-cast v8, LYa;

    invoke-virtual {v8, v7}, LYa;->e(Ljava/lang/String;)V

    :cond_12
    :goto_8
    iget-object v8, v0, LT1;->e:Ljava/lang/Object;

    check-cast v8, Lse;

    const-string v9, "Host"

    invoke-virtual {v8, v9}, Lse;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    iget-object v12, v0, LT1;->c:Ljava/lang/Object;

    check-cast v12, Lgf;

    if-nez v10, :cond_13

    invoke-static {v12, v11}, LRr;->v(Lgf;Z)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3, v9, v10}, LH0;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_13
    const-string v9, "Connection"

    invoke-virtual {v8, v9}, Lse;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_14

    const-string v10, "Keep-Alive"

    invoke-virtual {v3, v9, v10}, LH0;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_14
    const-string v9, "Accept-Encoding"

    invoke-virtual {v8, v9}, Lse;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v13, "gzip"

    if-nez v10, :cond_15

    const-string v10, "Range"

    invoke-virtual {v8, v10}, Lse;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_15

    invoke-virtual {v3, v9, v13}, LH0;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v11, 0x1

    :cond_15
    iget-object v9, v1, LJ4;->b:Ljava/lang/Object;

    check-cast v9, Lpa;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v10, "url"

    invoke-static {v10, v12}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v10, "User-Agent"

    invoke-virtual {v8, v10}, Lse;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_16

    const-string v8, "okhttp/4.9.1"

    invoke-virtual {v3, v10, v8}, LH0;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_16
    invoke-virtual {v3}, LH0;->a()LT1;

    move-result-object v3

    invoke-virtual {v2, v3}, LIl;->b(LT1;)Ldn;

    move-result-object v2

    iget-object v3, v2, Ldn;->f:Lse;

    invoke-static {v9, v12, v3}, Lef;->b(Lpa;Lgf;Lse;)V

    invoke-virtual {v2}, Ldn;->x()Lcn;

    move-result-object v8

    iput-object v0, v8, Lcn;->a:LT1;

    if-eqz v11, :cond_17

    const-string v0, "Content-Encoding"

    invoke-static {v2, v0}, Ldn;->n(Ldn;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v13, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_17

    invoke-static {v2}, Lef;->a(Ldn;)Z

    move-result v9

    if-eqz v9, :cond_17

    iget-object v9, v2, Ldn;->g:LJl;

    if-eqz v9, :cond_17

    new-instance v10, Lme;

    invoke-virtual {v9}, LJl;->x()LP4;

    move-result-object v9

    invoke-direct {v10, v9}, Lme;-><init>(LXo;)V

    invoke-virtual {v3}, Lse;->c()LYa;

    move-result-object v3

    invoke-virtual {v3, v0}, LYa;->e(Ljava/lang/String;)V

    invoke-virtual {v3, v7}, LYa;->e(Ljava/lang/String;)V

    invoke-virtual {v3}, LYa;->b()Lse;

    move-result-object v0

    invoke-virtual {v0}, Lse;->c()LYa;

    move-result-object v0

    iput-object v0, v8, Lcn;->f:LYa;

    invoke-static {v2, v6}, Ldn;->n(Ldn;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, LJl;

    new-instance v3, LBl;

    invoke-direct {v3, v10}, LBl;-><init>(LXo;)V

    invoke-direct {v2, v0, v4, v5, v3}, LJl;-><init>(Ljava/lang/String;JLBl;)V

    iput-object v2, v8, Lcn;->g:LJl;

    :cond_17
    invoke-virtual {v8}, Lcn;->a()Ldn;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public b(Ldn;Lsb;)LT1;
    .locals 10

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    iget-object v1, p2, Lsb;->b:LGl;

    if-eqz v1, :cond_0

    iget-object v1, v1, LGl;->q:Lfn;

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    iget v2, p1, Ldn;->d:I

    iget-object v3, p1, Ldn;->a:LT1;

    iget-object v3, v3, LT1;->d:Ljava/io/Serializable;

    check-cast v3, Ljava/lang/String;

    const/4 v4, 0x0

    const/16 v5, 0x134

    const/16 v6, 0x133

    const/4 v7, 0x1

    if-eq v2, v6, :cond_e

    if-eq v2, v5, :cond_e

    const/16 v8, 0x191

    if-eq v2, v8, :cond_d

    const/16 v8, 0x1a5

    if-eq v2, v8, :cond_a

    const/16 p2, 0x1f7

    if-eq v2, p2, :cond_7

    const/16 p2, 0x197

    if-eq v2, p2, :cond_5

    const/16 p2, 0x198

    if-eq v2, p2, :cond_1

    packed-switch v2, :pswitch_data_0

    return-object v0

    :cond_1
    iget-object v1, p0, LJ4;->b:Ljava/lang/Object;

    check-cast v1, LPj;

    iget-boolean v1, v1, LPj;->f:Z

    if-nez v1, :cond_2

    return-object v0

    :cond_2
    iget-object v1, p1, Ldn;->j:Ldn;

    if-eqz v1, :cond_3

    iget v1, v1, Ldn;->d:I

    if-ne v1, p2, :cond_3

    return-object v0

    :cond_3
    invoke-static {p1, v4}, LJ4;->d(Ldn;I)I

    move-result p2

    if-lez p2, :cond_4

    return-object v0

    :cond_4
    iget-object p1, p1, Ldn;->a:LT1;

    return-object p1

    :cond_5
    invoke-static {v1}, LTf;->f(Ljava/lang/Object;)V

    iget-object p1, v1, Lfn;->b:Ljava/net/Proxy;

    invoke-virtual {p1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object p1

    sget-object p2, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne p1, p2, :cond_6

    iget-object p1, p0, LJ4;->b:Ljava/lang/Object;

    check-cast p1, LPj;

    iget-object p1, p1, LPj;->m:Lpa;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v0

    :cond_6
    new-instance p1, Ljava/net/ProtocolException;

    const-string p2, "Received HTTP_PROXY_AUTH (407) code while not using proxy"

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    iget-object v1, p1, Ldn;->j:Ldn;

    if-eqz v1, :cond_8

    iget v1, v1, Ldn;->d:I

    if-ne v1, p2, :cond_8

    return-object v0

    :cond_8
    const p2, 0x7fffffff

    invoke-static {p1, p2}, LJ4;->d(Ldn;I)I

    move-result p2

    if-nez p2, :cond_9

    iget-object p1, p1, Ldn;->a:LT1;

    return-object p1

    :cond_9
    return-object v0

    :cond_a
    if-eqz p2, :cond_c

    iget-object v1, p2, Lsb;->e:Lub;

    iget-object v1, v1, Lub;->h:LI0;

    iget-object v1, v1, LI0;->a:Lgf;

    iget-object v1, v1, Lgf;->e:Ljava/lang/String;

    iget-object v2, p2, Lsb;->b:LGl;

    iget-object v2, v2, LGl;->q:Lfn;

    iget-object v2, v2, Lfn;->a:LI0;

    iget-object v2, v2, LI0;->a:Lgf;

    iget-object v2, v2, Lgf;->e:Ljava/lang/String;

    invoke-static {v1, v2}, LTf;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/2addr v1, v7

    if-nez v1, :cond_b

    goto :goto_1

    :cond_b
    iget-object p2, p2, Lsb;->b:LGl;

    monitor-enter p2

    :try_start_0
    iput-boolean v7, p2, LGl;->j:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p2

    iget-object p1, p1, Ldn;->a:LT1;

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p2

    throw p1

    :cond_c
    :goto_1
    return-object v0

    :cond_d
    iget-object p1, p0, LJ4;->b:Ljava/lang/Object;

    check-cast p1, LPj;

    iget-object p1, p1, LPj;->g:Lpa;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v0

    :cond_e
    :pswitch_0
    iget-object p2, p0, LJ4;->b:Ljava/lang/Object;

    check-cast p2, LPj;

    iget-boolean v1, p2, LPj;->h:Z

    if-nez v1, :cond_f

    goto/16 :goto_5

    :cond_f
    const-string v1, "Location"

    invoke-static {p1, v1}, Ldn;->n(Ldn;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_18

    iget-object v2, p1, Ldn;->a:LT1;

    iget-object v8, v2, LT1;->c:Ljava/lang/Object;

    check-cast v8, Lgf;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_1
    new-instance v9, Lff;

    invoke-direct {v9}, Lff;-><init>()V

    invoke-virtual {v9, v8, v1}, Lff;->d(Lgf;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-object v9, v0

    :goto_2
    if-eqz v9, :cond_10

    invoke-virtual {v9}, Lff;->a()Lgf;

    move-result-object v1

    goto :goto_3

    :cond_10
    move-object v1, v0

    :goto_3
    if-eqz v1, :cond_18

    iget-object v8, v2, LT1;->c:Ljava/lang/Object;

    check-cast v8, Lgf;

    iget-object v8, v8, Lgf;->b:Ljava/lang/String;

    iget-object v9, v1, Lgf;->b:Ljava/lang/String;

    invoke-static {v9, v8}, LTf;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_11

    iget-boolean p2, p2, LPj;->i:Z

    if-nez p2, :cond_11

    goto :goto_5

    :cond_11
    invoke-virtual {v2}, LT1;->e()LH0;

    move-result-object p2

    invoke-static {v3}, LBr;->W(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_16

    const-string v8, "PROPFIND"

    invoke-virtual {v3, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v9

    iget p1, p1, Ldn;->d:I

    if-nez v9, :cond_12

    if-eq p1, v5, :cond_12

    if-ne p1, v6, :cond_13

    :cond_12
    move v4, v7

    :cond_13
    invoke-virtual {v3, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    xor-int/2addr v7, v8

    if-eqz v7, :cond_14

    if-eq p1, v5, :cond_14

    if-eq p1, v6, :cond_14

    const-string p1, "GET"

    invoke-virtual {p2, p1, v0}, LH0;->j(Ljava/lang/String;Lbb;)V

    goto :goto_4

    :cond_14
    if-eqz v4, :cond_15

    iget-object p1, v2, LT1;->f:Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, Lbb;

    :cond_15
    invoke-virtual {p2, v3, v0}, LH0;->j(Ljava/lang/String;Lbb;)V

    :goto_4
    if-nez v4, :cond_16

    const-string p1, "Transfer-Encoding"

    iget-object v0, p2, LH0;->d:Ljava/lang/Object;

    check-cast v0, LYa;

    invoke-virtual {v0, p1}, LYa;->e(Ljava/lang/String;)V

    const-string p1, "Content-Length"

    iget-object v0, p2, LH0;->d:Ljava/lang/Object;

    check-cast v0, LYa;

    invoke-virtual {v0, p1}, LYa;->e(Ljava/lang/String;)V

    const-string p1, "Content-Type"

    iget-object v0, p2, LH0;->d:Ljava/lang/Object;

    check-cast v0, LYa;

    invoke-virtual {v0, p1}, LYa;->e(Ljava/lang/String;)V

    :cond_16
    iget-object p1, v2, LT1;->c:Ljava/lang/Object;

    check-cast p1, Lgf;

    invoke-static {p1, v1}, LRr;->a(Lgf;Lgf;)Z

    move-result p1

    if-nez p1, :cond_17

    const-string p1, "Authorization"

    iget-object v0, p2, LH0;->d:Ljava/lang/Object;

    check-cast v0, LYa;

    invoke-virtual {v0, p1}, LYa;->e(Ljava/lang/String;)V

    :cond_17
    iput-object v1, p2, LH0;->b:Ljava/lang/Object;

    invoke-virtual {p2}, LH0;->a()LT1;

    move-result-object v0

    :cond_18
    :goto_5
    return-object v0

    :pswitch_data_0
    .packed-switch 0x12c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public c(Ljava/io/IOException;LDl;LT1;Z)Z
    .locals 3

    iget-object p3, p0, LJ4;->b:Ljava/lang/Object;

    check-cast p3, LPj;

    iget-boolean p3, p3, LPj;->f:Z

    const/4 v0, 0x0

    if-nez p3, :cond_0

    return v0

    :cond_0
    if-eqz p4, :cond_1

    instance-of p3, p1, Ljava/io/FileNotFoundException;

    if-eqz p3, :cond_1

    return v0

    :cond_1
    instance-of p3, p1, Ljava/net/ProtocolException;

    if-eqz p3, :cond_2

    goto :goto_0

    :cond_2
    instance-of p3, p1, Ljava/io/InterruptedIOException;

    if-eqz p3, :cond_3

    instance-of p1, p1, Ljava/net/SocketTimeoutException;

    if-eqz p1, :cond_5

    if-nez p4, :cond_5

    goto :goto_1

    :cond_3
    instance-of p3, p1, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz p3, :cond_4

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p3

    instance-of p3, p3, Ljava/security/cert/CertificateException;

    if-eqz p3, :cond_4

    goto :goto_0

    :cond_4
    instance-of p1, p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    if-eqz p1, :cond_6

    :cond_5
    :goto_0
    return v0

    :cond_6
    :goto_1
    iget-object p1, p2, LDl;->f:Lub;

    invoke-static {p1}, LTf;->f(Ljava/lang/Object;)V

    iget p2, p1, Lub;->c:I

    const/4 p3, 0x1

    if-nez p2, :cond_7

    iget p4, p1, Lub;->d:I

    if-nez p4, :cond_7

    iget p4, p1, Lub;->e:I

    if-nez p4, :cond_7

    move p1, v0

    goto :goto_4

    :cond_7
    iget-object p4, p1, Lub;->f:Lfn;

    if-eqz p4, :cond_9

    :cond_8
    :goto_2
    move p1, p3

    goto :goto_4

    :cond_9
    const/4 p4, 0x0

    if-gt p2, p3, :cond_d

    iget p2, p1, Lub;->d:I

    if-gt p2, p3, :cond_d

    iget p2, p1, Lub;->e:I

    if-lez p2, :cond_a

    goto :goto_3

    :cond_a
    iget-object p2, p1, Lub;->i:LDl;

    iget-object p2, p2, LDl;->g:LGl;

    if-eqz p2, :cond_d

    monitor-enter p2

    :try_start_0
    iget v1, p2, LGl;->k:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_b

    monitor-exit p2

    goto :goto_3

    :cond_b
    :try_start_1
    iget-object v1, p2, LGl;->q:Lfn;

    iget-object v1, v1, Lfn;->a:LI0;

    iget-object v1, v1, LI0;->a:Lgf;

    iget-object v2, p1, Lub;->h:LI0;

    iget-object v2, v2, LI0;->a:Lgf;

    invoke-static {v1, v2}, LRr;->a(Lgf;Lgf;)Z

    move-result v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v1, :cond_c

    monitor-exit p2

    goto :goto_3

    :cond_c
    :try_start_2
    iget-object p4, p2, LGl;->q:Lfn;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p2

    goto :goto_3

    :catchall_0
    move-exception p1

    monitor-exit p2

    throw p1

    :cond_d
    :goto_3
    if-eqz p4, :cond_e

    iput-object p4, p1, Lub;->f:Lfn;

    goto :goto_2

    :cond_e
    iget-object p2, p1, Lub;->a:LQ0;

    if-eqz p2, :cond_f

    invoke-virtual {p2}, LQ0;->c()Z

    move-result p2

    if-ne p2, p3, :cond_f

    goto :goto_2

    :cond_f
    iget-object p1, p1, Lub;->b:Lff;

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lff;->c()Z

    move-result p1

    :goto_4
    if-nez p1, :cond_10

    return v0

    :cond_10
    return p3
.end method
