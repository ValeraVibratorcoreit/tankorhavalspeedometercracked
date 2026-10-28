.class public final LEs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/OnReceiveContentListener;


# instance fields
.field public final a:Lhk;


# direct methods
.method public constructor <init>(Lhk;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LEs;->a:Lhk;

    return-void
.end method


# virtual methods
.method public final onReceiveContent(Landroid/view/View;Landroid/view/ContentInfo;)Landroid/view/ContentInfo;
    .locals 2

    new-instance v0, LE7;

    new-instance v1, Lk0;

    invoke-direct {v1, p2}, Lk0;-><init>(Landroid/view/ContentInfo;)V

    invoke-direct {v0, v1}, LE7;-><init>(LD7;)V

    iget-object v1, p0, LEs;->a:Lhk;

    check-cast v1, Lzq;

    invoke-virtual {v1, p1, v0}, Lzq;->a(Landroid/view/View;LE7;)LE7;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    if-ne p1, v0, :cond_1

    return-object p2

    :cond_1
    iget-object p1, p1, LE7;->a:LD7;

    invoke-interface {p1}, LD7;->j()Landroid/view/ContentInfo;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lz4;->g(Ljava/lang/Object;)Landroid/view/ContentInfo;

    move-result-object p1

    return-object p1
.end method
