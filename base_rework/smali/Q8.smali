.class public final LQ8;
.super LTd;
.source "SourceFile"


# instance fields
.field public final h:Ljava/lang/Object;

.field public volatile i:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LQ8;->h:Ljava/lang/Object;

    new-instance v0, LP8;

    invoke-direct {v0}, LP8;-><init>()V

    const/4 v1, 0x4

    invoke-static {v1, v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    return-void
.end method
