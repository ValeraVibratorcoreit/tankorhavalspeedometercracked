.class public final Lru/zinovin/tankspeedometer/SplitThemeManager;
.super Ljava/lang/Object;
.source "SplitThemeManager.java"

# direct methods
.method public constructor <init>()V
    .locals 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V
    return-void
.end method

.method public static getResId(Ljava/lang/String;)I
    .locals 3

    if-eqz p0, :cond_empty

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_check_ctx

    :cond_empty
    const/4 p0, 0x0

    return p0

    :cond_check_ctx
    :try_start_all
    sget-object v0, Lru/zinovin/tankspeedometer/providers/InitProvider;->a:Landroid/content/Context;

    if-nez v0, :cond_got_ctx

    sget-object v0, Ln1;->a:Landroid/content/Context;

    if-nez v0, :cond_got_ctx

    const/4 p0, 0x0

    return p0

    :cond_got_ctx
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v2, "drawable"

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, p0, v2, v0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0
    :try_end_all
    .catch Ljava/lang/Throwable; {:try_start_all .. :try_end_all} :cond_err

    :cond_err
    const/4 p0, 0x0

    return p0
.end method

.method public static getTheme(Ljava/lang/String;)LMf;
    .locals 5
    if-nez p0, :cond_not_null
    const/4 p0, 0x0
    return-object p0

    :cond_not_null
    const-string v0, "_big"
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
    move-result v1

    if-eqz v1, :cond_not_big
    const/4 v0, 0x0
    invoke-virtual {p0}, Ljava/lang/String;->length()I
    move-result v2
    add-int/lit8 v2, v2, -0x4
    invoke-virtual {p0, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
    move-result-object p0

    :cond_not_big
    :try_start_theme
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I
    move-result v0

    sparse-switch v0, :sswitch_data_themes

    goto/16 :not_found

    :sswitch_hash_neg_0x7da4e5d2
    const-string v2, "Split Ver 1"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_0
    goto/16 :not_found

    :sswitch_hash_neg_0x7d6d7bb3
    const-string v2, "Cool Neon"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_51
    goto/16 :not_found

    :sswitch_hash_neg_0x7d264939
    const-string v2, "Orange Mile"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_49
    goto/16 :not_found

    :sswitch_hash_neg_0x75f3c572
    const-string v2, "Quartet"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_31
    goto/16 :not_found

    :sswitch_hash_neg_0x71507b4e
    const-string v2, "Threads on glass"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_34
    goto/16 :not_found

    :sswitch_hash_neg_0x6f8fa4ba
    const-string v2, "Need for speed"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_43
    goto/16 :not_found

    :sswitch_hash_neg_0x6e42a711
    const-string v2, "Triple silver"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_21
    goto/16 :not_found

    :sswitch_hash_neg_0x6c6340d3
    const-string v2, "Silver"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_2
    goto/16 :not_found

    :sswitch_hash_neg_0x6c62e22e
    const-string v2, "Simple"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_1
    goto/16 :not_found

    :sswitch_hash_neg_0x6981db4e
    const-string v2, "VAZ 01"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_22
    goto/16 :not_found

    :sswitch_hash_neg_0x57ccbeff
    const-string v2, "Three big rings"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_12
    goto/16 :not_found

    :sswitch_hash_neg_0x55651639
    const-string v2, "Сhrome shine"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_17
    goto/16 :not_found

    :sswitch_hash_neg_0x5475abdf
    const-string v2, "AsiaForce"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_3
    goto/16 :not_found

    :sswitch_hash_neg_0x52516707
    const-string v2, "Gray Rainbow"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_45
    goto/16 :not_found

    :sswitch_hash_neg_0x521b53c7
    const-string v2, "BlackChromeR"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_9
    goto/16 :not_found

    :sswitch_hash_neg_0x2426ec1a
    const-string v2, "Heptagon"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_25
    goto/16 :not_found

    :sswitch_hash_neg_0x22278e9a
    const-string v2, "Huge RR Style"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_20
    goto/16 :not_found

    :sswitch_hash_neg_0x17e25fe5
    const-string v2, "Blue Mile"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_50
    goto/16 :not_found

    :sswitch_hash_neg_0x13eafca8
    const-string v2, "Need for speed (black)"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_44
    goto/16 :not_found

    :sswitch_hash_0x12e73
    const-string v2, "NMR"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_18
    goto/16 :not_found

    :sswitch_hash_0x3cae1bc
    const-string v2, "Aurus"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_24
    goto/16 :not_found

    :sswitch_hash_0x41b49cd
    const-string v2, "Globe"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_42
    goto/16 :not_found

    :sswitch_hash_0x41ddee3
    const-string v2, "Green"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_7
    goto/16 :not_found

    :sswitch_hash_0x9d3172b
    const-string v2, "Four oranges"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_29
    goto/16 :not_found

    :sswitch_hash_0x11a6fbd6
    const-string v2, "Black Mile"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_48
    goto/16 :not_found

    :sswitch_hash_0x11b1dcaf
    const-string v2, "Black eggs"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_38
    goto/16 :not_found

    :sswitch_hash_0x11dcf4b2
    const-string v2, "Golden thread 1"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_37
    goto/16 :not_found

    :sswitch_hash_0x14df39e0
    const-string v2, "Whiteness"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_27
    goto/16 :not_found

    :sswitch_hash_0x1cbdecf8
    const-string v2, "New Horizons"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_41
    goto/16 :not_found

    :sswitch_hash_0x1cd08d91
    const-string v2, "Blue crown"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_23
    goto/16 :not_found

    :sswitch_hash_0x1ffb59ee
    const-string v2, "Lonely big speed"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_10
    goto/16 :not_found

    :sswitch_hash_0x21335228
    const-string v2, "Monochrom"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_35
    goto/16 :not_found

    :sswitch_hash_0x2413a461
    const-string v2, "Golden arrows"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_19
    goto/16 :not_found

    :sswitch_hash_0x2e5ce603
    const-string v2, "BigGreen"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_15
    goto/16 :not_found

    :sswitch_hash_0x3219f58f
    const-string v2, "Navi panorama"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_46
    goto/16 :not_found

    :sswitch_hash_0x37190f21
    const-string v2, "Three rings"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_11
    goto/16 :not_found

    :sswitch_hash_0x43f2a4e1
    const-string v2, "Golden thread"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_33
    goto/16 :not_found

    :sswitch_hash_0x44c2ea26
    const-string v2, "Huge RedBlackWhite"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_5
    goto/16 :not_found

    :sswitch_hash_0x45f2ac3a
    const-string v2, "Theme 36"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_36
    goto/16 :not_found

    :sswitch_hash_0x49e3b699
    const-string v2, "Heptagon S"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_26
    goto/16 :not_found

    :sswitch_hash_0x527c74df
    const-string v2, "Glass circles"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_6
    goto/16 :not_found

    :sswitch_hash_0x5a732ca8
    const-string v2, "Four coins"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_28
    goto/16 :not_found

    :sswitch_hash_0x5c53395a
    const-string v2, "BigBlue"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_14
    goto/16 :not_found

    :sswitch_hash_0x5ee7acc5
    const-string v2, "Wet Asphalt"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_39
    goto/16 :not_found

    :sswitch_hash_0x5f207f52
    const-string v2, "Green Mile"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_47
    goto/16 :not_found

    :sswitch_hash_0x6072bb39
    const-string v2, "BlackChrome"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_8
    goto/16 :not_found

    :sswitch_hash_0x60bea77b
    const-string v2, "Big RedBlackWhite"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_4
    goto/16 :not_found

    :sswitch_hash_0x663852b0
    const-string v2, "Twilight"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_32
    goto/16 :not_found

    :sswitch_hash_0x73429bb1
    const-string v2, "RR Style"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_13
    goto/16 :not_found

    :sswitch_hash_0x76978f91
    const-string v2, "BigRed"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_16
    goto/16 :not_found

    :sswitch_hash_0x7843bec3
    const-string v2, "Chrono"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_30
    goto/16 :not_found

    :sswitch_hash_0x787ad4fe
    const-string v2, "Clouds"
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    move-result v2
    if-nez v2, :goto_theme_40
    goto/16 :not_found

    :goto_theme_0
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f08024d

    iput v3, v0, LMf;->d:I

    const v3, 0x7f08024d

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_0
    const-string v2, "speedometer_default_big"
    goto :cond_set_0
    :cond_def_0
    const-string v2, "speedometer_default"
    :cond_set_0
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f0801ba
    iput v2, v0, LMf;->g:I

    const v2, 0x7f0801b9
    iput v2, v0, LMf;->h:I

    const v2, 0x7f0801b8
    iput v2, v0, LMf;->i:I

    const v2, 0x7f0801b8
    iput v2, v0, LMf;->J:I

    const/16 v2, -135
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 135
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x1e0
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x2d0
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x8c
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x0
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x0
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x0
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_1
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f08024d

    iput v3, v0, LMf;->d:I

    const v3, 0x7f08024d

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_1
    const-string v2, "speedometer_default_big"
    goto :cond_set_1
    :cond_def_1
    const-string v2, "speedometer_default"
    :cond_set_1
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f0801e3
    iput v2, v0, LMf;->g:I

    const v2, 0x7f0801e2
    iput v2, v0, LMf;->h:I

    const v2, 0x7f0801e1
    iput v2, v0, LMf;->i:I

    const v2, 0x7f0801e1
    iput v2, v0, LMf;->J:I

    const/16 v2, -135
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 135
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x1e0
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x2d0
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x8c
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x0
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x0
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x0
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_2
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 0

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f08024d

    iput v3, v0, LMf;->d:I

    const v3, 0x7f08024d

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_2
    const-string v2, "speedometer_default_big"
    goto :cond_set_2
    :cond_def_2
    const-string v2, "speedometer_default"
    :cond_set_2
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f080216
    iput v2, v0, LMf;->g:I

    const v2, 0x7f080215
    iput v2, v0, LMf;->h:I

    const v2, 0x7f080214
    iput v2, v0, LMf;->i:I

    const v2, 0x7f080214
    iput v2, v0, LMf;->J:I

    const/16 v2, -135
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 135
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x1e0
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x2d0
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x8c
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x0
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x0
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x0
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_3
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 0

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f08024d

    iput v3, v0, LMf;->d:I

    const v3, 0x7f08024d

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_3
    const-string v2, "speedometer_default_big"
    goto :cond_set_3
    :cond_def_3
    const-string v2, "speedometer_default"
    :cond_set_3
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f080241
    iput v2, v0, LMf;->g:I

    const v2, 0x7f080240
    iput v2, v0, LMf;->h:I

    const v2, 0x7f08023f
    iput v2, v0, LMf;->i:I

    const v2, 0x7f08023f
    iput v2, v0, LMf;->J:I

    const/16 v2, -135
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 135
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x1e0
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x2d0
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x8c
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x0
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x0
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x0
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_4
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f08024d

    iput v3, v0, LMf;->d:I

    const v3, 0x7f08024d

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_4
    const-string v2, "speedometer_default_big"
    goto :cond_set_4
    :cond_def_4
    const-string v2, "speedometer_default"
    :cond_set_4
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f08024b
    iput v2, v0, LMf;->g:I

    const v2, 0x7f08024a
    iput v2, v0, LMf;->h:I

    const v2, 0x7f080249
    iput v2, v0, LMf;->i:I

    const v2, 0x7f080249
    iput v2, v0, LMf;->J:I

    const/16 v2, -135
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 135
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x228
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x2ac
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x8c
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x0
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x0
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x0
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_5
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f08024d

    iput v3, v0, LMf;->d:I

    const v3, 0x7f08024d

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_5
    const-string v2, "speedometer_default_big"
    goto :cond_set_5
    :cond_def_5
    const-string v2, "speedometer_default"
    :cond_set_5
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f08024f
    iput v2, v0, LMf;->g:I

    const v2, 0x7f08024e
    iput v2, v0, LMf;->h:I

    const v2, 0x7f08024c
    iput v2, v0, LMf;->i:I

    const v2, 0x7f08024c
    iput v2, v0, LMf;->J:I

    const/16 v2, -0x88
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 0x88
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x2c1
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x3c
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x78
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x2c1
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x483
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x78
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_6
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 0

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 0

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f08024d

    iput v3, v0, LMf;->d:I

    const v3, 0x7f08024d

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_6
    const-string v2, "speedometer_default_big"
    goto :cond_set_6
    :cond_def_6
    const-string v2, "speedometer_default"
    :cond_set_6
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f080252
    iput v2, v0, LMf;->g:I

    const v2, 0x7f080251
    iput v2, v0, LMf;->h:I

    const v2, 0x7f080250
    iput v2, v0, LMf;->i:I

    const v2, 0x7f080250
    iput v2, v0, LMf;->J:I

    const/16 v2, -0x88
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 0x88
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x249
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x29b
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x73
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x0
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x0
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x0
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_7
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 0

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f08024d

    iput v3, v0, LMf;->d:I

    const v3, 0x7f08024d

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_7
    const-string v2, "speedometer_default_big"
    goto :cond_set_7
    :cond_def_7
    const-string v2, "speedometer_default"
    :cond_set_7
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f080255
    iput v2, v0, LMf;->g:I

    const v2, 0x7f080254
    iput v2, v0, LMf;->h:I

    const v2, 0x7f080253
    iput v2, v0, LMf;->i:I

    const v2, 0x7f080253
    iput v2, v0, LMf;->J:I

    const/16 v2, -135
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 135
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x1e0
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x2d0
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x8c
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x0
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x0
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x0
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_8
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f0801d6

    iput v3, v0, LMf;->d:I

    const v3, 0x7f0801d6

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_8
    const-string v2, "speedometer_default_big"
    goto :cond_set_8
    :cond_def_8
    const-string v2, "speedometer_default"
    :cond_set_8
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f080258
    iput v2, v0, LMf;->g:I

    const v2, 0x7f080257
    iput v2, v0, LMf;->h:I

    const v2, 0x7f080256
    iput v2, v0, LMf;->i:I

    const v2, 0x7f080256
    iput v2, v0, LMf;->J:I

    const/16 v2, -0x88
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 0x88
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0xc6
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x12d
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x1f4
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x258
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x4c4
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x82
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_9
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f0801d6

    iput v3, v0, LMf;->d:I

    const v3, 0x7f0801d6

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_9
    const-string v2, "speedometer_default_big"
    goto :cond_set_9
    :cond_def_9
    const-string v2, "speedometer_default"
    :cond_set_9
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f08025b
    iput v2, v0, LMf;->g:I

    const v2, 0x7f08025a
    iput v2, v0, LMf;->h:I

    const v2, 0x7f080259
    iput v2, v0, LMf;->i:I

    const v2, 0x7f080259
    iput v2, v0, LMf;->J:I

    const/16 v2, -0x88
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 0x88
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0xc6
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x12d
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x1f4
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x258
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x4c4
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x82
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_10
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 0

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f0801c0

    iput v3, v0, LMf;->d:I

    const v3, 0x7f0801c1

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_10
    const-string v2, "speedometer_default_big"
    goto :cond_set_10
    :cond_def_10
    const-string v2, "speedometer_default"
    :cond_set_10
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f0801bc
    iput v2, v0, LMf;->g:I

    const v2, 0x7f0801c2
    iput v2, v0, LMf;->h:I

    const v2, 0x7f0801bb
    iput v2, v0, LMf;->i:I

    const v2, 0x7f0801bb
    iput v2, v0, LMf;->J:I

    const/16 v2, -0x6e
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 0x6e
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x3b6
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x1e
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x64
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x1c2
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x58c
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x113
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_11
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f0801c0

    iput v3, v0, LMf;->d:I

    const v3, 0x7f0801c1

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_11
    const-string v2, "speedometer_default_big"
    goto :cond_set_11
    :cond_def_11
    const-string v2, "speedometer_default"
    :cond_set_11
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f0801c3
    iput v2, v0, LMf;->g:I

    const v2, 0x7f0801c2
    iput v2, v0, LMf;->h:I

    const v2, 0x7f0801be
    iput v2, v0, LMf;->i:I

    const v2, 0x7f0801bf
    iput v2, v0, LMf;->J:I

    const/16 v2, -0x6e
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 0x6e
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x352
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x1e
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x8c
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x1c2
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x58c
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x113
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_12
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f0801c6

    iput v3, v0, LMf;->d:I

    const v3, 0x7f0801c6

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_12
    const-string v2, "speedometer_default_big"
    goto :cond_set_12
    :cond_def_12
    const-string v2, "speedometer_default"
    :cond_set_12
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f0801c8
    iput v2, v0, LMf;->g:I

    const v2, 0x7f0801c7
    iput v2, v0, LMf;->h:I

    const v2, 0x7f0801c5
    iput v2, v0, LMf;->i:I

    const v2, 0x7f0801c5
    iput v2, v0, LMf;->J:I

    const/16 v2, -0x88
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 0x88
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x28a
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x1e
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x50
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x244
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x492
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x96
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_13
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f0801ca

    iput v3, v0, LMf;->d:I

    const v3, 0x7f0801ca

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_13
    const-string v2, "speedometer_default_big"
    goto :cond_set_13
    :cond_def_13
    const-string v2, "speedometer_default"
    :cond_set_13
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f0801cc
    iput v2, v0, LMf;->g:I

    const v2, 0x7f0801cb
    iput v2, v0, LMf;->h:I

    const v2, 0x7f0801c9
    iput v2, v0, LMf;->i:I

    const v2, 0x7f0801c9
    iput v2, v0, LMf;->J:I

    const/16 v2, -135
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 135
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x258
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x5d
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x7c
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x258
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x4cb
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x7c
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_14
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 0

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f0801ce

    iput v3, v0, LMf;->d:I

    const v3, 0x7f0801ce

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_14
    const-string v2, "speedometer_default_big"
    goto :cond_set_14
    :cond_def_14
    const-string v2, "speedometer_default"
    :cond_set_14
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f0801d0
    iput v2, v0, LMf;->g:I

    const v2, 0x7f0801cf
    iput v2, v0, LMf;->h:I

    const v2, 0x7f0801cd
    iput v2, v0, LMf;->i:I

    const v2, 0x7f0801cd
    iput v2, v0, LMf;->J:I

    const/16 v2, -135
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 135
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x258
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x5d
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x7c
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x258
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x4cb
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x7c
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_15
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 0

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f0801ce

    iput v3, v0, LMf;->d:I

    const v3, 0x7f0801ce

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_15
    const-string v2, "speedometer_default_big"
    goto :cond_set_15
    :cond_def_15
    const-string v2, "speedometer_default"
    :cond_set_15
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f0801d2
    iput v2, v0, LMf;->g:I

    const v2, 0x7f0801d1
    iput v2, v0, LMf;->h:I

    const v2, 0x7f0801cd
    iput v2, v0, LMf;->i:I

    const v2, 0x7f0801cd
    iput v2, v0, LMf;->J:I

    const/16 v2, -135
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 135
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x258
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x5d
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x7c
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x258
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x4cb
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x7c
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_16
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 0

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f0801ce

    iput v3, v0, LMf;->d:I

    const v3, 0x7f0801ce

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_16
    const-string v2, "speedometer_default_big"
    goto :cond_set_16
    :cond_def_16
    const-string v2, "speedometer_default"
    :cond_set_16
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f0801d4
    iput v2, v0, LMf;->g:I

    const v2, 0x7f0801d3
    iput v2, v0, LMf;->h:I

    const v2, 0x7f0801cd
    iput v2, v0, LMf;->i:I

    const v2, 0x7f0801cd
    iput v2, v0, LMf;->J:I

    const/16 v2, -135
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 135
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x258
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x5d
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x7c
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x258
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x4cb
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x7c
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_17
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 0

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f0801d6

    iput v3, v0, LMf;->d:I

    const v3, 0x7f0801d6

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_17
    const-string v2, "speedometer_default_big"
    goto :cond_set_17
    :cond_def_17
    const-string v2, "speedometer_default"
    :cond_set_17
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f0801d8
    iput v2, v0, LMf;->g:I

    const v2, 0x7f0801d7
    iput v2, v0, LMf;->h:I

    const v2, 0x7f0801d5
    iput v2, v0, LMf;->i:I

    const v2, 0x7f0801d5
    iput v2, v0, LMf;->J:I

    const/16 v2, -0x88
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 0x88
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0xc6
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x12d
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x1f4
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x258
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x4c4
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x82
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_18
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 0

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 0

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f0801da

    iput v3, v0, LMf;->d:I

    const v3, 0x7f0801da

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_18
    const-string v2, "speedometer_default_big"
    goto :cond_set_18
    :cond_def_18
    const-string v2, "speedometer_default"
    :cond_set_18
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f0801dc
    iput v2, v0, LMf;->g:I

    const v2, 0x7f0801db
    iput v2, v0, LMf;->h:I

    const v2, 0x7f0801d9
    iput v2, v0, LMf;->i:I

    const v2, 0x7f0801d9
    iput v2, v0, LMf;->J:I

    const/16 v2, -135
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 135
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x2c1
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x3c
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x78
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x2c1
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x483
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x78
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_19
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 0

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f0801de

    iput v3, v0, LMf;->d:I

    const v3, 0x7f0801de

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_19
    const-string v2, "speedometer_default_big"
    goto :cond_set_19
    :cond_def_19
    const-string v2, "speedometer_default"
    :cond_set_19
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f0801e0
    iput v2, v0, LMf;->g:I

    const v2, 0x7f0801df
    iput v2, v0, LMf;->h:I

    const v2, 0x7f0801dd
    iput v2, v0, LMf;->i:I

    const v2, 0x7f0801dd
    iput v2, v0, LMf;->J:I

    const/16 v2, -135
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 135
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x2c1
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x3c
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x78
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x2c1
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x483
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x78
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_20
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 0

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f0801e5

    iput v3, v0, LMf;->d:I

    const v3, 0x7f0801e5

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_20
    const-string v2, "speedometer_default_big"
    goto :cond_set_20
    :cond_def_20
    const-string v2, "speedometer_default"
    :cond_set_20
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f0801e7
    iput v2, v0, LMf;->g:I

    const v2, 0x7f0801e6
    iput v2, v0, LMf;->h:I

    const v2, 0x7f0801e4
    iput v2, v0, LMf;->i:I

    const v2, 0x7f0801e4
    iput v2, v0, LMf;->J:I

    const/16 v2, -135
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 135
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x2c1
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x3c
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x78
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x2c1
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x47e
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x78
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_21
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f0801ed

    iput v3, v0, LMf;->d:I

    const v3, 0x7f0801ec

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_21
    const-string v2, "speedometer_default_big"
    goto :cond_set_21
    :cond_def_21
    const-string v2, "speedometer_default"
    :cond_set_21
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f0801ef
    iput v2, v0, LMf;->g:I

    const v2, 0x7f0801ee
    iput v2, v0, LMf;->h:I

    const v2, 0x7f0801ea
    iput v2, v0, LMf;->i:I

    const v2, 0x7f0801eb
    iput v2, v0, LMf;->J:I

    const/16 v2, -135
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 135
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x294
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x1e
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x46
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x230
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x50a
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x82
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_22
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 0

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 0

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f0801c0

    iput v3, v0, LMf;->d:I

    const v3, 0x7f0801c1

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_22
    const-string v2, "speedometer_default_big"
    goto :cond_set_22
    :cond_def_22
    const-string v2, "speedometer_default"
    :cond_set_22
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f0801f1
    iput v2, v0, LMf;->g:I

    const v2, 0x7f0801c2
    iput v2, v0, LMf;->h:I

    const v2, 0x7f0801f0
    iput v2, v0, LMf;->i:I

    const v2, 0x7f0801f0
    iput v2, v0, LMf;->J:I

    const/16 v2, -0x2c
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 0x2c
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x352
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x1e
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x122
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x15e
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x5f0
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x1f4
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_23
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 0

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f0801f3

    iput v3, v0, LMf;->d:I

    const v3, 0x7f0801f3

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_23
    const-string v2, "speedometer_default_big"
    goto :cond_set_23
    :cond_def_23
    const-string v2, "speedometer_default"
    :cond_set_23
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f0801f5
    iput v2, v0, LMf;->g:I

    const v2, 0x7f0801f4
    iput v2, v0, LMf;->h:I

    const v2, 0x7f0801f2
    iput v2, v0, LMf;->i:I

    const v2, 0x7f0801f2
    iput v2, v0, LMf;->J:I

    const/16 v2, -0x8e
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 0x8e
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x12c
    iput v2, v0, LMf;->D:I
    const/16 v2, 0xf8
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x19f
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x253
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x4c9
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x7d
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_24
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 0

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f0801f7

    iput v3, v0, LMf;->d:I

    const v3, 0x7f0801f7

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_24
    const-string v2, "speedometer_default_big"
    goto :cond_set_24
    :cond_def_24
    const-string v2, "speedometer_default"
    :cond_set_24
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f0801fb
    iput v2, v0, LMf;->g:I

    const v2, 0x7f0801f9
    iput v2, v0, LMf;->h:I

    const v2, 0x7f0801f8
    iput v2, v0, LMf;->i:I

    const v2, 0x7f0801f6
    iput v2, v0, LMf;->J:I

    const/16 v2, -0x8e
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 0x8e
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0xcc
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x189
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x103
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x316
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x406
    iput v2, v0, LMf;->H:I
    const/16 v2, -0x28
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_25
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 0

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f0801fe

    iput v3, v0, LMf;->d:I

    const v3, 0x7f0801fe

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_25
    const-string v2, "speedometer_default_big"
    goto :cond_set_25
    :cond_def_25
    const-string v2, "speedometer_default"
    :cond_set_25
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f080202
    iput v2, v0, LMf;->g:I

    const v2, 0x7f080200
    iput v2, v0, LMf;->h:I

    const v2, 0x7f0801ff
    iput v2, v0, LMf;->i:I

    const v2, 0x7f0801fd
    iput v2, v0, LMf;->J:I

    const/16 v2, -0x8e
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 0x8e
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x82
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x19a
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x157
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x28a
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x4c4
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x50
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_26
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 0

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f0801fe

    iput v3, v0, LMf;->d:I

    const v3, 0x7f0801fe

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_26
    const-string v2, "speedometer_default_big"
    goto :cond_set_26
    :cond_def_26
    const-string v2, "speedometer_default"
    :cond_set_26
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f080202
    iput v2, v0, LMf;->g:I

    const v2, 0x7f080200
    iput v2, v0, LMf;->h:I

    const v2, 0x7f0801ff
    iput v2, v0, LMf;->i:I

    const v2, 0x7f0801fd
    iput v2, v0, LMf;->J:I

    const/16 v2, -0x8e
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 0x8e
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x82
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x19a
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x157
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x28a
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x4c4
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x50
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_27
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 0

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f080205

    iput v3, v0, LMf;->d:I

    const v3, 0x7f080205

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_27
    const-string v2, "speedometer_default_big"
    goto :cond_set_27
    :cond_def_27
    const-string v2, "speedometer_default"
    :cond_set_27
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f080207
    iput v2, v0, LMf;->g:I

    const v2, 0x7f080206
    iput v2, v0, LMf;->h:I

    const v2, 0x7f080204
    iput v2, v0, LMf;->i:I

    const v2, 0x7f080204
    iput v2, v0, LMf;->J:I

    const/16 v2, -0x86
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 0x86
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0xdc
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x123
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x131
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x244
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x4ce
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x82
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_28
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f08020a

    iput v3, v0, LMf;->d:I

    const v3, 0x7f08020a

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_28
    const-string v2, "speedometer_default_big"
    goto :cond_set_28
    :cond_def_28
    const-string v2, "speedometer_default"
    :cond_set_28
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f08020c
    iput v2, v0, LMf;->g:I

    const v2, 0x7f08020b
    iput v2, v0, LMf;->h:I

    const v2, 0x7f080209
    iput v2, v0, LMf;->i:I

    const v2, 0x7f080209
    iput v2, v0, LMf;->J:I

    const/16 v2, -135
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 135
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x15e
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x6e
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x168
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x2a8
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x36b
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x6e
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_29
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f080210

    iput v3, v0, LMf;->d:I

    const v3, 0x7f080210

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_29
    const-string v2, "speedometer_default_big"
    goto :cond_set_29
    :cond_def_29
    const-string v2, "speedometer_default"
    :cond_set_29
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f080212
    iput v2, v0, LMf;->g:I

    const v2, 0x7f080211
    iput v2, v0, LMf;->h:I

    const v2, 0x7f08020f
    iput v2, v0, LMf;->i:I

    const v2, 0x7f08020f
    iput v2, v0, LMf;->J:I

    const/16 v2, -135
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 135
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x15e
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x6e
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x168
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x2a8
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x36b
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x6e
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_30
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 0

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f080218

    iput v3, v0, LMf;->d:I

    const v3, 0x7f080219

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_30
    const-string v2, "speedometer_default_big"
    goto :cond_set_30
    :cond_def_30
    const-string v2, "speedometer_default"
    :cond_set_30
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f08021b
    iput v2, v0, LMf;->g:I

    const v2, 0x7f0801c2
    iput v2, v0, LMf;->h:I

    const v2, 0x7f08021a
    iput v2, v0, LMf;->i:I

    const v2, 0x7f080217
    iput v2, v0, LMf;->J:I

    const/16 v2, -0x86
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 0x86
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0xc8
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x304
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x122
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x258
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x4f6
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x5a
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_31
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 0

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f08021e

    iput v3, v0, LMf;->d:I

    const v3, 0x7f08021e

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_31
    const-string v2, "speedometer_default_big"
    goto :cond_set_31
    :cond_def_31
    const-string v2, "speedometer_default"
    :cond_set_31
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f080220
    iput v2, v0, LMf;->g:I

    const v2, 0x7f08021f
    iput v2, v0, LMf;->h:I

    const v2, 0x7f08021d
    iput v2, v0, LMf;->i:I

    const v2, 0x7f08021d
    iput v2, v0, LMf;->J:I

    const/16 v2, -0x84
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 0x84
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x159
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x6e
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x168
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x24e
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x3a0
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x4b
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_32
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f080224

    iput v3, v0, LMf;->d:I

    const v3, 0x7f080224

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_32
    const-string v2, "speedometer_default_big"
    goto :cond_set_32
    :cond_def_32
    const-string v2, "speedometer_default"
    :cond_set_32
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f080226
    iput v2, v0, LMf;->g:I

    const v2, 0x7f080225
    iput v2, v0, LMf;->h:I

    const v2, 0x7f080223
    iput v2, v0, LMf;->i:I

    const v2, 0x7f080223
    iput v2, v0, LMf;->J:I

    const/16 v2, -0x84
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 0x84
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x14a
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x69
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x17c
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x26c
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x389
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x64
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_33
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f08022a

    iput v3, v0, LMf;->d:I

    const v3, 0x7f08022a

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_33
    const-string v2, "speedometer_default_big"
    goto :cond_set_33
    :cond_def_33
    const-string v2, "speedometer_default"
    :cond_set_33
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f08022d
    iput v2, v0, LMf;->g:I

    const v2, 0x7f08022b
    iput v2, v0, LMf;->h:I

    const v2, 0x7f080229
    iput v2, v0, LMf;->i:I

    const v2, 0x7f080229
    iput v2, v0, LMf;->J:I

    const/16 v2, -0x8e
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 0x8e
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x12c
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x258
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x6e
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x2c1
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x47e
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x3c
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_34
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 0

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f080231

    iput v3, v0, LMf;->d:I

    const v3, 0x7f080231

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_34
    const-string v2, "speedometer_default_big"
    goto :cond_set_34
    :cond_def_34
    const-string v2, "speedometer_default"
    :cond_set_34
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f080233
    iput v2, v0, LMf;->g:I

    const v2, 0x7f080232
    iput v2, v0, LMf;->h:I

    const v2, 0x7f080230
    iput v2, v0, LMf;->i:I

    const v2, 0x7f080230
    iput v2, v0, LMf;->J:I

    const/16 v2, -0x8e
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 0x8e
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x12c
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x244
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x6e
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x294
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x4b0
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x3c
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_35
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f08022a

    iput v3, v0, LMf;->d:I

    const v3, 0x7f08022a

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_35
    const-string v2, "speedometer_default_big"
    goto :cond_set_35
    :cond_def_35
    const-string v2, "speedometer_default"
    :cond_set_35
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f080237
    iput v2, v0, LMf;->g:I

    const v2, 0x7f080236
    iput v2, v0, LMf;->h:I

    const v2, 0x7f080235
    iput v2, v0, LMf;->i:I

    const v2, 0x7f080235
    iput v2, v0, LMf;->J:I

    const/16 v2, -0x8e
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 0x8e
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x10e
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x258
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x6e
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x2c1
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x47e
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x3c
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_36
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 0

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 0

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f08024d

    iput v3, v0, LMf;->d:I

    const v3, 0x7f08024d

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_36
    const-string v2, "speedometer_default_big"
    goto :cond_set_36
    :cond_def_36
    const-string v2, "speedometer_default"
    :cond_set_36
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f0801e3
    iput v2, v0, LMf;->g:I

    const v2, 0x7f0801e2
    iput v2, v0, LMf;->h:I

    const v2, 0x7f0801e1
    iput v2, v0, LMf;->i:I

    const v2, 0x7f0801e1
    iput v2, v0, LMf;->J:I

    const/16 v2, -0x86
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 0x86
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x190
    iput v2, v0, LMf;->D:I
    const/16 v2, 0xfa
    iput v2, v0, LMf;->E:I
    const/16 v2, 0xcd
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x244
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x50a
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x5f
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_37
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f08022a

    iput v3, v0, LMf;->d:I

    const v3, 0x7f08022a

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_37
    const-string v2, "speedometer_default_big"
    goto :cond_set_37
    :cond_def_37
    const-string v2, "speedometer_default"
    :cond_set_37
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f08022d
    iput v2, v0, LMf;->g:I

    const v2, 0x7f08022b
    iput v2, v0, LMf;->h:I

    const v2, 0x7f080229
    iput v2, v0, LMf;->i:I

    const v2, 0x7f080229
    iput v2, v0, LMf;->J:I

    const/16 v2, -0x8e
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 0x8e
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0xaa
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x1ae
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x1c2
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x249
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x4e7
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x50
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_38
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 0

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 0

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f08024d

    iput v3, v0, LMf;->d:I

    const v3, 0x7f08024d

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_38
    const-string v2, "speedometer_default_big"
    goto :cond_set_38
    :cond_def_38
    const-string v2, "speedometer_default"
    :cond_set_38
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f0801e3
    iput v2, v0, LMf;->g:I

    const v2, 0x7f0801e2
    iput v2, v0, LMf;->h:I

    const v2, 0x7f0801e1
    iput v2, v0, LMf;->i:I

    const v2, 0x7f0801e1
    iput v2, v0, LMf;->J:I

    const/16 v2, -135
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 135
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x15e
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x5a
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x15e
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x226
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x3ca
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x96
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_39
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f08023c

    iput v3, v0, LMf;->d:I

    const v3, 0x7f08023c

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_39
    const-string v2, "speedometer_default_big"
    goto :cond_set_39
    :cond_def_39
    const-string v2, "speedometer_default"
    :cond_set_39
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f08023e
    iput v2, v0, LMf;->g:I

    const v2, 0x7f08023d
    iput v2, v0, LMf;->h:I

    const v2, 0x7f08023b
    iput v2, v0, LMf;->i:I

    const v2, 0x7f08023b
    iput v2, v0, LMf;->J:I

    const/16 v2, -0x86
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 0x86
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x244
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x6e
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x87
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x244
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x4ce
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x87
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_40
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f080243

    iput v3, v0, LMf;->d:I

    const v3, 0x7f080243

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_40
    const-string v2, "speedometer_default_big"
    goto :cond_set_40
    :cond_def_40
    const-string v2, "speedometer_default"
    :cond_set_40
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f080245
    iput v2, v0, LMf;->g:I

    const v2, 0x7f080244
    iput v2, v0, LMf;->h:I

    const v2, 0x7f080242
    iput v2, v0, LMf;->i:I

    const v2, 0x7f080242
    iput v2, v0, LMf;->J:I

    const/16 v2, -0x88
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 0x88
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x2c1
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x3c
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x78
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x2c1
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x483
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x78
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_41
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f0801d6

    iput v3, v0, LMf;->d:I

    const v3, 0x7f0801d6

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_41
    const-string v2, "speedometer_default_big"
    goto :cond_set_41
    :cond_def_41
    const-string v2, "speedometer_default"
    :cond_set_41
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f0801d8
    iput v2, v0, LMf;->g:I

    const v2, 0x7f0801d7
    iput v2, v0, LMf;->h:I

    const v2, 0x7f0801d5
    iput v2, v0, LMf;->i:I

    const v2, 0x7f0801d5
    iput v2, v0, LMf;->J:I

    const/16 v2, -0x88
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 0x88
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x1f4
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x78
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x58
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x1f4
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x514
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x58
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_42
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f0801d6

    iput v3, v0, LMf;->d:I

    const v3, 0x7f0801d6

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_42
    const-string v2, "speedometer_default_big"
    goto :cond_set_42
    :cond_def_42
    const-string v2, "speedometer_default"
    :cond_set_42
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f0801d8
    iput v2, v0, LMf;->g:I

    const v2, 0x7f0801d7
    iput v2, v0, LMf;->h:I

    const v2, 0x7f0801d5
    iput v2, v0, LMf;->i:I

    const v2, 0x7f0801d5
    iput v2, v0, LMf;->J:I

    const/16 v2, -0x88
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 0x88
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x1f4
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x78
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x58
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x1f4
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x514
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x58
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_43
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f0801d6

    iput v3, v0, LMf;->d:I

    const v3, 0x7f0801d6

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_43
    const-string v2, "speedometer_default_big"
    goto :cond_set_43
    :cond_def_43
    const-string v2, "speedometer_default"
    :cond_set_43
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f0801d8
    iput v2, v0, LMf;->g:I

    const v2, 0x7f0801d7
    iput v2, v0, LMf;->h:I

    const v2, 0x7f0801d5
    iput v2, v0, LMf;->i:I

    const v2, 0x7f0801d5
    iput v2, v0, LMf;->J:I

    const/16 v2, -0x88
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 0x88
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x1f4
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x78
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x58
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x1f4
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x514
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x58
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_44
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f0801d6

    iput v3, v0, LMf;->d:I

    const v3, 0x7f0801d6

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_44
    const-string v2, "speedometer_default_big"
    goto :cond_set_44
    :cond_def_44
    const-string v2, "speedometer_default"
    :cond_set_44
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f0801d8
    iput v2, v0, LMf;->g:I

    const v2, 0x7f0801d7
    iput v2, v0, LMf;->h:I

    const v2, 0x7f0801d5
    iput v2, v0, LMf;->i:I

    const v2, 0x7f0801d5
    iput v2, v0, LMf;->J:I

    const/16 v2, -0x88
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 0x88
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x1f4
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x78
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x58
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x1f4
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x514
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x58
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_45
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f0801d6

    iput v3, v0, LMf;->d:I

    const v3, 0x7f0801d6

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_45
    const-string v2, "speedometer_default_big"
    goto :cond_set_45
    :cond_def_45
    const-string v2, "speedometer_default"
    :cond_set_45
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f0801d8
    iput v2, v0, LMf;->g:I

    const v2, 0x7f0801d7
    iput v2, v0, LMf;->h:I

    const v2, 0x7f0801d5
    iput v2, v0, LMf;->i:I

    const v2, 0x7f0801d5
    iput v2, v0, LMf;->J:I

    const/16 v2, -0x88
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 0x88
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x1f4
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x78
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x58
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x1f4
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x514
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x58
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_46
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f0801d6

    iput v3, v0, LMf;->d:I

    const v3, 0x7f0801d6

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_46
    const-string v2, "speedometer_default_big"
    goto :cond_set_46
    :cond_def_46
    const-string v2, "speedometer_default"
    :cond_set_46
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f0801d8
    iput v2, v0, LMf;->g:I

    const v2, 0x7f0801d7
    iput v2, v0, LMf;->h:I

    const v2, 0x7f0801d5
    iput v2, v0, LMf;->i:I

    const v2, 0x7f0801d5
    iput v2, v0, LMf;->J:I

    const/16 v2, -0x88
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 0x88
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x1f4
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x78
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x58
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x1f4
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x514
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x58
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_47
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f0801de

    iput v3, v0, LMf;->d:I

    const v3, 0x7f0801de

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_47
    const-string v2, "speedometer_default_big"
    goto :cond_set_47
    :cond_def_47
    const-string v2, "speedometer_default"
    :cond_set_47
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f0801e0
    iput v2, v0, LMf;->g:I

    const v2, 0x7f0801df
    iput v2, v0, LMf;->h:I

    const v2, 0x7f0801dd
    iput v2, v0, LMf;->i:I

    const v2, 0x7f0801dd
    iput v2, v0, LMf;->J:I

    const/16 v2, -0x88
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 0x88
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x2c1
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x3c
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x78
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x2c1
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x483
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x78
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_48
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f0801de

    iput v3, v0, LMf;->d:I

    const v3, 0x7f0801de

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_48
    const-string v2, "speedometer_default_big"
    goto :cond_set_48
    :cond_def_48
    const-string v2, "speedometer_default"
    :cond_set_48
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f0801e0
    iput v2, v0, LMf;->g:I

    const v2, 0x7f0801df
    iput v2, v0, LMf;->h:I

    const v2, 0x7f0801dd
    iput v2, v0, LMf;->i:I

    const v2, 0x7f0801dd
    iput v2, v0, LMf;->J:I

    const/16 v2, -0x88
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 0x88
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x2c1
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x3c
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x78
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x2c1
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x483
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x78
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_49
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f0801de

    iput v3, v0, LMf;->d:I

    const v3, 0x7f0801de

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_49
    const-string v2, "speedometer_default_big"
    goto :cond_set_49
    :cond_def_49
    const-string v2, "speedometer_default"
    :cond_set_49
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f0801e0
    iput v2, v0, LMf;->g:I

    const v2, 0x7f0801df
    iput v2, v0, LMf;->h:I

    const v2, 0x7f0801dd
    iput v2, v0, LMf;->i:I

    const v2, 0x7f0801dd
    iput v2, v0, LMf;->J:I

    const/16 v2, -0x88
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 0x88
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x2c1
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x3c
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x78
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x2c1
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x483
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x78
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_50
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f0801de

    iput v3, v0, LMf;->d:I

    const v3, 0x7f0801de

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_50
    const-string v2, "speedometer_default_big"
    goto :cond_set_50
    :cond_def_50
    const-string v2, "speedometer_default"
    :cond_set_50
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f0801e0
    iput v2, v0, LMf;->g:I

    const v2, 0x7f0801df
    iput v2, v0, LMf;->h:I

    const v2, 0x7f0801dd
    iput v2, v0, LMf;->i:I

    const v2, 0x7f0801dd
    iput v2, v0, LMf;->J:I

    const/16 v2, -0x88
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 0x88
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x2c1
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x3c
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x78
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x2c1
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x483
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x78
    iput v2, v0, LMf;->I:I

    return-object v0

    :goto_theme_51
    invoke-static {}, LF4;->E()Lk0;
    move-result-object v0
    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;
    check-cast v0, LMf;

    const/4 v3, 0x0

    iput-boolean v3, v0, LMf;->b:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->c:Z

    const/4 v3, 1

    iput-boolean v3, v0, LMf;->z:Z

    const v3, 0x7f0801de

    iput v3, v0, LMf;->d:I

    const v3, 0x7f0801de

    iput v3, v0, LMf;->e:I

    iput v3, v0, LMf;->f:I

    if-eqz v1, :cond_def_51
    const-string v2, "speedometer_default_big"
    goto :cond_set_51
    :cond_def_51
    const-string v2, "speedometer_default"
    :cond_set_51
    iput-object v2, v0, LMf;->a:Ljava/lang/String;

    const v2, 0x7f0801e0
    iput v2, v0, LMf;->g:I

    const v2, 0x7f0801df
    iput v2, v0, LMf;->h:I

    const v2, 0x7f0801dd
    iput v2, v0, LMf;->i:I

    const v2, 0x7f0801dd
    iput v2, v0, LMf;->J:I

    const/16 v2, -135
    iput v2, v0, LMf;->q:I
    iput v2, v0, LMf;->v:I

    const/16 v2, 135
    iput v2, v0, LMf;->r:I
    iput v2, v0, LMf;->w:I

    const/16 v2, 0x2c1
    iput v2, v0, LMf;->D:I
    const/16 v2, 0x3c
    iput v2, v0, LMf;->E:I
    const/16 v2, 0x78
    iput v2, v0, LMf;->F:I
    const/16 v2, 0x2c1
    iput v2, v0, LMf;->G:I
    const/16 v2, 0x483
    iput v2, v0, LMf;->H:I
    const/16 v2, 0x78
    iput v2, v0, LMf;->I:I

    return-object v0

    :try_end_theme
    .catch Ljava/lang/Throwable; {:try_start_theme .. :try_end_theme} :catch_theme

    :catch_theme
    const/4 v0, 0x0
    return-object v0

    :not_found
    const/4 v0, 0x0
    return-object v0

    :sswitch_data_themes
    .sparse-switch
        -0x7da4e5d2 -> :sswitch_hash_neg_0x7da4e5d2
        -0x7d6d7bb3 -> :sswitch_hash_neg_0x7d6d7bb3
        -0x7d264939 -> :sswitch_hash_neg_0x7d264939
        -0x75f3c572 -> :sswitch_hash_neg_0x75f3c572
        -0x71507b4e -> :sswitch_hash_neg_0x71507b4e
        -0x6f8fa4ba -> :sswitch_hash_neg_0x6f8fa4ba
        -0x6e42a711 -> :sswitch_hash_neg_0x6e42a711
        -0x6c6340d3 -> :sswitch_hash_neg_0x6c6340d3
        -0x6c62e22e -> :sswitch_hash_neg_0x6c62e22e
        -0x6981db4e -> :sswitch_hash_neg_0x6981db4e
        -0x57ccbeff -> :sswitch_hash_neg_0x57ccbeff
        -0x55651639 -> :sswitch_hash_neg_0x55651639
        -0x5475abdf -> :sswitch_hash_neg_0x5475abdf
        -0x52516707 -> :sswitch_hash_neg_0x52516707
        -0x521b53c7 -> :sswitch_hash_neg_0x521b53c7
        -0x2426ec1a -> :sswitch_hash_neg_0x2426ec1a
        -0x22278e9a -> :sswitch_hash_neg_0x22278e9a
        -0x17e25fe5 -> :sswitch_hash_neg_0x17e25fe5
        -0x13eafca8 -> :sswitch_hash_neg_0x13eafca8
        0x12e73 -> :sswitch_hash_0x12e73
        0x3cae1bc -> :sswitch_hash_0x3cae1bc
        0x41b49cd -> :sswitch_hash_0x41b49cd
        0x41ddee3 -> :sswitch_hash_0x41ddee3
        0x9d3172b -> :sswitch_hash_0x9d3172b
        0x11a6fbd6 -> :sswitch_hash_0x11a6fbd6
        0x11b1dcaf -> :sswitch_hash_0x11b1dcaf
        0x11dcf4b2 -> :sswitch_hash_0x11dcf4b2
        0x14df39e0 -> :sswitch_hash_0x14df39e0
        0x1cbdecf8 -> :sswitch_hash_0x1cbdecf8
        0x1cd08d91 -> :sswitch_hash_0x1cd08d91
        0x1ffb59ee -> :sswitch_hash_0x1ffb59ee
        0x21335228 -> :sswitch_hash_0x21335228
        0x2413a461 -> :sswitch_hash_0x2413a461
        0x2e5ce603 -> :sswitch_hash_0x2e5ce603
        0x3219f58f -> :sswitch_hash_0x3219f58f
        0x37190f21 -> :sswitch_hash_0x37190f21
        0x43f2a4e1 -> :sswitch_hash_0x43f2a4e1
        0x44c2ea26 -> :sswitch_hash_0x44c2ea26
        0x45f2ac3a -> :sswitch_hash_0x45f2ac3a
        0x49e3b699 -> :sswitch_hash_0x49e3b699
        0x527c74df -> :sswitch_hash_0x527c74df
        0x5a732ca8 -> :sswitch_hash_0x5a732ca8
        0x5c53395a -> :sswitch_hash_0x5c53395a
        0x5ee7acc5 -> :sswitch_hash_0x5ee7acc5
        0x5f207f52 -> :sswitch_hash_0x5f207f52
        0x6072bb39 -> :sswitch_hash_0x6072bb39
        0x60bea77b -> :sswitch_hash_0x60bea77b
        0x663852b0 -> :sswitch_hash_0x663852b0
        0x73429bb1 -> :sswitch_hash_0x73429bb1
        0x76978f91 -> :sswitch_hash_0x76978f91
        0x7843bec3 -> :sswitch_hash_0x7843bec3
        0x787ad4fe -> :sswitch_hash_0x787ad4fe
    .end sparse-switch
.end method