.class public Lxj;
.super Lc4;
.source "SourceFile"


# instance fields
.field public U:LWn;

.field public V:LPn;

.field public W:LPn;

.field public X:LPn;

.field public Y:LPn;

.field public Z:LPn;

.field public a0:LPn;

.field public b0:LPn;

.field public c0:LPn;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lc4;-><init>()V

    return-void
.end method

.method public static e0(LPn;)I
    .locals 0

    invoke-virtual {p0}, LPn;->getValue()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final Y(Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;)V
    .locals 5

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;->c(Z)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, "Default"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f030003

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    iget-object v1, v1, Lru/zinovin/tankspeedometer/MainActivity;->z:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;->b(Ljava/util/ArrayList;Ljava/lang/String;)V

    new-instance v0, Lvj;

    invoke-direct {v0, p0}, Lvj;-><init>(Lxj;)V

    invoke-virtual {p1, v0}, Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;->setOnThemeSelected(Lmo;)V

    new-instance v0, Lwj;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lwj;-><init>(Lxj;I)V

    const v1, 0x7f1301cc

    invoke-virtual {p1, v1, v0}, Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;->a(ILjava/lang/Runnable;)V

    new-instance v0, Lwj;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lwj;-><init>(Lxj;I)V

    const v1, 0x7f1301d0

    invoke-virtual {p1, v1, v0}, Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;->a(ILjava/lang/Runnable;)V

    return-void
.end method

