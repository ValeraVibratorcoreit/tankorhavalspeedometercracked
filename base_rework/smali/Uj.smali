.class public final LUj;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LUj;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LUj;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LUj;->a:LUj;

    return-void
.end method


# virtual methods
.method public final a(Ldd;)Landroid/window/OnBackInvokedCallback;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldd;",
            ")",
            "Landroid/window/OnBackInvokedCallback;"
        }
    .end annotation

    const-string v0, "onBackInvoked"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v0, LK1;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, LK1;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method

.method public final b(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 1

    const-string v0, "dispatcher"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "callback"

    invoke-static {v0, p3}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Landroid/window/OnBackInvokedDispatcher;

    check-cast p3, Landroid/window/OnBackInvokedCallback;

    invoke-interface {p1, p2, p3}, Landroid/window/OnBackInvokedDispatcher;->registerOnBackInvokedCallback(ILandroid/window/OnBackInvokedCallback;)V

    return-void
.end method

.method public final c(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "dispatcher"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "callback"

    invoke-static {v0, p2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, Landroid/window/OnBackInvokedDispatcher;

    check-cast p2, Landroid/window/OnBackInvokedCallback;

    invoke-interface {p1, p2}, Landroid/window/OnBackInvokedDispatcher;->unregisterOnBackInvokedCallback(Landroid/window/OnBackInvokedCallback;)V

    return-void
.end method
