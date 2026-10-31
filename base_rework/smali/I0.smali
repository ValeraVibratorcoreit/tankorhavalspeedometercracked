.class public final LI0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lgf;

.field public final b:Ljava/util/List;

.field public final c:Ljava/util/List;

.field public final d:Lpa;

.field public final e:Ljavax/net/SocketFactory;

.field public final f:Ljavax/net/ssl/SSLSocketFactory;

.field public final g:Ljavax/net/ssl/HostnameVerifier;

.field public final h:LD5;

.field public final i:Lpa;

.field public final j:Ljava/net/ProxySelector;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILpa;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;LD5;Lpa;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V
    .locals 1

    const-string v0, "uriHost"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "dns"

    invoke-static {v0, p3}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "socketFactory"

    invoke-static {v0, p4}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "proxyAuthenticator"

    invoke-static {v0, p8}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "protocols"

    invoke-static {v0, p9}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "connectionSpecs"

    invoke-static {v0, p10}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "proxySelector"

    invoke-static {v0, p11}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, LI0;->d:Lpa;

    iput-object p4, p0, LI0;->e:Ljavax/net/SocketFactory;

    iput-object p5, p0, LI0;->f:Ljavax/net/ssl/SSLSocketFactory;

    iput-object p6, p0, LI0;->g:Ljavax/net/ssl/HostnameVerifier;

    iput-object p7, p0, LI0;->h:LD5;

    iput-object p8, p0, LI0;->i:Lpa;

    iput-object p11, p0, LI0;->j:Ljava/net/ProxySelector;

    new-instance p3, Lff;

    invoke-direct {p3}, Lff;-><init>()V

    const-string p4, "http"

    const-string p6, "https"

    if-eqz p5, :cond_0

    move-object p5, p6

    goto :goto_0

    :cond_0
    move-object p5, p4

    :goto_0
    invoke-virtual {p5, p4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p7

    if-eqz p7, :cond_1

    iput-object p4, p3, Lff;->d:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    invoke-virtual {p5, p6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_4

    iput-object p6, p3, Lff;->d:Ljava/lang/Object;

    :goto_1
    const/4 p4, 0x7

    const/4 p5, 0x0

    invoke-static {p1, p5, p5, p5, p4}, Lh8;->q(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, LTf;->b0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    if-eqz p4, :cond_3

    iput-object p4, p3, Lff;->g:Ljava/lang/Object;

    const/4 p1, 0x1

    if-gt p1, p2, :cond_2

    const p1, 0xffff

    if-lt p1, p2, :cond_2

    iput p2, p3, Lff;->b:I

    invoke-virtual {p3}, Lff;->a()Lgf;

    move-result-object p1

    iput-object p1, p0, LI0;->a:Lgf;

    invoke-static {p9}, LRr;->w(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LI0;->b:Ljava/util/List;

    invoke-static {p10}, LRr;->w(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, LI0;->c:Ljava/util/List;

    return-void

    :cond_2
    const-string p1, "unexpected port: "

    invoke-static {p2, p1}, LVo;->e(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string p3, "unexpected host: "

    invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "unexpected scheme: "

    invoke-virtual {p2, p5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(LI0;)Z
    .locals 2

    const-string v0, "that"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, LI0;->d:Lpa;

    iget-object v1, p1, LI0;->d:Lpa;

    invoke-static {v0, v1}, LTf;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LI0;->i:Lpa;

    iget-object v1, p1, LI0;->i:Lpa;

    invoke-static {v0, v1}, LTf;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LI0;->b:Ljava/util/List;

    iget-object v1, p1, LI0;->b:Ljava/util/List;

    invoke-static {v0, v1}, LTf;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LI0;->c:Ljava/util/List;

    iget-object v1, p1, LI0;->c:Ljava/util/List;

    invoke-static {v0, v1}, LTf;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LI0;->j:Ljava/net/ProxySelector;

    iget-object v1, p1, LI0;->j:Ljava/net/ProxySelector;

    invoke-static {v0, v1}, LTf;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-static {v0, v0}, LTf;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LI0;->f:Ljavax/net/ssl/SSLSocketFactory;

    iget-object v1, p1, LI0;->f:Ljavax/net/ssl/SSLSocketFactory;

    invoke-static {v0, v1}, LTf;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LI0;->g:Ljavax/net/ssl/HostnameVerifier;

    iget-object v1, p1, LI0;->g:Ljavax/net/ssl/HostnameVerifier;

    invoke-static {v0, v1}, LTf;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LI0;->h:LD5;

    iget-object v1, p1, LI0;->h:LD5;

    invoke-static {v0, v1}, LTf;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LI0;->a:Lgf;

    iget v0, v0, Lgf;->f:I

    iget-object p1, p1, LI0;->a:Lgf;

    iget p1, p1, Lgf;->f:I

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, LI0;

    if-eqz v0, :cond_0

    check-cast p1, LI0;

    iget-object v0, p1, LI0;->a:Lgf;

    iget-object v1, p0, LI0;->a:Lgf;

    invoke-static {v1, v0}, LTf;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, LI0;->a(LI0;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, LI0;->a:Lgf;

    iget-object v0, v0, Lgf;->i:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LI0;->d:Lpa;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, LI0;->i:Lpa;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LI0;->b:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, LI0;->c:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LI0;->j:Ljava/net/ProxySelector;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit16 v1, v1, 0x3c1

    iget-object v0, p0, LI0;->f:Ljavax/net/ssl/SSLSocketFactory;

    invoke-static {v0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LI0;->g:Ljavax/net/ssl/HostnameVerifier;

    invoke-static {v1}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, LI0;->h:LD5;

    invoke-static {v0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Address{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, LI0;->a:Lgf;

    iget-object v2, v1, Lgf;->e:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x3a

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v1, v1, Lgf;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "proxySelector="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, LI0;->j:Ljava/net/ProxySelector;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
