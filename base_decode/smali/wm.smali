.class public final Lwm;
.super Landroid/app/Fragment;
.source "SourceFile"


# static fields
.field public static final synthetic b:I


# instance fields
.field public a:LVi;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ltg;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-ge v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const-string v1, "activity"

    invoke-static {v1, v0}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v0, p1}, Lmk;->h(Landroid/app/Activity;Ltg;)V

    :cond_0
    return-void
.end method

.method public final onActivityCreated(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    sget-object p1, Ltg;->ON_CREATE:Ltg;

    invoke-virtual {p0, p1}, Lwm;->a(Ltg;)V

    return-void
.end method

.method public final onDestroy()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onDestroy()V

    sget-object v0, Ltg;->ON_DESTROY:Ltg;

    invoke-virtual {p0, v0}, Lwm;->a(Ltg;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lwm;->a:LVi;

    return-void
.end method

.method public final onPause()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onPause()V

    sget-object v0, Ltg;->ON_PAUSE:Ltg;

    invoke-virtual {p0, v0}, Lwm;->a(Ltg;)V

    return-void
.end method

.method public final onResume()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onResume()V

    iget-object v0, p0, Lwm;->a:LVi;

    if-eqz v0, :cond_0

    iget-object v0, v0, LVi;->a:Ljava/lang/Object;

    check-cast v0, LZk;

    invoke-virtual {v0}, LZk;->a()V

    :cond_0
    sget-object v0, Ltg;->ON_RESUME:Ltg;

    invoke-virtual {p0, v0}, Lwm;->a(Ltg;)V

    return-void
.end method

.method public final onStart()V
    .locals 3

    invoke-super {p0}, Landroid/app/Fragment;->onStart()V

    iget-object v0, p0, Lwm;->a:LVi;

    if-eqz v0, :cond_0

    iget-object v0, v0, LVi;->a:Ljava/lang/Object;

    check-cast v0, LZk;

    iget v1, v0, LZk;->a:I

    const/4 v2, 0x1

    add-int/2addr v1, v2

    iput v1, v0, LZk;->a:I

    if-ne v1, v2, :cond_0

    iget-boolean v1, v0, LZk;->d:Z

    if-eqz v1, :cond_0

    iget-object v1, v0, LZk;->f:LFg;

    sget-object v2, Ltg;->ON_START:Ltg;

    invoke-virtual {v1, v2}, LFg;->e(Ltg;)V

    const/4 v1, 0x0

    iput-boolean v1, v0, LZk;->d:Z

    :cond_0
    sget-object v0, Ltg;->ON_START:Ltg;

    invoke-virtual {p0, v0}, Lwm;->a(Ltg;)V

    return-void
.end method

.method public final onStop()V
    .locals 1

    invoke-super {p0}, Landroid/app/Fragment;->onStop()V

    sget-object v0, Ltg;->ON_STOP:Ltg;

    invoke-virtual {p0, v0}, Lwm;->a(Ltg;)V

    return-void
.end method
