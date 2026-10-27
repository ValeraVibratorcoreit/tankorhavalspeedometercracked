.class public final LTh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LYh;Lcom/google/android/material/datepicker/c;I)V
    .locals 0

    .line 1
    iput p3, p0, LTh;->a:I

    iput-object p1, p0, LTh;->c:Ljava/lang/Object;

    iput-object p2, p0, LTh;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lar;)V
    .locals 2

    const/4 v0, 0x2

    iput v0, p0, LTh;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LTh;->c:Ljava/lang/Object;

    .line 3
    new-instance v0, Ld0;

    iget-object v1, p1, Lar;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object p1, p1, Lar;->h:Ljava/lang/CharSequence;

    invoke-direct {v0, v1, p1}, Ld0;-><init>(Landroid/content/Context;Ljava/lang/CharSequence;)V

    iput-object v0, p0, LTh;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget p1, p0, LTh;->a:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, LTh;->c:Ljava/lang/Object;

    check-cast p1, Lar;

    iget-object v0, p1, Lar;->k:Landroid/view/Window$Callback;

    if-eqz v0, :cond_0

    iget-boolean p1, p1, Lar;->l:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iget-object v1, p0, LTh;->b:Ljava/lang/Object;

    check-cast v1, Ld0;

    invoke-interface {v0, p1, v1}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    :cond_0
    return-void

    :pswitch_0
    iget-object p1, p0, LTh;->c:Ljava/lang/Object;

    check-cast p1, LYh;

    iget-object v0, p1, LYh;->a0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()LWl;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v0}, LWl;->v()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;->N0(IIZ)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 v0, -0x1

    goto :goto_0

    :cond_1
    invoke-static {v0}, LWl;->H(Landroid/view/View;)I

    move-result v0

    :goto_0
    add-int/lit8 v0, v0, 0x1

    iget-object v1, p1, LYh;->a0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()LOl;

    move-result-object v1

    invoke-virtual {v1}, LOl;->a()I

    move-result v1

    if-ge v0, v1, :cond_2

    iget-object v1, p0, LTh;->b:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/material/datepicker/c;

    iget-object v1, v1, Lcom/google/android/material/datepicker/c;->c:Lj5;

    iget-object v1, v1, Lj5;->a:Laj;

    iget-object v1, v1, Laj;->a:Ljava/util/Calendar;

    invoke-static {v1}, LNr;->b(Ljava/util/Calendar;)Ljava/util/Calendar;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v1, v2, v0}, Ljava/util/Calendar;->add(II)V

    new-instance v0, Laj;

    invoke-direct {v0, v1}, Laj;-><init>(Ljava/util/Calendar;)V

    invoke-virtual {p1, v0}, LYh;->O(Laj;)V

    :cond_2
    return-void

    :pswitch_1
    iget-object p1, p0, LTh;->c:Ljava/lang/Object;

    check-cast p1, LYh;

    iget-object v0, p1, LYh;->a0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()LWl;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->L0()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_3

    iget-object v1, p0, LTh;->b:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/material/datepicker/c;

    iget-object v1, v1, Lcom/google/android/material/datepicker/c;->c:Lj5;

    iget-object v1, v1, Lj5;->a:Laj;

    iget-object v1, v1, Laj;->a:Ljava/util/Calendar;

    invoke-static {v1}, LNr;->b(Ljava/util/Calendar;)Ljava/util/Calendar;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v1, v2, v0}, Ljava/util/Calendar;->add(II)V

    new-instance v0, Laj;

    invoke-direct {v0, v1}, Laj;-><init>(Ljava/util/Calendar;)V

    invoke-virtual {p1, v0}, LYh;->O(Laj;)V

    :cond_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
