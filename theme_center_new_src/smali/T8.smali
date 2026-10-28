.class public final LT8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Ldg;


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:LPf;

.field public e:I

.field public final synthetic f:LU8;


# direct methods
.method public constructor <init>(LU8;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LT8;->f:LU8;

    const/4 v0, -0x1

    iput v0, p0, LT8;->a:I

    iget v0, p1, LU8;->b:I

    iget-object p1, p1, LU8;->a:Ljava/lang/CharSequence;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-ltz p1, :cond_2

    if-gez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    if-le v0, p1, :cond_1

    move v0, p1

    :cond_1
    :goto_0
    iput v0, p0, LT8;->b:I

    iput v0, p0, LT8;->c:I

    return-void

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot coerce value to an empty range: maximum "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " is less than minimum 0."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final a()V
    .locals 8

    iget v0, p0, LT8;->c:I

    const/4 v1, 0x0

    if-gez v0, :cond_0

    iput v1, p0, LT8;->a:I

    const/4 v0, 0x0

    iput-object v0, p0, LT8;->d:LPf;

    goto :goto_1

    :cond_0
    iget-object v2, p0, LT8;->f:LU8;

    iget v3, v2, LU8;->c:I

    iget-object v4, v2, LU8;->a:Ljava/lang/CharSequence;

    const/4 v5, -0x1

    const/4 v6, 0x1

    if-lez v3, :cond_1

    iget v7, p0, LT8;->e:I

    add-int/2addr v7, v6

    iput v7, p0, LT8;->e:I

    if-ge v7, v3, :cond_2

    :cond_1
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-le v0, v3, :cond_3

    :cond_2
    new-instance v0, LPf;

    iget v1, p0, LT8;->b:I

    invoke-static {v4}, LMp;->G0(Ljava/lang/CharSequence;)I

    move-result v2

    invoke-direct {v0, v1, v2, v6}, LNf;-><init>(III)V

    iput-object v0, p0, LT8;->d:LPf;

    iput v5, p0, LT8;->c:I

    goto :goto_0

    :cond_3
    iget v0, p0, LT8;->c:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v2, v2, LU8;->d:LLp;

    invoke-virtual {v2, v4, v0}, LLp;->d(Ljava/lang/Object;Ljava/lang/Integer;)Lyk;

    move-result-object v0

    if-nez v0, :cond_4

    new-instance v0, LPf;

    iget v1, p0, LT8;->b:I

    invoke-static {v4}, LMp;->G0(Ljava/lang/CharSequence;)I

    move-result v2

    invoke-direct {v0, v1, v2, v6}, LNf;-><init>(III)V

    iput-object v0, p0, LT8;->d:LPf;

    iput v5, p0, LT8;->c:I

    goto :goto_0

    :cond_4
    iget-object v2, v0, Lyk;->a:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    iget-object v0, v0, Lyk;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget v3, p0, LT8;->b:I

    invoke-static {v3, v2}, LTd;->O(II)LPf;

    move-result-object v3

    iput-object v3, p0, LT8;->d:LPf;

    add-int/2addr v2, v0

    iput v2, p0, LT8;->b:I

    if-nez v0, :cond_5

    move v1, v6

    :cond_5
    add-int/2addr v2, v1

    iput v2, p0, LT8;->c:I

    :goto_0
    iput v6, p0, LT8;->a:I

    :goto_1
    return-void
.end method

.method public final hasNext()Z
    .locals 2

    iget v0, p0, LT8;->a:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, LT8;->a()V

    :cond_0
    iget v0, p0, LT8;->a:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    iget v0, p0, LT8;->a:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, LT8;->a()V

    :cond_0
    iget v0, p0, LT8;->a:I

    if-eqz v0, :cond_1

    iget-object v0, p0, LT8;->d:LPf;

    const-string v2, "null cannot be cast to non-null type kotlin.ranges.IntRange"

    invoke-static {v2, v0}, LTf;->g(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v2, 0x0

    iput-object v2, p0, LT8;->d:LPf;

    iput v1, p0, LT8;->a:I

    return-object v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
