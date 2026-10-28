.class public abstract Ld;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA6;
.implements LYi;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ld;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LR1;)V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Ld;->a:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld;->a:Ljava/lang/Object;

    iput-object p2, p0, Ld;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d()V
    .locals 2

    iget-object v0, p0, Ld;->a:Ljava/lang/Object;

    check-cast v0, LO1;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v1, p0, Ld;->b:Ljava/lang/Object;

    check-cast v1, LR1;

    iget-object v1, v1, LR1;->k:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v0, 0x0

    iput-object v0, p0, Ld;->a:Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public e()V
    .locals 3

    iget-object v0, p0, Ld;->a:Ljava/lang/Object;

    check-cast v0, Ldp;

    iget-object v1, v0, Ldp;->e:Ljava/util/HashSet;

    iget-object v2, p0, Ld;->b:Ljava/lang/Object;

    check-cast v2, Lr5;

    invoke-virtual {v1, v2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljava/util/HashSet;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ldp;->b()V

    :cond_0
    return-void
.end method

.method public abstract f()Landroid/content/IntentFilter;
.end method

.method public abstract g()I
.end method

.method public h(Landroid/view/MenuItem;)Landroid/view/MenuItem;
    .locals 2

    instance-of v0, p1, LTp;

    if-eqz v0, :cond_2

    check-cast p1, LTp;

    iget-object v0, p0, Ld;->b:Ljava/lang/Object;

    check-cast v0, LFo;

    if-nez v0, :cond_0

    new-instance v0, LFo;

    invoke-direct {v0}, LFo;-><init>()V

    iput-object v0, p0, Ld;->b:Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Ld;->b:Ljava/lang/Object;

    check-cast v0, LFo;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, LFo;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/MenuItem;

    if-nez v0, :cond_1

    new-instance v0, LCi;

    iget-object v1, p0, Ld;->a:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    invoke-direct {v0, v1, p1}, LCi;-><init>(Landroid/content/Context;LTp;)V

    iget-object v1, p0, Ld;->b:Ljava/lang/Object;

    check-cast v1, LFo;

    invoke-virtual {v1, p1, v0}, LFo;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0

    :cond_2
    return-object p1
.end method

.method public abstract i()V
.end method

.method public j()V
    .locals 3

    invoke-virtual {p0}, Ld;->d()V

    invoke-virtual {p0}, Ld;->f()Landroid/content/IntentFilter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/IntentFilter;->countActions()I

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Ld;->a:Ljava/lang/Object;

    check-cast v1, LO1;

    if-nez v1, :cond_1

    new-instance v1, LO1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, LO1;-><init>(Ljava/lang/Object;I)V

    iput-object v1, p0, Ld;->a:Ljava/lang/Object;

    :cond_1
    iget-object v1, p0, Ld;->b:Ljava/lang/Object;

    check-cast v1, LR1;

    iget-object v1, v1, LR1;->k:Landroid/content/Context;

    iget-object v2, p0, Ld;->a:Ljava/lang/Object;

    check-cast v2, LO1;

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method public o(Ljj;)LXi;
    .locals 4

    new-instance v0, Lll;

    const-class v1, Ljava/io/File;

    iget-object v2, p0, Ld;->b:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Class;

    invoke-virtual {p1, v1, v2}, Ljj;->e(Ljava/lang/Class;Ljava/lang/Class;)LXi;

    move-result-object v1

    const-class v3, Landroid/net/Uri;

    invoke-virtual {p1, v3, v2}, Ljj;->e(Ljava/lang/Class;Ljava/lang/Class;)LXi;

    move-result-object p1

    iget-object v3, p0, Ld;->a:Ljava/lang/Object;

    check-cast v3, Landroid/content/Context;

    invoke-direct {v0, v3, v1, p1, v2}, Lll;-><init>(Landroid/content/Context;LXi;LXi;Ljava/lang/Class;)V

    return-object v0
.end method
