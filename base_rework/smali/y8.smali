.class public final Ly8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/util/ArrayList;

.field public final synthetic c:LE8;


# direct methods
.method public synthetic constructor <init>(LE8;Ljava/util/ArrayList;I)V
    .locals 0

    iput p3, p0, Ly8;->a:I

    iput-object p1, p0, Ly8;->c:LE8;

    iput-object p2, p0, Ly8;->b:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 18

    move-object/from16 v0, p0

    iget v1, v0, Ly8;->a:I

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Ly8;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    iget-object v4, v0, Ly8;->c:LE8;

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Llm;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v5, v3, Llm;->a:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v6

    iget-object v7, v4, LE8;->o:Ljava/util/ArrayList;

    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-virtual {v6, v7}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v7

    iget-wide v8, v4, LSl;->c:J

    invoke-virtual {v7, v8, v9}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v7

    new-instance v8, Lz8;

    invoke-direct {v8, v4, v3, v5, v6}, Lz8;-><init>(LE8;Llm;Landroid/view/View;Landroid/view/ViewPropertyAnimator;)V

    invoke-virtual {v7, v8}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/ViewPropertyAnimator;->start()V

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v2, v4, LE8;->l:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void

    :pswitch_0
    iget-object v1, v0, Ly8;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    iget-object v10, v0, Ly8;->c:LE8;

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LC8;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v4, v3, LC8;->a:Llm;

    const/4 v5, 0x0

    if-nez v4, :cond_1

    move-object v8, v5

    goto :goto_2

    :cond_1
    iget-object v4, v4, Llm;->a:Landroid/view/View;

    move-object v8, v4

    :goto_2
    iget-object v4, v3, LC8;->b:Llm;

    if-eqz v4, :cond_2

    iget-object v4, v4, Llm;->a:Landroid/view/View;

    move-object v11, v4

    goto :goto_3

    :cond_2
    move-object v11, v5

    :goto_3
    iget-object v12, v10, LE8;->r:Ljava/util/ArrayList;

    iget-wide v13, v10, LSl;->f:J

    const/4 v15, 0x0

    if-eqz v8, :cond_3

    invoke-virtual {v8}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    invoke-virtual {v4, v13, v14}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v7

    iget-object v4, v3, LC8;->a:Llm;

    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v4, v3, LC8;->e:I

    iget v5, v3, LC8;->c:I

    sub-int/2addr v4, v5

    int-to-float v4, v4

    invoke-virtual {v7, v4}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    iget v4, v3, LC8;->f:I

    iget v5, v3, LC8;->d:I

    sub-int/2addr v4, v5

    int-to-float v4, v4

    invoke-virtual {v7, v4}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    invoke-virtual {v7, v15}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v9

    new-instance v6, LB8;

    const/16 v16, 0x0

    move-object v4, v6

    move-object v5, v10

    move-object v15, v6

    move-object v6, v3

    move-object/from16 v17, v2

    move-object v2, v9

    move/from16 v9, v16

    invoke-direct/range {v4 .. v9}, LB8;-><init>(LE8;LC8;Landroid/view/ViewPropertyAnimator;Landroid/view/View;I)V

    invoke-virtual {v2, v15}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->start()V

    goto :goto_4

    :cond_3
    move-object/from16 v17, v2

    :goto_4
    if-eqz v11, :cond_4

    invoke-virtual {v11}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v7

    iget-object v2, v3, LC8;->b:Llm;

    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v2, 0x0

    invoke-virtual {v7, v2}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2, v13, v14}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-virtual {v2, v4}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    new-instance v12, LB8;

    const/4 v9, 0x1

    move-object v4, v12

    move-object v5, v10

    move-object v6, v3

    move-object v8, v11

    invoke-direct/range {v4 .. v9}, LB8;-><init>(LE8;LC8;Landroid/view/ViewPropertyAnimator;Landroid/view/View;I)V

    invoke-virtual {v2, v12}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewPropertyAnimator;->start()V

    :cond_4
    move-object/from16 v2, v17

    goto/16 :goto_1

    :cond_5
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v2, v10, LE8;->n:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void

    :pswitch_1
    iget-object v1, v0, Ly8;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    iget-object v5, v0, Ly8;->c:LE8;

    if-eqz v3, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LD8;

    iget-object v6, v3, LD8;->a:Llm;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v8, v6, Llm;->a:Landroid/view/View;

    iget v4, v3, LD8;->d:I

    iget v7, v3, LD8;->b:I

    sub-int v7, v4, v7

    iget v4, v3, LD8;->e:I

    iget v3, v3, LD8;->c:I

    sub-int v9, v4, v3

    const/4 v3, 0x0

    if-eqz v7, :cond_6

    invoke-virtual {v8}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    :cond_6
    if-eqz v9, :cond_7

    invoke-virtual {v8}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    :cond_7
    invoke-virtual {v8}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v10

    iget-object v3, v5, LE8;->p:Ljava/util/ArrayList;

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-wide v3, v5, LSl;->e:J

    invoke-virtual {v10, v3, v4}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    new-instance v11, LA8;

    move-object v4, v11

    invoke-direct/range {v4 .. v10}, LA8;-><init>(LE8;Llm;ILandroid/view/View;ILandroid/view/ViewPropertyAnimator;)V

    invoke-virtual {v3, v11}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/ViewPropertyAnimator;->start()V

    goto :goto_5

    :cond_8
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v2, v5, LE8;->m:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
