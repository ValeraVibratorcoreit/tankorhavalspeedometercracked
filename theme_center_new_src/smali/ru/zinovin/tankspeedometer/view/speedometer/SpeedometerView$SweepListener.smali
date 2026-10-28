.class public final Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView$SweepListener;
.super Ljava/lang/Object;
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;

# instance fields
.field public final target:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

# direct methods
.method public constructor <init>(Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView$SweepListener;->target:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    return-void
.end method

# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 3

    iget-object v0, p0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView$SweepListener;->target:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget v1, v0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->i:F

    iget v2, v0, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->h:F

    sub-float/2addr v1, v2

    mul-float/2addr p1, v1

    add-float/2addr p1, v2

    invoke-virtual {v0, p1}, Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;->c(F)V

    :cond_0
    return-void
.end method
