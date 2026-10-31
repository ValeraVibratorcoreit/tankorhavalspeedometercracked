.class public final Lbf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final g:Ljava/util/logging/Logger;


# instance fields
.field public final a:LL4;

.field public b:I

.field public c:Z

.field public final d:Lye;

.field public final e:LO4;

.field public final f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, LHe;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lbf;->g:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(LO4;Z)V
    .locals 1

    const-string v0, "sink"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbf;->e:LO4;

    iput-boolean p2, p0, Lbf;->f:Z

    new-instance p1, LL4;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbf;->a:LL4;

    const/16 p2, 0x4000

    iput p2, p0, Lbf;->b:I

    new-instance p2, Lye;

    invoke-direct {p2, p1}, Lye;-><init>(LL4;)V

    iput-object p2, p0, Lbf;->d:Lye;

    return-void
.end method


# virtual methods
.method public final declared-synchronized A(II)V
    .locals 3

    monitor-enter p0

    :try_start_0
    const-string v0, "errorCode"

    invoke-static {p2, v0}, LVo;->j(ILjava/lang/String;)V

    iget-boolean v0, p0, Lbf;->c:Z

    if-nez v0, :cond_1

    invoke-static {p2}, LVo;->o(I)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x4

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-virtual {p0, p1, v0, v1, v2}, Lbf;->x(IIII)V

    iget-object p1, p0, Lbf;->e:LO4;

    invoke-static {p2}, LVo;->o(I)I

    move-result p2

    invoke-interface {p1, p2}, LO4;->j(I)LO4;

    iget-object p1, p0, Lbf;->e:LO4;

    invoke-interface {p1}, LO4;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    const-string p1, "Failed requirement."

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized B(JI)V
    .locals 3

    const-string v0, "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: "

    monitor-enter p0

    :try_start_0
    iget-boolean v1, p0, Lbf;->c:Z

    if-nez v1, :cond_1

    const-wide/16 v1, 0x0

    cmp-long v1, p1, v1

    if-eqz v1, :cond_0

    const-wide/32 v1, 0x7fffffff

    cmp-long v1, p1, v1

    if-gtz v1, :cond_0

    const/4 v0, 0x4

    const/16 v1, 0x8

    const/4 v2, 0x0

    invoke-virtual {p0, p3, v0, v1, v2}, Lbf;->x(IIII)V

    iget-object p3, p0, Lbf;->e:LO4;

    long-to-int p1, p1

    invoke-interface {p3, p1}, LO4;->j(I)LO4;

    iget-object p1, p0, Lbf;->e:LO4;

    invoke-interface {p1}, LO4;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit p0

    throw p1
.end method

