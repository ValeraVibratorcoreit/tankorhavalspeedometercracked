.class public Lipc/fdbus/FdbusParcelable$TextFormatter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lipc/fdbus/FdbusParcelable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "TextFormatter"
.end annotation


# static fields
.field private static final FDB_BYTEARRAY_PRINT_SIZE:I = 0x10


# instance fields
.field private mStream:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0}, Ljava/lang/String;-><init>()V

    iput-object v0, p0, Lipc/fdbus/FdbusParcelable$TextFormatter;->mStream:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lipc/fdbus/FdbusParcelable$TextFormatter;->mStream:Ljava/lang/String;

    return-void
.end method

.method private formatOne(Ljava/lang/Object;)V
    .locals 8

    instance-of v0, p1, Lipc/fdbus/FdbusParcelable;

    if-eqz v0, :cond_0

    check-cast p1, Lipc/fdbus/FdbusParcelable;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lipc/fdbus/FdbusParcelable$TextFormatter;->mStream:Ljava/lang/String;

    const-string v2, "{"

    invoke-static {v0, v1, v2}, LVo;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lipc/fdbus/FdbusParcelable$TextFormatter;->mStream:Ljava/lang/String;

    invoke-virtual {p1, p0}, Lipc/fdbus/FdbusParcelable;->toString(Lipc/fdbus/FdbusParcelable$TextFormatter;)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lipc/fdbus/FdbusParcelable$TextFormatter;->mStream:Ljava/lang/String;

    const-string v1, "}"

    invoke-static {p1, v0, v1}, LVo;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lipc/fdbus/FdbusParcelable$TextFormatter;->mStream:Ljava/lang/String;

    goto/16 :goto_2

    :cond_0
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_1

    check-cast p1, Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lipc/fdbus/FdbusParcelable$TextFormatter;->mStream:Ljava/lang/String;

    invoke-static {v0, v1, p1}, LVo;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lipc/fdbus/FdbusParcelable$TextFormatter;->mStream:Ljava/lang/String;

    goto/16 :goto_2

    :cond_1
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    check-cast p1, Ljava/lang/Integer;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lipc/fdbus/FdbusParcelable$TextFormatter;->mStream:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lipc/fdbus/FdbusParcelable$TextFormatter;->mStream:Ljava/lang/String;

    goto/16 :goto_2

    :cond_2
    instance-of v0, p1, [B

    const-string v1, "]"

    const-string v2, ","

    const-string v3, "["

    const/4 v4, 0x0

    if-eqz v0, :cond_5

    check-cast p1, [B

    array-length v0, p1

    const/16 v5, 0x10

    if-le v0, v5, :cond_3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, p0, Lipc/fdbus/FdbusParcelable$TextFormatter;->mStream:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lipc/fdbus/FdbusParcelable$TextFormatter;->mStream:Ljava/lang/String;

    move v0, v5

    goto :goto_0

    :cond_3
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, p0, Lipc/fdbus/FdbusParcelable$TextFormatter;->mStream:Ljava/lang/String;

    invoke-static {v5, v6, v3}, LVo;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lipc/fdbus/FdbusParcelable$TextFormatter;->mStream:Ljava/lang/String;

    :goto_0
    if-ge v4, v0, :cond_4

    aget-byte v3, p1, v4

    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, p0, Lipc/fdbus/FdbusParcelable$TextFormatter;->mStream:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/Byte;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lipc/fdbus/FdbusParcelable$TextFormatter;->mStream:Ljava/lang/String;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lipc/fdbus/FdbusParcelable$TextFormatter;->mStream:Ljava/lang/String;

    invoke-static {p1, v0, v1}, LVo;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lipc/fdbus/FdbusParcelable$TextFormatter;->mStream:Ljava/lang/String;

    goto :goto_2

    :cond_5
    instance-of v0, p1, [[B

    if-eqz v0, :cond_7

    check-cast p1, [[B

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lipc/fdbus/FdbusParcelable$TextFormatter;->mStream:Ljava/lang/String;

    invoke-static {v0, v5, v3}, LVo;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lipc/fdbus/FdbusParcelable$TextFormatter;->mStream:Ljava/lang/String;

    :goto_1
    array-length v0, p1

    if-ge v4, v0, :cond_6

    aget-object v0, p1, v4

    invoke-direct {p0, v0}, Lipc/fdbus/FdbusParcelable$TextFormatter;->formatOne(Ljava/lang/Object;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lipc/fdbus/FdbusParcelable$TextFormatter;->mStream:Ljava/lang/String;

    invoke-static {v0, v3, v2}, LVo;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lipc/fdbus/FdbusParcelable$TextFormatter;->mStream:Ljava/lang/String;

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lipc/fdbus/FdbusParcelable$TextFormatter;->mStream:Ljava/lang/String;

    invoke-static {p1, v0, v1}, LVo;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lipc/fdbus/FdbusParcelable$TextFormatter;->mStream:Ljava/lang/String;

    goto :goto_2

    :cond_7
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lipc/fdbus/FdbusParcelable$TextFormatter;->mStream:Ljava/lang/String;

    const-string v1, "error!"

    invoke-static {p1, v0, v1}, LVo;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lipc/fdbus/FdbusParcelable$TextFormatter;->mStream:Ljava/lang/String;

    :goto_2
    return-void
.end method


# virtual methods
.method public append(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lipc/fdbus/FdbusParcelable$TextFormatter;->mStream:Ljava/lang/String;

    invoke-static {v0, v1, p1}, LVo;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lipc/fdbus/FdbusParcelable$TextFormatter;->mStream:Ljava/lang/String;

    return-void
.end method

.method public format(Ljava/lang/Object;)V
    .locals 5

    .line 1
    instance-of v0, p1, [Ljava/lang/Object;

    if-eqz v0, :cond_1

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lipc/fdbus/FdbusParcelable$TextFormatter;->mStream:Ljava/lang/String;

    const-string v2, "["

    .line 3
    invoke-static {v0, v1, v2}, LVo;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 4
    iput-object v0, p0, Lipc/fdbus/FdbusParcelable$TextFormatter;->mStream:Ljava/lang/String;

    .line 5
    check-cast p1, [Ljava/lang/Object;

    .line 6
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    .line 7
    invoke-direct {p0, v2}, Lipc/fdbus/FdbusParcelable$TextFormatter;->formatOne(Ljava/lang/Object;)V

    .line 8
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lipc/fdbus/FdbusParcelable$TextFormatter;->mStream:Ljava/lang/String;

    const-string v4, ","

    .line 9
    invoke-static {v2, v3, v4}, LVo;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 10
    iput-object v2, p0, Lipc/fdbus/FdbusParcelable$TextFormatter;->mStream:Ljava/lang/String;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 11
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lipc/fdbus/FdbusParcelable$TextFormatter;->mStream:Ljava/lang/String;

    const-string v1, "]"

    .line 12
    invoke-static {p1, v0, v1}, LVo;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 13
    iput-object p1, p0, Lipc/fdbus/FdbusParcelable$TextFormatter;->mStream:Ljava/lang/String;

    return-void

    .line 14
    :cond_1
    invoke-direct {p0, p1}, Lipc/fdbus/FdbusParcelable$TextFormatter;->formatOne(Ljava/lang/Object;)V

    return-void
.end method

.method public format(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .line 24
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lipc/fdbus/FdbusParcelable$TextFormatter;->mStream:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ":"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lipc/fdbus/FdbusParcelable$TextFormatter;->mStream:Ljava/lang/String;

    .line 25
    invoke-virtual {p0, p2}, Lipc/fdbus/FdbusParcelable$TextFormatter;->format(Ljava/lang/Object;)V

    .line 26
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p2, p0, Lipc/fdbus/FdbusParcelable$TextFormatter;->mStream:Ljava/lang/String;

    const-string v0, ","

    .line 27
    invoke-static {p1, p2, v0}, LVo;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 28
    iput-object p1, p0, Lipc/fdbus/FdbusParcelable$TextFormatter;->mStream:Ljava/lang/String;

    return-void
.end method

.method public stream()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lipc/fdbus/FdbusParcelable$TextFormatter;->mStream:Ljava/lang/String;

    return-object v0
.end method
