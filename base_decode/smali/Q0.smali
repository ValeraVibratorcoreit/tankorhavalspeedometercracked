.class public LQ0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUm;
.implements LU;


# instance fields
.field public a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object v0, p0, LQ0;->b:Ljava/lang/Object;

    const/16 v0, 0x64

    .line 6
    iput v0, p0, LQ0;->a:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LQ0;->a:I

    iput-object p2, p0, LQ0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 8
    invoke-static {p1, v0}, LR0;->h(Landroid/content/Context;I)I

    move-result v0

    invoke-direct {p0, p1, v0}, LQ0;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 3

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, LM0;

    new-instance v1, Landroid/view/ContextThemeWrapper;

    .line 11
    invoke-static {p1, p2}, LR0;->h(Landroid/content/Context;I)I

    move-result v2

    invoke-direct {v1, p1, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    invoke-direct {v0, v1}, LM0;-><init>(Landroid/view/ContextThemeWrapper;)V

    iput-object v0, p0, LQ0;->b:Ljava/lang/Object;

    .line 12
    iput p2, p0, LQ0;->a:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput-object p1, p0, LQ0;->b:Ljava/lang/Object;

    iput p2, p0, LQ0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ0;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)Z
    .locals 1

    iget-object p1, p0, LQ0;->b:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iget v0, p0, LQ0;->a:I

    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->B(I)V

    const/4 p1, 0x1

    return p1
.end method

