.class public final synthetic LA3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmo;
.implements LVn;
.implements LTn;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LE3;


# direct methods
.method public synthetic constructor <init>(LE3;I)V
    .locals 0

    iput p2, p0, LA3;->a:I

    iput-object p1, p0, LA3;->b:LE3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, LA3;->b:LE3;

    invoke-virtual {v0}, Lc4;->T()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "bgMode"

    invoke-interface {v1, v2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-virtual {v0}, LE3;->n0()V

    invoke-virtual {v0}, LE3;->k0()V

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 4

    iget-object v0, p0, LA3;->b:LE3;

    iget-object v1, v0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    iput-object p1, v1, Lru/zinovin/tankspeedometer/MainActivity;->z:Ljava/lang/String;

    iget-object v1, v0, LE3;->X:LWn;

    const-string v2, "Default"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {v0}, Lc4;->T()Landroid/content/SharedPreferences;

    move-result-object p1

    const-string v2, "useDefaultSwitchBack"

    const/4 v3, 0x1

    invoke-interface {p1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v1, v3}, LWn;->setChecked(Z)V

    invoke-virtual {v0}, LE3;->n0()V

    iget-object p1, v0, LE3;->V:LH3;

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public c(Z)V
    .locals 3

    iget v0, p0, LA3;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LA3;->b:LE3;

    invoke-virtual {v0}, Lc4;->T()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "bg_sun_auto_update"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void

    :pswitch_0
    iget-object v0, p0, LA3;->b:LE3;

    invoke-virtual {v0}, Lc4;->T()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "useDefaultSwitchBack"

    invoke-interface {v1, v2, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-virtual {v0}, LE3;->n0()V

    invoke-virtual {v0}, LE3;->c0()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
