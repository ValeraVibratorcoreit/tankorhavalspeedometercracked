.class public final Lk0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKi;
.implements Lri;
.implements Lxi;
.implements LB7;
.implements LD7;
.implements LRj;
.implements LYi;
.implements Lw8;
.implements LMj;
.implements LHb;
.implements Le8;
.implements LOh;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    iput p1, p0, Lk0;->a:I

    sparse-switch p1, :sswitch_data_0

    .line 12
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 13
    const-string v0, "timeUnit"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    .line 14
    new-instance v0, LHl;

    .line 15
    sget-object v1, Lkq;->h:Lkq;

    .line 16
    invoke-direct {v0, v1, p1}, LHl;-><init>(Lkq;Ljava/util/concurrent/TimeUnit;)V

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lk0;->b:Ljava/lang/Object;

    return-void

    .line 18
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance p1, LMf;

    .line 20
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lk0;->b:Ljava/lang/Object;

    return-void

    .line 22
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    new-instance p1, LVi;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, LVi;-><init>(I)V

    iput-object p1, p0, Lk0;->b:Ljava/lang/Object;

    return-void

    .line 24
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance p1, Lh8;

    const/4 v0, 0x0

    .line 26
    invoke-direct {p1, v0}, Lh8;-><init>(I)V

    .line 27
    iput-object p1, p0, Lk0;->b:Ljava/lang/Object;

    return-void

    :sswitch_data_0
    .sparse-switch
        0x9 -> :sswitch_2
        0x13 -> :sswitch_1
        0x17 -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(Landroid/content/ClipData;I)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Lk0;->a:I

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    invoke-static {p1, p2}, Lz4;->e(Landroid/content/ClipData;I)Landroid/view/ContentInfo$Builder;

    move-result-object p1

    iput-object p1, p0, Lk0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/16 v0, 0x18

    iput v0, p0, Lk0;->a:I

    .line 9
    new-instance v0, Ld2;

    const/16 v1, 0x16

    invoke-direct {v0, p1, v1}, Ld2;-><init>(Landroid/content/Context;I)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object v0, p0, Lk0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/ContentInfo;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Lk0;->a:I

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    invoke-static {p1}, Lz4;->g(Ljava/lang/Object;)Landroid/view/ContentInfo;

    move-result-object p1

    iput-object p1, p0, Lk0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/widget/EditText;)V
    .locals 2

    const/16 v0, 0xd

    iput v0, p0, Lk0;->a:I

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    const-string v0, "editText cannot be null"

    invoke-static {v0, p1}, LTf;->h(Ljava/lang/String;Ljava/lang/Object;)V

    .line 33
    new-instance v0, Ld2;

    const/16 v1, 0xd

    invoke-direct {v0, p1, v1}, Ld2;-><init>(Landroid/widget/EditText;I)V

    iput-object v0, p0, Lk0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    const/16 v0, 0xe

    iput v0, p0, Lk0;->a:I

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    const-string v0, "textView cannot be null"

    invoke-static {v0, p1}, LTf;->h(Ljava/lang/String;Ljava/lang/Object;)V

    .line 30
    new-instance v0, LMa;

    invoke-direct {v0, p1}, LMa;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Lk0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lf8;)V
    .locals 1

    const/16 v0, 0x12

    iput v0, p0, Lk0;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    new-instance v0, Ljava/util/HashMap;

    .line 7
    iget-object p1, p1, Lf8;->a:Ljava/util/HashMap;

    .line 8
    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lk0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/io/InputStream;Luh;)V
    .locals 1

    const/16 v0, 0x16

    iput v0, p0, Lk0;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, LLl;

    invoke-direct {v0, p1, p2}, LLl;-><init>(Ljava/io/InputStream;Luh;)V

    iput-object v0, p0, Lk0;->b:Ljava/lang/Object;

    const/high16 p1, 0x500000

    .line 4
    invoke-virtual {v0, p1}, LLl;->mark(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    const/16 v0, 0x14

    iput v0, p0, Lk0;->a:I

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    check-cast p1, Landroid/view/inputmethod/InputContentInfo;

    iput-object p1, p0, Lk0;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lk0;->a:I

    iput-object p1, p0, Lk0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(J)J
    .locals 8

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-gez v2, :cond_0

    return-wide v0

    :cond_0
    move-wide v2, p1

    :goto_0
    cmp-long v4, v2, v0

    if-lez v4, :cond_3

    iget-object v4, p0, Lk0;->b:Ljava/lang/Object;

    check-cast v4, Ljava/io/InputStream;

    invoke-virtual {v4, v2, v3}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v5

    cmp-long v7, v5, v0

    if-lez v7, :cond_1

    sub-long/2addr v2, v5

    goto :goto_0

    :cond_1
    invoke-virtual {v4}, Ljava/io/InputStream;->read()I

    move-result v4

    const/4 v5, -0x1

    if-ne v4, v5, :cond_2

    goto :goto_1

    :cond_2
    const-wide/16 v4, 0x1

    sub-long/2addr v2, v4

    goto :goto_0

    :cond_3
    :goto_1
    sub-long/2addr p1, v2

    return-wide p1
.end method

.method public b(Lti;Z)V
    .locals 2

    instance-of v0, p1, LNp;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LNp;

    iget-object v0, v0, LNp;->z:Lti;

    invoke-virtual {v0}, Lti;->k()Lti;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lti;->c(Z)V

    :cond_0
    iget-object v0, p0, Lk0;->b:Ljava/lang/Object;

    check-cast v0, Ll0;

    iget-object v0, v0, Ll0;->e:LKi;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2}, LKi;->b(Lti;Z)V

    :cond_1
    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lk0;->b:Ljava/lang/Object;

    check-cast v0, LLl;

    invoke-virtual {v0}, LLl;->w()V

    return-void
