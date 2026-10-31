.class public Lru/zinovin/tankspeedometer/utils/remoteresources/impl/CheckDemoPeriod;
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
.method public final execute(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "CheckDemoPeriod"

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
