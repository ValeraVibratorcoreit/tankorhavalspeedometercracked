.class public final Lsb;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public final b:LGl;

.field public final c:LDl;

.field public final d:Lpa;

.field public final e:Lub;

.field public final f:Ltb;


# direct methods
.method public constructor <init>(LDl;Lub;Ltb;)V
    .locals 2

    sget-object v0, Lpa;->e:Lpa;

    const-string v1, "call"

    invoke-static {v1, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "finder"

    invoke-static {v1, p2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsb;->c:LDl;

    iput-object v0, p0, Lsb;->d:Lpa;

    iput-object p2, p0, Lsb;->e:Lub;

    iput-object p3, p0, Lsb;->f:Ltb;

    invoke-interface {p3}, Ltb;->h()LGl;

    move-result-object p1

    iput-object p1, p0, Lsb;->b:LGl;

    return-void
.end method


# virtual methods
.method public final a(ZZLjava/io/IOException;)Ljava/io/IOException;
    .locals 3

    if-eqz p3, :cond_0

    invoke-virtual {p0, p3}, Lsb;->c(Ljava/io/IOException;)V

    :cond_0
    const-string v0, "call"

    iget-object v1, p0, Lsb;->d:Lpa;

    iget-object v2, p0, Lsb;->c:LDl;

    if-eqz p2, :cond_2

    if-eqz p3, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_2
    :goto_0
    if-eqz p1, :cond_4

    if-eqz p3, :cond_3

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0, v2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_4
    :goto_1
    invoke-virtual {v2, p0, p2, p1, p3}, LDl;->f(Lsb;ZZLjava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    return-object p1
.end method

.method public final b(Z)Lcn;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lsb;->f:Ltb;

    invoke-interface {v0, p1}, Ltb;->f(Z)Lcn;

    move-result-object p1

    if-eqz p1, :cond_0

    iput-object p0, p1, Lcn;->m:Lsb;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object p1

    :catch_0
    move-exception p1

    iget-object v0, p0, Lsb;->d:Lpa;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "call"

    iget-object v1, p0, Lsb;->c:LDl;

    invoke-static {v0, v1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lsb;->c(Ljava/io/IOException;)V

    throw p1
.end method

.method public final c(Ljava/io/IOException;)V
    .locals 5

    iget-object v0, p0, Lsb;->e:Lub;

    invoke-virtual {v0, p1}, Lub;->c(Ljava/io/IOException;)V

    iget-object v0, p0, Lsb;->f:Ltb;

    invoke-interface {v0}, Ltb;->h()LGl;

    move-result-object v0

    iget-object v1, p0, Lsb;->c:LDl;

    monitor-enter v0

    :try_start_0
    const-string v2, "call"

    invoke-static {v2, v1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    instance-of v2, p1, LBp;

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    move-object v2, p1

    check-cast v2, LBp;

    iget v2, v2, LBp;->a:I

    const/16 v4, 0x8

    if-ne v2, v4, :cond_0

    iget p1, v0, LGl;->m:I

    add-int/2addr p1, v3

    iput p1, v0, LGl;->m:I

    if-le p1, v3, :cond_4

    iput-boolean v3, v0, LGl;->i:Z

    iget p1, v0, LGl;->k:I

    add-int/2addr p1, v3

    iput p1, v0, LGl;->k:I

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    check-cast p1, LBp;

    iget p1, p1, LBp;->a:I

    const/16 v2, 0x9

    if-ne p1, v2, :cond_1

    iget-boolean p1, v1, LDl;->m:Z

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    iput-boolean v3, v0, LGl;->i:Z

    iget p1, v0, LGl;->k:I

    add-int/2addr p1, v3

    iput p1, v0, LGl;->k:I

    goto :goto_0

    :cond_2
    iget-object v2, v0, LGl;->f:LTe;

    if-eqz v2, :cond_3

    instance-of v2, p1, LV6;

    if-eqz v2, :cond_4

    :cond_3
    iput-boolean v3, v0, LGl;->i:Z

    iget v2, v0, LGl;->l:I

    if-nez v2, :cond_4

    iget-object v1, v1, LDl;->p:LPj;

    iget-object v2, v0, LGl;->q:Lfn;

    invoke-static {v1, v2, p1}, LGl;->d(LPj;Lfn;Ljava/io/IOException;)V

    iget p1, v0, LGl;->k:I

    add-int/2addr p1, v3

    iput p1, v0, LGl;->k:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method
