.class public final LLo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lae;


# static fields
.field public static volatile e:LLo;


# instance fields
.field public final synthetic a:I

.field public b:Z

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LLo;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 3
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, LLo;->c:Ljava/lang/Object;

    .line 4
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, LLo;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, LLo;->a:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, LLo;->d:Ljava/lang/Object;

    .line 9
    new-instance v0, LS3;

    const/16 v1, 0xa

    invoke-direct {v0, p1, v1}, LS3;-><init>(Landroid/content/Context;I)V

    .line 10
    new-instance p1, LG7;

    invoke-direct {p1, v0}, LG7;-><init>(Ljava/lang/Object;)V

    .line 11
    new-instance v0, LIo;

    invoke-direct {v0, p0}, LIo;-><init>(LLo;)V

    .line 12
    new-instance v1, Lo9;

    invoke-direct {v1, p1, v0}, Lo9;-><init>(LG7;LIo;)V

    .line 13
    iput-object v1, p0, LLo;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/bumptech/glide/a;Ljava/util/ArrayList;LTd;)V
    .locals 0

    const/4 p3, 0x1

    iput p3, p0, LLo;->a:I

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLo;->c:Ljava/lang/Object;

    iput-object p2, p0, LLo;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lxn;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, LLo;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLo;->c:Ljava/lang/Object;

    .line 6
    new-instance p1, Lx1;

    invoke-direct {p1}, Lx1;-><init>()V

    iput-object p1, p0, LLo;->d:Ljava/lang/Object;

    return-void
.end method

.method public static b(Landroid/content/Context;)LLo;
    .locals 2

    sget-object v0, LLo;->e:LLo;

    if-nez v0, :cond_1

    const-class v0, LLo;

    monitor-enter v0

    :try_start_0
    sget-object v1, LLo;->e:LLo;

    if-nez v1, :cond_0

    new-instance v1, LLo;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v1, p0}, LLo;-><init>(Landroid/content/Context;)V

    sput-object v1, LLo;->e:LLo;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_2
    sget-object p0, LLo;->e:LLo;

    return-object p0
.end method


