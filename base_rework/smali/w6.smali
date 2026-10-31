.class public final Lw6;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public a:Landroid/graphics/Bitmap;

.field public b:Landroid/graphics/Canvas;

.field public c:Landroid/graphics/Bitmap;

.field public d:Landroid/graphics/Canvas;

.field public e:Z

.field public f:I

.field public g:F

.field public h:F

.field public i:[Ljava/lang/Integer;

.field public j:I

.field public k:Ljava/lang/Integer;

.field public l:Ljava/lang/Integer;

.field public m:Landroid/graphics/Paint;

.field public n:Landroid/graphics/Paint;

.field public o:Landroid/graphics/Paint;

.field public p:Ls6;

.field public q:Ljava/util/ArrayList;

.field public r:Ljava/util/ArrayList;

.field public s:LIg;

.field public t:LT0;

.field public u:Landroid/widget/EditText;

.field public v:Lv6;

.field public w:LA6;

.field public x:I

.field public y:I


# direct methods
.method private setColorPreviewColor(I)V
    .locals 0

    return-void
.end method

.method private setColorText(I)V
    .locals 2

    iget-object v0, p0, Lw6;->u:Landroid/widget/EditText;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lw6;->t:LT0;

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-static {p1, v1}, LTf;->C(IZ)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private setColorToSliders(I)V
    .locals 1

    iget-object v0, p0, Lw6;->s:LIg;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LIg;->setColor(I)V

    :cond_0
    iget-object v0, p0, Lw6;->t:LT0;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, LT0;->setColor(I)V

    :cond_1
    return-void
.end method

.method private setHighlightedColor(I)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method


# virtual methods
.method public final a(II)V
    .locals 1

    iget-object v0, p0, Lw6;->q:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    if-eq p1, p2, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, LVo;->l(Ljava/lang/Object;)V

    const/4 p2, 0x0

    :try_start_0
    throw p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p2

    invoke-virtual {p2}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public final b(I)Ls6;
    .locals 21

    const/4 v0, 0x3

    new-array v0, v0, [F

    move/from16 v1, p1

    invoke-static {v1, v0}, Landroid/graphics/Color;->colorToHSV(I[F)V

    const/4 v1, 0x1

    aget v2, v0, v1

    float-to-double v2, v2

    const/4 v4, 0x0

    aget v5, v0, v4

    float-to-double v5, v5

    const-wide v7, 0x400921fb54442d18L    # Math.PI

    mul-double/2addr v5, v7

    const-wide v9, 0x4066800000000000L    # 180.0

    div-double/2addr v5, v9

    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    move-result-wide v5

    mul-double/2addr v5, v2

    aget v2, v0, v1

    float-to-double v2, v2

    aget v0, v0, v4

    float-to-double v11, v0

    mul-double/2addr v11, v7

    div-double/2addr v11, v9

    invoke-static {v11, v12}, Ljava/lang/Math;->sin(D)D

    move-result-wide v11

    mul-double/2addr v11, v2

    move-object/from16 v0, p0

    iget-object v2, v0, Lw6;->w:LA6;

    check-cast v2, Ld;

    iget-object v2, v2, Ld;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    const-wide v13, 0x7fefffffffffffffL    # Double.MAX_VALUE

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ls6;

    iget-object v9, v15, Ls6;->c:[F

    aget v10, v9, v1

    move-object/from16 v18, v2

    float-to-double v1, v10

    aget v10, v9, v4

    move-wide/from16 v19, v5

    float-to-double v4, v10

    mul-double/2addr v4, v7

    const-wide v16, 0x4066800000000000L    # 180.0

    div-double v4, v4, v16

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v4

    mul-double/2addr v4, v1

    const/4 v1, 0x1

    aget v2, v9, v1

    float-to-double v1, v2

    const/4 v6, 0x0

    aget v9, v9, v6

    float-to-double v9, v9

    mul-double/2addr v9, v7

    div-double v9, v9, v16

    invoke-static {v9, v10}, Ljava/lang/Math;->sin(D)D

    move-result-wide v9

    mul-double/2addr v9, v1

    sub-double v1, v19, v4

    sub-double v4, v11, v9

    mul-double/2addr v1, v1

    mul-double/2addr v4, v4

    add-double/2addr v4, v1

    cmpg-double v1, v4, v13

    if-gez v1, :cond_0

    move-wide v13, v4

    move-object v3, v15

    :cond_0
    move v4, v6

    move-wide/from16 v9, v16

    move-object/from16 v2, v18

    move-wide/from16 v5, v19

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    return-object v3
.end method

.method public final c(IZ)V
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [F

    invoke-static {p1, v0}, Landroid/graphics/Color;->colorToHSV(I[F)V

    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x437f0000    # 255.0f

    div-float/2addr v1, v2

    iput v1, p0, Lw6;->h:F

    const/4 v1, 0x2

    aget v0, v0, v1

    iput v0, p0, Lw6;->g:F

    iget-object v0, p0, Lw6;->i:[Ljava/lang/Integer;

    iget v1, p0, Lw6;->j:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lw6;->k:Ljava/lang/Integer;

    invoke-direct {p0, p1}, Lw6;->setColorPreviewColor(I)V

    invoke-direct {p0, p1}, Lw6;->setColorToSliders(I)V

    iget-object v0, p0, Lw6;->u:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    invoke-direct {p0, p1}, Lw6;->setColorText(I)V

    :cond_0
    invoke-virtual {p0, p1}, Lw6;->b(I)Ls6;

    move-result-object p1

    iput-object p1, p0, Lw6;->p:Ls6;

    return-void
.end method

.method public final d()V
    .locals 6

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    if-ge v1, v0, :cond_0

    move v0, v1

    :cond_0
    if-gtz v0, :cond_1

    return-void

    :cond_1
    iget-object v1, p0, Lw6;->a:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    if-eq v1, v0, :cond_3

    :cond_2
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    iput-object v1, p0, Lw6;->a:Landroid/graphics/Bitmap;

    new-instance v1, Landroid/graphics/Canvas;

    iget-object v2, p0, Lw6;->a:Landroid/graphics/Bitmap;

    invoke-direct {v1, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v1, p0, Lw6;->b:Landroid/graphics/Canvas;

    iget-object v1, p0, Lw6;->o:Landroid/graphics/Paint;

    const/16 v2, 0x1a

    invoke-static {v2}, LBr;->m(I)Landroid/graphics/BitmapShader;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    :cond_3
    iget-object v1, p0, Lw6;->c:Landroid/graphics/Bitmap;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    if-eq v1, v0, :cond_5

    :cond_4
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v0, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lw6;->c:Landroid/graphics/Bitmap;

    new-instance v0, Landroid/graphics/Canvas;

    iget-object v1, p0, Lw6;->c:Landroid/graphics/Bitmap;

    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    iput-object v0, p0, Lw6;->d:Landroid/graphics/Canvas;

    :cond_5
    iget-object v0, p0, Lw6;->b:Landroid/graphics/Canvas;

    sget-object v1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    iget-object v0, p0, Lw6;->d:Landroid/graphics/Canvas;

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    iget-object v0, p0, Lw6;->w:LA6;

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    iget-object v0, p0, Lw6;->b:Landroid/graphics/Canvas;

    invoke-virtual {v0}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    const v2, 0x3fc4cccc    # 1.5374999f

    sub-float v3, v0, v2

    iget v4, p0, Lw6;->f:I

    int-to-float v5, v4

    div-float/2addr v0, v5

    sub-float/2addr v3, v0

    add-int/lit8 v0, v4, -0x1

    int-to-float v0, v0

    div-float v0, v3, v0

    div-float/2addr v0, v1

    iget-object v1, p0, Lw6;->w:LA6;

    check-cast v1, Ld;

    iget-object v5, v1, Ld;->a:Ljava/lang/Object;

    check-cast v5, Lz6;

    if-nez v5, :cond_7

    new-instance v5, Lz6;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    iput-object v5, v1, Ld;->a:Ljava/lang/Object;

    :cond_7
    iget-object v5, v1, Ld;->a:Ljava/lang/Object;

    check-cast v5, Lz6;

    iput v4, v5, Lz6;->a:I

    iput v3, v5, Lz6;->b:F

    iput v0, v5, Lz6;->c:F

    iput v2, v5, Lz6;->d:F

    iget v0, p0, Lw6;->h:F

    iput v0, v5, Lz6;->e:F

    iget v0, p0, Lw6;->g:F

    iput v0, v5, Lz6;->f:F

    iget-object v0, p0, Lw6;->b:Landroid/graphics/Canvas;

    iput-object v0, v5, Lz6;->g:Landroid/graphics/Canvas;

    iput-object v5, v1, Ld;->a:Ljava/lang/Object;

    iget-object v0, v1, Ld;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lw6;->w:LA6;

    invoke-interface {v0}, LA6;->c()V

    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public getAllColors()[Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lw6;->i:[Ljava/lang/Integer;

    return-object v0
.end method

.method public getSelectedColor()I
    .locals 3

    iget-object v0, p0, Lw6;->p:Ls6;

    if-eqz v0, :cond_0

    iget v0, v0, Ls6;->e:I

    iget v1, p0, Lw6;->g:F

    const/4 v2, 0x3

    new-array v2, v2, [F

    invoke-static {v0, v2}, Landroid/graphics/Color;->colorToHSV(I[F)V

    const/4 v0, 0x2

    aput v1, v2, v0

    invoke-static {v2}, Landroid/graphics/Color;->HSVToColor([F)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lw6;->h:F

    const/high16 v2, 0x437f0000    # 255.0f

    mul-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    shl-int/lit8 v1, v1, 0x18

    const v2, 0xffffff

    and-int/2addr v0, v2

    or-int/2addr v0, v1

    return v0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 8

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v0

    int-to-float v0, v0

    const v1, 0x3f833333    # 1.025f

    div-float/2addr v0, v1

    iget v1, p0, Lw6;->f:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget-object v2, p0, Lw6;->a:Landroid/graphics/Bitmap;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lw6;->p:Ls6;

    if-eqz v2, :cond_1

    iget-object v3, p0, Lw6;->m:Landroid/graphics/Paint;

    iget v4, p0, Lw6;->g:F

    invoke-virtual {v2, v4}, Ls6;->a(F)[F

    move-result-object v2

    invoke-static {v2}, Landroid/graphics/Color;->HSVToColor([F)I

    move-result v2

    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setColor(I)V

    iget v2, p0, Lw6;->h:F

    const/high16 v4, 0x437f0000    # 255.0f

    mul-float/2addr v2, v4

    float-to-int v2, v2

    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    iget-object v2, p0, Lw6;->d:Landroid/graphics/Canvas;

    iget-object v4, p0, Lw6;->p:Ls6;

    iget v5, v4, Ls6;->a:F

    iget v4, v4, Ls6;->b:F

    const/high16 v6, 0x40800000    # 4.0f

    add-float/2addr v6, v0

    iget-object v7, p0, Lw6;->o:Landroid/graphics/Paint;

    invoke-virtual {v2, v5, v4, v6, v7}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget-object v2, p0, Lw6;->d:Landroid/graphics/Canvas;

    iget-object v4, p0, Lw6;->p:Ls6;

    iget v5, v4, Ls6;->a:F

    iget v4, v4, Ls6;->b:F

    invoke-virtual {v2, v5, v4, v6, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    invoke-static {}, LBr;->I()LVi;

    move-result-object v2

    iget-object v3, v2, LVi;->a:Ljava/lang/Object;

    check-cast v3, Landroid/graphics/Paint;

    const/4 v4, -0x1

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v4, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/high16 v4, 0x3f000000    # 0.5f

    mul-float/2addr v4, v0

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    sget-object v4, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    iget-object v2, v2, LVi;->a:Ljava/lang/Object;

    check-cast v2, Landroid/graphics/Paint;

    new-instance v5, Landroid/graphics/PorterDuffXfermode;

    invoke-direct {v5, v4}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    iput-object v3, p0, Lw6;->n:Landroid/graphics/Paint;

    iget-boolean v2, p0, Lw6;->e:Z

    if-eqz v2, :cond_0

    iget-object v2, p0, Lw6;->b:Landroid/graphics/Canvas;

    iget-object v4, p0, Lw6;->p:Ls6;

    iget v5, v4, Ls6;->a:F

    iget v4, v4, Ls6;->b:F

    invoke-virtual {v3}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v3

    div-float/2addr v3, v1

    add-float/2addr v3, v0

    iget-object v6, p0, Lw6;->n:Landroid/graphics/Paint;

    invoke-virtual {v2, v5, v4, v3, v6}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :cond_0
    iget-object v2, p0, Lw6;->a:Landroid/graphics/Bitmap;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {p1, v2, v3, v3, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    iget-object v2, p0, Lw6;->d:Landroid/graphics/Canvas;

    iget-object v5, p0, Lw6;->p:Ls6;

    iget v6, v5, Ls6;->a:F

    iget v5, v5, Ls6;->b:F

    iget-object v7, p0, Lw6;->n:Landroid/graphics/Paint;

    invoke-virtual {v7}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v7

    div-float/2addr v7, v1

    add-float/2addr v7, v0

    iget-object v0, p0, Lw6;->n:Landroid/graphics/Paint;

    invoke-virtual {v2, v6, v5, v7, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget-object v0, p0, Lw6;->c:Landroid/graphics/Bitmap;

    invoke-virtual {p1, v0, v3, v3, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    :cond_1
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    iget p1, p0, Lw6;->x:I

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p1

    iget p2, p0, Lw6;->x:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, LT0;

    invoke-virtual {p0, p1}, Lw6;->setAlphaSlider(LT0;)V

    :cond_0
    iget p1, p0, Lw6;->y:I

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p1

    iget p2, p0, Lw6;->y:I

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, LIg;

    invoke-virtual {p0, p1}, Lw6;->setLightnessSlider(LIg;)V

    :cond_1
    invoke-virtual {p0}, Lw6;->d()V

    iget-object p1, p0, Lw6;->k:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lw6;->b(I)Ls6;

    move-result-object p1

    iput-object p1, p0, Lw6;->p:Ls6;

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
    if-ge p2, p1, :cond_6

    move p1, p2

    :cond_6
    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    invoke-virtual {p0}, Lw6;->d()V

    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 12

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    if-eq v0, v2, :cond_0

    const/4 v3, 0x2

    if-eq v0, v3, :cond_3

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p0}, Lw6;->getSelectedColor()I

    move-result p1

    iget-object v0, p0, Lw6;->r:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, LVo;->l(Ljava/lang/Object;)V

    :try_start_0
    throw v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v3

    invoke-virtual {v3}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_0

    :cond_2
    :goto_1
    invoke-direct {p0, p1}, Lw6;->setColorToSliders(I)V

    invoke-direct {p0, p1}, Lw6;->setColorText(I)V

    invoke-direct {p0, p1}, Lw6;->setColorPreviewColor(I)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    goto :goto_3

    :cond_3
    invoke-virtual {p0}, Lw6;->getSelectedColor()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iget-object v4, p0, Lw6;->w:LA6;

    check-cast v4, Ld;

    iget-object v4, v4, Ld;->b:Ljava/lang/Object;

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const-wide v5, 0x7fefffffffffffffL    # Double.MAX_VALUE

    :cond_4
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ls6;

    iget v8, v7, Ls6;->a:F

    sub-float/2addr v8, v3

    float-to-double v8, v8

    iget v10, v7, Ls6;->b:F

    sub-float/2addr v10, p1

    float-to-double v10, v10

    mul-double/2addr v8, v8

    mul-double/2addr v10, v10

    add-double/2addr v10, v8

    cmpl-double v8, v5, v10

    if-lez v8, :cond_4

    move-object v1, v7

    move-wide v5, v10

    goto :goto_2

    :cond_5
    iput-object v1, p0, Lw6;->p:Ls6;

    invoke-virtual {p0}, Lw6;->getSelectedColor()I

    move-result p1

    invoke-virtual {p0, v0, p1}, Lw6;->a(II)V

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lw6;->k:Ljava/lang/Integer;

    invoke-direct {p0, p1}, Lw6;->setColorToSliders(I)V

    invoke-virtual {p0}, Lw6;->d()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :goto_3
    return v2
.end method

.method public final onWindowFocusChanged(Z)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->onWindowFocusChanged(Z)V

    invoke-virtual {p0}, Lw6;->d()V

    iget-object p1, p0, Lw6;->k:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lw6;->b(I)Ls6;

    move-result-object p1

    iput-object p1, p0, Lw6;->p:Ls6;

    return-void
.end method

.method public setAlphaSlider(LT0;)V
    .locals 1

    iput-object p1, p0, Lw6;->t:LT0;

    if-eqz p1, :cond_0

    invoke-virtual {p1, p0}, LT0;->setColorPicker(Lw6;)V

    iget-object p1, p0, Lw6;->t:LT0;

    invoke-virtual {p0}, Lw6;->getSelectedColor()I

    move-result v0

    invoke-virtual {p1, v0}, LT0;->setColor(I)V

    :cond_0
    return-void
.end method

.method public setAlphaValue(F)V
    .locals 3

    invoke-virtual {p0}, Lw6;->getSelectedColor()I

    move-result v0

    iput p1, p0, Lw6;->h:F

    const/high16 v1, 0x437f0000    # 255.0f

    mul-float/2addr p1, v1

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    iget-object v1, p0, Lw6;->p:Ls6;

    iget v2, p0, Lw6;->g:F

    invoke-virtual {v1, v2}, Ls6;->a(F)[F

    move-result-object v1

    invoke-static {p1, v1}, Landroid/graphics/Color;->HSVToColor(I[F)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, p0, Lw6;->k:Ljava/lang/Integer;

    iget-object v1, p0, Lw6;->u:Landroid/widget/EditText;

    if-eqz v1, :cond_1

    iget-object v2, p0, Lw6;->t:LT0;

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {p1, v2}, LTf;->C(IZ)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    iget-object p1, p0, Lw6;->s:LIg;

    if-eqz p1, :cond_2

    iget-object v1, p0, Lw6;->k:Ljava/lang/Integer;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v1}, LIg;->setColor(I)V

    :cond_2
    iget-object p1, p0, Lw6;->k:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, v0, p1}, Lw6;->a(II)V

    invoke-virtual {p0}, Lw6;->d()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setColorEdit(Landroid/widget/EditText;)V
    .locals 1

    iput-object p1, p0, Lw6;->u:Landroid/widget/EditText;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lw6;->u:Landroid/widget/EditText;

    iget-object v0, p0, Lw6;->v:Lv6;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object p1, p0, Lw6;->l:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lw6;->setColorEditTextColor(I)V

    :cond_0
    return-void
.end method

.method public setColorEditTextColor(I)V
    .locals 1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lw6;->l:Ljava/lang/Integer;

    iget-object v0, p0, Lw6;->u:Landroid/widget/EditText;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_0
    return-void
.end method

.method public setDensity(I)V
    .locals 1

    const/4 v0, 0x2

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lw6;->f:I

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setLightness(F)V
    .locals 3

    invoke-virtual {p0}, Lw6;->getSelectedColor()I

    move-result v0

    iput p1, p0, Lw6;->g:F

    iget-object v1, p0, Lw6;->p:Ls6;

    if-eqz v1, :cond_3

    iget v1, p0, Lw6;->h:F

    const/high16 v2, 0x437f0000    # 255.0f

    mul-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iget-object v2, p0, Lw6;->p:Ls6;

    invoke-virtual {v2, p1}, Ls6;->a(F)[F

    move-result-object p1

    invoke-static {v1, p1}, Landroid/graphics/Color;->HSVToColor(I[F)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, p0, Lw6;->k:Ljava/lang/Integer;

    iget-object v1, p0, Lw6;->u:Landroid/widget/EditText;

    if-eqz v1, :cond_1

    iget-object v2, p0, Lw6;->t:LT0;

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {p1, v2}, LTf;->C(IZ)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    iget-object p1, p0, Lw6;->t:LT0;

    if-eqz p1, :cond_2

    iget-object v1, p0, Lw6;->k:Ljava/lang/Integer;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {p1, v1}, LT0;->setColor(I)V

    :cond_2
    iget-object p1, p0, Lw6;->k:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, v0, p1}, Lw6;->a(II)V

    invoke-virtual {p0}, Lw6;->d()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_3
    return-void
.end method

.method public setLightnessSlider(LIg;)V
    .locals 1

    iput-object p1, p0, Lw6;->s:LIg;

    if-eqz p1, :cond_0

    invoke-virtual {p1, p0}, LIg;->setColorPicker(Lw6;)V

    iget-object p1, p0, Lw6;->s:LIg;

    invoke-virtual {p0}, Lw6;->getSelectedColor()I

    move-result v0

    invoke-virtual {p1, v0}, LIg;->setColor(I)V

    :cond_0
    return-void
.end method

.method public setRenderer(LA6;)V
    .locals 0

    iput-object p1, p0, Lw6;->w:LA6;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setSelectedColor(I)V
    .locals 1

    iget-object v0, p0, Lw6;->i:[Ljava/lang/Integer;

    if-eqz v0, :cond_2

    array-length v0, v0

    if-ge v0, p1, :cond_0

    goto :goto_0

    :cond_0
    iput p1, p0, Lw6;->j:I

    invoke-direct {p0, p1}, Lw6;->setHighlightedColor(I)V

    iget-object v0, p0, Lw6;->i:[Ljava/lang/Integer;

    aget-object p1, v0, p1

    if-nez p1, :cond_1

    return-void

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lw6;->c(IZ)V

    invoke-virtual {p0}, Lw6;->d()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_2
    :goto_0
    return-void
.end method

.method public setShowBorder(Z)V
    .locals 0

    iput-boolean p1, p0, Lw6;->e:Z

    return-void
.end method
