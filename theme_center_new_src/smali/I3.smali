.class public final synthetic LI3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic a:LL3;

.field public final synthetic b:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(LL3;Ljava/util/ArrayList;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI3;->a:LL3;

    iput-object p2, p0, LI3;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 1

    iget-object p1, p0, LI3;->a:LL3;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p2, p0, LI3;->b:Ljava/util/List;

    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LF3;

    invoke-static {p2}, LL3;->P(LF3;)Ljava/lang/String;

    move-result-object p2

    iget-object p3, p1, LL3;->T:Lk0;

    if-eqz p3, :cond_2

    iget-object p3, p3, Lk0;->b:Ljava/lang/Object;

    check-cast p3, LE3;

    iget-boolean p4, p3, LE3;->e0:Z

    const-string p5, "_img"

    if-eqz p4, :cond_0

    new-instance p4, Ljava/lang/StringBuilder;

    const-string v0, "bg_sun_"

    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    :goto_0
    iget-object v0, p3, LE3;->d0:Ljava/lang/String;

    invoke-static {p4, v0, p5}, LVo;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    goto :goto_1

    :cond_0
    new-instance p4, Ljava/lang/StringBuilder;

    const-string v0, "bg_time_"

    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :goto_1
    invoke-virtual {p3}, Lc4;->T()Landroid/content/SharedPreferences;

    move-result-object p5

    invoke-interface {p5}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p5

    invoke-interface {p5, p4, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p2

    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->apply()V

    iget-boolean p2, p3, LE3;->e0:Z

    if-eqz p2, :cond_1

    iget-object p4, p3, LE3;->c0:Landroid/widget/LinearLayout;

    goto :goto_2

    :cond_1
    iget-object p4, p3, LE3;->b0:Landroid/widget/LinearLayout;

    :goto_2
    invoke-virtual {p3, p4, p2}, LE3;->l0(Landroid/view/View;Z)V

    invoke-virtual {p3}, LE3;->k0()V

    :cond_2
    invoke-virtual {p1}, LL3;->O()V

    return-void
.end method
