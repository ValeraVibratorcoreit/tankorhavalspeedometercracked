.class public final Lzi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ActionProvider$VisibilityListener;


# instance fields
.field public a:Lk0;

.field public final b:Landroid/view/ActionProvider;

.field public final synthetic c:LCi;


# direct methods
.method public constructor <init>(LCi;Landroid/view/ActionProvider;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzi;->c:LCi;

    iput-object p2, p0, Lzi;->b:Landroid/view/ActionProvider;

    return-void
.end method


# virtual methods
.method public final onActionProviderVisibilityChanged(Z)V
    .locals 1

    iget-object p1, p0, Lzi;->a:Lk0;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lk0;->b:Ljava/lang/Object;

    check-cast p1, Lyi;

    iget-object p1, p1, Lyi;->n:Lti;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lti;->h:Z

    invoke-virtual {p1, v0}, Lti;->p(Z)V

    :cond_0
    return-void
.end method
