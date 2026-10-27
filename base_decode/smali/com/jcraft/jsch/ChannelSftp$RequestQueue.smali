.class Lcom/jcraft/jsch/ChannelSftp$RequestQueue;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jcraft/jsch/ChannelSftp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "RequestQueue"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jcraft/jsch/ChannelSftp$RequestQueue$Request;,
        Lcom/jcraft/jsch/ChannelSftp$RequestQueue$OutOfOrderException;
    }
.end annotation


# instance fields
.field count:I

.field head:I

.field rrq:[Lcom/jcraft/jsch/ChannelSftp$RequestQueue$Request;

.field final synthetic this$0:Lcom/jcraft/jsch/ChannelSftp;


# direct methods
.method public constructor <init>(Lcom/jcraft/jsch/ChannelSftp;I)V
    .locals 1

    iput-object p1, p0, Lcom/jcraft/jsch/ChannelSftp$RequestQueue;->this$0:Lcom/jcraft/jsch/ChannelSftp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/jcraft/jsch/ChannelSftp$RequestQueue;->rrq:[Lcom/jcraft/jsch/ChannelSftp$RequestQueue$Request;

    new-array p1, p2, [Lcom/jcraft/jsch/ChannelSftp$RequestQueue$Request;

    iput-object p1, p0, Lcom/jcraft/jsch/ChannelSftp$RequestQueue;->rrq:[Lcom/jcraft/jsch/ChannelSftp$RequestQueue$Request;

    const/4 p1, 0x0

    :goto_0
    iget-object p2, p0, Lcom/jcraft/jsch/ChannelSftp$RequestQueue;->rrq:[Lcom/jcraft/jsch/ChannelSftp$RequestQueue$Request;

    array-length v0, p2

    if-ge p1, v0, :cond_0

    new-instance v0, Lcom/jcraft/jsch/ChannelSftp$RequestQueue$Request;

    invoke-direct {v0, p0}, Lcom/jcraft/jsch/ChannelSftp$RequestQueue$Request;-><init>(Lcom/jcraft/jsch/ChannelSftp$RequestQueue;)V

    aput-object v0, p2, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/jcraft/jsch/ChannelSftp$RequestQueue;->init()V

    return-void
.end method


# virtual methods
.method public add(IJI)V
    .locals 4

    iget v0, p0, Lcom/jcraft/jsch/ChannelSftp$RequestQueue;->count:I

    if-nez v0, :cond_0

    const/4 v1, 0x0

    iput v1, p0, Lcom/jcraft/jsch/ChannelSftp$RequestQueue;->head:I

    :cond_0
    iget v1, p0, Lcom/jcraft/jsch/ChannelSftp$RequestQueue;->head:I

    add-int/2addr v1, v0

    iget-object v2, p0, Lcom/jcraft/jsch/ChannelSftp$RequestQueue;->rrq:[Lcom/jcraft/jsch/ChannelSftp$RequestQueue$Request;

    array-length v3, v2

    if-lt v1, v3, :cond_1

    array-length v3, v2

    sub-int/2addr v1, v3

    :cond_1
    aget-object v1, v2, v1

    iput p1, v1, Lcom/jcraft/jsch/ChannelSftp$RequestQueue$Request;->id:I

    iput-wide p2, v1, Lcom/jcraft/jsch/ChannelSftp$RequestQueue$Request;->offset:J

    int-to-long p1, p4

    iput-wide p1, v1, Lcom/jcraft/jsch/ChannelSftp$RequestQueue$Request;->length:J

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/jcraft/jsch/ChannelSftp$RequestQueue;->count:I

    return-void
.end method

.method public cancel(Lcom/jcraft/jsch/ChannelSftp$Header;Lcom/jcraft/jsch/Buffer;)V
    .locals 8

    iget v0, p0, Lcom/jcraft/jsch/ChannelSftp$RequestQueue;->count:I

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_2

    iget-object v3, p0, Lcom/jcraft/jsch/ChannelSftp$RequestQueue;->this$0:Lcom/jcraft/jsch/ChannelSftp;

    invoke-static {v3, p2, p1}, Lcom/jcraft/jsch/ChannelSftp;->access$500(Lcom/jcraft/jsch/ChannelSftp;Lcom/jcraft/jsch/Buffer;Lcom/jcraft/jsch/ChannelSftp$Header;)Lcom/jcraft/jsch/ChannelSftp$Header;

    move-result-object p1

    iget v3, p1, Lcom/jcraft/jsch/ChannelSftp$Header;->length:I

    move v4, v1

    :goto_1
    iget-object v5, p0, Lcom/jcraft/jsch/ChannelSftp$RequestQueue;->rrq:[Lcom/jcraft/jsch/ChannelSftp$RequestQueue$Request;

    array-length v6, v5

    if-ge v4, v6, :cond_1

    aget-object v5, v5, v4

    iget v6, v5, Lcom/jcraft/jsch/ChannelSftp$RequestQueue$Request;->id:I

    iget v7, p1, Lcom/jcraft/jsch/ChannelSftp$Header;->rid:I

    if-ne v6, v7, :cond_0

    iput v1, v5, Lcom/jcraft/jsch/ChannelSftp$RequestQueue$Request;->id:I

    goto :goto_2

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    iget-object v4, p0, Lcom/jcraft/jsch/ChannelSftp$RequestQueue;->this$0:Lcom/jcraft/jsch/ChannelSftp;

    int-to-long v5, v3

    invoke-static {v4, v5, v6}, Lcom/jcraft/jsch/ChannelSftp;->access$600(Lcom/jcraft/jsch/ChannelSftp;J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/jcraft/jsch/ChannelSftp$RequestQueue;->init()V

    return-void
.end method

.method public count()I
    .locals 1

    iget v0, p0, Lcom/jcraft/jsch/ChannelSftp$RequestQueue;->count:I

    return v0
.end method

.method public get(I)Lcom/jcraft/jsch/ChannelSftp$RequestQueue$Request;
    .locals 6

    iget v0, p0, Lcom/jcraft/jsch/ChannelSftp$RequestQueue;->count:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/jcraft/jsch/ChannelSftp$RequestQueue;->count:I

    iget v0, p0, Lcom/jcraft/jsch/ChannelSftp$RequestQueue;->head:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/jcraft/jsch/ChannelSftp$RequestQueue;->head:I

    iget-object v2, p0, Lcom/jcraft/jsch/ChannelSftp$RequestQueue;->rrq:[Lcom/jcraft/jsch/ChannelSftp$RequestQueue$Request;

    array-length v3, v2

    const/4 v4, 0x0

    if-ne v1, v3, :cond_0

    iput v4, p0, Lcom/jcraft/jsch/ChannelSftp$RequestQueue;->head:I

    :cond_0
    aget-object v0, v2, v0

    iget v1, v0, Lcom/jcraft/jsch/ChannelSftp$RequestQueue$Request;->id:I

    if-eq v1, p1, :cond_3

    invoke-virtual {p0}, Lcom/jcraft/jsch/ChannelSftp$RequestQueue;->getOffset()J

    move-result-wide v0

    move v2, v4

    :goto_0
    iget-object v3, p0, Lcom/jcraft/jsch/ChannelSftp$RequestQueue;->rrq:[Lcom/jcraft/jsch/ChannelSftp$RequestQueue$Request;

    array-length v5, v3

    if-ge v2, v5, :cond_2

    aget-object v3, v3, v2

    iget v5, v3, Lcom/jcraft/jsch/ChannelSftp$RequestQueue$Request;->id:I

    if-eq v5, p1, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iput v4, v3, Lcom/jcraft/jsch/ChannelSftp$RequestQueue$Request;->id:I

    new-instance p1, Lcom/jcraft/jsch/ChannelSftp$RequestQueue$OutOfOrderException;

    invoke-direct {p1, p0, v0, v1}, Lcom/jcraft/jsch/ChannelSftp$RequestQueue$OutOfOrderException;-><init>(Lcom/jcraft/jsch/ChannelSftp$RequestQueue;J)V

    throw p1

    :cond_2
    new-instance v0, Lcom/jcraft/jsch/SftpException;

    const-string v1, "RequestQueue: unknown request id "

    invoke-static {p1, v1}, LVo;->e(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x4

    invoke-direct {v0, v1, p1}, Lcom/jcraft/jsch/SftpException;-><init>(ILjava/lang/String;)V

    throw v0

    :cond_3
    iput v4, v0, Lcom/jcraft/jsch/ChannelSftp$RequestQueue$Request;->id:I

    return-object v0
.end method

.method public getOffset()J
    .locals 6

    const-wide v0, 0x7fffffffffffffffL

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Lcom/jcraft/jsch/ChannelSftp$RequestQueue;->rrq:[Lcom/jcraft/jsch/ChannelSftp$RequestQueue$Request;

    array-length v4, v3

    if-ge v2, v4, :cond_2

    aget-object v3, v3, v2

    iget v4, v3, Lcom/jcraft/jsch/ChannelSftp$RequestQueue$Request;->id:I

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    iget-wide v3, v3, Lcom/jcraft/jsch/ChannelSftp$RequestQueue$Request;->offset:J

    cmp-long v5, v0, v3

    if-lez v5, :cond_1

    move-wide v0, v3

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-wide v0
.end method

.method public init()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/jcraft/jsch/ChannelSftp$RequestQueue;->count:I

    iput v0, p0, Lcom/jcraft/jsch/ChannelSftp$RequestQueue;->head:I

    return-void
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lcom/jcraft/jsch/ChannelSftp$RequestQueue;->rrq:[Lcom/jcraft/jsch/ChannelSftp$RequestQueue$Request;

    array-length v0, v0

    return v0
.end method
