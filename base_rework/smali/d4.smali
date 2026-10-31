.class public final synthetic Ld4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmo;
.implements LMj;
.implements Lke;
.implements LVn;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Ld4;->a:I

    iput-object p1, p0, Ld4;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;)V
    .locals 2

    iget v0, p0, Ld4;->a:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    iget-object v0, p0, Ld4;->b:Ljava/lang/Object;

    check-cast v0, LDq;

    iget-object v1, v0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    iput-object p1, v1, Lru/zinovin/tankspeedometer/MainActivity;->z:Ljava/lang/String;

    invoke-virtual {v0}, LDq;->c0()V

    return-void

    :pswitch_1
    iget-object v0, p0, Ld4;->b:Ljava/lang/Object;

    check-cast v0, Lsj;

    iget-object v1, v0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    iput-object p1, v1, Lru/zinovin/tankspeedometer/MainActivity;->z:Ljava/lang/String;

    invoke-virtual {v0}, Lsj;->c0()V

    return-void

    :pswitch_2
    iget-object v0, p0, Ld4;->b:Ljava/lang/Object;

    check-cast v0, Lqf;

    iget-object v1, v0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    iput-object p1, v1, Lru/zinovin/tankspeedometer/MainActivity;->z:Ljava/lang/String;

    invoke-virtual {v0}, Lqf;->e0()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public c(Z)V
    .locals 3

    iget-object v0, p0, Ld4;->b:Ljava/lang/Object;

    check-cast v0, Lut;

    iget-object v1, v0, Lut;->U:Landroid/net/wifi/WifiManager;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    const-string v2, "android.permission.CHANGE_WIFI_STATE"

    invoke-static {v1, v2}, LF4;->j(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_0

    iget-object v0, v0, Lut;->U:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0, p1}, Landroid/net/wifi/WifiManager;->setWifiEnabled(Z)Z

    :cond_0
    return-void
.end method

.method public w(Ljava/lang/Object;)V
    .locals 6

    iget v0, p0, Ld4;->a:I

    check-cast p1, Ljava/lang/Float;

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ld4;->b:Ljava/lang/Object;

    check-cast v0, Lgp;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-ltz v1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget v2, v0, Lgp;->h:F

    iget v3, v0, Lgp;->l:F

    cmpl-float v3, p1, v3

    if-lez v3, :cond_0

    iget v2, v0, Lgp;->j:F

    goto :goto_0

    :cond_0
    iget v3, v0, Lgp;->k:F

    cmpl-float p1, p1, v3

    if-lez p1, :cond_1

    iget v2, v0, Lgp;->i:F

    :cond_1
    :goto_0
    mul-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iget v1, v0, Lgp;->o:I

    const v2, 0x7f0b025c

    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_2

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v3, "%.0f"

    invoke-static {v2, v3, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    return-void

    :pswitch_0
    iget-object v0, p0, Ld4;->b:Ljava/lang/Object;

    check-cast v0, Lhn;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-ltz v1, :cond_5

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    const/high16 v2, 0x447a0000    # 1000.0f

    div-float/2addr v1, v2

    iget v2, v0, Lhn;->g:F

    sub-float/2addr v2, v1

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    float-to-double v2, v2

    const-wide v4, 0x3f847ae147ae147bL    # 0.01

    cmpl-double v2, v2, v4

    if-lez v2, :cond_5

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    const v3, 0x45bb8000    # 6000.0f

    cmpg-float p1, p1, v3

    if-gez p1, :cond_3

    iget p1, v0, Lhn;->e:I

    goto :goto_1

    :cond_3
    iget p1, v0, Lhn;->f:I

    :goto_1
    const v3, 0x7f0b0228

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    if-eqz v3, :cond_4

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v5, "%.1f"

    invoke-static {v4, v5, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_4
    iput v1, v0, Lhn;->g:F

    :cond_5
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method
