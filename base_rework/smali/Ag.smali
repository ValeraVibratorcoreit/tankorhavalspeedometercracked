.class public final LAg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvg;
.implements LCg;


# instance fields
.field public final a:Ljava/util/HashSet;

.field public final b:Lwg;


# direct methods
.method public constructor <init>(Lwg;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, LAg;->a:Ljava/util/HashSet;

    iput-object p1, p0, LAg;->b:Lwg;

    invoke-virtual {p1, p0}, Lwg;->a(LCg;)V

    return-void
.end method


# virtual methods
.method public final f(LBg;)V
    .locals 1

    iget-object v0, p0, LAg;->a:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final g(LBg;)V
    .locals 2

    iget-object v0, p0, LAg;->a:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LAg;->b:Lwg;

    check-cast v0, LFg;

    iget-object v0, v0, LFg;->c:Lug;

    sget-object v1, Lug;->a:Lug;

    if-ne v0, v1, :cond_0

    invoke-interface {p1}, LBg;->k()V

    goto :goto_0

    :cond_0
    sget-object v1, Lug;->d:Lug;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-ltz v0, :cond_1

    invoke-interface {p1}, LBg;->j()V

    goto :goto_0

    :cond_1
    invoke-interface {p1}, LBg;->f()V

    :goto_0
    return-void
.end method

.method public onDestroy(LDg;)V
    .locals 2
    .annotation runtime Lek;
        value = .enum Ltg;->ON_DESTROY:Ltg;
    .end annotation

    iget-object v0, p0, LAg;->a:Ljava/util/HashSet;

    invoke-static {v0}, LQr;->e(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LBg;

    invoke-interface {v1}, LBg;->k()V

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LDg;->getLifecycle()Lwg;

    move-result-object p1

    invoke-virtual {p1, p0}, Lwg;->b(LCg;)V

    return-void
.end method

.method public onStart(LDg;)V
    .locals 1
    .annotation runtime Lek;
        value = .enum Ltg;->ON_START:Ltg;
    .end annotation

    iget-object p1, p0, LAg;->a:Ljava/util/HashSet;

    invoke-static {p1}, LQr;->e(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBg;

    invoke-interface {v0}, LBg;->j()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onStop(LDg;)V
    .locals 1
    .annotation runtime Lek;
        value = .enum Ltg;->ON_STOP:Ltg;
    .end annotation

    iget-object p1, p0, LAg;->a:Ljava/util/HashSet;

    invoke-static {p1}, LQr;->e(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBg;

    invoke-interface {v0}, LBg;->f()V

    goto :goto_0

    :cond_0
    return-void
.end method
