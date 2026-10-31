.class public final LM1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/Window$Callback;


# instance fields
.field public final a:Landroid/view/Window$Callback;

.field public b:LXq;

.field public c:Z

.field public d:Z

.field public e:Z

.field public final synthetic f:LR1;


# direct methods
.method public constructor <init>(LR1;Landroid/view/Window$Callback;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LM1;->f:LR1;

    if-eqz p2, :cond_0

    iput-object p2, p0, LM1;->a:Landroid/view/Window$Callback;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Window callback may not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(Landroid/view/Window$Callback;)V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v0, p0, LM1;->c:Z

    invoke-interface {p1}, Landroid/view/Window$Callback;->onContentChanged()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v1, p0, LM1;->c:Z

    return-void

    :catchall_0
    move-exception p1

    iput-boolean v1, p0, LM1;->c:Z

    throw p1
.end method

.method public final b(ILandroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, LM1;->a:Landroid/view/Window$Callback;

    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public final c(ILandroid/view/Menu;)V
    .locals 1

    iget-object v0, p0, LM1;->a:Landroid/view/Window$Callback;

    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    return-void
.end method

.method public final d(Ljava/util/List;Landroid/view/Menu;I)V
    .locals 1

    iget-object v0, p0, LM1;->a:Landroid/view/Window$Callback;

    invoke-static {v0, p1, p2, p3}, Lwt;->a(Landroid/view/Window$Callback;Ljava/util/List;Landroid/view/Menu;I)V

    return-void
.end method

.method public final dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, LM1;->a:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchGenericMotionEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    iget-boolean v0, p0, LM1;->d:Z

    iget-object v1, p0, LM1;->a:Landroid/view/Window$Callback;

    if-eqz v0, :cond_0

    invoke-interface {v1, p1}, Landroid/view/Window$Callback;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, LM1;->f:LR1;

    invoke-virtual {v0, p1}, LR1;->u(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-interface {v1, p1}, Landroid/view/Window$Callback;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public final dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z
    .locals 5

    iget-object v0, p0, LM1;->a:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_3

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    iget-object v2, p0, LM1;->f:LR1;

    invoke-virtual {v2}, LR1;->A()V

    iget-object v3, v2, LR1;->o:LBr;

    if-eqz v3, :cond_0

    invoke-virtual {v3, v0, p1}, LBr;->R(ILandroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, v2, LR1;->N:LQ1;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v3

    invoke-virtual {v2, v0, v3, p1}, LR1;->F(LQ1;ILandroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, v2, LR1;->N:LQ1;

    if-eqz p1, :cond_3

    iput-boolean v1, p1, LQ1;->l:Z

    goto :goto_0

    :cond_1
    iget-object v0, v2, LR1;->N:LQ1;

    const/4 v3, 0x0

    if-nez v0, :cond_2

    invoke-virtual {v2, v3}, LR1;->z(I)LQ1;

    move-result-object v0

    invoke-virtual {v2, v0, p1}, LR1;->G(LQ1;Landroid/view/KeyEvent;)Z

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v4

    invoke-virtual {v2, v0, v4, p1}, LR1;->F(LQ1;ILandroid/view/KeyEvent;)Z

    move-result p1

    iput-boolean v3, v0, LQ1;->k:Z

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v1, v3

    :cond_3
    :goto_0
    return v1
.end method

.method public final dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    iget-object v0, p0, LM1;->a:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method

.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, LM1;->a:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public final dispatchTrackballEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, LM1;->a:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->dispatchTrackballEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public final onActionModeFinished(Landroid/view/ActionMode;)V
    .locals 1

    iget-object v0, p0, LM1;->a:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onActionModeFinished(Landroid/view/ActionMode;)V

    return-void
.end method

.method public final onActionModeStarted(Landroid/view/ActionMode;)V
    .locals 1

    iget-object v0, p0, LM1;->a:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onActionModeStarted(Landroid/view/ActionMode;)V

    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 1

    iget-object v0, p0, LM1;->a:Landroid/view/Window$Callback;

    invoke-interface {v0}, Landroid/view/Window$Callback;->onAttachedToWindow()V

    return-void
.end method

.method public final onContentChanged()V
    .locals 1

    iget-boolean v0, p0, LM1;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LM1;->a:Landroid/view/Window$Callback;

    invoke-interface {v0}, Landroid/view/Window$Callback;->onContentChanged()V

    :cond_0
    return-void
.end method

.method public final onCreatePanelMenu(ILandroid/view/Menu;)Z
    .locals 1

    if-nez p1, :cond_0

    instance-of v0, p2, Lti;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, LM1;->a:Landroid/view/Window$Callback;

    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public final onCreatePanelView(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, LM1;->b:LXq;

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    new-instance v1, Landroid/view/View;

    iget-object v0, v0, LXq;->a:LYq;

    iget-object v0, v0, LYq;->j:Lar;

    iget-object v0, v0, Lar;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    return-object v1

    :cond_1
    iget-object v0, p0, LM1;->a:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onCreatePanelView(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    iget-object v0, p0, LM1;->a:Landroid/view/Window$Callback;

    invoke-interface {v0}, Landroid/view/Window$Callback;->onDetachedFromWindow()V

    return-void
.end method

.method public final onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, LM1;->a:Landroid/view/Window$Callback;

    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public final onMenuOpened(ILandroid/view/Menu;)Z
    .locals 2

    invoke-virtual {p0, p1, p2}, LM1;->b(ILandroid/view/Menu;)Z

    const/16 p2, 0x6c

    const/4 v0, 0x1

    iget-object v1, p0, LM1;->f:LR1;

    if-ne p1, p2, :cond_0

    invoke-virtual {v1}, LR1;->A()V

    iget-object p1, v1, LR1;->o:LBr;

    if-eqz p1, :cond_1

    invoke-virtual {p1, v0}, LBr;->p(Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_1
    :goto_0
    return v0
.end method

.method public final onPanelClosed(ILandroid/view/Menu;)V
    .locals 2

    iget-boolean v0, p0, LM1;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LM1;->a:Landroid/view/Window$Callback;

    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2}, LM1;->c(ILandroid/view/Menu;)V

    iget-object p2, p0, LM1;->f:LR1;

    const/16 v0, 0x6c

    const/4 v1, 0x0

    if-ne p1, v0, :cond_1

    invoke-virtual {p2}, LR1;->A()V

    iget-object p1, p2, LR1;->o:LBr;

    if-eqz p1, :cond_3

    invoke-virtual {p1, v1}, LBr;->p(Z)V

    goto :goto_0

    :cond_1
    if-nez p1, :cond_2

    invoke-virtual {p2, p1}, LR1;->z(I)LQ1;

    move-result-object p1

    iget-boolean v0, p1, LQ1;->m:Z

    if-eqz v0, :cond_3

    invoke-virtual {p2, p1, v1}, LR1;->s(LQ1;Z)V

    goto :goto_0

    :cond_2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_3
    :goto_0
    return-void
.end method

.method public final onPointerCaptureChanged(Z)V
    .locals 1

    iget-object v0, p0, LM1;->a:Landroid/view/Window$Callback;

    invoke-static {v0, p1}, Lxt;->a(Landroid/view/Window$Callback;Z)V

    return-void
.end method

.method public final onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 5

    instance-of v0, p3, Lti;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lti;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    if-nez v0, :cond_1

    return v1

    :cond_1
    const/4 v2, 0x1

    if-eqz v0, :cond_2

    iput-boolean v2, v0, Lti;->x:Z

    :cond_2
    iget-object v3, p0, LM1;->b:LXq;

    if-eqz v3, :cond_3

    if-nez p1, :cond_3

    iget-object v3, v3, LXq;->a:LYq;

    iget-boolean v4, v3, LYq;->m:Z

    if-nez v4, :cond_3

    iget-object v4, v3, LYq;->j:Lar;

    iput-boolean v2, v4, Lar;->l:Z

    iput-boolean v2, v3, LYq;->m:Z

    :cond_3
    iget-object v2, p0, LM1;->a:Landroid/view/Window$Callback;

    invoke-interface {v2, p1, p2, p3}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result p1

    if-eqz v0, :cond_4

    iput-boolean v1, v0, Lti;->x:Z

    :cond_4
    return p1
.end method

.method public final onProvideKeyboardShortcuts(Ljava/util/List;Landroid/view/Menu;I)V
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, LM1;->f:LR1;

    invoke-virtual {v1, v0}, LR1;->z(I)LQ1;

    move-result-object v0

    iget-object v0, v0, LQ1;->h:Lti;

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, v0, p3}, LM1;->d(Ljava/util/List;Landroid/view/Menu;I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LM1;->d(Ljava/util/List;Landroid/view/Menu;I)V

    :goto_0
    return-void
.end method

.method public final onSearchRequested()Z
    .locals 1

    .line 2
    iget-object v0, p0, LM1;->a:Landroid/view/Window$Callback;

    invoke-interface {v0}, Landroid/view/Window$Callback;->onSearchRequested()Z

    move-result v0

    return v0
.end method

.method public final onSearchRequested(Landroid/view/SearchEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LM1;->a:Landroid/view/Window$Callback;

    invoke-static {v0, p1}, Lvt;->a(Landroid/view/Window$Callback;Landroid/view/SearchEvent;)Z

    move-result p1

    return p1
.end method

.method public final onWindowAttributesChanged(Landroid/view/WindowManager$LayoutParams;)V
    .locals 1

    iget-object v0, p0, LM1;->a:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onWindowAttributesChanged(Landroid/view/WindowManager$LayoutParams;)V

    return-void
.end method

.method public final onWindowFocusChanged(Z)V
    .locals 1

    iget-object v0, p0, LM1;->a:Landroid/view/Window$Callback;

    invoke-interface {v0, p1}, Landroid/view/Window$Callback;->onWindowFocusChanged(Z)V

    return-void
.end method

.method public final onWindowStartingActionMode(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;
    .locals 0

    .line 83
    const/4 p1, 0x0

    return-object p1
.end method

.method public final onWindowStartingActionMode(Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x1

    .line 1
    iget-object v3, p0, LM1;->f:LR1;

    iget-boolean v4, v3, LR1;->z:Z

    if-eqz v4, :cond_13

    if-eqz p2, :cond_0

    goto/16 :goto_6

    .line 2
    :cond_0
    new-instance p2, Ljj;

    iget-object v4, v3, LR1;->k:Landroid/content/Context;

    invoke-direct {p2, v4, p1}, Ljj;-><init>(Landroid/content/Context;Landroid/view/ActionMode$Callback;)V

    .line 3
    iget-object p1, v3, LR1;->u:Lq0;

    if-eqz p1, :cond_1

    .line 4
    invoke-virtual {p1}, Lq0;->a()V

    .line 5
    :cond_1
    new-instance p1, Ld2;

    invoke-direct {p1, v1, v3, p2, v0}, Ld2;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 6
    invoke-virtual {v3}, LR1;->A()V

    .line 7
    iget-object v4, v3, LR1;->o:LBr;

    if-eqz v4, :cond_2

    .line 8
    invoke-virtual {v4, p1}, LBr;->q0(Ld2;)Lq0;

    move-result-object v4

    iput-object v4, v3, LR1;->u:Lq0;

    .line 9
    :cond_2
    iget-object v4, v3, LR1;->u:Lq0;

    const/4 v5, 0x0

    if-nez v4, :cond_11

    .line 10
    iget-object v4, v3, LR1;->y:LWs;

    if-eqz v4, :cond_3

    .line 11
    invoke-virtual {v4}, LWs;->b()V

    .line 12
    :cond_3
    iget-object v4, v3, LR1;->u:Lq0;

    if-eqz v4, :cond_4

    .line 13
    invoke-virtual {v4}, Lq0;->a()V

    .line 14
    :cond_4
    iget-object v4, v3, LR1;->n:Lu1;

    if-eqz v4, :cond_5

    iget-boolean v4, v3, LR1;->R:Z

    .line 15
    :cond_5
    iget-object v4, v3, LR1;->v:Landroidx/appcompat/widget/ActionBarContextView;

    if-nez v4, :cond_a

    .line 16
    iget-boolean v4, v3, LR1;->J:Z

    iget-object v6, v3, LR1;->k:Landroid/content/Context;

    if-eqz v4, :cond_7

    .line 17
    new-instance v4, Landroid/util/TypedValue;

    invoke-direct {v4}, Landroid/util/TypedValue;-><init>()V

    .line 18
    invoke-virtual {v6}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v7

    const v8, 0x7f04000b

    .line 19
    invoke-virtual {v7, v8, v4, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 20
    iget v8, v4, Landroid/util/TypedValue;->resourceId:I

    if-eqz v8, :cond_6

    .line 21
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v8

    .line 22
    invoke-virtual {v8, v7}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    .line 23
    iget v7, v4, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v8, v7, v2}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    .line 24
    new-instance v7, LJ7;

    invoke-direct {v7, v6, v0}, LJ7;-><init>(Landroid/content/Context;I)V

    .line 25
    invoke-virtual {v7}, LJ7;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v6

    invoke-virtual {v6, v8}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    move-object v6, v7

    .line 26
    :cond_6
    new-instance v7, Landroidx/appcompat/widget/ActionBarContextView;

    .line 27
    invoke-direct {v7, v6, v5}, Landroidx/appcompat/widget/ActionBarContextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 28
    iput-object v7, v3, LR1;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 29
    new-instance v7, Landroid/widget/PopupWindow;

    const v8, 0x7f04001a

    invoke-direct {v7, v6, v5, v8}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-object v7, v3, LR1;->w:Landroid/widget/PopupWindow;

    .line 30
    invoke-static {v7, v1}, LQk;->d(Landroid/widget/PopupWindow;I)V

    .line 31
    iget-object v1, v3, LR1;->w:Landroid/widget/PopupWindow;

    iget-object v7, v3, LR1;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v1, v7}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 32
    iget-object v1, v3, LR1;->w:Landroid/widget/PopupWindow;

    const/4 v7, -0x1

    invoke-virtual {v1, v7}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 33
    invoke-virtual {v6}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    const v7, 0x7f040005

    invoke-virtual {v1, v7, v4, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 34
    iget v1, v4, Landroid/util/TypedValue;->data:I

    .line 35
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    .line 36
    invoke-static {v1, v4}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    move-result v1

    .line 37
    iget-object v4, v3, LR1;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v4, v1}, Landroidx/appcompat/widget/ActionBarContextView;->setContentHeight(I)V

    .line 38
    iget-object v1, v3, LR1;->w:Landroid/widget/PopupWindow;

    const/4 v4, -0x2

    invoke-virtual {v1, v4}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 39
    new-instance v1, LF1;

    invoke-direct {v1, v3, v2}, LF1;-><init>(LR1;I)V

    iput-object v1, v3, LR1;->x:LF1;

    goto :goto_2

    .line 40
    :cond_7
    iget-object v1, v3, LR1;->B:Landroid/view/ViewGroup;

    const v4, 0x7f0b0060

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/ViewStubCompat;

    if-eqz v1, :cond_a

    .line 41
    invoke-virtual {v3}, LR1;->A()V

    .line 42
    iget-object v4, v3, LR1;->o:LBr;

    if-eqz v4, :cond_8

    .line 43
    invoke-virtual {v4}, LBr;->C()Landroid/content/Context;

    move-result-object v4

    goto :goto_0

    :cond_8
    move-object v4, v5

    :goto_0
    if-nez v4, :cond_9

    goto :goto_1

    :cond_9
    move-object v6, v4

    .line 44
    :goto_1
    invoke-static {v6}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroidx/appcompat/widget/ViewStubCompat;->setLayoutInflater(Landroid/view/LayoutInflater;)V

    .line 45
    invoke-virtual {v1}, Landroidx/appcompat/widget/ViewStubCompat;->a()Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/ActionBarContextView;

    iput-object v1, v3, LR1;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 46
    :cond_a
    :goto_2
    iget-object v1, v3, LR1;->v:Landroidx/appcompat/widget/ActionBarContextView;

    if-eqz v1, :cond_10

    .line 47
    iget-object v1, v3, LR1;->y:LWs;

    if-eqz v1, :cond_b

    .line 48
    invoke-virtual {v1}, LWs;->b()V

    .line 49
    :cond_b
    iget-object v1, v3, LR1;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v1}, Landroidx/appcompat/widget/ActionBarContextView;->e()V

    .line 50
    new-instance v1, Lqp;

    iget-object v4, v3, LR1;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    iget-object v6, v3, LR1;->v:Landroidx/appcompat/widget/ActionBarContextView;

    .line 51
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object v4, v1, Lqp;->c:Landroid/content/Context;

    .line 53
    iput-object v6, v1, Lqp;->d:Landroidx/appcompat/widget/ActionBarContextView;

    .line 54
    iput-object p1, v1, Lqp;->e:Lp0;

    .line 55
    new-instance v4, Lti;

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-direct {v4, v6}, Lti;-><init>(Landroid/content/Context;)V

    .line 56
    iput v2, v4, Lti;->l:I

    .line 57
    iput-object v4, v1, Lqp;->h:Lti;

    .line 58
    iput-object v1, v4, Lti;->e:Lri;

    .line 59
    iget-object p1, p1, Ld2;->b:Ljava/lang/Object;

    check-cast p1, Lp0;

    .line 60
    invoke-interface {p1, v1, v4}, Lp0;->c(Lq0;Lti;)Z

    move-result p1

    if-eqz p1, :cond_f

    .line 61
    invoke-virtual {v1}, Lqp;->g()V

    .line 62
    iget-object p1, v3, LR1;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v1}, Landroidx/appcompat/widget/ActionBarContextView;->c(Lq0;)V

    .line 63
    iput-object v1, v3, LR1;->u:Lq0;

    .line 64
    iget-boolean p1, v3, LR1;->A:Z

    if-eqz p1, :cond_c

    iget-object p1, v3, LR1;->B:Landroid/view/ViewGroup;

    if-eqz p1, :cond_c

    invoke-virtual {p1}, Landroid/view/View;->isLaidOut()Z

    move-result p1

    if-eqz p1, :cond_c

    move p1, v2

    goto :goto_3

    :cond_c
    move p1, v0

    :goto_3
    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz p1, :cond_d

    .line 65
    iget-object p1, v3, LR1;->v:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 66
    iget-object p1, v3, LR1;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {p1}, LGs;->a(Landroid/view/View;)LWs;

    move-result-object p1

    invoke-virtual {p1, v1}, LWs;->a(F)V

    iput-object p1, v3, LR1;->y:LWs;

    .line 67
    new-instance v0, LH1;

    invoke-direct {v0, v3, v2}, LH1;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, LWs;->d(LYs;)V

    goto :goto_4

    .line 68
    :cond_d
    iget-object p1, v3, LR1;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v1}, Landroid/view/View;->setAlpha(F)V

    .line 69
    iget-object p1, v3, LR1;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    .line 70
    iget-object p1, v3, LR1;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of p1, p1, Landroid/view/View;

    if-eqz p1, :cond_e

    .line 71
    iget-object p1, v3, LR1;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    sget-object v0, LGs;->a:Ljava/util/WeakHashMap;

    .line 72
    invoke-static {p1}, Lts;->c(Landroid/view/View;)V

    .line 73
    :cond_e
    :goto_4
    iget-object p1, v3, LR1;->w:Landroid/widget/PopupWindow;

    if-eqz p1, :cond_10

    .line 74
    iget-object p1, v3, LR1;->l:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    iget-object v0, v3, LR1;->x:LF1;

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_5

    .line 75
    :cond_f
    iput-object v5, v3, LR1;->u:Lq0;

    .line 76
    :cond_10
    :goto_5
    invoke-virtual {v3}, LR1;->I()V

    .line 77
    iget-object p1, v3, LR1;->u:Lq0;

    .line 78
    iput-object p1, v3, LR1;->u:Lq0;

    .line 79
    :cond_11
    invoke-virtual {v3}, LR1;->I()V

    .line 80
    iget-object p1, v3, LR1;->u:Lq0;

    if-eqz p1, :cond_12

    .line 81
    invoke-virtual {p2, p1}, Ljj;->m(Lq0;)LPp;

    move-result-object v5

    :cond_12
    return-object v5

    .line 82
    :cond_13
    :goto_6
    iget-object v0, p0, LM1;->a:Landroid/view/Window$Callback;

    invoke-static {v0, p1, p2}, Lvt;->b(Landroid/view/Window$Callback;Landroid/view/ActionMode$Callback;I)Landroid/view/ActionMode;

    move-result-object p1

    return-object p1
.end method
