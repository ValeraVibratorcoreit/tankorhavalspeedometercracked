.class public final Ly5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lz5;

.field public final synthetic b:Landroid/view/MenuItem;

.field public final synthetic c:Lti;

.field public final synthetic d:Lk0;


# direct methods
.method public constructor <init>(Lk0;Lz5;Lyi;Lti;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly5;->d:Lk0;

    iput-object p2, p0, Ly5;->a:Lz5;

    iput-object p3, p0, Ly5;->b:Landroid/view/MenuItem;

    iput-object p4, p0, Ly5;->c:Lti;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Ly5;->a:Lz5;

    if-eqz v0, :cond_0

    iget-object v1, p0, Ly5;->d:Lk0;

    iget-object v2, v1, Lk0;->b:Ljava/lang/Object;

    check-cast v2, LA5;

    const/4 v3, 0x1

    iput-boolean v3, v2, LA5;->A:Z

    iget-object v0, v0, Lz5;->b:Lti;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lti;->c(Z)V

    iget-object v0, v1, Lk0;->b:Ljava/lang/Object;

    check-cast v0, LA5;

    iput-boolean v2, v0, LA5;->A:Z

    :cond_0
    iget-object v0, p0, Ly5;->b:Landroid/view/MenuItem;

    invoke-interface {v0}, Landroid/view/MenuItem;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Landroid/view/MenuItem;->hasSubMenu()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    iget-object v2, p0, Ly5;->c:Lti;

    const/4 v3, 0x4

    invoke-virtual {v2, v0, v1, v3}, Lti;->q(Landroid/view/MenuItem;LLi;I)Z

    :cond_1
    return-void
.end method
