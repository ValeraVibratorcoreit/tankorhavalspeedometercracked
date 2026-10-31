.class public abstract LB6;
.super Lqg;
.source "SourceFile"


# instance fields
.field public b:F

.field public c:F

.field public d:F

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public final i:Landroid/graphics/Paint;

.field public final j:Landroid/graphics/Paint;

.field public final k:Landroid/graphics/Paint;

.field public final l:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lqg;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    iput p1, p0, LB6;->b:F

    const/high16 p1, 0x41a00000    # 20.0f

    iput p1, p0, LB6;->c:F

    const/high16 p1, 0x41480000    # 12.5f

    iput p1, p0, LB6;->d:F

    const p1, -0xbbbbbc

    iput p1, p0, LB6;->e:I

    const p1, -0x777778

    iput p1, p0, LB6;->f:I

    const/16 p1, -0x100

    iput p1, p0, LB6;->g:I

    const/high16 p1, -0x10000

    iput p1, p0, LB6;->h:I

    invoke-virtual {p0}, LB6;->b()V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, LB6;->i:Landroid/graphics/Paint;

    iget p2, p0, LB6;->e:I

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, LB6;->i:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, LB6;->j:Landroid/graphics/Paint;

    iget v0, p0, LB6;->f:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, LB6;->j:Landroid/graphics/Paint;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, LB6;->k:Landroid/graphics/Paint;

    iget v0, p0, LB6;->g:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, LB6;->k:Landroid/graphics/Paint;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, LB6;->l:Landroid/graphics/Paint;

    iget v0, p0, LB6;->h:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, LB6;->l:Landroid/graphics/Paint;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    return-void
.end method


# virtual methods
.method public abstract b()V
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 14

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    add-int/lit8 v0, v0, -0xc

    int-to-float v0, v0

    const/high16 v2, 0x40800000    # 4.0f

    div-float/2addr v0, v2

    int-to-float v1, v1

    const/high16 v3, 0x41200000    # 10.0f

    div-float v9, v0, v3

    const/4 v10, 0x0

    move v11, v10

    :goto_0
    const/4 v3, 0x4

    if-ge v11, v3, :cond_4

    int-to-float v3, v11

    add-float v4, v0, v2

    mul-float v12, v4, v3

    add-float v6, v12, v0

    iget-object v8, p0, LB6;->i:Landroid/graphics/Paint;

    const/4 v5, 0x0

    move-object v3, p1

    move v4, v12

    move v7, v1

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    move v13, v10

    :goto_1
    const/16 v3, 0xa

    if-ge v13, v3, :cond_3

    int-to-float v3, v13

    mul-float/2addr v3, v9

    add-float v4, v3, v12

    add-float v6, v4, v9

    mul-int/lit8 v3, v11, 0xa

    add-int/2addr v3, v13

    int-to-float v3, v3

    const/high16 v5, 0x40200000    # 2.5f

    mul-float/2addr v3, v5

    iget v5, p0, LB6;->b:F

    iget v7, p0, LB6;->c:F

    cmpl-float v7, v5, v7

    if-ltz v7, :cond_0

    iget-object v7, p0, LB6;->j:Landroid/graphics/Paint;

    :goto_2
    move-object v8, v7

    goto :goto_3

    :cond_0
    iget v7, p0, LB6;->d:F

    cmpl-float v7, v5, v7

    if-ltz v7, :cond_1

    iget-object v7, p0, LB6;->k:Landroid/graphics/Paint;

    goto :goto_2

    :cond_1
    iget-object v7, p0, LB6;->l:Landroid/graphics/Paint;

    goto :goto_2

    :goto_3
    cmpl-float v3, v5, v3

    if-ltz v3, :cond_2

    const/4 v5, 0x0

    move-object v3, p1

    move v7, v1

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_2
    add-int/lit8 v13, v13, 0x1

    goto :goto_1

    :cond_3
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public setBackColor(I)V
    .locals 1

    iput p1, p0, LB6;->e:I

    iget-object v0, p0, LB6;->i:Landroid/graphics/Paint;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    :cond_0
    return-void
.end method

.method public setColor(I)V
    .locals 1

    iput p1, p0, LB6;->f:I

    iget-object v0, p0, LB6;->j:Landroid/graphics/Paint;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    :cond_0
    return-void
.end method

.method public setCriticalColor(I)V
    .locals 1

    iput p1, p0, LB6;->h:I

    iget-object v0, p0, LB6;->l:Landroid/graphics/Paint;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    :cond_0
    return-void
.end method

.method public setLevelValue(F)V
    .locals 0

    iput p1, p0, LB6;->b:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setLowColor(I)V
    .locals 1

    iput p1, p0, LB6;->g:I

    iget-object v0, p0, LB6;->k:Landroid/graphics/Paint;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    :cond_0
    return-void
.end method

.method public setNormalLevel(F)V
    .locals 0

    iput p1, p0, LB6;->c:F

    return-void
.end method

.method public setWarnLevel(F)V
    .locals 0

    iput p1, p0, LB6;->d:F

    return-void
.end method
