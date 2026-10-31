.class public final LK2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUm;
.implements LNk;


# static fields
.field public static volatile e:LK2;

.field public static final f:Ljava/lang/Object;

.field public static g:LK2;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LK2;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    iput p1, p0, LK2;->a:I

    packed-switch p1, :pswitch_data_0

    .line 6
    new-instance p1, Ls0;

    const/4 v0, 0x0

    .line 7
    invoke-direct {p1, v0}, Ls0;-><init>(I)V

    .line 8
    invoke-static {p1}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LK2;->b:Ljava/lang/Object;

    .line 11
    new-instance v0, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {v0}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    iput-object v0, p0, LK2;->c:Ljava/lang/Object;

    .line 12
    new-instance v0, Lr0;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lr0;-><init>(Ljava/lang/Object;I)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    .line 13
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, LK2;->b:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 1
    iput p1, p0, LK2;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LDg;)V
    .locals 1

    const/16 v0, 0x13

    iput v0, p0, LK2;->a:I

    const-string v0, "provider"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, LFg;

    invoke-direct {v0, p1}, LFg;-><init>(LDg;)V

    iput-object v0, p0, LK2;->b:Ljava/lang/Object;

    .line 5
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iput-object p1, p0, LK2;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LKh;Ljava/util/ArrayList;Luh;)V
    .locals 1

    const/16 v0, 0xe

    iput v0, p0, LK2;->a:I

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    const-string v0, "Argument must not be null"

    invoke-static {v0, p3}, LUd;->l(Ljava/lang/String;Ljava/lang/Object;)V

    .line 61
    iput-object p3, p0, LK2;->c:Ljava/lang/Object;

    .line 62
    invoke-static {v0, p2}, LUd;->l(Ljava/lang/String;Ljava/lang/Object;)V

    .line 63
    iput-object p2, p0, LK2;->d:Ljava/lang/Object;

    .line 64
    new-instance p2, Lk0;

    invoke-direct {p2, p1, p3}, Lk0;-><init>(Ljava/io/InputStream;Luh;)V

    iput-object p2, p0, LK2;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LNl;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, LK2;->a:I

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, LK2;->b:Ljava/lang/Object;

    .line 21
    new-instance p1, LO5;

    invoke-direct {p1}, LO5;-><init>()V

    iput-object p1, p0, LK2;->c:Ljava/lang/Object;

    .line 22
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LK2;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LPk;LHb;Lh8;)V
    .locals 1

    const/16 v0, 0xc

    iput v0, p0, LK2;->a:I

    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    iput-object p1, p0, LK2;->d:Ljava/lang/Object;

    .line 57
    iput-object p2, p0, LK2;->b:Ljava/lang/Object;

    .line 58
    iput-object p3, p0, LK2;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LRs;LQs;LY3;)V
    .locals 1

    const/16 v0, 0x16

    iput v0, p0, LK2;->a:I

    const-string v0, "store"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "extras"

    invoke-static {v0, p3}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, LK2;->b:Ljava/lang/Object;

    .line 17
    iput-object p2, p0, LK2;->c:Ljava/lang/Object;

    .line 18
    iput-object p3, p0, LK2;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LK2;->a:I

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, LK2;->d:Ljava/lang/Object;

    .line 44
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, LK2;->c:Ljava/lang/Object;

    .line 45
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LK2;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V
    .locals 1

    const/16 v0, 0x14

    iput v0, p0, LK2;->a:I

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, LK2;->d:Ljava/lang/Object;

    .line 29
    iput-object p2, p0, LK2;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/location/LocationManager;)V
    .locals 1

    const/16 v0, 0x15

    iput v0, p0, LK2;->a:I

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v0, LAr;

    .line 32
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object v0, p0, LK2;->c:Ljava/lang/Object;

    .line 34
    iput-object p1, p0, LK2;->d:Ljava/lang/Object;

    .line 35
    iput-object p2, p0, LK2;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/os/ParcelFileDescriptor;Ljava/util/ArrayList;Luh;)V
    .locals 1

    const/16 v0, 0xf

    iput v0, p0, LK2;->a:I

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    const-string v0, "Argument must not be null"

    invoke-static {v0, p3}, LUd;->l(Ljava/lang/String;Ljava/lang/Object;)V

    .line 67
    iput-object p3, p0, LK2;->b:Ljava/lang/Object;

    .line 68
    invoke-static {v0, p2}, LUd;->l(Ljava/lang/String;Ljava/lang/Object;)V

    .line 69
    iput-object p2, p0, LK2;->c:Ljava/lang/Object;

    .line 70
    new-instance p2, Lcom/bumptech/glide/load/data/a;

    invoke-direct {p2, p1}, Lcom/bumptech/glide/load/data/a;-><init>(Landroid/os/ParcelFileDescriptor;)V

    iput-object p2, p0, LK2;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lfb;LLm;Ljb;)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, LK2;->a:I

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK2;->d:Ljava/lang/Object;

    .line 72
    iput-object p2, p0, LK2;->c:Ljava/lang/Object;

    .line 73
    iput-object p3, p0, LK2;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p4, p0, LK2;->a:I

    iput-object p1, p0, LK2;->b:Ljava/lang/Object;

    iput-object p2, p0, LK2;->c:Ljava/lang/Object;

    iput-object p3, p0, LK2;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 1

    const/16 v0, 0x12

    iput v0, p0, LK2;->a:I

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, LK2;->d:Ljava/lang/Object;

    .line 25
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LK2;->b:Ljava/lang/Object;

    .line 26
    iput-object p1, p0, LK2;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljj;Lh8;Lwa;Ljava/util/Set;)V
    .locals 7

    const/16 v0, 0xa

    iput v0, p0, LK2;->a:I

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p2, p0, LK2;->b:Ljava/lang/Object;

    .line 48
    iput-object p1, p0, LK2;->c:Ljava/lang/Object;

    .line 49
    iput-object p3, p0, LK2;->d:Ljava/lang/Object;

    .line 50
    invoke-interface {p4}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    .line 51
    :cond_0
    invoke-interface {p4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [I

    .line 52
    new-instance v1, Ljava/lang/String;

    array-length p3, p2

    const/4 p4, 0x0

    invoke-direct {v1, p2, p4, p3}, Ljava/lang/String;-><init>([III)V

    .line 53
    new-instance v6, Lc1;

    invoke-direct {v6, v1}, Lc1;-><init>(Ljava/lang/String;)V

    .line 54
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v2, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x1

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, LK2;->I(Ljava/lang/CharSequence;IIIZLJa;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public constructor <init>(Lw7;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, LK2;->a:I

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LK2;->b:Ljava/lang/Object;

    .line 38
    new-instance v0, Ll4;

    .line 39
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object v0, p0, LK2;->c:Ljava/lang/Object;

    .line 41
    iput-object p1, p0, LK2;->d:Ljava/lang/Object;

    return-void
.end method

.method public static G(Landroid/content/Context;Landroid/util/AttributeSet;[III)LK2;
    .locals 1

    new-instance v0, LK2;

    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-direct {v0, p0, p1}, LK2;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    return-object v0
.end method

.method private final M()V
    .locals 0

    return-void
.end method

.method private final N()V
    .locals 0

    return-void
.end method

.method public static h(Landroid/text/Editable;Landroid/view/KeyEvent;Z)Z
    .locals 7

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getMetaState()I

    move-result p1

    invoke-static {p1}, Landroid/view/KeyEvent;->metaStateHasNoModifiers(I)Z

    move-result p1

    const/4 v0, 0x1

    xor-int/2addr p1, v0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    return v1

    :cond_0
    invoke-static {p0}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result p1

    invoke-static {p0}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v2

    const/4 v3, -0x1

    if-eq p1, v3, :cond_6

    if-eq v2, v3, :cond_6

    if-eq p1, v2, :cond_1

    goto :goto_1

    :cond_1
    const-class v3, LGr;

    invoke-interface {p0, p1, v2, v3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [LGr;

    if-eqz v2, :cond_6

    array-length v3, v2

    if-lez v3, :cond_6

    array-length v3, v2

    move v4, v1

    :goto_0
    if-ge v4, v3, :cond_6

    aget-object v5, v2, v4

    invoke-interface {p0, v5}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v6

    invoke-interface {p0, v5}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v5

    if-eqz p2, :cond_2

    if-eq v6, p1, :cond_4

    :cond_2
    if-nez p2, :cond_3

    if-eq v5, p1, :cond_4

    :cond_3
    if-le p1, v6, :cond_5

    if-ge p1, v5, :cond_5

    :cond_4
    invoke-interface {p0, v6, v5}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    return v0

    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_6
    :goto_1
    return v1
.end method

.method public static v(Landroid/content/Context;)LK2;
    .locals 2

    sget-object v0, LK2;->e:LK2;

    if-nez v0, :cond_1

    sget-object v0, LK2;->f:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, LK2;->e:LK2;

    if-nez v1, :cond_0

    new-instance v1, LK2;

    invoke-direct {v1, p0}, LK2;-><init>(Landroid/content/Context;)V

    sput-object v1, LK2;->e:LK2;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_2
    sget-object p0, LK2;->e:LK2;

    return-object p0
.end method


# virtual methods
.method public A()I
    .locals 1

    iget-object v0, p0, LK2;->b:Ljava/lang/Object;

    check-cast v0, LNl;

    iget-object v0, v0, LNl;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    return v0
.end method

.method public B(LY5;Ljava/lang/String;)LOs;
    .locals 6

    const-string v0, "key"

    invoke-static {v0, p2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, LK2;->b:Ljava/lang/Object;

    check-cast v0, LRs;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, LRs;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LOs;

    const-string v2, "jClass"

    iget-object v3, p1, LY5;->a:Ljava/lang/Class;

    invoke-static {v2, v3}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v2, LY5;->b:Ljava/util/Map;

    const-string v4, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>"

    invoke-static {v4, v2}, LTf;->g(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    instance-of v3, v1, Lzd;

    const/4 v4, 0x0

    if-eqz v3, :cond_5

    instance-of v3, v1, LAd;

    const/4 v5, 0x1

    if-eqz v3, :cond_0

    move-object v3, v1

    check-cast v3, LAd;

    invoke-interface {v3}, LAd;->b()I

    move-result v3

    goto :goto_0

    :cond_0
    instance-of v3, v1, Ldd;

    if-eqz v3, :cond_1

    move v3, v4

    goto :goto_0

    :cond_1
    instance-of v3, v1, Lod;

    if-eqz v3, :cond_2

    move v3, v5

    goto :goto_0

    :cond_2
    const/4 v3, -0x1

    :goto_0
    if-ne v3, v2, :cond_5

    move v4, v5

    goto :goto_1

    :cond_3
    invoke-virtual {v3}, Ljava/lang/Class;->isPrimitive()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-static {v3}, Lpm;->a(Ljava/lang/Class;)LY5;

    move-result-object v2

    invoke-static {v2}, LTf;->E(Lcg;)Ljava/lang/Class;

    move-result-object v3

    :cond_4
    invoke-virtual {v3, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v4

    :cond_5
    :goto_1
    iget-object v2, p0, LK2;->c:Ljava/lang/Object;

    check-cast v2, LQs;

    if-eqz v4, :cond_7

    instance-of p1, v2, Lyn;

    if-eqz p1, :cond_6

    check-cast v2, Lyn;

    invoke-static {v1}, LTf;->f(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_6
    const-string p1, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel"

    invoke-static {p1, v1}, LTf;->g(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v1

    :cond_7
    new-instance v1, Lnj;

    iget-object v3, p0, LK2;->d:Ljava/lang/Object;

    check-cast v3, LY3;

    invoke-direct {v1, v3}, Lnj;-><init>(LY3;)V

    sget-object v3, Lpa;->p:Lpa;

    iget-object v4, v1, LY3;->a:Ljava/lang/Object;

    check-cast v4, Ljava/util/LinkedHashMap;

    invoke-interface {v4, v3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "factory"

    invoke-static {v3, v2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    :try_start_0
    invoke-interface {v2, p1, v1}, LQs;->c(LY5;Lnj;)LOs;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    :try_start_1
    invoke-static {p1}, LTf;->D(LY5;)Ljava/lang/Class;

    move-result-object v3

    invoke-interface {v2, v3, v1}, LQs;->a(Ljava/lang/Class;Lnj;)LOs;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/AbstractMethodError; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    invoke-static {p1}, LTf;->D(LY5;)Ljava/lang/Class;

    move-result-object p1

    invoke-interface {v2, p1}, LQs;->b(Ljava/lang/Class;)LOs;

    move-result-object p1

    :goto_2
    const-string v1, "viewModel"

    invoke-static {v1, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LOs;

    if-eqz p2, :cond_8

    invoke-virtual {p2}, LOs;->a()V

    :cond_8
    return-object p1
.end method

.method public C(Ljava/lang/CharSequence;IILFr;)Z
    .locals 7

    const/4 v0, 0x1

    iget v1, p4, LFr;->c:I

    and-int/lit8 v1, v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-nez v1, :cond_4

    iget-object v1, p0, LK2;->d:Ljava/lang/Object;

    check-cast v1, Lwa;

    invoke-virtual {p4}, LFr;->c()LPi;

    move-result-object v4

    const/16 v5, 0x8

    invoke-virtual {v4, v5}, Lfq;->a(I)I

    move-result v5

    if-eqz v5, :cond_0

    iget-object v6, v4, Lfq;->d:Ljava/lang/Object;

    check-cast v6, Ljava/nio/ByteBuffer;

    iget v4, v4, Lfq;->a:I

    add-int/2addr v5, v4

    invoke-virtual {v6, v5}, Ljava/nio/ByteBuffer;->getShort(I)S

    :cond_0
    check-cast v1, Lu8;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lu8;->b:Ljava/lang/ThreadLocal;

    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v5}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    :goto_0
    if-ge p2, p3, :cond_2

    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/2addr p2, v0

    goto :goto_0

    :cond_2
    iget-object p1, v1, Lu8;->a:Landroid/text/TextPaint;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    sget p3, Lxk;->a:I

    invoke-static {p1, p2}, Lwk;->a(Landroid/graphics/Paint;Ljava/lang/String;)Z

    move-result p1

    iget p2, p4, LFr;->c:I

    and-int/lit8 p2, p2, 0x4

    if-eqz p1, :cond_3

    or-int/lit8 p1, p2, 0x2

    goto :goto_1

    :cond_3
    or-int/lit8 p1, p2, 0x1

    :goto_1
    iput p1, p4, LFr;->c:I

    :cond_4
    iget p1, p4, LFr;->c:I

    and-int/lit8 p1, p1, 0x3

    if-ne p1, v2, :cond_5

    goto :goto_2

    :cond_5
    move v0, v3

    :goto_2
    return v0
.end method

.method public D(Landroid/view/View;)V
    .locals 4

    iget-object v0, p0, LK2;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LK2;->b:Ljava/lang/Object;

    check-cast v0, LNl;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Llm;

    move-result-object p1

    if-eqz p1, :cond_2

    iget v1, p1, Llm;->q:I

    const/4 v2, -0x1

    iget-object v3, p1, Llm;->a:Landroid/view/View;

    if-eq v1, v2, :cond_0

    iput v1, p1, Llm;->p:I

    goto :goto_0

    :cond_0
    sget-object v1, LGs;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v3}, Landroid/view/View;->getImportantForAccessibility()I

    move-result v1

    iput v1, p1, Llm;->p:I

    :goto_0
    iget-object v0, v0, LNl;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->M()Z

    move-result v1

    const/4 v2, 0x4

    if-eqz v1, :cond_1

    iput v2, p1, Llm;->q:I

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->p0:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    sget-object p1, LGs;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v3, v2}, Landroid/view/View;->setImportantForAccessibility(I)V

    :cond_2
    :goto_1
    return-void
.end method

.method public E(Landroid/view/View;)Z
    .locals 1

    iget-object v0, p0, LK2;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public F(ILm7;Lv7;)Z
    .locals 6

    iget-object v0, p3, Lv7;->p0:[I

    const/4 v1, 0x0

    aget v2, v0, v1

    iget-object v3, p0, LK2;->c:Ljava/lang/Object;

    check-cast v3, Ll4;

    iput v2, v3, Ll4;->a:I

    const/4 v2, 0x1

    aget v0, v0, v2

    iput v0, v3, Ll4;->b:I

    invoke-virtual {p3}, Lv7;->q()I

    move-result v0

    iput v0, v3, Ll4;->c:I

    invoke-virtual {p3}, Lv7;->k()I

    move-result v0

    iput v0, v3, Ll4;->d:I

    iput-boolean v1, v3, Ll4;->i:Z

    iput p1, v3, Ll4;->j:I

    iget p1, v3, Ll4;->a:I

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    move p1, v2

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    iget v4, v3, Ll4;->b:I

    if-ne v4, v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    const/4 v4, 0x0

    if-eqz p1, :cond_2

    iget p1, p3, Lv7;->W:F

    cmpl-float p1, p1, v4

    if-lez p1, :cond_2

    move p1, v2

    goto :goto_2

    :cond_2
    move p1, v1

    :goto_2
    if-eqz v0, :cond_3

    iget v0, p3, Lv7;->W:F

    cmpl-float v0, v0, v4

    if-lez v0, :cond_3

    move v0, v2

    goto :goto_3

    :cond_3
    move v0, v1

    :goto_3
    iget-object v4, p3, Lv7;->t:[I

    const/4 v5, 0x4

    if-eqz p1, :cond_4

    aget p1, v4, v1

    if-ne p1, v5, :cond_4

    iput v2, v3, Ll4;->a:I

    :cond_4
    if-eqz v0, :cond_5

    aget p1, v4, v2

    if-ne p1, v5, :cond_5

    iput v2, v3, Ll4;->b:I

    :cond_5
    invoke-virtual {p2, p3, v3}, Lm7;->b(Lv7;Ll4;)V

    iget p1, v3, Ll4;->e:I

    invoke-virtual {p3, p1}, Lv7;->O(I)V

    iget p1, v3, Ll4;->f:I

    invoke-virtual {p3, p1}, Lv7;->L(I)V

    iget-boolean p1, v3, Ll4;->h:Z

    iput-boolean p1, p3, Lv7;->E:Z

    iget p1, v3, Ll4;->g:I

    invoke-virtual {p3, p1}, Lv7;->I(I)V

    iput v1, v3, Ll4;->j:I

    iget-boolean p1, v3, Ll4;->i:Z

    return p1
.end method

.method public H(Ltg;)V
    .locals 2

    iget-object v0, p0, LK2;->d:Ljava/lang/Object;

    check-cast v0, LHn;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LHn;->run()V

    :cond_0
    new-instance v0, LHn;

    iget-object v1, p0, LK2;->b:Ljava/lang/Object;

    check-cast v1, LFg;

    invoke-direct {v0, v1, p1}, LHn;-><init>(LFg;Ltg;)V

    iput-object v0, p0, LK2;->d:Ljava/lang/Object;

    iget-object p1, p0, LK2;->c:Ljava/lang/Object;

    check-cast p1, Landroid/os/Handler;

    invoke-virtual {p1, v0}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public I(Ljava/lang/CharSequence;IIIZLJa;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    move/from16 v3, p4

    move-object/from16 v4, p6

    new-instance v5, LKa;

    iget-object v6, v0, LK2;->c:Ljava/lang/Object;

    check-cast v6, Ljj;

    iget-object v6, v6, Ljj;->c:Ljava/lang/Object;

    check-cast v6, LRi;

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct {v5, v6, v7, v8}, LKa;-><init>(LRi;Z[I)V

    invoke-static/range {p1 .. p2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v6

    const/4 v9, 0x1

    move v10, v6

    move v11, v7

    move v12, v9

    move/from16 v6, p2

    move v7, v6

    :goto_0
    const/4 v13, 0x2

    if-ge v6, v2, :cond_f

    if-ge v11, v3, :cond_f

    if-eqz v12, :cond_f

    iget-object v14, v5, LKa;->c:LRi;

    iget-object v14, v14, LRi;->a:Landroid/util/SparseArray;

    if-nez v14, :cond_0

    move-object v14, v8

    goto :goto_1

    :cond_0
    invoke-virtual {v14, v10}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, LRi;

    :goto_1
    iget v15, v5, LKa;->a:I

    const/4 v8, 0x3

    if-eq v15, v13, :cond_2

    if-nez v14, :cond_1

    invoke-virtual {v5}, LKa;->a()V

    :goto_2
    move v14, v9

    goto :goto_5

    :cond_1
    iput v13, v5, LKa;->a:I

    iput-object v14, v5, LKa;->c:LRi;

    iput v9, v5, LKa;->f:I

    :goto_3
    move v14, v13

    goto :goto_5

    :cond_2
    if-eqz v14, :cond_3

    iput-object v14, v5, LKa;->c:LRi;

    iget v14, v5, LKa;->f:I

    add-int/2addr v14, v9

    iput v14, v5, LKa;->f:I

    goto :goto_3

    :cond_3
    const v14, 0xfe0e

    if-ne v10, v14, :cond_4

    invoke-virtual {v5}, LKa;->a()V

    goto :goto_2

    :cond_4
    const v14, 0xfe0f

    if-ne v10, v14, :cond_5

    goto :goto_3

    :cond_5
    iget-object v14, v5, LKa;->c:LRi;

    iget-object v15, v14, LRi;->b:LFr;

    if-eqz v15, :cond_8

    iget v15, v5, LKa;->f:I

    if-ne v15, v9, :cond_7

    invoke-virtual {v5}, LKa;->b()Z

    move-result v14

    if-eqz v14, :cond_6

    iget-object v14, v5, LKa;->c:LRi;

    iput-object v14, v5, LKa;->d:LRi;

    invoke-virtual {v5}, LKa;->a()V

    :goto_4
    move v14, v8

    goto :goto_5

    :cond_6
    invoke-virtual {v5}, LKa;->a()V

    goto :goto_2

    :cond_7
    iput-object v14, v5, LKa;->d:LRi;

    invoke-virtual {v5}, LKa;->a()V

    goto :goto_4

    :cond_8
    invoke-virtual {v5}, LKa;->a()V

    goto :goto_2

    :goto_5
    iput v10, v5, LKa;->e:I

    if-eq v14, v9, :cond_e

    if-eq v14, v13, :cond_c

    if-eq v14, v8, :cond_9

    goto :goto_7

    :cond_9
    if-nez p5, :cond_a

    iget-object v8, v5, LKa;->d:LRi;

    iget-object v8, v8, LRi;->b:LFr;

    invoke-virtual {v0, v1, v7, v6, v8}, LK2;->C(Ljava/lang/CharSequence;IILFr;)Z

    move-result v8

    if-nez v8, :cond_b

    :cond_a
    iget-object v8, v5, LKa;->d:LRi;

    iget-object v8, v8, LRi;->b:LFr;

    invoke-interface {v4, v1, v7, v6, v8}, LJa;->f(Ljava/lang/CharSequence;IILFr;)Z

    move-result v12

    add-int/lit8 v11, v11, 0x1

    :cond_b
    :goto_6
    move v7, v6

    goto :goto_7

    :cond_c
    invoke-static {v10}, Ljava/lang/Character;->charCount(I)I

    move-result v8

    add-int/2addr v8, v6

    if-ge v8, v2, :cond_d

    invoke-static {v1, v8}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v6

    move v10, v6

    :cond_d
    move v6, v8

    goto :goto_7

    :cond_e
    invoke-static {v1, v7}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Character;->charCount(I)I

    move-result v6

    add-int/2addr v6, v7

    if-ge v6, v2, :cond_b

    invoke-static {v1, v6}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v7

    move v10, v7

    goto :goto_6

    :goto_7
    const/4 v8, 0x0

    goto/16 :goto_0

    :cond_f
    iget v2, v5, LKa;->a:I

    if-ne v2, v13, :cond_12

    iget-object v2, v5, LKa;->c:LRi;

    iget-object v2, v2, LRi;->b:LFr;

    if-eqz v2, :cond_12

    iget v2, v5, LKa;->f:I

    if-gt v2, v9, :cond_10

    invoke-virtual {v5}, LKa;->b()Z

    move-result v2

    if-eqz v2, :cond_12

    :cond_10
    if-ge v11, v3, :cond_12

    if-eqz v12, :cond_12

    if-nez p5, :cond_11

    iget-object v2, v5, LKa;->c:LRi;

    iget-object v2, v2, LRi;->b:LFr;

    invoke-virtual {v0, v1, v7, v6, v2}, LK2;->C(Ljava/lang/CharSequence;IILFr;)Z

    move-result v2

    if-nez v2, :cond_12

    :cond_11
    iget-object v2, v5, LKa;->c:LRi;

    iget-object v2, v2, LRi;->b:LFr;

    invoke-interface {v4, v1, v7, v6, v2}, LJa;->f(Ljava/lang/CharSequence;IILFr;)Z

    :cond_12
    invoke-interface/range {p6 .. p6}, LJa;->b()Ljava/lang/Object;

    move-result-object v1

    return-object v1
.end method

.method public J()V
    .locals 1

    iget-object v0, p0, LK2;->b:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public K(Lw7;III)V
    .locals 3

    iget v0, p1, Lv7;->b0:I

    iget v1, p1, Lv7;->c0:I

    const/4 v2, 0x0

    iput v2, p1, Lv7;->b0:I

    iput v2, p1, Lv7;->c0:I

    invoke-virtual {p1, p3}, Lv7;->O(I)V

    invoke-virtual {p1, p4}, Lv7;->L(I)V

    if-gez v0, :cond_0

    iput v2, p1, Lv7;->b0:I

    goto :goto_0

    :cond_0
    iput v0, p1, Lv7;->b0:I

    :goto_0
    if-gez v1, :cond_1

    iput v2, p1, Lv7;->c0:I

    goto :goto_1

    :cond_1
    iput v1, p1, Lv7;->c0:I

    :goto_1
    iget-object p1, p0, LK2;->d:Ljava/lang/Object;

    check-cast p1, Lw7;

    iput p2, p1, Lw7;->t0:I

    invoke-virtual {p1}, Lw7;->U()V

    return-void
.end method

.method public L()V
    .locals 2

    iget v0, p0, LK2;->a:I

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    iget-object v0, p0, LK2;->b:Ljava/lang/Object;

    check-cast v0, Lk0;

    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;

    check-cast v0, LLl;

    monitor-enter v0

    :try_start_0
    iget-object v1, v0, LLl;->a:[B

    array-length v1, v1

    iput v1, v0, LLl;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    :pswitch_1
    return-void

    :pswitch_data_0
    .packed-switch 0xd
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public O(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, LK2;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LK2;->b:Ljava/lang/Object;

    check-cast v0, LNl;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Llm;

    move-result-object p1

    if-eqz p1, :cond_1

    iget v1, p1, Llm;->p:I

    iget-object v0, v0, LNl;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->M()Z

    move-result v2

    if-eqz v2, :cond_0

    iput v1, p1, Llm;->q:I

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->p0:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sget-object v0, LGs;->a:Ljava/util/WeakHashMap;

    iget-object v0, p1, Llm;->a:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setImportantForAccessibility(I)V

    :goto_0
    const/4 v0, 0x0

    iput v0, p1, Llm;->p:I

    :cond_1
    return-void
.end method

.method public P()V
    .locals 9

    iget-object v0, p0, LK2;->b:Ljava/lang/Object;

    check-cast v0, LN6;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, LK2;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const-string v2, "key"

    invoke-static {v2, v1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v2, v0, LN6;->d:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, v0, LN6;->b:Ljava/util/LinkedHashMap;

    invoke-interface {v2, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    if-eqz v2, :cond_0

    iget-object v3, v0, LN6;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v3, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v2, v0, LN6;->e:Ljava/util/LinkedHashMap;

    invoke-interface {v2, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v0, LN6;->f:Ljava/util/LinkedHashMap;

    invoke-interface {v2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    const-string v4, ": "

    const-string v5, "Dropping pending result for request "

    const-string v6, "ActivityResultRegistry"

    if-eqz v3, :cond_1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v6, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-interface {v2, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-object v2, v0, LN6;->g:Landroid/os/Bundle;

    invoke-virtual {v2, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x22

    const-class v8, Lz0;

    if-lt v3, v7, :cond_2

    invoke-static {v2, v1, v8}, LQ4;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    goto :goto_0

    :cond_2
    invoke-virtual {v2, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v3

    invoke-virtual {v8, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_0

    :cond_3
    const/4 v3, 0x0

    :goto_0
    check-cast v3, Lz0;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v6, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v2, v1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    :cond_4
    iget-object v0, v0, LN6;->c:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LVo;->l(Ljava/lang/Object;)V

    return-void
.end method

.method public Q(Lw7;)V
    .locals 9

    iget-object v0, p0, LK2;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v1, p1, Lw7;->q0:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const/4 v4, 0x1

    if-ge v3, v1, :cond_2

    iget-object v5, p1, Lw7;->q0:Ljava/util/ArrayList;

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lv7;

    iget-object v6, v5, Lv7;->p0:[I

    aget v7, v6, v2

    const/4 v8, 0x3

    if-eq v7, v8, :cond_0

    aget v4, v6, v4

    if-ne v4, v8, :cond_1

    :cond_0
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    iget-object p1, p1, Lw7;->s0:LW8;

    iput-boolean v4, p1, LW8;->b:Z

    return-void
.end method

.method public a(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, LIb;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LIb;

    invoke-interface {v0}, LIb;->b()Lwp;

    move-result-object v0

    const/4 v1, 0x1

    iput-boolean v1, v0, Lwp;->a:Z

    :cond_0
    iget-object v0, p0, LK2;->c:Ljava/lang/Object;

    check-cast v0, Lh8;

    invoke-virtual {v0, p1}, Lh8;->t(Ljava/lang/Object;)V

    iget-object v0, p0, LK2;->d:Ljava/lang/Object;

    check-cast v0, LNk;

    invoke-interface {v0, p1}, LNk;->a(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public b()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, LK2;->d:Ljava/lang/Object;

    check-cast v0, LNk;

    invoke-interface {v0}, LNk;->b()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, LK2;->b:Ljava/lang/Object;

    check-cast v0, LHb;

    invoke-interface {v0}, LHb;->s()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "FactoryPools"

    const/4 v2, 0x2

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Created new "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    instance-of v1, v0, LIb;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, LIb;

    invoke-interface {v1}, LIb;->b()Lwp;

    move-result-object v1

    const/4 v2, 0x0

    iput-boolean v2, v1, Lwp;->a:Z

    :cond_1
    return-object v0
.end method

.method public declared-synchronized c(Lfg;Lnb;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    new-instance v0, Lt0;

    iget-object v1, p0, LK2;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {v0, p1, p2, v1}, Lt0;-><init>(Lfg;Lnb;Ljava/lang/ref/ReferenceQueue;)V

    iget-object p2, p0, LK2;->b:Ljava/lang/Object;

    check-cast p2, Ljava/util/HashMap;

    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt0;

    if-eqz p1, :cond_0

    const/4 p2, 0x0

    iput-object p2, p1, Lt0;->c:LIm;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public d(Landroid/view/View;IZ)V
    .locals 2

    iget-object v0, p0, LK2;->b:Ljava/lang/Object;

    check-cast v0, LNl;

    if-gez p2, :cond_0

    iget-object p2, v0, LNl;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p2}, LK2;->x(I)I

    move-result p2

    :goto_0
    iget-object v1, p0, LK2;->c:Ljava/lang/Object;

    check-cast v1, LO5;

    invoke-virtual {v1, p2, p3}, LO5;->e(IZ)V

    if-eqz p3, :cond_1

    invoke-virtual {p0, p1}, LK2;->D(Landroid/view/View;)V

    :cond_1
    iget-object p3, v0, LNl;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p3, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Llm;

    return-void
.end method

.method public e(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V
    .locals 2

    iget-object v0, p0, LK2;->b:Ljava/lang/Object;

    check-cast v0, LNl;

    if-gez p2, :cond_0

    iget-object p2, v0, LNl;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p2}, LK2;->x(I)I

    move-result p2

    :goto_0
    iget-object v1, p0, LK2;->c:Ljava/lang/Object;

    check-cast v1, LO5;

    invoke-virtual {v1, p2, p4}, LO5;->e(IZ)V

    if-eqz p4, :cond_1

    invoke-virtual {p0, p1}, LK2;->D(Landroid/view/View;)V

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Llm;

    move-result-object p4

    iget-object v0, v0, LNl;->a:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p4, :cond_4

    invoke-virtual {p4}, Llm;->k()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p4}, Llm;->p()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Called attach on a child which is not detached: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    iget v1, p4, Llm;->j:I

    and-int/lit16 v1, v1, -0x101

    iput v1, p4, Llm;->j:I

    :cond_4
    invoke-static {v0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->a(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public f(Lt0;)V
    .locals 7

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LK2;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    iget-object v1, p1, Lt0;->a:Lfg;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v0, p1, Lt0;->b:Z

    if-eqz v0, :cond_1

    iget-object v2, p1, Lt0;->c:LIm;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    new-instance v0, Lnb;

    iget-object v5, p1, Lt0;->a:Lfg;

    iget-object v1, p0, LK2;->d:Ljava/lang/Object;

    move-object v6, v1

    check-cast v6, Lmb;

    const/4 v3, 0x1

    const/4 v4, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lnb;-><init>(LIm;ZZLfg;Lmb;)V

    iget-object v1, p0, LK2;->d:Ljava/lang/Object;

    check-cast v1, Lmb;

    iget-object p1, p1, Lt0;->a:Lfg;

    check-cast v1, Lfb;

    invoke-virtual {v1, p1, v0}, Lfb;->e(Lfg;Lnb;)V

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    :try_start_1
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public g(Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    .locals 2

    iget v0, p0, LK2;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LK2;->d:Ljava/lang/Object;

    check-cast v0, Lcom/bumptech/glide/load/data/a;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/data/a;->a()Landroid/os/ParcelFileDescriptor;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, Landroid/graphics/BitmapFactory;->decodeFileDescriptor(Ljava/io/FileDescriptor;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, LK2;->b:Ljava/lang/Object;

    check-cast v0, Lk0;

    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;

    check-cast v0, LLl;

    invoke-virtual {v0}, LLl;->reset()V

    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, LK2;->b:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-static {v0}, Ld5;->c(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v0

    new-instance v1, Lb5;

    invoke-direct {v1, v0}, Lb5;-><init>(Ljava/nio/ByteBuffer;)V

    const/4 v0, 0x0

    invoke-static {v1, v0, p1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0xd
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public i(I)V
    .locals 4

    invoke-virtual {p0, p1}, LK2;->x(I)I

    move-result p1

    iget-object v0, p0, LK2;->c:Ljava/lang/Object;

    check-cast v0, LO5;

    invoke-virtual {v0, p1}, LO5;->g(I)Z

    iget-object v0, p0, LK2;->b:Ljava/lang/Object;

    check-cast v0, LNl;

    iget-object v0, v0, LNl;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {v1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Llm;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Llm;->k()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Llm;->p()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "called detach on an already detached child "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    const/16 v2, 0x100

    invoke-virtual {v1, v2}, Llm;->a(I)V

    :cond_2
    invoke-static {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->c(Landroidx/recyclerview/widget/RecyclerView;I)V

    return-void
.end method

.method public j(Landroid/os/Bundle;)V
    .locals 6

    iget-object v0, p0, LK2;->d:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    const v1, 0x7f13001b

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-eqz p1, :cond_2

    :try_start_0
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v4, p0, LK2;->c:Ljava/lang/Object;

    check-cast v4, Ljava/util/HashSet;

    if-eqz v3, :cond_1

    :try_start_1
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const/4 v5, 0x0

    invoke-virtual {p1, v3, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    const-class v5, LCf;

    invoke-virtual {v5, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v4, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_1
    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Class;

    invoke-virtual {p0, v0, v1}, LK2;->k(Ljava/lang/Class;Ljava/util/HashSet;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :goto_2
    new-instance v0, Lyc;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_2
    return-void
.end method

.method public k(Ljava/lang/Class;Ljava/util/HashSet;)Ljava/lang/Object;
    .locals 5

    const-string v0, "Cannot initialize "

    invoke-static {}, LTf;->J()Z

    move-result v1

    if-eqz v1, :cond_0

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :cond_0
    :goto_0
    invoke-virtual {p2, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_4

    iget-object v0, p0, LK2;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    :try_start_1
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v1, 0x0

    :try_start_2
    invoke-virtual {p1, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LCf;

    invoke-interface {v1}, LCf;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Class;

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {p0, v3, p2}, LK2;->k(Ljava/lang/Class;Ljava/util/HashSet;)Ljava/lang/Object;

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_2

    :cond_2
    iget-object v2, p0, LK2;->d:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    invoke-interface {v1, v2}, LCf;->b(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p2, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :goto_2
    :try_start_3
    new-instance p2, Lyc;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_3
    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-object v1

    :cond_4
    :try_start_4
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ". Cycle detected."

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_4
    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw p1
.end method

.method public l()[Lzf;
    .locals 2

    iget-object v0, p0, LK2;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    new-array v1, v1, [Lzf;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lzf;

    return-object v0
.end method

.method public m(LIm;Lrk;)LIm;
    .locals 2

    invoke-interface {p1}, LIm;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/drawable/Drawable;

    instance-of v1, v0, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    iget-object v0, p0, LK2;->b:Ljava/lang/Object;

    check-cast v0, Lu4;

    invoke-static {v0, p1}, Lv4;->b(Lu4;Landroid/graphics/Bitmap;)Lv4;

    move-result-object p1

    iget-object v0, p0, LK2;->c:Ljava/lang/Object;

    check-cast v0, LUm;

    invoke-interface {v0, p1, p2}, LUm;->m(LIm;Lrk;)LIm;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, v0, LId;

    if-eqz v0, :cond_1

    iget-object v0, p0, LK2;->d:Ljava/lang/Object;

    check-cast v0, LUm;

    invoke-interface {v0, p1, p2}, LUm;->m(LIm;Lrk;)LIm;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public n(I)Landroid/view/View;
    .locals 1

    invoke-virtual {p0, p1}, LK2;->x(I)I

    move-result p1

    iget-object v0, p0, LK2;->b:Ljava/lang/Object;

    check-cast v0, LNl;

    iget-object v0, v0, LNl;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public o()I
    .locals 2

    iget-object v0, p0, LK2;->b:Ljava/lang/Object;

    check-cast v0, LNl;

    iget-object v0, v0, LNl;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    iget-object v1, p0, LK2;->d:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public p(I)Landroid/content/res/ColorStateList;
    .locals 3

    iget-object v0, p0, LK2;->b:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    if-eqz v1, :cond_0

    iget-object v2, p0, LK2;->d:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    invoke-static {v2, v1}, LF4;->C(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1
.end method

.method public q(I)Landroid/graphics/drawable/Drawable;
    .locals 2

    iget-object v0, p0, LK2;->b:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    if-eqz v1, :cond_0

    iget-object p1, p0, LK2;->d:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    invoke-static {p1, v1}, LF4;->F(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method public r(I)Landroid/graphics/drawable/Drawable;
    .locals 4

    iget-object v0, p0, LK2;->b:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LK2;->b:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, LU1;->a()LU1;

    move-result-object v0

    iget-object v1, p0, LK2;->d:Ljava/lang/Object;

    check-cast v1, Landroid/content/Context;

    monitor-enter v0

    :try_start_0
    iget-object v2, v0, LU1;->a:LTm;

    const/4 v3, 0x1

    invoke-virtual {v2, v1, p1, v3}, LTm;->f(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public s(IILu2;)Landroid/graphics/Typeface;
    .locals 9

    iget-object v0, p0, LK2;->b:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    const/4 p1, 0x0

    if-nez v3, :cond_0

    return-object p1

    :cond_0
    iget-object v0, p0, LK2;->c:Ljava/lang/Object;

    check-cast v0, Landroid/util/TypedValue;

    if-nez v0, :cond_1

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    iput-object v0, p0, LK2;->c:Ljava/lang/Object;

    :cond_1
    iget-object v0, p0, LK2;->c:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Landroid/util/TypedValue;

    sget-object v0, Lan;->a:Ljava/lang/ThreadLocal;

    iget-object v0, p0, LK2;->d:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->isRestricted()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v8, 0x0

    const/4 v7, 0x1

    move v5, p2

    move-object v6, p3

    invoke-static/range {v2 .. v8}, Lan;->b(Landroid/content/Context;ILandroid/util/TypedValue;ILBr;ZZ)Landroid/graphics/Typeface;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public t()I
    .locals 11

    iget v0, p0, LK2;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LK2;->d:Ljava/lang/Object;

    check-cast v0, Lcom/bumptech/glide/load/data/a;

    iget-object v1, p0, LK2;->b:Ljava/lang/Object;

    check-cast v1, Luh;

    iget-object v2, p0, LK2;->c:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    const/4 v5, -0x1

    if-ge v4, v3, :cond_2

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lnf;

    const/4 v7, 0x0

    :try_start_0
    new-instance v8, LLl;

    new-instance v9, Ljava/io/FileInputStream;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/data/a;->a()Landroid/os/ParcelFileDescriptor;

    move-result-object v10

    invoke-virtual {v10}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v10

    invoke-direct {v9, v10}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    invoke-direct {v8, v9, v1}, LLl;-><init>(Ljava/io/InputStream;Luh;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-interface {v6, v8, v1}, Lnf;->b(Ljava/io/InputStream;Luh;)I

    move-result v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v8}, LLl;->w()V

    invoke-virtual {v0}, Lcom/bumptech/glide/load/data/a;->a()Landroid/os/ParcelFileDescriptor;

    if-eq v6, v5, :cond_0

    move v5, v6

    goto :goto_2

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    move-object v7, v8

    goto :goto_1

    :catchall_1
    move-exception v1

    :goto_1
    if-eqz v7, :cond_1

    invoke-virtual {v7}, LLl;->w()V

    :cond_1
    invoke-virtual {v0}, Lcom/bumptech/glide/load/data/a;->a()Landroid/os/ParcelFileDescriptor;

    throw v1

    :cond_2
    :goto_2
    return v5

    :pswitch_0
    iget-object v0, p0, LK2;->b:Ljava/lang/Object;

    check-cast v0, Lk0;

    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;

    check-cast v0, LLl;

    invoke-virtual {v0}, LLl;->reset()V

    iget-object v1, p0, LK2;->d:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    check-cast v1, Ljava/util/ArrayList;

    iget-object v2, p0, LK2;->c:Ljava/lang/Object;

    check-cast v2, Luh;

    invoke-static {v1, v0, v2}, LTd;->q(Ljava/util/ArrayList;Ljava/io/InputStream;Luh;)I

    move-result v0

    return v0

    :pswitch_1
    iget-object v0, p0, LK2;->b:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-static {v0}, Ld5;->c(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, LK2;->d:Ljava/lang/Object;

    check-cast v1, Luh;

    const/4 v2, -0x1

    if-nez v0, :cond_3

    goto :goto_4

    :cond_3
    iget-object v3, p0, LK2;->c:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x0

    :goto_3
    if-ge v5, v4, :cond_5

    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lnf;

    :try_start_2
    invoke-interface {v6, v0, v1}, Lnf;->c(Ljava/nio/ByteBuffer;Luh;)I

    move-result v6
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-static {v0}, Ld5;->c(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    if-eq v6, v2, :cond_4

    move v2, v6

    goto :goto_4

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :catchall_2
    move-exception v1

    invoke-static {v0}, Ld5;->c(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    throw v1

    :cond_5
    :goto_4
    return v2

    :pswitch_data_0
    .packed-switch 0xd
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, LK2;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LK2;->c:Ljava/lang/Object;

    check-cast v1, LO5;

    invoke-virtual {v1}, LO5;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", hidden list:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LK2;->d:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method

.method public u()Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;
    .locals 10

    iget v0, p0, LK2;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LK2;->d:Ljava/lang/Object;

    check-cast v0, Lcom/bumptech/glide/load/data/a;

    iget-object v1, p0, LK2;->b:Ljava/lang/Object;

    check-cast v1, Luh;

    iget-object v2, p0, LK2;->c:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lnf;

    const/4 v6, 0x0

    :try_start_0
    new-instance v7, LLl;

    new-instance v8, Ljava/io/FileInputStream;

    invoke-virtual {v0}, Lcom/bumptech/glide/load/data/a;->a()Landroid/os/ParcelFileDescriptor;

    move-result-object v9

    invoke-virtual {v9}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v9

    invoke-direct {v8, v9}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    invoke-direct {v7, v8, v1}, LLl;-><init>(Ljava/io/InputStream;Luh;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-interface {v5, v7}, Lnf;->d(Ljava/io/InputStream;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v7}, LLl;->w()V

    invoke-virtual {v0}, Lcom/bumptech/glide/load/data/a;->a()Landroid/os/ParcelFileDescriptor;

    sget-object v6, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    if-eq v5, v6, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    move-object v6, v7

    goto :goto_1

    :catchall_1
    move-exception v1

    :goto_1
    if-eqz v6, :cond_1

    invoke-virtual {v6}, LLl;->w()V

    :cond_1
    invoke-virtual {v0}, Lcom/bumptech/glide/load/data/a;->a()Landroid/os/ParcelFileDescriptor;

    throw v1

    :cond_2
    sget-object v5, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->UNKNOWN:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    :goto_2
    return-object v5

    :pswitch_0
    iget-object v0, p0, LK2;->b:Ljava/lang/Object;

    check-cast v0, Lk0;

    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;

    check-cast v0, LLl;

    invoke-virtual {v0}, LLl;->reset()V

    iget-object v1, p0, LK2;->c:Ljava/lang/Object;

    check-cast v1, Luh;

    iget-object v2, p0, LK2;->d:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-static {v2, v0, v1}, LTd;->t(Ljava/util/List;Ljava/io/InputStream;Luh;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, LK2;->b:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-static {v0}, Ld5;->c(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget-object v1, p0, LK2;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static {v1, v0}, LTd;->u(Ljava/util/List;Ljava/nio/ByteBuffer;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0xd
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public w()[Lzf;
    .locals 2

    iget-object v0, p0, LK2;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    new-array v1, v1, [Lzf;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lzf;

    return-object v0
.end method

.method public x(I)I
    .locals 5

    const/4 v0, -0x1

    if-gez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, LK2;->b:Ljava/lang/Object;

    check-cast v1, LNl;

    iget-object v1, v1, LNl;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    move v2, p1

    :goto_0
    if-ge v2, v1, :cond_3

    iget-object v3, p0, LK2;->c:Ljava/lang/Object;

    check-cast v3, LO5;

    invoke-virtual {v3, v2}, LO5;->b(I)I

    move-result v4

    sub-int v4, v2, v4

    sub-int v4, p1, v4

    if-nez v4, :cond_2

    :goto_1
    invoke-virtual {v3, v2}, LO5;->d(I)Z

    move-result p1

    if-eqz p1, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return v2

    :cond_2
    add-int/2addr v2, v4

    goto :goto_0

    :cond_3
    return v0
.end method

.method public y()[Lzf;
    .locals 2

    iget-object v0, p0, LK2;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    new-array v1, v1, [Lzf;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lzf;

    return-object v0
.end method

.method public z(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, LK2;->b:Ljava/lang/Object;

    check-cast v0, LNl;

    iget-object v0, v0, LNl;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
