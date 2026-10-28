.class public final LR0;
.super LQ6;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface;
.implements Lu1;


# instance fields
.field public d:LR1;

.field public final e:LS1;

.field public final f:LP0;


# direct methods
.method public constructor <init>(Landroid/view/ContextThemeWrapper;I)V
    .locals 4

    invoke-static {p1, p2}, LR0;->h(Landroid/content/Context;I)I

    move-result p2

    const/4 v0, 0x1

    const v1, 0x7f04018e

    if-nez p2, :cond_0

    new-instance v2, Landroid/util/TypedValue;

    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    invoke-virtual {v3, v1, v2, v0}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v2, v2, Landroid/util/TypedValue;->resourceId:I

    goto :goto_0

    :cond_0
    move v2, p2

    :goto_0
    invoke-direct {p0, p1, v2}, LQ6;-><init>(Landroid/content/Context;I)V

    new-instance v2, LS1;

    invoke-direct {v2, p0}, LS1;-><init>(LR0;)V

    iput-object v2, p0, LR0;->e:LS1;

    invoke-virtual {p0}, LR0;->e()LE1;

    move-result-object v2

    if-nez p2, :cond_1

    new-instance p2, Landroid/util/TypedValue;

    invoke-direct {p2}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    invoke-virtual {p1, v1, p2, v0}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget p2, p2, Landroid/util/TypedValue;->resourceId:I

    :cond_1
    move-object p1, v2

    check-cast p1, LR1;

    iput p2, p1, LR1;->U:I

    invoke-virtual {v2}, LE1;->d()V

    new-instance p1, LP0;

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-direct {p1, p2, p0, v0}, LP0;-><init>(Landroid/content/Context;LR0;Landroid/view/Window;)V

    iput-object p1, p0, LR0;->f:LP0;

    return-void
.end method

.method public static h(Landroid/content/Context;I)I
    .locals 2

    ushr-int/lit8 v0, p1, 0x18

    and-int/lit16 v0, v0, 0xff

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    return p1

    :cond_0
    new-instance p1, Landroid/util/TypedValue;

    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p0

    const v0, 0x7f04002f

    invoke-virtual {p0, v0, p1, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget p0, p1, Landroid/util/TypedValue;->resourceId:I

    return p0
.end method


# virtual methods
.method public final addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 3

    invoke-virtual {p0}, LR0;->e()LE1;

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

.method public final dismiss()V
    .locals 1

    invoke-super {p0}, Landroid/app/Dialog;->dismiss()V

    invoke-virtual {p0}, LR0;->e()LE1;

    move-result-object v0

    invoke-virtual {v0}, LE1;->e()V

    return-void
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    iget-object v0, p0, LR0;->e:LS1;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, v0, LS1;->a:LR0;

    invoke-virtual {v0, p1}, LR0;->j(Landroid/view/KeyEvent;)Z

    move-result p1

    :goto_0
    return p1
.end method

.method public final e()LE1;
    .locals 3

    iget-object v0, p0, LR0;->d:LR1;

    if-nez v0, :cond_0

    sget-object v0, LE1;->a:LC1;

    new-instance v0, LR1;

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-direct {v0, v1, v2, p0, p0}, LR1;-><init>(Landroid/content/Context;Landroid/view/Window;Lu1;Ljava/lang/Object;)V

    iput-object v0, p0, LR0;->d:LR1;

    :cond_0
    iget-object v0, p0, LR0;->d:LR1;

    return-object v0
.end method

.method public final f()V
    .locals 1

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p0}, LF4;->X(Landroid/view/View;LDg;)V

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p0}, LUd;->f0(Landroid/view/View;Lxn;)V

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0, p0}, LTd;->D(Landroid/view/View;Lbk;)V

    return-void
.end method

