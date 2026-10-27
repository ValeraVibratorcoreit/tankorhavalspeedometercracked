.class public Lut;
.super Lc4;
.source "SourceFile"


# instance fields
.field public U:Landroid/net/wifi/WifiManager;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lc4;-><init>()V

    return-void
.end method


# virtual methods
.method public final w(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 5

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "wifi"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/wifi/WifiManager;

    iput-object p1, p0, Lut;->U:Landroid/net/wifi/WifiManager;

    invoke-virtual {p0}, Lc4;->W()Landroid/widget/ScrollView;

    move-result-object p1

    invoke-virtual {p0}, Lc4;->V()Lji;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    new-instance v0, LIn;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, LIn;-><init>(Landroid/content/Context;)V

    new-instance v1, LWn;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, LWn;-><init>(Landroid/content/Context;)V

    const v2, 0x7f130218

    invoke-virtual {v1, v2}, LSn;->setTitle(I)V

    iget-object v2, p0, Lut;->U:Landroid/net/wifi/WifiManager;

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/net/wifi/WifiManager;->isWifiEnabled()Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v1, v2}, LWn;->setChecked(Z)V

    new-instance v2, Ld4;

    const/16 v4, 0xb

    invoke-direct {v2, p0, v4}, Ld4;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v1, v2}, LWn;->setOnCheckedChange(LVn;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/16 v0, 0x10

    invoke-virtual {p0, p2, v0}, Lc4;->O(Landroid/widget/LinearLayout;I)V

    new-instance v0, LIn;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, LIn;-><init>(Landroid/content/Context;)V

    new-instance v1, LPn;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, LPn;-><init>(Landroid/content/Context;)V

    const v2, 0x7f130216

    invoke-virtual {v1, v2}, LSn;->setTitle(I)V

    invoke-virtual {v1, v3}, LPn;->setInputTypeFlags(I)V

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, LPn;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, LPn;-><init>(Landroid/content/Context;)V

    const v3, 0x7f130217

    invoke-virtual {v2, v3}, LSn;->setTitle(I)V

    const/16 v3, 0x81

    invoke-virtual {v2, v3}, LPn;->setInputTypeFlags(I)V

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/16 v0, 0xc

    invoke-virtual {p0, p2, v0}, Lc4;->O(Landroid/widget/LinearLayout;I)V

    new-instance v0, LB9;

    const/4 v3, 0x3

    invoke-direct {v0, p0, v1, v2, v3}, LB9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v1, 0x7f13018a

    invoke-virtual {p0, v1, v0}, Lc4;->Z(ILjava/lang/Runnable;)Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object p1
.end method
