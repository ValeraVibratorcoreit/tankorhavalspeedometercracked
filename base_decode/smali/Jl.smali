.class public final LJl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final synthetic a:I

.field public final b:LP4;

.field public final c:J

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LL4;Lmi;J)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LJl;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LJl;->b:LP4;

    iput-object p2, p0, LJl;->d:Ljava/lang/Object;

    iput-wide p3, p0, LJl;->c:J

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JLBl;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LJl;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, LJl;->d:Ljava/lang/Object;

    iput-wide p2, p0, LJl;->c:J

    iput-object p4, p0, LJl;->b:LP4;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    invoke-virtual {p0}, LJl;->x()LP4;

    move-result-object v0

    invoke-static {v0}, LRr;->d(Ljava/io/Closeable;)V

    return-void
.end method

.method public final n()J
    .locals 2

    iget v0, p0, LJl;->a:I

    packed-switch v0, :pswitch_data_0

    iget-wide v0, p0, LJl;->c:J

    return-wide v0

    :pswitch_0
    iget-wide v0, p0, LJl;->c:J

    return-wide v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final w()Lmi;
    .locals 3

    iget-object v0, p0, LJl;->d:Ljava/lang/Object;

    iget v1, p0, LJl;->a:I

    packed-switch v1, :pswitch_data_0

    check-cast v0, Lmi;

    return-object v0

    :pswitch_0
    const/4 v1, 0x0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v2, Lmi;->c:Ljava/util/regex/Pattern;

    :try_start_0
    invoke-static {v0}, LTf;->r(Ljava/lang/String;)Lmi;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final x()LP4;
    .locals 1

    iget v0, p0, LJl;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LJl;->b:LP4;

    return-object v0

    :pswitch_0
    iget-object v0, p0, LJl;->b:LP4;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final y()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, LJl;->x()LP4;

    move-result-object v0

    :try_start_0
    invoke-virtual {p0}, LJl;->w()Lmi;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object v2, LL5;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v1, v2}, Lmi;->a(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, LL5;->a:Ljava/nio/charset/Charset;

    :goto_0
    invoke-static {v0, v1}, LRr;->r(LP4;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-interface {v0, v1}, LP4;->t(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    invoke-static {v0, v2}, LTd;->g(LP4;Ljava/lang/Throwable;)V

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v2

    invoke-static {v0, v1}, LTd;->g(LP4;Ljava/lang/Throwable;)V

    throw v2
.end method
