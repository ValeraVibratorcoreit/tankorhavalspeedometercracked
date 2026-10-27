.class public final LBt;
.super LBr;
.source "SourceFile"

# interfaces
.implements La0;


# static fields
.field public static final H:Landroid/view/animation/AccelerateInterpolator;

.field public static final I:Landroid/view/animation/DecelerateInterpolator;


# instance fields
.field public A:Z

.field public B:LXs;

.field public C:Z

.field public D:Z

.field public final E:Lzt;

.field public final F:Lzt;

.field public final G:LVi;

.field public j:Landroid/content/Context;

.field public k:Landroid/content/Context;

.field public l:Landroidx/appcompat/widget/ActionBarOverlayLayout;

.field public m:Landroidx/appcompat/widget/ActionBarContainer;

.field public n:Ls8;

.field public o:Landroidx/appcompat/widget/ActionBarContextView;

.field public final p:Landroid/view/View;

.field public q:Z

.field public r:LAt;

.field public s:LAt;

.field public t:Lp0;

.field public u:Z

.field public final v:Ljava/util/ArrayList;

.field public w:I

.field public x:Z

.field public y:Z

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    sput-object v0, LBt;->H:Landroid/view/animation/AccelerateInterpolator;

    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    sput-object v0, LBt;->I:Landroid/view/animation/DecelerateInterpolator;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LBt;->v:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 4
    iput v0, p0, LBt;->w:I

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, LBt;->x:Z

    .line 6
    iput-boolean v0, p0, LBt;->A:Z

    .line 7
    new-instance v0, Lzt;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lzt;-><init>(LBt;I)V

    iput-object v0, p0, LBt;->E:Lzt;

    .line 8
    new-instance v0, Lzt;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lzt;-><init>(LBt;I)V

    iput-object v0, p0, LBt;->F:Lzt;

    .line 9
    new-instance v0, LVi;

    invoke-direct {v0, p0}, LVi;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, LBt;->G:LVi;

    .line 10
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    .line 11
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    .line 12
    invoke-virtual {p0, p1}, LBt;->C0(Landroid/view/View;)V

    if-nez p2, :cond_0

    const p2, 0x1020002

    .line 13
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, LBt;->p:Landroid/view/View;

    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/app/Dialog;)V
    .locals 2

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 16
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LBt;->v:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 17
    iput v0, p0, LBt;->w:I

    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, LBt;->x:Z

    .line 19
    iput-boolean v0, p0, LBt;->A:Z

    .line 20
    new-instance v0, Lzt;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lzt;-><init>(LBt;I)V

    iput-object v0, p0, LBt;->E:Lzt;

    .line 21
    new-instance v0, Lzt;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lzt;-><init>(LBt;I)V

    iput-object v0, p0, LBt;->F:Lzt;

    .line 22
    new-instance v0, LVi;

    invoke-direct {v0, p0}, LVi;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, LBt;->G:LVi;

    .line 23
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, LBt;->C0(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final B0(Z)V
    .locals 9

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-boolean v1, p0, LBt;->z:Z

    if-nez v1, :cond_3

    const/4 v1, 0x1

    iput-boolean v1, p0, LBt;->z:Z

    iget-object v2, p0, LBt;->l:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz v2, :cond_0

    invoke-virtual {v2, v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setShowingForActionMode(Z)V

    :cond_0
    invoke-virtual {p0, v0}, LBt;->E0(Z)V

    goto :goto_0

    :cond_1
    iget-boolean v1, p0, LBt;->z:Z

    if-eqz v1, :cond_3

    iput-boolean v0, p0, LBt;->z:Z

    iget-object v1, p0, LBt;->l:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz v1, :cond_2

    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setShowingForActionMode(Z)V

    :cond_2
    invoke-virtual {p0, v0}, LBt;->E0(Z)V

    :cond_3
    :goto_0
    iget-object v1, p0, LBt;->m:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v1}, Landroid/view/View;->isLaidOut()Z

    move-result v1

    const/16 v2, 0x8

    const/4 v3, 0x4

    if-eqz v1, :cond_7

    const-wide/16 v4, 0xc8

    const-wide/16 v6, 0x64

    if-eqz p1, :cond_4

    iget-object p1, p0, LBt;->n:Ls8;

    check-cast p1, Lar;

    iget-object v1, p1, Lar;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-static {v1}, LGs;->a(Landroid/view/View;)LWs;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, LWs;->a(F)V

    invoke-virtual {v1, v6, v7}, LWs;->c(J)V

    new-instance v2, LZq;

    invoke-direct {v2, p1, v3}, LZq;-><init>(Lar;I)V

    invoke-virtual {v1, v2}, LWs;->d(LYs;)V

    iget-object p1, p0, LBt;->o:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v4, v5, v0}, Landroidx/appcompat/widget/ActionBarContextView;->i(JI)LWs;

    move-result-object p1

    goto :goto_1

    :cond_4
    iget-object p1, p0, LBt;->n:Ls8;

    check-cast p1, Lar;

    iget-object v1, p1, Lar;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-static {v1}, LGs;->a(Landroid/view/View;)LWs;

    move-result-object v1

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v1, v3}, LWs;->a(F)V

    invoke-virtual {v1, v4, v5}, LWs;->c(J)V

    new-instance v3, LZq;

    invoke-direct {v3, p1, v0}, LZq;-><init>(Lar;I)V

    invoke-virtual {v1, v3}, LWs;->d(LYs;)V

    iget-object p1, p0, LBt;->o:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v6, v7, v2}, Landroidx/appcompat/widget/ActionBarContextView;->i(JI)LWs;

    move-result-object p1

    move-object v8, v1

    move-object v1, p1

    move-object p1, v8

    :goto_1
    new-instance v0, LXs;

    invoke-direct {v0}, LXs;-><init>()V

    iget-object v2, v0, LXs;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, v1, LWs;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->getDuration()J

    move-result-wide v3

    goto :goto_2

    :cond_5
    const-wide/16 v3, 0x0

    :goto_2
    iget-object v1, p1, LWs;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;

    :cond_6
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, LXs;->b()V

    goto :goto_3

    :cond_7
    if-eqz p1, :cond_8

    iget-object p1, p0, LBt;->n:Ls8;

    check-cast p1, Lar;

    iget-object p1, p1, Lar;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, LBt;->o:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    goto :goto_3

    :cond_8
    iget-object p1, p0, LBt;->n:Ls8;

    check-cast p1, Lar;

    iget-object p1, p1, Lar;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, LBt;->o:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v2}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    :goto_3
    return-void
