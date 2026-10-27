.class public final synthetic Lur;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMj;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lvr;


# direct methods
.method public synthetic constructor <init>(Lvr;I)V
    .locals 0

    iput p2, p0, Lur;->a:I

    iput-object p1, p0, Lur;->b:Lvr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final w(Ljava/lang/Object;)V
    .locals 6

    iget v0, p0, Lur;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Integer;

    iget-object v0, p0, Lur;->b:Lvr;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const v2, 0x7f0b00ea

    const v3, 0x7f0b00e8

    if-gtz v1, :cond_0

    iget p1, v0, Lvr;->h:I

    const-string v1, "0"

    const-string v4, "%s"

    invoke-virtual {v0, v3, v4, v1, p1}, Lvr;->c(ILjava/lang/String;Ljava/lang/Object;I)V

    const-string p1, "00"

    iget v1, v0, Lvr;->h:I

    invoke-virtual {v0, v2, v4, p1, v1}, Lvr;->c(ILjava/lang/String;Ljava/lang/Object;I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    div-int/lit8 v1, v1, 0x3c

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    rem-int/lit8 p1, p1, 0x3c

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v4, v0, Lvr;->h:I

    const-string v5, "%d"

    invoke-virtual {v0, v3, v5, v1, v4}, Lvr;->c(ILjava/lang/String;Ljava/lang/Object;I)V

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget v1, v0, Lvr;->h:I

    const-string v3, "%02d"

    invoke-virtual {v0, v2, v3, p1, v1}, Lvr;->c(ILjava/lang/String;Ljava/lang/Object;I)V

    :goto_0
    return-void

    :pswitch_0
    check-cast p1, Ljava/lang/Float;

    iget-object v0, p0, Lur;->b:Lvr;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    const/4 v2, 0x0

    cmpg-float v1, v1, v2

    const v2, 0x7f0b007d

    if-gtz v1, :cond_1

    iget p1, v0, Lvr;->h:I

    const-string v1, "%s"

    const-string v3, "___"

    invoke-virtual {v0, v2, v1, v3, p1}, Lvr;->c(ILjava/lang/String;Ljava/lang/Object;I)V

    goto :goto_1

    :cond_1
    iget v1, v0, Lvr;->h:I

    const-string v3, "%.0f"

    invoke-virtual {v0, v2, v3, p1, v1}, Lvr;->c(ILjava/lang/String;Ljava/lang/Object;I)V

    :goto_1
    return-void

    :pswitch_1
    check-cast p1, Ljava/lang/Float;

    iget-object v0, p0, Lur;->b:Lvr;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    const/high16 v2, -0x40800000    # -1.0f

    cmpl-float v1, v1, v2

    const v2, 0x7f0b007b

    if-nez v1, :cond_2

    iget p1, v0, Lvr;->h:I

    const-string v1, "%s"

    const-string v3, "__._"

    invoke-virtual {v0, v2, v1, v3, p1}, Lvr;->c(ILjava/lang/String;Ljava/lang/Object;I)V

    goto :goto_2

    :cond_2
    iget v1, v0, Lvr;->h:I

    const-string v3, "%.1f"

    invoke-virtual {v0, v2, v3, p1, v1}, Lvr;->c(ILjava/lang/String;Ljava/lang/Object;I)V

    :goto_2
    return-void

    :pswitch_2
    check-cast p1, Ljava/lang/Float;

    iget-object v0, p0, Lur;->b:Lvr;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    const/high16 v2, -0x40800000    # -1.0f

    cmpl-float v1, v1, v2

    const v2, 0x7f0b007a

    if-nez v1, :cond_3

    iget p1, v0, Lvr;->h:I

    const-string v1, "%s"

    const-string v3, "__._"

    invoke-virtual {v0, v2, v1, v3, p1}, Lvr;->c(ILjava/lang/String;Ljava/lang/Object;I)V

    goto :goto_3

    :cond_3
    iget v1, v0, Lvr;->h:I

    const-string v3, "%.1f"

    invoke-virtual {v0, v2, v3, p1, v1}, Lvr;->c(ILjava/lang/String;Ljava/lang/Object;I)V

    :goto_3
    return-void

    :pswitch_3
    check-cast p1, Ljava/lang/Float;

    iget-object v0, p0, Lur;->b:Lvr;

    iget v1, v0, Lvr;->h:I

    const-string v2, "%.1f"

    const v3, 0x7f0b01db

    invoke-virtual {v0, v3, v2, p1, v1}, Lvr;->c(ILjava/lang/String;Ljava/lang/Object;I)V

    return-void

    :pswitch_4
    check-cast p1, Ljava/lang/Float;

    iget-object v0, p0, Lur;->b:Lvr;

    iget v1, v0, Lvr;->h:I

    const-string v2, "%.1f"

    const v3, 0x7f0b01de

    invoke-virtual {v0, v3, v2, p1, v1}, Lvr;->c(ILjava/lang/String;Ljava/lang/Object;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
