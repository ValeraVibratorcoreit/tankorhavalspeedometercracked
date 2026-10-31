.class public final LK4;
.super Ljava/io/InputStream;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LP4;


# direct methods
.method public synthetic constructor <init>(LP4;I)V
    .locals 0

    iput p2, p0, LK4;->a:I

    iput-object p1, p0, LK4;->b:LP4;

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    return-void
.end method

.method private final n()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final available()I
    .locals 4

    iget v0, p0, LK4;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LK4;->b:LP4;

    check-cast v0, LBl;

    iget-boolean v1, v0, LBl;->b:Z

    if-nez v1, :cond_0

    iget-object v0, v0, LBl;->a:LL4;

    iget-wide v0, v0, LL4;->b:J

    const v2, 0x7fffffff

    int-to-long v2, v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v0, v0

    return v0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, LK4;->b:LP4;

    check-cast v0, LL4;

    iget-wide v0, v0, LL4;->b:J

    const v2, 0x7fffffff

    int-to-long v2, v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v0, v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final close()V
    .locals 1

    iget v0, p0, LK4;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LK4;->b:LP4;

    check-cast v0, LBl;

    invoke-virtual {v0}, LBl;->close()V

    :pswitch_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final read()I
    .locals 6

    iget v0, p0, LK4;->a:I

    packed-switch v0, :pswitch_data_0

    .line 1
    iget-object v0, p0, LK4;->b:LP4;

    check-cast v0, LBl;

    iget-boolean v1, v0, LBl;->b:Z

    if-nez v1, :cond_1

    .line 2
    iget-object v1, v0, LBl;->a:LL4;

    iget-wide v2, v1, LL4;->b:J

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    const/16 v2, 0x2000

    int-to-long v2, v2

    .line 3
    iget-object v0, v0, LBl;->c:LXo;

    invoke-interface {v0, v1, v2, v3}, LXo;->f(LL4;J)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {v1}, LL4;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    :goto_0
    return v0

    .line 5
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 6
    :pswitch_0
    iget-object v0, p0, LK4;->b:LP4;

    check-cast v0, LL4;

    iget-wide v1, v0, LL4;->b:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-lez v1, :cond_2

    .line 7
    invoke-virtual {v0}, LL4;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    goto :goto_1

    :cond_2
    const/4 v0, -0x1

    :goto_1
    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final read([BII)I
    .locals 8

    iget v0, p0, LK4;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "data"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    .line 8
    iget-object v0, p0, LK4;->b:LP4;

    check-cast v0, LBl;

    iget-boolean v1, v0, LBl;->b:Z

    if-nez v1, :cond_1

    .line 9
    array-length v1, p1

    int-to-long v2, v1

    int-to-long v4, p2

    int-to-long v6, p3

    invoke-static/range {v2 .. v7}, LTd;->d(JJJ)V

    .line 10
    iget-object v1, v0, LBl;->a:LL4;

    iget-wide v2, v1, LL4;->b:J

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    const/16 v2, 0x2000

    int-to-long v2, v2

    .line 11
    iget-object v0, v0, LBl;->c:LXo;

    invoke-interface {v0, v1, v2, v3}, LXo;->f(LL4;J)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v1, p1, p2, p3}, LL4;->y([BII)I

    move-result p1

    :goto_0
    return p1

    .line 13
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 14
    :pswitch_0
    const-string v0, "sink"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    .line 15
    iget-object v0, p0, LK4;->b:LP4;

    check-cast v0, LL4;

    invoke-virtual {v0, p1, p2, p3}, LL4;->y([BII)I

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, LK4;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LK4;->b:LP4;

    check-cast v1, LBl;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".inputStream()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LK4;->b:LP4;

    check-cast v1, LL4;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".inputStream()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
