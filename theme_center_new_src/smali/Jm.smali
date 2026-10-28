.class public final LJm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc8;
.implements LZ7;


# instance fields
.field public final a:Lb8;

.field public final b:Ln8;

.field public c:I

.field public d:I

.field public e:Lfg;

.field public f:Ljava/util/List;

.field public g:I

.field public volatile h:LWi;

.field public i:Ljava/io/File;

.field public j:LKm;


# direct methods
.method public constructor <init>(Ln8;Lb8;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, LJm;->d:I

    iput-object p1, p0, LJm;->b:Ln8;

    iput-object p2, p0, LJm;->a:Lb8;

    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 15

    iget-object v0, p0, LJm;->b:Ln8;

    invoke-virtual {v0}, Ln8;->a()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return v2

    :cond_0
    iget-object v1, p0, LJm;->b:Ln8;

    invoke-virtual {v1}, Ln8;->d()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v0, p0, LJm;->b:Ln8;

    iget-object v0, v0, Ln8;->k:Ljava/lang/Class;

    const-class v1, Ljava/io/File;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to find any load path from "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, LJm;->b:Ln8;

    iget-object v2, v2, Ln8;->d:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LJm;->b:Ln8;

    iget-object v2, v2, Ln8;->k:Ljava/lang/Class;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    iget-object v3, p0, LJm;->f:Ljava/util/List;

    const/4 v4, 0x1

    if-eqz v3, :cond_5

    iget v5, p0, LJm;->g:I

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v5, v3, :cond_5

    const/4 v0, 0x0

    iput-object v0, p0, LJm;->h:LWi;

    :cond_3
    :goto_1
    if-nez v2, :cond_4

    iget v0, p0, LJm;->g:I

    iget-object v1, p0, LJm;->f:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_4

    iget-object v0, p0, LJm;->f:Ljava/util/List;

    iget v1, p0, LJm;->g:I

    add-int/lit8 v3, v1, 0x1

    iput v3, p0, LJm;->g:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXi;

    iget-object v1, p0, LJm;->i:Ljava/io/File;

    iget-object v3, p0, LJm;->b:Ln8;

    iget v5, v3, Ln8;->e:I

    iget v6, v3, Ln8;->f:I

    iget-object v3, v3, Ln8;->i:Lrk;

    invoke-interface {v0, v1, v5, v6, v3}, LXi;->b(Ljava/lang/Object;IILrk;)LWi;

    move-result-object v0

    iput-object v0, p0, LJm;->h:LWi;

    iget-object v0, p0, LJm;->h:LWi;

    if-eqz v0, :cond_3

    iget-object v0, p0, LJm;->b:Ln8;

    iget-object v1, p0, LJm;->h:LWi;

    iget-object v1, v1, LWi;->c:La8;

    invoke-interface {v1}, La8;->a()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ln8;->c(Ljava/lang/Class;)Lfh;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, LJm;->h:LWi;

    iget-object v0, v0, LWi;->c:La8;

    iget-object v1, p0, LJm;->b:Ln8;

    iget-object v1, v1, Ln8;->o:LUk;

    invoke-interface {v0, v1, p0}, La8;->d(LUk;LZ7;)V

    move v2, v4

    goto :goto_1

    :cond_4
    return v2

    :cond_5
    iget v3, p0, LJm;->d:I

    add-int/2addr v3, v4

    iput v3, p0, LJm;->d:I

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    if-lt v3, v5, :cond_7

    iget v3, p0, LJm;->c:I

    add-int/2addr v3, v4

    iput v3, p0, LJm;->c:I

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-lt v3, v4, :cond_6

    return v2

    :cond_6
    iput v2, p0, LJm;->d:I

    :cond_7
    iget v3, p0, LJm;->c:I

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lfg;

    iget v4, p0, LJm;->d:I

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v11, v4

    check-cast v11, Ljava/lang/Class;

    iget-object v4, p0, LJm;->b:Ln8;

    invoke-virtual {v4, v11}, Ln8;->f(Ljava/lang/Class;)Lfr;

    move-result-object v10

    new-instance v13, LKm;

    iget-object v14, p0, LJm;->b:Ln8;

    iget-object v4, v14, Ln8;->c:LVd;

    iget-object v5, v4, LVd;->a:Luh;

    iget-object v7, v14, Ln8;->n:Lfg;

    iget v8, v14, Ln8;->e:I

    iget v9, v14, Ln8;->f:I

    iget-object v12, v14, Ln8;->i:Lrk;

    move-object v4, v13

    move-object v6, v3

    invoke-direct/range {v4 .. v12}, LKm;-><init>(Luh;Lfg;Lfg;IILfr;Ljava/lang/Class;Lrk;)V

    iput-object v13, p0, LJm;->j:LKm;

    iget-object v4, v14, Ln8;->h:LG7;

    invoke-virtual {v4}, LG7;->a()Lj9;

    move-result-object v4

    iget-object v5, p0, LJm;->j:LKm;

    invoke-interface {v4, v5}, Lj9;->c(Lfg;)Ljava/io/File;

    move-result-object v4

    iput-object v4, p0, LJm;->i:Ljava/io/File;

    if-eqz v4, :cond_2

    iput-object v3, p0, LJm;->e:Lfg;

    iget-object v3, p0, LJm;->b:Ln8;

    iget-object v3, v3, Ln8;->c:LVd;

    invoke-virtual {v3}, LVd;->a()Lsm;

    move-result-object v3

    invoke-virtual {v3, v4}, Lsm;->f(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    iput-object v3, p0, LJm;->f:Ljava/util/List;

    iput v2, p0, LJm;->g:I

    goto/16 :goto_0
.end method

.method public final cancel()V
    .locals 1

    iget-object v0, p0, LJm;->h:LWi;

    if-eqz v0, :cond_0

    iget-object v0, v0, LWi;->c:La8;

    invoke-interface {v0}, La8;->cancel()V

    :cond_0
    return-void
.end method

.method public final h(Ljava/lang/Exception;)V
    .locals 4

    iget-object v0, p0, LJm;->a:Lb8;

    iget-object v1, p0, LJm;->j:LKm;

    iget-object v2, p0, LJm;->h:LWi;

    iget-object v2, v2, LWi;->c:La8;

    const/4 v3, 0x4

    invoke-interface {v0, v1, p1, v2, v3}, Lb8;->a(Lfg;Ljava/lang/Exception;La8;I)V

    return-void
.end method

.method public final m(Ljava/lang/Object;)V
    .locals 6

    iget-object v0, p0, LJm;->a:Lb8;

    iget-object v1, p0, LJm;->e:Lfg;

    iget-object v2, p0, LJm;->h:LWi;

    iget-object v3, v2, LWi;->c:La8;

    const/4 v4, 0x4

    iget-object v5, p0, LJm;->j:LKm;

    move-object v2, p1

    invoke-interface/range {v0 .. v5}, Lb8;->c(Lfg;Ljava/lang/Object;La8;ILfg;)V

    return-void
.end method
