.class public Lipc/fdbus/FdbusSimpleBuilder;
.super Lipc/fdbus/FdbusMsgBuilder;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, Lipc/fdbus/FdbusMsgBuilder;-><init>(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public build(Z)Z
    .locals 3

    new-instance v0, Lipc/fdbus/FdbusSerializer;

    invoke-direct {v0}, Lipc/fdbus/FdbusSerializer;-><init>()V

    iget-object v1, p0, Lipc/fdbus/FdbusMsgBuilder;->mMsg:Ljava/lang/Object;

    instance-of v2, v1, Lipc/fdbus/FdbusParcelable;

    if-eqz v2, :cond_0

    check-cast v1, Lipc/fdbus/FdbusParcelable;

    invoke-virtual {v0, v1}, Lipc/fdbus/FdbusSerializer;->in(Lipc/fdbus/FdbusParcelable;)V

    goto :goto_0

    :cond_0
    instance-of v2, v1, [Lipc/fdbus/FdbusParcelable;

    if-eqz v2, :cond_1

    check-cast v1, [Lipc/fdbus/FdbusParcelable;

    invoke-virtual {v0, v1}, Lipc/fdbus/FdbusSerializer;->in([Lipc/fdbus/FdbusParcelable;)V

    goto :goto_0

    :cond_1
    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_2

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lipc/fdbus/FdbusSerializer;->inS(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    instance-of v2, v1, [Ljava/lang/String;

    if-eqz v2, :cond_4

    check-cast v1, [Ljava/lang/String;

    invoke-virtual {v0, v1}, Lipc/fdbus/FdbusSerializer;->inS([Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v0}, Lipc/fdbus/FdbusSerializer;->export()[B

    move-result-object v0

    iput-object v0, p0, Lipc/fdbus/FdbusMsgBuilder;->mStream:[B

    const/4 v0, 0x1

    if-eqz p1, :cond_3

    new-instance p1, Lipc/fdbus/FdbusParcelable$TextFormatter;

    invoke-direct {p1}, Lipc/fdbus/FdbusParcelable$TextFormatter;-><init>()V

    iget-object v1, p0, Lipc/fdbus/FdbusMsgBuilder;->mMsg:Ljava/lang/Object;

    invoke-virtual {p1, v1}, Lipc/fdbus/FdbusParcelable$TextFormatter;->format(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lipc/fdbus/FdbusParcelable$TextFormatter;->stream()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lipc/fdbus/FdbusMsgBuilder;->mText:Ljava/lang/String;

    :cond_3
    return v0

    :cond_4
    const/4 p1, 0x0

    return p1
.end method
