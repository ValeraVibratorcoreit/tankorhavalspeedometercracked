.class public final LB4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKi;


# instance fields
.field public a:Z

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Landroid/os/Handler;

    .line 4
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    new-instance v2, Le4;

    const/4 v3, 0x1

    .line 5
    invoke-direct {v2, v3}, Le4;-><init>(I)V

    .line 6
    invoke-direct {v0, v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v0, p0, LB4;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Z)V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LB4;->b:Ljava/lang/Object;

    iput-boolean p2, p0, LB4;->a:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, LB4;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lpa;Z)V
    .locals 0

    .line 7
    invoke-direct {p0, p1}, LB4;-><init>(Ljava/lang/Object;)V

    .line 8
    iput-boolean p2, p0, LB4;->a:Z

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, LB4;->a:Z

    return v0
.end method

.method public b(Lti;Z)V
    .locals 2

    iget-boolean p2, p0, LB4;->a:Z

    if-eqz p2, :cond_0

    return-void

    :cond_0
    const/4 p2, 0x1

    iput-boolean p2, p0, LB4;->a:Z

    iget-object p2, p0, LB4;->b:Ljava/lang/Object;

    check-cast p2, LYq;

    iget-object v0, p2, LYq;->j:Lar;

    iget-object v0, v0, Lar;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->a:Landroidx/appcompat/widget/ActionMenuView;

    if-eqz v0, :cond_1

    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->t:Ll0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ll0;->e()Z

    iget-object v0, v0, Ll0;->t:Lg0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LFi;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, v0, LFi;->j:LDi;

    invoke-interface {v0}, LCo;->dismiss()V

    :cond_1
    iget-object p2, p2, LYq;->k:Landroid/view/Window$Callback;

    const/16 v0, 0x6c

    invoke-interface {p2, v0, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, LB4;->a:Z

    return-void
.end method

.method public c(Ljava/lang/CharSequence;I)Z
    .locals 1

    if-eqz p1, :cond_3

    if-ltz p2, :cond_3

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    sub-int/2addr v0, p2

    if-ltz v0, :cond_3

    iget-object v0, p0, LB4;->b:Ljava/lang/Object;

    check-cast v0, Lpa;

    if-nez v0, :cond_0

    invoke-virtual {p0}, LB4;->a()Z

    move-result p1

    return p1

    :cond_0
    invoke-virtual {v0, p1, p2}, Lpa;->q(Ljava/lang/CharSequence;I)I

    move-result p1

    const/4 p2, 0x1

    if-eqz p1, :cond_2

    if-eq p1, p2, :cond_1

    invoke-virtual {p0}, LB4;->a()Z

    move-result p2

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :cond_2
    :goto_0
    return p2

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public declared-synchronized d(LIm;Z)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, LB4;->a:Z

    const/4 v1, 0x1

    if-nez v0, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    iput-boolean v1, p0, LB4;->a:Z

    invoke-interface {p1}, LIm;->e()V

    const/4 p1, 0x0

    iput-boolean p1, p0, LB4;->a:Z

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_0
    iget-object p2, p0, LB4;->b:Ljava/lang/Object;

    check-cast p2, Landroid/os/Handler;

    invoke-virtual {p2, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    monitor-exit p0

    return-void

    :goto_2
    monitor-exit p0

    throw p1
.end method

.method public u(Lti;)Z
    .locals 2

    iget-object v0, p0, LB4;->b:Ljava/lang/Object;

    check-cast v0, LYq;

    iget-object v0, v0, LYq;->k:Landroid/view/Window$Callback;

    const/16 v1, 0x6c

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    const/4 p1, 0x1

    return p1
.end method
