.class public final LGl;
.super LKe;
.source "SourceFile"


# instance fields
.field public b:Ljava/net/Socket;

.field public c:Ljava/net/Socket;

.field public d:Loe;

.field public e:Lil;

.field public f:LTe;

.field public g:LBl;

.field public h:LAl;

.field public i:Z

.field public j:Z

.field public k:I

.field public l:I

.field public m:I

.field public n:I

.field public final o:Ljava/util/ArrayList;

.field public p:J

.field public final q:Lfn;


# direct methods
.method public constructor <init>(LHl;Lfn;)V
    .locals 1

    const-string v0, "connectionPool"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string p1, "route"

    invoke-static {p1, p2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LGl;->q:Lfn;

    const/4 p1, 0x1

    iput p1, p0, LGl;->n:I

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LGl;->o:Ljava/util/ArrayList;

    const-wide p1, 0x7fffffffffffffffL

    iput-wide p1, p0, LGl;->p:J

    return-void
.end method

.method public static d(LPj;Lfn;Ljava/io/IOException;)V
    .locals 3

    const-string v0, "client"

    invoke-static {v0, p0}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "failedRoute"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "failure"

    invoke-static {v0, p2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p1, Lfn;->b:Ljava/net/Proxy;

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v0, v1, :cond_0

    iget-object v0, p1, Lfn;->a:LI0;

    iget-object v1, v0, LI0;->j:Ljava/net/ProxySelector;

    iget-object v0, v0, LI0;->a:Lgf;

    invoke-virtual {v0}, Lgf;->f()Ljava/net/URI;

    move-result-object v0

    iget-object v2, p1, Lfn;->b:Ljava/net/Proxy;

    invoke-virtual {v2}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object v2

    invoke-virtual {v1, v0, v2, p2}, Ljava/net/ProxySelector;->connectFailed(Ljava/net/URI;Ljava/net/SocketAddress;Ljava/io/IOException;)V

    :cond_0
    iget-object p0, p0, LPj;->y:LVi;

    monitor-enter p0

    :try_start_0
    iget-object p2, p0, LVi;->a:Ljava/lang/Object;

    check-cast p2, Ljava/util/LinkedHashSet;

    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public final declared-synchronized a(LTe;Lco;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "connection"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string p1, "settings"

    invoke-static {p1, p2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iget p1, p2, Lco;->a:I

    and-int/lit8 p1, p1, 0x10

    if-eqz p1, :cond_0

    iget-object p1, p2, Lco;->b:[I

    const/4 p2, 0x4

    aget p1, p1, p2

    goto :goto_0

    :cond_0
    const p1, 0x7fffffff

    :goto_0
    iput p1, p0, LGl;->n:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final b(Laf;)V
    .locals 2

    const-string v0, "stream"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const/16 v0, 0x8

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Laf;->c(ILjava/io/IOException;)V

    return-void
.end method

.method public final c(IIIZLDl;Lpa;)V
    .locals 14

    move-object v7, p0

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    const-string v10, "inetSocketAddress"

    const-string v0, "call"

    invoke-static {v0, v8}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "eventListener"

    invoke-static {v0, v9}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, v7, LGl;->e:Lil;

    if-nez v0, :cond_d

    iget-object v0, v7, LGl;->q:Lfn;

    iget-object v0, v0, Lfn;->a:LI0;

    iget-object v0, v0, LI0;->c:Ljava/util/List;

    new-instance v11, LY6;

    invoke-direct {v11, v0}, LY6;-><init>(Ljava/util/List;)V

    iget-object v1, v7, LGl;->q:Lfn;

    iget-object v1, v1, Lfn;->a:LI0;

    iget-object v2, v1, LI0;->f:Ljavax/net/ssl/SSLSocketFactory;

    if-nez v2, :cond_2

    sget-object v1, LX6;->f:LX6;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, v7, LGl;->q:Lfn;

    iget-object v0, v0, Lfn;->a:LI0;

    iget-object v0, v0, LI0;->a:Lgf;

    iget-object v0, v0, Lgf;->e:Ljava/lang/String;

    sget-object v1, LGk;->a:LGk;

    sget-object v1, LGk;->a:LGk;

    invoke-virtual {v1, v0}, LGk;->h(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lgn;

    new-instance v2, Ljava/net/UnknownServiceException;

    const-string v3, "CLEARTEXT communication to "

    const-string v4, " not permitted by network security policy"

    invoke-static {v3, v0, v4}, LVo;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lgn;-><init>(Ljava/io/IOException;)V

    throw v1

    :cond_1
    new-instance v0, Lgn;

    new-instance v1, Ljava/net/UnknownServiceException;

    const-string v2, "CLEARTEXT communication not enabled for client"

    invoke-direct {v1, v2}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lgn;-><init>(Ljava/io/IOException;)V

    throw v0

    :cond_2
    iget-object v0, v1, LI0;->b:Ljava/util/List;

    sget-object v1, Lil;->f:Lil;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    :goto_0
    const/4 v12, 0x0

    move-object v13, v12

    :goto_1
    :try_start_0
    iget-object v0, v7, LGl;->q:Lfn;

    iget-object v1, v0, Lfn;->a:LI0;

    iget-object v1, v1, LI0;->f:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v1, :cond_4

    iget-object v0, v0, Lfn;->b:Ljava/net/Proxy;

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne v0, v1, :cond_4

    move-object v1, p0

    move v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    invoke-virtual/range {v1 .. v6}, LGl;->f(IIILDl;Lpa;)V

    iget-object v0, v7, LGl;->b:Ljava/net/Socket;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    move v1, p1

    move/from16 v2, p2

    goto :goto_2

    :catch_0
    move-exception v0

    move v1, p1

    move/from16 v2, p2

    goto :goto_5

    :cond_4
    move v1, p1

    move/from16 v2, p2

    :try_start_1
    invoke-virtual {p0, p1, v2, v8, v9}, LGl;->e(IILDl;Lpa;)V

    :goto_2
    invoke-virtual {p0, v11, v8, v9}, LGl;->g(LY6;LDl;Lpa;)V

    iget-object v0, v7, LGl;->q:Lfn;

    iget-object v0, v0, Lfn;->c:Ljava/net/InetSocketAddress;

    invoke-static {v10, v0}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_3
    iget-object v0, v7, LGl;->q:Lfn;

    iget-object v1, v0, Lfn;->a:LI0;

    iget-object v1, v1, LI0;->f:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v1, :cond_6

    iget-object v0, v0, Lfn;->b:Ljava/net/Proxy;

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne v0, v1, :cond_6

    iget-object v0, v7, LGl;->b:Ljava/net/Socket;

    if-eqz v0, :cond_5

    goto :goto_4

    :cond_5
    new-instance v0, Lgn;

    new-instance v1, Ljava/net/ProtocolException;

    const-string v2, "Too many tunnel connections attempted: 21"

    invoke-direct {v1, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lgn;-><init>(Ljava/io/IOException;)V

    throw v0

    :cond_6
    :goto_4
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, v7, LGl;->p:J

    return-void

    :catch_1
    move-exception v0

    :goto_5
    iget-object v3, v7, LGl;->c:Ljava/net/Socket;

    if-eqz v3, :cond_7

    invoke-static {v3}, LRr;->e(Ljava/net/Socket;)V

    :cond_7
    iget-object v3, v7, LGl;->b:Ljava/net/Socket;

    if-eqz v3, :cond_8

    invoke-static {v3}, LRr;->e(Ljava/net/Socket;)V

    :cond_8
    iput-object v12, v7, LGl;->c:Ljava/net/Socket;

    iput-object v12, v7, LGl;->b:Ljava/net/Socket;

    iput-object v12, v7, LGl;->g:LBl;

    iput-object v12, v7, LGl;->h:LAl;

    iput-object v12, v7, LGl;->d:Loe;

    iput-object v12, v7, LGl;->e:Lil;

    iput-object v12, v7, LGl;->f:LTe;

    const/4 v3, 0x1

    iput v3, v7, LGl;->n:I

    iget-object v4, v7, LGl;->q:Lfn;

    iget-object v5, v4, Lfn;->c:Ljava/net/InetSocketAddress;

    iget-object v4, v4, Lfn;->b:Ljava/net/Proxy;

    invoke-static {v10, v5}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v5, "proxy"

    invoke-static {v5, v4}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    if-nez v13, :cond_9

    new-instance v13, Lgn;

    invoke-direct {v13, v0}, Lgn;-><init>(Ljava/io/IOException;)V

    goto :goto_6

    :cond_9
    iget-object v4, v13, Lgn;->b:Ljava/io/IOException;

    invoke-static {v4, v0}, LF4;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    iput-object v0, v13, Lgn;->a:Ljava/io/IOException;

    :goto_6
    if-eqz p4, :cond_b

    iput-boolean v3, v11, LY6;->c:Z

    iget-boolean v3, v11, LY6;->b:Z

    if-eqz v3, :cond_b

    instance-of v3, v0, Ljava/net/ProtocolException;

    if-nez v3, :cond_b

    instance-of v3, v0, Ljava/io/InterruptedIOException;

    if-nez v3, :cond_b

    instance-of v3, v0, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz v3, :cond_a

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    instance-of v3, v3, Ljava/security/cert/CertificateException;

    if-nez v3, :cond_b

    :cond_a
    instance-of v3, v0, Ljavax/net/ssl/SSLPeerUnverifiedException;

    if-nez v3, :cond_b

    instance-of v0, v0, Ljavax/net/ssl/SSLException;

    if-eqz v0, :cond_b

    goto/16 :goto_1

    :cond_b
    throw v13

    :cond_c
    new-instance v0, Lgn;

    new-instance v1, Ljava/net/UnknownServiceException;

    const-string v2, "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"

    invoke-direct {v1, v2}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lgn;-><init>(Ljava/io/IOException;)V

    throw v0

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "already connected"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e(IILDl;Lpa;)V
    .locals 4

    iget-object v0, p0, LGl;->q:Lfn;

    iget-object v1, v0, Lfn;->b:Ljava/net/Proxy;

    iget-object v0, v0, Lfn;->a:LI0;

    invoke-virtual {v1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    sget-object v3, LEl;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_1

    const/4 v3, 0x2

    if-eq v2, v3, :cond_1

    :goto_0
    new-instance v0, Ljava/net/Socket;

    invoke-direct {v0, v1}, Ljava/net/Socket;-><init>(Ljava/net/Proxy;)V

    goto :goto_1

    :cond_1
    iget-object v0, v0, LI0;->e:Ljavax/net/SocketFactory;

    invoke-virtual {v0}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    move-result-object v0

    invoke-static {v0}, LTf;->f(Ljava/lang/Object;)V

    :goto_1
    iput-object v0, p0, LGl;->b:Ljava/net/Socket;

    iget-object v1, p0, LGl;->q:Lfn;

    iget-object v1, v1, Lfn;->c:Ljava/net/InetSocketAddress;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p4, "call"

    invoke-static {p4, p3}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string p3, "inetSocketAddress"

    invoke-static {p3, v1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0, p2}, Ljava/net/Socket;->setSoTimeout(I)V

    :try_start_0
    sget-object p2, LGk;->a:LGk;

    sget-object p2, LGk;->a:LGk;

    iget-object p3, p0, LGl;->q:Lfn;

    iget-object p3, p3, Lfn;->c:Ljava/net/InetSocketAddress;

    invoke-virtual {p2, v0, p3, p1}, LGk;->e(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    :try_end_0
    .catch Ljava/net/ConnectException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-static {v0}, LTf;->Z(Ljava/net/Socket;)Lm3;

    move-result-object p1

    new-instance p2, LBl;

    invoke-direct {p2, p1}, LBl;-><init>(LXo;)V

    iput-object p2, p0, LGl;->g:LBl;

    invoke-static {v0}, LTf;->X(Ljava/net/Socket;)Ll3;

    move-result-object p1

    new-instance p2, LAl;

    invoke-direct {p2, p1}, LAl;-><init>(LMo;)V

    iput-object p2, p0, LGl;->h:LAl;
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    const-string p3, "throw with null exception"

    invoke-static {p2, p3}, LTf;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    :goto_2
    return-void

    :cond_2
    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    new-instance p2, Ljava/net/ConnectException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Failed to connect to "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p4, p0, LGl;->q:Lfn;

    iget-object p4, p4, Lfn;->c:Ljava/net/InetSocketAddress;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Ljava/net/ConnectException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw p2
.end method

.method public final f(IIILDl;Lpa;)V
    .locals 14

    move-object v0, p0

    move/from16 v1, p2

    new-instance v2, LH0;

    invoke-direct {v2}, LH0;-><init>()V

    iget-object v3, v0, LGl;->q:Lfn;

    iget-object v4, v3, Lfn;->a:LI0;

    iget-object v4, v4, LI0;->a:Lgf;

    const-string v5, "url"

    invoke-static {v5, v4}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v4, v2, LH0;->b:Ljava/lang/Object;

    const-string v4, "CONNECT"

    const/4 v5, 0x0

    invoke-virtual {v2, v4, v5}, LH0;->j(Ljava/lang/String;Lbb;)V

    iget-object v3, v3, Lfn;->a:LI0;

    iget-object v4, v3, LI0;->a:Lgf;

    const/4 v6, 0x1

    invoke-static {v4, v6}, LRr;->v(Lgf;Z)Ljava/lang/String;

    move-result-object v4

    const-string v7, "Host"

    invoke-virtual {v2, v7, v4}, LH0;->i(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "Proxy-Connection"

    const-string v7, "Keep-Alive"

    invoke-virtual {v2, v4, v7}, LH0;->i(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "User-Agent"

    const-string v7, "okhttp/4.9.1"

    invoke-virtual {v2, v4, v7}, LH0;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2}, LH0;->a()LT1;

    move-result-object v2

    new-instance v4, Lcn;

    invoke-direct {v4}, Lcn;-><init>()V

    iput-object v2, v4, Lcn;->a:LT1;

    sget-object v7, Lil;->c:Lil;

    iput-object v7, v4, Lcn;->b:Lil;

    const/16 v7, 0x197

    iput v7, v4, Lcn;->c:I

    const-string v8, "Preemptive Authenticate"

    iput-object v8, v4, Lcn;->d:Ljava/lang/String;

    sget-object v8, LRr;->c:LJl;

    iput-object v8, v4, Lcn;->g:LJl;

    const-wide/16 v8, -0x1

    iput-wide v8, v4, Lcn;->k:J

    iput-wide v8, v4, Lcn;->l:J

    iget-object v10, v4, Lcn;->f:LYa;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v11, "Proxy-Authenticate"

    invoke-static {v11}, LUd;->j(Ljava/lang/String;)V

    const-string v12, "OkHttp-Preemptive"

    invoke-static {v12, v11}, LUd;->m(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v10, v11}, LYa;->e(Ljava/lang/String;)V

    invoke-virtual {v10, v11, v12}, LYa;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4}, Lcn;->a()Ldn;

    iget-object v4, v3, LI0;->i:Lpa;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move v4, p1

    move-object/from16 v10, p4

    move-object/from16 v11, p5

    invoke-virtual {p0, p1, v1, v10, v11}, LGl;->e(IILDl;Lpa;)V

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v10, "CONNECT "

    invoke-direct {v4, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v10, v2, LT1;->c:Ljava/lang/Object;

    check-cast v10, Lgf;

    invoke-static {v10, v6}, LRr;->v(Lgf;Z)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " HTTP/1.1"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object v6, v0, LGl;->g:LBl;

    invoke-static {v6}, LTf;->f(Ljava/lang/Object;)V

    iget-object v10, v0, LGl;->h:LAl;

    invoke-static {v10}, LTf;->f(Ljava/lang/Object;)V

    new-instance v11, LGe;

    invoke-direct {v11, v5, p0, v6, v10}, LGe;-><init>(LPj;LGl;LP4;LO4;)V

    iget-object v5, v6, LBl;->c:LXo;

    invoke-interface {v5}, LXo;->b()LJq;

    move-result-object v5

    int-to-long v12, v1

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v5, v12, v13, v1}, LJq;->g(JLjava/util/concurrent/TimeUnit;)LJq;

    iget-object v5, v10, LAl;->c:LMo;

    invoke-interface {v5}, LMo;->b()LJq;

    move-result-object v5

    move/from16 v12, p3

    int-to-long v12, v12

    invoke-virtual {v5, v12, v13, v1}, LJq;->g(JLjava/util/concurrent/TimeUnit;)LJq;

    iget-object v5, v2, LT1;->e:Ljava/lang/Object;

    check-cast v5, Lse;

    invoke-virtual {v11, v5, v4}, LGe;->j(Lse;Ljava/lang/String;)V

    invoke-virtual {v11}, LGe;->d()V

    const/4 v4, 0x0

    invoke-virtual {v11, v4}, LGe;->f(Z)Lcn;

    move-result-object v4

    invoke-static {v4}, LTf;->f(Ljava/lang/Object;)V

    iput-object v2, v4, Lcn;->a:LT1;

    invoke-virtual {v4}, Lcn;->a()Ldn;

    move-result-object v2

    invoke-static {v2}, LRr;->k(Ldn;)J

    move-result-wide v4

    cmp-long v8, v4, v8

    if-nez v8, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v11, v4, v5}, LGe;->i(J)LDe;

    move-result-object v4

    const v5, 0x7fffffff

    invoke-static {v4, v5, v1}, LRr;->t(LXo;ILjava/util/concurrent/TimeUnit;)Z

    invoke-virtual {v4}, LDe;->close()V

    :goto_0
    const/16 v1, 0xc8

    iget v2, v2, Ldn;->d:I

    if-eq v2, v1, :cond_2

    if-ne v2, v7, :cond_1

    iget-object v1, v3, LI0;->i:Lpa;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ljava/io/IOException;

    const-string v2, "Failed to authenticate with proxy"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    new-instance v1, Ljava/io/IOException;

    const-string v3, "Unexpected response code for CONNECT: "

    invoke-static {v2, v3}, LVo;->e(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v6, LBl;->a:LL4;

    invoke-virtual {v1}, LL4;->p()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, v10, LAl;->a:LL4;

    invoke-virtual {v1}, LL4;->p()Z

    move-result v1

    if-eqz v1, :cond_3

    return-void

    :cond_3
    new-instance v1, Ljava/io/IOException;

    const-string v2, "TLS tunnel buffered too many bytes!"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final g(LY6;LDl;Lpa;)V
    .locals 12

    const/4 v0, 0x0

    const-string v1, "sha256/"

    iget-object v2, p0, LGl;->q:Lfn;

    iget-object v2, v2, Lfn;->a:LI0;

    iget-object v3, v2, LI0;->f:Ljavax/net/ssl/SSLSocketFactory;

    sget-object v4, Lil;->c:Lil;

    if-nez v3, :cond_1

    iget-object p1, v2, LI0;->b:Ljava/util/List;

    sget-object p2, Lil;->f:Lil;

    invoke-interface {p1, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, LGl;->b:Ljava/net/Socket;

    iput-object p1, p0, LGl;->c:Ljava/net/Socket;

    iput-object p2, p0, LGl;->e:Lil;

    invoke-virtual {p0}, LGl;->l()V

    return-void

    :cond_0
    iget-object p1, p0, LGl;->b:Ljava/net/Socket;

    iput-object p1, p0, LGl;->c:Ljava/net/Socket;

    iput-object v4, p0, LGl;->e:Lil;

    return-void

    :cond_1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p3, "call"

    invoke-static {p3, p2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string p2, "Hostname "

    const-string p3, "\n              |Hostname "

    iget-object v2, p0, LGl;->q:Lfn;

    iget-object v2, v2, Lfn;->a:LI0;

    iget-object v3, v2, LI0;->f:Ljavax/net/ssl/SSLSocketFactory;

    const/4 v5, 0x0

    :try_start_0
    invoke-static {v3}, LTf;->f(Ljava/lang/Object;)V

    iget-object v6, p0, LGl;->b:Ljava/net/Socket;

    iget-object v7, v2, LI0;->a:Lgf;

    iget-object v8, v7, Lgf;->e:Ljava/lang/String;

    iget v7, v7, Lgf;->f:I

    const/4 v9, 0x1

    invoke-virtual {v3, v6, v8, v7, v9}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object v3

    if-eqz v3, :cond_a

    check-cast v3, Ljavax/net/ssl/SSLSocket;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {p1, v3}, LY6;->a(Ljavax/net/ssl/SSLSocket;)LX6;

    move-result-object p1

    iget-boolean v6, p1, LX6;->b:Z

    if-eqz v6, :cond_2

    sget-object v6, LGk;->a:LGk;

    sget-object v6, LGk;->a:LGk;

    iget-object v7, v2, LI0;->a:Lgf;

    iget-object v7, v7, Lgf;->e:Ljava/lang/String;

    iget-object v8, v2, LI0;->b:Ljava/util/List;

    invoke-virtual {v6, v3, v7, v8}, LGk;->d(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    move-object v5, v3

    goto/16 :goto_1

    :cond_2
    :goto_0
    invoke-virtual {v3}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    invoke-virtual {v3}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v6

    const-string v7, "sslSocketSession"

    invoke-static {v7, v6}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v6}, LTd;->o(Ljavax/net/ssl/SSLSession;)Loe;

    move-result-object v7

    iget-object v8, v2, LI0;->g:Ljavax/net/ssl/HostnameVerifier;

    invoke-static {v8}, LTf;->f(Ljava/lang/Object;)V

    iget-object v10, v2, LI0;->a:Lgf;

    iget-object v10, v10, Lgf;->e:Ljava/lang/String;

    invoke-interface {v8, v10, v6}, Ljavax/net/ssl/HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    move-result v6

    if-nez v6, :cond_5

    invoke-virtual {v7}, Loe;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    xor-int/2addr v4, v9

    if-eqz v4, :cond_4

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_3

    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type java.security.cert.X509Certificate"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    check-cast p1, Ljava/security/cert/X509Certificate;

    new-instance p2, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p3, v2, LI0;->a:Lgf;

    iget-object p3, p3, Lgf;->e:Ljava/lang/String;

    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, " not verified:\n              |    certificate: "

    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p3, LD5;->c:LD5;

    sget-object p3, Le5;->d:Le5;

    invoke-virtual {p1}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object p3

    const-string v2, "publicKey"

    invoke-static {v2, p3}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {p3}, Ljava/security/Key;->getEncoded()[B

    move-result-object p3

    const-string v2, "publicKey.encoded"

    invoke-static {v2, p3}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v2, Le5;->d:Le5;

    array-length v2, p3

    array-length v5, p3

    int-to-long v6, v5

    int-to-long v8, v0

    int-to-long v10, v2

    invoke-static/range {v6 .. v11}, LTd;->d(JJJ)V

    new-instance v5, Le5;

    invoke-static {v0, v2, p3}, Lf3;->R(II[B)[B

    move-result-object p3

    invoke-direct {v5, p3}, Le5;-><init>([B)V

    new-instance p3, Le5;

    const-string v0, "SHA-256"

    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0

    iget-object v2, v5, Le5;->c:[B

    invoke-virtual {v0, v2}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v0

    const-string v2, "MessageDigest.getInstance(algorithm).digest(data)"

    invoke-static {v2, v0}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p3, v0}, Le5;-><init>([B)V

    invoke-virtual {p3}, Le5;->a()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v1, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "\n              |    DN: "

    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object p3

    const-string v0, "cert.subjectDN"

    invoke-static {v0, p3}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {p3}, Ljava/security/Principal;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "\n              |    subjectAltNames: "

    invoke-virtual {v4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 p3, 0x7

    invoke-static {p1, p3}, LNj;->a(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    move-result-object p3

    const/4 v0, 0x2

    invoke-static {p1, v0}, LNj;->a(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p3}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v2

    add-int/2addr v2, v1

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\n              "

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LFp;->B0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    new-instance p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p2, v2, LI0;->a:Lgf;

    iget-object p2, p2, Lgf;->e:Ljava/lang/String;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " not verified (no certificates)"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    iget-object p2, v2, LI0;->h:LD5;

    invoke-static {p2}, LTf;->f(Ljava/lang/Object;)V

    new-instance p3, Loe;

    iget-object v0, v7, Loe;->b:LPq;

    iget-object v1, v7, Loe;->c:LW5;

    iget-object v6, v7, Loe;->d:Ljava/util/List;

    new-instance v8, LFl;

    invoke-direct {v8, p2, v7, v2}, LFl;-><init>(LD5;Loe;LI0;)V

    invoke-direct {p3, v0, v1, v6, v8}, Loe;-><init>(LPq;LW5;Ljava/util/List;Ldd;)V

    iput-object p3, p0, LGl;->d:Loe;

    iget-object p3, v2, LI0;->a:Lgf;

    iget-object p3, p3, Lgf;->e:Ljava/lang/String;

    const-string v0, "hostname"

    invoke-static {v0, p3}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object p2, p2, LD5;->a:Ljava/util/Set;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-nez p3, :cond_9

    iget-boolean p1, p1, LX6;->b:Z

    if-eqz p1, :cond_6

    sget-object p1, LGk;->a:LGk;

    sget-object p1, LGk;->a:LGk;

    invoke-virtual {p1, v3}, LGk;->f(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    move-result-object v5

    :cond_6
    iput-object v3, p0, LGl;->c:Ljava/net/Socket;

    invoke-static {v3}, LTf;->Z(Ljava/net/Socket;)Lm3;

    move-result-object p1

    new-instance p2, LBl;

    invoke-direct {p2, p1}, LBl;-><init>(LXo;)V

    iput-object p2, p0, LGl;->g:LBl;

    invoke-static {v3}, LTf;->X(Ljava/net/Socket;)Ll3;

    move-result-object p1

    new-instance p2, LAl;

    invoke-direct {p2, p1}, LAl;-><init>(LMo;)V

    iput-object p2, p0, LGl;->h:LAl;

    if-eqz v5, :cond_7

    invoke-static {v5}, LF4;->A(Ljava/lang/String;)Lil;

    move-result-object v4

    :cond_7
    iput-object v4, p0, LGl;->e:Lil;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sget-object p1, LGk;->a:LGk;

    sget-object p1, LGk;->a:LGk;

    invoke-virtual {p1, v3}, LGk;->a(Ljavax/net/ssl/SSLSocket;)V

    iget-object p1, p0, LGl;->e:Lil;

    sget-object p2, Lil;->e:Lil;

    if-ne p1, p2, :cond_8

    invoke-virtual {p0}, LGl;->l()V

    :cond_8
    return-void

    :cond_9
    :try_start_2
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LVo;->l(Ljava/lang/Object;)V

    throw v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_1
    move-exception p1

    goto :goto_1

    :cond_a
    :try_start_3
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type javax.net.ssl.SSLSocket"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_1
    if-eqz v5, :cond_b

    sget-object p2, LGk;->a:LGk;

    sget-object p2, LGk;->a:LGk;

    invoke-virtual {p2, v5}, LGk;->a(Ljavax/net/ssl/SSLSocket;)V

    :cond_b
    if-eqz v5, :cond_c

    invoke-static {v5}, LRr;->e(Ljava/net/Socket;)V

    :cond_c
    throw p1
.end method

.method public final h(LI0;Ljava/util/ArrayList;)Z
    .locals 9

    const-string v0, "hostname"

    const-string v1, "address"

    invoke-static {v1, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v1, LRr;->a:[B

    iget-object v1, p0, LGl;->o:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    iget v2, p0, LGl;->n:I

    const/4 v3, 0x0

    if-ge v1, v2, :cond_b

    iget-boolean v1, p0, LGl;->i:Z

    if-eqz v1, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object v1, p0, LGl;->q:Lfn;

    iget-object v2, v1, Lfn;->a:LI0;

    invoke-virtual {v2, p1}, LI0;->a(LI0;)Z

    move-result v2

    if-nez v2, :cond_1

    return v3

    :cond_1
    iget-object v2, p1, LI0;->a:Lgf;

    iget-object v4, v2, Lgf;->e:Ljava/lang/String;

    iget-object v5, v1, Lfn;->a:LI0;

    iget-object v6, v5, LI0;->a:Lgf;

    iget-object v6, v6, Lgf;->e:Ljava/lang/String;

    invoke-static {v4, v6}, LTf;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const/4 v6, 0x1

    if-eqz v4, :cond_2

    return v6

    :cond_2
    iget-object v4, p0, LGl;->f:LTe;

    if-nez v4, :cond_3

    return v3

    :cond_3
    if-eqz p2, :cond_b

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_4

    goto/16 :goto_1

    :cond_4
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lfn;

    iget-object v7, v4, Lfn;->b:Ljava/net/Proxy;

    invoke-virtual {v7}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v7

    sget-object v8, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-ne v7, v8, :cond_5

    iget-object v7, v1, Lfn;->b:Ljava/net/Proxy;

    invoke-virtual {v7}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v7

    if-ne v7, v8, :cond_5

    iget-object v4, v4, Lfn;->c:Ljava/net/InetSocketAddress;

    iget-object v7, v1, Lfn;->c:Ljava/net/InetSocketAddress;

    invoke-static {v7, v4}, LTf;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    sget-object p2, LNj;->a:LNj;

    iget-object v1, p1, LI0;->g:Ljavax/net/ssl/HostnameVerifier;

    if-eq v1, p2, :cond_6

    return v3

    :cond_6
    sget-object p2, LRr;->a:[B

    iget-object p2, v5, LI0;->a:Lgf;

    iget v1, p2, Lgf;->f:I

    iget v4, v2, Lgf;->f:I

    if-eq v4, v1, :cond_7

    goto :goto_1

    :cond_7
    iget-object p2, p2, Lgf;->e:Ljava/lang/String;

    iget-object v1, v2, Lgf;->e:Ljava/lang/String;

    invoke-static {v1, p2}, LTf;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_8

    goto :goto_0

    :cond_8
    iget-boolean p2, p0, LGl;->j:Z

    if-nez p2, :cond_b

    iget-object p2, p0, LGl;->d:Loe;

    if-eqz p2, :cond_b

    invoke-virtual {p2}, Loe;->a()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    xor-int/2addr v2, v6

    if-eqz v2, :cond_b

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_a

    check-cast p2, Ljava/security/cert/X509Certificate;

    invoke-static {v1, p2}, LNj;->b(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z

    move-result p2

    if-eqz p2, :cond_b

    :goto_0
    :try_start_0
    iget-object p1, p1, LI0;->h:LD5;

    invoke-static {p1}, LTf;->f(Ljava/lang/Object;)V

    iget-object p2, p0, LGl;->d:Loe;

    invoke-static {p2}, LTf;->f(Ljava/lang/Object;)V

    invoke-virtual {p2}, Loe;->a()Ljava/util/List;

    move-result-object p2

    invoke-static {v0, v1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "peerCertificates"

    invoke-static {v0, p2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object p1, p1, LD5;->a:Ljava/util/Set;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-nez p2, :cond_9

    return v6

    :cond_9
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LVo;->l(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return v3

    :cond_a
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type java.security.cert.X509Certificate"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    :goto_1
    return v3
.end method

.method public final i(Z)Z
    .locals 9

    sget-object v0, LRr;->a:[B

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iget-object v2, p0, LGl;->b:Ljava/net/Socket;

    invoke-static {v2}, LTf;->f(Ljava/lang/Object;)V

    iget-object v3, p0, LGl;->c:Ljava/net/Socket;

    invoke-static {v3}, LTf;->f(Ljava/lang/Object;)V

    iget-object v4, p0, LGl;->g:LBl;

    invoke-static {v4}, LTf;->f(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/net/Socket;->isClosed()Z

    move-result v2

    const/4 v5, 0x0

    if-nez v2, :cond_5

    invoke-virtual {v3}, Ljava/net/Socket;->isClosed()Z

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual {v3}, Ljava/net/Socket;->isInputShutdown()Z

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual {v3}, Ljava/net/Socket;->isOutputShutdown()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_3

    :cond_0
    iget-object v2, p0, LGl;->f:LTe;

    const/4 v6, 0x1

    if-eqz v2, :cond_3

    monitor-enter v2

    :try_start_0
    iget-boolean p1, v2, LTe;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_1

    monitor-exit v2

    goto :goto_0

    :cond_1
    :try_start_1
    iget-wide v3, v2, LTe;->p:J

    iget-wide v7, v2, LTe;->o:J

    cmp-long p1, v3, v7

    if-gez p1, :cond_2

    iget-wide v3, v2, LTe;->q:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    cmp-long p1, v0, v3

    if-ltz p1, :cond_2

    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_2
    monitor-exit v2

    move v5, v6

    :goto_0
    return v5

    :goto_1
    monitor-exit v2

    throw p1

    :cond_3
    monitor-enter p0

    :try_start_2
    iget-wide v7, p0, LGl;->p:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    sub-long/2addr v0, v7

    monitor-exit p0

    const-wide v7, 0x2540be400L

    cmp-long v0, v0, v7

    if-ltz v0, :cond_4

    if-eqz p1, :cond_4

    :try_start_3
    invoke-virtual {v3}, Ljava/net/Socket;->getSoTimeout()I

    move-result p1
    :try_end_3
    .catch Ljava/net/SocketTimeoutException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    :try_start_4
    invoke-virtual {v3, v6}, Ljava/net/Socket;->setSoTimeout(I)V

    invoke-virtual {v4}, LBl;->p()Z

    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    xor-int/2addr v0, v6

    :try_start_5
    invoke-virtual {v3, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    move v5, v0

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {v3, p1}, Ljava/net/Socket;->setSoTimeout(I)V

    throw v0
    :try_end_5
    .catch Ljava/net/SocketTimeoutException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    :catch_0
    move v5, v6

    :catch_1
    :goto_2
    return v5

    :cond_4
    return v6

    :catchall_2
    move-exception p1

    monitor-exit p0

    throw p1

    :cond_5
    :goto_3
    return v5
.end method

.method public final j(LPj;LIl;)Ltb;
    .locals 6

    const-string v0, "client"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, LGl;->c:Ljava/net/Socket;

    invoke-static {v0}, LTf;->f(Ljava/lang/Object;)V

    iget-object v1, p0, LGl;->g:LBl;

    invoke-static {v1}, LTf;->f(Ljava/lang/Object;)V

    iget-object v2, p0, LGl;->h:LAl;

    invoke-static {v2}, LTf;->f(Ljava/lang/Object;)V

    iget-object v3, p0, LGl;->f:LTe;

    if-eqz v3, :cond_0

    new-instance v0, LUe;

    invoke-direct {v0, p1, p0, p2, v3}, LUe;-><init>(LPj;LGl;LIl;LTe;)V

    goto :goto_0

    :cond_0
    iget v3, p2, LIl;->h:I

    invoke-virtual {v0, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    iget-object v0, v1, LBl;->c:LXo;

    invoke-interface {v0}, LXo;->b()LJq;

    move-result-object v0

    int-to-long v3, v3

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v3, v4, v5}, LJq;->g(JLjava/util/concurrent/TimeUnit;)LJq;

    iget-object v0, v2, LAl;->c:LMo;

    invoke-interface {v0}, LMo;->b()LJq;

    move-result-object v0

    iget p2, p2, LIl;->i:I

    int-to-long v3, p2

    invoke-virtual {v0, v3, v4, v5}, LJq;->g(JLjava/util/concurrent/TimeUnit;)LJq;

    new-instance v0, LGe;

    invoke-direct {v0, p1, p0, v1, v2}, LGe;-><init>(LPj;LGl;LP4;LO4;)V

    :goto_0
    return-object v0
.end method

.method public final declared-synchronized k()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, LGl;->i:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final l()V
    .locals 9

    iget-object v0, p0, LGl;->c:Ljava/net/Socket;

    invoke-static {v0}, LTf;->f(Ljava/lang/Object;)V

    iget-object v1, p0, LGl;->g:LBl;

    invoke-static {v1}, LTf;->f(Ljava/lang/Object;)V

    iget-object v2, p0, LGl;->h:LAl;

    invoke-static {v2}, LTf;->f(Ljava/lang/Object;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    new-instance v4, LGe;

    sget-object v5, Lkq;->h:Lkq;

    invoke-direct {v4, v5}, LGe;-><init>(Lkq;)V

    iget-object v6, p0, LGl;->q:Lfn;

    iget-object v6, v6, Lfn;->a:LI0;

    iget-object v6, v6, LI0;->a:Lgf;

    iget-object v6, v6, Lgf;->e:Ljava/lang/String;

    const-string v7, "peerName"

    invoke-static {v7, v6}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v0, v4, LGe;->d:Ljava/lang/Object;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v7, LRr;->g:Ljava/lang/String;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v7, 0x20

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, LGe;->e:Ljava/lang/Object;

    iput-object v1, v4, LGe;->a:LP4;

    iput-object v2, v4, LGe;->b:LO4;

    iput-object p0, v4, LGe;->f:Ljava/lang/Object;

    iput v3, v4, LGe;->c:I

    new-instance v0, LTe;

    invoke-direct {v0, v4}, LTe;-><init>(LGe;)V

    iput-object v0, p0, LGl;->f:LTe;

    sget-object v1, LTe;->B:Lco;

    iget v2, v1, Lco;->a:I

    and-int/lit8 v2, v2, 0x10

    const/4 v4, 0x4

    if-eqz v2, :cond_0

    iget-object v1, v1, Lco;->b:[I

    aget v1, v1, v4

    goto :goto_0

    :cond_0
    const v1, 0x7fffffff

    :goto_0
    iput v1, p0, LGl;->n:I

    iget-object v1, v0, LTe;->y:Lbf;

    const-string v2, ">> CONNECTION "

    monitor-enter v1

    :try_start_0
    iget-boolean v6, v1, Lbf;->c:Z

    if-nez v6, :cond_9

    iget-boolean v6, v1, Lbf;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v6, :cond_1

    monitor-exit v1

    goto :goto_2

    :cond_1
    :try_start_1
    sget-object v6, Lbf;->g:Ljava/util/logging/Logger;

    sget-object v7, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v6, v7}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v7

    if-eqz v7, :cond_2

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, LHe;->a:Le5;

    invoke-virtual {v2}, Le5;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v7, v3, [Ljava/lang/Object;

    invoke-static {v2, v7}, LRr;->i(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :cond_2
    :goto_1
    iget-object v2, v1, Lbf;->e:LO4;

    sget-object v6, LHe;->a:Le5;

    invoke-interface {v2, v6}, LO4;->r(Le5;)LO4;

    iget-object v2, v1, Lbf;->e:LO4;

    invoke-interface {v2}, LO4;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    :goto_2
    iget-object v1, v0, LTe;->y:Lbf;

    iget-object v2, v0, LTe;->r:Lco;

    monitor-enter v1

    :try_start_2
    const-string v6, "settings"

    invoke-static {v6, v2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iget-boolean v6, v1, Lbf;->c:Z

    if-nez v6, :cond_8

    iget v6, v2, Lco;->a:I

    invoke-static {v6}, Ljava/lang/Integer;->bitCount(I)I

    move-result v6

    mul-int/lit8 v6, v6, 0x6

    invoke-virtual {v1, v3, v6, v4, v3}, Lbf;->x(IIII)V

    move v6, v3

    :goto_3
    const/16 v7, 0xa

    if-ge v6, v7, :cond_6

    const/4 v7, 0x1

    shl-int/2addr v7, v6

    iget v8, v2, Lco;->a:I

    and-int/2addr v7, v8

    if-eqz v7, :cond_5

    if-eq v6, v4, :cond_4

    const/4 v7, 0x7

    if-eq v6, v7, :cond_3

    move v7, v6

    goto :goto_4

    :cond_3
    move v7, v4

    goto :goto_4

    :cond_4
    const/4 v7, 0x3

    :goto_4
    iget-object v8, v1, Lbf;->e:LO4;

    invoke-interface {v8, v7}, LO4;->i(I)LO4;

    iget-object v7, v1, Lbf;->e:LO4;

    iget-object v8, v2, Lco;->b:[I

    aget v8, v8, v6

    invoke-interface {v7, v8}, LO4;->j(I)LO4;

    goto :goto_5

    :catchall_1
    move-exception v0

    goto :goto_6

    :cond_5
    :goto_5
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_6
    iget-object v2, v1, Lbf;->e:LO4;

    invoke-interface {v2}, LO4;->flush()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v1

    iget-object v1, v0, LTe;->r:Lco;

    invoke-virtual {v1}, Lco;->a()I

    move-result v1

    const v2, 0xffff

    if-eq v1, v2, :cond_7

    iget-object v4, v0, LTe;->y:Lbf;

    sub-int/2addr v1, v2

    int-to-long v1, v1

    invoke-virtual {v4, v1, v2, v3}, Lbf;->B(JI)V

    :cond_7
    invoke-virtual {v5}, Lkq;->f()Ljq;

    move-result-object v1

    iget-object v2, v0, LTe;->d:Ljava/lang/String;

    iget-object v0, v0, LTe;->z:LNe;

    new-instance v3, LRe;

    const/4 v4, 0x2

    invoke-direct {v3, v4, v2, v0}, LRe;-><init>(ILjava/lang/String;Ljava/lang/Object;)V

    const-wide/16 v4, 0x0

    invoke-virtual {v1, v3, v4, v5}, Ljq;->c(Liq;J)V

    return-void

    :cond_8
    :try_start_3
    new-instance v0, Ljava/io/IOException;

    const-string v2, "closed"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_6
    monitor-exit v1

    throw v0

    :cond_9
    :try_start_4
    new-instance v0, Ljava/io/IOException;

    const-string v2, "closed"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_7
    monitor-exit v1

    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Connection{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, LGl;->q:Lfn;

    iget-object v2, v1, Lfn;->a:LI0;

    iget-object v2, v2, LI0;->a:Lgf;

    iget-object v2, v2, Lgf;->e:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x3a

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, v1, Lfn;->a:LI0;

    iget-object v2, v2, LI0;->a:Lgf;

    iget v2, v2, Lgf;->f:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", proxy="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, Lfn;->b:Ljava/net/Proxy;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " hostAddress="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v1, Lfn;->c:Ljava/net/InetSocketAddress;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " cipherSuite="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LGl;->d:Loe;

    if-eqz v1, :cond_0

    iget-object v1, v1, Loe;->c:LW5;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "none"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " protocol="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LGl;->e:Lil;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
