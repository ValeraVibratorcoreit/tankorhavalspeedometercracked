.class public final synthetic Lx3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:LE3;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Z

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LE3;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx3;->a:LE3;

    iput-object p2, p0, Lx3;->b:Ljava/lang/String;

    iput-boolean p3, p0, Lx3;->c:Z

    iput-object p4, p0, Lx3;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    iget-object p1, p0, Lx3;->a:LE3;

    iget-object v0, p0, Lx3;->b:Ljava/lang/String;

    iput-object v0, p1, LE3;->d0:Ljava/lang/String;

    iget-boolean v0, p0, Lx3;->c:Z

    iput-boolean v0, p1, LE3;->e0:Z

    new-instance v0, LL3;

    invoke-direct {v0}, LL3;-><init>()V

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "current"

    iget-object v3, p0, Lx3;->d:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lzc;->L(Landroid/os/Bundle;)V

    new-instance v1, Lk0;

    const/4 v2, 0x2

    invoke-direct {v1, p1, v2}, Lk0;-><init>(Ljava/lang/Object;I)V

    iput-object v1, v0, LL3;->T:Lk0;

    iget-object p1, p1, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    invoke-virtual {p1, v0}, Lru/zinovin/tankspeedometer/MainActivity;->J(Lzc;)V

    return-void
.end method
