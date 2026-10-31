.class public final Lq4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUm;
.implements LYi;


# instance fields
.field public final synthetic a:I

.field public final b:Landroid/content/res/Resources;


# direct methods
.method public synthetic constructor <init>(Landroid/content/res/Resources;I)V
    .locals 0

    iput p2, p0, Lq4;->a:I

    iput-object p1, p0, Lq4;->b:Landroid/content/res/Resources;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public m(LIm;Lrk;)LIm;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance p2, Lv4;

    iget-object v0, p0, Lq4;->b:Landroid/content/res/Resources;

    invoke-direct {p2, v0, p1}, Lv4;-><init>(Landroid/content/res/Resources;LIm;)V

    move-object p1, p2

    :goto_0
    return-object p1
.end method

.method public o(Ljj;)LXi;
    .locals 3

    iget v0, p0, Lq4;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance p1, Lj3;

    sget-object v0, LHr;->b:LHr;

    iget-object v1, p0, Lq4;->b:Landroid/content/res/Resources;

    invoke-direct {p1, v1, v0}, Lj3;-><init>(Landroid/content/res/Resources;LXi;)V

    return-object p1

    :pswitch_0
    new-instance v0, Lj3;

    const-class v1, Landroid/net/Uri;

    const-class v2, Ljava/io/InputStream;

    invoke-virtual {p1, v1, v2}, Ljj;->e(Ljava/lang/Class;Ljava/lang/Class;)LXi;

    move-result-object p1

    iget-object v1, p0, Lq4;->b:Landroid/content/res/Resources;

    invoke-direct {v0, v1, p1}, Lj3;-><init>(Landroid/content/res/Resources;LXi;)V

    return-object v0

    :pswitch_1
    new-instance v0, Lj3;

    const-class v1, Landroid/net/Uri;

    const-class v2, Landroid/content/res/AssetFileDescriptor;

    invoke-virtual {p1, v1, v2}, Ljj;->e(Ljava/lang/Class;Ljava/lang/Class;)LXi;

    move-result-object p1

    iget-object v1, p0, Lq4;->b:Landroid/content/res/Resources;

    invoke-direct {v0, v1, p1}, Lj3;-><init>(Landroid/content/res/Resources;LXi;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
