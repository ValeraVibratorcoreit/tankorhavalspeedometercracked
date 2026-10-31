.class public final LVp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public a:Ldd;

.field public volatile b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ldd;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LVp;->a:Ldd;

    sget-object p1, Lpa;->l:Lpa;

    iput-object p1, p0, LVp;->b:Ljava/lang/Object;

    iput-object p0, p0, LVp;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LVp;->b:Ljava/lang/Object;

    sget-object v1, Lpa;->l:Lpa;

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, LVp;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v2, p0, LVp;->b:Ljava/lang/Object;

    if-eq v2, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, LVp;->a:Ldd;

    invoke-static {v1}, LTf;->f(Ljava/lang/Object;)V

    invoke-interface {v1}, Ldd;->a()Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, LVp;->b:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, p0, LVp;->a:Ldd;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, LVp;->b:Ljava/lang/Object;

    sget-object v1, Lpa;->l:Lpa;

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, LVp;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, "Lazy value not initialized yet."

    :goto_0
    return-object v0
.end method
