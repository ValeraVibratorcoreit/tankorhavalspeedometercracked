.class public final Ldh;
.super Leh;
.source "SourceFile"

# interfaces
.implements Lzg;


# instance fields
.field public final e:LDg;

.field public final synthetic f:Loj;


# direct methods
.method public constructor <init>(Loj;LDg;LMj;)V
    .locals 0

    iput-object p1, p0, Ldh;->f:Loj;

    invoke-direct {p0, p1, p3}, Leh;-><init>(Loj;LMj;)V

    iput-object p2, p0, Ldh;->e:LDg;

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 1

    iget-object v0, p0, Ldh;->e:LDg;

    invoke-interface {v0}, LDg;->getLifecycle()Lwg;

    move-result-object v0

    invoke-virtual {v0, p0}, Lwg;->b(LCg;)V

    return-void
.end method

.method public final c(LDg;)Z
    .locals 1

    iget-object v0, p0, Ldh;->e:LDg;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final d()Z
    .locals 2

    iget-object v0, p0, Ldh;->e:LDg;

    invoke-interface {v0}, LDg;->getLifecycle()Lwg;

    move-result-object v0

    check-cast v0, LFg;

    iget-object v0, v0, LFg;->c:Lug;

    sget-object v1, Lug;->d:Lug;

    invoke-virtual {v0, v1}, Lug;->a(Lug;)Z

    move-result v0

    return v0
.end method

.method public final n(LDg;Ltg;)V
    .locals 2

    iget-object p1, p0, Ldh;->e:LDg;

    invoke-interface {p1}, LDg;->getLifecycle()Lwg;

    move-result-object p2

    check-cast p2, LFg;

    iget-object p2, p2, LFg;->c:Lug;

    sget-object v0, Lug;->a:Lug;

    if-ne p2, v0, :cond_1

    iget-object p1, p0, Ldh;->f:Loj;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p2, "removeObserver"

    invoke-static {p2}, Loj;->a(Ljava/lang/String;)V

    iget-object p1, p1, Loj;->b:Lon;

    iget-object p2, p0, Leh;->a:LMj;

    invoke-virtual {p1, p2}, Lon;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Leh;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Leh;->b()V

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Leh;->a(Z)V

    :goto_0
    return-void

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-eq v0, p2, :cond_2

    invoke-virtual {p0}, Ldh;->d()Z

    move-result v0

    invoke-virtual {p0, v0}, Leh;->a(Z)V

    invoke-interface {p1}, LDg;->getLifecycle()Lwg;

    move-result-object v0

    check-cast v0, LFg;

    iget-object v0, v0, LFg;->c:Lug;

    move-object v1, v0

    move-object v0, p2

    move-object p2, v1

    goto :goto_1

    :cond_2
    return-void
.end method