.end method

.method public d()I
    .locals 2

    invoke-virtual {p0}, Lk0;->r()S

    move-result v0

    shl-int/lit8 v0, v0, 0x8

    invoke-virtual {p0}, Lk0;->r()S

    move-result v1

    or-int/2addr v0, v1

    return v0
.end method

.method public e()Landroid/content/ClipData;
    .locals 1

    iget-object v0, p0, Lk0;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/ContentInfo;

    invoke-static {v0}, Lz4;->d(Landroid/view/ContentInfo;)Landroid/content/ClipData;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lk0;->b:Ljava/lang/Object;

    check-cast v0, LLl;

    invoke-virtual {v0}, LLl;->reset()V

    return-object v0
.end method

.method public g()LE7;
    .locals 3

    new-instance v0, LE7;

    new-instance v1, Lk0;

    iget-object v2, p0, Lk0;->b:Ljava/lang/Object;

    check-cast v2, Landroid/view/ContentInfo$Builder;

    invoke-static {v2}, Lz4;->f(Landroid/view/ContentInfo$Builder;)Landroid/view/ContentInfo;

    move-result-object v2

    invoke-direct {v1, v2}, Lk0;-><init>(Landroid/view/ContentInfo;)V

    invoke-direct {v0, v1}, LE7;-><init>(LD7;)V

    return-object v0
.end method

.method public h(Landroid/view/View;LVt;)LVt;
    .locals 6

    const/4 p1, 0x1

    iget-object v0, p0, Lk0;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    iget-object v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->n:LVt;

    invoke-static {v1, p2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    iput-object p2, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->n:LVt;

    invoke-virtual {p2}, LVt;->d()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_0

    move v1, p1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    iput-boolean v1, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->o:Z

    if-nez v1, :cond_1

    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_1

    move v1, p1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setWillNotDraw(Z)V

    iget-object v1, p2, LVt;->a:LTt;

    invoke-virtual {v1}, LTt;->m()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    :goto_2
    if-ge v2, v3, :cond_4

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    sget-object v5, LGs;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v4}, Landroid/view/View;->getFitsSystemWindows()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, LO7;

    iget-object v4, v4, LO7;->a:LL7;

    if-eqz v4, :cond_3

    invoke-virtual {v1}, LTt;->m()Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_3

    :cond_3
    add-int/2addr v2, p1

    goto :goto_2

    :cond_4
    :goto_3
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    :cond_5
    return-object p2
.end method

.method public i()I
    .locals 1

    iget-object v0, p0, Lk0;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/ContentInfo;

    invoke-static {v0}, Lz4;->b(Landroid/view/ContentInfo;)I

    move-result v0

    return v0
.end method

.method public j()Landroid/view/ContentInfo;
    .locals 1

    iget-object v0, p0, Lk0;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/ContentInfo;

    return-object v0
.end method

.method public k(Lti;)V
    .locals 1

    iget-object v0, p0, Lk0;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/appcompat/widget/ActionMenuView;

    iget-object v0, v0, Landroidx/appcompat/widget/ActionMenuView;->v:Lri;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lri;->k(Lti;)V

    :cond_0
    return-void
