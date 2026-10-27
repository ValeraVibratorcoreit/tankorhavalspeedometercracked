.class public Lvr;
.super Lzf;
.source "SourceFile"


# instance fields
.field public final e:LLf;

.field public f:I

.field public final g:F

.field public h:I

.field public i:I

.field public final j:I


# direct methods
.method public constructor <init>(Landroid/content/Context;LDg;F)V
    .locals 1

    const v0, 0x7f0e0183

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lzf;-><init>(Landroid/content/Context;LDg;I)V

    .line 2
    invoke-static {}, LLf;->a()LLf;

    move-result-object p1

    iput-object p1, p0, Lvr;->e:LLf;

    const p1, 0x7f1301df

    .line 3
    iput p1, p0, Lvr;->f:I

    const/4 p1, -0x1

    .line 4
    iput p1, p0, Lvr;->h:I

    const p1, -0x8b8987

    .line 5
    iput p1, p0, Lvr;->i:I

    const p1, 0x7f080152

    .line 6
    iput p1, p0, Lvr;->j:I

    .line 7
    iput p3, p0, Lvr;->g:F

    .line 8
    invoke-virtual {p0}, Lvr;->a()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LDg;FI)V
    .locals 1

    const v0, 0x7f0e0183

    .line 9
    invoke-direct {p0, p1, p2, v0}, Lzf;-><init>(Landroid/content/Context;LDg;I)V

    .line 10
    invoke-static {}, LLf;->a()LLf;

    move-result-object p1

    iput-object p1, p0, Lvr;->e:LLf;

    const p1, 0x7f1301df

    .line 11
    iput p1, p0, Lvr;->f:I

    const/4 p1, -0x1

    .line 12
    iput p1, p0, Lvr;->h:I

    const p1, -0x8b8987

    .line 13
    iput p1, p0, Lvr;->i:I

    .line 14
    iput p3, p0, Lvr;->g:F

    .line 15
    iput p4, p0, Lvr;->j:I

    .line 16
    invoke-virtual {p0}, Lvr;->a()V

    return-void
.end method

