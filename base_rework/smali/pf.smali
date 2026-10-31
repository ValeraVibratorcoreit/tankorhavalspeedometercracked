.class public final synthetic Lpf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVn;
.implements LJn;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lc4;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lc4;Ljava/lang/Object;I)V
    .locals 0

    iput p3, p0, Lpf;->a:I

    iput-object p1, p0, Lpf;->b:Lc4;

    iput-object p2, p0, Lpf;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Z)V
    .locals 4

    iget v0, p0, Lpf;->a:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    iget-object v0, p0, Lpf;->b:Lc4;

    check-cast v0, LDq;

    invoke-virtual {v0}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    iget-object v2, v0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    iget-object v2, v2, Lru/zinovin/tankspeedometer/MainActivity;->z:Ljava/lang/String;

    iget-object v3, p0, Lpf;->c:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    invoke-static {v1, v2, v3, p1}, LTd;->A(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v0}, LDq;->d0()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v0, v3}, Lc4;->X(Ljava/lang/String;)V

    :cond_0
    return-void

    :pswitch_1
    iget-object v0, p0, Lpf;->b:Lc4;

    check-cast v0, LDq;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p1, :cond_1

    const v1, 0x7f130144

    goto :goto_0

    :cond_1
    const v1, 0x7f130143

    :goto_0
    iget-object v2, p0, Lpf;->c:Ljava/lang/Object;

    check-cast v2, LWn;

    invoke-virtual {v2, v1}, LSn;->setSubtitle(I)V

    invoke-virtual {v0}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    iget-object v2, v0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    iget-object v2, v2, Lru/zinovin/tankspeedometer/MainActivity;->z:Ljava/lang/String;

    const-string v3, "useDefaultSwitchCommon"

    invoke-static {v1, v2, v3, p1}, LTd;->A(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    xor-int/lit8 p1, p1, 0x1

    iget-object v1, v0, LDq;->V:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LWn;

    invoke-virtual {v2, p1}, LSn;->setRowEnabled(Z)V

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, LDq;->d0()Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "ALL"

    invoke-virtual {v0, p1}, Lc4;->X(Ljava/lang/String;)V

    :cond_3
    return-void

    :pswitch_2
    iget-object v0, p0, Lpf;->b:Lc4;

    check-cast v0, Lsj;

    invoke-virtual {v0}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    iget-object v2, v0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    iget-object v2, v2, Lru/zinovin/tankspeedometer/MainActivity;->z:Ljava/lang/String;

    iget-object v3, p0, Lpf;->c:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    invoke-static {v1, v2, v3, p1}, LTd;->A(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v0}, Lsj;->d0()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {v0, v3}, Lc4;->X(Ljava/lang/String;)V

    :cond_4
    return-void

    :pswitch_3
    iget-object v0, p0, Lpf;->b:Lc4;

    check-cast v0, Lsj;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p1, :cond_5

    const v1, 0x7f130144

    goto :goto_2

    :cond_5
    const v1, 0x7f130143

    :goto_2
    iget-object v2, p0, Lpf;->c:Ljava/lang/Object;

    check-cast v2, LWn;

    invoke-virtual {v2, v1}, LSn;->setSubtitle(I)V

    invoke-virtual {v0}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    iget-object v2, v0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    iget-object v2, v2, Lru/zinovin/tankspeedometer/MainActivity;->z:Ljava/lang/String;

    const-string v3, "useDefaultSwitchNavi"

    invoke-static {v1, v2, v3, p1}, LTd;->A(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    xor-int/lit8 p1, p1, 0x1

    iget-object v1, v0, Lsj;->V:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LWn;

    invoke-virtual {v2, p1}, LSn;->setRowEnabled(Z)V

    goto :goto_3

    :cond_6
    invoke-virtual {v0}, Lsj;->d0()Z

    move-result p1

    if-eqz p1, :cond_7

    const-string p1, "ALL"

    invoke-virtual {v0, p1}, Lc4;->X(Ljava/lang/String;)V

    :cond_7
    return-void

    :pswitch_4
    iget-object v0, p0, Lpf;->b:Lc4;

    check-cast v0, Lqf;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz p1, :cond_8

    const v1, 0x7f130141

    goto :goto_4

    :cond_8
    const v1, 0x7f130140

    :goto_4
    iget-object v2, p0, Lpf;->c:Ljava/lang/Object;

    check-cast v2, LWn;

    invoke-virtual {v2, v1}, LSn;->setSubtitle(I)V

    invoke-virtual {v0}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    iget-object v2, v0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    iget-object v2, v2, Lru/zinovin/tankspeedometer/MainActivity;->z:Ljava/lang/String;

    const-string v3, "useDefaultSwitch"

    invoke-static {v1, v2, v3, p1}, LTd;->A(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V

    xor-int/lit8 p1, p1, 0x1

    iget-object v1, v0, Lqf;->V:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LKn;

    invoke-virtual {v2, p1}, LSn;->setRowEnabled(Z)V

    goto :goto_5

    :cond_9
    invoke-virtual {v0}, Lqf;->d0()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
