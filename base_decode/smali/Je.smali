.class public final LJe;
.super LKe;
.source "SourceFile"


# virtual methods
.method public final b(Laf;)V
    .locals 2

    const-string v0, "stream"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const/16 v0, 0x8

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Laf;->c(ILjava/io/IOException;)V

    return-void
.end method
