.class public Luf;
.super Lc4;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lc4;-><init>()V

    return-void
.end method


# virtual methods
.method public final c0(Landroid/content/SharedPreferences;ILjava/lang/String;Ljava/lang/String;)LPn;
    .locals 1

    invoke-interface {p1, p3, p4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    new-instance v0, Ltf;

    invoke-direct {v0, p0, p1, p3}, Ltf;-><init>(Luf;Landroid/content/SharedPreferences;Ljava/lang/String;)V

    const/16 p1, 0x2002

    invoke-virtual {p0, p2, p4, p1, v0}, Lc4;->Q(ILjava/lang/String;ILOn;)LPn;

    move-result-object p1

    return-object p1
.end method

.method public final w(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 16

    move-object/from16 v6, p0

    invoke-virtual/range {p0 .. p0}, Lc4;->W()Landroid/widget/ScrollView;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lc4;->V()Lji;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    invoke-virtual/range {p0 .. p0}, Lc4;->S()Landroid/content/SharedPreferences;

    move-result-object v9

    const v0, 0x7f1300fc

    invoke-virtual {v6, v0}, Lc4;->a0(I)Lii;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v0, LIn;

    invoke-virtual/range {p0 .. p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, LIn;-><init>(Landroid/content/Context;)V

    const-string v1, "tiresLowValue"

    const-string v2, "210"

    invoke-interface {v9, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf;

    invoke-direct {v2, v6, v9}, Lrf;-><init>(Luf;Landroid/content/SharedPreferences;)V

    const v3, 0x7f13012c

    const/4 v4, 0x2

    invoke-virtual {v6, v3, v1, v4, v2}, Lc4;->Q(ILjava/lang/String;ILOn;)LPn;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v8, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/16 v10, 0x10

    invoke-virtual {v6, v8, v10}, Lc4;->O(Landroid/widget/LinearLayout;I)V

    const v0, 0x7f1300f2

    invoke-virtual {v6, v0}, Lc4;->a0(I)Lii;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v11, LIn;

    invoke-virtual/range {p0 .. p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v11, v0}, LIn;-><init>(Landroid/content/Context;)V

    const v0, 0x7f13011f

    const-string v1, "fuel_low_level"

    const-string v12, "20"

    invoke-virtual {v6, v9, v0, v1, v12}, Luf;->c0(Landroid/content/SharedPreferences;ILjava/lang/String;Ljava/lang/String;)LPn;

    move-result-object v0

    invoke-virtual {v11, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v0, "12.5"

    const v1, 0x7f13011b

    const-string v2, "fuel_critical_level"

    invoke-virtual {v6, v9, v1, v2, v0}, Luf;->c0(Landroid/content/SharedPreferences;ILjava/lang/String;Ljava/lang/String;)LPn;

    move-result-object v0

    invoke-virtual {v11, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v0, "fuel_tank_fix"

    const/4 v13, 0x0

    invoke-interface {v9, v0, v13}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    new-instance v5, Lrf;

    invoke-direct {v5, v6, v9}, Lrf;-><init>(Luf;Landroid/content/SharedPreferences;)V

    const v2, 0x7f13014d

    const v3, 0x7f13014c

    const v1, 0x7f13014e

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v5}, Lc4;->b0(IIIZLVn;)LWn;

    move-result-object v0

    invoke-virtual {v11, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v0, "60"

    const v1, 0x7f130121

    const-string v2, "fuel_tank_capacity"

    invoke-virtual {v6, v9, v1, v2, v0}, Luf;->c0(Landroid/content/SharedPreferences;ILjava/lang/String;Ljava/lang/String;)LPn;

    move-result-object v14

    const-string v0, "0.528"

    const v1, 0x7f130117

    const-string v2, "fuel_conversion_coef"

    invoke-virtual {v6, v9, v1, v2, v0}, Luf;->c0(Landroid/content/SharedPreferences;ILjava/lang/String;Ljava/lang/String;)LPn;

    move-result-object v15

    const-string v0, "fuel_custom_tank_enabled"

    invoke-interface {v9, v0, v13}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    invoke-virtual {v14, v4}, Landroid/view/View;->setEnabled(Z)V

    invoke-virtual {v15, v4}, Landroid/view/View;->setEnabled(Z)V

    new-instance v5, Lsf;

    invoke-direct {v5, v6, v9, v14, v15}, Lsf;-><init>(Luf;Landroid/content/SharedPreferences;LPn;LPn;)V

    const v2, 0x7f13014a

    const v3, 0x7f130149

    const v1, 0x7f13014b

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v5}, Lc4;->b0(IIIZLVn;)LWn;

    move-result-object v0

    invoke-virtual {v11, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v11, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v11, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v8, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v6, v8, v10}, Lc4;->O(Landroid/widget/LinearLayout;I)V

    const v0, 0x7f1300ed

    invoke-virtual {v6, v0}, Lc4;->a0(I)Lii;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v0, LIn;

    invoke-virtual/range {p0 .. p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, LIn;-><init>(Landroid/content/Context;)V

    const v1, 0x7f1300eb

    const-string v2, "battery_low_level"

    invoke-virtual {v6, v9, v1, v2, v12}, Luf;->c0(Landroid/content/SharedPreferences;ILjava/lang/String;Ljava/lang/String;)LPn;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v1, "10"

    const v2, 0x7f1300e7

    const-string v3, "battery_critical_level"

    invoke-virtual {v6, v9, v2, v3, v1}, Luf;->c0(Landroid/content/SharedPreferences;ILjava/lang/String;Ljava/lang/String;)LPn;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v8, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v6, v8, v10}, Lc4;->O(Landroid/widget/LinearLayout;I)V

    const v0, 0x7f1300f0

    invoke-virtual {v6, v0}, Lc4;->a0(I)Lii;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v0, LIn;

    invoke-virtual/range {p0 .. p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, LIn;-><init>(Landroid/content/Context;)V

    const-string v1, "105"

    const v2, 0x7f13010d

    const-string v3, "coolant_warn_level"

    invoke-virtual {v6, v9, v2, v3, v1}, Luf;->c0(Landroid/content/SharedPreferences;ILjava/lang/String;Ljava/lang/String;)LPn;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v1, "120"

    const v2, 0x7f130109

    const-string v3, "coolant_critical_level"

    invoke-virtual {v6, v9, v2, v3, v1}, Luf;->c0(Landroid/content/SharedPreferences;ILjava/lang/String;Ljava/lang/String;)LPn;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v8, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v6, v8, v10}, Lc4;->O(Landroid/widget/LinearLayout;I)V

    const v0, 0x7f1300f6

    invoke-virtual {v6, v0}, Lc4;->a0(I)Lii;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v0, LIn;

    invoke-virtual/range {p0 .. p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, LIn;-><init>(Landroid/content/Context;)V

    const-string v1, "1.055"

    const v2, 0x7f130124

    const-string v3, "ipSpeedKDefault"

    invoke-virtual {v6, v9, v2, v3, v1}, Luf;->c0(Landroid/content/SharedPreferences;ILjava/lang/String;Ljava/lang/String;)LPn;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v1, "76"

    const v2, 0x7f13012a

    const-string v3, "ipSpeed1"

    invoke-virtual {v6, v9, v2, v3, v1}, Luf;->c0(Landroid/content/SharedPreferences;ILjava/lang/String;Ljava/lang/String;)LPn;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v1, "1.046"

    const v2, 0x7f130122

    const-string v3, "ipSpeedK1"

    invoke-virtual {v6, v9, v2, v3, v1}, Luf;->c0(Landroid/content/SharedPreferences;ILjava/lang/String;Ljava/lang/String;)LPn;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v1, "96"

    const v2, 0x7f13012b

    const-string v3, "ipSpeed2"

    invoke-virtual {v6, v9, v2, v3, v1}, Luf;->c0(Landroid/content/SharedPreferences;ILjava/lang/String;Ljava/lang/String;)LPn;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const-string v1, "1.042"

    const v2, 0x7f130123

    const-string v3, "ipSpeedK2"

    invoke-virtual {v6, v9, v2, v3, v1}, Luf;->c0(Landroid/content/SharedPreferences;ILjava/lang/String;Ljava/lang/String;)LPn;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v8, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object v7
.end method
