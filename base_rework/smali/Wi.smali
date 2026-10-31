.class public final LWi;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lfg;

.field public final b:Ljava/util/List;

.field public final c:La8;


# direct methods
.method public constructor <init>(Lfg;La8;)V
    .locals 2

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v1, "Argument must not be null"

    invoke-static {v1, p1}, LUd;->l(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p1, p0, LWi;->a:Lfg;

    invoke-static {v1, v0}, LUd;->l(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v0, p0, LWi;->b:Ljava/util/List;

    invoke-static {v1, p2}, LUd;->l(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p2, p0, LWi;->c:La8;

    return-void
.end method
