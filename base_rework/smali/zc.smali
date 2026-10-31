.class public abstract Lzc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ComponentCallbacks;
.implements Landroid/view/View$OnCreateContextMenuListener;
.implements LDg;
.implements LSs;
.implements Lqe;
.implements Lxn;


# static fields
.field public static final S:Ljava/lang/Object;


# instance fields
.field public A:Z

.field public final B:Z

.field public C:Z

.field public D:Landroid/view/ViewGroup;

.field public E:Landroid/view/View;

.field public F:Z

.field public G:Z

.field public H:Lxc;

.field public I:Z

.field public J:Z

.field public K:Ljava/lang/String;

.field public L:Lug;

.field public M:LFg;

.field public N:Lad;

.field public final O:Loj;

.field public P:LLo;

.field public final Q:Ljava/util/ArrayList;

.field public final R:Lvc;

.field public a:I

.field public b:Landroid/os/Bundle;

.field public c:Landroid/util/SparseArray;

.field public d:Landroid/os/Bundle;

.field public e:Ljava/lang/String;

.field public f:Landroid/os/Bundle;

.field public g:Lzc;

.field public h:Ljava/lang/String;

.field public i:I

.field public j:Ljava/lang/Boolean;

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:I

.field public r:LOc;

.field public s:LBc;

.field public t:LOc;

.field public u:Lzc;

.field public v:I

.field public w:I

.field public x:Ljava/lang/String;

.field public y:Z

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lzc;->S:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lzc;->a:I

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lzc;->e:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Lzc;->h:Ljava/lang/String;

    iput-object v0, p0, Lzc;->j:Ljava/lang/Boolean;

    new-instance v0, LOc;

    invoke-direct {v0}, LOc;-><init>()V

    iput-object v0, p0, Lzc;->t:LOc;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lzc;->B:Z

    iput-boolean v0, p0, Lzc;->G:Z

    sget-object v0, Lug;->e:Lug;

    iput-object v0, p0, Lzc;->L:Lug;

    new-instance v0, Loj;

    invoke-direct {v0}, Loj;-><init>()V

    iput-object v0, p0, Lzc;->O:Loj;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lzc;->Q:Ljava/util/ArrayList;

    new-instance v0, Lvc;

    invoke-direct {v0, p0}, Lvc;-><init>(Lzc;)V

    iput-object v0, p0, Lzc;->R:Lvc;

    invoke-virtual {p0}, Lzc;->n()V

    return-void
.end method


# virtual methods
.method public A()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lzc;->C:Z

    return-void
.end method

