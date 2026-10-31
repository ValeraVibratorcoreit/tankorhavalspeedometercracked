.class public final synthetic Llq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:Lru/zinovin/tankspeedometer/service/TboxMonitorService;


# direct methods
.method public synthetic constructor <init>(Lru/zinovin/tankspeedometer/service/TboxMonitorService;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llq;->a:Lru/zinovin/tankspeedometer/service/TboxMonitorService;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Ljp;

    sget v0, Lru/zinovin/tankspeedometer/service/TboxMonitorService;->d:I

    iget-object v0, p0, Llq;->a:Lru/zinovin/tankspeedometer/service/TboxMonitorService;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p1, Ljp;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "REJECT"

    iget-object p1, p1, Ljp;->b:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    const-string v1, "T500.TBOX"

    if-nez p1, :cond_0

    const-string p1, "TBOX \u043f\u0440\u0430\u0432\u0438\u043b\u043e \u043e\u0442\u0441\u0443\u0442\u0441\u0442\u0432\u0443\u0435\u0442. \u0412\u043a\u043b\u044e\u0447\u0430\u0435\u043c \u0431\u043b\u043e\u043a\u0438\u0440\u043e\u0432\u043a\u0443"

    invoke-static {v1, p1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {p1, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Li0;

    invoke-direct {v1, v0}, Li0;-><init>(Lru/zinovin/tankspeedometer/service/TboxMonitorService;)V

    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    const-string p1, "iptables -I FORWARD -o ccinet+ -j REJECT"

    invoke-static {p1}, LTf;->U(Ljava/lang/String;)Ljp;

    goto :goto_0

    :cond_0
    const-string p1, "TBOX \u043f\u0440\u0430\u0432\u0438\u043b\u043e \u0441\u0443\u0449\u0435\u0441\u0442\u0432\u0443\u0435\u0442"

    invoke-static {v1, p1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method
