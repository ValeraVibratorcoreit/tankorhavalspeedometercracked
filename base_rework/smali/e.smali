.class public abstract Le;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public a:Landroid/graphics/Bitmap;

.field public b:Landroid/graphics/Canvas;

.field public c:Landroid/graphics/Bitmap;

.field public d:Landroid/graphics/Canvas;

.field public e:I

.field public f:I

.field public g:I

.field public h:F

.field public i:Z

.field public final j:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/16 v0, 0x14

    iput v0, p0, Le;->f:I

    const/4 v0, 0x5

    iput v0, p0, Le;->g:I

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Le;->h:F

    const/4 v0, 0x0

    iput-boolean v0, p0, Le;->i:Z

    iput-boolean v0, p0, Le;->j:Z

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    sget-object v1, Ltl;->a:[I

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v1, v0, v0}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    :try_start_0
    iget-boolean v1, p0, Le;->j:Z

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Le;->j:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    throw v0
.end method


# virtual methods
.method public a()V
    .locals 5

    iget-boolean v0, p0, Le;->j:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    :goto_0
    iget v2, p0, Le;->e:I

    mul-int/lit8 v2, v2, 0x2

    sub-int v2, v0, v2

    const/4 v3, 0x1

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget v3, p0, Le;->g:I

    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v2, v3, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v2

    iput-object v2, p0, Le;->c:Landroid/graphics/Bitmap;

    new-instance v2, Landroid/graphics/Canvas;

    iget-object v3, p0, Le;->c:Landroid/graphics/Bitmap;

    invoke-direct {v2, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v2, p0, Le;->d:Landroid/graphics/Canvas;

    iget-object v2, p0, Le;->a:Landroid/graphics/Bitmap;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    if-ne v2, v0, :cond_1

    iget-object v2, p0, Le;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    if-eq v2, v1, :cond_3

    :cond_1
    iget-object v2, p0, Le;->a:Landroid/graphics/Bitmap;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    :cond_2
    invoke-static {v0, v1, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Le;->a:Landroid/graphics/Bitmap;

    new-instance v0, Landroid/graphics/Canvas;

    iget-object v1, p0, Le;->a:Landroid/graphics/Bitmap;

    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v0, p0, Le;->b:Landroid/graphics/Canvas;

    :cond_3
    return-void
.end method

.method public abstract b(Landroid/graphics/Canvas;)V
.end method

.method public abstract c(Landroid/graphics/Canvas;FF)V
.end method

.method public abstract d(F)V
.end method

.method public final e()V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f07006b

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Le;->f:I

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f07006a

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Le;->g:I

    iget v0, p0, Le;->f:I

    iput v0, p0, Le;->e:I

    iget-object v0, p0, Le;->c:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Le;->a()V

    :cond_0
    iget-object v0, p0, Le;->d:Landroid/graphics/Canvas;

    invoke-virtual {p0, v0}, Le;->b(Landroid/graphics/Canvas;)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 8

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget-boolean v0, p0, Le;->j:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    const/high16 v3, -0x3d4c0000    # -90.0f

    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->rotate(F)V

    neg-int v3, v0

    int-to-float v3, v3

    invoke-virtual {p1, v3, v1}, Landroid/graphics/Canvas;->translate(FF)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    :goto_0
    iget-object v3, p0, Le;->c:Landroid/graphics/Bitmap;

    if-eqz v3, :cond_1

    iget-object v3, p0, Le;->b:Landroid/graphics/Canvas;

    if-eqz v3, :cond_1

    const/4 v4, 0x0

    sget-object v5, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v3, v4, v5}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    iget-object v3, p0, Le;->b:Landroid/graphics/Canvas;

    iget-object v4, p0, Le;->c:Landroid/graphics/Bitmap;

    iget v5, p0, Le;->e:I

    int-to-float v5, v5

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    sub-int v6, v2, v6

    div-int/lit8 v6, v6, 0x2

    int-to-float v6, v6

    const/4 v7, 0x0

    invoke-virtual {v3, v4, v5, v6, v7}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    iget v3, p0, Le;->f:I

    int-to-float v4, v3

    iget v5, p0, Le;->h:F

    mul-int/lit8 v3, v3, 0x2

    sub-int/2addr v0, v3

    int-to-float v0, v0

    mul-float/2addr v5, v0

    add-float/2addr v5, v4

    int-to-float v0, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v0, v2

    iget-object v2, p0, Le;->b:Landroid/graphics/Canvas;

    invoke-virtual {p0, v2, v5, v0}, Le;->c(Landroid/graphics/Canvas;FF)V

    iget-object v0, p0, Le;->a:Landroid/graphics/Bitmap;

    invoke-virtual {p1, v0, v1, v1, v7}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    :cond_1
    return-void
.end method

.method public final onMeasure(II)V
    .locals 4

    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    const/high16 v2, -0x80000000

    const/4 v3, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    if-ne v0, v2, :cond_1

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    goto :goto_0

    :cond_1
    if-ne v0, v1, :cond_2

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    goto :goto_0

    :cond_2
    move p1, v3

    :goto_0
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    if-ne v0, v2, :cond_4

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    goto :goto_1

    :cond_4
    if-ne v0, v1, :cond_5

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p2

    goto :goto_1

    :cond_5
    move p2, v3

    :goto_1
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    invoke-virtual {p0}, Le;->e()V

    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-eq v0, v1, :cond_0

    const/4 v2, 0x2

    if-eq v0, v2, :cond_1

    goto :goto_1

    :cond_0
    iget p1, p0, Le;->h:F

    invoke-virtual {p0, p1}, Le;->d(F)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Le;->c:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Le;->j:Z

    const/high16 v2, 0x3f800000    # 1.0f

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iget v0, p0, Le;->e:I

    int-to-float v0, v0

    sub-float/2addr p1, v0

    iget-object v0, p0, Le;->c:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p1, v0

    sub-float p1, v2, p1

    iput p1, p0, Le;->h:F

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    iget v0, p0, Le;->e:I

    int-to-float v0, v0

    sub-float/2addr p1, v0

    iget-object v0, p0, Le;->c:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p1, v0

    iput p1, p0, Le;->h:F

    :goto_0
    iget p1, p0, Le;->h:F

    invoke-static {p1, v2}, Ljava/lang/Math;->min(FF)F

    move-result p1

    const/4 v0, 0x0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    iput p1, p0, Le;->h:F

    invoke-virtual {p0, p1}, Le;->d(F)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_3
    :goto_1
    return v1
.end method

.method public setOnValueChangedListener(Lkk;)V
    .locals 0

    return-void
.end method

.method public setShowBorder(Z)V
    .locals 0

    iput-boolean p1, p0, Le;->i:Z

    return-void
.end method
