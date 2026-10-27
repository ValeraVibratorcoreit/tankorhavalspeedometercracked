.class public final synthetic LXn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Lbo;

.field public final synthetic b:LYn;

.field public final synthetic c:Landroid/widget/ImageView;

.field public final synthetic d:Landroid/widget/LinearLayout;


# direct methods
.method public synthetic constructor <init>(Lbo;LYn;Landroid/widget/ImageView;Landroid/widget/LinearLayout;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LXn;->a:Lbo;

    iput-object p2, p0, LXn;->b:LYn;

    iput-object p3, p0, LXn;->c:Landroid/widget/ImageView;

    iput-object p4, p0, LXn;->d:Landroid/widget/LinearLayout;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 12

    iget-object p1, p0, LXn;->a:Lbo;

    iget-object v0, p1, Lbo;->d:Ljava/util/HashSet;

    iget-object v1, p0, LXn;->b:LYn;

    iget-object v2, v1, LYn;->a:Ljava/lang/String;

    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    iget-object v2, p0, LXn;->c:Landroid/widget/ImageView;

    const v3, 0x7f060341

    const v4, 0x7f080177

    const v5, 0x7f080176

    iget-object v1, v1, LYn;->a:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v6, p1, Lbo;->d:Ljava/util/HashSet;

    invoke-interface {v6, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {v2}, Landroid/widget/ImageView;->clearColorFilter()V

    goto :goto_0

    :cond_0
    iget-object v6, p1, Lbo;->d:Ljava/util/HashSet;

    invoke-interface {v6, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v6

    sget-object v7, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v2, v6, v7}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    :goto_0
    iget-object v2, p1, Lbo;->h:LZn;

    const/4 v6, 0x0

    if-eqz v2, :cond_5

    check-cast v2, Lzk;

    iget-object v7, v2, Lzk;->a:LAk;

    if-eqz v0, :cond_1

    iget-object v8, v7, LAk;->X:Ljava/util/Set;

    invoke-interface {v8, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    iget-object v8, v7, LAk;->X:Ljava/util/Set;

    invoke-interface {v8, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    :goto_1
    iget-object v1, v2, Lzk;->b:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    new-instance v2, Ljava/util/HashSet;

    iget-object v8, v7, LAk;->X:Ljava/util/Set;

    invoke-direct {v2, v8}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    const-string v8, "favoriteThemes"

    invoke-interface {v1, v8, v2}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    iget-object v1, v7, LAk;->U:Lbo;

    iget-object v2, v7, LAk;->X:Ljava/util/Set;

    invoke-virtual {v1, v2}, Lbo;->setFavorites(Ljava/util/Set;)V

    iget-object v1, v7, LAk;->U:Lbo;

    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    move v2, v6

    :goto_2
    iget-object v8, v1, Lbo;->a:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-ge v2, v9, :cond_4

    iget-object v9, v1, Lbo;->c:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v10

    if-ge v2, v10, :cond_4

    iget-object v10, v1, Lbo;->d:Ljava/util/HashSet;

    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LYn;

    iget-object v8, v8, LYn;->a:Ljava/lang/String;

    invoke-interface {v10, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/widget/ImageView;

    if-eqz v8, :cond_2

    move v11, v5

    goto :goto_3

    :cond_2
    move v11, v4

    :goto_3
    invoke-virtual {v10, v11}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/widget/ImageView;

    const/4 v11, 0x0

    invoke-virtual {v10, v11}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    if-nez v8, :cond_3

    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    invoke-virtual {v9, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v9

    sget-object v10, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v8, v9, v10}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_4
    invoke-virtual {v7}, LAk;->c0()V

    :cond_5
    iget-boolean p1, p1, Lbo;->e:Z

    if-eqz p1, :cond_6

    if-nez v0, :cond_6

    iget-object p1, p0, LXn;->d:Landroid/widget/LinearLayout;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    iput v6, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    :cond_6
    return-void
.end method
