.class public final Ltr;
.super Lzf;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;LDg;)V
    .locals 1

    const v0, 0x7f0e0182

    invoke-direct {p0, p1, p2, v0}, Lzf;-><init>(Landroid/content/Context;LDg;I)V

    const-string p2, "T500.FR"

    const-string v0, "TransparentFragment.init()"

    invoke-static {p2, v0}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    const p2, 0x7f080152

    invoke-virtual {p0, p2}, Landroid/view/View;->setBackgroundResource(I)V

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-virtual {p0}, Lzf;->getLayout()I

    move-result p2

    const/4 v0, 0x1

    invoke-virtual {p1, p2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    return-void
.end method
