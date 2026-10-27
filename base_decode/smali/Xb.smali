.class public final LXb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnDrawListener;


# instance fields
.field public final synthetic a:Landroid/view/View;

.field public final synthetic b:LYb;


# direct methods
.method public constructor <init>(LYb;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LXb;->b:LYb;

    iput-object p2, p0, LXb;->a:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onDraw()V
    .locals 2

    new-instance v0, Li0;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1, p0}, Li0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-static {}, LQr;->f()Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
