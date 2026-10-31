.class public final Lcb;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field public final a:Lcom/google/android/material/textfield/TextInputLayout;

.field public final b:Landroid/widget/FrameLayout;

.field public final c:Lcom/google/android/material/internal/CheckableImageButton;

.field public d:Landroid/content/res/ColorStateList;

.field public e:Landroid/graphics/PorterDuff$Mode;

.field public f:Landroid/view/View$OnLongClickListener;

.field public final g:Lcom/google/android/material/internal/CheckableImageButton;

.field public final h:Lbb;

.field public i:I

.field public final j:Ljava/util/LinkedHashSet;

.field public k:Landroid/content/res/ColorStateList;

.field public l:Landroid/graphics/PorterDuff$Mode;

.field public m:I

.field public n:Landroid/widget/ImageView$ScaleType;

.field public o:Landroid/view/View$OnLongClickListener;

.field public p:Ljava/lang/CharSequence;

.field public final q:LC2;

.field public r:Z

.field public s:Landroid/widget/EditText;

.field public final t:Landroid/view/accessibility/AccessibilityManager;

.field public u:Ld4;

.field public final v:LZa;


# direct methods
.method public constructor <init>(Lcom/google/android/material/textfield/TextInputLayout;LK2;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const/4 v3, 0x1

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v0, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v4, 0x0

    iput v4, v0, Lcb;->i:I

    new-instance v5, Ljava/util/LinkedHashSet;

    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v5, v0, Lcb;->j:Ljava/util/LinkedHashSet;

    new-instance v5, LZa;

    invoke-direct {v5, v0}, LZa;-><init>(Lcb;)V

    iput-object v5, v0, Lcb;->v:LZa;

    new-instance v5, Lab;

    invoke-direct {v5, v0}, Lab;-><init>(Lcb;)V

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    const-string v7, "accessibility"

    invoke-virtual {v6, v7}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/accessibility/AccessibilityManager;

    iput-object v6, v0, Lcb;->t:Landroid/view/accessibility/AccessibilityManager;

    iput-object v1, v0, Lcb;->a:Lcom/google/android/material/textfield/TextInputLayout;

    const/16 v6, 0x8

    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v0, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v7, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v8, -0x2

    const/4 v9, -0x1

    const v10, 0x800005

    invoke-direct {v7, v8, v9, v10}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    invoke-virtual {v0, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v7, Landroid/widget/FrameLayout;

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v10

    invoke-direct {v7, v10}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v7, v0, Lcb;->b:Landroid/widget/FrameLayout;

    invoke-virtual {v7, v6}, Landroid/view/View;->setVisibility(I)V

    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v10, v8, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v7, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v10

    invoke-static {v10}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v10

    const v11, 0x7f0b028d

    invoke-virtual {v0, v0, v10, v11}, Lcb;->a(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;I)Lcom/google/android/material/internal/CheckableImageButton;

    move-result-object v11

    iput-object v11, v0, Lcb;->c:Lcom/google/android/material/internal/CheckableImageButton;

    const v12, 0x7f0b028c

    invoke-virtual {v0, v7, v10, v12}, Lcb;->a(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;I)Lcom/google/android/material/internal/CheckableImageButton;

    move-result-object v10

    iput-object v10, v0, Lcb;->g:Lcom/google/android/material/internal/CheckableImageButton;

    new-instance v12, Lbb;

    invoke-direct {v12, v0, v2}, Lbb;-><init>(Lcb;LK2;)V

    iput-object v12, v0, Lcb;->h:Lbb;

    new-instance v12, LC2;

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v13

    const/4 v14, 0x0

    invoke-direct {v12, v13, v14}, LC2;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput-object v12, v0, Lcb;->q:LC2;

    iget-object v13, v2, LK2;->b:Ljava/lang/Object;

    check-cast v13, Landroid/content/res/TypedArray;

    const/16 v15, 0x26

    invoke-virtual {v13, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v16

    if-eqz v16, :cond_0

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-static {v8, v2, v15}, LBr;->t(Landroid/content/Context;LK2;I)Landroid/content/res/ColorStateList;

    move-result-object v8

    iput-object v8, v0, Lcb;->d:Landroid/content/res/ColorStateList;

    :cond_0
    const/16 v8, 0x27

    invoke-virtual {v13, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v15

    if-eqz v15, :cond_1

    invoke-virtual {v13, v8, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v8

    invoke-static {v8, v14}, LTf;->P(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v8

    iput-object v8, v0, Lcb;->e:Landroid/graphics/PorterDuff$Mode;

    :cond_1
    const/16 v8, 0x25

    invoke-virtual {v13, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v15

    if-eqz v15, :cond_2

    invoke-virtual {v2, v8}, LK2;->q(I)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    invoke-virtual {v0, v8}, Lcb;->i(Landroid/graphics/drawable/Drawable;)V

    :cond_2
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    const v15, 0x7f13005d

    invoke-virtual {v8, v15}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v8

    invoke-virtual {v11, v8}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    sget-object v8, LGs;->a:Ljava/util/WeakHashMap;

    const/4 v8, 0x2

    invoke-virtual {v11, v8}, Landroid/view/View;->setImportantForAccessibility(I)V

    invoke-virtual {v11, v4}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {v11, v4}, Lcom/google/android/material/internal/CheckableImageButton;->setPressable(Z)V

    invoke-virtual {v11, v4}, Landroid/view/View;->setFocusable(Z)V

    const/16 v8, 0x35

    invoke-virtual {v13, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v15

    if-nez v15, :cond_4

    const/16 v15, 0x20

    invoke-virtual {v13, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v17

    if-eqz v17, :cond_3

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6, v2, v15}, LBr;->t(Landroid/content/Context;LK2;I)Landroid/content/res/ColorStateList;

    move-result-object v6

    iput-object v6, v0, Lcb;->k:Landroid/content/res/ColorStateList;

    :cond_3
    const/16 v6, 0x21

    invoke-virtual {v13, v6}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v15

    if-eqz v15, :cond_4

    invoke-virtual {v13, v6, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    invoke-static {v6, v14}, LTf;->P(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v6

    iput-object v6, v0, Lcb;->l:Landroid/graphics/PorterDuff$Mode;

    :cond_4
    const/16 v6, 0x1e

    invoke-virtual {v13, v6}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v15

    if-eqz v15, :cond_6

    invoke-virtual {v13, v6, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    invoke-virtual {v0, v6}, Lcb;->g(I)V

    const/16 v6, 0x1b

    invoke-virtual {v13, v6}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-virtual {v13, v6}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v6

    invoke-virtual {v10}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v8

    if-eq v8, v6, :cond_5

    invoke-virtual {v10, v6}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_5
    const/16 v6, 0x1a

    invoke-virtual {v13, v6, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    invoke-virtual {v10, v6}, Lcom/google/android/material/internal/CheckableImageButton;->setCheckable(Z)V

    goto :goto_0

    :cond_6
    invoke-virtual {v13, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v6

    if-eqz v6, :cond_9

    const/16 v6, 0x36

    invoke-virtual {v13, v6}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v15

    if-eqz v15, :cond_7

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v15

    invoke-static {v15, v2, v6}, LBr;->t(Landroid/content/Context;LK2;I)Landroid/content/res/ColorStateList;

    move-result-object v6

    iput-object v6, v0, Lcb;->k:Landroid/content/res/ColorStateList;

    :cond_7
    const/16 v6, 0x37

    invoke-virtual {v13, v6}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v15

    if-eqz v15, :cond_8

    invoke-virtual {v13, v6, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    invoke-static {v6, v14}, LTf;->P(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v6

    iput-object v6, v0, Lcb;->l:Landroid/graphics/PorterDuff$Mode;

    :cond_8
    invoke-virtual {v13, v8, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    invoke-virtual {v0, v6}, Lcb;->g(I)V

    const/16 v6, 0x33

    invoke-virtual {v13, v6}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v6

    invoke-virtual {v10}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v8

    if-eq v8, v6, :cond_9

    invoke-virtual {v10, v6}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_9
    :goto_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v8, 0x7f0702da

    invoke-virtual {v6, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v6

    const/16 v8, 0x1d

    invoke-virtual {v13, v8, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    if-ltz v6, :cond_f

    iget v8, v0, Lcb;->m:I

    if-eq v6, v8, :cond_a

    iput v6, v0, Lcb;->m:I

    invoke-virtual {v10, v6}, Landroid/view/View;->setMinimumWidth(I)V

    invoke-virtual {v10, v6}, Landroid/view/View;->setMinimumHeight(I)V

    invoke-virtual {v11, v6}, Landroid/view/View;->setMinimumWidth(I)V

    invoke-virtual {v11, v6}, Landroid/view/View;->setMinimumHeight(I)V

    :cond_a
    const/16 v6, 0x1f

    invoke-virtual {v13, v6}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v8

    if-eqz v8, :cond_b

    invoke-virtual {v13, v6, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    invoke-static {v6}, LF4;->n(I)Landroid/widget/ImageView$ScaleType;

    move-result-object v6

    iput-object v6, v0, Lcb;->n:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v10, v6}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    invoke-virtual {v11, v6}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    :cond_b
    const/16 v6, 0x8

    invoke-virtual {v12, v6}, Landroid/view/View;->setVisibility(I)V

    const v6, 0x7f0b0294

    invoke-virtual {v12, v6}, Landroid/view/View;->setId(I)V

    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v8, 0x42a00000    # 80.0f

    const/4 v9, -0x2

    invoke-direct {v6, v9, v9, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v12, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v12, v3}, Landroid/view/View;->setAccessibilityLiveRegion(I)V

    const/16 v6, 0x48

    invoke-virtual {v13, v6, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    invoke-virtual {v12, v4}, Landroid/widget/TextView;->setTextAppearance(I)V

    const/16 v4, 0x49

    invoke-virtual {v13, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-virtual {v2, v4}, LK2;->p(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v12, v2}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_c
    const/16 v2, 0x47

    invoke-virtual {v13, v2}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_d

    goto :goto_1

    :cond_d
    move-object v14, v2

    :goto_1
    iput-object v14, v0, Lcb;->p:Ljava/lang/CharSequence;

    invoke-virtual {v12, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual/range {p0 .. p0}, Lcb;->n()V

    invoke-virtual {v7, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v0, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v0, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v2, v1, Lcom/google/android/material/textfield/TextInputLayout;->e0:Ljava/util/LinkedHashSet;

    invoke-virtual {v2, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    iget-object v2, v1, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    if-eqz v2, :cond_e

    invoke-virtual {v5, v1}, Lab;->a(Lcom/google/android/material/textfield/TextInputLayout;)V

    :cond_e
    new-instance v1, Lx5;

    invoke-direct {v1, v0, v3}, Lx5;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    return-void

    :cond_f
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "endIconSize cannot be less than 0"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final a(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;I)Lcom/google/android/material/internal/CheckableImageButton;
    .locals 2

    const v0, 0x7f0e0046

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {p1, p3}, Landroid/view/View;->setId(I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, LBr;->G(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    check-cast p2, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {p2, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    :cond_0
    return-object p1
.end method

.method public final b()Ldb;
    .locals 5

    iget v0, p0, Lcb;->i:I

    iget-object v1, p0, Lcb;->h:Lbb;

    iget-object v2, v1, Lbb;->c:Ljava/lang/Cloneable;

    check-cast v2, Landroid/util/SparseArray;

    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ldb;

    if-nez v3, :cond_5

    const/4 v3, -0x1

    iget-object v4, v1, Lbb;->d:Ljava/lang/Object;

    check-cast v4, Lcb;

    if-eq v0, v3, :cond_4

    if-eqz v0, :cond_3

    const/4 v3, 0x1

    if-eq v0, v3, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    new-instance v1, Lha;

    invoke-direct {v1, v4}, Lha;-><init>(Lcb;)V

    :goto_0
    move-object v3, v1

    goto :goto_1

    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Invalid end icon mode: "

    invoke-static {v0, v2}, LVo;->e(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    new-instance v1, Lg6;

    invoke-direct {v1, v4}, Lg6;-><init>(Lcb;)V

    goto :goto_0

    :cond_2
    new-instance v3, LBk;

    iget v1, v1, Lbb;->b:I

    invoke-direct {v3, v4, v1}, LBk;-><init>(Lcb;I)V

    goto :goto_1

    :cond_3
    new-instance v1, LT7;

    const/4 v3, 0x1

    invoke-direct {v1, v4, v3}, LT7;-><init>(Lcb;I)V

    goto :goto_0

    :cond_4
    new-instance v1, LT7;

    const/4 v3, 0x0

    invoke-direct {v1, v4, v3}, LT7;-><init>(Lcb;I)V

    goto :goto_0

    :goto_1
    invoke-virtual {v2, v0, v3}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    :cond_5
    return-object v3
.end method

.method public final c()I
    .locals 3

    invoke-virtual {p0}, Lcb;->d()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcb;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcb;->g:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {v0}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginStart()I

    move-result v0

    add-int/2addr v0, v1

    :goto_1
    sget-object v1, LGs;->a:Ljava/util/WeakHashMap;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    move-result v1

    iget-object v2, p0, Lcb;->q:LC2;

    invoke-virtual {v2}, Landroid/view/View;->getPaddingEnd()I

    move-result v2

    add-int/2addr v2, v1

    add-int/2addr v2, v0

    return v2
.end method

.method public final d()Z
    .locals 1

    iget-object v0, p0, Lcb;->b:Landroid/widget/FrameLayout;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcb;->g:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Lcb;->c:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final f(Z)V
    .locals 5

    invoke-virtual {p0}, Lcb;->b()Ldb;

    move-result-object v0

    invoke-virtual {v0}, Ldb;->k()Z

    move-result v1

    iget-object v2, p0, Lcb;->g:Lcom/google/android/material/internal/CheckableImageButton;

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    iget-boolean v1, v2, Lcom/google/android/material/internal/CheckableImageButton;->d:Z

    invoke-virtual {v0}, Ldb;->l()Z

    move-result v4

    if-eq v1, v4, :cond_0

    xor-int/2addr v1, v3

    invoke-virtual {v2, v1}, Lcom/google/android/material/internal/CheckableImageButton;->setChecked(Z)V

    move v1, v3

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    instance-of v4, v0, Lha;

    if-eqz v4, :cond_1

    invoke-virtual {v2}, Landroid/view/View;->isActivated()Z

    move-result v4

    invoke-virtual {v0}, Ldb;->j()Z

    move-result v0

    if-eq v4, v0, :cond_1

    xor-int/lit8 v0, v4, 0x1

    invoke-virtual {v2, v0}, Landroid/view/View;->setActivated(Z)V

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    if-nez p1, :cond_2

    if-eqz v3, :cond_3

    :cond_2
    iget-object p1, p0, Lcb;->k:Landroid/content/res/ColorStateList;

    iget-object v0, p0, Lcb;->a:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-static {v0, v2, p1}, LF4;->V(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;)V

    :cond_3
    return-void
.end method

.method public final g(I)V
    .locals 8

    iget v0, p0, Lcb;->i:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcb;->b()Ldb;

    move-result-object v0

    iget-object v1, p0, Lcb;->u:Ld4;

    iget-object v2, p0, Lcb;->t:Landroid/view/accessibility/AccessibilityManager;

    if-eqz v1, :cond_1

    if-eqz v2, :cond_1

    new-instance v3, Lz;

    invoke-direct {v3, v1}, Lz;-><init>(Ld4;)V

    invoke-virtual {v2, v3}, Landroid/view/accessibility/AccessibilityManager;->removeTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    :cond_1
    const/4 v1, 0x0

    iput-object v1, p0, Lcb;->u:Ld4;

    invoke-virtual {v0}, Ldb;->s()V

    iput p1, p0, Lcb;->i:I

    iget-object v0, p0, Lcb;->j:Ljava/util/LinkedHashSet;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_b

    const/4 v0, 0x1

    if-eqz p1, :cond_2

    move v3, v0

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {p0, v3}, Lcb;->h(Z)V

    invoke-virtual {p0}, Lcb;->b()Ldb;

    move-result-object v3

    iget-object v4, p0, Lcb;->h:Lbb;

    iget v4, v4, Lbb;->a:I

    if-nez v4, :cond_3

    invoke-virtual {v3}, Ldb;->d()I

    move-result v4

    :cond_3
    if-eqz v4, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v4}, LF4;->F(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    goto :goto_1

    :cond_4
    move-object v4, v1

    :goto_1
    iget-object v5, p0, Lcb;->g:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v5, v4}, LY1;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v6, p0, Lcb;->a:Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v4, :cond_5

    iget-object v4, p0, Lcb;->k:Landroid/content/res/ColorStateList;

    iget-object v7, p0, Lcb;->l:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v6, v5, v4, v7}, LF4;->e(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    iget-object v4, p0, Lcb;->k:Landroid/content/res/ColorStateList;

    invoke-static {v6, v5, v4}, LF4;->V(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;)V

    :cond_5
    invoke-virtual {v3}, Ldb;->c()I

    move-result v4

    if-eqz v4, :cond_6

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    :cond_6
    invoke-virtual {v5}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v4

    if-eq v4, v1, :cond_7

    invoke-virtual {v5, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_7
    invoke-virtual {v3}, Ldb;->k()Z

    move-result v1

    invoke-virtual {v5, v1}, Lcom/google/android/material/internal/CheckableImageButton;->setCheckable(Z)V

    invoke-virtual {v6}, Lcom/google/android/material/textfield/TextInputLayout;->getBoxBackgroundMode()I

    move-result v1

    invoke-virtual {v3, v1}, Ldb;->i(I)Z

    move-result v1

    if-eqz v1, :cond_a

    invoke-virtual {v3}, Ldb;->r()V

    invoke-virtual {v3}, Ldb;->h()Ld4;

    move-result-object p1

    iput-object p1, p0, Lcb;->u:Ld4;

    if-eqz p1, :cond_8

    if-eqz v2, :cond_8

    sget-object p1, LGs;->a:Ljava/util/WeakHashMap;

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Lcb;->u:Ld4;

    new-instance v1, Lz;

    invoke-direct {v1, p1}, Lz;-><init>(Ld4;)V

    invoke-virtual {v2, v1}, Landroid/view/accessibility/AccessibilityManager;->addTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    :cond_8
    invoke-virtual {v3}, Ldb;->f()Landroid/view/View$OnClickListener;

    move-result-object p1

    iget-object v1, p0, Lcb;->o:Landroid/view/View$OnLongClickListener;

    invoke-virtual {v5, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-static {v5, v1}, LF4;->Z(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;)V

    iget-object p1, p0, Lcb;->s:Landroid/widget/EditText;

    if-eqz p1, :cond_9

    invoke-virtual {v3, p1}, Ldb;->m(Landroid/widget/EditText;)V

    invoke-virtual {p0, v3}, Lcb;->j(Ldb;)V

    :cond_9
    iget-object p1, p0, Lcb;->k:Landroid/content/res/ColorStateList;

    iget-object v1, p0, Lcb;->l:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v6, v5, p1, v1}, LF4;->e(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {p0, v0}, Lcb;->f(Z)V

    return-void

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "The current box background mode "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Lcom/google/android/material/textfield/TextInputLayout;->getBoxBackgroundMode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " is not supported by the end icon mode "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LVo;->l(Ljava/lang/Object;)V

    throw v1
.end method

.method public final h(Z)V
    .locals 1

    invoke-virtual {p0}, Lcb;->d()Z

    move-result v0

    if-eq v0, p1, :cond_1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    iget-object v0, p0, Lcb;->g:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcb;->k()V

    invoke-virtual {p0}, Lcb;->m()V

    iget-object p1, p0, Lcb;->a:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {p1}, Lcom/google/android/material/textfield/TextInputLayout;->q()Z

    :cond_1
    return-void
.end method

.method public final i(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    iget-object v0, p0, Lcb;->c:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0, p1}, LY1;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Lcb;->l()V

    iget-object p1, p0, Lcb;->d:Landroid/content/res/ColorStateList;

    iget-object v1, p0, Lcb;->e:Landroid/graphics/PorterDuff$Mode;

    iget-object v2, p0, Lcb;->a:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-static {v2, v0, p1, v1}, LF4;->e(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public final j(Ldb;)V
    .locals 2

    iget-object v0, p0, Lcb;->s:Landroid/widget/EditText;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Ldb;->e()Landroid/view/View$OnFocusChangeListener;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcb;->s:Landroid/widget/EditText;

    invoke-virtual {p1}, Ldb;->e()Landroid/view/View$OnFocusChangeListener;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    :cond_1
    invoke-virtual {p1}, Ldb;->g()Landroid/view/View$OnFocusChangeListener;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcb;->g:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {p1}, Ldb;->g()Landroid/view/View$OnFocusChangeListener;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    :cond_2
    return-void
.end method

.method public final k()V
    .locals 4

    iget-object v0, p0, Lcb;->g:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcb;->e()Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-object v3, p0, Lcb;->b:Landroid/widget/FrameLayout;

    invoke-virtual {v3, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcb;->p:Ljava/lang/CharSequence;

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lcb;->r:Z

    if-nez v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    invoke-virtual {p0}, Lcb;->d()Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {p0}, Lcb;->e()Z

    move-result v3

    if-nez v3, :cond_2

    if-nez v0, :cond_3

    :cond_2
    move v1, v2

    :cond_3
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final l()V
    .locals 3

    iget-object v0, p0, Lcb;->c:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Lcb;->a:Lcom/google/android/material/textfield/TextInputLayout;

    if-eqz v1, :cond_0

    iget-object v1, v2, Lcom/google/android/material/textfield/TextInputLayout;->j:Lxf;

    iget-boolean v1, v1, Lxf;->q:Z

    if-eqz v1, :cond_0

    invoke-virtual {v2}, Lcom/google/android/material/textfield/TextInputLayout;->m()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcb;->k()V

    invoke-virtual {p0}, Lcb;->m()V

    iget v0, p0, Lcb;->i:I

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/google/android/material/textfield/TextInputLayout;->q()Z

    :goto_1
    return-void
.end method

.method public final m()V
    .locals 5

    iget-object v0, p0, Lcb;->a:Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcb;->d()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p0}, Lcb;->e()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    sget-object v2, LGs;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v1}, Landroid/view/View;->getPaddingEnd()I

    move-result v1

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f070258

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    iget-object v3, v0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    invoke-virtual {v3}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    iget-object v0, v0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    sget-object v4, LGs;->a:Ljava/util/WeakHashMap;

    iget-object v4, p0, Lcb;->q:LC2;

    invoke-virtual {v4, v2, v3, v1, v0}, Landroid/view/View;->setPaddingRelative(IIII)V

    return-void
.end method

.method public final n()V
    .locals 4

    iget-object v0, p0, Lcb;->q:LC2;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    iget-object v2, p0, Lcb;->p:Ljava/lang/CharSequence;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    iget-boolean v2, p0, Lcb;->r:Z

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    const/16 v2, 0x8

    :goto_0
    if-eq v1, v2, :cond_2

    invoke-virtual {p0}, Lcb;->b()Ldb;

    move-result-object v1

    if-nez v2, :cond_1

    const/4 v3, 0x1

    :cond_1
    invoke-virtual {v1, v3}, Ldb;->p(Z)V

    :cond_2
    invoke-virtual {p0}, Lcb;->k()V

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcb;->a:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->q()Z

    return-void
.end method
