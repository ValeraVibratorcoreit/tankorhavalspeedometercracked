.class public final LEg;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lug;

.field public b:Lzg;


# virtual methods
.method public final a(LDg;Ltg;)V
    .locals 3

    invoke-virtual {p2}, Ltg;->a()Lug;

    move-result-object v0

    iget-object v1, p0, LEg;->a:Lug;

    const-string v2, "state1"

    invoke-static {v2, v1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v2

    if-gez v2, :cond_0

    move-object v1, v0

    :cond_0
    iput-object v1, p0, LEg;->a:Lug;

    iget-object v1, p0, LEg;->b:Lzg;

    invoke-interface {v1, p1, p2}, Lzg;->n(LDg;Ltg;)V

    iput-object v0, p0, LEg;->a:Lug;

    return-void
.end method
