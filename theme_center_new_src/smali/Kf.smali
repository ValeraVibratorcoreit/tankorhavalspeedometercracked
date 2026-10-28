.class public abstract LKf;
.super Landroid/app/Service;
.source "SourceFile"

# interfaces
.implements LDg;


# instance fields
.field public final a:LK2;

.field public b:Landroid/content/SharedPreferences;

.field public final c:LLf;

.field public d:I

.field public e:I

.field public f:I

.field public g:Z

.field public h:Z

.field public i:I

.field public j:Ljava/lang/String;

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:Landroid/view/WindowManager;

.field public p:Landroid/view/View;

.field public q:Landroid/view/WindowManager$LayoutParams;

.field public final r:LK2;

.field public final s:LO1;

.field public final t:Lje;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    new-instance v0, LK2;

    invoke-direct {v0, p0}, LK2;-><init>(LDg;)V

    iput-object v0, p0, LKf;->a:LK2;

    invoke-static {}, LLf;->a()LLf;

    move-result-object v0

    iput-object v0, p0, LKf;->c:LLf;

    const v0, -0x777778

    iput v0, p0, LKf;->d:I

    const/4 v0, -0x1

    iput v0, p0, LKf;->e:I

    iput v0, p0, LKf;->f:I

    const/4 v0, 0x1

    iput-boolean v0, p0, LKf;->g:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, LKf;->h:Z

    iput v1, p0, LKf;->i:I

    const-string v2, "\u00b0C"

    iput-object v2, p0, LKf;->j:Ljava/lang/String;

    iput-boolean v1, p0, LKf;->k:Z

    iput-boolean v1, p0, LKf;->l:Z

    iput-boolean v0, p0, LKf;->m:Z

    iput-boolean v0, p0, LKf;->n:Z

    new-instance v0, LK2;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, LK2;-><init>(I)V

    iput-object v0, p0, LKf;->r:LK2;

    new-instance v0, LO1;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, LO1;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, LKf;->s:LO1;

    new-instance v0, Lje;

    new-instance v1, Ld2;

    const/16 v2, 0x15

    invoke-direct {v1, v2}, Ld2;-><init>(I)V

    invoke-direct {v0, p0, v1}, Lje;-><init>(Landroid/content/Context;Ld2;)V

    iput-object v0, p0, LKf;->t:Lje;

    return-void
.end method

