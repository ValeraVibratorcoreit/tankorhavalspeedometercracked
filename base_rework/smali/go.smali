.class public final Lgo;
.super LOl;
.source "SourceFile"


# instance fields
.field public final c:Ljava/util/List;

.field public final d:Ld4;

.field public e:I


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Ld4;)V
    .locals 1

    invoke-direct {p0}, LOl;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lgo;->e:I

    iput-object p1, p0, Lgo;->c:Ljava/util/List;

    iput-object p2, p0, Lgo;->d:Ld4;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, Lgo;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final c(Llm;I)V
    .locals 4

    check-cast p1, Lfo;

    iget-object v0, p0, Lgo;->c:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leo;

    iget v1, v0, Leo;->b:I

    iget-object v2, p1, Lfo;->u:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(I)V

    const/4 v1, 0x0

    iget-object v3, p1, Lfo;->t:Landroid/widget/ImageView;

    iget v0, v0, Leo;->c:I

    if-eqz v0, :cond_0

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {v3, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    :cond_0
    const/16 v0, 0x8

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    :goto_0
    iget v0, p0, Lgo;->e:I

    if-ne p2, v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    iget-object p2, p1, Llm;->a:Landroid/view/View;

    invoke-virtual {p2, v1}, Landroid/view/View;->setSelected(Z)V

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setSelected(Z)V

    invoke-virtual {v3, v1}, Landroid/widget/ImageView;->setSelected(Z)V

    new-instance v0, LC3;

    const/4 v1, 0x5

    invoke-direct {v0, p0, v1, p1}, LC3;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final d(Landroid/view/ViewGroup;)Llm;
    .locals 3

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0e0106

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    new-instance v0, Lfo;

    invoke-direct {v0, p1}, Lfo;-><init>(Landroid/view/View;)V

    return-object v0
.end method
