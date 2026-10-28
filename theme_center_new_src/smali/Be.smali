.class public final LBe;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMo;


# instance fields
.field public final a:Luc;

.field public b:Z

.field public final synthetic c:LGe;


# direct methods
.method public constructor <init>(LGe;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LBe;->c:LGe;

    new-instance v0, Luc;

    iget-object p1, p1, LGe;->b:LO4;

    invoke-interface {p1}, LMo;->b()LJq;

    move-result-object p1

    invoke-direct {v0, p1}, Luc;-><init>(LJq;)V

    iput-object v0, p0, LBe;->a:Luc;

    return-void
.end method


# virtual methods
.method public final b()LJq;
    .locals 1

    iget-object v0, p0, LBe;->a:Luc;

    return-object v0
.end method

.method public final declared-synchronized close()V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LBe;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, LBe;->b:Z

    iget-object v0, p0, LBe;->c:LGe;

    iget-object v0, v0, LGe;->b:LO4;

    const-string v1, "0\r\n\r\n"

    invoke-interface {v0, v1}, LO4;->m(Ljava/lang/String;)LO4;

    iget-object v0, p0, LBe;->c:LGe;

    iget-object v1, p0, LBe;->a:Luc;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v1, Luc;->e:LJq;

    sget-object v2, LJq;->d:LIq;

    iput-object v2, v1, Luc;->e:LJq;

    invoke-virtual {v0}, LJq;->a()LJq;

    invoke-virtual {v0}, LJq;->b()LJq;

    iget-object v0, p0, LBe;->c:LGe;

    const/4 v1, 0x3

    iput v1, v0, LGe;->c:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final d(LL4;J)V
    .locals 2

    const-string v0, "source"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iget-boolean v0, p0, LBe;->b:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LBe;->c:LGe;

    iget-object v1, v0, LGe;->b:LO4;

    invoke-interface {v1, p2, p3}, LO4;->e(J)LO4;

    iget-object v0, v0, LGe;->b:LO4;

    const-string v1, "\r\n"

    invoke-interface {v0, v1}, LO4;->m(Ljava/lang/String;)LO4;

    invoke-interface {v0, p1, p2, p3}, LMo;->d(LL4;J)V

    invoke-interface {v0, v1}, LO4;->m(Ljava/lang/String;)LO4;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final declared-synchronized flush()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LBe;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, LBe;->c:LGe;

    iget-object v0, v0, LGe;->b:LO4;

    invoke-interface {v0}, LO4;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
