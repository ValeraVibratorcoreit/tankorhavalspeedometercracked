.class public final Lg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$ClassLoaderCreator;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lg;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lg;->a:I

    packed-switch v0, :pswitch_data_0

    .line 12
    new-instance v0, LWq;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LWq;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 13
    :pswitch_0
    new-instance v0, Lvq;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lvq;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 14
    :pswitch_1
    new-instance v0, LEo;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LEo;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 15
    :pswitch_2
    new-instance v0, Lfm;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lfm;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 16
    :pswitch_3
    new-instance v0, LPh;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LPh;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 17
    :pswitch_4
    new-instance v0, LQ7;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LQ7;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 18
    :pswitch_5
    new-instance v0, LN5;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LN5;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 19
    :pswitch_6
    new-instance v0, LD4;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, LD4;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    :pswitch_7
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    if-nez p1, :cond_0

    .line 21
    sget-object p1, Lh;->b:Lf;

    return-object p1

    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "superState must be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final createFromParcel(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lg;->a:I

    packed-switch v0, :pswitch_data_0

    .line 1
    new-instance v0, LWq;

    invoke-direct {v0, p1, p2}, LWq;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 2
    :pswitch_0
    new-instance v0, Lvq;

    invoke-direct {v0, p1, p2}, Lvq;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 3
    :pswitch_1
    new-instance v0, LEo;

    invoke-direct {v0, p1, p2}, LEo;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 4
    :pswitch_2
    new-instance v0, Lfm;

    invoke-direct {v0, p1, p2}, Lfm;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 5
    :pswitch_3
    new-instance v0, LPh;

    invoke-direct {v0, p1, p2}, LPh;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 6
    :pswitch_4
    new-instance v0, LQ7;

    invoke-direct {v0, p1, p2}, LQ7;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 7
    :pswitch_5
    new-instance v0, LN5;

    invoke-direct {v0, p1, p2}, LN5;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 8
    :pswitch_6
    new-instance v0, LD4;

    invoke-direct {v0, p1, p2}, LD4;-><init>(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V

    return-object v0

    .line 9
    :pswitch_7
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    if-nez p1, :cond_0

    .line 10
    sget-object p1, Lh;->b:Lf;

    return-object p1

    .line 11
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "superState must be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final newArray(I)[Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lg;->a:I

    packed-switch v0, :pswitch_data_0

    new-array p1, p1, [LWq;

    return-object p1

    :pswitch_0
    new-array p1, p1, [Lvq;

    return-object p1

    :pswitch_1
    new-array p1, p1, [LEo;

    return-object p1

    :pswitch_2
    new-array p1, p1, [Lfm;

    return-object p1

    :pswitch_3
    new-array p1, p1, [LPh;

    return-object p1

    :pswitch_4
    new-array p1, p1, [LQ7;

    return-object p1

    :pswitch_5
    new-array p1, p1, [LN5;

    return-object p1

    :pswitch_6
    new-array p1, p1, [LD4;

    return-object p1

    :pswitch_7
    new-array p1, p1, [Lh;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
