.class public final Lg8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La8;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Comparable;

.field public final c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Comparable;Ljava/lang/Object;)V
    .locals 0

    iput p1, p0, Lg8;->a:I

    iput-object p2, p0, Lg8;->b:Ljava/lang/Comparable;

    iput-object p3, p0, Lg8;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Landroid/content/Context;Landroid/net/Uri;LFq;)Lg8;
    .locals 3

    invoke-static {p0}, Lcom/bumptech/glide/a;->a(Landroid/content/Context;)Lcom/bumptech/glide/a;

    move-result-object v0

    iget-object v0, v0, Lcom/bumptech/glide/a;->d:Luh;

    new-instance v1, Ljj;

    invoke-static {p0}, Lcom/bumptech/glide/a;->a(Landroid/content/Context;)Lcom/bumptech/glide/a;

    move-result-object v2

    iget-object v2, v2, Lcom/bumptech/glide/a;->c:LVd;

    invoke-virtual {v2}, LVd;->a()Lsm;

    move-result-object v2

    invoke-virtual {v2}, Lsm;->e()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    invoke-direct {v1, v2, p2, v0, p0}, Ljj;-><init>(Ljava/util/ArrayList;LFq;Luh;Landroid/content/ContentResolver;)V

    new-instance p0, Lg8;

    const/4 p2, 0x2

    invoke-direct {p0, p2, p1, v1}, Lg8;-><init>(ILjava/lang/Comparable;Ljava/lang/Object;)V

    return-object p0
.end method

.method private final f()V
    .locals 0

    return-void
.end method

.method private final g()V
    .locals 0

    return-void
.end method

