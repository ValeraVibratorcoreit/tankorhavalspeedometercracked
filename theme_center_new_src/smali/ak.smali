.class public final Lak;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Runnable;

.field public final b:LZ2;

.field public c:LHc;

.field public final d:Landroid/window/OnBackInvokedCallback;

.field public e:Landroid/window/OnBackInvokedDispatcher;

.field public f:Z

.field public g:Z


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lak;->a:Ljava/lang/Runnable;

    new-instance p1, LZ2;

    invoke-direct {p1}, LZ2;-><init>()V

    iput-object p1, p0, Lak;->b:LZ2;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x21

    if-lt p1, v0, :cond_1

    const/16 v0, 0x22

    if-lt p1, v0, :cond_0

    sget-object p1, LWj;->a:LWj;

    new-instance v0, LSj;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LSj;-><init>(Lak;I)V

    new-instance v1, LSj;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, LSj;-><init>(Lak;I)V

    new-instance v2, LTj;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, LTj;-><init>(Lak;I)V

    new-instance v3, LTj;

    const/4 v4, 0x1

    invoke-direct {v3, p0, v4}, LTj;-><init>(Lak;I)V

    invoke-virtual {p1, v0, v1, v2, v3}, LWj;->a(Lod;Lod;Ldd;Ldd;)Landroid/window/OnBackInvokedCallback;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object p1, LUj;->a:LUj;

    new-instance v0, LTj;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, LTj;-><init>(Lak;I)V

    invoke-virtual {p1, v0}, LUj;->a(Ldd;)Landroid/window/OnBackInvokedCallback;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lak;->d:Landroid/window/OnBackInvokedCallback;

    :cond_1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Lak;->c:LHc;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    iget-object v0, p0, Lak;->b:LZ2;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v0, v2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LHc;

    iget-boolean v3, v3, LHc;->a:Z

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    check-cast v2, LHc;

    :cond_2
    iput-object v1, p0, Lak;->c:LHc;

    return-void
.end method

.method public final b()V
    .locals 4

    iget-object v0, p0, Lak;->c:LHc;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    iget-object v0, p0, Lak;->b:LZ2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v2, v0, LZ2;->c:I

    invoke-virtual {v0, v2}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, LHc;

    iget-boolean v3, v3, LHc;->a:Z

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    move-object v0, v2

    check-cast v0, LHc;

    :cond_2
    iput-object v1, p0, Lak;->c:LHc;

    if-eqz v0, :cond_4

    const/4 v1, 0x1

    iget-object v0, v0, LHc;->d:LOc;

    invoke-virtual {v0, v1}, LOc;->y(Z)Z

    iget-object v1, v0, LOc;->h:LHc;

    iget-boolean v1, v1, LHc;->a:Z

    if-eqz v1, :cond_3

    invoke-virtual {v0}, LOc;->M()Z

    goto :goto_1

    :cond_3
    iget-object v0, v0, LOc;->g:Lak;

    invoke-virtual {v0}, Lak;->b()V

    :goto_1
    return-void

    :cond_4
    iget-object v0, p0, Lak;->a:Ljava/lang/Runnable;

    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_5
    return-void
.end method

.method public final c(Z)V
    .locals 5

    iget-object v0, p0, Lak;->e:Landroid/window/OnBackInvokedDispatcher;

    iget-object v1, p0, Lak;->d:Landroid/window/OnBackInvokedCallback;

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    const/4 v2, 0x0

    sget-object v3, LUj;->a:LUj;

    if-eqz p1, :cond_0

    iget-boolean v4, p0, Lak;->f:Z

    if-nez v4, :cond_0

    invoke-virtual {v3, v0, v2, v1}, LUj;->b(Ljava/lang/Object;ILjava/lang/Object;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lak;->f:Z

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    iget-boolean p1, p0, Lak;->f:Z

    if-eqz p1, :cond_1

    invoke-virtual {v3, v0, v1}, LUj;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-boolean v2, p0, Lak;->f:Z

    :cond_1
    :goto_0
    return-void
.end method

.method public final d()V
    .locals 4

    iget-boolean v0, p0, Lak;->g:Z

    iget-object v1, p0, Lak;->b:LZ2;

    instance-of v2, v1, Ljava/util/Collection;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LHc;

    iget-boolean v2, v2, LHc;->a:Z

    if-eqz v2, :cond_1

    const/4 v3, 0x1

    :cond_2
    :goto_0
    iput-boolean v3, p0, Lak;->g:Z

    if-eq v3, v0, :cond_3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_3

    invoke-virtual {p0, v3}, Lak;->c(Z)V

    :cond_3
    return-void
.end method
