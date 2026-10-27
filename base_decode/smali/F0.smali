.class public final synthetic LF0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LE3;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, LF0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF0;->c:Ljava/lang/Object;

    iput-boolean p2, p0, LF0;->b:Z

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Z)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, LF0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, LF0;->b:Z

    iput-object p1, p0, LF0;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 3
    const/4 v0, 0x2

    iput v0, p0, LF0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LF0;->c:Ljava/lang/Object;

    const/4 p1, 0x0

    iput-boolean p1, p0, LF0;->b:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    const/4 v0, 0x0

    const/4 v1, 0x1

    iget-object v2, p0, LF0;->c:Ljava/lang/Object;

    iget-boolean v3, p0, LF0;->b:Z

    iget v4, p0, LF0;->a:I

    packed-switch v4, :pswitch_data_0

    check-cast v2, Landroid/view/View;

    if-eqz v3, :cond_3

    sget-object v0, LGs;->a:Ljava/util/WeakHashMap;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1e

    if-lt v0, v3, :cond_0

    invoke-static {v2}, LCs;->c(Landroid/view/View;)LZt;

    move-result-object v0

    goto :goto_1

    :cond_0
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    :goto_0
    instance-of v3, v0, Landroid/content/ContextWrapper;

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    instance-of v3, v0, Landroid/app/Activity;

    if-eqz v3, :cond_1

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v3, LZt;

    invoke-direct {v3, v0, v2}, LZt;-><init>(Landroid/view/Window;Landroid/view/View;)V

    move-object v0, v3

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_2
    move-object v0, v4

    :goto_1
    if-eqz v0, :cond_3

    iget-object v0, v0, LZt;->a:LTd;

    invoke-virtual {v0}, LTd;->H()V

    goto :goto_2

    :cond_3
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-class v3, Landroid/view/inputmethod/InputMethodManager;

    invoke-static {v0, v3}, LI7;->b(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    invoke-virtual {v0, v2, v1}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    :goto_2
    return-void

    :pswitch_0
    check-cast v2, LE3;

    invoke-virtual {v2}, LE3;->i0()V

    iget-object v1, v2, LE3;->b0:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v1, v0}, LE3;->l0(Landroid/view/View;Z)V

    invoke-virtual {v2}, LE3;->k0()V

    invoke-virtual {v2}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    if-eqz v3, :cond_4

    const v2, 0x7f130025

    goto :goto_3

    :cond_4
    const v2, 0x7f130026

    :goto_3
    invoke-static {v1, v2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    return-void

    :pswitch_1
    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    const-string v5, "ru.zinovin.navionip"

    invoke-virtual {v4, v5}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v4

    const/4 v5, 0x2

    if-eqz v4, :cond_9

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6}, Lmk;->l(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v6

    const-string v7, "ipType"

    const-string v8, "1"

    invoke-interface {v6, v7, v8}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_5

    const-string v8, "MICROMODE"

    invoke-interface {v6, v8, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v8

    if-eqz v8, :cond_5

    move v8, v1

    goto :goto_4

    :cond_5
    move v8, v0

    :goto_4
    const-string v9, "selectedTheme"

    const-string v10, "Audi Virtual Cockpit"

    invoke-interface {v6, v9, v10}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lnp;->g(Ljava/lang/String;)LMf;

    move-result-object v9

    if-eqz v8, :cond_6

    iget-boolean v8, v9, LMf;->z:Z

    if-eqz v8, :cond_6

    sget-object v0, Lpa;->g:Luj;

    goto :goto_6

    :cond_6
    invoke-static {}, Lpa;->x()Lpa;

    move-result-object v8

    const-string v9, "3"

    invoke-virtual {v7, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    goto :goto_5

    :cond_7
    const-string v6, "Default"

    :goto_5
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    invoke-static {v0, v6}, Lpa;->A(ILjava/lang/String;)Luj;

    move-result-object v0

    :goto_6
    iget-object v6, v0, Luj;->b:Ltj;

    if-eqz v3, :cond_8

    goto :goto_7

    :cond_8
    iget-object v6, v0, Luj;->a:Ltj;

    :goto_7
    iget v0, v6, Ltj;->a:I

    const-string v3, "left"

    invoke-virtual {v4, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v0, "top"

    iget v3, v6, Ltj;->b:I

    invoke-virtual {v4, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v0, "right"

    iget v3, v6, Ltj;->c:I

    invoke-virtual {v4, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v0, "bottom"

    iget v3, v6, Ltj;->d:I

    invoke-virtual {v4, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v0, "display"

    invoke-virtual {v4, v0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    :cond_9
    check-cast v2, Landroid/content/Context;

    if-eqz v4, :cond_b

    invoke-static {}, Landroid/app/ActivityOptions;->makeBasic()Landroid/app/ActivityOptions;

    move-result-object v0

    :try_start_0
    const-class v1, Landroid/app/ActivityOptions;

    const-string v3, "setLaunchWindowingMode"

    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v6}, [Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v1, v3, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    const/4 v3, 0x6

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_8

    :catch_0
    move-exception v1

    const-string v3, "T500.ERROR"

    const-string v6, "ERROR in startNaviAppOnIP()"

    invoke-static {v3, v6, v1}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_8
    invoke-virtual {v0, v5}, Landroid/app/ActivityOptions;->setLaunchDisplayId(I)Landroid/app/ActivityOptions;

    invoke-virtual {v0}, Landroid/app/ActivityOptions;->toBundle()Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {v2, v4, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;Landroid/os/Bundle;)V

    invoke-virtual {v2, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    invoke-static {}, LLf;->a()LLf;

    move-result-object v0

    invoke-static {}, LUd;->L()Z

    move-result v1

    if-eqz v1, :cond_a

    iget-object v0, v0, LLf;->I:Ldr;

    invoke-virtual {v0}, Loj;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "userapp"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    :cond_a
    const-string v0, "T500.UTILS"

    const-string v1, "startYnService() called"

    invoke-static {v0, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    const-class v2, Lru/zinovin/tankspeedometer/service/YnActivatingService;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v2, "ACTION_START_OR_RESUME_SERVICE"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto :goto_9

    :cond_b
    const v0, 0x7f1301c2

    invoke-virtual {v2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :cond_c
    :goto_9
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
