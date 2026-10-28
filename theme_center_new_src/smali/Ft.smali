.class public final LFt;
.super Landroid/view/WindowInsetsAnimation$Callback;
.source "SourceFile"


# instance fields
.field public final a:LC7;

.field public b:Ljava/util/List;

.field public c:Ljava/util/ArrayList;

.field public final d:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(LC7;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroid/view/WindowInsetsAnimation$Callback;-><init>(I)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LFt;->d:Ljava/util/HashMap;

    iput-object p1, p0, LFt;->a:LC7;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/WindowInsetsAnimation;)LIt;
    .locals 5

    iget-object v0, p0, LFt;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LIt;

    if-nez v0, :cond_1

    new-instance v0, LIt;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, LIt;-><init>(ILandroid/view/animation/Interpolator;J)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-lt v1, v2, :cond_0

    new-instance v1, LGt;

    invoke-direct {v1, p1}, LGt;-><init>(Landroid/view/WindowInsetsAnimation;)V

    iput-object v1, v0, LIt;->a:LHt;

    :cond_0
    iget-object v1, p0, LFt;->d:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public final onEnd(Landroid/view/WindowInsetsAnimation;)V
    .locals 2

    iget-object v0, p0, LFt;->a:LC7;

    invoke-virtual {p0, p1}, LFt;->a(Landroid/view/WindowInsetsAnimation;)LIt;

    iget-object v0, v0, LC7;->e:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationY(F)V

    iget-object v0, p0, LFt;->d:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final onPrepare(Landroid/view/WindowInsetsAnimation;)V
    .locals 2

    iget-object v0, p0, LFt;->a:LC7;

    invoke-virtual {p0, p1}, LFt;->a(Landroid/view/WindowInsetsAnimation;)LIt;

    iget-object p1, v0, LC7;->e:Ljava/lang/Object;

    check-cast p1, Landroid/view/View;

    iget-object v1, v0, LC7;->f:Ljava/lang/Cloneable;

    check-cast v1, [I

    invoke-virtual {p1, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 p1, 0x1

    aget p1, v1, p1

    iput p1, v0, LC7;->c:I

    return-void
.end method

.method public final onProgress(Landroid/view/WindowInsets;Ljava/util/List;)Landroid/view/WindowInsets;
    .locals 4

    iget-object v0, p0, LFt;->c:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, LFt;->c:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LFt;->b:Ljava/util/List;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_1
    if-ltz v0, :cond_1

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, LB;->j(Ljava/lang/Object;)Landroid/view/WindowInsetsAnimation;

    move-result-object v1

    invoke-virtual {p0, v1}, LFt;->a(Landroid/view/WindowInsetsAnimation;)LIt;

    move-result-object v2

    invoke-static {v1}, LB;->u(Landroid/view/WindowInsetsAnimation;)F

    move-result v1

    iget-object v3, v2, LIt;->a:LHt;

    invoke-virtual {v3, v1}, LHt;->d(F)V

    iget-object v1, p0, LFt;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_1
    iget-object p2, p0, LFt;->a:LC7;

    const/4 v0, 0x0

    invoke-static {v0, p1}, LVt;->g(Landroid/view/View;Landroid/view/WindowInsets;)LVt;

    move-result-object p1

    iget-object v0, p0, LFt;->b:Ljava/util/List;

    invoke-virtual {p2, p1, v0}, LC7;->a(LVt;Ljava/util/List;)V

    invoke-virtual {p1}, LVt;->f()Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1
.end method

.method public final onStart(Landroid/view/WindowInsetsAnimation;Landroid/view/WindowInsetsAnimation$Bounds;)Landroid/view/WindowInsetsAnimation$Bounds;
    .locals 4

    iget-object v0, p0, LFt;->a:LC7;

    invoke-virtual {p0, p1}, LFt;->a(Landroid/view/WindowInsetsAnimation;)LIt;

    invoke-static {p2}, LB;->w(Landroid/view/WindowInsetsAnimation$Bounds;)Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {p1}, LHf;->c(Landroid/graphics/Insets;)LHf;

    move-result-object p1

    invoke-static {p2}, LB;->f(Landroid/view/WindowInsetsAnimation$Bounds;)Landroid/graphics/Insets;

    move-result-object p2

    invoke-static {p2}, LHf;->c(Landroid/graphics/Insets;)LHf;

    move-result-object p2

    iget-object v1, v0, LC7;->e:Ljava/lang/Object;

    check-cast v1, Landroid/view/View;

    iget-object v2, v0, LC7;->f:Ljava/lang/Cloneable;

    check-cast v2, [I

    invoke-virtual {v1, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 v3, 0x1

    aget v2, v2, v3

    iget v3, v0, LC7;->c:I

    sub-int/2addr v3, v2

    iput v3, v0, LC7;->d:I

    int-to-float v0, v3

    invoke-virtual {v1, v0}, Landroid/view/View;->setTranslationY(F)V

    invoke-static {}, LB;->n()V

    invoke-virtual {p1}, LHf;->d()Landroid/graphics/Insets;

    move-result-object p1

    invoke-virtual {p2}, LHf;->d()Landroid/graphics/Insets;

    move-result-object p2

    invoke-static {p1, p2}, LB;->h(Landroid/graphics/Insets;Landroid/graphics/Insets;)Landroid/view/WindowInsetsAnimation$Bounds;

    move-result-object p1

    return-object p1
.end method
