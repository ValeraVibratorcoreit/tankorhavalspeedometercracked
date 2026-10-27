.class public final LVt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:LVt;


# instance fields
.field public final a:LTt;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    sget-object v0, LSt;->q:LVt;

    sput-object v0, LVt;->b:LVt;

    goto :goto_0

    :cond_0
    sget-object v0, LTt;->b:LVt;

    sput-object v0, LVt;->b:LVt;

    :goto_0
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance v0, LTt;

    invoke-direct {v0, p0}, LTt;-><init>(LVt;)V

    iput-object v0, p0, LVt;->a:LTt;

    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsets;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 3
    new-instance v0, LSt;

    invoke-direct {v0, p0, p1}, LSt;-><init>(LVt;Landroid/view/WindowInsets;)V

    iput-object v0, p0, LVt;->a:LTt;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    .line 4
    new-instance v0, LRt;

    invoke-direct {v0, p0, p1}, LRt;-><init>(LVt;Landroid/view/WindowInsets;)V

    iput-object v0, p0, LVt;->a:LTt;

    goto :goto_0

    .line 5
    :cond_1
    new-instance v0, LQt;

    invoke-direct {v0, p0, p1}, LQt;-><init>(LVt;Landroid/view/WindowInsets;)V

    iput-object v0, p0, LVt;->a:LTt;

    :goto_0
    return-void
.end method

.method public static e(LHf;IIII)LHf;
    .locals 5

    iget v0, p0, LHf;->a:I

    sub-int/2addr v0, p1

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v2, p0, LHf;->b:I

    sub-int/2addr v2, p2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget v3, p0, LHf;->c:I

    sub-int/2addr v3, p3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    iget v4, p0, LHf;->d:I

    sub-int/2addr v4, p4

    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-ne v0, p1, :cond_0

    if-ne v2, p2, :cond_0

    if-ne v3, p3, :cond_0

    if-ne v1, p4, :cond_0

    return-object p0

    :cond_0
    invoke-static {v0, v2, v3, v1}, LHf;->b(IIII)LHf;

    move-result-object p0

    return-object p0
.end method

.method public static g(Landroid/view/View;Landroid/view/WindowInsets;)LVt;
    .locals 2

    new-instance v0, LVt;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v0, p1}, LVt;-><init>(Landroid/view/WindowInsets;)V

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, LGs;->a:Ljava/util/WeakHashMap;

    invoke-static {p0}, Lws;->a(Landroid/view/View;)LVt;

    move-result-object p1

    iget-object v1, v0, LVt;->a:LTt;

    invoke-virtual {v1, p1}, LTt;->p(LVt;)V

    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p0

    invoke-virtual {v1, p0}, LTt;->d(Landroid/view/View;)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, LVt;->a:LTt;

    invoke-virtual {v0}, LTt;->j()LHf;

    move-result-object v0

    iget v0, v0, LHf;->d:I

    return v0
.end method

.method public final b()I
    .locals 1

    iget-object v0, p0, LVt;->a:LTt;

    invoke-virtual {v0}, LTt;->j()LHf;

    move-result-object v0

    iget v0, v0, LHf;->a:I

    return v0
.end method

.method public final c()I
    .locals 1

    iget-object v0, p0, LVt;->a:LTt;

    invoke-virtual {v0}, LTt;->j()LHf;

    move-result-object v0

    iget v0, v0, LHf;->c:I

    return v0
.end method

.method public final d()I
    .locals 1

    iget-object v0, p0, LVt;->a:LTt;

    invoke-virtual {v0}, LTt;->j()LHf;

    move-result-object v0

    iget v0, v0, LHf;->b:I

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, LVt;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, LVt;

    iget-object p1, p1, LVt;->a:LTt;

    iget-object v0, p0, LVt;->a:LTt;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final f()Landroid/view/WindowInsets;
    .locals 2

    iget-object v0, p0, LVt;->a:LTt;

    instance-of v1, v0, LOt;

    if-eqz v1, :cond_0

    check-cast v0, LOt;

    iget-object v0, v0, LOt;->c:Landroid/view/WindowInsets;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, LVt;->a:LTt;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LTt;->hashCode()I

    move-result v0

    :goto_0
    return v0
.end method
