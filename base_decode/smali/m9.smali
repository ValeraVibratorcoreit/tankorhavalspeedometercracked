.class public final Lm9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lq9;


# direct methods
.method public constructor <init>(Lq9;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm9;->a:Lq9;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lm9;->a:Lq9;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lm9;->a:Lq9;

    iget-object v2, v1, Lq9;->i:Ljava/io/BufferedWriter;

    if-nez v2, :cond_0

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Lq9;->I()V

    iget-object v1, p0, Lm9;->a:Lq9;

    invoke-virtual {v1}, Lq9;->B()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lm9;->a:Lq9;

    invoke-virtual {v1}, Lq9;->G()V

    iget-object v1, p0, Lm9;->a:Lq9;

    const/4 v2, 0x0

    iput v2, v1, Lq9;->k:I

    :cond_1
    monitor-exit v0

    :goto_0
    const/4 v0, 0x0

    return-object v0

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