.method public final c0(Ljava/lang/String;)V
    .locals 10

    const-string v0, "T500.ERROR"

    const-string v1, "bottom"

    const-string v2, "right"

    const-string v3, "top"

    const-string v4, "left"

    const-string v5, "useDefault"

    new-instance v6, Ljava/io/File;

    new-instance v7, Ljava/io/File;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v8

    const/4 v9, 0x0

    invoke-virtual {v8, v9}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v8

    const-string v9, "navi"

    invoke-direct {v7, v8, v9}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v8

    if-nez v8, :cond_0

    invoke-virtual {v7}, Ljava/io/File;->mkdirs()Z

    :cond_0
    const-string v8, "navi_config_"

    const-string v9, ".json"

    invoke-static {v8, p1, v9}, LVo;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v6, v7, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_3

    :try_start_0
    new-instance p1, Ljava/io/BufferedReader;

    new-instance v7, Ljava/io/FileReader;

    invoke-direct {v7, v6}, Ljava/io/FileReader;-><init>(Ljava/io/File;)V

    invoke-direct {p1, v7}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    :goto_0
    invoke-virtual {p1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_1

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :catch_0
    move-exception p1

    goto/16 :goto_1

    :catch_1
    move-exception p1

    goto/16 :goto_2

    :cond_1
    invoke-virtual {p1}, Ljava/io/BufferedReader;->close()V

    new-instance p1, Lorg/json/JSONObject;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {p1, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    iget-object v6, p0, Lxj;->U:LWn;

    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v5

    invoke-virtual {v6, v5}, LWn;->setChecked(Z)V

    :cond_2
    const-string v5, "fullscreen"

    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    const-string v6, "windowed"

    invoke-virtual {p1, v6}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    iget-object v6, p0, Lxj;->V:LPn;

    invoke-virtual {v5, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v7

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, LPn;->setValue(Ljava/lang/String;)V

    iget-object v6, p0, Lxj;->W:LPn;

    invoke-virtual {v5, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v7

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, LPn;->setValue(Ljava/lang/String;)V

    iget-object v6, p0, Lxj;->X:LPn;

    invoke-virtual {v5, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v7

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, LPn;->setValue(Ljava/lang/String;)V

    iget-object v6, p0, Lxj;->Y:LPn;

    invoke-virtual {v5, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, LPn;->setValue(Ljava/lang/String;)V

    iget-object v5, p0, Lxj;->Z:LPn;

    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, LPn;->setValue(Ljava/lang/String;)V

    iget-object v4, p0, Lxj;->a0:LPn;

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, LPn;->setValue(Ljava/lang/String;)V

    iget-object v3, p0, Lxj;->b0:LPn;

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, LPn;->setValue(Ljava/lang/String;)V

    iget-object v2, p0, Lxj;->c0:LPn;

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, LPn;->setValue(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :goto_1
    const-string v1, "ERROR in NaviWindowsFragment.loadConfiguration() - JSON"

    invoke-static {v0, v1, p1}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lxj;->g0()V

    goto :goto_3

    :goto_2
    const-string v1, "ERROR in NaviWindowsFragment.loadConfiguration() - IO"

    invoke-static {v0, v1, p1}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lxj;->g0()V

    goto :goto_3

    :cond_3
    invoke-virtual {p0}, Lxj;->g0()V

    :goto_3
    return-void
.end method

.method public final d0(I)LPn;
    .locals 2

    new-instance v0, LPn;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, LPn;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p1}, LSn;->setTitle(I)V

    const/16 p1, 0x1002

    invoke-virtual {v0, p1}, LPn;->setInputTypeFlags(I)V

    new-instance p1, Lf9;

    const/4 v1, 0x2

    invoke-direct {p1, v1}, Lf9;-><init>(I)V

    invoke-virtual {v0, p1}, LPn;->setOnValueChanged(LOn;)V

    return-object v0
.end method

.method public final f0(Ljava/lang/String;)V
    .locals 10

    const-string v0, "bottom"

    const-string v1, "right"

    const-string v2, "top"

    const-string v3, "left"

    const-string v4, "T500.ERROR"

    const-string v5, "navi_config_"

    :try_start_0
    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    const-string v7, "useDefault"

    iget-object v8, p0, Lxj;->U:LWn;

    iget-object v8, v8, LWn;->g:Lle;

    iget-boolean v8, v8, Lle;->e:Z

    invoke-virtual {v6, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    iget-object v8, p0, Lxj;->V:LPn;

    invoke-static {v8}, Lxj;->e0(LPn;)I

    move-result v8

    invoke-virtual {v7, v3, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    iget-object v8, p0, Lxj;->W:LPn;

    invoke-static {v8}, Lxj;->e0(LPn;)I

    move-result v8

    invoke-virtual {v7, v2, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    iget-object v8, p0, Lxj;->X:LPn;

    invoke-static {v8}, Lxj;->e0(LPn;)I

    move-result v8

    invoke-virtual {v7, v1, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    iget-object v8, p0, Lxj;->Y:LPn;

    invoke-static {v8}, Lxj;->e0(LPn;)I

    move-result v8

    invoke-virtual {v7, v0, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    iget-object v9, p0, Lxj;->Z:LPn;

    invoke-static {v9}, Lxj;->e0(LPn;)I

    move-result v9

    invoke-virtual {v8, v3, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    iget-object v3, p0, Lxj;->a0:LPn;

    invoke-static {v3}, Lxj;->e0(LPn;)I

    move-result v3

    invoke-virtual {v8, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    iget-object v2, p0, Lxj;->b0:LPn;

    invoke-static {v2}, Lxj;->e0(LPn;)I

    move-result v2

    invoke-virtual {v8, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    iget-object v1, p0, Lxj;->c0:LPn;

    invoke-static {v1}, Lxj;->e0(LPn;)I

    move-result v1

    invoke-virtual {v8, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v0, "fullscreen"

    invoke-virtual {v6, v0, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "windowed"

    invoke-virtual {v6, v0, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance v0, Ljava/io/File;

    new-instance v1, Ljava/io/File;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    const-string v3, "navi"

    invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ".json"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    new-instance v1, Ljava/io/FileWriter;

    invoke-direct {v1, v0}, Ljava/io/FileWriter;-><init>(Ljava/io/File;)V

    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/Writer;->flush()V

    invoke-virtual {v1}, Ljava/io/Writer;->close()V

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v0

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const v1, 0x7f1301bb

    invoke-virtual {p0, v1, p1}, Lzc;->m(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x1

    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    goto :goto_2

    :goto_0
    const-string v0, "ERROR in NaviWindowsFragment.saveConfiguration() - IO"

    invoke-static {v4, v0, p1}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    :goto_1
    const-string v0, "ERROR in NaviWindowsFragment.saveConfiguration() - JSON"

    invoke-static {v4, v0, p1}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_3

    :goto_2
    const-string v0, "ERROR in NaviWindowsFragment.saveConfiguration() - NumberFormat"

    invoke-static {v4, v0, p1}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_3
    return-void
.end method

.method public final g0()V
    .locals 3

    iget-object v0, p0, Lxj;->V:LPn;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, LPn;->setValue(Ljava/lang/String;)V

    iget-object v0, p0, Lxj;->W:LPn;

    const/16 v2, 0x28

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, LPn;->setValue(Ljava/lang/String;)V

    iget-object v0, p0, Lxj;->X:LPn;

    const/16 v2, 0x780

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, LPn;->setValue(Ljava/lang/String;)V

    iget-object v0, p0, Lxj;->Y:LPn;

    const/16 v2, 0x2e4

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, LPn;->setValue(Ljava/lang/String;)V

    iget-object v0, p0, Lxj;->Z:LPn;

    const/16 v2, 0x226

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, LPn;->setValue(Ljava/lang/String;)V

    iget-object v0, p0, Lxj;->a0:LPn;

    const/16 v2, 0x50

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, LPn;->setValue(Ljava/lang/String;)V

    iget-object v0, p0, Lxj;->b0:LPn;

    const/16 v2, 0x55a

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, LPn;->setValue(Ljava/lang/String;)V

    iget-object v0, p0, Lxj;->c0:LPn;

    const/16 v2, 0x2a8

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, LPn;->setValue(Ljava/lang/String;)V

    iget-object v0, p0, Lxj;->U:LWn;

    invoke-virtual {v0, v1}, LWn;->setChecked(Z)V

    iget-object v0, p0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    iget-object v0, v0, Lru/zinovin/tankspeedometer/MainActivity;->z:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lxj;->f0(Ljava/lang/String;)V

    return-void
.end method

.method public final h0()V
    .locals 4

    iget-object v0, p0, Lxj;->U:LWn;

    iget-object v0, v0, LWn;->g:Lle;

    iget-boolean v0, v0, Lle;->e:Z

    const/4 v1, 0x0

    const-string v2, "Default"

    if-eqz v0, :cond_1

    iget-object v0, p0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    iget-object v0, v0, Lru/zinovin/tankspeedometer/MainActivity;->z:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    iget-object v3, p0, Lxj;->V:LPn;

    invoke-virtual {v3, v0}, LSn;->setRowEnabled(Z)V

    iget-object v3, p0, Lxj;->W:LPn;

    invoke-virtual {v3, v0}, LSn;->setRowEnabled(Z)V

    iget-object v3, p0, Lxj;->X:LPn;

    invoke-virtual {v3, v0}, LSn;->setRowEnabled(Z)V

    iget-object v3, p0, Lxj;->Y:LPn;

    invoke-virtual {v3, v0}, LSn;->setRowEnabled(Z)V

    iget-object v3, p0, Lxj;->Z:LPn;

    invoke-virtual {v3, v0}, LSn;->setRowEnabled(Z)V

    iget-object v3, p0, Lxj;->a0:LPn;

    invoke-virtual {v3, v0}, LSn;->setRowEnabled(Z)V

    iget-object v3, p0, Lxj;->b0:LPn;

    invoke-virtual {v3, v0}, LSn;->setRowEnabled(Z)V

    iget-object v3, p0, Lxj;->c0:LPn;

    invoke-virtual {v3, v0}, LSn;->setRowEnabled(Z)V

    iget-object v0, p0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    iget-object v0, v0, Lru/zinovin/tankspeedometer/MainActivity;->z:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lxj;->U:LWn;

    invoke-virtual {v0, v1}, LWn;->setChecked(Z)V

    :cond_2
    return-void
.end method

.method public final w(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 7

    invoke-virtual {p0}, Lc4;->W()Landroid/widget/ScrollView;

    move-result-object p1

    invoke-virtual {p0}, Lc4;->V()Lji;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    new-instance v5, Lvj;

    invoke-direct {v5, p0}, Lvj;-><init>(Lxj;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const v1, 0x7f130219

    const/4 v2, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lc4;->b0(IIIZLVn;)LWn;

    move-result-object v0

    iput-object v0, p0, Lxj;->U:LWn;

    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/16 v0, 0xc

    invoke-virtual {p0, p2, v0}, Lc4;->O(Landroid/widget/LinearLayout;I)V

    const v1, 0x7f130062

    invoke-virtual {p0, v1}, Lc4;->a0(I)Lii;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v1, LIn;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, LIn;-><init>(Landroid/content/Context;)V

    const v2, 0x7f130127

    invoke-virtual {p0, v2}, Lxj;->d0(I)LPn;

    move-result-object v3

    iput-object v3, p0, Lxj;->V:LPn;

    const v3, 0x7f130129

    invoke-virtual {p0, v3}, Lxj;->d0(I)LPn;

    move-result-object v4

    iput-object v4, p0, Lxj;->W:LPn;

    const v4, 0x7f130128

    invoke-virtual {p0, v4}, Lxj;->d0(I)LPn;

    move-result-object v5

    iput-object v5, p0, Lxj;->X:LPn;

    const v5, 0x7f130125

    invoke-virtual {p0, v5}, Lxj;->d0(I)LPn;

    move-result-object v6

    iput-object v6, p0, Lxj;->Y:LPn;

    iget-object v6, p0, Lxj;->V:LPn;

    invoke-virtual {v1, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v6, p0, Lxj;->W:LPn;

    invoke-virtual {v1, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v6, p0, Lxj;->X:LPn;

    invoke-virtual {v1, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v6, p0, Lxj;->Y:LPn;

    invoke-virtual {v1, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p0, p2, v0}, Lc4;->O(Landroid/widget/LinearLayout;I)V

    const v0, 0x7f13021c

    invoke-virtual {p0, v0}, Lc4;->a0(I)Lii;

    move-result-object v0

    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v0, LIn;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, LIn;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v2}, Lxj;->d0(I)LPn;

    move-result-object v1

    iput-object v1, p0, Lxj;->Z:LPn;

    invoke-virtual {p0, v3}, Lxj;->d0(I)LPn;

    move-result-object v1

    iput-object v1, p0, Lxj;->a0:LPn;

    invoke-virtual {p0, v4}, Lxj;->d0(I)LPn;

    move-result-object v1

    iput-object v1, p0, Lxj;->b0:LPn;

    invoke-virtual {p0, v5}, Lxj;->d0(I)LPn;

    move-result-object v1

    iput-object v1, p0, Lxj;->c0:LPn;

    iget-object v1, p0, Lxj;->Z:LPn;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v1, p0, Lxj;->a0:LPn;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v1, p0, Lxj;->b0:LPn;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v1, p0, Lxj;->c0:LPn;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object p2, p0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    iget-object p2, p2, Lru/zinovin/tankspeedometer/MainActivity;->z:Ljava/lang/String;

    invoke-virtual {p0, p2}, Lxj;->c0(Ljava/lang/String;)V

    iget-object p2, p0, Lxj;->U:LWn;

    iget-object v0, p0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    iget-object v0, v0, Lru/zinovin/tankspeedometer/MainActivity;->z:Ljava/lang/String;

    const-string v1, "Default"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p2, v0}, LSn;->setRowEnabled(Z)V

    invoke-virtual {p0}, Lxj;->h0()V

    return-object p1
.end method
