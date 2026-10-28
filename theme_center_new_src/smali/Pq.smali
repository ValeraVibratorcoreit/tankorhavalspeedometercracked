.class public final enum LPq;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum b:LPq;

.field public static final enum c:LPq;

.field public static final enum d:LPq;

.field public static final enum e:LPq;

.field public static final enum f:LPq;

.field public static final synthetic g:[LPq;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, LPq;

    const-string v1, "TLSv1.3"

    const-string v2, "TLS_1_3"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, LPq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, LPq;->b:LPq;

    new-instance v1, LPq;

    const-string v2, "TLSv1.2"

    const-string v3, "TLS_1_2"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v2}, LPq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, LPq;->c:LPq;

    new-instance v2, LPq;

    const-string v3, "TLSv1.1"

    const-string v4, "TLS_1_1"

    const/4 v5, 0x2

    invoke-direct {v2, v4, v5, v3}, LPq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, LPq;->d:LPq;

    new-instance v3, LPq;

    const-string v4, "TLSv1"

    const-string v5, "TLS_1_0"

    const/4 v6, 0x3

    invoke-direct {v3, v5, v6, v4}, LPq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, LPq;->e:LPq;

    new-instance v4, LPq;

    const-string v5, "SSLv3"

    const-string v6, "SSL_3_0"

    const/4 v7, 0x4

    invoke-direct {v4, v6, v7, v5}, LPq;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, LPq;->f:LPq;

    filled-new-array {v0, v1, v2, v3, v4}, [LPq;

    move-result-object v0

    sput-object v0, LPq;->g:[LPq;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, LPq;->a:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LPq;
    .locals 1

    const-class v0, LPq;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, LPq;

    return-object p0
.end method

.method public static values()[LPq;
    .locals 1

    sget-object v0, LPq;->g:[LPq;

    invoke-virtual {v0}, [LPq;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [LPq;

    return-object v0
.end method