.method public static p(Landroid/view/View;I)V
    .locals 0

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(ZZ)V
    .locals 10

    const v0, 0x7f0b01c5

    invoke-virtual {p0, v0}, LKf;->c(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    iget-object v1, p0, LKf;->b:Landroid/content/SharedPreferences;

    const-string v2, "selectedTheme"

    const-string v3, "Audi Virtual Cockpit"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, LKf;->b:Landroid/content/SharedPreferences;

    const-string v3, "showNaviBorder"

    const/4 v4, 0x1

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    sget-object p1, Lpa;->g:Luj;

    goto :goto_0

    :cond_1
    invoke-static {}, Lpa;->x()Lpa;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    const/4 p1, 0x0

    invoke-static {p1, v1}, Lpa;->A(ILjava/lang/String;)Luj;

    move-result-object p1

    :goto_0
    if-eqz p2, :cond_2

    iget-object p1, p1, Luj;->b:Ltj;

    goto :goto_1

    :cond_2
    iget-object p1, p1, Luj;->a:Ltj;

    :goto_1
    iget p2, p1, Ltj;->c:I

    iget v1, p1, Ltj;->a:I

    sub-int/2addr p2, v1

    iget v1, p1, Ltj;->d:I

    iget v2, p1, Ltj;->b:I

    sub-int/2addr v1, v2

    new-instance v2, Lqj;

    invoke-direct {v2, p0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/high16 v3, 0x42700000    # 60.0f

    iput v3, v2, Lqj;->d:F

    new-instance v4, Landroid/graphics/Paint;

    invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V

    iput-object v4, v2, Lqj;->a:Landroid/graphics/Paint;

    const/high16 v5, -0x1000000

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v4, v2, Lqj;->a:Landroid/graphics/Paint;

    invoke-virtual {v4, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v3, v2, Lqj;->a:Landroid/graphics/Paint;

    sget-object v4, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    new-instance v3, Landroid/graphics/Path;

    invoke-direct {v3}, Landroid/graphics/Path;-><init>()V

    iput-object v3, v2, Lqj;->b:Landroid/graphics/Path;

    new-instance v3, Landroid/graphics/RectF;

    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    iput-object v3, v2, Lqj;->c:Landroid/graphics/RectF;

    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/view/View;->setId(I)V

    new-instance v3, Ll7;

    invoke-direct {v3, p2, v1}, Ll7;-><init>(II)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance p2, Lu7;

    invoke-direct {p2}, Lu7;-><init>()V

    invoke-virtual {p2, v0}, Lu7;->b(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v5

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v7

    const/4 v8, 0x3

    iget v9, p1, Ltj;->b:I

    const/4 v6, 0x3

    move-object v4, p2

    invoke-virtual/range {v4 .. v9}, Lu7;->c(IIIII)V

    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v5

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v7

    const/4 v8, 0x1

    iget v9, p1, Ltj;->a:I

    const/4 v6, 0x1

    move-object v4, p2

    invoke-virtual/range {v4 .. v9}, Lu7;->c(IIIII)V

    invoke-virtual {p2, v0}, Lu7;->a(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->setConstraintSet(Lu7;)V

    invoke-virtual {v0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public final attachBaseContext(Landroid/content/Context;)V
    .locals 3

    invoke-static {p1}, Lmk;->l(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "language"

    const-string v2, "sys"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-static {p1, v0}, LF4;->b0(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Context;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    return-void
.end method

.method public final c(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, LKf;->p:Landroid/view/View;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public abstract d()V
.end method

.method public abstract e()V
.end method

.method public abstract f()V
.end method

.method public abstract g()V
.end method

.method public final getLifecycle()Lwg;
    .locals 1

    iget-object v0, p0, LKf;->a:LK2;

    iget-object v0, v0, LK2;->b:Ljava/lang/Object;

    check-cast v0, LFg;

    return-object v0
.end method

.method public h()V
    .locals 3

    const-string v0, "bigMeters"

    const/4 v1, 0x0

    invoke-static {v0, v1}, LBr;->s(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, LKf;->k:Z

    iget-object v0, p0, LKf;->b:Landroid/content/SharedPreferences;

    const-string v1, "extFirmware"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, LKf;->l:Z

    const-string v0, "speedFromLeft"

    invoke-static {v0, v2}, LBr;->s(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, LKf;->n:Z

    iget-object v0, p0, LKf;->b:Landroid/content/SharedPreferences;

    const-string v1, "naviPackage"

    const-string v2, "ru.yandex.yandexnavi"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LKf;->c:LLf;

    iget-object v1, v1, LLf;->I:Ldr;

    invoke-virtual {v1, v0}, Ldr;->f(Ljava/lang/Object;)V

    return-void
.end method

.method public final i()V
    .locals 2

    sget-object v0, Ltg;->ON_CREATE:Ltg;

    iget-object v1, p0, LKf;->a:LK2;

    invoke-virtual {v1, v0}, LK2;->H(Ltg;)V

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    return-void
.end method

.method public final j()V
    .locals 2

    sget-object v0, Ltg;->ON_STOP:Ltg;

    iget-object v1, p0, LKf;->a:LK2;

    invoke-virtual {v1, v0}, LK2;->H(Ltg;)V

    sget-object v0, Ltg;->ON_DESTROY:Ltg;

    invoke-virtual {v1, v0}, LK2;->H(Ltg;)V

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    return-void
.end method

.method public final k(ILjava/lang/Object;Ljava/lang/String;IILjava/lang/String;)V
    .locals 1

    invoke-virtual {p0, p1}, LKf;->c(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_0

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {v0, p6, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    new-instance p6, Landroid/text/SpannableString;

    invoke-virtual {p2, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-direct {p6, p3}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {p1, p4}, Landroid/widget/TextView;->setTextColor(I)V

    new-instance p3, Landroid/text/style/ForegroundColorSpan;

    invoke-direct {p3, p5}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    const/16 p4, 0x21

    const/4 p5, 0x0

    invoke-virtual {p6, p3, p5, p2, p4}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    invoke-virtual {p1, p6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public l()V
    .locals 4

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "ru.zinovin.tankspeedometer.T500_IP_STOP"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "ru.zinovin.tankspeedometer.T500_INDICATOR_COLOR_CHANGED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "ru.zinovin.tankspeedometer.RESTART_PERMISSION"

    const/4 v2, 0x0

    iget-object v3, p0, LKf;->s:LO1;

    invoke-virtual {p0, v3, v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    return-void
.end method

.method public abstract m()V
.end method

.method public final n(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, LKf;->b:Landroid/content/SharedPreferences;

    const-string v1, "carModel"

    const-string v2, "tank_500"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "tank_300"

    const-string v2, "wey_07"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "wey_80"

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "layout"

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v0, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "layoutId="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "T500.ACTIVITY"

    invoke-static {v2, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "curLayoutId="

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, p0, LKf;->f:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "curLayoutId=layoutId "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, p0, LKf;->f:I

    if-ne v3, v0, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v0, :cond_2

    iget p1, p0, LKf;->f:I

    if-eq v0, p1, :cond_1

    const-string p1, "layout_inflater"

    invoke-virtual {p0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/LayoutInflater;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, LKf;->o(Landroid/view/View;)V

    iput v0, p0, LKf;->f:I

    goto :goto_1

    :cond_1
    const-string p1, "\u041d\u0435 \u043c\u0435\u043d\u044f\u0435\u043c layout"

    invoke-static {v2, p1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void

    :cond_2
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "\u041c\u0430\u043a\u0435\u0442 "

    const-string v2, " \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d"

    invoke-static {v1, p1, v2}, LVo;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final o(Landroid/view/View;)V
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutDirection(I)V

    iget-object v0, p0, LKf;->p:Landroid/view/View;

    if-eqz v0, :cond_0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, LKf;->o:Landroid/view/WindowManager;

    iget-object v1, p0, LKf;->p:Landroid/view/View;

    invoke-interface {v0, v1}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    :cond_0
    iget-object v0, p0, LKf;->o:Landroid/view/WindowManager;

    iget-object v1, p0, LKf;->q:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v0, p1, v1}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iput-object p1, p0, LKf;->p:Landroid/view/View;

    iget-object v0, p0, LKf;->r:LK2;

    iget-object v1, v0, LK2;->c:Ljava/lang/Object;

    check-cast v1, Lr0;

    iget-object v2, v0, LK2;->b:Ljava/lang/Object;

    check-cast v2, Landroid/os/Handler;

    if-eqz v1, :cond_1

    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_1
    iput-object p1, v0, LK2;->d:Ljava/lang/Object;

    new-instance p1, Lr0;

    const/16 v1, 0xa

    invoke-direct {p1, v0, v1}, Lr0;-><init>(Ljava/lang/Object;I)V

    iput-object p1, v0, LK2;->c:Ljava/lang/Object;

    const-wide/32 v0, 0x493e0

    invoke-virtual {v2, p1, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 1

    const-string v0, "intent"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object p1, Ltg;->ON_START:Ltg;

    iget-object v0, p0, LKf;->a:LK2;

    invoke-virtual {v0, p1}, LK2;->H(Ltg;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2

    const-string v0, "T500.ACTIVITY"

    const-string v1, "onConfigurationChanged() call"

    invoke-static {v0, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/app/Service;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    return-void
.end method

.method public final onCreate()V
    .locals 9

    new-instance v0, Landroid/os/StrictMode$ThreadPolicy$Builder;

    invoke-direct {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>()V

    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->permitAll()Landroid/os/StrictMode$ThreadPolicy$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v0

    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    const-string v0, "T500.ACTIVITY"

    const-string v1, "InstrumentalActivity.onCreate()"

    invoke-static {v0, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, LKf;->i()V

    invoke-static {p0}, Lmk;->l(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    iput-object v1, p0, LKf;->b:Landroid/content/SharedPreferences;

    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v1

    const-string v2, "fonts/frutiger.otf"

    invoke-static {v1, v2}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    iget-object v1, p0, LKf;->b:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "usePreferences"

    const/4 v3, 0x1

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    const-string v1, "window"

    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/WindowManager;

    iput-object v2, p0, LKf;->o:Landroid/view/WindowManager;

    const-string v2, "display"

    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/hardware/display/DisplayManager;

    invoke-virtual {v2}, Landroid/hardware/display/DisplayManager;->getDisplays()[Landroid/view/Display;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x2

    if-le v3, v4, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    aget-object v2, v2, v4

    invoke-virtual {v3, v2}, Landroid/content/Context;->createDisplayContext(Landroid/view/Display;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/WindowManager;

    iput-object v1, p0, LKf;->o:Landroid/view/WindowManager;

    :cond_0
    new-instance v1, Landroid/util/DisplayMetrics;

    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    iget-object v2, p0, LKf;->o:Landroid/view/WindowManager;

    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "density="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, v1, Landroid/util/DisplayMetrics;->density:F

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "densityDpi="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, v1, Landroid/util/DisplayMetrics;->densityDpi:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    iget v3, v1, Landroid/util/DisplayMetrics;->densityDpi:I

    iput v3, v2, Landroid/content/res/Configuration;->densityDpi:I

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "fontScale="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v4, v2, Landroid/content/res/Configuration;->fontScale:F

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, v2, Landroid/content/res/Configuration;->fontScale:F

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v2, v1}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    invoke-virtual {v1, v1}, Landroid/util/DisplayMetrics;->setTo(Landroid/util/DisplayMetrics;)V

    invoke-virtual {v2, v2}, Landroid/content/res/Configuration;->setTo(Landroid/content/res/Configuration;)V

    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    const/16 v5, 0x2d0

    const/16 v6, 0x7f6

    const/16 v4, 0x780

    const/16 v7, 0x318

    const/4 v8, -0x3

    move-object v3, v0

    invoke-direct/range {v3 .. v8}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    instance-of v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;

    if-eqz v1, :cond_bc_touch

    iget v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    and-int/lit8 v1, v1, -0x11

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->flags:I

    :cond_bc_touch
    iput-object v0, p0, LKf;->q:Landroid/view/WindowManager$LayoutParams;

    iget-object v0, p0, LKf;->t:Lje;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lhe;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, Lhe;-><init>(Lje;I)V

    iget-object v0, v0, Lje;->f:Landroid/os/Handler;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance v2, Lt5;

    const/16 v3, 0x8

    invoke-direct {v2, v1, v3}, Lt5;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_0
    invoke-virtual {p0}, LKf;->f()V

    invoke-virtual {p0}, LKf;->h()V

    invoke-virtual {p0}, LKf;->m()V

    invoke-virtual {p0}, LKf;->g()V

    invoke-virtual {p0}, LKf;->e()V

    const-string v0, "startService() called"

    const-string v1, "T500.UTILS"

    invoke-static {v1, v0}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v0

    new-instance v2, Landroid/content/Intent;

    const-class v3, Lru/zinovin/tankspeedometer/service/InternetMonitorService;

    invoke-direct {v2, v0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v3, "ACTION_START_OR_RESUME_SERVICE"

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v0, v2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    const-string v0, "startTboxService() called"

    invoke-static {v1, v0}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    const-class v2, Lru/zinovin/tankspeedometer/service/TboxMonitorService;

    invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v1, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {v0, v1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    invoke-virtual {p0}, LKf;->l()V

    return-void
.end method

.method public onDestroy()V
    .locals 4

    const-string v0, "T500.ACTIVITY"

    const-string v1, "onDestroy() call"

    invoke-static {v0, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LKf;->t:Lje;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lhe;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Lhe;-><init>(Lje;I)V

    iget-object v0, v0, Lje;->f:Landroid/os/Handler;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Lt5;

    const/16 v3, 0x8

    invoke-direct {v2, v1, v3}, Lt5;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_0
    invoke-virtual {p0}, LKf;->q()V

    iget-object v0, p0, LKf;->r:LK2;

    iget-object v0, v0, LK2;->b:Ljava/lang/Object;

    check-cast v0, Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    iget-object v0, p0, LKf;->p:Landroid/view/View;

    if-eqz v0, :cond_1

    iget-object v1, p0, LKf;->o:Landroid/view/WindowManager;

    invoke-interface {v1, v0}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    :cond_1
    invoke-virtual {p0}, LKf;->j()V

    return-void
.end method

.method public final onStart(Landroid/content/Intent;I)V
    .locals 2

    sget-object v0, Ltg;->ON_START:Ltg;

    iget-object v1, p0, LKf;->a:LK2;

    invoke-virtual {v1, v0}, LK2;->H(Ltg;)V

    invoke-super {p0, p1, p2}, Landroid/app/Service;->onStart(Landroid/content/Intent;I)V

    return-void
.end method

.method public q()V
    .locals 1

    iget-object v0, p0, LKf;->s:LO1;

    invoke-virtual {p0, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void
.end method
