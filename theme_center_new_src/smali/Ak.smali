.class public LAk;
.super Lc4;
.source "SourceFile"


# instance fields
.field public U:Lbo;

.field public V:Lii;

.field public W:Landroid/widget/ImageView;

.field public X:Ljava/util/Set;

.field public Y:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lc4;-><init>()V

    return-void
.end method


# virtual methods
.method public final c0()V
    .locals 3

    iget-boolean v0, p0, LAk;->Y:Z

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, LAk;->X:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LAk;->V:Lii;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, LAk;->U:Lbo;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LAk;->V:Lii;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, LAk;->U:Lbo;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public final d0()V
    .locals 3

    iget-boolean v0, p0, LAk;->Y:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LAk;->W:Landroid/widget/ImageView;

    const v1, 0x7f080176

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, p0, LAk;->W:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->clearColorFilter()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, LAk;->W:Landroid/widget/ImageView;

    const v1, 0x7f080177

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, p0, LAk;->W:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f060341

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, v1, v2}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    :goto_0
    return-void
.end method

.method public final w(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 10

    invoke-virtual {p0}, Lc4;->V()Lji;

    move-result-object p1

    invoke-virtual {p0}, Lc4;->W()Landroid/widget/ScrollView;

    move-result-object p2

    new-instance v0, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-virtual {p2, v0}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    invoke-virtual {p0}, Lc4;->S()Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "favoriteThemes"

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v2

    iput-object v2, p0, LAk;->X:Ljava/util/Set;

    if-nez v2, :cond_0

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, p0, LAk;->X:Ljava/util/Set;

    :cond_0
    new-instance v2, Ljava/util/HashSet;

    iget-object v3, p0, LAk;->X:Ljava/util/Set;

    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object v2, p0, LAk;->X:Ljava/util/Set;

    const-string v2, "favoriteFilterEnabled"

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, p0, LAk;->Y:Z

    const v2, 0x7f1301c7

    invoke-virtual {p0, v2}, Lc4;->a0(I)Lii;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v2, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v4, 0x10

    invoke-virtual {v2, v4}, Landroid/widget/LinearLayout;->setGravity(I)V

    new-instance v5, LUn;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v6

    invoke-direct {v5, v6}, LUn;-><init>(Landroid/content/Context;)V

    invoke-virtual {v5, v3}, LUn;->setTitleVisible(Z)V

    const v6, 0x7f03000c

    const v7, 0x7f03000d

    invoke-virtual {v5, v6, v7}, LUn;->b(II)V

    const-string v6, "ipType"

    const-string v7, "1"

    invoke-interface {v1, v6, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, LUn;->setValue(Ljava/lang/String;)V

    new-instance v6, LN3;

    const/4 v7, 0x2

    invoke-direct {v6, v1, v7}, LN3;-><init>(Landroid/content/SharedPreferences;I)V

    invoke-virtual {v5, v6}, LUn;->setOnValueChanged(LTn;)V

    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v7, -0x2

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-direct {v6, v3, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v2, v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p0}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    new-instance v6, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v9

    invoke-direct {v6, v9}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v6, p0, LAk;->W:Landroid/widget/ImageView;

    const/high16 v6, 0x42100000    # 36.0f

    mul-float/2addr v6, v5

    float-to-int v6, v6

    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v9, v6, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/high16 v6, 0x41400000    # 12.0f

    mul-float/2addr v5, v6

    float-to-int v5, v5

    invoke-virtual {v9, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    iget-object v5, p0, LAk;->W:Landroid/widget/ImageView;

    invoke-virtual {v5, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p0}, LAk;->d0()V

    iget-object v5, p0, LAk;->W:Landroid/widget/ImageView;

    new-instance v6, LC3;

    const/4 v9, 0x2

    invoke-direct {v6, p0, v9, v1}, LC3;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v5, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v5, p0, LAk;->W:Landroid/widget/ImageView;

    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p0, v0, v4}, Lc4;->O(Landroid/widget/LinearLayout;I)V

    const v2, 0x7f1301ba

    invoke-virtual {p0, v2}, Lc4;->a0(I)Lii;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, Lbo;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v2, v4}, Lbo;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, LAk;->U:Lbo;

    iget-object v4, p0, LAk;->X:Ljava/util/Set;

    invoke-virtual {v2, v4}, Lbo;->setFavorites(Ljava/util/Set;)V

    iget-object v2, p0, LAk;->U:Lbo;

    iget-boolean v4, p0, LAk;->Y:Z

    invoke-virtual {v2, v4}, Lbo;->setFavoriteFilterEnabled(Z)V

    iget-object v2, p0, LAk;->U:Lbo;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, LBr;->h(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v2, v4}, Lbo;->setItems(Ljava/util/List;)V

    iget-object v2, p0, LAk;->U:Lbo;

    const-string v4, "selectedTheme"

    const-string v5, "Audi Virtual Cockpit"

    invoke-interface {v1, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Lbo;->setSelectedValue(Ljava/lang/String;)V

    iget-object v2, p0, LAk;->U:Lbo;

    new-instance v4, Lzk;

    invoke-direct {v4, p0, v1}, Lzk;-><init>(LAk;Landroid/content/SharedPreferences;)V

    invoke-virtual {v2, v4}, Lbo;->setOnThemeSelected(Lao;)V

    iget-object v2, p0, LAk;->U:Lbo;

    new-instance v4, Lzk;

    invoke-direct {v4, p0, v1}, Lzk;-><init>(LAk;Landroid/content/SharedPreferences;)V

    invoke-virtual {v2, v4}, Lbo;->setOnFavoriteToggle(LZn;)V

    iget-object v1, p0, LAk;->U:Lbo;

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v4, -0x1

    invoke-direct {v2, v4, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    const v1, 0x7f1301fe

    invoke-virtual {p0, v1}, Lc4;->a0(I)Lii;

    move-result-object v1

    iput-object v1, p0, LAk;->V:Lii;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, LAk;->V:Lii;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v0, v4, v3, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {p1, p2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance p2, LE0;

    const/4 v0, 0x1

    invoke-direct {p2, v0}, LE0;-><init>(I)V

    const v0, 0x7f1301d8

    invoke-virtual {p0, v0, p2}, Lc4;->Z(ILjava/lang/Runnable;)Landroid/widget/Button;

    move-result-object p2

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v0, v4, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0xc

    invoke-virtual {p0, v1}, Lc4;->P(I)I

    move-result v1

    iput v1, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    invoke-virtual {p2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p0}, LAk;->c0()V

    return-object p1
.end method
