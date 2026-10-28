.class public Lru/zinovin/tankspeedometer/DownloadActivity;
.super Lq1;
.source "SourceFile"


# static fields
.field public static final O:Lmi;


# instance fields
.field public A:Lcom/google/android/material/textfield/TextInputEditText;

.field public B:Lcom/google/android/material/textfield/TextInputEditText;

.field public C:Landroid/widget/ProgressBar;

.field public D:Landroid/widget/TextView;

.field public E:Landroid/widget/CheckBox;

.field public F:Landroid/widget/CheckBox;

.field public G:Landroid/os/Handler;

.field public H:Ljava/lang/String;

.field public I:Z

.field public J:Ljava/util/concurrent/ExecutorService;

.field public K:I

.field public L:I

.field public final M:Ljava/util/ArrayList;

.field public final N:Ljava/lang/Object;

.field public y:Landroid/widget/Button;

.field public z:Landroid/widget/Button;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lmi;->c:Ljava/util/regex/Pattern;

    const-string v0, "application/json; charset=utf-8"

    invoke-static {v0}, LTf;->r(Ljava/lang/String;)Lmi;

    move-result-object v0

    sput-object v0, Lru/zinovin/tankspeedometer/DownloadActivity;->O:Lmi;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lq1;-><init>()V

    const-string v0, "UPDATE"

    iput-object v0, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->H:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->I:Z

    iput v0, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->L:I

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->M:Ljava/util/ArrayList;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->N:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final E()V
    .locals 2

    invoke-static {}, LTf;->x()Ljava/lang/String;

    move-result-object v0

    const-string v1, "VERSION"

    invoke-static {v1, v0}, LTf;->W(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/DownloadActivity;->K()Z

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lru/zinovin/tankspeedometer/MainActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final F(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 6

    sget-object v0, LOm;->a:Lmi;

    const-string v0, "T500.ResourceDL"

    const/4 v1, 0x0

    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    const-string v3, "vin"

    const-string v4, "persist.gwm.vehicle.vin"

    const/4 v5, 0x0

    invoke-static {v5, v4}, LTf;->F(Landroid/app/Activity;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v3, "version"

    invoke-static {}, LTf;->x()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v3, "password"
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v4, ""

    if-eqz p2, :cond_0

    :try_start_1
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :catch_0
    move-exception p2

    goto :goto_1

    :catch_1
    move-exception p2

    goto :goto_2

    :cond_0
    move-object p2, v4

    :goto_0
    invoke-virtual {v2, v3, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "token"

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    :cond_1
    invoke-virtual {v2, p2, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "resource"

    invoke-virtual {v2, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "digits"

    invoke-static {p0}, Lru/zinovin/jni/JniUtils;->getData(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v2, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "lang"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p3

    invoke-virtual {p3}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v2, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {p0, v2, p1}, LOm;->a(Landroid/content/Context;Lorg/json/JSONObject;Ljava/lang/String;)Z

    move-result v1
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :goto_1
    new-instance p3, Ljava/lang/StringBuilder;

    const-string v2, "Unexpected error for resource: "

    invoke-direct {p3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, p2}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    :goto_2
    new-instance p3, Ljava/lang/StringBuilder;

    const-string v2, "JSON error for resource: "

    invoke-direct {p3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1, p2}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_3
    return v1
.end method

.method public final G()V
    .locals 2

    iget-object v0, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->y:Landroid/widget/Button;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->z:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->D:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->C:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final H(Ljava/lang/Exception;Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ERROR: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lru/zinovin/tankspeedometer/DownloadActivity;->P(Ljava/lang/String;)V

    :cond_0
    const-string v0, "ERROR in "

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "T500.ERROR"

    invoke-static {v0, p2, p1}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final I(Ljava/lang/String;Ljava/lang/String;)V
    .locals 10

    invoke-static {}, LUd;->D()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    iput v1, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->K:I

    iget-object v1, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->N:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->M:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    iput v1, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->L:I

    iget-object v2, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->C:Landroid/widget/ProgressBar;

    iget v3, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->K:I

    invoke-virtual {v2, v3}, Landroid/widget/ProgressBar;->setMax(I)V

    iget-object v2, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->C:Landroid/widget/ProgressBar;

    invoke-virtual {v2, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    iget-object v2, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->D:Landroid/widget/TextView;

    const v3, 0x7f1301a3

    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v4, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->K:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {v1, v4}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v3, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v1, Ljava/util/concurrent/CountDownLatch;

    iget v2, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->K:I

    invoke-direct {v1, v2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, LP2;

    iget-object v2, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->J:Ljava/util/concurrent/ExecutorService;

    new-instance v9, LG9;

    move-object v3, v9

    move-object v4, p0

    move-object v5, v1

    move-object v7, p1

    move-object v8, p2

    invoke-direct/range {v3 .. v8}, LG9;-><init>(Lru/zinovin/tankspeedometer/DownloadActivity;Ljava/util/concurrent/CountDownLatch;LP2;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v9}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/Thread;

    new-instance p2, LC9;

    const/4 v0, 0x1

    invoke-direct {p2, p0, v1, v0}, LC9;-><init>(Lru/zinovin/tankspeedometer/DownloadActivity;Ljava/util/concurrent/CountDownLatch;I)V

    invoke-direct {p1, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final J()Z
    .locals 1

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final K()Z
    .locals 4

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    new-instance v1, Ljava/lang/Thread;

    new-instance v2, LB1;

    const/4 v3, 0x7

    invoke-direct {v2, p0, v3, v0}, LB1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Thread;->join()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "isCarValid()"

    invoke-virtual {p0, v1, v2}, Lru/zinovin/tankspeedometer/DownloadActivity;->H(Ljava/lang/Exception;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public final L()V
    .locals 7

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/DownloadActivity;->J()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->N:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->M:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/DownloadActivity;->J()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/DownloadActivity;->E()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto/16 :goto_3

    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :cond_2
    invoke-static {}, LUd;->D()Ljava/util/ArrayList;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LP2;

    iget-object v4, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->M:Ljava/util/ArrayList;

    iget-object v5, v3, LP2;->a:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v1

    iput v1, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->K:I

    const/4 v1, 0x0

    iput v1, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->L:I

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/DownloadActivity;->J()Z

    move-result v3

    if-eqz v3, :cond_6

    iget-object v3, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->C:Landroid/widget/ProgressBar;

    iget v4, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->K:I

    invoke-virtual {v3, v4}, Landroid/widget/ProgressBar;->setMax(I)V

    iget-object v3, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->C:Landroid/widget/ProgressBar;

    invoke-virtual {v3, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v3, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->D:Landroid/widget/TextView;

    invoke-virtual {v3, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/DownloadActivity;->Q()V

    iget-object v3, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->y:Landroid/widget/Button;

    if-eqz v3, :cond_5

    invoke-virtual {v3, v1}, Landroid/view/View;->setEnabled(Z)V

    :cond_5
    iget-object v3, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->z:Landroid/widget/Button;

    if-eqz v3, :cond_6

    invoke-virtual {v3, v1}, Landroid/view/View;->setEnabled(Z)V

    :cond_6
    new-instance v1, Ljava/util/ArrayList;

    iget-object v3, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->M:Ljava/util/ArrayList;

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v1, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->M:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    new-instance v1, Ljava/util/concurrent/CountDownLatch;

    iget v3, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->K:I

    invoke-direct {v1, v3}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LP2;

    iget-object v4, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->J:Ljava/util/concurrent/ExecutorService;

    new-instance v5, LB9;

    const/4 v6, 0x0

    invoke-direct {v5, p0, v3, v1, v6}, LB9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface {v4, v5}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_2

    :cond_7
    new-instance v2, Ljava/lang/Thread;

    new-instance v3, LC9;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v1, v4}, LC9;-><init>(Lru/zinovin/tankspeedometer/DownloadActivity;Ljava/util/concurrent/CountDownLatch;I)V

    invoke-direct {v2, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    monitor-exit v0

    return-void

    :goto_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final M()V
    .locals 4

    iget-object v0, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->C:Landroid/widget/ProgressBar;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->D:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->y:Landroid/widget/Button;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->y:Landroid/widget/Button;

    const v2, 0x7f1301ce

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->y:Landroid/widget/Button;

    new-instance v2, Lv9;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, Lv9;-><init>(Lru/zinovin/tankspeedometer/DownloadActivity;I)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    iget-object v0, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->z:Landroid/widget/Button;

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    :cond_1
    invoke-virtual {p0}, Lq1;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget-object v1, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->M:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const v3, 0x7f110001

    invoke-virtual {v0, v3, v2, v1}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, LLh;

    invoke-direct {v1, p0}, LLh;-><init>(Landroid/content/Context;)V

    const v2, 0x7f1301a0

    invoke-virtual {v1, v2}, LLh;->k(I)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n\n"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v0, 0x7f1301cf

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, v1, LQ0;->b:Ljava/lang/Object;

    check-cast v2, LM0;

    iput-object v0, v2, LM0;->f:Ljava/lang/CharSequence;

    new-instance v0, Ly9;

    const/4 v3, 0x0

    invoke-direct {v0, p0, v3}, Ly9;-><init>(Lru/zinovin/tankspeedometer/DownloadActivity;I)V

    invoke-virtual {v1, v0}, LLh;->j(Landroid/content/DialogInterface$OnClickListener;)V

    new-instance v0, Ly9;

    const/4 v3, 0x1

    invoke-direct {v0, p0, v3}, Ly9;-><init>(Lru/zinovin/tankspeedometer/DownloadActivity;I)V

    const v3, 0x7f130193

    invoke-virtual {v1, v3, v0}, LLh;->i(ILandroid/content/DialogInterface$OnClickListener;)V

    const/4 v0, 0x0

    iput-boolean v0, v2, LM0;->m:Z

    :try_start_0
    invoke-virtual {v1}, LQ0;->g()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "T500.DOWNLOADER"

    const-string v2, "Error showing dialog"

    invoke-static {v1, v2, v0}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :goto_0
    return-void
.end method

.method public final N()V
    .locals 3

    new-instance v0, LLh;

    invoke-direct {v0, p0}, LLh;-><init>(Landroid/content/Context;)V

    const v1, 0x7f1301a6

    invoke-virtual {v0, v1}, LLh;->k(I)V

    invoke-virtual {v0}, LLh;->h()V

    new-instance v1, Ly9;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Ly9;-><init>(Lru/zinovin/tankspeedometer/DownloadActivity;I)V

    invoke-virtual {v0, v1}, LLh;->j(Landroid/content/DialogInterface$OnClickListener;)V

    new-instance v1, Ly9;

    const/4 v2, 0x3

    invoke-direct {v1, p0, v2}, Ly9;-><init>(Lru/zinovin/tankspeedometer/DownloadActivity;I)V

    const v2, 0x7f1301aa

    invoke-virtual {v0, v2, v1}, LLh;->i(ILandroid/content/DialogInterface$OnClickListener;)V

    iget-object v1, v0, LQ0;->b:Ljava/lang/Object;

    check-cast v1, LM0;

    const/4 v2, 0x0

    iput-boolean v2, v1, LM0;->m:Z

    :try_start_0
    invoke-virtual {v0}, LQ0;->g()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "T500.DOWNLOADER"

    const-string v2, "Error showing dialog"

    invoke-static {v1, v2, v0}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :goto_0
    return-void
.end method

.method public final O()V
    .locals 5

    iget-object v0, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->C:Landroid/widget/ProgressBar;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->D:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lq1;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget-object v1, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->M:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const v3, 0x7f110002

    invoke-virtual {v0, v3, v2, v1}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, LLh;

    invoke-direct {v1, p0}, LLh;-><init>(Landroid/content/Context;)V

    const v2, 0x7f1301a0

    invoke-virtual {v1, v2}, LLh;->k(I)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n\n"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v0, 0x7f1301d6

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, v1, LQ0;->b:Ljava/lang/Object;

    check-cast v2, LM0;

    iput-object v0, v2, LM0;->f:Ljava/lang/CharSequence;

    new-instance v0, Ly9;

    const/4 v3, 0x4

    invoke-direct {v0, p0, v3}, Ly9;-><init>(Lru/zinovin/tankspeedometer/DownloadActivity;I)V

    invoke-virtual {v1, v0}, LLh;->j(Landroid/content/DialogInterface$OnClickListener;)V

    new-instance v0, Ly9;

    const/4 v3, 0x5

    invoke-direct {v0, p0, v3}, Ly9;-><init>(Lru/zinovin/tankspeedometer/DownloadActivity;I)V

    iget-object v3, v2, LM0;->a:Landroid/content/Context;

    const v4, 0x7f1301d5

    invoke-virtual {v3, v4}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v3

    iput-object v3, v2, LM0;->k:Ljava/lang/CharSequence;

    iput-object v0, v2, LM0;->l:Landroid/content/DialogInterface$OnClickListener;

    new-instance v0, Ly9;

    const/4 v3, 0x6

    invoke-direct {v0, p0, v3}, Ly9;-><init>(Lru/zinovin/tankspeedometer/DownloadActivity;I)V

    const v3, 0x7f130193

    invoke-virtual {v1, v3, v0}, LLh;->i(ILandroid/content/DialogInterface$OnClickListener;)V

    const/4 v0, 0x0

    iput-boolean v0, v2, LM0;->m:Z

    :try_start_0
    invoke-virtual {v1}, LQ0;->g()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "T500.DOWNLOADER"

    const-string v2, "Error showing dialog"

    invoke-static {v1, v2, v0}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {}, LTf;->x()Ljava/lang/String;

    move-result-object v0

    const-string v1, "VERSION"

    invoke-static {v1, v0}, LTf;->W(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/DownloadActivity;->K()Z

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lru/zinovin/tankspeedometer/MainActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :goto_0
    return-void
.end method

.method public final P(Ljava/lang/String;)V
    .locals 2

    iget-boolean v0, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->I:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, LE9;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, LE9;-><init>(Lru/zinovin/tankspeedometer/DownloadActivity;Ljava/lang/String;I)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public final Q()V
    .locals 4

    iget-object v0, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->C:Landroid/widget/ProgressBar;

    iget v1, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->L:I

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    iget-object v0, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->D:Landroid/widget/TextView;

    const v1, 0x7f1301a3

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->L:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->K:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final attachBaseContext(Landroid/content/Context;)V
    .locals 3

    invoke-static {p1}, Lmk;->l(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "language"

    const-string v2, "sys"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-static {p1, v0}, LF4;->b0(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Context;

    move-result-object p1

    invoke-super {p0, p1}, Lq1;->attachBaseContext(Landroid/content/Context;)V

    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 10

    invoke-super {p0, p1}, Lq1;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "DOWNLOAD_MODE"

    const-string v1, "UPDATE"

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->H:Ljava/lang/String;

    const-string v0, "MANUAL_DOWNLOAD"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    const v0, 0x7f0e005e

    invoke-virtual {p0, v0}, Lq1;->setContentView(I)V

    const v0, 0x7f0b029c

    invoke-virtual {p0, v0}, Lq1;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/appbar/MaterialToolbar;

    invoke-virtual {p0, v0}, Lq1;->D(Lcom/google/android/material/appbar/MaterialToolbar;)V

    invoke-virtual {p0}, Lq1;->u()LBr;

    move-result-object v0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lq1;->u()LBr;

    move-result-object v0

    invoke-virtual {v0, v2}, LBr;->k0(Z)V

    invoke-virtual {p0}, Lq1;->u()LBr;

    move-result-object v0

    const v3, 0x7f1301e5

    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, LBr;->m0(Ljava/lang/String;)V

    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v0, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->G:Landroid/os/Handler;

    const/4 v0, 0x3

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->J:Ljava/util/concurrent/ExecutorService;

    const-string v0, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {p0, v0}, LF4;->j(Landroid/content/Context;Ljava/lang/String;)I

    move-result v3

    if-eqz v3, :cond_1

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, v2}, LF4;->W(Landroid/app/Activity;[Ljava/lang/String;I)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_1
    const-string v0, "authcode"

    const-string v3, "password"

    const v4, 0x7f0b020d

    const v5, 0x7f0b020b

    const-string v6, "DEMO"

    const/4 v7, 0x0

    if-nez p1, :cond_3

    iget-object p1, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->H:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->H:Ljava/lang/String;

    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    new-instance v1, Ljava/lang/Thread;

    new-instance v8, Lw9;

    const/4 v9, 0x1

    invoke-direct {v8, p1, v9}, Lw9;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;I)V

    invoke-direct {v1, v8}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Thread;->join()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v8, "silentDownload()"

    invoke-virtual {p0, v1, v8}, Lru/zinovin/tankspeedometer/DownloadActivity;->H(Ljava/lang/Exception;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/DownloadActivity;->K()Z

    move-result p1

    if-eqz p1, :cond_3

    iput-boolean v2, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->I:Z

    const-string p1, "T500.DOWNLOADER"

    const-string v1, "Resources can be downloaded in silent mode"

    invoke-static {p1, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    const p1, 0x7f0e00ff

    invoke-virtual {p0, p1}, Lq1;->setContentView(I)V

    invoke-virtual {p0, v5}, Lq1;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->C:Landroid/widget/ProgressBar;

    invoke-virtual {p0, v4}, Lq1;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->D:Landroid/widget/TextView;

    invoke-static {v3}, LTf;->H(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0}, LTf;->H(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lru/zinovin/tankspeedometer/DownloadActivity;->I(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_3

    :cond_3
    :goto_1
    iput-boolean v7, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->I:Z

    const p1, 0x7f0b0111

    invoke-virtual {p0, p1}, Lq1;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    iput-object p1, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->E:Landroid/widget/CheckBox;

    const p1, 0x7f0b0089

    invoke-virtual {p0, p1}, Lq1;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    iput-object p1, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->F:Landroid/widget/CheckBox;

    const p1, 0x7f0b0099

    invoke-virtual {p0, p1}, Lq1;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->y:Landroid/widget/Button;

    invoke-virtual {p1, v7}, Landroid/view/View;->setEnabled(Z)V

    iget-object p1, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->H:Ljava/lang/String;

    const-string v1, "DOWNLOAD"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 v1, 0x4

    if-eqz p1, :cond_4

    iget-object p1, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->y:Landroid/widget/Button;

    const v6, 0x7f1301a4

    invoke-virtual {p0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->E:Landroid/widget/CheckBox;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->F:Landroid/widget/CheckBox;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    :cond_4
    iget-object p1, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->H:Ljava/lang/String;

    invoke-virtual {p1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->y:Landroid/widget/Button;

    const v6, 0x7f13019d

    invoke-virtual {p0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->E:Landroid/widget/CheckBox;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->F:Landroid/widget/CheckBox;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_5
    :goto_2
    const p1, 0x7f0b02c6

    invoke-virtual {p0, p1}, Lq1;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v6, "VIN: "

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v6, "persist.gwm.vehicle.vin"

    invoke-static {p0, v6}, LTf;->F(Landroid/app/Activity;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p1, 0x7f0b01fe

    invoke-virtual {p0, p1}, Lq1;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    iput-object p1, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->A:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-static {v3}, LTf;->H(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p1, 0x7f0b0075

    invoke-virtual {p0, p1}, Lq1;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    iput-object p1, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->B:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-static {v0}, LTf;->H(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0, v5}, Lq1;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->C:Landroid/widget/ProgressBar;

    invoke-virtual {p0, v4}, Lq1;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->D:Landroid/widget/TextView;

    const p1, 0x7f0b01a5

    invoke-virtual {p0, p1}, Lq1;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, LTf;->v(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "persist.gwm.car.mode1"

    invoke-static {p0, v3}, LTf;->F(Landroid/app/Activity;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "-"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "persist.gwm.car.mode2"

    invoke-static {p0, v3}, LTf;->F(Landroid/app/Activity;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f0b02be

    invoke-virtual {p0, v1}, Lq1;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-static {}, LTf;->s()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const v4, 0x7f1301e8

    invoke-virtual {p0, v4, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v1, 0x7f130196

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p1, 0x7f0b0098

    invoke-virtual {p0, p1}, Lq1;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->z:Landroid/widget/Button;

    new-instance v0, Lv9;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lv9;-><init>(Lru/zinovin/tankspeedometer/DownloadActivity;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->y:Landroid/widget/Button;

    invoke-virtual {p1, v2}, Landroid/view/View;->setEnabled(Z)V

    iget-object p1, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->y:Landroid/widget/Button;

    new-instance v0, Lv9;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lv9;-><init>(Lru/zinovin/tankspeedometer/DownloadActivity;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_3
    return-void
.end method

.method public final onDestroy()V
    .locals 1

    invoke-super {p0}, Lq1;->onDestroy()V

    iget-object v0, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->J:Ljava/util/concurrent/ExecutorService;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isShutdown()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lru/zinovin/tankspeedometer/DownloadActivity;->J:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    :cond_0
    return-void
.end method

.method public final onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x102002c

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, LP6;->onBackPressed()V

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method
