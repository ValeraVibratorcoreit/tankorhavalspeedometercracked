.class public final synthetic LF9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;I)V
    .locals 0

    iput p3, p0, LF9;->a:I

    iput-object p2, p0, LF9;->c:Ljava/lang/Object;

    iput p1, p0, LF9;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget v0, p0, LF9;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LF9;->c:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    iget-object v1, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->p:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    iget v3, p0, LF9;->b:I

    invoke-virtual {v0, v1, v3, v2}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->t(Landroid/view/View;IZ)V

    :cond_0
    return-void

    :pswitch_0
    iget-object v0, p0, LF9;->c:Ljava/lang/Object;

    check-cast v0, LBr;

    iget v1, p0, LF9;->b:I

    invoke-virtual {v0, v1}, LBr;->O(I)V

    return-void

    :pswitch_1
    iget-object v0, p0, LF9;->c:Ljava/lang/Object;

    check-cast v0, LK9;

    iget-object v1, v0, LK9;->W:Landroid/widget/ProgressBar;

    iget v2, p0, LF9;->b:I

    invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    iget-object v0, v0, LK9;->X:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "%"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :pswitch_2
    iget-object v0, p0, LF9;->c:Ljava/lang/Object;

    check-cast v0, Lru/zinovin/tankspeedometer/DownloadActivity2;

    iget-object v1, v0, Lru/zinovin/tankspeedometer/DownloadActivity2;->B:Landroid/widget/ProgressBar;

    iget v2, p0, LF9;->b:I

    invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    iget-object v0, v0, Lru/zinovin/tankspeedometer/DownloadActivity2;->C:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "%"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :pswitch_3
    iget-object v0, p0, LF9;->c:Ljava/lang/Object;

    check-cast v0, Lru/zinovin/tankspeedometer/DownloadActivity;

    iget-object v1, v0, Lru/zinovin/tankspeedometer/DownloadActivity;->C:Landroid/widget/ProgressBar;

    iget v2, p0, LF9;->b:I

    invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    iget-object v0, v0, Lru/zinovin/tankspeedometer/DownloadActivity;->D:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "%"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
