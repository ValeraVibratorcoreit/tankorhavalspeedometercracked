.class public Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;
.super LKf;
.source "SourceFile"


# static fields
.field public static final synthetic B:I


# instance fields
.field public A:Landroid/widget/ImageView;

.field public u:LU2;

.field public v:Landroid/widget/TextView;

.field public w:Lqg;

.field public x:Lqg;

.field public y:Lqg;

.field public z:Lqg;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LKf;-><init>()V

    return-void
.end method


# virtual methods
.method public final d()V
    .locals 1

    iget-object v0, p0, Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;->w:Lqg;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lqg;->a()V

    :cond_0
    iget-object v0, p0, Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;->x:Lqg;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lqg;->a()V

    :cond_1
    iget-object v0, p0, Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;->y:Lqg;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lqg;->a()V

    :cond_2
    iget-object v0, p0, Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;->z:Lqg;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lqg;->a()V

    :cond_3
    return-void
.end method

.method public final e()V
    .locals 3

    new-instance v0, LIf;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LIf;-><init>(LKf;I)V

    iget-object v1, p0, LKf;->c:LLf;

    iget-object v2, v1, LLf;->x:Ldr;

    invoke-static {v2, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    new-instance v0, LIf;

    const/4 v2, 0x1

    invoke-direct {v0, p0, v2}, LIf;-><init>(LKf;I)V

    iget-object v2, v1, LLf;->B:Ldr;

    invoke-static {v2, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    new-instance v0, Lk4;

    const/4 v2, 0x6

    invoke-direct {v0, p0, v2}, Lk4;-><init>(Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;I)V

    iget-object v2, v1, LLf;->t:Ldr;

    invoke-static {v2, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    new-instance v0, Lk4;

    const/16 v2, 0xc

    invoke-direct {v0, p0, v2}, Lk4;-><init>(Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;I)V

    iget-object v2, v1, LLf;->d:Ldr;

    invoke-static {v2, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    new-instance v0, Lk4;

    const/16 v2, 0xd

    invoke-direct {v0, p0, v2}, Lk4;-><init>(Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;I)V

    iget-object v2, v1, LLf;->c:Ldr;

    invoke-static {v2, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    new-instance v0, Lk4;

    const/16 v2, 0xe

    invoke-direct {v0, p0, v2}, Lk4;-><init>(Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;I)V

    iget-object v2, v1, LLf;->p:Ldr;

    invoke-static {v2, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    new-instance v0, Lk4;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lk4;-><init>(Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;I)V

    iget-object v2, v1, LLf;->f:Ldr;

    invoke-static {v2, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    new-instance v0, Lk4;

    const/4 v2, 0x1

    invoke-direct {v0, p0, v2}, Lk4;-><init>(Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;I)V

    iget-object v2, v1, LLf;->g:Ldr;

    invoke-static {v2, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    new-instance v0, Lk4;

    const/4 v2, 0x2

    invoke-direct {v0, p0, v2}, Lk4;-><init>(Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;I)V

    iget-object v2, v1, LLf;->h:Ldr;

    invoke-static {v2, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    new-instance v0, Lk4;

    const/4 v2, 0x3

    invoke-direct {v0, p0, v2}, Lk4;-><init>(Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;I)V

    iget-object v2, v1, LLf;->e:Ldr;

    invoke-static {v2, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    new-instance v0, Lk4;

    const/4 v2, 0x4

    invoke-direct {v0, p0, v2}, Lk4;-><init>(Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;I)V

    iget-object v2, v1, LLf;->f:Ldr;

    invoke-static {v2, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    new-instance v0, Lk4;

    const/4 v2, 0x5

    invoke-direct {v0, p0, v2}, Lk4;-><init>(Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;I)V

    iget-object v2, v1, LLf;->F:Ldr;

    invoke-static {v2, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    new-instance v0, Lk4;

    const/4 v2, 0x7

    invoke-direct {v0, p0, v2}, Lk4;-><init>(Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;I)V

    iget-object v2, v1, LLf;->i:Ldr;

    invoke-static {v2, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    new-instance v0, Lk4;

    const/16 v2, 0x8

    invoke-direct {v0, p0, v2}, Lk4;-><init>(Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;I)V

    iget-object v2, v1, LLf;->j:Ldr;

    invoke-static {v2, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    new-instance v0, Lk4;

    const/16 v2, 0x9

    invoke-direct {v0, p0, v2}, Lk4;-><init>(Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;I)V

    iget-object v2, v1, LLf;->r:Ldr;

    invoke-static {v2, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    new-instance v0, Lk4;

    const/16 v2, 0xa

    invoke-direct {v0, p0, v2}, Lk4;-><init>(Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;I)V

    iget-object v2, v1, LLf;->s:Ldr;

    invoke-static {v2, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    new-instance v0, Lk4;

    const/16 v2, 0xb

    invoke-direct {v0, p0, v2}, Lk4;-><init>(Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;I)V

    iget-object v1, v1, LLf;->x:Ldr;

    invoke-static {v1, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    return-void
.end method

.method public final f()V
    .locals 2

    new-instance v0, LU2;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, LU2;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;->u:LU2;

    iget-object v1, p0, LKf;->b:Landroid/content/SharedPreferences;

    invoke-interface {v1, v0}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    return-void
.end method

.method public final g()V
    .locals 9

    const v0, 0x7f0b0117

    invoke-virtual {p0, v0}, LKf;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lqg;

    iput-object v0, p0, Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;->w:Lqg;

    const v0, 0x7f0b0118

    invoke-virtual {p0, v0}, LKf;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lqg;

    iput-object v0, p0, Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;->x:Lqg;

    const v0, 0x7f0b00c2

    invoke-virtual {p0, v0}, LKf;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lqg;

    iput-object v0, p0, Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;->y:Lqg;

    const v0, 0x7f0b0085

    invoke-virtual {p0, v0}, LKf;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lqg;

    iput-object v0, p0, Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;->z:Lqg;

    const v0, 0x7f0b02ca

    invoke-virtual {p0, v0}, LKf;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;->A:Landroid/widget/ImageView;

    const v0, 0x7f0b011b

    invoke-virtual {p0, v0}, LKf;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;->v:Landroid/widget/TextView;

    iget-object v0, p0, Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;->z:Lqg;

    iget-object v7, p0, LKf;->c:LLf;

    if-eqz v0, :cond_0

    iget-object v1, v7, LLf;->f:Ldr;

    invoke-virtual {v1}, Loj;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {v0, v1}, Lqg;->setLevelValue(F)V

    :cond_0
    invoke-virtual {v7}, LLf;->c()Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/high16 v1, 0x42c80000    # 100.0f

    cmpg-float v2, v0, v1

    if-gez v2, :cond_1

    invoke-static {}, LTf;->u()F

    move-result v2

    mul-float/2addr v2, v0

    goto :goto_0

    :cond_1
    invoke-static {}, LTf;->t()F

    move-result v2

    :goto_0
    invoke-static {}, LTf;->t()F

    move-result v0

    div-float v0, v2, v0

    mul-float/2addr v0, v1

    iget-object v1, p0, Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;->w:Lqg;

    if-eqz v1, :cond_2

    invoke-virtual {v1, v0}, Lqg;->setLevelValue(F)V

    :cond_2
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    iget v4, p0, LKf;->d:I

    const/4 v5, -0x1

    const-string v6, "%.0f"

    const v1, 0x7f0b0115

    const-string v3, " L"

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    iget-object v0, v7, LLf;->h:Ldr;

    invoke-virtual {v0}, Loj;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float/2addr v0, v1

    div-float v1, v0, v1

    iget-object v2, p0, Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;->x:Lqg;

    if-eqz v2, :cond_3

    invoke-virtual {v2, v1}, Lqg;->setLevelValue(F)V

    :cond_3
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    iget v4, p0, LKf;->d:I

    const/4 v5, -0x1

    const-string v6, "%.0f"

    const v1, 0x7f0b0119

    const-string v3, " L"

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    iget-object v0, v7, LLf;->p:Ldr;

    invoke-virtual {v0}, Loj;->d()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Float;

    iget v4, p0, LKf;->d:I

    const/4 v5, -0x1

    const-string v6, "%.0f"

    const v1, 0x7f0b01e0

    const-string v3, " km"

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    iget-object v0, v7, LLf;->i:Ldr;

    invoke-virtual {v0}, Loj;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/4 v8, 0x0

    cmpl-float v0, v0, v8

    if-lez v0, :cond_4

    iget-object v0, v7, LLf;->i:Ldr;

    invoke-virtual {v0}, Loj;->d()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Float;

    iget v4, p0, LKf;->d:I

    const/4 v5, -0x1

    const-string v6, "%.0f"

    const v1, 0x7f0b0214

    const-string v3, " km"

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    goto :goto_1

    :cond_4
    iget v4, p0, LKf;->d:I

    const/4 v5, -0x1

    const-string v6, "%s"

    const v1, 0x7f0b0214

    const-string v2, "---"

    const-string v3, " km"

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    :goto_1
    iget-object v0, v7, LLf;->j:Ldr;

    invoke-virtual {v0}, Loj;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    cmpl-float v0, v0, v8

    if-lez v0, :cond_5

    iget-object v0, v7, LLf;->j:Ldr;

    invoke-virtual {v0}, Loj;->d()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Float;

    iget v4, p0, LKf;->d:I

    const/4 v5, -0x1

    const-string v6, "%.0f"

    const v1, 0x7f0b0215

    const-string v3, " km"

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    goto :goto_2

    :cond_5
    iget v4, p0, LKf;->d:I

    const/4 v5, -0x1

    const-string v6, "%s"

    const v1, 0x7f0b0215

    const-string v2, "---"

    const-string v3, " km"

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    :goto_2
    iget-object v0, v7, LLf;->F:Ldr;

    invoke-virtual {v0}, Loj;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    cmpl-float v0, v0, v8

    if-lez v0, :cond_6

    iget-object v0, v7, LLf;->F:Ldr;

    invoke-virtual {v0}, Loj;->d()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Float;

    iget v4, p0, LKf;->d:I

    const/4 v5, -0x1

    const-string v6, "%.0f"

    const v1, 0x7f0b00fe

    const-string v3, " km"

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    goto :goto_3

    :cond_6
    iget v4, p0, LKf;->d:I

    const/4 v5, -0x1

    const-string v6, "%s"

    const v1, 0x7f0b00fe

    const-string v2, "---"

    const-string v3, " km"

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    :goto_3
    invoke-virtual {v7}, LLf;->b()Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/high16 v1, -0x3b860000    # -1000.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_7

    invoke-virtual {v7}, LLf;->b()Ljava/lang/Float;

    move-result-object v2

    iget v4, p0, LKf;->d:I

    iget v5, p0, LKf;->e:I

    const v1, 0x7f0b01f3

    const-string v6, "%.0f"

    const-string v3, ""

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    invoke-virtual {v7}, LLf;->b()Ljava/lang/Float;

    move-result-object v0

    iget-object v1, v7, LLf;->s:Ldr;

    invoke-virtual {v1, v0}, Ldr;->f(Ljava/lang/Object;)V

    :cond_7
    iget-object v0, v7, LLf;->r:Ldr;

    invoke-virtual {v0}, Loj;->d()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v8

    iget v4, p0, LKf;->d:I

    const/4 v5, -0x1

    const-string v6, "%.0f"

    const v1, 0x7f0b00c0

    const-string v3, " \u00b0C"

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    iget-object v0, p0, Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;->y:Lqg;

    if-eqz v0, :cond_8

    invoke-virtual {v0, v8}, Lqg;->setLevelValue(F)V

    :cond_8
    iget-object v0, p0, Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;->A:Landroid/widget/ImageView;

    if-eqz v0, :cond_a

    iget-object v1, v7, LLf;->x:Ldr;

    invoke-virtual {v1}, Loj;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_9

    const v1, 0x7f080182

    goto :goto_4

    :cond_9
    const v1, 0x7f080181

    :goto_4
    invoke-static {p0, v1}, LH7;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_a
    return-void
.end method

.method public final m()V
    .locals 7

    const-string v0, "basic_instrumental_panel"

    invoke-virtual {p0, v0}, LKf;->n(Ljava/lang/String;)V

    const v0, 0x7f0b01c5

    invoke-virtual {p0, v0}, LKf;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    :cond_0
    iget-object v0, p0, LKf;->c:LLf;

    iget-object v1, v0, LLf;->w:Ldr;

    invoke-virtual {v1}, Loj;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-static {}, LUd;->A()I

    iget-object v2, p0, LKf;->b:Landroid/content/SharedPreferences;

    const-string v3, "carModel"

    const-string v4, "tank_500"

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "tank_700"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "tank_700eo"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "tank_400"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "tank_500bt"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    :cond_1
    const v3, 0x7f0b0186

    invoke-virtual {p0, v3}, LKf;->c(I)Landroid/view/View;

    move-result-object v3

    const v5, 0x7f0800af

    invoke-virtual {v3, v5}, Landroid/view/View;->setBackgroundResource(I)V

    :cond_2
    iget-object v3, p0, LKf;->b:Landroid/content/SharedPreferences;

    const-string v5, "extFirmware"

    const/4 v6, 0x1

    invoke-interface {v3, v5, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const v2, 0x7f0b01e0

    invoke-virtual {p0, v2}, LKf;->c(I)Landroid/view/View;

    move-result-object v2

    const/4 v3, 0x4

    invoke-static {v2, v3}, LKf;->p(Landroid/view/View;I)V

    :cond_3
    iget-object v0, v0, LLf;->v:Ldr;

    invoke-virtual {v0}, Loj;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v1}, LKf;->a(ZZ)V

    :cond_4
    return-void
.end method

.method public final onDestroy()V
    .locals 2

    iget-object v0, p0, Lru/zinovin/tankspeedometer/BasicInstrumentalPanel;->u:LU2;

    if-eqz v0, :cond_0

    iget-object v1, p0, LKf;->b:Landroid/content/SharedPreferences;

    invoke-interface {v1, v0}, Landroid/content/SharedPreferences;->unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    :cond_0
    invoke-super {p0}, LKf;->onDestroy()V

    return-void
.end method
