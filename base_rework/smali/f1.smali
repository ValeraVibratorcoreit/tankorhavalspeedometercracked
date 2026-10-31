.class public final Lf1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LIm;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lf1;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    const-string v0, "Argument must not be null"

    invoke-static {v0, p1}, LUd;->l(Ljava/lang/String;Ljava/lang/Object;)V

    .line 7
    iput-object p1, p0, Lf1;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lf1;->a:I

    iput-object p1, p0, Lf1;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lf1;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    const-string v0, "Argument must not be null"

    invoke-static {v0, p1}, LUd;->l(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    iput-object p1, p0, Lf1;->b:Ljava/lang/Object;

    return-void
.end method

.method private final a()V
    .locals 0

    return-void
.end method

.method private final b()V
    .locals 0

    return-void
.end method

.method private final f()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final c()I
    .locals 2

    iget v0, p0, Lf1;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lf1;->b:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Bitmap;

    invoke-static {v0}, LQr;->c(Landroid/graphics/Bitmap;)I

    move-result v0

    return v0

    :pswitch_0
    const/4 v0, 0x1

    return v0

    :pswitch_1
    iget-object v0, p0, Lf1;->b:Ljava/lang/Object;

    check-cast v0, [B

    array-length v0, v0

    return v0

    :pswitch_2
    iget-object v0, p0, Lf1;->b:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/drawable/AnimatedImageDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimatedImageDrawable;->getIntrinsicWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimatedImageDrawable;->getIntrinsicHeight()I

    move-result v0

    mul-int/2addr v0, v1

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v1}, LQr;->d(Landroid/graphics/Bitmap$Config;)I

    move-result v1

    mul-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x2

    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d()Ljava/lang/Class;
    .locals 1

    iget v0, p0, Lf1;->a:I

    packed-switch v0, :pswitch_data_0

    const-class v0, Landroid/graphics/Bitmap;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lf1;->b:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    return-object v0

    :pswitch_1
    const-class v0, [B

    return-object v0

    :pswitch_2
    const-class v0, Landroid/graphics/drawable/Drawable;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final e()V
    .locals 1

    iget v0, p0, Lf1;->a:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    return-void

    :pswitch_1
    iget-object v0, p0, Lf1;->b:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/drawable/AnimatedImageDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimatedImageDrawable;->stop()V

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimatedImageDrawable;->clearAnimationCallbacks()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final get()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lf1;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lf1;->b:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/Bitmap;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lf1;->b:Ljava/lang/Object;

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lf1;->b:Ljava/lang/Object;

    check-cast v0, [B

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lf1;->b:Ljava/lang/Object;

    check-cast v0, Landroid/graphics/drawable/AnimatedImageDrawable;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
