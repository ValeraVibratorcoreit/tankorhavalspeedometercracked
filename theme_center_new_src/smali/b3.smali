.class public final Lb3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LGh;

.field public b:LGh;

.field public c:LIh;

.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lb3;->d:I

    iput-object p1, p0, Lb3;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static j(Ljava/util/Set;Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ljava/util/Set;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Ljava/util/Set;

    :try_start_0
    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result v1

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v3

    if-ne v1, v3, :cond_1

    invoke-interface {p0, p1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    return v0

    :catch_0
    :cond_2
    return v2
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget v0, p0, Lb3;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb3;->e:Ljava/lang/Object;

    check-cast v0, Le3;

    invoke-virtual {v0}, Le3;->clear()V

    return-void

    :pswitch_0
    iget-object v0, p0, Lb3;->e:Ljava/lang/Object;

    check-cast v0, Lc3;

    invoke-virtual {v0}, LFo;->clear()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(II)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lb3;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object p2, p0, Lb3;->e:Ljava/lang/Object;

    check-cast p2, Le3;

    iget-object p2, p2, Le3;->b:[Ljava/lang/Object;

    aget-object p1, p2, p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lb3;->e:Ljava/lang/Object;

    check-cast v0, Lc3;

    iget-object v0, v0, LFo;->b:[Ljava/lang/Object;

    shl-int/lit8 p1, p1, 0x1

    add-int/2addr p1, p2

    aget-object p1, v0, p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c()Ljava/util/Map;
    .locals 2

    iget v0, p0, Lb3;->d:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "not a map"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, Lb3;->e:Ljava/lang/Object;

    check-cast v0, Lc3;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lb3;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb3;->e:Ljava/lang/Object;

    check-cast v0, Le3;

    iget v0, v0, Le3;->c:I

    return v0

    :pswitch_0
    iget-object v0, p0, Lb3;->e:Ljava/lang/Object;

    check-cast v0, Lc3;

    iget v0, v0, LFo;->c:I

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Ljava/lang/Object;)I
    .locals 1

    iget v0, p0, Lb3;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb3;->e:Ljava/lang/Object;

    check-cast v0, Le3;

    invoke-virtual {v0, p1}, Le3;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1

    :pswitch_0
    iget-object v0, p0, Lb3;->e:Ljava/lang/Object;

    check-cast v0, Lc3;

    invoke-virtual {v0, p1}, LFo;->e(Ljava/lang/Object;)I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Ljava/lang/Object;)I
    .locals 1

    iget v0, p0, Lb3;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb3;->e:Ljava/lang/Object;

    check-cast v0, Le3;

    invoke-virtual {v0, p1}, Le3;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1

    :pswitch_0
    iget-object v0, p0, Lb3;->e:Ljava/lang/Object;

    check-cast v0, Lc3;

    invoke-virtual {v0, p1}, LFo;->g(Ljava/lang/Object;)I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lb3;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object p2, p0, Lb3;->e:Ljava/lang/Object;

    check-cast p2, Le3;

    invoke-virtual {p2, p1}, Le3;->add(Ljava/lang/Object;)Z

    return-void

    :pswitch_0
    iget-object v0, p0, Lb3;->e:Ljava/lang/Object;

    check-cast v0, Lc3;

    invoke-virtual {v0, p1, p2}, LFo;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h(I)V
    .locals 1

    iget v0, p0, Lb3;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lb3;->e:Ljava/lang/Object;

    check-cast v0, Le3;

    invoke-virtual {v0, p1}, Le3;->e(I)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lb3;->e:Ljava/lang/Object;

    check-cast v0, Lc3;

    invoke-virtual {v0, p1}, LFo;->j(I)Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final i(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lb3;->d:I

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "not a map"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, Lb3;->e:Ljava/lang/Object;

    check-cast v0, Lc3;

    invoke-virtual {v0, p1, p2}, LFo;->k(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final k(I[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0}, Lb3;->d()I

    move-result v0

    array-length v1, p2

    if-ge v1, v0, :cond_0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p2

    invoke-static {p2, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/Object;

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p0, v1, p1}, Lb3;->b(II)Ljava/lang/Object;

    move-result-object v2

    aput-object v2, p2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    array-length p1, p2

    if-le p1, v0, :cond_2

    const/4 p1, 0x0

    aput-object p1, p2, v0

    :cond_2
    return-object p2
.end method
