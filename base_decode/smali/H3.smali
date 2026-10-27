.class public final LH3;
.super Landroid/widget/ArrayAdapter;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:LE3;

.field public final c:I


# direct methods
.method public constructor <init>(Landroid/content/Context;LE3;Ljava/util/List;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p3}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    iput-object p1, p0, LH3;->a:Landroid/content/Context;

    iput-object p2, p0, LH3;->b:LE3;

    const p1, 0x7f0e00ae

    iput p1, p0, LH3;->c:I

    return-void
.end method


# virtual methods
.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 8

    invoke-virtual {p0, p1}, Landroid/widget/ArrayAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LF3;

    iget-object v1, p0, LH3;->a:Landroid/content/Context;

    const/4 v2, 0x0

    if-nez p2, :cond_0

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    iget v3, p0, LH3;->c:I

    invoke-virtual {p2, v3, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    :cond_0
    const p3, 0x7f0b0163

    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/ImageView;

    const v3, 0x7f0b0164

    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    const v4, 0x7f0b0162

    invoke-virtual {p2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    const v5, 0x7f0b009a

    invoke-virtual {p2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/ImageButton;

    iget-object v6, v0, LF3;->a:Landroid/net/Uri;

    const-string v7, "BUILD_IN_NONE"

    if-eqz v6, :cond_1

    invoke-virtual {p3, v6}, Landroid/widget/ImageView;->setImageURI(Landroid/net/Uri;)V

    new-instance p3, Ljava/io/File;

    iget-object v6, v0, LF3;->a:Landroid/net/Uri;

    invoke-virtual {v6}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v6

    invoke-direct {p3, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p3

    goto :goto_0

    :cond_1
    iget v6, v0, LF3;->d:I

    invoke-virtual {p3, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    sparse-switch v6, :sswitch_data_0

    move-object p3, v7

    goto :goto_0

    :sswitch_0
    const-string p3, "BUILD_IN_TRX"

    goto :goto_0

    :sswitch_1
    const-string p3, "BUILD_IN_TRANSPARENT"

    goto :goto_0

    :sswitch_2
    const-string p3, "BUILD_IN_NIGHT"

    goto :goto_0

    :sswitch_3
    const-string p3, "BUILD_IN_KIA"

    goto :goto_0

    :sswitch_4
    const-string p3, "BUILD_IN_BRABUS"

    :goto_0
    iget-object v6, v0, LF3;->b:Ljava/lang/String;

    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v3, v0, LF3;->c:Ljava/lang/String;

    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v3, p0, LH3;->b:LE3;

    invoke-virtual {v3}, Lc4;->T()Landroid/content/SharedPreferences;

    move-result-object v3

    const-string v4, "useDefaultSwitchBack"

    const/4 v6, 0x1

    invoke-interface {v3, v4, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_2

    const-string v3, "prefs_Default"

    invoke-virtual {v1, v3, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    :cond_2
    const-string v1, "selectedBackground"

    invoke-interface {v3, v1, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p2, v1}, Landroid/view/View;->setActivated(Z)V

    new-instance v1, LC3;

    const/4 v3, 0x1

    invoke-direct {v1, p0, v3, v0}, LC3;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {p2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const-string v0, "BUILD_IN"

    invoke-virtual {p3, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_3

    const/4 p1, 0x4

    invoke-virtual {v5, p1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    :cond_3
    invoke-virtual {v5, v2}, Landroid/view/View;->setVisibility(I)V

    new-instance p3, LG3;

    invoke-direct {p3, p0, p1}, LG3;-><init>(LH3;I)V

    invoke-virtual {v5, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_1
    return-object p2

    :sswitch_data_0
    .sparse-switch
        0x7f080087 -> :sswitch_4
        0x7f0800e4 -> :sswitch_3
        0x7f08012c -> :sswitch_2
        0x7f080153 -> :sswitch_1
        0x7f080156 -> :sswitch_0
    .end sparse-switch
.end method
