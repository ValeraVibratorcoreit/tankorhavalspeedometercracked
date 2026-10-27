.class public final Lk2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lk2;->a:I

    iput-object p1, p0, Lk2;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 4

    iget v0, p0, Lk2;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lk2;->b:Ljava/lang/Object;

    check-cast v0, Ltp;

    invoke-virtual {v0}, Ltp;->a()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, v0, Ltp;->i:LJi;

    iget-boolean v1, v1, Lah;->y:Z

    if-nez v1, :cond_2

    iget-object v1, v0, Ltp;->n:Landroid/view/View;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/view/View;->isShown()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, v0, Ltp;->i:LJi;

    invoke-virtual {v0}, Lah;->e()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {v0}, Ltp;->dismiss()V

    :cond_2
    :goto_1
    return-void

    :pswitch_0
    iget-object v0, p0, Lk2;->b:Ljava/lang/Object;

    check-cast v0, LA5;

    invoke-virtual {v0}, LA5;->a()Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, v0, LA5;->i:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_5

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz5;

    iget-object v2, v2, Lz5;->a:LJi;

    iget-boolean v2, v2, Lah;->y:Z

    if-nez v2, :cond_5

    iget-object v2, v0, LA5;->p:Landroid/view/View;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Landroid/view/View;->isShown()Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz5;

    iget-object v1, v1, Lz5;->a:LJi;

    invoke-virtual {v1}, Lah;->e()V

    goto :goto_2

    :cond_4
    :goto_3
    invoke-virtual {v0}, LA5;->dismiss()V

    :cond_5
    return-void

    :pswitch_1
    iget-object v0, p0, Lk2;->b:Ljava/lang/Object;

    check-cast v0, Lq2;

    iget-object v1, v0, Lq2;->G:Lt2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object v2, v0, Lq2;->E:Landroid/graphics/Rect;

    invoke-virtual {v1, v2}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {v0}, Lq2;->q()V

    invoke-virtual {v0}, Lah;->e()V

    goto :goto_4

    :cond_6
    invoke-virtual {v0}, Lah;->dismiss()V

    :goto_4
    return-void

    :pswitch_2
    iget-object v0, p0, Lk2;->b:Ljava/lang/Object;

    check-cast v0, Lt2;

    invoke-virtual {v0}, Lt2;->getInternalPopup()Ls2;

    move-result-object v1

    invoke-interface {v1}, Ls2;->a()Z

    move-result v1

    if-nez v1, :cond_7

    invoke-virtual {v0}, Landroid/view/View;->getTextDirection()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getTextAlignment()I

    move-result v2

    iget-object v3, v0, Lt2;->f:Ls2;

    invoke-interface {v3, v1, v2}, Ls2;->d(II)V

    :cond_7
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_8
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
