.class public final Lhn;
.super Lzf;
.source "SourceFile"


# instance fields
.field public e:I

.field public f:I

.field public g:F


# direct methods
.method public constructor <init>(Landroid/content/Context;LDg;FF)V
    .locals 1

    const v0, 0x7f0e0100

    invoke-direct {p0, p1, p2, v0}, Lzf;-><init>(Landroid/content/Context;LDg;I)V

    invoke-static {}, LLf;->a()LLf;

    move-result-object p1

    const/4 p2, -0x1

    iput p2, p0, Lhn;->e:I

    const/high16 p2, -0x10000

    iput p2, p0, Lhn;->f:I

    const/4 p2, 0x0

    iput p2, p0, Lhn;->g:F

    iget-object p2, p0, Lzf;->b:Landroid/content/Context;

    const-string v0, "layout_inflater"

    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/LayoutInflater;

    invoke-virtual {p0}, Lzf;->getLayout()I

    move-result v0

    invoke-virtual {p2, v0, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    const p2, 0x7f0b0228

    invoke-virtual {p0, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    if-eqz p2, :cond_0

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setTextSize(F)V

    new-instance p2, Ld4;

    const/4 p3, 0x5

    invoke-direct {p2, p0, p3}, Ld4;-><init>(Ljava/lang/Object;I)V

    iget-object p1, p1, LLf;->b:Ldr;

    invoke-static {p1, p0, p2}, LLf;->f(Loj;LDg;LMj;)V

    :cond_0
    const p1, 0x7f0b0229

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_1

    invoke-virtual {p1, p4}, Landroid/widget/TextView;->setTextSize(F)V

    :cond_1
    return-void
.end method


# virtual methods
.method public setRpmColor(I)V
    .locals 0

    iput p1, p0, Lhn;->e:I

    return-void
.end method

.method public setRpmCriticalColor(I)V
    .locals 0

    iput p1, p0, Lhn;->f:I

    return-void
.end method
