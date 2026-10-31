.class public final Lnh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LIm;
.implements LIb;


# static fields
.field public static final e:LK2;


# instance fields
.field public final a:Lwp;

.field public b:LIm;

.field public c:Z

.field public d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lmh;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lmh;-><init>(I)V

    const/16 v1, 0x14

    invoke-static {v1, v0}, LBr;->s0(ILHb;)LK2;

    move-result-object v0

    sput-object v0, Lnh;->e:LK2;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lwp;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lnh;->a:Lwp;

    return-void
.end method


# virtual methods
.method public final declared-synchronized a()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lnh;->a:Lwp;

    invoke-virtual {v0}, Lwp;->a()V

    iget-boolean v0, p0, Lnh;->c:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnh;->c:Z

    iget-boolean v0, p0, Lnh;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lnh;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already unlocked"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method public final b()Lwp;
    .locals 1

    iget-object v0, p0, Lnh;->a:Lwp;

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget-object v0, p0, Lnh;->b:LIm;

    invoke-interface {v0}, LIm;->c()I

    move-result v0

    return v0
.end method

.method public final d()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lnh;->b:LIm;

    invoke-interface {v0}, LIm;->d()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public final declared-synchronized e()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lnh;->a:Lwp;

    invoke-virtual {v0}, Lwp;->a()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lnh;->d:Z

    iget-boolean v0, p0, Lnh;->c:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lnh;->b:LIm;

    invoke-interface {v0}, LIm;->e()V

    const/4 v0, 0x0

    iput-object v0, p0, Lnh;->b:LIm;

    sget-object v0, Lnh;->e:LK2;

    invoke-virtual {v0, p0}, LK2;->a(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0

    throw v0
.end method

.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lnh;->b:LIm;

    invoke-interface {v0}, LIm;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
