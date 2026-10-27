.class public abstract Lq1;
.super LP6;
.source "SourceFile"

# interfaces
.implements Lu1;
.implements Lx0;


# instance fields
.field public final s:Lk0;

.field public final t:LFg;

.field public u:Z

.field public v:Z

.field public w:Z

.field public x:LR1;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, LP6;-><init>()V

    new-instance v0, LBc;

    invoke-direct {v0, p0}, LBc;-><init>(Lq1;)V

    new-instance v1, Lk0;

    const/16 v2, 0x11

    invoke-direct {v1, v0, v2}, Lk0;-><init>(Ljava/lang/Object;I)V

    iput-object v1, p0, Lq1;->s:Lk0;

    new-instance v0, LFg;

    invoke-direct {v0, p0}, LFg;-><init>(LDg;)V

    iput-object v0, p0, Lq1;->t:LFg;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lq1;->w:Z

    iget-object v0, p0, LP6;->d:LLo;

    iget-object v0, v0, LLo;->d:Ljava/lang/Object;

    check-cast v0, Lx1;

    new-instance v1, LG6;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, LG6;-><init>(Ljava/lang/Object;I)V

    const-string v2, "android:support:lifecycle"

    invoke-virtual {v0, v2, v1}, Lx1;->f(Ljava/lang/String;Lwn;)V

    new-instance v0, LAc;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LAc;-><init>(Lq1;I)V

    invoke-virtual {p0, v0}, LP6;->g(Ly7;)V

    new-instance v0, LAc;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, LAc;-><init>(Lq1;I)V

    iget-object v1, p0, LP6;->k:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, LH6;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, LH6;-><init>(Lq1;I)V

    invoke-virtual {p0, v0}, LP6;->h(Ldk;)V

    iget-object v0, p0, LP6;->d:LLo;

    iget-object v0, v0, LLo;->d:Ljava/lang/Object;

    check-cast v0, Lx1;

    new-instance v1, Lo1;

    invoke-direct {v1, p0}, Lo1;-><init>(Lq1;)V

    const-string v2, "androidx:appcompat"

    invoke-virtual {v0, v2, v1}, Lx1;->f(Ljava/lang/String;Lwn;)V

    new-instance v0, Lp1;

    invoke-direct {v0, p0}, Lp1;-><init>(Lq1;)V

    invoke-virtual {p0, v0}, LP6;->h(Ldk;)V

    return-void
.end method

