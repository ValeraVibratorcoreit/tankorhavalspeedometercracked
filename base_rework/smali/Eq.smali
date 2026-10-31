.class public final LEq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LFq;
.implements LYi;
.implements LKr;


# static fields
.field public static final c:[Ljava/lang/String;

.field public static final d:[Ljava/lang/String;


# instance fields
.field public final synthetic a:I

.field public final b:Landroid/content/ContentResolver;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    const-string v0, "_data"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, LEq;->c:[Ljava/lang/String;

    const-string v0, "_data"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, LEq;->d:[Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/ContentResolver;I)V
    .locals 0

    iput p2, p0, LEq;->a:I

    iput-object p1, p0, LEq;->b:Landroid/content/ContentResolver;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;)Landroid/database/Cursor;
    .locals 6

    iget v0, p0, LEq;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Landroid/provider/MediaStore$Video$Thumbnails;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    sget-object v2, LEq;->d:[Ljava/lang/String;

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    iget-object v0, p0, LEq;->b:Landroid/content/ContentResolver;

    const-string v3, "kind = 1 AND video_id = ?"

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Landroid/provider/MediaStore$Images$Thumbnails;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    sget-object v2, LEq;->c:[Ljava/lang/String;

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    iget-object v0, p0, LEq;->b:Landroid/content/ContentResolver;

    const-string v3, "kind = 1 AND image_id = ?"

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public b(Landroid/net/Uri;)La8;
    .locals 3

    iget v0, p0, LEq;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, LAp;

    iget-object v1, p0, LEq;->b:Landroid/content/ContentResolver;

    const/4 v2, 0x1

    invoke-direct {v0, v2, p1, v1}, Lh3;-><init>(ILjava/lang/Comparable;Ljava/lang/Object;)V

    return-object v0

    :pswitch_0
    new-instance v0, Lg3;

    iget-object v1, p0, LEq;->b:Landroid/content/ContentResolver;

    const/4 v2, 0x1

    invoke-direct {v0, v1, p1, v2}, Lg3;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;I)V

    return-object v0

    :pswitch_1
    new-instance v0, Lg3;

    iget-object v1, p0, LEq;->b:Landroid/content/ContentResolver;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p1, v2}, Lg3;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;I)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public o(Ljj;)LXi;
    .locals 0

    iget p1, p0, LEq;->a:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, LLr;

    invoke-direct {p1, p0}, LLr;-><init>(LKr;)V

    return-object p1

    :pswitch_0
    new-instance p1, LLr;

    invoke-direct {p1, p0}, LLr;-><init>(LKr;)V

    return-object p1

    :pswitch_1
    new-instance p1, LLr;

    invoke-direct {p1, p0}, LLr;-><init>(LKr;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
