.class public Lru/zinovin/tankspeedometer/SpedometerPanel;
.super LKf;
.source "SourceFile"


# static fields
.field public static final synthetic s0:I


# instance fields
.field public A:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

.field public B:Landroid/widget/TextView;

.field public C:Lqg;

.field public D:Lqg;

.field public E:Lqg;

.field public F:Lqg;

.field public G:Landroid/widget/ImageView;

.field public H:Landroid/widget/ImageView;

.field public I:Landroid/widget/TextView;

.field public J:Landroid/widget/ImageView;

.field public K:Landroid/widget/TextView;

.field public L:Landroid/widget/ImageView;

.field public M:Landroid/widget/ImageView;

.field public N:Lru/zinovin/tankspeedometer/view/GradientCircleView;

.field public O:Lru/zinovin/tankspeedometer/view/GradientCircleView;

.field public P:LU2;

.field public Q:F

.field public R:F

.field public S:F

.field public T:F

.field public U:F

.field public V:Ljava/lang/String;

.field public W:I

.field public X:Ljava/lang/String;

.field public Y:Ljava/lang/String;

.field public Z:LAf;

.field public a0:Lbg;

.field public b0:Lnp;

.field public c0:Z

.field public d0:Z

.field public e0:Z

.field public f0:Z

.field public g0:I

.field public h0:I

.field public i0:I

.field public j0:I

.field public k0:F

.field public l0:F

.field public m0:Ljava/lang/String;

.field public n0:LRb;

.field public o0:F

.field public final p0:Landroid/os/Handler;

.field public final q0:Lr0;

.field public final r0:LO1;

.field public u:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

.field public v:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

.field public w:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

.field public x:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

.field public y:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

.field public z:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, LKf;-><init>()V

    const v0, 0x3f870a3d    # 1.055f

    iput v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->Q:F

    const v0, 0x3f85e354    # 1.046f

    iput v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->R:F

    const v0, 0x3f856042    # 1.042f

    iput v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->S:F

    const/high16 v0, 0x42980000    # 76.0f

    iput v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->T:F

    const/high16 v0, 0x42c00000    # 96.0f

    iput v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->U:F

    const-string v0, "3"

    iput-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->V:Ljava/lang/String;

    const/4 v0, -0x1

    iput v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->W:I

    const-string v0, ""

    iput-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->X:Ljava/lang/String;

    const-string v1, "BUILD_IN_NONE"

    iput-object v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->Y:Ljava/lang/String;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->c0:Z

    const/4 v2, 0x1

    iput-boolean v2, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->d0:Z

    iput-boolean v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->e0:Z

    iput-boolean v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->f0:Z

    iput v2, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->g0:I

    iput v2, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->h0:I

    iput v2, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->i0:I

    iput v2, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->j0:I

    const/high16 v1, 0x43700000    # 240.0f

    iput v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->k0:F

    const/high16 v1, 0x41000000    # 8.0f

    iput v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->l0:F

    iput-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->m0:Ljava/lang/String;

    const/4 v0, 0x0

    iput v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->o0:F

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->p0:Landroid/os/Handler;

    new-instance v0, Lr0;

    const/16 v1, 0xf

    invoke-direct {v0, p0, v1}, Lr0;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->q0:Lr0;

    new-instance v0, LO1;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, LO1;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->r0:LO1;

    return-void
.end method

