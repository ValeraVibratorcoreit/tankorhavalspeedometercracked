.class public final synthetic LLn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LMn;


# direct methods
.method public synthetic constructor <init>(LMn;I)V
    .locals 0

    iput p2, p0, LLn;->a:I

    iput-object p1, p0, LLn;->b:LMn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget p1, p0, LLn;->a:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, LLn;->b:LMn;

    iget-object v0, p1, LMn;->Y:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, LMn;->X:Ld4;

    if-eqz v1, :cond_0

    iget-object v1, v1, Ld4;->b:Ljava/lang/Object;

    check-cast v1, LPn;

    invoke-virtual {v1, v0}, LPn;->setValue(Ljava/lang/String;)V

    iget-object v1, v1, LPn;->h:LOn;

    if-eqz v1, :cond_0

    invoke-interface {v1, v0}, LOn;->a(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p1}, LMn;->O()V

    return-void

    :pswitch_0
    iget-object p1, p0, LLn;->b:LMn;

    iget-object p1, p1, LMn;->Y:Landroid/widget/EditText;

    const-string v0, ""

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :pswitch_1
    iget-object p1, p0, LLn;->b:LMn;

    invoke-virtual {p1}, LMn;->O()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
