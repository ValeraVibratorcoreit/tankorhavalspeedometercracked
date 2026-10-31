.class public abstract LNt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LVt;

.field public b:[LHf;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, LVt;

    invoke-direct {v0}, LVt;-><init>()V

    invoke-direct {p0, v0}, LNt;-><init>(LVt;)V

    return-void
.end method

.method public constructor <init>(LVt;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LNt;->a:LVt;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, LNt;->b:[LHf;

    if-eqz v0, :cond_4

    const/4 v1, 0x0

    aget-object v1, v0, v1

    const/4 v2, 0x1

    aget-object v0, v0, v2

    iget-object v3, p0, LNt;->a:LVt;

    if-nez v0, :cond_0

    iget-object v0, v3, LVt;->a:LTt;

    const/4 v4, 0x2

    invoke-virtual {v0, v4}, LTt;->f(I)LHf;

    move-result-object v0

    :cond_0
    if-nez v1, :cond_1

    iget-object v1, v3, LVt;->a:LTt;

    invoke-virtual {v1, v2}, LTt;->f(I)LHf;

    move-result-object v1

    :cond_1
    invoke-static {v1, v0}, LHf;->a(LHf;LHf;)LHf;

    move-result-object v0

    invoke-virtual {p0, v0}, LNt;->g(LHf;)V

    iget-object v0, p0, LNt;->b:[LHf;

    const/4 v1, 0x4

    aget-object v0, v0, v1

    if-eqz v0, :cond_2

    invoke-virtual {p0, v0}, LNt;->f(LHf;)V

    :cond_2
    iget-object v0, p0, LNt;->b:[LHf;

    const/4 v1, 0x5

    aget-object v0, v0, v1

    if-eqz v0, :cond_3

    invoke-virtual {p0, v0}, LNt;->d(LHf;)V

    :cond_3
    iget-object v0, p0, LNt;->b:[LHf;

    const/4 v1, 0x6

    aget-object v0, v0, v1

    if-eqz v0, :cond_4

    invoke-virtual {p0, v0}, LNt;->h(LHf;)V

    :cond_4
    return-void
.end method

.method public abstract b()LVt;
.end method

.method public c(ILHf;)V
    .locals 7

    iget-object v0, p0, LNt;->b:[LHf;

    if-nez v0, :cond_0

    const/16 v0, 0x9

    new-array v0, v0, [LHf;

    iput-object v0, p0, LNt;->b:[LHf;

    :cond_0
    const/4 v0, 0x1

    move v1, v0

    :goto_0
    const/16 v2, 0x100

    if-gt v1, v2, :cond_b

    and-int v3, p1, v1

    if-nez v3, :cond_1

    goto :goto_2

    :cond_1
    iget-object v3, p0, LNt;->b:[LHf;

    if-eq v1, v0, :cond_9

    const/4 v4, 0x2

    if-eq v1, v4, :cond_8

    const/4 v5, 0x4

    if-eq v1, v5, :cond_a

    const/16 v4, 0x8

    if-eq v1, v4, :cond_7

    const/16 v6, 0x10

    if-eq v1, v6, :cond_6

    const/16 v5, 0x20

    if-eq v1, v5, :cond_5

    const/16 v5, 0x40

    if-eq v1, v5, :cond_4

    const/16 v5, 0x80

    if-eq v1, v5, :cond_3

    if-ne v1, v2, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "type needs to be >= FIRST and <= LAST, type="

    invoke-static {v1, p2}, LVo;->e(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    const/4 v4, 0x7

    goto :goto_1

    :cond_4
    const/4 v4, 0x6

    goto :goto_1

    :cond_5
    const/4 v4, 0x5

    goto :goto_1

    :cond_6
    move v4, v5

    goto :goto_1

    :cond_7
    const/4 v4, 0x3

    goto :goto_1

    :cond_8
    move v4, v0

    goto :goto_1

    :cond_9
    const/4 v4, 0x0

    :cond_a
    :goto_1
    aput-object p2, v3, v4

    :goto_2
    shl-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_b
    return-void
.end method

.method public d(LHf;)V
    .locals 0

    return-void
.end method

.method public abstract e(LHf;)V
.end method

.method public f(LHf;)V
    .locals 0

    return-void
.end method

.method public abstract g(LHf;)V
.end method

.method public h(LHf;)V
    .locals 0

    return-void
.end method
