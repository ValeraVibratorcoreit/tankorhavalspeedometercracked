.class public final Lo9;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LG7;LIo;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, LKo;

    invoke-direct {v0, p0}, LKo;-><init>(Lo9;)V

    iput-object v0, p0, Lo9;->d:Ljava/lang/Object;

    .line 3
    iput-object p1, p0, Lo9;->c:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, Lo9;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lq9;Lp9;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo9;->d:Ljava/lang/Object;

    .line 6
    iput-object p2, p0, Lo9;->b:Ljava/lang/Object;

    .line 7
    iget-boolean p2, p2, Lp9;->e:Z

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 8
    :cond_0
    iget p1, p1, Lq9;->g:I

    .line 9
    new-array p1, p1, [Z

    :goto_0
    iput-object p1, p0, Lo9;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lo9;->d:Ljava/lang/Object;

    check-cast v0, Lq9;

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Lq9;->n(Lq9;Lo9;Z)V

    return-void
.end method

.method public b()Ljava/io/File;
    .locals 5

    iget-object v0, p0, Lo9;->d:Ljava/lang/Object;

    check-cast v0, Lq9;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lo9;->b:Ljava/lang/Object;

    check-cast v1, Lp9;

    iget-object v2, v1, Lp9;->f:Lo9;

    if-ne v2, p0, :cond_1

    iget-boolean v2, v1, Lp9;->e:Z

    const/4 v3, 0x0

    if-nez v2, :cond_0

    iget-object v2, p0, Lo9;->c:Ljava/lang/Object;

    check-cast v2, [Z

    const/4 v4, 0x1

    aput-boolean v4, v2, v3

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v1, v1, Lp9;->d:[Ljava/io/File;

    aget-object v1, v1, v3

    iget-object v2, p0, Lo9;->d:Ljava/lang/Object;

    check-cast v2, Lq9;

    iget-object v2, v2, Lq9;->a:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    monitor-exit v0

    return-object v1

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1}, Ljava/lang/IllegalStateException;-><init>()V

    throw v1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
