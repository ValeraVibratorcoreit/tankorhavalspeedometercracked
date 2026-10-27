.class public final Lgp;
.super Lzf;
.source "SourceFile"


# instance fields
.field public final e:LLf;

.field public f:Landroid/content/SharedPreferences;

.field public g:LU2;

.field public h:F

.field public i:F

.field public j:F

.field public k:F

.field public l:F

.field public m:F

.field public n:F

.field public o:I

.field public final p:I


# direct methods
.method public constructor <init>(Landroid/content/Context;LDg;FF)V
    .locals 1

    const v0, 0x7f0e0108

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lzf;-><init>(Landroid/content/Context;LDg;I)V

    .line 2
    invoke-static {}, LLf;->a()LLf;

    move-result-object p1

    iput-object p1, p0, Lgp;->e:LLf;

    const p1, 0x3f870a3d    # 1.055f

    .line 3
    iput p1, p0, Lgp;->h:F

    const p1, 0x3f85e354    # 1.046f

    .line 4
    iput p1, p0, Lgp;->i:F

    const p1, 0x3f856042    # 1.042f

    .line 5
    iput p1, p0, Lgp;->j:F

    const/high16 p1, 0x42980000    # 76.0f

    .line 6
    iput p1, p0, Lgp;->k:F

    const/high16 p1, 0x42c00000    # 96.0f

    .line 7
    iput p1, p0, Lgp;->l:F

    const/4 p1, -0x1

    .line 8
    iput p1, p0, Lgp;->o:I

    const p1, 0x7f080152

    .line 9
    iput p1, p0, Lgp;->p:I

    .line 10
    iput p3, p0, Lgp;->m:F

    .line 11
    iput p4, p0, Lgp;->n:F

    .line 12
    invoke-virtual {p0}, Lgp;->a()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LDg;I)V
    .locals 1

    const v0, 0x7f0e0108

    .line 13
    invoke-direct {p0, p1, p2, v0}, Lzf;-><init>(Landroid/content/Context;LDg;I)V

    .line 14
    invoke-static {}, LLf;->a()LLf;

    move-result-object p1

    iput-object p1, p0, Lgp;->e:LLf;

    const p1, 0x3f870a3d    # 1.055f

    .line 15
    iput p1, p0, Lgp;->h:F

    const p1, 0x3f85e354    # 1.046f

    .line 16
    iput p1, p0, Lgp;->i:F

    const p1, 0x3f856042    # 1.042f

    .line 17
    iput p1, p0, Lgp;->j:F

    const/high16 p1, 0x42980000    # 76.0f

    .line 18
    iput p1, p0, Lgp;->k:F

    const/high16 p1, 0x42c00000    # 96.0f

    .line 19
    iput p1, p0, Lgp;->l:F

    const/4 p1, -0x1

    .line 20
    iput p1, p0, Lgp;->o:I

    const/high16 p1, 0x43080000    # 136.0f

    .line 21
    iput p1, p0, Lgp;->m:F

    const/high16 p1, 0x42480000    # 50.0f

    .line 22
    iput p1, p0, Lgp;->n:F

    .line 23
    iput p3, p0, Lgp;->p:I

    .line 24
    invoke-virtual {p0}, Lgp;->a()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    const-string v0, "T500.FR"

    const-string v1, "SpeedFragment.init()"

    invoke-static {v0, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lzf;->b:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    invoke-virtual {p0}, Lzf;->getLayout()I

    move-result v1

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    iget v0, p0, Lgp;->p:I

    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundResource(I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lmk;->l(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lgp;->f:Landroid/content/SharedPreferences;

    const v0, 0x7f0b025c

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    new-instance v1, LU2;

    const/16 v2, 0x8

    invoke-direct {v1, p0, v2}, LU2;-><init>(Ljava/lang/Object;I)V

    iput-object v1, p0, Lgp;->g:LU2;

    iget-object v1, p0, Lgp;->f:Landroid/content/SharedPreferences;

    const-string v2, "ipSpeedKDefault"

    const-string v3, "1.055"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    iput v1, p0, Lgp;->h:F

    iget-object v1, p0, Lgp;->f:Landroid/content/SharedPreferences;

    const-string v2, "ipSpeedK1"

    const-string v3, "1.046"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    iput v1, p0, Lgp;->i:F

    iget-object v1, p0, Lgp;->f:Landroid/content/SharedPreferences;

    const-string v2, "1.042"

    const-string v3, "ipSpeedK2"

    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    iput v1, p0, Lgp;->j:F

    iget-object v1, p0, Lgp;->f:Landroid/content/SharedPreferences;

    const-string v2, "ipSpeed1"

    const-string v4, "76"

    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    iput v1, p0, Lgp;->k:F

    iget-object v1, p0, Lgp;->f:Landroid/content/SharedPreferences;

    const-string v2, "96"

    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    iput v1, p0, Lgp;->l:F

    iget v1, p0, Lgp;->m:F

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    new-instance v0, Ld4;

    const/16 v1, 0x9

    invoke-direct {v0, p0, v1}, Ld4;-><init>(Ljava/lang/Object;I)V

    iget-object v1, p0, Lgp;->e:LLf;

    iget-object v1, v1, LLf;->a:Ldr;

    invoke-static {v1, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    :cond_0
    const v0, 0x7f0b025d

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_1

    iget v1, p0, Lgp;->n:F

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    :cond_1
    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 2

    invoke-super {p0}, Lzf;->onAttachedToWindow()V

    iget-object v0, p0, Lgp;->g:LU2;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lgp;->f:Landroid/content/SharedPreferences;

    invoke-interface {v1, v0}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    :cond_0
    const-class v0, Lgp;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "onAttachedToWindow()-"

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "T500.INFO_FR"

    invoke-static {v1, v0}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    invoke-super {p0}, Lzf;->onDetachedFromWindow()V

    iget-object v0, p0, Lgp;->g:LU2;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lgp;->f:Landroid/content/SharedPreferences;

    invoke-interface {v1, v0}, Landroid/content/SharedPreferences;->unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    :cond_0
    const-class v0, Lgp;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "onDetachedFromWindow()-"

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "T500.INFO_FR"

    invoke-static {v1, v0}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setSpeedColor(I)V
    .locals 0

    iput p1, p0, Lgp;->o:I

    return-void
.end method

.method public setSpeedSize(F)V
    .locals 0

    iput p1, p0, Lgp;->m:F

    return-void
.end method

.method public setSpeedTxtSize(F)V
    .locals 0

    iput p1, p0, Lgp;->n:F

    return-void
.end method
