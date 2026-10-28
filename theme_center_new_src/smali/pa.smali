.class public Lpa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYi;
.implements LUm;
.implements LKi;
.implements Lvg;
.implements Lu4;
.implements LS4;
.implements LWa;


# static fields
.field public static final b:Lpa;

.field public static final c:Lpa;

.field public static final d:Lpa;

.field public static final e:Lpa;

.field public static final f:Lpa;

.field public static final g:Luj;

.field public static final h:Luj;

.field public static i:Lpa;

.field public static final j:Lpa;

.field public static final k:Lpa;

.field public static final l:Lpa;

.field public static final m:Lpa;

.field public static final n:Lpa;

.field public static final o:Lpa;

.field public static final p:Lpa;


# instance fields
.field public final synthetic a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 6

    new-instance v0, Lpa;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lpa;-><init>(I)V

    sput-object v0, Lpa;->b:Lpa;

    new-instance v0, Lpa;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lpa;-><init>(I)V

    sput-object v0, Lpa;->c:Lpa;

    new-instance v0, Lpa;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lpa;-><init>(I)V

    sput-object v0, Lpa;->d:Lpa;

    new-instance v0, Lpa;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lpa;-><init>(I)V

    sput-object v0, Lpa;->e:Lpa;

    new-instance v0, Lpa;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lpa;-><init>(I)V

    sput-object v0, Lpa;->f:Lpa;

    new-instance v0, Luj;

    new-instance v1, Ltj;

    const/4 v2, 0x0

    const/16 v3, 0x780

    const/16 v4, 0x2e4

    invoke-direct {v1, v2, v2, v3, v4}, Ltj;-><init>(IIII)V

    new-instance v5, Ltj;

    invoke-direct {v5, v2, v2, v3, v4}, Ltj;-><init>(IIII)V

    invoke-direct {v0, v1, v5}, Luj;-><init>(Ltj;Ltj;)V

    sput-object v0, Lpa;->g:Luj;

    new-instance v0, Luj;

    new-instance v1, Ltj;

    invoke-direct {v1, v2, v2, v2, v2}, Ltj;-><init>(IIII)V

    new-instance v3, Ltj;

    invoke-direct {v3, v2, v2, v2, v2}, Ltj;-><init>(IIII)V

    invoke-direct {v0, v1, v3}, Luj;-><init>(Ltj;Ltj;)V

    sput-object v0, Lpa;->h:Luj;

    new-instance v0, Lpa;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lpa;-><init>(I)V

    sput-object v0, Lpa;->j:Lpa;

    new-instance v0, Lpa;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lpa;-><init>(I)V

    sput-object v0, Lpa;->k:Lpa;

    new-instance v0, Lpa;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lpa;-><init>(I)V

    sput-object v0, Lpa;->l:Lpa;

    new-instance v0, Lpa;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lpa;-><init>(I)V

    sput-object v0, Lpa;->m:Lpa;

    new-instance v0, Lpa;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lpa;-><init>(I)V

    sput-object v0, Lpa;->n:Lpa;

    new-instance v0, Lpa;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lpa;-><init>(I)V

    sput-object v0, Lpa;->o:Lpa;

    new-instance v0, Lpa;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lpa;-><init>(I)V

    sput-object v0, Lpa;->p:Lpa;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lpa;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;ILpo;Landroid/graphics/Rect;)V
    .locals 0

    const/16 p1, 0x1b

    iput p1, p0, Lpa;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iget p1, p6, Landroid/graphics/Rect;->left:I

    invoke-static {p1}, LTf;->d(I)V

    .line 4
    iget p1, p6, Landroid/graphics/Rect;->top:I

    invoke-static {p1}, LTf;->d(I)V

    .line 5
    iget p1, p6, Landroid/graphics/Rect;->right:I

    invoke-static {p1}, LTf;->d(I)V

    .line 6
    iget p1, p6, Landroid/graphics/Rect;->bottom:I

    invoke-static {p1}, LTf;->d(I)V

    return-void
.end method

