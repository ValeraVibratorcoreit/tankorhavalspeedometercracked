.class public final LFg;
.super Lwg;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public b:LNb;

.field public c:Lug;

.field public final d:Ljava/lang/ref/WeakReference;

.field public e:I

.field public f:Z

.field public g:Z

.field public final h:Ljava/util/ArrayList;

.field public final i:Lvp;


# direct methods
.method public constructor <init>(LDg;)V
    .locals 2

    const-string v0, "provider"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, LFg;->a:Z

    new-instance v0, LNb;

    invoke-direct {v0}, LNb;-><init>()V

    iput-object v0, p0, LFg;->b:LNb;

    sget-object v0, Lug;->b:Lug;

    iput-object v0, p0, LFg;->c:Lug;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, LFg;->h:Ljava/util/ArrayList;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, LFg;->d:Ljava/lang/ref/WeakReference;

    new-instance p1, Lvp;

    invoke-direct {p1, v0}, Lvp;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, LFg;->i:Lvp;

    return-void
.end method


# virtual methods
.method public final a(LCg;)V
    .locals 10

    iget-object v0, p0, LFg;->h:Ljava/util/ArrayList;

    const/4 v1, 0x2

    const-string v2, "observer"

    invoke-static {v2, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v2, "addObserver"

    invoke-virtual {p0, v2}, LFg;->d(Ljava/lang/String;)V

    iget-object v2, p0, LFg;->c:Lug;

    sget-object v3, Lug;->a:Lug;

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    sget-object v3, Lug;->b:Lug;

    :goto_0
    new-instance v2, LEg;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    sget-object v4, LHg;->a:Ljava/util/HashMap;

    instance-of v4, p1, Lzg;

    instance-of v5, p1, LAa;

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v4, :cond_1

    if-eqz v5, :cond_1

    new-instance v1, LG8;

    move-object v4, p1

    check-cast v4, LAa;

    move-object v5, p1

    check-cast v5, Lzg;

    invoke-direct {v1, v4, v5}, LG8;-><init>(LAa;Lzg;)V

    goto :goto_1

    :cond_1
    const/4 v8, 0x0

    if-eqz v5, :cond_2

    new-instance v1, LG8;

    move-object v4, p1

    check-cast v4, LAa;

    invoke-direct {v1, v4, v8}, LG8;-><init>(LAa;Lzg;)V

    goto :goto_1

    :cond_2
    if-eqz v4, :cond_3

    move-object v1, p1

    check-cast v1, Lzg;

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-static {v4}, LHg;->b(Ljava/lang/Class;)I

    move-result v5

    if-ne v5, v1, :cond_6

    sget-object v5, LHg;->b:Ljava/util/HashMap;

    invoke-virtual {v5, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, LTf;->f(Ljava/lang/Object;)V

    check-cast v4, Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    if-eq v5, v6, :cond_5

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    new-array v9, v5, [LEd;

    if-gtz v5, :cond_4

    new-instance v4, LKl;

    invoke-direct {v4, v9, v1}, LKl;-><init>(Ljava/lang/Object;I)V

    move-object v1, v4

    goto :goto_1

    :cond_4
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Constructor;

    invoke-static {v0, p1}, LHg;->a(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V

    throw v8

    :cond_5
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/reflect/Constructor;

    invoke-static {v0, p1}, LHg;->a(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V

    throw v8

    :cond_6
    new-instance v1, LG8;

    invoke-direct {v1, p1}, LG8;-><init>(Ljava/lang/Object;)V

    :goto_1
    iput-object v1, v2, LEg;->b:Lzg;

    iput-object v3, v2, LEg;->a:Lug;

    iget-object v1, p0, LFg;->b:LNb;

    invoke-virtual {v1, p1, v2}, LNb;->c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LEg;

    if-eqz v1, :cond_7

    return-void

    :cond_7
    iget-object v1, p0, LFg;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LDg;

    if-nez v1, :cond_8

    return-void

    :cond_8
    iget v3, p0, LFg;->e:I

    if-nez v3, :cond_9

    iget-boolean v3, p0, LFg;->f:Z

    if-eqz v3, :cond_a

    :cond_9
    move v7, v6

    :cond_a
    invoke-virtual {p0, p1}, LFg;->c(LCg;)Lug;

    move-result-object v3

    iget v4, p0, LFg;->e:I

    add-int/2addr v4, v6

    iput v4, p0, LFg;->e:I

    :goto_2
    iget-object v4, v2, LEg;->a:Lug;

    invoke-virtual {v4, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v3

    if-gez v3, :cond_c

    iget-object v3, p0, LFg;->b:LNb;

    iget-object v3, v3, LNb;->e:Ljava/util/HashMap;

    invoke-virtual {v3, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_c

    iget-object v3, v2, LEg;->a:Lug;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Ltg;->Companion:Lrg;

    iget-object v4, v2, LEg;->a:Lug;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4}, Lrg;->a(Lug;)Ltg;

    move-result-object v3

    if-eqz v3, :cond_b

    invoke-virtual {v2, v1, v3}, LEg;->a(LDg;Ltg;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    sub-int/2addr v3, v6

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    invoke-virtual {p0, p1}, LFg;->c(LCg;)Lug;

    move-result-object v3

    goto :goto_2

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "no event up from "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v2, LEg;->a:Lug;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    if-nez v7, :cond_d

    invoke-virtual {p0}, LFg;->h()V

    :cond_d
    iget p1, p0, LFg;->e:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, LFg;->e:I

    return-void
.end method

.method public final b(LCg;)V
    .locals 1

    const-string v0, "observer"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "removeObserver"

    invoke-virtual {p0, v0}, LFg;->d(Ljava/lang/String;)V

    iget-object v0, p0, LFg;->b:LNb;

    invoke-virtual {v0, p1}, LNb;->b(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final c(LCg;)Lug;
    .locals 3

    iget-object v0, p0, LFg;->b:LNb;

    iget-object v0, v0, LNb;->e:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lln;

    iget-object p1, p1, Lln;->d:Lln;

    goto :goto_0

    :cond_0
    move-object p1, v2

    :goto_0
    if-eqz p1, :cond_1

    iget-object p1, p1, Lln;->b:Ljava/lang/Object;

    check-cast p1, LEg;

    if-eqz p1, :cond_1

    iget-object p1, p1, LEg;->a:Lug;

    goto :goto_1

    :cond_1
    move-object p1, v2

    :goto_1
    iget-object v0, p0, LFg;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lug;

    :cond_2
    iget-object v0, p0, LFg;->c:Lug;

    const-string v1, "state1"

    invoke-static {v1, v0}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    if-eqz p1, :cond_3

    invoke-virtual {p1, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-gez v1, :cond_3

    goto :goto_2

    :cond_3
    move-object p1, v0

    :goto_2
    if-eqz v2, :cond_4

    invoke-virtual {v2, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-gez v0, :cond_4

    goto :goto_3

    :cond_4
    move-object v2, p1

    :goto_3
    return-object v2
.end method

.method public final d(Ljava/lang/String;)V
    .locals 2

    iget-boolean v0, p0, LFg;->a:Z

    if-eqz v0, :cond_1

    invoke-static {}, LX2;->R()LX2;

    move-result-object v0

    iget-object v0, v0, LX2;->h:LQ8;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "Method "

    const-string v1, " must be called on the main thread"

    invoke-static {v0, p1, v1}, LVo;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method public final e(Ltg;)V
    .locals 1

    const-string v0, "event"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "handleLifecycleEvent"

    invoke-virtual {p0, v0}, LFg;->d(Ljava/lang/String;)V

    invoke-virtual {p1}, Ltg;->a()Lug;

    move-result-object p1

    invoke-virtual {p0, p1}, LFg;->f(Lug;)V

    return-void
.end method

.method public final f(Lug;)V
    .locals 3

    iget-object v0, p0, LFg;->c:Lug;

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    sget-object v1, Lug;->b:Lug;

    sget-object v2, Lug;->a:Lug;

    if-ne v0, v1, :cond_2

    if-eq p1, v2, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "State must be at least CREATED to move to "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", but was "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, LFg;->c:Lug;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " in component "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, LFg;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    iput-object p1, p0, LFg;->c:Lug;

    iget-boolean p1, p0, LFg;->f:Z

    const/4 v0, 0x1

    if-nez p1, :cond_5

    iget p1, p0, LFg;->e:I

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    iput-boolean v0, p0, LFg;->f:Z

    invoke-virtual {p0}, LFg;->h()V

    const/4 p1, 0x0

    iput-boolean p1, p0, LFg;->f:Z

    iget-object p1, p0, LFg;->c:Lug;

    if-ne p1, v2, :cond_4

    new-instance p1, LNb;

    invoke-direct {p1}, LNb;-><init>()V

    iput-object p1, p0, LFg;->b:LNb;

    :cond_4
    return-void

    :cond_5
    :goto_1
    iput-boolean v0, p0, LFg;->g:Z

    return-void
.end method

.method public final g(Lug;)V
    .locals 1

    const-string v0, "state"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "setCurrentState"

    invoke-virtual {p0, v0}, LFg;->d(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LFg;->f(Lug;)V

    return-void
.end method

.method public final h()V
    .locals 7

    iget-object v0, p0, LFg;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LDg;

    if-eqz v0, :cond_b

    :cond_0
    iget-object v1, p0, LFg;->b:LNb;

    iget v2, v1, Lon;->d:I

    const/4 v3, 0x0

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, v1, Lon;->a:Lln;

    invoke-static {v1}, LTf;->f(Ljava/lang/Object;)V

    iget-object v1, v1, Lln;->b:Ljava/lang/Object;

    check-cast v1, LEg;

    iget-object v1, v1, LEg;->a:Lug;

    iget-object v2, p0, LFg;->b:LNb;

    iget-object v2, v2, Lon;->b:Lln;

    invoke-static {v2}, LTf;->f(Ljava/lang/Object;)V

    iget-object v2, v2, Lln;->b:Ljava/lang/Object;

    check-cast v2, LEg;

    iget-object v2, v2, LEg;->a:Lug;

    if-ne v1, v2, :cond_2

    iget-object v1, p0, LFg;->c:Lug;

    if-ne v1, v2, :cond_2

    :goto_0
    iput-boolean v3, p0, LFg;->g:Z

    iget-object v0, p0, LFg;->c:Lug;

    iget-object v1, p0, LFg;->i:Lvp;

    invoke-virtual {v1, v0}, Lvp;->c0(Ljava/lang/Object;)V

    return-void

    :cond_2
    iput-boolean v3, p0, LFg;->g:Z

    iget-object v1, p0, LFg;->c:Lug;

    iget-object v2, p0, LFg;->b:LNb;

    iget-object v2, v2, Lon;->a:Lln;

    invoke-static {v2}, LTf;->f(Ljava/lang/Object;)V

    iget-object v2, v2, Lln;->b:Ljava/lang/Object;

    check-cast v2, LEg;

    iget-object v2, v2, LEg;->a:Lug;

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-gez v1, :cond_8

    iget-object v1, p0, LFg;->b:LNb;

    new-instance v2, Lkn;

    iget-object v3, v1, Lon;->b:Lln;

    iget-object v4, v1, Lon;->a:Lln;

    const/4 v5, 0x1

    invoke-direct {v2, v3, v4, v5}, Lkn;-><init>(Lln;Lln;I)V

    iget-object v1, v1, Lon;->c:Ljava/util/WeakHashMap;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    invoke-virtual {v2}, Lkn;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    iget-boolean v1, p0, LFg;->g:Z

    if-nez v1, :cond_8

    invoke-virtual {v2}, Lkn;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    const-string v3, "next()"

    invoke-static {v3, v1}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LCg;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LEg;

    :goto_1
    iget-object v4, v1, LEg;->a:Lug;

    iget-object v5, p0, LFg;->c:Lug;

    invoke-virtual {v4, v5}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v4

    if-lez v4, :cond_3

    iget-boolean v4, p0, LFg;->g:Z

    if-nez v4, :cond_3

    iget-object v4, p0, LFg;->b:LNb;

    iget-object v4, v4, LNb;->e:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    sget-object v4, Ltg;->Companion:Lrg;

    iget-object v5, v1, LEg;->a:Lug;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "state"

    invoke-static {v4, v5}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    const/4 v5, 0x2

    if-eq v4, v5, :cond_6

    const/4 v5, 0x3

    if-eq v4, v5, :cond_5

    const/4 v5, 0x4

    if-eq v4, v5, :cond_4

    const/4 v4, 0x0

    goto :goto_2

    :cond_4
    sget-object v4, Ltg;->ON_PAUSE:Ltg;

    goto :goto_2

    :cond_5
    sget-object v4, Ltg;->ON_STOP:Ltg;

    goto :goto_2

    :cond_6
    sget-object v4, Ltg;->ON_DESTROY:Ltg;

    :goto_2
    if-eqz v4, :cond_7

    invoke-virtual {v4}, Ltg;->a()Lug;

    move-result-object v5

    iget-object v6, p0, LFg;->h:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1, v0, v4}, LEg;->a(LDg;Ltg;)V

    iget-object v4, p0, LFg;->h:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_1

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "no event down from "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v1, LEg;->a:Lug;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    iget-object v1, p0, LFg;->b:LNb;

    iget-object v1, v1, Lon;->b:Lln;

    iget-boolean v2, p0, LFg;->g:Z

    if-nez v2, :cond_0

    if-eqz v1, :cond_0

    iget-object v2, p0, LFg;->c:Lug;

    iget-object v1, v1, Lln;->b:Ljava/lang/Object;

    check-cast v1, LEg;

    iget-object v1, v1, LEg;->a:Lug;

    invoke-virtual {v2, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-lez v1, :cond_0

    iget-object v1, p0, LFg;->b:LNb;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lmn;

    invoke-direct {v2, v1}, Lmn;-><init>(Lon;)V

    iget-object v1, v1, Lon;->c:Ljava/util/WeakHashMap;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    invoke-virtual {v2}, Lmn;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v1, p0, LFg;->g:Z

    if-nez v1, :cond_0

    invoke-virtual {v2}, Lmn;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LCg;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LEg;

    :goto_3
    iget-object v4, v1, LEg;->a:Lug;

    iget-object v5, p0, LFg;->c:Lug;

    invoke-virtual {v4, v5}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v4

    if-gez v4, :cond_9

    iget-boolean v4, p0, LFg;->g:Z

    if-nez v4, :cond_9

    iget-object v4, p0, LFg;->b:LNb;

    iget-object v4, v4, LNb;->e:Ljava/util/HashMap;

    invoke-virtual {v4, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    iget-object v4, v1, LEg;->a:Lug;

    iget-object v5, p0, LFg;->h:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v4, Ltg;->Companion:Lrg;

    iget-object v5, v1, LEg;->a:Lug;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5}, Lrg;->a(Lug;)Ltg;

    move-result-object v4

    if-eqz v4, :cond_a

    invoke-virtual {v1, v0, v4}, LEg;->a(LDg;Ltg;)V

    iget-object v4, p0, LFg;->h:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_3

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "no event up from "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v1, LEg;->a:Lug;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
