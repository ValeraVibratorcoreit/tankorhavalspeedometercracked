.class public final LMd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgq;


# instance fields
.field public final a:I

.field public final b:I

.field public c:Lxm;

.field public final d:Landroid/os/Handler;

.field public final e:I

.field public final f:J

.field public g:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>(Landroid/os/Handler;IJ)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, -0x80000000

    invoke-static {v0, v0}, LQr;->i(II)Z

    move-result v1

    if-eqz v1, :cond_0

    iput v0, p0, LMd;->a:I

    iput v0, p0, LMd;->b:I

    iput-object p1, p0, LMd;->d:Landroid/os/Handler;

    iput p2, p0, LMd;->e:I

    iput-wide p3, p0, LMd;->f:J

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a(LQo;)V
    .locals 2

    check-cast p1, LHo;

    iget v0, p0, LMd;->a:I

    iget v1, p0, LMd;->b:I

    invoke-virtual {p1, v0, v1}, LHo;->m(II)V

    return-void
.end method

.method public final b(Lxm;)V
    .locals 0

    iput-object p1, p0, LMd;->c:Lxm;

    return-void
.end method

.method public final c(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    return-void
.end method

.method public final d(LQo;)V
    .locals 0

    return-void
.end method

.method public final e(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    return-void
.end method

.method public final f()V
    .locals 0

    return-void
.end method

.method public final g()Lxm;
    .locals 1

    iget-object v0, p0, LMd;->c:Lxm;

    return-object v0
.end method

.method public final h(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    const/4 p1, 0x0

    iput-object p1, p0, LMd;->g:Landroid/graphics/Bitmap;

    return-void
.end method

.method public final i(Ljava/lang/Object;)V
    .locals 3

    check-cast p1, Landroid/graphics/Bitmap;

    iput-object p1, p0, LMd;->g:Landroid/graphics/Bitmap;

    const/4 p1, 0x1

    iget-object v0, p0, LMd;->d:Landroid/os/Handler;

    invoke-virtual {v0, p1, p0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    iget-wide v1, p0, LMd;->f:J

    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->sendMessageAtTime(Landroid/os/Message;J)Z

    return-void
.end method

.method public final j()V
    .locals 0

    return-void
.end method

.method public final k()V
    .locals 0

    return-void
.end method
