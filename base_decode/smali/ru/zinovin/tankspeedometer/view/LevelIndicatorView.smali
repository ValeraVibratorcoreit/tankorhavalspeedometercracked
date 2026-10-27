.class public Lru/zinovin/tankspeedometer/view/LevelIndicatorView;
.super Lqg;
.source "SourceFile"


# static fields
.field public static final synthetic p:I


# instance fields
.field public final b:LU2;

.field public c:F

.field public d:F

.field public e:F

.field public f:F

.field public g:F

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public final l:Landroid/graphics/Paint;

.field public final m:Landroid/graphics/Paint;

.field public final n:Landroid/graphics/Paint;

.field public final o:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lqg;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    iput p1, p0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->c:F

    const/high16 p1, 0x43020000    # 130.0f

    iput p1, p0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->d:F

    const/high16 p1, 0x42480000    # 50.0f

    iput p1, p0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->e:F

    const/high16 p1, 0x425c0000    # 55.0f

    iput p1, p0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->f:F

    const/high16 p1, 0x428c0000    # 70.0f

    iput p1, p0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->g:F

    const p1, -0xbbbbbc

    iput p1, p0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->h:I

    const p1, -0x777778

    iput p1, p0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->i:I

    const/16 p1, -0x100

    iput p1, p0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->j:I

    const/high16 p1, -0x10000

    iput p1, p0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->k:I

    new-instance p1, LU2;

    const/4 p2, 0x5

    invoke-direct {p1, p0, p2}, LU2;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->b:LU2;

    iget-object p2, p0, Lqg;->a:Landroid/content/SharedPreferences;

    invoke-interface {p2, p1}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->b()V

    const-string p1, "coolant_warn_level"

    const-string v0, "105.0"

    invoke-interface {p2, p1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1

    invoke-virtual {p0, p1}, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->setWarnLevel(F)V

    const-string p1, "coolant_critical_level"

    const-string v0, "120.0"

    invoke-interface {p2, p1, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p1

    invoke-virtual {p0, p1}, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->setCriticalLevel(F)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->l:Landroid/graphics/Paint;

    iget p2, p0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->h:I

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->l:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->m:Landroid/graphics/Paint;

    iget v0, p0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->i:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->m:Landroid/graphics/Paint;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->n:Landroid/graphics/Paint;

    iget v0, p0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->j:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->n:Landroid/graphics/Paint;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->o:Landroid/graphics/Paint;

    iget v0, p0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->k:I

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    iget-object p1, p0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->o:Landroid/graphics/Paint;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->b()V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final b()V
    .locals 1

    const-string v0, "coolant_color"

    invoke-static {v0}, LTf;->w(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->setColor(I)V

    const-string v0, "coolant_background_color"

    invoke-static {v0}, LTf;->w(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->setBackColor(I)V

    const-string v0, "coolant_warn_color"

    invoke-static {v0}, LTf;->w(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->setWarnColor(I)V

    const-string v0, "coolant_critical_color"

    invoke-static {v0}, LTf;->w(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->setCriticalColor(I)V

    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    iget-object v0, p0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->b:LU2;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lqg;->a:Landroid/content/SharedPreferences;

    invoke-interface {v1, v0}, Landroid/content/SharedPreferences;->unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    :cond_0
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 16

    move-object/from16 v0, p0

    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v2

    add-int/lit8 v1, v1, -0xc

    int-to-float v1, v1

    const/high16 v3, 0x40800000    # 4.0f

    div-float/2addr v1, v3

    int-to-float v2, v2

    const/high16 v4, 0x41200000    # 10.0f

    div-float v10, v1, v4

    iget v4, v0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->c:F

    iget v5, v0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->e:F

    sub-float v6, v4, v5

    iget v7, v0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->g:F

    cmpl-float v6, v6, v7

    if-ltz v6, :cond_0

    iget-object v4, v0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->o:Landroid/graphics/Paint;

    :goto_0
    move-object v11, v4

    goto :goto_1

    :cond_0
    sub-float/2addr v4, v5

    iget v5, v0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->f:F

    cmpl-float v4, v4, v5

    if-ltz v4, :cond_1

    iget-object v4, v0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->n:Landroid/graphics/Paint;

    goto :goto_0

    :cond_1
    iget-object v4, v0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->m:Landroid/graphics/Paint;

    goto :goto_0

    :goto_1
    const/4 v12, 0x0

    move v13, v12

    :goto_2
    const/4 v4, 0x4

    if-ge v13, v4, :cond_4

    int-to-float v4, v13

    add-float v5, v1, v3

    mul-float v14, v5, v4

    add-float v7, v14, v1

    iget-object v9, v0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->l:Landroid/graphics/Paint;

    const/4 v6, 0x0

    move-object/from16 v4, p1

    move v5, v14

    move v8, v2

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    move v15, v12

    :goto_3
    const/16 v4, 0xa

    if-ge v15, v4, :cond_3

    int-to-float v4, v15

    mul-float/2addr v4, v10

    add-float v5, v4, v14

    add-float v7, v5, v10

    mul-int/lit8 v4, v13, 0xa

    add-int/2addr v4, v15

    int-to-float v4, v4

    iget v6, v0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->d:F

    iget v8, v0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->e:F

    sub-float/2addr v6, v8

    const/high16 v9, 0x42200000    # 40.0f

    div-float/2addr v6, v9

    mul-float/2addr v6, v4

    iget v4, v0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->c:F

    sub-float/2addr v4, v8

    cmpl-float v4, v4, v6

    if-ltz v4, :cond_2

    const/4 v6, 0x0

    move-object/from16 v4, p1

    move v8, v2

    move-object v9, v11

    invoke-virtual/range {v4 .. v9}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :cond_2
    add-int/lit8 v15, v15, 0x1

    goto :goto_3

    :cond_3
    add-int/lit8 v13, v13, 0x1

    goto :goto_2

    :cond_4
    return-void
.end method

.method public setBackColor(I)V
    .locals 1

    iput p1, p0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->h:I

    iget-object v0, p0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->l:Landroid/graphics/Paint;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    :cond_0
    return-void
.end method

.method public setColor(I)V
    .locals 1

    iput p1, p0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->i:I

    iget-object v0, p0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->m:Landroid/graphics/Paint;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    :cond_0
    return-void
.end method

.method public setCriticalColor(I)V
    .locals 1

    iput p1, p0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->k:I

    iget-object v0, p0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->o:Landroid/graphics/Paint;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    :cond_0
    return-void
.end method

.method public setCriticalLevel(F)V
    .locals 1

    iget v0, p0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->e:F

    sub-float/2addr p1, v0

    iput p1, p0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->g:F

    return-void
.end method

.method public setLevelValue(F)V
    .locals 0

    iput p1, p0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->c:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setMaxValue(F)V
    .locals 0

    iput p1, p0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->d:F

    return-void
.end method

.method public setMinValue(F)V
    .locals 0

    iput p1, p0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->e:F

    return-void
.end method

.method public setWarnColor(I)V
    .locals 1

    iput p1, p0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->j:I

    iget-object v0, p0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->n:Landroid/graphics/Paint;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    :cond_0
    return-void
.end method

.method public setWarnLevel(F)V
    .locals 1

    iget v0, p0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->e:F

    sub-float/2addr p1, v0

    iput p1, p0, Lru/zinovin/tankspeedometer/view/LevelIndicatorView;->f:F

    return-void
.end method
