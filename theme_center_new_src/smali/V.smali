.class public final LV;
.super Lvr;
.source "SourceFile"


# instance fields
.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;LDg;FI)V
    .locals 0

    .line 1
    iput p4, p0, LV;->k:I

    invoke-direct {p0, p1, p2, p3}, Lvr;-><init>(Landroid/content/Context;LDg;F)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;LDg;FII)V
    .locals 0

    .line 2
    iput p5, p0, LV;->k:I

    invoke-direct {p0, p1, p2, p3, p4}, Lvr;-><init>(Landroid/content/Context;LDg;FI)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget v0, p0, LV;->k:I

    packed-switch v0, :pswitch_data_0

    const v0, 0x7f0e0185

    iput v0, p0, Lzf;->d:I

    const v0, 0x7f1301df

    invoke-virtual {p0, v0}, Lvr;->setTitleId(I)V

    invoke-super {p0}, Lvr;->a()V

    return-void

    :pswitch_0
    const v0, 0x7f0e00b2

    iput v0, p0, Lzf;->d:I

    const v0, 0x7f1301ae

    invoke-virtual {p0, v0}, Lvr;->setTitleId(I)V

    invoke-super {p0}, Lvr;->a()V

    return-void

    :pswitch_1
    const v0, 0x7f0e00b0

    iput v0, p0, Lzf;->d:I

    const v0, 0x7f1301df

    invoke-virtual {p0, v0}, Lvr;->setTitleId(I)V

    invoke-super {p0}, Lvr;->a()V

    return-void

    :pswitch_2
    const v0, 0x7f0e001e

    iput v0, p0, Lzf;->d:I

    const v0, 0x7f130187

    invoke-virtual {p0, v0}, Lvr;->setTitleId(I)V

    invoke-super {p0}, Lvr;->a()V

    return-void

    :pswitch_3
    const v0, 0x7f0e00b1

    iput v0, p0, Lzf;->d:I

    const v0, 0x7f1301ae

    invoke-virtual {p0, v0}, Lvr;->setTitleId(I)V

    invoke-super {p0}, Lvr;->a()V

    return-void

    :pswitch_4
    const v0, 0x7f0e00af

    iput v0, p0, Lzf;->d:I

    const v0, 0x7f1301df

    invoke-virtual {p0, v0}, Lvr;->setTitleId(I)V

    invoke-super {p0}, Lvr;->a()V

    return-void

    :pswitch_5
    const v0, 0x7f0e001c

    iput v0, p0, Lzf;->d:I

    const v0, 0x7f130187

    invoke-virtual {p0, v0}, Lvr;->setTitleId(I)V

    invoke-super {p0}, Lvr;->a()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
