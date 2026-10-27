.class public final LAf;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final h:Ljava/util/List;


# instance fields
.field public final a:Ljava/util/HashMap;

.field public b:LBq;

.field public c:I

.field public d:I

.field public e:I

.field public f:Z

.field public final g:LDg;


# direct methods
.method static constructor <clinit>()V
    .locals 34

    const-string v32, "Night_micro"

    const-string v33, "Night_micro_oldfw"

    const-string v0, "speedometer_default"

    const-string v1, "speedometer_default_big"

    const-string v2, "Digital"

    const-string v3, "Digital_micro"

    const-string v4, "Digital_big"

    const-string v5, "Digital_oldfw"

    const-string v6, "Digital_micro_oldfw"

    const-string v7, "Digital_big_oldfw"

    const-string v8, "Tank 500"

    const-string v9, "Tank 500_big"

    const-string v10, "KIA"

    const-string v11, "KIA_big"

    const-string v12, "KIA mini"

    const-string v13, "KIA mini_big"

    const-string v14, "speedometer_default_oldfw"

    const-string v15, "speedometer_default_big_oldfw"

    const-string v16, "Tank 500_oldfw"

    const-string v17, "Tank 500_big_oldfw"

    const-string v18, "KIA_oldfw"

    const-string v19, "KIA_big_oldfw"

    const-string v20, "KIA mini_oldfw"

    const-string v21, "KIA mini_big_oldfw"

    const-string v22, "Night center"

    const-string v23, "Night center_big"

    const-string v24, "Night center_oldfw"

    const-string v25, "Night center_big_oldfw"

    const-string v26, "speedometer_default_micro"

    const-string v27, "speedometer_default_micro_oldfw"

    const-string v28, "KIA mini_micro"

    const-string v29, "KIA mini_micro_oldfw"

    const-string v30, "Tank 500_micro"

    const-string v31, "Tank 500_micro_oldfw"

    filled-new-array/range {v0 .. v33}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, LAf;->h:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LDg;)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v7, p2

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    iput-object v8, v0, LAf;->a:Ljava/util/HashMap;

    iput-object v7, v0, LAf;->g:LDg;

    invoke-static/range {p1 .. p1}, Lmk;->l(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "infoInCenter"

    const/4 v9, 0x0

    invoke-static {v2, v9}, LBr;->s(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, v0, LAf;->f:Z

    const-string v2, "extFirmware"

    const/4 v10, 0x1

    invoke-interface {v1, v2, v10}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v11

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v12

    new-instance v1, Lgp;

    const/high16 v2, 0x42f00000    # 120.0f

    const/high16 v3, 0x42100000    # 36.0f

    invoke-direct {v1, v12, v7, v2, v3}, Lgp;-><init>(Landroid/content/Context;LDg;FF)V

    new-instance v4, Lhn;

    invoke-direct {v4, v12, v7, v2, v3}, Lhn;-><init>(Landroid/content/Context;LDg;FF)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    const/4 v6, 0x2

    iput v6, v1, Lzf;->c:I

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v13, LV;

    const/high16 v14, 0x41e80000    # 29.0f

    const/4 v15, 0x2

    invoke-direct {v13, v12, v7, v14, v15}, LV;-><init>(Landroid/content/Context;LDg;FI)V

    iput v6, v13, Lzf;->c:I

    invoke-virtual {v2, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v13, LV;

    const/4 v15, 0x0

    invoke-direct {v13, v12, v7, v14, v15}, LV;-><init>(Landroid/content/Context;LDg;FI)V

    iput v6, v13, Lzf;->c:I

    invoke-virtual {v2, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput v6, v4, Lzf;->c:I

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v13, LV;

    const/4 v15, 0x1

    invoke-direct {v13, v12, v7, v14, v15}, LV;-><init>(Landroid/content/Context;LDg;FI)V

    iput v6, v13, Lzf;->c:I

    invoke-virtual {v3, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v13, LOq;

    const v14, 0x7f0e017f

    invoke-direct {v13, v12, v7, v14}, LOq;-><init>(Landroid/content/Context;LDg;I)V

    iput v6, v13, Lzf;->c:I

    invoke-virtual {v3, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v13, LK2;

    const/16 v14, 0x10

    const/4 v15, 0x0

    invoke-direct {v13, v14, v15}, LK2;-><init>(IZ)V

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v14, v13, LK2;->b:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v13, LK2;->c:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v13, LK2;->d:Ljava/lang/Object;

    const-string v2, "transparentBackgroundInCenter"

    invoke-static {v2, v9}, LBr;->s(Ljava/lang/String;Z)Z

    move-result v14

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput v6, v1, Lzf;->c:I

    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput v6, v4, Lzf;->c:I

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, Ltr;

    invoke-direct {v1, v12, v7}, Ltr;-><init>(Landroid/content/Context;LDg;)V

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v6, LV;

    const v16, 0x7f080094

    const v17, 0x7f080152

    if-eqz v14, :cond_0

    move/from16 v18, v17

    goto :goto_0

    :cond_0
    move/from16 v18, v16

    :goto_0
    const/high16 v19, 0x42400000    # 48.0f

    const/16 v20, 0x2

    move-object v1, v6

    move-object v2, v12

    move-object v4, v3

    move-object/from16 v3, p2

    move-object v10, v4

    move/from16 v4, v19

    move-object v9, v5

    move/from16 v5, v18

    move/from16 v18, v11

    move-object v11, v6

    move/from16 v6, v20

    invoke-direct/range {v1 .. v6}, LV;-><init>(Landroid/content/Context;LDg;FII)V

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v11, LV;

    if-eqz v14, :cond_1

    move/from16 v5, v17

    goto :goto_1

    :cond_1
    move/from16 v5, v16

    :goto_1
    const/4 v6, 0x1

    move-object v1, v11

    move-object v2, v12

    move-object/from16 v3, p2

    move/from16 v4, v19

    invoke-direct/range {v1 .. v6}, LV;-><init>(Landroid/content/Context;LDg;FII)V

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v11, LV;

    if-eqz v14, :cond_2

    move/from16 v5, v17

    goto :goto_2

    :cond_2
    move/from16 v5, v16

    :goto_2
    const/4 v6, 0x0

    move-object v1, v11

    move-object v2, v12

    move-object/from16 v3, p2

    move/from16 v4, v19

    invoke-direct/range {v1 .. v6}, LV;-><init>(Landroid/content/Context;LDg;FII)V

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, LOq;

    if-eqz v14, :cond_3

    move/from16 v2, v17

    goto :goto_3

    :cond_3
    move/from16 v2, v16

    :goto_3
    const v3, 0x7f0e017c

    invoke-direct {v1, v12, v7, v3, v2}, LOq;-><init>(Landroid/content/Context;LDg;II)V

    invoke-virtual {v10, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, LK2;

    const/16 v2, 0x10

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, LK2;-><init>(IZ)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v15}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v1, LK2;->b:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v1, LK2;->c:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v10}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v1, LK2;->d:Ljava/lang/Object;

    new-instance v2, LBq;

    invoke-direct {v2, v13, v1}, LBq;-><init>(LK2;LK2;)V

    const-string v1, "speedometer_default"

    invoke-virtual {v8, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lmk;->l(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v3

    const-string v4, "selectedTheme"

    const-string v5, "Audi Virtual Cockpit"

    invoke-interface {v3, v4, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "prefs_"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    const-string v3, "INFO_PANEL"

    invoke-interface {v2, v3, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, LAf;->a(Ljava/lang/String;Z)LBq;

    move-result-object v3

    iput-object v3, v0, LAf;->b:LBq;

    iget-boolean v2, v0, LAf;->f:Z

    if-eqz v2, :cond_4

    iget-object v2, v3, LBq;->b:LK2;

    goto :goto_4

    :cond_4
    iget-object v2, v3, LBq;->a:LK2;

    :goto_4
    invoke-virtual {v2}, LK2;->w()[Lzf;

    move-result-object v3

    array-length v3, v3

    const/4 v4, 0x1

    sub-int/2addr v3, v4

    const-string v5, "INFO_INDEX_L"

    invoke-static {v5}, LAf;->b(Ljava/lang/String;)I

    move-result v5

    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v3

    iput v3, v0, LAf;->c:I

    invoke-virtual {v2}, LK2;->y()[Lzf;

    move-result-object v3

    array-length v3, v3

    sub-int/2addr v3, v4

    const-string v5, "INFO_INDEX_R"

    invoke-static {v5}, LAf;->b(Ljava/lang/String;)I

    move-result v5

    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v3

    iput v3, v0, LAf;->d:I

    invoke-virtual {v2}, LK2;->l()[Lzf;

    move-result-object v2

    array-length v2, v2

    sub-int/2addr v2, v4

    const-string v3, "INFO_INDEX_C"

    invoke-static {v3}, LAf;->b(Ljava/lang/String;)I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    iput v2, v0, LAf;->e:I

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "theme="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "T500.INFO_PANEL"

    invoke-static {v2, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "centralMode="

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v3, v0, LAf;->f:Z

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "extFirmware="

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move/from16 v3, v18

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "indexL="

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, v0, LAf;->c:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "indexR="

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, v0, LAf;->d:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "indexC="

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, v0, LAf;->e:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static b(Ljava/lang/String;)I
    .locals 4

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lmk;->l(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "selectedTheme"

    const-string v3, "Audi Virtual Cockpit"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "prefs_"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0, p0, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Z)LBq;
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "getInfoPanel()="

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v7, "T500.INFO_PANEL"

    invoke-static {v7, v6}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v6, LAf;->h:Ljava/util/List;

    invoke-interface {v6, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    iget-object v8, v0, LAf;->a:Ljava/util/HashMap;

    if-eqz v6, :cond_50

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v9, "preconfigured infopanels "

    invoke-direct {v6, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v7, v6}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v8, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LBq;

    if-nez v6, :cond_51

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v9, "infopanels not initialized "

    invoke-direct {v6, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v7, v6}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v15, v0, LAf;->g:LDg;

    const/high16 v16, 0x42180000    # 38.0f

    const/high16 v13, 0x41d80000    # 27.0f

    const/high16 v14, 0x42ba0000    # 93.0f

    const/high16 v9, 0x42f00000    # 120.0f

    const/high16 v2, 0x42100000    # 36.0f

    const-string v10, "speedInCenter"

    const v18, 0x7f080152

    const v19, 0x7f080094

    const-string v11, "transparentBackgroundInCenter"

    const v6, 0x7f0e017c

    const/16 v20, -0x1

    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->hashCode()I

    move-result v21

    sparse-switch v21, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v12, "Tank 500_big_oldfw"

    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_0

    goto/16 :goto_1

    :cond_0
    const/16 v12, 0x1f

    goto/16 :goto_0

    :sswitch_1
    const-string v12, "Night center_oldfw"

    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1

    goto/16 :goto_1

    :cond_1
    const/16 v12, 0x1e

    goto/16 :goto_0

    :sswitch_2
    const-string v12, "KIA mini_big_oldfw"

    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_2

    goto/16 :goto_1

    :cond_2
    const/16 v12, 0x1d

    goto/16 :goto_0

    :sswitch_3
    const-string v12, "Tank 500_oldfw"

    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_3

    goto/16 :goto_1

    :cond_3
    const/16 v12, 0x1c

    goto/16 :goto_0

    :sswitch_4
    const-string v12, "Tank 500_micro"

    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_4

    goto/16 :goto_1

    :cond_4
    const/16 v12, 0x1b

    goto/16 :goto_0

    :sswitch_5
    const-string v12, "Night center"

    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_5

    goto/16 :goto_1

    :cond_5
    const/16 v12, 0x1a

    goto/16 :goto_0

    :sswitch_6
    const-string v12, "speedometer_default_big"

    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_6

    goto/16 :goto_1

    :cond_6
    const/16 v12, 0x19

    goto/16 :goto_0

    :sswitch_7
    const-string v12, "Night center_big_oldfw"

    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_7

    goto/16 :goto_1

    :cond_7
    const/16 v12, 0x18

    goto/16 :goto_0

    :sswitch_8
    const-string v12, "KIA_oldfw"

    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_8

    goto/16 :goto_1

    :cond_8
    const/16 v12, 0x17

    goto/16 :goto_0

    :sswitch_9
    const-string v12, "Tank 500_big"

    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_9

    goto/16 :goto_1

    :cond_9
    const/16 v12, 0x16

    goto/16 :goto_0

    :sswitch_a
    const-string v12, "speedometer_default_oldfw"

    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_a

    goto/16 :goto_1

    :cond_a
    const/16 v12, 0x15

    goto/16 :goto_0

    :sswitch_b
    const-string v12, "speedometer_default_micro"

    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_b

    goto/16 :goto_1

    :cond_b
    const/16 v12, 0x14

    goto/16 :goto_0

    :sswitch_c
    const-string v12, "Digital_oldfw"

    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_c

    goto/16 :goto_1

    :cond_c
    const/16 v12, 0x13

    goto/16 :goto_0

    :sswitch_d
    const-string v12, "Digitral_micro_oldfw"

    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_d

    goto/16 :goto_1

    :cond_d
    const/16 v12, 0x12

    goto/16 :goto_0

    :sswitch_e
    const-string v12, "Digitral_micro"

    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_e

    goto/16 :goto_1

    :cond_e
    const/16 v12, 0x11

    goto/16 :goto_0

    :sswitch_f
    const-string v12, "speedometer_default_big_oldfw"

    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_f

    goto/16 :goto_1

    :cond_f
    const/16 v20, 0x10

    goto/16 :goto_1

    :sswitch_10
    const-string v12, "KIA"

    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_10

    goto/16 :goto_1

    :cond_10
    const/16 v12, 0xf

    goto/16 :goto_0

    :sswitch_11
    const-string v12, "KIA_big"

    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_11

    goto/16 :goto_1

    :cond_11
    const/16 v12, 0xe

    goto/16 :goto_0

    :sswitch_12
    const-string v12, "KIA mini"

    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_12

    goto/16 :goto_1

    :cond_12
    const/16 v12, 0xd

    goto/16 :goto_0

    :sswitch_13
    const-string v12, "KIA mini_big"

    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_13

    goto/16 :goto_1

    :cond_13
    const/16 v12, 0xc

    goto/16 :goto_0

    :sswitch_14
    const-string v12, "KIA mini_micro_oldfw"

    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_14

    goto/16 :goto_1

    :cond_14
    const/16 v12, 0xb

    goto/16 :goto_0

    :sswitch_15
    const-string v12, "Tank 500"

    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_15

    goto/16 :goto_1

    :cond_15
    const/16 v12, 0xa

    goto :goto_0

    :sswitch_16
    const-string v12, "KIA_big_oldfw"

    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_16

    goto/16 :goto_1

    :cond_16
    const/16 v12, 0x9

    goto :goto_0

    :sswitch_17
    const-string v12, "Digital"

    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_17

    goto/16 :goto_1

    :cond_17
    const/16 v12, 0x8

    goto :goto_0

    :sswitch_18
    const-string v12, "speedometer_default_micro_oldfw"

    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_18

    goto :goto_1

    :cond_18
    const/4 v12, 0x7

    goto :goto_0

    :sswitch_19
    const-string v12, "Night center_big"

    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_19

    goto :goto_1

    :cond_19
    const/4 v12, 0x6

    goto :goto_0

    :sswitch_1a
    const-string v12, "Night_micro_oldfw"

    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1a

    goto :goto_1

    :cond_1a
    const/4 v12, 0x5

    goto :goto_0

    :sswitch_1b
    const-string v12, "Digital_big"

    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1b

    goto :goto_1

    :cond_1b
    const/4 v12, 0x4

    goto :goto_0

    :sswitch_1c
    const-string v12, "Tank 500_micro_oldfw"

    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1c

    goto :goto_1

    :cond_1c
    const/4 v12, 0x3

    :goto_0
    move/from16 v20, v12

    goto :goto_1

    :sswitch_1d
    const-string v12, "KIA mini_oldfw"

    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1d

    goto :goto_1

    :cond_1d
    const/16 v20, 0x2

    goto :goto_1

    :sswitch_1e
    const-string v12, "KIA mini_micro"

    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1e

    goto :goto_1

    :cond_1e
    const/16 v20, 0x1

    goto :goto_1

    :sswitch_1f
    const-string v12, "Digital_big_oldfw"

    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1f

    goto :goto_1

    :cond_1f
    const/16 v20, 0x0

    :goto_1
    packed-switch v20, :pswitch_data_0

    goto/16 :goto_45

    :pswitch_0
    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v12

    new-instance v13, Lgp;

    invoke-direct {v13, v12, v15, v9, v2}, Lgp;-><init>(Landroid/content/Context;LDg;FF)V

    new-instance v14, Lhn;

    invoke-direct {v14, v12, v15, v9, v2}, Lhn;-><init>(Landroid/content/Context;LDg;FF)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Ltr;

    invoke-direct {v4, v12, v15}, Ltr;-><init>(Landroid/content/Context;LDg;)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v4, Lvr;

    const/high16 v5, 0x42000000    # 32.0f

    invoke-direct {v4, v12, v15, v5}, Lvr;-><init>(Landroid/content/Context;LDg;F)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v4, Ltr;

    invoke-direct {v4, v12, v15}, Ltr;-><init>(Landroid/content/Context;LDg;)V

    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v4, LOq;

    invoke-direct {v4, v12, v15, v6}, LOq;-><init>(Landroid/content/Context;LDg;I)V

    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v4, LK2;

    const/4 v5, 0x0

    const/16 v6, 0x10

    invoke-direct {v4, v6, v5}, LK2;-><init>(IZ)V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v5, v4, LK2;->b:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v4, LK2;->c:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v4, LK2;->d:Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v10, v2}, LBr;->s(Ljava/lang/String;Z)Z

    move-result v3

    invoke-static {v11, v2}, LBr;->s(Ljava/lang/String;Z)Z

    move-result v5

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    if-eqz v3, :cond_21

    new-instance v3, Ltr;

    invoke-direct {v3, v12, v15}, Ltr;-><init>(Landroid/content/Context;LDg;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Ltr;

    invoke-direct {v3, v12, v15}, Ltr;-><init>(Landroid/content/Context;LDg;)V

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Ltr;

    invoke-direct {v3, v12, v15}, Ltr;-><init>(Landroid/content/Context;LDg;)V

    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Lgp;

    if-eqz v5, :cond_20

    move/from16 v10, v18

    goto :goto_2

    :cond_20
    move/from16 v10, v19

    :goto_2
    invoke-direct {v3, v12, v15, v10}, Lgp;-><init>(Landroid/content/Context;LDg;I)V

    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_21
    invoke-virtual {v2, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v6, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Ltr;

    invoke-direct {v3, v12, v15}, Ltr;-><init>(Landroid/content/Context;LDg;)V

    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_3
    new-instance v3, Lvr;

    if-eqz v5, :cond_22

    move/from16 v11, v18

    :goto_4
    const/high16 v10, 0x42400000    # 48.0f

    goto :goto_5

    :cond_22
    move/from16 v11, v19

    goto :goto_4

    :goto_5
    invoke-direct {v3, v12, v15, v10, v11}, Lvr;-><init>(Landroid/content/Context;LDg;FI)V

    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, LOq;

    if-eqz v5, :cond_23

    move/from16 v5, v18

    :goto_6
    const v10, 0x7f0e017c

    goto :goto_7

    :cond_23
    move/from16 v5, v19

    goto :goto_6

    :goto_7
    invoke-direct {v3, v12, v15, v10, v5}, LOq;-><init>(Landroid/content/Context;LDg;II)V

    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, LK2;

    const/4 v5, 0x0

    const/16 v10, 0x10

    invoke-direct {v3, v10, v5}, LK2;-><init>(IZ)V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v5, v3, LK2;->b:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v3, LK2;->c:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v3, LK2;->d:Ljava/lang/Object;

    new-instance v2, LBq;

    invoke-direct {v2, v4, v3}, LBq;-><init>(LK2;LK2;)V

    invoke-virtual {v8, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_45

    :pswitch_1
    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v2

    new-instance v3, Lgp;

    invoke-direct {v3, v2, v15, v14, v13}, Lgp;-><init>(Landroid/content/Context;LDg;FF)V

    new-instance v4, Lhn;

    invoke-direct {v4, v2, v15, v14, v13}, Lhn;-><init>(Landroid/content/Context;LDg;FF)V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    new-instance v12, Ltr;

    invoke-direct {v12, v2, v15}, Ltr;-><init>(Landroid/content/Context;LDg;)V

    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v12, Lvr;

    const/high16 v13, 0x41c80000    # 25.0f

    invoke-direct {v12, v2, v15, v13}, Lvr;-><init>(Landroid/content/Context;LDg;F)V

    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v12, Ltr;

    invoke-direct {v12, v2, v15}, Ltr;-><init>(Landroid/content/Context;LDg;)V

    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v12, LOq;

    const v13, 0x7f0e017f

    invoke-direct {v12, v2, v15, v13}, LOq;-><init>(Landroid/content/Context;LDg;I)V

    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v12, LK2;

    const/4 v13, 0x0

    const/16 v14, 0x10

    invoke-direct {v12, v14, v13}, LK2;-><init>(IZ)V

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v13, v12, LK2;->b:Ljava/lang/Object;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v5, v12, LK2;->c:Ljava/lang/Object;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v5, v12, LK2;->d:Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-static {v10, v5}, LBr;->s(Ljava/lang/String;Z)Z

    move-result v6

    invoke-static {v11, v5}, LBr;->s(Ljava/lang/String;Z)Z

    move-result v9

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    if-eqz v6, :cond_25

    new-instance v3, Ltr;

    invoke-direct {v3, v2, v15}, Ltr;-><init>(Landroid/content/Context;LDg;)V

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Ltr;

    invoke-direct {v3, v2, v15}, Ltr;-><init>(Landroid/content/Context;LDg;)V

    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Ltr;

    invoke-direct {v3, v2, v15}, Ltr;-><init>(Landroid/content/Context;LDg;)V

    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Lgp;

    if-eqz v9, :cond_24

    move/from16 v4, v18

    goto :goto_8

    :cond_24
    move/from16 v4, v19

    :goto_8
    invoke-direct {v3, v2, v15, v4}, Lgp;-><init>(Landroid/content/Context;LDg;I)V

    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_25
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Ltr;

    invoke-direct {v3, v2, v15}, Ltr;-><init>(Landroid/content/Context;LDg;)V

    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_9
    new-instance v3, Lvr;

    if-eqz v9, :cond_26

    move/from16 v6, v18

    :goto_a
    const/high16 v4, 0x42400000    # 48.0f

    goto :goto_b

    :cond_26
    move/from16 v6, v19

    goto :goto_a

    :goto_b
    invoke-direct {v3, v2, v15, v4, v6}, Lvr;-><init>(Landroid/content/Context;LDg;FI)V

    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, LOq;

    if-eqz v9, :cond_27

    move/from16 v4, v18

    :goto_c
    const v6, 0x7f0e017c

    goto :goto_d

    :cond_27
    move/from16 v4, v19

    goto :goto_c

    :goto_d
    invoke-direct {v3, v2, v15, v6, v4}, LOq;-><init>(Landroid/content/Context;LDg;II)V

    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, LK2;

    const/4 v3, 0x0

    const/16 v4, 0x10

    invoke-direct {v2, v4, v3}, LK2;-><init>(IZ)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v3, v2, LK2;->b:Ljava/lang/Object;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v10}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v3, v2, LK2;->c:Ljava/lang/Object;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v11}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v3, v2, LK2;->d:Ljava/lang/Object;

    new-instance v3, LBq;

    invoke-direct {v3, v12, v2}, LBq;-><init>(LK2;LK2;)V

    invoke-virtual {v8, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_45

    :pswitch_2
    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v3

    new-instance v4, Lgp;

    const/high16 v5, 0x43100000    # 144.0f

    invoke-direct {v4, v3, v15, v5, v2}, Lgp;-><init>(Landroid/content/Context;LDg;FF)V

    new-instance v6, Lhn;

    invoke-direct {v6, v3, v15, v5, v2}, Lhn;-><init>(Landroid/content/Context;LDg;FF)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    const/4 v10, 0x2

    iput v10, v4, Lzf;->c:I

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v12, LV;

    const/high16 v13, 0x42140000    # 37.0f

    invoke-direct {v12, v3, v15, v13, v10}, LV;-><init>(Landroid/content/Context;LDg;FI)V

    iput v10, v12, Lzf;->c:I

    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v12, LV;

    const/4 v14, 0x0

    invoke-direct {v12, v3, v15, v13, v14}, LV;-><init>(Landroid/content/Context;LDg;FI)V

    iput v10, v12, Lzf;->c:I

    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput v10, v6, Lzf;->c:I

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v12, LV;

    const/high16 v13, 0x42140000    # 37.0f

    const/4 v14, 0x1

    invoke-direct {v12, v3, v15, v13, v14}, LV;-><init>(Landroid/content/Context;LDg;FI)V

    iput v10, v12, Lzf;->c:I

    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v12, LOq;

    const v13, 0x7f0e017c

    invoke-direct {v12, v3, v15, v13}, LOq;-><init>(Landroid/content/Context;LDg;I)V

    iput v10, v12, Lzf;->c:I

    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v14, LK2;

    const/4 v10, 0x0

    const/16 v12, 0x10

    invoke-direct {v14, v12, v10}, LK2;-><init>(IZ)V

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v10, v14, LK2;->b:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v14, LK2;->c:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v14, LK2;->d:Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v11, v2}, LBr;->s(Ljava/lang/String;Z)Z

    move-result v5

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    const/4 v10, 0x2

    iput v10, v4, Lzf;->c:I

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput v10, v6, Lzf;->c:I

    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v4, Ltr;

    invoke-direct {v4, v3, v15}, Ltr;-><init>(Landroid/content/Context;LDg;)V

    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v4, LV;

    if-eqz v5, :cond_28

    move/from16 v6, v18

    goto :goto_e

    :cond_28
    move/from16 v6, v19

    :goto_e
    const/16 v16, 0x2

    move-object v10, v4

    move-object v11, v3

    move-object v12, v15

    move-object/from16 v22, v13

    const/high16 v17, 0x42400000    # 48.0f

    move/from16 v13, v17

    move-object/from16 v23, v14

    move v14, v6

    move-object v6, v15

    move/from16 v15, v16

    invoke-direct/range {v10 .. v15}, LV;-><init>(Landroid/content/Context;LDg;FII)V

    move-object/from16 v15, v22

    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v4, LV;

    if-eqz v5, :cond_29

    move/from16 v14, v18

    goto :goto_f

    :cond_29
    move/from16 v14, v19

    :goto_f
    const/16 v16, 0x1

    move-object v10, v4

    move-object v11, v3

    move-object v12, v6

    const/high16 v17, 0x42400000    # 48.0f

    move/from16 v13, v17

    move-object v0, v15

    move/from16 v15, v16

    invoke-direct/range {v10 .. v15}, LV;-><init>(Landroid/content/Context;LDg;FII)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v4, LV;

    if-eqz v5, :cond_2a

    move/from16 v14, v18

    goto :goto_10

    :cond_2a
    move/from16 v14, v19

    :goto_10
    const/4 v15, 0x0

    move-object v10, v4

    move-object v11, v3

    move-object v12, v6

    const/high16 v13, 0x42400000    # 48.0f

    invoke-direct/range {v10 .. v15}, LV;-><init>(Landroid/content/Context;LDg;FII)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v4, LOq;

    if-eqz v5, :cond_2b

    move/from16 v5, v18

    :goto_11
    const v10, 0x7f0e017c

    goto :goto_12

    :cond_2b
    move/from16 v5, v19

    goto :goto_11

    :goto_12
    invoke-direct {v4, v3, v6, v10, v5}, LOq;-><init>(Landroid/content/Context;LDg;II)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, LK2;

    const/4 v4, 0x0

    const/16 v5, 0x10

    invoke-direct {v3, v5, v4}, LK2;-><init>(IZ)V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v4, v3, LK2;->b:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v3, LK2;->c:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v3, LK2;->d:Ljava/lang/Object;

    new-instance v0, LBq;

    move-object/from16 v2, v23

    invoke-direct {v0, v2, v3}, LBq;-><init>(LK2;LK2;)V

    invoke-virtual {v8, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_45

    :pswitch_3
    move-object v6, v15

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, LV;

    const/4 v15, 0x6

    move-object v10, v5

    move-object v11, v0

    move-object v12, v6

    const v9, 0x7f080096

    move/from16 v13, v16

    move v14, v9

    invoke-direct/range {v10 .. v15}, LV;-><init>(Landroid/content/Context;LDg;FII)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v5, LOq;

    const v15, 0x7f0e017e

    invoke-direct {v5, v0, v6, v15, v9}, LOq;-><init>(Landroid/content/Context;LDg;II)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, LK2;

    const/4 v5, 0x0

    const/16 v6, 0x10

    invoke-direct {v0, v6, v5}, LK2;-><init>(IZ)V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v5, v0, LK2;->b:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v0, LK2;->c:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v0, LK2;->d:Ljava/lang/Object;

    new-instance v2, LBq;

    invoke-direct {v2, v0, v0}, LBq;-><init>(LK2;LK2;)V

    invoke-virtual {v8, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_45

    :pswitch_4
    move-object v6, v15

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v0

    new-instance v3, Lgp;

    invoke-direct {v3, v0, v6, v9, v2}, Lgp;-><init>(Landroid/content/Context;LDg;FF)V

    new-instance v4, Lhn;

    invoke-direct {v4, v0, v6, v9, v2}, Lhn;-><init>(Landroid/content/Context;LDg;FF)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    new-instance v12, Ltr;

    invoke-direct {v12, v0, v6}, Ltr;-><init>(Landroid/content/Context;LDg;)V

    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v12, LV;

    const/high16 v13, 0x41f00000    # 30.0f

    const/4 v14, 0x2

    invoke-direct {v12, v0, v6, v13, v14}, LV;-><init>(Landroid/content/Context;LDg;FI)V

    iput v14, v12, Lzf;->c:I

    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v12, LV;

    const/4 v15, 0x0

    invoke-direct {v12, v0, v6, v13, v15}, LV;-><init>(Landroid/content/Context;LDg;FI)V

    iput v14, v12, Lzf;->c:I

    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v12, Ltr;

    invoke-direct {v12, v0, v6}, Ltr;-><init>(Landroid/content/Context;LDg;)V

    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v12, LV;

    const/4 v14, 0x1

    invoke-direct {v12, v0, v6, v13, v14}, LV;-><init>(Landroid/content/Context;LDg;FI)V

    const/4 v13, 0x2

    iput v13, v12, Lzf;->c:I

    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v12, LOq;

    const v13, 0x7f0e017c

    invoke-direct {v12, v0, v6, v13}, LOq;-><init>(Landroid/content/Context;LDg;I)V

    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v15, LK2;

    const/4 v12, 0x0

    const/16 v13, 0x10

    invoke-direct {v15, v13, v12}, LK2;-><init>(IZ)V

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v12, v15, LK2;->b:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v15, LK2;->c:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v15, LK2;->d:Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v10, v2}, LBr;->s(Ljava/lang/String;Z)Z

    move-result v5

    invoke-static {v11, v2}, LBr;->s(Ljava/lang/String;Z)Z

    move-result v9

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    if-eqz v5, :cond_2d

    new-instance v3, Ltr;

    invoke-direct {v3, v0, v6}, Ltr;-><init>(Landroid/content/Context;LDg;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Ltr;

    invoke-direct {v3, v0, v6}, Ltr;-><init>(Landroid/content/Context;LDg;)V

    invoke-virtual {v14, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Ltr;

    invoke-direct {v3, v0, v6}, Ltr;-><init>(Landroid/content/Context;LDg;)V

    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Lgp;

    if-eqz v9, :cond_2c

    move/from16 v4, v18

    goto :goto_13

    :cond_2c
    move/from16 v4, v19

    :goto_13
    invoke-direct {v3, v0, v6, v4}, Lgp;-><init>(Landroid/content/Context;LDg;I)V

    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_14

    :cond_2d
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v14, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Ltr;

    invoke-direct {v3, v0, v6}, Ltr;-><init>(Landroid/content/Context;LDg;)V

    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_14
    new-instance v3, LV;

    if-eqz v9, :cond_2e

    move/from16 v4, v18

    goto :goto_15

    :cond_2e
    move/from16 v4, v19

    :goto_15
    const/4 v5, 0x2

    move-object v10, v3

    move-object v11, v0

    move-object v12, v6

    move-object/from16 v24, v13

    const/high16 v16, 0x42400000    # 48.0f

    move/from16 v13, v16

    move-object/from16 v25, v14

    move v14, v4

    move-object v4, v15

    move v15, v5

    invoke-direct/range {v10 .. v15}, LV;-><init>(Landroid/content/Context;LDg;FII)V

    move-object/from16 v5, v24

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, LV;

    if-eqz v9, :cond_2f

    move/from16 v14, v18

    goto :goto_16

    :cond_2f
    move/from16 v14, v19

    :goto_16
    const/4 v15, 0x1

    move-object v10, v3

    move-object v11, v0

    move-object v12, v6

    const/high16 v16, 0x42400000    # 48.0f

    move/from16 v13, v16

    invoke-direct/range {v10 .. v15}, LV;-><init>(Landroid/content/Context;LDg;FII)V

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, LV;

    if-eqz v9, :cond_30

    move/from16 v14, v18

    goto :goto_17

    :cond_30
    move/from16 v14, v19

    :goto_17
    const/4 v15, 0x0

    move-object v10, v3

    move-object v11, v0

    move-object v12, v6

    const/high16 v13, 0x42400000    # 48.0f

    invoke-direct/range {v10 .. v15}, LV;-><init>(Landroid/content/Context;LDg;FII)V

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, LOq;

    if-eqz v9, :cond_31

    move/from16 v9, v18

    :goto_18
    const v10, 0x7f0e017c

    goto :goto_19

    :cond_31
    move/from16 v9, v19

    goto :goto_18

    :goto_19
    invoke-direct {v3, v0, v6, v10, v9}, LOq;-><init>(Landroid/content/Context;LDg;II)V

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, LK2;

    const/4 v3, 0x0

    const/16 v6, 0x10

    invoke-direct {v0, v6, v3}, LK2;-><init>(IZ)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v3, v0, LK2;->b:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    move-object/from16 v3, v25

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v0, LK2;->c:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v0, LK2;->d:Ljava/lang/Object;

    new-instance v2, LBq;

    invoke-direct {v2, v4, v0}, LBq;-><init>(LK2;LK2;)V

    invoke-virtual {v8, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_45

    :pswitch_5
    move-object v6, v15

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v0

    new-instance v3, Lgp;

    invoke-direct {v3, v0, v6, v9, v2}, Lgp;-><init>(Landroid/content/Context;LDg;FF)V

    new-instance v4, Lhn;

    invoke-direct {v4, v0, v6, v9, v2}, Lhn;-><init>(Landroid/content/Context;LDg;FF)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    const/4 v10, 0x2

    iput v10, v3, Lzf;->c:I

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v12, Lvr;

    const/high16 v13, 0x41e80000    # 29.0f

    invoke-direct {v12, v0, v6, v13}, Lvr;-><init>(Landroid/content/Context;LDg;F)V

    iput v10, v12, Lzf;->c:I

    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput v10, v4, Lzf;->c:I

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v12, LOq;

    const v13, 0x7f0e017f

    invoke-direct {v12, v0, v6, v13}, LOq;-><init>(Landroid/content/Context;LDg;I)V

    iput v10, v12, Lzf;->c:I

    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v10, LK2;

    const/4 v12, 0x0

    const/16 v13, 0x10

    invoke-direct {v10, v13, v12}, LK2;-><init>(IZ)V

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v12, v10, LK2;->b:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v10, LK2;->c:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v10, LK2;->d:Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v11, v2}, LBr;->s(Ljava/lang/String;Z)Z

    move-result v5

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    const/4 v12, 0x2

    iput v12, v3, Lzf;->c:I

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput v12, v4, Lzf;->c:I

    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Ltr;

    invoke-direct {v3, v0, v6}, Ltr;-><init>(Landroid/content/Context;LDg;)V

    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Lvr;

    if-eqz v5, :cond_32

    move/from16 v12, v18

    :goto_1a
    const/high16 v4, 0x42400000    # 48.0f

    goto :goto_1b

    :cond_32
    move/from16 v12, v19

    goto :goto_1a

    :goto_1b
    invoke-direct {v3, v0, v6, v4, v12}, Lvr;-><init>(Landroid/content/Context;LDg;FI)V

    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, LOq;

    if-eqz v5, :cond_33

    move/from16 v4, v18

    :goto_1c
    const v5, 0x7f0e017c

    goto :goto_1d

    :cond_33
    move/from16 v4, v19

    goto :goto_1c

    :goto_1d
    invoke-direct {v3, v0, v6, v5, v4}, LOq;-><init>(Landroid/content/Context;LDg;II)V

    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, LK2;

    const/4 v3, 0x0

    const/16 v4, 0x10

    invoke-direct {v0, v4, v3}, LK2;-><init>(IZ)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v3, v0, LK2;->b:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v0, LK2;->c:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v11}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v0, LK2;->d:Ljava/lang/Object;

    new-instance v2, LBq;

    invoke-direct {v2, v10, v0}, LBq;-><init>(LK2;LK2;)V

    invoke-virtual {v8, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_45

    :pswitch_6
    move-object v6, v15

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v0

    new-instance v2, Lgp;

    const/high16 v3, 0x41c00000    # 24.0f

    const/high16 v4, 0x42ac0000    # 86.0f

    invoke-direct {v2, v0, v6, v4, v3}, Lgp;-><init>(Landroid/content/Context;LDg;FF)V

    new-instance v5, Lhn;

    invoke-direct {v5, v0, v6, v4, v3}, Lhn;-><init>(Landroid/content/Context;LDg;FF)V

    const/4 v3, 0x0

    invoke-static {v10, v3}, LBr;->s(Ljava/lang/String;Z)Z

    move-result v4

    invoke-static {v11, v3}, LBr;->s(Ljava/lang/String;Z)Z

    move-result v9

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    if-eqz v4, :cond_35

    new-instance v4, Ltr;

    invoke-direct {v4, v0, v6}, Ltr;-><init>(Landroid/content/Context;LDg;)V

    invoke-virtual {v14, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v4, Lgp;

    if-eqz v9, :cond_34

    move/from16 v10, v18

    goto :goto_1e

    :cond_34
    move/from16 v10, v19

    :goto_1e
    invoke-direct {v4, v0, v6, v10}, Lgp;-><init>(Landroid/content/Context;LDg;I)V

    invoke-virtual {v14, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1f
    const/4 v4, 0x2

    goto :goto_20

    :cond_35
    new-instance v4, Ltr;

    invoke-direct {v4, v0, v6}, Ltr;-><init>(Landroid/content/Context;LDg;)V

    invoke-virtual {v14, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1f

    :goto_20
    iput v4, v2, Lzf;->c:I

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput v4, v5, Lzf;->c:I

    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, LV;

    if-eqz v9, :cond_36

    move/from16 v4, v18

    goto :goto_21

    :cond_36
    move/from16 v4, v19

    :goto_21
    const/4 v5, 0x2

    move-object v10, v2

    move-object v11, v0

    move-object v12, v6

    const/high16 v16, 0x42400000    # 48.0f

    move/from16 v13, v16

    move-object/from16 v26, v14

    move v14, v4

    move-object v4, v15

    move v15, v5

    invoke-direct/range {v10 .. v15}, LV;-><init>(Landroid/content/Context;LDg;FII)V

    move-object/from16 v5, v26

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, LV;

    if-eqz v9, :cond_37

    move/from16 v14, v18

    goto :goto_22

    :cond_37
    move/from16 v14, v19

    :goto_22
    const/4 v15, 0x1

    move-object v10, v2

    move-object v11, v0

    move-object v12, v6

    const/high16 v16, 0x42400000    # 48.0f

    move/from16 v13, v16

    invoke-direct/range {v10 .. v15}, LV;-><init>(Landroid/content/Context;LDg;FII)V

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, LV;

    if-eqz v9, :cond_38

    move/from16 v14, v18

    goto :goto_23

    :cond_38
    move/from16 v14, v19

    :goto_23
    const/4 v15, 0x0

    move-object v10, v2

    move-object v11, v0

    move-object v12, v6

    const/high16 v13, 0x42400000    # 48.0f

    invoke-direct/range {v10 .. v15}, LV;-><init>(Landroid/content/Context;LDg;FII)V

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, LOq;

    if-eqz v9, :cond_39

    move/from16 v9, v18

    :goto_24
    const v10, 0x7f0e017c

    goto :goto_25

    :cond_39
    move/from16 v9, v19

    goto :goto_24

    :goto_25
    invoke-direct {v2, v0, v6, v10, v9}, LOq;-><init>(Landroid/content/Context;LDg;II)V

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, LK2;

    const/4 v2, 0x0

    const/16 v6, 0x10

    invoke-direct {v0, v6, v2}, LK2;-><init>(IZ)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v0, LK2;->b:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v0, LK2;->c:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v0, LK2;->d:Ljava/lang/Object;

    new-instance v2, LBq;

    invoke-direct {v2, v0, v0}, LBq;-><init>(LK2;LK2;)V

    invoke-virtual {v8, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_45

    :pswitch_7
    move-object v6, v15

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v0

    new-instance v3, Lgp;

    const/high16 v4, 0x43100000    # 144.0f

    invoke-direct {v3, v0, v6, v4, v2}, Lgp;-><init>(Landroid/content/Context;LDg;FF)V

    new-instance v5, Lhn;

    invoke-direct {v5, v0, v6, v4, v2}, Lhn;-><init>(Landroid/content/Context;LDg;FF)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    const/4 v10, 0x2

    iput v10, v3, Lzf;->c:I

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v12, Lvr;

    const/high16 v13, 0x42140000    # 37.0f

    invoke-direct {v12, v0, v6, v13}, Lvr;-><init>(Landroid/content/Context;LDg;F)V

    iput v10, v12, Lzf;->c:I

    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput v10, v5, Lzf;->c:I

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v12, LOq;

    const v13, 0x7f0e017c

    invoke-direct {v12, v0, v6, v13}, LOq;-><init>(Landroid/content/Context;LDg;I)V

    iput v10, v12, Lzf;->c:I

    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v10, LK2;

    const/4 v12, 0x0

    const/16 v13, 0x10

    invoke-direct {v10, v13, v12}, LK2;-><init>(IZ)V

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v12, v10, LK2;->b:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v10, LK2;->c:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v10, LK2;->d:Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {v11, v2}, LBr;->s(Ljava/lang/String;Z)Z

    move-result v4

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    const/4 v12, 0x2

    iput v12, v3, Lzf;->c:I

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput v12, v5, Lzf;->c:I

    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Ltr;

    invoke-direct {v3, v0, v6}, Ltr;-><init>(Landroid/content/Context;LDg;)V

    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Lvr;

    if-eqz v4, :cond_3a

    move/from16 v12, v18

    :goto_26
    const/high16 v5, 0x42400000    # 48.0f

    goto :goto_27

    :cond_3a
    move/from16 v12, v19

    goto :goto_26

    :goto_27
    invoke-direct {v3, v0, v6, v5, v12}, Lvr;-><init>(Landroid/content/Context;LDg;FI)V

    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, LOq;

    if-eqz v4, :cond_3b

    move/from16 v4, v18

    :goto_28
    const v5, 0x7f0e017c

    goto :goto_29

    :cond_3b
    move/from16 v4, v19

    goto :goto_28

    :goto_29
    invoke-direct {v3, v0, v6, v5, v4}, LOq;-><init>(Landroid/content/Context;LDg;II)V

    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, LK2;

    const/4 v3, 0x0

    const/16 v4, 0x10

    invoke-direct {v0, v4, v3}, LK2;-><init>(IZ)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v3, v0, LK2;->b:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v0, LK2;->c:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v11}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v0, LK2;->d:Ljava/lang/Object;

    new-instance v2, LBq;

    invoke-direct {v2, v10, v0}, LBq;-><init>(LK2;LK2;)V

    invoke-virtual {v8, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_45

    :pswitch_8
    move-object v6, v15

    invoke-static {v6}, LUd;->v(LDg;)LBq;

    move-result-object v0

    invoke-virtual {v8, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_45

    :pswitch_9
    move-object v6, v15

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v0

    new-instance v2, Lgp;

    invoke-direct {v2, v0, v6, v14, v13}, Lgp;-><init>(Landroid/content/Context;LDg;FF)V

    new-instance v3, Lhn;

    invoke-direct {v3, v0, v6, v14, v13}, Lhn;-><init>(Landroid/content/Context;LDg;FF)V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    new-instance v12, Ltr;

    invoke-direct {v12, v0, v6}, Ltr;-><init>(Landroid/content/Context;LDg;)V

    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v12, LV;

    const/high16 v13, 0x41c80000    # 25.0f

    const/4 v14, 0x2

    invoke-direct {v12, v0, v6, v13, v14}, LV;-><init>(Landroid/content/Context;LDg;FI)V

    iput v14, v12, Lzf;->c:I

    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v12, LV;

    const/4 v15, 0x0

    invoke-direct {v12, v0, v6, v13, v15}, LV;-><init>(Landroid/content/Context;LDg;FI)V

    iput v14, v12, Lzf;->c:I

    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v12, Ltr;

    invoke-direct {v12, v0, v6}, Ltr;-><init>(Landroid/content/Context;LDg;)V

    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput v14, v3, Lzf;->c:I

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v12, LV;

    const/high16 v13, 0x41c80000    # 25.0f

    const/4 v15, 0x1

    invoke-direct {v12, v0, v6, v13, v15}, LV;-><init>(Landroid/content/Context;LDg;FI)V

    iput v14, v12, Lzf;->c:I

    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v12, LOq;

    const v13, 0x7f0e017f

    invoke-direct {v12, v0, v6, v13}, LOq;-><init>(Landroid/content/Context;LDg;I)V

    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v15, LK2;

    const/4 v12, 0x0

    const/16 v13, 0x10

    invoke-direct {v15, v13, v12}, LK2;-><init>(IZ)V

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v12, v15, LK2;->b:Ljava/lang/Object;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v4, v15, LK2;->c:Ljava/lang/Object;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v4, v15, LK2;->d:Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-static {v10, v4}, LBr;->s(Ljava/lang/String;Z)Z

    move-result v5

    invoke-static {v11, v4}, LBr;->s(Ljava/lang/String;Z)Z

    move-result v9

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    if-eqz v5, :cond_3d

    new-instance v2, Ltr;

    invoke-direct {v2, v0, v6}, Ltr;-><init>(Landroid/content/Context;LDg;)V

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Ltr;

    invoke-direct {v2, v0, v6}, Ltr;-><init>(Landroid/content/Context;LDg;)V

    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Ltr;

    invoke-direct {v2, v0, v6}, Ltr;-><init>(Landroid/content/Context;LDg;)V

    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Lgp;

    if-eqz v9, :cond_3c

    move/from16 v3, v18

    goto :goto_2a

    :cond_3c
    move/from16 v3, v19

    :goto_2a
    invoke-direct {v2, v0, v6, v3}, Lgp;-><init>(Landroid/content/Context;LDg;I)V

    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2b

    :cond_3d
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v14, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Ltr;

    invoke-direct {v2, v0, v6}, Ltr;-><init>(Landroid/content/Context;LDg;)V

    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2b
    new-instance v2, LV;

    if-eqz v9, :cond_3e

    move/from16 v3, v18

    goto :goto_2c

    :cond_3e
    move/from16 v3, v19

    :goto_2c
    const/4 v5, 0x2

    move-object v10, v2

    move-object v11, v0

    move-object v12, v6

    move-object/from16 v27, v13

    const/high16 v16, 0x42400000    # 48.0f

    move/from16 v13, v16

    move-object/from16 v28, v14

    move v14, v3

    move-object v3, v15

    move v15, v5

    invoke-direct/range {v10 .. v15}, LV;-><init>(Landroid/content/Context;LDg;FII)V

    move-object/from16 v5, v27

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, LV;

    if-eqz v9, :cond_3f

    move/from16 v14, v18

    goto :goto_2d

    :cond_3f
    move/from16 v14, v19

    :goto_2d
    const/4 v15, 0x1

    move-object v10, v2

    move-object v11, v0

    move-object v12, v6

    const/high16 v16, 0x42400000    # 48.0f

    move/from16 v13, v16

    invoke-direct/range {v10 .. v15}, LV;-><init>(Landroid/content/Context;LDg;FII)V

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, LV;

    if-eqz v9, :cond_40

    move/from16 v14, v18

    goto :goto_2e

    :cond_40
    move/from16 v14, v19

    :goto_2e
    const/4 v15, 0x0

    move-object v10, v2

    move-object v11, v0

    move-object v12, v6

    const/high16 v13, 0x42400000    # 48.0f

    invoke-direct/range {v10 .. v15}, LV;-><init>(Landroid/content/Context;LDg;FII)V

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, LOq;

    if-eqz v9, :cond_41

    move/from16 v9, v18

    :goto_2f
    const v10, 0x7f0e017c

    goto :goto_30

    :cond_41
    move/from16 v9, v19

    goto :goto_2f

    :goto_30
    invoke-direct {v2, v0, v6, v10, v9}, LOq;-><init>(Landroid/content/Context;LDg;II)V

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, LK2;

    const/4 v2, 0x0

    const/16 v6, 0x10

    invoke-direct {v0, v6, v2}, LK2;-><init>(IZ)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v0, LK2;->b:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    move-object/from16 v4, v28

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v0, LK2;->c:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v0, LK2;->d:Ljava/lang/Object;

    new-instance v2, LBq;

    invoke-direct {v2, v3, v0}, LBq;-><init>(LK2;LK2;)V

    invoke-virtual {v8, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_45

    :pswitch_a
    move-object v6, v15

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v0

    new-instance v2, Lgp;

    const/high16 v3, 0x41c00000    # 24.0f

    const/high16 v4, 0x42ac0000    # 86.0f

    invoke-direct {v2, v0, v6, v4, v3}, Lgp;-><init>(Landroid/content/Context;LDg;FF)V

    new-instance v5, Lhn;

    invoke-direct {v5, v0, v6, v4, v3}, Lhn;-><init>(Landroid/content/Context;LDg;FF)V

    const/4 v3, 0x0

    invoke-static {v10, v3}, LBr;->s(Ljava/lang/String;Z)Z

    move-result v4

    invoke-static {v11, v3}, LBr;->s(Ljava/lang/String;Z)Z

    move-result v9

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    if-eqz v4, :cond_43

    new-instance v4, Ltr;

    invoke-direct {v4, v0, v6}, Ltr;-><init>(Landroid/content/Context;LDg;)V

    invoke-virtual {v11, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v4, Lgp;

    if-eqz v9, :cond_42

    move/from16 v12, v18

    goto :goto_31

    :cond_42
    move/from16 v12, v19

    :goto_31
    invoke-direct {v4, v0, v6, v12}, Lgp;-><init>(Landroid/content/Context;LDg;I)V

    invoke-virtual {v11, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_32
    const/4 v4, 0x2

    goto :goto_33

    :cond_43
    new-instance v4, Ltr;

    invoke-direct {v4, v0, v6}, Ltr;-><init>(Landroid/content/Context;LDg;)V

    invoke-virtual {v11, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_32

    :goto_33
    iput v4, v2, Lzf;->c:I

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput v4, v5, Lzf;->c:I

    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Lvr;

    if-eqz v9, :cond_44

    move/from16 v5, v18

    :goto_34
    const/high16 v4, 0x42400000    # 48.0f

    goto :goto_35

    :cond_44
    move/from16 v5, v19

    goto :goto_34

    :goto_35
    invoke-direct {v2, v0, v6, v4, v5}, Lvr;-><init>(Landroid/content/Context;LDg;FI)V

    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, LOq;

    if-eqz v9, :cond_45

    move/from16 v4, v18

    :goto_36
    const v5, 0x7f0e017c

    goto :goto_37

    :cond_45
    move/from16 v4, v19

    goto :goto_36

    :goto_37
    invoke-direct {v2, v0, v6, v5, v4}, LOq;-><init>(Landroid/content/Context;LDg;II)V

    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, LK2;

    const/4 v2, 0x0

    const/16 v4, 0x10

    invoke-direct {v0, v4, v2}, LK2;-><init>(IZ)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v0, LK2;->b:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v10}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v0, LK2;->c:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v11}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v0, LK2;->d:Ljava/lang/Object;

    new-instance v2, LBq;

    invoke-direct {v2, v0, v0}, LBq;-><init>(LK2;LK2;)V

    invoke-virtual {v8, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_45

    :pswitch_b
    move-object v6, v15

    const v9, 0x7f080096

    const v15, 0x7f0e017e

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, LV;

    const/16 v17, 0x5

    move-object v10, v5

    move-object v11, v0

    move-object v12, v6

    move/from16 v13, v16

    move v14, v9

    move/from16 v15, v17

    invoke-direct/range {v10 .. v15}, LV;-><init>(Landroid/content/Context;LDg;FII)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v5, LV;

    const/4 v15, 0x4

    move-object v10, v5

    move-object v11, v0

    move-object v12, v6

    move/from16 v13, v16

    move v14, v9

    invoke-direct/range {v10 .. v15}, LV;-><init>(Landroid/content/Context;LDg;FII)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v5, LV;

    const/4 v15, 0x3

    move-object v10, v5

    move-object v11, v0

    move-object v12, v6

    move/from16 v13, v16

    move v14, v9

    invoke-direct/range {v10 .. v15}, LV;-><init>(Landroid/content/Context;LDg;FII)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v5, LOq;

    const v10, 0x7f0e017e

    invoke-direct {v5, v0, v6, v10, v9}, LOq;-><init>(Landroid/content/Context;LDg;II)V

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, LK2;

    const/4 v5, 0x0

    const/16 v6, 0x10

    invoke-direct {v0, v6, v5}, LK2;-><init>(IZ)V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v5, v0, LK2;->b:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v0, LK2;->c:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v0, LK2;->d:Ljava/lang/Object;

    new-instance v2, LBq;

    invoke-direct {v2, v0, v0}, LBq;-><init>(LK2;LK2;)V

    invoke-virtual {v8, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_45

    :pswitch_c
    move-object v6, v15

    invoke-static {v6}, LUd;->v(LDg;)LBq;

    move-result-object v0

    invoke-virtual {v8, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_45

    :pswitch_d
    move-object v6, v15

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v10, v2}, LBr;->s(Ljava/lang/String;Z)Z

    move-result v3

    invoke-static {v11, v2}, LBr;->s(Ljava/lang/String;Z)Z

    move-result v4

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    if-eqz v3, :cond_47

    new-instance v3, Ltr;

    invoke-direct {v3, v0, v6}, Ltr;-><init>(Landroid/content/Context;LDg;)V

    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Lgp;

    if-eqz v4, :cond_46

    move/from16 v10, v18

    goto :goto_38

    :cond_46
    move/from16 v10, v19

    :goto_38
    invoke-direct {v3, v0, v6, v10}, Lgp;-><init>(Landroid/content/Context;LDg;I)V

    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_39

    :cond_47
    new-instance v3, Ltr;

    invoke-direct {v3, v0, v6}, Ltr;-><init>(Landroid/content/Context;LDg;)V

    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_39
    new-instance v3, Lvr;

    if-eqz v4, :cond_48

    move/from16 v11, v18

    :goto_3a
    const/high16 v10, 0x42400000    # 48.0f

    goto :goto_3b

    :cond_48
    move/from16 v11, v19

    goto :goto_3a

    :goto_3b
    invoke-direct {v3, v0, v6, v10, v11}, Lvr;-><init>(Landroid/content/Context;LDg;FI)V

    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, LOq;

    if-eqz v4, :cond_49

    move/from16 v4, v18

    :goto_3c
    const v10, 0x7f0e017c

    goto :goto_3d

    :cond_49
    move/from16 v4, v19

    goto :goto_3c

    :goto_3d
    invoke-direct {v3, v0, v6, v10, v4}, LOq;-><init>(Landroid/content/Context;LDg;II)V

    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, LK2;

    const/4 v3, 0x0

    const/16 v4, 0x10

    invoke-direct {v0, v4, v3}, LK2;-><init>(IZ)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v3, v0, LK2;->b:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v0, LK2;->c:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v0, LK2;->d:Ljava/lang/Object;

    new-instance v2, LBq;

    invoke-direct {v2, v0, v0}, LBq;-><init>(LK2;LK2;)V

    invoke-virtual {v8, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_45

    :pswitch_e
    move-object v6, v15

    invoke-static {v6}, LUd;->w(LDg;)LBq;

    move-result-object v0

    invoke-virtual {v8, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_45

    :pswitch_f
    move-object v6, v15

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v0

    const/4 v2, 0x0

    invoke-static {v10, v2}, LBr;->s(Ljava/lang/String;Z)Z

    move-result v3

    invoke-static {v11, v2}, LBr;->s(Ljava/lang/String;Z)Z

    move-result v4

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    if-eqz v3, :cond_4b

    new-instance v3, Ltr;

    invoke-direct {v3, v0, v6}, Ltr;-><init>(Landroid/content/Context;LDg;)V

    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, Lgp;

    if-eqz v4, :cond_4a

    move/from16 v10, v18

    goto :goto_3e

    :cond_4a
    move/from16 v10, v19

    :goto_3e
    invoke-direct {v3, v0, v6, v10}, Lgp;-><init>(Landroid/content/Context;LDg;I)V

    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3f

    :cond_4b
    new-instance v3, Ltr;

    invoke-direct {v3, v0, v6}, Ltr;-><init>(Landroid/content/Context;LDg;)V

    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_3f
    new-instance v3, LV;

    if-eqz v4, :cond_4c

    move/from16 v14, v18

    goto :goto_40

    :cond_4c
    move/from16 v14, v19

    :goto_40
    const/4 v15, 0x2

    move-object v10, v3

    move-object v11, v0

    move-object v12, v6

    const/high16 v16, 0x42400000    # 48.0f

    move/from16 v13, v16

    invoke-direct/range {v10 .. v15}, LV;-><init>(Landroid/content/Context;LDg;FII)V

    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, LV;

    if-eqz v4, :cond_4d

    move/from16 v14, v18

    goto :goto_41

    :cond_4d
    move/from16 v14, v19

    :goto_41
    const/4 v15, 0x1

    move-object v10, v3

    move-object v11, v0

    move-object v12, v6

    const/high16 v16, 0x42400000    # 48.0f

    move/from16 v13, v16

    invoke-direct/range {v10 .. v15}, LV;-><init>(Landroid/content/Context;LDg;FII)V

    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, LV;

    if-eqz v4, :cond_4e

    move/from16 v14, v18

    goto :goto_42

    :cond_4e
    move/from16 v14, v19

    :goto_42
    const/4 v15, 0x0

    move-object v10, v3

    move-object v11, v0

    move-object v12, v6

    const/high16 v13, 0x42400000    # 48.0f

    invoke-direct/range {v10 .. v15}, LV;-><init>(Landroid/content/Context;LDg;FII)V

    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v3, LOq;

    if-eqz v4, :cond_4f

    move/from16 v4, v18

    :goto_43
    const v10, 0x7f0e017c

    goto :goto_44

    :cond_4f
    move/from16 v4, v19

    goto :goto_43

    :goto_44
    invoke-direct {v3, v0, v6, v10, v4}, LOq;-><init>(Landroid/content/Context;LDg;II)V

    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, LK2;

    const/4 v3, 0x0

    const/16 v4, 0x10

    invoke-direct {v0, v4, v3}, LK2;-><init>(IZ)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v3, v0, LK2;->b:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v0, LK2;->c:Ljava/lang/Object;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v0, LK2;->d:Ljava/lang/Object;

    new-instance v2, LBq;

    invoke-direct {v2, v0, v0}, LBq;-><init>(LK2;LK2;)V

    invoke-virtual {v8, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_45

    :pswitch_10
    move-object v6, v15

    invoke-static {v6}, LUd;->w(LDg;)LBq;

    move-result-object v0

    invoke-virtual {v8, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_45
    invoke-virtual {v8, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, LBq;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "infopanels ="

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_46

    :cond_50
    const/4 v6, 0x0

    :cond_51
    :goto_46
    if-nez v6, :cond_52

    if-eqz p2, :cond_52

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "geting default infopanel for "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, v0}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "speedometer_default"

    invoke-virtual {v8, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, LBq;

    :cond_52
    return-object v6

    :sswitch_data_0
    .sparse-switch
        -0x7ec7a84e -> :sswitch_1f
        -0x6f23d587 -> :sswitch_1e
        -0x6f064713 -> :sswitch_1d
        -0x61703f63 -> :sswitch_1c
        -0x5a4589c7 -> :sswitch_1b
        -0x474215ca -> :sswitch_1a
        -0x46bc80c2 -> :sswitch_19
        -0x46bb0ebf -> :sswitch_18
        -0x39ce7a08 -> :sswitch_17
        -0x2a07a563 -> :sswitch_16
        -0x1d389321 -> :sswitch_15
        -0x152e240e -> :sswitch_14
        -0xb922e0b -> :sswitch_13
        -0xa7fe04c -> :sswitch_12
        -0x3a3a9c -> :sswitch_11
        0x122a3 -> :sswitch_10
        0x555137d -> :sswitch_f
        0xa6f65b5 -> :sswitch_e
        0x1fc2ba2e -> :sswitch_d
        0x21ae5c31 -> :sswitch_c
        0x23612708 -> :sswitch_b
        0x237eb57c -> :sswitch_a
        0x25a491a0 -> :sswitch_9
        0x26228c9c -> :sswitch_8
        0x2a95c8f7 -> :sswitch_7
        0x3dd6a644 -> :sswitch_6
        0x4cc9d97d -> :sswitch_5
        0x4f61ab64 -> :sswitch_4
        0x4f7f39d8 -> :sswitch_3
        0x6dcef66e -> :sswitch_2
        0x771937f6 -> :sswitch_1
        0x7a8409d9 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_d
        :pswitch_b
        :pswitch_a
        :pswitch_c
        :pswitch_10
        :pswitch_9
        :pswitch_d
        :pswitch_8
        :pswitch_8
        :pswitch_c
        :pswitch_c
        :pswitch_7
        :pswitch_f
        :pswitch_d
        :pswitch_10
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_10
        :pswitch_3
        :pswitch_2
        :pswitch_b
        :pswitch_f
        :pswitch_1
        :pswitch_e
        :pswitch_3
        :pswitch_0
    .end packed-switch
.end method

.method public final c()Lzf;
    .locals 3

    iget-boolean v0, p0, LAf;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LAf;->b:LBq;

    iget-object v0, v0, LBq;->b:LK2;

    goto :goto_0

    :cond_0
    iget-object v0, p0, LAf;->b:LBq;

    iget-object v0, v0, LBq;->a:LK2;

    :goto_0
    iget v1, p0, LAf;->c:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, LK2;->w()[Lzf;

    move-result-object v0

    iget v1, p0, LAf;->c:I

    aget-object v0, v0, v1

    :goto_1
    return-object v0
.end method

.method public final d()Lzf;
    .locals 3

    iget-boolean v0, p0, LAf;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LAf;->b:LBq;

    iget-object v0, v0, LBq;->b:LK2;

    goto :goto_0

    :cond_0
    iget-object v0, p0, LAf;->b:LBq;

    iget-object v0, v0, LBq;->a:LK2;

    :goto_0
    iget v1, p0, LAf;->d:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_1

    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, LK2;->y()[Lzf;

    move-result-object v0

    iget v1, p0, LAf;->d:I

    aget-object v0, v0, v1

    :goto_1
    return-object v0
.end method

.method public final e()V
    .locals 3

    iget-boolean v0, p0, LAf;->f:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LAf;->b:LBq;

    iget-object v0, v0, LBq;->b:LK2;

    goto :goto_0

    :cond_0
    iget-object v0, p0, LAf;->b:LBq;

    iget-object v0, v0, LBq;->a:LK2;

    :goto_0
    invoke-virtual {v0}, LK2;->w()[Lzf;

    move-result-object v1

    array-length v1, v1

    if-lez v1, :cond_1

    iget v2, p0, LAf;->c:I

    add-int/lit8 v2, v2, 0x1

    rem-int/2addr v2, v1

    iput v2, p0, LAf;->c:I

    :cond_1
    invoke-virtual {v0}, LK2;->y()[Lzf;

    move-result-object v1

    array-length v1, v1

    if-lez v1, :cond_2

    iget v2, p0, LAf;->d:I

    add-int/lit8 v2, v2, 0x1

    rem-int/2addr v2, v1

    iput v2, p0, LAf;->d:I

    :cond_2
    invoke-virtual {v0}, LK2;->l()[Lzf;

    move-result-object v0

    array-length v0, v0

    if-lez v0, :cond_3

    iget v1, p0, LAf;->e:I

    add-int/lit8 v1, v1, 0x1

    rem-int/2addr v1, v0

    iput v1, p0, LAf;->e:I

    :cond_3
    invoke-virtual {p0}, LAf;->f()V

    const-string v0, "T500.INFO_PANEL"

    const-string v1, "next()"

    invoke-static {v0, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "indexL="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, LAf;->c:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "indexR="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, LAf;->d:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "indexC="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, LAf;->e:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final f()V
    .locals 4

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lmk;->l(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "selectedTheme"

    const-string v3, "Audi Virtual Cockpit"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "prefs_"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "INFO_INDEX_L"

    iget v2, p0, LAf;->c:I

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    const-string v1, "INFO_INDEX_R"

    iget v2, p0, LAf;->d:I

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    const-string v1, "INFO_INDEX_C"

    iget v2, p0, LAf;->e:I

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method
