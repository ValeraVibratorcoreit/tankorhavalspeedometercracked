.class public final LXj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzg;
.implements Lp5;


# instance fields
.field public final a:Lwg;

.field public final b:LHc;

.field public c:LYj;

.field public final synthetic d:Lak;


# direct methods
.method public constructor <init>(Lak;Lwg;LHc;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "lifecycle"

    invoke-static {v0, p2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "onBackPressedCallback"

    invoke-static {v0, p3}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p1, p0, LXj;->d:Lak;

    iput-object p2, p0, LXj;->a:Lwg;

    iput-object p3, p0, LXj;->b:LHc;

    invoke-virtual {p2, p0}, Lwg;->a(LCg;)V

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    iget-object v0, p0, LXj;->a:Lwg;

    invoke-virtual {v0, p0}, Lwg;->b(LCg;)V

    iget-object v0, p0, LXj;->b:LHc;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, LHc;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, LXj;->c:LYj;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYj;->cancel()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, LXj;->c:LYj;

    return-void
.end method

.method public final n(LDg;Ltg;)V
    .locals 3

    sget-object p1, Ltg;->ON_START:Ltg;

    if-ne p2, p1, :cond_0

    iget-object p1, p0, LXj;->d:Lak;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p2, p0, LXj;->b:LHc;

    const-string v0, "onBackPressedCallback"

    invoke-static {v0, p2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p1, Lak;->b:LZ2;

    invoke-virtual {v0, p2}, LZ2;->a(Ljava/lang/Object;)V

    new-instance v0, LYj;

    invoke-direct {v0, p1, p2}, LYj;-><init>(Lak;LHc;)V

    iget-object v1, p2, LHc;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lak;->d()V

    new-instance v1, LZj;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, LZj;-><init>(Ljava/lang/Object;I)V

    iput-object v1, p2, LHc;->c:Ldd;

    iput-object v0, p0, LXj;->c:LYj;

    goto :goto_0

    :cond_0
    sget-object p1, Ltg;->ON_STOP:Ltg;

    if-ne p2, p1, :cond_1

    iget-object p1, p0, LXj;->c:LYj;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, LYj;->cancel()V

    goto :goto_0

    :cond_1
    sget-object p1, Ltg;->ON_DESTROY:Ltg;

    if-ne p2, p1, :cond_2

    invoke-virtual {p0}, LXj;->cancel()V

    :cond_2
    :goto_0
    return-void
.end method