.end method

.method public final C()Landroid/content/Context;
    .locals 4

    iget-object v0, p0, LBt;->k:Landroid/content/Context;

    if-nez v0, :cond_1

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    iget-object v1, p0, LBt;->j:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    const v2, 0x7f04000c

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v0, v0, Landroid/util/TypedValue;->resourceId:I

    if-eqz v0, :cond_0

    new-instance v1, Landroid/view/ContextThemeWrapper;

    iget-object v2, p0, LBt;->j:Landroid/content/Context;

    invoke-direct {v1, v2, v0}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    iput-object v1, p0, LBt;->k:Landroid/content/Context;

    goto :goto_0

    :cond_0
    iget-object v0, p0, LBt;->j:Landroid/content/Context;

    iput-object v0, p0, LBt;->k:Landroid/content/Context;

    :cond_1
    :goto_0
    iget-object v0, p0, LBt;->k:Landroid/content/Context;

    return-object v0
.end method

.method public final C0(Landroid/view/View;)V
    .locals 6

    const v0, 0x7f0b00ce

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    iput-object v0, p0, LBt;->l:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setActionBarVisibilityCallback(La0;)V

    :cond_0
    const v0, 0x7f0b0052

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    instance-of v1, v0, Ls8;

    if-eqz v1, :cond_1

    check-cast v0, Ls8;

    goto :goto_0

    :cond_1
    instance-of v1, v0, Landroidx/appcompat/widget/Toolbar;

    if-eqz v1, :cond_8

    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getWrapper()Ls8;

    move-result-object v0

    :goto_0
    iput-object v0, p0, LBt;->n:Ls8;

    const v0, 0x7f0b005a

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/ActionBarContextView;

    iput-object v0, p0, LBt;->o:Landroidx/appcompat/widget/ActionBarContextView;

    const v0, 0x7f0b0054

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/widget/ActionBarContainer;

    iput-object p1, p0, LBt;->m:Landroidx/appcompat/widget/ActionBarContainer;

    iget-object v0, p0, LBt;->n:Ls8;

    if-eqz v0, :cond_7

    iget-object v1, p0, LBt;->o:Landroidx/appcompat/widget/ActionBarContextView;

    if-eqz v1, :cond_7

    if-eqz p1, :cond_7

    check-cast v0, Lar;

    iget-object p1, v0, Lar;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, LBt;->j:Landroid/content/Context;

    iget-object v0, p0, LBt;->n:Ls8;

    check-cast v0, Lar;

    iget v0, v0, Lar;->b:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    move v0, v1

    goto :goto_1

    :cond_2
    move v0, v2

    :goto_1
    if-eqz v0, :cond_3

    iput-boolean v1, p0, LBt;->q:Z

    :cond_3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v3

    iget v3, v3, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    const/16 v4, 0xe

    iget-object v0, p0, LBt;->n:Ls8;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const/high16 v0, 0x7f050000

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result p1

    invoke-virtual {p0, p1}, LBt;->D0(Z)V

    iget-object p1, p0, LBt;->j:Landroid/content/Context;

    sget-object v0, Lwl;->a:[I

    const v3, 0x7f040007

    const/4 v5, 0x0

    invoke-virtual {p1, v5, v0, v3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1, v4, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, LBt;->l:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    iget-boolean v3, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->g:Z

    if-eqz v3, :cond_4

    iput-boolean v1, p0, LBt;->D:Z

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V

    goto :goto_2

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_2
    const/16 v0, 0xc

    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    if-eqz v0, :cond_6

    int-to-float v0, v0

    iget-object v1, p0, LBt;->m:Landroidx/appcompat/widget/ActionBarContainer;

    sget-object v2, LGs;->a:Ljava/util/WeakHashMap;

    invoke-static {v1, v0}, Lvs;->s(Landroid/view/View;F)V

    :cond_6
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-class v0, LBt;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v1, " can only be used with a compatible window decor layout"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    :cond_9
    const-string v0, "null"

    :goto_3
    const-string v1, "Can\'t make a decor toolbar out of "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final D0(Z)V
    .locals 1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    iget-object p1, p0, LBt;->n:Ls8;

    check-cast p1, Lar;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p0, LBt;->m:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setTabContainer(Lzn;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, LBt;->m:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContainer;->setTabContainer(Lzn;)V

    iget-object p1, p0, LBt;->n:Ls8;

    check-cast p1, Lar;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    iget-object p1, p0, LBt;->n:Ls8;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p0, LBt;->n:Ls8;

    check-cast p1, Lar;

    iget-object p1, p1, Lar;->a:Landroidx/appcompat/widget/Toolbar;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setCollapsible(Z)V

    iget-object p1, p0, LBt;->l:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHasNonEmbeddedTabs(Z)V

    return-void
.end method

.method public final E0(Z)V
    .locals 11

    iget-boolean v0, p0, LBt;->y:Z

    iget-boolean v1, p0, LBt;->z:Z

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_0

    move v0, v3

    :goto_0
    iget-object v1, p0, LBt;->p:Landroid/view/View;

    const-wide/16 v4, 0xfa

    const/4 v6, 0x0

    const/high16 v7, 0x3f800000    # 1.0f

    iget-object v8, p0, LBt;->G:LVi;

    if-eqz v0, :cond_e

    iget-boolean v0, p0, LBt;->A:Z

    if-nez v0, :cond_1a

    iput-boolean v2, p0, LBt;->A:Z

    iget-object v0, p0, LBt;->B:LXs;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LXs;->a()V

    :cond_2
    iget-object v0, p0, LBt;->m:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0, v3}, Landroidx/appcompat/widget/ActionBarContainer;->setVisibility(I)V

    iget v0, p0, LBt;->w:I

    iget-object v9, p0, LBt;->F:Lzt;

    const/4 v10, 0x0

    if-nez v0, :cond_c

    iget-boolean v0, p0, LBt;->C:Z

    if-nez v0, :cond_3

    if-eqz p1, :cond_c

    :cond_3
    iget-object v0, p0, LBt;->m:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0, v10}, Landroid/view/View;->setTranslationY(F)V

    iget-object v0, p0, LBt;->m:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    neg-int v0, v0

    int-to-float v0, v0

    if-eqz p1, :cond_4

    filled-new-array {v3, v3}, [I

    move-result-object p1

    iget-object v3, p0, LBt;->m:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v3, p1}, Landroid/view/View;->getLocationInWindow([I)V

    aget p1, p1, v2

    int-to-float p1, p1

    sub-float/2addr v0, p1

    :cond_4
    iget-object p1, p0, LBt;->m:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    new-instance p1, LXs;

    invoke-direct {p1}, LXs;-><init>()V

    iget-object v2, p0, LBt;->m:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-static {v2}, LGs;->a(Landroid/view/View;)LWs;

    move-result-object v2

    invoke-virtual {v2, v10}, LWs;->e(F)V

    iget-object v3, v2, LWs;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-eqz v3, :cond_6

    if-eqz v8, :cond_5

    new-instance v6, Lea;

    invoke-direct {v6, v8, v3}, Lea;-><init>(LVi;Landroid/view/View;)V

    :cond_5
    invoke-virtual {v3}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    invoke-virtual {v3, v6}, Landroid/view/ViewPropertyAnimator;->setUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)Landroid/view/ViewPropertyAnimator;

    :cond_6
    iget-boolean v3, p1, LXs;->e:Z

    iget-object v6, p1, LXs;->a:Ljava/util/ArrayList;

    if-nez v3, :cond_7

    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_7
    iget-boolean v2, p0, LBt;->x:Z

    if-eqz v2, :cond_8

    if-eqz v1, :cond_8

    invoke-virtual {v1, v0}, Landroid/view/View;->setTranslationY(F)V

    invoke-static {v1}, LGs;->a(Landroid/view/View;)LWs;

    move-result-object v0

    invoke-virtual {v0, v10}, LWs;->e(F)V

    iget-boolean v1, p1, LXs;->e:Z

    if-nez v1, :cond_8

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_8
    sget-object v0, LBt;->I:Landroid/view/animation/DecelerateInterpolator;

    iget-boolean v1, p1, LXs;->e:Z

    if-nez v1, :cond_9

    iput-object v0, p1, LXs;->c:Landroid/view/animation/Interpolator;

    :cond_9
    if-nez v1, :cond_a

    iput-wide v4, p1, LXs;->b:J

    :cond_a
    if-nez v1, :cond_b

    iput-object v9, p1, LXs;->d:LYs;

    :cond_b
    iput-object p1, p0, LBt;->B:LXs;

    invoke-virtual {p1}, LXs;->b()V

    goto :goto_1

    :cond_c
    iget-object p1, p0, LBt;->m:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1, v7}, Landroid/view/View;->setAlpha(F)V

    iget-object p1, p0, LBt;->m:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1, v10}, Landroid/view/View;->setTranslationY(F)V

    iget-boolean p1, p0, LBt;->x:Z

    if-eqz p1, :cond_d

    if-eqz v1, :cond_d

    invoke-virtual {v1, v10}, Landroid/view/View;->setTranslationY(F)V

    :cond_d
    invoke-virtual {v9}, Lzt;->a()V

    :goto_1
    iget-object p1, p0, LBt;->l:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    if-eqz p1, :cond_1a

    sget-object v0, LGs;->a:Ljava/util/WeakHashMap;

    invoke-static {p1}, Lts;->c(Landroid/view/View;)V

    goto/16 :goto_2

    :cond_e
    iget-boolean v0, p0, LBt;->A:Z

    if-eqz v0, :cond_1a

    iput-boolean v3, p0, LBt;->A:Z

    iget-object v0, p0, LBt;->B:LXs;

    if-eqz v0, :cond_f

    invoke-virtual {v0}, LXs;->a()V

    :cond_f
    iget v0, p0, LBt;->w:I

    iget-object v9, p0, LBt;->E:Lzt;

    if-nez v0, :cond_19

    iget-boolean v0, p0, LBt;->C:Z

    if-nez v0, :cond_10

    if-eqz p1, :cond_19

    :cond_10
    iget-object v0, p0, LBt;->m:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0, v7}, Landroid/view/View;->setAlpha(F)V

    iget-object v0, p0, LBt;->m:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v0, v2}, Landroidx/appcompat/widget/ActionBarContainer;->setTransitioning(Z)V

    new-instance v0, LXs;

    invoke-direct {v0}, LXs;-><init>()V

    iget-object v7, p0, LBt;->m:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v7}, Landroid/view/View;->getHeight()I

    move-result v7

    neg-int v7, v7

    int-to-float v7, v7

    if-eqz p1, :cond_11

    filled-new-array {v3, v3}, [I

    move-result-object p1

    iget-object v3, p0, LBt;->m:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {v3, p1}, Landroid/view/View;->getLocationInWindow([I)V

    aget p1, p1, v2

    int-to-float p1, p1

    sub-float/2addr v7, p1

    :cond_11
    iget-object p1, p0, LBt;->m:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-static {p1}, LGs;->a(Landroid/view/View;)LWs;

    move-result-object p1

    invoke-virtual {p1, v7}, LWs;->e(F)V

    iget-object v2, p1, LWs;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    if-eqz v2, :cond_13

    if-eqz v8, :cond_12

    new-instance v6, Lea;

    invoke-direct {v6, v8, v2}, Lea;-><init>(LVi;Landroid/view/View;)V

    :cond_12
    invoke-virtual {v2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2, v6}, Landroid/view/ViewPropertyAnimator;->setUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)Landroid/view/ViewPropertyAnimator;

    :cond_13
    iget-boolean v2, v0, LXs;->e:Z

    iget-object v3, v0, LXs;->a:Ljava/util/ArrayList;

    if-nez v2, :cond_14

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_14
    iget-boolean p1, p0, LBt;->x:Z

    if-eqz p1, :cond_15

    if-eqz v1, :cond_15

    invoke-static {v1}, LGs;->a(Landroid/view/View;)LWs;

    move-result-object p1

    invoke-virtual {p1, v7}, LWs;->e(F)V

    iget-boolean v1, v0, LXs;->e:Z

    if-nez v1, :cond_15

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_15
    sget-object p1, LBt;->H:Landroid/view/animation/AccelerateInterpolator;

    iget-boolean v1, v0, LXs;->e:Z

    if-nez v1, :cond_16

    iput-object p1, v0, LXs;->c:Landroid/view/animation/Interpolator;

    :cond_16
    if-nez v1, :cond_17

    iput-wide v4, v0, LXs;->b:J

    :cond_17
    if-nez v1, :cond_18

    iput-object v9, v0, LXs;->d:LYs;

    :cond_18
    iput-object v0, p0, LBt;->B:LXs;

    invoke-virtual {v0}, LXs;->b()V

    goto :goto_2

    :cond_19
    invoke-virtual {v9}, Lzt;->a()V

    :cond_1a
    :goto_2
    return-void
.end method

.method public final K()V
    .locals 2

    iget-object v0, p0, LBt;->j:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const/high16 v1, 0x7f050000

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v0

    invoke-virtual {p0, v0}, LBt;->D0(Z)V

    return-void
.end method

.method public final R(ILandroid/view/KeyEvent;)Z
    .locals 4

    iget-object v0, p0, LBt;->r:LAt;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, v0, LAt;->d:Lti;

    if-eqz v0, :cond_3

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    move-result v2

    goto :goto_0

    :cond_1
    const/4 v2, -0x1

    :goto_0
    invoke-static {v2}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_2

    goto :goto_1

    :cond_2
    move v3, v1

    :goto_1
    invoke-virtual {v0, v3}, Lti;->setQwertyMode(Z)V

    invoke-virtual {v0, p1, p2, v1}, Lti;->performShortcut(ILandroid/view/KeyEvent;I)Z

    move-result p1

    return p1

    :cond_3
    return v1
.end method

.method public final j0(Z)V
    .locals 1

    iget-boolean v0, p0, LBt;->q:Z

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, LBt;->k0(Z)V

    :cond_0
    return-void
.end method

.method public final k()Z
    .locals 2

    iget-object v0, p0, LBt;->n:Ls8;

    if-eqz v0, :cond_2

    move-object v1, v0

    check-cast v1, Lar;

    iget-object v1, v1, Lar;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object v1, v1, Landroidx/appcompat/widget/Toolbar;->M:LTq;

    if-eqz v1, :cond_2

    iget-object v1, v1, LTq;->b:Lyi;

    if-eqz v1, :cond_2

    check-cast v0, Lar;

    iget-object v0, v0, Lar;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object v0, v0, Landroidx/appcompat/widget/Toolbar;->M:LTq;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, v0, LTq;->b:Lyi;

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lyi;->collapseActionView()Z

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public final k0(Z)V
    .locals 4

    const/4 v0, 0x4

    if-eqz p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v1, p0, LBt;->n:Ls8;

    check-cast v1, Lar;

    iget v2, v1, Lar;->b:I

    const/4 v3, 0x1

    iput-boolean v3, p0, LBt;->q:Z

    and-int/2addr p1, v0

    and-int/lit8 v0, v2, -0x5

    or-int/2addr p1, v0

    invoke-virtual {v1, p1}, Lar;->a(I)V

    return-void
.end method

.method public final l0(Z)V
    .locals 0

    iput-boolean p1, p0, LBt;->C:Z

    if-nez p1, :cond_0

    iget-object p1, p0, LBt;->B:LXs;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LXs;->a()V

    :cond_0
    return-void
.end method

.method public final m0(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, LBt;->n:Ls8;

    check-cast v0, Lar;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lar;->g:Z

    iput-object p1, v0, Lar;->h:Ljava/lang/CharSequence;

    iget v1, v0, Lar;->b:I

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_0

    iget-object v1, v0, Lar;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v1, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    iget-boolean v0, v0, Lar;->g:Z

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p1}, LGs;->k(Landroid/view/View;Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public final p(Z)V
    .locals 1

    iget-boolean v0, p0, LBt;->u:Z

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, LBt;->u:Z

    iget-object p1, p0, LBt;->v:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_1

    return-void

    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LVo;->l(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final p0(Ljava/lang/CharSequence;)V
    .locals 2

    iget-object v0, p0, LBt;->n:Ls8;

    check-cast v0, Lar;

    iget-boolean v1, v0, Lar;->g:Z

    if-nez v1, :cond_0

    iput-object p1, v0, Lar;->h:Ljava/lang/CharSequence;

    iget v1, v0, Lar;->b:I

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_0

    iget-object v1, v0, Lar;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v1, p1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    iget-boolean v0, v0, Lar;->g:Z

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p1}, LGs;->k(Landroid/view/View;Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public final q0(Ld2;)Lq0;
    .locals 2

    iget-object v0, p0, LBt;->r:LAt;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LAt;->a()V

    :cond_0
    iget-object v0, p0, LBt;->l:Landroidx/appcompat/widget/ActionBarOverlayLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/ActionBarOverlayLayout;->setHideOnContentScrollEnabled(Z)V

    iget-object v0, p0, LBt;->o:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->e()V

    new-instance v0, LAt;

    iget-object v1, p0, LBt;->o:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, p0, v1, p1}, LAt;-><init>(LBt;Landroid/content/Context;Ld2;)V

    iget-object p1, v0, LAt;->d:Lti;

    invoke-virtual {p1}, Lti;->w()V

    :try_start_0
    iget-object v1, v0, LAt;->e:Lp0;

    invoke-interface {v1, v0, p1}, Lp0;->c(Lq0;Lti;)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Lti;->v()V

    if-eqz v1, :cond_1

    iput-object v0, p0, LBt;->r:LAt;

    invoke-virtual {v0}, LAt;->g()V

    iget-object p1, p0, LBt;->o:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->c(Lq0;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, LBt;->B0(Z)V

    return-object v0

    :cond_1
    const/4 p1, 0x0

    return-object p1

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Lti;->v()V

    throw v0
.end method

.method public final v()I
    .locals 1

    iget-object v0, p0, LBt;->n:Ls8;

    check-cast v0, Lar;

    iget v0, v0, Lar;->b:I

    return v0
.end method
