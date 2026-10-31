.class public final Lr0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lr0;->a:I

    iput-object p1, p0, Lr0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 19

    move-object/from16 v1, p0

    const-wide/16 v4, -0x1

    const/4 v0, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    iget v10, v1, Lr0;->a:I

    packed-switch v10, :pswitch_data_0

    iget-object v0, v1, Lr0;->b:Ljava/lang/Object;

    check-cast v0, LKs;

    invoke-virtual {v0, v9}, LKs;->n(I)V

    return-void

    :pswitch_0
    iget-object v2, v1, Lr0;->b:Ljava/lang/Object;

    check-cast v2, LYq;

    iget-object v3, v2, LYq;->k:Landroid/view/Window$Callback;

    invoke-virtual {v2}, LYq;->B0()Landroid/view/Menu;

    move-result-object v2

    instance-of v4, v2, Lti;

    if-eqz v4, :cond_0

    move-object v4, v2

    check-cast v4, Lti;

    goto :goto_0

    :cond_0
    move-object v4, v0

    :goto_0
    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lti;->w()V

    :cond_1
    :try_start_0
    invoke-interface {v2}, Landroid/view/Menu;->clear()V

    invoke-interface {v3, v9, v2}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v3, v9, v0, v2}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_2
    :goto_1
    invoke-interface {v2}, Landroid/view/Menu;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    if-eqz v4, :cond_4

    invoke-virtual {v4}, Lti;->v()V

    :cond_4
    return-void

    :goto_2
    if-eqz v4, :cond_5

    invoke-virtual {v4}, Lti;->v()V

    :cond_5
    throw v0

    :pswitch_1
    iget-object v0, v1, Lr0;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->v()Z

    return-void

    :pswitch_2
    iget-object v0, v1, Lr0;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v0, v0, Lcom/google/android/material/textfield/TextInputLayout;->c:Lcb;

    iget-object v0, v0, Lcb;->g:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/view/View;->performClick()Z

    invoke-virtual {v0}, Landroid/view/View;->jumpDrawablesToCurrentState()V

    return-void

    :cond_6
    :goto_3
    :pswitch_3
    iget-object v0, v1, Lr0;->b:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkq;

    monitor-enter v2

    :try_start_1
    iget-object v0, v1, Lr0;->b:Ljava/lang/Object;

    check-cast v0, Lkq;

    invoke-virtual {v0}, Lkq;->c()Liq;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    monitor-exit v2

    if-eqz v3, :cond_9

    iget-object v2, v3, Liq;->a:Ljq;

    invoke-static {v2}, LTf;->f(Ljava/lang/Object;)V

    sget-object v0, Lkq;->i:Ljava/util/logging/Logger;

    sget-object v6, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v0, v6}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v6

    if-eqz v6, :cond_7

    iget-object v0, v2, Ljq;->e:Lkq;

    iget-object v0, v0, Lkq;->g:LVi;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v7

    const-string v0, "starting"

    invoke-static {v3, v2, v0}, LUd;->a(Liq;Ljq;Ljava/lang/String;)V

    goto :goto_4

    :cond_7
    move-wide v7, v4

    :goto_4
    :try_start_2
    iget-object v0, v1, Lr0;->b:Ljava/lang/Object;

    check-cast v0, Lkq;

    invoke-static {v0, v3}, Lkq;->a(Lkq;Liq;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v6, :cond_6

    iget-object v0, v2, Ljq;->e:Lkq;

    iget-object v0, v0, Lkq;->g:LVi;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v9

    sub-long/2addr v9, v7

    invoke-static {v9, v10}, LUd;->q(J)Ljava/lang/String;

    move-result-object v0

    const-string v6, "finished run in "

    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v2, v0}, LUd;->a(Liq;Ljq;Ljava/lang/String;)V

    goto :goto_3

    :catchall_1
    move-exception v0

    :try_start_3
    iget-object v4, v1, Lr0;->b:Ljava/lang/Object;

    check-cast v4, Lkq;

    iget-object v4, v4, Lkq;->g:LVi;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, v4, LVi;->a:Ljava/lang/Object;

    check-cast v4, Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v4, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception v0

    if-eqz v6, :cond_8

    iget-object v4, v2, Ljq;->e:Lkq;

    iget-object v4, v4, Lkq;->g:LVi;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    sub-long/2addr v4, v7

    invoke-static {v4, v5}, LUd;->q(J)Ljava/lang/String;

    move-result-object v4

    const-string v5, "failed a run in "

    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v2, v4}, LUd;->a(Liq;Ljq;Ljava/lang/String;)V

    :cond_8
    throw v0

    :cond_9
    return-void

    :catchall_3
    move-exception v0

    monitor-exit v2

    throw v0

    :pswitch_4
    iget-object v0, v1, Lr0;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->C0()Z

    return-void

    :pswitch_5
    invoke-static {}, LF4;->O()Ljava/lang/String;

    move-result-object v0

    iget-object v2, v1, Lr0;->b:Ljava/lang/Object;

    check-cast v2, Lru/zinovin/tankspeedometer/SpedometerPanel;

    iput-object v0, v2, Lru/zinovin/tankspeedometer/SpedometerPanel;->Y:Ljava/lang/String;

    invoke-virtual {v2}, Lru/zinovin/tankspeedometer/SpedometerPanel;->r()V

    invoke-virtual {v2}, Lru/zinovin/tankspeedometer/SpedometerPanel;->G()V

    return-void

    :pswitch_6
    iget-object v0, v1, Lr0;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    iget-boolean v2, v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->f:Z

    if-eqz v2, :cond_a

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "input_method"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {v2, v0, v9}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    iput-boolean v9, v0, Landroidx/appcompat/widget/SearchView$SearchAutoComplete;->f:Z

    :cond_a
    return-void

    :pswitch_7
    iget-object v0, v1, Lr0;->b:Ljava/lang/Object;

    check-cast v0, LEm;

    iget-object v2, v0, LEm;->c:Lvg;

    invoke-interface {v2, v0}, Lvg;->g(LBg;)V

    return-void

    :pswitch_8
    iget-object v0, v1, Lr0;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView;->H:LSl;

    if-eqz v4, :cond_17

    check-cast v4, LE8;

    iget-object v5, v4, LE8;->h:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v10

    xor-int/2addr v10, v8

    iget-object v11, v4, LE8;->j:Ljava/util/ArrayList;

    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v12

    xor-int/2addr v12, v8

    iget-object v13, v4, LE8;->k:Ljava/util/ArrayList;

    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v14

    xor-int/2addr v14, v8

    iget-object v15, v4, LE8;->i:Ljava/util/ArrayList;

    invoke-virtual {v15}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v16

    xor-int/lit8 v16, v16, 0x1

    if-nez v10, :cond_b

    if-nez v12, :cond_b

    if-nez v16, :cond_b

    if-nez v14, :cond_b

    goto/16 :goto_c

    :cond_b
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_5
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    iget-wide v2, v4, LSl;->d:J

    if-eqz v18, :cond_c

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v7, v18

    check-cast v7, Llm;

    iget-object v8, v7, Llm;->a:Landroid/view/View;

    invoke-virtual {v8}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v9

    iget-object v6, v4, LE8;->q:Ljava/util/ArrayList;

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v9, v2, v3}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    new-instance v3, Lz8;

    invoke-direct {v3, v4, v7, v9, v8}, Lz8;-><init>(LE8;Llm;Landroid/view/ViewPropertyAnimator;Landroid/view/View;)V

    invoke-virtual {v2, v3}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->start()V

    const/4 v8, 0x1

    const/4 v9, 0x0

    goto :goto_5

    :cond_c
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    if-eqz v12, :cond_e

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v6, v4, LE8;->m:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v11}, Ljava/util/ArrayList;->clear()V

    new-instance v6, Ly8;

    const/4 v7, 0x0

    invoke-direct {v6, v4, v5, v7}, Ly8;-><init>(LE8;Ljava/util/ArrayList;I)V

    if-eqz v10, :cond_d

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LD8;

    iget-object v5, v5, LD8;->a:Llm;

    iget-object v5, v5, Llm;->a:Landroid/view/View;

    sget-object v7, LGs;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v5, v6, v2, v3}, Landroid/view/View;->postOnAnimationDelayed(Ljava/lang/Runnable;J)V

    goto :goto_6

    :cond_d
    invoke-virtual {v6}, Ly8;->run()V

    :cond_e
    :goto_6
    if-eqz v14, :cond_10

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v5, v13}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v6, v4, LE8;->n:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v13}, Ljava/util/ArrayList;->clear()V

    new-instance v6, Ly8;

    const/4 v7, 0x1

    invoke-direct {v6, v4, v5, v7}, Ly8;-><init>(LE8;Ljava/util/ArrayList;I)V

    if-eqz v10, :cond_f

    const/4 v7, 0x0

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LC8;

    iget-object v5, v5, LC8;->a:Llm;

    iget-object v5, v5, Llm;->a:Landroid/view/View;

    sget-object v7, LGs;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v5, v6, v2, v3}, Landroid/view/View;->postOnAnimationDelayed(Ljava/lang/Runnable;J)V

    goto :goto_7

    :cond_f
    invoke-virtual {v6}, Ly8;->run()V

    :cond_10
    :goto_7
    if-eqz v16, :cond_16

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v5, v15}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v6, v4, LE8;->l:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v15}, Ljava/util/ArrayList;->clear()V

    new-instance v6, Ly8;

    const/4 v7, 0x2

    invoke-direct {v6, v4, v5, v7}, Ly8;-><init>(LE8;Ljava/util/ArrayList;I)V

    if-nez v10, :cond_12

    if-nez v12, :cond_12

    if-eqz v14, :cond_11

    goto :goto_8

    :cond_11
    invoke-virtual {v6}, Ly8;->run()V

    goto :goto_c

    :cond_12
    :goto_8
    if-eqz v10, :cond_13

    goto :goto_9

    :cond_13
    const-wide/16 v2, 0x0

    :goto_9
    if-eqz v12, :cond_14

    iget-wide v7, v4, LSl;->e:J

    goto :goto_a

    :cond_14
    const-wide/16 v7, 0x0

    :goto_a
    if-eqz v14, :cond_15

    iget-wide v9, v4, LSl;->f:J

    goto :goto_b

    :cond_15
    const-wide/16 v9, 0x0

    :goto_b
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v7

    add-long/2addr v7, v2

    const/4 v2, 0x0

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Llm;

    iget-object v2, v3, Llm;->a:Landroid/view/View;

    sget-object v3, LGs;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v2, v6, v7, v8}, Landroid/view/View;->postOnAnimationDelayed(Ljava/lang/Runnable;J)V

    :cond_16
    :goto_c
    const/4 v2, 0x0

    goto :goto_d

    :cond_17
    move v2, v9

    :goto_d
    iput-boolean v2, v0, Landroidx/recyclerview/widget/RecyclerView;->i0:Z

    return-void

    :pswitch_9
    iget-object v0, v1, Lr0;->b:Ljava/lang/Object;

    check-cast v0, Loj;

    iget-object v2, v0, Loj;->a:Ljava/lang/Object;

    monitor-enter v2

    :try_start_4
    iget-object v0, v1, Lr0;->b:Ljava/lang/Object;

    check-cast v0, Loj;

    iget-object v0, v0, Loj;->f:Ljava/lang/Object;

    iget-object v3, v1, Lr0;->b:Ljava/lang/Object;

    check-cast v3, Loj;

    sget-object v4, Loj;->k:Ljava/lang/Object;

    iput-object v4, v3, Loj;->f:Ljava/lang/Object;

    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    iget-object v2, v1, Lr0;->b:Ljava/lang/Object;

    check-cast v2, Loj;

    invoke-virtual {v2, v0}, Loj;->e(Ljava/lang/Object;)V

    return-void

    :catchall_4
    move-exception v0

    :try_start_5
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    throw v0

    :pswitch_a
    iget-object v0, v1, Lr0;->b:Ljava/lang/Object;

    check-cast v0, LK2;

    iget-object v0, v0, LK2;->d:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_18

    const v2, 0x7f0b0180

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_18

    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    const-wide/16 v3, 0x7d0

    invoke-virtual {v2, v3, v4}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    new-instance v3, LY;

    const/4 v4, 0x4

    invoke-direct {v3, v0, v4}, LY;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v2, v3}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    :cond_18
    return-void

    :pswitch_b
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-object v0, v1, Lr0;->b:Ljava/lang/Object;

    check-cast v0, Lle;

    iget-wide v4, v0, Lle;->i:J

    sub-long/2addr v2, v4

    long-to-float v2, v2

    const/high16 v3, 0x435c0000    # 220.0f

    div-float/2addr v2, v3

    const/high16 v3, 0x3f800000    # 1.0f

    cmpl-float v3, v2, v3

    if-ltz v3, :cond_19

    iget v2, v0, Lle;->k:F

    iput v2, v0, Lle;->f:F

    const/4 v2, 0x0

    iput-boolean v2, v0, Lle;->h:Z

    goto :goto_e

    :cond_19
    iget v3, v0, Lle;->j:F

    iget v4, v0, Lle;->k:F

    sub-float/2addr v4, v3

    iget-object v5, v0, Lle;->d:Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-virtual {v5, v2}, Landroid/view/animation/AccelerateDecelerateInterpolator;->getInterpolation(F)F

    move-result v2

    mul-float/2addr v2, v4

    add-float/2addr v2, v3

    iput v2, v0, Lle;->f:F

    :goto_e
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    iget-boolean v2, v0, Lle;->h:Z

    if-eqz v2, :cond_1a

    invoke-virtual {v0, v1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    :cond_1a
    return-void

    :pswitch_c
    iget-object v0, v1, Lr0;->b:Ljava/lang/Object;

    check-cast v0, LOc;

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, LOc;->y(Z)Z

    return-void

    :pswitch_d
    move v2, v8

    iget-object v0, v1, Lr0;->b:Ljava/lang/Object;

    check-cast v0, LQb;

    iget v3, v0, LQb;->A:I

    iget-object v4, v0, LQb;->z:Landroid/animation/ValueAnimator;

    if-eq v3, v2, :cond_1b

    const/4 v2, 0x2

    if-eq v3, v2, :cond_1c

    goto :goto_f

    :cond_1b
    const/4 v2, 0x2

    invoke-virtual {v4}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_1c
    const/4 v3, 0x3

    iput v3, v0, LQb;->A:I

    invoke-virtual {v4}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    new-array v2, v2, [F

    const/4 v3, 0x0

    aput v0, v2, v3

    const/4 v0, 0x1

    const/4 v3, 0x0

    aput v3, v2, v0

    invoke-virtual {v4, v2}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    const/16 v0, 0x1f4

    int-to-long v2, v0

    invoke-virtual {v4, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    invoke-virtual {v4}, Landroid/animation/ValueAnimator;->start()V

    :goto_f
    return-void

    :pswitch_e
    iget-object v2, v1, Lr0;->b:Ljava/lang/Object;

    check-cast v2, Lca;

    iput-object v0, v2, Lca;->l:Lr0;

    invoke-virtual {v2}, Lca;->drawableStateChanged()V

    return-void

    :pswitch_f
    iget-object v0, v1, Lr0;->b:Ljava/lang/Object;

    check-cast v0, Le9;

    iget-object v2, v0, Le9;->W:Lc9;

    iget-object v0, v0, Le9;->e0:Landroid/app/Dialog;

    invoke-virtual {v2, v0}, Lc9;->onDismiss(Landroid/content/DialogInterface;)V

    return-void

    :pswitch_10
    iget-object v0, v1, Lr0;->b:Ljava/lang/Object;

    check-cast v0, LL8;

    iget-object v2, v0, LL8;->b:Landroid/view/ViewGroup;

    iget-object v3, v0, LL8;->c:Landroid/view/View;

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    iget-object v0, v0, LL8;->d:LM8;

    invoke-virtual {v0}, Ld;->e()V

    return-void

    :pswitch_11
    iget-object v0, v1, Lr0;->b:Ljava/lang/Object;

    check-cast v0, LE4;

    const/4 v2, 0x0

    iput-boolean v2, v0, LE4;->c:Z

    iget-object v2, v0, LE4;->e:LL7;

    check-cast v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget-object v3, v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->M:LKs;

    if-eqz v3, :cond_1d

    invoke-virtual {v3}, LKs;->f()Z

    move-result v3

    if-eqz v3, :cond_1d

    iget v2, v0, LE4;->b:I

    invoke-virtual {v0, v2}, LE4;->a(I)V

    goto :goto_10

    :cond_1d
    iget v3, v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->L:I

    const/4 v4, 0x2

    if-ne v3, v4, :cond_1e

    iget v0, v0, LE4;->b:I

    invoke-virtual {v2, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->C(I)V

    :cond_1e
    :goto_10
    return-void

    :pswitch_12
    iget-object v0, v1, Lr0;->b:Ljava/lang/Object;

    check-cast v0, Lbh;

    iget-boolean v2, v0, Lbh;->o:Z

    if-nez v2, :cond_1f

    goto/16 :goto_13

    :cond_1f
    iget-boolean v2, v0, Lbh;->m:Z

    iget-object v3, v0, Lbh;->a:Lo3;

    if-eqz v2, :cond_20

    const/4 v2, 0x0

    iput-boolean v2, v0, Lbh;->m:Z

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v6

    iput-wide v6, v3, Lo3;->e:J

    iput-wide v4, v3, Lo3;->g:J

    iput-wide v6, v3, Lo3;->f:J

    const/high16 v2, 0x3f000000    # 0.5f

    iput v2, v3, Lo3;->h:F

    :cond_20
    iget-wide v4, v3, Lo3;->g:J

    const-wide/16 v6, 0x0

    cmp-long v2, v4, v6

    if-lez v2, :cond_21

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v4

    iget-wide v6, v3, Lo3;->g:J

    iget v2, v3, Lo3;->i:I

    int-to-long v8, v2

    add-long/2addr v6, v8

    cmp-long v2, v4, v6

    if-lez v2, :cond_21

    :goto_11
    const/4 v2, 0x0

    goto :goto_12

    :cond_21
    invoke-virtual {v0}, Lbh;->e()Z

    move-result v2

    if-nez v2, :cond_22

    goto :goto_11

    :goto_12
    iput-boolean v2, v0, Lbh;->o:Z

    goto :goto_13

    :cond_22
    const/4 v2, 0x0

    iget-boolean v4, v0, Lbh;->n:Z

    iget-object v5, v0, Lbh;->c:Landroid/view/View;

    if-eqz v4, :cond_23

    iput-boolean v2, v0, Lbh;->n:Z

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v8

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v10, 0x3

    const/4 v11, 0x0

    move-wide v6, v8

    invoke-static/range {v6 .. v13}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v2

    invoke-virtual {v5, v2}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    invoke-virtual {v2}, Landroid/view/MotionEvent;->recycle()V

    :cond_23
    iget-wide v6, v3, Lo3;->f:J

    const-wide/16 v8, 0x0

    cmp-long v2, v6, v8

    if-eqz v2, :cond_24

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v6

    invoke-virtual {v3, v6, v7}, Lo3;->a(J)F

    move-result v2

    const/high16 v4, -0x3f800000    # -4.0f

    mul-float/2addr v4, v2

    mul-float/2addr v4, v2

    const/high16 v8, 0x40800000    # 4.0f

    mul-float/2addr v2, v8

    add-float/2addr v2, v4

    iget-wide v8, v3, Lo3;->f:J

    sub-long v8, v6, v8

    iput-wide v6, v3, Lo3;->f:J

    long-to-float v4, v8

    mul-float/2addr v4, v2

    iget v2, v3, Lo3;->d:F

    mul-float/2addr v4, v2

    float-to-int v2, v4

    iget-object v0, v0, Lbh;->q:Landroid/widget/ListView;

    invoke-virtual {v0, v2}, Landroid/widget/AbsListView;->scrollListBy(I)V

    sget-object v0, LGs;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v5, v1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    :goto_13
    return-void

    :cond_24
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v2, "Cannot compute scroll delta before calling start()"

    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_13
    iget-object v0, v1, Lr0;->b:Ljava/lang/Object;

    check-cast v0, LK2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_14
    :try_start_6
    iget-object v2, v0, LK2;->c:Ljava/lang/Object;

    check-cast v2, Ljava/lang/ref/ReferenceQueue;

    invoke-virtual {v2}, Ljava/lang/ref/ReferenceQueue;->remove()Ljava/lang/ref/Reference;

    move-result-object v2

    check-cast v2, Lt0;

    invoke-virtual {v0, v2}, LK2;->f(Lt0;)V
    :try_end_6
    .catch Ljava/lang/InterruptedException; {:try_start_6 .. :try_end_6} :catch_0

    goto :goto_14

    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    goto :goto_14

    :pswitch_14
    const/16 v0, 0xa

    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    iget-object v0, v1, Lr0;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
