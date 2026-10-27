.class public final LMe;
.super Liq;
.source "SourceFile"


# instance fields
.field public final synthetic e:LNe;

.field public final synthetic f:Z

.field public final synthetic g:Lco;


# direct methods
.method public constructor <init>(Ljava/lang/String;LNe;Lco;)V
    .locals 0

    iput-object p2, p0, LMe;->e:LNe;

    const/4 p2, 0x0

    iput-boolean p2, p0, LMe;->f:Z

    iput-object p3, p0, LMe;->g:Lco;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Liq;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 13

    iget-object v0, p0, LMe;->e:LNe;

    iget-boolean v1, p0, LMe;->f:Z

    iget-object v2, p0, LMe;->g:Lco;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "settings"

    invoke-static {v3, v2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v3, Lom;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Lom;-><init>(I)V

    iget-object v4, v0, LNe;->b:LTe;

    iget-object v4, v4, LTe;->y:Lbf;

    monitor-enter v4

    :try_start_0
    iget-object v5, v0, LNe;->b:LTe;

    monitor-enter v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v6, v0, LNe;->b:LTe;

    iget-object v6, v6, LTe;->s:Lco;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Lco;

    invoke-direct {v1}, Lco;-><init>()V

    invoke-virtual {v1, v6}, Lco;->b(Lco;)V

    invoke-virtual {v1, v2}, Lco;->b(Lco;)V

    move-object v2, v1

    :goto_0
    iput-object v2, v3, Lom;->b:Ljava/lang/Object;

    invoke-virtual {v2}, Lco;->a()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v6}, Lco;->a()I

    move-result v6

    int-to-long v6, v6

    sub-long/2addr v1, v6

    const-wide/16 v6, 0x0

    cmp-long v8, v1, v6

    const/4 v9, 0x0

    if-eqz v8, :cond_3

    iget-object v8, v0, LNe;->b:LTe;

    iget-object v8, v8, LTe;->c:Ljava/util/LinkedHashMap;

    invoke-interface {v8}, Ljava/util/Map;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_1

    goto :goto_1

    :cond_1
    iget-object v8, v0, LNe;->b:LTe;

    iget-object v8, v8, LTe;->c:Ljava/util/LinkedHashMap;

    invoke-virtual {v8}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v8

    new-array v10, v9, [Laf;

    invoke-interface {v8, v10}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_2

    check-cast v8, [Laf;

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_5

    :cond_2
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "null cannot be cast to non-null type kotlin.Array<T>"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_1
    const/4 v8, 0x0

    :goto_2
    iget-object v10, v0, LNe;->b:LTe;

    iget-object v11, v3, Lom;->b:Ljava/lang/Object;

    check-cast v11, Lco;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v12, "<set-?>"

    invoke-static {v12, v11}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v11, v10, LTe;->s:Lco;

    iget-object v10, v0, LNe;->b:LTe;

    iget-object v10, v10, LTe;->k:Ljq;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v12, v0, LNe;->b:LTe;

    iget-object v12, v12, LTe;->d:Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, " onSettings"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    new-instance v12, LLe;

    invoke-direct {v12, v11, v0, v3}, LLe;-><init>(Ljava/lang/String;LNe;Lom;)V

    invoke-virtual {v10, v12, v6, v7}, Ljq;->c(Liq;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    iget-object v5, v0, LNe;->b:LTe;

    iget-object v5, v5, LTe;->y:Lbf;

    iget-object v3, v3, Lom;->b:Ljava/lang/Object;

    check-cast v3, Lco;

    invoke-virtual {v5, v3}, Lbf;->n(Lco;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    goto :goto_6

    :catch_0
    move-exception v3

    :try_start_4
    iget-object v0, v0, LNe;->b:LTe;

    const/4 v5, 0x2

    invoke-virtual {v0, v5, v5, v3}, LTe;->n(IILjava/io/IOException;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_3
    monitor-exit v4

    check-cast v8, [Laf;

    if-eqz v8, :cond_5

    array-length v0, v8

    :goto_4
    if-ge v9, v0, :cond_5

    aget-object v3, v8, v9

    monitor-enter v3

    :try_start_5
    iget-wide v4, v3, Laf;->d:J

    add-long/2addr v4, v1

    iput-wide v4, v3, Laf;->d:J

    cmp-long v4, v1, v6

    if-lez v4, :cond_4

    invoke-virtual {v3}, Ljava/lang/Object;->notifyAll()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :cond_4
    monitor-exit v3

    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    :catchall_2
    move-exception v0

    monitor-exit v3

    throw v0

    :cond_5
    const-wide/16 v0, -0x1

    return-wide v0

    :goto_5
    :try_start_6
    monitor-exit v5

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :goto_6
    monitor-exit v4

    throw v0
.end method