.end method

.method public l(Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lk0;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/ContentInfo$Builder;

    invoke-static {v0, p1}, Lz4;->l(Landroid/view/ContentInfo$Builder;Landroid/os/Bundle;)V

    return-void
.end method

.method public m(Landroid/net/Uri;)V
    .locals 1

    iget-object v0, p0, Lk0;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/ContentInfo$Builder;

    invoke-static {v0, p1}, Lz4;->k(Landroid/view/ContentInfo$Builder;Landroid/net/Uri;)V

    return-void
.end method

.method public n(Lti;Landroid/view/MenuItem;)Z
    .locals 4

    iget-object p1, p0, Lk0;->b:Ljava/lang/Object;

    check-cast p1, Landroidx/appcompat/widget/ActionMenuView;

    iget-object p1, p1, Landroidx/appcompat/widget/ActionMenuView;->A:Lo0;

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    check-cast p1, LRq;

    iget-object p1, p1, LRq;->a:Landroidx/appcompat/widget/Toolbar;

    iget-object v1, p1, Landroidx/appcompat/widget/Toolbar;->G:LK2;

    iget-object v1, v1, LK2;->d:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LIc;

    iget-object v2, v2, LIc;->a:LOc;

    invoke-virtual {v2}, LOc;->o()Z

    move-result v2

    if-eqz v2, :cond_0

    move v1, v3

    goto :goto_0

    :cond_1
    move v1, v0

    :goto_0
    if-eqz v1, :cond_2

    move p1, v3

    goto :goto_1

    :cond_2
    iget-object p1, p1, Landroidx/appcompat/widget/Toolbar;->I:LVq;

    if-eqz p1, :cond_3

    check-cast p1, LXq;

    iget-object p1, p1, LXq;->a:LYq;

    iget-object p1, p1, LYq;->k:Landroid/view/Window$Callback;

    invoke-interface {p1, v0, p2}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result p1

    goto :goto_1

    :cond_3
    move p1, v0

    :goto_1
    if-eqz p1, :cond_4

    move v0, v3

    :cond_4
    return v0
.end method

.method public o(Ljj;)LXi;
    .locals 2

    iget p1, p0, Lk0;->a:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ldf;

    iget-object v0, p0, Lk0;->b:Ljava/lang/Object;

    check-cast v0, LVi;

    invoke-direct {p1, v0}, Ldf;-><init>(LVi;)V

    return-object p1

    :pswitch_0
    new-instance p1, LT4;

    iget-object v0, p0, Lk0;->b:Ljava/lang/Object;

    check-cast v0, Lh8;

    const/4 v1, 0x1

    invoke-direct {p1, v0, v1}, LT4;-><init>(Ljava/lang/Object;I)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
    .end packed-switch
.end method

.method public p()I
    .locals 1

    iget-object v0, p0, Lk0;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/ContentInfo;

    invoke-static {v0}, Lz4;->m(Landroid/view/ContentInfo;)I

    move-result v0

    return v0
.end method

.method public q([BI)I
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/4 v2, -0x1

    if-ge v0, p2, :cond_0

    iget-object v1, p0, Lk0;->b:Ljava/lang/Object;

    check-cast v1, Ljava/io/InputStream;

    sub-int v3, p2, v0

    invoke-virtual {v1, p1, v0, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v1

    if-eq v1, v2, :cond_0

    add-int/2addr v0, v1

    goto :goto_0

    :cond_0
    if-nez v0, :cond_2

    if-eq v1, v2, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Lv8;

    invoke-direct {p1}, Lv8;-><init>()V

    throw p1

    :cond_2
    :goto_1
    return v0
.end method

.method public r()S
    .locals 2

    iget-object v0, p0, Lk0;->b:Ljava/lang/Object;

    check-cast v0, Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    int-to-short v0, v0

    return v0

    :cond_0
    new-instance v0, Lv8;

    invoke-direct {v0}, Lv8;-><init>()V

    throw v0
.end method

.method public s()Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lk0;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljb;

    iget-object v1, p0, Lk0;->b:Ljava/lang/Object;

    check-cast v1, Leb;

    iget-object v2, v1, Leb;->a:LZd;

    iget-object v6, v1, Leb;->e:Lkb;

    iget-object v7, v1, Leb;->f:Lmb;

    iget-object v3, v1, Leb;->b:LZd;

    iget-object v4, v1, Leb;->c:LZd;

    iget-object v5, v1, Leb;->d:LZd;

    iget-object v8, v1, Leb;->g:LK2;

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Ljb;-><init>(LZd;LZd;LZd;LZd;Lkb;Lmb;LK2;)V

    return-object v0

    :pswitch_0
    new-instance v0, Lp8;

    iget-object v1, p0, Lk0;->b:Ljava/lang/Object;

    check-cast v1, LZ1;

    iget-object v2, v1, LZ1;->c:Ljava/lang/Object;

    check-cast v2, LG7;

    iget-object v1, v1, LZ1;->d:Ljava/lang/Object;

    check-cast v1, LK2;

    invoke-direct {v0, v2, v1}, Lp8;-><init>(LG7;LK2;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_0
    .end packed-switch
.end method

.method public t(Lti;Lyi;)V
    .locals 0

    iget-object p2, p0, Lk0;->b:Ljava/lang/Object;

    check-cast p2, LA5;

    iget-object p2, p2, LA5;->g:Landroid/os/Handler;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lk0;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ContentInfoCompat{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lk0;->b:Ljava/lang/Object;

    check-cast v1, Landroid/view/ContentInfo;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_0
    .end packed-switch
.end method

.method public u(Lti;)Z
    .locals 3

    iget-object v0, p0, Lk0;->b:Ljava/lang/Object;

    check-cast v0, Ll0;

    iget-object v1, v0, Ll0;->c:Lti;

    const/4 v2, 0x0

    if-ne p1, v1, :cond_0

    return v2

    :cond_0
    move-object v1, p1

    check-cast v1, LNp;

    iget-object v1, v1, LNp;->A:Lyi;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Ll0;->e:LKi;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, LKi;->u(Lti;)Z

    move-result v2

    :cond_1
    return v2
.end method

.method public v(Lti;Lyi;)V
    .locals 7

    iget-object v0, p0, Lk0;->b:Ljava/lang/Object;

    check-cast v0, LA5;

    iget-object v1, v0, LA5;->g:Landroid/os/Handler;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v1, v0, LA5;->i:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    const/4 v5, -0x1

    if-ge v4, v3, :cond_1

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lz5;

    iget-object v6, v6, Lz5;->b:Lti;

    if-ne p1, v6, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    move v4, v5

    :goto_1
    if-ne v4, v5, :cond_2

    return-void

    :cond_2
    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v4, v3, :cond_3

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lz5;

    :cond_3
    new-instance v1, Ly5;

    invoke-direct {v1, p0, v2, p2, p1}, Ly5;-><init>(Lk0;Lz5;Lyi;Lti;)V

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    const-wide/16 v4, 0xc8

    add-long/2addr v2, v4

    iget-object p2, v0, LA5;->g:Landroid/os/Handler;

    invoke-virtual {p2, v1, p1, v2, v3}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    return-void
.end method

.method public w(Ljava/lang/Object;)V
    .locals 4

    check-cast p1, LDg;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lk0;->b:Ljava/lang/Object;

    check-cast p1, Le9;

    iget-boolean v0, p1, Le9;->a0:Z

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lzc;->J()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-nez v1, :cond_1

    iget-object v1, p1, Le9;->e0:Landroid/app/Dialog;

    if-eqz v1, :cond_2

    const-string v1, "FragmentManager"

    const/4 v2, 0x3

    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "DialogFragment "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " setting the content view on "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p1, Le9;->e0:Landroid/app/Dialog;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-object p1, p1, Le9;->e0:Landroid/app/Dialog;

    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "DialogFragment can not be attached to a container view"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    return-void
.end method

.method public x(I)V
    .locals 1

    iget-object v0, p0, Lk0;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/ContentInfo$Builder;

    invoke-static {v0, p1}, Lz4;->j(Landroid/view/ContentInfo$Builder;I)V

    return-void
.end method

.method public y()V
    .locals 1

    iget-object v0, p0, Lk0;->b:Ljava/lang/Object;

    check-cast v0, LBc;

    iget-object v0, v0, LBc;->m:LOc;

    invoke-virtual {v0}, LOc;->L()V

    return-void
.end method

.method public z()V
    .locals 1

    iget-object v0, p0, Lk0;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/inputmethod/InputContentInfo;

    invoke-virtual {v0}, Landroid/view/inputmethod/InputContentInfo;->requestPermission()V

    return-void
.end method
