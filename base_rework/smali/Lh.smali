.class public final LLh;
.super LQ0;
.source "SourceFile"


# instance fields
.field public final c:Lgi;

.field public final d:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const v2, 0x7f0402fe

    invoke-static {v1, v2}, LTf;->R(Landroid/content/Context;I)Landroid/util/TypedValue;

    move-result-object v3

    const/4 v4, 0x0

    if-nez v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    iget v3, v3, Landroid/util/TypedValue;->data:I

    :goto_0
    const/4 v5, 0x0

    const v6, 0x7f04002e

    const v7, 0x7f140152

    invoke-static {v1, v5, v6, v7}, LTd;->Q(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    move-result-object v8

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    new-instance v9, LJ7;

    invoke-direct {v9, v8, v3}, LJ7;-><init>(Landroid/content/Context;I)V

    move-object v8, v9

    :goto_1
    invoke-static {v1, v2}, LTf;->R(Landroid/content/Context;I)Landroid/util/TypedValue;

    move-result-object v1

    if-nez v1, :cond_2

    move v1, v4

    goto :goto_2

    :cond_2
    iget v1, v1, Landroid/util/TypedValue;->data:I

    :goto_2
    invoke-direct {v0, v8, v1}, LQ0;-><init>(Landroid/content/Context;I)V

    iget-object v1, v0, LQ0;->b:Ljava/lang/Object;

    check-cast v1, LM0;

    iget-object v1, v1, LM0;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    sget-object v3, Lul;->j:[I

    new-array v13, v4, [I

    const/4 v14, 0x0

    const v15, 0x7f04002e

    const v12, 0x7f140152

    invoke-static {v1, v14, v15, v12}, Lmk;->b(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    move-object v8, v1

    move-object v9, v14

    move-object v10, v3

    move v11, v15

    move/from16 p1, v12

    invoke-static/range {v8 .. v13}, Lmk;->c(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)V

    move/from16 v8, p1

    invoke-virtual {v1, v14, v3, v15, v8}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v8

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    const v10, 0x7f070260

    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v9

    const/4 v10, 0x2

    invoke-virtual {v8, v10, v9}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v9

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    const v11, 0x7f070261

    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v10

    const/4 v11, 0x3

    invoke-virtual {v8, v11, v10}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v10

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v11

    const v12, 0x7f07025f

    invoke-virtual {v11, v12}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v11

    const/4 v12, 0x1

    invoke-virtual {v8, v12, v11}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v11

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v13

    const v14, 0x7f07025e

    invoke-virtual {v13, v14}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v13

    invoke-virtual {v8, v4, v13}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    invoke-virtual {v8}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Configuration;->getLayoutDirection()I

    move-result v8

    if-ne v8, v12, :cond_3

    move/from16 v16, v11

    move v11, v9

    move/from16 v9, v16

    :cond_3
    new-instance v8, Landroid/graphics/Rect;

    invoke-direct {v8, v9, v10, v11, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v8, v0, LLh;->d:Landroid/graphics/Rect;

    const-class v4, LLh;

    invoke-virtual {v4}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v4

    const v8, 0x7f04012d

    invoke-static {v8, v1, v4}, LTf;->T(ILandroid/content/Context;Ljava/lang/String;)Landroid/util/TypedValue;

    move-result-object v4

    iget v8, v4, Landroid/util/TypedValue;->resourceId:I

    if-eqz v8, :cond_4

    invoke-static {v1, v8}, LI7;->a(Landroid/content/Context;I)I

    move-result v4

    goto :goto_3

    :cond_4
    iget v4, v4, Landroid/util/TypedValue;->data:I

    :goto_3
    invoke-virtual {v1, v5, v3, v6, v7}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v3

    const/4 v8, 0x4

    invoke-virtual {v3, v8, v4}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v4

    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    new-instance v3, Lgi;

    invoke-direct {v3, v1, v5, v6, v7}, Lgi;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    invoke-virtual {v3, v1}, Lgi;->j(Landroid/content/Context;)V

    invoke-static {v4}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v3, v1}, Lgi;->l(Landroid/content/res/ColorStateList;)V

    new-instance v1, Landroid/util/TypedValue;

    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    const v4, 0x1010571

    invoke-virtual {v2, v4, v1, v12}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget-object v2, v0, LQ0;->b:Ljava/lang/Object;

    check-cast v2, LM0;

    iget-object v2, v2, LM0;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F

    move-result v2

    iget v1, v1, Landroid/util/TypedValue;->type:I

    const/4 v4, 0x5

    if-ne v1, v4, :cond_5

    const/4 v1, 0x0

    cmpl-float v1, v2, v1

    if-ltz v1, :cond_5

    iget-object v1, v3, Lgi;->a:Lfi;

    iget-object v1, v1, Lfi;->a:Lpo;

    invoke-virtual {v1}, Lpo;->e()Loo;

    move-result-object v1

    new-instance v4, Li;

    invoke-direct {v4, v2}, Li;-><init>(F)V

    iput-object v4, v1, Loo;->e:LR7;

    new-instance v4, Li;

    invoke-direct {v4, v2}, Li;-><init>(F)V

    iput-object v4, v1, Loo;->f:LR7;

    new-instance v4, Li;

    invoke-direct {v4, v2}, Li;-><init>(F)V

    iput-object v4, v1, Loo;->g:LR7;

    new-instance v4, Li;

    invoke-direct {v4, v2}, Li;-><init>(F)V

    iput-object v4, v1, Loo;->h:LR7;

    invoke-virtual {v1}, Loo;->a()Lpo;

    move-result-object v1

    invoke-virtual {v3, v1}, Lgi;->setShapeAppearanceModel(Lpo;)V

    :cond_5
    iput-object v3, v0, LLh;->c:Lgi;

    return-void
.end method


# virtual methods
.method public final b()LR0;
    .locals 11

    invoke-super {p0}, LQ0;->b()LR0;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    iget-object v4, p0, LLh;->c:Lgi;

    instance-of v3, v4, Lgi;

    if-eqz v3, :cond_0

    sget-object v3, LGs;->a:Ljava/util/WeakHashMap;

    invoke-static {v2}, Lvs;->i(Landroid/view/View;)F

    move-result v3

    invoke-virtual {v4, v3}, Lgi;->k(F)V

    :cond_0
    new-instance v9, Landroid/graphics/drawable/InsetDrawable;

    iget-object v10, p0, LLh;->d:Landroid/graphics/Rect;

    iget v5, v10, Landroid/graphics/Rect;->left:I

    iget v6, v10, Landroid/graphics/Rect;->top:I

    iget v7, v10, Landroid/graphics/Rect;->right:I

    iget v8, v10, Landroid/graphics/Rect;->bottom:I

    move-object v3, v9

    invoke-direct/range {v3 .. v8}, Landroid/graphics/drawable/InsetDrawable;-><init>(Landroid/graphics/drawable/Drawable;IIII)V

    invoke-virtual {v1, v9}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    new-instance v1, LFf;

    invoke-direct {v1, v0, v10}, LFf;-><init>(Landroid/app/Dialog;Landroid/graphics/Rect;)V

    invoke-virtual {v2, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-object v0
.end method

.method public final d(ILandroid/content/DialogInterface$OnClickListener;)LQ0;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final e(ILandroid/content/DialogInterface$OnClickListener;)LQ0;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final f(I)LQ0;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public final h()V
    .locals 3

    iget-object v0, p0, LQ0;->b:Ljava/lang/Object;

    check-cast v0, LM0;

    iget-object v1, v0, LM0;->a:Landroid/content/Context;

    const v2, 0x7f1301dc

    invoke-virtual {v1, v2}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    iput-object v1, v0, LM0;->f:Ljava/lang/CharSequence;

    return-void
.end method

.method public final i(ILandroid/content/DialogInterface$OnClickListener;)V
    .locals 0

    invoke-super {p0, p1, p2}, LQ0;->d(ILandroid/content/DialogInterface$OnClickListener;)LQ0;

    return-void
.end method

.method public final j(Landroid/content/DialogInterface$OnClickListener;)V
    .locals 1

    const v0, 0x7f1301cd

    invoke-super {p0, v0, p1}, LQ0;->e(ILandroid/content/DialogInterface$OnClickListener;)LQ0;

    return-void
.end method

.method public final k(I)V
    .locals 0

    invoke-super {p0, p1}, LQ0;->f(I)LQ0;

    return-void
.end method
