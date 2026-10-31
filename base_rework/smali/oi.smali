.class public final Loi;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/app/ActivityManager;

.field public final c:Lk0;

.field public final d:F


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    int-to-float v0, v0

    iput v0, p0, Loi;->d:F

    iput-object p1, p0, Loi;->a:Landroid/content/Context;

    const-string v0, "activity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    iput-object v0, p0, Loi;->b:Landroid/app/ActivityManager;

    new-instance v1, Lk0;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    const/16 v2, 0x1c

    invoke-direct {v1, p1, v2}, Lk0;-><init>(Ljava/lang/Object;I)V

    iput-object v1, p0, Loi;->c:Lk0;

    invoke-virtual {v0}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iput p1, p0, Loi;->d:F

    :cond_0
    return-void
.end method
