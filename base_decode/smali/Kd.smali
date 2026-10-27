.class public final LKd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfr;


# instance fields
.field public final b:Lfr;


# direct methods
.method public constructor <init>(Lfr;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Argument must not be null"

    invoke-static {v0, p1}, LUd;->l(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p1, p0, LKd;->b:Lfr;

    return-void
.end method


# virtual methods
.method public final a(Ljava/security/MessageDigest;)V
    .locals 1

    iget-object v0, p0, LKd;->b:Lfr;

    invoke-interface {v0, p1}, Lfg;->a(Ljava/security/MessageDigest;)V

    return-void
.end method

.method public final b(Landroid/content/Context;LIm;II)LIm;
    .locals 4

    invoke-interface {p2}, LIm;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LId;

    invoke-static {p1}, Lcom/bumptech/glide/a;->a(Landroid/content/Context;)Lcom/bumptech/glide/a;

    move-result-object v1

    iget-object v1, v1, Lcom/bumptech/glide/a;->a:Lu4;

    iget-object v2, v0, LId;->a:Lj1;

    iget-object v2, v2, Lj1;->b:Ljava/lang/Object;

    check-cast v2, LPd;

    iget-object v2, v2, LPd;->l:Landroid/graphics/Bitmap;

    new-instance v3, Lv4;

    invoke-direct {v3, v1, v2}, Lv4;-><init>(Lu4;Landroid/graphics/Bitmap;)V

    iget-object v1, p0, LKd;->b:Lfr;

    invoke-interface {v1, p1, v3, p3, p4}, Lfr;->b(Landroid/content/Context;LIm;II)LIm;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_0

    invoke-virtual {v3}, Lv4;->e()V

    :cond_0
    invoke-interface {p1}, LIm;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Bitmap;

    iget-object p3, v0, LId;->a:Lj1;

    iget-object p3, p3, Lj1;->b:Ljava/lang/Object;

    check-cast p3, LPd;

    invoke-virtual {p3, v1, p1}, LPd;->c(Lfr;Landroid/graphics/Bitmap;)V

    return-object p2
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LKd;

    if-eqz v0, :cond_0

    check-cast p1, LKd;

    iget-object v0, p0, LKd;->b:Lfr;

    iget-object p1, p1, LKd;->b:Lfr;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, LKd;->b:Lfr;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
