.class public Lru/zinovin/tankspeedometer/utils/remoteresources/impl/MicroModePlugin;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lru/zinovin/tankspeedometer/utils/remoteresources/RemotePlugin;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final varargs execute(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {}, LLf;->a()LLf;

    move-result-object p1

    const/4 p2, 0x3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, LLf;->e(Ljava/lang/Integer;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "MicroModePlugin"

    return-object v0
.end method

.method public final getVersion()Ljava/lang/String;
    .locals 1

    const-string v0, "1.0"

    return-object v0
.end method

.method public final initialize(Landroid/content/Context;)V
    .locals 0

    return-void
.end method
