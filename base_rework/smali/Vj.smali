.class public final LVj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/window/OnBackAnimationCallback;


# instance fields
.field public final synthetic a:Lod;

.field public final synthetic b:Lod;

.field public final synthetic c:Ldd;

.field public final synthetic d:Ldd;


# direct methods
.method public constructor <init>(Lod;Lod;Ldd;Ldd;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LVj;->a:Lod;

    iput-object p2, p0, LVj;->b:Lod;

    iput-object p3, p0, LVj;->c:Ldd;

    iput-object p4, p0, LVj;->d:Ldd;

    return-void
.end method


# virtual methods
.method public final onBackCancelled()V
    .locals 1

    iget-object v0, p0, LVj;->d:Ldd;

    invoke-interface {v0}, Ldd;->a()Ljava/lang/Object;

    return-void
.end method

.method public final onBackInvoked()V
    .locals 1

    iget-object v0, p0, LVj;->c:Ldd;

    invoke-interface {v0}, Ldd;->a()Ljava/lang/Object;

    return-void
.end method

.method public final onBackProgressed(Landroid/window/BackEvent;)V
    .locals 2

    const-string v0, "backEvent"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, LVj;->b:Lod;

    new-instance v1, Lr3;

    invoke-direct {v1, p1}, Lr3;-><init>(Landroid/window/BackEvent;)V

    invoke-interface {v0, v1}, Lod;->c(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final onBackStarted(Landroid/window/BackEvent;)V
    .locals 2

    const-string v0, "backEvent"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, LVj;->a:Lod;

    new-instance v1, Lr3;

    invoke-direct {v1, p1}, Lr3;-><init>(Landroid/window/BackEvent;)V

    invoke-interface {v0, v1}, Lod;->c(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