.method private final h()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Class;
    .locals 1

    iget v0, p0, Lg8;->a:I

    packed-switch v0, :pswitch_data_0

    const-class v0, Ljava/io/InputStream;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lg8;->c:Ljava/lang/Object;

    check-cast v0, Lh8;

    invoke-virtual {v0}, Lh8;->l()Ljava/lang/Class;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lg8;->c:Ljava/lang/Object;

    check-cast v0, Lh8;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-class v0, Ljava/io/InputStream;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c()V
    .locals 2

    iget v0, p0, Lg8;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg8;->d:Ljava/lang/Object;

    check-cast v0, Ljava/io/InputStream;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lg8;->d:Ljava/lang/Object;

    if-eqz v0, :cond_1

    :try_start_1
    iget-object v1, p0, Lg8;->c:Ljava/lang/Object;

    check-cast v1, Lh8;

    invoke-virtual {v1, v0}, Lh8;->h(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_1
    return-void

    :pswitch_1
    :try_start_2
    iget-object v0, p0, Lg8;->c:Ljava/lang/Object;

    check-cast v0, Lh8;

    iget-object v1, p0, Lg8;->d:Ljava/lang/Object;

    check-cast v1, Ljava/io/ByteArrayInputStream;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final cancel()V
    .locals 1

    iget v0, p0, Lg8;->a:I

    return-void
.end method

.method public final d(LUk;LZ7;)V
    .locals 2

    iget p1, p0, Lg8;->a:I

    packed-switch p1, :pswitch_data_0

    :try_start_0
    invoke-virtual {p0}, Lg8;->i()Ljava/io/InputStream;

    move-result-object p1

    iput-object p1, p0, Lg8;->d:Ljava/lang/Object;

    invoke-interface {p2, p1}, LZ7;->m(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const/4 v0, 0x3

    const-string v1, "MediaStoreThumbFetcher"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Failed to find thumbnail file"

    invoke-static {v1, v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    invoke-interface {p2, p1}, LZ7;->h(Ljava/lang/Exception;)V

    :goto_0
    return-void

    :pswitch_0
    :try_start_1
    iget-object p1, p0, Lg8;->c:Ljava/lang/Object;

    check-cast p1, Lh8;

    iget-object v0, p0, Lg8;->b:Ljava/lang/Comparable;

    check-cast v0, Ljava/io/File;

    invoke-virtual {p1, v0}, Lh8;->p(Ljava/io/File;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lg8;->d:Ljava/lang/Object;

    invoke-interface {p2, p1}, LZ7;->m(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    const-string v0, "FileLoader"

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "Failed to open file"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_1
    invoke-interface {p2, p1}, LZ7;->h(Ljava/lang/Exception;)V

    :goto_1
    return-void

    :pswitch_1
    :try_start_2
    iget-object p1, p0, Lg8;->c:Ljava/lang/Object;

    check-cast p1, Lh8;

    iget-object v0, p0, Lg8;->b:Ljava/lang/Comparable;

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Lh8;->j(Ljava/lang/String;)Ljava/io/ByteArrayInputStream;

    move-result-object p1

    iput-object p1, p0, Lg8;->d:Ljava/lang/Object;

    invoke-interface {p2, p1}, LZ7;->m(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_2

    :catch_2
    move-exception p1

    invoke-interface {p2, p1}, LZ7;->h(Ljava/lang/Exception;)V

    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Lg8;->a:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x1

    return v0

    :pswitch_0
    const/4 v0, 0x1

    return v0

    :pswitch_1
    const/4 v0, 0x1

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public i()Ljava/io/InputStream;
    .locals 12

    const-string v0, "ThumbStreamOpener"

    iget-object v1, p0, Lg8;->b:Ljava/lang/Comparable;

    check-cast v1, Landroid/net/Uri;

    iget-object v2, p0, Lg8;->c:Ljava/lang/Object;

    check-cast v2, Ljj;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "Failed to query for thumbnail for Uri: "

    const/4 v4, 0x3

    const/4 v5, 0x0

    :try_start_0
    iget-object v6, v2, Ljj;->a:Ljava/lang/Object;

    check-cast v6, LFq;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-interface {v6, v1}, LFq;->a(Landroid/net/Uri;)Landroid/database/Cursor;

    move-result-object v6
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v6, :cond_0

    :try_start_2
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 v7, 0x0

    invoke-interface {v6, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    goto :goto_3

    :catchall_0
    move-exception v0

    move-object v5, v6

    goto/16 :goto_9

    :catch_0
    move-exception v7

    goto :goto_2

    :cond_0
    if-eqz v6, :cond_1

    :goto_0
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    :cond_1
    move-object v3, v5

    goto :goto_3

    :catchall_1
    move-exception v0

    goto/16 :goto_9

    :catch_1
    move-exception v7

    :goto_1
    move-object v6, v5

    goto :goto_2

    :catch_2
    move-exception v6

    move-object v7, v6

    goto :goto_1

    :goto_2
    :try_start_3
    invoke-static {v0, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v8

    if-eqz v8, :cond_2

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_2
    if-eqz v6, :cond_1

    goto :goto_0

    :goto_3
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    iget-object v7, v2, Ljj;->c:Ljava/lang/Object;

    check-cast v7, Landroid/content/ContentResolver;

    if-eqz v6, :cond_4

    :cond_3
    move-object v3, v5

    goto :goto_4

    :cond_4
    new-instance v6, Ljava/io/File;

    invoke-direct {v6, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v6}, Ljava/io/File;->length()J

    move-result-wide v8

    const-wide/16 v10, 0x0

    cmp-long v3, v10, v8

    if-gez v3, :cond_3

    invoke-static {v6}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v3

    :try_start_4
    invoke-virtual {v7, v3}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v3
    :try_end_4
    .catch Ljava/lang/NullPointerException; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_4

    :catch_3
    move-exception v0

    new-instance v2, Ljava/io/FileNotFoundException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "NPE opening uri: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " -> "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v0

    check-cast v0, Ljava/io/FileNotFoundException;

    throw v0

    :goto_4
    const/4 v6, -0x1

    if-eqz v3, :cond_7

    const-string v8, "Failed to open uri: "

    :try_start_5
    invoke-virtual {v7, v1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v5

    iget-object v7, v2, Ljj;->d:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    iget-object v2, v2, Ljj;->b:Ljava/lang/Object;

    check-cast v2, Luh;

    check-cast v7, Ljava/util/ArrayList;

    invoke-static {v7, v5, v2}, LTd;->q(Ljava/util/ArrayList;Ljava/io/InputStream;Luh;)I

    move-result v0
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_5
    .catch Ljava/lang/NullPointerException; {:try_start_5 .. :try_end_5} :catch_4
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    if-eqz v5, :cond_8

    :try_start_6
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_8

    goto :goto_8

    :catchall_2
    move-exception v0

    goto :goto_6

    :catch_4
    move-exception v2

    goto :goto_5

    :catch_5
    move-exception v2

    :goto_5
    :try_start_7
    invoke-static {v0, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v4

    if-eqz v4, :cond_5

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :cond_5
    if-eqz v5, :cond_7

    :try_start_8
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_7

    goto :goto_7

    :goto_6
    if-eqz v5, :cond_6

    :try_start_9
    invoke-virtual {v5}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_6

    :catch_6
    :cond_6
    throw v0

    :catch_7
    :cond_7
    :goto_7
    move v0, v6

    :catch_8
    :cond_8
    :goto_8
    if-eq v0, v6, :cond_9

    new-instance v1, LFb;

    invoke-direct {v1, v3, v0}, LFb;-><init>(Ljava/io/InputStream;I)V

    move-object v3, v1

    :cond_9
    return-object v3

    :goto_9
    if-eqz v5, :cond_a

    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    :cond_a
    throw v0
.end method
