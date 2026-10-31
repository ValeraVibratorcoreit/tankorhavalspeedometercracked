.class public final Lie;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# instance fields
.field public final a:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Lje;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lie;->a:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final binderDied()V
    .locals 5

    const-string v0, "T500.GwmReader"

    const-string v1, "\u0421\u0435\u0440\u0432\u0438\u0441 GWM \u0443\u043c\u0435\u0440, \u043f\u0435\u0440\u0435\u043f\u043e\u0434\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u0435..."

    invoke-static {v0, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lie;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lje;

    if-eqz v0, :cond_1

    iget-boolean v1, v0, Lje;->d:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    iput-boolean v1, v0, Lje;->d:Z

    iget-object v2, v0, Lje;->i:Ld2;

    if-eqz v2, :cond_0

    invoke-static {v1}, Ld2;->P(Z)V

    :cond_0
    iget-object v1, v0, Lje;->f:Landroid/os/Handler;

    new-instance v2, Lhe;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lhe;-><init>(Lje;I)V

    const-wide/16 v3, 0x1388

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    return-void
.end method
