.class public final LFm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# static fields
.field public static final e:Lmh;


# instance fields
.field public volatile a:LEm;

.field public final b:Lmh;

.field public final c:Lbd;

.field public final d:Ld2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lmh;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lmh;-><init>(I)V

    sput-object v0, LFm;->e:Lmh;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LFm;->e:Lmh;

    iput-object v0, p0, LFm;->b:Lmh;

    new-instance v1, Ld2;

    invoke-direct {v1, v0}, Ld2;-><init>(Lmh;)V

    iput-object v1, p0, LFm;->d:Ld2;

    sget-boolean v0, Lpe;->f:Z

    if-eqz v0, :cond_1

    sget-boolean v0, Lpe;->e:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, LYb;

    invoke-direct {v0}, LYb;-><init>()V

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v0, Lh8;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lh8;-><init>(I)V

    :goto_1
    iput-object v0, p0, LFm;->c:Lbd;

    return-void
.end method

.method public static a(Landroid/content/Context;)Landroid/app/Activity;
    .locals 1

    instance-of v0, p0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    check-cast p0, Landroid/app/Activity;

    return-object p0

    :cond_0
    instance-of v0, p0, Landroid/content/ContextWrapper;

    if-eqz v0, :cond_1

    check-cast p0, Landroid/content/ContextWrapper;

    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, LFm;->a(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final b(Landroid/content/Context;)LEm;
    .locals 7

    if-eqz p1, :cond_b

    sget-object v0, LQr;->a:[C

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_8

    instance-of v0, p1, Landroid/app/Application;

    if-nez v0, :cond_8

    instance-of v0, p1, Lq1;

    if-eqz v0, :cond_7

    check-cast p1, Lq1;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    xor-int/2addr v0, v3

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1}, LFm;->b(Landroid/content/Context;)LEm;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, LFm;->c:Lbd;

    invoke-interface {v0, p1}, Lbd;->a(Landroid/app/Activity;)V

    invoke-static {p1}, LFm;->a(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    move v2, v3

    :cond_3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bumptech/glide/a;->a(Landroid/content/Context;)Lcom/bumptech/glide/a;

    move-result-object v0

    invoke-virtual {p1}, Lq1;->v()LOc;

    move-result-object v1

    iget-object v3, p0, LFm;->d:Ld2;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LQr;->a()V

    iget-object v4, p1, LP6;->a:LFg;

    invoke-static {}, LQr;->a()V

    iget-object v5, v3, Ld2;->b:Ljava/lang/Object;

    check-cast v5, Ljava/util/HashMap;

    invoke-virtual {v5, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LEm;

    if-nez v5, :cond_5

    new-instance v5, LAg;

    invoke-direct {v5, v4}, LAg;-><init>(Lwg;)V

    new-instance v6, Lh8;

    invoke-direct {v6, v3, v1}, Lh8;-><init>(Ld2;LOc;)V

    iget-object v1, v3, Ld2;->c:Ljava/lang/Object;

    check-cast v1, Lmh;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, LEm;

    invoke-direct {v1, v0, v5, v6, p1}, LEm;-><init>(Lcom/bumptech/glide/a;Lvg;Lh8;Landroid/content/Context;)V

    iget-object p1, v3, Ld2;->b:Ljava/lang/Object;

    check-cast p1, Ljava/util/HashMap;

    invoke-virtual {p1, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, LGg;

    invoke-direct {p1, v3, v4}, LGg;-><init>(Ld2;Lwg;)V

    invoke-virtual {v5, p1}, LAg;->g(LBg;)V

    if-eqz v2, :cond_4

    invoke-virtual {v1}, LEm;->j()V

    :cond_4
    move-object p1, v1

    goto :goto_1

    :cond_5
    move-object p1, v5

    :goto_1
    return-object p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "You cannot start a load for a destroyed activity"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    instance-of v0, p1, Landroid/content/ContextWrapper;

    if-eqz v0, :cond_8

    move-object v0, p1

    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p0, p1}, LFm;->b(Landroid/content/Context;)LEm;

    move-result-object p1

    return-object p1

    :cond_8
    iget-object v0, p0, LFm;->a:LEm;

    if-nez v0, :cond_a

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LFm;->a:LEm;

    if-nez v0, :cond_9

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bumptech/glide/a;->a(Landroid/content/Context;)Lcom/bumptech/glide/a;

    move-result-object v0

    iget-object v1, p0, LFm;->b:Lmh;

    new-instance v2, Lpa;

    const/16 v3, 0xf

    invoke-direct {v2, v3}, Lpa;-><init>(I)V

    new-instance v3, Lh8;

    const/16 v4, 0x9

    invoke-direct {v3, v4}, Lh8;-><init>(I)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, LEm;

    invoke-direct {v1, v0, v2, v3, p1}, LEm;-><init>(Lcom/bumptech/glide/a;Lvg;Lh8;Landroid/content/Context;)V

    iput-object v1, p0, LFm;->a:LEm;

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_9
    :goto_2
    monitor-exit p0

    goto :goto_4

    :goto_3
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_a
    :goto_4
    iget-object p1, p0, LFm;->a:LEm;

    return-object p1

    :cond_b
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "You cannot start a load on a null Context"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
