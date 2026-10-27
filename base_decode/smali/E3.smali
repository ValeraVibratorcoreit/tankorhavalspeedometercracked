.class public LE3;
.super Lc4;
.source "SourceFile"


# instance fields
.field public final U:Ljava/util/ArrayList;

.field public V:LH3;

.field public W:Landroid/widget/ListView;

.field public X:LWn;

.field public Y:Landroid/widget/Button;

.field public Z:LUn;

.field public a0:Landroid/widget/LinearLayout;

.field public b0:Landroid/widget/LinearLayout;

.field public c0:Landroid/widget/LinearLayout;

.field public d0:Ljava/lang/String;

.field public e0:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lc4;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LE3;->U:Ljava/util/ArrayList;

    return-void
.end method

.method public static f0(Landroid/view/View;Ljava/lang/String;)Landroid/widget/ImageView;
    .locals 2

    instance-of v0, p0, Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0

    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    check-cast p0, Landroid/view/ViewGroup;

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_2

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, p1}, LE3;->f0(Landroid/view/View;Ljava/lang/String;)Landroid/widget/ImageView;

    move-result-object v1

    if-eqz v1, :cond_1

    return-object v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method public static g0(Landroid/view/View;Ljava/lang/String;)Landroid/widget/TextView;
    .locals 2

    instance-of v0, p0, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    check-cast p0, Landroid/widget/TextView;

    return-object p0

    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    check-cast p0, Landroid/view/ViewGroup;

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ge v0, v1, :cond_2

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1, p1}, LE3;->g0(Landroid/view/View;Ljava/lang/String;)Landroid/widget/TextView;

    move-result-object v1

    if-eqz v1, :cond_1

    return-object v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final Y(Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;)V
    .locals 5

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;->c(Z)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, "Default"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f030003

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    iget-object v1, v1, Lru/zinovin/tankspeedometer/MainActivity;->z:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;->b(Ljava/util/ArrayList;Ljava/lang/String;)V

    new-instance v0, LA3;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LA3;-><init>(LE3;I)V

    invoke-virtual {p1, v0}, Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;->setOnThemeSelected(Lmo;)V

    return-void
.end method

