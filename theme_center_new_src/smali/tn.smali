.class public final Ltn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwn;


# instance fields
.field public final a:Lx1;

.field public b:Z

.field public c:Landroid/os/Bundle;

.field public final d:LVp;


# direct methods
.method public constructor <init>(Lx1;LSs;)V
    .locals 1

    const-string v0, "savedStateRegistry"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "viewModelStoreOwner"

    invoke-static {v0, p2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltn;->a:Lx1;

    new-instance p1, Lne;

    const/4 v0, 0x2

    invoke-direct {p1, p2, v0}, Lne;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lmk;->v(Ldd;)LVp;

    move-result-object p1

    iput-object p1, p0, Ltn;->d:LVp;

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Ltn;->c:Landroid/os/Bundle;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_0
    iget-object v1, p0, Ltn;->d:LVp;

    invoke-virtual {v1}, LVp;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lun;

    iget-object v1, v1, Lun;->b:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    const/4 v1, 0x0

    iput-boolean v1, p0, Ltn;->b:Z

    return-object v0

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqn;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    throw v0
.end method

.method public final b()V
    .locals 3

    iget-boolean v0, p0, Ltn;->b:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Ltn;->a:Lx1;

    const-string v1, "androidx.lifecycle.internal.SavedStateHandlesProvider"

    invoke-virtual {v0, v1}, Lx1;->c(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iget-object v2, p0, Ltn;->c:Landroid/os/Bundle;

    if-eqz v2, :cond_0

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v1, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_1
    iput-object v1, p0, Ltn;->c:Landroid/os/Bundle;

    const/4 v0, 0x1

    iput-boolean v0, p0, Ltn;->b:Z

    iget-object v0, p0, Ltn;->d:LVp;

    invoke-virtual {v0}, LVp;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lun;

    :cond_2
    return-void
.end method
