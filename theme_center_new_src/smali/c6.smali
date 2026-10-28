.class public final synthetic Lc6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lc6;->a:I

    iput-object p1, p0, Lc6;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 16

    move-object/from16 v1, p0

    const-string v2, "digits"

    const-string v3, "appname"

    const-string v4, "beta"

    const-string v5, "token"

    const-string v6, "vin"

    const-string v7, "authcode"

    const-string v8, "password"

    const/4 v14, 0x7

    const/16 v15, 0x9

    const v10, 0x7f130194

    const/4 v0, 0x0

    const/4 v11, 0x2

    iget-object v9, v1, Lc6;->b:Ljava/lang/Object;

    const/4 v13, 0x1

    iget v12, v1, Lc6;->a:I

    packed-switch v12, :pswitch_data_0

    check-cast v9, LWn;

    iget-boolean v0, v9, LSn;->f:Z

    if-eqz v0, :cond_1

    iget-object v0, v9, LWn;->g:Lle;

    iget-boolean v2, v0, Lle;->e:Z

    xor-int/2addr v2, v13

    iput-boolean v2, v0, Lle;->e:Z

    if-eqz v2, :cond_0

    const/high16 v9, 0x3f800000    # 1.0f

    goto :goto_0

    :cond_0
    const/4 v9, 0x0

    :goto_0
    iget v2, v0, Lle;->f:F

    iput v2, v0, Lle;->j:F

    iput v9, v0, Lle;->k:F

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iput-wide v2, v0, Lle;->i:J

    iput-boolean v13, v0, Lle;->h:Z

    iget-object v2, v0, Lle;->l:Lr0;

    invoke-virtual {v0, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    invoke-virtual {v0, v2}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    iget-object v2, v0, Lle;->g:Lke;

    if-eqz v2, :cond_1

    new-instance v2, Lt5;

    invoke-direct {v2, v0, v15}, Lt5;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void

    :pswitch_0
    check-cast v9, LRn;

    iget-boolean v2, v9, LSn;->f:Z

    if-eqz v2, :cond_5

    iget-object v2, v9, LRn;->i:[Ljava/lang/CharSequence;

    if-eqz v2, :cond_5

    iget-object v2, v9, LRn;->j:[Ljava/lang/CharSequence;

    if-nez v2, :cond_2

    goto :goto_3

    :cond_2
    array-length v3, v2

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    :goto_1
    array-length v5, v2

    if-ge v4, v5, :cond_3

    aget-object v5, v2, v4

    invoke-interface {v5}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    add-int/2addr v4, v13

    goto :goto_1

    :cond_3
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    iget-object v3, v9, LRn;->k:Ljava/lang/String;

    invoke-interface {v2, v3}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v2

    new-instance v3, LQ0;

    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4}, LQ0;-><init>(Landroid/content/Context;)V

    iget-object v4, v9, LSn;->b:Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v4

    iget-object v5, v3, LQ0;->b:Ljava/lang/Object;

    check-cast v5, LM0;

    iput-object v4, v5, LM0;->d:Ljava/lang/CharSequence;

    iget-object v4, v9, LRn;->i:[Ljava/lang/CharSequence;

    array-length v6, v4

    new-array v6, v6, [Ljava/lang/String;

    const/4 v12, 0x0

    :goto_2
    array-length v7, v4

    if-ge v12, v7, :cond_4

    aget-object v7, v4, v12

    invoke-interface {v7}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v12

    add-int/2addr v12, v13

    goto :goto_2

    :cond_4
    new-instance v4, LM3;

    invoke-direct {v4, v9, v13}, LM3;-><init>(Ljava/lang/Object;I)V

    iput-object v6, v5, LM0;->o:[Ljava/lang/CharSequence;

    iput-object v4, v5, LM0;->q:Landroid/content/DialogInterface$OnClickListener;

    iput v2, v5, LM0;->t:I

    iput-boolean v13, v5, LM0;->s:Z

    invoke-virtual {v3, v10, v0}, LQ0;->d(ILandroid/content/DialogInterface$OnClickListener;)LQ0;

    invoke-virtual {v3}, LQ0;->g()V

    :cond_5
    :goto_3
    return-void

    :pswitch_1
    check-cast v9, LPn;

    iget-boolean v2, v9, LSn;->f:Z

    if-eqz v2, :cond_9

    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    instance-of v3, v2, Lkf;

    if-eqz v3, :cond_8

    new-instance v0, LMn;

    invoke-direct {v0}, LMn;-><init>()V

    iget-object v3, v9, LSn;->b:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v3

    iget-object v4, v9, LPn;->i:Ljava/lang/String;

    iget v5, v9, LPn;->j:I

    iget-object v6, v9, LPn;->k:Ljava/lang/CharSequence;

    new-instance v7, Ld4;

    invoke-direct {v7, v9, v14}, Ld4;-><init>(Ljava/lang/Object;I)V

    const-string v8, ""

    if-nez v3, :cond_6

    move-object v3, v8

    :cond_6
    iput-object v3, v0, LMn;->T:Ljava/lang/CharSequence;

    if-nez v4, :cond_7

    move-object v4, v8

    :cond_7
    iput-object v4, v0, LMn;->U:Ljava/lang/String;

    iput v5, v0, LMn;->V:I

    iput-object v6, v0, LMn;->W:Ljava/lang/CharSequence;

    iput-object v7, v0, LMn;->X:Ld4;

    check-cast v2, Lkf;

    check-cast v2, Lru/zinovin/tankspeedometer/MainActivity;

    invoke-virtual {v2, v0}, Lru/zinovin/tankspeedometer/MainActivity;->J(Lzc;)V

    goto :goto_4

    :cond_8
    new-instance v2, Landroid/widget/EditText;

    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    iget v3, v9, LPn;->j:I

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setInputType(I)V

    iget-object v3, v9, LPn;->i:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v3, v9, LPn;->k:Ljava/lang/CharSequence;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    invoke-virtual {v2, v13}, Landroid/widget/TextView;->setSelectAllOnFocus(Z)V

    invoke-virtual {v9}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    const/high16 v4, 0x41a00000    # 20.0f

    mul-float/2addr v3, v4

    float-to-int v3, v3

    new-instance v4, Landroid/widget/FrameLayout;

    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v4, v5}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    div-int/lit8 v5, v3, 0x2

    const/4 v6, 0x0

    invoke-virtual {v4, v3, v5, v3, v6}, Landroid/view/View;->setPadding(IIII)V

    invoke-virtual {v4, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v3, LQ0;

    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v3, v5}, LQ0;-><init>(Landroid/content/Context;)V

    iget-object v5, v9, LSn;->b:Landroid/widget/TextView;

    invoke-virtual {v5}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v5

    iget-object v6, v3, LQ0;->b:Ljava/lang/Object;

    check-cast v6, LM0;

    iput-object v5, v6, LM0;->d:Ljava/lang/CharSequence;

    iput-object v4, v6, LM0;->r:Landroid/view/View;

    new-instance v4, LNn;

    invoke-direct {v4, v9, v2}, LNn;-><init>(LPn;Landroid/widget/EditText;)V

    const v2, 0x7f1301c4

    invoke-virtual {v3, v2, v4}, LQ0;->e(ILandroid/content/DialogInterface$OnClickListener;)LQ0;

    invoke-virtual {v3, v10, v0}, LQ0;->d(ILandroid/content/DialogInterface$OnClickListener;)LQ0;

    invoke-virtual {v3}, LQ0;->g()V

    :cond_9
    :goto_4
    return-void

    :pswitch_2
    check-cast v9, LKn;

    iget-boolean v2, v9, LSn;->f:Z

    if-eqz v2, :cond_19

    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    new-instance v3, Lu6;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput-boolean v13, v3, Lu6;->e:Z

    iput-boolean v13, v3, Lu6;->f:Z

    const/4 v4, 0x0

    iput-boolean v4, v3, Lu6;->g:Z

    filled-new-array {v0, v0, v0, v0, v0}, [Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f07006d

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v5

    const/high16 v6, 0x3f000000    # 0.5f

    add-float/2addr v5, v6

    float-to-int v5, v5

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f070066

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v7

    add-float/2addr v7, v6

    float-to-int v7, v7

    new-instance v8, LQ0;

    const/4 v12, 0x0

    invoke-direct {v8, v2, v12}, LQ0;-><init>(Landroid/content/Context;I)V

    new-instance v14, Landroid/widget/LinearLayout;

    invoke-direct {v14, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v14, v13}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-virtual {v14, v13}, Landroid/widget/LinearLayout;->setGravity(I)V

    invoke-virtual {v14, v5, v7, v5, v12}, Landroid/view/View;->setPadding(IIII)V

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v7, -0x1

    invoke-direct {v5, v7, v12}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/high16 v15, 0x3f800000    # 1.0f

    iput v15, v5, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    new-instance v6, Lw6;

    invoke-direct {v6, v2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/16 v10, 0x8

    iput v10, v6, Lw6;->f:I

    iput v15, v6, Lw6;->g:F

    iput v15, v6, Lw6;->h:F

    filled-new-array {v0, v0, v0, v0, v0}, [Ljava/lang/Integer;

    move-result-object v15

    iput-object v15, v6, Lw6;->i:[Ljava/lang/Integer;

    iput v12, v6, Lw6;->j:I

    invoke-static {}, LBr;->I()LVi;

    move-result-object v15

    iget-object v15, v15, LVi;->a:Ljava/lang/Object;

    check-cast v15, Landroid/graphics/Paint;

    invoke-virtual {v15, v12}, Landroid/graphics/Paint;->setColor(I)V

    iput-object v15, v6, Lw6;->m:Landroid/graphics/Paint;

    invoke-static {}, LBr;->I()LVi;

    move-result-object v15

    iget-object v15, v15, LVi;->a:Ljava/lang/Object;

    check-cast v15, Landroid/graphics/Paint;

    invoke-virtual {v15, v12}, Landroid/graphics/Paint;->setColor(I)V

    iput-object v15, v6, Lw6;->n:Landroid/graphics/Paint;

    invoke-static {}, LBr;->I()LVi;

    move-result-object v12

    iget-object v12, v12, LVi;->a:Ljava/lang/Object;

    check-cast v12, Landroid/graphics/Paint;

    iput-object v12, v6, Lw6;->o:Landroid/graphics/Paint;

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    iput-object v12, v6, Lw6;->q:Ljava/util/ArrayList;

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    iput-object v12, v6, Lw6;->r:Ljava/util/ArrayList;

    new-instance v12, Lv6;

    invoke-direct {v12, v6}, Lv6;-><init>(Lw6;)V

    iput-object v12, v6, Lw6;->v:Lv6;

    sget-object v12, Ltl;->b:[I

    invoke-virtual {v2, v0, v12}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    const/16 v12, 0xa

    const/4 v15, 0x3

    invoke-virtual {v2, v15, v12}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v15

    iput v15, v6, Lw6;->f:I

    const/4 v15, 0x4

    invoke-virtual {v2, v15, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v15

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    iput-object v15, v6, Lw6;->k:Ljava/lang/Integer;

    invoke-virtual {v2, v12, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    iput-object v12, v6, Lw6;->l:Ljava/lang/Integer;

    const/16 v12, 0xc

    const/4 v15, 0x0

    invoke-virtual {v2, v12, v15}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v12

    if-eqz v12, :cond_a

    if-eq v12, v13, :cond_b

    :cond_a
    move v12, v13

    goto :goto_5

    :cond_b
    move v12, v11

    :goto_5
    invoke-static {v12}, Lmk;->n(I)Ld;

    move-result-object v12

    invoke-virtual {v2, v13, v15}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v10

    iput v10, v6, Lw6;->x:I

    const/4 v10, 0x6

    invoke-virtual {v2, v10, v15}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v7

    iput v7, v6, Lw6;->y:I

    invoke-virtual {v6, v12}, Lw6;->setRenderer(LA6;)V

    iget v7, v6, Lw6;->f:I

    invoke-virtual {v6, v7}, Lw6;->setDensity(I)V

    iget-object v7, v6, Lw6;->k:Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-virtual {v6, v7, v13}, Lw6;->c(IZ)V

    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    iput-object v6, v3, Lu6;->a:Lw6;

    invoke-virtual {v14, v6, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v2, v8, LQ0;->b:Ljava/lang/Object;

    check-cast v2, LM0;

    iput-object v14, v2, LM0;->r:Landroid/view/View;

    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    const v7, 0x7f1301d1

    invoke-virtual {v5, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v2, LM0;->d:Ljava/lang/CharSequence;

    iget v5, v9, LKn;->j:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v7, 0x0

    aput-object v5, v4, v7

    invoke-static {v11}, Lmk;->n(I)Ld;

    move-result-object v5

    invoke-virtual {v6, v5}, Lw6;->setRenderer(LA6;)V

    const/4 v5, 0x6

    invoke-virtual {v6, v5}, Lw6;->setDensity(I)V

    iput-boolean v13, v3, Lu6;->g:Z

    iput-boolean v13, v3, Lu6;->e:Z

    iput-boolean v7, v3, Lu6;->f:Z

    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    const v10, 0x7f1301c4

    invoke-virtual {v7, v10}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    new-instance v10, Ld4;

    invoke-direct {v10, v9, v5}, Ld4;-><init>(Ljava/lang/Object;I)V

    new-instance v5, Lt6;

    invoke-direct {v5, v3, v10}, Lt6;-><init>(Lu6;Ld4;)V

    iput-object v7, v2, LM0;->g:Ljava/lang/CharSequence;

    iput-object v5, v2, LM0;->h:Landroid/content/DialogInterface$OnClickListener;

    invoke-virtual {v9}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    const v7, 0x7f130194

    invoke-virtual {v5, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    iput-object v5, v2, LM0;->i:Ljava/lang/CharSequence;

    iput-object v0, v2, LM0;->j:Landroid/content/DialogInterface$OnClickListener;

    const/4 v5, 0x0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v5, 0x0

    :goto_6
    const/4 v9, 0x5

    if-ge v5, v9, :cond_d

    aget-object v10, v4, v5

    if-nez v10, :cond_c

    goto :goto_7

    :cond_c
    add-int/2addr v5, v13

    div-int/lit8 v7, v5, 0x2

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    goto :goto_6

    :cond_d
    :goto_7
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iput-object v4, v6, Lw6;->i:[Ljava/lang/Integer;

    iput v5, v6, Lw6;->j:I

    aget-object v5, v4, v5

    if-nez v5, :cond_e

    const/4 v7, -0x1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    :cond_e
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {v6, v5, v13}, Lw6;->c(IZ)V

    invoke-virtual {v6, v13}, Lw6;->setShowBorder(Z)V

    iget-boolean v5, v3, Lu6;->e:Z

    iget-object v2, v2, LM0;->a:Landroid/content/Context;

    const v7, 0x7f07006c

    if-eqz v5, :cond_11

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    invoke-virtual {v10, v7}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v10

    const/high16 v12, 0x3f000000    # 0.5f

    add-float/2addr v10, v12

    float-to-int v10, v10

    const/4 v12, -0x1

    invoke-direct {v5, v12, v10}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    new-instance v10, LIg;

    invoke-direct {v10, v2}, Le;-><init>(Landroid/content/Context;)V

    invoke-static {}, LBr;->I()LVi;

    move-result-object v12

    iget-object v12, v12, LVi;->a:Ljava/lang/Object;

    check-cast v12, Landroid/graphics/Paint;

    iput-object v12, v10, LIg;->l:Landroid/graphics/Paint;

    invoke-static {}, LBr;->I()LVi;

    move-result-object v12

    iget-object v12, v12, LVi;->a:Ljava/lang/Object;

    check-cast v12, Landroid/graphics/Paint;

    iput-object v12, v10, LIg;->m:Landroid/graphics/Paint;

    invoke-static {}, LBr;->I()LVi;

    move-result-object v12

    iget-object v15, v12, LVi;->a:Ljava/lang/Object;

    check-cast v15, Landroid/graphics/Paint;

    const/4 v0, -0x1

    invoke-virtual {v15, v0}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v0, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    iget-object v12, v12, LVi;->a:Ljava/lang/Object;

    check-cast v12, Landroid/graphics/Paint;

    new-instance v7, Landroid/graphics/PorterDuffXfermode;

    invoke-direct {v7, v0}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v12, v7}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    iput-object v15, v10, LIg;->n:Landroid/graphics/Paint;

    iput-object v10, v3, Lu6;->b:LIg;

    invoke-virtual {v10, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, v3, Lu6;->b:LIg;

    invoke-virtual {v14, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v0, v3, Lu6;->b:LIg;

    invoke-virtual {v6, v0}, Lw6;->setLightnessSlider(LIg;)V

    iget-object v0, v3, Lu6;->b:LIg;

    const/4 v5, 0x0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v5, 0x0

    :goto_8
    if-ge v5, v9, :cond_10

    aget-object v10, v4, v5

    if-nez v10, :cond_f

    goto :goto_9

    :cond_f
    add-int/2addr v5, v13

    div-int/lit8 v7, v5, 0x2

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    goto :goto_8

    :cond_10
    :goto_9
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v5

    aget-object v5, v4, v5

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {v0, v5}, LIg;->setColor(I)V

    iget-object v0, v3, Lu6;->b:LIg;

    invoke-virtual {v0, v13}, Le;->setShowBorder(Z)V

    :cond_11
    iget-boolean v0, v3, Lu6;->f:Z

    if-eqz v0, :cond_14

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v7, 0x7f07006c

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v5

    const/high16 v7, 0x3f000000    # 0.5f

    add-float/2addr v5, v7

    float-to-int v5, v5

    const/4 v7, -0x1

    invoke-direct {v0, v7, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    new-instance v5, LT0;

    invoke-direct {v5, v2}, Le;-><init>(Landroid/content/Context;)V

    invoke-static {}, LBr;->I()LVi;

    move-result-object v7

    iget-object v7, v7, LVi;->a:Ljava/lang/Object;

    check-cast v7, Landroid/graphics/Paint;

    iput-object v7, v5, LT0;->l:Landroid/graphics/Paint;

    invoke-static {}, LBr;->I()LVi;

    move-result-object v7

    iget-object v7, v7, LVi;->a:Ljava/lang/Object;

    check-cast v7, Landroid/graphics/Paint;

    iput-object v7, v5, LT0;->m:Landroid/graphics/Paint;

    invoke-static {}, LBr;->I()LVi;

    move-result-object v7

    iget-object v7, v7, LVi;->a:Ljava/lang/Object;

    check-cast v7, Landroid/graphics/Paint;

    iput-object v7, v5, LT0;->n:Landroid/graphics/Paint;

    invoke-static {}, LBr;->I()LVi;

    move-result-object v7

    iget-object v10, v7, LVi;->a:Ljava/lang/Object;

    check-cast v10, Landroid/graphics/Paint;

    const/4 v12, -0x1

    invoke-virtual {v10, v12}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v12, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    iget-object v7, v7, LVi;->a:Ljava/lang/Object;

    check-cast v7, Landroid/graphics/Paint;

    new-instance v15, Landroid/graphics/PorterDuffXfermode;

    invoke-direct {v15, v12}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v7, v15}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    iput-object v10, v5, LT0;->o:Landroid/graphics/Paint;

    invoke-static {}, LBr;->I()LVi;

    move-result-object v7

    iget-object v7, v7, LVi;->a:Ljava/lang/Object;

    check-cast v7, Landroid/graphics/Paint;

    iput-object v7, v5, LT0;->p:Landroid/graphics/Paint;

    iput-object v5, v3, Lu6;->c:LT0;

    invoke-virtual {v5, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, v3, Lu6;->c:LT0;

    invoke-virtual {v14, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v0, v3, Lu6;->c:LT0;

    invoke-virtual {v6, v0}, Lw6;->setAlphaSlider(LT0;)V

    iget-object v0, v3, Lu6;->c:LT0;

    const/4 v5, 0x0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/4 v5, 0x0

    :goto_a
    if-ge v5, v9, :cond_13

    aget-object v10, v4, v5

    if-nez v10, :cond_12

    goto :goto_b

    :cond_12
    add-int/2addr v5, v13

    div-int/lit8 v7, v5, 0x2

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    goto :goto_a

    :cond_13
    :goto_b
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v5

    aget-object v5, v4, v5

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {v0, v5}, LT0;->setColor(I)V

    iget-object v0, v3, Lu6;->c:LT0;

    invoke-virtual {v0, v13}, Le;->setShowBorder(Z)V

    :cond_14
    iget-boolean v0, v3, Lu6;->g:Z

    if-eqz v0, :cond_18

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v5, -0x2

    invoke-direct {v0, v5, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const v5, 0x7f0e002f

    const/4 v7, 0x0

    invoke-static {v2, v5, v7}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/EditText;

    iput-object v2, v3, Lu6;->d:Landroid/widget/EditText;

    new-instance v5, Landroid/text/InputFilter$AllCaps;

    invoke-direct {v5}, Landroid/text/InputFilter$AllCaps;-><init>()V

    new-array v7, v13, [Landroid/text/InputFilter;

    const/4 v10, 0x0

    aput-object v5, v7, v10

    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    iget-object v2, v3, Lu6;->d:Landroid/widget/EditText;

    invoke-virtual {v2}, Landroid/widget/TextView;->setSingleLine()V

    iget-object v2, v3, Lu6;->d:Landroid/widget/EditText;

    const/16 v5, 0x8

    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    iget-boolean v2, v3, Lu6;->f:Z

    if-eqz v2, :cond_15

    const/16 v2, 0x9

    goto :goto_c

    :cond_15
    const/4 v2, 0x7

    :goto_c
    iget-object v5, v3, Lu6;->d:Landroid/widget/EditText;

    new-instance v7, Landroid/text/InputFilter$LengthFilter;

    invoke-direct {v7, v2}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    new-array v2, v13, [Landroid/text/InputFilter;

    const/4 v10, 0x0

    aput-object v7, v2, v10

    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    iget-object v2, v3, Lu6;->d:Landroid/widget/EditText;

    invoke-virtual {v14, v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, v3, Lu6;->d:Landroid/widget/EditText;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v12, 0x0

    :goto_d
    if-ge v12, v9, :cond_17

    aget-object v5, v4, v12

    if-nez v5, :cond_16

    goto :goto_e

    :cond_16
    add-int/2addr v12, v13

    div-int/lit8 v2, v12, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_d

    :cond_17
    :goto_e
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    aget-object v2, v4, v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-boolean v4, v3, Lu6;->f:Z

    invoke-static {v2, v4}, LTf;->C(IZ)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, v3, Lu6;->d:Landroid/widget/EditText;

    invoke-virtual {v6, v0}, Lw6;->setColorEdit(Landroid/widget/EditText;)V

    :cond_18
    invoke-virtual {v8}, LQ0;->b()LR0;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    :cond_19
    return-void

    :pswitch_3
    check-cast v9, LBk;

    iget-object v0, v9, LBk;->f:Landroid/widget/EditText;

    if-nez v0, :cond_1a

    goto :goto_10

    :cond_1a
    invoke-virtual {v0}, Landroid/widget/TextView;->getSelectionEnd()I

    move-result v0

    iget-object v2, v9, LBk;->f:Landroid/widget/EditText;

    if-eqz v2, :cond_1b

    invoke-virtual {v2}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    move-result-object v2

    instance-of v2, v2, Landroid/text/method/PasswordTransformationMethod;

    if-eqz v2, :cond_1b

    iget-object v2, v9, LBk;->f:Landroid/widget/EditText;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    goto :goto_f

    :cond_1b
    iget-object v2, v9, LBk;->f:Landroid/widget/EditText;

    invoke-static {}, Landroid/text/method/PasswordTransformationMethod;->getInstance()Landroid/text/method/PasswordTransformationMethod;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    :goto_f
    if-ltz v0, :cond_1c

    iget-object v2, v9, LBk;->f:Landroid/widget/EditText;

    invoke-virtual {v2, v0}, Landroid/widget/EditText;->setSelection(I)V

    :cond_1c
    invoke-virtual {v9}, Ldb;->q()V

    :goto_10
    return-void

    :pswitch_4
    check-cast v9, Ldi;

    invoke-virtual {v9}, Ldi;->Q()V

    const/4 v0, 0x0

    throw v0

    :pswitch_5
    check-cast v9, Lha;

    invoke-virtual {v9}, Lha;->u()V

    return-void

    :pswitch_6
    check-cast v9, LK9;

    iget-object v0, v9, LK9;->Z:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1d

    const v0, 0x7f1301c3

    invoke-virtual {v9, v0}, Lzc;->l(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, LK9;->R(Ljava/lang/String;)V

    goto/16 :goto_13

    :cond_1d
    new-instance v10, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v11, 0x0

    invoke-direct {v10, v11}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    new-instance v0, Ljava/lang/Thread;

    new-instance v11, Lw9;

    const/4 v12, 0x3

    invoke-direct {v11, v10, v12}, Lw9;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;I)V

    invoke-direct {v0, v11}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Thread;->join()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_11

    :catch_0
    move-exception v0

    move-object v11, v0

    const-string v0, "onClick()"

    invoke-virtual {v9, v11, v0}, LK9;->P(Ljava/lang/Exception;Ljava/lang/String;)V

    :goto_11
    invoke-virtual {v10}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_1e

    const v10, 0x7f1301c1

    invoke-virtual {v9, v10}, Lzc;->l(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, LK9;->R(Ljava/lang/String;)V

    goto/16 :goto_13

    :cond_1e
    iget-object v0, v9, LK9;->U:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-virtual {v0}, LW1;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1f

    const v10, 0x7f1301a9

    invoke-virtual {v9, v10}, Lzc;->l(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, LK9;->R(Ljava/lang/String;)V

    goto/16 :goto_13

    :cond_1f
    iget-object v0, v9, LK9;->T:Landroid/widget/Button;

    const/4 v10, 0x0

    invoke-virtual {v0, v10}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, v9, LK9;->U:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-virtual {v0}, LW1;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0}, LTf;->W(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v9, LK9;->V:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-virtual {v0}, LW1;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, LTf;->W(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v9, LK9;->X:Landroid/widget/TextView;

    const/4 v7, 0x0

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, v9, LK9;->W:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, v9, LK9;->Y:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    iget-object v7, v9, LK9;->Z:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v7}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    new-instance v10, Lorg/json/JSONObject;

    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    :try_start_1
    iget-object v11, v9, LK9;->b0:Ljava/lang/String;

    invoke-virtual {v10, v6, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v6, v9, LK9;->U:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-virtual {v6}, LW1;->getText()Landroid/text/Editable;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v10, v8, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v6, v9, LK9;->V:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-virtual {v6}, LW1;->getText()Landroid/text/Editable;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v10, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v10, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    invoke-virtual {v10, v3, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v0, v9, LK9;->c0:Landroid/content/Context;

    invoke-static {v0}, Lru/zinovin/jni/JniUtils;->getData(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "lang"

    invoke-virtual {v9}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    iget-object v2, v2, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v10, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_12

    :catch_1
    move-exception v0

    const-string v2, "downloadAndInstallApk()"

    invoke-virtual {v9, v0, v2}, LK9;->P(Ljava/lang/Exception;Ljava/lang/String;)V

    :goto_12
    new-instance v0, Ljava/lang/Thread;

    new-instance v2, LH9;

    invoke-direct {v2, v9, v10, v7, v13}, LH9;-><init>(Ljava/lang/Object;Lorg/json/JSONObject;Ljava/lang/String;I)V

    invoke-direct {v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    :goto_13
    return-void

    :pswitch_7
    check-cast v9, Lru/zinovin/tankspeedometer/DownloadActivity2;

    iget-object v0, v9, Lru/zinovin/tankspeedometer/DownloadActivity2;->F:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_20

    const v0, 0x7f1301c3

    invoke-virtual {v9, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lru/zinovin/tankspeedometer/DownloadActivity2;->G(Ljava/lang/String;)V

    goto/16 :goto_16

    :cond_20
    new-instance v10, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v12, 0x0

    invoke-direct {v10, v12}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    new-instance v0, Ljava/lang/Thread;

    new-instance v12, Lw9;

    invoke-direct {v12, v10, v11}, Lw9;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;I)V

    invoke-direct {v0, v12}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Thread;->join()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_14

    :catch_2
    move-exception v0

    move-object v11, v0

    const-string v0, "allowAction()"

    invoke-virtual {v9, v11, v0}, Lru/zinovin/tankspeedometer/DownloadActivity2;->F(Ljava/lang/Exception;Ljava/lang/String;)V

    :goto_14
    invoke-virtual {v10}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_21

    const v10, 0x7f1301c1

    invoke-virtual {v9, v10}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lru/zinovin/tankspeedometer/DownloadActivity2;->G(Ljava/lang/String;)V

    goto/16 :goto_16

    :cond_21
    iget-object v0, v9, Lru/zinovin/tankspeedometer/DownloadActivity2;->z:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-virtual {v0}, LW1;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_22

    const v10, 0x7f1301a9

    invoke-virtual {v9, v10}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Lru/zinovin/tankspeedometer/DownloadActivity2;->G(Ljava/lang/String;)V

    goto/16 :goto_16

    :cond_22
    iget-object v0, v9, Lru/zinovin/tankspeedometer/DownloadActivity2;->y:Landroid/widget/Button;

    const/4 v10, 0x0

    invoke-virtual {v0, v10}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, v9, Lru/zinovin/tankspeedometer/DownloadActivity2;->z:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-virtual {v0}, LW1;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v8, v0}, LTf;->W(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v9, Lru/zinovin/tankspeedometer/DownloadActivity2;->A:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-virtual {v0}, LW1;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, LTf;->W(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v9, Lru/zinovin/tankspeedometer/DownloadActivity2;->C:Landroid/widget/TextView;

    const/4 v7, 0x0

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, v9, Lru/zinovin/tankspeedometer/DownloadActivity2;->B:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, v9, Lru/zinovin/tankspeedometer/DownloadActivity2;->D:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    iget-object v7, v9, Lru/zinovin/tankspeedometer/DownloadActivity2;->F:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v7}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v7

    new-instance v10, Lorg/json/JSONObject;

    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    :try_start_3
    const-string v11, "persist.gwm.vehicle.vin"

    invoke-static {v9, v11}, LTf;->F(Landroid/app/Activity;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v6, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v6, v9, Lru/zinovin/tankspeedometer/DownloadActivity2;->z:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-virtual {v6}, LW1;->getText()Landroid/text/Editable;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v10, v8, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v6, v9, Lru/zinovin/tankspeedometer/DownloadActivity2;->A:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-virtual {v6}, LW1;->getText()Landroid/text/Editable;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v10, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v10, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    invoke-virtual {v10, v3, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {v9}, Lru/zinovin/jni/JniUtils;->getData(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "lang"

    invoke-virtual {v9}, Lq1;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    iget-object v2, v2, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v10, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_15

    :catch_3
    move-exception v0

    const-string v2, "downloadAndInstallApk()"

    invoke-virtual {v9, v0, v2}, Lru/zinovin/tankspeedometer/DownloadActivity2;->F(Ljava/lang/Exception;Ljava/lang/String;)V

    :goto_15
    new-instance v0, Ljava/lang/Thread;

    new-instance v2, LH9;

    const/4 v3, 0x0

    invoke-direct {v2, v9, v10, v7, v3}, LH9;-><init>(Ljava/lang/Object;Lorg/json/JSONObject;Ljava/lang/String;I)V

    invoke-direct {v0, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    :goto_16
    return-void

    :pswitch_8
    check-cast v9, Lg6;

    iget-object v0, v9, Lg6;->i:Landroid/widget/EditText;

    if-nez v0, :cond_23

    goto :goto_17

    :cond_23
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    if-eqz v0, :cond_24

    invoke-interface {v0}, Landroid/text/Editable;->clear()V

    :cond_24
    invoke-virtual {v9}, Ldb;->q()V

    :goto_17
    return-void

    :pswitch_data_0
    .packed-switch 0x0
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