.method public B(Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public C()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lzc;->C:Z

    return-void
.end method

.method public D()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lzc;->C:Z

    return-void
.end method

.method public E(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public F(Landroid/os/Bundle;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lzc;->C:Z

    return-void
.end method

.method public G(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V
    .locals 1

    iget-object p3, p0, Lzc;->t:LOc;

    invoke-virtual {p3}, LOc;->L()V

    const/4 p3, 0x1

    iput-boolean p3, p0, Lzc;->p:Z

    new-instance p3, Lad;

    invoke-virtual {p0}, Lzc;->d()LRs;

    move-result-object v0

    invoke-direct {p3, p0, v0}, Lad;-><init>(Lzc;LRs;)V

    iput-object p3, p0, Lzc;->N:Lad;

    invoke-virtual {p0, p1, p2}, Lzc;->w(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lzc;->E:Landroid/view/View;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lzc;->N:Lad;

    invoke-virtual {p1}, Lad;->e()V

    iget-object p1, p0, Lzc;->E:Landroid/view/View;

    iget-object p2, p0, Lzc;->N:Lad;

    invoke-static {p1, p2}, LF4;->X(Landroid/view/View;LDg;)V

    iget-object p1, p0, Lzc;->E:Landroid/view/View;

    iget-object p2, p0, Lzc;->N:Lad;

    const-string p3, "<this>"

    invoke-static {p3, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const p3, 0x7f0b02c5

    invoke-virtual {p1, p3, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-object p1, p0, Lzc;->E:Landroid/view/View;

    iget-object p2, p0, Lzc;->N:Lad;

    invoke-static {p1, p2}, LUd;->f0(Landroid/view/View;Lxn;)V

    iget-object p1, p0, Lzc;->O:Loj;

    iget-object p2, p0, Lzc;->N:Lad;

    invoke-virtual {p1, p2}, Loj;->e(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lzc;->N:Lad;

    iget-object p1, p1, Lad;->c:LFg;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lzc;->N:Lad;

    :goto_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Called getViewLifecycleOwner() but onCreateView() returned null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final H()Lq1;
    .locals 3

    invoke-virtual {p0}, Lzc;->f()Lq1;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " not attached to an activity."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final I()Landroid/content/Context;
    .locals 3

    invoke-virtual {p0}, Lzc;->h()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " not attached to a context."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final J()Landroid/view/View;
    .locals 3

    iget-object v0, p0, Lzc;->E:Landroid/view/View;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " did not return a View from onCreateView() or this was called before onCreateView()."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final K(IIII)V
    .locals 1

    iget-object v0, p0, Lzc;->H:Lxc;

    if-nez v0, :cond_0

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    if-nez p3, :cond_0

    if-nez p4, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lzc;->e()Lxc;

    move-result-object v0

    iput p1, v0, Lxc;->b:I

    invoke-virtual {p0}, Lzc;->e()Lxc;

    move-result-object p1

    iput p2, p1, Lxc;->c:I

    invoke-virtual {p0}, Lzc;->e()Lxc;

    move-result-object p1

    iput p3, p1, Lxc;->d:I

    invoke-virtual {p0}, Lzc;->e()Lxc;

    move-result-object p1

    iput p4, p1, Lxc;->e:I

    return-void
.end method

.method public final L(Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lzc;->r:LOc;

    if-eqz v0, :cond_1

    iget-boolean v1, v0, LOc;->E:Z

    if-nez v1, :cond_0

    iget-boolean v0, v0, LOc;->F:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Fragment already added and state has been saved"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput-object p1, p0, Lzc;->f:Landroid/os/Bundle;

    return-void
.end method

.method public final M(Landroid/content/Intent;)V
    .locals 2

    iget-object v0, p0, Lzc;->s:LBc;

    if-eqz v0, :cond_0

    iget-object v0, v0, LBc;->k:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Fragment "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " not attached to Activity"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final N(Landroid/content/Intent;I)V
    .locals 4

    iget-object v0, p0, Lzc;->s:LBc;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lzc;->j()LOc;

    move-result-object v0

    iget-object v1, v0, LOc;->z:LK2;

    if-eqz v1, :cond_1

    new-instance v1, LLc;

    iget-object v2, p0, Lzc;->e:Ljava/lang/String;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v2, v1, LLc;->a:Ljava/lang/String;

    iput p2, v1, LLc;->b:I

    iget-object p2, v0, LOc;->C:Ljava/util/ArrayDeque;

    invoke-virtual {p2, v1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    iget-object p2, v0, LOc;->z:LK2;

    iget-object v0, p2, LK2;->b:Ljava/lang/Object;

    check-cast v0, LN6;

    iget-object v1, v0, LN6;->b:Ljava/util/LinkedHashMap;

    iget-object v2, p2, LK2;->c:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iget-object p2, p2, LK2;->d:Ljava/lang/Object;

    check-cast p2, LTd;

    if-eqz v1, :cond_0

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    iget-object v3, v0, LN6;->d:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :try_start_0
    invoke-virtual {v0, v1, p2, p1}, LN6;->b(ILTd;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    throw p1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Attempting to launch an unregistered ActivityResultLauncher with contract "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " and input "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ". You must ensure the ActivityResultLauncher is registered before calling launch()."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    iget-object v0, v0, LOc;->t:LBc;

    const/4 v1, -0x1

    if-ne p2, v1, :cond_2

    iget-object p2, v0, LBc;->k:Landroid/content/Context;

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V

    :goto_0
    return-void

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Starting activity with a requestCode requires a FragmentActivity host"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Fragment "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " not attached to Activity"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final a()Lnj;
    .locals 4

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    :goto_0
    instance-of v1, v0, Landroid/content/ContextWrapper;

    if-eqz v1, :cond_1

    instance-of v1, v0, Landroid/app/Application;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/app/Application;

    goto :goto_1

    :cond_0
    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_1
    if-nez v0, :cond_2

    const/4 v1, 0x3

    const-string v2, "FragmentManager"

    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Could not find Application instance from Context "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    new-instance v1, Lnj;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lnj;-><init>(I)V

    iget-object v2, v1, LY3;->a:Ljava/lang/Object;

    check-cast v2, Ljava/util/LinkedHashMap;

    if-eqz v0, :cond_3

    sget-object v3, LF4;->q:Lns;

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    sget-object v0, LTf;->d:Lmh;

    invoke-interface {v2, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, LTf;->e:Lmh;

    invoke-interface {v2, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lzc;->f:Landroid/os/Bundle;

    if-eqz v0, :cond_4

    sget-object v3, LTf;->f:Lmh;

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    return-object v1
.end method

.method public final b()Lx1;
    .locals 1

    iget-object v0, p0, Lzc;->P:LLo;

    iget-object v0, v0, LLo;->d:Ljava/lang/Object;

    check-cast v0, Lx1;

    return-object v0
.end method

.method public c()LBr;
    .locals 1

    new-instance v0, Lwc;

    invoke-direct {v0, p0}, Lwc;-><init>(Lzc;)V

    return-object v0
.end method

.method public final d()LRs;
    .locals 3

    iget-object v0, p0, Lzc;->r:LOc;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lzc;->i()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lzc;->r:LOc;

    iget-object v0, v0, LOc;->L:LRc;

    iget-object v0, v0, LRc;->d:Ljava/util/HashMap;

    iget-object v1, p0, Lzc;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LRs;

    if-nez v1, :cond_0

    new-instance v1, LRs;

    invoke-direct {v1}, LRs;-><init>()V

    iget-object v2, p0, Lzc;->e:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Can\'t access ViewModels from detached fragment"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final e()Lxc;
    .locals 2

    iget-object v0, p0, Lzc;->H:Lxc;

    if-nez v0, :cond_0

    new-instance v0, Lxc;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sget-object v1, Lzc;->S:Ljava/lang/Object;

    iput-object v1, v0, Lxc;->g:Ljava/lang/Object;

    iput-object v1, v0, Lxc;->h:Ljava/lang/Object;

    iput-object v1, v0, Lxc;->i:Ljava/lang/Object;

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, v0, Lxc;->j:F

    const/4 v1, 0x0

    iput-object v1, v0, Lxc;->k:Landroid/view/View;

    iput-object v0, p0, Lzc;->H:Lxc;

    :cond_0
    iget-object v0, p0, Lzc;->H:Lxc;

    return-object v0
.end method

.method public final f()Lq1;
    .locals 1

    iget-object v0, p0, Lzc;->s:LBc;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, v0, LBc;->j:Landroid/app/Activity;

    check-cast v0, Lq1;

    :goto_0
    return-object v0
.end method

.method public final g()LOc;
    .locals 3

    iget-object v0, p0, Lzc;->s:LBc;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lzc;->t:LOc;

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " has not been attached yet."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getLifecycle()Lwg;
    .locals 1

    iget-object v0, p0, Lzc;->M:LFg;

    return-object v0
.end method

.method public final h()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lzc;->s:LBc;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, v0, LBc;->k:Landroid/content/Context;

    :goto_0
    return-object v0
.end method

.method public final i()I
    .locals 2

    iget-object v0, p0, Lzc;->L:Lug;

    sget-object v1, Lug;->b:Lug;

    if-eq v0, v1, :cond_1

    iget-object v1, p0, Lzc;->u:Lzc;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    iget-object v1, p0, Lzc;->u:Lzc;

    invoke-virtual {v1}, Lzc;->i()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    return v0

    :cond_1
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    return v0
.end method

.method public final j()LOc;
    .locals 3

    iget-object v0, p0, Lzc;->r:LOc;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " not associated with a fragment manager."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final k()Landroid/content/res/Resources;
    .locals 1

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    return-object v0
.end method

.method public final l(I)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final varargs m(I[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final n()V
    .locals 3

    new-instance v0, LFg;

    invoke-direct {v0, p0}, LFg;-><init>(LDg;)V

    iput-object v0, p0, Lzc;->M:LFg;

    new-instance v0, LLo;

    invoke-direct {v0, p0}, LLo;-><init>(Lxn;)V

    iput-object v0, p0, Lzc;->P:LLo;

    iget-object v0, p0, Lzc;->Q:Ljava/util/ArrayList;

    iget-object v1, p0, Lzc;->R:Lvc;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    iget v2, p0, Lzc;->a:I

    if-ltz v2, :cond_0

    iget-object v0, v1, Lvc;->a:Lzc;

    iget-object v1, v0, Lzc;->P:LLo;

    invoke-virtual {v1}, LLo;->d()V

    invoke-static {v0}, LTf;->o(Lxn;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public final o()V
    .locals 3

    invoke-virtual {p0}, Lzc;->n()V

    iget-object v0, p0, Lzc;->e:Ljava/lang/String;

    iput-object v0, p0, Lzc;->K:Ljava/lang/String;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lzc;->e:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lzc;->k:Z

    iput-boolean v0, p0, Lzc;->l:Z

    iput-boolean v0, p0, Lzc;->m:Z

    iput-boolean v0, p0, Lzc;->n:Z

    iput-boolean v0, p0, Lzc;->o:Z

    iput v0, p0, Lzc;->q:I

    const/4 v1, 0x0

    iput-object v1, p0, Lzc;->r:LOc;

    new-instance v2, LOc;

    invoke-direct {v2}, LOc;-><init>()V

    iput-object v2, p0, Lzc;->t:LOc;

    iput-object v1, p0, Lzc;->s:LBc;

    iput v0, p0, Lzc;->v:I

    iput v0, p0, Lzc;->w:I

    iput-object v1, p0, Lzc;->x:Ljava/lang/String;

    iput-boolean v0, p0, Lzc;->y:Z

    iput-boolean v0, p0, Lzc;->z:Z

    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lzc;->C:Z

    return-void
.end method

.method public final onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 1

    invoke-virtual {p0}, Lzc;->H()Lq1;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Landroid/app/Activity;->onCreateContextMenu(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V

    return-void
.end method

.method public final onLowMemory()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lzc;->C:Z

    return-void
.end method

.method public final p()Z
    .locals 1

    iget-object v0, p0, Lzc;->s:LBc;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lzc;->k:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final q()Z
    .locals 3

    iget-boolean v0, p0, Lzc;->y:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lzc;->r:LOc;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v2, p0, Lzc;->u:Lzc;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lzc;->q()Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_2

    :cond_1
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public final r()Z
    .locals 1

    iget v0, p0, Lzc;->q:I

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public s()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lzc;->C:Z

    return-void
.end method

.method public t(IILandroid/content/Intent;)V
    .locals 3

    const-string v0, "FragmentManager"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " received the following in onActivityResult(): requestCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " resultCode: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " data: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "} ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lzc;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lzc;->v:I

    if-eqz v1, :cond_0

    const-string v1, " id=0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lzc;->v:I

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget-object v1, p0, Lzc;->x:Ljava/lang/String;

    if-eqz v1, :cond_1

    const-string v1, " tag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lzc;->x:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u(Landroid/content/Context;)V
    .locals 1

    const/4 p1, 0x1

    iput-boolean p1, p0, Lzc;->C:Z

    iget-object v0, p0, Lzc;->s:LBc;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, v0, LBc;->j:Landroid/app/Activity;

    :goto_0
    if-eqz v0, :cond_1

    iput-boolean p1, p0, Lzc;->C:Z

    :cond_1
    return-void
.end method

.method public v(Landroid/os/Bundle;)V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lzc;->C:Z

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const-string v2, "android:support:fragments"

    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v2, p0, Lzc;->t:LOc;

    invoke-virtual {v2, p1}, LOc;->R(Landroid/os/Parcelable;)V

    iget-object p1, p0, Lzc;->t:LOc;

    iput-boolean v1, p1, LOc;->E:Z

    iput-boolean v1, p1, LOc;->F:Z

    iget-object v2, p1, LOc;->L:LRc;

    iput-boolean v1, v2, LRc;->g:Z

    invoke-virtual {p1, v0}, LOc;->t(I)V

    :cond_0
    iget-object p1, p0, Lzc;->t:LOc;

    iget v2, p1, LOc;->s:I

    if-lt v2, v0, :cond_1

    goto :goto_0

    :cond_1
    iput-boolean v1, p1, LOc;->E:Z

    iput-boolean v1, p1, LOc;->F:Z

    iget-object v2, p1, LOc;->L:LRc;

    iput-boolean v1, v2, LRc;->g:Z

    invoke-virtual {p1, v0}, LOc;->t(I)V

    :goto_0
    return-void
.end method

.method public w(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public x()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lzc;->C:Z

    return-void
.end method

.method public y()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lzc;->C:Z

    return-void
.end method

.method public z(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 1

    iget-object p1, p0, Lzc;->s:LBc;

    if-eqz p1, :cond_0

    iget-object p1, p1, LBc;->n:Lq1;

    invoke-virtual {p1}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iget-object v0, p0, Lzc;->t:LOc;

    iget-object v0, v0, LOc;->f:LEc;

    invoke-virtual {p1, v0}, Landroid/view/LayoutInflater;->setFactory2(Landroid/view/LayoutInflater$Factory2;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
