.class public final Lig;
.super Ld2;
.source "SourceFile"


# instance fields
.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(LMf;Lru/zinovin/tankspeedometer/SpedometerPanel;I)V
    .locals 0

    iput p3, p0, Lig;->e:I

    const/16 p3, 0xb

    invoke-direct {p0, p1, p3, p2}, Ld2;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final X(Ljava/lang/Boolean;)V
    .locals 6

    iget v0, p0, Lig;->e:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ld2;->c:Ljava/lang/Object;

    check-cast v0, Lru/zinovin/tankspeedometer/SpedometerPanel;

    const v1, 0x7f0b0083

    invoke-virtual {v0, v1}, LKf;->c(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const/4 v3, 0x4

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    invoke-static {v1, v2}, LKf;->p(Landroid/view/View;I)V

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lmk;->l(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "carModel"

    const-string v5, "tank_500"

    invoke-interface {v1, v2, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "tank_700eo"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "wey_07"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "wey_80"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "tank_300"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const v1, 0x7f0b00fd

    invoke-virtual {v0, v1}, LKf;->c(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_2

    move v3, v4

    :cond_2
    invoke-static {v0, v3}, LKf;->p(Landroid/view/View;I)V

    goto :goto_2

    :cond_3
    :goto_1
    const v1, 0x7f0b00c0

    invoke-virtual {v0, v1}, LKf;->c(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_4

    move v3, v4

    :cond_4
    invoke-static {v0, v3}, LKf;->p(Landroid/view/View;I)V

    :goto_2
    return-void

    :pswitch_0
    const v0, 0x7f0b021c

    iget-object v1, p0, Ld2;->c:Ljava/lang/Object;

    check-cast v1, Lru/zinovin/tankspeedometer/SpedometerPanel;

    invoke-virtual {v1, v0}, LKf;->c(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_5

    const/4 p1, 0x0

    goto :goto_3

    :cond_5
    const/4 p1, 0x4

    :goto_3
    invoke-static {v0, p1}, LKf;->p(Landroid/view/View;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public o()V
    .locals 16

    move-object/from16 v0, p0

    iget v1, v0, Lig;->e:I

    packed-switch v1, :pswitch_data_0

    invoke-super/range {p0 .. p0}, Ld2;->o()V

    return-void

    :pswitch_0
    iget-object v1, v0, Ld2;->c:Ljava/lang/Object;

    check-cast v1, Lru/zinovin/tankspeedometer/SpedometerPanel;

    const v2, 0x7f0b016b

    invoke-virtual {v1, v2}, LKf;->c(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/FrameLayout;

    const v3, 0x7f0b021c

    invoke-virtual {v1, v3}, LKf;->c(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/FrameLayout;

    if-eqz v2, :cond_1

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-virtual {v3}, Landroid/view/ViewGroup;->removeAllViews()V

    new-instance v5, LV2;

    invoke-direct {v5, v1}, Lqg;-><init>(Landroid/content/Context;)V

    const/4 v6, 0x0

    iput v6, v5, LV2;->c:F

    const/high16 v7, 0x427c0000    # 63.0f

    iput v7, v5, LV2;->d:F

    const/high16 v8, 0x42ea0000    # 117.0f

    iput v8, v5, LV2;->e:F

    const/high16 v9, 0x3f800000    # 1.0f

    iput v9, v5, LV2;->f:F

    const v10, 0x3d23d70a    # 0.04f

    iput v10, v5, LV2;->g:F

    const/4 v11, 0x7

    iput v11, v5, LV2;->h:I

    const/high16 v12, 0x41a00000    # 20.0f

    iput v12, v5, LV2;->i:F

    const/high16 v12, 0x41480000    # 12.5f

    iput v12, v5, LV2;->j:F

    const v12, -0x99cc13

    iput v12, v5, LV2;->k:I

    const/16 v13, -0x100

    iput v13, v5, LV2;->l:I

    const/high16 v14, -0x10000

    iput v14, v5, LV2;->m:I

    new-instance v15, LU2;

    const/4 v4, 0x0

    invoke-direct {v15, v5, v4}, LU2;-><init>(Ljava/lang/Object;I)V

    iput-object v15, v5, LV2;->b:LU2;

    iget-object v4, v5, Lqg;->a:Landroid/content/SharedPreferences;

    invoke-interface {v4, v15}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    const-string v15, "fuel_color"

    invoke-static {v15}, LTf;->w(Ljava/lang/String;)I

    move-result v15

    invoke-virtual {v5, v15}, LV2;->setColor(I)V

    const-string v15, "fuel_low_color"

    invoke-static {v15}, LTf;->w(Ljava/lang/String;)I

    move-result v15

    invoke-virtual {v5, v15}, LV2;->setLowColor(I)V

    const-string v15, "fuel_critical_color"

    invoke-static {v15}, LTf;->w(Ljava/lang/String;)I

    move-result v15

    invoke-virtual {v5, v15}, LV2;->setCriticalColor(I)V

    const-string v15, "fuel_low_level"

    const-string v9, "20.0"

    invoke-interface {v4, v15, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v9

    invoke-virtual {v5, v9}, LV2;->setNormalLevel(F)V

    const-string v9, "fuel_critical_level"

    const-string v15, "12.5"

    invoke-interface {v4, v9, v15}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v4

    invoke-virtual {v5, v4}, LV2;->setWarnLevel(F)V

    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    iput-object v4, v5, LV2;->n:Landroid/graphics/Paint;

    iget v9, v5, LV2;->k:I

    invoke-virtual {v4, v9}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v4, v5, LV2;->n:Landroid/graphics/Paint;

    sget-object v9, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v4, v9}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v4, v5, LV2;->n:Landroid/graphics/Paint;

    iget v15, v5, LV2;->h:I

    int-to-float v15, v15

    invoke-virtual {v4, v15}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    iput-object v4, v5, LV2;->o:Landroid/graphics/Paint;

    iget v15, v5, LV2;->l:I

    invoke-virtual {v4, v15}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v4, v5, LV2;->o:Landroid/graphics/Paint;

    invoke-virtual {v4, v9}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v4, v5, LV2;->o:Landroid/graphics/Paint;

    iget v15, v5, LV2;->h:I

    int-to-float v15, v15

    invoke-virtual {v4, v15}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    iput-object v4, v5, LV2;->p:Landroid/graphics/Paint;

    iget v15, v5, LV2;->m:I

    invoke-virtual {v4, v15}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v4, v5, LV2;->p:Landroid/graphics/Paint;

    invoke-virtual {v4, v9}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v4, v5, LV2;->p:Landroid/graphics/Paint;

    iget v15, v5, LV2;->h:I

    int-to-float v15, v15

    invoke-virtual {v4, v15}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    new-instance v4, LW2;

    invoke-direct {v4, v1}, Lqg;-><init>(Landroid/content/Context;)V

    iput v6, v4, LW2;->c:F

    const/high16 v6, 0x43020000    # 130.0f

    iput v6, v4, LW2;->d:F

    const/high16 v6, 0x42480000    # 50.0f

    iput v6, v4, LW2;->e:F

    const/high16 v6, 0x425c0000    # 55.0f

    iput v6, v4, LW2;->f:F

    const/high16 v6, 0x428c0000    # 70.0f

    iput v6, v4, LW2;->g:F

    iput v10, v4, LW2;->h:F

    iput v11, v4, LW2;->i:I

    iput v12, v4, LW2;->j:I

    iput v13, v4, LW2;->k:I

    iput v14, v4, LW2;->l:I

    iput v7, v4, LW2;->m:F

    iput v8, v4, LW2;->n:F

    const/high16 v6, 0x3f800000    # 1.0f

    iput v6, v4, LW2;->o:F

    new-instance v6, LU2;

    const/4 v7, 0x1

    invoke-direct {v6, v4, v7}, LU2;-><init>(Ljava/lang/Object;I)V

    iput-object v6, v4, LW2;->b:LU2;

    iget-object v7, v4, Lqg;->a:Landroid/content/SharedPreferences;

    invoke-interface {v7, v6}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    const-string v6, "coolant_color"

    invoke-static {v6}, LTf;->w(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v4, v6}, LW2;->setColor(I)V

    const-string v6, "coolant_warn_color"

    invoke-static {v6}, LTf;->w(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v4, v6}, LW2;->setWarnColor(I)V

    const-string v6, "coolant_critical_color"

    invoke-static {v6}, LTf;->w(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {v4, v6}, LW2;->setCriticalColor(I)V

    const-string v6, "coolant_warn_level"

    const-string v8, "105.0"

    invoke-interface {v7, v6, v8}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v6

    invoke-virtual {v4, v6}, LW2;->setWarnLevel(F)V

    const-string v6, "coolant_critical_level"

    const-string v8, "120.0"

    invoke-interface {v7, v6, v8}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v6

    invoke-virtual {v4, v6}, LW2;->setCriticalLevel(F)V

    new-instance v6, Landroid/graphics/Paint;

    invoke-direct {v6}, Landroid/graphics/Paint;-><init>()V

    iput-object v6, v4, LW2;->p:Landroid/graphics/Paint;

    iget v7, v4, LW2;->j:I

    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v6, v4, LW2;->p:Landroid/graphics/Paint;

    invoke-virtual {v6, v9}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v6, v4, LW2;->p:Landroid/graphics/Paint;

    iget v7, v4, LW2;->i:I

    int-to-float v7, v7

    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    new-instance v6, Landroid/graphics/Paint;

    invoke-direct {v6}, Landroid/graphics/Paint;-><init>()V

    iput-object v6, v4, LW2;->q:Landroid/graphics/Paint;

    iget v7, v4, LW2;->k:I

    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v6, v4, LW2;->q:Landroid/graphics/Paint;

    invoke-virtual {v6, v9}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v6, v4, LW2;->q:Landroid/graphics/Paint;

    iget v7, v4, LW2;->i:I

    int-to-float v7, v7

    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    new-instance v6, Landroid/graphics/Paint;

    invoke-direct {v6}, Landroid/graphics/Paint;-><init>()V

    iput-object v6, v4, LW2;->r:Landroid/graphics/Paint;

    iget v7, v4, LW2;->l:I

    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v6, v4, LW2;->r:Landroid/graphics/Paint;

    invoke-virtual {v6, v9}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iget-object v6, v4, LW2;->r:Landroid/graphics/Paint;

    iget v7, v4, LW2;->i:I

    int-to-float v7, v7

    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-boolean v6, v1, LKf;->n:Z

    if-eqz v6, :cond_0

    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :goto_0
    iput-object v5, v1, Lru/zinovin/tankspeedometer/SpedometerPanel;->C:Lqg;

    iput-object v4, v1, Lru/zinovin/tankspeedometer/SpedometerPanel;->E:Lqg;

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    iput-object v2, v1, Lru/zinovin/tankspeedometer/SpedometerPanel;->C:Lqg;

    iput-object v2, v1, Lru/zinovin/tankspeedometer/SpedometerPanel;->E:Lqg;

    :goto_1
    iput-object v2, v1, Lru/zinovin/tankspeedometer/SpedometerPanel;->D:Lqg;

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
