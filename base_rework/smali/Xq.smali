.class public final LXq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVq;
.implements Lri;


# instance fields
.field public final synthetic a:LYq;


# direct methods
.method public synthetic constructor <init>(LYq;)V
    .locals 0

    iput-object p1, p0, LXq;->a:LYq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public k(Lti;)V
    .locals 4

    iget-object v0, p0, LXq;->a:LYq;

    iget-object v1, v0, LYq;->j:Lar;

    iget-object v1, v1, Lar;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v1}, Landroidx/appcompat/widget/Toolbar;->p()Z

    move-result v1

    iget-object v0, v0, LYq;->k:Landroid/view/Window$Callback;

    const/16 v2, 0x6c

    if-eqz v1, :cond_0

    invoke-interface {v0, v2, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-interface {v0, v1, v3, p1}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0, v2, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public n(Lti;Landroid/view/MenuItem;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