.method public final findViewById(I)Landroid/view/View;
    .locals 1

    invoke-virtual {p0}, LR0;->e()LE1;

    move-result-object v0

    check-cast v0, LR1;

    invoke-virtual {v0}, LR1;->w()V

    iget-object v0, v0, LR1;->l:Landroid/view/Window;

    invoke-virtual {v0, p1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final g(Landroid/os/Bundle;)V
    .locals 1

    invoke-virtual {p0}, LR0;->e()LE1;

    move-result-object v0

    invoke-virtual {v0}, LE1;->a()V

    invoke-super {p0, p1}, LQ6;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, LR0;->e()LE1;

    move-result-object p1

    invoke-virtual {p1}, LE1;->d()V

    return-void
.end method

.method public final i(Ljava/lang/CharSequence;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, LR0;->e()LE1;

    move-result-object v0

    invoke-virtual {v0, p1}, LE1;->l(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final invalidateOptionsMenu()V
    .locals 1

    invoke-virtual {p0}, LR0;->e()LE1;

    move-result-object v0

    invoke-virtual {v0}, LE1;->b()V

    return-void
.end method

.method public final j(Landroid/view/KeyEvent;)Z
    .locals 0

    invoke-super {p0, p1}, Landroid/app/Dialog;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 18

    invoke-virtual/range {p0 .. p1}, LR0;->g(Landroid/os/Bundle;)V

    move-object/from16 v2, p0

    iget-object v3, v2, LR0;->f:LP0;

    iget-object v4, v3, LP0;->b:LR0;

    iget v5, v3, LP0;->F:I

    invoke-virtual {v4, v5}, LR0;->setContentView(I)V

    iget-object v4, v3, LP0;->c:Landroid/view/Window;

    const v5, 0x7f0b01fa

    invoke-virtual {v4, v5}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v5

    const v6, 0x7f0b029e

    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    const v8, 0x7f0b00bd

    invoke-virtual {v5, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    const v10, 0x7f0b009b

    invoke-virtual {v5, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v11

    const v12, 0x7f0b00c9

    invoke-virtual {v5, v12}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/view/ViewGroup;

    iget-object v12, v3, LP0;->h:Landroid/view/View;

    const/4 v13, 0x0

    iget-object v14, v3, LP0;->a:Landroid/content/Context;

    if-eqz v12, :cond_0

    goto :goto_0

    :cond_0
    iget v12, v3, LP0;->i:I

    if-eqz v12, :cond_1

    invoke-static {v14}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v12

    iget v0, v3, LP0;->i:I

    invoke-virtual {v12, v0, v5, v13}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v12

    goto :goto_0

    :cond_1
    const/4 v12, 0x0

    :goto_0
    if-eqz v12, :cond_2

    const/16 v16, 0x1

    goto :goto_1

    :cond_2
    move/from16 v16, v13

    :goto_1
    if-eqz v16, :cond_3

    invoke-static {v12}, LP0;->a(Landroid/view/View;)Z

    move-result v17

    if-nez v17, :cond_4

    :cond_3
    const/high16 v0, 0x20000

    invoke-virtual {v4, v0, v0}, Landroid/view/Window;->setFlags(II)V

    :cond_4
    const/4 v0, -0x1

    const/16 v1, 0x8

    if-eqz v16, :cond_6

    const v15, 0x7f0b00c8

    invoke-virtual {v4, v15}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v15

    check-cast v15, Landroid/widget/FrameLayout;

    new-instance v10, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v10, v0, v0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v15, v12, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-boolean v10, v3, LP0;->j:Z

    if-eqz v10, :cond_5

    invoke-virtual {v15, v13, v13, v13, v13}, Landroid/view/View;->setPadding(IIII)V

    :cond_5
    iget-object v10, v3, LP0;->g:Landroidx/appcompat/app/AlertController$RecycleListView;

    if-eqz v10, :cond_7

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v10

    check-cast v10, LJg;

    const/4 v12, 0x0

    iput v12, v10, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    goto :goto_2

    :cond_6
    invoke-virtual {v5, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_7
    :goto_2
    invoke-virtual {v5, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v5, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    const v10, 0x7f0b009b

    invoke-virtual {v5, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    invoke-static {v6, v7}, LP0;->b(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;

    move-result-object v6

    invoke-static {v8, v9}, LP0;->b(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;

    move-result-object v7

    invoke-static {v10, v11}, LP0;->b(Landroid/view/View;Landroid/view/View;)Landroid/view/ViewGroup;

    move-result-object v8

    const v9, 0x7f0b0236

    invoke-virtual {v4, v9}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroidx/core/widget/NestedScrollView;

    iput-object v9, v3, LP0;->w:Landroidx/core/widget/NestedScrollView;

    invoke-virtual {v9, v13}, Landroid/view/View;->setFocusable(Z)V

    iget-object v9, v3, LP0;->w:Landroidx/core/widget/NestedScrollView;

    invoke-virtual {v9, v13}, Landroidx/core/widget/NestedScrollView;->setNestedScrollingEnabled(Z)V

    const v9, 0x102000b

    invoke-virtual {v7, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/TextView;

    iput-object v9, v3, LP0;->B:Landroid/widget/TextView;

    if-nez v9, :cond_8

    goto :goto_3

    :cond_8
    iget-object v10, v3, LP0;->f:Ljava/lang/CharSequence;

    if-eqz v10, :cond_9

    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    :cond_9
    invoke-virtual {v9, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v9, v3, LP0;->w:Landroidx/core/widget/NestedScrollView;

    iget-object v10, v3, LP0;->B:Landroid/widget/TextView;

    invoke-virtual {v9, v10}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    iget-object v9, v3, LP0;->g:Landroidx/appcompat/app/AlertController$RecycleListView;

    if-eqz v9, :cond_a

    iget-object v9, v3, LP0;->w:Landroidx/core/widget/NestedScrollView;

    invoke-virtual {v9}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v9

    check-cast v9, Landroid/view/ViewGroup;

    iget-object v10, v3, LP0;->w:Landroidx/core/widget/NestedScrollView;

    invoke-virtual {v9, v10}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v10

    invoke-virtual {v9, v10}, Landroid/view/ViewGroup;->removeViewAt(I)V

    iget-object v11, v3, LP0;->g:Landroidx/appcompat/app/AlertController$RecycleListView;

    new-instance v12, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v12, v0, v0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v9, v11, v10, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    goto :goto_3

    :cond_a
    invoke-virtual {v7, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_3
    const v9, 0x1020019

    invoke-virtual {v8, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/Button;

    iput-object v9, v3, LP0;->k:Landroid/widget/Button;

    iget-object v10, v3, LP0;->L:LX;

    invoke-virtual {v9, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v9, v3, LP0;->l:Ljava/lang/CharSequence;

    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    iget v11, v3, LP0;->d:I

    if-eqz v9, :cond_b

    iget-object v9, v3, LP0;->n:Landroid/graphics/drawable/Drawable;

    if-nez v9, :cond_b

    iget-object v9, v3, LP0;->k:Landroid/widget/Button;

    invoke-virtual {v9, v1}, Landroid/view/View;->setVisibility(I)V

    move v9, v13

    goto :goto_4

    :cond_b
    iget-object v9, v3, LP0;->k:Landroid/widget/Button;

    iget-object v12, v3, LP0;->l:Ljava/lang/CharSequence;

    invoke-virtual {v9, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v9, v3, LP0;->n:Landroid/graphics/drawable/Drawable;

    if-eqz v9, :cond_c

    invoke-virtual {v9, v13, v13, v11, v11}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object v9, v3, LP0;->k:Landroid/widget/Button;

    iget-object v12, v3, LP0;->n:Landroid/graphics/drawable/Drawable;

    const/4 v15, 0x0

    invoke-virtual {v9, v12, v15, v15, v15}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    :cond_c
    iget-object v9, v3, LP0;->k:Landroid/widget/Button;

    invoke-virtual {v9, v13}, Landroid/view/View;->setVisibility(I)V

    const/4 v9, 0x1

    :goto_4
    const v12, 0x102001a

    invoke-virtual {v8, v12}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v12

    check-cast v12, Landroid/widget/Button;

    iput-object v12, v3, LP0;->o:Landroid/widget/Button;

    invoke-virtual {v12, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v12, v3, LP0;->p:Ljava/lang/CharSequence;

    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    if-eqz v12, :cond_d

    iget-object v12, v3, LP0;->r:Landroid/graphics/drawable/Drawable;

    if-nez v12, :cond_d

    iget-object v12, v3, LP0;->o:Landroid/widget/Button;

    invoke-virtual {v12, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_5

    :cond_d
    iget-object v12, v3, LP0;->o:Landroid/widget/Button;

    iget-object v15, v3, LP0;->p:Ljava/lang/CharSequence;

    invoke-virtual {v12, v15}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v12, v3, LP0;->r:Landroid/graphics/drawable/Drawable;

    if-eqz v12, :cond_e

    invoke-virtual {v12, v13, v13, v11, v11}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object v12, v3, LP0;->o:Landroid/widget/Button;

    iget-object v15, v3, LP0;->r:Landroid/graphics/drawable/Drawable;

    const/4 v0, 0x0

    invoke-virtual {v12, v15, v0, v0, v0}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    :cond_e
    iget-object v0, v3, LP0;->o:Landroid/widget/Button;

    invoke-virtual {v0, v13}, Landroid/view/View;->setVisibility(I)V

    const/4 v0, 0x2

    or-int/2addr v9, v0

    :goto_5
    const v0, 0x102001b

    invoke-virtual {v8, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, v3, LP0;->s:Landroid/widget/Button;

    invoke-virtual {v0, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, v3, LP0;->t:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_f

    iget-object v0, v3, LP0;->v:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_f

    iget-object v0, v3, LP0;->s:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const/4 v11, 0x0

    goto :goto_7

    :cond_f
    iget-object v0, v3, LP0;->s:Landroid/widget/Button;

    iget-object v10, v3, LP0;->t:Ljava/lang/CharSequence;

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, v3, LP0;->v:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_10

    invoke-virtual {v0, v13, v13, v11, v11}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object v0, v3, LP0;->s:Landroid/widget/Button;

    iget-object v10, v3, LP0;->v:Landroid/graphics/drawable/Drawable;

    const/4 v11, 0x0

    invoke-virtual {v0, v10, v11, v11, v11}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_6

    :cond_10
    const/4 v11, 0x0

    :goto_6
    iget-object v0, v3, LP0;->s:Landroid/widget/Button;

    invoke-virtual {v0, v13}, Landroid/view/View;->setVisibility(I)V

    const/4 v0, 0x4

    or-int/2addr v9, v0

    :goto_7
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {v14}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v10

    const v12, 0x7f04002d

    const/4 v14, 0x1

    invoke-virtual {v10, v12, v0, v14}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v0, v0, Landroid/util/TypedValue;->data:I

    if-eqz v0, :cond_11

    const/high16 v0, 0x3f000000    # 0.5f

    if-ne v9, v14, :cond_12

    iget-object v10, v3, LP0;->k:Landroid/widget/Button;

    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v12

    check-cast v12, Landroid/widget/LinearLayout$LayoutParams;

    iput v14, v12, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    iput v0, v12, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    invoke-virtual {v10, v12}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_11
    const/4 v10, 0x2

    goto :goto_8

    :cond_12
    const/4 v10, 0x2

    if-ne v9, v10, :cond_13

    iget-object v12, v3, LP0;->o:Landroid/widget/Button;

    invoke-virtual {v12}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v15

    check-cast v15, Landroid/widget/LinearLayout$LayoutParams;

    iput v14, v15, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    iput v0, v15, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    invoke-virtual {v12, v15}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_8

    :cond_13
    const/4 v12, 0x4

    if-ne v9, v12, :cond_14

    iget-object v12, v3, LP0;->s:Landroid/widget/Button;

    invoke-virtual {v12}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v15

    check-cast v15, Landroid/widget/LinearLayout$LayoutParams;

    iput v14, v15, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    iput v0, v15, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    invoke-virtual {v12, v15}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_14
    :goto_8
    if-eqz v9, :cond_15

    goto :goto_9

    :cond_15
    invoke-virtual {v8, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_9
    iget-object v0, v3, LP0;->C:Landroid/view/View;

    const v9, 0x7f0b029a

    if-eqz v0, :cond_16

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v12, -0x2

    const/4 v14, -0x1

    invoke-direct {v0, v14, v12}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    iget-object v12, v3, LP0;->C:Landroid/view/View;

    invoke-virtual {v6, v12, v13, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v4, v9}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_a

    :cond_16
    const v0, 0x1020006

    invoke-virtual {v4, v0}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v3, LP0;->z:Landroid/widget/ImageView;

    iget-object v0, v3, LP0;->e:Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v12, 0x1

    xor-int/2addr v0, v12

    if-eqz v0, :cond_19

    iget-boolean v0, v3, LP0;->J:Z

    if-eqz v0, :cond_19

    const v0, 0x7f0b0066

    invoke-virtual {v4, v0}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v3, LP0;->A:Landroid/widget/TextView;

    iget-object v9, v3, LP0;->e:Ljava/lang/CharSequence;

    invoke-virtual {v0, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget v0, v3, LP0;->x:I

    if-eqz v0, :cond_17

    iget-object v9, v3, LP0;->z:Landroid/widget/ImageView;

    invoke-virtual {v9, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_a

    :cond_17
    iget-object v0, v3, LP0;->y:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_18

    iget-object v9, v3, LP0;->z:Landroid/widget/ImageView;

    invoke-virtual {v9, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_a

    :cond_18
    iget-object v0, v3, LP0;->A:Landroid/widget/TextView;

    iget-object v9, v3, LP0;->z:Landroid/widget/ImageView;

    invoke-virtual {v9}, Landroid/view/View;->getPaddingLeft()I

    move-result v9

    iget-object v12, v3, LP0;->z:Landroid/widget/ImageView;

    invoke-virtual {v12}, Landroid/view/View;->getPaddingTop()I

    move-result v12

    iget-object v14, v3, LP0;->z:Landroid/widget/ImageView;

    invoke-virtual {v14}, Landroid/view/View;->getPaddingRight()I

    move-result v14

    iget-object v15, v3, LP0;->z:Landroid/widget/ImageView;

    invoke-virtual {v15}, Landroid/view/View;->getPaddingBottom()I

    move-result v15

    invoke-virtual {v0, v9, v12, v14, v15}, Landroid/widget/TextView;->setPadding(IIII)V

    iget-object v0, v3, LP0;->z:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_a

    :cond_19
    invoke-virtual {v4, v9}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, v3, LP0;->z:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {v6, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_a
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eq v0, v1, :cond_1a

    const/4 v14, 0x1

    goto :goto_b

    :cond_1a
    move v14, v13

    :goto_b
    if-eqz v6, :cond_1b

    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eq v0, v1, :cond_1b

    const/4 v0, 0x1

    goto :goto_c

    :cond_1b
    move v0, v13

    :goto_c
    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    move-result v5

    if-eq v5, v1, :cond_1c

    const/4 v1, 0x1

    goto :goto_d

    :cond_1c
    move v1, v13

    :goto_d
    if-nez v1, :cond_1d

    const v5, 0x7f0b0288

    invoke-virtual {v7, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    if-eqz v5, :cond_1d

    invoke-virtual {v5, v13}, Landroid/view/View;->setVisibility(I)V

    :cond_1d
    if-eqz v0, :cond_21

    iget-object v5, v3, LP0;->w:Landroidx/core/widget/NestedScrollView;

    if-eqz v5, :cond_1e

    const/4 v8, 0x1

    invoke-virtual {v5, v8}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    :cond_1e
    iget-object v5, v3, LP0;->f:Ljava/lang/CharSequence;

    if-nez v5, :cond_20

    iget-object v5, v3, LP0;->g:Landroidx/appcompat/app/AlertController$RecycleListView;

    if-eqz v5, :cond_1f

    goto :goto_e

    :cond_1f
    move-object v15, v11

    goto :goto_f

    :cond_20
    :goto_e
    const v5, 0x7f0b0299

    invoke-virtual {v6, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v15

    :goto_f
    if-eqz v15, :cond_22

    invoke-virtual {v15, v13}, Landroid/view/View;->setVisibility(I)V

    goto :goto_10

    :cond_21
    const v5, 0x7f0b0289

    invoke-virtual {v7, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    if-eqz v5, :cond_22

    invoke-virtual {v5, v13}, Landroid/view/View;->setVisibility(I)V

    :cond_22
    :goto_10
    iget-object v5, v3, LP0;->g:Landroidx/appcompat/app/AlertController$RecycleListView;

    instance-of v6, v5, Landroidx/appcompat/app/AlertController$RecycleListView;

    if-eqz v6, :cond_26

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v1, :cond_23

    if-nez v0, :cond_26

    :cond_23
    invoke-virtual {v5}, Landroid/view/View;->getPaddingLeft()I

    move-result v6

    if-eqz v0, :cond_24

    invoke-virtual {v5}, Landroid/view/View;->getPaddingTop()I

    move-result v8

    goto :goto_11

    :cond_24
    iget v8, v5, Landroidx/appcompat/app/AlertController$RecycleListView;->a:I

    :goto_11
    invoke-virtual {v5}, Landroid/view/View;->getPaddingRight()I

    move-result v9

    if-eqz v1, :cond_25

    invoke-virtual {v5}, Landroid/view/View;->getPaddingBottom()I

    move-result v11

    goto :goto_12

    :cond_25
    iget v11, v5, Landroidx/appcompat/app/AlertController$RecycleListView;->b:I

    :goto_12
    invoke-virtual {v5, v6, v8, v9, v11}, Landroid/view/View;->setPadding(IIII)V

    :cond_26
    if-nez v14, :cond_2a

    iget-object v5, v3, LP0;->g:Landroidx/appcompat/app/AlertController$RecycleListView;

    if-eqz v5, :cond_27

    goto :goto_13

    :cond_27
    iget-object v5, v3, LP0;->w:Landroidx/core/widget/NestedScrollView;

    :goto_13
    if-eqz v5, :cond_2a

    if-eqz v1, :cond_28

    move v1, v10

    goto :goto_14

    :cond_28
    move v1, v13

    :goto_14
    or-int/2addr v0, v1

    const v1, 0x7f0b0235

    invoke-virtual {v4, v1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const v6, 0x7f0b0234

    invoke-virtual {v4, v6}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v4

    sget-object v6, LGs;->a:Ljava/util/WeakHashMap;

    const/4 v6, 0x3

    invoke-static {v5, v0, v6}, Lws;->d(Landroid/view/View;II)V

    if-eqz v1, :cond_29

    invoke-virtual {v7, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_29
    if-eqz v4, :cond_2a

    invoke-virtual {v7, v4}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_2a
    iget-object v0, v3, LP0;->g:Landroidx/appcompat/app/AlertController$RecycleListView;

    if-eqz v0, :cond_2b

    iget-object v1, v3, LP0;->D:Landroid/widget/ListAdapter;

    if-eqz v1, :cond_2b

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget v1, v3, LP0;->E:I

    const/4 v3, -0x1

    if-le v1, v3, :cond_2b

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3}, Landroid/widget/AbsListView;->setItemChecked(IZ)V

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setSelection(I)V

    :cond_2b
    return-void
.end method

.method public final onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, LR0;->f:LP0;

    iget-object v0, v0, LP0;->w:Landroidx/core/widget/NestedScrollView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p2}, Landroidx/core/widget/NestedScrollView;->i(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, LR0;->f:LP0;

    iget-object v0, v0, LP0;->w:Landroidx/core/widget/NestedScrollView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p2}, Landroidx/core/widget/NestedScrollView;->i(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final onStop()V
    .locals 2

    invoke-super {p0}, LQ6;->onStop()V

    invoke-virtual {p0}, LR0;->e()LE1;

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

.method public final setContentView(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LR0;->f()V

    .line 2
    invoke-virtual {p0}, LR0;->e()LE1;

    move-result-object v0

    invoke-virtual {v0, p1}, LE1;->h(I)V

    return-void
.end method

.method public final setContentView(Landroid/view/View;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, LR0;->f()V

    .line 4
    invoke-virtual {p0}, LR0;->e()LE1;

    move-result-object v0

    invoke-virtual {v0, p1}, LE1;->i(Landroid/view/View;)V

    return-void
.end method

.method public final setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 5
    invoke-virtual {p0}, LR0;->f()V

    .line 6
    invoke-virtual {p0}, LR0;->e()LE1;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LE1;->j(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final setTitle(I)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->setTitle(I)V

    .line 2
    invoke-virtual {p0}, LR0;->e()LE1;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, LE1;->l(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 3
    invoke-virtual {p0, p1}, LR0;->i(Ljava/lang/CharSequence;)V

    .line 4
    iget-object v0, p0, LR0;->f:LP0;

    iput-object p1, v0, LP0;->e:Ljava/lang/CharSequence;

    .line 5
    iget-object v0, v0, LP0;->A:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method
