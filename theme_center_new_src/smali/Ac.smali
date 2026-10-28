.class public final synthetic LAc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly7;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lq1;


# direct methods
.method public synthetic constructor <init>(Lq1;I)V
    .locals 0

    iput p2, p0, LAc;->a:I

    iput-object p1, p0, LAc;->b:Lq1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, LAc;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroid/content/Intent;

    iget-object p1, p0, LAc;->b:Lq1;

    iget-object p1, p1, Lq1;->s:Lk0;

    invoke-virtual {p1}, Lk0;->y()V

    return-void

    :pswitch_0
    check-cast p1, Landroid/content/res/Configuration;

    iget-object p1, p0, LAc;->b:Lq1;

    iget-object p1, p1, Lq1;->s:Lk0;

    invoke-virtual {p1}, Lk0;->y()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
