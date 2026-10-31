.class public final Ls6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:F

.field public b:F

.field public final c:[F

.field public d:[F

.field public e:I


# direct methods
.method public constructor <init>(FF[F)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x3

    new-array v0, v0, [F

    iput-object v0, p0, Ls6;->c:[F

    invoke-virtual {p0, p1, p2, p3}, Ls6;->b(FF[F)V

    return-void
.end method


# virtual methods
.method public final a(F)[F
    .locals 4

    iget-object v0, p0, Ls6;->d:[F

    iget-object v1, p0, Ls6;->c:[F

    if-nez v0, :cond_0

    invoke-virtual {v1}, [F->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    iput-object v0, p0, Ls6;->d:[F

    :cond_0
    iget-object v0, p0, Ls6;->d:[F

    const/4 v2, 0x0

    aget v3, v1, v2

    aput v3, v0, v2

    const/4 v2, 0x1

    aget v1, v1, v2

    aput v1, v0, v2

    const/4 v1, 0x2

    aput p1, v0, v1

    return-object v0
.end method

.method public final b(FF[F)V
    .locals 1

    iput p1, p0, Ls6;->a:F

    iput p2, p0, Ls6;->b:F

    const/4 p1, 0x0

    aget p2, p3, p1

    iget-object v0, p0, Ls6;->c:[F

    aput p2, v0, p1

    const/4 p1, 0x1

    aget p2, p3, p1

    aput p2, v0, p1

    const/4 p1, 0x2

    aget p2, p3, p1

    aput p2, v0, p1

    invoke-static {v0}, Landroid/graphics/Color;->HSVToColor([F)I

    move-result p1

    iput p1, p0, Ls6;->e:I

    return-void
.end method
