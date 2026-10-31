.class public final LIl;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public final b:LDl;

.field public final c:Ljava/util/List;

.field public final d:I

.field public final e:Lsb;

.field public final f:LT1;

.field public final g:I

.field public final h:I

.field public final i:I


# direct methods
.method public constructor <init>(LDl;Ljava/util/List;ILsb;LT1;III)V
    .locals 1

    const-string v0, "call"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "interceptors"

    invoke-static {v0, p2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "request"

    invoke-static {v0, p5}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIl;->b:LDl;

    iput-object p2, p0, LIl;->c:Ljava/util/List;

    iput p3, p0, LIl;->d:I

    iput-object p4, p0, LIl;->e:Lsb;

    iput-object p5, p0, LIl;->f:LT1;

    iput p6, p0, LIl;->g:I

    iput p7, p0, LIl;->h:I

    iput p8, p0, LIl;->i:I

    return-void
.end method

.method public static a(LIl;ILsb;LT1;I)LIl;
    .locals 9

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    iget p1, p0, LIl;->d:I

    :cond_0
    move v3, p1

    and-int/lit8 p1, p4, 0x2

    if-eqz p1, :cond_1

    iget-object p2, p0, LIl;->e:Lsb;

    :cond_1
    move-object v4, p2

    and-int/lit8 p1, p4, 0x4

    if-eqz p1, :cond_2

    iget-object p3, p0, LIl;->f:LT1;

    :cond_2
    move-object v5, p3

    iget v6, p0, LIl;->g:I

    iget v7, p0, LIl;->h:I

    iget v8, p0, LIl;->i:I

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, "request"

    invoke-static {p1, v5}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance p1, LIl;

    iget-object v1, p0, LIl;->b:LDl;

    iget-object v2, p0, LIl;->c:Ljava/util/List;

    move-object v0, p1

    invoke-direct/range {v0 .. v8}, LIl;-><init>(LDl;Ljava/util/List;ILsb;LT1;III)V

    return-object p1
.end method


# virtual methods
.method public final b(LT1;)Ldn;
    .locals 9

    const-string v0, "request"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, LIl;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    iget v2, p0, LIl;->d:I

    if-ge v2, v1, :cond_7

    iget v1, p0, LIl;->a:I

    const/4 v3, 0x1

    add-int/2addr v1, v3

    iput v1, p0, LIl;->a:I

    const-string v1, " must call proceed() exactly once"

    iget-object v4, p0, LIl;->e:Lsb;

    const-string v5, "network interceptor "

    if-eqz v4, :cond_2

    iget-object v6, p1, LT1;->c:Ljava/lang/Object;

    check-cast v6, Lgf;

    iget-object v7, v4, Lsb;->e:Lub;

    invoke-virtual {v7, v6}, Lub;->b(Lgf;)Z

    move-result v6

    if-eqz v6, :cond_1

    iget v6, p0, LIl;->a:I

    if-ne v6, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sub-int/2addr v2, v3

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LRf;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sub-int/2addr v2, v3

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LRf;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " must retain the same host and port"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    add-int/lit8 v6, v2, 0x1

    const/16 v7, 0x3a

    const/4 v8, 0x0

    invoke-static {p0, v6, v8, p1, v7}, LIl;->a(LIl;ILsb;LT1;I)LIl;

    move-result-object p1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LRf;

    invoke-interface {v2, p1}, LRf;->a(LIl;)Ldn;

    move-result-object v7

    const-string v8, "interceptor "

    if-eqz v7, :cond_6

    if-eqz v4, :cond_4

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v6, v0, :cond_4

    iget p1, p1, LIl;->a:I

    if-ne p1, v3, :cond_3

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_1
    iget-object p1, v7, Ldn;->g:LJl;

    if-eqz p1, :cond_5

    return-object v7

    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " returned a response with no body"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " returned null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
