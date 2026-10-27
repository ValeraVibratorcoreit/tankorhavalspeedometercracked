.class public final Lus;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# instance fields
.field public a:LVt;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:LRj;


# direct methods
.method public constructor <init>(Landroid/view/View;LRj;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lus;->b:Landroid/view/View;

    iput-object p2, p0, Lus;->c:LRj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lus;->a:LVt;

    return-void
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 5

    invoke-static {p1, p2}, LVt;->g(Landroid/view/View;Landroid/view/WindowInsets;)LVt;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    iget-object v2, p0, Lus;->c:LRj;

    const/16 v3, 0x1e

    if-ge v1, v3, :cond_0

    iget-object v4, p0, Lus;->b:Landroid/view/View;

    invoke-static {p2, v4}, Lvs;->a(Landroid/view/WindowInsets;Landroid/view/View;)V

    iget-object p2, p0, Lus;->a:LVt;

    invoke-virtual {v0, p2}, LVt;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {v2, p1, v0}, LRj;->h(Landroid/view/View;LVt;)LVt;

    move-result-object p1

    invoke-virtual {p1}, LVt;->f()Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1

    :cond_0
    iput-object v0, p0, Lus;->a:LVt;

    invoke-interface {v2, p1, v0}, LRj;->h(Landroid/view/View;LVt;)LVt;

    move-result-object p2

    if-lt v1, v3, :cond_1

    invoke-virtual {p2}, LVt;->f()Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1

    :cond_1
    sget-object v0, LGs;->a:Ljava/util/WeakHashMap;

    invoke-static {p1}, Lts;->c(Landroid/view/View;)V

    invoke-virtual {p2}, LVt;->f()Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1
.end method
