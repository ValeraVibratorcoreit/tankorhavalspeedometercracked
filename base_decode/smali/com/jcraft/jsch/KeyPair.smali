.class public abstract Lcom/jcraft/jsch/KeyPair;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jcraft/jsch/KeyPair$ASN1;,
        Lcom/jcraft/jsch/KeyPair$ASN1Exception;
    }
.end annotation


# static fields
.field public static final DSA:I = 0x1

.field public static final ECDSA:I = 0x3

.field public static final ERROR:I = 0x0

.field public static final RSA:I = 0x2

.field public static final UNKNOWN:I = 0x4

.field static final VENDOR_FSECURE:I = 0x1

.field static final VENDOR_OPENSSH:I = 0x0

.field static final VENDOR_PKCS8:I = 0x3

.field static final VENDOR_PUTTY:I = 0x2

.field private static final cr:[B

.field static header:[[B

.field private static final header1:[Ljava/lang/String;

.field private static final header2:[Ljava/lang/String;

.field private static final header3:[Ljava/lang/String;

.field private static space:[B


# instance fields
.field private cipher:Lcom/jcraft/jsch/Cipher;

.field protected data:[B

.field protected encrypted:Z

.field private hash:Lcom/jcraft/jsch/HASH;

.field private iv:[B

.field jsch:Lcom/jcraft/jsch/JSch;

.field private passphrase:[B

.field protected publicKeyComment:Ljava/lang/String;

.field private publickeyblob:[B

.field private random:Lcom/jcraft/jsch/Random;

.field vendor:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-string v0, "\n"

    invoke-static {v0}, Lcom/jcraft/jsch/Util;->str2byte(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Lcom/jcraft/jsch/KeyPair;->cr:[B

    const-string v0, "Proc-Type: 4,ENCRYPTED"

    invoke-static {v0}, Lcom/jcraft/jsch/Util;->str2byte(Ljava/lang/String;)[B

    move-result-object v0

    const-string v1, "DEK-Info: DES-EDE3-CBC,"

    invoke-static {v1}, Lcom/jcraft/jsch/Util;->str2byte(Ljava/lang/String;)[B

    move-result-object v1

    filled-new-array {v0, v1}, [[B

    move-result-object v0

    sput-object v0, Lcom/jcraft/jsch/KeyPair;->header:[[B

    const-string v0, " "

    invoke-static {v0}, Lcom/jcraft/jsch/Util;->str2byte(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Lcom/jcraft/jsch/KeyPair;->space:[B

    const-string v0, "Comment: "

    const-string v1, "Public-Lines: "

    const-string v2, "PuTTY-User-Key-File-2: "

    const-string v3, "Encryption: "

    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/jcraft/jsch/KeyPair;->header1:[Ljava/lang/String;

    const-string v0, "Private-Lines: "

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/jcraft/jsch/KeyPair;->header2:[Ljava/lang/String;

    const-string v0, "Private-MAC: "

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/jcraft/jsch/KeyPair;->header3:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/jcraft/jsch/JSch;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/jcraft/jsch/KeyPair;->vendor:I

    const-string v1, "no comment"

    iput-object v1, p0, Lcom/jcraft/jsch/KeyPair;->publicKeyComment:Ljava/lang/String;

    iput-boolean v0, p0, Lcom/jcraft/jsch/KeyPair;->encrypted:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/jcraft/jsch/KeyPair;->data:[B

    iput-object v0, p0, Lcom/jcraft/jsch/KeyPair;->iv:[B

    iput-object v0, p0, Lcom/jcraft/jsch/KeyPair;->publickeyblob:[B

    iput-object p1, p0, Lcom/jcraft/jsch/KeyPair;->jsch:Lcom/jcraft/jsch/JSch;

    return-void
.end method

.method private static a2b(B)B
    .locals 2

    const/16 v0, 0x30

    if-gt v0, p0, :cond_0

    const/16 v1, 0x39

    if-gt p0, v1, :cond_0

    sub-int/2addr p0, v0

    :goto_0
    int-to-byte p0, p0

    return p0

    :cond_0
    add-int/lit8 p0, p0, -0x57

    goto :goto_0
.end method

.method private static b2a(B)B
    .locals 1

    if-ltz p0, :cond_0

    const/16 v0, 0x9

    if-gt p0, v0, :cond_0

    add-int/lit8 p0, p0, 0x30

    :goto_0
    int-to-byte p0, p0

    return p0

    :cond_0
    add-int/lit8 p0, p0, 0x37

    goto :goto_0
.end method

.method private decrypt([B[B[B)[B
    .locals 6

    .line 1
    :try_start_0
    invoke-virtual {p0, p2, p3}, Lcom/jcraft/jsch/KeyPair;->genKey([B[B)[B

    move-result-object p2

    .line 2
    iget-object v0, p0, Lcom/jcraft/jsch/KeyPair;->cipher:Lcom/jcraft/jsch/Cipher;

    const/4 v1, 0x1

    invoke-interface {v0, v1, p2, p3}, Lcom/jcraft/jsch/Cipher;->init(I[B[B)V

    .line 3
    invoke-static {p2}, Lcom/jcraft/jsch/Util;->bzero([B)V

    .line 4
    array-length p2, p1

    new-array p2, p2, [B

    .line 5
    iget-object v0, p0, Lcom/jcraft/jsch/KeyPair;->cipher:Lcom/jcraft/jsch/Cipher;

    array-length v3, p1

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v1, p1

    move-object v4, p2

    invoke-interface/range {v0 .. v5}, Lcom/jcraft/jsch/Cipher;->update([BII[BI)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p2

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private encrypt([B[[B[B)[B
    .locals 9

    if-nez p3, :cond_0

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/jcraft/jsch/KeyPair;->cipher:Lcom/jcraft/jsch/Cipher;

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/jcraft/jsch/KeyPair;->genCipher()Lcom/jcraft/jsch/Cipher;

    move-result-object v0

    iput-object v0, p0, Lcom/jcraft/jsch/KeyPair;->cipher:Lcom/jcraft/jsch/Cipher;

    :cond_1
    iget-object v0, p0, Lcom/jcraft/jsch/KeyPair;->cipher:Lcom/jcraft/jsch/Cipher;

    invoke-interface {v0}, Lcom/jcraft/jsch/Cipher;->getIVSize()I

    move-result v0

    new-array v1, v0, [B

    const/4 v2, 0x0

    aput-object v1, p2, v2

    iget-object p2, p0, Lcom/jcraft/jsch/KeyPair;->random:Lcom/jcraft/jsch/Random;

    if-nez p2, :cond_2

    invoke-direct {p0}, Lcom/jcraft/jsch/KeyPair;->genRandom()Lcom/jcraft/jsch/Random;

    move-result-object p2

    iput-object p2, p0, Lcom/jcraft/jsch/KeyPair;->random:Lcom/jcraft/jsch/Random;

    :cond_2
    iget-object p2, p0, Lcom/jcraft/jsch/KeyPair;->random:Lcom/jcraft/jsch/Random;

    invoke-interface {p2, v1, v2, v0}, Lcom/jcraft/jsch/Random;->fill([BII)V

    invoke-virtual {p0, p3, v1}, Lcom/jcraft/jsch/KeyPair;->genKey([B[B)[B

    move-result-object p2

    iget-object p3, p0, Lcom/jcraft/jsch/KeyPair;->cipher:Lcom/jcraft/jsch/Cipher;

    invoke-interface {p3}, Lcom/jcraft/jsch/Cipher;->getIVSize()I

    move-result p3

    array-length v0, p1

    div-int/2addr v0, p3

    add-int/lit8 v0, v0, 0x1

    mul-int v6, v0, p3

    new-array v0, v6, [B

    array-length v3, p1

    invoke-static {p1, v2, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length p1, p1

    rem-int/2addr p1, p3

    sub-int/2addr p3, p1

    add-int/lit8 p1, v6, -0x1

    :goto_0
    sub-int v3, v6, p3

    if-gt v3, p1, :cond_3

    int-to-byte v3, p3

    aput-byte v3, v0, p1

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_3
    :try_start_0
    iget-object p1, p0, Lcom/jcraft/jsch/KeyPair;->cipher:Lcom/jcraft/jsch/Cipher;

    invoke-interface {p1, v2, p2, v1}, Lcom/jcraft/jsch/Cipher;->init(I[B[B)V

    iget-object v3, p0, Lcom/jcraft/jsch/KeyPair;->cipher:Lcom/jcraft/jsch/Cipher;

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object v4, v0

    move-object v7, v0

    invoke-interface/range {v3 .. v8}, Lcom/jcraft/jsch/Cipher;->update([BII[BI)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-static {p2}, Lcom/jcraft/jsch/Util;->bzero([B)V

    return-object v0
.end method

.method private genCipher()Lcom/jcraft/jsch/Cipher;
    .locals 1

    :try_start_0
    const-string v0, "3des-cbc"

    invoke-static {v0}, Lcom/jcraft/jsch/JSch;->getConfig(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jcraft/jsch/Cipher;

    iput-object v0, p0, Lcom/jcraft/jsch/KeyPair;->cipher:Lcom/jcraft/jsch/Cipher;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    iget-object v0, p0, Lcom/jcraft/jsch/KeyPair;->cipher:Lcom/jcraft/jsch/Cipher;

    return-object v0
.end method

.method private genHash()Lcom/jcraft/jsch/HASH;
    .locals 1

    :try_start_0
    const-string v0, "md5"

    invoke-static {v0}, Lcom/jcraft/jsch/JSch;->getConfig(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jcraft/jsch/HASH;

    iput-object v0, p0, Lcom/jcraft/jsch/KeyPair;->hash:Lcom/jcraft/jsch/HASH;

    invoke-interface {v0}, Lcom/jcraft/jsch/HASH;->init()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    iget-object v0, p0, Lcom/jcraft/jsch/KeyPair;->hash:Lcom/jcraft/jsch/HASH;

    return-object v0
.end method

.method public static genKeyPair(Lcom/jcraft/jsch/JSch;I)Lcom/jcraft/jsch/KeyPair;
    .locals 1

    const/16 v0, 0x400

    .line 1
    invoke-static {p0, p1, v0}, Lcom/jcraft/jsch/KeyPair;->genKeyPair(Lcom/jcraft/jsch/JSch;II)Lcom/jcraft/jsch/KeyPair;

    move-result-object p0

    return-object p0
.end method

.method public static genKeyPair(Lcom/jcraft/jsch/JSch;II)Lcom/jcraft/jsch/KeyPair;
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 2
    new-instance p1, Lcom/jcraft/jsch/KeyPairDSA;

    invoke-direct {p1, p0}, Lcom/jcraft/jsch/KeyPairDSA;-><init>(Lcom/jcraft/jsch/JSch;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    .line 3
    new-instance p1, Lcom/jcraft/jsch/KeyPairRSA;

    invoke-direct {p1, p0}, Lcom/jcraft/jsch/KeyPairRSA;-><init>(Lcom/jcraft/jsch/JSch;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x3

    if-ne p1, v0, :cond_2

    .line 4
    new-instance p1, Lcom/jcraft/jsch/KeyPairECDSA;

    invoke-direct {p1, p0}, Lcom/jcraft/jsch/KeyPairECDSA;-><init>(Lcom/jcraft/jsch/JSch;)V

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_3

    .line 5
    invoke-virtual {p1, p2}, Lcom/jcraft/jsch/KeyPair;->generate(I)V

    :cond_3
    return-object p1
.end method

.method private genRandom()Lcom/jcraft/jsch/Random;
    .locals 4

    iget-object v0, p0, Lcom/jcraft/jsch/KeyPair;->random:Lcom/jcraft/jsch/Random;

    if-nez v0, :cond_0

    :try_start_0
    const-string v0, "random"

    invoke-static {v0}, Lcom/jcraft/jsch/JSch;->getConfig(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jcraft/jsch/Random;

    iput-object v0, p0, Lcom/jcraft/jsch/KeyPair;->random:Lcom/jcraft/jsch/Random;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "connect: random "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/jcraft/jsch/KeyPair;->random:Lcom/jcraft/jsch/Random;

    return-object v0
.end method

.method public static load(Lcom/jcraft/jsch/JSch;Ljava/lang/String;)Lcom/jcraft/jsch/KeyPair;
    .locals 2

    .line 1
    const-string v0, ".pub"

    .line 2
    invoke-static {p1, v0}, LVo;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 3
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    .line 4
    :cond_0
    invoke-static {p0, p1, v0}, Lcom/jcraft/jsch/KeyPair;->load(Lcom/jcraft/jsch/JSch;Ljava/lang/String;Ljava/lang/String;)Lcom/jcraft/jsch/KeyPair;

    move-result-object p0

    return-object p0
.end method

.method public static load(Lcom/jcraft/jsch/JSch;Ljava/lang/String;Ljava/lang/String;)Lcom/jcraft/jsch/KeyPair;
    .locals 2

    .line 10
    :try_start_0
    invoke-static {p1}, Lcom/jcraft/jsch/Util;->fromFile(Ljava/lang/String;)[B

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    if-nez p2, :cond_0

    .line 11
    const-string v1, ".pub"

    .line 12
    invoke-static {p1, v1}, LVo;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, p2

    .line 13
    :goto_0
    :try_start_1
    invoke-static {p1}, Lcom/jcraft/jsch/Util;->fromFile(Ljava/lang/String;)[B

    move-result-object p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    if-nez p2, :cond_1

    const/4 p1, 0x0

    .line 14
    :goto_1
    :try_start_2
    invoke-static {p0, v0, p1}, Lcom/jcraft/jsch/KeyPair;->load(Lcom/jcraft/jsch/JSch;[B[B)Lcom/jcraft/jsch/KeyPair;

    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 15
    invoke-static {v0}, Lcom/jcraft/jsch/Util;->bzero([B)V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-static {v0}, Lcom/jcraft/jsch/Util;->bzero([B)V

    throw p0

    .line 16
    :cond_1
    new-instance p0, Lcom/jcraft/jsch/JSchException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2, p1}, Lcom/jcraft/jsch/JSchException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p0

    :catch_1
    move-exception p0

    .line 17
    new-instance p1, Lcom/jcraft/jsch/JSchException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2, p0}, Lcom/jcraft/jsch/JSchException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static load(Lcom/jcraft/jsch/JSch;[B[B)Lcom/jcraft/jsch/KeyPair;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const/16 v3, 0x8

    .line 23
    new-array v4, v3, [B

    const/4 v5, 0x7

    const/4 v6, 0x4

    const/4 v7, 0x2

    const/4 v8, 0x3

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-nez v2, :cond_5

    if-eqz v1, :cond_5

    .line 24
    array-length v11, v1

    const/16 v12, 0xb

    if-le v11, v12, :cond_5

    aget-byte v11, v1, v10

    if-nez v11, :cond_5

    aget-byte v11, v1, v9

    if-nez v11, :cond_5

    aget-byte v11, v1, v7

    if-nez v11, :cond_5

    aget-byte v11, v1, v8

    if-eq v11, v5, :cond_0

    const/16 v12, 0x13

    if-ne v11, v12, :cond_5

    .line 25
    :cond_0
    new-instance v2, Lcom/jcraft/jsch/Buffer;

    invoke-direct {v2, v1}, Lcom/jcraft/jsch/Buffer;-><init>([B)V

    .line 26
    array-length v3, v1

    invoke-virtual {v2, v3}, Lcom/jcraft/jsch/Buffer;->skip(I)V

    .line 27
    new-instance v3, Ljava/lang/String;

    invoke-virtual {v2}, Lcom/jcraft/jsch/Buffer;->getString()[B

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/lang/String;-><init>([B)V

    .line 28
    invoke-virtual {v2}, Lcom/jcraft/jsch/Buffer;->rewind()V

    .line 29
    const-string v4, "ssh-rsa"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 30
    invoke-static {v0, v2}, Lcom/jcraft/jsch/KeyPairRSA;->fromSSHAgent(Lcom/jcraft/jsch/JSch;Lcom/jcraft/jsch/Buffer;)Lcom/jcraft/jsch/KeyPair;

    move-result-object v0

    goto :goto_1

    .line 31
    :cond_1
    const-string v4, "ssh-dss"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 32
    invoke-static {v0, v2}, Lcom/jcraft/jsch/KeyPairDSA;->fromSSHAgent(Lcom/jcraft/jsch/JSch;Lcom/jcraft/jsch/Buffer;)Lcom/jcraft/jsch/KeyPair;

    move-result-object v0

    goto :goto_1

    .line 33
    :cond_2
    const-string v4, "ecdsa-sha2-nistp256"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    const-string v4, "ecdsa-sha2-nistp384"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    const-string v4, "ecdsa-sha2-nistp521"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_0

    .line 34
    :cond_3
    new-instance v0, Lcom/jcraft/jsch/JSchException;

    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v1, v6, v5}, Ljava/lang/String;-><init>([BII)V

    const-string v1, "privatekey: invalid key "

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/jcraft/jsch/JSchException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 35
    :cond_4
    :goto_0
    invoke-static {v0, v2}, Lcom/jcraft/jsch/KeyPairECDSA;->fromSSHAgent(Lcom/jcraft/jsch/JSch;Lcom/jcraft/jsch/Buffer;)Lcom/jcraft/jsch/KeyPair;

    move-result-object v0

    :goto_1
    return-object v0

    :cond_5
    if-eqz v1, :cond_6

    .line 36
    :try_start_0
    invoke-static/range {p0 .. p1}, Lcom/jcraft/jsch/KeyPair;->loadPPK(Lcom/jcraft/jsch/JSch;[B)Lcom/jcraft/jsch/KeyPair;

    move-result-object v11

    if-eqz v11, :cond_6

    return-object v11

    :catch_0
    move-exception v0

    goto/16 :goto_16

    :cond_6
    if-eqz v1, :cond_7

    .line 37
    array-length v11, v1

    goto :goto_2

    :cond_7
    move v11, v10

    :goto_2
    move v12, v10

    :goto_3
    const/16 v13, 0x2d

    if-ge v12, v11, :cond_9

    .line 38
    aget-byte v14, v1, v12

    if-ne v14, v13, :cond_8

    add-int/lit8 v14, v12, 0x4

    if-ge v14, v11, :cond_8

    add-int/lit8 v15, v12, 0x1

    aget-byte v15, v1, v15

    if-ne v15, v13, :cond_8

    add-int/lit8 v15, v12, 0x2

    aget-byte v15, v1, v15

    if-ne v15, v13, :cond_8

    add-int/lit8 v15, v12, 0x3

    aget-byte v15, v1, v15

    if-ne v15, v13, :cond_8

    aget-byte v14, v1, v14
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-ne v14, v13, :cond_8

    goto :goto_4

    :cond_8
    add-int/lit8 v12, v12, 0x1

    goto :goto_3

    :cond_9
    :goto_4
    move/from16 v16, v9

    move v14, v10

    move v15, v14

    const/16 v17, 0x0

    .line 39
    :goto_5
    const-string v5, "invalid privatekey: "

    if-ge v12, v11, :cond_22

    .line 40
    :try_start_1
    aget-byte v9, v1, v12

    const/16 v10, 0x42

    const/16 v3, 0x41

    const/16 v6, 0x53

    const/16 v13, 0x45

    if-ne v9, v10, :cond_11

    add-int/lit8 v10, v12, 0x3

    if-ge v10, v11, :cond_11

    add-int/lit8 v18, v12, 0x1

    aget-byte v8, v1, v18

    if-ne v8, v13, :cond_11

    add-int/lit8 v8, v12, 0x2

    aget-byte v8, v1, v8

    const/16 v7, 0x47

    if-ne v8, v7, :cond_11

    aget-byte v7, v1, v10

    const/16 v8, 0x49

    if-ne v7, v8, :cond_11

    add-int/lit8 v7, v12, 0x6

    add-int/lit8 v8, v12, 0x8

    if-ge v8, v11, :cond_10

    .line 41
    aget-byte v9, v1, v7

    const/16 v10, 0x44

    if-ne v9, v10, :cond_a

    add-int/lit8 v10, v12, 0x7

    aget-byte v10, v1, v10

    if-ne v10, v6, :cond_a

    aget-byte v10, v1, v8

    if-ne v10, v3, :cond_a

    const/4 v3, 0x3

    const/4 v15, 0x1

    goto/16 :goto_7

    :cond_a
    const/16 v10, 0x52

    if-ne v9, v10, :cond_b

    add-int/lit8 v15, v12, 0x7

    .line 42
    aget-byte v15, v1, v15

    if-ne v15, v6, :cond_b

    aget-byte v15, v1, v8

    if-ne v15, v3, :cond_b

    const/4 v3, 0x3

    const/4 v15, 0x2

    goto/16 :goto_7

    :cond_b
    if-ne v9, v13, :cond_c

    add-int/lit8 v15, v12, 0x7

    .line 43
    aget-byte v15, v1, v15

    const/16 v13, 0x43

    if-ne v15, v13, :cond_c

    const/4 v3, 0x3

    const/4 v15, 0x3

    goto/16 :goto_7

    :cond_c
    if-ne v9, v6, :cond_d

    add-int/lit8 v13, v12, 0x7

    .line 44
    aget-byte v13, v1, v13

    if-ne v13, v6, :cond_d

    aget-byte v6, v1, v8

    const/16 v13, 0x48

    if-ne v6, v13, :cond_d

    const/4 v3, 0x3

    const/4 v14, 0x1

    :goto_6
    const/4 v15, 0x4

    goto/16 :goto_7

    :cond_d
    add-int/lit8 v6, v12, 0xc

    if-ge v6, v11, :cond_e

    const/16 v7, 0x50

    if-ne v9, v7, :cond_e

    add-int/lit8 v7, v12, 0x7

    .line 45
    aget-byte v7, v1, v7

    if-ne v7, v10, :cond_e

    aget-byte v7, v1, v8

    const/16 v13, 0x49

    if-ne v7, v13, :cond_e

    add-int/lit8 v7, v12, 0x9

    aget-byte v13, v1, v7

    const/16 v14, 0x56

    if-ne v13, v14, :cond_e

    add-int/lit8 v13, v12, 0xa

    aget-byte v13, v1, v13

    if-ne v13, v3, :cond_e

    add-int/lit8 v3, v12, 0xb

    aget-byte v3, v1, v3

    const/16 v13, 0x54

    if-ne v3, v13, :cond_e

    aget-byte v3, v1, v6

    const/16 v13, 0x45

    if-ne v3, v13, :cond_e

    const/4 v3, 0x3

    const/4 v14, 0x3

    const/4 v15, 0x4

    const/16 v16, 0x0

    goto :goto_7

    :cond_e
    add-int/lit8 v3, v12, 0xe

    if-ge v3, v11, :cond_f

    const/16 v7, 0x45

    if-ne v9, v7, :cond_f

    add-int/lit8 v7, v12, 0x7

    .line 46
    aget-byte v7, v1, v7

    const/16 v9, 0x4e

    if-ne v7, v9, :cond_f

    aget-byte v7, v1, v8

    const/16 v8, 0x43

    if-ne v7, v8, :cond_f

    add-int/lit8 v7, v12, 0x9

    aget-byte v7, v1, v7

    if-ne v7, v10, :cond_f

    add-int/lit8 v7, v12, 0xa

    aget-byte v7, v1, v7

    const/16 v8, 0x59

    if-ne v7, v8, :cond_f

    add-int/lit8 v7, v12, 0xb

    aget-byte v8, v1, v7

    const/16 v9, 0x50

    if-ne v8, v9, :cond_f

    aget-byte v6, v1, v6

    const/16 v8, 0x54

    if-ne v6, v8, :cond_f

    add-int/lit8 v12, v12, 0xd

    aget-byte v6, v1, v12

    const/16 v8, 0x45

    if-ne v6, v8, :cond_f

    aget-byte v3, v1, v3

    const/16 v6, 0x44

    if-ne v3, v6, :cond_f

    const/4 v3, 0x3

    const/4 v14, 0x3

    goto :goto_6

    :goto_7
    add-int/lit8 v12, v7, 0x3

    move v8, v3

    const/16 v3, 0x8

    const/4 v6, 0x4

    const/4 v7, 0x2

    :goto_8
    const/4 v9, 0x1

    const/4 v10, 0x0

    const/16 v13, 0x2d

    goto/16 :goto_5

    .line 47
    :cond_f
    new-instance v0, Lcom/jcraft/jsch/JSchException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/jcraft/jsch/JSchException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 48
    :cond_10
    new-instance v0, Lcom/jcraft/jsch/JSchException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/jcraft/jsch/JSchException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_11
    const/16 v7, 0x32

    if-ne v9, v3, :cond_14

    add-int/lit8 v8, v12, 0x7

    if-ge v8, v11, :cond_14

    add-int/lit8 v10, v12, 0x1

    .line 49
    aget-byte v10, v1, v10

    const/16 v13, 0x45

    if-ne v10, v13, :cond_14

    add-int/lit8 v10, v12, 0x2

    aget-byte v10, v1, v10

    if-ne v10, v6, :cond_14

    add-int/lit8 v10, v12, 0x3

    aget-byte v10, v1, v10

    const/16 v13, 0x2d

    if-ne v10, v13, :cond_14

    add-int/lit8 v10, v12, 0x4

    aget-byte v10, v1, v10

    if-ne v10, v7, :cond_14

    add-int/lit8 v10, v12, 0x5

    aget-byte v10, v1, v10

    const/16 v13, 0x35

    if-ne v10, v13, :cond_14

    add-int/lit8 v10, v12, 0x6

    aget-byte v10, v1, v10

    const/16 v13, 0x36

    if-ne v10, v13, :cond_14

    aget-byte v8, v1, v8

    const/16 v10, 0x2d

    if-ne v8, v10, :cond_14

    add-int/lit8 v12, v12, 0x8

    .line 50
    const-string v3, "aes256-cbc"

    invoke-static {v3}, Lcom/jcraft/jsch/JSch;->getConfig(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/jcraft/jsch/Session;->checkCipher(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_13

    .line 51
    const-string v3, "aes256-cbc"

    invoke-static {v3}, Lcom/jcraft/jsch/JSch;->getConfig(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    .line 52
    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v17, v3

    check-cast v17, Lcom/jcraft/jsch/Cipher;

    .line 53
    invoke-interface/range {v17 .. v17}, Lcom/jcraft/jsch/Cipher;->getIVSize()I

    move-result v3

    new-array v4, v3, [B

    :cond_12
    :goto_9
    const/16 v3, 0x8

    const/4 v6, 0x4

    const/4 v7, 0x2

    const/4 v8, 0x3

    goto/16 :goto_8

    .line 54
    :cond_13
    new-instance v0, Lcom/jcraft/jsch/JSchException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "privatekey: aes256-cbc is not available "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/jcraft/jsch/JSchException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_14
    if-ne v9, v3, :cond_16

    add-int/lit8 v8, v12, 0x7

    if-ge v8, v11, :cond_16

    add-int/lit8 v10, v12, 0x1

    .line 55
    aget-byte v10, v1, v10

    const/16 v13, 0x45

    if-ne v10, v13, :cond_16

    add-int/lit8 v10, v12, 0x2

    aget-byte v10, v1, v10

    if-ne v10, v6, :cond_16

    add-int/lit8 v10, v12, 0x3

    aget-byte v10, v1, v10

    const/16 v13, 0x2d

    if-ne v10, v13, :cond_16

    add-int/lit8 v10, v12, 0x4

    aget-byte v10, v1, v10

    const/16 v13, 0x31

    if-ne v10, v13, :cond_16

    add-int/lit8 v10, v12, 0x5

    aget-byte v10, v1, v10

    const/16 v13, 0x39

    if-ne v10, v13, :cond_16

    add-int/lit8 v10, v12, 0x6

    aget-byte v10, v1, v10

    if-ne v10, v7, :cond_16

    aget-byte v8, v1, v8

    const/16 v10, 0x2d

    if-ne v8, v10, :cond_16

    add-int/lit8 v12, v12, 0x8

    .line 56
    const-string v3, "aes192-cbc"

    invoke-static {v3}, Lcom/jcraft/jsch/JSch;->getConfig(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/jcraft/jsch/Session;->checkCipher(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_15

    .line 57
    const-string v3, "aes192-cbc"

    invoke-static {v3}, Lcom/jcraft/jsch/JSch;->getConfig(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    .line 58
    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v17, v3

    check-cast v17, Lcom/jcraft/jsch/Cipher;

    .line 59
    invoke-interface/range {v17 .. v17}, Lcom/jcraft/jsch/Cipher;->getIVSize()I

    move-result v3

    new-array v4, v3, [B

    goto :goto_9

    .line 60
    :cond_15
    new-instance v0, Lcom/jcraft/jsch/JSchException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "privatekey: aes192-cbc is not available "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/jcraft/jsch/JSchException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_16
    if-ne v9, v3, :cond_18

    add-int/lit8 v3, v12, 0x7

    if-ge v3, v11, :cond_18

    add-int/lit8 v8, v12, 0x1

    .line 61
    aget-byte v8, v1, v8

    const/16 v10, 0x45

    if-ne v8, v10, :cond_18

    add-int/lit8 v8, v12, 0x2

    aget-byte v8, v1, v8

    if-ne v8, v6, :cond_18

    add-int/lit8 v6, v12, 0x3

    aget-byte v6, v1, v6

    const/16 v8, 0x2d

    if-ne v6, v8, :cond_18

    add-int/lit8 v6, v12, 0x4

    aget-byte v6, v1, v6

    const/16 v8, 0x31

    if-ne v6, v8, :cond_18

    add-int/lit8 v6, v12, 0x5

    aget-byte v6, v1, v6

    if-ne v6, v7, :cond_18

    add-int/lit8 v6, v12, 0x6

    aget-byte v6, v1, v6

    const/16 v7, 0x38

    if-ne v6, v7, :cond_18

    aget-byte v3, v1, v3

    const/16 v6, 0x2d

    if-ne v3, v6, :cond_18

    add-int/lit8 v12, v12, 0x8

    .line 62
    const-string v3, "aes128-cbc"

    invoke-static {v3}, Lcom/jcraft/jsch/JSch;->getConfig(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/jcraft/jsch/Session;->checkCipher(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_17

    .line 63
    const-string v3, "aes128-cbc"

    invoke-static {v3}, Lcom/jcraft/jsch/JSch;->getConfig(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    .line 64
    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v17, v3

    check-cast v17, Lcom/jcraft/jsch/Cipher;

    .line 65
    invoke-interface/range {v17 .. v17}, Lcom/jcraft/jsch/Cipher;->getIVSize()I

    move-result v3

    new-array v4, v3, [B

    goto/16 :goto_9

    .line 66
    :cond_17
    new-instance v0, Lcom/jcraft/jsch/JSchException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "privatekey: aes128-cbc is not available "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/jcraft/jsch/JSchException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_18
    const/16 v3, 0x43

    if-ne v9, v3, :cond_19

    add-int/lit8 v3, v12, 0x3

    if-ge v3, v11, :cond_19

    add-int/lit8 v6, v12, 0x1

    .line 67
    aget-byte v6, v1, v6

    const/16 v7, 0x42

    if-ne v6, v7, :cond_19

    add-int/lit8 v6, v12, 0x2

    aget-byte v6, v1, v6

    const/16 v7, 0x43

    if-ne v6, v7, :cond_19

    aget-byte v3, v1, v3

    const/16 v6, 0x2c

    if-ne v3, v6, :cond_19

    add-int/lit8 v12, v12, 0x4

    const/4 v3, 0x0

    .line 68
    :goto_a
    array-length v5, v4

    if-ge v3, v5, :cond_12

    add-int/lit8 v5, v12, 0x1

    .line 69
    aget-byte v6, v1, v12

    invoke-static {v6}, Lcom/jcraft/jsch/KeyPair;->a2b(B)B

    move-result v6

    const/4 v7, 0x4

    shl-int/2addr v6, v7

    and-int/lit16 v6, v6, 0xf0

    add-int/lit8 v12, v12, 0x2

    aget-byte v5, v1, v5

    invoke-static {v5}, Lcom/jcraft/jsch/KeyPair;->a2b(B)B

    move-result v5

    and-int/lit8 v5, v5, 0xf

    add-int/2addr v6, v5

    int-to-byte v5, v6

    aput-byte v5, v4, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_a

    :cond_19
    const/16 v3, 0xd

    if-ne v9, v3, :cond_1a

    add-int/lit8 v3, v12, 0x1

    .line 70
    array-length v6, v1

    if-ge v3, v6, :cond_1a

    aget-byte v6, v1, v3

    const/16 v7, 0xa

    if-ne v6, v7, :cond_1b

    move v12, v3

    goto/16 :goto_9

    :cond_1a
    const/16 v7, 0xa

    :cond_1b
    if-ne v9, v7, :cond_21

    add-int/lit8 v3, v12, 0x1

    .line 71
    array-length v6, v1

    if-ge v3, v6, :cond_21

    .line 72
    aget-byte v6, v1, v3

    if-ne v6, v7, :cond_1c

    add-int/lit8 v12, v12, 0x2

    goto :goto_e

    :cond_1c
    const/16 v7, 0xd

    if-ne v6, v7, :cond_1d

    add-int/lit8 v6, v12, 0x2

    .line 73
    array-length v7, v1

    if-ge v6, v7, :cond_1d

    aget-byte v6, v1, v6

    const/16 v7, 0xa

    if-ne v6, v7, :cond_1d

    add-int/lit8 v12, v12, 0x3

    goto :goto_e

    :cond_1d
    move v6, v3

    .line 74
    :goto_b
    array-length v7, v1

    if-ge v6, v7, :cond_1e

    .line 75
    aget-byte v7, v1, v6

    const/16 v8, 0xa

    if-ne v7, v8, :cond_1f

    :cond_1e
    const/4 v6, 0x3

    goto :goto_c

    :cond_1f
    const/16 v8, 0x3a

    if-ne v7, v8, :cond_20

    goto :goto_d

    :cond_20
    add-int/lit8 v6, v6, 0x1

    goto :goto_b

    :goto_c
    move v12, v3

    if-eq v14, v6, :cond_22

    const/16 v16, 0x0

    goto :goto_e

    :cond_21
    :goto_d
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_9

    :cond_22
    :goto_e
    if-eqz v1, :cond_2d

    if-eqz v15, :cond_2c

    move v3, v12

    :goto_f
    if-ge v3, v11, :cond_24

    .line 76
    aget-byte v6, v1, v3

    const/16 v7, 0x2d

    if-ne v6, v7, :cond_23

    goto :goto_10

    :cond_23
    add-int/lit8 v3, v3, 0x1

    goto :goto_f

    :cond_24
    :goto_10
    sub-int/2addr v11, v3

    if-eqz v11, :cond_2b

    sub-int/2addr v3, v12

    if-eqz v3, :cond_2b

    .line 77
    new-array v6, v3, [B

    const/4 v7, 0x0

    .line 78
    invoke-static {v1, v12, v6, v7, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v7, 0x0

    :goto_11
    if-ge v7, v3, :cond_29

    .line 79
    aget-byte v8, v6, v7

    const/16 v9, 0xa

    if-ne v8, v9, :cond_27

    add-int/lit8 v8, v7, -0x1

    .line 80
    aget-byte v8, v6, v8

    const/16 v9, 0xd

    if-ne v8, v9, :cond_25

    const/4 v8, 0x1

    goto :goto_12

    :cond_25
    const/4 v8, 0x0

    :goto_12
    add-int/lit8 v9, v7, 0x1

    sub-int v10, v7, v8

    sub-int v11, v3, v9

    .line 81
    invoke-static {v6, v9, v6, v10, v11}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-eqz v8, :cond_26

    add-int/lit8 v3, v3, -0x1

    :cond_26
    add-int/lit8 v3, v3, -0x1

    goto :goto_11

    :cond_27
    const/16 v9, 0x2d

    if-ne v8, v9, :cond_28

    goto :goto_13

    :cond_28
    add-int/lit8 v7, v7, 0x1

    goto :goto_11

    :cond_29
    :goto_13
    if-lez v7, :cond_2a

    const/4 v3, 0x0

    .line 82
    invoke-static {v6, v3, v7}, Lcom/jcraft/jsch/Util;->fromBase64([BII)[B

    move-result-object v7

    goto :goto_14

    :cond_2a
    const/4 v7, 0x0

    .line 83
    :goto_14
    invoke-static {v6}, Lcom/jcraft/jsch/Util;->bzero([B)V

    goto :goto_15

    .line 84
    :cond_2b
    new-instance v0, Lcom/jcraft/jsch/JSchException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/jcraft/jsch/JSchException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 85
    :cond_2c
    new-instance v0, Lcom/jcraft/jsch/JSchException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/jcraft/jsch/JSchException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2d
    const/4 v7, 0x0

    :goto_15
    if-eqz v7, :cond_30

    .line 86
    array-length v3, v7

    const/4 v6, 0x4

    if-le v3, v6, :cond_30

    const/4 v3, 0x0

    aget-byte v6, v7, v3

    const/16 v3, 0x3f

    if-ne v6, v3, :cond_30

    const/4 v3, 0x1

    aget-byte v6, v7, v3

    const/16 v3, 0x6f

    if-ne v6, v3, :cond_30

    const/4 v3, 0x2

    aget-byte v6, v7, v3

    const/4 v3, -0x7

    if-ne v6, v3, :cond_30

    const/4 v3, 0x3

    aget-byte v6, v7, v3

    const/16 v3, -0x15

    if-ne v6, v3, :cond_30

    .line 87
    new-instance v3, Lcom/jcraft/jsch/Buffer;

    invoke-direct {v3, v7}, Lcom/jcraft/jsch/Buffer;-><init>([B)V

    .line 88
    invoke-virtual {v3}, Lcom/jcraft/jsch/Buffer;->getInt()I

    .line 89
    invoke-virtual {v3}, Lcom/jcraft/jsch/Buffer;->getInt()I

    .line 90
    invoke-virtual {v3}, Lcom/jcraft/jsch/Buffer;->getString()[B

    .line 91
    invoke-virtual {v3}, Lcom/jcraft/jsch/Buffer;->getString()[B

    move-result-object v6

    invoke-static {v6}, Lcom/jcraft/jsch/Util;->byte2str([B)Ljava/lang/String;

    move-result-object v6

    .line 92
    const-string v8, "3des-cbc"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2e

    .line 93
    const-string v8, "none"

    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_30

    .line 94
    invoke-virtual {v3}, Lcom/jcraft/jsch/Buffer;->getInt()I

    .line 95
    invoke-virtual {v3}, Lcom/jcraft/jsch/Buffer;->getInt()I

    .line 96
    array-length v6, v7

    invoke-virtual {v3}, Lcom/jcraft/jsch/Buffer;->getOffSet()I

    move-result v7

    sub-int/2addr v6, v7

    new-array v7, v6, [B

    .line 97
    invoke-virtual {v3, v7}, Lcom/jcraft/jsch/Buffer;->getByte([B)V

    const/4 v3, 0x0

    goto :goto_17

    .line 98
    :cond_2e
    invoke-virtual {v3}, Lcom/jcraft/jsch/Buffer;->getInt()I

    .line 99
    array-length v0, v7

    invoke-virtual {v3}, Lcom/jcraft/jsch/Buffer;->getOffSet()I

    move-result v2

    sub-int/2addr v0, v2

    new-array v0, v0, [B

    .line 100
    invoke-virtual {v3, v0}, Lcom/jcraft/jsch/Buffer;->getByte([B)V

    .line 101
    new-instance v0, Lcom/jcraft/jsch/JSchException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unknown privatekey format: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/jcraft/jsch/JSchException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 102
    :goto_16
    instance-of v1, v0, Lcom/jcraft/jsch/JSchException;

    if-nez v1, :cond_2f

    .line 103
    new-instance v1, Lcom/jcraft/jsch/JSchException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lcom/jcraft/jsch/JSchException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 104
    :cond_2f
    check-cast v0, Lcom/jcraft/jsch/JSchException;

    throw v0

    :cond_30
    move/from16 v3, v16

    .line 105
    :goto_17
    const-string v6, ""

    if-eqz v2, :cond_58

    .line 106
    :try_start_2
    array-length v8, v2

    .line 107
    array-length v9, v2

    const/4 v10, 0x4

    if-le v9, v10, :cond_3f

    const/4 v9, 0x0

    aget-byte v10, v2, v9

    const/16 v9, 0x2d

    if-ne v10, v9, :cond_3f

    const/4 v10, 0x1

    aget-byte v11, v2, v10

    if-ne v11, v9, :cond_3f

    const/4 v11, 0x2

    aget-byte v12, v2, v11

    if-ne v12, v9, :cond_3f

    const/4 v11, 0x3

    aget-byte v12, v2, v11

    if-ne v12, v9, :cond_3f

    const/4 v9, 0x0

    :goto_18
    add-int/2addr v9, v10

    .line 108
    array-length v10, v2

    if-le v10, v9, :cond_32

    aget-byte v10, v2, v9

    const/16 v11, 0xa

    if-ne v10, v11, :cond_31

    goto :goto_19

    :cond_31
    const/4 v10, 0x1

    goto :goto_18

    :catch_1
    move-object/from16 v16, v6

    goto/16 :goto_32

    .line 109
    :cond_32
    :goto_19
    array-length v10, v2

    if-gt v10, v9, :cond_33

    const/4 v10, 0x0

    goto :goto_1a

    :cond_33
    const/4 v10, 0x1

    :goto_1a
    if-eqz v10, :cond_38

    .line 110
    aget-byte v11, v2, v9

    const/16 v12, 0xa

    if-ne v11, v12, :cond_37

    add-int/lit8 v11, v9, 0x1

    move v13, v11

    .line 111
    :goto_1b
    array-length v12, v2

    if-ge v13, v12, :cond_36

    .line 112
    aget-byte v12, v2, v13
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    move-object/from16 v16, v6

    const/16 v6, 0xa

    if-ne v12, v6, :cond_34

    goto :goto_1c

    :cond_34
    const/16 v6, 0x3a

    if-ne v12, v6, :cond_35

    goto :goto_1d

    :cond_35
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v6, v16

    goto :goto_1b

    :cond_36
    move-object/from16 v16, v6

    :goto_1c
    move v9, v11

    goto :goto_1e

    :cond_37
    move-object/from16 v16, v6

    :goto_1d
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v6, v16

    goto :goto_1a

    :cond_38
    move-object/from16 v16, v6

    .line 113
    :goto_1e
    :try_start_3
    array-length v6, v2

    if-gt v6, v9, :cond_39

    const/4 v10, 0x0

    :cond_39
    move v6, v9

    :goto_1f
    if-eqz v10, :cond_3c

    if-ge v6, v8, :cond_3c

    .line 114
    aget-byte v11, v2, v6

    const/16 v12, 0xa

    if-ne v11, v12, :cond_3a

    add-int/lit8 v11, v6, 0x1

    sub-int v12, v8, v6

    const/4 v13, 0x1

    sub-int/2addr v12, v13

    .line 115
    invoke-static {v2, v11, v2, v6, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v8, v8, -0x1

    goto :goto_1f

    :cond_3a
    const/16 v12, 0x2d

    if-ne v11, v12, :cond_3b

    goto :goto_20

    :cond_3b
    add-int/lit8 v6, v6, 0x1

    goto :goto_1f

    :cond_3c
    :goto_20
    if-eqz v10, :cond_56

    sub-int/2addr v6, v9

    .line 116
    invoke-static {v2, v9, v6}, Lcom/jcraft/jsch/Util;->fromBase64([BII)[B

    move-result-object v6
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    if-eqz v1, :cond_3d

    const/4 v8, 0x4

    if-ne v15, v8, :cond_57

    :cond_3d
    const/16 v8, 0x8

    .line 117
    :try_start_4
    aget-byte v8, v6, v8
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    const/16 v9, 0x64

    if-ne v8, v9, :cond_3e

    const/4 v15, 0x1

    goto/16 :goto_33

    :cond_3e
    const/16 v9, 0x72

    if-ne v8, v9, :cond_57

    const/4 v15, 0x2

    goto/16 :goto_33

    :cond_3f
    move-object/from16 v16, v6

    const/4 v6, 0x0

    .line 118
    :try_start_5
    aget-byte v9, v2, v6

    const/16 v6, 0x73

    const/16 v10, 0x20

    if-ne v9, v6, :cond_4c

    const/4 v6, 0x1

    aget-byte v11, v2, v6

    const/16 v6, 0x73

    if-ne v11, v6, :cond_4c

    const/4 v6, 0x2

    aget-byte v11, v2, v6

    const/16 v6, 0x68

    if-ne v11, v6, :cond_4c

    const/4 v6, 0x3

    aget-byte v11, v2, v6

    const/16 v6, 0x2d

    if-ne v11, v6, :cond_4c

    if-nez v1, :cond_41

    .line 119
    array-length v6, v2

    const/4 v9, 0x7

    if-le v6, v9, :cond_41

    const/4 v6, 0x4

    .line 120
    aget-byte v6, v2, v6

    const/16 v9, 0x64

    if-ne v6, v9, :cond_40

    const/4 v15, 0x1

    goto :goto_21

    :cond_40
    const/16 v9, 0x72

    if-ne v6, v9, :cond_41

    const/4 v15, 0x2

    :cond_41
    :goto_21
    const/4 v6, 0x0

    :goto_22
    if-ge v6, v8, :cond_42

    .line 121
    aget-byte v9, v2, v6

    if-ne v9, v10, :cond_43

    :cond_42
    const/4 v9, 0x1

    goto :goto_23

    :cond_43
    add-int/lit8 v6, v6, 0x1

    goto :goto_22

    :goto_23
    add-int/2addr v6, v9

    if-ge v6, v8, :cond_46

    move v9, v6

    :goto_24
    if-ge v9, v8, :cond_45

    .line 122
    aget-byte v11, v2, v9

    if-ne v11, v10, :cond_44

    goto :goto_25

    :cond_44
    add-int/lit8 v9, v9, 0x1

    goto :goto_24

    :cond_45
    :goto_25
    sub-int v10, v9, v6

    .line 123
    invoke-static {v2, v6, v10}, Lcom/jcraft/jsch/Util;->fromBase64([BII)[B

    move-result-object v6
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    move/from16 v19, v9

    move-object v9, v6

    move/from16 v6, v19

    goto :goto_26

    :cond_46
    const/4 v9, 0x0

    :goto_26
    add-int/lit8 v10, v6, 0x1

    if-ge v6, v8, :cond_4b

    move v6, v10

    :goto_27
    if-ge v6, v8, :cond_48

    .line 124
    :try_start_6
    aget-byte v11, v2, v6

    const/16 v12, 0xa

    if-ne v11, v12, :cond_47

    goto :goto_28

    :cond_47
    add-int/lit8 v6, v6, 0x1

    goto :goto_27

    :cond_48
    :goto_28
    if-lez v6, :cond_49

    add-int/lit8 v8, v6, -0x1

    .line 125
    aget-byte v8, v2, v8

    const/16 v11, 0xd

    if-ne v8, v11, :cond_49

    add-int/lit8 v6, v6, -0x1

    :cond_49
    if-ge v10, v6, :cond_4a

    .line 126
    new-instance v8, Ljava/lang/String;

    sub-int/2addr v6, v10

    invoke-direct {v8, v2, v10, v6}, Ljava/lang/String;-><init>([BII)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    move-object v6, v8

    goto :goto_29

    :cond_4a
    move-object/from16 v6, v16

    :goto_29
    move-object/from16 v16, v6

    :catch_2
    :cond_4b
    :goto_2a
    move-object v6, v9

    goto/16 :goto_33

    :cond_4c
    const/16 v6, 0x65

    if-ne v9, v6, :cond_56

    const/4 v6, 0x1

    .line 127
    :try_start_7
    aget-byte v9, v2, v6

    const/16 v6, 0x63

    if-ne v9, v6, :cond_56

    const/4 v6, 0x2

    aget-byte v9, v2, v6

    const/16 v6, 0x64

    if-ne v9, v6, :cond_56

    const/4 v6, 0x3

    aget-byte v9, v2, v6

    const/16 v6, 0x73

    if-ne v9, v6, :cond_56

    if-nez v1, :cond_4d

    .line 128
    array-length v6, v2

    const/4 v9, 0x7

    if-le v6, v9, :cond_4d

    const/4 v15, 0x3

    :cond_4d
    const/4 v6, 0x0

    :goto_2b
    if-ge v6, v8, :cond_4e

    .line 129
    aget-byte v9, v2, v6

    if-ne v9, v10, :cond_4f

    :cond_4e
    const/4 v9, 0x1

    goto :goto_2c

    :cond_4f
    add-int/lit8 v6, v6, 0x1

    goto :goto_2b

    :goto_2c
    add-int/2addr v6, v9

    if-ge v6, v8, :cond_52

    move v9, v6

    :goto_2d
    if-ge v9, v8, :cond_51

    .line 130
    aget-byte v11, v2, v9

    if-ne v11, v10, :cond_50

    goto :goto_2e

    :cond_50
    add-int/lit8 v9, v9, 0x1

    goto :goto_2d

    :cond_51
    :goto_2e
    sub-int v10, v9, v6

    .line 131
    invoke-static {v2, v6, v10}, Lcom/jcraft/jsch/Util;->fromBase64([BII)[B

    move-result-object v6
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    move/from16 v19, v9

    move-object v9, v6

    move/from16 v6, v19

    goto :goto_2f

    :cond_52
    const/4 v9, 0x0

    :goto_2f
    add-int/lit8 v10, v6, 0x1

    if-ge v6, v8, :cond_4b

    move v6, v10

    :goto_30
    if-ge v6, v8, :cond_54

    .line 132
    :try_start_8
    aget-byte v11, v2, v6

    const/16 v12, 0xa

    if-ne v11, v12, :cond_53

    goto :goto_31

    :cond_53
    add-int/lit8 v6, v6, 0x1

    goto :goto_30

    :cond_54
    :goto_31
    if-lez v6, :cond_55

    add-int/lit8 v8, v6, -0x1

    .line 133
    aget-byte v8, v2, v8

    const/16 v11, 0xd

    if-ne v8, v11, :cond_55

    add-int/lit8 v6, v6, -0x1

    :cond_55
    if-ge v10, v6, :cond_4b

    .line 134
    new-instance v8, Ljava/lang/String;

    sub-int/2addr v6, v10

    invoke-direct {v8, v2, v10, v6}, Ljava/lang/String;-><init>([BII)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2

    move-object/from16 v16, v8

    goto :goto_2a

    :catch_3
    :cond_56
    :goto_32
    const/4 v6, 0x0

    :catch_4
    :cond_57
    :goto_33
    move-object/from16 v8, v16

    :goto_34
    const/4 v9, 0x1

    goto :goto_35

    :cond_58
    move-object/from16 v16, v6

    move-object/from16 v8, v16

    const/4 v6, 0x0

    goto :goto_34

    :goto_35
    if-ne v15, v9, :cond_59

    .line 135
    new-instance v2, Lcom/jcraft/jsch/KeyPairDSA;

    invoke-direct {v2, v0}, Lcom/jcraft/jsch/KeyPairDSA;-><init>(Lcom/jcraft/jsch/JSch;)V

    goto :goto_36

    :cond_59
    const/4 v9, 0x2

    if-ne v15, v9, :cond_5a

    .line 136
    new-instance v2, Lcom/jcraft/jsch/KeyPairRSA;

    invoke-direct {v2, v0}, Lcom/jcraft/jsch/KeyPairRSA;-><init>(Lcom/jcraft/jsch/JSch;)V

    goto :goto_36

    :cond_5a
    const/4 v9, 0x3

    if-ne v15, v9, :cond_5b

    .line 137
    new-instance v9, Lcom/jcraft/jsch/KeyPairECDSA;

    invoke-direct {v9, v0, v2}, Lcom/jcraft/jsch/KeyPairECDSA;-><init>(Lcom/jcraft/jsch/JSch;[B)V

    move-object v2, v9

    goto :goto_36

    :cond_5b
    if-ne v14, v9, :cond_5c

    .line 138
    new-instance v2, Lcom/jcraft/jsch/KeyPairPKCS8;

    invoke-direct {v2, v0}, Lcom/jcraft/jsch/KeyPairPKCS8;-><init>(Lcom/jcraft/jsch/JSch;)V

    goto :goto_36

    :cond_5c
    const/4 v2, 0x0

    :goto_36
    if-eqz v2, :cond_5f

    .line 139
    iput-boolean v3, v2, Lcom/jcraft/jsch/KeyPair;->encrypted:Z

    .line 140
    iput-object v6, v2, Lcom/jcraft/jsch/KeyPair;->publickeyblob:[B

    .line 141
    iput v14, v2, Lcom/jcraft/jsch/KeyPair;->vendor:I

    .line 142
    iput-object v8, v2, Lcom/jcraft/jsch/KeyPair;->publicKeyComment:Ljava/lang/String;

    move-object/from16 v14, v17

    .line 143
    iput-object v14, v2, Lcom/jcraft/jsch/KeyPair;->cipher:Lcom/jcraft/jsch/Cipher;

    if-eqz v3, :cond_5d

    const/4 v0, 0x1

    .line 144
    iput-boolean v0, v2, Lcom/jcraft/jsch/KeyPair;->encrypted:Z

    .line 145
    iput-object v4, v2, Lcom/jcraft/jsch/KeyPair;->iv:[B

    .line 146
    iput-object v7, v2, Lcom/jcraft/jsch/KeyPair;->data:[B

    goto :goto_37

    .line 147
    :cond_5d
    invoke-virtual {v2, v7}, Lcom/jcraft/jsch/KeyPair;->parse([B)Z

    move-result v0

    if-eqz v0, :cond_5e

    const/4 v0, 0x0

    .line 148
    iput-boolean v0, v2, Lcom/jcraft/jsch/KeyPair;->encrypted:Z

    return-object v2

    .line 149
    :cond_5e
    new-instance v0, Lcom/jcraft/jsch/JSchException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/jcraft/jsch/JSchException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5f
    :goto_37
    return-object v2
.end method

.method public static loadPPK(Lcom/jcraft/jsch/JSch;[B)Lcom/jcraft/jsch/KeyPair;
    .locals 10

    new-instance v0, Lcom/jcraft/jsch/Buffer;

    invoke-direct {v0, p1}, Lcom/jcraft/jsch/Buffer;-><init>([B)V

    new-instance p1, Ljava/util/Hashtable;

    invoke-direct {p1}, Ljava/util/Hashtable;-><init>()V

    :cond_0
    invoke-static {v0, p1}, Lcom/jcraft/jsch/KeyPair;->parseHeader(Lcom/jcraft/jsch/Buffer;Ljava/util/Hashtable;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "PuTTY-User-Key-File-2"

    invoke-virtual {p1, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return-object v2

    :cond_1
    const-string v3, "Public-Lines"

    invoke-virtual {p1, v3}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    invoke-static {v0, v3}, Lcom/jcraft/jsch/KeyPair;->parseLines(Lcom/jcraft/jsch/Buffer;I)[B

    move-result-object v3

    :cond_2
    invoke-static {v0, p1}, Lcom/jcraft/jsch/KeyPair;->parseHeader(Lcom/jcraft/jsch/Buffer;Ljava/util/Hashtable;)Z

    move-result v4

    if-nez v4, :cond_2

    const-string v4, "Private-Lines"

    invoke-virtual {p1, v4}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    invoke-static {v0, v4}, Lcom/jcraft/jsch/KeyPair;->parseLines(Lcom/jcraft/jsch/Buffer;I)[B

    move-result-object v4

    :cond_3
    invoke-static {v0, p1}, Lcom/jcraft/jsch/KeyPair;->parseHeader(Lcom/jcraft/jsch/Buffer;Ljava/util/Hashtable;)Z

    move-result v5

    if-nez v5, :cond_3

    array-length v0, v4

    const/4 v5, 0x0

    invoke-static {v4, v5, v0}, Lcom/jcraft/jsch/Util;->fromBase64([BII)[B

    move-result-object v0

    array-length v4, v3

    invoke-static {v3, v5, v4}, Lcom/jcraft/jsch/Util;->fromBase64([BII)[B

    move-result-object v3

    const-string v4, "ssh-rsa"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    new-instance v1, Lcom/jcraft/jsch/Buffer;

    invoke-direct {v1, v3}, Lcom/jcraft/jsch/Buffer;-><init>([B)V

    array-length v3, v3

    invoke-virtual {v1, v3}, Lcom/jcraft/jsch/Buffer;->skip(I)V

    invoke-virtual {v1}, Lcom/jcraft/jsch/Buffer;->getInt()I

    move-result v3

    new-array v3, v3, [B

    invoke-virtual {v1, v3}, Lcom/jcraft/jsch/Buffer;->getByte([B)V

    invoke-virtual {v1}, Lcom/jcraft/jsch/Buffer;->getInt()I

    move-result v3

    new-array v3, v3, [B

    invoke-virtual {v1, v3}, Lcom/jcraft/jsch/Buffer;->getByte([B)V

    invoke-virtual {v1}, Lcom/jcraft/jsch/Buffer;->getInt()I

    move-result v4

    new-array v4, v4, [B

    invoke-virtual {v1, v4}, Lcom/jcraft/jsch/Buffer;->getByte([B)V

    new-instance v1, Lcom/jcraft/jsch/KeyPairRSA;

    invoke-direct {v1, p0, v4, v3, v2}, Lcom/jcraft/jsch/KeyPairRSA;-><init>(Lcom/jcraft/jsch/JSch;[B[B[B)V

    goto :goto_0

    :cond_4
    const-string v4, "ssh-dss"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    new-instance v1, Lcom/jcraft/jsch/Buffer;

    invoke-direct {v1, v3}, Lcom/jcraft/jsch/Buffer;-><init>([B)V

    array-length v2, v3

    invoke-virtual {v1, v2}, Lcom/jcraft/jsch/Buffer;->skip(I)V

    invoke-virtual {v1}, Lcom/jcraft/jsch/Buffer;->getInt()I

    move-result v2

    new-array v2, v2, [B

    invoke-virtual {v1, v2}, Lcom/jcraft/jsch/Buffer;->getByte([B)V

    invoke-virtual {v1}, Lcom/jcraft/jsch/Buffer;->getInt()I

    move-result v2

    new-array v5, v2, [B

    invoke-virtual {v1, v5}, Lcom/jcraft/jsch/Buffer;->getByte([B)V

    invoke-virtual {v1}, Lcom/jcraft/jsch/Buffer;->getInt()I

    move-result v2

    new-array v6, v2, [B

    invoke-virtual {v1, v6}, Lcom/jcraft/jsch/Buffer;->getByte([B)V

    invoke-virtual {v1}, Lcom/jcraft/jsch/Buffer;->getInt()I

    move-result v2

    new-array v7, v2, [B

    invoke-virtual {v1, v7}, Lcom/jcraft/jsch/Buffer;->getByte([B)V

    invoke-virtual {v1}, Lcom/jcraft/jsch/Buffer;->getInt()I

    move-result v2

    new-array v8, v2, [B

    invoke-virtual {v1, v8}, Lcom/jcraft/jsch/Buffer;->getByte([B)V

    new-instance v1, Lcom/jcraft/jsch/KeyPairDSA;

    const/4 v9, 0x0

    move-object v3, v1

    move-object v4, p0

    invoke-direct/range {v3 .. v9}, Lcom/jcraft/jsch/KeyPairDSA;-><init>(Lcom/jcraft/jsch/JSch;[B[B[B[B[B)V

    :goto_0
    const-string p0, "Encryption"

    invoke-virtual {p1, p0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    const-string v2, "none"

    invoke-virtual {p0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    iput-boolean p0, v1, Lcom/jcraft/jsch/KeyPair;->encrypted:Z

    const/4 p0, 0x2

    iput p0, v1, Lcom/jcraft/jsch/KeyPair;->vendor:I

    const-string p0, "Comment"

    invoke-virtual {p1, p0}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    iput-object p0, v1, Lcom/jcraft/jsch/KeyPair;->publicKeyComment:Ljava/lang/String;

    iget-boolean p0, v1, Lcom/jcraft/jsch/KeyPair;->encrypted:Z

    if-eqz p0, :cond_6

    const-string p0, "aes256-cbc"

    invoke-static {p0}, Lcom/jcraft/jsch/JSch;->getConfig(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/jcraft/jsch/Session;->checkCipher(Ljava/lang/String;)Z

    move-result p1

    const-string v2, "The cipher \'aes256-cbc\' is required, but it is not available."

    if-eqz p1, :cond_5

    :try_start_0
    invoke-static {p0}, Lcom/jcraft/jsch/JSch;->getConfig(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/jcraft/jsch/Cipher;

    iput-object p0, v1, Lcom/jcraft/jsch/KeyPair;->cipher:Lcom/jcraft/jsch/Cipher;

    invoke-interface {p0}, Lcom/jcraft/jsch/Cipher;->getIVSize()I

    move-result p0

    new-array p0, p0, [B

    iput-object p0, v1, Lcom/jcraft/jsch/KeyPair;->iv:[B
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    iput-object v0, v1, Lcom/jcraft/jsch/KeyPair;->data:[B

    goto :goto_1

    :catch_0
    new-instance p0, Lcom/jcraft/jsch/JSchException;

    invoke-direct {p0, v2}, Lcom/jcraft/jsch/JSchException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    new-instance p0, Lcom/jcraft/jsch/JSchException;

    invoke-direct {p0, v2}, Lcom/jcraft/jsch/JSchException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    iput-object v0, v1, Lcom/jcraft/jsch/KeyPair;->data:[B

    invoke-virtual {v1, v0}, Lcom/jcraft/jsch/KeyPair;->parse([B)Z

    :goto_1
    return-object v1

    :cond_7
    return-object v2
.end method

.method private static parseHeader(Lcom/jcraft/jsch/Buffer;Ljava/util/Hashtable;)Z
    .locals 8

    iget-object v0, p0, Lcom/jcraft/jsch/Buffer;->buffer:[B

    iget v1, p0, Lcom/jcraft/jsch/Buffer;->index:I

    move v2, v1

    :goto_0
    array-length v3, v0

    const/16 v4, 0xd

    const/4 v5, 0x0

    if-ge v2, v3, :cond_2

    aget-byte v3, v0, v2

    if-ne v3, v4, :cond_0

    goto :goto_1

    :cond_0
    const/16 v6, 0x3a

    if-ne v3, v6, :cond_1

    new-instance v3, Ljava/lang/String;

    sub-int v6, v2, v1

    invoke-direct {v3, v0, v1, v6}, Ljava/lang/String;-><init>([BII)V

    add-int/lit8 v1, v2, 0x1

    array-length v6, v0

    if-ge v1, v6, :cond_3

    aget-byte v6, v0, v1

    const/16 v7, 0x20

    if-ne v6, v7, :cond_3

    add-int/lit8 v2, v2, 0x2

    move v1, v2

    goto :goto_2

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    move-object v3, v5

    :cond_3
    :goto_2
    const/4 v2, 0x0

    if-nez v3, :cond_4

    return v2

    :cond_4
    move v6, v1

    :goto_3
    array-length v7, v0

    if-ge v6, v7, :cond_6

    aget-byte v7, v0, v6

    if-ne v7, v4, :cond_5

    new-instance v5, Ljava/lang/String;

    sub-int v4, v6, v1

    invoke-direct {v5, v0, v1, v4}, Ljava/lang/String;-><init>([BII)V

    add-int/lit8 v1, v6, 0x1

    array-length v4, v0

    if-ge v1, v4, :cond_6

    aget-byte v0, v0, v1

    const/16 v4, 0xa

    if-ne v0, v4, :cond_6

    add-int/lit8 v6, v6, 0x2

    move v1, v6

    goto :goto_4

    :cond_5
    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_6
    :goto_4
    if-eqz v5, :cond_7

    invoke-virtual {p1, v3, v5}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput v1, p0, Lcom/jcraft/jsch/Buffer;->index:I

    :cond_7
    if-eqz v5, :cond_8

    const/4 v2, 0x1

    :cond_8
    return v2
.end method

.method private static parseLines(Lcom/jcraft/jsch/Buffer;I)[B
    .locals 8

    iget-object v0, p0, Lcom/jcraft/jsch/Buffer;->buffer:[B

    iget v1, p0, Lcom/jcraft/jsch/Buffer;->index:I

    const/4 v2, 0x0

    :goto_0
    add-int/lit8 v3, p1, -0x1

    if-lez p1, :cond_5

    move p1, v1

    :goto_1
    array-length v4, v0

    if-le v4, p1, :cond_3

    add-int/lit8 v4, p1, 0x1

    aget-byte p1, v0, p1

    const/16 v5, 0xd

    if-ne p1, v5, :cond_2

    const/4 p1, 0x0

    if-nez v2, :cond_1

    sub-int v2, v4, v1

    add-int/lit8 v2, v2, -0x1

    new-array v5, v2, [B

    invoke-static {v0, v1, v5, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_0
    move p1, v4

    move-object v2, v5

    goto :goto_3

    :cond_1
    array-length v5, v2

    add-int/2addr v5, v4

    sub-int/2addr v5, v1

    add-int/lit8 v5, v5, -0x1

    new-array v5, v5, [B

    array-length v6, v2

    invoke-static {v2, p1, v5, p1, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v6, v2

    sub-int v7, v4, v1

    add-int/lit8 v7, v7, -0x1

    invoke-static {v0, v1, v5, v6, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move v1, p1

    :goto_2
    array-length v6, v2

    if-ge v1, v6, :cond_0

    aput-byte p1, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_2
    move p1, v4

    goto :goto_1

    :cond_3
    :goto_3
    aget-byte v1, v0, p1

    const/16 v4, 0xa

    if-ne v1, v4, :cond_4

    add-int/lit8 p1, p1, 0x1

    :cond_4
    move v1, p1

    move p1, v3

    goto :goto_0

    :cond_5
    if-eqz v2, :cond_6

    iput v1, p0, Lcom/jcraft/jsch/Buffer;->index:I

    :cond_6
    return-object v2
.end method


# virtual methods
.method public copy(Lcom/jcraft/jsch/KeyPair;)V
    .locals 1

    iget-object v0, p1, Lcom/jcraft/jsch/KeyPair;->publickeyblob:[B

    iput-object v0, p0, Lcom/jcraft/jsch/KeyPair;->publickeyblob:[B

    iget v0, p1, Lcom/jcraft/jsch/KeyPair;->vendor:I

    iput v0, p0, Lcom/jcraft/jsch/KeyPair;->vendor:I

    iget-object v0, p1, Lcom/jcraft/jsch/KeyPair;->publicKeyComment:Ljava/lang/String;

    iput-object v0, p0, Lcom/jcraft/jsch/KeyPair;->publicKeyComment:Ljava/lang/String;

    iget-object p1, p1, Lcom/jcraft/jsch/KeyPair;->cipher:Lcom/jcraft/jsch/Cipher;

    iput-object p1, p0, Lcom/jcraft/jsch/KeyPair;->cipher:Lcom/jcraft/jsch/Cipher;

    return-void
.end method

.method public countLength(I)I
    .locals 2

    const/16 v0, 0x7f

    const/4 v1, 0x1

    if-gt p1, v0, :cond_0

    return v1

    :cond_0
    :goto_0
    if-lez p1, :cond_1

    ushr-int/lit8 p1, p1, 0x8

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public decrypt(Ljava/lang/String;)Z
    .locals 1

    if-eqz p1, :cond_1

    .line 6
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 7
    :cond_0
    invoke-static {p1}, Lcom/jcraft/jsch/Util;->str2byte(Ljava/lang/String;)[B

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jcraft/jsch/KeyPair;->decrypt([B)Z

    move-result p1

    return p1

    .line 8
    :cond_1
    :goto_0
    iget-boolean p1, p0, Lcom/jcraft/jsch/KeyPair;->encrypted:Z

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public decrypt([B)Z
    .locals 4

    .line 9
    iget-boolean v0, p0, Lcom/jcraft/jsch/KeyPair;->encrypted:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    if-nez p1, :cond_1

    xor-int/lit8 p1, v0, 0x1

    return p1

    .line 10
    :cond_1
    array-length v0, p1

    new-array v2, v0, [B

    const/4 v3, 0x0

    .line 11
    invoke-static {p1, v3, v2, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 12
    iget-object p1, p0, Lcom/jcraft/jsch/KeyPair;->data:[B

    iget-object v0, p0, Lcom/jcraft/jsch/KeyPair;->iv:[B

    invoke-direct {p0, p1, v2, v0}, Lcom/jcraft/jsch/KeyPair;->decrypt([B[B[B)[B

    move-result-object p1

    .line 13
    invoke-static {v2}, Lcom/jcraft/jsch/Util;->bzero([B)V

    .line 14
    invoke-virtual {p0, p1}, Lcom/jcraft/jsch/KeyPair;->parse([B)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 15
    iput-boolean v3, p0, Lcom/jcraft/jsch/KeyPair;->encrypted:Z

    .line 16
    :cond_2
    iget-boolean p1, p0, Lcom/jcraft/jsch/KeyPair;->encrypted:Z

    xor-int/2addr p1, v1

    return p1
.end method

.method public dispose()V
    .locals 1

    iget-object v0, p0, Lcom/jcraft/jsch/KeyPair;->passphrase:[B

    invoke-static {v0}, Lcom/jcraft/jsch/Util;->bzero([B)V

    return-void
.end method

.method public finalize()V
    .locals 0

    invoke-virtual {p0}, Lcom/jcraft/jsch/KeyPair;->dispose()V

    return-void
.end method

.method public abstract forSSHAgent()[B
.end method

.method public declared-synchronized genKey([B[B)[B
    .locals 10

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/jcraft/jsch/KeyPair;->cipher:Lcom/jcraft/jsch/Cipher;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/jcraft/jsch/KeyPair;->genCipher()Lcom/jcraft/jsch/Cipher;

    move-result-object v0

    iput-object v0, p0, Lcom/jcraft/jsch/KeyPair;->cipher:Lcom/jcraft/jsch/Cipher;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_9

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/jcraft/jsch/KeyPair;->hash:Lcom/jcraft/jsch/HASH;

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/jcraft/jsch/KeyPair;->genHash()Lcom/jcraft/jsch/HASH;

    move-result-object v0

    iput-object v0, p0, Lcom/jcraft/jsch/KeyPair;->hash:Lcom/jcraft/jsch/HASH;

    :cond_1
    iget-object v0, p0, Lcom/jcraft/jsch/KeyPair;->cipher:Lcom/jcraft/jsch/Cipher;

    invoke-interface {v0}, Lcom/jcraft/jsch/Cipher;->getBlockSize()I

    move-result v0

    new-array v1, v0, [B

    iget-object v2, p0, Lcom/jcraft/jsch/KeyPair;->hash:Lcom/jcraft/jsch/HASH;

    invoke-interface {v2}, Lcom/jcraft/jsch/HASH;->getBlockSize()I

    move-result v2

    div-int v3, v0, v2

    mul-int/2addr v3, v2

    rem-int v4, v0, v2

    const/4 v5, 0x0

    if-nez v4, :cond_2

    move v4, v5

    goto :goto_1

    :cond_2
    move v4, v2

    :goto_1
    add-int/2addr v3, v4

    new-array v4, v3, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget v6, p0, Lcom/jcraft/jsch/KeyPair;->vendor:I

    const/4 v7, 0x0

    if-nez v6, :cond_6

    move v6, v5

    :goto_2
    add-int v8, v6, v2

    if-gt v8, v3, :cond_5

    if-eqz v7, :cond_3

    iget-object v8, p0, Lcom/jcraft/jsch/KeyPair;->hash:Lcom/jcraft/jsch/HASH;

    array-length v9, v7

    invoke-interface {v8, v7, v5, v9}, Lcom/jcraft/jsch/HASH;->update([BII)V

    goto :goto_3

    :catch_0
    move-exception p1

    goto/16 :goto_7

    :cond_3
    :goto_3
    iget-object v7, p0, Lcom/jcraft/jsch/KeyPair;->hash:Lcom/jcraft/jsch/HASH;

    array-length v8, p1

    invoke-interface {v7, p1, v5, v8}, Lcom/jcraft/jsch/HASH;->update([BII)V

    iget-object v7, p0, Lcom/jcraft/jsch/KeyPair;->hash:Lcom/jcraft/jsch/HASH;

    array-length v8, p2

    const/16 v9, 0x8

    if-le v8, v9, :cond_4

    goto :goto_4

    :cond_4
    array-length v9, p2

    :goto_4
    invoke-interface {v7, p2, v5, v9}, Lcom/jcraft/jsch/HASH;->update([BII)V

    iget-object v7, p0, Lcom/jcraft/jsch/KeyPair;->hash:Lcom/jcraft/jsch/HASH;

    invoke-interface {v7}, Lcom/jcraft/jsch/HASH;->digest()[B

    move-result-object v7

    array-length v8, v7

    invoke-static {v7, v5, v4, v6, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v8, v7

    add-int/2addr v6, v8

    goto :goto_2

    :cond_5
    invoke-static {v4, v5, v1, v5, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_8

    :cond_6
    const/4 p2, 0x1

    if-ne v6, p2, :cond_9

    move p2, v5

    :goto_5
    add-int v6, p2, v2

    if-gt v6, v3, :cond_8

    if-eqz v7, :cond_7

    iget-object v6, p0, Lcom/jcraft/jsch/KeyPair;->hash:Lcom/jcraft/jsch/HASH;

    array-length v8, v7

    invoke-interface {v6, v7, v5, v8}, Lcom/jcraft/jsch/HASH;->update([BII)V

    :cond_7
    iget-object v6, p0, Lcom/jcraft/jsch/KeyPair;->hash:Lcom/jcraft/jsch/HASH;

    array-length v7, p1

    invoke-interface {v6, p1, v5, v7}, Lcom/jcraft/jsch/HASH;->update([BII)V

    iget-object v6, p0, Lcom/jcraft/jsch/KeyPair;->hash:Lcom/jcraft/jsch/HASH;

    invoke-interface {v6}, Lcom/jcraft/jsch/HASH;->digest()[B

    move-result-object v7

    array-length v6, v7

    invoke-static {v7, v5, v4, p2, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v6, v7

    add-int/2addr p2, v6

    goto :goto_5

    :cond_8
    invoke-static {v4, v5, v1, v5, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_8

    :cond_9
    const/4 p2, 0x2

    if-ne v6, p2, :cond_a

    const-string v0, "sha-1"

    invoke-static {v0}, Lcom/jcraft/jsch/JSch;->getConfig(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/jcraft/jsch/HASH;

    const/4 v2, 0x4

    new-array v3, v2, [B

    const/16 v4, 0x28

    new-array v1, v4, [B

    move v4, v5

    :goto_6
    if-ge v4, p2, :cond_a

    invoke-interface {v0}, Lcom/jcraft/jsch/HASH;->init()V

    const/4 v6, 0x3

    int-to-byte v7, v4

    aput-byte v7, v3, v6

    invoke-interface {v0, v3, v5, v2}, Lcom/jcraft/jsch/HASH;->update([BII)V

    array-length v6, p1

    invoke-interface {v0, p1, v5, v6}, Lcom/jcraft/jsch/HASH;->update([BII)V

    invoke-interface {v0}, Lcom/jcraft/jsch/HASH;->digest()[B

    move-result-object v6

    mul-int/lit8 v7, v4, 0x14

    const/16 v8, 0x14

    invoke-static {v6, v5, v1, v7, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    :goto_7
    :try_start_2
    sget-object p2, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-virtual {p2, p1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_a
    :goto_8
    monitor-exit p0

    return-object v1

    :goto_9
    monitor-exit p0

    throw p1
.end method

.method public abstract generate(I)V
.end method

.method public abstract getBegin()[B
.end method

.method public abstract getEnd()[B
.end method

.method public getFingerPrint()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/jcraft/jsch/KeyPair;->hash:Lcom/jcraft/jsch/HASH;

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/jcraft/jsch/KeyPair;->genHash()Lcom/jcraft/jsch/HASH;

    move-result-object v0

    iput-object v0, p0, Lcom/jcraft/jsch/KeyPair;->hash:Lcom/jcraft/jsch/HASH;

    :cond_0
    invoke-virtual {p0}, Lcom/jcraft/jsch/KeyPair;->getPublicKeyBlob()[B

    move-result-object v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    :cond_1
    iget-object v1, p0, Lcom/jcraft/jsch/KeyPair;->hash:Lcom/jcraft/jsch/HASH;

    invoke-static {v1, v0}, Lcom/jcraft/jsch/Util;->getFingerPrint(Lcom/jcraft/jsch/HASH;[B)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract getKeySize()I
.end method

.method public abstract getKeyType()I
.end method

.method public abstract getKeyTypeName()[B
.end method

.method public abstract getPrivateKey()[B
.end method

.method public getPublicKeyBlob()[B
    .locals 1

    iget-object v0, p0, Lcom/jcraft/jsch/KeyPair;->publickeyblob:[B

    return-object v0
.end method

.method public getPublicKeyComment()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jcraft/jsch/KeyPair;->publicKeyComment:Ljava/lang/String;

    return-object v0
.end method

.method public abstract getSignature([B)[B
.end method

.method public abstract getVerifier()Lcom/jcraft/jsch/Signature;
.end method

.method public isEncrypted()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jcraft/jsch/KeyPair;->encrypted:Z

    return v0
.end method

.method public abstract parse([B)Z
.end method

.method public setPassphrase(Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-static {p1}, Lcom/jcraft/jsch/Util;->str2byte(Ljava/lang/String;)[B

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/jcraft/jsch/KeyPair;->setPassphrase([B)V

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 3
    invoke-virtual {p0, p1}, Lcom/jcraft/jsch/KeyPair;->setPassphrase([B)V

    :goto_1
    return-void
.end method

.method public setPassphrase([B)V
    .locals 1

    if-eqz p1, :cond_0

    .line 4
    array-length v0, p1

    if-nez v0, :cond_0

    const/4 p1, 0x0

    .line 5
    :cond_0
    iput-object p1, p0, Lcom/jcraft/jsch/KeyPair;->passphrase:[B

    return-void
.end method

.method public setPublicKeyComment(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/jcraft/jsch/KeyPair;->publicKeyComment:Ljava/lang/String;

    return-void
.end method

.method public writeDATA([BBI[B)I
    .locals 1

    add-int/lit8 v0, p3, 0x1

    aput-byte p2, p1, p3

    array-length p2, p4

    invoke-virtual {p0, p1, v0, p2}, Lcom/jcraft/jsch/KeyPair;->writeLength([BII)I

    move-result p2

    const/4 p3, 0x0

    array-length v0, p4

    invoke-static {p4, p3, p1, p2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length p1, p4

    add-int/2addr p2, p1

    return p2
.end method

.method public writeINTEGER([BI[B)I
    .locals 2

    add-int/lit8 v0, p2, 0x1

    const/4 v1, 0x2

    aput-byte v1, p1, p2

    array-length p2, p3

    invoke-virtual {p0, p1, v0, p2}, Lcom/jcraft/jsch/KeyPair;->writeLength([BII)I

    move-result p2

    const/4 v0, 0x0

    array-length v1, p3

    invoke-static {p3, v0, p1, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length p1, p3

    add-int/2addr p2, p1

    return p2
.end method

.method public writeLength([BII)I
    .locals 4

    invoke-virtual {p0, p3}, Lcom/jcraft/jsch/KeyPair;->countLength(I)I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-nez v0, :cond_0

    add-int/lit8 v0, p2, 0x1

    int-to-byte p3, p3

    aput-byte p3, p1, p2

    return v0

    :cond_0
    add-int/lit8 v1, p2, 0x1

    or-int/lit16 v2, v0, 0x80

    int-to-byte v2, v2

    aput-byte v2, p1, p2

    add-int p2, v1, v0

    :goto_0
    if-lez v0, :cond_1

    add-int v2, v1, v0

    add-int/lit8 v2, v2, -0x1

    and-int/lit16 v3, p3, 0xff

    int-to-byte v3, v3

    aput-byte v3, p1, v2

    ushr-int/lit8 p3, p3, 0x8

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return p2
.end method

.method public writeOCTETSTRING([BI[B)I
    .locals 2

    add-int/lit8 v0, p2, 0x1

    const/4 v1, 0x4

    aput-byte v1, p1, p2

    array-length p2, p3

    invoke-virtual {p0, p1, v0, p2}, Lcom/jcraft/jsch/KeyPair;->writeLength([BII)I

    move-result p2

    const/4 v0, 0x0

    array-length v1, p3

    invoke-static {p3, v0, p1, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length p1, p3

    add-int/2addr p2, p1

    return p2
.end method

.method public writePrivateKey(Ljava/io/OutputStream;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/jcraft/jsch/KeyPair;->writePrivateKey(Ljava/io/OutputStream;[B)V

    return-void
.end method

.method public writePrivateKey(Ljava/io/OutputStream;[B)V
    .locals 5

    if-nez p2, :cond_0

    .line 2
    iget-object p2, p0, Lcom/jcraft/jsch/KeyPair;->passphrase:[B

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/jcraft/jsch/KeyPair;->getPrivateKey()[B

    move-result-object v0

    const/4 v1, 0x1

    .line 4
    new-array v2, v1, [[B

    .line 5
    invoke-direct {p0, v0, v2, p2}, Lcom/jcraft/jsch/KeyPair;->encrypt([B[[B[B)[B

    move-result-object v3

    if-eq v3, v0, :cond_1

    .line 6
    invoke-static {v0}, Lcom/jcraft/jsch/Util;->bzero([B)V

    :cond_1
    const/4 v0, 0x0

    .line 7
    aget-object v2, v2, v0

    .line 8
    array-length v4, v3

    invoke-static {v3, v0, v4}, Lcom/jcraft/jsch/Util;->toBase64([BII)[B

    move-result-object v3

    .line 9
    :try_start_0
    invoke-virtual {p0}, Lcom/jcraft/jsch/KeyPair;->getBegin()[B

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/io/OutputStream;->write([B)V

    sget-object v4, Lcom/jcraft/jsch/KeyPair;->cr:[B

    invoke-virtual {p1, v4}, Ljava/io/OutputStream;->write([B)V

    if-eqz p2, :cond_3

    .line 10
    sget-object p2, Lcom/jcraft/jsch/KeyPair;->header:[[B

    aget-object p2, p2, v0

    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {p1, v4}, Ljava/io/OutputStream;->write([B)V

    .line 11
    sget-object p2, Lcom/jcraft/jsch/KeyPair;->header:[[B

    aget-object p2, p2, v1

    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    move p2, v0

    .line 12
    :goto_0
    array-length v1, v2

    if-ge p2, v1, :cond_2

    .line 13
    aget-byte v1, v2, p2

    ushr-int/lit8 v1, v1, 0x4

    and-int/lit8 v1, v1, 0xf

    int-to-byte v1, v1

    invoke-static {v1}, Lcom/jcraft/jsch/KeyPair;->b2a(B)B

    move-result v1

    invoke-virtual {p1, v1}, Ljava/io/OutputStream;->write(I)V

    .line 14
    aget-byte v1, v2, p2

    and-int/lit8 v1, v1, 0xf

    int-to-byte v1, v1

    invoke-static {v1}, Lcom/jcraft/jsch/KeyPair;->b2a(B)B

    move-result v1

    invoke-virtual {p1, v1}, Ljava/io/OutputStream;->write(I)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 15
    :cond_2
    sget-object p2, Lcom/jcraft/jsch/KeyPair;->cr:[B

    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    .line 16
    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    .line 17
    :cond_3
    :goto_1
    array-length p2, v3

    if-ge v0, p2, :cond_5

    add-int/lit8 p2, v0, 0x40

    .line 18
    array-length v1, v3

    if-ge p2, v1, :cond_4

    const/16 v1, 0x40

    .line 19
    invoke-virtual {p1, v3, v0, v1}, Ljava/io/OutputStream;->write([BII)V

    .line 20
    sget-object v0, Lcom/jcraft/jsch/KeyPair;->cr:[B

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    move v0, p2

    goto :goto_1

    .line 21
    :cond_4
    array-length p2, v3

    sub-int/2addr p2, v0

    invoke-virtual {p1, v3, v0, p2}, Ljava/io/OutputStream;->write([BII)V

    .line 22
    sget-object p2, Lcom/jcraft/jsch/KeyPair;->cr:[B

    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    .line 23
    :cond_5
    invoke-virtual {p0}, Lcom/jcraft/jsch/KeyPair;->getEnd()[B

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    sget-object p2, Lcom/jcraft/jsch/KeyPair;->cr:[B

    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public writePrivateKey(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 24
    invoke-virtual {p0, p1, v0}, Lcom/jcraft/jsch/KeyPair;->writePrivateKey(Ljava/lang/String;[B)V

    return-void
.end method

.method public writePrivateKey(Ljava/lang/String;[B)V
    .locals 1

    .line 25
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    .line 26
    invoke-virtual {p0, v0, p2}, Lcom/jcraft/jsch/KeyPair;->writePrivateKey(Ljava/io/OutputStream;[B)V

    .line 27
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    return-void
.end method

.method public writePublicKey(Ljava/io/OutputStream;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/jcraft/jsch/KeyPair;->getPublicKeyBlob()[B

    move-result-object v0

    .line 2
    array-length v1, v0

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/jcraft/jsch/Util;->toBase64([BII)[B

    move-result-object v0

    .line 3
    :try_start_0
    invoke-virtual {p0}, Lcom/jcraft/jsch/KeyPair;->getKeyTypeName()[B

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/io/OutputStream;->write([B)V

    sget-object v1, Lcom/jcraft/jsch/KeyPair;->space:[B

    invoke-virtual {p1, v1}, Ljava/io/OutputStream;->write([B)V

    .line 4
    array-length v1, v0

    invoke-virtual {p1, v0, v2, v1}, Ljava/io/OutputStream;->write([BII)V

    sget-object v0, Lcom/jcraft/jsch/KeyPair;->space:[B

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 5
    invoke-static {p2}, Lcom/jcraft/jsch/Util;->str2byte(Ljava/lang/String;)[B

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    .line 6
    sget-object p2, Lcom/jcraft/jsch/KeyPair;->cr:[B

    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public writePublicKey(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 7
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    .line 8
    invoke-virtual {p0, v0, p2}, Lcom/jcraft/jsch/KeyPair;->writePublicKey(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 9
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    return-void
.end method

.method public writeSECSHPublicKey(Ljava/io/OutputStream;Ljava/lang/String;)V
    .locals 5

    .line 1
    const-string v0, "Comment: \""

    invoke-virtual {p0}, Lcom/jcraft/jsch/KeyPair;->getPublicKeyBlob()[B

    move-result-object v1

    .line 2
    array-length v2, v1

    const/4 v3, 0x0

    invoke-static {v1, v3, v2}, Lcom/jcraft/jsch/Util;->toBase64([BII)[B

    move-result-object v1

    .line 3
    :try_start_0
    const-string v2, "---- BEGIN SSH2 PUBLIC KEY ----"

    invoke-static {v2}, Lcom/jcraft/jsch/Util;->str2byte(Ljava/lang/String;)[B

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/io/OutputStream;->write([B)V

    sget-object v2, Lcom/jcraft/jsch/KeyPair;->cr:[B

    invoke-virtual {p1, v2}, Ljava/io/OutputStream;->write([B)V

    .line 4
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\""

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/jcraft/jsch/Util;->str2byte(Ljava/lang/String;)[B

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {p1, v2}, Ljava/io/OutputStream;->write([B)V

    .line 5
    :goto_0
    array-length p2, v1

    if-ge v3, p2, :cond_1

    .line 6
    array-length p2, v1

    sub-int/2addr p2, v3

    const/16 v0, 0x46

    if-ge p2, v0, :cond_0

    array-length p2, v1

    sub-int v0, p2, v3

    .line 7
    :cond_0
    invoke-virtual {p1, v1, v3, v0}, Ljava/io/OutputStream;->write([BII)V

    sget-object p2, Lcom/jcraft/jsch/KeyPair;->cr:[B

    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    add-int/2addr v3, v0

    goto :goto_0

    .line 8
    :cond_1
    const-string p2, "---- END SSH2 PUBLIC KEY ----"

    invoke-static {p2}, Lcom/jcraft/jsch/Util;->str2byte(Ljava/lang/String;)[B

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V

    sget-object p2, Lcom/jcraft/jsch/KeyPair;->cr:[B

    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public writeSECSHPublicKey(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 9
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    .line 10
    invoke-virtual {p0, v0, p2}, Lcom/jcraft/jsch/KeyPair;->writeSECSHPublicKey(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 11
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V

    return-void
.end method

.method public writeSEQUENCE([BII)I
    .locals 2

    add-int/lit8 v0, p2, 0x1

    const/16 v1, 0x30

    aput-byte v1, p1, p2

    invoke-virtual {p0, p1, v0, p3}, Lcom/jcraft/jsch/KeyPair;->writeLength([BII)I

    move-result p1

    return p1
.end method
