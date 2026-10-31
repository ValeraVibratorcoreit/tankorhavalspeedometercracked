.class public final LT3;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"

# interfaces
.implements Lqq;


# instance fields
.field public final a:Ljava/lang/ref/WeakReference;

.field public final b:Lgi;

.field public final c:Lrq;

.field public final d:Landroid/graphics/Rect;

.field public final e:LV3;

.field public f:F

.field public g:F

.field public final h:I

.field public i:F

.field public j:F

.field public k:F

.field public l:Ljava/lang/ref/WeakReference;

.field public m:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 11

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, LT3;->a:Ljava/lang/ref/WeakReference;

    sget-object v1, Lmk;->i:[I

    const-string v2, "Theme.MaterialComponents"

    invoke-static {p1, v1, v2}, Lmk;->d(Landroid/content/Context;[ILjava/lang/String;)V

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, LT3;->d:Landroid/graphics/Rect;

    new-instance v1, Lrq;

    invoke-direct {v1, p0}, Lrq;-><init>(Lqq;)V

    iput-object v1, p0, LT3;->c:Lrq;

    iget-object v2, v1, Lrq;->a:Landroid/text/TextPaint;

    sget-object v3, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    new-instance v3, LV3;

    invoke-direct {v3, p1}, LV3;-><init>(Landroid/content/Context;)V

    iput-object v3, p0, LT3;->e:LV3;

    new-instance v4, Lgi;

    invoke-virtual {p0}, LT3;->e()Z

    move-result v5

    iget-object v3, v3, LV3;->b:LU3;

    if-eqz v5, :cond_0

    iget-object v5, v3, LU3;->g:Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    goto :goto_0

    :cond_0
    iget-object v5, v3, LU3;->e:Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    :goto_0
    invoke-virtual {p0}, LT3;->e()Z

    move-result v6

    if-eqz v6, :cond_1

    iget-object v6, v3, LU3;->h:Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    goto :goto_1

    :cond_1
    iget-object v6, v3, LU3;->f:Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    :goto_1
    new-instance v7, Li;

    const/4 v8, 0x0

    int-to-float v9, v8

    invoke-direct {v7, v9}, Li;-><init>(F)V

    invoke-static {p1, v5, v6, v7}, Lpo;->a(Landroid/content/Context;IILi;)Loo;

    move-result-object p1

    invoke-virtual {p1}, Loo;->a()Lpo;

    move-result-object p1

    invoke-direct {v4, p1}, Lgi;-><init>(Lpo;)V

    iput-object v4, p0, LT3;->b:Lgi;

    invoke-virtual {p0}, LT3;->g()V

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    new-instance v0, Loq;

    iget-object v5, v3, LU3;->d:Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-direct {v0, p1, v5}, Loq;-><init>(Landroid/content/Context;I)V

    iget-object v5, v1, Lrq;->g:Loq;

    if-ne v5, v0, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v1, v0, p1}, Lrq;->b(Loq;Landroid/content/Context;)V

    iget-object p1, v3, LU3;->c:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    invoke-virtual {p0}, LT3;->i()V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :goto_2
    iget p1, v3, LU3;->l:I

    const/4 v0, -0x2

    const/4 v5, 0x1

    if-eq p1, v0, :cond_4

    int-to-double v6, p1

    const-wide/high16 v9, 0x3ff0000000000000L    # 1.0

    sub-double/2addr v6, v9

    const-wide/high16 v9, 0x4024000000000000L    # 10.0

    invoke-static {v9, v10, v6, v7}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v6

    double-to-int p1, v6

    sub-int/2addr p1, v5

    iput p1, p0, LT3;->h:I

    goto :goto_3

    :cond_4
    iget p1, v3, LU3;->m:I

    iput p1, p0, LT3;->h:I

    :goto_3
    iput-boolean v5, v1, Lrq;->e:Z

    invoke-virtual {p0}, LT3;->i()V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    iput-boolean v5, v1, Lrq;->e:Z

    invoke-virtual {p0}, LT3;->g()V

    invoke-virtual {p0}, LT3;->i()V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    invoke-virtual {p0}, LT3;->getAlpha()I

    move-result p1

    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    iget-object p1, v3, LU3;->b:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    iget-object v0, v4, Lgi;->a:Lfi;

    iget-object v0, v0, Lfi;->c:Landroid/content/res/ColorStateList;

    if-eq v0, p1, :cond_5

    invoke-virtual {v4, p1}, Lgi;->l(Landroid/content/res/ColorStateList;)V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    :cond_5
    iget-object p1, v3, LU3;->c:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    iget-object p1, p0, LT3;->l:Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_7

    iget-object p1, p0, LT3;->l:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    iget-object v0, p0, LT3;->m:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    goto :goto_4

    :cond_6
    const/4 v0, 0x0

    :goto_4
    invoke-virtual {p0, p1, v0}, LT3;->h(Landroid/view/View;Landroid/widget/FrameLayout;)V

    :cond_7
    invoke-virtual {p0}, LT3;->i()V

    iget-object p1, v3, LU3;->t:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1, v8}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final b()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, LT3;->e:LV3;

    iget-object v1, v0, LV3;->b:LU3;

    iget-object v2, v1, LU3;->j:Ljava/lang/String;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_0

    move v5, v4

    goto :goto_0

    :cond_0
    move v5, v3

    :goto_0
    iget-object v6, p0, LT3;->a:Ljava/lang/ref/WeakReference;

    const-string v7, ""

    const/4 v8, -0x2

    if-eqz v5, :cond_4

    iget v0, v1, LU3;->l:I

    if-ne v0, v8, :cond_1

    goto :goto_1

    :cond_1
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v1

    if-le v1, v0, :cond_3

    invoke-virtual {v6}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    if-nez v1, :cond_2

    move-object v2, v7

    goto :goto_1

    :cond_2
    sub-int/2addr v0, v4

    invoke-virtual {v2, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const v2, 0x7f13006c

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "\u2026"

    filled-new-array {v0, v2}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    :cond_3
    :goto_1
    return-object v2

    :cond_4
    invoke-virtual {p0}, LT3;->f()Z

    move-result v1

    if-eqz v1, :cond_8

    iget v1, p0, LT3;->h:I

    iget-object v0, v0, LV3;->b:LU3;

    if-eq v1, v8, :cond_7

    invoke-virtual {p0}, LT3;->d()I

    move-result v1

    iget v2, p0, LT3;->h:I

    if-gt v1, v2, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v6}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    if-nez v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v0, v0, LU3;->n:Ljava/util/Locale;

    const v2, 0x7f1300a1

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget v2, p0, LT3;->h:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "+"

    filled-new-array {v2, v3}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    goto :goto_3

    :cond_7
    :goto_2
    iget-object v0, v0, LU3;->n:Ljava/util/Locale;

    invoke-static {v0}, Ljava/text/NumberFormat;->getInstance(Ljava/util/Locale;)Ljava/text/NumberFormat;

    move-result-object v0

    invoke-virtual {p0}, LT3;->d()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    move-result-object v7

    :goto_3
    return-object v7

    :cond_8
    const/4 v0, 0x0

    return-object v0