.method public static x(LOc;)Z
    .locals 6

    sget-object v0, Lug;->c:Lug;

    iget-object p0, p0, LOc;->c:Ljj;

    invoke-virtual {p0}, Ljj;->r()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzc;

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v3, v2, Lzc;->s:LBc;

    if-nez v3, :cond_2

    const/4 v3, 0x0

    goto :goto_1

    :cond_2
    iget-object v3, v3, LBc;->n:Lq1;

    :goto_1
    if-eqz v3, :cond_3

    invoke-virtual {v2}, Lzc;->g()LOc;

    move-result-object v3

    invoke-static {v3}, Lq1;->x(LOc;)Z

    move-result v3

    or-int/2addr v1, v3

    :cond_3
    iget-object v3, v2, Lzc;->N:Lad;

    sget-object v4, Lug;->d:Lug;

    const/4 v5, 0x1

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lad;->e()V

    iget-object v3, v3, Lad;->c:LFg;

    iget-object v3, v3, LFg;->c:Lug;

    invoke-virtual {v3, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v3

    if-ltz v3, :cond_4

    iget-object v1, v2, Lzc;->N:Lad;

    iget-object v1, v1, Lad;->c:LFg;

    invoke-virtual {v1, v0}, LFg;->g(Lug;)V

    move v1, v5

    :cond_4
    iget-object v3, v2, Lzc;->M:LFg;

    iget-object v3, v3, LFg;->c:Lug;

    invoke-virtual {v3, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v3

    if-ltz v3, :cond_0

    iget-object v1, v2, Lzc;->M:LFg;

    invoke-virtual {v1, v0}, LFg;->g(Lug;)V

    move v1, v5

    goto :goto_0

    :cond_5
    return v1
.end method


# virtual methods
.method public final A()V
    .locals 3

    invoke-super {p0}, Landroid/app/Activity;->onPostResume()V

    iget-object v0, p0, Lq1;->t:LFg;

    sget-object v1, Ltg;->ON_RESUME:Ltg;

    invoke-virtual {v0, v1}, LFg;->e(Ltg;)V

    iget-object v0, p0, Lq1;->s:Lk0;

    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;

    check-cast v0, LBc;

    iget-object v0, v0, LBc;->m:LOc;

    const/4 v1, 0x0

    iput-boolean v1, v0, LOc;->E:Z

    iput-boolean v1, v0, LOc;->F:Z

    iget-object v2, v0, LOc;->L:LRc;

    iput-boolean v1, v2, LRc;->g:Z

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, LOc;->t(I)V

    return-void
.end method

.method public final B()V
    .locals 5

    iget-object v0, p0, Lq1;->s:Lk0;

    invoke-virtual {v0}, Lk0;->y()V

    invoke-super {p0}, Landroid/app/Activity;->onStart()V

    const/4 v1, 0x0

    iput-boolean v1, p0, Lq1;->w:Z

    iget-boolean v2, p0, Lq1;->u:Z

    const/4 v3, 0x1

    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;

    check-cast v0, LBc;

    if-nez v2, :cond_0

    iput-boolean v3, p0, Lq1;->u:Z

    iget-object v2, v0, LBc;->m:LOc;

    iput-boolean v1, v2, LOc;->E:Z

    iput-boolean v1, v2, LOc;->F:Z

    iget-object v4, v2, LOc;->L:LRc;

    iput-boolean v1, v4, LRc;->g:Z

    const/4 v4, 0x4

    invoke-virtual {v2, v4}, LOc;->t(I)V

    :cond_0
    iget-object v2, v0, LBc;->m:LOc;

    invoke-virtual {v2, v3}, LOc;->y(Z)Z

    iget-object v2, p0, Lq1;->t:LFg;

    sget-object v3, Ltg;->ON_START:Ltg;

    invoke-virtual {v2, v3}, LFg;->e(Ltg;)V

    iget-object v0, v0, LBc;->m:LOc;

    iput-boolean v1, v0, LOc;->E:Z

    iput-boolean v1, v0, LOc;->F:Z

    iget-object v2, v0, LOc;->L:LRc;

    iput-boolean v1, v2, LRc;->g:Z

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, LOc;->t(I)V

    return-void
.end method

.method public final C()V
    .locals 3

    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lq1;->w:Z

    :cond_0
    invoke-virtual {p0}, Lq1;->v()LOc;

    move-result-object v1

    invoke-static {v1}, Lq1;->x(LOc;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lq1;->s:Lk0;

    iget-object v1, v1, Lk0;->b:Ljava/lang/Object;

    check-cast v1, LBc;

    iget-object v1, v1, LBc;->m:LOc;

    iput-boolean v0, v1, LOc;->F:Z

    iget-object v2, v1, LOc;->L:LRc;

    iput-boolean v0, v2, LRc;->g:Z

    const/4 v0, 0x4

    invoke-virtual {v1, v0}, LOc;->t(I)V

    iget-object v0, p0, Lq1;->t:LFg;

    sget-object v1, Ltg;->ON_STOP:Ltg;

    invoke-virtual {v0, v1}, LFg;->e(Ltg;)V

    return-void
.end method

.method public final D(Lcom/google/android/material/appbar/MaterialToolbar;)V
    .locals 4

    invoke-virtual {p0}, Lq1;->t()LE1;

    move-result-object v0

    check-cast v0, LR1;

    iget-object v1, v0, LR1;->j:Ljava/lang/Object;

    instance-of v1, v1, Landroid/app/Activity;

    if-nez v1, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {v0}, LR1;->A()V

    iget-object v1, v0, LR1;->o:LBr;

    instance-of v2, v1, LBt;

    if-nez v2, :cond_4

    const/4 v2, 0x0

    iput-object v2, v0, LR1;->p:LSp;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, LBr;->M()V

    :cond_1
    iput-object v2, v0, LR1;->o:LBr;

    if-eqz p1, :cond_3

    new-instance v1, LYq;

    iget-object v2, v0, LR1;->j:Ljava/lang/Object;

    instance-of v3, v2, Landroid/app/Activity;

    if-eqz v3, :cond_2

    check-cast v2, Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;

    move-result-object v2

    goto :goto_0

    :cond_2
    iget-object v2, v0, LR1;->q:Ljava/lang/CharSequence;

    :goto_0
    iget-object v3, v0, LR1;->m:LM1;

    invoke-direct {v1, p1, v2, v3}, LYq;-><init>(Lcom/google/android/material/appbar/MaterialToolbar;Ljava/lang/CharSequence;Landroid/view/Window$Callback;)V

    iput-object v1, v0, LR1;->o:LBr;

    iget-object v2, v0, LR1;->m:LM1;

    iget-object v1, v1, LYq;->l:LXq;

    iput-object v1, v2, LM1;->b:LXq;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroidx/appcompat/widget/Toolbar;->setBackInvokedCallbackEnabled(Z)V

    goto :goto_1

    :cond_3
    iget-object p1, v0, LR1;->m:LM1;

    iput-object v2, p1, LM1;->b:LXq;

    :goto_1
    invoke-virtual {v0}, LR1;->b()V

    :goto_2
    return-void

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 3

    invoke-virtual {p0}, Lq1;->w()V

    invoke-virtual {p0}, Lq1;->t()LE1;

    move-result-object v0

    check-cast v0, LR1;

    invoke-virtual {v0}, LR1;->w()V

    iget-object v1, v0, LR1;->B:Landroid/view/ViewGroup;

    const v2, 0x1020002

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v1, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, v0, LR1;->m:LM1;

    iget-object p2, v0, LR1;->l:Landroid/view/Window;

    invoke-virtual {p2}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object p2

    invoke-virtual {p1, p2}, LM1;->a(Landroid/view/Window$Callback;)V

    return-void
.end method

.method public attachBaseContext(Landroid/content/Context;)V
    .locals 9

    const/4 v0, 0x0

    invoke-virtual {p0}, Lq1;->t()LE1;

    move-result-object v1

    check-cast v1, LR1;

    const/4 v2, 0x1

    iput-boolean v2, v1, LR1;->P:Z

    iget v3, v1, LR1;->T:I

    const/16 v4, -0x64

    if-eq v3, v4, :cond_0

    goto :goto_0

    :cond_0
    sget v3, LE1;->b:I

    :goto_0
    invoke-virtual {v1, p1, v3}, LR1;->C(Landroid/content/Context;I)I

    move-result v1

    invoke-static {p1}, LE1;->c(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-static {p1}, LE1;->c(Landroid/content/Context;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_4

    :cond_1
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x21

    if-lt v3, v4, :cond_2

    sget-boolean v3, LE1;->f:Z

    if-nez v3, :cond_7

    sget-object v3, LE1;->a:LC1;

    new-instance v4, Ly1;

    invoke-direct {v4, p1, v0}, Ly1;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v3, v4}, LC1;->execute(Ljava/lang/Runnable;)V

    goto :goto_4

    :cond_2
    sget-object v3, LE1;->i:Ljava/lang/Object;

    monitor-enter v3

    :try_start_0
    sget-object v4, LE1;->c:Lkh;

    if-nez v4, :cond_5

    sget-object v4, LE1;->d:Lkh;

    if-nez v4, :cond_3

    invoke-static {p1}, LTd;->B(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lkh;->a(Ljava/lang/String;)Lkh;

    move-result-object v4

    sput-object v4, LE1;->d:Lkh;

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_3
    :goto_1
    sget-object v4, LE1;->d:Lkh;

    iget-object v4, v4, Lkh;->a:Llh;

    iget-object v4, v4, Llh;->a:Landroid/os/LocaleList;

    invoke-virtual {v4}, Landroid/os/LocaleList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_4

    monitor-exit v3

    goto :goto_4

    :cond_4
    sget-object v4, LE1;->d:Lkh;

    sput-object v4, LE1;->c:Lkh;

    goto :goto_2

    :cond_5
    sget-object v5, LE1;->d:Lkh;

    invoke-virtual {v4, v5}, Lkh;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    sget-object v4, LE1;->c:Lkh;

    sput-object v4, LE1;->d:Lkh;

    iget-object v4, v4, Lkh;->a:Llh;

    iget-object v4, v4, Llh;->a:Landroid/os/LocaleList;

    invoke-virtual {v4}, Landroid/os/LocaleList;->toLanguageTags()Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v4}, LTd;->z(Landroid/content/Context;Ljava/lang/String;)V

    :cond_6
    :goto_2
    monitor-exit v3

    goto :goto_4

    :goto_3
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_7
    :goto_4
    invoke-static {p1}, LR1;->p(Landroid/content/Context;)Lkh;

    move-result-object v3

    instance-of v4, p1, Landroid/view/ContextThemeWrapper;

    const/4 v5, 0x0

    if-eqz v4, :cond_8

    invoke-static {p1, v1, v3, v5, v0}, LR1;->t(Landroid/content/Context;ILkh;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    move-result-object v4

    :try_start_1
    move-object v6, p1

    check-cast v6, Landroid/view/ContextThemeWrapper;

    invoke-virtual {v6, v4}, Landroid/view/ContextThemeWrapper;->applyOverrideConfiguration(Landroid/content/res/Configuration;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_b

    :catch_0
    :cond_8
    instance-of v4, p1, LJ7;

    if-eqz v4, :cond_9

    invoke-static {p1, v1, v3, v5, v0}, LR1;->t(Landroid/content/Context;ILkh;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    move-result-object v0

    :try_start_2
    move-object v4, p1

    check-cast v4, LJ7;

    invoke-virtual {v4, v0}, LJ7;->a(Landroid/content/res/Configuration;)V
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_1

    goto/16 :goto_b

    :catch_1
    :cond_9
    sget-boolean v0, LR1;->k0:Z

    if-nez v0, :cond_a

    goto/16 :goto_b

    :cond_a
    new-instance v0, Landroid/content/res/Configuration;

    invoke-direct {v0}, Landroid/content/res/Configuration;-><init>()V

    const/4 v4, -0x1

    iput v4, v0, Landroid/content/res/Configuration;->uiMode:I

    const/4 v4, 0x0

    iput v4, v0, Landroid/content/res/Configuration;->fontScale:F

    invoke-virtual {p1, v0}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v6

    iget v7, v6, Landroid/content/res/Configuration;->uiMode:I

    iput v7, v0, Landroid/content/res/Configuration;->uiMode:I

    invoke-virtual {v0, v6}, Landroid/content/res/Configuration;->equals(Landroid/content/res/Configuration;)Z

    move-result v7

    if-nez v7, :cond_20

    new-instance v7, Landroid/content/res/Configuration;

    invoke-direct {v7}, Landroid/content/res/Configuration;-><init>()V

    iput v4, v7, Landroid/content/res/Configuration;->fontScale:F

    invoke-virtual {v0, v6}, Landroid/content/res/Configuration;->diff(Landroid/content/res/Configuration;)I

    move-result v4

    if-nez v4, :cond_b

    goto/16 :goto_5

    :cond_b
    iget v4, v0, Landroid/content/res/Configuration;->fontScale:F

    iget v8, v6, Landroid/content/res/Configuration;->fontScale:F

    cmpl-float v4, v4, v8

    if-eqz v4, :cond_c

    iput v8, v7, Landroid/content/res/Configuration;->fontScale:F

    :cond_c
    iget v4, v0, Landroid/content/res/Configuration;->mcc:I

    iget v8, v6, Landroid/content/res/Configuration;->mcc:I

    if-eq v4, v8, :cond_d

    iput v8, v7, Landroid/content/res/Configuration;->mcc:I

    :cond_d
    iget v4, v0, Landroid/content/res/Configuration;->mnc:I

    iget v8, v6, Landroid/content/res/Configuration;->mnc:I

    if-eq v4, v8, :cond_e

    iput v8, v7, Landroid/content/res/Configuration;->mnc:I

    :cond_e
    invoke-static {v0, v6, v7}, LJ1;->a(Landroid/content/res/Configuration;Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V

    iget v4, v0, Landroid/content/res/Configuration;->touchscreen:I

    iget v8, v6, Landroid/content/res/Configuration;->touchscreen:I

    if-eq v4, v8, :cond_f

    iput v8, v7, Landroid/content/res/Configuration;->touchscreen:I

    :cond_f
    iget v4, v0, Landroid/content/res/Configuration;->keyboard:I

    iget v8, v6, Landroid/content/res/Configuration;->keyboard:I

    if-eq v4, v8, :cond_10

    iput v8, v7, Landroid/content/res/Configuration;->keyboard:I

    :cond_10
    iget v4, v0, Landroid/content/res/Configuration;->keyboardHidden:I

    iget v8, v6, Landroid/content/res/Configuration;->keyboardHidden:I

    if-eq v4, v8, :cond_11

    iput v8, v7, Landroid/content/res/Configuration;->keyboardHidden:I

    :cond_11
    iget v4, v0, Landroid/content/res/Configuration;->navigation:I

    iget v8, v6, Landroid/content/res/Configuration;->navigation:I

    if-eq v4, v8, :cond_12

    iput v8, v7, Landroid/content/res/Configuration;->navigation:I

    :cond_12
    iget v4, v0, Landroid/content/res/Configuration;->navigationHidden:I

    iget v8, v6, Landroid/content/res/Configuration;->navigationHidden:I

    if-eq v4, v8, :cond_13

    iput v8, v7, Landroid/content/res/Configuration;->navigationHidden:I

    :cond_13
    iget v4, v0, Landroid/content/res/Configuration;->orientation:I

    iget v8, v6, Landroid/content/res/Configuration;->orientation:I

    if-eq v4, v8, :cond_14

    iput v8, v7, Landroid/content/res/Configuration;->orientation:I

    :cond_14
    iget v4, v0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v4, v4, 0xf

    iget v8, v6, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v8, v8, 0xf

    if-eq v4, v8, :cond_15

    iget v4, v7, Landroid/content/res/Configuration;->screenLayout:I

    or-int/2addr v4, v8

    iput v4, v7, Landroid/content/res/Configuration;->screenLayout:I

    :cond_15
    iget v4, v0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v4, v4, 0xc0

    iget v8, v6, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v8, v8, 0xc0

    if-eq v4, v8, :cond_16

    iget v4, v7, Landroid/content/res/Configuration;->screenLayout:I

    or-int/2addr v4, v8

    iput v4, v7, Landroid/content/res/Configuration;->screenLayout:I

    :cond_16
    iget v4, v0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v4, v4, 0x30

    iget v8, v6, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v8, v8, 0x30

    if-eq v4, v8, :cond_17

    iget v4, v7, Landroid/content/res/Configuration;->screenLayout:I

    or-int/2addr v4, v8

    iput v4, v7, Landroid/content/res/Configuration;->screenLayout:I

    :cond_17
    iget v4, v0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v4, v4, 0x300

    iget v8, v6, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v8, v8, 0x300

    if-eq v4, v8, :cond_18

    iget v4, v7, Landroid/content/res/Configuration;->screenLayout:I

    or-int/2addr v4, v8

    iput v4, v7, Landroid/content/res/Configuration;->screenLayout:I

    :cond_18
    iget v4, v0, Landroid/content/res/Configuration;->colorMode:I

    and-int/lit8 v4, v4, 0x3

    iget v8, v6, Landroid/content/res/Configuration;->colorMode:I

    and-int/lit8 v8, v8, 0x3

    if-eq v4, v8, :cond_19

    iget v4, v7, Landroid/content/res/Configuration;->colorMode:I

    or-int/2addr v4, v8

    iput v4, v7, Landroid/content/res/Configuration;->colorMode:I

    :cond_19
    iget v4, v0, Landroid/content/res/Configuration;->colorMode:I

    and-int/lit8 v4, v4, 0xc

    iget v8, v6, Landroid/content/res/Configuration;->colorMode:I

    and-int/lit8 v8, v8, 0xc

    if-eq v4, v8, :cond_1a

    iget v4, v7, Landroid/content/res/Configuration;->colorMode:I

    or-int/2addr v4, v8

    iput v4, v7, Landroid/content/res/Configuration;->colorMode:I

    :cond_1a
    iget v4, v0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v4, v4, 0xf

    iget v8, v6, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v8, v8, 0xf

    if-eq v4, v8, :cond_1b

    iget v4, v7, Landroid/content/res/Configuration;->uiMode:I

    or-int/2addr v4, v8

    iput v4, v7, Landroid/content/res/Configuration;->uiMode:I

    :cond_1b
    iget v4, v0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v4, v4, 0x30

    iget v8, v6, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v8, v8, 0x30

    if-eq v4, v8, :cond_1c

    iget v4, v7, Landroid/content/res/Configuration;->uiMode:I

    or-int/2addr v4, v8

    iput v4, v7, Landroid/content/res/Configuration;->uiMode:I

    :cond_1c
    iget v4, v0, Landroid/content/res/Configuration;->screenWidthDp:I

    iget v8, v6, Landroid/content/res/Configuration;->screenWidthDp:I

    if-eq v4, v8, :cond_1d

    iput v8, v7, Landroid/content/res/Configuration;->screenWidthDp:I

    :cond_1d
    iget v4, v0, Landroid/content/res/Configuration;->screenHeightDp:I

    iget v8, v6, Landroid/content/res/Configuration;->screenHeightDp:I

    if-eq v4, v8, :cond_1e

    iput v8, v7, Landroid/content/res/Configuration;->screenHeightDp:I

    :cond_1e
    iget v4, v0, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    iget v8, v6, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    if-eq v4, v8, :cond_1f

    iput v8, v7, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    :cond_1f
    iget v0, v0, Landroid/content/res/Configuration;->densityDpi:I

    iget v4, v6, Landroid/content/res/Configuration;->densityDpi:I

    if-eq v0, v4, :cond_21

    iput v4, v7, Landroid/content/res/Configuration;->densityDpi:I

    goto :goto_5

    :cond_20
    move-object v7, v5

    :cond_21
    :goto_5
    invoke-static {p1, v1, v3, v7, v2}, LR1;->t(Landroid/content/Context;ILkh;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;

    move-result-object v0

    new-instance v1, LJ7;

    const v3, 0x7f14025e

    invoke-direct {v1, p1, v3}, LJ7;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v1, v0}, LJ7;->a(Landroid/content/res/Configuration;)V

    :try_start_3
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1
    :try_end_3
    .catch Ljava/lang/NullPointerException; {:try_start_3 .. :try_end_3} :catch_5

    if-eqz p1, :cond_25

    invoke-virtual {v1}, LJ7;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1d

    if-lt v0, v3, :cond_22

    invoke-static {p1}, LZm;->a(Landroid/content/res/Resources$Theme;)V

    goto :goto_a

    :cond_22
    sget-object v0, LTd;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_4
    sget-boolean v3, LTd;->g:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-nez v3, :cond_23

    :try_start_5
    const-class v3, Landroid/content/res/Resources$Theme;

    const-string v4, "rebase"

    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    sput-object v3, LTd;->f:Ljava/lang/reflect/Method;

    invoke-virtual {v3, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_5
    .catch Ljava/lang/NoSuchMethodException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_6

    :catchall_1
    move-exception p1

    goto :goto_9

    :catch_2
    move-exception v3

    :try_start_6
    const-string v4, "ResourcesCompat"

    const-string v6, "Failed to retrieve rebase() method"

    invoke-static {v4, v6, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_6
    sput-boolean v2, LTd;->g:Z

    :cond_23
    sget-object v2, LTd;->f:Ljava/lang/reflect/Method;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    if-eqz v2, :cond_24

    :try_start_7
    invoke-virtual {v2, p1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_7
    .catch Ljava/lang/IllegalAccessException; {:try_start_7 .. :try_end_7} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_7 .. :try_end_7} :catch_3
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_8

    :catch_3
    move-exception p1

    goto :goto_7

    :catch_4
    move-exception p1

    :goto_7
    :try_start_8
    const-string v2, "ResourcesCompat"

    const-string v3, "Failed to invoke rebase() method via reflection"

    invoke-static {v2, v3, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    sput-object v5, LTd;->f:Ljava/lang/reflect/Method;

    :cond_24
    :goto_8
    monitor-exit v0

    goto :goto_a

    :goto_9
    monitor-exit v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    throw p1

    :catch_5
    :cond_25
    :goto_a
    move-object p1, v1

    :goto_b
    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    return-void
.end method

.method public final closeOptionsMenu()V
    .locals 3

    invoke-virtual {p0}, Lq1;->u()LBr;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/Window;->hasFeature(I)Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LBr;->j()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->closeOptionsMenu()V

    :cond_1
    return-void
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 3

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-virtual {p0}, Lq1;->u()LBr;

    move-result-object v1

    const/16 v2, 0x52

    if-ne v0, v2, :cond_0

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, LBr;->S(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1}, LP6;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 5

    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p4, :cond_5

    array-length v2, p4

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    aget-object v2, p4, v0

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v3, "--autofill"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    move v2, v1

    goto :goto_2

    :sswitch_1
    const-string v3, "--contentcapture"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_1

    :cond_2
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1d

    if-lt v2, v3, :cond_5

    goto :goto_0

    :sswitch_2
    const-string v3, "--list-dumpables"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_1

    :sswitch_3
    const-string v3, "--dump-dumpable"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x21

    if-lt v2, v3, :cond_5

    goto :goto_0

    :sswitch_4
    const-string v3, "--translation"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_1

    :cond_4
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1f

    if-lt v2, v3, :cond_5

    goto :goto_0

    :cond_5
    :goto_1
    move v2, v0

    :goto_2
    xor-int/2addr v1, v2

    if-nez v1, :cond_6

    return-void

    :cond_6
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "Local FragmentActivity "

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, " State:"

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "  "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v2, "mCreated="

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v2, p0, Lq1;->u:Z

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Z)V

    const-string v2, " mResumed="

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v2, p0, Lq1;->v:Z

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Z)V

    const-string v2, " mStopped="

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v2, p0, Lq1;->w:Z

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Z)V

    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-interface {p0}, LSs;->d()LRs;

    move-result-object v2

    new-instance v3, LVi;

    sget-object v4, Lhh;->c:LQc;

    invoke-direct {v3, v2, v4}, LVi;-><init>(LRs;LQs;)V

    const-class v2, Lhh;

    invoke-virtual {v3, v2}, LVi;->e(Ljava/lang/Class;)LOs;

    move-result-object v2

    check-cast v2, Lhh;

    iget-object v2, v2, Lhh;->b:Lbp;

    iget v3, v2, Lbp;->c:I

    if-lez v3, :cond_8

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "Loaders:"

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    iget v3, v2, Lbp;->c:I

    if-gtz v3, :cond_7

    goto :goto_3

    :cond_7
    iget-object p1, v2, Lbp;->b:[Ljava/lang/Object;

    aget-object p1, p1, v0

    invoke-static {p1}, LVo;->l(Ljava/lang/Object;)V

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p1, "  #"

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p1, v2, Lbp;->a:[I

    aget p1, p1, v0

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(I)V

    const-string p1, ": "

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :cond_8
    :goto_3
    iget-object v0, p0, Lq1;->s:Lk0;

    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;

    check-cast v0, LBc;

    iget-object v0, v0, LBc;->m:LOc;

    invoke-virtual {v0, p1, p2, p3, p4}, LOc;->v(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x2673d6ef -> :sswitch_4
        0x5fd0f67 -> :sswitch_3
        0x1c2b8816 -> :sswitch_2
        0x4519f64d -> :sswitch_1
        0x56b9c952 -> :sswitch_0
    .end sparse-switch
.end method

.method public final findViewById(I)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, Lq1;->t()LE1;

    move-result-object v0

    check-cast v0, LR1;

    invoke-virtual {v0}, LR1;->w()V

    iget-object v0, v0, LR1;->l:Landroid/view/Window;

    invoke-virtual {v0, p1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final getMenuInflater()Landroid/view/MenuInflater;
    .locals 3

    invoke-virtual {p0}, Lq1;->t()LE1;

    move-result-object v0

    check-cast v0, LR1;

    iget-object v1, v0, LR1;->p:LSp;

    if-nez v1, :cond_1

    invoke-virtual {v0}, LR1;->A()V

    new-instance v1, LSp;

    iget-object v2, v0, LR1;->o:LBr;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, LBr;->C()Landroid/content/Context;

    move-result-object v2

    goto :goto_0

    :cond_0
    iget-object v2, v0, LR1;->k:Landroid/content/Context;

    :goto_0
    invoke-direct {v1, v2}, LSp;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, LR1;->p:LSp;

    :cond_1
    iget-object v0, v0, LR1;->p:LSp;

    return-object v0
.end method

.method public final getResources()Landroid/content/res/Resources;
    .locals 1

    sget v0, Lds;->a:I

    invoke-super {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    return-object v0
.end method

.method public final invalidateOptionsMenu()V
    .locals 1

    invoke-virtual {p0}, Lq1;->t()LE1;

    move-result-object v0

    invoke-virtual {v0}, LE1;->b()V

    return-void
.end method

.method public final onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    iget-object v0, p0, Lq1;->s:Lk0;

    invoke-virtual {v0}, Lk0;->y()V

    invoke-super {p0, p1, p2, p3}, LP6;->onActivityResult(IILandroid/content/Intent;)V

    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 4

    invoke-super {p0, p1}, LP6;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    invoke-virtual {p0}, Lq1;->t()LE1;

    move-result-object p1

    check-cast p1, LR1;

    iget-boolean v0, p1, LR1;->G:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p1, LR1;->A:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, LR1;->A()V

    iget-object v0, p1, LR1;->o:LBr;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LBr;->K()V

    :cond_0
    invoke-static {}, LU1;->a()LU1;

    move-result-object v0

    iget-object v1, p1, LR1;->k:Landroid/content/Context;

    monitor-enter v0

    :try_start_0
    iget-object v2, v0, LU1;->a:LTm;

    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v3, v2, LTm;->b:Ljava/util/WeakHashMap;

    invoke-virtual {v3, v1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lqh;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lqh;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v0

    new-instance v0, Landroid/content/res/Configuration;

    iget-object v1, p1, LR1;->k:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    iput-object v0, p1, LR1;->S:Landroid/content/res/Configuration;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0}, LR1;->m(ZZ)Z

    return-void

    :goto_1
    :try_start_3
    monitor-exit v2

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final onContentChanged()V
    .locals 0

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, LP6;->onCreate(Landroid/os/Bundle;)V

    iget-object p1, p0, Lq1;->t:LFg;

    sget-object v0, Ltg;->ON_CREATE:Ltg;

    invoke-virtual {p1, v0}, LFg;->e(Ltg;)V

    iget-object p1, p0, Lq1;->s:Lk0;

    iget-object p1, p1, Lk0;->b:Ljava/lang/Object;

    check-cast p1, LBc;

    iget-object p1, p1, LBc;->m:LOc;

    const/4 v0, 0x0

    iput-boolean v0, p1, LOc;->E:Z

    iput-boolean v0, p1, LOc;->F:Z

    iget-object v1, p1, LOc;->L:LRc;

    iput-boolean v0, v1, LRc;->g:Z

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, LOc;->t(I)V

    return-void
.end method

.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lq1;->s:Lk0;

    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;

    check-cast v0, LBc;

    .line 2
    iget-object v0, v0, LBc;->m:LOc;

    .line 3
    iget-object v0, v0, LOc;->f:LEc;

    .line 4
    invoke-virtual {v0, p1, p2, p3, p4}, LEc;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 5
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 2

    .line 6
    iget-object v0, p0, Lq1;->s:Lk0;

    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;

    check-cast v0, LBc;

    .line 7
    iget-object v0, v0, LBc;->m:LOc;

    .line 8
    iget-object v0, v0, LOc;->f:LEc;

    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1, p1, p2, p3}, LEc;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    .line 10
    invoke-super {p0, p1, p2, p3}, Landroid/app/Activity;->onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v0
.end method

.method public onDestroy()V
    .locals 1

    invoke-virtual {p0}, Lq1;->y()V

    invoke-virtual {p0}, Lq1;->t()LE1;

    move-result-object v0

    invoke-virtual {v0}, LE1;->e()V

    return-void
.end method

.method public final onMenuItemSelected(ILandroid/view/MenuItem;)Z
    .locals 4

    invoke-virtual {p0, p1, p2}, Lq1;->z(ILandroid/view/MenuItem;)Z

    move-result p1

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Lq1;->u()LBr;

    move-result-object p1

    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    move-result p2

    const v1, 0x102002c

    const/4 v2, 0x0

    if-ne p2, v1, :cond_8

    if-eqz p1, :cond_8

    invoke-virtual {p1}, LBr;->v()I

    move-result p1

    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_8

    invoke-static {p0}, LF4;->L(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p0, p1}, Landroid/app/Activity;->shouldUpRecreateTask(Landroid/content/Intent;)Z

    move-result p2

    if-eqz p2, :cond_6

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p0}, LF4;->L(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object p2

    if-nez p2, :cond_1

    invoke-static {p0}, LF4;->L(Landroid/app/Activity;)Landroid/content/Intent;

    move-result-object p2

    :cond_1
    if-eqz p2, :cond_4

    invoke-virtual {p2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v1

    if-nez v1, :cond_2

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroid/content/Intent;->resolveActivity(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;

    move-result-object v1

    :cond_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    :try_start_0
    invoke-static {p0, v1}, LF4;->M(Landroid/content/Context;Landroid/content/ComponentName;)Landroid/content/Intent;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_3

    invoke-virtual {p1, v3, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    invoke-virtual {v1}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    move-result-object v1

    invoke-static {p0, v1}, LF4;->M(Landroid/content/Context;Landroid/content/ComponentName;)Landroid/content/Intent;

    move-result-object v1
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_3
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :goto_1
    const-string p2, "TaskStackBuilder"

    const-string v0, "Bad ComponentName while traversing activity parent metadata"

    invoke-static {p2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_4
    :goto_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_5

    new-array p2, v2, [Landroid/content/Intent;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Landroid/content/Intent;

    new-instance p2, Landroid/content/Intent;

    aget-object v1, p1, v2

    invoke-direct {p2, v1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    const v1, 0x1000c000

    invoke-virtual {p2, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object p2

    aput-object p2, p1, v2

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Landroid/content/Context;->startActivities([Landroid/content/Intent;Landroid/os/Bundle;)V

    :try_start_1
    invoke-virtual {p0}, Landroid/app/Activity;->finishAffinity()V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_3

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "No intents added to TaskStackBuilder; cannot startActivities"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    invoke-virtual {p0, p1}, Landroid/app/Activity;->navigateUpTo(Landroid/content/Intent;)Z

    goto :goto_3

    :cond_7
    move v0, v2

    :goto_3
    return v0

    :cond_8
    return v2
.end method

.method public final onPause()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lq1;->v:Z

    iget-object v0, p0, Lq1;->s:Lk0;

    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;

    check-cast v0, LBc;

    iget-object v0, v0, LBc;->m:LOc;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, LOc;->t(I)V

    iget-object v0, p0, Lq1;->t:LFg;

    sget-object v1, Ltg;->ON_PAUSE:Ltg;

    invoke-virtual {v0, v1}, LFg;->e(Ltg;)V

    return-void
.end method

.method public final onPostCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Activity;->onPostCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lq1;->t()LE1;

    move-result-object p1

    check-cast p1, LR1;

    invoke-virtual {p1}, LR1;->w()V

    return-void
.end method

.method public final onPostResume()V
    .locals 2

    invoke-virtual {p0}, Lq1;->A()V

    invoke-virtual {p0}, Lq1;->t()LE1;

    move-result-object v0

    check-cast v0, LR1;

    invoke-virtual {v0}, LR1;->A()V

    iget-object v0, v0, LR1;->o:LBr;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, LBr;->l0(Z)V

    :cond_0
    return-void
.end method

.method public final onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    iget-object v0, p0, Lq1;->s:Lk0;

    invoke-virtual {v0}, Lk0;->y()V

    invoke-super {p0, p1, p2, p3}, LP6;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    return-void
.end method

.method public onResume()V
    .locals 2

    iget-object v0, p0, Lq1;->s:Lk0;

    invoke-virtual {v0}, Lk0;->y()V

    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lq1;->v:Z

    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;

    check-cast v0, LBc;

    iget-object v0, v0, LBc;->m:LOc;

    invoke-virtual {v0, v1}, LOc;->y(Z)Z

    return-void
.end method

.method public final onStart()V
    .locals 3

    invoke-virtual {p0}, Lq1;->B()V

    invoke-virtual {p0}, Lq1;->t()LE1;

    move-result-object v0

    check-cast v0, LR1;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, LR1;->m(ZZ)Z

    return-void
.end method

.method public final onStateNotSaved()V
    .locals 1

    iget-object v0, p0, Lq1;->s:Lk0;

    invoke-virtual {v0}, Lk0;->y()V

    return-void
.end method

.method public final onStop()V
    .locals 2

    invoke-virtual {p0}, Lq1;->C()V

    invoke-virtual {p0}, Lq1;->t()LE1;

    move-result-object v0

    check-cast v0, LR1;

    invoke-virtual {v0}, LR1;->A()V

    iget-object v0, v0, LR1;->o:LBr;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LBr;->l0(Z)V

    :cond_0
    return-void
.end method

.method public final onTitleChanged(Ljava/lang/CharSequence;I)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onTitleChanged(Ljava/lang/CharSequence;I)V

    invoke-virtual {p0}, Lq1;->t()LE1;

    move-result-object p2

    invoke-virtual {p2, p1}, LE1;->l(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final openOptionsMenu()V
    .locals 3

    invoke-virtual {p0}, Lq1;->u()LBr;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/Window;->hasFeature(I)Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LBr;->U()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->openOptionsMenu()V

    :cond_1
    return-void
.end method

.method public final setContentView(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lq1;->w()V

    .line 2
    invoke-virtual {p0}, Lq1;->t()LE1;

    move-result-object v0

    invoke-virtual {v0, p1}, LE1;->h(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Lq1;->w()V

    .line 4
    invoke-virtual {p0}, Lq1;->t()LE1;

    move-result-object v0

    invoke-virtual {v0, p1}, LE1;->i(Landroid/view/View;)V

    return-void
.end method

.method public final setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 5
    invoke-virtual {p0}, Lq1;->w()V

    .line 6
    invoke-virtual {p0}, Lq1;->t()LE1;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LE1;->j(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final setTheme(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/content/Context;->setTheme(I)V

    invoke-virtual {p0}, Lq1;->t()LE1;

    move-result-object v0

    check-cast v0, LR1;

    iput p1, v0, LR1;->U:I

    return-void
.end method

.method public final t()LE1;
    .locals 2

    iget-object v0, p0, Lq1;->x:LR1;

    if-nez v0, :cond_0

    sget-object v0, LE1;->a:LC1;

    new-instance v0, LR1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, p0, p0}, LR1;-><init>(Landroid/content/Context;Landroid/view/Window;Lu1;Ljava/lang/Object;)V

    iput-object v0, p0, Lq1;->x:LR1;

    :cond_0
    iget-object v0, p0, Lq1;->x:LR1;

    return-object v0
.end method

.method public final u()LBr;
    .locals 1

    invoke-virtual {p0}, Lq1;->t()LE1;

    move-result-object v0

    check-cast v0, LR1;

    invoke-virtual {v0}, LR1;->A()V

    iget-object v0, v0, LR1;->o:LBr;

    return-object v0
.end method

.method public final v()LOc;
    .locals 1

    iget-object v0, p0, Lq1;->s:Lk0;

    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;

    check-cast v0, LBc;

    iget-object v0, v0, LBc;->m:LOc;

    return-object v0
.end method

.method public final w()V
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p0}, LF4;->X(Landroid/view/View;LDg;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const-string v1, "<this>"

    invoke-static {v1, v0}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const v1, 0x7f0b02c5

    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p0}, LUd;->f0(Landroid/view/View;Lxn;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p0}, LTd;->D(Landroid/view/View;Lbk;)V

    return-void
.end method

.method public final y()V
    .locals 2

    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    iget-object v0, p0, Lq1;->s:Lk0;

    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;

    check-cast v0, LBc;

    iget-object v0, v0, LBc;->m:LOc;

    invoke-virtual {v0}, LOc;->k()V

    iget-object v0, p0, Lq1;->t:LFg;

    sget-object v1, Ltg;->ON_DESTROY:Ltg;

    invoke-virtual {v0, v1}, LFg;->e(Ltg;)V

    return-void
.end method

.method public final z(ILandroid/view/MenuItem;)Z
    .locals 0

    invoke-super {p0, p1, p2}, LP6;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p2, 0x6

    if-ne p1, p2, :cond_1

    iget-object p1, p0, Lq1;->s:Lk0;

    iget-object p1, p1, Lk0;->b:Ljava/lang/Object;

    check-cast p1, LBc;

    iget-object p1, p1, LBc;->m:LOc;

    invoke-virtual {p1}, LOc;->i()Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
