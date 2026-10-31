.class public Lcom/google/android/material/theme/MaterialComponentsViewInflater;
.super LJ2;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LJ2;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Landroid/util/AttributeSet;)Lr1;
    .locals 1

    new-instance v0, LNh;

    invoke-direct {v0, p1, p2}, LNh;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public final b(Landroid/content/Context;Landroid/util/AttributeSet;)Lt1;
    .locals 1

    new-instance v0, Lcom/google/android/material/button/MaterialButton;

    invoke-direct {v0, p1, p2}, Lcom/google/android/material/button/MaterialButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public final c(Landroid/content/Context;Landroid/util/AttributeSet;)Lv1;
    .locals 1

    new-instance v0, Lbi;

    invoke-direct {v0, p1, p2}, Lbi;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public final d(Landroid/content/Context;Landroid/util/AttributeSet;)Le2;
    .locals 8

    new-instance v0, Lei;

    const v1, 0x7f14045e

    const v5, 0x7f0403d4

    invoke-static {p1, p2, v5, v1}, LTd;->Q(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Le2;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget-object v4, Lul;->q:[I

    const/4 v1, 0x0

    new-array v7, v1, [I

    const v6, 0x7f14045e

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v2 .. v7}, Lmk;->z(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;

    move-result-object p2

    invoke-virtual {p2, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {p1, p2, v1}, LBr;->u(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-static {v0, p1}, LR6;->c(Landroid/widget/CompoundButton;Landroid/content/res/ColorStateList;)V

    :cond_0
    const/4 p1, 0x1

    invoke-virtual {p2, p1, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, v0, Lei;->f:Z

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-object v0
.end method

.method public final e(Landroid/content/Context;Landroid/util/AttributeSet;)LC2;
    .locals 9

    new-instance v0, Lii;

    const v1, 0x1010084

    const/4 v2, 0x0

    invoke-static {p1, p2, v1, v2}, LTd;->Q(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1, p2, v1}, Lii;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const v3, 0x7f0404e7

    const/4 v4, 0x1

    invoke-static {p1, v3, v4}, LTf;->S(Landroid/content/Context;IZ)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    sget-object v5, Lul;->t:[I

    invoke-virtual {v3, p2, v5, v1, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v6

    const/4 v7, 0x2

    filled-new-array {v4, v7}, [I

    move-result-object v8

    invoke-static {p1, v6, v8}, Lii;->h(Landroid/content/Context;Landroid/content/res/TypedArray;[I)I

    move-result p1

    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    const/4 v6, -0x1

    if-eq p1, v6, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v3, p2, v5, v1, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1, v2, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    if-eq p2, v6, :cond_1

    sget-object p1, Lul;->s:[I

    invoke-virtual {v3, p2, p1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    filled-new-array {v4, v7}, [I

    move-result-object v1

    invoke-static {p2, p1, v1}, Lii;->h(Landroid/content/Context;Landroid/content/res/TypedArray;[I)I

    move-result p2

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    if-ltz p2, :cond_1

    invoke-virtual {v0, p2}, LC2;->setLineHeight(I)V

    :cond_1
    :goto_0
    return-object v0
.end method
