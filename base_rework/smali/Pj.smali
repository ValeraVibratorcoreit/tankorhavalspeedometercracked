.class public final LPj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static final A:Ljava/util/List;

.field public static final z:Ljava/util/List;


# instance fields
.field public final a:Ljj;

.field public final b:Lk0;

.field public final c:Ljava/util/List;

.field public final d:Ljava/util/List;

.field public final e:LVi;

.field public final f:Z

.field public final g:Lpa;

.field public final h:Z

.field public final i:Z

.field public final j:Lpa;

.field public final k:Lpa;

.field public final l:Ljava/net/ProxySelector;

.field public final m:Lpa;

.field public final n:Ljavax/net/SocketFactory;

.field public final o:Ljavax/net/ssl/SSLSocketFactory;

.field public final p:Ljavax/net/ssl/X509TrustManager;

.field public final q:Ljava/util/List;

.field public final r:Ljava/util/List;

.field public final s:Ljavax/net/ssl/HostnameVerifier;

.field public final t:LD5;

.field public final u:Lmk;

.field public final v:I

.field public final w:I

.field public final x:I

.field public final y:LVi;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lil;->e:Lil;

    sget-object v1, Lil;->c:Lil;

    filled-new-array {v0, v1}, [Lil;

    move-result-object v0

    invoke-static {v0}, LRr;->l([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, LPj;->z:Ljava/util/List;

    sget-object v0, LX6;->e:LX6;

    sget-object v1, LX6;->f:LX6;

    filled-new-array {v0, v1}, [LX6;

    move-result-object v0

    invoke-static {v0}, LRr;->l([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, LPj;->A:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 80
    new-instance v0, LOj;

    invoke-direct {v0}, LOj;-><init>()V

    invoke-direct {p0, v0}, LPj;-><init>(LOj;)V

    return-void
.end method

.method public constructor <init>(LOj;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iget-object v0, p1, LOj;->a:Ljj;

    .line 3
    iput-object v0, p0, LPj;->a:Ljj;

    .line 4
    iget-object v0, p1, LOj;->b:Lk0;

    .line 5
    iput-object v0, p0, LPj;->b:Lk0;

    .line 6
    iget-object v0, p1, LOj;->c:Ljava/util/ArrayList;

    .line 7
    invoke-static {v0}, LRr;->w(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LPj;->c:Ljava/util/List;

    .line 8
    iget-object v0, p1, LOj;->d:Ljava/util/ArrayList;

    .line 9
    invoke-static {v0}, LRr;->w(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LPj;->d:Ljava/util/List;

    .line 10
    iget-object v0, p1, LOj;->e:LVi;

    .line 11
    iput-object v0, p0, LPj;->e:LVi;

    .line 12
    iget-boolean v0, p1, LOj;->f:Z

    .line 13
    iput-boolean v0, p0, LPj;->f:Z

    .line 14
    iget-object v0, p1, LOj;->g:Lpa;

    .line 15
    iput-object v0, p0, LPj;->g:Lpa;

    .line 16
    iget-boolean v0, p1, LOj;->h:Z

    .line 17
    iput-boolean v0, p0, LPj;->h:Z

    .line 18
    iget-boolean v0, p1, LOj;->i:Z

    .line 19
    iput-boolean v0, p0, LPj;->i:Z

    .line 20
    iget-object v0, p1, LOj;->j:Lpa;

    .line 21
    iput-object v0, p0, LPj;->j:Lpa;

    .line 22
    iget-object v0, p1, LOj;->k:Lpa;

    .line 23
    iput-object v0, p0, LPj;->k:Lpa;

    .line 24
    invoke-static {}, Ljava/net/ProxySelector;->getDefault()Ljava/net/ProxySelector;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, LJj;->a:LJj;

    .line 25
    :goto_0
    iput-object v0, p0, LPj;->l:Ljava/net/ProxySelector;

    .line 26
    iget-object v0, p1, LOj;->l:Lpa;

    .line 27
    iput-object v0, p0, LPj;->m:Lpa;

    .line 28
    iget-object v0, p1, LOj;->m:Ljavax/net/SocketFactory;

    .line 29
    iput-object v0, p0, LPj;->n:Ljavax/net/SocketFactory;

    .line 30
    iget-object v0, p1, LOj;->n:Ljava/util/List;

    .line 31
    iput-object v0, p0, LPj;->q:Ljava/util/List;

    .line 32
    iget-object v1, p1, LOj;->o:Ljava/util/List;

    .line 33
    iput-object v1, p0, LPj;->r:Ljava/util/List;

    .line 34
    iget-object v1, p1, LOj;->p:LNj;

    .line 35
    iput-object v1, p0, LPj;->s:Ljavax/net/ssl/HostnameVerifier;

    .line 36
    iget v1, p1, LOj;->r:I

    .line 37
    iput v1, p0, LPj;->v:I

    .line 38
    iget v1, p1, LOj;->s:I

    .line 39
    iput v1, p0, LPj;->w:I

    .line 40
    iget v1, p1, LOj;->t:I

    .line 41
    iput v1, p0, LPj;->x:I

    .line 42
    new-instance v1, LVi;

    const/4 v2, 0x6

    invoke-direct {v1, v2}, LVi;-><init>(I)V

    iput-object v1, p0, LPj;->y:LVi;

    .line 43
    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_2

    .line 44
    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LX6;

    .line 45
    iget-boolean v1, v1, LX6;->a:Z

    if-eqz v1, :cond_2

    .line 46
    sget-object v0, LGk;->a:LGk;

    .line 47
    sget-object v0, LGk;->a:LGk;

    .line 48
    invoke-virtual {v0}, LGk;->m()Ljavax/net/ssl/X509TrustManager;

    move-result-object v0

    iput-object v0, p0, LPj;->p:Ljavax/net/ssl/X509TrustManager;

    .line 49
    sget-object v1, LGk;->a:LGk;

    .line 50
    invoke-virtual {v1, v0}, LGk;->l(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    iput-object v1, p0, LPj;->o:Ljavax/net/ssl/SSLSocketFactory;

    .line 51
    sget-object v1, LGk;->a:LGk;

    .line 52
    invoke-virtual {v1, v0}, LGk;->b(Ljavax/net/ssl/X509TrustManager;)Lmk;

    move-result-object v0

    .line 53
    iput-object v0, p0, LPj;->u:Lmk;

    .line 54
    iget-object p1, p1, LOj;->q:LD5;

    .line 55
    iget-object v1, p1, LD5;->b:Lmk;

    .line 56
    invoke-static {v1, v0}, LTf;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    .line 57
    :cond_3
    new-instance v1, LD5;

    iget-object p1, p1, LD5;->a:Ljava/util/Set;

    invoke-direct {v1, p1, v0}, LD5;-><init>(Ljava/util/Set;Lmk;)V

    move-object p1, v1

    .line 58
    :goto_1
    iput-object p1, p0, LPj;->t:LD5;

    goto :goto_3

    .line 59
    :cond_4
    :goto_2
    iput-object v2, p0, LPj;->o:Ljavax/net/ssl/SSLSocketFactory;

    .line 60
    iput-object v2, p0, LPj;->u:Lmk;

    .line 61
    iput-object v2, p0, LPj;->p:Ljavax/net/ssl/X509TrustManager;

    .line 62
    sget-object p1, LD5;->c:LD5;

    iput-object p1, p0, LPj;->t:LD5;

    .line 63
    :goto_3
    iget-object p1, p0, LPj;->c:Ljava/util/List;

    const-string v0, "null cannot be cast to non-null type kotlin.collections.List<okhttp3.Interceptor?>"

    if-eqz p1, :cond_13

    invoke-interface {p1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x1

    xor-int/2addr v1, v3

    if-eqz v1, :cond_12

    .line 64
    iget-object p1, p0, LPj;->d:Ljava/util/List;

    if-eqz p1, :cond_11

    invoke-interface {p1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    xor-int/2addr v0, v3

    if-eqz v0, :cond_10

    .line 65
    iget-object p1, p0, LPj;->q:Ljava/util/List;

    instance-of v0, p1, Ljava/util/Collection;

    iget-object v1, p0, LPj;->p:Ljavax/net/ssl/X509TrustManager;

    iget-object v2, p0, LPj;->u:Lmk;

    iget-object v4, p0, LPj;->o:Ljavax/net/ssl/SSLSocketFactory;

    if-eqz v0, :cond_5

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_4

    .line 66
    :cond_5
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LX6;

    .line 67
    iget-boolean v0, v0, LX6;->a:Z

    if-eqz v0, :cond_6

    if-eqz v4, :cond_9

    if-eqz v2, :cond_8

    if-eqz v1, :cond_7

    goto :goto_6

    .line 68
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "x509TrustManager == null"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 69
    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "certificateChainCleaner == null"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 70
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "sslSocketFactory == null"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    :goto_4
    if-nez v4, :cond_b

    goto :goto_5

    :cond_b
    const/4 v3, 0x0

    .line 71
    :goto_5
    const-string p1, "Check failed."

    if-eqz v3, :cond_f

    if-nez v2, :cond_e

    if-nez v1, :cond_d

    .line 72
    iget-object v0, p0, LPj;->t:LD5;

    sget-object v1, LD5;->c:LD5;

    invoke-static {v0, v1}, LTf;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    :goto_6
    return-void

    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 73
    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 74
    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 75
    :cond_f
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 76
    :cond_10
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Null network interceptor: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 77
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 78
    :cond_12
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Null interceptor: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 79
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_13
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
