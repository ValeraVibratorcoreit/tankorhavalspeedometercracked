.class public final Luc;
.super LJq;
.source "SourceFile"


# instance fields
.field public e:LJq;


# direct methods
.method public constructor <init>(LJq;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luc;->e:LJq;

    return-void
.end method


# virtual methods
.method public final a()LJq;
    .locals 1

    iget-object v0, p0, Luc;->e:LJq;

    invoke-virtual {v0}, LJq;->a()LJq;

    move-result-object v0

    return-object v0
.end method

.method public final b()LJq;
    .locals 1

    iget-object v0, p0, Luc;->e:LJq;

    invoke-virtual {v0}, LJq;->b()LJq;

    move-result-object v0

    return-object v0
.end method

.method public final c()J
    .locals 2

    iget-object v0, p0, Luc;->e:LJq;

    invoke-virtual {v0}, LJq;->c()J

    move-result-wide v0

    return-wide v0
.end method

.method public final d(J)LJq;
    .locals 1

    iget-object v0, p0, Luc;->e:LJq;

    invoke-virtual {v0, p1, p2}, LJq;->d(J)LJq;

    move-result-object p1

    return-object p1
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Luc;->e:LJq;

    invoke-virtual {v0}, LJq;->e()Z

    move-result v0

    return v0
.end method

.method public final f()V
    .locals 1

    iget-object v0, p0, Luc;->e:LJq;

    invoke-virtual {v0}, LJq;->f()V

    return-void
.end method

.method public final g(JLjava/util/concurrent/TimeUnit;)LJq;
    .locals 1

    const-string v0, "unit"

    invoke-static {v0, p3}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, Luc;->e:LJq;

    invoke-virtual {v0, p1, p2, p3}, LJq;->g(JLjava/util/concurrent/TimeUnit;)LJq;

    move-result-object p1

    return-object p1
.end method