.method public b()LR0;
    .locals 12

    new-instance v0, LR0;

    iget-object v1, p0, LQ0;->b:Ljava/lang/Object;

    check-cast v1, LM0;

    iget-object v2, v1, LM0;->a:Landroid/content/Context;

    iget v3, p0, LQ0;->a:I

    check-cast v2, Landroid/view/ContextThemeWrapper;

    invoke-direct {v0, v2, v3}, LR0;-><init>(Landroid/view/ContextThemeWrapper;I)V

    iget-object v2, v1, LM0;->e:Landroid/view/View;

    iget-object v3, v0, LR0;->f:LP0;

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    iput-object v2, v3, LP0;->C:Landroid/view/View;

    goto :goto_0

    :cond_0
    iget-object v2, v1, LM0;->d:Ljava/lang/CharSequence;

    if-eqz v2, :cond_1

    iput-object v2, v3, LP0;->e:Ljava/lang/CharSequence;

    iget-object v5, v3, LP0;->A:Landroid/widget/TextView;

    if-eqz v5, :cond_1

    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    iget-object v2, v1, LM0;->c:Landroid/graphics/drawable/Drawable;

    if-eqz v2, :cond_2

    iput-object v2, v3, LP0;->y:Landroid/graphics/drawable/Drawable;

    iput v4, v3, LP0;->x:I

    iget-object v5, v3, LP0;->z:Landroid/widget/ImageView;

    if-eqz v5, :cond_2

    invoke-virtual {v5, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v5, v3, LP0;->z:Landroid/widget/ImageView;

    invoke-virtual {v5, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_2
    :goto_0
    iget-object v2, v1, LM0;->f:Ljava/lang/CharSequence;

    if-eqz v2, :cond_3

    iput-object v2, v3, LP0;->f:Ljava/lang/CharSequence;

    iget-object v5, v3, LP0;->B:Landroid/widget/TextView;

    if-eqz v5, :cond_3

    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    iget-object v2, v1, LM0;->g:Ljava/lang/CharSequence;

    if-nez v2, :cond_4

    goto :goto_1

    :cond_4
    iget-object v5, v1, LM0;->h:Landroid/content/DialogInterface$OnClickListener;

    const/4 v6, -0x1

    invoke-virtual {v3, v6, v2, v5}, LP0;->c(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    :goto_1
    iget-object v2, v1, LM0;->i:Ljava/lang/CharSequence;

    if-nez v2, :cond_5

    goto :goto_2

    :cond_5
    iget-object v5, v1, LM0;->j:Landroid/content/DialogInterface$OnClickListener;

    const/4 v6, -0x2

    invoke-virtual {v3, v6, v2, v5}, LP0;->c(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    :goto_2
    iget-object v2, v1, LM0;->k:Ljava/lang/CharSequence;

    if-nez v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v5, v1, LM0;->l:Landroid/content/DialogInterface$OnClickListener;

    const/4 v6, -0x3

    invoke-virtual {v3, v6, v2, v5}, LP0;->c(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    :goto_3
    iget-object v2, v1, LM0;->o:[Ljava/lang/CharSequence;

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-nez v2, :cond_7

    iget-object v2, v1, LM0;->p:Landroid/widget/ListAdapter;

    if-eqz v2, :cond_c

    :cond_7
    iget v2, v3, LP0;->G:I

    iget-object v7, v1, LM0;->b:Landroid/view/LayoutInflater;

    invoke-virtual {v7, v2, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/appcompat/app/AlertController$RecycleListView;

    iget-boolean v7, v1, LM0;->s:Z

    if-eqz v7, :cond_8

    iget v7, v3, LP0;->H:I

    goto :goto_4

    :cond_8
    iget v7, v3, LP0;->I:I

    :goto_4
    iget-object v8, v1, LM0;->p:Landroid/widget/ListAdapter;

    if-eqz v8, :cond_9

    goto :goto_5

    :cond_9
    new-instance v8, LO0;

    iget-object v9, v1, LM0;->o:[Ljava/lang/CharSequence;

    iget-object v10, v1, LM0;->a:Landroid/content/Context;

    const v11, 0x1020014

    invoke-direct {v8, v10, v7, v11, v9}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;II[Ljava/lang/Object;)V

    :goto_5
    iput-object v8, v3, LP0;->D:Landroid/widget/ListAdapter;

    iget v7, v1, LM0;->t:I

    iput v7, v3, LP0;->E:I

    iget-object v7, v1, LM0;->q:Landroid/content/DialogInterface$OnClickListener;

    if-eqz v7, :cond_a

    new-instance v7, LL0;

    invoke-direct {v7, v1, v3}, LL0;-><init>(LM0;LP0;)V

    invoke-virtual {v2, v7}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    :cond_a
    iget-boolean v7, v1, LM0;->s:Z

    if-eqz v7, :cond_b

    invoke-virtual {v2, v5}, Landroid/widget/AbsListView;->setChoiceMode(I)V

    :cond_b
    iput-object v2, v3, LP0;->g:Landroidx/appcompat/app/AlertController$RecycleListView;

    :cond_c
    iget-object v2, v1, LM0;->r:Landroid/view/View;

    if-eqz v2, :cond_d

    iput-object v2, v3, LP0;->h:Landroid/view/View;

    iput v4, v3, LP0;->i:I

    iput-boolean v4, v3, LP0;->j:Z

    :cond_d
    iget-boolean v2, v1, LM0;->m:Z

    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setCancelable(Z)V

    iget-boolean v2, v1, LM0;->m:Z

    if-eqz v2, :cond_e

    invoke-virtual {v0, v5}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    :cond_e
    invoke-virtual {v0, v6}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    invoke-virtual {v0, v6}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iget-object v1, v1, LM0;->n:Landroid/content/DialogInterface$OnKeyListener;

    if-eqz v1, :cond_f

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    :cond_f
    return-object v0
.end method

.method public c()Z
    .locals 2

    iget v0, p0, LQ0;->a:I

    iget-object v1, p0, LQ0;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d(ILandroid/content/DialogInterface$OnClickListener;)LQ0;
    .locals 2

    iget-object v0, p0, LQ0;->b:Ljava/lang/Object;

    check-cast v0, LM0;

    iget-object v1, v0, LM0;->a:Landroid/content/Context;

    invoke-virtual {v1, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, v0, LM0;->i:Ljava/lang/CharSequence;

    iput-object p2, v0, LM0;->j:Landroid/content/DialogInterface$OnClickListener;

    return-object p0
.end method

.method public e(ILandroid/content/DialogInterface$OnClickListener;)LQ0;
    .locals 2

    iget-object v0, p0, LQ0;->b:Ljava/lang/Object;

    check-cast v0, LM0;

    iget-object v1, v0, LM0;->a:Landroid/content/Context;

    invoke-virtual {v1, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, v0, LM0;->g:Ljava/lang/CharSequence;

    iput-object p2, v0, LM0;->h:Landroid/content/DialogInterface$OnClickListener;

    return-object p0
.end method

.method public f(I)LQ0;
    .locals 2

    iget-object v0, p0, LQ0;->b:Ljava/lang/Object;

    check-cast v0, LM0;

    iget-object v1, v0, LM0;->a:Landroid/content/Context;

    invoke-virtual {v1, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, v0, LM0;->d:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public g()V
    .locals 1

    invoke-virtual {p0}, LQ0;->b()LR0;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public m(LIm;Lrk;)LIm;
    .locals 3

    new-instance p2, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    invoke-interface {p1}, LIm;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    iget-object v1, p0, LQ0;->b:Ljava/lang/Object;

    check-cast v1, Landroid/graphics/Bitmap$CompressFormat;

    iget v2, p0, LQ0;->a:I

    invoke-virtual {v0, v1, v2, p2}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    invoke-interface {p1}, LIm;->e()V

    new-instance p1, Lf1;

    invoke-virtual {p2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p2

    invoke-direct {p1, p2}, Lf1;-><init>([B)V

    return-object p1
.end method
