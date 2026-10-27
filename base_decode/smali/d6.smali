.class public final synthetic Ld6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ldb;


# direct methods
.method public synthetic constructor <init>(Ldb;I)V
    .locals 0

    iput p2, p0, Ld6;->a:I

    iput-object p1, p0, Ld6;->b:Ldb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 0

    iget p1, p0, Ld6;->a:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Ld6;->b:Ldb;

    check-cast p1, Lha;

    iput-boolean p2, p1, Lha;->l:Z

    invoke-virtual {p1}, Ldb;->q()V

    if-nez p2, :cond_0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lha;->t(Z)V

    iput-boolean p2, p1, Lha;->m:Z

    :cond_0
    return-void

    :pswitch_0
    iget-object p1, p0, Ld6;->b:Ldb;

    check-cast p1, Lg6;

    invoke-virtual {p1}, Lg6;->u()Z

    move-result p2

    invoke-virtual {p1, p2}, Lg6;->t(Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
