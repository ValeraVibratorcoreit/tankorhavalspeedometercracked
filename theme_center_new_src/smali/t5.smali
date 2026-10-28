.class public final synthetic Lt5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lt5;->a:I

    iput-object p1, p0, Lt5;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    iget v4, p0, Lt5;->a:I

    packed-switch v4, :pswitch_data_0

    sget v4, Lru/zinovin/tankspeedometer/service/YnActivatingService;->d:I

    iget-object v4, p0, Lt5;->b:Ljava/lang/Object;

    check-cast v4, Lru/zinovin/tankspeedometer/service/YnActivatingService;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LUd;->z()Ljava/lang/String;

    move-result-object v5

    const/4 v6, -0x1

    :try_start_0
    const-string v7, "android.app.ActivityManager"

    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v7

    const-string v8, "getService"

    invoke-virtual {v7, v8, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    invoke-virtual {v8, v7, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v7

    const-string v8, "getStackIdOnDisplay"

    const-class v9, Ljava/lang/String;

    sget-object v10, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v9, v10}, [Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v7, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v7

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    filled-new-array {v5, v8}, [Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v7, v0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v7, "ERROR"

    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    move v0, v6

    :goto_0
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v7, "display=2, navi stackid="

    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string v7, "T500.YN_ACTIVATE"

    invoke-static {v7, v5}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v5, v4, Lru/zinovin/tankspeedometer/service/YnActivatingService;->b:Z

    if-nez v5, :cond_4

    iget-object v5, v4, Lru/zinovin/tankspeedometer/service/YnActivatingService;->a:Landroid/content/SharedPreferences;

    const-string v8, "useNaviActivation"

    invoke-interface {v5, v8, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_4

    if-eq v0, v6, :cond_4

    const-string v0, "usagestats"

    invoke-virtual {v4, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/usage/UsageStatsManager;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    const-wide/32 v8, 0xea60

    sub-long v8, v5, v8

    invoke-virtual {v0, v8, v9, v5, v6}, Landroid/app/usage/UsageStatsManager;->queryEvents(JJ)Landroid/app/usage/UsageEvents;

    move-result-object v0

    new-instance v5, Landroid/app/usage/UsageEvents$Event;

    invoke-direct {v5}, Landroid/app/usage/UsageEvents$Event;-><init>()V

    move v6, v2

    :cond_0
    :goto_1
    invoke-virtual {v0}, Landroid/app/usage/UsageEvents;->hasNextEvent()Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-virtual {v0, v5}, Landroid/app/usage/UsageEvents;->getNextEvent(Landroid/app/usage/UsageEvents$Event;)Z

    invoke-virtual {v5}, Landroid/app/usage/UsageEvents$Event;->getPackageName()Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "packageName="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v7, v9}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, LUd;->z()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-virtual {v5}, Landroid/app/usage/UsageEvents$Event;->getEventType()I

    move-result v8

    if-eq v8, v3, :cond_2

    if-eq v8, v1, :cond_1

    const-string v8, "Unknown event"

    goto :goto_2

    :cond_1
    const-string v8, "Moved to background"

    move v6, v3

    goto :goto_2

    :cond_2
    const-string v8, "Moved to foreground"

    move v6, v2

    :goto_2
    const-string v9, "Navigation App eventDescription="

    invoke-virtual {v9, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    if-eqz v6, :cond_4

    const-string v0, "Navigation App is NOT TOP"

    invoke-static {v7, v0}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-static {}, LUd;->z()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v4, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_4
    return-void

    :pswitch_0
    iget-object v0, p0, Lt5;->b:Ljava/lang/Object;

    check-cast v0, LDq;

    iget-object v1, v0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    iget-object v1, v1, Lru/zinovin/tankspeedometer/MainActivity;->z:Ljava/lang/String;

    invoke-virtual {v0}, Lc4;->T()Landroid/content/SharedPreferences;

    move-result-object v4

    const-string v5, "useDefaultSwitchCommon"

    invoke-interface {v4, v5, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_5

    const-string v5, "Default"

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_3

    :cond_5
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v4, "speedFromLeft"

    invoke-interface {v1, v4, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    const-string v4, "bigMeters"

    invoke-interface {v1, v4, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    const-string v4, "infoInCenter"

    invoke-interface {v1, v4, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    const-string v4, "speedInCenter"

    invoke-interface {v1, v4, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    const-string v4, "transparentBackgroundInCenter"

    invoke-interface {v1, v4, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    const-string v2, "showLabelInMeter"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-virtual {v0}, LDq;->c0()V

    invoke-virtual {v0}, LDq;->d0()Z

    move-result v1

    if-eqz v1, :cond_6

    const-string v1, "ALL"

    invoke-virtual {v0, v1}, Lc4;->X(Ljava/lang/String;)V

    :cond_6
    :goto_3
    return-void

    :pswitch_1
    iget-object v0, p0, Lt5;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/textfield/TextInputLayout;

    iget-object v0, v0, Lcom/google/android/material/textfield/TextInputLayout;->d:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    return-void

    :pswitch_2
    iget-object v0, p0, Lt5;->b:Ljava/lang/Object;

    check-cast v0, Lru/zinovin/tankspeedometer/service/TboxMonitorService;

    iget-object v1, v0, Lru/zinovin/tankspeedometer/service/TboxMonitorService;->b:Landroid/content/SharedPreferences;

    const-string v3, "tboxSwitch"

    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_7

    new-instance v1, Lip;

    const-string v2, "iptables -S FORWARD | grep ccinet"

    invoke-direct {v1, v2}, Lip;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Ljava/util/concurrent/CompletableFuture;->supplyAsync(Ljava/util/function/Supplier;)Ljava/util/concurrent/CompletableFuture;

    move-result-object v1

    new-instance v2, Llq;

    invoke-direct {v2, v0}, Llq;-><init>(Lru/zinovin/tankspeedometer/service/TboxMonitorService;)V

    invoke-virtual {v1, v2}, Ljava/util/concurrent/CompletableFuture;->thenAccept(Ljava/util/function/Consumer;)Ljava/util/concurrent/CompletableFuture;

    :cond_7
    return-void

    :pswitch_3
    iget-object v0, p0, Lt5;->b:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v3, "input_method"

    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {v1, v0, v2}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    return-void

    :pswitch_4
    iget-object v0, p0, Lt5;->b:Ljava/lang/Object;

    check-cast v0, LE4;

    iput-boolean v2, v0, LE4;->c:Z

    iget-object v2, v0, LE4;->e:LL7;

    check-cast v2, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    iget-object v3, v2, Lcom/google/android/material/sidesheet/SideSheetBehavior;->i:LKs;

    if-eqz v3, :cond_8

    invoke-virtual {v3}, LKs;->f()Z

    move-result v3

    if-eqz v3, :cond_8

    iget v1, v0, LE4;->b:I

    invoke-virtual {v0, v1}, LE4;->a(I)V

    goto :goto_4

    :cond_8
    iget v3, v2, Lcom/google/android/material/sidesheet/SideSheetBehavior;->h:I

    if-ne v3, v1, :cond_9

    iget v0, v0, LE4;->b:I

    invoke-virtual {v2, v0}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->r(I)V

    :cond_9
    :goto_4
    return-void

    :pswitch_5
    iget-object v0, p0, Lt5;->b:Ljava/lang/Object;

    check-cast v0, LMn;

    invoke-virtual {v0}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    const-string v2, "input_method"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    if-eqz v1, :cond_a

    iget-object v0, v0, LMn;->Y:Landroid/widget/EditText;

    invoke-virtual {v1, v0, v3}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    :cond_a
    return-void

    :pswitch_6
    iget-object v0, p0, Lt5;->b:Ljava/lang/Object;

    check-cast v0, Lxl;

    invoke-virtual {v0}, Lxl;->l()V

    return-void

    :pswitch_7
    iget-object v0, p0, Lt5;->b:Ljava/lang/Object;

    check-cast v0, LZk;

    const-string v1, "this$0"

    invoke-static {v1, v0}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iget v1, v0, LZk;->b:I

    iget-object v2, v0, LZk;->f:LFg;

    if-nez v1, :cond_b

    iput-boolean v3, v0, LZk;->c:Z

    sget-object v1, Ltg;->ON_PAUSE:Ltg;

    invoke-virtual {v2, v1}, LFg;->e(Ltg;)V

    :cond_b
    iget v1, v0, LZk;->a:I

    if-nez v1, :cond_c

    iget-boolean v1, v0, LZk;->c:Z

    if-eqz v1, :cond_c

    sget-object v1, Ltg;->ON_STOP:Ltg;

    invoke-virtual {v2, v1}, LFg;->e(Ltg;)V

    iput-boolean v3, v0, LZk;->d:Z

    :cond_c
    return-void

    :pswitch_8
    iget-object v0, p0, Lt5;->b:Ljava/lang/Object;

    check-cast v0, Lsj;

    iget-object v1, v0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    iget-object v1, v1, Lru/zinovin/tankspeedometer/MainActivity;->z:Ljava/lang/String;

    invoke-virtual {v0}, Lc4;->T()Landroid/content/SharedPreferences;

    move-result-object v4

    const-string v5, "useDefaultSwitchNavi"

    invoke-interface {v4, v5, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_d

    const-string v3, "Default"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    goto :goto_5

    :cond_d
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v3, "useSysNavi"

    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    const-string v3, "useNavi"

    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    const-string v3, "naviFullscreen"

    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-virtual {v0}, Lsj;->c0()V

    invoke-virtual {v0}, Lsj;->d0()Z

    move-result v1

    if-eqz v1, :cond_e

    const-string v1, "ALL"

    invoke-virtual {v0, v1}, Lc4;->X(Ljava/lang/String;)V

    :cond_e
    :goto_5
    return-void

    :pswitch_9
    iget-object v0, p0, Lt5;->b:Ljava/lang/Object;

    check-cast v0, LEh;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.MAIN"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v2, Landroid/content/ComponentName;

    const-string v3, "com.android.settings"

    const-string v4, "com.android.settings.Settings"

    invoke-direct {v2, v3, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    const/high16 v2, 0x10000000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {v0, v1}, Lzc;->M(Landroid/content/Intent;)V

    return-void

    :pswitch_a
    sget v0, Lru/zinovin/tankspeedometer/MainActivity;->M:I

    iget-object v0, p0, Lt5;->b:Ljava/lang/Object;

    check-cast v0, Lru/zinovin/tankspeedometer/MainActivity;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LUd;->o0()V

    return-void

    :pswitch_b
    sget v0, Lru/zinovin/tankspeedometer/service/LogcatService;->e:I

    iget-object v0, p0, Lt5;->b:Ljava/lang/Object;

    check-cast v0, Lru/zinovin/tankspeedometer/service/LogcatService;

    invoke-virtual {v0}, Lru/zinovin/tankspeedometer/service/LogcatService;->l()V

    return-void

    :pswitch_c
    sget v0, Lru/zinovin/tankspeedometer/service/InternetMonitorService;->d:I

    iget-object v0, p0, Lt5;->b:Ljava/lang/Object;

    check-cast v0, Lru/zinovin/tankspeedometer/service/InternetMonitorService;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LUd;->N()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-object v0, v0, Lru/zinovin/tankspeedometer/service/InternetMonitorService;->a:LLf;

    iget-object v0, v0, LLf;->x:Ldr;

    invoke-virtual {v0, v1}, Ldr;->f(Ljava/lang/Object;)V

    return-void

    :pswitch_d
    iget-object v0, p0, Lt5;->b:Ljava/lang/Object;

    check-cast v0, Lqf;

    iget-object v1, v0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    iget-object v1, v1, Lru/zinovin/tankspeedometer/MainActivity;->z:Ljava/lang/String;

    invoke-virtual {v0}, Lc4;->T()Landroid/content/SharedPreferences;

    move-result-object v4

    const-string v5, "useDefaultSwitch"

    invoke-interface {v4, v5, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_f

    const-string v5, "Default"

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_f

    goto :goto_9

    :cond_f
    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    sget-object v5, Lqf;->W:[Ljava/lang/String;

    move v6, v2

    :goto_6
    const/4 v7, 0x4

    if-ge v6, v7, :cond_10

    aget-object v7, v5, v6

    invoke-static {v7, v1}, LTf;->y(Ljava/lang/String;Ljava/lang/String;)I

    move-result v8

    invoke-interface {v4, v7, v8}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    add-int/2addr v6, v3

    goto :goto_6

    :cond_10
    sget-object v5, Lqf;->Y:[Ljava/lang/String;

    move v6, v2

    :goto_7
    if-ge v6, v7, :cond_11

    aget-object v8, v5, v6

    invoke-static {v8, v1}, LTf;->y(Ljava/lang/String;Ljava/lang/String;)I

    move-result v9

    invoke-interface {v4, v8, v9}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    add-int/2addr v6, v3

    goto :goto_7

    :cond_11
    sget-object v5, Lqf;->a0:[Ljava/lang/String;

    :goto_8
    if-ge v2, v7, :cond_12

    aget-object v6, v5, v2

    invoke-static {v6, v1}, LTf;->y(Ljava/lang/String;Ljava/lang/String;)I

    move-result v8

    invoke-interface {v4, v6, v8}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    add-int/2addr v2, v3

    goto :goto_8

    :cond_12
    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-virtual {v0}, Lqf;->e0()V

    invoke-virtual {v0}, Lqf;->d0()V

    invoke-virtual {v0}, Lzc;->I()Landroid/content/Context;

    move-result-object v2

    const v4, 0x7f130197

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v4, v1}, Lzc;->m(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :goto_9
    return-void

    :pswitch_e
    iget-object v0, p0, Lt5;->b:Ljava/lang/Object;

    check-cast v0, Lle;

    iget-object v1, v0, Lle;->g:Lke;

    iget-boolean v0, v0, Lle;->e:Z

    check-cast v1, Ld4;

    iget-object v1, v1, Ld4;->b:Ljava/lang/Object;

    check-cast v1, LWn;

    iget-boolean v2, v1, LWn;->i:Z

    if-eqz v2, :cond_13

    goto :goto_a

    :cond_13
    iget-object v1, v1, LWn;->h:LVn;

    if-eqz v1, :cond_14

    invoke-interface {v1, v0}, LVn;->c(Z)V

    :cond_14
    :goto_a
    return-void

    :pswitch_f
    iget-object v0, p0, Lt5;->b:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void

    :pswitch_10
    iget-object v0, p0, Lt5;->b:Ljava/lang/Object;

    check-cast v0, Lfc;

    const-string v3, "fetchFonts result is not OK. ("

    iget-object v4, v0, Lfc;->d:Ljava/lang/Object;

    monitor-enter v4

    :try_start_1
    iget-object v5, v0, Lfc;->h:LUd;

    if-nez v5, :cond_15

    monitor-exit v4

    goto/16 :goto_10

    :catchall_0
    move-exception v0

    goto/16 :goto_12

    :cond_15
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v0}, Lfc;->d()Lqc;

    move-result-object v4

    iget v5, v4, Lqc;->e:I

    if-ne v5, v1, :cond_16

    iget-object v1, v0, Lfc;->d:Ljava/lang/Object;

    monitor-enter v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    monitor-exit v1

    goto :goto_b

    :catchall_1
    move-exception v2

    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v1

    goto/16 :goto_e

    :cond_16
    :goto_b
    if-nez v5, :cond_19

    :try_start_5
    const-string v1, "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"

    sget v3, Lcr;->a:I

    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    iget-object v1, v0, Lfc;->c:Lh8;

    iget-object v3, v0, Lfc;->a:Landroid/content/Context;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    filled-new-array {v4}, [Lqc;

    move-result-object v1

    sget-object v5, LCr;->a:LF4;

    invoke-virtual {v5, v3, v1, v2}, LF4;->r(Landroid/content/Context;[Lqc;I)Landroid/graphics/Typeface;

    move-result-object v1

    iget-object v2, v0, Lfc;->a:Landroid/content/Context;

    iget-object v3, v4, Lqc;->a:Landroid/net/Uri;

    invoke-static {v2, v3}, LTd;->w(Landroid/content/Context;Landroid/net/Uri;)Ljava/nio/MappedByteBuffer;

    move-result-object v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    if-eqz v2, :cond_18

    if-eqz v1, :cond_18

    :try_start_6
    const-string v3, "EmojiCompat.MetadataRepo.create"

    invoke-static {v3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    new-instance v3, Ljj;

    invoke-static {v2}, Lmk;->G(Ljava/nio/MappedByteBuffer;)LQi;

    move-result-object v2

    invoke-direct {v3, v1, v2}, Ljj;-><init>(Landroid/graphics/Typeface;LQi;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    :try_start_7
    invoke-static {}, Landroid/os/Trace;->endSection()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    :try_start_8
    invoke-static {}, Landroid/os/Trace;->endSection()V

    iget-object v1, v0, Lfc;->d:Ljava/lang/Object;

    monitor-enter v1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    :try_start_9
    iget-object v2, v0, Lfc;->h:LUd;

    if-eqz v2, :cond_17

    invoke-virtual {v2, v3}, LUd;->Y(Ljj;)V

    goto :goto_c

    :catchall_3
    move-exception v2

    goto :goto_d

    :cond_17
    :goto_c
    monitor-exit v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    :try_start_a
    invoke-virtual {v0}, Lfc;->b()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    goto :goto_10

    :goto_d
    :try_start_b
    monitor-exit v1
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    :try_start_c
    throw v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    :catchall_4
    move-exception v1

    :try_start_d
    sget v2, Lcr;->a:I

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v1

    :cond_18
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Unable to open file."

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    :catchall_5
    move-exception v1

    :try_start_e
    sget v2, Lcr;->a:I

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v1

    :cond_19
    new-instance v1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ")"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    :goto_e
    iget-object v2, v0, Lfc;->d:Ljava/lang/Object;

    monitor-enter v2

    :try_start_f
    iget-object v3, v0, Lfc;->h:LUd;

    if-eqz v3, :cond_1a

    invoke-virtual {v3, v1}, LUd;->X(Ljava/lang/Throwable;)V

    goto :goto_f

    :catchall_6
    move-exception v0

    goto :goto_11

    :cond_1a
    :goto_f
    monitor-exit v2
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    invoke-virtual {v0}, Lfc;->b()V

    :goto_10
    return-void

    :goto_11
    :try_start_10
    monitor-exit v2
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_6

    throw v0

    :goto_12
    :try_start_11
    monitor-exit v4
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_0

    throw v0

    :pswitch_11
    iget-object v0, p0, Lt5;->b:Ljava/lang/Object;

    check-cast v0, Lha;

    iget-object v1, v0, Lha;->h:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {v1}, Landroid/widget/AutoCompleteTextView;->isPopupShowing()Z

    move-result v1

    invoke-virtual {v0, v1}, Lha;->t(Z)V

    iput-boolean v1, v0, Lha;->m:Z

    return-void

    :pswitch_12
    sget-object v0, LK9;->d0:Lmi;

    iget-object v0, p0, Lt5;->b:Ljava/lang/Object;

    check-cast v0, LK9;

    invoke-virtual {v0}, LK9;->O()V

    return-void

    :pswitch_13
    sget-object v0, Lru/zinovin/tankspeedometer/DownloadActivity2;->G:Lmi;

    iget-object v0, p0, Lt5;->b:Ljava/lang/Object;

    check-cast v0, Lru/zinovin/tankspeedometer/DownloadActivity2;

    invoke-virtual {v0}, Lru/zinovin/tankspeedometer/DownloadActivity2;->E()V

    return-void

    :pswitch_14
    iget-object v0, p0, Lt5;->b:Ljava/lang/Object;

    check-cast v0, LQ6;

    invoke-static {v0}, LQ6;->a(LQ6;)V

    return-void

    :pswitch_15
    const-string v1, "this$0"

    iget-object v2, p0, Lt5;->b:Ljava/lang/Object;

    check-cast v2, LL6;

    invoke-static {v1, v2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v1, v2, LL6;->b:Ljava/lang/Runnable;

    if-eqz v1, :cond_1b

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    iput-object v0, v2, LL6;->b:Ljava/lang/Runnable;

    :cond_1b
    return-void

    :pswitch_16
    iget-object v0, p0, Lt5;->b:Ljava/lang/Object;

    check-cast v0, Lg6;

    invoke-virtual {v0, v3}, Lg6;->t(Z)V

    return-void

    :pswitch_17
    iget-object v0, p0, Lt5;->b:Ljava/lang/Object;

    check-cast v0, Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-virtual {v0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->g0()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
