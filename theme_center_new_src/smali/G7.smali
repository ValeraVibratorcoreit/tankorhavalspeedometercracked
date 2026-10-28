.class public final LG7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lae;


# instance fields
.field public final a:Ljava/lang/Object;

.field public volatile b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v0, p0, LG7;->a:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, LG7;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lj9;
    .locals 4

    iget-object v0, p0, LG7;->b:Ljava/lang/Object;

    check-cast v0, Lj9;

    if-nez v0, :cond_7

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LG7;->b:Ljava/lang/Object;

    check-cast v0, Lj9;

    if-nez v0, :cond_5

    iget-object v0, p0, LG7;->a:Ljava/lang/Object;

    check-cast v0, Lk0;

    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;

    check-cast v0, Ld2;

    iget-object v1, v0, Ld2;->b:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    iget-object v0, v0, Ld2;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_1

    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v1, v3

    :cond_1
    :goto_0
    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    new-instance v2, Lr9;

    invoke-direct {v2, v1}, Lr9;-><init>(Ljava/io/File;)V

    :cond_4
    :goto_1
    iput-object v2, p0, LG7;->b:Ljava/lang/Object;

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_5
    :goto_2
    iget-object v0, p0, LG7;->b:Ljava/lang/Object;

    check-cast v0, Lj9;

    if-nez v0, :cond_6

    new-instance v0, Lh8;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lh8;-><init>(I)V

    iput-object v0, p0, LG7;->b:Ljava/lang/Object;

    :cond_6
    monitor-exit p0

    goto :goto_4

    :goto_3
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_7
    :goto_4
    iget-object v0, p0, LG7;->b:Ljava/lang/Object;

    check-cast v0, Lj9;

    return-object v0
.end method

.method public get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LG7;->b:Ljava/lang/Object;

    if-nez v0, :cond_1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LG7;->b:Ljava/lang/Object;

    if-nez v0, :cond_0

    iget-object v0, p0, LG7;->a:Ljava/lang/Object;

    check-cast v0, Lae;

    invoke-interface {v0}, Lae;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Argument must not be null"

    invoke-static {v1, v0}, LUd;->l(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v0, p0, LG7;->b:Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    goto :goto_2

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_2
    iget-object v0, p0, LG7;->b:Ljava/lang/Object;

    return-object v0
.end method
