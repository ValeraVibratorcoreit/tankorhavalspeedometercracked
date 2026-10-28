.class public Lipc/fdbus/FdbusSerializer;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final EXPANSION_BLOCK_SIZE:I = 0x7d0


# instance fields
.field private mBuffer:[B

.field private mBufferPos:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lipc/fdbus/FdbusSerializer;->mBufferPos:I

    const/16 v0, 0x7d0

    new-array v0, v0, [B

    iput-object v0, p0, Lipc/fdbus/FdbusSerializer;->mBuffer:[B

    return-void
.end method

.method private expandBuffer(I)V
    .locals 4

    iget v0, p0, Lipc/fdbus/FdbusSerializer;->mBufferPos:I

    add-int v1, v0, p1

    iget-object v2, p0, Lipc/fdbus/FdbusSerializer;->mBuffer:[B

    array-length v3, v2

    if-gt v1, v3, :cond_0

    return-void

    :cond_0
    add-int/2addr v0, p1

    add-int/lit16 v0, v0, 0x7d0

    new-array p1, v0, [B

    array-length v0, v2

    const/4 v1, 0x0

    invoke-static {v2, v1, p1, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object p1, p0, Lipc/fdbus/FdbusSerializer;->mBuffer:[B

    return-void
.end method

.method private writeRaw8(I)V
    .locals 3

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lipc/fdbus/FdbusSerializer;->expandBuffer(I)V

    iget-object v0, p0, Lipc/fdbus/FdbusSerializer;->mBuffer:[B

    iget v1, p0, Lipc/fdbus/FdbusSerializer;->mBufferPos:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lipc/fdbus/FdbusSerializer;->mBufferPos:I

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    aput-byte p1, v0, v1

    return-void
.end method

.method private writeRawBytes([B)V
    .locals 1

    .line 4
    array-length v0, p1

    invoke-direct {p0, p1, v0}, Lipc/fdbus/FdbusSerializer;->writeRawBytes([BI)V

    return-void
.end method

.method private writeRawBytes([BI)V
    .locals 3

    .line 1
    invoke-direct {p0, p2}, Lipc/fdbus/FdbusSerializer;->expandBuffer(I)V

    .line 2
    iget-object v0, p0, Lipc/fdbus/FdbusSerializer;->mBuffer:[B

    iget v1, p0, Lipc/fdbus/FdbusSerializer;->mBufferPos:I

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 3
    iget p1, p0, Lipc/fdbus/FdbusSerializer;->mBufferPos:I

    add-int/2addr p1, p2

    iput p1, p0, Lipc/fdbus/FdbusSerializer;->mBufferPos:I

    return-void
.end method

.method private writeRawLittleEndian16(I)V
    .locals 5

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lipc/fdbus/FdbusSerializer;->expandBuffer(I)V

    iget-object v1, p0, Lipc/fdbus/FdbusSerializer;->mBuffer:[B

    iget v2, p0, Lipc/fdbus/FdbusSerializer;->mBufferPos:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lipc/fdbus/FdbusSerializer;->mBufferPos:I

    and-int/lit16 v4, p1, 0xff

    int-to-byte v4, v4

    aput-byte v4, v1, v2

    add-int/2addr v2, v0

    iput v2, p0, Lipc/fdbus/FdbusSerializer;->mBufferPos:I

    shr-int/lit8 p1, p1, 0x8

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    aput-byte p1, v1, v3

    return-void
.end method

.method private writeRawLittleEndian32(I)V
    .locals 6

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lipc/fdbus/FdbusSerializer;->expandBuffer(I)V

    iget-object v1, p0, Lipc/fdbus/FdbusSerializer;->mBuffer:[B

    iget v2, p0, Lipc/fdbus/FdbusSerializer;->mBufferPos:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lipc/fdbus/FdbusSerializer;->mBufferPos:I

    and-int/lit16 v4, p1, 0xff

    int-to-byte v4, v4

    aput-byte v4, v1, v2

    add-int/lit8 v4, v2, 0x2

    iput v4, p0, Lipc/fdbus/FdbusSerializer;->mBufferPos:I

    shr-int/lit8 v5, p1, 0x8

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    aput-byte v5, v1, v3

    add-int/lit8 v3, v2, 0x3

    iput v3, p0, Lipc/fdbus/FdbusSerializer;->mBufferPos:I

    shr-int/lit8 v5, p1, 0x10

    and-int/lit16 v5, v5, 0xff

    int-to-byte v5, v5

    aput-byte v5, v1, v4

    add-int/2addr v2, v0

    iput v2, p0, Lipc/fdbus/FdbusSerializer;->mBufferPos:I

    shr-int/lit8 p1, p1, 0x18

    and-int/lit16 p1, p1, 0xff

    int-to-byte p1, p1

    aput-byte p1, v1, v3

    return-void
.end method

.method private writeRawLittleEndian64(J)V
    .locals 9

    const/16 v0, 0x8

    invoke-direct {p0, v0}, Lipc/fdbus/FdbusSerializer;->expandBuffer(I)V

    iget-object v1, p0, Lipc/fdbus/FdbusSerializer;->mBuffer:[B

    iget v2, p0, Lipc/fdbus/FdbusSerializer;->mBufferPos:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lipc/fdbus/FdbusSerializer;->mBufferPos:I

    const-wide/16 v4, 0xff

    and-long v6, p1, v4

    long-to-int v6, v6

    int-to-byte v6, v6

    aput-byte v6, v1, v2

    add-int/lit8 v6, v2, 0x2

    iput v6, p0, Lipc/fdbus/FdbusSerializer;->mBufferPos:I

    shr-long v7, p1, v0

    and-long/2addr v7, v4

    long-to-int v7, v7

    int-to-byte v7, v7

    aput-byte v7, v1, v3

    add-int/lit8 v3, v2, 0x3

    iput v3, p0, Lipc/fdbus/FdbusSerializer;->mBufferPos:I

    const/16 v7, 0x10

    shr-long v7, p1, v7

    and-long/2addr v7, v4

    long-to-int v7, v7

    int-to-byte v7, v7

    aput-byte v7, v1, v6

    add-int/lit8 v6, v2, 0x4

    iput v6, p0, Lipc/fdbus/FdbusSerializer;->mBufferPos:I

    const/16 v7, 0x18

    shr-long v7, p1, v7

    and-long/2addr v7, v4

    long-to-int v7, v7

    int-to-byte v7, v7

    aput-byte v7, v1, v3

    add-int/lit8 v3, v2, 0x5

    iput v3, p0, Lipc/fdbus/FdbusSerializer;->mBufferPos:I

    const/16 v7, 0x20

    shr-long v7, p1, v7

    and-long/2addr v7, v4

    long-to-int v7, v7

    int-to-byte v7, v7

    aput-byte v7, v1, v6

    add-int/lit8 v6, v2, 0x6

    iput v6, p0, Lipc/fdbus/FdbusSerializer;->mBufferPos:I

    const/16 v7, 0x28

    shr-long v7, p1, v7

    and-long/2addr v7, v4

    long-to-int v7, v7

    int-to-byte v7, v7

    aput-byte v7, v1, v3

    add-int/lit8 v3, v2, 0x7

    iput v3, p0, Lipc/fdbus/FdbusSerializer;->mBufferPos:I

    const/16 v7, 0x30

    shr-long v7, p1, v7

    and-long/2addr v7, v4

    long-to-int v7, v7

    int-to-byte v7, v7

    aput-byte v7, v1, v6

    add-int/2addr v2, v0

    iput v2, p0, Lipc/fdbus/FdbusSerializer;->mBufferPos:I

    const/16 v0, 0x38

    shr-long/2addr p1, v0

    and-long/2addr p1, v4

    long-to-int p1, p1

    int-to-byte p1, p1

    aput-byte p1, v1, v3

    return-void
.end method

.method private writeString(Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "UTF-8"

    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    new-array p1, v0, [B

    :goto_0
    array-length v1, p1

    add-int/lit8 v1, v1, 0x1

    invoke-direct {p0, v1}, Lipc/fdbus/FdbusSerializer;->writeRawLittleEndian16(I)V

    invoke-direct {p0, p1}, Lipc/fdbus/FdbusSerializer;->writeRawBytes([B)V

    invoke-direct {p0, v0}, Lipc/fdbus/FdbusSerializer;->writeRaw8(I)V

    return-void
.end method


# virtual methods
.method public export()[B
    .locals 4

    iget v0, p0, Lipc/fdbus/FdbusSerializer;->mBufferPos:I

    new-array v1, v0, [B

    iget-object v2, p0, Lipc/fdbus/FdbusSerializer;->mBuffer:[B

    const/4 v3, 0x0

    invoke-static {v2, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1
.end method

.method public getBuffer()[B
    .locals 1

    iget-object v0, p0, Lipc/fdbus/FdbusSerializer;->mBuffer:[B

    return-object v0
.end method

.method public getPosition()I
    .locals 1

    iget v0, p0, Lipc/fdbus/FdbusSerializer;->mBufferPos:I

    return v0
.end method

.method public in(Lipc/fdbus/FdbusParcelable;)V
    .locals 0

    .line 7
    invoke-virtual {p1, p0}, Lipc/fdbus/FdbusParcelable;->serialize(Lipc/fdbus/FdbusSerializer;)V

    return-void
.end method

.method public in([B)V
    .locals 1

    .line 3
    array-length v0, p1

    invoke-virtual {p0, p1, v0}, Lipc/fdbus/FdbusSerializer;->in([BI)V

    return-void
.end method

.method public in([BI)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lipc/fdbus/FdbusSerializer;->writeRawLittleEndian32(I)V

    .line 2
    invoke-direct {p0, p1, p2}, Lipc/fdbus/FdbusSerializer;->writeRawBytes([BI)V

    return-void
.end method

.method public in([Lipc/fdbus/FdbusParcelable;)V
    .locals 3

    .line 8
    array-length v0, p1

    invoke-direct {p0, v0}, Lipc/fdbus/FdbusSerializer;->writeRawLittleEndian16(I)V

    .line 9
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    .line 10
    invoke-virtual {v2, p0}, Lipc/fdbus/FdbusParcelable;->serialize(Lipc/fdbus/FdbusSerializer;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public in([[B)V
    .locals 3

    .line 4
    array-length v0, p1

    invoke-direct {p0, v0}, Lipc/fdbus/FdbusSerializer;->writeRawLittleEndian16(I)V

    .line 5
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    .line 6
    invoke-virtual {p0, v2}, Lipc/fdbus/FdbusSerializer;->in([B)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public in16(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lipc/fdbus/FdbusSerializer;->writeRawLittleEndian16(I)V

    return-void
.end method

.method public in16([I)V
    .locals 3

    .line 2
    array-length v0, p1

    invoke-direct {p0, v0}, Lipc/fdbus/FdbusSerializer;->writeRawLittleEndian16(I)V

    .line 3
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget v2, p1, v1

    .line 4
    invoke-direct {p0, v2}, Lipc/fdbus/FdbusSerializer;->writeRawLittleEndian16(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public in32(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lipc/fdbus/FdbusSerializer;->writeRawLittleEndian32(I)V

    return-void
.end method

.method public in32([I)V
    .locals 3

    .line 2
    array-length v0, p1

    invoke-direct {p0, v0}, Lipc/fdbus/FdbusSerializer;->writeRawLittleEndian16(I)V

    .line 3
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget v2, p1, v1

    .line 4
    invoke-direct {p0, v2}, Lipc/fdbus/FdbusSerializer;->writeRawLittleEndian32(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public in64(J)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lipc/fdbus/FdbusSerializer;->writeRawLittleEndian64(J)V

    return-void
.end method

.method public in64([J)V
    .locals 4

    .line 2
    array-length v0, p1

    invoke-direct {p0, v0}, Lipc/fdbus/FdbusSerializer;->writeRawLittleEndian16(I)V

    .line 3
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-wide v2, p1, v1

    .line 4
    invoke-direct {p0, v2, v3}, Lipc/fdbus/FdbusSerializer;->writeRawLittleEndian64(J)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public in8(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lipc/fdbus/FdbusSerializer;->writeRaw8(I)V

    return-void
.end method

.method public in8([I)V
    .locals 3

    .line 2
    array-length v0, p1

    invoke-direct {p0, v0}, Lipc/fdbus/FdbusSerializer;->writeRawLittleEndian16(I)V

    .line 3
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget v2, p1, v1

    .line 4
    invoke-direct {p0, v2}, Lipc/fdbus/FdbusSerializer;->writeRaw8(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public inBool(Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lipc/fdbus/FdbusSerializer;->writeRaw8(I)V

    return-void
.end method

.method public inBool([Z)V
    .locals 3

    .line 2
    array-length v0, p1

    invoke-direct {p0, v0}, Lipc/fdbus/FdbusSerializer;->writeRawLittleEndian16(I)V

    .line 3
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-boolean v2, p1, v1

    .line 4
    invoke-direct {p0, v2}, Lipc/fdbus/FdbusSerializer;->writeRaw8(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public inS(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lipc/fdbus/FdbusSerializer;->writeString(Ljava/lang/String;)V

    return-void
.end method

.method public inS([Ljava/lang/String;)V
    .locals 3

    .line 2
    array-length v0, p1

    invoke-direct {p0, v0}, Lipc/fdbus/FdbusSerializer;->writeRawLittleEndian16(I)V

    .line 3
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    .line 4
    invoke-direct {p0, v2}, Lipc/fdbus/FdbusSerializer;->writeString(Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
