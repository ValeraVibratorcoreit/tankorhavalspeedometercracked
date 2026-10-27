.class public Le9;
.super Lzc;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public T:Landroid/os/Handler;

.field public final U:Lr0;

.field public final V:Lb9;

.field public final W:Lc9;

.field public X:I

.field public Y:I

.field public Z:Z

.field public a0:Z

.field public b0:I

.field public c0:Z

.field public final d0:Lk0;

.field public e0:Landroid/app/Dialog;

.field public f0:Z

.field public g0:Z

.field public h0:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lzc;-><init>()V

    new-instance v0, Lr0;

    const/4 v1, 0x5

    invoke-direct {v0, p0, v1}, Lr0;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Le9;->U:Lr0;

    new-instance v0, Lb9;

    invoke-direct {v0, p0}, Lb9;-><init>(Le9;)V

    iput-object v0, p0, Le9;->V:Lb9;

    new-instance v0, Lc9;

    invoke-direct {v0, p0}, Lc9;-><init>(Le9;)V

    iput-object v0, p0, Le9;->W:Lc9;

    const/4 v0, 0x0

    iput v0, p0, Le9;->X:I

    iput v0, p0, Le9;->Y:I

    const/4 v1, 0x1

    iput-boolean v1, p0, Le9;->Z:Z

    iput-boolean v1, p0, Le9;->a0:Z

    const/4 v1, -0x1

    iput v1, p0, Le9;->b0:I

    new-instance v1, Lk0;

    const/16 v2, 0xb

    invoke-direct {v1, p0, v2}, Lk0;-><init>(Ljava/lang/Object;I)V

    iput-object v1, p0, Le9;->d0:Lk0;

    iput-boolean v0, p0, Le9;->h0:Z

    return-void
.end method


# virtual methods
.method public B(Landroid/os/Bundle;)V
    .locals 3

    iget-object v0, p0, Le9;->e0:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->onSaveInstanceState()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "android:dialogShowing"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "android:savedDialogState"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_0
    iget v0, p0, Le9;->X:I

    if-eqz v0, :cond_1

    const-string v1, "android:style"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_1
    iget v0, p0, Le9;->Y:I

    if-eqz v0, :cond_2

    const-string v1, "android:theme"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_2
    iget-boolean v0, p0, Le9;->Z:Z

    if-nez v0, :cond_3

    const-string v1, "android:cancelable"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_3
    iget-boolean v0, p0, Le9;->a0:Z

    if-nez v0, :cond_4

    const-string v1, "android:showsDialog"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_4
    iget v0, p0, Le9;->b0:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_5

    const-string v1, "android:backStackId"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    :cond_5
    return-void
.end method

.method public C()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lzc;->C:Z

    iget-object v0, p0, Le9;->e0:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, p0, Le9;->f0:Z

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    iget-object v0, p0, Le9;->e0:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p0}, LF4;->X(Landroid/view/View;LDg;)V

    const v1, 0x7f0b02c5

    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-static {v0, p0}, LUd;->f0(Landroid/view/View;Lxn;)V

    :cond_0
    return-void
.end method

.method public D()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lzc;->C:Z

    iget-object v0, p0, Le9;->e0:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->hide()V

    :cond_0
    return-void
.end method

