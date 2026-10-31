.class public final synthetic LI6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzg;


# instance fields
.field public final synthetic a:Lak;

.field public final synthetic b:LP6;


# direct methods
.method public synthetic constructor <init>(Lak;LP6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI6;->a:Lak;

    iput-object p2, p0, LI6;->b:LP6;

    return-void
.end method


# virtual methods
.method public final n(LDg;Ltg;)V
    .locals 2

    iget-object p1, p0, LI6;->a:Lak;

    const-string v0, "$dispatcher"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, LI6;->b:LP6;

    const-string v1, "this$0"

    invoke-static {v1, v0}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v1, Ltg;->ON_CREATE:Ltg;

    if-ne p2, v1, :cond_0

    sget-object p2, LJ6;->a:LJ6;

    invoke-virtual {p2, v0}, LJ6;->a(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;

    move-result-object p2

    const-string v0, "invoker"

    invoke-static {v0, p2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p2, p1, Lak;->e:Landroid/window/OnBackInvokedDispatcher;

    iget-boolean p2, p1, Lak;->g:Z

    invoke-virtual {p1, p2}, Lak;->c(Z)V

    :cond_0
    return-void
.end method
