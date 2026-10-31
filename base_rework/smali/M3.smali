.class public final synthetic LM3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, LM3;->a:I

    iput-object p1, p0, LM3;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    iget v0, p0, LM3;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LM3;->b:Ljava/lang/Object;

    check-cast v0, LRn;

    iget-object v1, v0, LRn;->j:[Ljava/lang/CharSequence;

    aget-object p2, v1, p2

    invoke-interface {p2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, LRn;->setValue(Ljava/lang/String;)V

    iget-object v0, v0, LRn;->h:LQn;

    if-eqz v0, :cond_0

    invoke-interface {v0, p2}, LQn;->a(Ljava/lang/String;)V

    :cond_0
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void

    :pswitch_0
    iget-object p1, p0, LM3;->b:Ljava/lang/Object;

    check-cast p1, LQ3;

    invoke-virtual {p1}, Lzc;->f()Lq1;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Lzc;->f()Lq1;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->recreate()V

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
