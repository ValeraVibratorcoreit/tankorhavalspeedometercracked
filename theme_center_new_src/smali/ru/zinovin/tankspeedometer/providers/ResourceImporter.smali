.class public Lru/zinovin/tankspeedometer/providers/ResourceImporter;
.super Ljava/lang/Object;
.source "ResourceImporter.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public static importAll(Landroid/content/Context;)V
    .locals 9

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v1

    const/16 v0, 0x1b

    new-array v0, v0, [Ljava/lang/String;

    const/4 v2, 0x0
    const-string v3, "about_ru.txt"
    aput-object v3, v0, v2
    const/4 v2, 0x1
    const-string v3, "about_en.txt"
    aput-object v3, v0, v2
    const/4 v2, 0x2
    const-string v3, "about_ar.txt"
    aput-object v3, v0, v2
    const/4 v2, 0x3
    const-string v3, "Gif.class"
    aput-object v3, v0, v2
    const/4 v2, 0x4
    const-string v3, "MicroMode.class"
    aput-object v3, v0, v2
    const/4 v2, 0x5
    const-string v3, "lala"
    aput-object v3, v0, v2
    const/4 v2, 0x6
    const-string v3, "CheckPeriod.class"
    aput-object v3, v0, v2
    const/4 v2, 0x7
    const-string v3, "t500_speed.png"
    aput-object v3, v0, v2
    const/16 v2, 0x8
    const-string v3, "t500_rpm.png"
    aput-object v3, v0, v2
    const/16 v2, 0x9
    const-string v3, "needle_tank500.png"
    aput-object v3, v0, v2
    const/16 v2, 0xa
    const-string v3, "t300_speed.png"
    aput-object v3, v0, v2
    const/16 v2, 0xb
    const-string v3, "t300_rpm.png"
    aput-object v3, v0, v2
    const/16 v2, 0xc
    const-string v3, "t300_needle.png"
    aput-object v3, v0, v2
    const/16 v2, 0xd
    const-string v3, "t300_speed_el.png"
    aput-object v3, v0, v2
    const/16 v2, 0xe
    const-string v3, "t300_rpm_el.png"
    aput-object v3, v0, v2
    const/16 v2, 0xf
    const-string v3, "t300_needle_el.png"
    aput-object v3, v0, v2
    const/16 v2, 0x10
    const-string v3, "kia_speed.png"
    aput-object v3, v0, v2
    const/16 v2, 0x11
    const-string v3, "kia_rpm.png"
    aput-object v3, v0, v2
    const/16 v2, 0x12
    const-string v3, "kia_needle.png"
    aput-object v3, v0, v2
    const/16 v2, 0x13
    const-string v3, "kia_speed_mini.png"
    aput-object v3, v0, v2
    const/16 v2, 0x14
    const-string v3, "kia_rpm_mini.png"
    aput-object v3, v0, v2
    const/16 v2, 0x15
    const-string v3, "night_needle.png"
    aput-object v3, v0, v2
    const/16 v2, 0x16
    const-string v3, "night_central_speed.png"
    aput-object v3, v0, v2
    const/16 v2, 0x17
    const-string v3, "night_central_rpm.png"
    aput-object v3, v0, v2
    const/16 v2, 0x18
    const-string v3, "night_center_speed_transparent.png"
    aput-object v3, v0, v2
    const/16 v2, 0x19
    const-string v3, "night_center_rpm_transparent.png"
    aput-object v3, v0, v2
    const/16 v2, 0x1a
    const-string v3, "night_needle_short.png"
    aput-object v3, v0, v2

    const/4 v2, 0x0
    invoke-virtual {p0, v2}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    invoke-static {v2, v1, v0}, Lru/zinovin/tankspeedometer/providers/ResourceImporter;->importDir(Ljava/io/File;Ljava/io/File;[Ljava/lang/String;)V

    new-instance v2, Ljava/io/File;

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v3

    const-string v4, "TankSpeedometerResources"

    invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v2, v1, v0}, Lru/zinovin/tankspeedometer/providers/ResourceImporter;->importDir(Ljava/io/File;Ljava/io/File;[Ljava/lang/String;)V

    new-instance v2, Ljava/io/File;

    const-string v4, "Download"

    invoke-static {v4}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    const-string v4, "TankSpeedometerResources"

    invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v2, v1, v0}, Lru/zinovin/tankspeedometer/providers/ResourceImporter;->importDir(Ljava/io/File;Ljava/io/File;[Ljava/lang/String;)V

    new-instance v2, Ljava/io/File;

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v3

    const-string v4, "Download/TankSpeedometerResources"

    invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v2, v1, v0}, Lru/zinovin/tankspeedometer/providers/ResourceImporter;->importDir(Ljava/io/File;Ljava/io/File;[Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "T500.IMPORT"

    const-string v2, "Resource import failed"

    invoke-static {v1, v2, v0}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method private static importDir(Ljava/io/File;Ljava/io/File;[Ljava/lang/String;)V
    .locals 11

    if-eqz p0, :done

    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v0

    if-nez v0, :done

    const/4 v0, 0x0

    :goto_0
    array-length v1, p2

    if-ge v0, v1, :done

    aget-object v1, p2, v0

    new-instance v2, Ljava/io/File;

    invoke-direct {v2, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    move-result v3

    if-nez v3, :next

    new-instance v3, Ljava/io/File;

    invoke-direct {v3, p1, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    :try_start_0
    new-instance v4, Ljava/io/FileInputStream;

    invoke-direct {v4, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    new-instance v5, Ljava/io/FileOutputStream;

    invoke-direct {v5, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    const/16 v6, 0x2000

    new-array v6, v6, [B
    :goto_1
    invoke-virtual {v4, v6}, Ljava/io/FileInputStream;->read([B)I

    move-result v7

    if-gez v7, :cond_0

    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V

    invoke-virtual {v5}, Ljava/io/FileOutputStream;->close()V

    goto :next

    :cond_0
    const/4 v8, 0x0

    invoke-virtual {v5, v6, v8, v7}, Ljava/io/FileOutputStream;->write([BII)V

    goto :goto_1
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v4

    const-string v5, "T500.IMPORT"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "copy failed: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6, v4}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :next
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :done
    return-void
.end method
