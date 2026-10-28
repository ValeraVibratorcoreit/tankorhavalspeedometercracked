.class public final LLb;
.super Lo;
.source "SourceFile"


# instance fields
.field public final c:Lj8;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lzl;-><init>()V

    new-instance v0, Lj8;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lj8;-><init>(I)V

    iput-object v0, p0, LLb;->c:Lj8;

    return-void
.end method


# virtual methods
.method public final b()Ljava/util/Random;
    .locals 2

    iget-object v0, p0, LLb;->c:Lj8;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "implStorage.get()"

    invoke-static {v1, v0}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v0, Ljava/util/Random;

    return-object v0
.end method
