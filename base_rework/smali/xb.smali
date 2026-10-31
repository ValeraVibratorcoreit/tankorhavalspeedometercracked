.class public final Lxb;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:J

.field public final d:[B


# direct methods
.method public constructor <init>(II[B)V
    .locals 6

    const-wide/16 v4, -0x1

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    .line 1
    invoke-direct/range {v0 .. v5}, Lxb;-><init>(II[BJ)V

    return-void
.end method

.method public constructor <init>(II[BJ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lxb;->a:I

    .line 4
    iput p2, p0, Lxb;->b:I

    .line 5
    iput-wide p4, p0, Lxb;->c:J

    .line 6
    iput-object p3, p0, Lxb;->d:[B

    return-void
.end method

.method public static a(JLjava/nio/ByteOrder;)Lxb;
    .locals 3

    const/4 v0, 0x1

    new-array v1, v0, [J

    const/4 v2, 0x0

    aput-wide p0, v1, v2

    sget-object p0, LBb;->C:[I

    const/4 p1, 0x4

    aget p0, p0, p1

    new-array p0, p0, [B

    invoke-static {p0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-virtual {p0, p2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    aget-wide v1, v1, v2

    long-to-int p2, v1

    invoke-virtual {p0, p2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    new-instance p2, Lxb;

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p0

    invoke-direct {p2, p1, v0, p0}, Lxb;-><init>(II[B)V

    return-object p2
.end method

.method public static b(Lzb;Ljava/nio/ByteOrder;)Lxb;
    .locals 4

    filled-new-array {p0}, [Lzb;

    move-result-object p0

    sget-object v0, LBb;->C:[I

    const/4 v1, 0x5

    aget v0, v0, v1

    new-array v0, v0, [B

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    const/4 p1, 0x0

    aget-object p0, p0, p1

    iget-wide v2, p0, Lzb;->a:J

    long-to-int p1, v2

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    iget-wide p0, p0, Lzb;->b:J

    long-to-int p0, p0

    invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    new-instance p0, Lxb;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    const/4 v0, 0x1

    invoke-direct {p0, v1, v0, p1}, Lxb;-><init>(II[B)V

    return-object p0
.end method

.method public static c(ILjava/nio/ByteOrder;)Lxb;
    .locals 2

    filled-new-array {p0}, [I

    move-result-object p0

    sget-object v0, LBb;->C:[I

    const/4 v1, 0x3

    aget v0, v0, v1

    new-array v0, v0, [B

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    const/4 p1, 0x0

    aget p0, p0, p1

    int-to-short p0, p0

    invoke-virtual {v0, p0}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    new-instance p0, Lxb;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    const/4 v0, 0x1

    invoke-direct {p0, v1, v0, p1}, Lxb;-><init>(II[B)V

    return-object p0
.end method


# virtual methods
.method public final d(Ljava/nio/ByteOrder;)D
    .locals 4

    invoke-virtual {p0, p1}, Lxb;->g(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    move-result-object p1

    if-eqz p1, :cond_9

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    return-wide v0

    :cond_0
    instance-of v0, p1, [J

    const-string v1, "There are more than one component"

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_2

    check-cast p1, [J

    array-length v0, p1

    if-ne v0, v3, :cond_1

    aget-wide v0, p1, v2

    long-to-double v0, v0

    return-wide v0

    :cond_1
    new-instance p1, Ljava/lang/NumberFormatException;

    invoke-direct {p1, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    instance-of v0, p1, [I

    if-eqz v0, :cond_4

    check-cast p1, [I

    array-length v0, p1

    if-ne v0, v3, :cond_3

    aget p1, p1, v2

    int-to-double v0, p1

    return-wide v0

    :cond_3
    new-instance p1, Ljava/lang/NumberFormatException;

    invoke-direct {p1, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    instance-of v0, p1, [D

    if-eqz v0, :cond_6

    check-cast p1, [D

    array-length v0, p1

    if-ne v0, v3, :cond_5

    aget-wide v0, p1, v2

    return-wide v0

    :cond_5
    new-instance p1, Ljava/lang/NumberFormatException;

    invoke-direct {p1, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    instance-of v0, p1, [Lzb;

    if-eqz v0, :cond_8

    check-cast p1, [Lzb;

    array-length v0, p1

    if-ne v0, v3, :cond_7

    aget-object p1, p1, v2

    iget-wide v0, p1, Lzb;->a:J

    long-to-double v0, v0

    iget-wide v2, p1, Lzb;->b:J

    long-to-double v2, v2

    div-double/2addr v0, v2

    return-wide v0

    :cond_7
    new-instance p1, Ljava/lang/NumberFormatException;

    invoke-direct {p1, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, Ljava/lang/NumberFormatException;

    const-string v0, "Couldn\'t find a double value"

    invoke-direct {p1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p1, Ljava/lang/NumberFormatException;

    const-string v0, "NULL can\'t be converted to a double value"

    invoke-direct {p1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e(Ljava/nio/ByteOrder;)I
    .locals 4

    invoke-virtual {p0, p1}, Lxb;->g(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    move-result-object p1

    if-eqz p1, :cond_5

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    return p1

    :cond_0
    instance-of v0, p1, [J

    const-string v1, "There are more than one component"

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_2

    check-cast p1, [J

    array-length v0, p1

    if-ne v0, v3, :cond_1

    aget-wide v0, p1, v2

    long-to-int p1, v0

    return p1

    :cond_1
    new-instance p1, Ljava/lang/NumberFormatException;

    invoke-direct {p1, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    instance-of v0, p1, [I

    if-eqz v0, :cond_4

    check-cast p1, [I

    array-length v0, p1

    if-ne v0, v3, :cond_3

    aget p1, p1, v2

    return p1

    :cond_3
    new-instance p1, Ljava/lang/NumberFormatException;

    invoke-direct {p1, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/lang/NumberFormatException;

    const-string v0, "Couldn\'t find a integer value"

    invoke-direct {p1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/NumberFormatException;

    const-string v0, "NULL can\'t be converted to a integer value"

    invoke-direct {p1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final f(Ljava/nio/ByteOrder;)Ljava/lang/String;
    .locals 7

    invoke-virtual {p0, p1}, Lxb;->g(Ljava/nio/ByteOrder;)Ljava/io/Serializable;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    instance-of v1, p1, Ljava/lang/String;

    if-eqz v1, :cond_1

    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    instance-of v2, p1, [J

    const-string v3, ","

    const/4 v4, 0x0

    if-eqz v2, :cond_4

    check-cast p1, [J

    :cond_2
    :goto_0
    array-length v0, p1

    if-ge v4, v0, :cond_3

    aget-wide v5, p1, v4

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    array-length v0, p1

    if-eq v4, v0, :cond_2

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_3
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_4
    instance-of v2, p1, [I

    if-eqz v2, :cond_7

    check-cast p1, [I

    :cond_5
    :goto_1
    array-length v0, p1

    if-ge v4, v0, :cond_6

    aget v0, p1, v4

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    array-length v0, p1

    if-eq v4, v0, :cond_5

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_6
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_7
    instance-of v2, p1, [D

    if-eqz v2, :cond_a

    check-cast p1, [D

    :cond_8
    :goto_2
    array-length v0, p1

    if-ge v4, v0, :cond_9

    aget-wide v5, p1, v4

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    array-length v0, p1

    if-eq v4, v0, :cond_8

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_9
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_a
    instance-of v2, p1, [Lzb;

    if-eqz v2, :cond_d

    check-cast p1, [Lzb;

    :cond_b
    :goto_3
    array-length v0, p1

    if-ge v4, v0, :cond_c

    aget-object v0, p1, v4

    iget-wide v5, v0, Lzb;->a:J

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v0, 0x2f

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    aget-object v0, p1, v4

    iget-wide v5, v0, Lzb;->b:J

    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    array-length v0, p1

    if-eq v4, v0, :cond_b

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_c
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_d
    return-object v0
.end method

.method public final g(Ljava/nio/ByteOrder;)Ljava/io/Serializable;
    .locals 14

    const/4 v0, 0x0

    const/4 v1, 0x1

    iget-object v2, p0, Lxb;->d:[B

    const-string v3, "IOException occurred while closing InputStream"

    const-string v4, "ExifInterface"

    const/4 v5, 0x0

    :try_start_0
    new-instance v6, Lwb;

    invoke-direct {v6, v2}, Lwb;-><init>([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_d
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iput-object p1, v6, Lwb;->b:Ljava/nio/ByteOrder;

    iget p1, p0, Lxb;->a:I
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-wide v7, 0xffffffffL

    iget v9, p0, Lxb;->b:I

    packed-switch p1, :pswitch_data_0

    :try_start_2
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-static {v4, v3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-object v5

    :pswitch_0
    :try_start_3
    new-array p1, v9, [D

    :goto_1
    if-ge v0, v9, :cond_0

    invoke-virtual {v6}, Lwb;->readDouble()D

    move-result-wide v7

    aput-wide v7, p1, v0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    add-int/2addr v0, v1

    goto :goto_1

    :catchall_0
    move-exception p1

    move-object v5, v6

    goto/16 :goto_1b

    :catch_1
    move-exception p1

    goto/16 :goto_19

    :cond_0
    :try_start_4
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_2

    :catch_2
    move-exception v0

    invoke-static {v4, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_2
    return-object p1

    :pswitch_1
    :try_start_5
    new-array p1, v9, [D

    :goto_3
    if-ge v0, v9, :cond_1

    invoke-virtual {v6}, Lwb;->readFloat()F

    move-result v2

    float-to-double v7, v2

    aput-wide v7, p1, v0
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    add-int/2addr v0, v1

    goto :goto_3

    :cond_1
    :try_start_6
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3

    goto :goto_4

    :catch_3
    move-exception v0

    invoke-static {v4, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_4
    return-object p1

    :pswitch_2
    :try_start_7
    new-array p1, v9, [Lzb;

    :goto_5
    if-ge v0, v9, :cond_2

    invoke-virtual {v6}, Lwb;->readInt()I

    move-result v2

    int-to-long v7, v2

    invoke-virtual {v6}, Lwb;->readInt()I

    move-result v2

    int-to-long v10, v2

    new-instance v2, Lzb;

    invoke-direct {v2, v7, v8, v10, v11}, Lzb;-><init>(JJ)V

    aput-object v2, p1, v0
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    add-int/2addr v0, v1

    goto :goto_5

    :cond_2
    :try_start_8
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_4

    goto :goto_6

    :catch_4
    move-exception v0

    invoke-static {v4, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_6
    return-object p1

    :pswitch_3
    :try_start_9
    new-array p1, v9, [I

    :goto_7
    if-ge v0, v9, :cond_3

    invoke-virtual {v6}, Lwb;->readInt()I

    move-result v2

    aput v2, p1, v0
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    add-int/2addr v0, v1

    goto :goto_7

    :cond_3
    :try_start_a
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_5

    goto :goto_8

    :catch_5
    move-exception v0

    invoke-static {v4, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_8
    return-object p1

    :pswitch_4
    :try_start_b
    new-array p1, v9, [I

    :goto_9
    if-ge v0, v9, :cond_4

    invoke-virtual {v6}, Lwb;->readShort()S

    move-result v2

    aput v2, p1, v0
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_1
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    add-int/2addr v0, v1

    goto :goto_9

    :cond_4
    :try_start_c
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_6

    goto :goto_a

    :catch_6
    move-exception v0

    invoke-static {v4, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_a
    return-object p1

    :pswitch_5
    :try_start_d
    new-array p1, v9, [Lzb;

    :goto_b
    if-ge v0, v9, :cond_5

    invoke-virtual {v6}, Lwb;->readInt()I

    move-result v2

    int-to-long v10, v2

    and-long/2addr v10, v7

    invoke-virtual {v6}, Lwb;->readInt()I

    move-result v2

    int-to-long v12, v2

    and-long/2addr v12, v7

    new-instance v2, Lzb;

    invoke-direct {v2, v10, v11, v12, v13}, Lzb;-><init>(JJ)V

    aput-object v2, p1, v0
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_1
    .catchall {:try_start_d .. :try_end_d} :catchall_0

    add-int/2addr v0, v1

    goto :goto_b

    :cond_5
    :try_start_e
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_7

    goto :goto_c

    :catch_7
    move-exception v0

    invoke-static {v4, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_c
    return-object p1

    :pswitch_6
    :try_start_f
    new-array p1, v9, [J

    :goto_d
    if-ge v0, v9, :cond_6

    invoke-virtual {v6}, Lwb;->readInt()I

    move-result v2

    int-to-long v10, v2

    and-long/2addr v10, v7

    aput-wide v10, p1, v0
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_1
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    add-int/2addr v0, v1

    goto :goto_d

    :cond_6
    :try_start_10
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_8

    goto :goto_e

    :catch_8
    move-exception v0

    invoke-static {v4, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_e
    return-object p1

    :pswitch_7
    :try_start_11
    new-array p1, v9, [I

    :goto_f
    if-ge v0, v9, :cond_7

    invoke-virtual {v6}, Lwb;->readUnsignedShort()I

    move-result v2

    aput v2, p1, v0
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_1
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    add-int/2addr v0, v1

    goto :goto_f

    :cond_7
    :try_start_12
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_9

    goto :goto_10

    :catch_9
    move-exception v0

    invoke-static {v4, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_10
    return-object p1

    :pswitch_8
    :try_start_13
    sget-object p1, LBb;->D:[B

    array-length p1, p1

    if-lt v9, p1, :cond_a

    move p1, v0

    :goto_11
    sget-object v7, LBb;->D:[B

    array-length v8, v7

    if-ge p1, v8, :cond_9

    aget-byte v8, v2, p1

    aget-byte v7, v7, p1

    if-eq v8, v7, :cond_8

    goto :goto_12

    :cond_8
    add-int/2addr p1, v1

    goto :goto_11

    :cond_9
    array-length v0, v7

    :cond_a
    :goto_12
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    :goto_13
    if-ge v0, v9, :cond_d

    aget-byte v7, v2, v0

    if-nez v7, :cond_b

    goto :goto_15

    :cond_b
    const/16 v8, 0x20

    if-lt v7, v8, :cond_c

    int-to-char v7, v7

    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_14

    :cond_c
    const/16 v7, 0x3f

    invoke-virtual {p1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_14
    add-int/2addr v0, v1

    goto :goto_13

    :cond_d
    :goto_15
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_1
    .catchall {:try_start_13 .. :try_end_13} :catchall_0

    :try_start_14
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_14
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_a

    goto :goto_16

    :catch_a
    move-exception v0

    invoke-static {v4, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_16
    return-object p1

    :pswitch_9
    :try_start_15
    array-length p1, v2

    if-ne p1, v1, :cond_e

    aget-byte p1, v2, v0

    if-ltz p1, :cond_e

    if-gt p1, v1, :cond_e

    new-instance v2, Ljava/lang/String;

    add-int/lit8 p1, p1, 0x30

    int-to-char p1, p1

    new-array v1, v1, [C

    aput-char p1, v1, v0

    invoke-direct {v2, v1}, Ljava/lang/String;-><init>([C)V
    :try_end_15
    .catch Ljava/io/IOException; {:try_start_15 .. :try_end_15} :catch_1
    .catchall {:try_start_15 .. :try_end_15} :catchall_0

    :try_start_16
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_16
    .catch Ljava/io/IOException; {:try_start_16 .. :try_end_16} :catch_b

    goto :goto_17

    :catch_b
    move-exception p1

    invoke-static {v4, v3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_17
    return-object v2

    :cond_e
    :try_start_17
    new-instance p1, Ljava/lang/String;

    sget-object v0, LBb;->L:Ljava/nio/charset/Charset;

    invoke-direct {p1, v2, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_17
    .catch Ljava/io/IOException; {:try_start_17 .. :try_end_17} :catch_1
    .catchall {:try_start_17 .. :try_end_17} :catchall_0

    :try_start_18
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_18
    .catch Ljava/io/IOException; {:try_start_18 .. :try_end_18} :catch_c

    goto :goto_18

    :catch_c
    move-exception v0

    invoke-static {v4, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_18
    return-object p1

    :catchall_1
    move-exception p1

    goto :goto_1b

    :catch_d
    move-exception p1

    move-object v6, v5

    :goto_19
    :try_start_19
    const-string v0, "IOException occurred during reading a value"

    invoke-static {v4, v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_0

    if-eqz v6, :cond_f

    :try_start_1a
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_1a
    .catch Ljava/io/IOException; {:try_start_1a .. :try_end_1a} :catch_e

    goto :goto_1a

    :catch_e
    move-exception p1

    invoke-static {v4, v3, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_f
    :goto_1a
    return-object v5

    :goto_1b
    if-eqz v5, :cond_10

    :try_start_1b
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_1b
    .catch Ljava/io/IOException; {:try_start_1b .. :try_end_1b} :catch_f

    goto :goto_1c

    :catch_f
    move-exception v0

    invoke-static {v4, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_10
    :goto_1c
    throw p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_9
        :pswitch_8
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, LBb;->B:[Ljava/lang/String;

    iget v2, p0, Lxb;->a:I

    aget-object v1, v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", data length:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lxb;->d:[B

    array-length v1, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
