.class public final Lh7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/util/HashSet;

.field public b:I

.field public c:Z

.field public final d:Lv7;

.field public final e:I

.field public f:Lh7;

.field public g:I

.field public h:I

.field public i:LWo;


# direct methods
.method public constructor <init>(Lv7;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lh7;->a:Ljava/util/HashSet;

    const/4 v0, 0x0

    iput v0, p0, Lh7;->g:I

    const/high16 v0, -0x80000000

    iput v0, p0, Lh7;->h:I

    iput-object p1, p0, Lh7;->d:Lv7;

    iput p2, p0, Lh7;->e:I

    return-void
.end method


# virtual methods
.method public final a(Lh7;I)V
    .locals 2

    const/high16 v0, -0x80000000

    const/4 v1, 0x0

    invoke-virtual {p0, p1, p2, v0, v1}, Lh7;->b(Lh7;IIZ)Z

    return-void
.end method

.method public final b(Lh7;IIZ)Z
    .locals 1

    const/4 v0, 0x1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lh7;->j()V

    return v0

    :cond_0
    if-nez p4, :cond_1

    invoke-virtual {p0, p1}, Lh7;->i(Lh7;)Z

    move-result p4

    if-nez p4, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    iput-object p1, p0, Lh7;->f:Lh7;

    iget-object p4, p1, Lh7;->a:Ljava/util/HashSet;

    if-nez p4, :cond_2

    new-instance p4, Ljava/util/HashSet;

    invoke-direct {p4}, Ljava/util/HashSet;-><init>()V

    iput-object p4, p1, Lh7;->a:Ljava/util/HashSet;

    :cond_2
    iget-object p1, p0, Lh7;->f:Lh7;

    iget-object p1, p1, Lh7;->a:Ljava/util/HashSet;

    if-eqz p1, :cond_3

    invoke-virtual {p1, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_3
    iput p2, p0, Lh7;->g:I

    iput p3, p0, Lh7;->h:I

    return v0
.end method

.method public final c(ILst;Ljava/util/ArrayList;)V
    .locals 2

    iget-object v0, p0, Lh7;->a:Ljava/util/HashSet;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh7;

    iget-object v1, v1, Lh7;->d:Lv7;

    invoke-static {v1, p1, p3, p2}, LF4;->z(Lv7;ILjava/util/ArrayList;Lst;)Lst;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final d()I
    .locals 1

    iget-boolean v0, p0, Lh7;->c:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, p0, Lh7;->b:I

    return v0
.end method

.method public final e()I
    .locals 3

    iget-object v0, p0, Lh7;->d:Lv7;

    iget v0, v0, Lv7;->g0:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    iget v0, p0, Lh7;->h:I

    const/high16 v2, -0x80000000

    if-eq v0, v2, :cond_1

    iget-object v2, p0, Lh7;->f:Lh7;

    if-eqz v2, :cond_1

    iget-object v2, v2, Lh7;->d:Lv7;

    iget v2, v2, Lv7;->g0:I

    if-ne v2, v1, :cond_1

    return v0

    :cond_1
    iget v0, p0, Lh7;->g:I

    return v0
.end method

.method public final f()Lh7;
    .locals 3

    iget v0, p0, Lh7;->e:I

    invoke-static {v0}, LVo;->o(I)I

    move-result v1

    iget-object v2, p0, Lh7;->d:Lv7;

    packed-switch v1, :pswitch_data_0

    new-instance v1, Ljava/lang/AssertionError;

    invoke-static {v0}, LVo;->n(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    :pswitch_0
    iget-object v0, v2, Lv7;->J:Lh7;

    return-object v0

    :pswitch_1
    iget-object v0, v2, Lv7;->I:Lh7;

    return-object v0

    :pswitch_2
    iget-object v0, v2, Lv7;->L:Lh7;

    return-object v0

    :pswitch_3
    iget-object v0, v2, Lv7;->K:Lh7;

    return-object v0

    :pswitch_4
    const/4 v0, 0x0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method

.method public final g()Z
    .locals 3

    iget-object v0, p0, Lh7;->a:Ljava/util/HashSet;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh7;

    invoke-virtual {v2}, Lh7;->f()Lh7;

    move-result-object v2

    invoke-virtual {v2}, Lh7;->h()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_2
    return v1
.end method

.method public final h()Z
    .locals 1

    iget-object v0, p0, Lh7;->f:Lh7;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final i(Lh7;)Z
    .locals 10

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x6

    iget v2, p0, Lh7;->e:I

    const/4 v3, 0x1

    iget-object v4, p1, Lh7;->d:Lv7;

    iget p1, p1, Lh7;->e:I

    if-ne p1, v2, :cond_3

    if-ne v2, v1, :cond_2

    iget-boolean p1, v4, Lv7;->E:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lh7;->d:Lv7;

    iget-boolean p1, p1, Lv7;->E:Z

    if-nez p1, :cond_2

    :cond_1
    return v0

    :cond_2
    return v3

    :cond_3
    invoke-static {v2}, LVo;->o(I)I

    move-result v5

    const/16 v6, 0x8

    const/16 v7, 0x9

    const/4 v8, 0x4

    const/4 v9, 0x2

    packed-switch v5, :pswitch_data_0

    new-instance p1, Ljava/lang/AssertionError;

    invoke-static {v2}, LVo;->n(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :pswitch_0
    if-eq p1, v1, :cond_4

    if-eq p1, v6, :cond_4

    if-eq p1, v7, :cond_4

    move v0, v3

    :cond_4
    return v0

    :pswitch_1
    if-eq p1, v9, :cond_6

    if-ne p1, v8, :cond_5

    goto :goto_0

    :cond_5
    return v3

    :cond_6
    :goto_0
    return v0

    :pswitch_2
    const/4 v1, 0x3

    if-eq p1, v1, :cond_8

    const/4 v1, 0x5

    if-ne p1, v1, :cond_7

    goto :goto_1

    :cond_7
    move v1, v0

    goto :goto_2

    :cond_8
    :goto_1
    move v1, v3

    :goto_2
    instance-of v2, v4, Lee;

    if-eqz v2, :cond_b

    if-nez v1, :cond_9

    if-ne p1, v7, :cond_a

    :cond_9
    move v0, v3

    :cond_a
    move v1, v0

    :cond_b
    return v1

    :pswitch_3
    if-eq p1, v9, :cond_d

    if-ne p1, v8, :cond_c

    goto :goto_3

    :cond_c
    move v1, v0

    goto :goto_4

    :cond_d
    :goto_3
    move v1, v3

    :goto_4
    instance-of v2, v4, Lee;

    if-eqz v2, :cond_10

    if-nez v1, :cond_e

    if-ne p1, v6, :cond_f

    :cond_e
    move v0, v3

    :cond_f
    move v1, v0

    :cond_10
    return v1

    :pswitch_4
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_4
        :pswitch_4
    .end packed-switch
.end method

.method public final j()V
    .locals 2

    iget-object v0, p0, Lh7;->f:Lh7;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v0, Lh7;->a:Ljava/util/HashSet;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Lh7;->f:Lh7;

    iget-object v0, v0, Lh7;->a:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lh7;->f:Lh7;

    iput-object v1, v0, Lh7;->a:Ljava/util/HashSet;

    :cond_0
    iput-object v1, p0, Lh7;->a:Ljava/util/HashSet;

    iput-object v1, p0, Lh7;->f:Lh7;

    const/4 v0, 0x0

    iput v0, p0, Lh7;->g:I

    const/high16 v1, -0x80000000

    iput v1, p0, Lh7;->h:I

    iput-boolean v0, p0, Lh7;->c:Z

    iput v0, p0, Lh7;->b:I

    return-void
.end method

.method public final k()V
    .locals 2

    iget-object v0, p0, Lh7;->i:LWo;

    if-nez v0, :cond_0

    new-instance v0, LWo;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LWo;-><init>(I)V

    iput-object v0, p0, Lh7;->i:LWo;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LWo;->c()V

    :goto_0
    return-void
.end method

.method public final l(I)V
    .locals 0

    iput p1, p0, Lh7;->b:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lh7;->c:Z

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lh7;->d:Lv7;

    iget-object v1, v1, Lv7;->h0:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lh7;->e:I

    invoke-static {v1}, LVo;->n(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
