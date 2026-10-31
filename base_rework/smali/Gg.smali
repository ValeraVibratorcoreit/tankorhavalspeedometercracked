.class public final LGg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LBg;


# instance fields
.field public final synthetic a:Lwg;

.field public final synthetic b:Ld2;


# direct methods
.method public constructor <init>(Ld2;Lwg;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGg;->b:Ld2;

    iput-object p2, p0, LGg;->a:Lwg;

    return-void
.end method


# virtual methods
.method public final f()V
    .locals 0

    return-void
.end method

.method public final j()V
    .locals 0

    return-void
.end method

.method public final k()V
    .locals 2

    iget-object v0, p0, LGg;->b:Ld2;

    iget-object v0, v0, Ld2;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    iget-object v1, p0, LGg;->a:Lwg;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
