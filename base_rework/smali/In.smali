.class public final LIn;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    if-ge v1, v3, :cond_1

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    instance-of v3, v3, LSn;

    if-eqz v3, :cond_0

    add-int/lit8 v2, v2, 0x1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    move v1, v0

    move v3, v1

    :goto_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v4

    if-ge v1, v4, :cond_6

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    instance-of v5, v4, LSn;

    if-nez v5, :cond_2

    goto :goto_3

    :cond_2
    check-cast v4, LSn;

    const/4 v5, 0x1

    if-ne v2, v5, :cond_3

    const/4 v5, 0x3

    invoke-virtual {v4, v5}, LSn;->setPosition(I)V

    goto :goto_2

    :cond_3
    if-nez v3, :cond_4

    invoke-virtual {v4, v0}, LSn;->setPosition(I)V

    goto :goto_2

    :cond_4
    add-int/lit8 v6, v2, -0x1

    if-ne v3, v6, :cond_5

    const/4 v5, 0x2

    invoke-virtual {v4, v5}, LSn;->setPosition(I)V

    goto :goto_2

    :cond_5
    invoke-virtual {v4, v5}, LSn;->setPosition(I)V

    :goto_2
    add-int/lit8 v3, v3, 0x1

    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_6
    return-void
.end method

.method public final onViewAdded(Landroid/view/View;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onViewAdded(Landroid/view/View;)V

    invoke-virtual {p0}, LIn;->a()V

    return-void
.end method

.method public final onViewRemoved(Landroid/view/View;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onViewRemoved(Landroid/view/View;)V

    invoke-virtual {p0}, LIn;->a()V

    return-void
.end method
