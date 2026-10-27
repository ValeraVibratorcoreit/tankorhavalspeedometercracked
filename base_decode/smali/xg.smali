.class public final Lxg;
.super LQa;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    const-string p2, "activity"

    invoke-static {p2, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    sget p2, Lwm;->b:I

    invoke-static {p1}, Lmk;->q(Landroid/app/Activity;)V

    return-void
.end method
