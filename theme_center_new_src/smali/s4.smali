.class public final Ls4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMm;


# instance fields
.field public final synthetic a:I

.field public final b:Lu4;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Ls4;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lpa;

    const/16 v1, 0x11

    .line 3
    invoke-direct {v0, v1}, Lpa;-><init>(I)V

    .line 4
    iput-object v0, p0, Ls4;->b:Lu4;

    return-void
.end method

.method public constructor <init>(Lu4;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ls4;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Ls4;->b:Lu4;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;IILrk;)LIm;
    .locals 1

    iget v0, p0, Ls4;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lsp;

    invoke-virtual {p1}, Lsp;->b()Landroid/graphics/Bitmap;

    move-result-object p1

    iget-object p2, p0, Ls4;->b:Lu4;

    invoke-static {p2, p1}, Lv4;->b(Lu4;Landroid/graphics/Bitmap;)Lv4;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Landroid/graphics/ImageDecoder$Source;

    invoke-virtual {p0, p1, p2, p3, p4}, Ls4;->c(Landroid/graphics/ImageDecoder$Source;IILrk;)Lv4;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic b(Ljava/lang/Object;Lrk;)Z
    .locals 0

    iget p2, p0, Ls4;->a:I

    packed-switch p2, :pswitch_data_0

    check-cast p1, Lsp;

    const/4 p1, 0x1

    return p1

    :pswitch_0
    check-cast p1, Landroid/graphics/ImageDecoder$Source;

    const/4 p1, 0x1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public c(Landroid/graphics/ImageDecoder$Source;IILrk;)Lv4;
    .locals 3

    new-instance v0, LI8;

    invoke-direct {v0, p2, p3, p4}, LI8;-><init>(IILrk;)V

    invoke-static {p1, v0}, Landroid/graphics/ImageDecoder;->decodeBitmap(Landroid/graphics/ImageDecoder$Source;Landroid/graphics/ImageDecoder$OnHeaderDecodedListener;)Landroid/graphics/Bitmap;

    move-result-object p1

    const-string p4, "BitmapImageDecoder"

    const/4 v0, 0x2

    invoke-static {p4, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Decoded ["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "] for ["

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "]"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p4, p2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    new-instance p2, Lv4;

    iget-object p3, p0, Ls4;->b:Lu4;

    check-cast p3, Lpa;

    invoke-direct {p2, p3, p1}, Lv4;-><init>(Lu4;Landroid/graphics/Bitmap;)V

    return-object p2
.end method
