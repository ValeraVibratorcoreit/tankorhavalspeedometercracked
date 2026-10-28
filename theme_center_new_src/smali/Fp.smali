.class public abstract LFp;
.super LBr;
.source "SourceFile"


# direct methods
.method public static B0(Ljava/lang/String;)Ljava/lang/String;
    .locals 14

    const-string v0, "<this>"

    invoke-static {v0, p0}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "|"

    invoke-static {v0}, LMp;->L0(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    if-eqz v1, :cond_d

    const-string v1, "\r\n"

    const-string v3, "\n"

    const-string v4, "\r"

    filled-new-array {v1, v3, v4}, [Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    invoke-static {v3}, LMp;->R0(I)V

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v4, "asList(this)"

    invoke-static {v4, v1}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v4, LU8;

    new-instance v5, LLp;

    const/4 v6, 0x1

    invoke-direct {v5, v1, v3, v6}, LLp;-><init>(Ljava/lang/Object;ZI)V

    invoke-direct {v4, p0, v3, v3, v5}, LU8;-><init>(Ljava/lang/CharSequence;IILLp;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, LFn;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LPf;

    const-string v6, "it"

    invoke-static {v6, v5}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iget v6, v5, LNf;->b:I

    add-int/2addr v6, v2

    iget v5, v5, LNf;->a:I

    invoke-interface {p0, v5, v6}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v1}, Ll6;->t0(Ljava/util/ArrayList;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    invoke-interface {v1}, Ljava/util/List;->size()I

    invoke-static {v1}, Ll6;->s0(Ljava/util/List;)I

    move-result v4

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v6, v3

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v8, v6, 0x1

    if-ltz v6, :cond_b

    check-cast v7, Ljava/lang/String;

    const/4 v9, 0x0

    if-eqz v6, :cond_1

    if-ne v6, v4, :cond_2

    :cond_1
    invoke-static {v7}, LMp;->L0(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    :goto_2
    move-object v7, v9

    goto :goto_8

    :cond_2
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v6

    move v10, v3

    :goto_3
    const/4 v11, -0x1

    if-ge v10, v6, :cond_6

    invoke-virtual {v7, v10}, Ljava/lang/String;->charAt(I)C

    move-result v12

    invoke-static {v12}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v13

    if-nez v13, :cond_4

    invoke-static {v12}, Ljava/lang/Character;->isSpaceChar(C)Z

    move-result v12

    if-eqz v12, :cond_3

    goto :goto_4

    :cond_3
    move v12, v3

    goto :goto_5

    :cond_4
    :goto_4
    move v12, v2

    :goto_5
    xor-int/2addr v12, v2

    if-eqz v12, :cond_5

    goto :goto_6

    :cond_5
    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    :cond_6
    move v10, v11

    :goto_6
    if-ne v10, v11, :cond_7

    goto :goto_7

    :cond_7
    invoke-static {v7, v0, v10, v3}, LMp;->T0(Ljava/lang/String;Ljava/lang/String;IZ)Z

    move-result v6

    if-eqz v6, :cond_8

    add-int/2addr v10, v2

    invoke-virtual {v7, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v9

    const-string v6, "this as java.lang.String).substring(startIndex)"

    invoke-static {v6, v9}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_8
    :goto_7
    if-eqz v9, :cond_9

    goto :goto_2

    :cond_9
    :goto_8
    if-eqz v7, :cond_a

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_a
    move v6, v8

    goto :goto_1

    :cond_b
    new-instance p0, Ljava/lang/ArithmeticException;

    const-string v0, "Index overflow has happened."

    invoke-direct {p0, v0}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_c
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v11, "..."

    const/4 v12, 0x0

    const-string v7, "\n"

    const-string v9, ""

    const/4 v10, -0x1

    move-object v6, v0

    move-object v8, v9

    invoke-static/range {v5 .. v12}, Lk6;->w0(Ljava/lang/Iterable;Ljava/lang/StringBuilder;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lod;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "mapIndexedNotNull { inde\u2026\"\\n\")\n        .toString()"

    invoke-static {v0, p0}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-object p0

    :cond_d
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "marginPrefix must be non-blank string."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
