.class public final LHc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public final b:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public c:Ldd;

.field public final synthetic d:LOc;


# direct methods
.method public constructor <init>(LOc;)V
    .locals 0

    iput-object p1, p0, LHc;->d:LOc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, LHc;->a:Z

    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, LHc;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-void
.end method
