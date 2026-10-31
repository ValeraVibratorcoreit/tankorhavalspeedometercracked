.class public abstract LUd;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[Ljava/lang/String;

.field public static final b:LQ9;

.field public static final c:Lmh;

.field public static final d:[I

.field public static final e:[I

.field public static final f:[I

.field public static final g:[I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 4

    const-string v0, "evening"

    const-string v1, "night"

    const-string v2, "morning"

    const-string v3, "day"

    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, LUd;->a:[Ljava/lang/String;

    new-instance v0, LQ9;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lpa;-><init>(I)V

    sput-object v0, LUd;->b:LQ9;

    new-instance v0, Lmh;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Lmh;-><init>(I)V

    sput-object v0, LUd;->c:Lmh;

    const v0, 0x10100a7

    filled-new-array {v0}, [I

    move-result-object v1

    sput-object v1, LUd;->d:[I

    const v1, 0x101009c

    filled-new-array {v1}, [I

    move-result-object v1

    sput-object v1, LUd;->e:[I

    const v1, 0x10100a1

    filled-new-array {v1, v0}, [I

    move-result-object v0

    sput-object v0, LUd;->f:[I

    filled-new-array {v1}, [I

    move-result-object v0

    sput-object v0, LUd;->g:[I

    return-void
.end method

.method public static A()I
    .locals 2

    invoke-static {}, LUd;->z()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v1, v0}, LUd;->F(ILjava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static D()Ljava/util/ArrayList;
    .locals 28

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v24, "night_central_rpm.png"

    const-string v25, "night_center_speed_transparent.png"

    const-string v1, "about_ru.txt"

    const-string v2, "about_en.txt"

    const-string v3, "about_ar.txt"

    const-string v4, "Gif.class"

    const-string v5, "MicroMode.class"

    const-string v6, "lala"

    const-string v7, "CheckPeriod.class"

    const-string v8, "t500_speed.png"

    const-string v9, "t500_rpm.png"

    const-string v10, "needle_tank500.png"

    const-string v11, "t300_speed.png"

    const-string v12, "t300_rpm.png"

    const-string v13, "t300_needle.png"

    const-string v14, "t300_speed_el.png"

    const-string v15, "t300_rpm_el.png"

    const-string v16, "t300_needle_el.png"

    const-string v17, "kia_speed.png"

    const-string v18, "kia_rpm.png"

    const-string v19, "kia_needle.png"

    const-string v20, "kia_speed_mini.png"

    const-string v21, "kia_rpm_mini.png"

    const-string v22, "night_needle.png"

    const-string v23, "night_central_speed.png"

    const-string v26, "night_center_rpm_transparent.png"

    const-string v27, "night_needle_short.png"

    filled-new-array/range {v1 .. v27}, [Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x1b

    if-ge v2, v3, :cond_0

    aget-object v3, v1, v2

    new-instance v4, LP2;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    iput-object v3, v4, LP2;->a:Ljava/lang/String;

    const/4 v3, 0x1

    iput v3, v4, LP2;->b:I

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static F(ILjava/lang/String;)I
    .locals 6

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v0

    :try_start_0
    const-string v1, "android.app.ActivityManager"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "getService"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-string v3, "getStackIdOnDisplay"

    const-class v4, Ljava/lang/String;

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v4, v5}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p1, p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v2, v1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    move-exception p0

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "ERROR "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x1

    invoke-static {v0, p0, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    const/4 p0, -0x1

    return p0
.end method

.method public static G(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "day"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "06:00"

    goto :goto_0

    :cond_0
    const-string v0, "18:00"

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "bg_sun_"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "_time"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v0}, LUd;->H(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static H(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lmk;->l(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "selectedTheme"

    const-string v3, "Audi Virtual Cockpit"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "prefs_"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v3, "useDefaultSwitchBack"

    const/4 v4, 0x1

    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v1, "prefs_Default"

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    :cond_0
    invoke-interface {v1, p0, p1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static I(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "morning"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "06:00"

    goto :goto_0

    :cond_0
    const-string v0, "day"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "10:00"

    goto :goto_0

    :cond_1
    const-string v0, "evening"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "18:00"

    goto :goto_0

    :cond_2
    const-string v0, "22:00"

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "bg_time_"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "_time"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v0}, LUd;->H(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static J()Z
    .locals 7

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "usagestats"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/app/usage/UsageStatsManager;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    const-wide/32 v2, 0xf4240

    sub-long v3, v5, v2

    const/4 v2, 0x0

    invoke-virtual/range {v1 .. v6}, Landroid/app/usage/UsageStatsManager;->queryUsageStats(IJJ)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static K(ILandroid/graphics/Rect;Landroid/graphics/Rect;)Z
    .locals 3

    const/16 v0, 0x11

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p0, v0, :cond_9

    const/16 v0, 0x21

    if-eq p0, v0, :cond_6

    const/16 v0, 0x42

    if-eq p0, v0, :cond_3

    const/16 v0, 0x82

    if-ne p0, v0, :cond_2

    iget p0, p1, Landroid/graphics/Rect;->top:I

    iget v0, p2, Landroid/graphics/Rect;->top:I

    if-lt p0, v0, :cond_0

    iget p0, p1, Landroid/graphics/Rect;->bottom:I

    if-gt p0, v0, :cond_1

    :cond_0
    iget p0, p1, Landroid/graphics/Rect;->bottom:I

    iget p1, p2, Landroid/graphics/Rect;->bottom:I

    if-ge p0, p1, :cond_1

    move v1, v2

    :cond_1
    return v1

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    iget p0, p1, Landroid/graphics/Rect;->left:I

    iget v0, p2, Landroid/graphics/Rect;->left:I

    if-lt p0, v0, :cond_4

    iget p0, p1, Landroid/graphics/Rect;->right:I

    if-gt p0, v0, :cond_5

    :cond_4
    iget p0, p1, Landroid/graphics/Rect;->right:I

    iget p1, p2, Landroid/graphics/Rect;->right:I

    if-ge p0, p1, :cond_5

    move v1, v2

    :cond_5
    return v1

    :cond_6
    iget p0, p1, Landroid/graphics/Rect;->bottom:I

    iget v0, p2, Landroid/graphics/Rect;->bottom:I

    if-gt p0, v0, :cond_7

    iget p0, p1, Landroid/graphics/Rect;->top:I

    if-lt p0, v0, :cond_8

    :cond_7
    iget p0, p1, Landroid/graphics/Rect;->top:I

    iget p1, p2, Landroid/graphics/Rect;->top:I

    if-le p0, p1, :cond_8

    move v1, v2

    :cond_8
    return v1

    :cond_9
    iget p0, p1, Landroid/graphics/Rect;->right:I

    iget v0, p2, Landroid/graphics/Rect;->right:I

    if-gt p0, v0, :cond_a

    iget p0, p1, Landroid/graphics/Rect;->left:I

    if-lt p0, v0, :cond_b

    :cond_a
    iget p0, p1, Landroid/graphics/Rect;->left:I

    iget p1, p2, Landroid/graphics/Rect;->left:I

    if-le p0, p1, :cond_b

    move v1, v2

    :cond_b
    return v1
.end method

.method public static L()Z
    .locals 3

    invoke-static {}, LLf;->a()LLf;

    move-result-object v0

    iget-object v0, v0, LLf;->I:Ldr;

    invoke-virtual {v0}, Loj;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "userapp"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lmk;->l(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "naviUserPackage"

    const-string v2, "ru.yandex.yandexnavi"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    const-string v1, "\\|"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    array-length v0, v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public static N()Z
    .locals 8

    const-string v0, "T500.INET"

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v1

    const-string v2, "connectivity"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/ConnectivityManager;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v1, v3}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object v1

    if-eqz v1, :cond_1

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v1, v2}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v4

    if-nez v4, :cond_0

    const/4 v4, 0x3

    invoke-virtual {v1, v4}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    const/16 v1, 0x3e8

    const/16 v4, 0x35

    :try_start_0
    new-instance v5, Ljava/net/Socket;

    invoke-direct {v5}, Ljava/net/Socket;-><init>()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    new-instance v6, Ljava/net/InetSocketAddress;

    const-string v7, "8.8.8.8"

    invoke-direct {v6, v7, v4}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v5, v6, v1}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    const-string v6, "Connection with 8.8.8.8 successfully established"

    invoke-static {v0, v6}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v5}, Ljava/net/Socket;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return v3

    :catch_0
    move-exception v0

    goto :goto_2

    :catchall_0
    move-exception v6

    :try_start_3
    invoke-virtual {v5}, Ljava/net/Socket;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v5

    :try_start_4
    invoke-virtual {v6, v5}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v6
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :catch_1
    :try_start_5
    const-string v5, "There is no connection with 8.8.8.8"

    invoke-static {v0, v5}, Lyr;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    :try_start_6
    new-instance v5, Ljava/net/Socket;

    invoke-direct {v5}, Ljava/net/Socket;-><init>()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    :try_start_7
    new-instance v6, Ljava/net/InetSocketAddress;

    const-string v7, "77.88.8.8"

    invoke-direct {v6, v7, v4}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v5, v6, v1}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    const-string v1, "Connection with 77.88.8.8 successfully established"

    invoke-static {v0, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :try_start_8
    invoke-virtual {v5}, Ljava/net/Socket;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    return v3

    :catchall_2
    move-exception v1

    :try_start_9
    invoke-virtual {v5}, Ljava/net/Socket;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception v3

    :try_start_a
    invoke-virtual {v1, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v1
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_2
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_0

    :catch_2
    :try_start_b
    const-string v1, "There is no connection with 77.88.8.8"

    invoke-static {v0, v1}, Lyr;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_0

    return v2

    :goto_2
    const-string v1, "T500.ERROR"

    const-string v3, "ERROR in isInternetAvailable()"

    invoke-static {v1, v3, v0}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    return v2
.end method

.method public static O(Landroid/net/Uri;)Z
    .locals 2

    if-eqz p0, :cond_0

    const-string v0, "content"

    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "media"

    invoke-virtual {p0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static R(Ljava/lang/Object;)Ljava/util/List;
    .locals 1

    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const-string v0, "singletonList(element)"

    invoke-static {v0, p0}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-object p0
.end method

.method public static S(ILandroid/graphics/Rect;Landroid/graphics/Rect;)I
    .locals 1

    const/16 v0, 0x11

    if-eq p0, v0, :cond_3

    const/16 v0, 0x21

    if-eq p0, v0, :cond_2

    const/16 v0, 0x42

    if-eq p0, v0, :cond_1

    const/16 v0, 0x82

    if-ne p0, v0, :cond_0

    iget p0, p2, Landroid/graphics/Rect;->top:I

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    :goto_0
    sub-int/2addr p0, p1

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    iget p0, p2, Landroid/graphics/Rect;->left:I

    iget p1, p1, Landroid/graphics/Rect;->right:I

    goto :goto_0

    :cond_2
    iget p0, p1, Landroid/graphics/Rect;->top:I

    iget p1, p2, Landroid/graphics/Rect;->bottom:I

    goto :goto_0

    :cond_3
    iget p0, p1, Landroid/graphics/Rect;->left:I

    iget p1, p2, Landroid/graphics/Rect;->right:I

    goto :goto_0

    :goto_1
    const/4 p1, 0x0

    invoke-static {p1, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    return p0
.end method

.method public static T()V
    .locals 4

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "ru.zinovin.navimanager"

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    const/4 v3, 0x0

    :try_start_0
    invoke-virtual {v2, v1, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    if-eqz v1, :cond_0

    const/high16 v2, 0x14000000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const/high16 v2, 0x8000000

    invoke-static {v0, v3, v1, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    :try_start_1
    invoke-virtual {v1}, Landroid/app/PendingIntent;->send()V
    :try_end_1
    .catch Landroid/app/PendingIntent$CanceledException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "ERROR "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :catch_1
    :cond_0
    :goto_0
    return-void
.end method

.method public static U(Landroid/content/res/Configuration;Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Lz4;->a(Landroid/content/res/Configuration;)I

    move-result v0

    const v1, 0x7fffffff

    if-eq v0, v1, :cond_0

    invoke-static {p0}, Lz4;->a(Landroid/content/res/Configuration;)I

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/graphics/Typeface;->getWeight()I

    move-result v0

    invoke-static {p0}, Lz4;->a(Landroid/content/res/Configuration;)I

    move-result p0

    add-int/2addr p0, v0

    const/4 v0, 0x1

    const/16 v1, 0x3e8

    invoke-static {p0, v0, v1}, LTd;->f(III)I

    move-result p0

    invoke-virtual {p1}, Landroid/graphics/Typeface;->isItalic()Z

    move-result v0

    invoke-static {p1, p0, v0}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static V(ILandroid/graphics/Rect;Landroid/graphics/Rect;)I
    .locals 1

    const/16 v0, 0x11

    if-eq p0, v0, :cond_2

    const/16 v0, 0x21

    if-eq p0, v0, :cond_1

    const/16 v0, 0x42

    if-eq p0, v0, :cond_2

    const/16 v0, 0x82

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    iget p0, p1, Landroid/graphics/Rect;->left:I

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    add-int/2addr p1, p0

    iget p0, p2, Landroid/graphics/Rect;->left:I

    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result p2

    div-int/lit8 p2, p2, 0x2

    add-int/2addr p2, p0

    sub-int/2addr p1, p2

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p0

    return p0

    :cond_2
    iget p0, p1, Landroid/graphics/Rect;->top:I

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    div-int/lit8 p1, p1, 0x2

    add-int/2addr p1, p0

    iget p0, p2, Landroid/graphics/Rect;->top:I

    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result p2

    div-int/lit8 p2, p2, 0x2

    add-int/2addr p2, p0

    sub-int/2addr p1, p2

    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result p0

    return p0
.end method

.method public static varargs W([Ljava/lang/String;)Lse;
    .locals 5

    array-length v0, p0

    const/4 v1, 0x2

    rem-int/2addr v0, v1

    if-nez v0, :cond_6

    invoke-virtual {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_5

    check-cast p0, [Ljava/lang/String;

    array-length v0, p0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_2

    aget-object v4, p0, v3

    if-eqz v4, :cond_1

    if-eqz v4, :cond_0

    invoke-static {v4}, LMp;->W0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    aput-object v4, p0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type kotlin.CharSequence"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Headers cannot be null"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    array-length v0, p0

    invoke-static {v2, v0}, LTd;->O(II)LPf;

    move-result-object v0

    invoke-static {v0, v1}, LTd;->M(LNf;I)LNf;

    move-result-object v0

    iget v1, v0, LNf;->a:I

    iget v2, v0, LNf;->b:I

    iget v0, v0, LNf;->c:I

    if-ltz v0, :cond_3

    if-gt v1, v2, :cond_4

    goto :goto_1

    :cond_3
    if-lt v1, v2, :cond_4

    :goto_1
    aget-object v3, p0, v1

    add-int/lit8 v4, v1, 0x1

    aget-object v4, p0, v4

    invoke-static {v3}, LUd;->j(Ljava/lang/String;)V

    invoke-static {v4, v3}, LUd;->m(Ljava/lang/String;Ljava/lang/String;)V

    if-eq v1, v2, :cond_4

    add-int/2addr v1, v0

    goto :goto_1

    :cond_4
    new-instance v0, Lse;

    invoke-direct {v0, p0}, Lse;-><init>([Ljava/lang/String;)V

    return-object v0

    :cond_5
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type kotlin.Array<kotlin.String>"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Expected alternating header names and values"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static Z(Lse;)Lf5;
    .locals 25

    move-object/from16 v0, p0

    const-string v1, "headers"

    invoke-static {v1, v0}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lse;->size()I

    move-result v1

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, -0x1

    const/4 v12, -0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, -0x1

    const/16 v17, -0x1

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    :goto_0
    if-ge v6, v1, :cond_1a

    invoke-virtual {v0, v6}, Lse;->b(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v6}, Lse;->d(I)Ljava/lang/String;

    move-result-object v3

    const-string v2, "Cache-Control"

    invoke-static {v5, v2}, LMp;->F0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    if-eqz v8, :cond_0

    :goto_1
    const/4 v7, 0x0

    goto :goto_2

    :cond_0
    move-object v8, v3

    goto :goto_2

    :cond_1
    const-string v2, "Pragma"

    invoke-static {v5, v2}, LMp;->F0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_19

    goto :goto_1

    :goto_2
    const/4 v2, 0x0

    :goto_3
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v2, v5, :cond_18

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    move v4, v2

    :goto_4
    if-ge v4, v5, :cond_3

    invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C

    move-result v0

    move/from16 v22, v1

    const-string v1, "=,;"

    invoke-static {v1, v0}, LMp;->C0(Ljava/lang/CharSequence;C)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_5

    :cond_2
    const/4 v0, 0x1

    add-int/2addr v4, v0

    move-object/from16 v0, p0

    move/from16 v1, v22

    goto :goto_4

    :cond_3
    move/from16 v22, v1

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    :goto_5
    invoke-virtual {v3, v2, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v1, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"

    invoke-static {v1, v0}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v0}, LMp;->W0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v2

    if-eq v4, v2, :cond_4

    invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v5, 0x2c

    if-eq v2, v5, :cond_4

    invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v5, 0x3b

    if-ne v2, v5, :cond_5

    :cond_4
    move/from16 v23, v7

    const/4 v1, 0x1

    goto/16 :goto_c

    :cond_5
    const/4 v2, 0x1

    add-int/2addr v4, v2

    sget-object v2, LRr;->a:[B

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v2

    :goto_6
    if-ge v4, v2, :cond_7

    invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    move/from16 v23, v2

    const/16 v2, 0x20

    if-eq v5, v2, :cond_6

    const/16 v2, 0x9

    if-eq v5, v2, :cond_6

    const/4 v2, 0x1

    goto :goto_7

    :cond_6
    const/4 v2, 0x1

    add-int/2addr v4, v2

    move/from16 v2, v23

    goto :goto_6

    :cond_7
    const/4 v2, 0x1

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    :goto_7
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v4, v5, :cond_9

    invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    move/from16 v23, v7

    const/16 v7, 0x22

    if-ne v5, v7, :cond_8

    add-int/2addr v4, v2

    const/4 v5, 0x4

    const/4 v2, 0x0

    invoke-static {v3, v7, v4, v2, v5}, LMp;->I0(Ljava/lang/CharSequence;CIZI)I

    move-result v5

    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v1, 0x1

    add-int/2addr v5, v1

    move v2, v5

    goto :goto_d

    :cond_8
    :goto_8
    const/4 v2, 0x0

    goto :goto_9

    :cond_9
    move/from16 v23, v7

    goto :goto_8

    :goto_9
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v5

    move v7, v4

    :goto_a
    if-ge v7, v5, :cond_b

    invoke-virtual {v3, v7}, Ljava/lang/String;->charAt(I)C

    move-result v2

    move/from16 v24, v5

    const-string v5, ",;"

    invoke-static {v5, v2}, LMp;->C0(Ljava/lang/CharSequence;C)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_b

    :cond_a
    const/4 v2, 0x1

    add-int/2addr v7, v2

    move/from16 v5, v24

    const/4 v2, 0x0

    goto :goto_a

    :cond_b
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v7

    :goto_b
    invoke-virtual {v3, v4, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v2}, LMp;->W0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    move v2, v7

    goto :goto_d

    :goto_c
    add-int/2addr v4, v1

    move v2, v4

    const/4 v4, 0x0

    :goto_d
    const-string v1, "no-cache"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c

    const/4 v1, -0x1

    const/4 v9, 0x1

    goto/16 :goto_e

    :cond_c
    const-string v1, "no-store"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_d

    const/4 v1, -0x1

    const/4 v10, 0x1

    goto/16 :goto_e

    :cond_d
    const-string v1, "max-age"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_e

    const/4 v1, -0x1

    invoke-static {v1, v4}, LRr;->x(ILjava/lang/String;)I

    move-result v0

    move v11, v0

    goto/16 :goto_e

    :cond_e
    const/4 v1, -0x1

    const-string v5, "s-maxage"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_f

    invoke-static {v1, v4}, LRr;->x(ILjava/lang/String;)I

    move-result v0

    move v12, v0

    goto/16 :goto_e

    :cond_f
    const-string v1, "private"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_10

    const/4 v1, -0x1

    const/4 v13, 0x1

    goto :goto_e

    :cond_10
    const-string v1, "public"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_11

    const/4 v1, -0x1

    const/4 v14, 0x1

    goto :goto_e

    :cond_11
    const-string v1, "must-revalidate"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_12

    const/4 v1, -0x1

    const/4 v15, 0x1

    goto :goto_e

    :cond_12
    const-string v1, "max-stale"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_13

    const v0, 0x7fffffff

    invoke-static {v0, v4}, LRr;->x(ILjava/lang/String;)I

    move-result v0

    move/from16 v16, v0

    const/4 v1, -0x1

    goto :goto_e

    :cond_13
    const-string v1, "min-fresh"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_14

    const/4 v1, -0x1

    invoke-static {v1, v4}, LRr;->x(ILjava/lang/String;)I

    move-result v0

    move/from16 v17, v0

    goto :goto_e

    :cond_14
    const/4 v1, -0x1

    const-string v4, "only-if-cached"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_15

    const/16 v18, 0x1

    goto :goto_e

    :cond_15
    const-string v4, "no-transform"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_16

    const/16 v19, 0x1

    goto :goto_e

    :cond_16
    const-string v4, "immutable"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_17

    const/16 v20, 0x1

    :cond_17
    :goto_e
    move-object/from16 v0, p0

    move/from16 v1, v22

    move/from16 v7, v23

    goto/16 :goto_3

    :cond_18
    move/from16 v22, v1

    move/from16 v23, v7

    :goto_f
    const/4 v1, -0x1

    const/4 v0, 0x1

    goto :goto_10

    :cond_19
    move/from16 v22, v1

    goto :goto_f

    :goto_10
    add-int/2addr v6, v0

    move-object/from16 v0, p0

    move/from16 v1, v22

    goto/16 :goto_0

    :cond_1a
    if-nez v7, :cond_1b

    const/16 v21, 0x0

    goto :goto_11

    :cond_1b
    move-object/from16 v21, v8

    :goto_11
    new-instance v0, Lf5;

    move-object v8, v0

    invoke-direct/range {v8 .. v21}, Lf5;-><init>(ZZIIZZZIIZZZLjava/lang/String;)V

    return-object v0
.end method

.method public static final a(Liq;Ljq;Ljava/lang/String;)V
    .locals 2

    sget-object v0, Lkq;->i:Ljava/util/logging/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object p1, p1, Ljq;->f:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x20

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 p1, 0x1

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string p2, "%-22s"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p0, p0, Liq;->c:Ljava/lang/String;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    return-void
.end method

.method public static b(ILandroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Rect;)Z
    .locals 9

    invoke-static {p0, p1, p2}, LUd;->c(ILandroid/graphics/Rect;Landroid/graphics/Rect;)Z

    move-result v0

    invoke-static {p0, p1, p3}, LUd;->c(ILandroid/graphics/Rect;Landroid/graphics/Rect;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_c

    if-nez v0, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v0, "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."

    const/16 v1, 0x82

    const/16 v3, 0x21

    const/16 v4, 0x42

    const/16 v5, 0x11

    const/4 v6, 0x1

    if-eq p0, v5, :cond_4

    if-eq p0, v3, :cond_3

    if-eq p0, v4, :cond_2

    if-ne p0, v1, :cond_1

    iget v7, p1, Landroid/graphics/Rect;->bottom:I

    iget v8, p3, Landroid/graphics/Rect;->top:I

    if-gt v7, v8, :cond_b

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget v7, p1, Landroid/graphics/Rect;->right:I

    iget v8, p3, Landroid/graphics/Rect;->left:I

    if-gt v7, v8, :cond_b

    goto :goto_0

    :cond_3
    iget v7, p1, Landroid/graphics/Rect;->top:I

    iget v8, p3, Landroid/graphics/Rect;->bottom:I

    if-lt v7, v8, :cond_b

    goto :goto_0

    :cond_4
    iget v7, p1, Landroid/graphics/Rect;->left:I

    iget v8, p3, Landroid/graphics/Rect;->right:I

    if-lt v7, v8, :cond_b

    :goto_0
    if-eq p0, v5, :cond_b

    if-ne p0, v4, :cond_5

    goto :goto_3

    :cond_5
    invoke-static {p0, p1, p2}, LUd;->S(ILandroid/graphics/Rect;Landroid/graphics/Rect;)I

    move-result p2

    if-eq p0, v5, :cond_9

    if-eq p0, v3, :cond_8

    if-eq p0, v4, :cond_7

    if-ne p0, v1, :cond_6

    iget p0, p3, Landroid/graphics/Rect;->bottom:I

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    :goto_1
    sub-int/2addr p0, p1

    goto :goto_2

    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_7
    iget p0, p3, Landroid/graphics/Rect;->right:I

    iget p1, p1, Landroid/graphics/Rect;->right:I

    goto :goto_1

    :cond_8
    iget p0, p1, Landroid/graphics/Rect;->top:I

    iget p1, p3, Landroid/graphics/Rect;->top:I

    goto :goto_1

    :cond_9
    iget p0, p1, Landroid/graphics/Rect;->left:I

    iget p1, p3, Landroid/graphics/Rect;->left:I

    goto :goto_1

    :goto_2
    invoke-static {v6, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    if-ge p2, p0, :cond_a

    move v2, v6

    :cond_a
    return v2

    :cond_b
    :goto_3
    return v6

    :cond_c
    :goto_4
    return v2
.end method

.method public static c(ILandroid/graphics/Rect;Landroid/graphics/Rect;)Z
    .locals 3

    const/16 v0, 0x11

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p0, v0, :cond_3

    const/16 v0, 0x21

    if-eq p0, v0, :cond_1

    const/16 v0, 0x42

    if-eq p0, v0, :cond_3

    const/16 v0, 0x82

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    iget p0, p2, Landroid/graphics/Rect;->right:I

    iget v0, p1, Landroid/graphics/Rect;->left:I

    if-lt p0, v0, :cond_2

    iget p0, p2, Landroid/graphics/Rect;->left:I

    iget p1, p1, Landroid/graphics/Rect;->right:I

    if-gt p0, p1, :cond_2

    move v1, v2

    :cond_2
    return v1

    :cond_3
    iget p0, p2, Landroid/graphics/Rect;->bottom:I

    iget v0, p1, Landroid/graphics/Rect;->top:I

    if-lt p0, v0, :cond_4

    iget p0, p2, Landroid/graphics/Rect;->top:I

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    if-gt p0, p1, :cond_4

    move v1, v2

    :cond_4
    return v1
.end method

.method public static c0(II)V
    .locals 5

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v0

    if-lez p0, :cond_0

    :try_start_0
    const-string v1, "android.app.ActivityManager"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "getService"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-virtual {v2, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-string v3, "removeStackOnDisplay"

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v4, v4}, [Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v2, v1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "ERROR "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x1

    invoke-static {v0, p0, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    :cond_0
    :goto_0
    return-void
.end method

.method public static d0(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_1

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_1

    return-object v2

    :cond_1
    new-instance v1, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p0

    invoke-direct {v1, p0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result p0

    if-eqz p0, :cond_2

    return-object v1

    :cond_2
    :goto_0
    return-object v0
.end method

.method public static e0()V
    .locals 3

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    const-string v2, "ru.zinovin.tankspeedometer.T500_IP_STOP"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    const-string v2, "ru.zinovin.tankspeedometer.T500_HUD_STOP"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method

.method public static final f0(Landroid/view/View;Lxn;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {v0, p0}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const v0, 0x7f0b02c4

    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method

.method public static g0(Landroid/graphics/drawable/Drawable;I)V
    .locals 0

    invoke-static {p0, p1}, LO9;->g(Landroid/graphics/drawable/Drawable;I)V

    return-void
.end method

.method public static h0(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V
    .locals 0

    invoke-static {p0, p1}, LO9;->h(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public static i(Ljava/lang/String;Z)V
    .locals 0

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static i0(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V
    .locals 0

    invoke-static {p0, p1}, LO9;->i(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public static j(Ljava/lang/String;)V
    .locals 4

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_2

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x21

    if-gt v3, v2, :cond_0

    const/16 v3, 0x7e

    if-lt v3, v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v0, v1, p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string v0, "Unexpected char %#04x at %d in header name: %s"

    invoke-static {v0, p0}, LRr;->i(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "name is empty"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static j0([I)Z
    .locals 8

    array-length v0, p0

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    move v4, v3

    :goto_0
    const/4 v5, 0x1

    if-ge v2, v0, :cond_4

    aget v6, p0, v2

    const v7, 0x101009e

    if-ne v6, v7, :cond_0

    move v3, v5

    goto :goto_2

    :cond_0
    const v7, 0x101009c

    if-ne v6, v7, :cond_1

    :goto_1
    move v4, v5

    goto :goto_2

    :cond_1
    const v7, 0x10100a7

    if-ne v6, v7, :cond_2

    goto :goto_1

    :cond_2
    const v7, 0x1010367

    if-ne v6, v7, :cond_3

    goto :goto_1

    :cond_3
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    if-eqz v3, :cond_5

    if-eqz v4, :cond_5

    move v1, v5

    :cond_5
    return v1
.end method

.method public static k(Ljava/lang/Object;)V
    .locals 1

    const-string v0, "Argument must not be null"

    invoke-static {v0, p0}, LUd;->l(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public static l(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, p0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static l0(Z)V
    .locals 11

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lmk;->l(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "ipType"

    const-string v2, "1"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "naviFullscreen"

    invoke-static {v2}, LTd;->p(Ljava/lang/String;)Z

    move-result v3

    const-string v4, "3"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    const-string v7, "useNavi"

    if-eqz v4, :cond_0

    invoke-static {v7}, LTd;->p(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    move v4, v6

    goto :goto_0

    :cond_0
    move v4, v5

    :goto_0
    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v8

    new-instance v9, Landroid/content/Intent;

    const-class v10, Lru/zinovin/tankspeedometer/StartActivity;

    invoke-direct {v9, v8, v10}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v9, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v9, v7, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    invoke-virtual {v9, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string v0, "musicAutoPlay"

    invoke-virtual {v9, v0, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const/high16 p0, 0x14000000

    invoke-virtual {v9, p0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-static {}, Landroid/app/ActivityOptions;->makeBasic()Landroid/app/ActivityOptions;

    move-result-object p0

    :try_start_0
    const-class v0, Landroid/app/ActivityOptions;

    const-string v1, "setLaunchWindowingMode"

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "ERROR "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v8, v1, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    const-string v1, "T500.ERROR"

    const-string v2, "ERROR in startApp()"

    invoke-static {v1, v2, v0}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Landroid/app/ActivityOptions;->setLaunchDisplayId(I)Landroid/app/ActivityOptions;

    invoke-virtual {p0}, Landroid/app/ActivityOptions;->toBundle()Landroid/os/Bundle;

    move-result-object p0

    invoke-virtual {v8, v9, p0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V

    if-eqz v4, :cond_1

    invoke-static {v3}, LUd;->n0(Z)V

    :cond_1
    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Lmk;->l(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p0

    const-string v0, "useHud"

    invoke-interface {p0, v0, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p0

    if-eqz p0, :cond_2

    new-instance p0, Landroid/os/Handler;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    new-instance v0, LE0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LE0;-><init>(I)V

    const-wide/16 v1, 0x64

    invoke-virtual {p0, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_2
    return-void
.end method

.method public static m(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x9

    if-eq v2, v3, :cond_1

    const/16 v3, 0x20

    if-gt v3, v2, :cond_0

    const/16 v3, 0x7e

    if-lt v3, v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v0, v1, p1, p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "Unexpected char %#04x at %d in %s value: %s"

    invoke-static {p1, p0}, LRr;->i(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static m0()V
    .locals 7

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "display"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/hardware/display/DisplayManager;

    invoke-virtual {v1}, Landroid/hardware/display/DisplayManager;->getDisplays()[Landroid/view/Display;

    move-result-object v1

    array-length v1, v1

    const/4 v2, 0x3

    if-le v1, v2, :cond_0

    new-instance v1, Landroid/content/Intent;

    const-class v3, Lru/zinovin/tankspeedometer/HudActivity;

    invoke-direct {v1, v0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-static {}, Landroid/app/ActivityOptions;->makeBasic()Landroid/app/ActivityOptions;

    move-result-object v3

    const v4, 0x14011000

    invoke-virtual {v1, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    :try_start_0
    const-class v4, Landroid/app/ActivityOptions;

    const-string v5, "setLaunchWindowingMode"

    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v6}, [Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    const/4 v5, 0x6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, v3, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v4

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "ERROR "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x1

    invoke-static {v0, v5, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v5

    invoke-virtual {v5}, Landroid/widget/Toast;->show()V

    const-string v5, "T500.ERROR"

    const-string v6, "ERROR in startHudActivity()"

    invoke-static {v5, v6, v4}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    invoke-virtual {v3, v2}, Landroid/app/ActivityOptions;->setLaunchDisplayId(I)Landroid/app/ActivityOptions;

    invoke-virtual {v3}, Landroid/app/ActivityOptions;->toBundle()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V

    goto :goto_1

    :cond_0
    const-string v0, "T500.UTILS"

    const-string v1, "There is no HUD"

    invoke-static {v0, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void
.end method

.method public static n(Lu4;Landroid/graphics/drawable/Drawable;II)Lv4;
    .locals 7

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getCurrent()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    goto/16 :goto_2

    :cond_0
    instance-of v0, p1, Landroid/graphics/drawable/Animatable;

    const/4 v2, 0x0

    if-nez v0, :cond_6

    const-string v0, "Unable to draw "

    const/4 v3, 0x5

    const-string v4, "DrawableToBitmap"

    const/high16 v5, -0x80000000

    if-ne p2, v5, :cond_2

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v6

    if-gtz v6, :cond_2

    invoke-static {v4, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p2

    if-eqz p2, :cond_1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_0
    move-object p1, v2

    goto :goto_1

    :cond_2
    if-ne p3, v5, :cond_3

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v5

    if-gtz v5, :cond_3

    invoke-static {v4, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p2

    if-eqz p2, :cond_1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    if-lez v0, :cond_4

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result p2

    :cond_4
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    if-lez v0, :cond_5

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result p3

    :cond_5
    sget-object v0, Lhr;->b:Ljava/util/concurrent/locks/Lock;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->lock()V

    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-interface {p0, p2, p3, v3}, Lu4;->j(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v3

    :try_start_0
    new-instance v4, Landroid/graphics/Canvas;

    invoke-direct {v4, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    invoke-virtual {p1, v1, v1, p2, p3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    invoke-virtual {p1, v4}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {v4, v2}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    move-object p1, v3

    :goto_1
    const/4 v1, 0x1

    goto :goto_2

    :catchall_0
    move-exception p0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p0

    :cond_6
    move-object p1, v2

    :goto_2
    if-eqz v1, :cond_7

    goto :goto_3

    :cond_7
    sget-object p0, LUd;->b:LQ9;

    :goto_3
    invoke-static {p0, p1}, Lv4;->b(Lu4;Landroid/graphics/Bitmap;)Lv4;

    move-result-object p0

    return-object p0
.end method

.method public static n0(Z)V
    .locals 4

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "useSysNavi"

    invoke-static {v1}, LTd;->p(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    invoke-static {v0}, Lmk;->l(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "naviStartDelay"

    const-string v3, "500"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    new-instance v3, LF0;

    invoke-direct {v3, v0, p0}, LF0;-><init>(Landroid/content/Context;Z)V

    int-to-long v0, v1

    invoke-virtual {v2, v3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public static o(Lcom/bumptech/glide/a;Ljava/util/List;)Lsm;
    .locals 27

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/bumptech/glide/a;->a:Lu4;

    iget-object v2, v0, Lcom/bumptech/glide/a;->c:LVd;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    iget-object v2, v2, LVd;->h:Lk0;

    new-instance v4, Lsm;

    invoke-direct {v4}, Lsm;-><init>()V

    new-instance v5, Lx8;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    iget-object v6, v4, Lsm;->g:LYa;

    monitor-enter v6

    :try_start_0
    iget-object v7, v6, LYa;->a:Ljava/util/ArrayList;

    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v6

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    new-instance v6, LCb;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    iget-object v7, v4, Lsm;->g:LYa;

    monitor-enter v7

    :try_start_1
    iget-object v8, v7, LYa;->a:Ljava/util/ArrayList;

    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v7

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v4}, Lsm;->e()Ljava/util/ArrayList;

    move-result-object v7

    new-instance v8, LY4;

    iget-object v0, v0, Lcom/bumptech/glide/a;->d:Luh;

    invoke-direct {v8, v3, v7, v1, v0}, LY4;-><init>(Landroid/content/Context;Ljava/util/ArrayList;Lu4;Luh;)V

    new-instance v9, Los;

    new-instance v10, Lns;

    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    invoke-direct {v9, v1, v10}, Los;-><init>(Lu4;Lms;)V

    new-instance v10, LN9;

    invoke-virtual {v4}, Lsm;->e()Ljava/util/ArrayList;

    move-result-object v11

    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v12

    invoke-direct {v10, v11, v12, v1, v0}, LN9;-><init>(Ljava/util/ArrayList;Landroid/util/DisplayMetrics;Lu4;Luh;)V

    iget-object v2, v2, Lk0;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/Map;

    const-class v11, LTd;

    invoke-interface {v2, v11}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, LV4;

    const/4 v11, 0x1

    invoke-direct {v2, v11}, LV4;-><init>(I)V

    new-instance v11, LV4;

    const/4 v12, 0x0

    invoke-direct {v11, v12}, LV4;-><init>(I)V

    goto :goto_0

    :cond_0
    new-instance v11, LU4;

    const/4 v2, 0x0

    invoke-direct {v11, v10, v2}, LU4;-><init>(LN9;I)V

    new-instance v2, Lp4;

    const/4 v12, 0x2

    invoke-direct {v2, v10, v12, v0}, Lp4;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    :goto_0
    new-instance v12, Lg1;

    new-instance v13, Ld2;

    const/4 v14, 0x1

    invoke-direct {v13, v7, v14, v0}, Ld2;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-direct {v12, v13, v14}, Lg1;-><init>(Ld2;I)V

    const-string v13, "Animation"

    const-class v14, Ljava/io/InputStream;

    const-class v15, Landroid/graphics/drawable/Drawable;

    invoke-virtual {v4, v13, v14, v15, v12}, Lsm;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LMm;)V

    new-instance v12, Lg1;

    move/from16 v16, v5

    new-instance v5, Ld2;

    move-object/from16 v17, v8

    const/4 v8, 0x1

    invoke-direct {v5, v7, v8, v0}, Ld2;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    const/4 v8, 0x0

    invoke-direct {v12, v5, v8}, Lg1;-><init>(Ld2;I)V

    const-class v5, Ljava/nio/ByteBuffer;

    invoke-virtual {v4, v13, v5, v15, v12}, Lsm;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LMm;)V

    new-instance v8, LPm;

    invoke-direct {v8, v3}, LPm;-><init>(Landroid/content/Context;)V

    new-instance v12, Lr4;

    invoke-direct {v12, v0}, Lr4;-><init>(Luh;)V

    move-object/from16 p0, v8

    new-instance v8, LQ0;

    invoke-direct {v8}, LQ0;-><init>()V

    move-object/from16 v18, v8

    new-instance v8, Lh8;

    move-object/from16 v19, v15

    const/16 v15, 0x16

    invoke-direct {v8, v15}, Lh8;-><init>(I)V

    invoke-virtual {v3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v15

    move-object/from16 v20, v8

    new-instance v8, Lpa;

    move-object/from16 v21, v15

    const/16 v15, 0x16

    invoke-direct {v8, v15}, Lpa;-><init>(I)V

    invoke-virtual {v4, v5, v8}, Lsm;->a(Ljava/lang/Class;LWa;)V

    new-instance v8, LVi;

    invoke-direct {v8, v0}, LVi;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v4, v14, v8}, Lsm;->a(Ljava/lang/Class;LWa;)V

    const-string v8, "Bitmap"

    const-class v15, Landroid/graphics/Bitmap;

    invoke-virtual {v4, v8, v5, v15, v11}, Lsm;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LMm;)V

    invoke-virtual {v4, v8, v14, v15, v2}, Lsm;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LMm;)V

    move-object/from16 v22, v3

    const-string v3, "robolectric"

    move-object/from16 v23, v13

    sget-object v13, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    invoke-virtual {v3, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    move-object/from16 v24, v13

    const-class v13, Landroid/os/ParcelFileDescriptor;

    if-eqz v3, :cond_1

    new-instance v3, LU4;

    move-object/from16 v25, v0

    const/4 v0, 0x1

    invoke-direct {v3, v10, v0}, LU4;-><init>(LN9;I)V

    invoke-virtual {v4, v8, v13, v15, v3}, Lsm;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LMm;)V

    goto :goto_1

    :cond_1
    move-object/from16 v25, v0

    :goto_1
    new-instance v0, Los;

    new-instance v3, Lmh;

    const/16 v10, 0x1c

    invoke-direct {v3, v10}, Lmh;-><init>(I)V

    invoke-direct {v0, v1, v3}, Los;-><init>(Lu4;Lms;)V

    const-class v3, Landroid/content/res/AssetFileDescriptor;

    invoke-virtual {v4, v8, v3, v15, v0}, Lsm;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LMm;)V

    invoke-virtual {v4, v8, v13, v15, v9}, Lsm;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LMm;)V

    sget-object v0, Lpa;->n:Lpa;

    invoke-virtual {v4, v15, v15, v0}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    new-instance v10, LSb;

    move-object/from16 v26, v3

    const/4 v3, 0x1

    invoke-direct {v10, v3}, LSb;-><init>(I)V

    invoke-virtual {v4, v8, v15, v15, v10}, Lsm;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LMm;)V

    invoke-virtual {v4, v15, v12}, Lsm;->b(Ljava/lang/Class;LQm;)V

    new-instance v3, Lp4;

    invoke-direct {v3, v6, v11}, Lp4;-><init>(Landroid/content/res/Resources;LMm;)V

    const-string v10, "BitmapDrawable"

    const-class v11, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v4, v10, v5, v11, v3}, Lsm;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LMm;)V

    new-instance v3, Lp4;

    invoke-direct {v3, v6, v2}, Lp4;-><init>(Landroid/content/res/Resources;LMm;)V

    invoke-virtual {v4, v10, v14, v11, v3}, Lsm;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LMm;)V

    new-instance v2, Lp4;

    invoke-direct {v2, v6, v9}, Lp4;-><init>(Landroid/content/res/Resources;LMm;)V

    invoke-virtual {v4, v10, v13, v11, v2}, Lsm;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LMm;)V

    new-instance v2, Ld2;

    const/4 v3, 0x5

    invoke-direct {v2, v1, v3, v12}, Ld2;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v4, v11, v2}, Lsm;->b(Ljava/lang/Class;LQm;)V

    new-instance v2, Lzp;

    move-object/from16 v3, v17

    move-object/from16 v9, v25

    invoke-direct {v2, v7, v3, v9}, Lzp;-><init>(Ljava/util/ArrayList;LY4;Luh;)V

    const-class v7, LId;

    move-object/from16 v10, v23

    invoke-virtual {v4, v10, v14, v7, v2}, Lsm;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LMm;)V

    invoke-virtual {v4, v10, v5, v7, v3}, Lsm;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LMm;)V

    new-instance v2, Lh8;

    const/16 v3, 0x17

    invoke-direct {v2, v3}, Lh8;-><init>(I)V

    invoke-virtual {v4, v7, v2}, Lsm;->b(Ljava/lang/Class;LQm;)V

    const-class v2, Lsp;

    invoke-virtual {v4, v2, v2, v0}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    new-instance v3, Ls4;

    invoke-direct {v3, v1}, Ls4;-><init>(Lu4;)V

    invoke-virtual {v4, v8, v2, v15, v3}, Lsm;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LMm;)V

    const-string v2, "legacy_append"

    const-class v3, Landroid/net/Uri;

    move-object/from16 v10, p0

    move-object/from16 v8, v19

    invoke-virtual {v4, v2, v3, v8, v10}, Lsm;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LMm;)V

    new-instance v12, Lp4;

    move-object/from16 p0, v7

    const/4 v7, 0x1

    invoke-direct {v12, v10, v7, v1}, Lp4;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v4, v2, v3, v15, v12}, Lsm;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LMm;)V

    new-instance v7, LZ4;

    const/4 v10, 0x0

    invoke-direct {v7, v10}, LZ4;-><init>(I)V

    invoke-virtual {v4, v7}, Lsm;->h(Ld8;)V

    new-instance v7, Lpa;

    const/16 v10, 0x17

    invoke-direct {v7, v10}, Lpa;-><init>(I)V

    const-class v10, Ljava/io/File;

    invoke-virtual {v4, v10, v5, v7}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    new-instance v7, LUb;

    new-instance v12, Lh8;

    move-object/from16 v17, v1

    const/16 v1, 0x12

    invoke-direct {v12, v1}, Lh8;-><init>(I)V

    invoke-direct {v7, v12}, LY3;-><init>(Lh8;)V

    invoke-virtual {v4, v10, v14, v7}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    new-instance v1, LSb;

    const/4 v7, 0x0

    invoke-direct {v1, v7}, LSb;-><init>(I)V

    invoke-virtual {v4, v2, v10, v10, v1}, Lsm;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LMm;)V

    new-instance v1, LUb;

    new-instance v7, Lh8;

    const/16 v12, 0x11

    invoke-direct {v7, v12}, Lh8;-><init>(I)V

    invoke-direct {v1, v7}, LY3;-><init>(Lh8;)V

    invoke-virtual {v4, v10, v13, v1}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    invoke-virtual {v4, v10, v10, v0}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    new-instance v1, LEf;

    invoke-direct {v1, v9}, LEf;-><init>(Luh;)V

    invoke-virtual {v4, v1}, Lsm;->h(Ld8;)V

    const-string v1, "robolectric"

    move-object/from16 v7, v24

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    if-eqz v1, :cond_2

    new-instance v1, LZ4;

    const/4 v7, 0x2

    invoke-direct {v1, v7}, LZ4;-><init>(I)V

    invoke-virtual {v4, v1}, Lsm;->h(Ld8;)V

    :cond_2
    new-instance v1, LS3;

    const/4 v7, 0x3

    move-object/from16 v9, v22

    invoke-direct {v1, v9, v7}, LS3;-><init>(Landroid/content/Context;I)V

    new-instance v7, LS3;

    const/4 v12, 0x1

    invoke-direct {v7, v9, v12}, LS3;-><init>(Landroid/content/Context;I)V

    new-instance v12, LS3;

    move-object/from16 v19, v11

    const/4 v11, 0x2

    invoke-direct {v12, v9, v11}, LS3;-><init>(Landroid/content/Context;I)V

    sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v4, v11, v14, v1}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    move-object/from16 v22, v15

    const-class v15, Ljava/lang/Integer;

    invoke-virtual {v4, v15, v14, v1}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    move-object/from16 v1, v26

    invoke-virtual {v4, v11, v1, v7}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    invoke-virtual {v4, v15, v1, v7}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    invoke-virtual {v4, v11, v8, v12}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    invoke-virtual {v4, v15, v8, v12}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    new-instance v7, LS3;

    const/16 v12, 0x9

    invoke-direct {v7, v9, v12}, LS3;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4, v3, v14, v7}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    new-instance v7, LS3;

    const/16 v12, 0x8

    invoke-direct {v7, v9, v12}, LS3;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4, v3, v1, v7}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    new-instance v7, Lq4;

    const/4 v12, 0x3

    invoke-direct {v7, v6, v12}, Lq4;-><init>(Landroid/content/res/Resources;I)V

    new-instance v12, Lq4;

    move-object/from16 v23, v2

    const/4 v2, 0x1

    invoke-direct {v12, v6, v2}, Lq4;-><init>(Landroid/content/res/Resources;I)V

    new-instance v2, Lq4;

    move-object/from16 v24, v8

    const/4 v8, 0x2

    invoke-direct {v2, v6, v8}, Lq4;-><init>(Landroid/content/res/Resources;I)V

    invoke-virtual {v4, v15, v3, v7}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    invoke-virtual {v4, v11, v3, v7}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    invoke-virtual {v4, v15, v1, v12}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    invoke-virtual {v4, v11, v1, v12}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    invoke-virtual {v4, v15, v14, v2}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    invoke-virtual {v4, v11, v14, v2}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    new-instance v2, Lk0;

    const/16 v7, 0x9

    invoke-direct {v2, v7}, Lk0;-><init>(I)V

    const-class v7, Ljava/lang/String;

    invoke-virtual {v4, v7, v14, v2}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    new-instance v2, Lk0;

    const/16 v8, 0x9

    invoke-direct {v2, v8}, Lk0;-><init>(I)V

    invoke-virtual {v4, v3, v14, v2}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    new-instance v2, Lmh;

    const/16 v8, 0x12

    invoke-direct {v2, v8}, Lmh;-><init>(I)V

    invoke-virtual {v4, v7, v14, v2}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    new-instance v2, Lmh;

    const/16 v8, 0x11

    invoke-direct {v2, v8}, Lmh;-><init>(I)V

    invoke-virtual {v4, v7, v13, v2}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    new-instance v2, Lmh;

    const/16 v8, 0x10

    invoke-direct {v2, v8}, Lmh;-><init>(I)V

    invoke-virtual {v4, v7, v1, v2}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    new-instance v2, Li3;

    invoke-virtual {v9}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v7

    const/4 v8, 0x1

    invoke-direct {v2, v7, v8}, Li3;-><init>(Landroid/content/res/AssetManager;I)V

    invoke-virtual {v4, v3, v14, v2}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    new-instance v2, Li3;

    invoke-virtual {v9}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v7

    const/4 v8, 0x0

    invoke-direct {v2, v7, v8}, Li3;-><init>(Landroid/content/res/AssetManager;I)V

    invoke-virtual {v4, v3, v1, v2}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    new-instance v2, LS3;

    const/4 v7, 0x6

    invoke-direct {v2, v9, v7}, LS3;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4, v3, v14, v2}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    new-instance v2, LS3;

    const/4 v7, 0x7

    invoke-direct {v2, v9, v7}, LS3;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4, v3, v14, v2}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    const/16 v2, 0x1d

    move/from16 v7, v16

    if-lt v7, v2, :cond_3

    new-instance v2, Ljl;

    invoke-direct {v2, v9, v14}, Ld;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v3, v14, v2}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    new-instance v2, Ljl;

    invoke-direct {v2, v9, v13}, Ld;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v3, v13, v2}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    :cond_3
    new-instance v2, LEq;

    const/4 v7, 0x4

    move-object/from16 v8, v21

    invoke-direct {v2, v8, v7}, LEq;-><init>(Landroid/content/ContentResolver;I)V

    invoke-virtual {v4, v3, v14, v2}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    new-instance v2, LEq;

    const/4 v7, 0x3

    invoke-direct {v2, v8, v7}, LEq;-><init>(Landroid/content/ContentResolver;I)V

    invoke-virtual {v4, v3, v13, v2}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    new-instance v2, LEq;

    const/4 v7, 0x2

    invoke-direct {v2, v8, v7}, LEq;-><init>(Landroid/content/ContentResolver;I)V

    invoke-virtual {v4, v3, v1, v2}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    new-instance v1, Lmh;

    const/16 v2, 0x1a

    invoke-direct {v1, v2}, Lmh;-><init>(I)V

    invoke-virtual {v4, v3, v14, v1}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    new-instance v1, Lmh;

    const/16 v2, 0x19

    invoke-direct {v1, v2}, Lmh;-><init>(I)V

    const-class v2, Ljava/net/URL;

    invoke-virtual {v4, v2, v14, v1}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    new-instance v1, LS3;

    const/4 v2, 0x5

    invoke-direct {v1, v9, v2}, LS3;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4, v3, v10, v1}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    new-instance v1, Lk0;

    const/16 v2, 0x13

    invoke-direct {v1, v2}, Lk0;-><init>(I)V

    const-class v2, Lbe;

    invoke-virtual {v4, v2, v14, v1}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    new-instance v1, Lpa;

    const/16 v2, 0x13

    invoke-direct {v1, v2}, Lpa;-><init>(I)V

    const-class v2, [B

    invoke-virtual {v4, v2, v5, v1}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    new-instance v1, Lpa;

    const/16 v5, 0x15

    invoke-direct {v1, v5}, Lpa;-><init>(I)V

    invoke-virtual {v4, v2, v14, v1}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    invoke-virtual {v4, v3, v3, v0}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    move-object/from16 v1, v24

    invoke-virtual {v4, v1, v1, v0}, Lsm;->c(Ljava/lang/Class;Ljava/lang/Class;LYi;)V

    new-instance v0, LSb;

    const/4 v3, 0x2

    invoke-direct {v0, v3}, LSb;-><init>(I)V

    move-object/from16 v3, v23

    invoke-virtual {v4, v3, v1, v1, v0}, Lsm;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LMm;)V

    new-instance v0, Lq4;

    const/4 v3, 0x0

    invoke-direct {v0, v6, v3}, Lq4;-><init>(Landroid/content/res/Resources;I)V

    move-object/from16 v5, v19

    move-object/from16 v3, v22

    invoke-virtual {v4, v3, v5, v0}, Lsm;->i(Ljava/lang/Class;Ljava/lang/Class;LUm;)V

    move-object/from16 v0, v18

    invoke-virtual {v4, v3, v2, v0}, Lsm;->i(Ljava/lang/Class;Ljava/lang/Class;LUm;)V

    new-instance v7, LK2;

    const/16 v8, 0x9

    move-object/from16 v9, v17

    move-object/from16 v10, v20

    invoke-direct {v7, v9, v0, v10, v8}, LK2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v4, v1, v2, v7}, Lsm;->i(Ljava/lang/Class;Ljava/lang/Class;LUm;)V

    move-object/from16 v0, p0

    invoke-virtual {v4, v0, v2, v10}, Lsm;->i(Ljava/lang/Class;Ljava/lang/Class;LUm;)V

    new-instance v0, Los;

    new-instance v1, Lmh;

    const/16 v2, 0x1d

    invoke-direct {v1, v2}, Lmh;-><init>(I)V

    invoke-direct {v0, v9, v1}, Los;-><init>(Lu4;Lms;)V

    const-class v1, Ljava/nio/ByteBuffer;

    const-string v2, "legacy_append"

    invoke-virtual {v4, v2, v1, v3, v0}, Lsm;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LMm;)V

    new-instance v1, Lp4;

    invoke-direct {v1, v6, v0}, Lp4;-><init>(Landroid/content/res/Resources;LMm;)V

    const-class v0, Ljava/nio/ByteBuffer;

    const-string v2, "legacy_append"

    invoke-virtual {v4, v2, v0, v5, v1}, Lsm;->d(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Class;LMm;)V

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_4

    return-object v4

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LVo;->l(Ljava/lang/Object;)V

    const/4 v0, 0x0

    throw v0

    :catchall_0
    move-exception v0

    monitor-exit v7

    throw v0

    :catchall_1
    move-exception v0

    monitor-exit v6

    throw v0
.end method

.method public static o0()V
    .locals 4

    const-string v0, "T500.UTILS"

    const-string v1, "stopAndStart()"

    invoke-static {v0, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, LLf;->a()LLf;

    move-result-object v0

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lmk;->l(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "naviPackage"

    const-string v3, "ru.yandex.yandexnavi"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v0, v0, LLf;->I:Ldr;

    invoke-virtual {v0, v1}, Ldr;->f(Ljava/lang/Object;)V

    invoke-static {}, LUd;->e0()V

    const/4 v0, 0x1

    invoke-static {v0}, LUd;->p0(Z)V

    const/4 v0, 0x0

    invoke-static {v0}, LUd;->l0(Z)V

    return-void
.end method

.method public static p(Ljava/lang/String;)LPq;
    .locals 2

    const-string v0, "javaName"

    invoke-static {v0, p0}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0x4b88569

    if-eq v0, v1, :cond_1

    const v1, 0x4c38896

    if-eq v0, v1, :cond_0

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    const-string v0, "TLSv1.3"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, LPq;->b:LPq;

    goto :goto_0

    :pswitch_1
    const-string v0, "TLSv1.2"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, LPq;->c:LPq;

    goto :goto_0

    :pswitch_2
    const-string v0, "TLSv1.1"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, LPq;->d:LPq;

    goto :goto_0

    :cond_0
    const-string v0, "TLSv1"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, LPq;->e:LPq;

    goto :goto_0

    :cond_1
    const-string v0, "SSLv3"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, LPq;->f:LPq;

    :goto_0
    return-object p0

    :cond_2
    :goto_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unexpected TLS version: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_data_0
    .packed-switch -0x1dfc3f27
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static p0(Z)V
    .locals 9

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "stopNavi(). allDisplays="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "T500.UTILS"

    invoke-static {v1, v0}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, LUd;->z()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x2

    invoke-static {v2, v0}, LUd;->F(ILjava/lang/String;)I

    move-result v0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, -0x1

    if-eq v0, v5, :cond_0

    const-string v6, "stopYnService() called"

    invoke-static {v1, v6}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v6

    new-instance v7, Landroid/content/Intent;

    const-class v8, Lru/zinovin/tankspeedometer/service/YnActivatingService;

    invoke-direct {v7, v6, v8}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v8, "ACTION_STOP_SERVICE"

    invoke-virtual {v7, v8}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v6, v7}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    move v6, v3

    goto :goto_0

    :cond_0
    move v6, v4

    :goto_0
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "display=2, navi stackid="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v1, v7}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0, v2}, LUd;->c0(II)V

    invoke-static {}, LUd;->z()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, LUd;->F(ILjava/lang/String;)I

    move-result v0

    if-eqz p0, :cond_1

    new-instance p0, Ljava/lang/StringBuilder;

    const-string v2, "display=0, navi stackid="

    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0, v4}, LUd;->c0(II)V

    move v6, v3

    :cond_1
    if-eq v0, v5, :cond_2

    goto :goto_1

    :cond_2
    move v4, v6

    :goto_1
    xor-int/lit8 p0, v4, 0x1

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    const-string v2, "ru.zinovin.tankspeedometer.T500_NAVI_MANEUVER_VISIBILITY"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "visibility"

    invoke-virtual {v1, v2, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string p0, "ru.zinovin.tankspeedometer.NAVI_GUIDANCE_PERMISSION"

    invoke-virtual {v0, v1, p0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    return-void
.end method

.method public static final q(J)Ljava/lang/String;
    .locals 12

    const v0, -0x3b9328e0

    int-to-long v0, v0

    cmp-long v0, p0, v0

    const-string v1, " s "

    const v2, 0x3b9aca00

    const v3, 0x1dcd6500

    if-gtz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-long v3, v3

    sub-long/2addr p0, v3

    int-to-long v2, v2

    div-long/2addr p0, v2

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto/16 :goto_0

    :cond_0
    const v0, -0xf404c

    int-to-long v4, v0

    cmp-long v0, p0, v4

    const-string v4, " ms"

    const v5, 0xf4240

    const v6, 0x7a120

    if-gtz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-long v1, v6

    sub-long/2addr p0, v1

    int-to-long v1, v5

    div-long/2addr p0, v1

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    const-wide/16 v7, 0x0

    cmp-long v0, p0, v7

    const-string v7, " \u00b5s"

    const/16 v8, 0x3e8

    const/16 v9, 0x1f4

    if-gtz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-long v1, v9

    sub-long/2addr p0, v1

    int-to-long v1, v8

    div-long/2addr p0, v1

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_2
    const v0, 0xf404c

    int-to-long v10, v0

    cmp-long v0, p0, v10

    if-gez v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-long v1, v9

    add-long/2addr p0, v1

    int-to-long v1, v8

    div-long/2addr p0, v1

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_3
    const v0, 0x3b9328e0

    int-to-long v7, v0

    cmp-long v0, p0, v7

    if-gez v0, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-long v1, v6

    add-long/2addr p0, v1

    int-to-long v1, v5

    div-long/2addr p0, v1

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    int-to-long v3, v3

    add-long/2addr p0, v3

    int-to-long v2, v2

    div-long/2addr p0, v2

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :goto_0
    const/4 p1, 0x1

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    const-string p1, "%6s"

    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static q0()V
    .locals 5

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "stopLogcatService() called"

    const-string v2, "T500.UTILS"

    invoke-static {v2, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v1

    new-instance v3, Landroid/content/Intent;

    const-class v4, Lru/zinovin/tankspeedometer/service/LogcatService;

    invoke-direct {v3, v1, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v4, "ACTION_STOP_SERVICE"

    invoke-virtual {v3, v4}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v1, v3}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    new-instance v1, Landroid/content/Intent;

    const-class v3, Lru/zinovin/tankspeedometer/service/InternetMonitorService;

    invoke-direct {v1, v0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v4}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    const-string v0, "stopYnService() called"

    invoke-static {v2, v0}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    const-class v3, Lru/zinovin/tankspeedometer/service/YnActivatingService;

    invoke-direct {v1, v0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v4}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    const-string v0, "stopTboxService() called"

    invoke-static {v2, v0}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    const-class v2, Lru/zinovin/tankspeedometer/service/TboxMonitorService;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v4}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    return-void
.end method

.method public static r(Landroid/content/res/ColorStateList;[I)I
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-static {p0}, Landroid/graphics/Color;->alpha(I)I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    const/16 v0, 0xff

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-static {p0, p1}, Ly6;->d(II)I

    move-result p0

    return p0
.end method

.method public static u(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const/16 v0, 0x2e

    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    const/4 v1, -0x1

    const-string v2, ".json"

    if-ne v0, v1, :cond_0

    invoke-virtual {p0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static v(LDg;)LBq;
    .locals 15

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v6

    const-string v0, "transparentBackgroundInCenter"

    const/4 v1, 0x0

    invoke-static {v0, v1}, LBr;->s(Ljava/lang/String;Z)Z

    move-result v7

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Ltr;

    invoke-direct {v0, v6, p0}, Ltr;-><init>(Landroid/content/Context;LDg;)V

    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v11, LV;

    const v12, 0x7f080094

    const v13, 0x7f080152

    if-eqz v7, :cond_0

    move v4, v13

    goto :goto_0

    :cond_0
    move v4, v12

    :goto_0
    const/high16 v14, 0x42400000    # 48.0f

    const/4 v5, 0x2

    move-object v0, v11

    move-object v1, v6

    move-object v2, p0

    move v3, v14

    invoke-direct/range {v0 .. v5}, LV;-><init>(Landroid/content/Context;LDg;FII)V

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v11, LV;

    if-eqz v7, :cond_1

    move v4, v13

    goto :goto_1

    :cond_1
    move v4, v12

    :goto_1
    const/4 v5, 0x1

    move-object v0, v11

    move-object v1, v6

    move-object v2, p0

    move v3, v14

    invoke-direct/range {v0 .. v5}, LV;-><init>(Landroid/content/Context;LDg;FII)V

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v11, LV;

    if-eqz v7, :cond_2

    move v4, v13

    goto :goto_2

    :cond_2
    move v4, v12

    :goto_2
    const/4 v5, 0x0

    move-object v0, v11

    move-object v1, v6

    move-object v2, p0

    move v3, v14

    invoke-direct/range {v0 .. v5}, LV;-><init>(Landroid/content/Context;LDg;FII)V

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, LOq;

    if-eqz v7, :cond_3

    move v12, v13

    :cond_3
    const v1, 0x7f0e017c

    invoke-direct {v0, v6, p0, v1, v12}, LOq;-><init>(Landroid/content/Context;LDg;II)V

    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p0, LK2;

    const/16 v0, 0x10

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, LK2;-><init>(IZ)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v8}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LK2;->b:Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LK2;->c:Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v10}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LK2;->d:Ljava/lang/Object;

    new-instance v0, LBq;

    invoke-direct {v0, p0, p0}, LBq;-><init>(LK2;LK2;)V

    return-object v0
.end method

.method public static w(LDg;)LBq;
    .locals 10

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "transparentBackgroundInCenter"

    const/4 v2, 0x0

    invoke-static {v1, v2}, LBr;->s(Ljava/lang/String;Z)Z

    move-result v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ltr;

    invoke-direct {v5, v0, p0}, Ltr;-><init>(Landroid/content/Context;LDg;)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v5, Lvr;

    const v6, 0x7f080094

    const v7, 0x7f080152

    if-eqz v1, :cond_0

    move v8, v7

    goto :goto_0

    :cond_0
    move v8, v6

    :goto_0
    const/high16 v9, 0x42400000    # 48.0f

    invoke-direct {v5, v0, p0, v9, v8}, Lvr;-><init>(Landroid/content/Context;LDg;FI)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v5, LOq;

    if-eqz v1, :cond_1

    move v6, v7

    :cond_1
    const v1, 0x7f0e017c

    invoke-direct {v5, v0, p0, v1, v6}, LOq;-><init>(Landroid/content/Context;LDg;II)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p0, LK2;

    const/16 v0, 0x10

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, LK2;-><init>(IZ)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LK2;->b:Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LK2;->c:Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, LK2;->d:Ljava/lang/Object;

    new-instance v0, LBq;

    invoke-direct {v0, p0, p0}, LBq;-><init>(LK2;LK2;)V

    return-object v0
.end method

.method public static z()Ljava/lang/String;
    .locals 4

    invoke-static {}, LLf;->a()LLf;

    move-result-object v0

    iget-object v0, v0, LLf;->I:Ldr;

    invoke-virtual {v0}, Loj;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "getNaviPackage()="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "T500.UTILS"

    invoke-static {v2, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "userapp"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lmk;->l(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "naviUserPackage"

    const-string v2, "ru.yandex.yandexnavi"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    const-string v1, "\\|"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-lt v1, v2, :cond_1

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    aget-object v0, v0, v3

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    :goto_0
    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    aget-object v0, v0, v3

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract B(Landroid/view/View;)I
.end method

.method public abstract C(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)I
.end method

.method public abstract E()I
.end method

.method public abstract M(F)Z
.end method

.method public abstract P(Landroid/view/View;)Z
.end method

.method public abstract Q(FF)Z
.end method

.method public abstract X(Ljava/lang/Throwable;)V
.end method

.method public abstract Y(Ljj;)V
.end method

.method public abstract a0(Lu;Lu;)V
.end method

.method public abstract b0(Lu;Ljava/lang/Thread;)V
.end method

.method public abstract d(Landroid/view/ViewGroup$MarginLayoutParams;)I
.end method

.method public abstract e(I)F
.end method

.method public abstract f(Lv;Lr;)Z
.end method

.method public abstract g(Lv;Ljava/lang/Object;Ljava/lang/Object;)Z
.end method

.method public abstract h(Lv;Lu;Lu;)Z
.end method

.method public abstract k0(Landroid/view/View;F)Z
.end method

.method public abstract r0(Landroid/view/ViewGroup$MarginLayoutParams;II)V
.end method

.method public abstract s()I
.end method

.method public abstract t()I
.end method

.method public abstract x()I
.end method

.method public abstract y()I
.end method
