.class public Lru/zinovin/tankspeedometer/view/HeaderBlockView;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public final a:Landroid/graphics/Paint;

.field public b:Landroid/graphics/RectF;

.field public c:Landroid/graphics/RectF;

.field public d:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lru/zinovin/tankspeedometer/view/HeaderBlockView;->a:Landroid/graphics/Paint;

    const-string p2, "#9B000000"

    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, Lru/zinovin/tankspeedometer/view/HeaderBlockView;->a:Landroid/graphics/Paint;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    return-void
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 12

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget-object v1, p0, Lru/zinovin/tankspeedometer/view/HeaderBlockView;->b:Landroid/graphics/RectF;

    iget-object v5, p0, Lru/zinovin/tankspeedometer/view/HeaderBlockView;->a:Landroid/graphics/Paint;

    const/high16 v2, 0x42b40000    # 90.0f

    const/high16 v3, 0x43340000    # 180.0f

    const/4 v4, 0x1

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    iget-object v7, p0, Lru/zinovin/tankspeedometer/view/HeaderBlockView;->c:Landroid/graphics/RectF;

    iget-object v11, p0, Lru/zinovin/tankspeedometer/view/HeaderBlockView;->a:Landroid/graphics/Paint;

    const/high16 v8, 0x43870000    # 270.0f

    const/high16 v9, 0x43340000    # 180.0f

    const/4 v10, 0x1

    move-object v6, p1

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    iget v0, p0, Lru/zinovin/tankspeedometer/view/HeaderBlockView;->d:I

    int-to-float v2, v0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    iget v1, p0, Lru/zinovin/tankspeedometer/view/HeaderBlockView;->d:I

    sub-int/2addr v0, v1

    int-to-float v4, v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v5, v0

    iget-object v6, p0, Lru/zinovin/tankspeedometer/view/HeaderBlockView;->a:Landroid/graphics/Paint;

    const/4 v3, 0x0

    move-object v1, p1

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 1

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    div-int/lit8 p3, p2, 0x2

    iput p3, p0, Lru/zinovin/tankspeedometer/view/HeaderBlockView;->d:I

    new-instance p3, Landroid/graphics/RectF;

    iget p4, p0, Lru/zinovin/tankspeedometer/view/HeaderBlockView;->d:I

    mul-int/lit8 p4, p4, 0x2

    int-to-float p4, p4

    int-to-float p2, p2

    const/4 v0, 0x0

    invoke-direct {p3, v0, v0, p4, p2}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object p3, p0, Lru/zinovin/tankspeedometer/view/HeaderBlockView;->b:Landroid/graphics/RectF;

    new-instance p3, Landroid/graphics/RectF;

    iget p4, p0, Lru/zinovin/tankspeedometer/view/HeaderBlockView;->d:I

    mul-int/lit8 p4, p4, 0x2

    sub-int p4, p1, p4

    int-to-float p4, p4

    int-to-float p1, p1

    invoke-direct {p3, p4, v0, p1, p2}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object p3, p0, Lru/zinovin/tankspeedometer/view/HeaderBlockView;->c:Landroid/graphics/RectF;

    return-void
.end method
