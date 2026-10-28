.class public final LX7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc8;
.implements LZ7;


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Ln8;

.field public final c:Lb8;

.field public d:I

.field public e:Lfg;

.field public f:Ljava/util/List;

.field public g:I

.field public volatile h:LWi;

.field public i:Ljava/io/File;


# direct methods
.method public constructor <init>(Ljava/util/List;Ln8;Lb8;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, LX7;->d:I

    iput-object p1, p0, LX7;->a:Ljava/util/List;

    iput-object p2, p0, LX7;->b:Ln8;

    iput-object p3, p0, LX7;->c:Lb8;

    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 7

    :cond_0
    :goto_0
    iget-object v0, p0, LX7;->f:Ljava/util/List;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    iget v3, p0, LX7;->g:I

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_3

    const/4 v0, 0x0

    iput-object v0, p0, LX7;->h:LWi;

    :cond_1
    :goto_1
    if-nez v2, :cond_2

    iget v0, p0, LX7;->g:I

    iget-object v3, p0, LX7;->f:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_2

    iget-object v0, p0, LX7;->f:Ljava/util/List;

    iget v3, p0, LX7;->g:I

    add-int/lit8 v4, v3, 0x1

    iput v4, p0, LX7;->g:I

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXi;

    iget-object v3, p0, LX7;->i:Ljava/io/File;

    iget-object v4, p0, LX7;->b:Ln8;

    iget v5, v4, Ln8;->e:I

    iget v6, v4, Ln8;->f:I

    iget-object v4, v4, Ln8;->i:Lrk;

    invoke-interface {v0, v3, v5, v6, v4}, LXi;->b(Ljava/lang/Object;IILrk;)LWi;

    move-result-object v0

    iput-object v0, p0, LX7;->h:LWi;

    iget-object v0, p0, LX7;->h:LWi;

    if-eqz v0, :cond_1

    iget-object v0, p0, LX7;->b:Ln8;

    iget-object v3, p0, LX7;->h:LWi;

    iget-object v3, v3, LWi;->c:La8;

    invoke-interface {v3}, La8;->a()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v0, v3}, Ln8;->c(Ljava/lang/Class;)Lfh;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LX7;->h:LWi;

    iget-object v0, v0, LWi;->c:La8;

    iget-object v2, p0, LX7;->b:Ln8;

    iget-object v2, v2, Ln8;->o:LUk;

    invoke-interface {v0, v2, p0}, La8;->d(LUk;LZ7;)V

    move v2, v1

    goto :goto_1

    :cond_2
    return v2

    :cond_3
    iget v0, p0, LX7;->d:I

    add-int/2addr v0, v1

    iput v0, p0, LX7;->d:I

    iget-object v1, p0, LX7;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lt v0, v1, :cond_4

    return v2

    :cond_4
    iget-object v0, p0, LX7;->a:Ljava/util/List;

    iget v1, p0, LX7;->d:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfg;

    new-instance v1, LY7;

    iget-object v3, p0, LX7;->b:Ln8;

    iget-object v4, v3, Ln8;->n:Lfg;

    invoke-direct {v1, v0, v4}, LY7;-><init>(Lfg;Lfg;)V

    iget-object v3, v3, Ln8;->h:LG7;

    invoke-virtual {v3}, LG7;->a()Lj9;

    move-result-object v3

    invoke-interface {v3, v1}, Lj9;->c(Lfg;)Ljava/io/File;

    move-result-object v1

    iput-object v1, p0, LX7;->i:Ljava/io/File;

    if-eqz v1, :cond_0

    iput-object v0, p0, LX7;->e:Lfg;

    iget-object v0, p0, LX7;->b:Ln8;

    iget-object v0, v0, Ln8;->c:LVd;

    invoke-virtual {v0}, LVd;->a()Lsm;

    move-result-object v0

    invoke-virtual {v0, v1}, Lsm;->f(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LX7;->f:Ljava/util/List;

    iput v2, p0, LX7;->g:I

    goto/16 :goto_0
.end method

.method public final cancel()V
    .locals 1

    iget-object v0, p0, LX7;->h:LWi;

    if-eqz v0, :cond_0

    iget-object v0, v0, LWi;->c:La8;

    invoke-interface {v0}, La8;->cancel()V

    :cond_0
    return-void
.end method

.method public final h(Ljava/lang/Exception;)V
    .locals 4

    iget-object v0, p0, LX7;->c:Lb8;

    iget-object v1, p0, LX7;->e:Lfg;

    iget-object v2, p0, LX7;->h:LWi;

    iget-object v2, v2, LWi;->c:La8;

    const/4 v3, 0x3

    invoke-interface {v0, v1, p1, v2, v3}, Lb8;->a(Lfg;Ljava/lang/Exception;La8;I)V

    return-void
.end method

.method public final m(Ljava/lang/Object;)V
    .locals 6

    iget-object v0, p0, LX7;->c:Lb8;

    iget-object v1, p0, LX7;->e:Lfg;

    iget-object v2, p0, LX7;->h:LWi;

    iget-object v3, v2, LWi;->c:La8;

    const/4 v4, 0x3

    iget-object v5, p0, LX7;->e:Lfg;

    move-object v2, p1

    invoke-interface/range {v0 .. v5}, Lb8;->c(Lfg;Ljava/lang/Object;La8;ILfg;)V

    return-void
.end method
