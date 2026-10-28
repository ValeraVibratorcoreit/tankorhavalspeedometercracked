.class public final Li0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 1
    iput p1, p0, Li0;->a:I

    iput-object p2, p0, Li0;->b:Ljava/lang/Object;

    iput-object p3, p0, Li0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/behavior/SwipeDismissBehavior;Landroid/view/View;Z)V
    .locals 0

    const/4 p3, 0x5

    iput p3, p0, Li0;->a:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li0;->c:Ljava/lang/Object;

    .line 5
    iput-object p2, p0, Li0;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 2
    iput p2, p0, Li0;->a:I

    iput-object p1, p0, Li0;->c:Ljava/lang/Object;

    iput-object p3, p0, Li0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lru/zinovin/tankspeedometer/service/TboxMonitorService;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Li0;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li0;->c:Ljava/lang/Object;

    const-string p1, "TBOX \u043f\u0440\u0430\u0432\u0438\u043b\u043e \u043e\u0442\u0441\u0443\u0442\u0441\u0442\u0432\u0443\u0435\u0442. \u0412\u043a\u043b\u044e\u0447\u0430\u0435\u043c \u0431\u043b\u043e\u043a\u0438\u0440\u043e\u0432\u043a\u0443"

    iput-object p1, p0, Li0;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    const/4 v0, 0x1

    iget v1, p0, Li0;->a:I

    packed-switch v1, :pswitch_data_0

    iget-object v1, p0, Li0;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Li0;->c:Ljava/lang/Object;

    check-cast v2, Lru/zinovin/tankspeedometer/service/TboxMonitorService;

    invoke-static {v2, v1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void

    :pswitch_0
    iget-object v0, p0, Li0;->c:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/behavior/SwipeDismissBehavior;

    iget-object v0, v0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->a:LKs;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LKs;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, LGs;->a:Ljava/util/WeakHashMap;

    iget-object v0, p0, Li0;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    :cond_0
    return-void

    :pswitch_1
    iget-object v0, p0, Li0;->b:Ljava/lang/Object;

    check-cast v0, Ly7;

    iget-object v1, p0, Li0;->c:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ly7;->accept(Ljava/lang/Object;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Li0;->c:Ljava/lang/Object;

    check-cast v0, LYd;

    iget-boolean v1, v0, LYd;->d:Z

    if-eqz v1, :cond_1

    new-instance v1, Landroid/os/StrictMode$ThreadPolicy$Builder;

    invoke-direct {v1}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>()V

    invoke-virtual {v1}, Landroid/os/StrictMode$ThreadPolicy$Builder;->detectNetwork()Landroid/os/StrictMode$ThreadPolicy$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/StrictMode$ThreadPolicy$Builder;->penaltyDeath()Landroid/os/StrictMode$ThreadPolicy$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v1

    invoke-static {v1}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    :cond_1
    :try_start_0
    iget-object v1, p0, Li0;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    iget-object v0, v0, LYd;->c:Lpa;

    invoke-virtual {v0, v1}, Lpa;->y(Ljava/lang/Throwable;)V

    :goto_0
    return-void

    :pswitch_3
    invoke-static {}, Lpe;->a()Lpe;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LQr;->a()V

    iget-object v1, v1, Lpe;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v1, p0, Li0;->c:Ljava/lang/Object;

    check-cast v1, LXb;

    iget-object v1, v1, LXb;->b:LYb;

    iput-boolean v0, v1, LYb;->b:Z

    iget-object v0, p0, Li0;->c:Ljava/lang/Object;

    check-cast v0, LXb;

    iget-object v0, v0, LXb;->a:Landroid/view/View;

    iget-object v1, p0, Li0;->b:Ljava/lang/Object;

    check-cast v1, Landroid/view/ViewTreeObserver$OnDrawListener;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V

    iget-object v0, p0, Li0;->c:Ljava/lang/Object;

    check-cast v0, LXb;

    iget-object v0, v0, LXb;->b:LYb;

    iget-object v0, v0, LYb;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    return-void

    :pswitch_4
    iget-object v0, p0, Li0;->b:Ljava/lang/Object;

    check-cast v0, LVi;

    iget-object v0, v0, LVi;->a:Ljava/lang/Object;

    check-cast v0, LBr;

    if-eqz v0, :cond_2

    iget-object v1, p0, Li0;->c:Ljava/lang/Object;

    check-cast v1, Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, LBr;->P(Landroid/graphics/Typeface;)V

    :cond_2
    return-void

    :pswitch_5
    iget-object v0, p0, Li0;->c:Ljava/lang/Object;

    check-cast v0, Ll0;

    iget-object v1, v0, Ll0;->c:Lti;

    if-eqz v1, :cond_3

    iget-object v2, v1, Lti;->e:Lri;

    if-eqz v2, :cond_3

    invoke-interface {v2, v1}, Lri;->k(Lti;)V

    :cond_3
    iget-object v1, v0, Ll0;->h:LNi;

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    if-eqz v1, :cond_6

    iget-object v1, p0, Li0;->b:Ljava/lang/Object;

    check-cast v1, Lg0;

    invoke-virtual {v1}, LFi;->b()Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_1

    :cond_4
    iget-object v2, v1, LFi;->f:Landroid/view/View;

    if-nez v2, :cond_5

    goto :goto_2

    :cond_5
    const/4 v2, 0x0

    invoke-virtual {v1, v2, v2, v2, v2}, LFi;->d(IIZZ)V

    :goto_1
    iput-object v1, v0, Ll0;->s:Lg0;

    :cond_6
    :goto_2
    const/4 v1, 0x0

    iput-object v1, v0, Ll0;->u:Li0;

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
