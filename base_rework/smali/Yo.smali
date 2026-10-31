.class public final LYo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc8;
.implements Lb8;


# instance fields
.field public final a:Ln8;

.field public final b:Lb8;

.field public volatile c:I

.field public volatile d:LX7;

.field public volatile e:Ljava/lang/Object;

.field public volatile f:LWi;

.field public volatile g:LY7;


# direct methods
.method public constructor <init>(Ln8;Lb8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYo;->a:Ln8;

    iput-object p2, p0, LYo;->b:Lb8;

    return-void
.end method


# virtual methods
.method public final a(Lfg;Ljava/lang/Exception;La8;I)V
    .locals 1

    iget-object p4, p0, LYo;->b:Lb8;

    iget-object v0, p0, LYo;->f:LWi;

    iget-object v0, v0, LWi;->c:La8;

    invoke-interface {v0}, La8;->e()I

    move-result v0

    invoke-interface {p4, p1, p2, p3, v0}, Lb8;->a(Lfg;Ljava/lang/Exception;La8;I)V

    return-void
.end method

.method public final b()Z
    .locals 7

    iget-object v0, p0, LYo;->e:Ljava/lang/Object;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, LYo;->e:Ljava/lang/Object;

    iput-object v1, p0, LYo;->e:Ljava/lang/Object;

    :try_start_0
    invoke-virtual {p0, v0}, LYo;->e(Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_0

    return v2

    :catch_0
    move-exception v0

    const-string v3, "SourceGenerator"

    const/4 v4, 0x3

    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v4, "Failed to properly rewind or write data to cache"

    invoke-static {v3, v4, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    iget-object v0, p0, LYo;->d:LX7;

    if-eqz v0, :cond_1

    iget-object v0, p0, LYo;->d:LX7;

    invoke-virtual {v0}, LX7;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    return v2

    :cond_1
    iput-object v1, p0, LYo;->d:LX7;

    iput-object v1, p0, LYo;->f:LWi;

    const/4 v0, 0x0

    :cond_2
    :goto_0
    if-nez v0, :cond_4

    iget v1, p0, LYo;->c:I

    iget-object v3, p0, LYo;->a:Ln8;

    invoke-virtual {v3}, Ln8;->b()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_4

    iget-object v1, p0, LYo;->a:Ln8;

    invoke-virtual {v1}, Ln8;->b()Ljava/util/ArrayList;

    move-result-object v1

    iget v3, p0, LYo;->c:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, LYo;->c:I

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LWi;

    iput-object v1, p0, LYo;->f:LWi;

    iget-object v1, p0, LYo;->f:LWi;

    if-eqz v1, :cond_2

    iget-object v1, p0, LYo;->a:Ln8;

    iget-object v1, v1, Ln8;->p:Lk9;

    iget-object v3, p0, LYo;->f:LWi;

    iget-object v3, v3, LWi;->c:La8;

    invoke-interface {v3}, La8;->e()I

    move-result v3

    invoke-virtual {v1, v3}, Lk9;->c(I)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, LYo;->a:Ln8;

    iget-object v3, p0, LYo;->f:LWi;

    iget-object v3, v3, LWi;->c:La8;

    invoke-interface {v3}, La8;->a()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v1, v3}, Ln8;->c(Ljava/lang/Class;)Lfh;

    move-result-object v1

    if-eqz v1, :cond_2

    :cond_3
    iget-object v0, p0, LYo;->f:LWi;

    iget-object v1, p0, LYo;->f:LWi;

    iget-object v1, v1, LWi;->c:La8;

    iget-object v3, p0, LYo;->a:Ln8;

    iget-object v3, v3, Ln8;->o:LUk;

    new-instance v4, Ld2;

    const/16 v5, 0x1d

    const/4 v6, 0x0

    invoke-direct {v4, v5, p0, v0, v6}, Ld2;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    invoke-interface {v1, v3, v4}, La8;->d(LUk;LZ7;)V

    move v0, v2

    goto :goto_0

    :cond_4
    return v0
.end method

.method public final c(Lfg;Ljava/lang/Object;La8;ILfg;)V
    .locals 6

    iget-object v0, p0, LYo;->b:Lb8;

    iget-object p4, p0, LYo;->f:LWi;

    iget-object p4, p4, LWi;->c:La8;

    invoke-interface {p4}, La8;->e()I

    move-result v4

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p1

    invoke-interface/range {v0 .. v5}, Lb8;->c(Lfg;Ljava/lang/Object;La8;ILfg;)V

    return-void
.end method

.method public final cancel()V
    .locals 1

    iget-object v0, p0, LYo;->f:LWi;

    if-eqz v0, :cond_0

    iget-object v0, v0, LWi;->c:La8;

    invoke-interface {v0}, La8;->cancel()V

    :cond_0
    return-void
.end method

.method public final d()V
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final e(Ljava/lang/Object;)Z
    .locals 13

    const-string v0, "SourceGenerator"

    const-string v1, "Attempt to write: "

    const-string v2, "Finished encoding source to cache, key: "

    sget v3, Loh;->b:I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v3

    const/4 v5, 0x0

    :try_start_0
    iget-object v6, p0, LYo;->a:Ln8;

    iget-object v6, v6, Ln8;->c:LVd;

    invoke-virtual {v6}, LVd;->a()Lsm;

    move-result-object v6

    invoke-virtual {v6, p1}, Lsm;->g(Ljava/lang/Object;)Le8;

    move-result-object v6

    invoke-interface {v6}, Le8;->f()Ljava/lang/Object;

    move-result-object v7

    iget-object v8, p0, LYo;->a:Ln8;

    invoke-virtual {v8, v7}, Ln8;->e(Ljava/lang/Object;)LWa;

    move-result-object v8

    new-instance v9, LK2;

    iget-object v10, p0, LYo;->a:Ln8;

    iget-object v10, v10, Ln8;->i:Lrk;

    const/4 v11, 0x7

    invoke-direct {v9, v8, v7, v10, v11}, LK2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    new-instance v7, LY7;

    iget-object v10, p0, LYo;->f:LWi;

    iget-object v10, v10, LWi;->a:Lfg;

    iget-object v11, p0, LYo;->a:Ln8;

    iget-object v12, v11, Ln8;->n:Lfg;

    invoke-direct {v7, v10, v12}, LY7;-><init>(Lfg;Lfg;)V

    iget-object v10, v11, Ln8;->h:LG7;

    invoke-virtual {v10}, LG7;->a()Lj9;

    move-result-object v10

    invoke-interface {v10, v7, v9}, Lj9;->b(Lfg;LK2;)V

    const/4 v9, 0x2

    invoke-static {v0, v9}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v11, ", data: "

    if-eqz v9, :cond_0

    :try_start_1
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", encoder: "

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", duration: "

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v3, v4}, Loh;->a(J)D

    move-result-wide v2

    invoke-virtual {v9, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-interface {v10, v7}, Lj9;->c(Lfg;)Ljava/io/File;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    iput-object v7, p0, LYo;->g:LY7;

    new-instance p1, LX7;

    iget-object v0, p0, LYo;->f:LWi;

    iget-object v0, v0, LWi;->a:Lfg;

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, LYo;->a:Ln8;

    invoke-direct {p1, v0, v1, p0}, LX7;-><init>(Ljava/util/List;Ln8;Lb8;)V

    iput-object p1, p0, LYo;->d:LX7;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object p1, p0, LYo;->f:LWi;

    iget-object p1, p1, LWi;->c:La8;

    invoke-interface {p1}, La8;->c()V

    return v3

    :cond_1
    const/4 v2, 0x3

    :try_start_2
    invoke-static {v0, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, LYo;->g:LY7;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " to the disk cache failed, maybe the disk cache is disabled? Trying to decode the data directly..."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_2
    :try_start_3
    iget-object p1, p0, LYo;->b:Lb8;

    iget-object v0, p0, LYo;->f:LWi;

    iget-object v7, v0, LWi;->a:Lfg;

    invoke-interface {v6}, Le8;->f()Ljava/lang/Object;

    move-result-object v8

    iget-object v0, p0, LYo;->f:LWi;

    iget-object v9, v0, LWi;->c:La8;

    iget-object v0, p0, LYo;->f:LWi;

    iget-object v0, v0, LWi;->c:La8;

    invoke-interface {v0}, La8;->e()I

    move-result v10

    iget-object v0, p0, LYo;->f:LWi;

    iget-object v11, v0, LWi;->a:Lfg;

    move-object v6, p1

    invoke-interface/range {v6 .. v11}, Lb8;->c(Lfg;Ljava/lang/Object;La8;ILfg;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    return v5

    :catchall_1
    move-exception p1

    move v5, v3

    :goto_1
    if-nez v5, :cond_3

    iget-object v0, p0, LYo;->f:LWi;

    iget-object v0, v0, LWi;->c:La8;

    invoke-interface {v0}, La8;->c()V

    :cond_3
    throw p1
.end method
