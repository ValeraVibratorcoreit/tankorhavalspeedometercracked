.class public final LWn;
.super LSn;
.source "SourceFile"


# instance fields
.field public final g:Lle;

.field public h:LVn;

.field public i:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    invoke-direct {p0, p1}, LSn;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, LWn;->i:Z

    new-instance v0, Lle;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lle;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, LWn;->g:Lle;

    invoke-virtual {v0, p1}, Landroid/view/View;->setClickable(Z)V

    iget-object v0, p0, LWn;->g:Lle;

    invoke-virtual {v0, p1}, Landroid/view/View;->setFocusable(Z)V

    iget-object p1, p0, LSn;->d:Landroid/widget/FrameLayout;

    iget-object v0, p0, LWn;->g:Lle;

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v2, -0x2

    invoke-direct {v1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p1, v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p0, LWn;->g:Lle;

    new-instance v0, Ld4;

    const/16 v1, 0x8

    invoke-direct {v0, p0, v1}, Ld4;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Lle;->setOnCheckedChange(Lke;)V

    new-instance p1, Lc6;

    const/16 v0, 0x9

    invoke-direct {p1, p0, v0}, Lc6;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method public setChecked(Z)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LWn;->i:Z

    iget-object v0, p0, LWn;->g:Lle;

    invoke-virtual {v0, p1}, Lle;->setChecked(Z)V

    const/4 p1, 0x0

    iput-boolean p1, p0, LWn;->i:Z

    return-void
.end method

.method public setOnCheckedChange(LVn;)V
    .locals 0

    iput-object p1, p0, LWn;->h:LVn;

    return-void
.end method
