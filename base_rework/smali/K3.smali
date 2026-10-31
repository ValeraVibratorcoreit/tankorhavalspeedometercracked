.class public final LK3;
.super Landroid/widget/ArrayAdapter;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final synthetic b:LL3;


# direct methods
.method public constructor <init>(LL3;Landroid/content/Context;Ljava/util/ArrayList;)V
    .locals 0

    iput-object p1, p0, LK3;->b:LL3;

    const/4 p1, 0x0

    invoke-direct {p0, p2, p1, p3}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    const p1, 0x7f0e00ae

    iput p1, p0, LK3;->a:I

    return-void
.end method


# virtual methods
.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    invoke-virtual {p0, p1}, Landroid/widget/ArrayAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LF3;

    const/4 v0, 0x0

    if-nez p2, :cond_0

    invoke-virtual {p0}, Landroid/widget/ArrayAdapter;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    iget v1, p0, LK3;->a:I

    invoke-virtual {p2, v1, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    :cond_0
    const p3, 0x7f0b0163

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/ImageView;

    const v1, 0x7f0b0164

    invoke-virtual {p2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f0b0162

    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v3, 0x7f0b009a

    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageButton;

    const/4 v4, 0x4

    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v3, p1, LF3;->a:Landroid/net/Uri;

    if-eqz v3, :cond_1

    invoke-virtual {p3, v3}, Landroid/widget/ImageView;->setImageURI(Landroid/net/Uri;)V

    goto :goto_0

    :cond_1
    iget v3, p1, LF3;->d:I

    invoke-virtual {p3, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    :goto_0
    iget-object p3, p1, LF3;->b:Ljava/lang/String;

    invoke-virtual {v1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p3, p1, LF3;->c:Ljava/lang/String;

    invoke-virtual {v2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p3, p0, LK3;->b:LL3;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, LL3;->P(LF3;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p3, p3, LL3;->U:Ljava/lang/String;

    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    :cond_2
    invoke-virtual {p2, v0}, Landroid/view/View;->setActivated(Z)V

    return-object p2
.end method
