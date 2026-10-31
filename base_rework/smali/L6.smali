.class public final LL6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnDrawListener;
.implements Ljava/lang/Runnable;
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public final a:J

.field public b:Ljava/lang/Runnable;

.field public c:Z

.field public final synthetic d:LP6;


# direct methods
.method public constructor <init>(Lq1;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LL6;->d:LP6;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    const/16 p1, 0x2710

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, LL6;->a:J

    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 2

    const-string v0, "runnable"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p1, p0, LL6;->b:Ljava/lang/Runnable;

    iget-object p1, p0, LL6;->d:LP6;

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    const-string v0, "window.decorView"

    invoke-static {v0, p1}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    iget-boolean v0, p0, LL6;->c:Z

    if-eqz v0, :cond_1

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {v0, v1}, LTf;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->postInvalidate()V

    goto :goto_0

    :cond_1
    new-instance v0, Lt5;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lt5;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public final onDraw()V
    .locals 6

    iget-object v0, p0, LL6;->b:Ljava/lang/Runnable;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    const/4 v0, 0x0

    iput-object v0, p0, LL6;->b:Ljava/lang/Runnable;

    iget-object v0, p0, LL6;->d:LP6;

    iget-object v0, v0, LP6;->g:LVp;

    invoke-virtual {v0}, LVp;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcd;

    iget-object v2, v0, Lcd;->a:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-boolean v0, v0, Lcd;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    if-eqz v0, :cond_1

    iput-boolean v1, p0, LL6;->c:Z

    iget-object v0, p0, LL6;->d:LP6;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0

    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, LL6;->a:J

    cmp-long v0, v2, v4

    if-lez v0, :cond_1

    iput-boolean v1, p0, LL6;->c:Z

    iget-object v0, p0, LL6;->d:LP6;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public final run()V
    .locals 1

    iget-object v0, p0, LL6;->d:LP6;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V

    return-void
.end method
