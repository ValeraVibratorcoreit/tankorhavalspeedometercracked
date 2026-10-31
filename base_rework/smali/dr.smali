.class public final Ldr;
.super Loj;
.source "SourceFile"


# instance fields
.field public l:Z

.field public final m:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    invoke-direct {p0, p1}, Loj;-><init>(Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ldr;->l:Z

    iput-object p1, p0, Ldr;->m:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ldr;->l:Z

    invoke-super {p0, p1}, Loj;->e(Ljava/lang/Object;)V

    return-void
.end method

.method public final f(Ljava/lang/Object;)V
    .locals 4

    const/4 v0, 0x1

    iput-boolean v0, p0, Ldr;->l:Z

    iget-object v1, p0, Loj;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Loj;->f:Ljava/lang/Object;

    sget-object v3, Loj;->k:Ljava/lang/Object;

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-object p1, p0, Loj;->f:Ljava/lang/Object;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {}, LX2;->R()LX2;

    move-result-object p1

    iget-object v0, p0, Loj;->j:Lr0;

    invoke-virtual {p1, v0}, LX2;->S(Ljava/lang/Runnable;)V

    :goto_1
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
