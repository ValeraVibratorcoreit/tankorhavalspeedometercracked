.class public final synthetic Lsf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVn;


# instance fields
.field public final synthetic a:Luf;

.field public final synthetic b:Landroid/content/SharedPreferences;

.field public final synthetic c:LPn;

.field public final synthetic d:LPn;


# direct methods
.method public synthetic constructor <init>(Luf;Landroid/content/SharedPreferences;LPn;LPn;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsf;->a:Luf;

    iput-object p2, p0, Lsf;->b:Landroid/content/SharedPreferences;

    iput-object p3, p0, Lsf;->c:LPn;

    iput-object p4, p0, Lsf;->d:LPn;

    return-void
.end method


# virtual methods
.method public final c(Z)V
    .locals 3

    iget-object v0, p0, Lsf;->a:Luf;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Lsf;->b:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "fuel_custom_tank_enabled"

    invoke-interface {v1, v2, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-virtual {v0, v2}, Lc4;->X(Ljava/lang/String;)V

    iget-object v0, p0, Lsf;->c:LPn;

    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p0, Lsf;->d:LPn;

    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method
