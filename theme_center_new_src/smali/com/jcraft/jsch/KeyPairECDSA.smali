.class public Lcom/jcraft/jsch/KeyPairECDSA;
.super Lcom/jcraft/jsch/KeyPair;
.source "SourceFile"


# static fields
.field private static final begin:[B

.field private static final end:[B

.field private static names:[Ljava/lang/String;

.field private static oids:[[B


# instance fields
.field private key_size:I

.field private name:[B

.field private prv_array:[B

.field private r_array:[B

.field private s_array:[B


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x7

    const/16 v1, 0xa

    new-array v1, v1, [B

    fill-array-data v1, :array_0

    new-array v2, v0, [B

    fill-array-data v2, :array_1

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    filled-new-array {v1, v2, v0}, [[B

    move-result-object v0

    sput-object v0, Lcom/jcraft/jsch/KeyPairECDSA;->oids:[[B

    const-string v0, "nistp384"

    const-string v1, "nistp521"

    const-string v2, "nistp256"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/jcraft/jsch/KeyPairECDSA;->names:[Ljava/lang/String;

    const-string v0, "-----BEGIN EC PRIVATE KEY-----"

    invoke-static {v0}, Lcom/jcraft/jsch/Util;->str2byte(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Lcom/jcraft/jsch/KeyPairECDSA;->begin:[B

    const-string v0, "-----END EC PRIVATE KEY-----"

    invoke-static {v0}, Lcom/jcraft/jsch/Util;->str2byte(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Lcom/jcraft/jsch/KeyPairECDSA;->end:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x6t
        0x8t
        0x2at
        -0x7at
        0x48t
        -0x32t
        0x3dt
        0x3t
        0x1t
        0x7t
    .end array-data

    nop

    :array_1
    .array-data 1
        0x6t
        0x5t
        0x2bt
        -0x7ft
        0x4t
        0x0t
        0x22t
    .end array-data

    :array_2
    .array-data 1
        0x6t
        0x5t
        0x2bt
        -0x7ft
        0x4t
        0x0t
        0x23t
    .end array-data
.end method

.method public constructor <init>(Lcom/jcraft/jsch/JSch;)V
    .locals 6

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    .line 1
    invoke-direct/range {v0 .. v5}, Lcom/jcraft/jsch/KeyPairECDSA;-><init>(Lcom/jcraft/jsch/JSch;[B[B[B[B)V

    return-void
.end method

.method public constructor <init>(Lcom/jcraft/jsch/JSch;[B)V
    .locals 6

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    .line 2
    invoke-direct/range {v0 .. v5}, Lcom/jcraft/jsch/KeyPairECDSA;-><init>(Lcom/jcraft/jsch/JSch;[B[B[B[B)V

    if-eqz p2, :cond_1

    const/16 p1, 0x8

    .line 3
    new-array v0, p1, [B

    const/16 v1, 0xb

    const/4 v2, 0x0

    .line 4
    invoke-static {p2, v1, v0, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 5
    const-string p1, "nistp384"

    invoke-static {p1}, Lcom/jcraft/jsch/Util;->str2byte(Ljava/lang/String;)[B

    move-result-object p1

    invoke-static {v0, p1}, Lcom/jcraft/jsch/Util;->array_equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x180

    .line 6
    iput p1, p0, Lcom/jcraft/jsch/KeyPairECDSA;->key_size:I

    .line 7
    iput-object v0, p0, Lcom/jcraft/jsch/KeyPairECDSA;->name:[B

    .line 8
    :cond_0
    const-string p1, "nistp521"

    invoke-static {p1}, Lcom/jcraft/jsch/Util;->str2byte(Ljava/lang/String;)[B

    move-result-object p1

    invoke-static {v0, p1}, Lcom/jcraft/jsch/Util;->array_equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 p1, 0x209

    .line 9
    iput p1, p0, Lcom/jcraft/jsch/KeyPairECDSA;->key_size:I

    .line 10
    iput-object v0, p0, Lcom/jcraft/jsch/KeyPairECDSA;->name:[B

    :cond_1
    return-void
.end method

.method public constructor <init>(Lcom/jcraft/jsch/JSch;[B[B[B[B)V
    .locals 1

    .line 11
    invoke-direct {p0, p1}, Lcom/jcraft/jsch/KeyPair;-><init>(Lcom/jcraft/jsch/JSch;)V

    .line 12
    sget-object p1, Lcom/jcraft/jsch/KeyPairECDSA;->names:[Ljava/lang/String;

    const/4 v0, 0x0

    aget-object p1, p1, v0

    invoke-static {p1}, Lcom/jcraft/jsch/Util;->str2byte(Ljava/lang/String;)[B

    move-result-object p1

    iput-object p1, p0, Lcom/jcraft/jsch/KeyPairECDSA;->name:[B

    const/16 p1, 0x100

    .line 13
    iput p1, p0, Lcom/jcraft/jsch/KeyPairECDSA;->key_size:I

    if-eqz p2, :cond_0

    .line 14
    iput-object p2, p0, Lcom/jcraft/jsch/KeyPairECDSA;->name:[B

    .line 15
    :cond_0
    iput-object p3, p0, Lcom/jcraft/jsch/KeyPairECDSA;->r_array:[B

    .line 16
    iput-object p4, p0, Lcom/jcraft/jsch/KeyPairECDSA;->s_array:[B

    .line 17
    iput-object p5, p0, Lcom/jcraft/jsch/KeyPairECDSA;->prv_array:[B

    if-eqz p5, :cond_3

    .line 18
    array-length p2, p5

    const/16 p3, 0x40

    if-lt p2, p3, :cond_1

    const/16 p1, 0x209

    goto :goto_0

    :cond_1
    array-length p2, p5

    const/16 p3, 0x30

    if-lt p2, p3, :cond_2

    const/16 p1, 0x180

    :cond_2
    :goto_0
    iput p1, p0, Lcom/jcraft/jsch/KeyPairECDSA;->key_size:I

    :cond_3
    return-void
.end method

.method public static fromPoint([B)[[B
    .locals 6

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    aget-byte v2, p0, v1

    const/4 v3, 0x4

    if-eq v2, v3, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    array-length v2, p0

    sub-int/2addr v2, v1

    div-int/lit8 v2, v2, 0x2

    new-array v3, v2, [B

    array-length v4, p0

    sub-int/2addr v4, v1

    div-int/lit8 v4, v4, 0x2

    new-array v5, v4, [B

    invoke-static {p0, v1, v3, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v1, v2

    invoke-static {p0, v1, v5, v0, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    filled-new-array {v3, v5}, [[B

    move-result-object p0

    return-object p0
.end method

.method public static fromSSHAgent(Lcom/jcraft/jsch/JSch;Lcom/jcraft/jsch/Buffer;)Lcom/jcraft/jsch/KeyPair;
    .locals 8

    const/4 v0, 0x5

    const-string v1, "invalid key format"

    invoke-virtual {p1, v0, v1}, Lcom/jcraft/jsch/Buffer;->getBytes(ILjava/lang/String;)[[B

    move-result-object p1

    const/4 v0, 0x1

    aget-object v3, p1, v0

    const/4 v1, 0x2

    aget-object v1, p1, v1

    invoke-static {v1}, Lcom/jcraft/jsch/KeyPairECDSA;->fromPoint([B)[[B

    move-result-object v1

    const/4 v7, 0x0

    aget-object v4, v1, v7

    aget-object v5, v1, v0

    const/4 v0, 0x3

    aget-object v6, p1, v0

    new-instance v0, Lcom/jcraft/jsch/KeyPairECDSA;

    move-object v1, v0

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Lcom/jcraft/jsch/KeyPairECDSA;-><init>(Lcom/jcraft/jsch/JSch;[B[B[B[B)V

    new-instance p0, Ljava/lang/String;

    const/4 v1, 0x4

    aget-object p1, p1, v1

    invoke-direct {p0, p1}, Ljava/lang/String;-><init>([B)V

    iput-object p0, v0, Lcom/jcraft/jsch/KeyPair;->publicKeyComment:Ljava/lang/String;

    iput v7, v0, Lcom/jcraft/jsch/KeyPair;->vendor:I

    return-object v0
.end method

.method public static toPoint([B[B)[B
    .locals 4

    array-length v0, p0

    const/4 v1, 0x1

    add-int/2addr v0, v1

    array-length v2, p1

    add-int/2addr v0, v2

    new-array v0, v0, [B

    const/4 v2, 0x4

    const/4 v3, 0x0

    aput-byte v2, v0, v3

    array-length v2, p0

    invoke-static {p0, v3, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length p0, p0

    add-int/2addr p0, v1

    array-length v1, p1

    invoke-static {p1, v3, v0, p0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method


# virtual methods
.method public dispose()V
    .locals 1

    invoke-super {p0}, Lcom/jcraft/jsch/KeyPair;->dispose()V

    iget-object v0, p0, Lcom/jcraft/jsch/KeyPairECDSA;->prv_array:[B

    invoke-static {v0}, Lcom/jcraft/jsch/Util;->bzero([B)V

    return-void
.end method

.method public forSSHAgent()[B
    .locals 4

    invoke-virtual {p0}, Lcom/jcraft/jsch/KeyPair;->isEncrypted()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/jcraft/jsch/Buffer;

    invoke-direct {v0}, Lcom/jcraft/jsch/Buffer;-><init>()V

    new-instance v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/jcraft/jsch/KeyPairECDSA;->name:[B

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V

    const-string v2, "ecdsa-sha2-"

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/jcraft/jsch/Util;->str2byte(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jcraft/jsch/Buffer;->putString([B)V

    iget-object v1, p0, Lcom/jcraft/jsch/KeyPairECDSA;->name:[B

    invoke-virtual {v0, v1}, Lcom/jcraft/jsch/Buffer;->putString([B)V

    iget-object v1, p0, Lcom/jcraft/jsch/KeyPairECDSA;->r_array:[B

    iget-object v2, p0, Lcom/jcraft/jsch/KeyPairECDSA;->s_array:[B

    invoke-static {v1, v2}, Lcom/jcraft/jsch/KeyPairECDSA;->toPoint([B[B)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jcraft/jsch/Buffer;->putString([B)V

    iget-object v1, p0, Lcom/jcraft/jsch/KeyPairECDSA;->prv_array:[B

    invoke-virtual {v0, v1}, Lcom/jcraft/jsch/Buffer;->putString([B)V

    iget-object v1, p0, Lcom/jcraft/jsch/KeyPair;->publicKeyComment:Ljava/lang/String;

    invoke-static {v1}, Lcom/jcraft/jsch/Util;->str2byte(Ljava/lang/String;)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/jcraft/jsch/Buffer;->putString([B)V

    invoke-virtual {v0}, Lcom/jcraft/jsch/Buffer;->getLength()I

    move-result v1

    new-array v2, v1, [B

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3, v1}, Lcom/jcraft/jsch/Buffer;->getByte([BII)V

    return-object v2

    :cond_0
    new-instance v0, Lcom/jcraft/jsch/JSchException;

    const-string v1, "key is encrypted."

    invoke-direct {v0, v1}, Lcom/jcraft/jsch/JSchException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public generate(I)V
    .locals 3

    iput p1, p0, Lcom/jcraft/jsch/KeyPairECDSA;->key_size:I

    :try_start_0
    const-string v0, "keypairgen.ecdsa"

    invoke-static {v0}, Lcom/jcraft/jsch/JSch;->getConfig(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jcraft/jsch/KeyPairGenECDSA;

    invoke-interface {v0, p1}, Lcom/jcraft/jsch/KeyPairGenECDSA;->init(I)V

    invoke-interface {v0}, Lcom/jcraft/jsch/KeyPairGenECDSA;->getD()[B

    move-result-object p1

    iput-object p1, p0, Lcom/jcraft/jsch/KeyPairECDSA;->prv_array:[B

    invoke-interface {v0}, Lcom/jcraft/jsch/KeyPairGenECDSA;->getR()[B

    move-result-object p1

    iput-object p1, p0, Lcom/jcraft/jsch/KeyPairECDSA;->r_array:[B

    invoke-interface {v0}, Lcom/jcraft/jsch/KeyPairGenECDSA;->getS()[B

    move-result-object p1

    iput-object p1, p0, Lcom/jcraft/jsch/KeyPairECDSA;->s_array:[B

    sget-object p1, Lcom/jcraft/jsch/KeyPairECDSA;->names:[Ljava/lang/String;

    iget-object v0, p0, Lcom/jcraft/jsch/KeyPairECDSA;->prv_array:[B

    array-length v1, v0

    const/16 v2, 0x40

    if-lt v1, v2, :cond_0

    const/4 v0, 0x2

    goto :goto_0

    :cond_0
    array-length v0, v0

    const/16 v1, 0x30

    if-lt v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    aget-object p1, p1, v0

    invoke-static {p1}, Lcom/jcraft/jsch/Util;->str2byte(Ljava/lang/String;)[B

    move-result-object p1

    iput-object p1, p0, Lcom/jcraft/jsch/KeyPairECDSA;->name:[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lcom/jcraft/jsch/JSchException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/jcraft/jsch/JSchException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public getBegin()[B
    .locals 1

    sget-object v0, Lcom/jcraft/jsch/KeyPairECDSA;->begin:[B

    return-object v0
.end method

.method public getEnd()[B
    .locals 1

    sget-object v0, Lcom/jcraft/jsch/KeyPairECDSA;->end:[B

    return-object v0
.end method

.method public getKeySize()I
    .locals 1

    iget v0, p0, Lcom/jcraft/jsch/KeyPairECDSA;->key_size:I

    return v0
.end method

.method public getKeyType()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public getKeyTypeName()[B
    .locals 2

    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/jcraft/jsch/KeyPairECDSA;->name:[B

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V

    const-string v1, "ecdsa-sha2-"

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/jcraft/jsch/Util;->str2byte(Ljava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method

.method public getPrivateKey()[B
    .locals 11

    const/4 v0, 0x1

    new-array v1, v0, [B

    const/4 v2, 0x0

    aput-byte v0, v1, v2

    sget-object v3, Lcom/jcraft/jsch/KeyPairECDSA;->oids:[[B

    iget-object v4, p0, Lcom/jcraft/jsch/KeyPairECDSA;->r_array:[B

    array-length v5, v4

    const/16 v6, 0x40

    const/4 v7, 0x2

    if-lt v5, v6, :cond_0

    move v5, v7

    goto :goto_0

    :cond_0
    array-length v5, v4

    const/16 v6, 0x30

    if-lt v5, v6, :cond_1

    move v5, v0

    goto :goto_0

    :cond_1
    move v5, v2

    :goto_0
    aget-object v3, v3, v5

    iget-object v5, p0, Lcom/jcraft/jsch/KeyPairECDSA;->s_array:[B

    invoke-static {v4, v5}, Lcom/jcraft/jsch/KeyPairECDSA;->toPoint([B[B)[B

    move-result-object v4

    array-length v5, v4

    add-int/2addr v5, v0

    and-int/lit16 v5, v5, 0x80

    const/4 v6, 0x3

    if-nez v5, :cond_2

    move v5, v6

    goto :goto_1

    :cond_2
    const/4 v5, 0x4

    :goto_1
    array-length v8, v4

    add-int/2addr v8, v5

    new-array v9, v8, [B

    array-length v10, v4

    invoke-static {v4, v2, v9, v5, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aput-byte v6, v9, v2

    if-ne v5, v6, :cond_3

    array-length v4, v4

    add-int/2addr v4, v0

    int-to-byte v4, v4

    aput-byte v4, v9, v0

    goto :goto_2

    :cond_3
    const/16 v5, -0x7f

    aput-byte v5, v9, v0

    array-length v4, v4

    add-int/2addr v4, v0

    int-to-byte v4, v4

    aput-byte v4, v9, v7

    :goto_2
    invoke-virtual {p0, v0}, Lcom/jcraft/jsch/KeyPair;->countLength(I)I

    move-result v4

    add-int/2addr v4, v6

    iget-object v5, p0, Lcom/jcraft/jsch/KeyPairECDSA;->prv_array:[B

    array-length v5, v5

    invoke-virtual {p0, v5}, Lcom/jcraft/jsch/KeyPair;->countLength(I)I

    move-result v5

    add-int/2addr v5, v4

    iget-object v4, p0, Lcom/jcraft/jsch/KeyPairECDSA;->prv_array:[B

    array-length v4, v4

    add-int/2addr v5, v4

    add-int/2addr v5, v0

    array-length v4, v3

    invoke-virtual {p0, v4}, Lcom/jcraft/jsch/KeyPair;->countLength(I)I

    move-result v4

    add-int/2addr v4, v5

    array-length v5, v3

    add-int/2addr v4, v5

    add-int/2addr v4, v0

    invoke-virtual {p0, v8}, Lcom/jcraft/jsch/KeyPair;->countLength(I)I

    move-result v5

    add-int/2addr v5, v4

    add-int/2addr v5, v8

    invoke-virtual {p0, v5}, Lcom/jcraft/jsch/KeyPair;->countLength(I)I

    move-result v4

    add-int/2addr v4, v0

    add-int/2addr v4, v5

    new-array v0, v4, [B

    invoke-virtual {p0, v0, v2, v5}, Lcom/jcraft/jsch/KeyPair;->writeSEQUENCE([BII)I

    move-result v2

    invoke-virtual {p0, v0, v2, v1}, Lcom/jcraft/jsch/KeyPair;->writeINTEGER([BI[B)I

    move-result v1

    iget-object v2, p0, Lcom/jcraft/jsch/KeyPairECDSA;->prv_array:[B

    invoke-virtual {p0, v0, v1, v2}, Lcom/jcraft/jsch/KeyPair;->writeOCTETSTRING([BI[B)I

    move-result v1

    const/16 v2, -0x60

    invoke-virtual {p0, v0, v2, v1, v3}, Lcom/jcraft/jsch/KeyPair;->writeDATA([BBI[B)I

    move-result v1

    const/16 v2, -0x5f

    invoke-virtual {p0, v0, v2, v1, v9}, Lcom/jcraft/jsch/KeyPair;->writeDATA([BBI[B)I

    return-object v0
.end method

.method public getPublicKeyBlob()[B
    .locals 7

    invoke-super {p0}, Lcom/jcraft/jsch/KeyPair;->getPublicKeyBlob()[B

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/jcraft/jsch/KeyPairECDSA;->r_array:[B

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lcom/jcraft/jsch/KeyPairECDSA;->name:[B

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V

    const-string v1, "ecdsa-sha2-"

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/jcraft/jsch/Util;->str2byte(Ljava/lang/String;)[B

    move-result-object v0

    iget-object v1, p0, Lcom/jcraft/jsch/KeyPairECDSA;->name:[B

    iget-object v2, p0, Lcom/jcraft/jsch/KeyPairECDSA;->r_array:[B

    array-length v3, v2

    const/4 v4, 0x1

    add-int/2addr v3, v4

    iget-object v5, p0, Lcom/jcraft/jsch/KeyPairECDSA;->s_array:[B

    array-length v5, v5

    add-int/2addr v3, v5

    new-array v3, v3, [B

    filled-new-array {v0, v1, v3}, [[B

    move-result-object v0

    const/4 v1, 0x2

    aget-object v3, v0, v1

    const/4 v5, 0x4

    const/4 v6, 0x0

    aput-byte v5, v3, v6

    array-length v5, v2

    invoke-static {v2, v6, v3, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v2, p0, Lcom/jcraft/jsch/KeyPairECDSA;->s_array:[B

    aget-object v1, v0, v1

    iget-object v3, p0, Lcom/jcraft/jsch/KeyPairECDSA;->r_array:[B

    array-length v3, v3

    add-int/2addr v3, v4

    array-length v4, v2

    invoke-static {v2, v6, v1, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v0}, Lcom/jcraft/jsch/Buffer;->fromBytes([[B)Lcom/jcraft/jsch/Buffer;

    move-result-object v0

    iget-object v0, v0, Lcom/jcraft/jsch/Buffer;->buffer:[B

    return-object v0
.end method

.method public getSignature([B)[B
    .locals 3

    const-string v0, "ecdsa-sha2-"

    :try_start_0
    new-instance v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/jcraft/jsch/KeyPairECDSA;->name:[B

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/jcraft/jsch/JSch;->getConfig(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jcraft/jsch/SignatureECDSA;

    invoke-interface {v1}, Lcom/jcraft/jsch/Signature;->init()V

    iget-object v2, p0, Lcom/jcraft/jsch/KeyPairECDSA;->prv_array:[B

    invoke-interface {v1, v2}, Lcom/jcraft/jsch/SignatureECDSA;->setPrvKey([B)V

    invoke-interface {v1, p1}, Lcom/jcraft/jsch/Signature;->update([B)V

    invoke-interface {v1}, Lcom/jcraft/jsch/Signature;->sign()[B

    move-result-object p1

    new-instance v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/jcraft/jsch/KeyPairECDSA;->name:[B

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/jcraft/jsch/Util;->str2byte(Ljava/lang/String;)[B

    move-result-object v0

    filled-new-array {v0, p1}, [[B

    move-result-object p1

    invoke-static {p1}, Lcom/jcraft/jsch/Buffer;->fromBytes([[B)Lcom/jcraft/jsch/Buffer;

    move-result-object p1

    iget-object p1, p1, Lcom/jcraft/jsch/Buffer;->buffer:[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getVerifier()Lcom/jcraft/jsch/Signature;
    .locals 3

    const-string v0, "ecdsa-sha2-"

    :try_start_0
    new-instance v1, Ljava/lang/String;

    iget-object v2, p0, Lcom/jcraft/jsch/KeyPairECDSA;->name:[B

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([B)V

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/jcraft/jsch/JSch;->getConfig(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jcraft/jsch/SignatureECDSA;

    invoke-interface {v0}, Lcom/jcraft/jsch/Signature;->init()V

    iget-object v1, p0, Lcom/jcraft/jsch/KeyPairECDSA;->r_array:[B

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/jcraft/jsch/KeyPairECDSA;->s_array:[B

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lcom/jcraft/jsch/KeyPairECDSA;->getPublicKeyBlob()[B

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v1, Lcom/jcraft/jsch/Buffer;

    invoke-virtual {p0}, Lcom/jcraft/jsch/KeyPairECDSA;->getPublicKeyBlob()[B

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/jcraft/jsch/Buffer;-><init>([B)V

    invoke-virtual {v1}, Lcom/jcraft/jsch/Buffer;->getString()[B

    invoke-virtual {v1}, Lcom/jcraft/jsch/Buffer;->getString()[B

    invoke-virtual {v1}, Lcom/jcraft/jsch/Buffer;->getString()[B

    move-result-object v1

    invoke-static {v1}, Lcom/jcraft/jsch/KeyPairECDSA;->fromPoint([B)[[B

    move-result-object v1

    const/4 v2, 0x0

    aget-object v2, v1, v2

    iput-object v2, p0, Lcom/jcraft/jsch/KeyPairECDSA;->r_array:[B

    const/4 v2, 0x1

    aget-object v1, v1, v2

    iput-object v1, p0, Lcom/jcraft/jsch/KeyPairECDSA;->s_array:[B

    :cond_0
    iget-object v1, p0, Lcom/jcraft/jsch/KeyPairECDSA;->r_array:[B

    iget-object v2, p0, Lcom/jcraft/jsch/KeyPairECDSA;->s_array:[B

    invoke-interface {v0, v1, v2}, Lcom/jcraft/jsch/SignatureECDSA;->setPubKey([B[B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public parse([B)Z
    .locals 9

    const/4 v0, 0x0

    :try_start_0
    iget v1, p0, Lcom/jcraft/jsch/KeyPair;->vendor:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    return v0

    :cond_0
    const/4 v3, 0x2

    if-ne v1, v3, :cond_1

    return v0

    :cond_1
    aget-byte v1, p1, v0

    const/16 v4, 0x30

    if-eq v1, v4, :cond_2

    return v0

    :cond_2
    aget-byte v1, p1, v2

    and-int/lit16 v5, v1, 0x80

    if-eqz v5, :cond_3

    and-int/lit8 v1, v1, 0x7f

    move v5, v3

    :goto_0
    add-int/lit8 v6, v1, -0x1

    if-lez v1, :cond_4

    add-int/lit8 v1, v5, 0x1

    aget-byte v5, p1, v5

    move v5, v1

    move v1, v6

    goto :goto_0

    :cond_3
    move v5, v3

    :cond_4
    aget-byte v1, p1, v5

    if-eq v1, v3, :cond_5

    return v0

    :cond_5
    add-int/lit8 v1, v5, 0x1

    add-int/2addr v5, v3

    aget-byte v1, p1, v1

    and-int/lit16 v6, v1, 0xff

    and-int/lit16 v7, v1, 0x80

    if-eqz v7, :cond_6

    and-int/lit8 v1, v1, 0x7f

    move v6, v0

    :goto_1
    add-int/lit8 v7, v1, -0x1

    if-lez v1, :cond_6

    shl-int/lit8 v1, v6, 0x8

    add-int/lit8 v6, v5, 0x1

    aget-byte v5, p1, v5

    and-int/lit16 v5, v5, 0xff

    add-int/2addr v1, v5

    move v5, v6

    move v6, v1

    move v1, v7

    goto :goto_1

    :cond_6
    add-int/2addr v5, v6

    add-int/lit8 v1, v5, 0x1

    add-int/2addr v5, v3

    aget-byte v1, p1, v1

    and-int/lit16 v6, v1, 0xff

    and-int/lit16 v7, v1, 0x80

    if-eqz v7, :cond_7

    and-int/lit8 v1, v1, 0x7f

    move v6, v0

    :goto_2
    add-int/lit8 v7, v1, -0x1

    if-lez v1, :cond_7

    shl-int/lit8 v1, v6, 0x8

    add-int/lit8 v6, v5, 0x1

    aget-byte v5, p1, v5

    and-int/lit16 v5, v5, 0xff

    add-int/2addr v1, v5

    move v5, v6

    move v6, v1

    move v1, v7

    goto :goto_2

    :cond_7
    new-array v1, v6, [B

    iput-object v1, p0, Lcom/jcraft/jsch/KeyPairECDSA;->prv_array:[B

    invoke-static {p1, v5, v1, v0, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v5, v6

    add-int/lit8 v1, v5, 0x1

    add-int/2addr v5, v3

    aget-byte v1, p1, v1

    and-int/lit16 v6, v1, 0xff

    and-int/lit16 v7, v1, 0x80

    if-eqz v7, :cond_8

    and-int/lit8 v1, v1, 0x7f

    move v6, v0

    :goto_3
    add-int/lit8 v7, v1, -0x1

    if-lez v1, :cond_8

    shl-int/lit8 v1, v6, 0x8

    add-int/lit8 v6, v5, 0x1

    aget-byte v5, p1, v5

    and-int/lit16 v5, v5, 0xff

    add-int/2addr v1, v5

    move v5, v6

    move v6, v1

    move v1, v7

    goto :goto_3

    :cond_8
    new-array v1, v6, [B

    invoke-static {p1, v5, v1, v0, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v5, v6

    move v6, v0

    :goto_4
    sget-object v7, Lcom/jcraft/jsch/KeyPairECDSA;->oids:[[B

    array-length v8, v7

    if-ge v6, v8, :cond_a

    aget-object v7, v7, v6

    invoke-static {v7, v1}, Lcom/jcraft/jsch/Util;->array_equals([B[B)Z

    move-result v7

    if-eqz v7, :cond_9

    sget-object v1, Lcom/jcraft/jsch/KeyPairECDSA;->names:[Ljava/lang/String;

    aget-object v1, v1, v6

    invoke-static {v1}, Lcom/jcraft/jsch/Util;->str2byte(Ljava/lang/String;)[B

    move-result-object v1

    iput-object v1, p0, Lcom/jcraft/jsch/KeyPairECDSA;->name:[B

    goto :goto_5

    :cond_9
    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :cond_a
    :goto_5
    add-int/lit8 v1, v5, 0x1

    add-int/2addr v5, v3

    aget-byte v1, p1, v1

    and-int/lit16 v3, v1, 0xff

    and-int/lit16 v6, v1, 0x80

    if-eqz v6, :cond_b

    and-int/lit8 v1, v1, 0x7f

    move v3, v0

    :goto_6
    add-int/lit8 v6, v1, -0x1

    if-lez v1, :cond_b

    shl-int/lit8 v1, v3, 0x8

    add-int/lit8 v3, v5, 0x1

    aget-byte v5, p1, v5

    and-int/lit16 v5, v5, 0xff

    add-int/2addr v1, v5

    move v5, v3

    move v3, v1

    move v1, v6

    goto :goto_6

    :cond_b
    new-array v1, v3, [B

    invoke-static {p1, v5, v1, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v1}, Lcom/jcraft/jsch/KeyPairECDSA;->fromPoint([B)[[B

    move-result-object p1

    aget-object v1, p1, v0

    iput-object v1, p0, Lcom/jcraft/jsch/KeyPairECDSA;->r_array:[B

    aget-object p1, p1, v2

    iput-object p1, p0, Lcom/jcraft/jsch/KeyPairECDSA;->s_array:[B

    iget-object p1, p0, Lcom/jcraft/jsch/KeyPairECDSA;->prv_array:[B

    if-eqz p1, :cond_e

    array-length v1, p1

    const/16 v3, 0x40

    if-lt v1, v3, :cond_c

    const/16 p1, 0x209

    goto :goto_7

    :cond_c
    array-length p1, p1

    if-lt p1, v4, :cond_d

    const/16 p1, 0x180

    goto :goto_7

    :cond_d
    const/16 p1, 0x100

    :goto_7
    iput p1, p0, Lcom/jcraft/jsch/KeyPairECDSA;->key_size:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_e
    return v2

    :catch_0
    return v0
.end method
