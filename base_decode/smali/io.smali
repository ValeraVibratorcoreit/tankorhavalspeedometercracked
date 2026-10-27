.class public Lio;
.super Lzc;
.source "SourceFile"


# instance fields
.field public T:[I

.field public U:[Ljava/lang/String;

.field public V:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lzc;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lio;->V:I

    return-void
.end method


# virtual methods
.method public final B(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "ts_state_tab"

    iget v1, p0, Lio;->V:I

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    return-void
.end method

.method public final E(Landroid/view/View;)V
    .locals 13

    const v0, 0x7f0b02b7

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/tabs/TabLayout;

    iget-object v0, p0, Lio;->T:[I

    if-eqz v0, :cond_10

    iget-object v0, p0, Lio;->U:[Ljava/lang/String;

    if-nez v0, :cond_0

    goto/16 :goto_5

    :cond_0
    invoke-virtual {p0}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f06033a

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/google/android/material/tabs/TabLayout;->setSelectedTabIndicatorColor(I)V

    invoke-virtual {p0}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f060341

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p0}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f060340

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-static {v0, v1}, Lcom/google/android/material/tabs/TabLayout;->d(II)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/material/tabs/TabLayout;->setTabTextColors(Landroid/content/res/ColorStateList;)V

    iget-object v0, p0, Lio;->T:[I

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    iget-object v4, p1, Lcom/google/android/material/tabs/TabLayout;->b:Ljava/util/ArrayList;

    if-ge v3, v1, :cond_9

    aget v5, v0, v3

    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout;->f()Lcq;

    move-result-object v6

    iget-object v7, v6, Lcq;->f:Lcom/google/android/material/tabs/TabLayout;

    if-eqz v7, :cond_8

    invoke-virtual {v7}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7, v5}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v5

    iget-object v7, v6, Lcq;->c:Ljava/lang/CharSequence;

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_1

    iget-object v7, v6, Lcq;->g:Leq;

    invoke-virtual {v7, v5}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_1
    iput-object v5, v6, Lcq;->b:Ljava/lang/CharSequence;

    iget-object v5, v6, Lcq;->g:Leq;

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Leq;->e()V

    :cond_2
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v7

    iget-object v8, v6, Lcq;->f:Lcom/google/android/material/tabs/TabLayout;

    if-ne v8, p1, :cond_7

    iput v7, v6, Lcq;->d:I

    invoke-virtual {v4, v7, v6}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v8

    add-int/lit8 v7, v7, 0x1

    const/4 v9, -0x1

    move v10, v9

    :goto_1
    if-ge v7, v8, :cond_4

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcq;

    iget v11, v11, Lcq;->d:I

    iget v12, p1, Lcom/google/android/material/tabs/TabLayout;->a:I

    if-ne v11, v12, :cond_3

    move v10, v7

    :cond_3
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcq;

    iput v7, v11, Lcq;->d:I

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_4
    iput v10, p1, Lcom/google/android/material/tabs/TabLayout;->a:I

    iget-object v4, v6, Lcq;->g:Leq;

    invoke-virtual {v4, v2}, Leq;->setSelected(Z)V

    invoke-virtual {v4, v2}, Landroid/view/View;->setActivated(Z)V

    iget v7, v6, Lcq;->d:I

    new-instance v8, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v10, -0x2

    invoke-direct {v8, v10, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iget v9, p1, Lcom/google/android/material/tabs/TabLayout;->C:I

    const/4 v11, 0x1

    if-ne v9, v11, :cond_5

    iget v9, p1, Lcom/google/android/material/tabs/TabLayout;->z:I

    if-nez v9, :cond_5

    iput v2, v8, Landroid/widget/LinearLayout$LayoutParams;->width:I

    const/high16 v9, 0x3f800000    # 1.0f

    iput v9, v8, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    goto :goto_2

    :cond_5
    iput v10, v8, Landroid/widget/LinearLayout$LayoutParams;->width:I

    const/4 v9, 0x0

    iput v9, v8, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    :goto_2
    iget-object v9, p1, Lcom/google/android/material/tabs/TabLayout;->d:Lbq;

    invoke-virtual {v9, v4, v7, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    if-eqz v5, :cond_6

    invoke-virtual {v6}, Lcq;->a()V

    :cond_6
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Tab belongs to a different TabLayout."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Tab not attached to a TabLayout"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance v0, Lho;

    invoke-direct {v0, p0}, Lho;-><init>(Lio;)V

    iget-object v1, p1, Lcom/google/android/material/tabs/TabLayout;->L:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_a
    iget v0, p0, Lio;->V:I

    if-ltz v0, :cond_b

    iget-object v1, p0, Lio;->T:[I

    array-length v1, v1

    if-lt v0, v1, :cond_c

    :cond_b
    iput v2, p0, Lio;->V:I

    :cond_c
    iget v0, p0, Lio;->V:I

    if-ltz v0, :cond_e

    invoke-virtual {p1}, Lcom/google/android/material/tabs/TabLayout;->getTabCount()I

    move-result p1

    if-lt v0, p1, :cond_d

    goto :goto_3

    :cond_d
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcq;

    goto :goto_4

    :cond_e
    :goto_3
    const/4 p1, 0x0

    :goto_4
    if-eqz p1, :cond_f

    invoke-virtual {p1}, Lcq;->a()V

    :cond_f
    iget p1, p0, Lio;->V:I

    invoke-virtual {p0, p1}, Lio;->O(I)V

    :cond_10
    :goto_5
    return-void
.end method

.method public final O(I)V
    .locals 3

    iget-object v0, p0, Lio;->U:[Ljava/lang/String;

    if-eqz v0, :cond_1

    if-ltz p1, :cond_1

    array-length v0, v0

    if-lt p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iput p1, p0, Lio;->V:I

    invoke-virtual {p0}, Lzc;->g()LOc;

    move-result-object v0

    invoke-virtual {v0}, LOc;->D()LJc;

    move-result-object v0

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    iget-object v1, p0, Lio;->U:[Ljava/lang/String;

    aget-object p1, v1, p1

    invoke-virtual {v0, p1}, LJc;->a(Ljava/lang/String;)Lzc;

    move-result-object p1

    invoke-virtual {p0}, Lzc;->g()LOc;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ls3;

    invoke-direct {v1, v0}, Ls3;-><init>(LOc;)V

    const/4 v0, 0x0

    const v2, 0x7f0b02b6

    invoke-virtual {v1, v2, p1, v0}, Ls3;->h(ILzc;Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-virtual {v1, p1}, Ls3;->d(Z)I

    :cond_1
    :goto_0
    return-void
.end method

.method public final v(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Lzc;->v(Landroid/os/Bundle;)V

    iget-object v0, p0, Lzc;->f:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    const-string v1, "ts_labels"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getIntArray(Ljava/lang/String;)[I

    move-result-object v1

    iput-object v1, p0, Lio;->T:[I

    const-string v1, "ts_classes"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lio;->U:[Ljava/lang/String;

    const-string v1, "ts_initial_tab"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lio;->V:I

    :cond_0
    if-eqz p1, :cond_1

    const-string v0, "ts_state_tab"

    iget v1, p0, Lio;->V:I

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lio;->V:I

    :cond_1
    return-void
.end method

.method public final w(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    const v0, 0x7f0e0107

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
