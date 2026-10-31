.class public final synthetic LCh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:LEh;

.field public final synthetic b:Landroid/content/SharedPreferences;

.field public final synthetic c:Z

.field public final synthetic d:LWn;


# direct methods
.method public synthetic constructor <init>(LEh;Landroid/content/SharedPreferences;ZLWn;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCh;->a:LEh;

    iput-object p2, p0, LCh;->b:Landroid/content/SharedPreferences;

    iput-boolean p3, p0, LCh;->c:Z

    iput-object p4, p0, LCh;->d:LWn;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 7

    move-object v2, p1

    check-cast v2, Ljp;

    iget-object p1, p0, LCh;->a:LEh;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v6, LDh;

    iget-object v3, p0, LCh;->b:Landroid/content/SharedPreferences;

    iget-boolean v4, p0, LCh;->c:Z

    iget-object v5, p0, LCh;->d:LWn;

    move-object v0, v6

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, LDh;-><init>(LEh;Ljp;Landroid/content/SharedPreferences;ZLWn;)V

    invoke-virtual {p1}, Lzc;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lzc;->f()Lq1;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lzc;->H()Lq1;

    move-result-object p1

    invoke-virtual {p1, v6}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method
