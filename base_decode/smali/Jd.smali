.class public final LJd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LIm;
.implements LBf;


# instance fields
.field public final a:Landroid/graphics/drawable/Drawable;

.field public final synthetic b:I


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Drawable;I)V
    .locals 0

    iput p2, p0, LJd;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string p2, "Argument must not be null"

    invoke-static {p2, p1}, LUd;->l(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p1, p0, LJd;->a:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method private final f()V
    .locals 0

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget v0, p0, LJd;->b:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, LJd;->b()V

    return-void

    :pswitch_0
    iget-object v0, p0, LJd;->a:Landroid/graphics/drawable/Drawable;

    check-cast v0, LId;

    iget-object v0, v0, LId;->a:Lj1;

    iget-object v0, v0, Lj1;->b:Ljava/lang/Object;

    check-cast v0, LPd;

    iget-object v0, v0, LPd;->l:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, LJd;->a:Landroid/graphics/drawable/Drawable;

    instance-of v1, v0, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    goto :goto_0

    :cond_0
    instance-of v1, v0, LId;

    if-eqz v1, :cond_1

    check-cast v0, LId;

    iget-object v0, v0, LId;->a:Lj1;

    iget-object v0, v0, Lj1;->b:Ljava/lang/Object;

    check-cast v0, LPd;

    iget-object v0, v0, LPd;->l:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final c()I
    .locals 4

    iget v0, p0, LJd;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LJd;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    mul-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x4

    const/4 v1, 0x1

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0

    :pswitch_0
    iget-object v0, p0, LJd;->a:Landroid/graphics/drawable/Drawable;

    check-cast v0, LId;

    iget-object v0, v0, LId;->a:Lj1;

    iget-object v0, v0, Lj1;->b:Ljava/lang/Object;

    check-cast v0, LPd;

    iget-object v1, v0, LPd;->a:Lsp;

    iget-object v2, v1, Lsp;->d:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/Buffer;->limit()I

    move-result v2

    iget-object v3, v1, Lsp;->i:[B

    array-length v3, v3

    add-int/2addr v2, v3

    iget-object v1, v1, Lsp;->j:[I

    array-length v1, v1

    mul-int/lit8 v1, v1, 0x4

    add-int/2addr v1, v2

    iget v0, v0, LPd;->n:I

    add-int/2addr v1, v0

    return v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d()Ljava/lang/Class;
    .locals 1

    iget v0, p0, LJd;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LJd;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    return-object v0

    :pswitch_0
    const-class v0, LId;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e()V
    .locals 7

    iget v0, p0, LJd;->b:I

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    iget-object v0, p0, LJd;->a:Landroid/graphics/drawable/Drawable;

    check-cast v0, LId;

    invoke-virtual {v0}, LId;->stop()V

    const/4 v1, 0x1

    iput-boolean v1, v0, LId;->d:Z

    iget-object v0, v0, LId;->a:Lj1;

    iget-object v0, v0, Lj1;->b:Ljava/lang/Object;

    check-cast v0, LPd;

    iget-object v2, v0, LPd;->c:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    iget-object v2, v0, LPd;->l:Landroid/graphics/Bitmap;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    iget-object v4, v0, LPd;->e:Lu4;

    invoke-interface {v4, v2}, Lu4;->k(Landroid/graphics/Bitmap;)V

    iput-object v3, v0, LPd;->l:Landroid/graphics/Bitmap;

    :cond_0
    const/4 v2, 0x0

    iput-boolean v2, v0, LPd;->f:Z

    iget-object v2, v0, LPd;->i:LMd;

    iget-object v4, v0, LPd;->d:LEm;

    if-eqz v2, :cond_1

    invoke-virtual {v4, v2}, LEm;->l(Lgq;)V

    iput-object v3, v0, LPd;->i:LMd;

    :cond_1
    iget-object v2, v0, LPd;->k:LMd;

    if-eqz v2, :cond_2

    invoke-virtual {v4, v2}, LEm;->l(Lgq;)V

    iput-object v3, v0, LPd;->k:LMd;

    :cond_2
    iget-object v2, v0, LPd;->m:LMd;

    if-eqz v2, :cond_3

    invoke-virtual {v4, v2}, LEm;->l(Lgq;)V

    iput-object v3, v0, LPd;->m:LMd;

    :cond_3
    iget-object v2, v0, LPd;->a:Lsp;

    iput-object v3, v2, Lsp;->l:LQd;

    iget-object v4, v2, Lsp;->i:[B

    iget-object v5, v2, Lsp;->c:Ld2;

    if-eqz v4, :cond_5

    iget-object v6, v5, Ld2;->c:Ljava/lang/Object;

    check-cast v6, Luh;

    if-nez v6, :cond_4

    goto :goto_0

    :cond_4
    invoke-virtual {v6, v4}, Luh;->g(Ljava/lang/Object;)V

    :cond_5
    :goto_0
    iget-object v4, v2, Lsp;->j:[I

    if-eqz v4, :cond_7

    iget-object v6, v5, Ld2;->c:Ljava/lang/Object;

    check-cast v6, Luh;

    if-nez v6, :cond_6

    goto :goto_1

    :cond_6
    invoke-virtual {v6, v4}, Luh;->g(Ljava/lang/Object;)V

    :cond_7
    :goto_1
    iget-object v4, v2, Lsp;->m:Landroid/graphics/Bitmap;

    if-eqz v4, :cond_8

    iget-object v6, v5, Ld2;->b:Ljava/lang/Object;

    check-cast v6, Lu4;

    invoke-interface {v6, v4}, Lu4;->k(Landroid/graphics/Bitmap;)V

    :cond_8
    iput-object v3, v2, Lsp;->m:Landroid/graphics/Bitmap;

    iput-object v3, v2, Lsp;->d:Ljava/nio/ByteBuffer;

    iput-object v3, v2, Lsp;->s:Ljava/lang/Boolean;

    iget-object v2, v2, Lsp;->e:[B

    if-eqz v2, :cond_a

    iget-object v3, v5, Ld2;->c:Ljava/lang/Object;

    check-cast v3, Luh;

    if-nez v3, :cond_9

    goto :goto_2

    :cond_9
    invoke-virtual {v3, v2}, Luh;->g(Ljava/lang/Object;)V

    :cond_a
    :goto_2
    iput-boolean v1, v0, LPd;->j:Z

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final get()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LJd;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :goto_0
    return-object v0
.end method
