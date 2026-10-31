.class public final LEe;
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

    iput-object p1, p0, LEe;->c:LGe;

    new-instance v0, Luc;

    iget-object p1, p1, LGe;->b:LO4;

    invoke-interface {p1}, LMo;->b()LJq;

    move-result-object p1

    invoke-direct {v0, p1}, Luc;-><init>(LJq;)V

    iput-object v0, p0, LEe;->a:Luc;

    return-void
.end method


# virtual methods
.method public final b()LJq;
    .locals 1

    iget-object v0, p0, LEe;->a:Luc;

    return-object v0
.end method

.method public final close()V
    .locals 4

    iget-boolean v0, p0, LEe;->b:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LEe;->b:Z

    iget-object v0, p0, LEe;->c:LGe;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, LEe;->a:Luc;

    iget-object v2, v1, Luc;->e:LJq;

    sget-object v3, LJq;->d:LIq;

    iput-object v3, v1, Luc;->e:LJq;

    invoke-virtual {v2}, LJq;->a()LJq;

    invoke-virtual {v2}, LJq;->b()LJq;

    const/4 v1, 0x3

    iput v1, v0, LGe;->c:I

    return-void
.end method

.method public final d(LL4;J)V
    .locals 7

    const-string v0, "source"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iget-boolean v0, p0, LEe;->b:Z

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-wide v1, p1, LL4;->b:J

    const-wide/16 v3, 0x0

    move-wide v5, p2

    invoke-static/range {v1 .. v6}, LRr;->c(JJJ)V

    iget-object v0, p0, LEe;->c:LGe;

    iget-object v0, v0, LGe;->b:LO4;

    invoke-interface {v0, p1, p2, p3}, LMo;->d(LL4;J)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final flush()V
    .locals 1

    iget-boolean v0, p0, LEe;->b:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LEe;->c:LGe;

    iget-object v0, v0, LGe;->b:LO4;

    invoke-interface {v0}, LO4;->flush()V

    return-void
.end method
