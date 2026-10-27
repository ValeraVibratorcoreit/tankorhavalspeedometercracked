.class public final LDc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic a:LVc;

.field public final synthetic b:LEc;


# direct methods
.method public constructor <init>(LEc;LVc;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDc;->b:LEc;

    iput-object p2, p0, LDc;->a:LVc;

    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, LDc;->a:LVc;

    iget-object v0, p1, LVc;->c:Lzc;

    invoke-virtual {p1}, LVc;->k()V

    iget-object p1, v0, Lzc;->E:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iget-object v0, p0, LDc;->b:LEc;

    iget-object v0, v0, LEc;->a:LOc;

    invoke-virtual {v0}, LOc;->E()Lh8;

    move-result-object v0

    invoke-static {p1, v0}, LO8;->f(Landroid/view/ViewGroup;Lh8;)LO8;

    move-result-object p1

    invoke-virtual {p1}, LO8;->e()V

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method
