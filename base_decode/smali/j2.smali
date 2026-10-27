.class public final Lj2;
.super Ltc;
.source "SourceFile"


# instance fields
.field public final synthetic j:Lq2;

.field public final synthetic k:Lt2;


# direct methods
.method public constructor <init>(Lt2;Landroid/view/View;Lq2;)V
    .locals 0

    iput-object p1, p0, Lj2;->k:Lt2;

    iput-object p3, p0, Lj2;->j:Lq2;

    invoke-direct {p0, p2}, Ltc;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final b()LCo;
    .locals 1

    iget-object v0, p0, Lj2;->j:Lq2;

    return-object v0
.end method

.method public final c()Z
    .locals 3

    iget-object v0, p0, Lj2;->k:Lt2;

    invoke-virtual {v0}, Lt2;->getInternalPopup()Ls2;

    move-result-object v1

    invoke-interface {v1}, Ls2;->a()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getTextDirection()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getTextAlignment()I

    move-result v2

    iget-object v0, v0, Lt2;->f:Ls2;

    invoke-interface {v0, v1, v2}, Ls2;->d(II)V

    :cond_0
    const/4 v0, 0x1

    return v0
.end method
