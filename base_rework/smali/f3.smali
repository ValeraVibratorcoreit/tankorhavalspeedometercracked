.class public abstract Lf3;
.super Lmk;
.source "SourceFile"


# direct methods
.method public static P([BII[BI)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {v0, p0}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "destination"

    invoke-static {v0, p3}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    sub-int/2addr p4, p2

    invoke-static {p0, p2, p3, p1, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public static final Q([Ljava/lang/Object;[Ljava/lang/Object;III)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {v0, p0}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "destination"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    sub-int/2addr p4, p3

    invoke-static {p0, p3, p1, p2, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public static R(II[B)[B
    .locals 2

    const-string v0, "<this>"

    invoke-static {v0, p2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    array-length v0, p2

    if-gt p1, v0, :cond_0

    invoke-static {p2, p0, p1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p0

    const-string p1, "copyOfRange(this, fromIndex, toIndex)"

    invoke-static {p1, p0}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "toIndex ("

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") is greater than size ("

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static S([Ljava/lang/Object;II)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {v0, p0}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    return-void
.end method

.method public static T([Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p0, v2

    if-eqz v3, :cond_0

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static U([C)C
    .locals 2

    array-length v0, p0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    aget-char p0, p0, v0

    return p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Array has more than one element."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/util/NoSuchElementException;

    const-string v0, "Array is empty."

    invoke-direct {p0, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
