.class public final LDm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ6;


# instance fields
.field public final a:LLo;

.field public final synthetic b:LEm;


# direct methods
.method public constructor <init>(LEm;LLo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDm;->b:LEm;

    iput-object p2, p0, LDm;->a:LLo;

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object p1, p0, LDm;->b:LEm;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, LDm;->a:LLo;

    invoke-virtual {v0}, LLo;->g()V

    monitor-exit p1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_0
    :goto_0
    return-void
.end method
