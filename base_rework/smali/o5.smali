.class public final Lo5;
.super LTf;
.source "SourceFile"


# instance fields
.field public final j:Landroid/graphics/Typeface;

.field public final k:Lk0;

.field public l:Z


# direct methods
.method public constructor <init>(Lk0;Landroid/graphics/Typeface;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lo5;->j:Landroid/graphics/Typeface;

    iput-object p1, p0, Lo5;->k:Lk0;

    return-void
.end method


# virtual methods
.method public final M(I)V
    .locals 1

    iget-boolean p1, p0, Lo5;->l:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lo5;->k:Lk0;

    iget-object p1, p1, Lk0;->b:Ljava/lang/Object;

    check-cast p1, Lj6;

    iget-object v0, p0, Lo5;->j:Landroid/graphics/Typeface;

    invoke-virtual {p1, v0}, Lj6;->j(Landroid/graphics/Typeface;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lj6;->h(Z)V

    :cond_0
    return-void
.end method

.method public final N(Landroid/graphics/Typeface;Z)V
    .locals 0

    iget-boolean p2, p0, Lo5;->l:Z

    if-nez p2, :cond_0

    iget-object p2, p0, Lo5;->k:Lk0;

    iget-object p2, p2, Lk0;->b:Ljava/lang/Object;

    check-cast p2, Lj6;

    invoke-virtual {p2, p1}, Lj6;->j(Landroid/graphics/Typeface;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lj6;->h(Z)V

    :cond_0
    return-void
.end method
