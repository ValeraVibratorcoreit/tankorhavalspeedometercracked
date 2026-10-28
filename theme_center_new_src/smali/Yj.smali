.class public final LYj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp5;


# instance fields
.field public final a:LHc;

.field public final synthetic b:Lak;


# direct methods
.method public constructor <init>(Lak;LHc;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "onBackPressedCallback"

    invoke-static {v0, p2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p1, p0, LYj;->b:Lak;

    iput-object p2, p0, LYj;->a:LHc;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 4

    iget-object v0, p0, LYj;->b:Lak;

    iget-object v1, v0, Lak;->b:LZ2;

    iget-object v2, p0, LYj;->a:LHc;

    invoke-virtual {v1, v2}, LZ2;->remove(Ljava/lang/Object;)Z

    iget-object v1, v0, Lak;->c:LHc;

    invoke-static {v1, v2}, LTf;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v3, v0, Lak;->c:LHc;

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v2, LHc;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v0, v2, LHc;->c:Ldd;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ldd;->a()Ljava/lang/Object;

    :cond_1
    iput-object v3, v2, LHc;->c:Ldd;

    return-void
.end method
