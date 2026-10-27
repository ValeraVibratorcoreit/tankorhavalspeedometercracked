.class public final Lvm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# static fields
.field public static final Companion:Lum;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lum;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lvm;->Companion:Lum;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final registerIn(Landroid/app/Activity;)V
    .locals 1

    sget-object v0, Lvm;->Companion:Lum;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "activity"

    invoke-static {v0, p0}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v0, Lvm;

    invoke-direct {v0}, Lvm;-><init>()V

    invoke-static {p0, v0}, LA;->i(Landroid/app/Activity;Lvm;)V

    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    const-string p2, "activity"

    invoke-static {p2, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public onActivityPostCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    const-string p2, "activity"

    invoke-static {p2, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    sget p2, Lwm;->b:I

    sget-object p2, Ltg;->ON_CREATE:Ltg;

    invoke-static {p1, p2}, Lmk;->h(Landroid/app/Activity;Ltg;)V

    return-void
.end method

.method public onActivityPostResumed(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Lwm;->b:I

    sget-object v0, Ltg;->ON_RESUME:Ltg;

    invoke-static {p1, v0}, Lmk;->h(Landroid/app/Activity;Ltg;)V

    return-void
.end method

.method public onActivityPostStarted(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Lwm;->b:I

    sget-object v0, Ltg;->ON_START:Ltg;

    invoke-static {p1, v0}, Lmk;->h(Landroid/app/Activity;Ltg;)V

    return-void
.end method

.method public onActivityPreDestroyed(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Lwm;->b:I

    sget-object v0, Ltg;->ON_DESTROY:Ltg;

    invoke-static {p1, v0}, Lmk;->h(Landroid/app/Activity;Ltg;)V

    return-void
.end method

.method public onActivityPrePaused(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Lwm;->b:I

    sget-object v0, Ltg;->ON_PAUSE:Ltg;

    invoke-static {p1, v0}, Lmk;->h(Landroid/app/Activity;Ltg;)V

    return-void
.end method

.method public onActivityPreStopped(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    sget v0, Lwm;->b:I

    sget-object v0, Ltg;->ON_STOP:Ltg;

    invoke-static {p1, v0}, Lmk;->h(Landroid/app/Activity;Ltg;)V

    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string p1, "bundle"

    invoke-static {p1, p2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
