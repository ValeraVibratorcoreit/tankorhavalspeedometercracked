.class public final enum Lm8;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum a:Lm8;

.field public static final enum b:Lm8;

.field public static final c:Lm8;

.field public static final synthetic d:[Lm8;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lm8;

    const-string v1, "PREFER_ARGB_8888"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm8;->a:Lm8;

    new-instance v1, Lm8;

    const-string v2, "PREFER_RGB_565"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lm8;->b:Lm8;

    filled-new-array {v0, v1}, [Lm8;

    move-result-object v1

    sput-object v1, Lm8;->d:[Lm8;

    sput-object v0, Lm8;->c:Lm8;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lm8;
    .locals 1

    const-class v0, Lm8;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lm8;

    return-object p0
.end method

.method public static values()[Lm8;
    .locals 1

    sget-object v0, Lm8;->d:[Lm8;

    invoke-virtual {v0}, [Lm8;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lm8;

    return-object v0
.end method
