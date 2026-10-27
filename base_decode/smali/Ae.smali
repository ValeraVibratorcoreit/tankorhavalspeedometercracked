.class public abstract LAe;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LXo;


# instance fields
.field public final a:Luc;

.field public b:Z

.field public final synthetic c:LGe;


# direct methods
.method public constructor <init>(LGe;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LAe;->c:LGe;

    new-instance v0, Luc;

    iget-object p1, p1, LGe;->a:LP4;

    invoke-interface {p1}, LXo;->b()LJq;

    move-result-object p1

    invoke-direct {v0, p1}, Luc;-><init>(LJq;)V

    iput-object v0, p0, LAe;->a:Luc;

    return-void
.end method


# virtual methods
.method public final b()LJq;
    .locals 1

    iget-object v0, p0, LAe;->a:Luc;

    return-object v0
.end method

.method public f(LL4;J)J
    .locals 2

    iget-object v0, p0, LAe;->c:LGe;

    const-string v1, "sink"

    invoke-static {v1, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    :try_start_0
    iget-object v1, v0, LGe;->a:LP4;

    invoke-interface {v1, p1, p2, p3}, LXo;->f(LL4;J)J

    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p1

    :catch_0
    move-exception p1

    iget-object p2, v0, LGe;->g:Ljava/lang/Object;

    check-cast p2, LGl;

    invoke-virtual {p2}, LGl;->k()V

    invoke-virtual {p0}, LAe;->n()V

    throw p1
.end method

.method public final n()V
    .locals 5

    iget-object v0, p0, LAe;->c:LGe;

    iget v1, v0, LGe;->c:I

    const/4 v2, 0x6

    if-ne v1, v2, :cond_0

    return-void

    :cond_0
    const/4 v3, 0x5

    if-ne v1, v3, :cond_1

    iget-object v1, p0, LAe;->a:Luc;

    iget-object v3, v1, Luc;->e:LJq;

    sget-object v4, LJq;->d:LIq;

    iput-object v4, v1, Luc;->e:LJq;

    invoke-virtual {v3}, LJq;->a()LJq;

    invoke-virtual {v3}, LJq;->b()LJq;

    iput v2, v0, LGe;->c:I

    return-void

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "state: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, v0, LGe;->c:I

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