.end method

.method public final c()Landroid/widget/FrameLayout;
    .locals 1

    iget-object v0, p0, LT3;->m:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final d()I
    .locals 2

    iget-object v0, p0, LT3;->e:LV3;

    iget-object v0, v0, LV3;->b:LU3;

    iget v0, v0, LU3;->k:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 6

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, LT3;->getAlpha()I

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, p0, LT3;->b:Lgi;

    invoke-virtual {v0, p1}, Lgi;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {p0}, LT3;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, LT3;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iget-object v2, p0, LT3;->c:Lrq;

    iget-object v3, v2, Lrq;->a:Landroid/text/TextPaint;

    const/4 v4, 0x0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    invoke-virtual {v3, v0, v4, v5, v1}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    iget v3, p0, LT3;->g:F

    invoke-virtual {v1}, Landroid/graphics/Rect;->exactCenterY()F

    move-result v4

    sub-float/2addr v3, v4

    iget v4, p0, LT3;->f:F

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    if-gtz v1, :cond_1

    float-to-int v1, v3

    :goto_0
    int-to-float v1, v1

    goto :goto_1

    :cond_1
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v1

    goto :goto_0

    :goto_1
    iget-object v2, v2, Lrq;->a:Landroid/text/TextPaint;

    invoke-virtual {p1, v0, v4, v1, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_2
    :goto_2
    return-void
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, LT3;->e:LV3;

    iget-object v0, v0, LV3;->b:LU3;

    iget-object v0, v0, LU3;->j:Ljava/lang/String;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LT3;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public final f()Z
    .locals 2

    iget-object v0, p0, LT3;->e:LV3;

    iget-object v0, v0, LV3;->b:LU3;

    iget-object v1, v0, LU3;->j:Ljava/lang/String;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget v0, v0, LU3;->k:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method public final g()V
    .locals 5

    iget-object v0, p0, LT3;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, LT3;->e()Z

    move-result v1

    iget-object v2, p0, LT3;->e:LV3;

    if-eqz v1, :cond_1

    iget-object v1, v2, LV3;->b:LU3;

    iget-object v1, v1, LU3;->g:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_0

    :cond_1
    iget-object v1, v2, LV3;->b:LU3;

    iget-object v1, v1, LU3;->e:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :goto_0
    invoke-virtual {p0}, LT3;->e()Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v2, v2, LV3;->b:LU3;

    iget-object v2, v2, LU3;->h:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_1

    :cond_2
    iget-object v2, v2, LV3;->b:LU3;

    iget-object v2, v2, LU3;->f:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    :goto_1
    new-instance v3, Li;

    const/4 v4, 0x0

    int-to-float v4, v4

    invoke-direct {v3, v4}, Li;-><init>(F)V

    invoke-static {v0, v1, v2, v3}, Lpo;->a(Landroid/content/Context;IILi;)Loo;

    move-result-object v0

    invoke-virtual {v0}, Loo;->a()Lpo;

    move-result-object v0

    iget-object v1, p0, LT3;->b:Lgi;

    invoke-virtual {v1, v0}, Lgi;->setShapeAppearanceModel(Lpo;)V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final getAlpha()I
    .locals 1

    iget-object v0, p0, LT3;->e:LV3;

    iget-object v0, v0, LV3;->b:LU3;

    iget v0, v0, LU3;->i:I

    return v0
.end method

.method public final getIntrinsicHeight()I
    .locals 1

    iget-object v0, p0, LT3;->d:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    return v0
.end method

.method public final getIntrinsicWidth()I
    .locals 1

    iget-object v0, p0, LT3;->d:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v0

    return v0
.end method

.method public final getOpacity()I
    .locals 1

    const/4 v0, -0x3

    return v0
.end method

.method public final h(Landroid/view/View;Landroid/widget/FrameLayout;)V
    .locals 1

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, LT3;->l:Ljava/lang/ref/WeakReference;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, LT3;->m:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    invoke-virtual {p0}, LT3;->i()V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final i()V
    .locals 14

    iget-object v0, p0, LT3;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    iget-object v2, p0, LT3;->l:Ljava/lang/ref/WeakReference;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    if-eqz v1, :cond_1f

    if-nez v2, :cond_1

    goto/16 :goto_14

    :cond_1
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iget-object v4, p0, LT3;->d:Landroid/graphics/Rect;

    invoke-virtual {v1, v4}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    new-instance v5, Landroid/graphics/Rect;

    invoke-direct {v5}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {v2, v5}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    iget-object v6, p0, LT3;->m:Ljava/lang/ref/WeakReference;

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    :cond_2
    if-nez v3, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v3, v2, v5}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    :goto_1
    invoke-virtual {p0}, LT3;->e()Z

    move-result v3

    iget-object v6, p0, LT3;->e:LV3;

    if-eqz v3, :cond_4

    iget v3, v6, LV3;->d:F

    goto :goto_2

    :cond_4
    iget v3, v6, LV3;->c:F

    :goto_2
    iput v3, p0, LT3;->i:F

    const/high16 v7, -0x40800000    # -1.0f

    cmpl-float v8, v3, v7

    const/high16 v9, 0x40000000    # 2.0f

    if-eqz v8, :cond_5

    iput v3, p0, LT3;->j:F

    iput v3, p0, LT3;->k:F

    goto :goto_7

    :cond_5
    invoke-virtual {p0}, LT3;->e()Z

    move-result v3

    if-eqz v3, :cond_6

    iget v3, v6, LV3;->g:F

    :goto_3
    div-float/2addr v3, v9

    goto :goto_4

    :cond_6
    iget v3, v6, LV3;->e:F

    goto :goto_3

    :goto_4
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    int-to-float v3, v3

    iput v3, p0, LT3;->j:F

    invoke-virtual {p0}, LT3;->e()Z

    move-result v3

    if-eqz v3, :cond_7

    iget v3, v6, LV3;->h:F

    :goto_5
    div-float/2addr v3, v9

    goto :goto_6

    :cond_7
    iget v3, v6, LV3;->f:F

    goto :goto_5

    :goto_6
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    int-to-float v3, v3

    iput v3, p0, LT3;->k:F

    :goto_7
    invoke-virtual {p0}, LT3;->e()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-virtual {p0}, LT3;->b()Ljava/lang/String;

    move-result-object v3

    iget v8, p0, LT3;->j:F

    iget-object v10, p0, LT3;->c:Lrq;

    iget-boolean v11, v10, Lrq;->e:Z

    if-nez v11, :cond_8

    iget v11, v10, Lrq;->c:F

    goto :goto_8

    :cond_8
    invoke-virtual {v10, v3}, Lrq;->a(Ljava/lang/String;)V

    iget v11, v10, Lrq;->c:F

    :goto_8
    div-float/2addr v11, v9

    iget-object v12, v6, LV3;->b:LU3;

    iget-object v12, v12, LU3;->u:Ljava/lang/Integer;

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    int-to-float v12, v12

    add-float/2addr v11, v12

    invoke-static {v8, v11}, Ljava/lang/Math;->max(FF)F

    move-result v8

    iput v8, p0, LT3;->j:F

    iget v8, p0, LT3;->k:F

    iget-boolean v11, v10, Lrq;->e:Z

    if-nez v11, :cond_9

    iget v3, v10, Lrq;->d:F

    goto :goto_9

    :cond_9
    invoke-virtual {v10, v3}, Lrq;->a(Ljava/lang/String;)V

    iget v3, v10, Lrq;->d:F

    :goto_9
    div-float/2addr v3, v9

    iget-object v9, v6, LV3;->b:LU3;

    iget-object v9, v9, LU3;->v:Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    int-to-float v9, v9

    add-float/2addr v3, v9

    invoke-static {v8, v3}, Ljava/lang/Math;->max(FF)F

    move-result v3

    iput v3, p0, LT3;->k:F

    iget v8, p0, LT3;->j:F

    invoke-static {v8, v3}, Ljava/lang/Math;->max(FF)F

    move-result v3

    iput v3, p0, LT3;->j:F

    :cond_a
    iget-object v3, v6, LV3;->b:LU3;

    iget-object v3, v3, LU3;->x:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {p0}, LT3;->e()Z

    move-result v8

    iget-object v9, v6, LV3;->b:LU3;

    const/4 v10, 0x0

    if-eqz v8, :cond_b

    iget-object v3, v9, LU3;->z:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    if-eqz v0, :cond_b

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->fontScale:F

    const/high16 v8, 0x3f800000    # 1.0f

    sub-float/2addr v0, v8

    const v11, 0x3e99999a    # 0.3f

    invoke-static {v10, v8, v11, v8, v0}, Ll1;->b(FFFFF)F

    move-result v0

    iget-object v8, v9, LU3;->C:Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    sub-int v8, v3, v8

    invoke-static {v3, v8, v0}, Ll1;->c(IIF)I

    move-result v3

    :cond_b
    iget v0, v6, LV3;->k:I

    if-nez v0, :cond_c

    iget v8, p0, LT3;->k:F

    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    move-result v8

    sub-int/2addr v3, v8

    :cond_c
    iget-object v8, v9, LU3;->B:Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    add-int/2addr v8, v3

    iget-object v3, v9, LU3;->s:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const v11, 0x800053

    if-eq v3, v11, :cond_d

    const v12, 0x800055

    if-eq v3, v12, :cond_d

    iget v3, v5, Landroid/graphics/Rect;->top:I

    add-int/2addr v3, v8

    int-to-float v3, v3

    iput v3, p0, LT3;->g:F

    goto :goto_a

    :cond_d
    iget v3, v5, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v3, v8

    int-to-float v3, v3

    iput v3, p0, LT3;->g:F

    :goto_a
    invoke-virtual {p0}, LT3;->e()Z

    move-result v3

    if-eqz v3, :cond_e

    iget-object v3, v9, LU3;->y:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    goto :goto_b

    :cond_e
    iget-object v3, v9, LU3;->w:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    :goto_b
    const/4 v8, 0x1

    if-ne v0, v8, :cond_10

    invoke-virtual {p0}, LT3;->e()Z

    move-result v0

    if-eqz v0, :cond_f

    iget v0, v6, LV3;->j:I

    goto :goto_c

    :cond_f
    iget v0, v6, LV3;->i:I

    :goto_c
    add-int/2addr v3, v0

    :cond_10
    iget-object v0, v9, LU3;->A:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/2addr v0, v3

    iget-object v3, v9, LU3;->s:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const v6, 0x800033

    if-eq v3, v6, :cond_12

    if-eq v3, v11, :cond_12

    sget-object v3, LGs;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v2}, Landroid/view/View;->getLayoutDirection()I

    move-result v3

    if-nez v3, :cond_11

    iget v3, v5, Landroid/graphics/Rect;->right:I

    int-to-float v3, v3

    iget v5, p0, LT3;->j:F

    add-float/2addr v3, v5

    int-to-float v0, v0

    sub-float/2addr v3, v0

    goto :goto_d

    :cond_11
    iget v3, v5, Landroid/graphics/Rect;->left:I

    int-to-float v3, v3

    iget v5, p0, LT3;->j:F

    sub-float/2addr v3, v5

    int-to-float v0, v0

    add-float/2addr v3, v0

    :goto_d
    iput v3, p0, LT3;->f:F

    goto :goto_f

    :cond_12
    sget-object v3, LGs;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v2}, Landroid/view/View;->getLayoutDirection()I

    move-result v3

    if-nez v3, :cond_13

    iget v3, v5, Landroid/graphics/Rect;->left:I

    int-to-float v3, v3

    iget v5, p0, LT3;->j:F

    sub-float/2addr v3, v5

    int-to-float v0, v0

    add-float/2addr v3, v0

    goto :goto_e

    :cond_13
    iget v3, v5, Landroid/graphics/Rect;->right:I

    int-to-float v3, v3

    iget v5, p0, LT3;->j:F

    add-float/2addr v3, v5

    int-to-float v0, v0

    sub-float/2addr v3, v0

    :goto_e
    iput v3, p0, LT3;->f:F

    :goto_f
    iget-object v0, v9, LU3;->D:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1d

    invoke-virtual {p0}, LT3;->c()Landroid/widget/FrameLayout;

    move-result-object v0

    if-nez v0, :cond_15

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Landroid/view/View;

    if-nez v0, :cond_14

    goto/16 :goto_13

    :cond_14
    invoke-virtual {v2}, Landroid/view/View;->getY()F

    move-result v0

    invoke-virtual {v2}, Landroid/view/View;->getX()F

    move-result v3

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    move-object v13, v2

    move v2, v0

    move-object v0, v13

    goto :goto_10

    :cond_15
    invoke-virtual {p0}, LT3;->c()Landroid/widget/FrameLayout;

    move-result-object v2

    if-eqz v2, :cond_17

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v2

    const v3, 0x7f0b01ad

    if-ne v2, v3, :cond_17

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    instance-of v2, v2, Landroid/view/View;

    if-nez v2, :cond_16

    goto/16 :goto_13

    :cond_16
    invoke-virtual {v0}, Landroid/view/View;->getY()F

    move-result v2

    invoke-virtual {v0}, Landroid/view/View;->getX()F

    move-result v3

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    goto :goto_10

    :cond_17
    move v2, v10

    move v3, v2

    :goto_10
    iget v5, p0, LT3;->g:F

    iget v6, p0, LT3;->k:F

    sub-float/2addr v5, v6

    invoke-virtual {v0}, Landroid/view/View;->getY()F

    move-result v6

    add-float/2addr v6, v5

    add-float/2addr v6, v2

    iget v5, p0, LT3;->f:F

    iget v8, p0, LT3;->j:F

    sub-float/2addr v5, v8

    invoke-virtual {v0}, Landroid/view/View;->getX()F

    move-result v8

    add-float/2addr v8, v5

    add-float/2addr v8, v3

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v5

    instance-of v5, v5, Landroid/view/View;

    if-eqz v5, :cond_18

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v5

    check-cast v5, Landroid/view/View;

    iget v9, p0, LT3;->g:F

    iget v11, p0, LT3;->k:F

    add-float/2addr v9, v11

    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    move-result v5

    int-to-float v5, v5

    invoke-virtual {v0}, Landroid/view/View;->getY()F

    move-result v11

    sub-float/2addr v5, v11

    sub-float/2addr v9, v5

    add-float/2addr v9, v2

    goto :goto_11

    :cond_18
    move v9, v10

    :goto_11
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    instance-of v2, v2, Landroid/view/View;

    if-eqz v2, :cond_19

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    iget v5, p0, LT3;->f:F

    iget v11, p0, LT3;->j:F

    add-float/2addr v5, v11

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0}, Landroid/view/View;->getX()F

    move-result v0

    sub-float/2addr v2, v0

    sub-float/2addr v5, v2

    add-float/2addr v5, v3

    goto :goto_12

    :cond_19
    move v5, v10

    :goto_12
    cmpg-float v0, v6, v10

    if-gez v0, :cond_1a

    iget v0, p0, LT3;->g:F

    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v2

    add-float/2addr v2, v0

    iput v2, p0, LT3;->g:F

    :cond_1a
    cmpg-float v0, v8, v10

    if-gez v0, :cond_1b

    iget v0, p0, LT3;->f:F

    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    move-result v2

    add-float/2addr v2, v0

    iput v2, p0, LT3;->f:F

    :cond_1b
    cmpl-float v0, v9, v10

    if-lez v0, :cond_1c

    iget v0, p0, LT3;->g:F

    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    move-result v2

    sub-float/2addr v0, v2

    iput v0, p0, LT3;->g:F

    :cond_1c
    cmpl-float v0, v5, v10

    if-lez v0, :cond_1d

    iget v0, p0, LT3;->f:F

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v2

    sub-float/2addr v0, v2

    iput v0, p0, LT3;->f:F

    :cond_1d
    :goto_13
    iget v0, p0, LT3;->f:F

    iget v2, p0, LT3;->g:F

    iget v3, p0, LT3;->j:F

    iget v5, p0, LT3;->k:F

    sub-float v6, v0, v3

    float-to-int v6, v6

    sub-float v8, v2, v5

    float-to-int v8, v8

    add-float/2addr v0, v3

    float-to-int v0, v0

    add-float/2addr v2, v5

    float-to-int v2, v2

    invoke-virtual {v4, v6, v8, v0, v2}, Landroid/graphics/Rect;->set(IIII)V

    iget v0, p0, LT3;->i:F

    cmpl-float v2, v0, v7

    iget-object v3, p0, LT3;->b:Lgi;

    if-eqz v2, :cond_1e

    iget-object v2, v3, Lgi;->a:Lfi;

    iget-object v2, v2, Lfi;->a:Lpo;

    invoke-virtual {v2}, Lpo;->e()Loo;

    move-result-object v2

    new-instance v5, Li;

    invoke-direct {v5, v0}, Li;-><init>(F)V

    iput-object v5, v2, Loo;->e:LR7;

    new-instance v5, Li;

    invoke-direct {v5, v0}, Li;-><init>(F)V

    iput-object v5, v2, Loo;->f:LR7;

    new-instance v5, Li;

    invoke-direct {v5, v0}, Li;-><init>(F)V

    iput-object v5, v2, Loo;->g:LR7;

    new-instance v5, Li;

    invoke-direct {v5, v0}, Li;-><init>(F)V

    iput-object v5, v2, Loo;->h:LR7;

    invoke-virtual {v2}, Loo;->a()Lpo;

    move-result-object v0

    invoke-virtual {v3, v0}, Lgi;->setShapeAppearanceModel(Lpo;)V

    :cond_1e
    invoke-virtual {v1, v4}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1f

    invoke-virtual {v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    :cond_1f
    :goto_14
    return-void
.end method

.method public final isStateful()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final onStateChange([I)Z
    .locals 0

    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onStateChange([I)Z

    move-result p1

    return p1
.end method

.method public final setAlpha(I)V
    .locals 2

    iget-object v0, p0, LT3;->e:LV3;

    iget-object v1, v0, LV3;->a:LU3;

    iput p1, v1, LU3;->i:I

    iget-object v0, v0, LV3;->b:LU3;

    iput p1, v0, LU3;->i:I

    iget-object p1, p0, LT3;->c:Lrq;

    iget-object p1, p1, Lrq;->a:Landroid/text/TextPaint;

    invoke-virtual {p0}, LT3;->getAlpha()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    return-void
.end method
