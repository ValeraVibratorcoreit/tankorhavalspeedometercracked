.class public final Lad;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqe;
.implements Lxn;
.implements LSs;


# instance fields
.field public final a:Lzc;

.field public final b:LRs;

.field public c:LFg;

.field public d:LLo;


# direct methods
.method public constructor <init>(Lzc;LRs;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lad;->c:LFg;

    iput-object v0, p0, Lad;->d:LLo;

    iput-object p1, p0, Lad;->a:Lzc;

    iput-object p2, p0, Lad;->b:LRs;

    return-void
.end method


# virtual methods
.method public final a()Lnj;
    .locals 5

    iget-object v0, p0, Lad;->a:Lzc;

    invoke-virtual {v0}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    :goto_0
    instance-of v2, v1, Landroid/content/ContextWrapper;

    if-eqz v2, :cond_1

    instance-of v2, v1, Landroid/app/Application;

    if-eqz v2, :cond_0

    check-cast v1, Landroid/app/Application;

    goto :goto_1

    :cond_0
    check-cast v1, Landroid/content/ContextWrapper;

    invoke-virtual {v1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_1
    new-instance v2, Lnj;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lnj;-><init>(I)V

    iget-object v3, v2, LY3;->a:Ljava/lang/Object;

    check-cast v3, Ljava/util/LinkedHashMap;

    if-eqz v1, :cond_2

    sget-object v4, LF4;->q:Lns;

    invoke-interface {v3, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    sget-object v1, LTf;->d:Lmh;

    invoke-interface {v3, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, LTf;->e:Lmh;

    invoke-interface {v3, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v0, Lzc;->f:Landroid/os/Bundle;

    if-eqz v0, :cond_3

    sget-object v1, LTf;->f:Lmh;

    invoke-interface {v3, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-object v2
.end method

.method public final b()Lx1;
    .locals 1

    invoke-virtual {p0}, Lad;->e()V

    iget-object v0, p0, Lad;->d:LLo;

    iget-object v0, v0, LLo;->d:Ljava/lang/Object;

    check-cast v0, Lx1;

    return-object v0
.end method

.method public final c(Ltg;)V
    .locals 1

    iget-object v0, p0, Lad;->c:LFg;

    invoke-virtual {v0, p1}, LFg;->e(Ltg;)V

    return-void
.end method

.method public final d()LRs;
    .locals 1

    invoke-virtual {p0}, Lad;->e()V

    iget-object v0, p0, Lad;->b:LRs;

    return-object v0
.end method

.method public final e()V
    .locals 1

    iget-object v0, p0, Lad;->c:LFg;

    if-nez v0, :cond_0

    new-instance v0, LFg;

    invoke-direct {v0, p0}, LFg;-><init>(LDg;)V

    iput-object v0, p0, Lad;->c:LFg;

    new-instance v0, LLo;

    invoke-direct {v0, p0}, LLo;-><init>(Lxn;)V

    iput-object v0, p0, Lad;->d:LLo;

    invoke-virtual {v0}, LLo;->d()V

    invoke-static {p0}, LTf;->o(Lxn;)V

    :cond_0
    return-void
.end method

.method public final getLifecycle()Lwg;
    .locals 1

    invoke-virtual {p0}, Lad;->e()V

    iget-object v0, p0, Lad;->c:LFg;

    return-object v0
.end method
