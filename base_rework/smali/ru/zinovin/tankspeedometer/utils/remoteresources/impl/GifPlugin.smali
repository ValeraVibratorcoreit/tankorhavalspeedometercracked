.class public Lru/zinovin/tankspeedometer/utils/remoteresources/impl/GifPlugin;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lru/zinovin/tankspeedometer/utils/remoteresources/RemotePlugin;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    const/4 p1, 0x1

    const/4 v0, 0x0

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v1

    aget-object v2, p2, v0

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    const-string v3, ".gif"

    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    aget-object v3, p2, p1

    check-cast v3, Landroid/widget/ImageView;

    const/4 v4, 0x2

    aget-object v4, p2, v4

    check-cast v4, Landroid/graphics/drawable/Drawable;

    const/4 v5, 0x3

    aget-object p2, p2, v5

    check-cast p2, Landroid/net/Uri;

    if-eqz v2, :cond_7

    new-instance v5, LK0;

    invoke-direct {v5, v1, v4}, LK0;-><init>(Landroid/content/Context;Landroid/graphics/drawable/Drawable;)V

    new-instance v4, LGm;

    invoke-direct {v4}, LZ3;-><init>()V

    invoke-virtual {v4, v5, p1}, LZ3;->p(Lfr;Z)LZ3;

    move-result-object v4

    check-cast v4, LGm;

    const-string v5, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed)."

    invoke-static {v5, v1}, LUd;->l(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v1}, Lcom/bumptech/glide/a;->a(Landroid/content/Context;)Lcom/bumptech/glide/a;

    move-result-object v5

    iget-object v5, v5, Lcom/bumptech/glide/a;->e:LFm;

    invoke-virtual {v5, v1}, LFm;->b(Landroid/content/Context;)LEm;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v5, Lzm;

    iget-object v6, v1, LEm;->a:Lcom/bumptech/glide/a;

    iget-object v7, v1, LEm;->b:Landroid/content/Context;

    const-class v8, Landroid/graphics/drawable/Drawable;

    invoke-direct {v5, v6, v1, v8, v7}, Lzm;-><init>(Lcom/bumptech/glide/a;LEm;Ljava/lang/Class;Landroid/content/Context;)V

    invoke-virtual {v5, p2}, Lzm;->x(Ljava/lang/Object;)Lzm;

    move-result-object v1

    if-eqz p2, :cond_3

    const-string v6, "android.resource"

    invoke-virtual {p2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v6, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object p2, v5, Lzm;->A:Landroid/content/Context;

    invoke-virtual {p2}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v5

    invoke-virtual {v1, v5}, LZ3;->o(Landroid/content/res/Resources$Theme;)LZ3;

    move-result-object v1

    check-cast v1, Lzm;

    sget-object v5, LT2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    sget-object v6, LT2;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v6, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lfg;

    if-nez v7, :cond_2

    :try_start_0
    invoke-virtual {p2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v7

    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v7
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v7

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "Cannot resolve info for"

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    const-string v10, "AppVersionSignature"

    invoke-static {v10, v9, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 v7, 0x0

    :goto_0
    if-eqz v7, :cond_1

    iget v7, v7, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    :cond_1
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v7

    invoke-virtual {v7}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v7

    :goto_1
    new-instance v9, LLj;

    invoke-direct {v9, v7}, LLj;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v6, v5, v9}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Lfg;

    if-nez v7, :cond_2

    move-object v7, v9

    :cond_2
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p2

    iget p2, p2, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 p2, p2, 0x30

    new-instance v5, Lb1;

    invoke-direct {v5, p2, v7}, Lb1;-><init>(ILfg;)V

    invoke-virtual {v1, v5}, LZ3;->m(Lfg;)LZ3;

    move-result-object p2

    move-object v1, p2

    check-cast v1, Lzm;

    :cond_3
    :goto_2
    invoke-virtual {v1, v4}, Lzm;->t(LZ3;)Lzm;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LQr;->a()V

    invoke-static {v3}, LUd;->k(Ljava/lang/Object;)V

    iget v1, p2, LZ3;->a:I

    const/16 v4, 0x800

    invoke-static {v1, v4}, LZ3;->f(II)Z

    move-result v1

    if-nez v1, :cond_4

    iget-boolean v1, p2, LZ3;->n:Z

    if-eqz v1, :cond_4

    invoke-virtual {v3}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    move-result-object v1

    if-eqz v1, :cond_4

    sget-object v1, Lym;->a:[I

    invoke-virtual {v3}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v1, v1, v4

    packed-switch v1, :pswitch_data_0

    goto :goto_3

    :pswitch_0
    invoke-virtual {p2}, Lzm;->v()Lzm;

    move-result-object v1

    sget-object v4, LL9;->c:LL9;

    new-instance v5, LC5;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v1, v4, v5}, LZ3;->g(LL9;Lw4;)LZ3;

    move-result-object v1

    iput-boolean p1, v1, LZ3;->y:Z

    goto :goto_4

    :pswitch_1
    invoke-virtual {p2}, Lzm;->v()Lzm;

    move-result-object v1

    sget-object v4, LL9;->b:LL9;

    new-instance v5, LZb;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v1, v4, v5}, LZ3;->g(LL9;Lw4;)LZ3;

    move-result-object v1

    iput-boolean p1, v1, LZ3;->y:Z

    goto :goto_4

    :pswitch_2
    invoke-virtual {p2}, Lzm;->v()Lzm;

    move-result-object v1

    sget-object v4, LL9;->c:LL9;

    new-instance v5, LC5;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v1, v4, v5}, LZ3;->g(LL9;Lw4;)LZ3;

    move-result-object v1

    iput-boolean p1, v1, LZ3;->y:Z

    goto :goto_4

    :pswitch_3
    invoke-virtual {p2}, Lzm;->v()Lzm;

    move-result-object v1

    sget-object v4, LL9;->d:LL9;

    new-instance v5, LB5;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v1, v4, v5}, LZ3;->g(LL9;Lw4;)LZ3;

    move-result-object v1

    goto :goto_4

    :cond_4
    :goto_3
    move-object v1, p2

    :goto_4
    iget-object v4, p2, Lzm;->D:LVd;

    iget-object v4, v4, LVd;->c:Lh8;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-class v4, Landroid/graphics/Bitmap;

    iget-object v5, p2, Lzm;->C:Ljava/lang/Class;

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    new-instance p1, Lt4;

    invoke-direct {p1, v3, v0}, Lt4;-><init>(Landroid/widget/ImageView;I)V

    goto :goto_5

    :cond_5
    invoke-virtual {v8, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance v0, Lt4;

    invoke-direct {v0, v3, p1}, Lt4;-><init>(Landroid/widget/ImageView;I)V

    move-object p1, v0

    :goto_5
    invoke-virtual {p2, p1, v1}, Lzm;->w(Lgq;LZ3;)V

    goto :goto_6

    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Unhandled class: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", try .as*(Class).transcode(ResourceTranscoder)"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    :goto_6
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    const-string v0, "GifPlugin"

    return-object v0
.end method

.method public final getVersion()Ljava/lang/String;
    .locals 1

    const-string v0, "1.0"

    return-object v0
.end method

.method public final initialize(Landroid/content/Context;)V
    .locals 0

    return-void
.end method
