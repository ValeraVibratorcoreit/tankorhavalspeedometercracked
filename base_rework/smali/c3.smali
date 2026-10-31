.class public Lc3;
.super LFo;
.source "SourceFile"

# interfaces
.implements Ljava/util/Map;


# instance fields
.field public h:Lb3;


# direct methods
.method public constructor <init>(Lc3;)V
    .locals 0

    invoke-direct {p0}, LFo;-><init>()V

    invoke-virtual {p0, p1}, LFo;->i(LFo;)V

    return-void
.end method


# virtual methods
.method public final entrySet()Ljava/util/Set;
    .locals 3

    iget-object v0, p0, Lc3;->h:Lb3;

    if-nez v0, :cond_0

    new-instance v0, Lb3;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lb3;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lc3;->h:Lb3;

    :cond_0
    iget-object v0, p0, Lc3;->h:Lb3;

    iget-object v1, v0, Lb3;->a:LGh;

    if-nez v1, :cond_1

    new-instance v1, LGh;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, LGh;-><init>(Lb3;I)V

    iput-object v1, v0, Lb3;->a:LGh;

    :cond_1
    iget-object v0, v0, Lb3;->a:LGh;

    return-object v0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 3

    iget-object v0, p0, Lc3;->h:Lb3;

    if-nez v0, :cond_0

    new-instance v0, Lb3;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lb3;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lc3;->h:Lb3;

    :cond_0
    iget-object v0, p0, Lc3;->h:Lb3;

    iget-object v1, v0, Lb3;->b:LGh;

    if-nez v1, :cond_1

    new-instance v1, LGh;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, LGh;-><init>(Lb3;I)V

    iput-object v1, v0, Lb3;->b:LGh;

    :cond_1
    iget-object v0, v0, Lb3;->b:LGh;

    return-object v0
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 2

    iget v0, p0, LFo;->c:I

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, LFo;->b(I)V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, LFo;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final values()Ljava/util/Collection;
    .locals 2

    iget-object v0, p0, Lc3;->h:Lb3;

    if-nez v0, :cond_0

    new-instance v0, Lb3;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lb3;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lc3;->h:Lb3;

    :cond_0
    iget-object v0, p0, Lc3;->h:Lb3;

    iget-object v1, v0, Lb3;->c:LIh;

    if-nez v1, :cond_1

    new-instance v1, LIh;

    invoke-direct {v1, v0}, LIh;-><init>(Lb3;)V

    iput-object v1, v0, Lb3;->c:LIh;

    :cond_1
    iget-object v0, v0, Lb3;->c:LIh;

    return-object v0
.end method
