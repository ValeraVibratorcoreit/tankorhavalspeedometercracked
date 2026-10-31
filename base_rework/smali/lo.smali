.class public final Llo;
.super Landroid/widget/ArrayAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;


# direct methods
.method public constructor <init>(Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;Landroid/content/Context;Ljava/util/ArrayList;)V
    .locals 0

    iput-object p1, p0, Llo;->a:Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;

    const p1, 0x109000a

    invoke-direct {p0, p2, p1, p3}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method


# virtual methods
.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    invoke-super {p0, p1, p2, p3}, Landroid/widget/ArrayAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    instance-of p2, p1, Landroid/widget/TextView;

    if-eqz p2, :cond_0

    move-object p2, p1

    check-cast p2, Landroid/widget/TextView;

    iget-object p3, p0, Llo;->a:Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;

    iget-object v0, p3, Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;->e:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getTextSize()F

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p2, v1, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    invoke-virtual {p3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    const v0, 0x7f060340

    invoke-virtual {p3, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p3

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_0
    return-object p1
.end method
