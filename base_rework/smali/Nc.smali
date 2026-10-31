.class public final LNc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMc;


# instance fields
.field public final a:I

.field public final b:I

.field public final synthetic c:LOc;


# direct methods
.method public constructor <init>(LOc;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNc;->c:LOc;

    iput p2, p0, LNc;->a:I

    const/4 p1, 0x1

    iput p1, p0, LNc;->b:I

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z
    .locals 5

    iget-object v0, p0, LNc;->c:LOc;

    iget-object v1, v0, LOc;->w:Lzc;

    iget v2, p0, LNc;->a:I

    if-eqz v1, :cond_0

    if-gez v2, :cond_0

    invoke-virtual {v1}, Lzc;->g()LOc;

    move-result-object v1

    const/4 v3, -0x1

    const/4 v4, 0x0

    invoke-virtual {v1, v3, v4}, LOc;->N(II)Z

    move-result v1

    if-eqz v1, :cond_0

    return v4

    :cond_0
    iget v1, p0, LNc;->b:I

    invoke-virtual {v0, p1, p2, v2, v1}, LOc;->O(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z

    move-result p1

    return p1
.end method
