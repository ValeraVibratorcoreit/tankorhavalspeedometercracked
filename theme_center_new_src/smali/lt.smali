.class public Llt;
.super LBr;
.source "SourceFile"


# static fields
.field public static j:Z = true

.field public static k:Z = true

.field public static l:Z = true

.field public static m:Z = true


# virtual methods
.method public B0(Landroid/view/View;IIII)V
    .locals 1

    sget-boolean v0, Llt;->l:Z

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1, p2, p3, p4, p5}, Lht;->a(Landroid/view/View;IIII)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    sput-boolean p1, Llt;->l:Z

    :cond_0
    :goto_0
    return-void
.end method

.method public C0(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 1

    sget-boolean v0, Llt;->j:Z

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1, p2}, Lgt;->b(Landroid/view/View;Landroid/graphics/Matrix;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    sput-boolean p1, Llt;->j:Z

    :cond_0
    :goto_0
    return-void
.end method

.method public D0(Landroid/view/View;Landroid/graphics/Matrix;)V
    .locals 1

    sget-boolean v0, Llt;->k:Z

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p1, p2}, Lgt;->c(Landroid/view/View;Landroid/graphics/Matrix;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    sput-boolean p1, Llt;->k:Z

    :cond_0
    :goto_0
    return-void
.end method

.method public o0(Landroid/view/View;I)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ne v0, v1, :cond_0

    invoke-super {p0, p1, p2}, LBr;->o0(Landroid/view/View;I)V

    goto :goto_0

    :cond_0
    sget-boolean v0, Llt;->m:Z

    if-eqz v0, :cond_1

    :try_start_0
    invoke-static {p1, p2}, Lkt;->a(Landroid/view/View;I)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    sput-boolean p1, Llt;->m:Z

    :cond_1
    :goto_0
    return-void
.end method
