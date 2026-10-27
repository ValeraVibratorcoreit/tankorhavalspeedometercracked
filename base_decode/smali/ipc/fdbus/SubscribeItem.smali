.class public Lipc/fdbus/SubscribeItem;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private mCode:I

.field private mTopic:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lipc/fdbus/SubscribeItem;->mCode:I

    iput-object p2, p0, Lipc/fdbus/SubscribeItem;->mTopic:Ljava/lang/String;

    return-void
.end method

.method public static newEvent(I)Lipc/fdbus/SubscribeItem;
    .locals 2

    .line 2
    new-instance v0, Lipc/fdbus/SubscribeItem;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lipc/fdbus/SubscribeItem;-><init>(ILjava/lang/String;)V

    return-object v0
.end method

.method public static newEvent(ILjava/lang/String;)Lipc/fdbus/SubscribeItem;
    .locals 1

    .line 1
    new-instance v0, Lipc/fdbus/SubscribeItem;

    invoke-direct {v0, p0, p1}, Lipc/fdbus/SubscribeItem;-><init>(ILjava/lang/String;)V

    return-object v0
.end method

.method public static newGroup(I)Lipc/fdbus/SubscribeItem;
    .locals 2

    .line 2
    new-instance v0, Lipc/fdbus/SubscribeItem;

    and-int/lit16 p0, p0, 0xff

    shl-int/lit8 p0, p0, 0x18

    const v1, 0xffffff

    or-int/2addr p0, v1

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lipc/fdbus/SubscribeItem;-><init>(ILjava/lang/String;)V

    return-object v0
.end method

.method public static newGroup(ILjava/lang/String;)Lipc/fdbus/SubscribeItem;
    .locals 2

    .line 1
    new-instance v0, Lipc/fdbus/SubscribeItem;

    and-int/lit16 p0, p0, 0xff

    shl-int/lit8 p0, p0, 0x18

    const v1, 0xffffff

    or-int/2addr p0, v1

    invoke-direct {v0, p0, p1}, Lipc/fdbus/SubscribeItem;-><init>(ILjava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public code()I
    .locals 1

    iget v0, p0, Lipc/fdbus/SubscribeItem;->mCode:I

    return v0
.end method

.method public topic()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lipc/fdbus/SubscribeItem;->mTopic:Ljava/lang/String;

    return-object v0
.end method