.method private getTitle()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lzf;->b:Landroid/content/Context;

    invoke-static {v0}, Lmk;->l(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "language"

    const-string v3, "sys"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    iget-object v2, v2, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    :cond_0
    invoke-static {v0, v1}, LF4;->b0(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Lvr;->getTitleId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 13

    const-string v0, "T500.FR"

    const-string v1, "TripInfoFragment.init()"

    invoke-static {v0, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lzf;->b:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/LayoutInflater;

    invoke-virtual {p0}, Lzf;->getLayout()I

    move-result v2

    invoke-virtual {v1, v2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    const v1, 0x7f0b015e

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    if-eqz v1, :cond_0

    iget v2, p0, Lvr;->j:I

    invoke-static {v0, v2}, LH7;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    iget v0, p0, Lvr;->g:F

    const v1, 0x3fd9999a    # 1.7f

    mul-float/2addr v1, v0

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->scaledDensity:F

    mul-float/2addr v1, v2

    const v2, 0x7f0b00ba

    invoke-virtual {p0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    new-instance v3, Lu7;

    invoke-direct {v3}, Lu7;-><init>()V

    invoke-virtual {v3, v2}, Lu7;->b(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    const v4, 0x7f0b0298

    invoke-virtual {p0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Landroid/view/View;->getId()I

    move-result v5

    float-to-int v6, v1

    invoke-virtual {v3, v5, v6}, Lu7;->d(II)V

    invoke-direct {p0}, Lvr;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setTextSize(F)V

    iget v5, p0, Lvr;->i:I

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_1
    const v4, 0x7f0b01de

    invoke-virtual {p0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    const-string v6, "%.1f"

    iget-object v7, p0, Lvr;->e:LLf;

    if-eqz v5, :cond_2

    float-to-int v8, v1

    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setHeight(I)V

    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v9

    invoke-virtual {v3, v9, v8}, Lu7;->d(II)V

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setTextSize(F)V

    new-instance v5, Lur;

    const/4 v8, 0x0

    invoke-direct {v5, p0, v8}, Lur;-><init>(Lvr;I)V

    iget-object v8, v7, LLf;->o:Ldr;

    invoke-static {v8, p0, v5}, LLf;->f(Loj;LDg;LMj;)V

    iget-object v5, v7, LLf;->o:Ldr;

    invoke-virtual {v5}, Loj;->d()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Float;

    iget v8, p0, Lvr;->h:I

    invoke-virtual {p0, v4, v6, v5, v8}, Lvr;->c(ILjava/lang/String;Ljava/lang/Object;I)V

    :cond_2
    const v4, 0x7f0b01db

    invoke-virtual {p0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    if-eqz v5, :cond_3

    float-to-int v8, v1

    invoke-virtual {v5, v8}, Landroid/widget/TextView;->setHeight(I)V

    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v9

    invoke-virtual {v3, v9, v8}, Lu7;->d(II)V

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setTextSize(F)V

    new-instance v5, Lur;

    const/4 v8, 0x1

    invoke-direct {v5, p0, v8}, Lur;-><init>(Lvr;I)V

    iget-object v8, v7, LLf;->q:Ldr;

    invoke-static {v8, p0, v5}, LLf;->f(Loj;LDg;LMj;)V

    iget-object v5, v7, LLf;->q:Ldr;

    invoke-virtual {v5}, Loj;->d()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Float;

    iget v8, p0, Lvr;->h:I

    invoke-virtual {p0, v4, v6, v5, v8}, Lvr;->c(ILjava/lang/String;Ljava/lang/Object;I)V

    :cond_3
    const v4, 0x7f0b007a

    invoke-virtual {p0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    const-string v8, "__._"

    const/high16 v9, -0x40800000    # -1.0f

    const-string v10, "%s"

    if-eqz v5, :cond_5

    float-to-int v11, v1

    invoke-virtual {v5, v11}, Landroid/widget/TextView;->setHeight(I)V

    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v12

    invoke-virtual {v3, v12, v11}, Lu7;->d(II)V

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setTextSize(F)V

    new-instance v5, Lur;

    const/4 v11, 0x2

    invoke-direct {v5, p0, v11}, Lur;-><init>(Lvr;I)V

    iget-object v11, v7, LLf;->k:Ldr;

    invoke-static {v11, p0, v5}, LLf;->f(Loj;LDg;LMj;)V

    iget-object v5, v7, LLf;->k:Ldr;

    invoke-virtual {v5}, Loj;->d()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Float;

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v11

    cmpl-float v11, v11, v9

    if-nez v11, :cond_4

    iget v5, p0, Lvr;->h:I

    invoke-virtual {p0, v4, v10, v8, v5}, Lvr;->c(ILjava/lang/String;Ljava/lang/Object;I)V

    goto :goto_0

    :cond_4
    iget v11, p0, Lvr;->h:I

    invoke-virtual {p0, v4, v6, v5, v11}, Lvr;->c(ILjava/lang/String;Ljava/lang/Object;I)V

    :cond_5
    :goto_0
    const v4, 0x7f0b007b

    invoke-virtual {p0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    if-eqz v5, :cond_7

    float-to-int v11, v1

    invoke-virtual {v5, v11}, Landroid/widget/TextView;->setHeight(I)V

    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v12

    invoke-virtual {v3, v12, v11}, Lu7;->d(II)V

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setTextSize(F)V

    new-instance v5, Lur;

    const/4 v11, 0x3

    invoke-direct {v5, p0, v11}, Lur;-><init>(Lvr;I)V

    iget-object v11, v7, LLf;->l:Ldr;

    invoke-static {v11, p0, v5}, LLf;->f(Loj;LDg;LMj;)V

    iget-object v5, v7, LLf;->l:Ldr;

    invoke-virtual {v5}, Loj;->d()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Float;

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v11

    cmpl-float v9, v11, v9

    if-nez v9, :cond_6

    iget v5, p0, Lvr;->h:I

    invoke-virtual {p0, v4, v10, v8, v5}, Lvr;->c(ILjava/lang/String;Ljava/lang/Object;I)V

    goto :goto_1

    :cond_6
    iget v8, p0, Lvr;->h:I

    invoke-virtual {p0, v4, v6, v5, v8}, Lvr;->c(ILjava/lang/String;Ljava/lang/Object;I)V

    :cond_7
    :goto_1
    const v4, 0x7f0b007d

    invoke-virtual {p0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    if-eqz v5, :cond_9

    float-to-int v6, v1

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setHeight(I)V

    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v8

    invoke-virtual {v3, v8, v6}, Lu7;->d(II)V

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setTextSize(F)V

    new-instance v5, Lur;

    const/4 v6, 0x4

    invoke-direct {v5, p0, v6}, Lur;-><init>(Lvr;I)V

    iget-object v6, v7, LLf;->m:Ldr;

    invoke-static {v6, p0, v5}, LLf;->f(Loj;LDg;LMj;)V

    iget-object v5, v7, LLf;->m:Ldr;

    invoke-virtual {v5}, Loj;->d()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Float;

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v6

    const/4 v8, 0x0

    cmpg-float v6, v6, v8

    if-gtz v6, :cond_8

    const-string v5, "___"

    iget v6, p0, Lvr;->h:I

    invoke-virtual {p0, v4, v10, v5, v6}, Lvr;->c(ILjava/lang/String;Ljava/lang/Object;I)V

    goto :goto_2

    :cond_8
    iget v6, p0, Lvr;->h:I

    const-string v8, "%.0f"

    invoke-virtual {p0, v4, v8, v5, v6}, Lvr;->c(ILjava/lang/String;Ljava/lang/Object;I)V

    :cond_9
    :goto_2
    const v4, 0x7f0b00e8

    invoke-virtual {p0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    if-eqz v5, :cond_c

    float-to-int v6, v1

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setHeight(I)V

    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v8

    invoke-virtual {v3, v8, v6}, Lu7;->d(II)V

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setTextSize(F)V

    const v5, 0x7f0b00ea

    invoke-virtual {p0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    if-eqz v8, :cond_a

    invoke-virtual {v8, v6}, Landroid/widget/TextView;->setHeight(I)V

    invoke-virtual {v8}, Landroid/view/View;->getId()I

    move-result v9

    invoke-virtual {v3, v9, v6}, Lu7;->d(II)V

    invoke-virtual {v8, v0}, Landroid/widget/TextView;->setTextSize(F)V

    :cond_a
    new-instance v6, Lur;

    const/4 v8, 0x5

    invoke-direct {v6, p0, v8}, Lur;-><init>(Lvr;I)V

    iget-object v8, v7, LLf;->n:Ldr;

    invoke-static {v8, p0, v6}, LLf;->f(Loj;LDg;LMj;)V

    iget-object v6, v7, LLf;->n:Ldr;

    invoke-virtual {v6}, Loj;->d()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-gtz v7, :cond_b

    const-string v6, "0"

    iget v7, p0, Lvr;->h:I

    invoke-virtual {p0, v4, v10, v6, v7}, Lvr;->c(ILjava/lang/String;Ljava/lang/Object;I)V

    const-string v4, "00"

    iget v6, p0, Lvr;->h:I

    invoke-virtual {p0, v5, v10, v4, v6}, Lvr;->c(ILjava/lang/String;Ljava/lang/Object;I)V

    goto :goto_3

    :cond_b
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v7

    div-int/lit8 v7, v7, 0x3c

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    rem-int/lit8 v6, v6, 0x3c

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iget v8, p0, Lvr;->h:I

    const-string v9, "%d"

    invoke-virtual {p0, v4, v9, v7, v8}, Lvr;->c(ILjava/lang/String;Ljava/lang/Object;I)V

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget v6, p0, Lvr;->h:I

    const-string v7, "%02d"

    invoke-virtual {p0, v5, v7, v4, v6}, Lvr;->c(ILjava/lang/String;Ljava/lang/Object;I)V

    :cond_c
    :goto_3
    const v4, 0x7f0b00e9

    invoke-virtual {p0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    const/high16 v5, 0x40800000    # 4.0f

    if-eqz v4, :cond_d

    float-to-int v6, v1

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setHeight(I)V

    invoke-virtual {v4}, Landroid/view/View;->getId()I

    move-result v7

    invoke-virtual {v3, v7, v6}, Lu7;->d(II)V

    sub-float v6, v0, v5

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setTextSize(F)V

    iget v6, p0, Lvr;->i:I

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_d
    const v4, 0x7f0b00eb

    invoke-virtual {p0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    if-eqz v4, :cond_e

    float-to-int v6, v1

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setHeight(I)V

    invoke-virtual {v4}, Landroid/view/View;->getId()I

    move-result v7

    invoke-virtual {v3, v7, v6}, Lu7;->d(II)V

    sub-float v6, v0, v5

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setTextSize(F)V

    iget v6, p0, Lvr;->i:I

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_e
    const v4, 0x7f0b0107

    invoke-virtual {p0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    if-eqz v4, :cond_f

    float-to-int v6, v1

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setHeight(I)V

    invoke-virtual {v4}, Landroid/view/View;->getId()I

    move-result v7

    invoke-virtual {v3, v7, v6}, Lu7;->d(II)V

    sub-float v6, v0, v5

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setTextSize(F)V

    iget v6, p0, Lvr;->i:I

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_f
    const v4, 0x7f0b0242

    invoke-virtual {p0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    if-eqz v4, :cond_10

    float-to-int v1, v1

    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setHeight(I)V

    invoke-virtual {v4}, Landroid/view/View;->getId()I

    move-result v6

    invoke-virtual {v3, v6, v1}, Lu7;->d(II)V

    sub-float/2addr v0, v5

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setTextSize(F)V

    iget v0, p0, Lvr;->i:I

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_10
    invoke-virtual {v3, v2}, Lu7;->a(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroidx/constraintlayout/widget/ConstraintLayout;->setConstraintSet(Lu7;)V

    invoke-virtual {v2}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public final c(ILjava/lang/String;Ljava/lang/Object;I)V
    .locals 1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_0

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    filled-new-array {p3}, [Ljava/lang/Object;

    move-result-object p3

    invoke-static {v0, p2, p3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p4}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public getColor()I
    .locals 1

    iget v0, p0, Lvr;->h:I

    return v0
.end method

.method public getParamColor()I
    .locals 1

    iget v0, p0, Lvr;->i:I

    return v0
.end method

.method public getTitleId()I
    .locals 1

    iget v0, p0, Lvr;->f:I

    return v0
.end method

.method public setColor(I)V
    .locals 0

    iput p1, p0, Lvr;->h:I

    return-void
.end method

.method public setParamColor(I)V
    .locals 0

    iput p1, p0, Lvr;->i:I

    return-void
.end method

.method public setTitleId(I)V
    .locals 0

    iput p1, p0, Lvr;->f:I

    return-void
.end method
