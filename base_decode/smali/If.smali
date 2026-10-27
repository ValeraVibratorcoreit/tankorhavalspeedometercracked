.class public final synthetic LIf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMj;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LKf;


# direct methods
.method public synthetic constructor <init>(LKf;I)V
    .locals 0

    iput p2, p0, LIf;->a:I

    iput-object p1, p0, LIf;->b:LKf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final w(Ljava/lang/Object;)V
    .locals 8

    iget v0, p0, LIf;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Integer;

    iget-object v0, p0, LIf;->b:LKf;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_0

    const-string p1, "\u00b0F"

    goto :goto_0

    :cond_0
    const-string p1, "\u00b0C"

    :goto_0
    iput-object p1, v0, LKf;->j:Ljava/lang/String;

    return-void

    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    iget-object v0, p0, LIf;->b:LKf;

    iget-boolean v1, v0, LKf;->g:Z

    const/4 v2, 0x0

    const-string v3, "T500.ACTIVITY"

    if-eqz v1, :cond_5

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, v0, LKf;->c:LLf;

    iget-object v1, v1, LLf;->y:Ldr;

    invoke-virtual {v1}, Loj;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_4

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    iget-object v4, v0, LKf;->b:Landroid/content/SharedPreferences;

    const-string v5, "musicApp"

    const-string v6, "ym"

    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "userapp"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    iget-object v5, v0, LKf;->b:Landroid/content/SharedPreferences;

    const-string v6, "musicUserPackage"

    const/4 v7, 0x0

    invoke-interface {v5, v6, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f030012

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_2

    const v6, 0x7f030011

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7, v6}, Landroid/content/res/Resources;->obtainTypedArray(I)Landroid/content/res/TypedArray;

    move-result-object v6

    :try_start_0
    invoke-virtual {v6, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_1

    :catchall_0
    move-exception p1

    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    throw p1

    :cond_2
    const-string v5, "ru.yandex.music"

    :goto_1
    if-nez v5, :cond_3

    const-string v1, "Music package is NULL"

    invoke-static {v3, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    new-instance v6, LH9;

    invoke-direct {v6, v0, v0, v5, v4}, LH9;-><init>(LKf;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v4, 0x3e8

    invoke-virtual {v1, v6, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_4
    :goto_2
    new-instance v1, Ljava/lang/Thread;

    new-instance v4, LJf;

    const/4 v5, 0x0

    invoke-direct {v4, v0, v5}, LJf;-><init>(LKf;I)V

    invoke-direct {v1, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    iput-boolean v2, v0, LKf;->g:Z

    :cond_5
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_9

    const-string p1, "bgMode"

    const-string v1, "static"

    invoke-static {p1, v1}, LUd;->H(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "sun"

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lmk;->l(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v4, "selectedTheme"

    const-string v5, "Audi Virtual Cockpit"

    invoke-interface {v1, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "prefs_"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v4, "useDefaultSwitchBack"

    const/4 v5, 0x1

    invoke-interface {v1, v4, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_6

    const-string v1, "prefs_Default"

    invoke-virtual {p1, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    :cond_6
    const-string p1, "bg_sun_auto_update"

    invoke-interface {v1, p1, v5}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_3

    :cond_7
    iget p1, v0, LKf;->i:I

    const/16 v1, 0xa

    if-lt p1, v1, :cond_8

    goto :goto_3

    :cond_8
    add-int/2addr p1, v5

    iput p1, v0, LKf;->i:I

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Fetching sunrise/sunset (attempt "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, v0, LKf;->i:I

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/Thread;

    new-instance v1, LJf;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, LJf;-><init>(LKf;I)V

    invoke-direct {p1, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    :cond_9
    :goto_3
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
