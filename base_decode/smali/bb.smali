.class public final Lbb;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Ljava/lang/Cloneable;

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcb;LK2;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lbb;->c:Ljava/lang/Cloneable;

    .line 5
    iput-object p1, p0, Lbb;->d:Ljava/lang/Object;

    .line 6
    iget-object p1, p2, LK2;->b:Ljava/lang/Object;

    check-cast p1, Landroid/content/res/TypedArray;

    const/16 p2, 0x1c

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    .line 7
    iput p2, p0, Lbb;->a:I

    const/16 p2, 0x34

    .line 8
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p1

    .line 9
    iput p1, p0, Lbb;->b:I

    return-void
.end method

.method public constructor <init>([BLmi;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lbb;->c:Ljava/lang/Cloneable;

    iput-object p2, p0, Lbb;->d:Ljava/lang/Object;

    iput p3, p0, Lbb;->a:I

    iput p4, p0, Lbb;->b:I

    return-void
.end method

.method public static final a(Lmi;Ljava/lang/String;)Lbb;
    .locals 8

    const-string v0, "content"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v0, LL5;->a:Ljava/nio/charset/Charset;

    if-eqz p0, :cond_1

    sget-object v1, Lmi;->c:Ljava/util/regex/Pattern;

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lmi;->a(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object v2

    if-nez v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "; charset=utf-8"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v2, "$this$toMediaTypeOrNull"

    invoke-static {v2, p0}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    :try_start_0
    invoke-static {p0}, LTf;->r(Ljava/lang/String;)Lmi;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object p0, v1

    goto :goto_0

    :cond_0
    move-object v0, v2

    :cond_1
    :goto_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const-string v0, "(this as java.lang.String).getBytes(charset)"

    invoke-static {v0, p1}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    array-length v0, p1

    array-length v1, p1

    int-to-long v2, v1

    const/4 v1, 0x0

    int-to-long v4, v1

    int-to-long v6, v0

    invoke-static/range {v2 .. v7}, LRr;->c(JJJ)V

    new-instance v2, Lbb;

    invoke-direct {v2, p1, p0, v0, v1}, Lbb;-><init>([BLmi;II)V

    return-object v2
.end method