.method public static B(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;
    .locals 5

    instance-of v0, p0, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v0, :cond_0

    check-cast p0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {v1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v2

    invoke-virtual {v1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {p0, v4, v4, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    invoke-virtual {p0, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-object v0
.end method


# virtual methods
.method public final A(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V
    .locals 6

    if-eqz p2, :cond_1

    invoke-static {p2}, Lru/zinovin/tankspeedometer/SpedometerPanel;->B(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object p2

    const/16 v0, 0x780

    const/16 v1, 0x2d0

    const/4 v2, 0x1

    invoke-static {p2, v0, v1, v2}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object p2

    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v0

    new-instance v1, Landroid/graphics/Canvas;

    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v1, p2, v3, v3, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    iget-boolean p2, p0, LKf;->l:Z

    const/16 v2, 0x258

    const/16 v3, 0x71c

    const/16 v4, 0xc8

    if-eqz p2, :cond_0

    new-instance p2, Landroid/graphics/Rect;

    const/16 v5, 0x58c

    invoke-direct {p2, v5, v4, v3, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    goto :goto_0

    :cond_0
    new-instance p2, Landroid/graphics/Rect;

    const/16 v5, 0x528

    invoke-direct {p2, v5, v4, v3, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    :goto_0
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    new-instance v3, Landroid/graphics/PorterDuffXfermode;

    sget-object v4, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v3, v4}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    invoke-virtual {v1, p2, v2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    new-instance p2, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {p2, v1, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    return-void
.end method

.method public final C()Landroid/net/Uri;
    .locals 4

    const/4 v0, -0x1

    iget-object v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->Y:Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz v1, :cond_7

    const-string v3, "NONE"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    iget-object v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->Y:Ljava/lang/String;

    const-string v3, "BUILD_IN_NONE"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    iget-object v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->Y:Ljava/lang/String;

    const-string v3, "BUILD_IN"

    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->Y:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_0

    :goto_0
    move v1, v0

    goto :goto_1

    :sswitch_0
    const-string v3, "BUILD_IN_TRANSPARENT"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x4

    goto :goto_1

    :sswitch_1
    const-string v3, "BUILD_IN_NIGHT"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x3

    goto :goto_1

    :sswitch_2
    const-string v3, "BUILD_IN_TRX"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x2

    goto :goto_1

    :sswitch_3
    const-string v3, "BUILD_IN_KIA"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x1

    goto :goto_1

    :sswitch_4
    const-string v3, "BUILD_IN_BRABUS"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v1, 0x0

    :goto_1
    packed-switch v1, :pswitch_data_0

    move v1, v0

    goto :goto_2

    :pswitch_0
    const v1, 0x7f080153

    goto :goto_2

    :pswitch_1
    const v1, 0x7f08012c

    goto :goto_2

    :pswitch_2
    const v1, 0x7f080156

    goto :goto_2

    :pswitch_3
    const v1, 0x7f0800e4

    goto :goto_2

    :pswitch_4
    const v1, 0x7f080087

    :goto_2
    if-ne v1, v0, :cond_5

    goto :goto_3

    :cond_5
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "android.resource://"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    :goto_3
    return-object v2

    :cond_6
    iget-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->Y:Ljava/lang/String;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_7

    invoke-static {p0, v0}, LUd;->d0(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v2

    :cond_7
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        -0x51df0188 -> :sswitch_4
        -0x2cb8a466 -> :sswitch_3
        -0x2cb8816f -> :sswitch_2
        0x1f09432f -> :sswitch_1
        0x4d054329 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final D()Luj;
    .locals 2

    const-string v0, "useSysNavi"

    invoke-static {v0}, LTd;->p(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lpa;->h:Luj;

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/SpedometerPanel;->F()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lpa;->g:Luj;

    goto :goto_0

    :cond_1
    invoke-static {}, Lpa;->x()Lpa;

    move-result-object v0

    iget-object v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->X:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    const/4 v0, 0x0

    invoke-static {v0, v1}, Lpa;->A(ILjava/lang/String;)Luj;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public final E(F)F
    .locals 2

    iget v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->Q:F

    iget v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->U:F

    cmpl-float v1, p1, v1

    if-lez v1, :cond_0

    iget v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->S:F

    goto :goto_0

    :cond_0
    iget v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->T:F

    cmpl-float p1, p1, v1

    if-lez p1, :cond_1

    iget v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->R:F

    :cond_1
    :goto_0
    return v0
.end method

.method public final F()Z
    .locals 1

    iget-boolean v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->f0:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->b0:Lnp;

    iget-object v0, v0, Lnp;->c:Ljava/lang/Object;

    check-cast v0, Ld2;

    iget-object v0, v0, Ld2;->b:Ljava/lang/Object;

    check-cast v0, LMf;

    iget-boolean v0, v0, LMf;->z:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final G()V
    .locals 12

    iget-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->p0:Landroid/os/Handler;

    iget-object v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->q0:Lr0;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const-string v2, "bgMode"

    const-string v3, "static"

    invoke-static {v2, v3}, LUd;->H(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-wide/16 v2, -0x1

    goto/16 :goto_3

    :cond_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    const/16 v4, 0xb

    invoke-virtual {v3, v4}, Ljava/util/Calendar;->get(I)I

    move-result v4

    mul-int/lit16 v4, v4, 0xe10

    const/16 v5, 0xc

    invoke-virtual {v3, v5}, Ljava/util/Calendar;->get(I)I

    move-result v5

    mul-int/lit8 v5, v5, 0x3c

    add-int/2addr v5, v4

    const/16 v4, 0xd

    invoke-virtual {v3, v4}, Ljava/util/Calendar;->get(I)I

    move-result v3

    add-int/2addr v3, v5

    const-string v4, "time"

    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v4, 0x0

    const/4 v5, 0x1

    const-string v6, "night"

    const/4 v7, 0x2

    const-string v8, "day"

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    new-array v9, v2, [Ljava/lang/String;

    const-string v10, "morning"

    aput-object v10, v9, v4

    aput-object v8, v9, v5

    const-string v8, "evening"

    aput-object v8, v9, v7

    const/4 v7, 0x3

    aput-object v6, v9, v7

    new-array v6, v2, [Ljava/lang/String;

    move v7, v4

    :goto_0
    if-ge v7, v2, :cond_2

    aget-object v8, v9, v7

    invoke-static {v8}, LUd;->I(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v6, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    new-array v9, v7, [Ljava/lang/String;

    aput-object v8, v9, v4

    aput-object v6, v9, v5

    new-array v2, v7, [Ljava/lang/String;

    invoke-static {v8}, LUd;->G(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v2, v4

    invoke-static {v6}, LUd;->G(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    aput-object v6, v2, v5

    move-object v6, v2

    :cond_2
    move v2, v4

    :goto_1
    array-length v7, v9

    const-string v8, ":"

    const-wide/16 v10, 0x3e8

    if-ge v2, v7, :cond_4

    aget-object v7, v6, v2

    invoke-virtual {v7, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v7

    aget-object v8, v7, v4

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    mul-int/lit16 v8, v8, 0xe10

    aget-object v7, v7, v5

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    mul-int/lit8 v7, v7, 0x3c

    add-int/2addr v7, v8

    if-ge v3, v7, :cond_3

    sub-int/2addr v7, v3

    int-to-long v2, v7

    :goto_2
    mul-long/2addr v2, v10

    goto :goto_3

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_4
    const v2, 0x15180

    sub-int/2addr v2, v3

    aget-object v3, v6, v4

    invoke-virtual {v3, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    aget-object v4, v3, v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    mul-int/lit16 v4, v4, 0xe10

    aget-object v3, v3, v5

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    mul-int/lit8 v3, v3, 0x3c

    add-int/2addr v3, v4

    add-int/2addr v3, v2

    int-to-long v2, v3

    goto :goto_2

    :goto_3
    const-wide/16 v4, 0x0

    cmp-long v4, v2, v4

    if-ltz v4, :cond_5

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_5
    return-void
.end method

.method public final H()V
    .locals 12

    iget-object v0, p0, LKf;->b:Landroid/content/SharedPreferences;

    const-string v1, "selectedTheme"

    const-string v2, "Audi Virtual Cockpit"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "setContentViewByTheme()-"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "T500.ACTIVITY"

    invoke-static {v2, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, LKf;->b:Landroid/content/SharedPreferences;

    const-string v3, "carModel"

    const-string v4, "tank_500"

    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/SpedometerPanel;->F()Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v3, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->b0:Lnp;

    iget-object v3, v3, Lnp;->c:Ljava/lang/Object;

    check-cast v3, Ld2;

    iget-object v3, v3, Ld2;->b:Ljava/lang/Object;

    check-cast v3, LMf;

    iget-object v3, v3, LMf;->A:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->b0:Lnp;

    iget-object v3, v3, Lnp;->c:Ljava/lang/Object;

    check-cast v3, Ld2;

    iget-object v3, v3, Ld2;->b:Ljava/lang/Object;

    check-cast v3, LMf;

    iget-object v3, v3, LMf;->a:Ljava/lang/String;

    :goto_0
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "layoutName="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "microMode="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v5, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->f0:Z

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "speedometer_default"

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {p0, v3}, LKf;->n(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v2}, LKf;->n(Ljava/lang/String;)V

    :goto_1
    iget-object v3, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->Z:LAf;

    iget-boolean v4, p0, LKf;->k:Z

    iget-boolean v5, p0, LKf;->l:Z

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/SpedometerPanel;->F()Z

    move-result v6

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v7, ""

    if-eqz v6, :cond_2

    const-string v4, "_micro"

    goto :goto_2

    :cond_2
    if-eqz v4, :cond_3

    const-string v4, "_big"

    goto :goto_2

    :cond_3
    move-object v4, v7

    :goto_2
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "_oldfw"

    if-nez v5, :cond_5

    const-string v8, "haval_h3"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    goto :goto_3

    :cond_4
    move-object v8, v0

    goto :goto_4

    :cond_5
    :goto_3
    move-object v8, v7

    :goto_4
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "changeTheme()="

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const-string v9, "T500.INFO_PANEL"

    invoke-static {v9, v8}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v8, 0x0

    invoke-virtual {v3, v6, v8}, LAf;->a(Ljava/lang/String;Z)LBq;

    move-result-object v10

    const-string v11, "_"

    if-eqz v10, :cond_7

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0, v8}, LAf;->a(Ljava/lang/String;Z)LBq;

    move-result-object v0

    if-eqz v0, :cond_6

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LBr;->X(Ljava/lang/String;)V

    move-object v10, v0

    goto :goto_6

    :cond_6
    invoke-static {v6}, LBr;->X(Ljava/lang/String;)V

    goto :goto_6

    :cond_7
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v5, :cond_8

    goto :goto_5

    :cond_8
    move-object v7, v0

    :goto_5
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0, v8}, LAf;->a(Ljava/lang/String;Z)LBq;

    move-result-object v10

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2, v8}, LAf;->a(Ljava/lang/String;Z)LBq;

    move-result-object v2

    if-eqz v2, :cond_9

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LBr;->X(Ljava/lang/String;)V

    move-object v10, v2

    goto :goto_6

    :cond_9
    invoke-static {v0}, LBr;->X(Ljava/lang/String;)V

    :goto_6
    iget-boolean v0, v3, LAf;->f:Z

    if-eqz v0, :cond_a

    iget-object v0, v10, LBq;->b:LK2;

    goto :goto_7

    :cond_a
    iget-object v0, v10, LBq;->a:LK2;

    :goto_7
    iget-object v1, v3, LAf;->b:LBq;

    invoke-virtual {v1, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-virtual {v0}, LK2;->w()[Lzf;

    move-result-object v1

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    const-string v2, "INFO_INDEX_L"

    invoke-static {v2}, LAf;->b(Ljava/lang/String;)I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    iput v1, v3, LAf;->c:I

    invoke-virtual {v0}, LK2;->y()[Lzf;

    move-result-object v1

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    const-string v2, "INFO_INDEX_R"

    invoke-static {v2}, LAf;->b(Ljava/lang/String;)I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    iput v1, v3, LAf;->d:I

    invoke-virtual {v0}, LK2;->l()[Lzf;

    move-result-object v0

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    const-string v1, "INFO_INDEX_C"

    invoke-static {v1}, LAf;->b(Ljava/lang/String;)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, v3, LAf;->e:I

    goto :goto_8

    :cond_b
    invoke-virtual {v0}, LK2;->w()[Lzf;

    move-result-object v1

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    invoke-static {v1, v8}, Ljava/lang/Math;->min(II)I

    move-result v1

    iput v1, v3, LAf;->c:I

    invoke-virtual {v0}, LK2;->y()[Lzf;

    move-result-object v1

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    invoke-static {v1, v8}, Ljava/lang/Math;->min(II)I

    move-result v1

    iput v1, v3, LAf;->d:I

    invoke-virtual {v0}, LK2;->l()[Lzf;

    move-result-object v0

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {v0, v8}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, v3, LAf;->e:I

    :goto_8
    invoke-virtual {v3}, LAf;->f()V

    iput-object v10, v3, LAf;->b:LBq;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "centralMode="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, v3, LAf;->f:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "indexL="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, v3, LAf;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "indexR="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, v3, LAf;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "indexC="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, v3, LAf;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "T500.INFO_FR"

    const-string v1, "setContentViewByTheme"

    invoke-static {v0, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v8}, Lru/zinovin/tankspeedometer/SpedometerPanel;->x(Z)V

    return-void
.end method

.method public final I()V
    .locals 2

    iget-boolean v0, p0, LKf;->m:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, LKf;->c:LLf;

    invoke-virtual {v0}, LLf;->d()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->M:Landroid/widget/ImageView;

    invoke-static {v0, v1}, LKf;->p(Landroid/view/View;I)V

    :cond_0
    iget-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->L:Landroid/widget/ImageView;

    invoke-static {v0, v1}, LKf;->p(Landroid/view/View;I)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->M:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-static {v0, v1}, LKf;->p(Landroid/view/View;I)V

    iget-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->L:Landroid/widget/ImageView;

    invoke-static {v0, v1}, LKf;->p(Landroid/view/View;I)V

    :goto_0
    return-void
.end method

.method public final J()V
    .locals 9

    iget-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->w:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    if-eqz v0, :cond_b

    iget-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->x:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    if-nez v0, :cond_0

    goto/16 :goto_5

    :cond_0
    iget-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->Z:LAf;

    invoke-virtual {v0}, LAf;->c()Lzf;

    move-result-object v0

    iget-object v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->Z:LAf;

    invoke-virtual {v1}, LAf;->d()Lzf;

    move-result-object v1

    iget v2, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->g0:I

    iget v3, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->h0:I

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lzf;->getNeedleMode()I

    move-result v0

    or-int/2addr v2, v0

    :cond_1
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lzf;->getNeedleMode()I

    move-result v0

    or-int/2addr v3, v0

    :cond_2
    iget-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->b0:Lnp;

    iget-object v0, v0, Lnp;->c:Ljava/lang/Object;

    check-cast v0, Ld2;

    iget-object v1, v0, Ld2;->b:Ljava/lang/Object;

    check-cast v1, LMf;

    iget-boolean v4, v1, LMf;->b:Z

    const/4 v5, 0x0

    if-eqz v4, :cond_3

    iget-object v1, v1, LMf;->n:Ljava/lang/String;

    invoke-virtual {v0, v1, v5}, Ld2;->F(Ljava/lang/String;Z)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0

    :cond_3
    iget v0, v1, LMf;->i:I

    invoke-static {v0}, LTf;->z(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    :goto_0
    iget-object v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->b0:Lnp;

    iget-object v1, v1, Lnp;->c:Ljava/lang/Object;

    check-cast v1, Ld2;

    iget-object v4, v1, Ld2;->b:Ljava/lang/Object;

    check-cast v4, LMf;

    iget-boolean v6, v4, LMf;->b:Z

    if-eqz v6, :cond_4

    iget-object v4, v4, LMf;->o:Ljava/lang/String;

    invoke-virtual {v1, v4, v5}, Ld2;->F(Ljava/lang/String;Z)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    goto :goto_1

    :cond_4
    invoke-static {v5}, LTf;->z(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    :goto_1
    iget-object v4, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->b0:Lnp;

    iget-object v4, v4, Lnp;->c:Ljava/lang/Object;

    check-cast v4, Ld2;

    iget-object v6, v4, Ld2;->b:Ljava/lang/Object;

    check-cast v6, LMf;

    iget-boolean v7, v6, LMf;->b:Z

    if-eqz v7, :cond_5

    iget-object v6, v6, LMf;->n:Ljava/lang/String;

    invoke-virtual {v4, v6, v5}, Ld2;->F(Ljava/lang/String;Z)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    goto :goto_2

    :cond_5
    iget v4, v6, LMf;->i:I

    invoke-static {v4}, LTf;->z(I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    :goto_2
    iget-object v6, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->b0:Lnp;

    iget-object v6, v6, Lnp;->c:Ljava/lang/Object;

    check-cast v6, Ld2;

    iget-object v7, v6, Ld2;->b:Ljava/lang/Object;

    check-cast v7, LMf;

    iget-boolean v8, v7, LMf;->b:Z

    if-eqz v8, :cond_6

    iget-object v7, v7, LMf;->o:Ljava/lang/String;

    invoke-virtual {v6, v7, v5}, Ld2;->F(Ljava/lang/String;Z)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    goto :goto_3

    :cond_6
    invoke-static {v5}, LTf;->z(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    :goto_3
    if-nez v1, :cond_7

    move-object v1, v0

    move-object v5, v4

    :cond_7
    and-int/lit8 v6, v2, 0x2

    if-lez v6, :cond_8

    iget-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->w:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    invoke-virtual {v0, v1}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->setNeedleDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_4

    :cond_8
    and-int/lit8 v1, v2, 0x1

    if-lez v1, :cond_9

    iget-object v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->w:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    invoke-virtual {v1, v0}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->setNeedleDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_9
    :goto_4
    and-int/lit8 v0, v3, 0x2

    if-lez v0, :cond_a

    iget-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->x:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    invoke-virtual {v0, v5}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->setNeedleDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_5

    :cond_a
    and-int/lit8 v0, v3, 0x1

    if-lez v0, :cond_b

    iget-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->x:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    invoke-virtual {v0, v4}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->setNeedleDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_b
    :goto_5
    return-void
.end method

.method public final K(Ljava/lang/Boolean;)V
    .locals 5

    iget-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->x:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const v0, 0x7f0b00c0

    const v1, 0x7f0b0180

    if-eqz p1, :cond_2

    iget-object p1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->x:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->x:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    const/4 v3, 0x0

    invoke-virtual {p1, v3}, Landroid/view/View;->setAlpha(F)V

    iget-object p1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->x:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {p1, v3}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    const-wide/16 v3, 0x12c

    invoke-virtual {p1, v3, v4}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    new-instance v3, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v3}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    invoke-virtual {p1, v3}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->start()V

    iget-object p1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->H:Landroid/widget/ImageView;

    invoke-static {p1, v2}, LKf;->p(Landroid/view/View;I)V

    iget-object p1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->I:Landroid/widget/TextView;

    invoke-static {p1, v2}, LKf;->p(Landroid/view/View;I)V

    iget-object p1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->O:Lru/zinovin/tankspeedometer/view/GradientCircleView;

    invoke-static {p1, v2}, LKf;->p(Landroid/view/View;I)V

    iget-boolean p1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->e0:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0, v1}, LKf;->c(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v2}, LKf;->p(Landroid/view/View;I)V

    :cond_0
    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/SpedometerPanel;->F()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0, v0}, LKf;->c(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v2}, LKf;->p(Landroid/view/View;I)V

    :cond_1
    iget-object p1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->b0:Lnp;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object p1, p1, Lnp;->c:Ljava/lang/Object;

    check-cast p1, Ld2;

    invoke-virtual {p1, v0}, Ld2;->X(Ljava/lang/Boolean;)V

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/SpedometerPanel;->r()V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->x:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    const/4 v2, 0x4

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->H:Landroid/widget/ImageView;

    invoke-static {p1, v2}, LKf;->p(Landroid/view/View;I)V

    iget-object p1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->I:Landroid/widget/TextView;

    invoke-static {p1, v2}, LKf;->p(Landroid/view/View;I)V

    iget-object p1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->O:Lru/zinovin/tankspeedometer/view/GradientCircleView;

    invoke-static {p1, v2}, LKf;->p(Landroid/view/View;I)V

    iget-object p1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->M:Landroid/widget/ImageView;

    invoke-static {p1, v2}, LKf;->p(Landroid/view/View;I)V

    invoke-virtual {p0, v1}, LKf;->c(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v2}, LKf;->p(Landroid/view/View;I)V

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/SpedometerPanel;->F()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {p0, v0}, LKf;->c(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v2}, LKf;->p(Landroid/view/View;I)V

    :cond_3
    iget-object p1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->b0:Lnp;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iget-object p1, p1, Lnp;->c:Ljava/lang/Object;

    check-cast p1, Ld2;

    invoke-virtual {p1, v0}, Ld2;->X(Ljava/lang/Boolean;)V

    :cond_4
    :goto_0
    return-void
.end method

.method public final d()V
    .locals 1

    iget-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->C:Lqg;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lqg;->a()V

    :cond_0
    iget-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->D:Lqg;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lqg;->a()V

    :cond_1
    iget-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->E:Lqg;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lqg;->a()V

    :cond_2
    iget-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->F:Lqg;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lqg;->a()V

    :cond_3
    return-void
.end method

.method public final e()V
    .locals 3

    new-instance v0, LIf;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LIf;-><init>(LKf;I)V

    iget-object v1, p0, LKf;->c:LLf;

    iget-object v2, v1, LLf;->x:Ldr;

    invoke-static {v2, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    new-instance v0, LIf;

    const/4 v2, 0x1

    invoke-direct {v0, p0, v2}, LIf;-><init>(LKf;I)V

    iget-object v2, v1, LLf;->B:Ldr;

    invoke-static {v2, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    new-instance v0, Lep;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lep;-><init>(Lru/zinovin/tankspeedometer/SpedometerPanel;I)V

    iget-object v2, v1, LLf;->a:Ldr;

    invoke-static {v2, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    new-instance v0, Lep;

    const/4 v2, 0x1

    invoke-direct {v0, p0, v2}, Lep;-><init>(Lru/zinovin/tankspeedometer/SpedometerPanel;I)V

    iget-object v2, v1, LLf;->b:Ldr;

    invoke-static {v2, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    new-instance v0, Lep;

    const/4 v2, 0x2

    invoke-direct {v0, p0, v2}, Lep;-><init>(Lru/zinovin/tankspeedometer/SpedometerPanel;I)V

    iget-object v2, v1, LLf;->d:Ldr;

    invoke-static {v2, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    new-instance v0, Lep;

    const/4 v2, 0x3

    invoke-direct {v0, p0, v2}, Lep;-><init>(Lru/zinovin/tankspeedometer/SpedometerPanel;I)V

    iget-object v2, v1, LLf;->G:Ldr;

    invoke-static {v2, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    new-instance v0, Lep;

    const/4 v2, 0x4

    invoke-direct {v0, p0, v2}, Lep;-><init>(Lru/zinovin/tankspeedometer/SpedometerPanel;I)V

    iget-object v2, v1, LLf;->c:Ldr;

    invoke-static {v2, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    new-instance v0, Lep;

    const/4 v2, 0x5

    invoke-direct {v0, p0, v2}, Lep;-><init>(Lru/zinovin/tankspeedometer/SpedometerPanel;I)V

    iget-object v2, v1, LLf;->e:Ldr;

    invoke-static {v2, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    new-instance v0, Lep;

    const/4 v2, 0x6

    invoke-direct {v0, p0, v2}, Lep;-><init>(Lru/zinovin/tankspeedometer/SpedometerPanel;I)V

    iget-object v2, v1, LLf;->f:Ldr;

    invoke-static {v2, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    new-instance v0, Lep;

    const/4 v2, 0x7

    invoke-direct {v0, p0, v2}, Lep;-><init>(Lru/zinovin/tankspeedometer/SpedometerPanel;I)V

    iget-object v2, v1, LLf;->g:Ldr;

    invoke-static {v2, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    new-instance v0, Lep;

    const/16 v2, 0x8

    invoke-direct {v0, p0, v2}, Lep;-><init>(Lru/zinovin/tankspeedometer/SpedometerPanel;I)V

    iget-object v2, v1, LLf;->h:Ldr;

    invoke-static {v2, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    new-instance v0, Lep;

    const/16 v2, 0x9

    invoke-direct {v0, p0, v2}, Lep;-><init>(Lru/zinovin/tankspeedometer/SpedometerPanel;I)V

    iget-object v2, v1, LLf;->F:Ldr;

    invoke-static {v2, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    new-instance v0, Lep;

    const/16 v2, 0xa

    invoke-direct {v0, p0, v2}, Lep;-><init>(Lru/zinovin/tankspeedometer/SpedometerPanel;I)V

    iget-object v2, v1, LLf;->p:Ldr;

    invoke-static {v2, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    new-instance v0, Lep;

    const/16 v2, 0xb

    invoke-direct {v0, p0, v2}, Lep;-><init>(Lru/zinovin/tankspeedometer/SpedometerPanel;I)V

    iget-object v2, v1, LLf;->i:Ldr;

    invoke-static {v2, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    new-instance v0, Lep;

    const/16 v2, 0xc

    invoke-direct {v0, p0, v2}, Lep;-><init>(Lru/zinovin/tankspeedometer/SpedometerPanel;I)V

    iget-object v2, v1, LLf;->j:Ldr;

    invoke-static {v2, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    new-instance v0, Lep;

    const/16 v2, 0xd

    invoke-direct {v0, p0, v2}, Lep;-><init>(Lru/zinovin/tankspeedometer/SpedometerPanel;I)V

    iget-object v2, v1, LLf;->s:Ldr;

    invoke-static {v2, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    new-instance v0, Lep;

    const/16 v2, 0xe

    invoke-direct {v0, p0, v2}, Lep;-><init>(Lru/zinovin/tankspeedometer/SpedometerPanel;I)V

    iget-object v2, v1, LLf;->r:Ldr;

    invoke-static {v2, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    new-instance v0, Lep;

    const/16 v2, 0xf

    invoke-direct {v0, p0, v2}, Lep;-><init>(Lru/zinovin/tankspeedometer/SpedometerPanel;I)V

    iget-object v2, v1, LLf;->x:Ldr;

    invoke-static {v2, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    new-instance v0, Lep;

    const/16 v2, 0x10

    invoke-direct {v0, p0, v2}, Lep;-><init>(Lru/zinovin/tankspeedometer/SpedometerPanel;I)V

    iget-object v2, v1, LLf;->B:Ldr;

    invoke-static {v2, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    new-instance v0, Lep;

    const/16 v2, 0x11

    invoke-direct {v0, p0, v2}, Lep;-><init>(Lru/zinovin/tankspeedometer/SpedometerPanel;I)V

    iget-object v2, v1, LLf;->t:Ldr;

    invoke-static {v2, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    new-instance v0, Lep;

    const/16 v2, 0x12

    invoke-direct {v0, p0, v2}, Lep;-><init>(Lru/zinovin/tankspeedometer/SpedometerPanel;I)V

    iget-object v1, v1, LLf;->E:Ldr;

    invoke-static {v1, p0, v0}, LLf;->f(Loj;LDg;LMj;)V

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/SpedometerPanel;->G()V

    return-void
.end method

.method public final f()V
    .locals 10

    new-instance v0, LRb;

    invoke-direct {v0}, LRb;-><init>()V

    iput-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->n0:LRb;

    const-string v1, "T500.FdbusReader"

    const-string v2, "Connect accepted="

    iget-boolean v3, v0, LRb;->d:Z

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x1

    iput-boolean v3, v0, LRb;->d:Z

    :try_start_0
    new-instance v3, Lipc/fdbus/Fdbus;

    invoke-direct {v3}, Lipc/fdbus/Fdbus;-><init>()V

    new-instance v3, Lipc/fdbus/FdbusClient;

    const-string v4, "tankspeedometer_fdbus"

    invoke-direct {v3, v4, v0}, Lipc/fdbus/FdbusClient;-><init>(Ljava/lang/String;Lipc/fdbus/FdbusClientListener;)V

    iput-object v3, v0, LRb;->c:Lipc/fdbus/FdbusClient;

    iget-object v3, v0, LRb;->c:Lipc/fdbus/FdbusClient;

    const-string v4, "svc://fdbus_mcu_ipc"

    invoke-virtual {v3, v4}, Lipc/fdbus/FdbusClient;->connect(Ljava/lang/String;)Z

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    if-nez v3, :cond_1

    invoke-virtual {v0}, LRb;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    const-string v3, "FDBus source unavailable; Binder fallback remains active"

    invoke-static {v1, v3, v2}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v0}, LRb;->a()V

    :cond_1
    :goto_0
    new-instance v0, LAf;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p0}, LAf;-><init>(Landroid/content/Context;LDg;)V

    iput-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->Z:LAf;

    new-instance v0, Lbg;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, v0, Lbg;->a:Ljava/util/HashMap;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, v0, Lbg;->b:Ljava/util/HashMap;

    new-instance v3, LSi;

    const/16 v4, 0x96

    const/4 v5, 0x0

    invoke-static {v4, v5, v5, v5}, Landroid/graphics/Color;->argb(IIII)I

    move-result v4

    const v6, 0x3f266666    # 0.65f

    invoke-direct {v3, v4, v6}, LSi;-><init>(IF)V

    const-string v4, "speedometer_default"

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, LSi;

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v5, v5, v5, v5}, Landroid/graphics/Color;->argb(IIII)I

    move-result v8

    invoke-direct {v3, v8, v7}, LSi;-><init>(IF)V

    const-string v7, "KIA"

    invoke-virtual {v1, v7, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v8, "KIA_big"

    invoke-virtual {v1, v8, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LSi;

    const/16 v3, 0xf0

    invoke-static {v3, v5, v5, v5}, Landroid/graphics/Color;->argb(IIII)I

    move-result v9

    invoke-direct {v1, v9, v6}, LSi;-><init>(IF)V

    invoke-virtual {v2, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LSi;

    invoke-static {v3, v5, v5, v5}, Landroid/graphics/Color;->argb(IIII)I

    move-result v4

    const/high16 v6, 0x3f000000    # 0.5f

    invoke-direct {v1, v4, v6}, LSi;-><init>(IF)V

    const-string v4, "Moon Eclipse"

    invoke-virtual {v2, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LSi;

    invoke-static {v3, v5, v5, v5}, Landroid/graphics/Color;->argb(IIII)I

    move-result v3

    invoke-direct {v1, v3, v6}, LSi;-><init>(IF)V

    const-string v3, "Moon Eclipse_big"

    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, LSi;

    const/16 v3, 0xff

    invoke-static {v3, v5, v5, v5}, Landroid/graphics/Color;->argb(IIII)I

    move-result v3

    invoke-direct {v1, v3, v6}, LSi;-><init>(IF)V

    invoke-virtual {v2, v7, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2, v8, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "KIA mini"

    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "KIA mini_big"

    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->a0:Lbg;

    new-instance v0, Lnp;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lnp;-><init>(I)V

    iput-object p0, v0, Lnp;->b:Ljava/lang/Object;

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lmk;->l(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "selectedTheme"

    const-string v3, "Audi Virtual Cockpit"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "bigMeters"

    invoke-static {v2, v5}, LBr;->s(Ljava/lang/String;Z)Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Lnp;->b(Ljava/lang/String;Z)V

    iput-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->b0:Lnp;

    new-instance v0, LU2;

    const/4 v1, 0x7

    invoke-direct {v0, p0, v1}, LU2;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->P:LU2;

    iget-object v1, p0, LKf;->b:Landroid/content/SharedPreferences;

    invoke-interface {v1, v0}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    return-void
.end method

.method public final g()V
    .locals 1

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/SpedometerPanel;->u()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lru/zinovin/tankspeedometer/SpedometerPanel;->t(Z)V

    return-void
.end method

.method public final h()V
    .locals 4

    invoke-super {p0}, LKf;->h()V

    iget-object v0, p0, LKf;->c:LLf;

    iget-object v1, v0, LLf;->u:Ldr;

    invoke-virtual {v1}, Loj;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iput-object v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->V:Ljava/lang/String;

    iget-object v1, p0, LKf;->b:Landroid/content/SharedPreferences;

    const-string v2, "speedKDefault"

    const-string v3, "1.055"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    iput v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->Q:F

    iget-object v1, p0, LKf;->b:Landroid/content/SharedPreferences;

    const-string v2, "ipSpeedK1"

    const-string v3, "1.046"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    iput v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->R:F

    iget-object v1, p0, LKf;->b:Landroid/content/SharedPreferences;

    const-string v2, "ipSpeedK2"

    const-string v3, "1.042"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    iput v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->S:F

    iget-object v1, p0, LKf;->b:Landroid/content/SharedPreferences;

    const-string v2, "ipSpeed1"

    const-string v3, "76"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    iput v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->T:F

    iget-object v1, p0, LKf;->b:Landroid/content/SharedPreferences;

    const-string v2, "ipSpeed2"

    const-string v3, "96"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    iput v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->U:F

    iget-object v1, p0, LKf;->b:Landroid/content/SharedPreferences;

    const-string v2, "selectedTheme"

    const-string v3, "Audi Virtual Cockpit"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->X:Ljava/lang/String;

    invoke-static {}, LF4;->O()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->Y:Ljava/lang/String;

    iget-object v1, v0, LLf;->v:Ldr;

    invoke-virtual {v1}, Loj;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iput-boolean v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->c0:Z

    iget-object v0, v0, LLf;->w:Ldr;

    invoke-virtual {v0}, Loj;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->d0:Z

    const-string v0, "showLabelInMeter"

    const/4 v1, 0x1

    invoke-static {v0, v1}, LBr;->s(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, LKf;->m:Z

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/SpedometerPanel;->D()Luj;

    iget-object v0, p0, LKf;->b:Landroid/content/SharedPreferences;

    const-string v1, "MICROMODE"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->f0:Z

    return-void
.end method

.method public final l()V
    .locals 2

    invoke-super {p0}, LKf;->l()V

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "ru.zinovin.tankspeedometer.T500_IP_SETTINGS_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    iget-object v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->r0:LO1;

    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method public final m()V
    .locals 3

    iget-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->V:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x30

    if-eq v1, v2, :cond_1

    const/16 v2, 0x33

    if-eq v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "3"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_1
    const-string v1, "0"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0e0181

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, v0}, LKf;->o(Landroid/view/View;)V

    goto :goto_1

    :cond_2
    :goto_0
    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/SpedometerPanel;->H()V

    :goto_1
    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/SpedometerPanel;->r()V

    return-void
.end method

.method public final onDestroy()V
    .locals 2

    iget-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->n0:LRb;

    invoke-virtual {v0}, LRb;->a()V

    iget-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->p0:Landroid/os/Handler;

    iget-object v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->q0:Lr0;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->P:LU2;

    if-eqz v0, :cond_0

    iget-object v1, p0, LKf;->b:Landroid/content/SharedPreferences;

    invoke-interface {v1, v0}, Landroid/content/SharedPreferences;->unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    :cond_0
    invoke-super {p0}, LKf;->onDestroy()V

    return-void
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 2

    iget-object v0, p0, LKf;->c:LLf;

    iget-object v1, v0, LLf;->v:Ldr;

    invoke-virtual {v1}, Loj;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iput-boolean v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->c0:Z

    iget-object v0, v0, LLf;->w:Ldr;

    invoke-virtual {v0}, Loj;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->d0:Z

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ru.zinovin.tankspeedometer.T500_IP_RESTART"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->X:Ljava/lang/String;

    const-string v1, "Night center"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lru/zinovin/tankspeedometer/SpedometerPanel;->t(Z)V

    :cond_0
    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/SpedometerPanel;->r()V

    :cond_1
    invoke-super {p0, p1, p2, p3}, Landroid/app/Service;->onStartCommand(Landroid/content/Intent;II)I

    move-result p1

    return p1
.end method

.method public final q()V
    .locals 1

    invoke-super {p0}, LKf;->q()V

    iget-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->r0:LO1;

    invoke-virtual {p0, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void
.end method

.method public final r()V
    .locals 1

    iget-boolean v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->d0:Z

    invoke-virtual {p0, v0}, Lru/zinovin/tankspeedometer/SpedometerPanel;->s(Z)V

    return-void
.end method

.method public final s(Z)V
    .locals 9

    const v0, 0x7f0b01c5

    invoke-virtual {p0, v0}, LKf;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    :cond_0
    const-string v0, "useSysNavi"

    invoke-static {v0}, LTd;->p(Ljava/lang/String;)Z

    move-result v0

    iget-boolean v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->c0:Z

    invoke-virtual {p0, p1}, Lru/zinovin/tankspeedometer/SpedometerPanel;->z(Z)V

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/SpedometerPanel;->F()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    const v5, 0x7f0b012e

    const/4 v6, 0x4

    if-eqz v2, :cond_7

    invoke-virtual {p0, v5}, LKf;->c(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2, v3}, LKf;->p(Landroid/view/View;I)V

    const v2, 0x7f0b01a2

    invoke-virtual {p0, v2}, LKf;->c(I)Landroid/view/View;

    move-result-object v2

    if-eqz v1, :cond_1

    move v5, v6

    goto :goto_0

    :cond_1
    move v5, v3

    :goto_0
    invoke-static {v2, v5}, LKf;->p(Landroid/view/View;I)V

    const v2, 0x7f0b014d

    invoke-virtual {p0, v2}, LKf;->c(I)Landroid/view/View;

    move-result-object v2

    if-eqz v1, :cond_2

    move v5, v6

    goto :goto_1

    :cond_2
    move v5, v3

    :goto_1
    invoke-static {v2, v5}, LKf;->p(Landroid/view/View;I)V

    const v2, 0x7f0b0214

    invoke-virtual {p0, v2}, LKf;->c(I)Landroid/view/View;

    move-result-object v2

    if-eqz v1, :cond_3

    move v5, v6

    goto :goto_2

    :cond_3
    move v5, v3

    :goto_2
    invoke-static {v2, v5}, LKf;->p(Landroid/view/View;I)V

    const v2, 0x7f0b0083

    invoke-virtual {p0, v2}, LKf;->c(I)Landroid/view/View;

    move-result-object v2

    if-eqz v1, :cond_4

    move v5, v6

    goto :goto_3

    :cond_4
    move v5, v3

    :goto_3
    invoke-static {v2, v5}, LKf;->p(Landroid/view/View;I)V

    const v2, 0x7f0b00fd

    invoke-virtual {p0, v2}, LKf;->c(I)Landroid/view/View;

    move-result-object v2

    if-eqz v1, :cond_5

    move v5, v6

    goto :goto_4

    :cond_5
    move v5, v3

    :goto_4
    invoke-static {v2, v5}, LKf;->p(Landroid/view/View;I)V

    const v2, 0x7f0b01e0

    invoke-virtual {p0, v2}, LKf;->c(I)Landroid/view/View;

    move-result-object v2

    if-eqz v1, :cond_6

    goto :goto_5

    :cond_6
    move v6, v3

    :goto_5
    invoke-static {v2, v6}, LKf;->p(Landroid/view/View;I)V

    if-eqz v1, :cond_b

    invoke-virtual {p0, v4, p1}, LKf;->a(ZZ)V

    goto :goto_8

    :cond_7
    invoke-virtual {p0, v5}, LKf;->c(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2, v6}, LKf;->p(Landroid/view/View;I)V

    const v2, 0x7f0b017a

    invoke-virtual {p0, v2}, LKf;->c(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v7, "applyScreenMode.fullScreen="

    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v7, "T500.ACTIVITY"

    invoke-static {v7, v5}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v8, "applyScreenMode.useSysNavi="

    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v7, v5}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v8, "applyScreenMode.naviStarted="

    invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v7, v5}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v1, :cond_a

    if-nez p1, :cond_9

    if-eqz v0, :cond_8

    goto :goto_6

    :cond_8
    invoke-static {v2, v3}, LKf;->p(Landroid/view/View;I)V

    goto :goto_7

    :cond_9
    :goto_6
    invoke-static {v2, v6}, LKf;->p(Landroid/view/View;I)V

    :goto_7
    invoke-virtual {p0, v3, p1}, LKf;->a(ZZ)V

    goto :goto_8

    :cond_a
    invoke-static {v2, v3}, LKf;->p(Landroid/view/View;I)V

    :cond_b
    :goto_8
    iget-object p1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->a0:Lbg;

    iget-object v2, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->X:Ljava/lang/String;

    iget-boolean v5, p0, LKf;->k:Z

    if-eqz v0, :cond_c

    if-eqz v1, :cond_c

    move v3, v4

    :cond_c
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "theme="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", big="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", systemNavi="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "T500.SHADOW"

    invoke-static {v1, v0}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v3, :cond_d

    iget-object p1, p1, Lbg;->b:Ljava/util/HashMap;

    goto :goto_9

    :cond_d
    iget-object p1, p1, Lbg;->a:Ljava/util/HashMap;

    :goto_9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v5, :cond_e

    const-string v1, "_big"

    goto :goto_a

    :cond_e
    const-string v1, ""

    :goto_a
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LSi;

    if-nez v0, :cond_f

    const-string v0, "speedometer_default"

    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, LSi;

    :cond_f
    iget-object p1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->N:Lru/zinovin/tankspeedometer/view/GradientCircleView;

    if-eqz p1, :cond_10

    iget v1, v0, LSi;->a:F

    iget v2, v0, LSi;->b:I

    invoke-virtual {p1, v2, v1}, Lru/zinovin/tankspeedometer/view/GradientCircleView;->a(IF)V

    :cond_10
    iget-object p1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->O:Lru/zinovin/tankspeedometer/view/GradientCircleView;

    if-eqz p1, :cond_11

    iget v1, v0, LSi;->a:F

    iget v0, v0, LSi;->b:I

    invoke-virtual {p1, v0, v1}, Lru/zinovin/tankspeedometer/view/GradientCircleView;->a(IF)V

    :cond_11
    iget-object p1, p0, LKf;->c:LLf;

    invoke-virtual {p1}, LLf;->d()Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_12

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lru/zinovin/tankspeedometer/SpedometerPanel;->K(Ljava/lang/Boolean;)V

    goto :goto_b

    :cond_12
    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/SpedometerPanel;->I()V

    :goto_b
    return-void
.end method

.method public final t(Z)V
    .locals 12

    iget-object v0, p0, LKf;->b:Landroid/content/SharedPreferences;

    const-string v1, "selectedTheme"

    const-string v2, "Audi Virtual Cockpit"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "applyThemeParameters()-"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "T500.ACTIVITY"

    invoke-static {v2, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->X:Ljava/lang/String;

    const-string v1, "Night center"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x2

    const/4 v3, 0x1

    if-eqz v0, :cond_1

    const-string v0, "useSysNavi"

    invoke-static {v0}, LTd;->p(Ljava/lang/String;)Z

    iget-boolean v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->c0:Z

    if-eqz v0, :cond_0

    iput v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->i0:I

    iput v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->g0:I

    goto :goto_0

    :cond_0
    iput v3, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->i0:I

    iput v3, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->g0:I

    goto :goto_0

    :cond_1
    iput v3, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->i0:I

    iput v3, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->g0:I

    :goto_0
    iput v3, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->j0:I

    iput v3, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->h0:I

    if-eqz p1, :cond_2

    const-string p1, "T500.INFO_FR"

    const-string v0, "applyThemeParameters"

    invoke-static {p1, v0}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/SpedometerPanel;->w()V

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/SpedometerPanel;->H()V

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/SpedometerPanel;->u()V

    :cond_2
    iget-object p1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->b0:Lnp;

    iget-object p1, p1, Lnp;->c:Ljava/lang/Object;

    check-cast p1, Ld2;

    iget-object p1, p1, Ld2;->b:Ljava/lang/Object;

    check-cast p1, LMf;

    iget-boolean p1, p1, LMf;->c:Z

    iput-boolean p1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->e0:Z

    const p1, 0x7f0b0180

    invoke-virtual {p0, p1}, LKf;->c(I)Landroid/view/View;

    move-result-object v0

    const/4 v4, 0x0

    if-eqz v0, :cond_4

    iget-boolean v5, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->e0:Z

    if-eqz v5, :cond_3

    move v5, v4

    goto :goto_1

    :cond_3
    const/4 v5, 0x4

    :goto_1
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    :cond_4
    const-string v0, "ERROR closing input stream"

    const-string v5, "dial_logo.png"

    invoke-static {p0, v5}, LUd;->d0(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object v5

    const/4 v6, 0x0

    if-eqz v5, :cond_5

    invoke-static {v5}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v5

    goto :goto_2

    :cond_5
    move-object v5, v6

    :goto_2
    invoke-virtual {p0, p1}, LKf;->c(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    if-eqz p1, :cond_7

    if-eqz v5, :cond_7

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v7

    invoke-virtual {v7, v5}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v5
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-static {v5, v6}, Landroid/graphics/drawable/Drawable;->createFromStream(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    invoke-virtual {p1, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v5, :cond_7

    :try_start_2
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_6

    :catch_0
    move-exception p1

    invoke-static {v2, v0, p1}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_6

    :catchall_0
    move-exception p1

    move-object v6, v5

    goto :goto_4

    :catch_1
    move-exception p1

    move-object v6, v5

    goto :goto_3

    :catchall_1
    move-exception p1

    goto :goto_4

    :catch_2
    move-exception p1

    :goto_3
    :try_start_3
    const-string v5, "ERROR in setLogoImage()"

    invoke-static {v2, v5, p1}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v6, :cond_7

    :try_start_4
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_6

    :goto_4
    if-eqz v6, :cond_6

    :try_start_5
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_5

    :catch_3
    move-exception v1

    invoke-static {v2, v0, v1}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    :goto_5
    throw p1

    :cond_7
    :goto_6
    iget-object p1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->b0:Lnp;

    iget-object p1, p1, Lnp;->c:Ljava/lang/Object;

    check-cast p1, Ld2;

    iget-object v0, p1, Ld2;->b:Ljava/lang/Object;

    check-cast v0, LMf;

    iget v2, v0, LMf;->p:F

    iput v2, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->k0:F

    iget-object p1, p1, Ld2;->c:Ljava/lang/Object;

    check-cast p1, Lru/zinovin/tankspeedometer/SpedometerPanel;

    iget-boolean p1, p1, LKf;->n:Z

    if-eqz p1, :cond_8

    iget p1, v0, LMf;->s:I

    goto :goto_7

    :cond_8
    iget p1, v0, LMf;->x:I

    :goto_7
    invoke-static {p1}, LTf;->z(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iget-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->b0:Lnp;

    iget-object v0, v0, Lnp;->c:Ljava/lang/Object;

    check-cast v0, Ld2;

    iget-object v2, v0, Ld2;->c:Ljava/lang/Object;

    check-cast v2, Lru/zinovin/tankspeedometer/SpedometerPanel;

    iget-boolean v2, v2, LKf;->n:Z

    iget-object v0, v0, Ld2;->b:Ljava/lang/Object;

    check-cast v0, LMf;

    if-eqz v2, :cond_9

    iget-object v5, v0, LMf;->t:Ljava/lang/String;

    goto :goto_8

    :cond_9
    iget-object v5, v0, LMf;->y:Ljava/lang/String;

    :goto_8
    iget v6, v0, LMf;->u:F

    iput v6, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->l0:F

    if-eqz v2, :cond_a

    iget v0, v0, LMf;->x:I

    goto :goto_9

    :cond_a
    iget v0, v0, LMf;->s:I

    :goto_9
    invoke-static {v0}, LTf;->z(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget-object v2, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->b0:Lnp;

    iget-object v2, v2, Lnp;->c:Ljava/lang/Object;

    check-cast v2, Ld2;

    iget-object v6, v2, Ld2;->c:Ljava/lang/Object;

    check-cast v6, Lru/zinovin/tankspeedometer/SpedometerPanel;

    iget-boolean v7, v6, LKf;->n:Z

    iget-object v8, v2, Ld2;->b:Ljava/lang/Object;

    check-cast v8, LMf;

    if-eqz v7, :cond_b

    iget-object v9, v8, LMf;->y:Ljava/lang/String;

    goto :goto_a

    :cond_b
    iget-object v9, v8, LMf;->t:Ljava/lang/String;

    :goto_a
    iget-boolean v10, v8, LMf;->b:Z

    if-eqz v10, :cond_e

    iget-object v10, v8, LMf;->j:Ljava/lang/String;

    if-eqz v7, :cond_c

    iget v6, v6, Lru/zinovin/tankspeedometer/SpedometerPanel;->i0:I

    if-ne v6, v1, :cond_d

    iget-object v10, v8, LMf;->l:Ljava/lang/String;

    goto :goto_b

    :cond_c
    iget v6, v6, Lru/zinovin/tankspeedometer/SpedometerPanel;->j0:I

    if-ne v6, v1, :cond_d

    iget-object v10, v8, LMf;->l:Ljava/lang/String;

    :cond_d
    :goto_b
    invoke-virtual {v2, v10, v3}, Ld2;->F(Ljava/lang/String;Z)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    goto :goto_e

    :cond_e
    iget v2, v8, LMf;->g:I

    if-eqz v7, :cond_f

    iget v6, v6, Lru/zinovin/tankspeedometer/SpedometerPanel;->i0:I

    if-ne v6, v1, :cond_10

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_c
    move v2, v4

    goto :goto_d

    :cond_f
    iget v6, v6, Lru/zinovin/tankspeedometer/SpedometerPanel;->j0:I

    if-ne v6, v1, :cond_10

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_c

    :cond_10
    :goto_d
    invoke-static {v2}, LTf;->z(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    :goto_e
    iget-object v6, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->b0:Lnp;

    iget-object v6, v6, Lnp;->c:Ljava/lang/Object;

    check-cast v6, Ld2;

    iget-object v7, v6, Ld2;->b:Ljava/lang/Object;

    check-cast v7, LMf;

    iget-boolean v8, v7, LMf;->b:Z

    iget-object v10, v6, Ld2;->c:Ljava/lang/Object;

    check-cast v10, Lru/zinovin/tankspeedometer/SpedometerPanel;

    if-eqz v8, :cond_13

    iget-object v8, v7, LMf;->k:Ljava/lang/String;

    iget-boolean v11, v10, LKf;->n:Z

    if-eqz v11, :cond_11

    iget v10, v10, Lru/zinovin/tankspeedometer/SpedometerPanel;->j0:I

    if-ne v10, v1, :cond_12

    iget-object v8, v7, LMf;->m:Ljava/lang/String;

    goto :goto_f

    :cond_11
    iget v10, v10, Lru/zinovin/tankspeedometer/SpedometerPanel;->i0:I

    if-ne v10, v1, :cond_12

    iget-object v8, v7, LMf;->m:Ljava/lang/String;

    :cond_12
    :goto_f
    invoke-virtual {v6, v8, v3}, Ld2;->F(Ljava/lang/String;Z)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    goto :goto_12

    :cond_13
    iget v3, v7, LMf;->h:I

    iget-boolean v6, v10, LKf;->n:Z

    if-eqz v6, :cond_14

    iget v6, v10, Lru/zinovin/tankspeedometer/SpedometerPanel;->j0:I

    if-ne v6, v1, :cond_15

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_10
    move v3, v4

    goto :goto_11

    :cond_14
    iget v6, v10, Lru/zinovin/tankspeedometer/SpedometerPanel;->i0:I

    if-ne v6, v1, :cond_15

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_10

    :cond_15
    :goto_11
    invoke-static {v3}, LTf;->z(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    :goto_12
    iget-object v3, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->u:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    if-eqz v3, :cond_16

    invoke-virtual {v3, v2}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v3, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->u:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    iget-object v6, v3, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->e:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v3}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->e()V

    invoke-virtual {v3}, Landroid/view/View;->invalidate()V

    iget-object v3, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->u:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    new-instance v6, LBn;

    iget-object v7, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->b0:Lnp;

    iget-object v7, v7, Lnp;->c:Ljava/lang/Object;

    check-cast v7, Ld2;

    iget-object v7, v7, Ld2;->b:Ljava/lang/Object;

    check-cast v7, LMf;

    iget v8, v7, LMf;->q:I

    int-to-float v8, v8

    iget v7, v7, LMf;->r:I

    int-to-float v7, v7

    iget v10, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->k0:F

    invoke-direct {v6, v8, v7, v10}, LBn;-><init>(FFF)V

    invoke-virtual {v3, v6}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->a(LBn;)V

    :cond_16
    iget-object v3, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->v:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    if-eqz v3, :cond_18

    if-nez v1, :cond_17

    goto :goto_13

    :cond_17
    move-object v2, v1

    :goto_13
    invoke-virtual {v3, v2}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->v:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    iget-object v2, v1, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->e:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v1}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->e()V

    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    iget-object v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->v:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    new-instance v2, LBn;

    iget-object v3, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->b0:Lnp;

    iget-object v3, v3, Lnp;->c:Ljava/lang/Object;

    check-cast v3, Ld2;

    iget-object v3, v3, Ld2;->b:Ljava/lang/Object;

    check-cast v3, LMf;

    iget v6, v3, LMf;->v:I

    int-to-float v6, v6

    iget v3, v3, LMf;->w:I

    int-to-float v3, v3

    iget v7, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->l0:F

    invoke-direct {v2, v6, v3, v7}, LBn;-><init>(FFF)V

    invoke-virtual {v1, v2}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->a(LBn;)V

    :cond_18
    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/SpedometerPanel;->J()V

    iget-object v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->J:Landroid/widget/ImageView;

    const v2, 0x7f080152

    if-eqz v1, :cond_1a

    if-eqz p1, :cond_19

    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_14

    :cond_19
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_1a
    :goto_14
    iget-object p1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->H:Landroid/widget/ImageView;

    if-eqz p1, :cond_1c

    if-eqz v0, :cond_1b

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_15

    :cond_1b
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_1c
    :goto_15
    iget-object p1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->K:Landroid/widget/TextView;

    if-eqz p1, :cond_1d

    if-eqz v5, :cond_1d

    invoke-virtual {p1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1d
    iget-object p1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->I:Landroid/widget/TextView;

    if-eqz p1, :cond_1e

    if-eqz v9, :cond_1e

    invoke-virtual {p1, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1e
    iget-object p1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->b0:Lnp;

    iget-object p1, p1, Lnp;->c:Ljava/lang/Object;

    check-cast p1, Ld2;

    iget-object p1, p1, Ld2;->b:Ljava/lang/Object;

    check-cast p1, LMf;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4}, LTf;->z(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-eqz p1, :cond_21

    iget-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->y:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    if-eqz v0, :cond_1f

    invoke-virtual {v0, p1}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->setNeedleDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1f
    iget-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->z:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    if-eqz v0, :cond_20

    invoke-virtual {v0, p1}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->setNeedleDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_20
    iget-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->A:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    if-eqz v0, :cond_21

    invoke-virtual {v0, p1}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->setNeedleDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_21
    return-void
.end method

.method public final u()V
    .locals 10

    const v0, 0x7f0b011b

    invoke-virtual {p0, v0}, LKf;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->B:Landroid/widget/TextView;

    const v0, 0x7f0b0151

    invoke-virtual {p0, v0}, LKf;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    iput-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->w:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    const v0, 0x7f0b0155

    invoke-virtual {p0, v0}, LKf;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    iput-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->x:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    const v0, 0x7f0b0152

    invoke-virtual {p0, v0}, LKf;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    iput-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->y:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    const v0, 0x7f0b0153

    invoke-virtual {p0, v0}, LKf;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    iput-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->z:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    const v0, 0x7f0b0156

    invoke-virtual {p0, v0}, LKf;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    iput-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->A:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    iget-boolean v0, p0, LKf;->n:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->w:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    iput-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->u:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    iget-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->x:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    iput-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->v:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->x:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    iput-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->u:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    iget-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->w:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    iput-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->v:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    :goto_0
    iget-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->b0:Lnp;

    iget-object v0, v0, Lnp;->c:Ljava/lang/Object;

    check-cast v0, Ld2;

    invoke-virtual {v0}, Ld2;->o()V

    const v0, 0x7f0b0085

    invoke-virtual {p0, v0}, LKf;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lqg;

    iput-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->F:Lqg;

    const v0, 0x7f0b02ca

    invoke-virtual {p0, v0}, LKf;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->G:Landroid/widget/ImageView;

    const v0, 0x7f0b0154

    invoke-virtual {p0, v0}, LKf;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->H:Landroid/widget/ImageView;

    const v0, 0x7f0b021e

    invoke-virtual {p0, v0}, LKf;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->I:Landroid/widget/TextView;

    const v0, 0x7f0b016d

    invoke-virtual {p0, v0}, LKf;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lru/zinovin/tankspeedometer/view/GradientCircleView;

    iput-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->N:Lru/zinovin/tankspeedometer/view/GradientCircleView;

    const v0, 0x7f0b021d

    invoke-virtual {p0, v0}, LKf;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lru/zinovin/tankspeedometer/view/GradientCircleView;

    iput-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->O:Lru/zinovin/tankspeedometer/view/GradientCircleView;

    const v0, 0x7f0b0150

    invoke-virtual {p0, v0}, LKf;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->J:Landroid/widget/ImageView;

    const v0, 0x7f0b016e

    invoke-virtual {p0, v0}, LKf;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->K:Landroid/widget/TextView;

    const v0, 0x7f0b0171

    invoke-virtual {p0, v0}, LKf;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->L:Landroid/widget/ImageView;

    const v0, 0x7f0b0222

    invoke-virtual {p0, v0}, LKf;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->M:Landroid/widget/ImageView;

    iget-object v7, p0, LKf;->c:LLf;

    iget-object v0, v7, LLf;->a:Ldr;

    invoke-virtual {v0}, Loj;->d()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/Float;

    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/4 v9, 0x0

    cmpl-float v1, v0, v9

    if-ltz v1, :cond_1

    iget-object v2, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->u:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->b0:Lnp;

    invoke-virtual {p0, v0}, Lru/zinovin/tankspeedometer/SpedometerPanel;->E(F)F

    move-result v3

    mul-float/2addr v3, v0

    iget-object v2, v2, Lnp;->c:Ljava/lang/Object;

    check-cast v2, Ld2;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->u:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    invoke-virtual {v2, v3}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->c(F)V

    :cond_1
    if-ltz v1, :cond_2

    invoke-virtual {p0, v0}, Lru/zinovin/tankspeedometer/SpedometerPanel;->E(F)F

    move-result v1

    mul-float/2addr v1, v0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    iget v5, p0, LKf;->e:I

    const v1, 0x7f0b025b

    const-string v6, "%.0f"

    const-string v3, ""

    move-object v0, p0

    move v4, v5

    invoke-virtual/range {v0 .. v6}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    :cond_2
    iget-object v0, v7, LLf;->a:Ldr;

    invoke-virtual {v0, v8}, Ldr;->f(Ljava/lang/Object;)V

    iget-object v0, v7, LLf;->b:Ldr;

    invoke-virtual {v0}, Loj;->d()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/Float;

    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    move-result v0

    cmpl-float v1, v0, v9

    if-ltz v1, :cond_4

    iget-object v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->v:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    const/high16 v2, 0x447a0000    # 1000.0f

    if-eqz v1, :cond_3

    iget-object v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->b0:Lnp;

    div-float v3, v0, v2

    iget-object v1, v1, Lnp;->c:Ljava/lang/Object;

    check-cast v1, Ld2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->v:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    invoke-virtual {v1, v3}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->c(F)V

    :cond_3
    div-float/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    iget v5, p0, LKf;->e:I

    const v1, 0x7f0b0227

    const-string v6, "%.1f"

    const-string v3, ""

    move-object v0, p0

    move v4, v5

    invoke-virtual/range {v0 .. v6}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    :cond_4
    iget-object v0, v7, LLf;->b:Ldr;

    invoke-virtual {v0, v8}, Ldr;->f(Ljava/lang/Object;)V

    iget-object v0, v7, LLf;->d:Ldr;

    invoke-virtual {v0}, Loj;->d()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->B:Landroid/widget/TextView;

    if-eqz v1, :cond_6

    iget-object v3, v7, LLf;->c:Ldr;

    invoke-virtual {v3}, Loj;->d()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_5

    if-eqz v0, :cond_5

    const/4 v0, 0x0

    goto :goto_1

    :cond_5
    const/4 v0, 0x4

    :goto_1
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_6
    iget v4, p0, LKf;->d:I

    iget v5, p0, LKf;->e:I

    const v1, 0x7f0b011b

    const-string v6, "%d"

    const-string v3, ""

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    iget-object v0, v7, LLf;->e:Ldr;

    invoke-virtual {v0}, Loj;->d()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Float;

    iget v4, p0, LKf;->d:I

    iget v5, p0, LKf;->e:I

    const v1, 0x7f0b0083

    const-string v6, "%.1f"

    const-string v3, "V"

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    iget-object v0, v7, LLf;->f:Ldr;

    invoke-virtual {v0}, Loj;->d()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Float;

    const-string v0, "persist.vendor.gwm.cfg.project.code"

    const/4 v1, 0x0

    invoke-static {v1, v0}, LTf;->F(Landroid/app/Activity;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v4, p0, LKf;->d:I

    iget v5, p0, LKf;->e:I

    const v1, 0x7f0b00fd

    const-string v6, "%.1f"

    const-string v3, "%"

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    iget-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->F:Lqg;

    if-eqz v0, :cond_7

    iget-object v1, v7, LLf;->f:Ldr;

    invoke-virtual {v1}, Loj;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {v0, v1}, Lqg;->setLevelValue(F)V

    :cond_7
    invoke-virtual {v7}, LLf;->c()Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/high16 v1, 0x42c80000    # 100.0f

    cmpg-float v2, v0, v1

    if-gez v2, :cond_8

    invoke-static {}, LTf;->u()F

    move-result v2

    mul-float/2addr v2, v0

    goto :goto_2

    :cond_8
    invoke-static {}, LTf;->t()F

    move-result v2

    :goto_2
    invoke-static {}, LTf;->t()F

    move-result v0

    div-float v0, v2, v0

    mul-float/2addr v0, v1

    iget-object v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->C:Lqg;

    if-eqz v1, :cond_9

    invoke-virtual {v1, v0}, Lqg;->setLevelValue(F)V

    :cond_9
    iget-object v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->y:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    if-eqz v1, :cond_a

    iget-object v3, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->b0:Lnp;

    iget-object v3, v3, Lnp;->c:Ljava/lang/Object;

    check-cast v3, Ld2;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v0}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->c(F)V

    :cond_a
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    iget v4, p0, LKf;->d:I

    iget v5, p0, LKf;->e:I

    const v1, 0x7f0b0115

    const-string v6, "%.0f"

    const-string v3, " L"

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    iget-object v0, v7, LLf;->h:Ldr;

    invoke-virtual {v0}, Loj;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float/2addr v0, v1

    div-float v1, v0, v1

    iget-object v2, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->D:Lqg;

    if-eqz v2, :cond_b

    invoke-virtual {v2, v1}, Lqg;->setLevelValue(F)V

    :cond_b
    iget-object v2, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->z:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    if-eqz v2, :cond_c

    iget-object v3, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->b0:Lnp;

    iget-object v3, v3, Lnp;->c:Ljava/lang/Object;

    check-cast v3, Ld2;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2, v1}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->c(F)V

    :cond_c
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    iget v4, p0, LKf;->d:I

    iget v5, p0, LKf;->e:I

    const v1, 0x7f0b0119

    const-string v6, "%.0f"

    const-string v3, " L"

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    iget-object v0, v7, LLf;->p:Ldr;

    invoke-virtual {v0}, Loj;->d()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Float;

    iget v4, p0, LKf;->d:I

    iget v5, p0, LKf;->e:I

    const v1, 0x7f0b01e0

    const-string v6, "%.0f"

    const-string v3, " km"

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    iget-object v0, v7, LLf;->i:Ldr;

    invoke-virtual {v0}, Loj;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    cmpl-float v0, v0, v9

    if-lez v0, :cond_d

    iget-object v0, v7, LLf;->i:Ldr;

    invoke-virtual {v0}, Loj;->d()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Float;

    iget v4, p0, LKf;->d:I

    iget v5, p0, LKf;->e:I

    const v1, 0x7f0b0214

    const-string v6, "%.0f"

    const-string v3, " km"

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    goto :goto_3

    :cond_d
    iget v4, p0, LKf;->d:I

    iget v5, p0, LKf;->e:I

    const v1, 0x7f0b0214

    const-string v6, "%s"

    const-string v2, "---"

    const-string v3, " km"

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    :goto_3
    iget-object v0, v7, LLf;->F:Ldr;

    invoke-virtual {v0}, Loj;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    cmpl-float v0, v0, v9

    if-lez v0, :cond_e

    iget-object v0, v7, LLf;->F:Ldr;

    invoke-virtual {v0}, Loj;->d()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Float;

    iget v4, p0, LKf;->d:I

    iget v5, p0, LKf;->e:I

    const v1, 0x7f0b00fe

    const-string v6, "%.0f"

    const-string v3, " km"

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    goto :goto_4

    :cond_e
    iget v4, p0, LKf;->d:I

    iget v5, p0, LKf;->e:I

    const v1, 0x7f0b00fe

    const-string v6, "%s"

    const-string v2, "---"

    const-string v3, " km"

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    :goto_4
    iget-object v0, v7, LLf;->j:Ldr;

    invoke-virtual {v0}, Loj;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    cmpl-float v0, v0, v9

    if-lez v0, :cond_f

    iget-object v0, v7, LLf;->j:Ldr;

    invoke-virtual {v0}, Loj;->d()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Float;

    iget v4, p0, LKf;->d:I

    iget v5, p0, LKf;->e:I

    const v1, 0x7f0b0215

    const-string v6, "%.0f"

    const-string v3, " km"

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    goto :goto_5

    :cond_f
    iget v4, p0, LKf;->d:I

    iget v5, p0, LKf;->e:I

    const v1, 0x7f0b0215

    const-string v6, "%s"

    const-string v2, "---"

    const-string v3, " km"

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    :goto_5
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "assignViewValues(). outside temp="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7}, LLf;->b()Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "T500.ACTIVITY"

    invoke-static {v1, v0}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7}, LLf;->b()Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    const/high16 v1, -0x3b860000    # -1000.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_10

    invoke-virtual {v7}, LLf;->b()Ljava/lang/Float;

    move-result-object v2

    iget v4, p0, LKf;->d:I

    iget v5, p0, LKf;->e:I

    const v1, 0x7f0b01f3

    const-string v6, "%.0f"

    const-string v3, ""

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    invoke-virtual {v7}, LLf;->b()Ljava/lang/Float;

    move-result-object v0

    iget-object v1, v7, LLf;->s:Ldr;

    invoke-virtual {v1, v0}, Ldr;->f(Ljava/lang/Object;)V

    :cond_10
    iget-object v0, v7, LLf;->r:Ldr;

    invoke-virtual {v0}, Loj;->d()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Float;

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v8

    iget v4, p0, LKf;->d:I

    iget v5, p0, LKf;->e:I

    const v1, 0x7f0b00c0

    const-string v6, "%.0f"

    const-string v3, " \u00b0C"

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, LKf;->k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V

    iget-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->E:Lqg;

    if-eqz v0, :cond_11

    invoke-virtual {v0, v8}, Lqg;->setLevelValue(F)V

    :cond_11
    iget-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->A:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    if-eqz v0, :cond_12

    iget-object v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->b0:Lnp;

    iget-object v1, v1, Lnp;->c:Ljava/lang/Object;

    check-cast v1, Ld2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v8}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->c(F)V

    :cond_12
    iget-object v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->G:Landroid/widget/ImageView;

    if-eqz v0, :cond_14

    iget-object v1, v7, LLf;->x:Ldr;

    invoke-virtual {v1}, Loj;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_13

    const v1, 0x7f080182

    goto :goto_6

    :cond_13
    const v1, 0x7f080181

    :goto_6
    invoke-static {p0, v1}, LH7;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_14
    return-void
.end method

.method public final v(Luj;)V
    .locals 9

    iget-boolean v0, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->c0:Z

    iget-boolean v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->d0:Z

    if-eqz v1, :cond_0

    iget-object p1, p1, Luj;->b:Ltj;

    goto :goto_0

    :cond_0
    iget-object p1, p1, Luj;->a:Ltj;

    :goto_0
    iget-object v2, p0, LKf;->b:Landroid/content/SharedPreferences;

    const-string v3, "selectedTheme"

    const-string v4, "Audi Virtual Cockpit"

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->X:Ljava/lang/String;

    invoke-static {}, LF4;->O()Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->Y:Ljava/lang/String;

    const-string v2, "speedFromLeft"

    const/4 v3, 0x1

    invoke-static {v2, v3}, LBr;->s(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, p0, LKf;->n:Z

    iget-boolean v2, p0, LKf;->k:Z

    const-string v4, "bigMeters"

    const/4 v5, 0x0

    invoke-static {v4, v5}, LBr;->s(Ljava/lang/String;Z)Z

    move-result v6

    if-eq v2, v6, :cond_1

    const-string v2, ""

    iput-object v2, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->m0:Ljava/lang/String;

    :cond_1
    invoke-static {v4, v5}, LBr;->s(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, p0, LKf;->k:Z

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/SpedometerPanel;->w()V

    new-instance v2, LAf;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v2, v4, p0}, LAf;-><init>(Landroid/content/Context;LDg;)V

    iput-object v2, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->Z:LAf;

    const-string v2, "naviFullscreen"

    invoke-static {v2}, LTd;->p(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->d0:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    iget-object v4, p0, LKf;->c:LLf;

    iget-object v6, v4, LLf;->w:Ldr;

    invoke-virtual {v6, v2}, Ldr;->f(Ljava/lang/Object;)V

    const-string v2, "useNavi"

    invoke-static {v2}, LTd;->p(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->c0:Z

    const-string v2, "useSysNavi"

    invoke-static {v2}, LTd;->p(Ljava/lang/String;)Z

    move-result v2

    iget-boolean v6, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->c0:Z

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-virtual {v4, v6}, LLf;->i(Ljava/lang/Boolean;)V

    iget-object v4, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->b0:Lnp;

    iget-object v6, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->X:Ljava/lang/String;

    iget-boolean v7, p0, LKf;->k:Z

    invoke-virtual {v4, v6, v7}, Lnp;->b(Ljava/lang/String;Z)V

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/SpedometerPanel;->D()Luj;

    move-result-object v4

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "changeThemeAction.theme="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v7, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->X:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v7, "T500.ACTIVITY"

    invoke-static {v7, v6}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v8, "changeThemeAction.prevFullscreen="

    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v7, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v6, "changeThemeAction.naviFullscreen="

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v6, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->d0:Z

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v7, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v6, "changeThemeAction.useSysNavi="

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v7, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v6, "changeThemeAction.useNavi="

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v6, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->c0:Z

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v7, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v2, :cond_2

    invoke-static {v5}, LUd;->p0(Z)V

    goto :goto_2

    :cond_2
    iget-boolean v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->c0:Z

    if-nez v1, :cond_3

    invoke-static {v5}, LUd;->p0(Z)V

    :cond_3
    iget-boolean v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->d0:Z

    if-eqz v1, :cond_4

    iget-object v1, v4, Luj;->b:Ltj;

    invoke-virtual {v1, p1}, Ltj;->equals(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_1

    :cond_4
    iget-object v1, v4, Luj;->a:Ltj;

    invoke-virtual {v1, p1}, Ltj;->equals(Ljava/lang/Object;)Z

    move-result p1

    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "changeThemeAction.isEquals="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v7, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_5

    invoke-static {}, LUd;->A()I

    move-result p1

    const/4 v1, -0x1

    if-ne p1, v1, :cond_6

    :cond_5
    iget-boolean p1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->c0:Z

    if-eqz p1, :cond_6

    invoke-static {v3}, LUd;->p0(Z)V

    iget-boolean p1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->d0:Z

    invoke-static {p1}, LUd;->n0(Z)V

    move v0, v3

    :cond_6
    if-nez v0, :cond_7

    iget-boolean p1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->c0:Z

    if-eqz p1, :cond_7

    iget-boolean p1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->d0:Z

    invoke-static {p1}, LUd;->n0(Z)V

    :cond_7
    :goto_2
    invoke-virtual {p0, v3}, Lru/zinovin/tankspeedometer/SpedometerPanel;->t(Z)V

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/SpedometerPanel;->r()V

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/SpedometerPanel;->G()V

    const-string p1, "showLabelInMeter"

    invoke-static {p1, v3}, LBr;->s(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, LKf;->m:Z

    iget-boolean p1, p0, LKf;->h:Z

    if-nez p1, :cond_8

    iget-object p1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->V:Ljava/lang/String;

    const-string v0, "3"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/SpedometerPanel;->I()V

    :cond_8
    return-void
.end method

.method public final w()V
    .locals 6

    const v0, 0x7f0b0170

    invoke-virtual {p0, v0}, LKf;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    const v1, 0x7f0b0221

    invoke-virtual {p0, v1}, LKf;->c(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout;

    const v2, 0x7f0b00a4

    invoke-virtual {p0, v2}, LKf;->c(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/FrameLayout;

    :goto_0
    const/4 v3, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v4

    if-lez v4, :cond_0

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v4

    if-lez v4, :cond_1

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "clearInfoFragments-"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int/lit8 v5, v0, 0x1

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v4, "T500.INFO_FR"

    invoke-static {v4, v0}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    move v0, v5

    goto :goto_1

    :cond_1
    :goto_2
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-lez v0, :cond_2

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    goto :goto_2

    :cond_2
    return-void
.end method

.method public final x(Z)V
    .locals 13

    const-string v0, "T500.INFO_FR"

    const-string v1, "doReplace="

    if-eqz p1, :cond_0

    :try_start_0
    iget-object p1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->Z:LAf;

    invoke-virtual {p1}, LAf;->e()V

    goto :goto_0

    :catch_0
    move-exception p1

    goto/16 :goto_a

    :cond_0
    :goto_0
    const p1, 0x7f0b0170

    invoke-virtual {p0, p1}, LKf;->c(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz p1, :cond_2

    iget-boolean v5, p0, LKf;->n:Z

    if-eqz v5, :cond_1

    iget-object v5, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->Z:LAf;

    invoke-virtual {v5}, LAf;->c()Lzf;

    move-result-object v5

    goto :goto_1

    :cond_1
    iget-object v5, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->Z:LAf;

    invoke-virtual {v5}, LAf;->d()Lzf;

    move-result-object v5

    :goto_1
    move v6, v4

    goto :goto_2

    :cond_2
    move-object v5, v2

    move v6, v3

    :goto_2
    const v7, 0x7f0b0221

    invoke-virtual {p0, v7}, LKf;->c(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/FrameLayout;

    if-eqz v7, :cond_5

    iget-object v6, p0, LKf;->c:LLf;

    invoke-virtual {v6}, LLf;->d()Ljava/lang/Boolean;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-eqz v6, :cond_3

    move v6, v3

    goto :goto_3

    :cond_3
    const/4 v6, 0x4

    :goto_3
    invoke-virtual {v7, v6}, Landroid/view/View;->setVisibility(I)V

    iget-boolean v6, p0, LKf;->n:Z

    if-eqz v6, :cond_4

    iget-object v6, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->Z:LAf;

    invoke-virtual {v6}, LAf;->d()Lzf;

    move-result-object v6

    goto :goto_4

    :cond_4
    iget-object v6, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->Z:LAf;

    invoke-virtual {v6}, LAf;->c()Lzf;

    move-result-object v6

    :goto_4
    move-object v8, v6

    move v6, v4

    goto :goto_5

    :cond_5
    move-object v8, v2

    :goto_5
    const v9, 0x7f0b00a4

    invoke-virtual {p0, v9}, LKf;->c(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/FrameLayout;

    if-eqz v9, :cond_8

    iget-object v6, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->Z:LAf;

    iget-boolean v10, v6, LAf;->f:Z

    if-eqz v10, :cond_6

    iget-object v10, v6, LAf;->b:LBq;

    iget-object v10, v10, LBq;->b:LK2;

    goto :goto_6

    :cond_6
    iget-object v10, v6, LAf;->b:LBq;

    iget-object v10, v10, LBq;->a:LK2;

    :goto_6
    iget v11, v6, LAf;->e:I

    const/4 v12, -0x1

    if-ne v11, v12, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v10}, LK2;->l()[Lzf;

    move-result-object v2

    iget v6, v6, LAf;->e:I

    aget-object v2, v2, v6

    :goto_7
    move v6, v4

    :cond_8
    if-eqz v6, :cond_10

    const v6, 0x7f01002c

    invoke-static {p0, v6}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v6

    const v10, 0x7f01002d

    invoke-static {p0, v10}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v10

    if-eqz p1, :cond_b

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v11

    if-lez v11, :cond_9

    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v11

    invoke-virtual {v11, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v12

    xor-int/2addr v12, v4

    if-eqz v12, :cond_a

    invoke-virtual {v11, v10}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    invoke-virtual {p1, v11}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    goto :goto_8

    :cond_9
    move v12, v4

    :cond_a
    :goto_8
    if-eqz v5, :cond_b

    if-eqz v12, :cond_b

    invoke-virtual {v5, v6}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    invoke-virtual {p1, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_b
    if-eqz v7, :cond_e

    const-string p1, "1"

    invoke-static {v0, p1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    if-lez p1, :cond_c

    const-string p1, "2"

    invoke-static {v0, p1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v7, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    xor-int/2addr v5, v4

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v5, :cond_d

    invoke-virtual {p1, v10}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    invoke-virtual {v7, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    const-string p1, "3"

    invoke-static {v0, p1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_9

    :cond_c
    move v5, v4

    :cond_d
    :goto_9
    if-eqz v8, :cond_e

    if-eqz v5, :cond_e

    invoke-virtual {v8, v6}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    invoke-virtual {v7, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string p1, "4"

    invoke-static {v0, p1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_e
    if-eqz v9, :cond_10

    invoke-virtual {v9}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    if-lez p1, :cond_f

    invoke-virtual {v9, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/2addr v4, v0

    if-eqz v4, :cond_f

    invoke-virtual {p1, v10}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    invoke-virtual {v9, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_f
    if-eqz v2, :cond_10

    if-eqz v4, :cond_10

    invoke-virtual {v2, v6}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    invoke-virtual {v9, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_b

    :goto_a
    const-string v0, "T500.ERROR"

    const-string v1, "ERROR in displayInfoFragments()"

    invoke-static {v0, v1, p1}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_10
    :goto_b
    return-void
.end method

.method public final y(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;Z)V
    .locals 7

    const/4 v0, 0x1

    const/4 v1, -0x1

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/SpedometerPanel;->C()Landroid/net/Uri;

    move-result-object v3

    if-nez v3, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "android.resource://"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "/2131231058"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    :cond_0
    iget-object v4, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->Y:Ljava/lang/String;

    filled-new-array {v4, p1, p2, v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "Gif.class"

    invoke-static {v4, v3}, LTf;->q(Ljava/lang/String;[Ljava/lang/Object;)LL;

    move-result-object v3

    iget-object v3, v3, LL;->a:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v2, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    const-string v2, "ERROR closing input stream"

    const-string v3, "T500.ACTIVITY"

    iget-object v4, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->Y:Ljava/lang/String;

    const/4 v5, 0x0

    if-eqz v4, :cond_a

    const-string v6, "NONE"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    iget-object v4, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->Y:Ljava/lang/String;

    const-string v6, "BUILD_IN_NONE"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    iget-object v4, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->Y:Ljava/lang/String;

    const-string v6, "BUILD_IN"

    invoke-virtual {v4, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_7

    iget-object v2, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->Y:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_0

    :goto_0
    move v2, v1

    goto :goto_1

    :sswitch_0
    const-string v3, "BUILD_IN_TRANSPARENT"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x4

    goto :goto_1

    :sswitch_1
    const-string v3, "BUILD_IN_NIGHT"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x3

    goto :goto_1

    :sswitch_2
    const-string v3, "BUILD_IN_TRX"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x2

    goto :goto_1

    :sswitch_3
    const-string v3, "BUILD_IN_KIA"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_0

    :cond_4
    move v2, v0

    goto :goto_1

    :sswitch_4
    const-string v3, "BUILD_IN_BRABUS"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_0

    :cond_5
    const/4 v2, 0x0

    :goto_1
    packed-switch v2, :pswitch_data_0

    move v2, v1

    goto :goto_2

    :pswitch_0
    const v2, 0x7f080153

    goto :goto_2

    :pswitch_1
    const v2, 0x7f08012c

    goto :goto_2

    :pswitch_2
    const v2, 0x7f080156

    goto :goto_2

    :pswitch_3
    const v2, 0x7f0800e4

    goto :goto_2

    :pswitch_4
    const v2, 0x7f080087

    :goto_2
    if-ne v2, v1, :cond_6

    goto :goto_7

    :cond_6
    invoke-static {p0, v2}, LH7;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    goto :goto_8

    :cond_7
    iget-object v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->Y:Ljava/lang/String;

    invoke-static {p0, v1}, LUd;->d0(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v4

    if-eqz v4, :cond_a

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v4

    invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v4, v1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v1
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-static {v1, v5}, Landroid/graphics/drawable/Drawable;->createFromStream(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v4
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v1, :cond_8

    :try_start_2
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_3

    :catch_0
    move-exception v1

    invoke-static {v3, v2, v1}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_8
    :goto_3
    move-object v1, v4

    goto :goto_8

    :catchall_0
    move-exception p1

    move-object v5, v1

    goto :goto_5

    :catch_1
    move-exception v4

    goto :goto_4

    :catchall_1
    move-exception p1

    goto :goto_5

    :catch_2
    move-exception v4

    move-object v1, v5

    :goto_4
    :try_start_3
    const-string v6, "ERROR in getBackgroundImage()"

    invoke-static {v3, v6, v4}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v1, :cond_a

    :try_start_4
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_7

    :catch_3
    move-exception v1

    invoke-static {v3, v2, v1}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_7

    :goto_5
    if-eqz v5, :cond_9

    :try_start_5
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    goto :goto_6

    :catch_4
    move-exception p2

    invoke-static {v3, v2, p2}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    :goto_6
    throw p1

    :cond_a
    :goto_7
    move-object v1, v5

    :goto_8
    if-eqz v1, :cond_d

    invoke-static {p2}, Lru/zinovin/tankspeedometer/SpedometerPanel;->B(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object p2

    invoke-static {v1}, Lru/zinovin/tankspeedometer/SpedometerPanel;->B(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v1

    const/16 v2, 0x780

    const/16 v3, 0x2d0

    invoke-static {p2, v2, v3, v0}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object p2

    invoke-static {v1, v2, v3, v0}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object v0

    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v2, v3, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    new-instance v2, Landroid/graphics/Canvas;

    invoke-direct {v2, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v3, v3, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    invoke-virtual {v2, p2, v3, v3, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    if-eqz p3, :cond_c

    iget-boolean p2, p0, LKf;->l:Z

    const/16 p3, 0x258

    const/16 v0, 0x71c

    const/16 v3, 0xc8

    if-eqz p2, :cond_b

    new-instance p2, Landroid/graphics/Rect;

    const/16 v4, 0x58c

    invoke-direct {p2, v4, v3, v0, p3}, Landroid/graphics/Rect;-><init>(IIII)V

    goto :goto_9

    :cond_b
    new-instance p2, Landroid/graphics/Rect;

    const/16 v4, 0x528

    invoke-direct {p2, v4, v3, v0, p3}, Landroid/graphics/Rect;-><init>(IIII)V

    :goto_9
    new-instance p3, Landroid/graphics/Paint;

    invoke-direct {p3}, Landroid/graphics/Paint;-><init>()V

    new-instance v0, Landroid/graphics/PorterDuffXfermode;

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v0, v3}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    invoke-virtual {v2, p2, p3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    :cond_c
    new-instance p2, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    invoke-direct {p2, p3, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_a

    :cond_d
    if-eqz p3, :cond_e

    invoke-virtual {p0, p1, p2}, Lru/zinovin/tankspeedometer/SpedometerPanel;->A(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V

    goto :goto_a

    :cond_e
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_f
    :goto_a
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x51df0188 -> :sswitch_4
        -0x2cb8a466 -> :sswitch_3
        -0x2cb8816f -> :sswitch_2
        0x1f09432f -> :sswitch_1
        0x4d054329 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final z(Z)V
    .locals 8

    const-string v0, "useSysNavi"

    invoke-static {v0}, LTd;->p(Ljava/lang/String;)Z

    move-result v0

    iget-object v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->Y:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    const-string v2, ".gif"

    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    iget-boolean v2, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->c0:Z

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->X:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/SpedometerPanel;->F()Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/4 v4, 0x1

    if-nez p1, :cond_1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move v5, v4

    :goto_1
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->Y:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v5, p0, LKf;->l:Z

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    iget-object v5, p0, LKf;->c:LLf;

    if-eqz v1, :cond_2

    const-string v1, ""

    goto :goto_2

    :cond_2
    invoke-virtual {v5}, LLf;->d()Ljava/lang/Boolean;

    move-result-object v1

    :goto_2
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const v3, 0x7f0b007e

    invoke-virtual {p0, v3}, LKf;->c(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    iget-object v6, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->m0:Ljava/lang/String;

    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const-string p1, "T500.ACTIVITY"

    const-string v0, "backgroundHash equal"

    invoke-static {p1, v0}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    iput-object v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->m0:Ljava/lang/String;

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/SpedometerPanel;->F()Z

    move-result v1

    if-eqz v1, :cond_8

    const p1, 0x7f080153

    if-eqz v2, :cond_7

    invoke-virtual {v5}, LLf;->d()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const v2, 0x7f080148

    if-eqz v1, :cond_5

    if-eqz v0, :cond_4

    move p1, v2

    :cond_4
    invoke-virtual {v3, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto/16 :goto_5

    :cond_5
    if-eqz v0, :cond_6

    move p1, v2

    :cond_6
    invoke-static {p0, p1}, LH7;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, v3, p1}, Lru/zinovin/tankspeedometer/SpedometerPanel;->A(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_5

    :cond_7
    invoke-static {p0, p1}, LH7;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {v5}, LLf;->d()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    xor-int/2addr v0, v4

    invoke-virtual {p0, v3, p1, v0}, Lru/zinovin/tankspeedometer/SpedometerPanel;->y(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;Z)V

    goto :goto_5

    :cond_8
    iget-object v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->b0:Lnp;

    iget-object v1, v1, Lnp;->c:Ljava/lang/Object;

    check-cast v1, Ld2;

    iget-object v1, v1, Ld2;->b:Ljava/lang/Object;

    check-cast v1, LMf;

    iget v1, v1, LMf;->d:I

    invoke-static {v1}, LTf;->z(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v6, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->b0:Lnp;

    iget-object v6, v6, Lnp;->c:Ljava/lang/Object;

    check-cast v6, Ld2;

    iget-object v6, v6, Ld2;->b:Ljava/lang/Object;

    check-cast v6, LMf;

    iget v6, v6, LMf;->e:I

    invoke-static {v6}, LTf;->z(I)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    iget-object v7, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->b0:Lnp;

    iget-object v7, v7, Lnp;->c:Ljava/lang/Object;

    check-cast v7, Ld2;

    iget-object v7, v7, Ld2;->b:Ljava/lang/Object;

    check-cast v7, LMf;

    iget v7, v7, LMf;->f:I

    invoke-static {v7}, LTf;->z(I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    if-eqz v2, :cond_e

    invoke-virtual {v5}, LLf;->d()Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_b

    if-nez p1, :cond_a

    if-eqz v0, :cond_9

    goto :goto_3

    :cond_9
    move-object v6, v7

    :cond_a
    :goto_3
    invoke-virtual {p0, v3, v6}, Lru/zinovin/tankspeedometer/SpedometerPanel;->A(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V

    goto :goto_5

    :cond_b
    if-nez p1, :cond_d

    if-eqz v0, :cond_c

    goto :goto_4

    :cond_c
    move-object v6, v7

    :cond_d
    :goto_4
    invoke-virtual {v3, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_5

    :cond_e
    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/SpedometerPanel;->C()Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_f

    move-object v1, v6

    :cond_f
    invoke-virtual {v5}, LLf;->d()Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    xor-int/2addr p1, v4

    invoke-virtual {p0, v3, v1, p1}, Lru/zinovin/tankspeedometer/SpedometerPanel;->y(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;Z)V

    :goto_5
    return-void
.end method