.method public final F(Landroid/os/Bundle;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lzc;->C:Z

    iget-object v0, p0, Le9;->e0:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    const-string v0, "android:savedDialogState"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Le9;->e0:Landroid/app/Dialog;

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->onRestoreInstanceState(Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public final G(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lzc;->G(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)V

    iget-object p1, p0, Lzc;->E:Landroid/view/View;

    if-nez p1, :cond_0

    iget-object p1, p0, Le9;->e0:Landroid/app/Dialog;

    if-eqz p1, :cond_0

    if-eqz p3, :cond_0

    const-string p1, "android:savedDialogState"

    invoke-virtual {p3, p1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Le9;->e0:Landroid/app/Dialog;

    invoke-virtual {p2, p1}, Landroid/app/Dialog;->onRestoreInstanceState(Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public final O(ZZ)V
    .locals 3

    iget-boolean v0, p0, Le9;->g0:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Le9;->g0:Z

    iget-object v1, p0, Le9;->e0:Landroid/app/Dialog;

    if-eqz v1, :cond_2

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iget-object v1, p0, Le9;->e0:Landroid/app/Dialog;

    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    if-nez p2, :cond_2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p2

    iget-object v1, p0, Le9;->T:Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne p2, v1, :cond_1

    iget-object p2, p0, Le9;->e0:Landroid/app/Dialog;

    invoke-virtual {p0, p2}, Le9;->onDismiss(Landroid/content/DialogInterface;)V

    goto :goto_0

    :cond_1
    iget-object p2, p0, Le9;->T:Landroid/os/Handler;

    iget-object v1, p0, Le9;->U:Lr0;

    invoke-virtual {p2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_2
    :goto_0
    iput-boolean v0, p0, Le9;->f0:Z

    iget p2, p0, Le9;->b0:I

    if-ltz p2, :cond_4

    invoke-virtual {p0}, Lzc;->j()LOc;

    move-result-object p2

    iget v0, p0, Le9;->b0:I

    if-ltz v0, :cond_3

    new-instance v1, LNc;

    invoke-direct {v1, p2, v0}, LNc;-><init>(LOc;I)V

    invoke-virtual {p2, v1, p1}, LOc;->w(LMc;Z)V

    const/4 p1, -0x1

    iput p1, p0, Le9;->b0:I

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Bad id: "

    invoke-static {v0, p2}, LVo;->e(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-virtual {p0}, Lzc;->j()LOc;

    move-result-object p2

    new-instance v1, Ls3;

    invoke-direct {v1, p2}, Ls3;-><init>(LOc;)V

    iput-boolean v0, v1, Ls3;->o:Z

    invoke-virtual {v1, p0}, Ls3;->g(Lzc;)V

    if-eqz p1, :cond_5

    invoke-virtual {v1, v0}, Ls3;->d(Z)I

    goto :goto_1

    :cond_5
    const/4 p1, 0x0

    invoke-virtual {v1, p1}, Ls3;->d(Z)I

    :goto_1
    return-void
.end method

.method public P()Landroid/app/Dialog;
    .locals 3

    const/4 v0, 0x3

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "onCreateDialog called for DialogFragment "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    new-instance v0, LQ6;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    iget v2, p0, Le9;->Y:I

    invoke-direct {v0, v1, v2}, LQ6;-><init>(Landroid/content/Context;I)V

    return-object v0
.end method

.method public final c()LBr;
    .locals 2

    new-instance v0, Lwc;

    invoke-direct {v0, p0}, Lwc;-><init>(Lzc;)V

    new-instance v1, Ld9;

    invoke-direct {v1, p0, v0}, Ld9;-><init>(Le9;Lwc;)V

    return-object v1
.end method

.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    iget-boolean p1, p0, Le9;->f0:Z

    if-nez p1, :cond_1

    const/4 p1, 0x3

    const-string v0, "FragmentManager"

    invoke-static {v0, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "onDismiss called for DialogFragment "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    const/4 p1, 0x1

    invoke-virtual {p0, p1, p1}, Le9;->O(ZZ)V

    :cond_1
    return-void
.end method

.method public final s()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lzc;->C:Z

    return-void
.end method

.method public final u(Landroid/content/Context;)V
    .locals 4

    invoke-super {p0, p1}, Lzc;->u(Landroid/content/Context;)V

    iget-object p1, p0, Lzc;->O:Loj;

    iget-object v0, p0, Le9;->d0:Lk0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "observeForever"

    invoke-static {v1}, Loj;->a(Ljava/lang/String;)V

    new-instance v1, Lch;

    invoke-direct {v1, p1, v0}, Leh;-><init>(Loj;LMj;)V

    iget-object p1, p1, Loj;->b:Lon;

    invoke-virtual {p1, v0}, Lon;->a(Ljava/lang/Object;)Lln;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    iget-object p1, v2, Lln;->b:Ljava/lang/Object;

    goto :goto_1

    :cond_0
    new-instance v2, Lln;

    invoke-direct {v2, v0, v1}, Lln;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget v0, p1, Lon;->d:I

    add-int/2addr v0, v3

    iput v0, p1, Lon;->d:I

    iget-object v0, p1, Lon;->b:Lln;

    if-nez v0, :cond_1

    iput-object v2, p1, Lon;->a:Lln;

    iput-object v2, p1, Lon;->b:Lln;

    goto :goto_0

    :cond_1
    iput-object v2, v0, Lln;->c:Lln;

    iput-object v0, v2, Lln;->d:Lln;

    iput-object v2, p1, Lon;->b:Lln;

    :goto_0
    const/4 p1, 0x0

    :goto_1
    check-cast p1, Leh;

    instance-of v0, p1, Ldh;

    if-nez v0, :cond_3

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1, v3}, Leh;->a(Z)V

    :goto_2
    const/4 p1, 0x0

    iput-boolean p1, p0, Le9;->g0:Z

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Cannot add the same observer with different lifecycles"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public v(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Lzc;->v(Landroid/os/Bundle;)V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Le9;->T:Landroid/os/Handler;

    iget v0, p0, Lzc;->w:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iput-boolean v0, p0, Le9;->a0:Z

    if-eqz p1, :cond_1

    const-string v0, "android:style"

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Le9;->X:I

    const-string v0, "android:theme"

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Le9;->Y:I

    const-string v0, "android:cancelable"

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Le9;->Z:Z

    const-string v0, "android:showsDialog"

    iget-boolean v1, p0, Le9;->a0:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Le9;->a0:Z

    const-string v0, "android:backStackId"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Le9;->b0:I

    :cond_1
    return-void
.end method

.method public final x()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lzc;->C:Z

    iget-object v1, p0, Le9;->e0:Landroid/app/Dialog;

    if-eqz v1, :cond_1

    iput-boolean v0, p0, Le9;->f0:Z

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iget-object v1, p0, Le9;->e0:Landroid/app/Dialog;

    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    iget-boolean v1, p0, Le9;->g0:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Le9;->e0:Landroid/app/Dialog;

    invoke-virtual {p0, v1}, Le9;->onDismiss(Landroid/content/DialogInterface;)V

    :cond_0
    iput-object v0, p0, Le9;->e0:Landroid/app/Dialog;

    const/4 v0, 0x0

    iput-boolean v0, p0, Le9;->h0:Z

    :cond_1
    return-void
.end method

.method public final y()V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lzc;->C:Z

    iget-boolean v1, p0, Le9;->g0:Z

    if-nez v1, :cond_0

    iput-boolean v0, p0, Le9;->g0:Z

    :cond_0
    iget-object v0, p0, Lzc;->O:Loj;

    iget-object v1, p0, Le9;->d0:Lk0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "removeObserver"

    invoke-static {v2}, Loj;->a(Ljava/lang/String;)V

    iget-object v0, v0, Loj;->b:Lon;

    invoke-virtual {v0, v1}, Lon;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leh;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Leh;->b()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Leh;->a(Z)V

    :goto_0
    return-void
.end method

.method public final z(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 7

    invoke-super {p0, p1}, Lzc;->z(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object p1

    iget-boolean v0, p0, Le9;->a0:Z

    const/4 v1, 0x2

    const-string v2, "FragmentManager"

    if-eqz v0, :cond_9

    iget-boolean v3, p0, Le9;->c0:Z

    if-eqz v3, :cond_0

    goto/16 :goto_5

    :cond_0
    if-nez v0, :cond_1

    goto :goto_4

    :cond_1
    iget-boolean v0, p0, Le9;->h0:Z

    if-nez v0, :cond_6

    const/4 v0, 0x0

    const/4 v3, 0x1

    :try_start_0
    iput-boolean v3, p0, Le9;->c0:Z

    invoke-virtual {p0}, Le9;->P()Landroid/app/Dialog;

    move-result-object v4

    iput-object v4, p0, Le9;->e0:Landroid/app/Dialog;

    iget-boolean v5, p0, Le9;->a0:Z

    if-eqz v5, :cond_5

    iget v5, p0, Le9;->X:I

    if-eq v5, v3, :cond_3

    if-eq v5, v1, :cond_3

    const/4 v6, 0x3

    if-eq v5, v6, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v4}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v5

    if-eqz v5, :cond_3

    const/16 v6, 0x18

    invoke-virtual {v5, v6}, Landroid/view/Window;->addFlags(I)V

    :cond_3
    invoke-virtual {v4, v3}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    :goto_0
    invoke-virtual {p0}, Lzc;->h()Landroid/content/Context;

    move-result-object v4

    instance-of v5, v4, Landroid/app/Activity;

    if-eqz v5, :cond_4

    iget-object v5, p0, Le9;->e0:Landroid/app/Dialog;

    check-cast v4, Landroid/app/Activity;

    invoke-virtual {v5, v4}, Landroid/app/Dialog;->setOwnerActivity(Landroid/app/Activity;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_4
    :goto_1
    iget-object v4, p0, Le9;->e0:Landroid/app/Dialog;

    iget-boolean v5, p0, Le9;->Z:Z

    invoke-virtual {v4, v5}, Landroid/app/Dialog;->setCancelable(Z)V

    iget-object v4, p0, Le9;->e0:Landroid/app/Dialog;

    iget-object v5, p0, Le9;->V:Lb9;

    invoke-virtual {v4, v5}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    iget-object v4, p0, Le9;->e0:Landroid/app/Dialog;

    iget-object v5, p0, Le9;->W:Lc9;

    invoke-virtual {v4, v5}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iput-boolean v3, p0, Le9;->h0:Z

    goto :goto_2

    :cond_5
    const/4 v3, 0x0

    iput-object v3, p0, Le9;->e0:Landroid/app/Dialog;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    iput-boolean v0, p0, Le9;->c0:Z

    goto :goto_4

    :goto_3
    iput-boolean v0, p0, Le9;->c0:Z

    throw p1

    :cond_6
    :goto_4
    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_7

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "get layout inflater for DialogFragment "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " from dialog context"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7
    iget-object v0, p0, Le9;->e0:Landroid/app/Dialog;

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    :cond_8
    return-object p1

    :cond_9
    :goto_5
    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_b

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "getting layout inflater for DialogFragment "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, p0, Le9;->a0:Z

    if-nez v1, :cond_a

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "mShowsDialog = false: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_6

    :cond_a
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "mCreatingDialog = true: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_b
    :goto_6
    return-object p1
.end method
