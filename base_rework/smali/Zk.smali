.class public final LZk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LDg;


# static fields
.field public static final i:LZk;


# instance fields
.field public a:I

.field public b:I

.field public c:Z

.field public d:Z

.field public e:Landroid/os/Handler;

.field public final f:LFg;

.field public final g:Lt5;

.field public final h:LVi;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LZk;

    invoke-direct {v0}, LZk;-><init>()V

    sput-object v0, LZk;->i:LZk;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, LZk;->c:Z

    iput-boolean v0, p0, LZk;->d:Z

    new-instance v0, LFg;

    invoke-direct {v0, p0}, LFg;-><init>(LDg;)V

    iput-object v0, p0, LZk;->f:LFg;

    new-instance v0, Lt5;

    const/16 v1, 0x10

    invoke-direct {v0, p0, v1}, Lt5;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, LZk;->g:Lt5;

    new-instance v0, LVi;

    invoke-direct {v0, p0}, LVi;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, LZk;->h:LVi;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget v0, p0, LZk;->b:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, LZk;->b:I

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, LZk;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LZk;->f:LFg;

    sget-object v1, Ltg;->ON_RESUME:Ltg;

    invoke-virtual {v0, v1}, LFg;->e(Ltg;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, LZk;->c:Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, LZk;->e:Landroid/os/Handler;

    invoke-static {v0}, LTf;->f(Ljava/lang/Object;)V

    iget-object v1, p0, LZk;->g:Lt5;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final getLifecycle()Lwg;
    .locals 1

    iget-object v0, p0, LZk;->f:LFg;

    return-object v0
.end method