.method public constructor <init>(Lhg;Lhg;)V
    .locals 1

    const/16 v0, 0x1c

    iput v0, p0, Lpa;->a:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    cmpg-float p1, v0, p1

    if-gtz p1, :cond_0

    return-void

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public static A(ILjava/lang/String;)Luj;
    .locals 11

    const-string v0, "T500.ERROR"

    const-string v1, "bottom"

    const-string v2, "right"

    const-string v3, "top"

    const-string v4, "left"

    const-string v5, "useDefault"

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "navi_config_"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ".json"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/io/File;

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v8

    new-instance v9, Ljava/io/File;

    const/4 v10, 0x0

    invoke-virtual {v8, v10}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v8

    const-string v10, "navi"

    invoke-direct {v9, v8, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    move-result v8

    if-nez v8, :cond_0

    invoke-virtual {v9}, Ljava/io/File;->mkdirs()Z

    :cond_0
    invoke-direct {v7, v9, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v6

    if-eqz v6, :cond_3

    :try_start_0
    new-instance v6, Ljava/io/BufferedReader;

    new-instance v8, Ljava/io/FileReader;

    invoke-direct {v8, v7}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    invoke-direct {v6, v8}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    :goto_0
    invoke-virtual {v6}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_1

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_2

    :cond_1
    invoke-virtual {v6}, Ljava/io/BufferedReader;->close()V

    new-instance v6, Lorg/json/JSONObject;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v7, "Default"

    invoke-virtual {p1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    invoke-virtual {v6, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v6, v5}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {p0}, Lpa;->w(I)Luj;

    move-result-object p0

    return-object p0

    :cond_2
    const-string p1, "fullscreen"

    invoke-virtual {v6, p1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    const-string v5, "windowed"

    invoke-virtual {v6, v5}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    new-instance v6, Ltj;

    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v7

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v8

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v9

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p1

    invoke-direct {v6, v7, v8, v9, p1}, Ltj;-><init>(IIII)V

    new-instance p1, Ltj;

    invoke-virtual {v5, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v5, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    invoke-direct {p1, v4, v3, v2, v1}, Ltj;-><init>(IIII)V

    new-instance v1, Luj;

    invoke-direct {v1, p1, v6}, Luj;-><init>(Ltj;Ltj;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :goto_1
    const-string v1, "ERROR in NaviConfigActivity.loadConfiguration() - JSON"

    invoke-static {v0, v1, p1}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    add-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lpa;->w(I)Luj;

    move-result-object p0

    return-object p0

    :goto_2
    const-string v1, "ERROR in NaviConfigActivity.loadConfiguration() - IO"

    invoke-static {v0, v1, p1}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    add-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lpa;->w(I)Luj;

    move-result-object p0

    return-object p0

    :cond_3
    invoke-static {p0}, Lpa;->w(I)Luj;

    move-result-object p0

    return-object p0
.end method

.method public static final n(Lpa;Ljava/lang/String;)LW5;
    .locals 1

    new-instance p0, LW5;

    invoke-direct {p0, p1}, LW5;-><init>(Ljava/lang/String;)V

    sget-object v0, LW5;->c:Ljava/util/LinkedHashMap;

    invoke-interface {v0, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public static final p(Ldn;)Ldn;
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    iget-object v1, p0, Ldn;->g:LJl;

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {p0}, Ldn;->x()Lcn;

    move-result-object p0

    iput-object v0, p0, Lcn;->g:LJl;

    invoke-virtual {p0}, Lcn;->a()Ldn;

    move-result-object p0

    :cond_1
    return-object p0
.end method

.method public static r(Landroid/content/Context;I)Lpa;
    .locals 12

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    const-string v3, "Cannot create a CalendarItemStyle with a styleResId of 0"

    invoke-static {v3, v2}, LTf;->c(Ljava/lang/String;Z)V

    sget-object v2, Lul;->o:[I

    invoke-virtual {p0, p1, v2}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1, v1, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    const/4 v3, 0x2

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v3

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v0

    const/4 v4, 0x3

    invoke-virtual {p1, v4, v1}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v4

    new-instance v11, Landroid/graphics/Rect;

    invoke-direct {v11, v2, v3, v0, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    const/4 v0, 0x4

    invoke-static {p0, p1, v0}, LBr;->u(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v6

    const/16 v0, 0x9

    invoke-static {p0, p1, v0}, LBr;->u(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v7

    const/4 v0, 0x7

    invoke-static {p0, p1, v0}, LBr;->u(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v8

    const/16 v0, 0x8

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v9

    const/4 v0, 0x5

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    const/4 v2, 0x6

    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    new-instance v3, Li;

    int-to-float v1, v1

    invoke-direct {v3, v1}, Li;-><init>(F)V

    invoke-static {p0, v0, v2, v3}, Lpo;->a(Landroid/content/Context;IILi;)Loo;

    move-result-object p0

    invoke-virtual {p0}, Loo;->a()Lpo;

    move-result-object v10

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    new-instance p0, Lpa;

    move-object v5, p0

    invoke-direct/range {v5 .. v11}, Lpa;-><init>(Landroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;ILpo;Landroid/graphics/Rect;)V

    return-object p0
.end method

.method public static s(Ljava/lang/String;)Le5;
    .locals 5

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    new-array v1, v0, [B

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    mul-int/lit8 v3, v2, 0x2

    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4}, LTf;->a(C)I

    move-result v4

    shl-int/lit8 v4, v4, 0x4

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, LTf;->a(C)I

    move-result v3

    add-int/2addr v3, v4

    int-to-byte v3, v3

    aput-byte v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-instance p0, Le5;

    invoke-direct {p0, v1}, Le5;-><init>([B)V

    return-object p0

    :cond_1
    const-string v0, "Unexpected hex string: "

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static t(Ljava/lang/String;)Le5;
    .locals 3

    const-string v0, "$this$encodeUtf8"

    invoke-static {v0, p0}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v0, Le5;

    sget-object v1, LL5;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    const-string v2, "(this as java.lang.String).getBytes(charset)"

    invoke-static {v2, v1}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Le5;-><init>([B)V

    iput-object p0, v0, Le5;->b:Ljava/lang/String;

    return-object v0
.end method

.method public static w(I)Luj;
    .locals 5

    new-instance v0, Ljava/io/File;

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Ljava/io/File;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    const-string v3, "navi"

    invoke-direct {v2, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    :cond_0
    const-string v1, "navi_config_Default.json"

    invoke-direct {v0, v2, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x2

    if-lt p0, v0, :cond_1

    goto :goto_0

    :cond_1
    add-int/lit8 p0, p0, 0x1

    const-string v0, "Default"

    invoke-static {p0, v0}, Lpa;->A(ILjava/lang/String;)Luj;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_0
    new-instance p0, Ltj;

    const/4 v0, 0x0

    const/16 v1, 0x28

    const/16 v2, 0x780

    const/16 v3, 0x2e4

    invoke-direct {p0, v0, v1, v2, v3}, Ltj;-><init>(IIII)V

    new-instance v0, Ltj;

    const/16 v1, 0x226

    const/16 v2, 0x50

    const/16 v3, 0x55a

    const/16 v4, 0x2a8

    invoke-direct {v0, v1, v2, v3, v4}, Ltj;-><init>(IIII)V

    new-instance v1, Luj;

    invoke-direct {v1, v0, p0}, Luj;-><init>(Ltj;Ltj;)V

    return-object v1
.end method

.method public static x()Lpa;
    .locals 2

    sget-object v0, Lpa;->i:Lpa;

    if-nez v0, :cond_0

    new-instance v0, Lpa;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lpa;-><init>(I)V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lpa;->i:Lpa;

    :cond_0
    sget-object v0, Lpa;->i:Lpa;

    return-object v0
.end method

.method public static z(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "Connection"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Keep-Alive"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Proxy-Authenticate"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Proxy-Authorization"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "TE"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Trailers"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Transfer-Encoding"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Upgrade"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public B(Ljava/lang/String;)Ljava/util/List;
    .locals 4

    const-string v0, "hostname"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    :try_start_0
    invoke-static {p1}, Ljava/net/InetAddress;->getAllByName(Ljava/lang/String;)[Ljava/net/InetAddress;

    move-result-object v0

    const-string v1, "InetAddress.getAllByName(hostname)"

    invoke-static {v1, v0}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    array-length v1, v0

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v1, v2, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    new-instance v2, LY2;

    invoke-direct {v2, v0, v3}, LY2;-><init>([Ljava/lang/Object;Z)V

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    goto :goto_0

    :cond_0
    aget-object v0, v0, v3

    invoke-static {v0}, LUd;->R(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    goto :goto_0

    :cond_1
    sget-object v1, LSa;->a:LSa;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-object v1

    :catch_0
    move-exception v0

    new-instance v1, Ljava/net/UnknownHostException;

    const-string v2, "Broken system behaviour for dns lookup of "

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw v1
.end method

.method public a()Ljava/lang/Class;
    .locals 1

    iget v0, p0, Lpa;->a:I

    packed-switch v0, :pswitch_data_0

    const-class v0, Ljava/io/InputStream;

    return-object v0

    :pswitch_0
    const-class v0, Ljava/nio/ByteBuffer;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_0
    .end packed-switch
.end method

.method public b(Lti;Z)V
    .locals 0

    return-void
.end method

.method public c([B)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lpa;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    return-object v0

    :pswitch_0
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_0
    .end packed-switch
.end method

.method public d(Ljava/lang/Object;Ljava/io/File;Lrk;)Z
    .locals 0

    check-cast p1, Ljava/nio/ByteBuffer;

    :try_start_0
    invoke-static {p1, p2}, Ld5;->d(Ljava/nio/ByteBuffer;Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    const/4 p2, 0x3

    const-string p3, "ByteBufferEncoder"

    invoke-static {p3, p2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p2, "Failed to write data"

    invoke-static {p3, p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public e(I)V
    .locals 0

    return-void
.end method

.method public f(LBg;)V
    .locals 0

    return-void
.end method

.method public g(LBg;)V
    .locals 0

    invoke-interface {p1}, LBg;->j()V

    return-void
.end method

.method public h(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    .locals 0

    invoke-static {p1, p2, p3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public j(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    .locals 0

    invoke-static {p1, p2, p3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public k(Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    return-void
.end method

.method public l()V
    .locals 0

    return-void
.end method

.method public m(LIm;Lrk;)LIm;
    .locals 0

    return-object p1
.end method

.method public o(Ljj;)LXi;
    .locals 2

    iget p1, p0, Lpa;->a:I

    sparse-switch p1, :sswitch_data_0

    new-instance p1, LHr;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, LHr;-><init>(I)V

    return-object p1

    :sswitch_0
    new-instance p1, LT4;

    new-instance v0, Lpa;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lpa;-><init>(I)V

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, LT4;-><init>(Ljava/lang/Object;I)V

    return-object p1

    :sswitch_1
    new-instance p1, LT4;

    new-instance v0, Lpa;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lpa;-><init>(I)V

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, LT4;-><init>(Ljava/lang/Object;I)V

    return-object p1

    :sswitch_2
    sget-object p1, LHr;->b:LHr;

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        0xb -> :sswitch_2
        0x13 -> :sswitch_1
        0x15 -> :sswitch_0
    .end sparse-switch
.end method

.method public q(Ljava/lang/CharSequence;I)I
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x2

    move v3, v1

    move v4, v2

    :goto_0
    if-ge v3, p2, :cond_2

    if-ne v4, v2, :cond_2

    invoke-interface {p1, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    invoke-static {v4}, Ljava/lang/Character;->getDirectionality(C)B

    move-result v4

    sget-object v5, Lpq;->a:LB4;

    if-eqz v4, :cond_1

    if-eq v4, v0, :cond_0

    if-eq v4, v2, :cond_0

    packed-switch v4, :pswitch_data_0

    move v4, v2

    goto :goto_1

    :cond_0
    :pswitch_0
    move v4, v1

    goto :goto_1

    :cond_1
    :pswitch_1
    move v4, v0

    :goto_1
    add-int/2addr v3, v0

    goto :goto_0

    :cond_2
    return v4

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Lpa;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    const-string v0, "kotlin.Unit"

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
    .end packed-switch
.end method

.method public u(Lti;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public declared-synchronized v(Ljava/lang/String;)LW5;
    .locals 7

    monitor-enter p0

    :try_start_0
    const-string v0, "javaName"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v0, LW5;->c:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LW5;

    if-nez v1, :cond_3

    const-string v1, "TLS_"

    const/4 v2, 0x0

    invoke-static {p1, v1, v2}, LMp;->U0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    const-string v4, "SSL_"

    const-string v5, "(this as java.lang.String).substring(startIndex)"

    const/4 v6, 0x4

    if-eqz v3, :cond_0

    invoke-virtual {p1, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v1}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-static {p1, v4, v2}, LMp;->U0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p1, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v2}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, p1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LW5;

    if-nez v1, :cond_2

    new-instance v1, LW5;

    invoke-direct {v1, p1}, LW5;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    :goto_1
    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_3
    monitor-exit p0

    return-object v1

    :goto_2
    monitor-exit p0

    throw p1
.end method

.method public y(Ljava/lang/Throwable;)V
    .locals 2

    const-string v0, "GlideExecutor"

    const/4 v1, 0x6

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "Request threw uncaught throwable"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    return-void
.end method
