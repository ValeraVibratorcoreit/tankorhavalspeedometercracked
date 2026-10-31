.class public final LTc;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# instance fields
.field public final a:Lzc;


# direct methods
.method public constructor <init>(Lzc;Ljava/lang/String;)V
    .locals 1

    const-string v0, "fragment"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, LTc;->a:Lzc;

    return-void
.end method
