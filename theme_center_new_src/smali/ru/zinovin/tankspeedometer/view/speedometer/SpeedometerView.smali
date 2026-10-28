.class public Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public a:Landroid/graphics/drawable/Drawable;

.field public b:Landroid/graphics/drawable/Drawable;

.field public c:Landroid/graphics/Bitmap;

.field public final d:Landroid/graphics/Paint;

.field public final e:Ljava/util/ArrayList;

.field public f:F

.field public g:F

.field public h:F

.field public i:F

.field public j:F

.field public k:F

.field public l:F

.field public m:F

.field public n:F

.field public final o:Landroid/graphics/RectF;

.field public final p:Landroid/graphics/PointF;

.field public didSweep:Z



# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    sget-object p1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    const/4 v0, 0x1

    invoke-static {v0, v0, p1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->c:Landroid/graphics/Bitmap;

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->d:Landroid/graphics/Paint;

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, v0}, Landroid/graphics/Paint;-><init>(I)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->e:Ljava/util/ArrayList;

    const/high16 p1, -0x3d4c0000    # -90.0f

    iput p1, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->f:F

    const/high16 v1, 0x42b40000    # 90.0f

    iput v1, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->g:F

    const/4 v2, 0x0

    iput v2, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->h:F

    const/high16 v3, 0x42c80000    # 100.0f

    iput v3, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->i:F

    const/high16 v4, 0x3f800000    # 1.0f

    iput v4, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->j:F

    iput v2, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->k:F

    iput p1, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->l:F

    iput v2, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->m:F

    iput v2, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->n:F

    new-instance v5, Landroid/graphics/RectF;

    invoke-direct {v5}, Landroid/graphics/RectF;-><init>()V

    iput-object v5, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->o:Landroid/graphics/RectF;

    new-instance v5, Landroid/graphics/PointF;

    invoke-direct {v5}, Landroid/graphics/PointF;-><init>()V

    iput-object v5, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->p:Landroid/graphics/PointF;

    if-eqz p2, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    sget-object v6, Lvl;->c:[I

    invoke-virtual {v5, p2, v6}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    const/4 v5, 0x0

    invoke-virtual {p2, v5}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    iput-object v5, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->a:Landroid/graphics/drawable/Drawable;

    const/4 v5, 0x4

    invoke-virtual {p2, v5}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    iput-object v5, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->b:Landroid/graphics/drawable/Drawable;

    const/4 v5, 0x7

    invoke-virtual {p2, v5, p1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p1

    iput p1, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->f:F

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p1

    iput p1, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->g:F

    const/4 p1, 0x3

    invoke-virtual {p2, p1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p1

    iput p1, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->h:F

    const/4 p1, 0x2

    invoke-virtual {p2, p1, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p1

    iput p1, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->i:F

    const/4 p1, 0x5

    const/high16 v0, 0x3f000000    # 0.5f

    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    const/4 p1, 0x6

    invoke-virtual {p2, p1, v4}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result p1

    iput p1, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->j:F

    const v0, 0x3e4ccccd    # 0.2f

    cmpg-float p1, p1, v0

    if-gez p1, :cond_0

    iput v0, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->j:F

    :cond_0
    iget p1, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->j:F

    const v0, 0x3f99999a    # 1.2f

    cmpl-float p1, p1, v0

    if-lez p1, :cond_1

    iput v0, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->j:F

    :cond_1
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    :cond_2
    return-void
.end method

.method private getSize()I
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    return v0
.end method


# virtual methods
.method public final a(LBn;)V
    .locals 6

    iget-object v0, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LBn;

    iget v3, p1, LBn;->a:F

    iget v4, v1, LBn;->b:F

    sub-float/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    const v4, 0x3a83126f    # 0.001f

    cmpl-float v3, v3, v4

    if-gtz v3, :cond_3

    const/4 v3, 0x0

    iget v5, v1, LBn;->c:F

    sub-float/2addr v3, v5

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    cmpl-float v3, v3, v4

    if-gtz v3, :cond_3

    iget v3, v1, LBn;->a:F

    iget v1, v1, LBn;->b:F

    cmpg-float v1, v3, v1

    const/4 v3, 0x0

    if-gez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    iget v4, p1, LBn;->a:F

    iget v5, p1, LBn;->b:F

    cmpg-float v4, v4, v5

    if-gez v4, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    if-ne v1, v2, :cond_2

    goto :goto_2

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\u041d\u0430\u043f\u0440\u0430\u0432\u043b\u0435\u043d\u0438\u0435 \u0441\u0435\u043a\u0442\u043e\u0440\u043e\u0432 \u0434\u043e\u043b\u0436\u043d\u043e \u0441\u043e\u0432\u043f\u0430\u0434\u0430\u0442\u044c"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\u0421\u0435\u043a\u0442\u043e\u0440 \u0434\u043e\u043b\u0436\u0435\u043d \u043d\u0430\u0447\u0438\u043d\u0430\u0442\u044c\u0441\u044f \u0441 \u043a\u043e\u043d\u0446\u0430 \u043f\u0440\u0435\u0434\u044b\u0434\u0443\u0449\u0435\u0433\u043e"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_2
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->e()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final b(F)F
    .locals 5

    iget-object v0, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LBn;

    iget v2, v1, LBn;->a:F

    cmpl-float v3, p1, v2

    if-ltz v3, :cond_0

    iget v3, v1, LBn;->b:F

    cmpg-float v4, p1, v3

    if-gtz v4, :cond_0

    cmpl-float v0, p1, v2

    if-ltz v0, :cond_1

    cmpg-float v0, p1, v3

    if-gtz v0, :cond_1

    sub-float/2addr p1, v2

    sub-float/2addr v3, v2

    div-float/2addr p1, v3

    iget v0, v1, LBn;->c:F

    const/4 v1, 0x0

    sub-float/2addr v0, v1

    mul-float/2addr v0, p1

    add-float/2addr v0, v1

    goto :goto_0

    :cond_1
    const/high16 v0, -0x40800000    # -1.0f

    :goto_0
    return v0

    :cond_2
    iget v0, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->f:F

    sub-float/2addr p1, v0

    iget v1, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->g:F

    sub-float/2addr v1, v0

    div-float/2addr p1, v1

    iget v0, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->h:F

    iget v1, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->i:F

    sub-float/2addr v1, v0

    mul-float/2addr v1, p1

    add-float/2addr v1, v0

    return v1
.end method

.method public final c(F)V
    .locals 2

    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    if-gez v1, :cond_0

    move p1, v0

    :cond_0
    iget v0, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->i:F

    cmpl-float v1, p1, v0

    if-lez v1, :cond_1

    move p1, v0

    :cond_1
    invoke-virtual {p0, p1}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->f(F)F

    move-result p1

    iput p1, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->m:F

    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    return-void
.end method

.method public final d()V
    .locals 5

    invoke-direct {p0}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->getSize()I

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/Canvas;

    invoke-direct {v0}, Landroid/graphics/Canvas;-><init>()V

    goto :goto_0

    :cond_0
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->c:Landroid/graphics/Bitmap;

    new-instance v0, Landroid/graphics/Canvas;

    iget-object v1, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->c:Landroid/graphics/Bitmap;

    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    :goto_0
    iget-object v1, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->a:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroid/graphics/Canvas;->getWidth()I

    move-result v2

    invoke-virtual {v0}, Landroid/graphics/Canvas;->getHeight()I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {v1, v4, v4, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object v1, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_1
    return-void
.end method

.method public final e()V
    .locals 2

    iget-object v0, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LBn;

    iget v1, v1, LBn;->a:F

    iput v1, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->f:F

    const/4 v1, 0x0

    iput v1, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->h:F

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LBn;

    iget v1, v0, LBn;->b:F

    iput v1, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->g:F

    iget v0, v0, LBn;->c:F

    iput v0, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->i:F

    iget v0, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->k:F

    invoke-virtual {p0, v0}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->f(F)F

    move-result v0

    iput v0, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->l:F

    return-void
.end method

.method public final f(F)F
    .locals 3

    iget v0, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->h:F

    cmpg-float v1, p1, v0

    if-gez v1, :cond_0

    move p1, v0

    :cond_0
    iget v0, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->i:F

    cmpl-float v1, p1, v0

    if-lez v1, :cond_1

    move p1, v0

    :cond_1
    iget-object v0, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LBn;

    invoke-virtual {v1, p1}, LBn;->a(F)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v1, p1}, LBn;->a(F)Z

    move-result v0

    if-nez v0, :cond_3

    const/high16 p1, -0x40800000    # -1.0f

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    sub-float/2addr p1, v0

    iget v2, v1, LBn;->c:F

    sub-float/2addr v2, v0

    div-float/2addr p1, v2

    iget v0, v1, LBn;->b:F

    iget v1, v1, LBn;->a:F

    sub-float/2addr v0, v1

    mul-float/2addr v0, p1

    add-float p1, v0, v1

    :goto_0
    return p1

    :cond_4
    iget v0, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->h:F

    sub-float/2addr p1, v0

    iget v1, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->i:F

    sub-float/2addr v1, v0

    div-float/2addr p1, v1

    iget v0, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->f:F

    iget v1, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->g:F

    sub-float/2addr v1, v0

    mul-float/2addr v1, p1

    add-float/2addr v1, v0

    return v1
.end method

.method public getCurrentAngle()F
    .locals 1

    iget v0, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->l:F

    return v0
.end method

.method public getCurrentSector()LBn;
    .locals 3

    iget-object v0, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LBn;

    iget v2, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->k:F

    invoke-virtual {v1, v2}, LBn;->a(F)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public getCurrentValue()F
    .locals 1

    iget v0, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->k:F

    return v0
.end method

.method public getOverallEndAngle()F
    .locals 1

    iget v0, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->g:F

    return v0
.end method

.method public getOverallMaxValue()F
    .locals 1

    iget v0, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->i:F

    return v0
.end method

.method public getOverallMinValue()F
    .locals 1

    iget v0, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->h:F

    return v0
.end method

.method public getOverallStartAngle()F
    .locals 1

    iget v0, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->f:F

    return v0
.end method

.method public getSectors()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LBn;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->e:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public final onDetachedFromWindow()V
    .locals 0

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 3

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->c:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->d:Landroid/graphics/Paint;

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2, v2, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    iget-object v0, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->b:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget v0, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->n:F

    iget v1, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->m:F

    sub-float/2addr v1, v0

    const v2, 0x3da3d70a    # 0.08f

    mul-float/2addr v1, v2

    add-float/2addr v1, v0

    iput v1, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->n:F

    iget v0, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->l:F

    sub-float/2addr v1, v0

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v0

    const v2, 0x3d4ccccd    # 0.05f

    cmpl-float v0, v0, v2

    if-lez v0, :cond_1

    iget v0, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->l:F

    const v2, 0x3e3851ec    # 0.18f

    mul-float/2addr v1, v2

    add-float/2addr v1, v0

    iput v1, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->l:F

    invoke-virtual {p0, v1}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->b(F)F

    move-result v0

    iput v0, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->k:F

    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    goto :goto_0

    :cond_1
    iget v0, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->n:F

    iput v0, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->l:F

    invoke-virtual {p0, v0}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->b(F)F

    move-result v0

    iput v0, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->k:F

    :goto_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget-object v0, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->p:Landroid/graphics/PointF;

    iget v1, v0, Landroid/graphics/PointF;->x:F

    iget v2, v0, Landroid/graphics/PointF;->y:F

    invoke-virtual {p1, v1, v2}, Landroid/graphics/Canvas;->translate(FF)V

    iget v1, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->l:F

    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->rotate(F)V

    iget v1, v0, Landroid/graphics/PointF;->x:F

    neg-float v1, v1

    iget v0, v0, Landroid/graphics/PointF;->y:F

    neg-float v0, v0

    invoke-virtual {p1, v1, v0}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object v0, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->b:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    :goto_1
    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    iget-object p3, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->o:Landroid/graphics/RectF;

    int-to-float p1, p1

    int-to-float p2, p2

    const/4 p4, 0x0

    invoke-virtual {p3, p4, p4, p1, p2}, Landroid/graphics/RectF;->set(FFFF)V

    iget-object p1, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->p:Landroid/graphics/PointF;

    invoke-virtual {p3}, Landroid/graphics/RectF;->centerX()F

    move-result p2

    invoke-virtual {p3}, Landroid/graphics/RectF;->centerY()F

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/graphics/PointF;->set(FF)V

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->d()V

    iget-object p1, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->b:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->getSize()I

    move-result p2

    invoke-direct {p0}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->getSize()I

    move-result p3

    const/4 p4, 0x0

    invoke-virtual {p1, p4, p4, p2, p3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    :cond_0
    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->runSweep()V

    return-void
.end method

.method public final runSweep()V
    .locals 4

    iget-boolean v0, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->didSweep:Z

    if-nez v0, :cond_sweep_exit

    const/4 v0, 0x1

    iput-boolean v0, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->didSweep:Z

    const/4 v0, 0x3

    new-array v0, v0, [F

    fill-array-data v0, :array_sweep

    invoke-static {v0}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v0

    const-wide/16 v1, 0x578

    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    new-instance v1, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-instance v1, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView$SweepListener;

    invoke-direct {v1, p0}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView$SweepListener;-><init>(Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    :cond_sweep_exit
    return-void

    :array_sweep
    .array-data 4
        0x0
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public final forceSweep()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->didSweep:Z

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->runSweep()V

    return-void
.end method

.method protected onWindowVisibilityChanged(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->onWindowVisibilityChanged(I)V

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->forceSweep()V

    :cond_0
    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 0

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->forceSweep()V

    return-void
.end method

.method protected onVisibilityChanged(Landroid/view/View;I)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/view/View;->onVisibilityChanged(Landroid/view/View;I)V

    if-nez p2, :cond_0

    if-ne p1, p0, :cond_0

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->forceSweep()V

    :cond_0
    return-void
.end method


.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    iput-object p1, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->d()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setEffectRenderer(Lhp;)V
    .locals 0

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setNeedleDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    const-string v0, "T500.SVIEW"

    const-string v1, "setNeedleDrawable()"

    invoke-static {v0, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->b:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->getSize()I

    move-result v0

    invoke-direct {p0}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->getSize()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v2, v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setNeedlePivotYRatio(F)V
    .locals 0

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setNeedleScale(F)V
    .locals 2

    const v0, 0x3e4ccccd    # 0.2f

    cmpg-float v1, p1, v0

    if-gez v1, :cond_0

    move p1, v0

    :cond_0
    const v0, 0x3f99999a    # 1.2f

    cmpl-float v1, p1, v0

    if-lez v1, :cond_1

    move p1, v0

    :cond_1
    iput p1, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->j:F

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setValue(F)V
    .locals 0

    invoke-virtual {p0, p1}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->c(F)V

    return-void
.end method
