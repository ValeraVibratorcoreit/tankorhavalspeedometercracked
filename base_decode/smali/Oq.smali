.class public final LOq;
.super Lzf;
.source "SourceFile"


# instance fields
.field public final e:LLf;

.field public f:Landroid/content/SharedPreferences;

.field public g:LU2;

.field public h:Landroid/widget/ImageView;

.field public i:Landroid/widget/ImageView;

.field public j:Landroid/widget/ImageView;

.field public k:Landroid/widget/ImageView;

.field public l:F

.field public m:I

.field public n:I

.field public o:Ljava/lang/String;

.field public p:Ljava/lang/String;

.field public final q:I


# direct methods
.method public constructor <init>(Landroid/content/Context;LDg;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lzf;-><init>(Landroid/content/Context;LDg;I)V

    .line 2
    invoke-static {}, LLf;->a()LLf;

    move-result-object p1

    iput-object p1, p0, LOq;->e:LLf;

    const/high16 p1, 0x43520000    # 210.0f

    .line 3
    iput p1, p0, LOq;->l:F

    const/4 p1, -0x1

    .line 4
    iput p1, p0, LOq;->m:I

    const p1, -0x8b8987

    .line 5
    iput p1, p0, LOq;->n:I

    .line 6
    const-string p1, "\u00b0C"

    iput-object p1, p0, LOq;->o:Ljava/lang/String;

    .line 7
    const-string p1, "kPa"

    iput-object p1, p0, LOq;->p:Ljava/lang/String;

    const p1, 0x7f080152

    .line 8
    iput p1, p0, LOq;->q:I

    .line 9
    invoke-virtual {p0}, LOq;->a()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LDg;II)V
    .locals 0

    .line 10
    invoke-direct {p0, p1, p2, p3}, Lzf;-><init>(Landroid/content/Context;LDg;I)V

    .line 11
    invoke-static {}, LLf;->a()LLf;

    move-result-object p1

    iput-object p1, p0, LOq;->e:LLf;

    const/high16 p1, 0x43520000    # 210.0f

    .line 12
    iput p1, p0, LOq;->l:F

    const/4 p1, -0x1

    .line 13
    iput p1, p0, LOq;->m:I

    const p1, -0x8b8987

    .line 14
    iput p1, p0, LOq;->n:I

    .line 15
    const-string p1, "\u00b0C"

    iput-object p1, p0, LOq;->o:Ljava/lang/String;

    .line 16
    const-string p1, "kPa"

    iput-object p1, p0, LOq;->p:Ljava/lang/String;

    .line 17
    iput p4, p0, LOq;->q:I

    .line 18
    invoke-virtual {p0}, LOq;->a()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    const-string v0, "T500.FR"

    const-string v1, "TiresFragment.init()"

    invoke-static {v0, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lzf;->b:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/LayoutInflater;

    invoke-virtual {p0}, Lzf;->getLayout()I

    move-result v2

    invoke-virtual {v1, v2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lmk;->l(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    iput-object v1, p0, LOq;->f:Landroid/content/SharedPreferences;

    const-string v2, "tiresLowValue"

    const-string v3, "210"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    iput v1, p0, LOq;->l:F

    iget-object v1, p0, LOq;->e:LLf;

    iget-object v2, v1, LLf;->A:Ldr;

    invoke-virtual {v2}, Loj;->d()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_1

    const/4 v4, 0x3

    if-eq v2, v4, :cond_0

    const-string v2, "kPa"

    goto :goto_0

    :cond_0
    const-string v2, "bar"

    goto :goto_0

    :cond_1
    const-string v2, "psi"

    :goto_0
    iput-object v2, p0, LOq;->p:Ljava/lang/String;

    iget-object v2, v1, LLf;->C:Ldr;

    invoke-virtual {v2}, Loj;->d()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v3, :cond_2

    const-string v2, "\u00b0F"

    goto :goto_1

    :cond_2
    const-string v2, "\u00b0C"

    :goto_1
    iput-object v2, p0, LOq;->o:Ljava/lang/String;

    new-instance v2, LU2;

    const/16 v3, 0x9

    invoke-direct {v2, p0, v3}, LU2;-><init>(Ljava/lang/Object;I)V

    iput-object v2, p0, LOq;->g:LU2;

    const v2, 0x7f0b0174

    invoke-virtual {p0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    iput-object v2, p0, LOq;->h:Landroid/widget/ImageView;

    const v2, 0x7f0b0181

    invoke-virtual {p0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    iput-object v2, p0, LOq;->i:Landroid/widget/ImageView;

    const v2, 0x7f0b0218

    invoke-virtual {p0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    iput-object v2, p0, LOq;->j:Landroid/widget/ImageView;

    const v2, 0x7f0b022a

    invoke-virtual {p0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    iput-object v2, p0, LOq;->k:Landroid/widget/ImageView;

    const v2, 0x7f0b015e

    invoke-virtual {p0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    if-eqz v2, :cond_3

    iget v3, p0, LOq;->q:I

    invoke-static {v0, v3}, LH7;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_3
    new-instance v0, LNq;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, LNq;-><init>(LOq;I)V

    iget-object v2, v1, LLf;->z:Ldr;

    invoke-static {v2, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    new-instance v0, LNq;

    const/4 v2, 0x1

    invoke-direct {v0, p0, v2}, LNq;-><init>(LOq;I)V

    iget-object v2, v1, LLf;->C:Ldr;

    invoke-static {v2, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    new-instance v0, LNq;

    const/4 v2, 0x2

    invoke-direct {v0, p0, v2}, LNq;-><init>(LOq;I)V

    iget-object v1, v1, LLf;->A:Ldr;

    invoke-static {v1, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    return-void
.end method

.method public final c(F)Z
    .locals 4

    iget v0, p0, LOq;->l:F

    iget-object v1, p0, LOq;->e:LLf;

    iget-object v1, v1, LLf;->A:Ldr;

    invoke-virtual {v1}, Loj;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    const/4 v3, 0x3

    if-eq v1, v3, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, LOq;->l:F

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    goto :goto_0

    :cond_1
    iget v0, p0, LOq;->l:F

    const v1, 0x3e1484d7

    mul-float/2addr v0, v1

    :goto_0
    cmpg-float p1, p1, v0

    if-gez p1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    return v2
.end method

.method public final varargs d(IILjava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_0

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v0, p3, p4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public final e(Ljava/lang/String;)V
    .locals 11

    const-string v0, "(-?\\d+\\.\\d+)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    move v2, v0

    move v3, v2

    move v4, v3

    move v5, v4

    move v6, v5

    move v7, v6

    move v8, v1

    move v1, v7

    :goto_0
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v9

    packed-switch v8, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    move v7, v9

    goto :goto_1

    :pswitch_1
    move v3, v9

    goto :goto_1

    :pswitch_2
    move v5, v9

    goto :goto_1

    :pswitch_3
    move v1, v9

    goto :goto_1

    :pswitch_4
    move v6, v9

    goto :goto_1

    :pswitch_5
    move v2, v9

    goto :goto_1

    :pswitch_6
    move v4, v9

    goto :goto_1

    :pswitch_7
    move v0, v9

    :goto_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, LOq;->h:Landroid/widget/ImageView;

    invoke-virtual {p0, v0}, LOq;->c(F)Z

    move-result v8

    const v9, 0x7f08014d

    const v10, 0x7f08014e

    if-eqz v8, :cond_1

    move v8, v10

    goto :goto_2

    :cond_1
    move v8, v9

    :goto_2
    invoke-virtual {p1, v8}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object p1, p0, LOq;->i:Landroid/widget/ImageView;

    invoke-virtual {p0, v1}, LOq;->c(F)Z

    move-result v8

    if-eqz v8, :cond_2

    move v8, v10

    goto :goto_3

    :cond_2
    move v8, v9

    :goto_3
    invoke-virtual {p1, v8}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object p1, p0, LOq;->j:Landroid/widget/ImageView;

    invoke-virtual {p0, v2}, LOq;->c(F)Z

    move-result v8

    if-eqz v8, :cond_3

    move v8, v10

    goto :goto_4

    :cond_3
    move v8, v9

    :goto_4
    invoke-virtual {p1, v8}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object p1, p0, LOq;->k:Landroid/widget/ImageView;

    invoke-virtual {p0, v3}, LOq;->c(F)Z

    move-result v8

    if-eqz v8, :cond_4

    move v9, v10

    :cond_4
    invoke-virtual {p1, v9}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object p1, p0, LOq;->e:LLf;

    iget-object p1, p1, LLf;->A:Ldr;

    invoke-virtual {p1}, Loj;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v8, 0x2

    if-ne p1, v8, :cond_5

    const-string p1, "%.0f"

    goto :goto_5

    :cond_5
    const-string p1, "%.1f"

    :goto_5
    invoke-virtual {p0, v0}, LOq;->c(F)Z

    move-result v8

    const v9, -0x113afeff

    if-eqz v8, :cond_6

    move v8, v9

    goto :goto_6

    :cond_6
    invoke-virtual {p0}, LOq;->getpColor()I

    move-result v8

    :goto_6
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const v10, 0x7f0b0175

    invoke-virtual {p0, v10, v8, p1, v0}, LOq;->d(IILjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, LOq;->gettColor()I

    move-result v0

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    const v8, 0x7f0b0176

    const-string v10, "/%.0f"

    invoke-virtual {p0, v8, v0, v10, v4}, LOq;->d(IILjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0, v1}, LOq;->c(F)Z

    move-result v0

    if-eqz v0, :cond_7

    move v0, v9

    goto :goto_7

    :cond_7
    invoke-virtual {p0}, LOq;->getpColor()I

    move-result v0

    :goto_7
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const v4, 0x7f0b0182

    invoke-virtual {p0, v4, v0, p1, v1}, LOq;->d(IILjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, LOq;->gettColor()I

    move-result v0

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const v4, 0x7f0b0183

    invoke-virtual {p0, v4, v0, v10, v1}, LOq;->d(IILjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0, v2}, LOq;->c(F)Z

    move-result v0

    if-eqz v0, :cond_8

    move v0, v9

    goto :goto_8

    :cond_8
    invoke-virtual {p0}, LOq;->getpColor()I

    move-result v0

    :goto_8
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const v2, 0x7f0b0219

    invoke-virtual {p0, v2, v0, p1, v1}, LOq;->d(IILjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, LOq;->gettColor()I

    move-result v0

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const v2, 0x7f0b021a

    invoke-virtual {p0, v2, v0, v10, v1}, LOq;->d(IILjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0, v3}, LOq;->c(F)Z

    move-result v0

    if-eqz v0, :cond_9

    goto :goto_9

    :cond_9
    invoke-virtual {p0}, LOq;->getpColor()I

    move-result v9

    :goto_9
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const v1, 0x7f0b022b

    invoke-virtual {p0, v1, v9, p1, v0}, LOq;->d(IILjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, LOq;->gettColor()I

    move-result p1

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const v1, 0x7f0b022c

    invoke-virtual {p0, v1, p1, v10, v0}, LOq;->d(IILjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, LOq;->gettColor()I

    move-result p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LOq;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LOq;->o:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const v1, 0x7f0b0296

    const-string v2, "%s"

    invoke-virtual {p0, v1, p1, v2, v0}, LOq;->d(IILjava/lang/String;[Ljava/lang/Object;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getpColor()I
    .locals 1

    iget v0, p0, LOq;->m:I

    return v0
.end method

.method public gettColor()I
    .locals 1

    iget v0, p0, LOq;->n:I

    return v0
.end method

.method public final onAttachedToWindow()V
    .locals 2

    invoke-super {p0}, Lzf;->onAttachedToWindow()V

    iget-object v0, p0, LOq;->g:LU2;

    if-eqz v0, :cond_0

    iget-object v1, p0, LOq;->f:Landroid/content/SharedPreferences;

    invoke-interface {v1, v0}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    :cond_0
    const-class v0, LOq;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TiresFragment.onAttachedToWindow()-"

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "T500.FR"

    invoke-static {v1, v0}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    invoke-super {p0}, Lzf;->onDetachedFromWindow()V

    iget-object v0, p0, LOq;->g:LU2;

    if-eqz v0, :cond_0

    iget-object v1, p0, LOq;->f:Landroid/content/SharedPreferences;

    invoke-interface {v1, v0}, Landroid/content/SharedPreferences;->unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    :cond_0
    const-class v0, LOq;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "TiresFragment.onDetachedFromWindow()-"

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "T500.FR"

    invoke-static {v1, v0}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setpColor(I)V
    .locals 0

    iput p1, p0, LOq;->m:I

    return-void
.end method

.method public settColor(I)V
    .locals 0

    iput p1, p0, LOq;->n:I

    return-void
.end method
