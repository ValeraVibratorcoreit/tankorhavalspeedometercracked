.class public final LZt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LTd;


# direct methods
.method public constructor <init>(Landroid/view/Window;Landroid/view/View;)V
    .locals 2

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, LVi;

    invoke-direct {v0, p2}, LVi;-><init>(Landroid/view/View;)V

    .line 11
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt p2, v1, :cond_0

    .line 12
    new-instance p2, LYt;

    .line 13
    invoke-static {p1}, LB;->l(Landroid/view/Window;)Landroid/view/WindowInsetsController;

    move-result-object v1

    invoke-direct {p2, v1, v0}, LYt;-><init>(Landroid/view/WindowInsetsController;LVi;)V

    .line 14
    iput-object p1, p2, LYt;->j:Landroid/view/Window;

    .line 15
    iput-object p2, p0, LZt;->a:LTd;

    goto :goto_0

    .line 16
    :cond_0
    new-instance p2, LWt;

    .line 17
    invoke-direct {p2, p1, v0}, LWt;-><init>(Landroid/view/Window;LVi;)V

    .line 18
    iput-object p2, p0, LZt;->a:LTd;

    :goto_0
    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsetsController;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, LYt;

    new-instance v1, LVi;

    .line 3
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v2, LUo;

    const/4 v3, 0x0

    .line 5
    invoke-direct {v2, v3}, LVi;-><init>(Ljava/lang/Object;)V

    .line 6
    iput-object p1, v2, LUo;->c:Landroid/view/WindowInsetsController;

    .line 7
    iput-object v2, v1, LVi;->a:Ljava/lang/Object;

    .line 8
    invoke-direct {v0, p1, v1}, LYt;-><init>(Landroid/view/WindowInsetsController;LVi;)V

    iput-object v0, p0, LZt;->a:LTd;

    return-void
.end method