.method public final c0()V
    .locals 4

    invoke-virtual {p0}, Lc4;->R()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    invoke-virtual {v1, v0}, Lru/zinovin/tankspeedometer/MainActivity;->G(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "useDefaultSwitchBack"

    const/4 v3, 0x1

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iget-object v2, p0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    iget-object v2, v2, Lru/zinovin/tankspeedometer/MainActivity;->z:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz v1, :cond_1

    const-string v0, "Default"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const-string v0, "selectedBackground"

    invoke-virtual {p0, v0}, Lc4;->X(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final d0(Ljava/lang/String;Ljava/lang/String;Z)Landroid/widget/LinearLayout;
    .locals 17

    move-object/from16 v6, p0

    move-object/from16 v7, p2

    move/from16 v8, p3

    const-string v0, "day"

    invoke-virtual/range {p0 .. p0}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    new-instance v9, Landroid/widget/LinearLayout;

    invoke-virtual/range {p0 .. p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v9, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x0

    invoke-virtual {v9, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v10, 0x10

    invoke-virtual {v9, v10}, Landroid/widget/LinearLayout;->setGravity(I)V

    const/16 v2, 0x38

    invoke-virtual {v6, v2}, Lc4;->P(I)I

    move-result v2

    invoke-virtual {v9, v2}, Landroid/view/View;->setMinimumHeight(I)V

    const/16 v2, 0xc

    invoke-virtual {v6, v2}, Lc4;->P(I)I

    move-result v2

    const/4 v3, 0x4

    invoke-virtual {v6, v3}, Lc4;->P(I)I

    move-result v4

    invoke-virtual {v6, v3}, Lc4;->P(I)I

    move-result v3

    invoke-virtual {v9, v2, v4, v2, v3}, Landroid/view/View;->setPadding(IIII)V

    new-instance v2, Landroid/widget/TextView;

    invoke-virtual/range {p0 .. p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    move-object/from16 v3, p1

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual/range {p0 .. p0}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f060340

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v3, 0x42040000    # 33.0f

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextSize(F)V

    const/16 v3, 0x82

    invoke-virtual {v6, v3}, Lc4;->P(I)I

    move-result v3

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v11, -0x2

    invoke-direct {v4, v3, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v9, v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    const-string v12, "bg_time_"

    const-string v2, "_time"

    const-string v13, "bg_sun_"

    if-eqz v8, :cond_0

    invoke-static {v13, v7, v2}, LVo;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :goto_0
    move-object v5, v2

    goto :goto_1

    :cond_0
    invoke-static {v12, v7, v2}, LVo;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :goto_1
    invoke-virtual/range {p0 .. p0}, Lc4;->T()Landroid/content/SharedPreferences;

    move-result-object v2

    const-string v3, "18:00"

    const-string v4, "06:00"

    if-eqz v8, :cond_1

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    :goto_2
    move-object v3, v4

    goto :goto_5

    :cond_1
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v14, -0x1

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->hashCode()I

    move-result v15

    sparse-switch v15, :sswitch_data_0

    :goto_3
    move v1, v14

    goto :goto_4

    :sswitch_0
    const-string v0, "night"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_3

    :cond_2
    const/4 v1, 0x2

    goto :goto_4

    :sswitch_1
    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    const/4 v1, 0x1

    goto :goto_4

    :sswitch_2
    const-string v0, "evening"

    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_3

    :cond_4
    :goto_4
    packed-switch v1, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    const-string v3, "22:00"

    goto :goto_5

    :pswitch_1
    const-string v3, "10:00"

    :cond_5
    :goto_5
    :pswitch_2
    invoke-interface {v2, v5, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v14, Landroid/widget/TextView;

    invoke-virtual/range {p0 .. p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v14, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v14, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual/range {p0 .. p0}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v0

    const v15, 0x7f060341

    invoke-virtual {v0, v15}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v14, v0}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v0, 0x41d80000    # 27.0f

    invoke-virtual {v14, v0}, Landroid/widget/TextView;->setTextSize(F)V

    const/16 v0, 0x11

    invoke-virtual {v14, v0}, Landroid/widget/TextView;->setGravity(I)V

    const v0, 0x7f080165

    invoke-virtual {v14, v0}, Landroid/view/View;->setBackgroundResource(I)V

    const/16 v0, 0x55

    invoke-virtual {v6, v0}, Lc4;->P(I)I

    move-result v4

    const/16 v0, 0x8

    invoke-virtual {v6, v0}, Lc4;->P(I)I

    move-result v1

    const/4 v3, 0x6

    invoke-virtual {v6, v3}, Lc4;->P(I)I

    move-result v2

    invoke-virtual {v6, v0}, Lc4;->P(I)I

    move-result v0

    invoke-virtual {v6, v3}, Lc4;->P(I)I

    move-result v15

    invoke-virtual {v14, v1, v2, v0, v15}, Landroid/widget/TextView;->setPadding(IIII)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v15, "_"

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    new-instance v2, Lw3;

    move-object v0, v2

    move-object/from16 v1, p0

    move-object v10, v2

    move-object v2, v14

    move-object/from16 v3, p2

    move-object/from16 v16, v15

    move v15, v4

    move/from16 v4, p3

    invoke-direct/range {v0 .. v5}, Lw3;-><init>(LE3;Landroid/widget/TextView;Ljava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v14, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v0, v15, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v9, v14, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    const-string v0, "_img"

    if-eqz v8, :cond_6

    invoke-static {v13, v7, v0}, LVo;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_6

    :cond_6
    invoke-static {v12, v7, v0}, LVo;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_6
    invoke-virtual/range {p0 .. p0}, Lc4;->T()Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "BUILD_IN_NONE"

    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Landroid/widget/ImageView;

    invoke-virtual/range {p0 .. p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    const/16 v3, 0x50

    invoke-virtual {v6, v3}, Lc4;->P(I)I

    move-result v3

    const/16 v4, 0x2d

    invoke-virtual {v6, v4}, Lc4;->P(I)I

    move-result v4

    sget-object v5, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v2, v5}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    const/16 v5, 0xff

    const/16 v10, 0x28

    invoke-static {v5, v10, v10, v10}, Landroid/graphics/Color;->argb(IIII)I

    move-result v5

    invoke-virtual {v2, v5}, Landroid/view/View;->setBackgroundColor(I)V

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v10, v16

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    invoke-virtual {v6, v2, v1}, LE3;->o0(Landroid/widget/ImageView;Ljava/lang/String;)V

    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v0, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v3, 0x10

    invoke-virtual {v6, v3}, Lc4;->P(I)I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-virtual {v9, v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Landroid/widget/ImageView;

    invoke-virtual/range {p0 .. p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    const v2, 0x7f080175

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual/range {p0 .. p0}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f060341

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, v2, v3}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    const/16 v2, 0x16

    invoke-virtual {v6, v2}, Lc4;->P(I)I

    move-result v2

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v3, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/4 v2, 0x6

    invoke-virtual {v6, v2}, Lc4;->P(I)I

    move-result v2

    invoke-virtual {v3, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-virtual {v9, v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Lx3;

    invoke-direct {v0, v6, v7, v8, v1}, Lx3;-><init>(LE3;Ljava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v9, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-object v9

    nop

    :sswitch_data_0
    .sparse-switch
        -0x520be778 -> :sswitch_2
        0x1839c -> :sswitch_1
        0x63f6418 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final e0(Landroid/net/Uri;Ljava/io/File;)V
    .locals 3

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object p1

    :try_start_0
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/16 p2, 0x400

    :try_start_1
    new-array p2, p2, [B

    :goto_0
    invoke-virtual {p1, p2}, Ljava/io/InputStream;->read([B)I

    move-result v1

    const/4 v2, -0x1

    if-le v1, v2, :cond_0

    const/4 v2, 0x0

    invoke-virtual {v0, p2, v2, v1}, Ljava/io/FileOutputStream;->write([BII)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_0
    :try_start_2
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-virtual {p1}, Ljava/io/InputStream;->close()V

    return-void

    :catchall_1
    move-exception p2

    goto :goto_3

    :goto_1
    :try_start_3
    invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception v0

    :try_start_4
    invoke-virtual {p2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_3
    if-eqz p1, :cond_1

    :try_start_5
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception p1

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_4
    throw p2
.end method

.method public final h0(Landroid/net/Uri;)Ljava/lang/String;
    .locals 8

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v2, "content"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, p1

    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "_display_name"

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    :cond_0
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_1
    if-nez v1, :cond_2

    invoke-virtual {p1}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    move-result-object v1

    :cond_2
    return-object v1
.end method

.method public final i0()V
    .locals 5

    iget-object v0, p0, LE3;->U:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    new-instance v1, LF3;

    const v2, 0x7f13019a

    invoke-virtual {p0, v2}, Lzc;->l(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f130199

    invoke-virtual {p0, v3}, Lzc;->l(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f06030c

    invoke-direct {v1, v2, v4, v3}, LF3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, LF3;

    const v2, 0x7f1301de

    invoke-virtual {p0, v2}, Lzc;->l(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f1301dd

    invoke-virtual {p0, v3}, Lzc;->l(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f080153

    invoke-direct {v1, v2, v4, v3}, LF3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, LF3;

    const v2, 0x7f1301b0

    invoke-virtual {p0, v2}, Lzc;->l(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f1301af

    invoke-virtual {p0, v3}, Lzc;->l(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f0800e4

    invoke-direct {v1, v2, v4, v3}, LF3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, LF3;

    const v2, 0x7f130191

    invoke-virtual {p0, v2}, Lzc;->l(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f130192

    invoke-virtual {p0, v3}, Lzc;->l(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f080087

    invoke-direct {v1, v2, v4, v3}, LF3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, LF3;

    const v2, 0x7f1301bc

    invoke-virtual {p0, v2}, Lzc;->l(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f1301bd

    invoke-virtual {p0, v3}, Lzc;->l(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f08012c

    invoke-direct {v1, v2, v4, v3}, LF3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v1, LF3;

    const v2, 0x7f1301e0

    invoke-virtual {p0, v2}, Lzc;->l(I)Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f1301e1

    invoke-virtual {p0, v3}, Lzc;->l(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f080156

    invoke-direct {v1, v2, v4, v3}, LF3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, LE3;->j0(Ljava/io/File;Z)V

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, LE3;->j0(Ljava/io/File;Z)V

    iget-object v0, p0, LE3;->V:LH3;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method public final j0(Ljava/io/File;Z)V
    .locals 10

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object p1

    if-nez p1, :cond_1

    return-void

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_4

    aget-object v3, p1, v2

    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v5, ".json"

    invoke-virtual {v4, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    :try_start_0
    new-instance v4, Ljava/util/Scanner;

    invoke-direct {v4, v3}, Ljava/util/Scanner;-><init>(Ljava/io/File;)V

    const-string v3, "\\Z"

    invoke-virtual {v4, v3}, Ljava/util/Scanner;->useDelimiter(Ljava/lang/String;)Ljava/util/Scanner;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/Scanner;->next()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v3, "shortDesc"

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v5, "longDesc"

    invoke-virtual {v4, v5, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "imageFileName"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "protected"

    invoke-virtual {v4, v7, p2}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_2

    new-instance v7, Ljava/io/File;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v8

    invoke-direct {v7, v8, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    goto :goto_1

    :catch_0
    move-exception v3

    goto :goto_2

    :catch_1
    move-exception v3

    goto :goto_2

    :cond_2
    new-instance v7, Ljava/io/File;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v8

    const/4 v9, 0x0

    invoke-virtual {v8, v9}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v8

    invoke-direct {v7, v8, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    :goto_1
    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v6

    if-eqz v6, :cond_3

    new-instance v6, LF3;

    invoke-static {v7}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v7

    invoke-direct {v6, v7, v3, v5, v4}, LF3;-><init>(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :goto_2
    const-string v4, "T500.Images"

    const-string v5, "Error in loadBackgroundItems()"

    invoke-static {v4, v5, v3}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    new-instance p1, LD3;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, LD3;-><init>(I)V

    invoke-static {v0, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    iget-object p1, p0, LE3;->U:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public final k0()V
    .locals 4

    invoke-virtual {p0}, Lc4;->R()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    invoke-virtual {v1, v0}, Lru/zinovin/tankspeedometer/MainActivity;->G(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "useDefaultSwitchBack"

    const/4 v3, 0x1

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iget-object v2, p0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    iget-object v2, v2, Lru/zinovin/tankspeedometer/MainActivity;->z:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz v1, :cond_1

    const-string v0, "Default"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const-string v0, "bgMode"

    invoke-virtual {p0, v0}, Lc4;->X(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public final l0(Landroid/view/View;Z)V
    .locals 6

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f030008

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f030006

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    :goto_0
    const/4 v1, 0x0

    :goto_1
    array-length v2, v0

    if-ge v1, v2, :cond_3

    aget-object v2, v0, v1

    const-string v3, "_img"

    if-eqz p2, :cond_1

    const-string v4, "bg_sun_"

    :goto_2
    invoke-static {v4, v2, v3}, LVo;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_3

    :cond_1
    const-string v4, "bg_time_"

    goto :goto_2

    :goto_3
    invoke-virtual {p0}, Lc4;->T()Landroid/content/SharedPreferences;

    move-result-object v4

    const-string v5, "BUILD_IN_NONE"

    invoke-interface {v4, v3, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "_"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, LE3;->f0(Landroid/view/View;Ljava/lang/String;)Landroid/widget/ImageView;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {p0, v2, v4}, LE3;->o0(Landroid/widget/ImageView;Ljava/lang/String;)V

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final m0(Landroid/view/View;Z)V
    .locals 12

    const/4 v0, 0x1

    const-string v1, "day"

    const/4 v2, 0x0

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f030008

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f030006

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v3

    :goto_0
    move v4, v2

    :goto_1
    array-length v5, v3

    if-ge v4, v5, :cond_8

    aget-object v5, v3, v4

    const-string v6, "_time"

    if-eqz p2, :cond_1

    const-string v7, "bg_sun_"

    :goto_2
    invoke-static {v7, v5, v6}, LVo;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    goto :goto_3

    :cond_1
    const-string v7, "bg_time_"

    goto :goto_2

    :goto_3
    invoke-virtual {p0}, Lc4;->T()Landroid/content/SharedPreferences;

    move-result-object v7

    const-string v8, "18:00"

    const-string v9, "06:00"

    if-eqz p2, :cond_2

    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    :goto_4
    move-object v8, v9

    goto :goto_6

    :cond_2
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v10, -0x1

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v11

    sparse-switch v11, :sswitch_data_0

    goto :goto_5

    :sswitch_0
    const-string v11, "night"

    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_3

    goto :goto_5

    :cond_3
    const/4 v10, 0x2

    goto :goto_5

    :sswitch_1
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_4

    goto :goto_5

    :cond_4
    move v10, v0

    goto :goto_5

    :sswitch_2
    const-string v11, "evening"

    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_5

    goto :goto_5

    :cond_5
    move v10, v2

    :goto_5
    packed-switch v10, :pswitch_data_0

    goto :goto_4

    :pswitch_0
    const-string v8, "22:00"

    goto :goto_6

    :pswitch_1
    const-string v8, "10:00"

    :cond_6
    :goto_6
    :pswitch_2
    invoke-interface {v7, v6, v8}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "_"

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {p1, v5}, LE3;->g0(Landroid/view/View;Ljava/lang/String;)Landroid/widget/TextView;

    move-result-object v5

    if-eqz v5, :cond_7

    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_7
    add-int/2addr v4, v0

    goto :goto_1

    :cond_8
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x520be778 -> :sswitch_2
        0x1839c -> :sswitch_1
        0x63f6418 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final n0()V
    .locals 8

    iget-object v0, p0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    iget-object v0, v0, Lru/zinovin/tankspeedometer/MainActivity;->z:Ljava/lang/String;

    const-string v1, "Default"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, LE3;->X:LWn;

    iget-object v1, v1, LWn;->g:Lle;

    iget-boolean v1, v1, Lle;->e:Z

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    if-nez v0, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    xor-int/2addr v1, v2

    invoke-virtual {p0}, Lc4;->T()Landroid/content/SharedPreferences;

    move-result-object v4

    const-string v5, "bgMode"

    const-string v6, "static"

    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, LE3;->Z:LUn;

    invoke-virtual {v5, v4}, LUn;->setValue(Ljava/lang/String;)V

    iget-object v5, p0, LE3;->W:Landroid/widget/ListView;

    const/16 v7, 0x8

    invoke-virtual {v5, v7}, Landroid/view/View;->setVisibility(I)V

    iget-object v5, p0, LE3;->Y:Landroid/widget/Button;

    if-eqz v5, :cond_1

    invoke-virtual {v5, v7}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    iget-object v5, p0, LE3;->a0:Landroid/widget/LinearLayout;

    invoke-virtual {v5, v7}, Landroid/view/View;->setVisibility(I)V

    iget-object v5, p0, LE3;->b0:Landroid/widget/LinearLayout;

    invoke-virtual {v5, v7}, Landroid/view/View;->setVisibility(I)V

    iget-object v5, p0, LE3;->c0:Landroid/widget/LinearLayout;

    invoke-virtual {v5, v7}, Landroid/view/View;->setVisibility(I)V

    iget-object v5, p0, LE3;->X:LWn;

    if-nez v0, :cond_2

    move v0, v3

    goto :goto_1

    :cond_2
    move v0, v7

    :goto_1
    invoke-virtual {v5, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, LE3;->Z:LUn;

    if-eqz v1, :cond_3

    move v7, v3

    :cond_3
    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    if-nez v1, :cond_4

    return-void

    :cond_4
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x35323192    # -6743863.0f

    if-eq v0, v1, :cond_7

    const v1, 0x1be4c

    if-eq v0, v1, :cond_6

    const v1, 0x3652cd

    if-eq v0, v1, :cond_5

    goto :goto_2

    :cond_5
    const-string v0, "time"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    move v0, v3

    goto :goto_3

    :cond_6
    const-string v0, "sun"

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    move v0, v2

    goto :goto_3

    :cond_7
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    const/4 v0, 0x2

    goto :goto_3

    :cond_8
    :goto_2
    const/4 v0, -0x1

    :goto_3
    if-eqz v0, :cond_a

    if-eq v0, v2, :cond_9

    iget-object v0, p0, LE3;->a0:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, LE3;->W:Landroid/widget/ListView;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, LE3;->Y:Landroid/widget/Button;

    if-eqz v0, :cond_b

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_4

    :cond_9
    iget-object v0, p0, LE3;->c0:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, LE3;->c0:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v0, v2}, LE3;->l0(Landroid/view/View;Z)V

    iget-object v0, p0, LE3;->c0:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v0, v2}, LE3;->m0(Landroid/view/View;Z)V

    goto :goto_4

    :cond_a
    iget-object v0, p0, LE3;->b0:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, LE3;->b0:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v0, v3}, LE3;->l0(Landroid/view/View;Z)V

    iget-object v0, p0, LE3;->b0:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v0, v3}, LE3;->m0(Landroid/view/View;Z)V

    :cond_b
    :goto_4
    return-void
.end method

.method public final o0(Landroid/widget/ImageView;Ljava/lang/String;)V
    .locals 5

    const/4 v0, -0x1

    const/16 v1, 0xff

    const/4 v2, 0x0

    const/16 v3, 0x28

    if-eqz p2, :cond_8

    const-string v4, "BUILD_IN_NONE"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto/16 :goto_5

    :cond_0
    :try_start_0
    const-string v4, "BUILD_IN"

    invoke-virtual {p2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v4, :cond_6

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_0

    :goto_0
    move v4, v0

    goto :goto_1

    :sswitch_0
    const-string v4, "BUILD_IN_TRANSPARENT"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    const/4 v4, 0x4

    goto :goto_1

    :sswitch_1
    const-string v4, "BUILD_IN_NIGHT"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_0

    :cond_2
    const/4 v4, 0x3

    goto :goto_1

    :sswitch_2
    const-string v4, "BUILD_IN_TRX"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_0

    :cond_3
    const/4 v4, 0x2

    goto :goto_1

    :sswitch_3
    const-string v4, "BUILD_IN_KIA"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_0

    :cond_4
    const/4 v4, 0x1

    goto :goto_1

    :sswitch_4
    const-string v4, "BUILD_IN_BRABUS"

    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_0

    :cond_5
    const/4 v4, 0x0

    :goto_1
    packed-switch v4, :pswitch_data_0

    move v4, v0

    goto :goto_2

    :pswitch_0
    const v4, 0x7f080153

    goto :goto_2

    :pswitch_1
    const v4, 0x7f08012c

    goto :goto_2

    :pswitch_2
    const v4, 0x7f080156

    goto :goto_2

    :pswitch_3
    const v4, 0x7f0800e4

    goto :goto_2

    :pswitch_4
    const v4, 0x7f080087

    :goto_2
    if-eq v4, v0, :cond_6

    :try_start_1
    invoke-virtual {p1, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void

    :catch_0
    move-exception p2

    goto :goto_4

    :cond_6
    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p2}, LUd;->d0(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object p2

    if-eqz p2, :cond_7

    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :try_start_2
    invoke-static {v0, v2}, Landroid/graphics/drawable/Drawable;->createFromStream(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    return-void

    :catchall_0
    move-exception p2

    :try_start_4
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    :try_start_5
    invoke-virtual {p2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p2
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    :goto_4
    const-string v0, "T500.Images"

    const-string v4, "Error loading thumbnail"

    invoke-static {v0, v4, p2}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-static {v1, v3, v3, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundColor(I)V

    return-void

    :cond_8
    :goto_5
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-static {v1, v3, v3, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundColor(I)V

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x51df0188 -> :sswitch_4
        -0x2cb8a466 -> :sswitch_3
        -0x2cb8816f -> :sswitch_2
        0x1f09432f -> :sswitch_1
        0x4d054329 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final t(IILandroid/content/Intent;)V
    .locals 9

    invoke-super {p0, p1, p2, p3}, Lzc;->t(IILandroid/content/Intent;)V

    const/4 v0, -0x1

    if-ne p2, v0, :cond_2

    if-eqz p3, :cond_2

    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v5

    if-nez v5, :cond_0

    return-void

    :cond_0
    const/4 p2, 0x1

    const p3, 0x7f130194

    const v0, 0x7f1301d0

    const v1, 0x7f130188

    const v2, 0x7f0b00f4

    const v3, 0x7f0b00f5

    const/4 v7, 0x0

    const v4, 0x7f0e0048

    if-ne p1, p2, :cond_1

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-virtual {p1, v4, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    move-object v3, p2

    check-cast v3, Landroid/widget/EditText;

    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    move-object v4, p2

    check-cast v4, Landroid/widget/EditText;

    new-instance p2, LQ0;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v2

    invoke-direct {p2, v2}, LQ0;-><init>(Landroid/content/Context;)V

    iget-object v2, p2, LQ0;->b:Ljava/lang/Object;

    move-object v8, v2

    check-cast v8, LM0;

    iput-object p1, v8, LM0;->r:Landroid/view/View;

    invoke-virtual {p0, v1}, Lzc;->l(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v8, LM0;->d:Ljava/lang/CharSequence;

    invoke-virtual {p0, v0}, Lzc;->l(I)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lv3;

    const/4 v6, 0x1

    move-object v1, v0

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Lv3;-><init>(LE3;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/net/Uri;I)V

    iput-object p1, v8, LM0;->g:Ljava/lang/CharSequence;

    iput-object v0, v8, LM0;->h:Landroid/content/DialogInterface$OnClickListener;

    invoke-virtual {p0, p3}, Lzc;->l(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v8, LM0;->i:Ljava/lang/CharSequence;

    iput-object v7, v8, LM0;->j:Landroid/content/DialogInterface$OnClickListener;

    invoke-virtual {p2}, LQ0;->g()V

    goto :goto_0

    :cond_1
    const/4 p2, 0x2

    if-ne p1, p2, :cond_2

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-virtual {p1, v4, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    move-object v3, p2

    check-cast v3, Landroid/widget/EditText;

    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    move-object v4, p2

    check-cast v4, Landroid/widget/EditText;

    new-instance p2, LQ0;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v2

    invoke-direct {p2, v2}, LQ0;-><init>(Landroid/content/Context;)V

    iget-object v2, p2, LQ0;->b:Ljava/lang/Object;

    move-object v8, v2

    check-cast v8, LM0;

    iput-object p1, v8, LM0;->r:Landroid/view/View;

    invoke-virtual {p0, v1}, Lzc;->l(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v8, LM0;->d:Ljava/lang/CharSequence;

    invoke-virtual {p0, v0}, Lzc;->l(I)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lv3;

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Lv3;-><init>(LE3;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/net/Uri;I)V

    iput-object p1, v8, LM0;->g:Ljava/lang/CharSequence;

    iput-object v0, v8, LM0;->h:Landroid/content/DialogInterface$OnClickListener;

    invoke-virtual {p0, p3}, Lzc;->l(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v8, LM0;->i:Ljava/lang/CharSequence;

    iput-object v7, v8, LM0;->j:Landroid/content/DialogInterface$OnClickListener;

    invoke-virtual {p2}, LQ0;->g()V

    :cond_2
    :goto_0
    return-void
.end method

.method public final w(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 15

    move-object v6, p0

    invoke-virtual {p0}, Lc4;->V()Lji;

    move-result-object v7

    iget-object v0, v6, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    iget-object v0, v0, Lru/zinovin/tankspeedometer/MainActivity;->z:Ljava/lang/String;

    const-string v1, "Default"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lc4;->T()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "useDefaultSwitchBack"

    invoke-interface {v0, v1, v9}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    move v4, v9

    goto :goto_0

    :cond_0
    move v4, v8

    :goto_0
    new-instance v5, LA3;

    const/4 v0, 0x1

    invoke-direct {v5, p0, v0}, LA3;-><init>(LE3;I)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v1, 0x7f1301f8

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lc4;->b0(IIIZLVn;)LWn;

    move-result-object v0

    iput-object v0, v6, LE3;->X:LWn;

    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/16 v10, 0xc

    invoke-virtual {p0, v7, v10}, Lc4;->O(Landroid/widget/LinearLayout;I)V

    new-instance v0, LUn;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, LUn;-><init>(Landroid/content/Context;)V

    iput-object v0, v6, LE3;->Z:LUn;

    invoke-virtual {v0, v8}, LUn;->setTitleVisible(Z)V

    iget-object v0, v6, LE3;->Z:LUn;

    const v1, 0x7f030004

    const v2, 0x7f030005

    invoke-virtual {v0, v1, v2}, LUn;->b(II)V

    invoke-virtual {p0}, Lc4;->T()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "bgMode"

    const-string v2, "static"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, v6, LE3;->Z:LUn;

    invoke-virtual {v1, v0}, LUn;->setValue(Ljava/lang/String;)V

    iget-object v0, v6, LE3;->Z:LUn;

    new-instance v1, LA3;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, LA3;-><init>(LE3;I)V

    invoke-virtual {v0, v1}, LUn;->setOnValueChanged(LTn;)V

    iget-object v0, v6, LE3;->Z:LUn;

    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p0, v7, v10}, Lc4;->O(Landroid/widget/LinearLayout;I)V

    new-instance v0, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v11, -0x1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v1, v11, v8, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v1, Landroid/widget/ListView;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v1, v3}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    iput-object v1, v6, LE3;->W:Landroid/widget/ListView;

    const/4 v12, 0x0

    invoke-virtual {v1, v12}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    new-instance v1, LH3;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v3

    iget-object v4, v6, LE3;->U:Ljava/util/ArrayList;

    invoke-direct {v1, v3, p0, v4}, LH3;-><init>(Landroid/content/Context;LE3;Ljava/util/List;)V

    iput-object v1, v6, LE3;->V:LH3;

    iget-object v3, v6, LE3;->W:Landroid/widget/ListView;

    invoke-virtual {v3, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget-object v1, v6, LE3;->W:Landroid/widget/ListView;

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v3, v11, v8, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v0, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p0, v0, v10}, Lc4;->O(Landroid/widget/LinearLayout;I)V

    new-instance v1, LB3;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, LB3;-><init>(LE3;I)V

    const v2, 0x7f1301f6

    invoke-virtual {p0, v2, v1}, Lc4;->Z(ILjava/lang/Runnable;)Landroid/widget/Button;

    move-result-object v1

    iput-object v1, v6, LE3;->Y:Landroid/widget/Button;

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v13, -0x2

    invoke-direct {v1, v11, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iget-object v2, v6, LE3;->Y:Landroid/widget/Button;

    invoke-virtual {v2, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v1, v6, LE3;->Y:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iput-object v0, v6, LE3;->a0:Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    new-instance v0, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-virtual {p0}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f030007

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f030006

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v2

    new-instance v3, LIn;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4}, LIn;-><init>(Landroid/content/Context;)V

    move v4, v8

    :goto_1
    array-length v5, v2

    if-ge v4, v5, :cond_1

    aget-object v5, v2, v4

    aget-object v14, v1, v4

    invoke-virtual {p0, v14, v5, v8}, LE3;->d0(Ljava/lang/String;Ljava/lang/String;Z)Landroid/widget/LinearLayout;

    move-result-object v5

    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p0, v0, v10}, Lc4;->O(Landroid/widget/LinearLayout;I)V

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lmk;->l(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "carModel"

    const-string v3, "tank_500"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "_"

    const-string v3, ""

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, LB3;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, LB3;-><init>(LE3;I)V

    const v3, 0x7f130024

    invoke-virtual {p0, v3, v2}, Lc4;->Z(ILjava/lang/Runnable;)Landroid/widget/Button;

    move-result-object v2

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v3, v1}, Lzc;->m(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v1, v11, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iput-object v0, v6, LE3;->b0:Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    new-instance v14, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v14, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v14, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-virtual {p0}, Lc4;->T()Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "bg_sun_auto_update"

    invoke-interface {v0, v1, v9}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    new-instance v5, LA3;

    const/4 v0, 0x3

    invoke-direct {v5, p0, v0}, LA3;-><init>(LE3;I)V

    const/4 v3, 0x0

    const v1, 0x7f130037

    const/4 v2, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lc4;->b0(IIIZLVn;)LWn;

    move-result-object v0

    invoke-virtual {v14, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const/16 v0, 0x8

    invoke-virtual {p0, v14, v0}, Lc4;->O(Landroid/widget/LinearLayout;I)V

    invoke-virtual {p0}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f030009

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f030008

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v1

    new-instance v2, LIn;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, LIn;-><init>(Landroid/content/Context;)V

    :goto_2
    array-length v3, v1

    if-ge v8, v3, :cond_2

    aget-object v3, v1, v8

    aget-object v4, v0, v8

    invoke-virtual {p0, v4, v3, v9}, LE3;->d0(Ljava/lang/String;Ljava/lang/String;Z)Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_2
    invoke-virtual {v14, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p0, v14, v10}, Lc4;->O(Landroid/widget/LinearLayout;I)V

    const v0, 0x7f130038

    invoke-virtual {p0, v0, v12}, Lc4;->Z(ILjava/lang/Runnable;)Landroid/widget/Button;

    move-result-object v0

    new-instance v1, LC3;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, v0}, LC3;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v1, v11, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v14, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iput-object v14, v6, LE3;->c0:Landroid/widget/LinearLayout;

    iget-object v0, v6, LE3;->a0:Landroid/widget/LinearLayout;

    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v0, v6, LE3;->b0:Landroid/widget/LinearLayout;

    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v0, v6, LE3;->c0:Landroid/widget/LinearLayout;

    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {p0}, LE3;->i0()V

    invoke-virtual {p0}, LE3;->n0()V

    return-object v7
.end method
