.class public final synthetic LC3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    iput p2, p0, LC3;->a:I

    iput-object p1, p0, LC3;->b:Ljava/lang/Object;

    iput-object p3, p0, LC3;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    const/4 p1, 0x0

    const/4 v0, 0x1

    iget-object v1, p0, LC3;->c:Ljava/lang/Object;

    iget-object v2, p0, LC3;->b:Ljava/lang/Object;

    iget v3, p0, LC3;->a:I

    packed-switch v3, :pswitch_data_0

    check-cast v2, Lgo;

    iget-object v0, v2, Lgo;->d:Ld4;

    if-eqz v0, :cond_1

    check-cast v1, Lfo;

    iget-object v2, v1, Llm;->r:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v2, :cond_0

    const/4 v1, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/RecyclerView;->F(Llm;)I

    move-result v1

    :goto_0
    sget v2, Lru/zinovin/tankspeedometer/MainActivity;->M:I

    iget-object v0, v0, Ld4;->b:Ljava/lang/Object;

    check-cast v0, Lru/zinovin/tankspeedometer/MainActivity;

    invoke-virtual {v0, v1, p1}, Lru/zinovin/tankspeedometer/MainActivity;->L(II)V

    :cond_1
    return-void

    :pswitch_0
    check-cast v2, Lbo;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v1, LYn;

    iget-object p1, v1, LYn;->a:Ljava/lang/String;

    iput-object p1, v2, Lbo;->f:Ljava/lang/String;

    invoke-virtual {v2}, Lbo;->a()V

    iget-object p1, v2, Lbo;->g:Lao;

    if-eqz p1, :cond_2

    check-cast p1, Lzk;

    iget-object v0, p1, Lzk;->a:LAk;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Lzk;->b:Landroid/content/SharedPreferences;

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v2, "selectedTheme"

    iget-object v1, v1, LYn;->a:Ljava/lang/String;

    invoke-interface {p1, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    iget-object p1, v0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    iput-object v1, p1, Lru/zinovin/tankspeedometer/MainActivity;->z:Ljava/lang/String;

    :cond_2
    return-void

    :pswitch_1
    check-cast v2, LUn;

    check-cast v1, Ljava/lang/String;

    iput-object v1, v2, LUn;->f:Ljava/lang/String;

    invoke-virtual {v2}, LUn;->a()V

    iget-object p1, v2, LUn;->g:LTn;

    if-eqz p1, :cond_3

    invoke-interface {p1, v1}, LTn;->a(Ljava/lang/String;)V

    :cond_3
    return-void

    :pswitch_2
    check-cast v2, LAk;

    iget-boolean p1, v2, LAk;->Y:Z

    xor-int/2addr p1, v0

    iput-boolean p1, v2, LAk;->Y:Z

    check-cast v1, Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    const-string v0, "favoriteFilterEnabled"

    iget-boolean v1, v2, LAk;->Y:Z

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-virtual {v2}, LAk;->d0()V

    iget-object p1, v2, LAk;->U:Lbo;

    iget-boolean v0, v2, LAk;->Y:Z

    invoke-virtual {p1, v0}, Lbo;->setFavoriteFilterEnabled(Z)V

    iget-object p1, v2, LAk;->U:Lbo;

    iget-object v0, v2, LAk;->X:Ljava/util/Set;

    invoke-virtual {p1, v0}, Lbo;->setFavorites(Ljava/util/Set;)V

    iget-object p1, v2, LAk;->U:Lbo;

    invoke-virtual {v2}, Lzc;->I()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LBr;->h(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p1, v0}, Lbo;->setItems(Ljava/util/List;)V

    invoke-virtual {v2}, LAk;->c0()V

    return-void

    :pswitch_3
    check-cast v2, LH3;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v1, LF3;

    iget-object p1, v1, LF3;->a:Landroid/net/Uri;

    if-eqz p1, :cond_4

    new-instance p1, Ljava/io/File;

    iget-object v3, v1, LF3;->a:Landroid/net/Uri;

    invoke-virtual {v3}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_4
    iget p1, v1, LF3;->d:I

    sparse-switch p1, :sswitch_data_0

    const-string p1, "BUILD_IN_NONE"

    goto :goto_1

    :sswitch_0
    const-string p1, "BUILD_IN_TRX"

    goto :goto_1

    :sswitch_1
    const-string p1, "BUILD_IN_TRANSPARENT"

    goto :goto_1

    :sswitch_2
    const-string p1, "BUILD_IN_NIGHT"

    goto :goto_1

    :sswitch_3
    const-string p1, "BUILD_IN_KIA"

    goto :goto_1

    :sswitch_4
    const-string p1, "BUILD_IN_BRABUS"

    :goto_1
    iget-object v3, v2, LH3;->b:LE3;

    invoke-virtual {v3}, Lc4;->T()Landroid/content/SharedPreferences;

    move-result-object v4

    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    const-string v5, "selectedBackground"

    invoke-interface {v4, v5, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-virtual {v3}, LE3;->c0()V

    iget-object p1, v1, LF3;->b:Ljava/lang/String;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const v1, 0x7f13018d

    iget-object v3, v2, LH3;->a:Landroid/content/Context;

    invoke-virtual {v3, v1, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    invoke-virtual {v2}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void

    :pswitch_4
    check-cast v2, LE3;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v1, Landroid/widget/Button;

    invoke-virtual {v1, p1}, Landroid/view/View;->setEnabled(Z)V

    const p1, 0x7f13003b

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(I)V

    new-instance p1, Ljava/lang/Thread;

    new-instance v3, LB1;

    invoke-direct {v3, v2, v0, v1}, LB1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-direct {p1, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0x7f080087 -> :sswitch_4
        0x7f0800e4 -> :sswitch_3
        0x7f08012c -> :sswitch_2
        0x7f080153 -> :sswitch_1
        0x7f080156 -> :sswitch_0
    .end sparse-switch
.end method
