.class public final synthetic LF6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzg;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, LF6;->a:I

    iput-object p1, p0, LF6;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final n(LDg;Ltg;)V
    .locals 1

    iget p1, p0, LF6;->a:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, LF6;->b:Ljava/lang/Object;

    check-cast p1, Lx1;

    const-string v0, "this$0"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v0, Ltg;->ON_START:Ltg;

    if-ne p2, v0, :cond_0

    const/4 p2, 0x1

    iput-boolean p2, p1, Lx1;->e:Z

    goto :goto_0

    :cond_0
    sget-object v0, Ltg;->ON_STOP:Ltg;

    if-ne p2, v0, :cond_1

    const/4 p2, 0x0

    iput-boolean p2, p1, Lx1;->e:Z

    :cond_1
    :goto_0
    return-void

    :pswitch_0
    iget-object p1, p0, LF6;->b:Ljava/lang/Object;

    check-cast p1, LP6;

    const-string v0, "this$0"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v0, Ltg;->ON_DESTROY:Ltg;

    if-ne p2, v0, :cond_3

    iget-object p2, p1, LP6;->b:LG7;

    const/4 v0, 0x0

    iput-object v0, p2, LG7;->b:Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result p2

    if-nez p2, :cond_2

    invoke-virtual {p1}, LP6;->d()LRs;

    move-result-object p2

    invoke-virtual {p2}, LRs;->a()V

    :cond_2
    iget-object p1, p1, LP6;->f:LL6;

    iget-object p2, p1, LL6;->d:LP6;

    invoke-virtual {p2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    invoke-virtual {p2}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/view/ViewTreeObserver;->removeOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V

    :cond_3
    return-void

    :pswitch_1
    iget-object p1, p0, LF6;->b:Ljava/lang/Object;

    check-cast p1, LP6;

    const-string v0, "this$0"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v0, Ltg;->ON_STOP:Ltg;

    if-ne p2, v0, :cond_4

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Landroid/view/View;->cancelPendingInputEvents()V

    :cond_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
