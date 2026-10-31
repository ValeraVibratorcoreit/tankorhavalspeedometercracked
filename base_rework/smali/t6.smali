.class public final Lt6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:Ld4;

.field public final synthetic b:Lu6;


# direct methods
.method public constructor <init>(Lu6;Ld4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt6;->b:Lu6;

    iput-object p2, p0, Lt6;->a:Ld4;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 5

    iget-object p1, p0, Lt6;->b:Lu6;

    iget-object p1, p1, Lu6;->a:Lw6;

    invoke-virtual {p1}, Lw6;->getSelectedColor()I

    move-result p2

    invoke-virtual {p1}, Lw6;->getAllColors()[Ljava/lang/Integer;

    iget-object p1, p0, Lt6;->a:Ld4;

    iget-object p1, p1, Ld4;->b:Ljava/lang/Object;

    check-cast p1, LKn;

    invoke-virtual {p1, p2}, LKn;->setColor(I)V

    iget-object p1, p1, LKn;->i:LJn;

    if-eqz p1, :cond_0

    check-cast p1, Lpf;

    iget-object v0, p1, Lpf;->b:Lc4;

    check-cast v0, Lqf;

    invoke-virtual {v0}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    iget-object v2, v0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    iget-object v2, v2, Lru/zinovin/tankspeedometer/MainActivity;->z:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "prefs_"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    iget-object p1, p1, Lpf;->c:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-interface {v1, p1, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-virtual {v0}, Lqf;->d0()V

    :cond_0
    return-void
.end method
