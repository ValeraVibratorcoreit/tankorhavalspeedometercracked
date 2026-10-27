.class public final Lhj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La8;
.implements LZ7;


# instance fields
.field public final a:Ljava/util/List;

.field public final b:LNk;

.field public c:I

.field public d:LUk;

.field public e:LZ7;

.field public f:Ljava/util/List;

.field public g:Z


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;LNk;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lhj;->b:LNk;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_0

    iput-object p1, p0, Lhj;->a:Ljava/util/List;

    const/4 p1, 0x0

    iput p1, p0, Lhj;->c:I

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Must not be empty."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a()Ljava/lang/Class;
    .locals 2

    iget-object v0, p0, Lhj;->a:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La8;

    invoke-interface {v0}, La8;->a()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public final b()V
    .locals 4

    iget-boolean v0, p0, Lhj;->g:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lhj;->c:I

    iget-object v1, p0, Lhj;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_1

    iget v0, p0, Lhj;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lhj;->c:I

    iget-object v0, p0, Lhj;->d:LUk;

    iget-object v1, p0, Lhj;->e:LZ7;

    invoke-virtual {p0, v0, v1}, Lhj;->d(LUk;LZ7;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lhj;->f:Ljava/util/List;

    invoke-static {v0}, LUd;->k(Ljava/lang/Object;)V

    iget-object v0, p0, Lhj;->e:LZ7;

    new-instance v1, LXd;

    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Lhj;->f:Ljava/util/List;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string v3, "Fetch failed"

    invoke-direct {v1, v3, v2}, LXd;-><init>(Ljava/lang/String;Ljava/util/List;)V

    invoke-interface {v0, v1}, LZ7;->h(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, Lhj;->f:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lhj;->b:LNk;

    invoke-interface {v1, v0}, LNk;->a(Ljava/lang/Object;)Z

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lhj;->f:Ljava/util/List;

    iget-object v0, p0, Lhj;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La8;

    invoke-interface {v1}, La8;->c()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final cancel()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lhj;->g:Z

    iget-object v0, p0, Lhj;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La8;

    invoke-interface {v1}, La8;->cancel()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final d(LUk;LZ7;)V
    .locals 1

    iput-object p1, p0, Lhj;->d:LUk;

    iput-object p2, p0, Lhj;->e:LZ7;

    iget-object p2, p0, Lhj;->b:LNk;

    invoke-interface {p2}, LNk;->b()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    iput-object p2, p0, Lhj;->f:Ljava/util/List;

    iget-object p2, p0, Lhj;->a:Ljava/util/List;

    iget v0, p0, Lhj;->c:I

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, La8;

    invoke-interface {p2, p1, p0}, La8;->d(LUk;LZ7;)V

    iget-boolean p1, p0, Lhj;->g:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lhj;->cancel()V

    :cond_0
    return-void
.end method

.method public final e()I
    .locals 2

    iget-object v0, p0, Lhj;->a:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La8;

    invoke-interface {v0}, La8;->e()I

    move-result v0

    return v0
.end method

.method public final h(Ljava/lang/Exception;)V
    .locals 2

    iget-object v0, p0, Lhj;->f:Ljava/util/List;

    const-string v1, "Argument must not be null"

    invoke-static {v1, v0}, LUd;->l(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lhj;->b()V

    return-void
.end method

.method public final m(Ljava/lang/Object;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lhj;->e:LZ7;

    invoke-interface {v0, p1}, LZ7;->m(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lhj;->b()V

    :goto_0
    return-void
.end method
