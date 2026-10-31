.class public final Lg9;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:LVi;

.field public final c:Lf9;

.field public final d:Lf9;

.field public e:Landroid/view/VelocityTracker;

.field public f:F

.field public g:I

.field public h:I

.field public i:I

.field public final j:[I


# direct methods
.method public constructor <init>(Landroid/content/Context;LVi;)V
    .locals 4

    new-instance v0, Lf9;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf9;-><init>(I)V

    new-instance v1, Lf9;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lf9;-><init>(I)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v2, -0x1

    iput v2, p0, Lg9;->g:I

    iput v2, p0, Lg9;->h:I

    iput v2, p0, Lg9;->i:I

    const v2, 0x7fffffff

    const/4 v3, 0x0

    filled-new-array {v2, v3}, [I

    move-result-object v2

    iput-object v2, p0, Lg9;->j:[I

    iput-object p1, p0, Lg9;->a:Landroid/content/Context;

    iput-object p2, p0, Lg9;->b:LVi;

    iput-object v0, p0, Lg9;->c:Lf9;

    iput-object v1, p0, Lg9;->d:Lf9;

    return-void
.end method