.method public final C(JI)V
    .locals 5

    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_1

    iget v2, p0, Lbf;->b:I

    int-to-long v2, v2

    invoke-static {v2, v3, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    sub-long/2addr p1, v2

    long-to-int v4, v2

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const/4 v0, 0x4

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_1
    const/16 v1, 0x9

    invoke-virtual {p0, p3, v4, v1, v0}, Lbf;->x(IIII)V

    iget-object v0, p0, Lbf;->e:LO4;

    iget-object v1, p0, Lbf;->a:LL4;

    invoke-interface {v0, v1, v2, v3}, LMo;->d(LL4;J)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final declared-synchronized close()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lbf;->c:Z

    iget-object v0, p0, Lbf;->e:LO4;

    invoke-interface {v0}, LMo;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized flush()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lbf;->c:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lbf;->e:LO4;

    invoke-interface {v0}, LO4;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized n(Lco;)V
    .locals 5

    monitor-enter p0

    :try_start_0
    const-string v0, "peerSettings"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iget-boolean v0, p0, Lbf;->c:Z

    if-nez v0, :cond_7

    iget v0, p0, Lbf;->b:I

    iget v1, p1, Lco;->a:I

    and-int/lit8 v2, v1, 0x20

    if-eqz v2, :cond_0

    iget-object v0, p1, Lco;->b:[I

    const/4 v2, 0x5

    aget v0, v0, v2

    :cond_0
    iput v0, p0, Lbf;->b:I

    and-int/lit8 v0, v1, 0x2

    const/4 v2, -0x1

    const/4 v3, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p1, Lco;->b:[I

    aget v0, v0, v3

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    const/4 v4, 0x0

    if-eq v0, v2, :cond_6

    iget-object v0, p0, Lbf;->d:Lye;

    and-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_2

    iget-object p1, p1, Lco;->b:[I

    aget v2, p1, v3

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 p1, 0x4000

    invoke-static {v2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iget v1, v0, Lye;->c:I

    if-ne v1, p1, :cond_3

    goto :goto_1

    :cond_3
    if-ge p1, v1, :cond_4

    iget v1, v0, Lye;->a:I

    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    move-result v1

    iput v1, v0, Lye;->a:I

    :cond_4
    iput-boolean v3, v0, Lye;->b:Z

    iput p1, v0, Lye;->c:I

    iget v1, v0, Lye;->g:I

    if-ge p1, v1, :cond_6

    if-nez p1, :cond_5

    iget-object p1, v0, Lye;->d:[Lre;

    array-length v1, p1

    invoke-static {p1, v4, v1}, Lf3;->S([Ljava/lang/Object;II)V

    iget-object p1, v0, Lye;->d:[Lre;

    array-length p1, p1

    sub-int/2addr p1, v3

    iput p1, v0, Lye;->e:I

    iput v4, v0, Lye;->f:I

    iput v4, v0, Lye;->g:I

    goto :goto_1

    :cond_5
    sub-int/2addr v1, p1

    invoke-virtual {v0, v1}, Lye;->a(I)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_6
    :goto_1
    const/4 p1, 0x4

    invoke-virtual {p0, v4, v4, p1, v3}, Lbf;->x(IIII)V

    iget-object p1, p0, Lbf;->e:LO4;

    invoke-interface {p1}, LO4;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_7
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_2
    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized w(ZILL4;I)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lbf;->c:Z

    if-nez v0, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p0, p2, p4, v0, p1}, Lbf;->x(IIII)V

    if-lez p4, :cond_0

    invoke-static {p3}, LTf;->f(Ljava/lang/Object;)V

    int-to-long p1, p4

    iget-object p4, p0, Lbf;->e:LO4;

    invoke-interface {p4, p3, p1, p2}, LMo;->d(LL4;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final x(IIII)V
    .locals 2

    sget-object v0, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    sget-object v1, Lbf;->g:Ljava/util/logging/Logger;

    invoke-virtual {v1, v0}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-static {v0, p1, p2, p3, p4}, LHe;->a(ZIIII)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_0
    iget v0, p0, Lbf;->b:I

    if-gt p2, v0, :cond_2

    const-wide v0, 0x80000000L

    long-to-int v0, v0

    and-int/2addr v0, p1

    if-nez v0, :cond_1

    sget-object v0, LRr;->a:[B

    iget-object v0, p0, Lbf;->e:LO4;

    const-string v1, "$this$writeMedium"

    invoke-static {v1, v0}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    ushr-int/lit8 v1, p2, 0x10

    and-int/lit16 v1, v1, 0xff

    invoke-interface {v0, v1}, LO4;->q(I)LO4;

    ushr-int/lit8 v1, p2, 0x8

    and-int/lit16 v1, v1, 0xff

    invoke-interface {v0, v1}, LO4;->q(I)LO4;

    and-int/lit16 p2, p2, 0xff

    invoke-interface {v0, p2}, LO4;->q(I)LO4;

    and-int/lit16 p2, p3, 0xff

    invoke-interface {v0, p2}, LO4;->q(I)LO4;

    and-int/lit16 p2, p4, 0xff

    invoke-interface {v0, p2}, LO4;->q(I)LO4;

    const p2, 0x7fffffff

    and-int/2addr p1, p2

    invoke-interface {v0, p1}, LO4;->j(I)LO4;

    return-void

    :cond_1
    const-string p2, "reserved bit set: "

    invoke-static {p1, p2}, LVo;->e(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p3, "FRAME_SIZE_ERROR length > "

    invoke-direct {p1, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p3, p0, Lbf;->b:I

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p3, ": "

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final declared-synchronized y(II[B)V
    .locals 3

    monitor-enter p0

    :try_start_0
    const-string v0, "errorCode"

    invoke-static {p2, v0}, LVo;->j(ILjava/lang/String;)V

    iget-boolean v0, p0, Lbf;->c:Z

    if-nez v0, :cond_3

    invoke-static {p2}, LVo;->o(I)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_2

    array-length v0, p3

    add-int/lit8 v0, v0, 0x8

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v1, v2}, Lbf;->x(IIII)V

    iget-object v0, p0, Lbf;->e:LO4;

    invoke-interface {v0, p1}, LO4;->j(I)LO4;

    iget-object p1, p0, Lbf;->e:LO4;

    invoke-static {p2}, LVo;->o(I)I

    move-result p2

    invoke-interface {p1, p2}, LO4;->j(I)LO4;

    array-length p1, p3

    const/4 p2, 0x1

    if-nez p1, :cond_0

    move v2, p2

    :cond_0
    xor-int/lit8 p1, v2, 0x1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lbf;->e:LO4;

    invoke-interface {p1, p3}, LO4;->c([B)LO4;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    iget-object p1, p0, Lbf;->e:LO4;

    invoke-interface {p1}, LO4;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_2
    :try_start_1
    const-string p1, "errorCode.httpCode == -1"

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_1
    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized z(IIZ)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lbf;->c:Z

    if-nez v0, :cond_0

    const/16 v0, 0x8

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v1, p3}, Lbf;->x(IIII)V

    iget-object p3, p0, Lbf;->e:LO4;

    invoke-interface {p3, p1}, LO4;->j(I)LO4;

    iget-object p1, p0, Lbf;->e:LO4;

    invoke-interface {p1, p2}, LO4;->j(I)LO4;

    iget-object p1, p0, Lbf;->e:LO4;

    invoke-interface {p1}, LO4;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit p0

    throw p1
.end method
