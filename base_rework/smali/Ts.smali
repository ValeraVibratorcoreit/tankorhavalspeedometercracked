.class public abstract LTs;
.super LL7;
.source "SourceFile"


# instance fields
.field public a:LBd;

.field public b:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, LTs;->b:I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 4
    iput p1, p0, LTs;->b:I

    return-void
.end method


# virtual methods
.method public g(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)Z
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LTs;->r(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)V

    iget-object p1, p0, LTs;->a:LBd;

    if-nez p1, :cond_0

    new-instance p1, LBd;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p2, p1, LBd;->d:Ljava/lang/Object;

    iput-object p1, p0, LTs;->a:LBd;

    :cond_0
    iget-object p1, p0, LTs;->a:LBd;

    iget-object p2, p1, LBd;->d:Ljava/lang/Object;

    check-cast p2, Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result p3

    iput p3, p1, LBd;->a:I

    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result p2

    iput p2, p1, LBd;->b:I

    iget-object p1, p0, LTs;->a:LBd;

    invoke-virtual {p1}, LBd;->b()V

    iget p1, p0, LTs;->b:I

    if-eqz p1, :cond_2

    iget-object p2, p0, LTs;->a:LBd;

    iget p3, p2, LBd;->c:I

    if-eq p3, p1, :cond_1

    iput p1, p2, LBd;->c:I

    invoke-virtual {p2}, LBd;->b()V

    :cond_1
    const/4 p1, 0x0

    iput p1, p0, LTs;->b:I

    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method public r(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)V
    .locals 0

    invoke-virtual {p1, p2, p3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->q(Landroid/view/View;I)V

    return-void
.end method
