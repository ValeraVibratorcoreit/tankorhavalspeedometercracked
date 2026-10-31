.class public final Lub;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LQ0;

.field public b:Lff;

.field public c:I

.field public d:I

.field public e:I

.field public f:Lfn;

.field public final g:LHl;

.field public final h:LI0;

.field public final i:LDl;

.field public final j:Lpa;


# direct methods
.method public constructor <init>(LHl;LI0;LDl;)V
    .locals 2

    sget-object v0, Lpa;->e:Lpa;

    const-string v1, "connectionPool"

    invoke-static {v1, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "call"

    invoke-static {v1, p3}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lub;->g:LHl;

    iput-object p2, p0, Lub;->h:LI0;

    iput-object p3, p0, Lub;->i:LDl;

    iput-object v0, p0, Lub;->j:Lpa;

    return-void
.end method


# virtual methods
.method public final a(IIIZZ)LGl;
    .locals 13

    move-object v1, p0

    const/4 v0, 0x1

    :goto_0
    iget-object v2, v1, Lub;->i:LDl;

    iget-boolean v2, v2, LDl;->m:Z

    if-nez v2, :cond_25

    iget-object v2, v1, Lub;->i:LDl;

    iget-object v2, v2, LDl;->g:LGl;

    const/4 v3, 0x0

    if-eqz v2, :cond_5

    monitor-enter v2

    :try_start_0
    iget-boolean v4, v2, LGl;->i:Z

    if-nez v4, :cond_1

    iget-object v4, v2, LGl;->q:Lfn;

    iget-object v4, v4, Lfn;->a:LI0;

    iget-object v4, v4, LI0;->a:Lgf;

    invoke-virtual {p0, v4}, Lub;->b(Lgf;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    move-object v4, v3

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_4

    :cond_1
    :goto_1
    iget-object v4, v1, Lub;->i:LDl;

    invoke-virtual {v4}, LDl;->h()Ljava/net/Socket;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    monitor-exit v2

    iget-object v5, v1, Lub;->i:LDl;

    iget-object v5, v5, LDl;->g:LGl;

    if-eqz v5, :cond_3

    if-nez v4, :cond_2

    :goto_3
    move/from16 v3, p5

    goto/16 :goto_10

    :cond_2
    const-string v0, "Check failed."

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_3
    if-eqz v4, :cond_4

    invoke-static {v4}, LRr;->e(Ljava/net/Socket;)V

    :cond_4
    iget-object v2, v1, Lub;->j:Lpa;

    iget-object v4, v1, Lub;->i:LDl;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "call"

    invoke-static {v2, v4}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_5

    :goto_4
    monitor-exit v2

    throw v0

    :cond_5
    :goto_5
    const/4 v2, 0x0

    iput v2, v1, Lub;->c:I

    iput v2, v1, Lub;->d:I

    iput v2, v1, Lub;->e:I

    iget-object v4, v1, Lub;->g:LHl;

    iget-object v5, v1, Lub;->h:LI0;

    iget-object v6, v1, Lub;->i:LDl;

    invoke-virtual {v4, v5, v6, v3, v2}, LHl;->a(LI0;LDl;Ljava/util/ArrayList;Z)Z

    move-result v4

    if-eqz v4, :cond_6

    iget-object v2, v1, Lub;->i:LDl;

    iget-object v2, v2, LDl;->g:LGl;

    invoke-static {v2}, LTf;->f(Ljava/lang/Object;)V

    iget-object v3, v1, Lub;->j:Lpa;

    iget-object v4, v1, Lub;->i:LDl;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "call"

    invoke-static {v3, v4}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_3

    :cond_6
    iget-object v4, v1, Lub;->f:Lfn;

    if-eqz v4, :cond_7

    iput-object v3, v1, Lub;->f:Lfn;

    :goto_6
    move-object v5, v3

    goto/16 :goto_f

    :cond_7
    iget-object v4, v1, Lub;->a:LQ0;

    if-eqz v4, :cond_9

    invoke-virtual {v4}, LQ0;->c()Z

    move-result v4

    if-eqz v4, :cond_9

    iget-object v2, v1, Lub;->a:LQ0;

    invoke-static {v2}, LTf;->f(Ljava/lang/Object;)V

    invoke-virtual {v2}, LQ0;->c()Z

    move-result v4

    if-eqz v4, :cond_8

    iget v4, v2, LQ0;->a:I

    add-int/lit8 v5, v4, 0x1

    iput v5, v2, LQ0;->a:I

    iget-object v2, v2, LQ0;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lfn;

    goto :goto_6

    :cond_8
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :cond_9
    iget-object v4, v1, Lub;->b:Lff;

    if-nez v4, :cond_a

    new-instance v4, Lff;

    iget-object v5, v1, Lub;->h:LI0;

    iget-object v6, v1, Lub;->i:LDl;

    iget-object v7, v6, LDl;->p:LPj;

    iget-object v7, v7, LPj;->y:LVi;

    iget-object v8, v1, Lub;->j:Lpa;

    invoke-direct {v4, v5, v7, v6, v8}, Lff;-><init>(LI0;LVi;LDl;Lpa;)V

    iput-object v4, v1, Lub;->b:Lff;

    :cond_a
    invoke-virtual {v4}, Lff;->c()Z

    move-result v5

    if-eqz v5, :cond_24

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    :cond_b
    iget v6, v4, Lff;->b:I

    iget-object v7, v4, Lff;->d:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-ge v6, v7, :cond_18

    iget v6, v4, Lff;->b:I

    iget-object v7, v4, Lff;->d:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-ge v6, v7, :cond_c

    move v6, v0

    goto :goto_7

    :cond_c
    move v6, v2

    :goto_7
    iget-object v7, v4, Lff;->f:Ljava/lang/Object;

    check-cast v7, LI0;

    const-string v8, "No route to "

    if-eqz v6, :cond_17

    iget-object v6, v4, Lff;->d:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    iget v9, v4, Lff;->b:I

    add-int/lit8 v10, v9, 0x1

    iput v10, v4, Lff;->b:I

    invoke-interface {v6, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/net/Proxy;

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    iput-object v9, v4, Lff;->e:Ljava/lang/Object;

    invoke-virtual {v6}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v10

    sget-object v11, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v10, v11, :cond_10

    invoke-virtual {v6}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v10

    sget-object v11, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    if-ne v10, v11, :cond_d

    goto :goto_9

    :cond_d
    invoke-virtual {v6}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object v10

    instance-of v11, v10, Ljava/net/InetSocketAddress;

    if-eqz v11, :cond_f

    check-cast v10, Ljava/net/InetSocketAddress;

    const-string v11, "$this$socketHost"

    invoke-static {v11, v10}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v10}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v11

    if-eqz v11, :cond_e

    invoke-virtual {v11}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    move-result-object v11

    const-string v12, "address.hostAddress"

    invoke-static {v12, v11}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_8

    :cond_e
    invoke-virtual {v10}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    move-result-object v11

    const-string v12, "hostName"

    invoke-static {v12, v11}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_8
    invoke-virtual {v10}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v10

    goto :goto_a

    :cond_f
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Proxy.address() is not an InetSocketAddress: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_10
    :goto_9
    iget-object v10, v7, LI0;->a:Lgf;

    iget-object v11, v10, Lgf;->e:Ljava/lang/String;

    iget v10, v10, Lgf;->f:I

    :goto_a
    if-gt v0, v10, :cond_16

    const v12, 0xffff

    if-lt v12, v10, :cond_16

    invoke-virtual {v6}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v8

    sget-object v12, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    if-ne v8, v12, :cond_11

    invoke-static {v11, v10}, Ljava/net/InetSocketAddress;->createUnresolved(Ljava/lang/String;I)Ljava/net/InetSocketAddress;

    move-result-object v7

    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :cond_11
    iget-object v8, v4, Lff;->i:Ljava/lang/Object;

    check-cast v8, Lpa;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v8, v4, Lff;->h:Ljava/lang/Object;

    check-cast v8, LDl;

    const-string v12, "call"

    invoke-static {v12, v8}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v8, "domainName"

    invoke-static {v8, v11}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v8, v7, LI0;->d:Lpa;

    invoke-virtual {v8, v11}, Lpa;->B(Ljava/lang/String;)Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_15

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_b
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_12

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/net/InetAddress;

    new-instance v11, Ljava/net/InetSocketAddress;

    invoke-direct {v11, v8, v10}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    invoke-virtual {v9, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_12
    :goto_c
    iget-object v7, v4, Lff;->e:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_d
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_14

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/net/InetSocketAddress;

    new-instance v9, Lfn;

    iget-object v10, v4, Lff;->f:Ljava/lang/Object;

    check-cast v10, LI0;

    invoke-direct {v9, v10, v6, v8}, Lfn;-><init>(LI0;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V

    iget-object v8, v4, Lff;->g:Ljava/lang/Object;

    check-cast v8, LVi;

    monitor-enter v8

    :try_start_1
    iget-object v10, v8, LVi;->a:Ljava/lang/Object;

    check-cast v10, Ljava/util/LinkedHashSet;

    invoke-interface {v10, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit v8

    if-eqz v10, :cond_13

    iget-object v8, v4, Lff;->c:Ljava/util/ArrayList;

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :cond_13
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :catchall_1
    move-exception v0

    monitor-exit v8

    throw v0

    :cond_14
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    xor-int/2addr v6, v0

    if-eqz v6, :cond_b

    goto :goto_e

    :cond_15
    new-instance v0, Ljava/net/UnknownHostException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v7, LI0;->d:Lpa;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " returned no addresses for "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_16
    new-instance v0, Ljava/net/SocketException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x3a

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "; port is out of range"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_17
    new-instance v0, Ljava/net/SocketException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, v7, LI0;->a:Lgf;

    iget-object v3, v3, Lgf;->e:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "; exhausted proxy configurations: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v4, Lff;->d:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_18
    :goto_e
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_19

    iget-object v6, v4, Lff;->c:Ljava/util/ArrayList;

    invoke-static {v5, v6}, Lq6;->v0(Ljava/util/ArrayList;Ljava/lang/Iterable;)V

    iget-object v4, v4, Lff;->c:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    :cond_19
    new-instance v4, LQ0;

    invoke-direct {v4, v5}, LQ0;-><init>(Ljava/util/ArrayList;)V

    iput-object v4, v1, Lub;->a:LQ0;

    iget-object v6, v1, Lub;->i:LDl;

    iget-boolean v6, v6, LDl;->m:Z

    if-nez v6, :cond_23

    iget-object v6, v1, Lub;->g:LHl;

    iget-object v7, v1, Lub;->h:LI0;

    iget-object v8, v1, Lub;->i:LDl;

    invoke-virtual {v6, v7, v8, v5, v2}, LHl;->a(LI0;LDl;Ljava/util/ArrayList;Z)Z

    move-result v2

    if-eqz v2, :cond_1a

    iget-object v2, v1, Lub;->i:LDl;

    iget-object v2, v2, LDl;->g:LGl;

    invoke-static {v2}, LTf;->f(Ljava/lang/Object;)V

    iget-object v3, v1, Lub;->j:Lpa;

    iget-object v4, v1, Lub;->i:LDl;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "call"

    invoke-static {v3, v4}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1a
    invoke-virtual {v4}, LQ0;->c()Z

    move-result v2

    if-eqz v2, :cond_22

    iget v2, v4, LQ0;->a:I

    add-int/lit8 v6, v2, 0x1

    iput v6, v4, LQ0;->a:I

    invoke-interface {v5, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lfn;

    :goto_f
    new-instance v2, LGl;

    iget-object v6, v1, Lub;->g:LHl;

    invoke-direct {v2, v6, v4}, LGl;-><init>(LHl;Lfn;)V

    iget-object v6, v1, Lub;->i:LDl;

    iput-object v2, v6, LDl;->o:LGl;

    :try_start_2
    iget-object v11, v1, Lub;->i:LDl;

    iget-object v12, v1, Lub;->j:Lpa;

    move-object v6, v2

    move v7, p1

    move v8, p2

    move/from16 v9, p3

    move/from16 v10, p4

    invoke-virtual/range {v6 .. v12}, LGl;->c(IIIZLDl;Lpa;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    iget-object v6, v1, Lub;->i:LDl;

    iput-object v3, v6, LDl;->o:LGl;

    iget-object v3, v1, Lub;->i:LDl;

    iget-object v3, v3, LDl;->p:LPj;

    iget-object v3, v3, LPj;->y:LVi;

    monitor-enter v3

    :try_start_3
    iget-object v6, v3, LVi;->a:Ljava/lang/Object;

    check-cast v6, Ljava/util/LinkedHashSet;

    invoke-interface {v6, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    monitor-exit v3

    iget-object v3, v1, Lub;->g:LHl;

    iget-object v6, v1, Lub;->h:LI0;

    iget-object v7, v1, Lub;->i:LDl;

    invoke-virtual {v3, v6, v7, v5, v0}, LHl;->a(LI0;LDl;Ljava/util/ArrayList;Z)Z

    move-result v3

    if-eqz v3, :cond_1b

    iget-object v3, v1, Lub;->i:LDl;

    iget-object v3, v3, LDl;->g:LGl;

    invoke-static {v3}, LTf;->f(Ljava/lang/Object;)V

    iput-object v4, v1, Lub;->f:Lfn;

    iget-object v2, v2, LGl;->c:Ljava/net/Socket;

    invoke-static {v2}, LTf;->f(Ljava/lang/Object;)V

    invoke-static {v2}, LRr;->e(Ljava/net/Socket;)V

    iget-object v2, v1, Lub;->j:Lpa;

    iget-object v4, v1, Lub;->i:LDl;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "call"

    invoke-static {v2, v4}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    move-object v2, v3

    goto/16 :goto_3

    :cond_1b
    monitor-enter v2

    :try_start_4
    iget-object v3, v1, Lub;->g:LHl;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, LRr;->a:[B

    iget-object v4, v3, LHl;->d:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v4, v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    iget-object v4, v3, LHl;->b:Ljq;

    iget-object v3, v3, LHl;->c:LRe;

    const-wide/16 v5, 0x0

    invoke-virtual {v4, v3, v5, v6}, Ljq;->c(Liq;J)V

    iget-object v3, v1, Lub;->i:LDl;

    invoke-virtual {v3, v2}, LDl;->a(LGl;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    monitor-exit v2

    iget-object v3, v1, Lub;->j:Lpa;

    iget-object v4, v1, Lub;->i:LDl;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "call"

    invoke-static {v3, v4}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_3

    :goto_10
    invoke-virtual {v2, v3}, LGl;->i(Z)Z

    move-result v4

    if-eqz v4, :cond_1c

    return-object v2

    :cond_1c
    invoke-virtual {v2}, LGl;->k()V

    iget-object v2, v1, Lub;->f:Lfn;

    if-eqz v2, :cond_1d

    goto/16 :goto_0

    :cond_1d
    iget-object v2, v1, Lub;->a:LQ0;

    if-eqz v2, :cond_1e

    invoke-virtual {v2}, LQ0;->c()Z

    move-result v2

    goto :goto_11

    :cond_1e
    move v2, v0

    :goto_11
    if-eqz v2, :cond_1f

    goto/16 :goto_0

    :cond_1f
    iget-object v2, v1, Lub;->b:Lff;

    if-eqz v2, :cond_20

    invoke-virtual {v2}, Lff;->c()Z

    move-result v2

    goto :goto_12

    :cond_20
    move v2, v0

    :goto_12
    if-eqz v2, :cond_21

    goto/16 :goto_0

    :cond_21
    new-instance v0, Ljava/io/IOException;

    const-string v2, "exhausted all routes"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_2
    move-exception v0

    monitor-exit v2

    throw v0

    :catchall_3
    move-exception v0

    monitor-exit v3

    throw v0

    :catchall_4
    move-exception v0

    iget-object v2, v1, Lub;->i:LDl;

    iput-object v3, v2, LDl;->o:LGl;

    throw v0

    :cond_22
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :cond_23
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Canceled"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_24
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :cond_25
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Canceled"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b(Lgf;)Z
    .locals 3

    const-string v0, "url"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, Lub;->h:LI0;

    iget-object v0, v0, LI0;->a:Lgf;

    iget v1, v0, Lgf;->f:I

    iget v2, p1, Lgf;->f:I

    if-ne v2, v1, :cond_0

    iget-object p1, p1, Lgf;->e:Ljava/lang/String;

    iget-object v0, v0, Lgf;->e:Ljava/lang/String;

    invoke-static {p1, v0}, LTf;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final c(Ljava/io/IOException;)V
    .locals 2

    const-string v0, "e"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lub;->f:Lfn;

    instance-of v0, p1, LBp;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LBp;

    const/16 v1, 0x8

    iget v0, v0, LBp;->a:I

    if-ne v0, v1, :cond_0

    iget p1, p0, Lub;->c:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lub;->c:I

    goto :goto_0

    :cond_0
    instance-of p1, p1, LV6;

    if-eqz p1, :cond_1

    iget p1, p0, Lub;->d:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lub;->d:I

    goto :goto_0

    :cond_1
    iget p1, p0, Lub;->e:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lub;->e:I

    :goto_0
    return-void
.end method
