.class public final LCn;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:[B

.field public b:I

.field public c:I

.field public d:Z

.field public final e:Z

.field public f:LCn;

.field public g:LCn;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x2000

    new-array v0, v0, [B

    iput-object v0, p0, LCn;->a:[B

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, LCn;->e:Z

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, LCn;->d:Z

    return-void
.end method

.method public constructor <init>([BIIZ)V
    .locals 1

    const-string v0, "data"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCn;->a:[B

    .line 5
    iput p2, p0, LCn;->b:I

    .line 6
    iput p3, p0, LCn;->c:I

    .line 7
    iput-boolean p4, p0, LCn;->d:Z

    const/4 p1, 0x0

    .line 8
    iput-boolean p1, p0, LCn;->e:Z

    return-void
.end method


# virtual methods
.method public final a()LCn;
    .locals 4

    iget-object v0, p0, LCn;->f:LCn;

    const/4 v1, 0x0

    if-eq v0, p0, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iget-object v2, p0, LCn;->g:LCn;

    invoke-static {v2}, LTf;->f(Ljava/lang/Object;)V

    iget-object v3, p0, LCn;->f:LCn;

    iput-object v3, v2, LCn;->f:LCn;

    iget-object v2, p0, LCn;->f:LCn;

    invoke-static {v2}, LTf;->f(Ljava/lang/Object;)V

    iget-object v3, p0, LCn;->g:LCn;

    iput-object v3, v2, LCn;->g:LCn;

    iput-object v1, p0, LCn;->f:LCn;

    iput-object v1, p0, LCn;->g:LCn;

    return-object v0
.end method

.method public final b(LCn;)V
    .locals 1

    const-string v0, "segment"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p0, p1, LCn;->g:LCn;

    iget-object v0, p0, LCn;->f:LCn;

    iput-object v0, p1, LCn;->f:LCn;

    iget-object v0, p0, LCn;->f:LCn;

    invoke-static {v0}, LTf;->f(Ljava/lang/Object;)V

    iput-object p1, v0, LCn;->g:LCn;

    iput-object p1, p0, LCn;->f:LCn;

    return-void
.end method

.method public final c()LCn;
    .locals 5

    const/4 v0, 0x1

    iput-boolean v0, p0, LCn;->d:Z

    new-instance v1, LCn;

    iget v2, p0, LCn;->b:I

    iget v3, p0, LCn;->c:I

    iget-object v4, p0, LCn;->a:[B

    invoke-direct {v1, v4, v2, v3, v0}, LCn;-><init>([BIIZ)V

    return-object v1
.end method

.method public final d(LCn;I)V
    .locals 5

    const-string v0, "sink"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iget-boolean v0, p1, LCn;->e:Z

    if-eqz v0, :cond_3

    iget v0, p1, LCn;->c:I

    add-int v1, v0, p2

    iget-object v2, p1, LCn;->a:[B

    const/16 v3, 0x2000

    if-le v1, v3, :cond_2

    iget-boolean v4, p1, LCn;->d:Z

    if-nez v4, :cond_1

    iget v4, p1, LCn;->b:I

    sub-int/2addr v1, v4

    if-gt v1, v3, :cond_0

    const/4 v1, 0x0

    invoke-static {v2, v1, v4, v2, v0}, Lf3;->P([BII[BI)V

    iget v0, p1, LCn;->c:I

    iget v3, p1, LCn;->b:I

    sub-int/2addr v0, v3

    iput v0, p1, LCn;->c:I

    iput v1, p1, LCn;->b:I

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_2
    :goto_0
    iget v0, p1, LCn;->c:I

    iget v1, p0, LCn;->b:I

    add-int v3, v1, p2

    iget-object v4, p0, LCn;->a:[B

    invoke-static {v4, v0, v1, v2, v3}, Lf3;->P([BII[BI)V

    iget v0, p1, LCn;->c:I

    add-int/2addr v0, p2

    iput v0, p1, LCn;->c:I

    iget p1, p0, LCn;->b:I

    add-int/2addr p1, p2

    iput p1, p0, LCn;->b:I

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "only owner can write"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
