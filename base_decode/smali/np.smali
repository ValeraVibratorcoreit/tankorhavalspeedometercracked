.class public final Lnp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM9;
.implements LRj;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lnp;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, LFo;

    invoke-direct {v0}, LFo;-><init>()V

    iput-object v0, p0, Lnp;->b:Ljava/lang/Object;

    .line 5
    new-instance v0, Lqh;

    invoke-direct {v0}, Lqh;-><init>()V

    iput-object v0, p0, Lnp;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lnp;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LUl;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lnp;->a:I

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lnp;->b:Ljava/lang/Object;

    .line 8
    new-instance p1, Lps;

    .line 9
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 10
    iput v0, p1, Lps;->a:I

    .line 11
    iput-object p1, p0, Lnp;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 2
    iput p2, p0, Lnp;->a:I

    iput-object p1, p0, Lnp;->b:Ljava/lang/Object;

    iput-object p3, p0, Lnp;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static g(Ljava/lang/String;)LMf;
    .locals 13

    const-string v12, "Custom Center"

    invoke-virtual {p0, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_not_custom

    invoke-static {}, LF4;->E()Lk0;

    move-result-object v12

    iget-object v12, v12, Lk0;->b:Ljava/lang/Object;

    check-cast v12, LMf;

    const-string p0, "digital_instrumental_panel_custom"

    iput-object p0, v12, LMf;->a:Ljava/lang/String;

    const-string p0, "digital_instrumental_panel_micro"

    iput-object p0, v12, LMf;->A:Ljava/lang/String;

    return-object v12

    :cond_not_custom
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v0, 0x7f08012b

    const v1, 0x7f0800b0

    const v2, 0x7f0800b1

    const v3, 0x7f08012a

    const v4, 0x7f080083

    const v5, 0x7f080084

    const-string v6, "t300_needle.png"

    const/4 v7, 0x1

    const-string v8, "speedometer_t300"

    const-string v9, "speedometer_t300_big"

    const-string v10, "speedometer_default_big"

    const/4 v11, -0x1

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v12

    sparse-switch v12, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v12, "Moon Eclipse"

    invoke-virtual {p0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v11, 0x15

    goto/16 :goto_0

    :sswitch_1
    const-string v12, "Tank 300 El_big"

    invoke-virtual {p0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    goto/16 :goto_0

    :cond_1
    const/16 v11, 0x14

    goto/16 :goto_0

    :sswitch_2
    const-string v12, "Night center"

    invoke-virtual {p0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    goto/16 :goto_0

    :cond_2
    const/16 v11, 0x13

    goto/16 :goto_0

    :sswitch_3
    const-string v12, "BMW_big"

    invoke-virtual {p0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    goto/16 :goto_0

    :cond_3
    const/16 v11, 0x12

    goto/16 :goto_0

    :sswitch_4
    const-string v12, "Audi Virtual Cockpit_big"

    invoke-virtual {p0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    goto/16 :goto_0

    :cond_4
    const/16 v11, 0x11

    goto/16 :goto_0

    :sswitch_5
    const-string v12, "Audi Virtual Cockpit"

    invoke-virtual {p0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto/16 :goto_0

    :cond_5
    const/16 v11, 0x10

    goto/16 :goto_0

    :sswitch_6
    const-string v12, "Tank 500_big"

    invoke-virtual {p0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_6

    goto/16 :goto_0

    :cond_6
    const/16 v11, 0xf

    goto/16 :goto_0

    :sswitch_7
    const-string v12, "Mustang GT_big"

    invoke-virtual {p0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_7

    goto/16 :goto_0

    :cond_7
    const/16 v11, 0xe

    goto/16 :goto_0

    :sswitch_8
    const-string v12, "KIA"

    invoke-virtual {p0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_8

    goto/16 :goto_0

    :cond_8
    const/16 v11, 0xd

    goto/16 :goto_0

    :sswitch_9
    const-string v12, "BMW"

    invoke-virtual {p0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_9

    goto/16 :goto_0

    :cond_9
    const/16 v11, 0xc

    goto/16 :goto_0

    :sswitch_a
    const-string v12, "KIA_big"

    invoke-virtual {p0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_a

    goto/16 :goto_0

    :cond_a
    const/16 v11, 0xb

    goto/16 :goto_0

    :sswitch_b
    const-string v12, "KIA mini"

    invoke-virtual {p0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_b

    goto/16 :goto_0

    :cond_b
    const/16 v11, 0xa

    goto/16 :goto_0

    :sswitch_c
    const-string v12, "KIA mini_big"

    invoke-virtual {p0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_c

    goto/16 :goto_0

    :cond_c
    const/16 v11, 0x9

    goto/16 :goto_0

    :sswitch_d
    const-string v12, "Tank 500"

    invoke-virtual {p0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_d

    goto/16 :goto_0

    :cond_d
    const/16 v11, 0x8

    goto/16 :goto_0

    :sswitch_e
    const-string v12, "Tank 300"

    invoke-virtual {p0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_e

    goto :goto_0

    :cond_e
    const/4 v11, 0x7

    goto :goto_0

    :sswitch_f
    const-string v12, "Moon Eclipse_big"

    invoke-virtual {p0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_f

    goto :goto_0

    :cond_f
    const/4 v11, 0x6

    goto :goto_0

    :sswitch_10
    const-string v12, "Digital"

    invoke-virtual {p0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_10

    goto :goto_0

    :cond_10
    const/4 v11, 0x5

    goto :goto_0

    :sswitch_11
    const-string v12, "Tank 300_big"

    invoke-virtual {p0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_11

    goto :goto_0

    :cond_11
    const/4 v11, 0x4

    goto :goto_0

    :sswitch_12
    const-string v12, "Night center_big"

    invoke-virtual {p0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_12

    goto :goto_0

    :cond_12
    const/4 v11, 0x3

    goto :goto_0

    :sswitch_13
    const-string v12, "Digital_big"

    invoke-virtual {p0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_13

    goto :goto_0

    :cond_13
    const/4 v11, 0x2

    goto :goto_0

    :sswitch_14
    const-string v12, "Mustang GT"

    invoke-virtual {p0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_14

    goto :goto_0

    :cond_14
    move v11, v7

    goto :goto_0

    :sswitch_15
    const-string v12, "Tank 300 El"

    invoke-virtual {p0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_15

    goto :goto_0

    :cond_15
    const/4 v11, 0x0

    :goto_0
    packed-switch v11, :pswitch_data_0

    const/4 p0, 0x0

    goto/16 :goto_1

    :pswitch_0
    invoke-static {}, LF4;->E()Lk0;

    move-result-object p0

    iget-object p0, p0, Lk0;->b:Ljava/lang/Object;

    check-cast p0, LMf;

    iput-object v8, p0, LMf;->a:Ljava/lang/String;

    iput-boolean v7, p0, LMf;->b:Z

    iput-object v6, p0, LMf;->n:Ljava/lang/String;

    iput-boolean v7, p0, LMf;->c:Z

    goto/16 :goto_1

    :pswitch_1
    invoke-static {}, LF4;->P()Lk0;

    move-result-object p0

    iget-object p0, p0, Lk0;->b:Ljava/lang/Object;

    check-cast p0, LMf;

    const-string v0, "speedometer_t300_el_big"

    iput-object v0, p0, LMf;->a:Ljava/lang/String;

    goto/16 :goto_1

    :pswitch_2
    invoke-static {}, LF4;->K()Lk0;

    move-result-object p0

    iget-object p0, p0, Lk0;->b:Ljava/lang/Object;

    check-cast p0, LMf;

    goto/16 :goto_1

    :pswitch_3
    invoke-static {}, LF4;->E()Lk0;

    move-result-object p0

    iget-object p0, p0, Lk0;->b:Ljava/lang/Object;

    check-cast p0, LMf;

    iput v5, p0, LMf;->g:I

    iput v4, p0, LMf;->h:I

    iput v3, p0, LMf;->i:I

    iput-object v10, p0, LMf;->a:Ljava/lang/String;

    goto/16 :goto_1

    :pswitch_4
    invoke-static {}, LF4;->B()Lk0;

    move-result-object p0

    iget-object p0, p0, Lk0;->b:Ljava/lang/Object;

    check-cast p0, LMf;

    iput-object v10, p0, LMf;->a:Ljava/lang/String;

    goto/16 :goto_1

    :pswitch_5
    invoke-static {}, LF4;->B()Lk0;

    move-result-object p0

    iget-object p0, p0, Lk0;->b:Ljava/lang/Object;

    check-cast p0, LMf;

    goto/16 :goto_1

    :pswitch_6
    invoke-static {}, LF4;->R()Lk0;

    move-result-object p0

    iget-object p0, p0, Lk0;->b:Ljava/lang/Object;

    check-cast p0, LMf;

    const-string v0, "speedometer_t500_big"

    iput-object v0, p0, LMf;->a:Ljava/lang/String;

    goto/16 :goto_1

    :pswitch_7
    invoke-static {}, LF4;->E()Lk0;

    move-result-object p0

    iget-object p0, p0, Lk0;->b:Ljava/lang/Object;

    check-cast p0, LMf;

    iput v2, p0, LMf;->g:I

    iput v1, p0, LMf;->h:I

    iput v0, p0, LMf;->i:I

    iput-object v10, p0, LMf;->a:Ljava/lang/String;

    goto/16 :goto_1

    :pswitch_8
    invoke-static {}, LF4;->I()Lk0;

    move-result-object p0

    iget-object p0, p0, Lk0;->b:Ljava/lang/Object;

    check-cast p0, LMf;

    goto/16 :goto_1

    :pswitch_9
    invoke-static {}, LF4;->E()Lk0;

    move-result-object p0

    iget-object p0, p0, Lk0;->b:Ljava/lang/Object;

    check-cast p0, LMf;

    iput v5, p0, LMf;->g:I

    iput v4, p0, LMf;->h:I

    iput v3, p0, LMf;->i:I

    goto/16 :goto_1

    :pswitch_a
    invoke-static {}, LF4;->I()Lk0;

    move-result-object p0

    iget-object p0, p0, Lk0;->b:Ljava/lang/Object;

    check-cast p0, LMf;

    goto/16 :goto_1

    :pswitch_b
    invoke-static {}, LF4;->H()Lk0;

    move-result-object p0

    iget-object p0, p0, Lk0;->b:Ljava/lang/Object;

    check-cast p0, LMf;

    goto :goto_1

    :pswitch_c
    invoke-static {}, LF4;->H()Lk0;

    move-result-object p0

    iget-object p0, p0, Lk0;->b:Ljava/lang/Object;

    check-cast p0, LMf;

    iput-object v10, p0, LMf;->a:Ljava/lang/String;

    goto :goto_1

    :pswitch_d
    invoke-static {}, LF4;->R()Lk0;

    move-result-object p0

    iget-object p0, p0, Lk0;->b:Ljava/lang/Object;

    check-cast p0, LMf;

    goto :goto_1

    :pswitch_e
    invoke-static {}, LF4;->Q()Lk0;

    move-result-object p0

    iget-object p0, p0, Lk0;->b:Ljava/lang/Object;

    check-cast p0, LMf;

    goto :goto_1

    :pswitch_f
    invoke-static {}, LF4;->E()Lk0;

    move-result-object p0

    iget-object p0, p0, Lk0;->b:Ljava/lang/Object;

    check-cast p0, LMf;

    iput-object v8, p0, LMf;->a:Ljava/lang/String;

    iput-boolean v7, p0, LMf;->b:Z

    iput-object v6, p0, LMf;->n:Ljava/lang/String;

    iput-boolean v7, p0, LMf;->c:Z

    iput-object v9, p0, LMf;->a:Ljava/lang/String;

    goto :goto_1

    :pswitch_10
    invoke-static {}, LF4;->Q()Lk0;

    move-result-object p0

    iget-object p0, p0, Lk0;->b:Ljava/lang/Object;

    check-cast p0, LMf;

    iput-object v9, p0, LMf;->a:Ljava/lang/String;

    goto :goto_1

    :pswitch_11
    invoke-static {}, LF4;->K()Lk0;

    move-result-object p0

    iget-object p0, p0, Lk0;->b:Ljava/lang/Object;

    check-cast p0, LMf;

    goto :goto_1

    :pswitch_12
    invoke-static {}, LF4;->E()Lk0;

    move-result-object p0

    iget-object p0, p0, Lk0;->b:Ljava/lang/Object;

    check-cast p0, LMf;

    const-string v0, "digital_instrumental_panel"

    iput-object v0, p0, LMf;->a:Ljava/lang/String;

    const-string v0, "digital_instrumental_panel_micro"

    iput-object v0, p0, LMf;->A:Ljava/lang/String;

    goto :goto_1

    :pswitch_13
    invoke-static {}, LF4;->E()Lk0;

    move-result-object p0

    iget-object p0, p0, Lk0;->b:Ljava/lang/Object;

    check-cast p0, LMf;

    iput v2, p0, LMf;->g:I

    iput v1, p0, LMf;->h:I

    iput v0, p0, LMf;->i:I

    goto :goto_1

    :pswitch_14
    invoke-static {}, LF4;->P()Lk0;

    move-result-object p0

    iget-object p0, p0, Lk0;->b:Ljava/lang/Object;

    check-cast p0, LMf;

    :goto_1
    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e12bd96 -> :sswitch_15
        -0x7464bba4 -> :sswitch_14
        -0x5a4589c7 -> :sswitch_13
        -0x46bc80c2 -> :sswitch_12
        -0x4427e4e2 -> :sswitch_11
        -0x39ce7a08 -> :sswitch_10
        -0x1e58f797 -> :sswitch_f
        -0x1d389aa3 -> :sswitch_e
        -0x1d389321 -> :sswitch_d
        -0xb922e0b -> :sswitch_c
        -0xa7fe04c -> :sswitch_b
        -0x3a3a9c -> :sswitch_a
        0x1016c -> :sswitch_9
        0x122a3 -> :sswitch_8
        0x996629d -> :sswitch_7
        0x25a491a0 -> :sswitch_6
        0x270e4cab -> :sswitch_5
        0x289eab6c -> :sswitch_4
        0x2bb717ad -> :sswitch_3
        0x4cc9d97d -> :sswitch_2
        0x6b7ea9ab -> :sswitch_1
        0x6e1eb028 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_12
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(Llm;LEj;)V
    .locals 2

    iget-object v0, p0, Lnp;->b:Ljava/lang/Object;

    check-cast v0, LFo;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, LFo;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LNs;

    if-nez v1, :cond_0

    invoke-static {}, LNs;->a()LNs;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, LFo;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iput-object p2, v1, LNs;->c:LEj;

    iget p1, v1, LNs;->a:I

    or-int/lit8 p1, p1, 0x8

    iput p1, v1, LNs;->a:I

    return-void
.end method

.method public b(Ljava/lang/String;Z)V
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/16 v2, 0xb

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p2, :cond_0

    const-string p1, "_big"

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lnp;->g(Ljava/lang/String;)LMf;

    move-result-object v3

    if-nez v3, :cond_2

    if-eqz p2, :cond_1

    invoke-static {}, LF4;->B()Lk0;

    move-result-object p2

    const-string v3, "speedometer_default_big"

    iget-object p2, p2, Lk0;->b:Ljava/lang/Object;

    check-cast p2, LMf;

    iput-object v3, p2, LMf;->a:Ljava/lang/String;

    :goto_1
    move-object v3, p2

    goto :goto_2

    :cond_1
    invoke-static {}, LF4;->B()Lk0;

    move-result-object p2

    iget-object p2, p2, Lk0;->b:Ljava/lang/Object;

    check-cast p2, LMf;

    goto :goto_1

    :cond_2
    :goto_2
    iget-object p2, p0, Lnp;->b:Ljava/lang/Object;

    check-cast p2, Lru/zinovin/tankspeedometer/SpedometerPanel;

    const/4 v4, -0x1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_0

    goto/16 :goto_3

    :sswitch_0
    const-string v5, "Moon Eclipse"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto/16 :goto_3

    :cond_3
    const/16 v4, 0x15

    goto/16 :goto_3

    :sswitch_1
    const-string v5, "Tank 300 El_big"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto/16 :goto_3

    :cond_4
    const/16 v4, 0x14

    goto/16 :goto_3

    :sswitch_2
    const-string v5, "Night center"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto/16 :goto_3

    :cond_5
    const/16 v4, 0x13

    goto/16 :goto_3

    :sswitch_3
    const-string v5, "BMW_big"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto/16 :goto_3

    :cond_6
    const/16 v4, 0x12

    goto/16 :goto_3

    :sswitch_4
    const-string v5, "Audi Virtual Cockpit_big"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto/16 :goto_3

    :cond_7
    const/16 v4, 0x11

    goto/16 :goto_3

    :sswitch_5
    const-string v5, "Audi Virtual Cockpit"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto/16 :goto_3

    :cond_8
    const/16 v4, 0x10

    goto/16 :goto_3

    :sswitch_6
    const-string v5, "Tank 500_big"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    goto/16 :goto_3

    :cond_9
    const/16 v4, 0xf

    goto/16 :goto_3

    :sswitch_7
    const-string v5, "Mustang GT_big"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    goto/16 :goto_3

    :cond_a
    const/16 v4, 0xe

    goto/16 :goto_3

    :sswitch_8
    const-string v5, "KIA"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_b

    goto/16 :goto_3

    :cond_b
    const/16 v4, 0xd

    goto/16 :goto_3

    :sswitch_9
    const-string v5, "BMW"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    goto/16 :goto_3

    :cond_c
    const/16 v4, 0xc

    goto/16 :goto_3

    :sswitch_a
    const-string v5, "KIA_big"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    goto/16 :goto_3

    :cond_d
    move v4, v2

    goto/16 :goto_3

    :sswitch_b
    const-string v5, "KIA mini"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    goto/16 :goto_3

    :cond_e
    const/16 v4, 0xa

    goto/16 :goto_3

    :sswitch_c
    const-string v5, "KIA mini_big"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_f

    goto/16 :goto_3

    :cond_f
    const/16 v4, 0x9

    goto/16 :goto_3

    :sswitch_d
    const-string v5, "Tank 500"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_10

    goto/16 :goto_3

    :cond_10
    const/16 v4, 0x8

    goto/16 :goto_3

    :sswitch_e
    const-string v5, "Tank 300"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    goto :goto_3

    :cond_11
    const/4 v4, 0x7

    goto :goto_3

    :sswitch_f
    const-string v5, "Moon Eclipse_big"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_12

    goto :goto_3

    :cond_12
    const/4 v4, 0x6

    goto :goto_3

    :sswitch_10
    const-string v5, "Digital"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_13

    goto :goto_3

    :cond_13
    const/4 v4, 0x5

    goto :goto_3

    :sswitch_11
    const-string v5, "Tank 300_big"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_14

    goto :goto_3

    :cond_14
    const/4 v4, 0x4

    goto :goto_3

    :sswitch_12
    const-string v5, "Night center_big"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_15

    goto :goto_3

    :cond_15
    const/4 v4, 0x3

    goto :goto_3

    :sswitch_13
    const-string v5, "Digital_big"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_16

    goto :goto_3

    :cond_16
    const/4 v4, 0x2

    goto :goto_3

    :sswitch_14
    const-string v5, "Mustang GT"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_17

    goto :goto_3

    :cond_17
    move v4, v0

    goto :goto_3

    :sswitch_15
    const-string v5, "Tank 300 El"

    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_18

    goto :goto_3

    :cond_18
    move v4, v1

    :goto_3
    packed-switch v4, :pswitch_data_0

    new-instance p1, Ld2;

    invoke-direct {p1, v3, v2, p2}, Ld2;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    goto :goto_4

    :pswitch_0
    new-instance p1, Ld2;

    invoke-direct {p1, v3, v2, p2}, Ld2;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    goto :goto_4

    :pswitch_1
    new-instance p1, Ld2;

    invoke-direct {p1, v3, v2, p2}, Ld2;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    goto :goto_4

    :pswitch_2
    new-instance p1, Lig;

    invoke-direct {p1, v3, p2, v1}, Lig;-><init>(LMf;Lru/zinovin/tankspeedometer/SpedometerPanel;I)V

    goto :goto_4

    :pswitch_3
    new-instance p1, Ld2;

    invoke-direct {p1, v3, v2, p2}, Ld2;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    goto :goto_4

    :pswitch_4
    new-instance p1, Ld2;

    invoke-direct {p1, v3, v2, p2}, Ld2;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    goto :goto_4

    :pswitch_5
    new-instance p1, Ld2;

    invoke-direct {p1, v3, v2, p2}, Ld2;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    goto :goto_4

    :pswitch_6
    new-instance p1, Ld2;

    invoke-direct {p1, v3, v2, p2}, Ld2;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    goto :goto_4

    :pswitch_7
    new-instance p1, Lig;

    invoke-direct {p1, v3, p2, v0}, Lig;-><init>(LMf;Lru/zinovin/tankspeedometer/SpedometerPanel;I)V

    goto :goto_4

    :pswitch_8
    new-instance p1, Ld2;

    invoke-direct {p1, v3, v2, p2}, Ld2;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    goto :goto_4

    :pswitch_9
    new-instance p1, Ld2;

    invoke-direct {p1, v3, v2, p2}, Ld2;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    goto :goto_4

    :pswitch_a
    new-instance p1, Ld2;

    invoke-direct {p1, v3, v2, p2}, Ld2;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    :goto_4
    iput-object p1, p0, Lnp;->c:Ljava/lang/Object;

    iget-object p1, p1, Ld2;->b:Ljava/lang/Object;

    check-cast p1, LMf;

    iget v0, p1, LMf;->B:I

    iput v0, p2, LKf;->e:I

    iget p1, p1, LMf;->C:I

    iput p1, p2, LKf;->d:I

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7e12bd96 -> :sswitch_15
        -0x7464bba4 -> :sswitch_14
        -0x5a4589c7 -> :sswitch_13
        -0x46bc80c2 -> :sswitch_12
        -0x4427e4e2 -> :sswitch_11
        -0x39ce7a08 -> :sswitch_10
        -0x1e58f797 -> :sswitch_f
        -0x1d389aa3 -> :sswitch_e
        -0x1d389321 -> :sswitch_d
        -0xb922e0b -> :sswitch_c
        -0xa7fe04c -> :sswitch_b
        -0x3a3a9c -> :sswitch_a
        0x1016c -> :sswitch_9
        0x122a3 -> :sswitch_8
        0x996629d -> :sswitch_7
        0x25a491a0 -> :sswitch_6
        0x270e4cab -> :sswitch_5
        0x289eab6c -> :sswitch_4
        0x2bb717ad -> :sswitch_3
        0x4cc9d97d -> :sswitch_2
        0x6b7ea9ab -> :sswitch_1
        0x6e1eb028 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_8
        :pswitch_5
        :pswitch_6
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_9
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_7
        :pswitch_a
        :pswitch_5
    .end packed-switch
.end method

.method public c(I)V
    .locals 4

    iget-object v0, p0, Lnp;->b:Ljava/lang/Object;

    check-cast v0, [I

    const/4 v1, -0x1

    if-nez v0, :cond_0

    const/16 v0, 0xa

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    new-array p1, p1, [I

    iput-object p1, p0, Lnp;->b:Ljava/lang/Object;

    invoke-static {p1, v1}, Ljava/util/Arrays;->fill([II)V

    goto :goto_1

    :cond_0
    array-length v2, v0

    if-lt p1, v2, :cond_2

    array-length v2, v0

    :goto_0
    if-gt v2, p1, :cond_1

    mul-int/lit8 v2, v2, 0x2

    goto :goto_0

    :cond_1
    new-array p1, v2, [I

    iput-object p1, p0, Lnp;->b:Ljava/lang/Object;

    array-length v2, v0

    const/4 v3, 0x0

    invoke-static {v0, v3, p1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p1, p0, Lnp;->b:Ljava/lang/Object;

    check-cast p1, [I

    array-length v0, v0

    array-length v2, p1

    invoke-static {p1, v0, v2, v1}, Ljava/util/Arrays;->fill([IIII)V

    :cond_2
    :goto_1
    return-void
.end method

.method public d(IIII)Landroid/view/View;
    .locals 9

    iget-object v0, p0, Lnp;->b:Ljava/lang/Object;

    check-cast v0, LUl;

    invoke-virtual {v0}, LUl;->e()I

    move-result v1

    invoke-virtual {v0}, LUl;->d()I

    move-result v2

    if-le p2, p1, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, -0x1

    :goto_0
    const/4 v4, 0x0

    :goto_1
    if-eq p1, p2, :cond_3

    invoke-virtual {v0, p1}, LUl;->a(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v0, v5}, LUl;->c(Landroid/view/View;)I

    move-result v6

    invoke-virtual {v0, v5}, LUl;->b(Landroid/view/View;)I

    move-result v7

    iget-object v8, p0, Lnp;->c:Ljava/lang/Object;

    check-cast v8, Lps;

    iput v1, v8, Lps;->b:I

    iput v2, v8, Lps;->c:I

    iput v6, v8, Lps;->d:I

    iput v7, v8, Lps;->e:I

    if-eqz p3, :cond_1

    iput p3, v8, Lps;->a:I

    invoke-virtual {v8}, Lps;->a()Z

    move-result v6

    if-eqz v6, :cond_1

    return-object v5

    :cond_1
    if-eqz p4, :cond_2

    iput p4, v8, Lps;->a:I

    invoke-virtual {v8}, Lps;->a()Z

    move-result v6

    if-eqz v6, :cond_2

    move-object v4, v5

    :cond_2
    add-int/2addr p1, v3

    goto :goto_1

    :cond_3
    return-object v4
.end method

.method public e(Lu4;Landroid/graphics/Bitmap;)V
    .locals 1

    iget-object v0, p0, Lnp;->c:Ljava/lang/Object;

    check-cast v0, Lpb;

    iget-object v0, v0, Lpb;->b:Ljava/io/IOException;

    if-eqz v0, :cond_1

    if-eqz p2, :cond_0

    invoke-interface {p1, p2}, Lu4;->k(Landroid/graphics/Bitmap;)V

    :cond_0
    throw v0

    :cond_1
    return-void
.end method

.method public f()V
    .locals 2

    iget-object v0, p0, Lnp;->b:Ljava/lang/Object;

    check-cast v0, LLl;

    monitor-enter v0

    :try_start_0
    iget-object v1, v0, LLl;->a:[B

    array-length v1, v1

    iput v1, v0, LLl;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public h(Landroid/view/View;LVt;)LVt;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget-object v3, v0, Lnp;->c:Ljava/lang/Object;

    check-cast v3, Lpi;

    iget v4, v3, Lpi;->a:I

    iget-object v5, v0, Lnp;->b:Ljava/lang/Object;

    check-cast v5, LB4;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v6, v2, LVt;->a:LTt;

    const/4 v7, 0x7

    invoke-virtual {v6, v7}, LTt;->f(I)LHf;

    move-result-object v7

    const/16 v8, 0x20

    invoke-virtual {v6, v8}, LTt;->f(I)LHf;

    move-result-object v6

    iget v8, v7, LHf;->b:I

    iget-object v9, v5, LB4;->b:Ljava/lang/Object;

    check-cast v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    iput v8, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->w:I

    invoke-static/range {p1 .. p1}, LTf;->K(Landroid/view/View;)Z

    move-result v8

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getPaddingBottom()I

    move-result v10

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getPaddingLeft()I

    move-result v11

    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getPaddingRight()I

    move-result v12

    iget-boolean v13, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->o:Z

    if-eqz v13, :cond_0

    invoke-virtual/range {p2 .. p2}, LVt;->a()I

    move-result v10

    iput v10, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->v:I

    iget v14, v3, Lpi;->c:I

    add-int/2addr v10, v14

    :cond_0
    iget v3, v3, Lpi;->b:I

    iget-boolean v14, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->p:Z

    iget v15, v7, LHf;->a:I

    if-eqz v14, :cond_2

    if-eqz v8, :cond_1

    move v11, v3

    goto :goto_0

    :cond_1
    move v11, v4

    :goto_0
    add-int/2addr v11, v15

    :cond_2
    iget-boolean v14, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->q:Z

    iget v0, v7, LHf;->c:I

    if-eqz v14, :cond_4

    if-eqz v8, :cond_3

    goto :goto_1

    :cond_3
    move v4, v3

    :goto_1
    add-int v12, v4, v0

    :cond_4
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup$MarginLayoutParams;

    iget-boolean v4, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->s:Z

    const/4 v8, 0x1

    if-eqz v4, :cond_5

    iget v4, v3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    if-eq v4, v15, :cond_5

    iput v15, v3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    move v4, v8

    goto :goto_2

    :cond_5
    const/4 v4, 0x0

    :goto_2
    iget-boolean v14, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->t:Z

    if-eqz v14, :cond_6

    iget v14, v3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    if-eq v14, v0, :cond_6

    iput v0, v3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    move v4, v8

    :cond_6
    iget-boolean v0, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->u:Z

    if-eqz v0, :cond_7

    iget v0, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v7, v7, LHf;->b:I

    if-eq v0, v7, :cond_7

    iput v7, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    goto :goto_3

    :cond_7
    move v8, v4

    :goto_3
    if-eqz v8, :cond_8

    invoke-virtual {v1, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_8
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    invoke-virtual {v1, v11, v0, v12, v10}, Landroid/view/View;->setPadding(IIII)V

    iget-boolean v0, v5, LB4;->a:Z

    if-eqz v0, :cond_9

    iget v1, v6, LHf;->d:I

    iput v1, v9, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->m:I

    :cond_9
    if-nez v13, :cond_a

    if-eqz v0, :cond_b

    :cond_a
    invoke-virtual {v9}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->I()V

    :cond_b
    return-object v2
.end method

.method public i(I)I
    .locals 5

    iget-object v0, p0, Lnp;->b:Ljava/lang/Object;

    check-cast v0, [I

    const/4 v1, -0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    array-length v0, v0

    if-lt p1, v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Lnp;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_3

    :cond_2
    move v0, v1

    goto :goto_4

    :cond_3
    const/4 v2, 0x0

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_6

    iget-object v3, p0, Lnp;->c:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lmp;

    iget v4, v3, Lmp;->a:I

    if-ne v4, p1, :cond_5

    move-object v2, v3

    goto :goto_1

    :cond_5
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_6
    :goto_1
    if-eqz v2, :cond_7

    iget-object v0, p0, Lnp;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_7
    iget-object v0, p0, Lnp;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v2, 0x0

    :goto_2
    if-ge v2, v0, :cond_9

    iget-object v3, p0, Lnp;->c:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lmp;

    iget v3, v3, Lmp;->a:I

    if-lt v3, p1, :cond_8

    goto :goto_3

    :cond_8
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_9
    move v2, v1

    :goto_3
    if-eq v2, v1, :cond_2

    iget-object v0, p0, Lnp;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmp;

    iget-object v3, p0, Lnp;->c:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    iget v0, v0, Lmp;->a:I

    :goto_4
    if-ne v0, v1, :cond_a

    iget-object v0, p0, Lnp;->b:Ljava/lang/Object;

    check-cast v0, [I

    array-length v2, v0

    invoke-static {v0, p1, v2, v1}, Ljava/util/Arrays;->fill([IIII)V

    iget-object p1, p0, Lnp;->b:Ljava/lang/Object;

    check-cast p1, [I

    array-length p1, p1

    return p1

    :cond_a
    iget-object v2, p0, Lnp;->b:Ljava/lang/Object;

    check-cast v2, [I

    add-int/lit8 v0, v0, 0x1

    invoke-static {v2, p1, v0, v1}, Ljava/util/Arrays;->fill([IIII)V

    return v0
.end method

.method public j(Landroid/view/View;)Z
    .locals 4

    iget-object v0, p0, Lnp;->b:Ljava/lang/Object;

    check-cast v0, LUl;

    invoke-virtual {v0}, LUl;->e()I

    move-result v1

    invoke-virtual {v0}, LUl;->d()I

    move-result v2

    invoke-virtual {v0, p1}, LUl;->c(Landroid/view/View;)I

    move-result v3

    invoke-virtual {v0, p1}, LUl;->b(Landroid/view/View;)I

    move-result p1

    iget-object v0, p0, Lnp;->c:Ljava/lang/Object;

    check-cast v0, Lps;

    iput v1, v0, Lps;->b:I

    iput v2, v0, Lps;->c:I

    iput v3, v0, Lps;->d:I

    iput p1, v0, Lps;->e:I

    const/16 p1, 0x6003

    iput p1, v0, Lps;->a:I

    invoke-virtual {v0}, Lps;->a()Z

    move-result p1

    return p1
.end method

.method public k(II)V
    .locals 3

    iget-object v0, p0, Lnp;->b:Ljava/lang/Object;

    check-cast v0, [I

    if-eqz v0, :cond_3

    array-length v0, v0

    if-lt p1, v0, :cond_0

    goto :goto_2

    :cond_0
    add-int v0, p1, p2

    invoke-virtual {p0, v0}, Lnp;->c(I)V

    iget-object v1, p0, Lnp;->b:Ljava/lang/Object;

    check-cast v1, [I

    array-length v2, v1

    sub-int/2addr v2, p1

    sub-int/2addr v2, p2

    invoke-static {v1, p1, v1, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v1, p0, Lnp;->b:Ljava/lang/Object;

    check-cast v1, [I

    const/4 v2, -0x1

    invoke-static {v1, p1, v0, v2}, Ljava/util/Arrays;->fill([IIII)V

    iget-object v0, p0, Lnp;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_3

    iget-object v1, p0, Lnp;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lmp;

    iget v2, v1, Lmp;->a:I

    if-ge v2, p1, :cond_2

    goto :goto_1

    :cond_2
    add-int/2addr v2, p2

    iput v2, v1, Lmp;->a:I

    :goto_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_3
    :goto_2
    return-void
.end method

.method public l(II)V
    .locals 5

    iget-object v0, p0, Lnp;->b:Ljava/lang/Object;

    check-cast v0, [I

    if-eqz v0, :cond_4

    array-length v0, v0

    if-lt p1, v0, :cond_0

    goto :goto_2

    :cond_0
    add-int v0, p1, p2

    invoke-virtual {p0, v0}, Lnp;->c(I)V

    iget-object v1, p0, Lnp;->b:Ljava/lang/Object;

    check-cast v1, [I

    array-length v2, v1

    sub-int/2addr v2, p1

    sub-int/2addr v2, p2

    invoke-static {v1, v0, v1, p1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v1, p0, Lnp;->b:Ljava/lang/Object;

    check-cast v1, [I

    array-length v2, v1

    sub-int/2addr v2, p2

    array-length v3, v1

    const/4 v4, -0x1

    invoke-static {v1, v2, v3, v4}, Ljava/util/Arrays;->fill([IIII)V

    iget-object v1, p0, Lnp;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    if-nez v1, :cond_1

    goto :goto_2

    :cond_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_4

    iget-object v2, p0, Lnp;->c:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lmp;

    iget v3, v2, Lmp;->a:I

    if-ge v3, p1, :cond_2

    goto :goto_1

    :cond_2
    if-ge v3, v0, :cond_3

    iget-object v2, p0, Lnp;->c:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    sub-int/2addr v3, p2

    iput v3, v2, Lmp;->a:I

    :goto_1
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_4
    :goto_2
    return-void
.end method

.method public m(Llm;I)LEj;
    .locals 5

    iget-object v0, p0, Lnp;->b:Ljava/lang/Object;

    check-cast v0, LFo;

    invoke-virtual {v0, p1}, LFo;->e(Ljava/lang/Object;)I

    move-result p1

    const/4 v1, 0x0

    if-gez p1, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v0, p1}, LFo;->l(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LNs;

    if-eqz v2, :cond_4

    iget v3, v2, LNs;->a:I

    and-int v4, v3, p2

    if-eqz v4, :cond_4

    not-int v4, p2

    and-int/2addr v3, v4

    iput v3, v2, LNs;->a:I

    const/4 v4, 0x4

    if-ne p2, v4, :cond_1

    iget-object p2, v2, LNs;->b:LEj;

    goto :goto_0

    :cond_1
    const/16 v4, 0x8

    if-ne p2, v4, :cond_3

    iget-object p2, v2, LNs;->c:LEj;

    :goto_0
    and-int/lit8 v3, v3, 0xc

    if-nez v3, :cond_2

    invoke-virtual {v0, p1}, LFo;->j(I)Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, v2, LNs;->a:I

    iput-object v1, v2, LNs;->b:LEj;

    iput-object v1, v2, LNs;->c:LEj;

    sget-object p1, LNs;->d:LOk;

    invoke-virtual {p1, v2}, LOk;->a(Ljava/lang/Object;)Z

    :cond_2
    return-object p2

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Must provide flag PRE or POST"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    return-object v1
.end method

.method public n(Llm;)V
    .locals 2

    iget-object v0, p0, Lnp;->b:Ljava/lang/Object;

    check-cast v0, LFo;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, LFo;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LNs;

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget v0, p1, LNs;->a:I

    and-int/lit8 v0, v0, -0x2

    iput v0, p1, LNs;->a:I

    return-void
.end method

.method public o(Llm;)V
    .locals 6

    iget-object v0, p0, Lnp;->c:Ljava/lang/Object;

    check-cast v0, Lqh;

    invoke-virtual {v0}, Lqh;->f()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    :goto_0
    if-ltz v1, :cond_1

    invoke-virtual {v0, v1}, Lqh;->g(I)Ljava/lang/Object;

    move-result-object v3

    if-ne p1, v3, :cond_0

    iget-object v3, v0, Lqh;->c:[Ljava/lang/Object;

    aget-object v4, v3, v1

    sget-object v5, Lqh;->e:Ljava/lang/Object;

    if-eq v4, v5, :cond_1

    aput-object v5, v3, v1

    iput-boolean v2, v0, Lqh;->a:Z

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_1
    :goto_1
    iget-object v0, p0, Lnp;->b:Ljava/lang/Object;

    check-cast v0, LFo;

    invoke-virtual {v0, p1}, LFo;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LNs;

    if-eqz p1, :cond_2

    const/4 v0, 0x0

    iput v0, p1, LNs;->a:I

    const/4 v0, 0x0

    iput-object v0, p1, LNs;->b:LEj;

    iput-object v0, p1, LNs;->c:LEj;

    sget-object v0, LNs;->d:LOk;

    invoke-virtual {v0, p1}, LOk;->a(Ljava/lang/Object;)Z

    :cond_2
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lnp;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Bounds{lower="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lnp;->b:Ljava/lang/Object;

    check-cast v1, LHf;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " upper="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lnp;->c:Ljava/lang/Object;

    check-cast v1, LHf;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method
