.class public final LYt;
.super LTd;
.source "SourceFile"


# instance fields
.field public final h:Landroid/view/WindowInsetsController;

.field public final i:LVi;

.field public j:Landroid/view/Window;


# direct methods
.method public constructor <init>(Landroid/view/WindowInsetsController;LVi;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYt;->h:Landroid/view/WindowInsetsController;

    iput-object p2, p0, LYt;->i:LVi;

    return-void
.end method


# virtual methods
.method public final E(Z)V
    .locals 1

    iget-object v0, p0, LYt;->j:Landroid/view/Window;

    if-eqz p1, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v0

    or-int/lit8 v0, v0, 0x10

    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    :cond_0
    iget-object p1, p0, LYt;->h:Landroid/view/WindowInsetsController;

    invoke-static {p1}, LXt;->b(Landroid/view/WindowInsetsController;)V

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v0

    and-int/lit8 v0, v0, -0x11

    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    :cond_2
    iget-object p1, p0, LYt;->h:Landroid/view/WindowInsetsController;

    invoke-static {p1}, LXt;->c(Landroid/view/WindowInsetsController;)V

    :goto_0
    return-void
.end method

.method public final F(Z)V
    .locals 1

    iget-object v0, p0, LYt;->j:Landroid/view/Window;

    if-eqz p1, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v0

    or-int/lit16 v0, v0, 0x2000

    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    :cond_0
    iget-object p1, p0, LYt;->h:Landroid/view/WindowInsetsController;

    invoke-static {p1}, LB;->s(Landroid/view/WindowInsetsController;)V

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v0

    and-int/lit16 v0, v0, -0x2001

    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    :cond_2
    iget-object p1, p0, LYt;->h:Landroid/view/WindowInsetsController;

    invoke-static {p1}, LXt;->a(Landroid/view/WindowInsetsController;)V

    :goto_0
    return-void
.end method

.method public final H()V
    .locals 2

    iget-object v0, p0, LYt;->i:LVi;

    iget-object v0, v0, LVi;->a:Ljava/lang/Object;

    check-cast v0, LVi;

    invoke-virtual {v0}, LVi;->f()V

    iget-object v0, p0, LYt;->h:Landroid/view/WindowInsetsController;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LB;->t(Landroid/view/WindowInsetsController;I)V

    return-void
.end method
