.class public final LY4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMm;


# static fields
.field public static final f:Lpa;

.field public static final g:LX4;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/List;

.field public final c:LX4;

.field public final d:Lpa;

.field public final e:Ld2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lpa;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Lpa;-><init>(I)V

    sput-object v0, LY4;->f:Lpa;

    new-instance v0, LX4;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LX4;-><init>(I)V

    sput-object v0, LY4;->g:LX4;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;Lu4;Luh;)V
    .locals 1

    sget-object v0, LY4;->f:Lpa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, LY4;->a:Landroid/content/Context;

    iput-object p2, p0, LY4;->b:Ljava/util/List;

    iput-object v0, p0, LY4;->d:Lpa;

    new-instance p1, Ld2;

    const/16 p2, 0x11

    invoke-direct {p1, p3, p2, p4}, Ld2;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    iput-object p1, p0, LY4;->e:Ld2;

    sget-object p1, LY4;->g:LX4;

    iput-object p1, p0, LY4;->c:LX4;

    return-void
.end method

.method public static d(LQd;II)I
    .locals 4

    iget v0, p0, LQd;->g:I

    div-int/2addr v0, p2

    iget v1, p0, LQd;->f:I

    div-int/2addr v1, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v0

    :goto_0
    const/4 v1, 0x1

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    const-string v2, "BufferGifDecoder"

    const/4 v3, 0x2

    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_1

    if-le v0, v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Downsampling GIF, sampleSize: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ", target dimens: ["

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "x"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "], actual dimens: ["

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, p0, LQd;->f:I

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, LQd;->g:I

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "]"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    return v0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;IILrk;)LIm;
    .locals 7

    move-object v1, p1

    check-cast v1, Ljava/nio/ByteBuffer;

    iget-object p1, p0, LY4;->c:LX4;

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, LX4;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LRd;

    if-nez v0, :cond_0

    new-instance v0, LRd;

    invoke-direct {v0}, LRd;-><init>()V

    :cond_0
    move-object v6, v0

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :goto_0
    const/4 v0, 0x0

    iput-object v0, v6, LRd;->b:Ljava/nio/ByteBuffer;

    iget-object v0, v6, LRd;->a:[B

    const/4 v2, 0x0

    invoke-static {v0, v2}, Ljava/util/Arrays;->fill([BB)V

    new-instance v0, LQd;

    invoke-direct {v0}, LQd;-><init>()V

    iput-object v0, v6, LRd;->c:LQd;

    iput v2, v6, LRd;->d:I

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, v6, LRd;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v0, v6, LRd;->b:Ljava/nio/ByteBuffer;

    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    move-object v0, p0

    move v2, p2

    move v3, p3

    move-object v4, v6

    move-object v5, p4

    :try_start_1
    invoke-virtual/range {v0 .. v5}, LY4;->c(Ljava/nio/ByteBuffer;IILRd;Lrk;)LJd;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    iget-object p2, p0, LY4;->c:LX4;

    invoke-virtual {p2, v6}, LX4;->a(LRd;)V

    return-object p1

    :catchall_1
    move-exception p1

    iget-object p2, p0, LY4;->c:LX4;

    invoke-virtual {p2, v6}, LX4;->a(LRd;)V

    throw p1

    :goto_1
    monitor-exit p1

    throw p2
.end method

.method public final b(Ljava/lang/Object;Lrk;)Z
    .locals 1

    check-cast p1, Ljava/nio/ByteBuffer;

    sget-object v0, LSd;->b:Lpk;

    invoke-virtual {p2, v0}, Lrk;->c(Lpk;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_0

    iget-object p2, p0, LY4;->b:Ljava/util/List;

    invoke-static {p2, p1}, LTd;->u(Ljava/util/List;Ljava/nio/ByteBuffer;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    move-result-object p1

    sget-object p2, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->GIF:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final c(Ljava/nio/ByteBuffer;IILRd;Lrk;)LJd;
    .locals 16

    move-object/from16 v1, p0

    const/4 v0, 0x1

    const-string v2, "Decoded GIF from stream in "

    const-string v3, "BufferGifDecoder"

    sget v4, Loh;->b:I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v4

    const/4 v6, 0x2

    :try_start_0
    invoke-virtual/range {p4 .. p4}, LRd;->b()LQd;

    move-result-object v7

    iget v8, v7, LQd;->c:I

    const/4 v9, 0x0

    if-lez v8, :cond_5

    iget v8, v7, LQd;->b:I

    if-eqz v8, :cond_0

    goto/16 :goto_3

    :cond_0
    sget-object v8, LSd;->a:Lpk;

    move-object/from16 v10, p5

    invoke-virtual {v10, v8}, Lrk;->c(Lpk;)Ljava/lang/Object;

    move-result-object v8

    sget-object v10, Lm8;->b:Lm8;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-ne v8, v10, :cond_1

    :try_start_1
    sget-object v8, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    move/from16 v13, p2

    move/from16 v14, p3

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    :cond_1
    :try_start_2
    sget-object v8, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    goto :goto_0

    :goto_1
    invoke-static {v7, v13, v14}, LY4;->d(LQd;II)I

    move-result v10

    iget-object v11, v1, LY4;->d:Lpa;

    iget-object v12, v1, LY4;->e:Ld2;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v15, Lsp;

    move-object/from16 v11, p1

    invoke-direct {v15, v12, v7, v11, v10}, Lsp;-><init>(Ld2;LQd;Ljava/nio/ByteBuffer;I)V

    invoke-virtual {v15, v8}, Lsp;->c(Landroid/graphics/Bitmap$Config;)V

    iget v7, v15, Lsp;->k:I

    add-int/2addr v7, v0

    iget-object v8, v15, Lsp;->l:LQd;

    iget v8, v8, LQd;->c:I

    rem-int/2addr v7, v8

    iput v7, v15, Lsp;->k:I

    invoke-virtual {v15}, Lsp;->b()Landroid/graphics/Bitmap;

    move-result-object v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-nez v7, :cond_3

    invoke-static {v3, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v4, v5}, Loh;->a(J)D

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    return-object v9

    :cond_3
    :try_start_3
    new-instance v8, LId;

    iget-object v9, v1, LY4;->a:Landroid/content/Context;

    new-instance v12, Lj1;

    new-instance v11, LPd;

    invoke-static {v9}, Lcom/bumptech/glide/a;->a(Landroid/content/Context;)Lcom/bumptech/glide/a;

    move-result-object v9

    move-object v10, v11

    move-object v6, v11

    move-object v11, v9

    move-object v9, v12

    move-object v12, v15

    move/from16 v13, p2

    move/from16 v14, p3

    move-object v15, v7

    invoke-direct/range {v10 .. v15}, LPd;-><init>(Lcom/bumptech/glide/a;Lsp;IILandroid/graphics/Bitmap;)V

    invoke-direct {v9, v6, v0}, Lj1;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v8, v9}, LId;-><init>(Lj1;)V

    new-instance v0, LJd;

    const/4 v6, 0x0

    invoke-direct {v0, v8, v6}, LJd;-><init>(Landroid/graphics/drawable/Drawable;I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    const/4 v6, 0x2

    invoke-static {v3, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v6

    if-eqz v6, :cond_4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v4, v5}, Loh;->a(J)D

    move-result-wide v4

    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    return-object v0

    :goto_2
    const/4 v6, 0x2

    goto :goto_4

    :catchall_1
    move-exception v0

    goto :goto_2

    :cond_5
    :goto_3
    invoke-static {v3, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v4, v5}, Loh;->a(J)D

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_6
    return-object v9

    :goto_4
    invoke-static {v3, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v6

    if-eqz v6, :cond_7

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v4, v5}, Loh;->a(J)D

    move-result-wide v4

    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7
    throw v0
.end method
