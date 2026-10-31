.class public final Lx5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lx5;->a:I

    iput-object p1, p0, Lx5;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method private final b(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method private final c(Landroid/view/View;)V
    .locals 0

    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lx5;->b:Ljava/lang/Object;

    iget v0, p0, Lx5;->a:I

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    check-cast p1, Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    sget-object v0, LGs;->a:Ljava/util/WeakHashMap;

    invoke-static {p1}, Lts;->c(Landroid/view/View;)V

    return-void

    :pswitch_1
    check-cast p1, Lcb;

    iget-object v0, p1, Lcb;->u:Ld4;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcb;->t:Landroid/view/accessibility/AccessibilityManager;

    if-eqz v0, :cond_0

    sget-object v1, LGs;->a:Ljava/util/WeakHashMap;

    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object p1, p1, Lcb;->u:Ld4;

    new-instance v1, Lz;

    invoke-direct {v1, p1}, Lz;-><init>(Ld4;)V

    invoke-virtual {v0, v1}, Landroid/view/accessibility/AccessibilityManager;->addTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    :cond_0
    :pswitch_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 2

    iget v0, p0, Lx5;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lx5;->b:Ljava/lang/Object;

    check-cast v0, Ltp;

    iget-object v1, v0, Ltp;->p:Landroid/view/ViewTreeObserver;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    iput-object v1, v0, Ltp;->p:Landroid/view/ViewTreeObserver;

    :cond_0
    iget-object v1, v0, Ltp;->p:Landroid/view/ViewTreeObserver;

    iget-object v0, v0, Ltp;->j:Lk2;

    invoke-virtual {v1, v0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_1
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    :pswitch_0
    return-void

    :pswitch_1
    iget-object p1, p0, Lx5;->b:Ljava/lang/Object;

    check-cast p1, Lcb;

    iget-object v0, p1, Lcb;->u:Ld4;

    if-eqz v0, :cond_2

    iget-object p1, p1, Lcb;->t:Landroid/view/accessibility/AccessibilityManager;

    if-eqz p1, :cond_2

    new-instance v1, Lz;

    invoke-direct {v1, v0}, Lz;-><init>(Ld4;)V

    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityManager;->removeTouchExplorationStateChangeListener(Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;)Z

    :cond_2
    return-void

    :pswitch_2
    iget-object v0, p0, Lx5;->b:Ljava/lang/Object;

    check-cast v0, LA5;

    iget-object v1, v0, LA5;->y:Landroid/view/ViewTreeObserver;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    iput-object v1, v0, LA5;->y:Landroid/view/ViewTreeObserver;

    :cond_3
    iget-object v1, v0, LA5;->y:Landroid/view/ViewTreeObserver;

    iget-object v0, v0, LA5;->j:Lk2;

    invoke-virtual {v1, v0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :cond_4
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
