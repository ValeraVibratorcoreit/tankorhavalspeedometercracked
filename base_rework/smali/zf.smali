.class public abstract Lzf;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements LDg;


# instance fields
.field public final a:LFg;

.field public final b:Landroid/content/Context;

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>(Landroid/content/Context;LDg;I)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x1

    iput v0, p0, Lzf;->c:I

    iput-object p1, p0, Lzf;->b:Landroid/content/Context;

    iput p3, p0, Lzf;->d:I

    new-instance p1, LFg;

    invoke-direct {p1, p0}, LFg;-><init>(LDg;)V

    iput-object p1, p0, Lzf;->a:LFg;

    if-eqz p2, :cond_0

    invoke-interface {p2}, LDg;->getLifecycle()Lwg;

    move-result-object p2

    check-cast p2, LFg;

    iget-object p2, p2, LFg;->c:Lug;

    invoke-virtual {p1, p2}, LFg;->g(Lug;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public getLayout()I
    .locals 1

    iget v0, p0, Lzf;->d:I

    return v0
.end method

.method public getLifecycle()Lwg;
    .locals 1

    iget-object v0, p0, Lzf;->a:LFg;

    return-object v0
.end method

.method public getNeedleMode()I
    .locals 1

    iget v0, p0, Lzf;->c:I

    return v0
.end method

.method public onAttachedToWindow()V
    .locals 2

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    iget-object v0, p0, Lzf;->a:LFg;

    sget-object v1, Ltg;->ON_START:Ltg;

    invoke-virtual {v0, v1}, LFg;->e(Ltg;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "onAttachedToWindow()-"

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "T500.INFO_FR"

    invoke-static {v1, v0}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 2

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    iget-object v0, p0, Lzf;->a:LFg;

    sget-object v1, Ltg;->ON_STOP:Ltg;

    invoke-virtual {v0, v1}, LFg;->e(Ltg;)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "onDetachedFromWindow()-"

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "T500.INFO_FR"

    invoke-static {v1, v0}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
