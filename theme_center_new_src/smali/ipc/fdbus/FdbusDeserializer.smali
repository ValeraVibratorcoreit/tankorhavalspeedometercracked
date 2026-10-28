.class public Lipc/fdbus/FdbusDeserializer;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final mBuffer:[B

.field private mBufferPos:I

.field private mError:Z


# direct methods
.method public constructor <init>([B)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lipc/fdbus/FdbusDeserializer;->mBufferPos:I

    iput-boolean v0, p0, Lipc/fdbus/FdbusDeserializer;->mError:Z

    iput-object p1, p0, Lipc/fdbus/FdbusDeserializer;->mBuffer:[B

    return-void
.end method

.method private createParcelable(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p1, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    return-object v0
.end method

.method private readDouble()D
    .locals 2

    invoke-direct {p0}, Lipc/fdbus/FdbusDeserializer;->readRawLittleEndian64()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    return-wide v0
.end method

.method private readFloat()F
    .locals 1

    invoke-direct {p0}, Lipc/fdbus/FdbusDeserializer;->readRawLittleEndian32()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    return v0
.end method

.method private readRaw8()I
    .locals 4

    iget v0, p0, Lipc/fdbus/FdbusDeserializer;->mBufferPos:I

    add-int/lit8 v1, v0, 0x1

    iget-object v2, p0, Lipc/fdbus/FdbusDeserializer;->mBuffer:[B

    array-length v3, v2

    if-le v1, v3, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lipc/fdbus/FdbusDeserializer;->mError:Z

    const/4 v0, 0x0

    return v0

    :cond_0
    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lipc/fdbus/FdbusDeserializer;->mBufferPos:I

    aget-byte v0, v2, v0

    return v0
.end method

.method private readRawBytes([B)V
    .locals 4

    iget v0, p0, Lipc/fdbus/FdbusDeserializer;->mBufferPos:I

    array-length v1, p1

    add-int/2addr v1, v0

    iget-object v2, p0, Lipc/fdbus/FdbusDeserializer;->mBuffer:[B

    array-length v3, v2

    if-le v1, v3, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lipc/fdbus/FdbusDeserializer;->mError:Z

    return-void

    :cond_0
    const/4 v1, 0x0

    array-length v3, p1

    invoke-static {v2, v0, p1, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v0, p0, Lipc/fdbus/FdbusDeserializer;->mBufferPos:I

    array-length p1, p1

    add-int/2addr v0, p1

    iput v0, p0, Lipc/fdbus/FdbusDeserializer;->mBufferPos:I

    return-void
.end method

.method private readRawLittleEndian16()I
    .locals 4

    iget v0, p0, Lipc/fdbus/FdbusDeserializer;->mBufferPos:I

    add-int/lit8 v1, v0, 0x2

    iget-object v2, p0, Lipc/fdbus/FdbusDeserializer;->mBuffer:[B

    array-length v3, v2

    if-le v1, v3, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lipc/fdbus/FdbusDeserializer;->mError:Z

    const/4 v0, 0x0

    return v0

    :cond_0
    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lipc/fdbus/FdbusDeserializer;->mBufferPos:I

    aget-byte v3, v2, v0

    add-int/lit8 v0, v0, 0x2

    iput v0, p0, Lipc/fdbus/FdbusDeserializer;->mBufferPos:I

    aget-byte v0, v2, v1

    and-int/lit16 v1, v3, 0xff

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    or-int/2addr v0, v1

    return v0
.end method

.method private readRawLittleEndian32()I
    .locals 6

    iget v0, p0, Lipc/fdbus/FdbusDeserializer;->mBufferPos:I

    add-int/lit8 v1, v0, 0x4

    iget-object v2, p0, Lipc/fdbus/FdbusDeserializer;->mBuffer:[B

    array-length v3, v2

    if-le v1, v3, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lipc/fdbus/FdbusDeserializer;->mError:Z

    const/4 v0, 0x0

    return v0

    :cond_0
    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lipc/fdbus/FdbusDeserializer;->mBufferPos:I

    aget-byte v3, v2, v0

    add-int/lit8 v4, v0, 0x2

    iput v4, p0, Lipc/fdbus/FdbusDeserializer;->mBufferPos:I

    aget-byte v1, v2, v1

    add-int/lit8 v5, v0, 0x3

    iput v5, p0, Lipc/fdbus/FdbusDeserializer;->mBufferPos:I

    aget-byte v4, v2, v4

    add-int/lit8 v0, v0, 0x4

    iput v0, p0, Lipc/fdbus/FdbusDeserializer;->mBufferPos:I

    aget-byte v0, v2, v5

    and-int/lit16 v2, v3, 0xff

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v1, v2

    and-int/lit16 v2, v4, 0xff

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr v1, v2

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    or-int/2addr v0, v1

    return v0
.end method

.method private readRawLittleEndian64()J
    .locals 10

    iget v0, p0, Lipc/fdbus/FdbusDeserializer;->mBufferPos:I

    add-int/lit8 v1, v0, 0x8

    iget-object v2, p0, Lipc/fdbus/FdbusDeserializer;->mBuffer:[B

    array-length v3, v2

    if-le v1, v3, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lipc/fdbus/FdbusDeserializer;->mError:Z

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lipc/fdbus/FdbusDeserializer;->mBufferPos:I

    aget-byte v3, v2, v0

    add-int/lit8 v4, v0, 0x2

    iput v4, p0, Lipc/fdbus/FdbusDeserializer;->mBufferPos:I

    aget-byte v1, v2, v1

    add-int/lit8 v5, v0, 0x3

    iput v5, p0, Lipc/fdbus/FdbusDeserializer;->mBufferPos:I

    aget-byte v4, v2, v4

    add-int/lit8 v6, v0, 0x4

    iput v6, p0, Lipc/fdbus/FdbusDeserializer;->mBufferPos:I

    aget-byte v5, v2, v5

    add-int/lit8 v7, v0, 0x5

    iput v7, p0, Lipc/fdbus/FdbusDeserializer;->mBufferPos:I

    aget-byte v6, v2, v6

    add-int/lit8 v8, v0, 0x6

    iput v8, p0, Lipc/fdbus/FdbusDeserializer;->mBufferPos:I

    aget-byte v7, v2, v7

    add-int/lit8 v9, v0, 0x7

    iput v9, p0, Lipc/fdbus/FdbusDeserializer;->mBufferPos:I

    aget-byte v8, v2, v8

    add-int/lit8 v0, v0, 0x8

    iput v0, p0, Lipc/fdbus/FdbusDeserializer;->mBufferPos:I

    aget-byte v0, v2, v9

    and-int/lit16 v2, v3, 0xff

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    or-int/2addr v1, v2

    and-int/lit16 v2, v4, 0xff

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr v1, v2

    and-int/lit16 v2, v5, 0xff

    shl-int/lit8 v2, v2, 0x18

    or-int/2addr v1, v2

    and-int/lit16 v2, v6, 0xff

    shl-int/lit8 v2, v2, 0x20

    or-int/2addr v1, v2

    and-int/lit16 v2, v7, 0xff

    shl-int/lit8 v2, v2, 0x28

    or-int/2addr v1, v2

    and-int/lit16 v2, v8, 0xff

    shl-int/lit8 v2, v2, 0x30

    or-int/2addr v1, v2

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x38

    or-int/2addr v0, v1

    int-to-long v0, v0

    return-wide v0
.end method

.method private readString()Ljava/lang/String;
    .locals 6

    invoke-direct {p0}, Lipc/fdbus/FdbusDeserializer;->readRawLittleEndian16()I

    move-result v0

    iget v1, p0, Lipc/fdbus/FdbusDeserializer;->mBufferPos:I

    add-int v2, v1, v0

    iget-object v3, p0, Lipc/fdbus/FdbusDeserializer;->mBuffer:[B

    array-length v4, v3

    const/4 v5, 0x1

    if-gt v2, v4, :cond_0

    if-lez v0, :cond_0

    add-int v2, v1, v0

    sub-int/2addr v2, v5

    aget-byte v2, v3, v2

    if-nez v2, :cond_0

    new-instance v2, Ljava/lang/String;

    add-int/lit8 v4, v0, -0x1

    invoke-direct {v2, v3, v1, v4}, Ljava/lang/String;-><init>([BII)V

    iget v1, p0, Lipc/fdbus/FdbusDeserializer;->mBufferPos:I

    add-int/2addr v1, v0

    iput v1, p0, Lipc/fdbus/FdbusDeserializer;->mBufferPos:I

    return-object v2

    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0}, Ljava/lang/String;-><init>()V

    iput-boolean v5, p0, Lipc/fdbus/FdbusDeserializer;->mError:Z

    return-object v0
.end method


# virtual methods
.method public arrayLength()I
    .locals 1

    invoke-direct {p0}, Lipc/fdbus/FdbusDeserializer;->readRawLittleEndian16()I

    move-result v0

    return v0
.end method

.method public getBuffer()[B
    .locals 1

    iget-object v0, p0, Lipc/fdbus/FdbusDeserializer;->mBuffer:[B

    return-object v0
.end method

.method public getPosition()I
    .locals 1

    iget v0, p0, Lipc/fdbus/FdbusDeserializer;->mBufferPos:I

    return v0
.end method

.method public isAtEnd()Z
    .locals 2

    iget v0, p0, Lipc/fdbus/FdbusDeserializer;->mBufferPos:I

    iget-object v1, p0, Lipc/fdbus/FdbusDeserializer;->mBuffer:[B

    array-length v1, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public out(Ljava/lang/Class;)Lipc/fdbus/FdbusParcelable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lipc/fdbus/FdbusParcelable;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lipc/fdbus/FdbusDeserializer;->createParcelable(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lipc/fdbus/FdbusParcelable;

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1, p0}, Lipc/fdbus/FdbusParcelable;->deserialize(Lipc/fdbus/FdbusDeserializer;)V

    :cond_0
    return-object p1
.end method

.method public out([Ljava/lang/Object;Ljava/lang/Class;)[Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;",
            "Ljava/lang/Class<",
            "TT;>;)[TT;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 3
    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_0

    invoke-direct {p0, p2}, Lipc/fdbus/FdbusDeserializer;->createParcelable(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 4
    move-object v2, v1

    check-cast v2, Lipc/fdbus/FdbusParcelable;

    .line 5
    invoke-virtual {v2, p0}, Lipc/fdbus/FdbusParcelable;->deserialize(Lipc/fdbus/FdbusDeserializer;)V

    .line 6
    aput-object v1, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-object p1
.end method

.method public out16()I
    .locals 1

    invoke-direct {p0}, Lipc/fdbus/FdbusDeserializer;->readRawLittleEndian16()I

    move-result v0

    return v0
.end method

.method public out16A()[I
    .locals 5

    invoke-direct {p0}, Lipc/fdbus/FdbusDeserializer;->readRawLittleEndian16()I

    move-result v0

    new-array v1, v0, [I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-direct {p0}, Lipc/fdbus/FdbusDeserializer;->readRawLittleEndian16()I

    move-result v3

    iget-boolean v4, p0, Lipc/fdbus/FdbusDeserializer;->mError:Z

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    aput v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-object v1
.end method

.method public out32()I
    .locals 1

    invoke-direct {p0}, Lipc/fdbus/FdbusDeserializer;->readRawLittleEndian32()I

    move-result v0

    return v0
.end method

.method public out32A()[I
    .locals 5

    invoke-direct {p0}, Lipc/fdbus/FdbusDeserializer;->readRawLittleEndian16()I

    move-result v0

    new-array v1, v0, [I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-direct {p0}, Lipc/fdbus/FdbusDeserializer;->readRawLittleEndian32()I

    move-result v3

    iget-boolean v4, p0, Lipc/fdbus/FdbusDeserializer;->mError:Z

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    aput v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-object v1
.end method

.method public out64()J
    .locals 2

    invoke-direct {p0}, Lipc/fdbus/FdbusDeserializer;->readRawLittleEndian64()J

    move-result-wide v0

    return-wide v0
.end method

.method public out64A()[J
    .locals 6

    invoke-direct {p0}, Lipc/fdbus/FdbusDeserializer;->readRawLittleEndian16()I

    move-result v0

    new-array v1, v0, [J

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-direct {p0}, Lipc/fdbus/FdbusDeserializer;->readRawLittleEndian64()J

    move-result-wide v3

    iget-boolean v5, p0, Lipc/fdbus/FdbusDeserializer;->mError:Z

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    aput-wide v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-object v1
.end method

.method public out8()I
    .locals 1

    invoke-direct {p0}, Lipc/fdbus/FdbusDeserializer;->readRaw8()I

    move-result v0

    return v0
.end method

.method public out8A()[I
    .locals 5

    invoke-direct {p0}, Lipc/fdbus/FdbusDeserializer;->readRawLittleEndian16()I

    move-result v0

    new-array v1, v0, [I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-direct {p0}, Lipc/fdbus/FdbusDeserializer;->readRaw8()I

    move-result v3

    iget-boolean v4, p0, Lipc/fdbus/FdbusDeserializer;->mError:Z

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    aput v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-object v1
.end method

.method public outBA()[B
    .locals 2

    iget-boolean v0, p0, Lipc/fdbus/FdbusDeserializer;->mError:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-array v0, v1, [B

    return-object v0

    :cond_0
    invoke-direct {p0}, Lipc/fdbus/FdbusDeserializer;->readRawLittleEndian32()I

    move-result v0

    :try_start_0
    new-array v0, v0, [B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    new-array v0, v1, [B

    return-object v0

    :cond_1
    invoke-direct {p0, v0}, Lipc/fdbus/FdbusDeserializer;->readRawBytes([B)V

    return-object v0
.end method

.method public outBAA()[[B
    .locals 4

    iget-boolean v0, p0, Lipc/fdbus/FdbusDeserializer;->mError:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-array v0, v1, [B

    filled-new-array {v0}, [[B

    move-result-object v0

    return-object v0

    :cond_0
    invoke-direct {p0}, Lipc/fdbus/FdbusDeserializer;->readRawLittleEndian16()I

    move-result v0

    const/4 v2, 0x1

    :try_start_0
    new-array v2, v2, [[B

    new-array v3, v0, [B

    aput-object v3, v2, v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_1

    new-array v0, v1, [B

    filled-new-array {v0}, [[B

    move-result-object v0

    return-object v0

    :cond_1
    :goto_1
    if-ge v1, v0, :cond_2

    invoke-virtual {p0}, Lipc/fdbus/FdbusDeserializer;->outBA()[B

    move-result-object v3

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return-object v2
.end method

.method public outBool()Z
    .locals 1

    invoke-direct {p0}, Lipc/fdbus/FdbusDeserializer;->readRaw8()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public outBoolA()[Z
    .locals 6

    invoke-direct {p0}, Lipc/fdbus/FdbusDeserializer;->readRawLittleEndian16()I

    move-result v0

    new-array v1, v0, [Z

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_2

    invoke-direct {p0}, Lipc/fdbus/FdbusDeserializer;->readRaw8()I

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x1

    goto :goto_1

    :cond_0
    move v4, v2

    :goto_1
    iget-boolean v5, p0, Lipc/fdbus/FdbusDeserializer;->mError:Z

    if-eqz v5, :cond_1

    goto :goto_2

    :cond_1
    aput-boolean v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    :goto_2
    return-object v1
.end method

.method public outS()Ljava/lang/String;
    .locals 1

    invoke-direct {p0}, Lipc/fdbus/FdbusDeserializer;->readString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public outSA()[Ljava/lang/String;
    .locals 5

    invoke-direct {p0}, Lipc/fdbus/FdbusDeserializer;->readRawLittleEndian16()I

    move-result v0

    new-array v1, v0, [Ljava/lang/String;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-direct {p0}, Lipc/fdbus/FdbusDeserializer;->readString()Ljava/lang/String;

    move-result-object v3

    iget-boolean v4, p0, Lipc/fdbus/FdbusDeserializer;->mError:Z

    if-eqz v4, :cond_0

    goto :goto_1

    :cond_0
    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-object v1
.end method
