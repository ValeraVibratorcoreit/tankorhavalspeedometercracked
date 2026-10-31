.class public final LU4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMm;


# instance fields
.field public final synthetic a:I

.field public final b:LN9;


# direct methods
.method public synthetic constructor <init>(LN9;I)V
    .locals 0

    iput p2, p0, LU4;->a:I

    iput-object p1, p0, LU4;->b:LN9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;IILrk;)LIm;
    .locals 6

    iget v0, p0, LU4;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroid/os/ParcelFileDescriptor;

    new-instance v1, LK2;

    iget-object v0, p0, LU4;->b:LN9;

    iget-object v2, v0, LN9;->d:Ljava/util/List;

    iget-object v3, v0, LN9;->c:Luh;

    check-cast v2, Ljava/util/ArrayList;

    invoke-direct {v1, p1, v2, v3}, LK2;-><init>(Landroid/os/ParcelFileDescriptor;Ljava/util/ArrayList;Luh;)V

    sget-object v5, LN9;->j:Lh8;

    move v2, p2

    move v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, LN9;->a(LK2;IILrk;LM9;)Lv4;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/nio/ByteBuffer;

    new-instance v1, LK2;

    iget-object v0, p0, LU4;->b:LN9;

    iget-object v2, v0, LN9;->d:Ljava/util/List;

    iget-object v3, v0, LN9;->c:Luh;

    check-cast v2, Ljava/util/ArrayList;

    const/16 v4, 0xd

    invoke-direct {v1, p1, v2, v3, v4}, LK2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    sget-object v5, LN9;->j:Lh8;

    move v2, p2

    move v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, LN9;->a(LK2;IILrk;LM9;)Lv4;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljava/lang/Object;Lrk;)Z
    .locals 2

    iget p2, p0, LU4;->a:I

    packed-switch p2, :pswitch_data_0

    check-cast p1, Landroid/os/ParcelFileDescriptor;

    sget-object p2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string v0, "HUAWEI"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "HONOR"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    :cond_0
    invoke-virtual {p1}, Landroid/os/ParcelFileDescriptor;->getStatSize()J

    move-result-wide p1

    const-wide/32 v0, 0x20000000

    cmp-long p1, p1, v0

    if-gtz p1, :cond_2

    :cond_1
    iget-object p1, p0, LU4;->b:LN9;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, "robolectric"

    sget-object p2, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 p2, 0x1

    xor-int/2addr p1, p2

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    return p2

    :pswitch_0
    check-cast p1, Ljava/nio/ByteBuffer;

    iget-object p1, p0, LU4;->b:LN9;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
