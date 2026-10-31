.class public Lru/zinovin/tankspeedometer/view/GradientCircleView;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public final a:Landroid/graphics/Paint;

.field public b:I

.field public c:I

.field public d:I

.field public final e:[I

.field public final f:[F

.field public g:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lru/zinovin/tankspeedometer/view/GradientCircleView;->g:Z

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lru/zinovin/tankspeedometer/view/GradientCircleView;->a:Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    const/16 v0, 0xff

    invoke-static {v0, p1, p1, p1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/16 v2, 0x96

    invoke-static {v2, p1, p1, p1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v2

    const/4 v3, 0x5

    invoke-static {v3, p1, p1, p1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v3

    filled-new-array {v0, v2, v3}, [I

    move-result-object v0

    iput-object v0, p0, Lru/zinovin/tankspeedometer/view/GradientCircleView;->e:[I

    const/4 v0, 0x3

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    iput-object v0, p0, Lru/zinovin/tankspeedometer/view/GradientCircleView;->f:[F

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v2, Lvl;->a:[I

    invoke-virtual {v0, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    iget-object v0, p0, Lru/zinovin/tankspeedometer/view/GradientCircleView;->e:[I

    aget v2, v0, v1

    invoke-virtual {p2, p1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    aput p1, v0, v1

    iget-object p1, p0, Lru/zinovin/tankspeedometer/view/GradientCircleView;->f:[F

    aget v0, p1, v1

    invoke-virtual {p2, v1, v0}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v0

    aput v0, p1, v1

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    :cond_0
    return-void

    :array_0
    .array-data 4
        0x0
        0x3f266666    # 0.65f
        0x3f800000    # 1.0f
    .end array-data
.end method


# virtual methods
.method public final a(IF)V
    .locals 7

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "gradientStop="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, " gradientColor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "T500.SHADOW"

    invoke-static {v1, v0}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lru/zinovin/tankspeedometer/view/GradientCircleView;->e:[I

    const/4 v1, 0x1

    aput p1, v0, v1

    iget-object p1, p0, Lru/zinovin/tankspeedometer/view/GradientCircleView;->f:[F

    aput p2, p1, v1

    iget-boolean p1, p0, Lru/zinovin/tankspeedometer/view/GradientCircleView;->g:Z

    if-eqz p1, :cond_0

    new-instance p1, Landroid/graphics/RadialGradient;

    iget p2, p0, Lru/zinovin/tankspeedometer/view/GradientCircleView;->c:I

    int-to-float v1, p2

    iget p2, p0, Lru/zinovin/tankspeedometer/view/GradientCircleView;->d:I

    int-to-float v2, p2

    iget p2, p0, Lru/zinovin/tankspeedometer/view/GradientCircleView;->b:I

    int-to-float v3, p2

    iget-object v4, p0, Lru/zinovin/tankspeedometer/view/GradientCircleView;->e:[I

    iget-object v5, p0, Lru/zinovin/tankspeedometer/view/GradientCircleView;->f:[F

    sget-object v6, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    move-object v0, p1

    invoke-direct/range {v0 .. v6}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V

    iget-object p2, p0, Lru/zinovin/tankspeedometer/view/GradientCircleView;->a:Landroid/graphics/Paint;

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 4

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget v0, p0, Lru/zinovin/tankspeedometer/view/GradientCircleView;->c:I

    int-to-float v0, v0

    iget v1, p0, Lru/zinovin/tankspeedometer/view/GradientCircleView;->d:I

    int-to-float v1, v1

    iget v2, p0, Lru/zinovin/tankspeedometer/view/GradientCircleView;->b:I

    int-to-float v2, v2

    iget-object v3, p0, Lru/zinovin/tankspeedometer/view/GradientCircleView;->a:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 7

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    const/4 p3, 0x1

    iput-boolean p3, p0, Lru/zinovin/tankspeedometer/view/GradientCircleView;->g:Z

    const-string p3, "T500.SHADOW"

    const-string p4, "onSizeChanged()"

    invoke-static {p3, p4}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p3

    div-int/lit8 p3, p3, 0x2

    iput p3, p0, Lru/zinovin/tankspeedometer/view/GradientCircleView;->b:I

    div-int/lit8 p1, p1, 0x2

    iput p1, p0, Lru/zinovin/tankspeedometer/view/GradientCircleView;->c:I

    div-int/lit8 p2, p2, 0x2

    iput p2, p0, Lru/zinovin/tankspeedometer/view/GradientCircleView;->d:I

    new-instance p1, Landroid/graphics/RadialGradient;

    iget p2, p0, Lru/zinovin/tankspeedometer/view/GradientCircleView;->c:I

    int-to-float v1, p2

    iget p2, p0, Lru/zinovin/tankspeedometer/view/GradientCircleView;->d:I

    int-to-float v2, p2

    iget p2, p0, Lru/zinovin/tankspeedometer/view/GradientCircleView;->b:I

    int-to-float v3, p2

    iget-object v4, p0, Lru/zinovin/tankspeedometer/view/GradientCircleView;->e:[I

    iget-object v5, p0, Lru/zinovin/tankspeedometer/view/GradientCircleView;->f:[F

    sget-object v6, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    move-object v0, p1

    invoke-direct/range {v0 .. v6}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V

    iget-object p2, p0, Lru/zinovin/tankspeedometer/view/GradientCircleView;->a:Landroid/graphics/Paint;

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    return-void
.end method
