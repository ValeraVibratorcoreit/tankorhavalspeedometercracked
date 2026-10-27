.class public abstract LSd;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lpk;

.field public static final b:Lpk;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lm8;->c:Lm8;

    const-string v1, "com.bumptech.glide.load.resource.gif.GifOptions.DecodeFormat"

    invoke-static {v1, v0}, Lpk;->a(Ljava/lang/String;Ljava/lang/Object;)Lpk;

    move-result-object v0

    sput-object v0, LSd;->a:Lpk;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const-string v1, "com.bumptech.glide.load.resource.gif.GifOptions.DisableAnimation"

    invoke-static {v1, v0}, Lpk;->a(Ljava/lang/String;Ljava/lang/Object;)Lpk;

    move-result-object v0

    sput-object v0, LSd;->b:Lpk;

    return-void
.end method
