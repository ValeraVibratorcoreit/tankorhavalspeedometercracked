.class public final Lvp;
.super LTf;
.source "SourceFile"


# static fields
.field public static final k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile _state:Ljava/lang/Object;

.field public j:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Ljava/lang/Object;

    const-string v1, "_state"

    const-class v2, Lvp;

    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v0

    sput-object v0, Lvp;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvp;->_state:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final c0(Ljava/lang/Object;)V
    .locals 2

    if-nez p1, :cond_0

    sget-object p1, LUd;->c:Lmh;

    :cond_0
    monitor-enter p0

    :try_start_0
    sget-object v0, Lvp;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, p1}, LTf;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v1, :cond_1

    monitor-exit p0

    goto :goto_2

    :cond_1
    :try_start_1
    invoke-virtual {v0, p0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    iget p1, p0, Lvp;->j:I

    and-int/lit8 v0, p1, 0x1

    if-nez v0, :cond_3

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lvp;->j:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit p0

    :goto_0
    monitor-enter p0

    :try_start_2
    iget v0, p0, Lvp;->j:I

    if-ne v0, p1, :cond_2

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lvp;->j:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_2
    monitor-exit p0

    move p1, v0

    goto :goto_0

    :goto_1
    monitor-exit p0

    throw p1

    :catchall_1
    move-exception p1

    goto :goto_3

    :cond_3
    add-int/lit8 p1, p1, 0x2

    :try_start_3
    iput p1, p0, Lvp;->j:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit p0

    :goto_2
    return-void

    :goto_3
    monitor-exit p0

    throw p1
.end method
