.class public abstract Lk6;
.super Lq6;
.source "SourceFile"


# direct methods
.method public static final w0(Ljava/lang/Iterable;Ljava/lang/StringBuilder;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lod;)V
    .locals 2

    const-string v0, "<this>"

    invoke-static {v0, p0}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "separator"

    invoke-static {v0, p2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "prefix"

    invoke-static {v0, p3}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "postfix"

    invoke-static {v0, p4}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "truncated"

    invoke-static {v0, p6}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 p3, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    add-int/lit8 p3, p3, 0x1

    const/4 v1, 0x1

    if-le p3, v1, :cond_0

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    :cond_0
    if-ltz p5, :cond_1

    if-gt p3, p5, :cond_2

    :cond_1
    invoke-static {p1, v0, p7}, LBr;->c(Ljava/lang/StringBuilder;Ljava/lang/Object;Lod;)V

    goto :goto_0

    :cond_2
    if-ltz p5, :cond_3

    if-le p3, p5, :cond_3

    invoke-virtual {p1, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    :cond_3
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    return-void
.end method

.method public static x0(Ljava/util/List;)Ljava/util/List;
    .locals 2

    const-string v0, "<this>"

    invoke-static {v0, p0}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, LUd;->R(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_1
    sget-object v0, LSa;->a:LSa;

    :goto_0
    return-object v0
.end method
