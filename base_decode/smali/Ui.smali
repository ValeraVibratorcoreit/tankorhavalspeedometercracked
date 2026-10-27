.class public final LUi;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Ljava/util/ArrayDeque;


# instance fields
.field public a:I

.field public b:I

.field public c:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, LQr;->a:[C

    new-instance v0, Ljava/util/ArrayDeque;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V

    sput-object v0, LUi;->d:Ljava/util/ArrayDeque;

    return-void
.end method

.method public static a(Ljava/lang/Object;)LUi;
    .locals 2

    sget-object v0, LUi;->d:Ljava/util/ArrayDeque;

    monitor-enter v0

    :try_start_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LUi;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    new-instance v1, LUi;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    :cond_0
    iput-object p0, v1, LUi;->c:Ljava/lang/Object;

    const/4 p0, 0x0

    iput p0, v1, LUi;->b:I

    iput p0, v1, LUi;->a:I

    return-object v1

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, LUi;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, LUi;

    iget v0, p0, LUi;->b:I

    iget v2, p1, LUi;->b:I

    if-ne v0, v2, :cond_0

    iget v0, p0, LUi;->a:I

    iget v2, p1, LUi;->a:I

    if-ne v0, v2, :cond_0

    iget-object v0, p0, LUi;->c:Ljava/lang/Object;

    iget-object p1, p1, LUi;->c:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, LUi;->a:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LUi;->b:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LUi;->c:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