# virtual methods
.method public a(Lxm;)Z
    .locals 3

    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, LLo;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, p0, LLo;->d:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashSet;

    invoke-virtual {v2, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :cond_2
    :goto_0
    if-eqz v0, :cond_3

    invoke-interface {p1}, Lxm;->clear()V

    :cond_3
    return v0
.end method

.method public c()V
    .locals 5

    iget-boolean v0, p0, LLo;->b:Z

    if-nez v0, :cond_3

    iget-object v0, p0, LLo;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, p0, LLo;->c:Ljava/lang/Object;

    check-cast v0, Lo9;

    iget-object v1, v0, Lo9;->c:Ljava/lang/Object;

    check-cast v1, Lae;

    invoke-interface {v1}, Lae;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/ConnectivityManager;

    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    move v2, v4

    goto :goto_0

    :cond_1
    move v2, v3

    :goto_0
    iput-boolean v2, v0, Lo9;->a:Z

    :try_start_0
    invoke-interface {v1}, Lae;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/ConnectivityManager;

    iget-object v0, v0, Lo9;->d:Ljava/lang/Object;

    check-cast v0, LKo;

    invoke-virtual {v1, v0}, Landroid/net/ConnectivityManager;->registerDefaultNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    move v3, v4

    goto :goto_1

    :catch_0
    move-exception v0

    const/4 v1, 0x5

    const-string v2, "ConnectivityMonitor"

    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "Failed to register callback"

    invoke-static {v2, v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_2
    :goto_1
    iput-boolean v3, p0, LLo;->b:Z

    :cond_3
    :goto_2
    return-void
.end method

.method public d()V
    .locals 5

    iget-object v0, p0, LLo;->c:Ljava/lang/Object;

    check-cast v0, Lxn;

    invoke-interface {v0}, LDg;->getLifecycle()Lwg;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LFg;

    iget-object v2, v2, LFg;->c:Lug;

    sget-object v3, Lug;->b:Lug;

    if-ne v2, v3, :cond_1

    new-instance v2, LKl;

    invoke-direct {v2, v0}, LKl;-><init>(Lxn;)V

    invoke-virtual {v1, v2}, Lwg;->a(LCg;)V

    iget-object v0, p0, LLo;->d:Ljava/lang/Object;

    check-cast v0, Lx1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-boolean v2, v0, Lx1;->c:Z

    const/4 v3, 0x1

    xor-int/2addr v2, v3

    if-eqz v2, :cond_0

    new-instance v2, LF6;

    const/4 v4, 0x2

    invoke-direct {v2, v0, v4}, LF6;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v1, v2}, Lwg;->a(LCg;)V

    iput-boolean v3, v0, Lx1;->c:Z

    iput-boolean v3, p0, LLo;->b:Z

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "SavedStateRegistry was already attached."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Restarter must be created only during owner\'s initialization stage"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 3

    iget-boolean v0, p0, LLo;->b:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, LLo;->d()V

    :cond_0
    iget-object v0, p0, LLo;->c:Ljava/lang/Object;

    check-cast v0, Lxn;

    invoke-interface {v0}, LDg;->getLifecycle()Lwg;

    move-result-object v0

    check-cast v0, LFg;

    iget-object v1, v0, LFg;->c:Lug;

    sget-object v2, Lug;->d:Lug;

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    const/4 v2, 0x1

    if-ltz v1, :cond_1

    move v1, v2

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    xor-int/2addr v1, v2

    if-eqz v1, :cond_5

    iget-object v0, p0, LLo;->d:Ljava/lang/Object;

    check-cast v0, Lx1;

    iget-boolean v1, v0, Lx1;->c:Z

    if-eqz v1, :cond_4

    iget-boolean v1, v0, Lx1;->d:Z

    xor-int/2addr v1, v2

    if-eqz v1, :cond_3

    if-eqz p1, :cond_2

    const-string v1, "androidx.lifecycle.BundlableSavedStateRegistry.key"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    iput-object p1, v0, Lx1;->a:Landroid/os/Parcelable;

    iput-boolean v2, v0, Lx1;->d:Z

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "SavedStateRegistry was already restored."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "You must call performAttach() before calling performRestore(Bundle)."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "performRestore cannot be called when owner is "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, LFg;->c:Lug;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public f(Landroid/os/Bundle;)V
    .locals 4

    const-string v0, "outBundle"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, LLo;->d:Ljava/lang/Object;

    check-cast v0, Lx1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iget-object v2, v0, Lx1;->a:Landroid/os/Parcelable;

    check-cast v2, Landroid/os/Bundle;

    if-eqz v2, :cond_0

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    :cond_0
    iget-object v0, v0, Lx1;->f:Ljava/lang/Object;

    check-cast v0, Lon;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lmn;

    invoke-direct {v2, v0}, Lmn;-><init>(Lon;)V

    iget-object v0, v0, Lon;->c:Ljava/util/WeakHashMap;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v2, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    invoke-virtual {v2}, Lmn;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v2}, Lmn;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwn;

    invoke-interface {v0}, Lwn;->a()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v1, v3, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "androidx.lifecycle.BundlableSavedStateRegistry.key"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_2
    return-void
.end method

.method public g()V
    .locals 3

    iget-object v0, p0, LLo;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/Set;

    invoke-static {v0}, LQr;->e(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lxm;

    invoke-interface {v1}, Lxm;->j()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {v1}, Lxm;->l()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {v1}, Lxm;->clear()V

    iget-boolean v2, p0, LLo;->b:Z

    if-nez v2, :cond_1

    invoke-interface {v1}, Lxm;->f()V

    goto :goto_0

    :cond_1
    iget-object v2, p0, LLo;->d:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashSet;

    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-void
.end method

.method public get()Ljava/lang/Object;
    .locals 3

    iget-boolean v0, p0, LLo;->b:Z

    if-nez v0, :cond_0

    const-string v0, "Glide registry"

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, LLo;->b:Z

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, LLo;->c:Ljava/lang/Object;

    check-cast v1, Lcom/bumptech/glide/a;

    iget-object v2, p0, LLo;->d:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-static {v1, v2}, LUd;->o(Lcom/bumptech/glide/a;Ljava/util/List;)Lsm;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v0, p0, LLo;->b:Z

    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-object v1

    :catchall_0
    move-exception v1

    iput-boolean v0, p0, LLo;->b:Z

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you\'re using the provided Registry rather calling glide.getRegistry()!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, LLo;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{numRequests="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LLo;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isPaused="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, LLo;->b:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method
