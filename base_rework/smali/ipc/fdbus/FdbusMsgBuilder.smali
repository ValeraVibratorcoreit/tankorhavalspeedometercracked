.class public Lipc/fdbus/FdbusMsgBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected mMsg:Ljava/lang/Object;

.field protected mStream:[B

.field protected mText:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lipc/fdbus/FdbusMsgBuilder;->mStream:[B

    .line 3
    iput-object v0, p0, Lipc/fdbus/FdbusMsgBuilder;->mText:Ljava/lang/String;

    .line 4
    iput-object p1, p0, Lipc/fdbus/FdbusMsgBuilder;->mMsg:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>([BLjava/lang/String;)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lipc/fdbus/FdbusMsgBuilder;->mStream:[B

    .line 7
    iput-object p2, p0, Lipc/fdbus/FdbusMsgBuilder;->mText:Ljava/lang/String;

    const/4 p1, 0x0

    .line 8
    iput-object p1, p0, Lipc/fdbus/FdbusMsgBuilder;->mMsg:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public build(Z)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public toBuffer()[B
    .locals 1

    iget-object v0, p0, Lipc/fdbus/FdbusMsgBuilder;->mStream:[B

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lipc/fdbus/FdbusMsgBuilder;->mText:Ljava/lang/String;

    return-object v0
.end method
