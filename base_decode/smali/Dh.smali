.class public final synthetic LDh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:LEh;

.field public final synthetic b:Ljp;

.field public final synthetic c:Landroid/content/SharedPreferences;

.field public final synthetic d:Z

.field public final synthetic e:LWn;


# direct methods
.method public synthetic constructor <init>(LEh;Ljp;Landroid/content/SharedPreferences;ZLWn;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDh;->a:LEh;

    iput-object p2, p0, LDh;->b:Ljp;

    iput-object p3, p0, LDh;->c:Landroid/content/SharedPreferences;

    iput-boolean p4, p0, LDh;->d:Z

    iput-object p5, p0, LDh;->e:LWn;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    iget-object v0, p0, LDh;->a:LEh;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "stdout="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, LDh;->b:Ljp;

    iget-object v3, v2, Ljp;->b:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, "T500.TBOX"

    invoke-static {v3, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "stderr="

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, v2, Ljp;->c:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, LDh;->c:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    iget-boolean v3, p0, LDh;->d:Z

    const/4 v5, 0x1

    iget-boolean v2, v2, Ljp;->a:Z

    if-eqz v2, :cond_0

    move v6, v3

    goto :goto_0

    :cond_0
    if-nez v3, :cond_1

    move v6, v5

    goto :goto_0

    :cond_1
    const/4 v6, 0x0

    :goto_0
    const-string v7, "tboxSwitch"

    invoke-interface {v1, v7, v6}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    iget-object v1, p0, LDh;->e:LWn;

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Lzc;->I()Landroid/content/Context;

    move-result-object v0

    if-eqz v3, :cond_2

    const v2, 0x7f13020e

    goto :goto_1

    :cond_2
    const v2, 0x7f130210

    :goto_1
    invoke-static {v0, v2, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_2

    :cond_3
    xor-int/lit8 v2, v3, 0x1

    invoke-virtual {v1, v2}, LWn;->setChecked(Z)V

    invoke-virtual {v0}, Lzc;->I()Landroid/content/Context;

    move-result-object v2

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v3

    const v4, 0x7f130211

    invoke-virtual {v0, v4, v3}, Lzc;->m(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :goto_2
    invoke-virtual {v1, v5}, LSn;->setRowEnabled(Z)V

    return-void
.end method
