.class public Loj;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final k:Ljava/lang/Object;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Lon;

.field public c:I

.field public d:Z

.field public volatile e:Ljava/lang/Object;

.field public volatile f:Ljava/lang/Object;

.field public g:I

.field public h:Z

.field public i:Z

.field public final j:Lr0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Loj;->k:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Loj;->a:Ljava/lang/Object;

    .line 11
    new-instance v0, Lon;

    invoke-direct {v0}, Lon;-><init>()V

    iput-object v0, p0, Loj;->b:Lon;

    const/4 v0, 0x0

    .line 12
    iput v0, p0, Loj;->c:I

    .line 13
    sget-object v0, Loj;->k:Ljava/lang/Object;

    iput-object v0, p0, Loj;->f:Ljava/lang/Object;

    .line 14
    new-instance v1, Lr0;

    const/16 v2, 0xb

    invoke-direct {v1, p0, v2}, Lr0;-><init>(Ljava/lang/Object;I)V

    iput-object v1, p0, Loj;->j:Lr0;

    .line 15
    iput-object v0, p0, Loj;->e:Ljava/lang/Object;

    const/4 v0, -0x1

    .line 16
    iput v0, p0, Loj;->g:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Loj;->a:Ljava/lang/Object;

    .line 3
    new-instance v0, Lon;

    invoke-direct {v0}, Lon;-><init>()V

    iput-object v0, p0, Loj;->b:Lon;

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Loj;->c:I

    .line 5
    sget-object v1, Loj;->k:Ljava/lang/Object;

    iput-object v1, p0, Loj;->f:Ljava/lang/Object;

    .line 6
    new-instance v1, Lr0;

    const/16 v2, 0xb

    invoke-direct {v1, p0, v2}, Lr0;-><init>(Ljava/lang/Object;I)V

    iput-object v1, p0, Loj;->j:Lr0;

    .line 7
    iput-object p1, p0, Loj;->e:Ljava/lang/Object;

    .line 8
    iput v0, p0, Loj;->g:I

    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 3

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

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot invoke "

    const-string v2, " on a background thread"

    invoke-static {v1, p0, v2}, LVo;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final b(Leh;)V
    .locals 2

    iget-boolean v0, p1, Leh;->b:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Leh;->d()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Leh;->a(Z)V

    return-void

    :cond_1
    iget v0, p1, Leh;->c:I

    iget v1, p0, Loj;->g:I

    if-lt v0, v1, :cond_2

    return-void

    :cond_2
    iput v1, p1, Leh;->c:I

    iget-object p1, p1, Leh;->a:LMj;

    iget-object v0, p0, Loj;->e:Ljava/lang/Object;

    invoke-interface {p1, v0}, LMj;->w(Ljava/lang/Object;)V

    return-void
.end method

.method public final c(Leh;)V
    .locals 4

    iget-boolean v0, p0, Loj;->h:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Loj;->i:Z

    return-void

    :cond_0
    iput-boolean v1, p0, Loj;->h:Z

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Loj;->i:Z

    if-eqz p1, :cond_2

    invoke-virtual {p0, p1}, Loj;->b(Leh;)V

    const/4 p1, 0x0

    goto :goto_0

    :cond_2
    iget-object v1, p0, Loj;->b:Lon;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lmn;

    invoke-direct {v2, v1}, Lmn;-><init>(Lon;)V

    iget-object v1, v1, Lon;->c:Ljava/util/WeakHashMap;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    invoke-virtual {v2}, Lmn;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v2}, Lmn;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leh;

    invoke-virtual {p0, v1}, Loj;->b(Leh;)V

    iget-boolean v1, p0, Loj;->i:Z

    if-eqz v1, :cond_3

    :cond_4
    :goto_0
    iget-boolean v1, p0, Loj;->i:Z

    if-nez v1, :cond_1

    iput-boolean v0, p0, Loj;->h:Z

    return-void
.end method

.method public final d()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Loj;->e:Ljava/lang/Object;

    sget-object v1, Loj;->k:Ljava/lang/Object;

    if-eq v0, v1, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public e(Ljava/lang/Object;)V
    .locals 1

    const-string v0, "setValue"

    invoke-static {v0}, Loj;->a(Ljava/lang/String;)V

    iget v0, p0, Loj;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Loj;->g:I

    iput-object p1, p0, Loj;->e:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Loj;->c(Leh;)V

    return-void
.end method
