.class public LL3;
.super Lzc;
.source "SourceFile"


# instance fields
.field public T:Lk0;

.field public U:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lzc;-><init>()V

    return-void
.end method

.method public static P(LF3;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LF3;->a:Landroid/net/Uri;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/io/File;

    iget-object p0, p0, LF3;->a:Landroid/net/Uri;

    invoke-virtual {p0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    iget p0, p0, LF3;->d:I

    sparse-switch p0, :sswitch_data_0

    const-string p0, "BUILD_IN_NONE"

    return-object p0

    :sswitch_0
    const-string p0, "BUILD_IN_TRX"

    return-object p0

    :sswitch_1
    const-string p0, "BUILD_IN_TRANSPARENT"

    return-object p0

    :sswitch_2
    const-string p0, "BUILD_IN_NIGHT"

    return-object p0

    :sswitch_3
    const-string p0, "BUILD_IN_KIA"

    return-object p0

    :sswitch_4
    const-string p0, "BUILD_IN_BRABUS"

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        0x7f080087 -> :sswitch_4
        0x7f0800e4 -> :sswitch_3
        0x7f08012c -> :sswitch_2
        0x7f080153 -> :sswitch_1
        0x7f080156 -> :sswitch_0
    .end sparse-switch
.end method

.method public static Q(Landroid/content/Context;Ljava/io/File;ZLjava/util/ArrayList;)V
    .locals 9

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

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v8

    invoke-direct {v7, v8, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    goto :goto_1

    :catch_0
    move-exception v3

    goto :goto_2

    :cond_2
    new-instance v7, Ljava/io/File;

    const/4 v8, 0x0

    invoke-virtual {p0, v8}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

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
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :goto_2
    const-string v4, "T500.BgPicker"

    const-string v5, "Error loading background item"

    invoke-static {v4, v5, v3}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    new-instance p0, LD3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, LD3;-><init>(I)V

    invoke-static {v0, p0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-void
.end method


# virtual methods
.method public final O()V
    .locals 1

    invoke-virtual {p0}, Lzc;->f()Lq1;

    move-result-object v0

    instance-of v0, v0, Lkf;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lzc;->f()Lq1;

    move-result-object v0

    check-cast v0, Lkf;

    check-cast v0, Lru/zinovin/tankspeedometer/MainActivity;

    invoke-virtual {v0}, Lru/zinovin/tankspeedometer/MainActivity;->F()V

    :cond_0
    return-void
.end method

.method public final v(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Lzc;->v(Landroid/os/Bundle;)V

    iget-object p1, p0, Lzc;->f:Landroid/os/Bundle;

    if-eqz p1, :cond_0

    const-string v0, "current"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, LL3;->U:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public final w(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 13

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget p2, p2, Landroid/util/DisplayMetrics;->density:F

    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f060334

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v5, 0x10

    invoke-virtual {v3, v5}, Landroid/widget/LinearLayout;->setGravity(I)V

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f060336

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v3, v5}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f07035d

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v5

    invoke-virtual {v3, v5}, Landroid/view/View;->setMinimumHeight(I)V

    invoke-virtual {p0}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    const/16 v6, 0xc

    int-to-float v6, v6

    mul-float/2addr v5, v6

    float-to-int v5, v5

    invoke-virtual {v3, v5, v4, v5, v4}, Landroid/view/View;->setPadding(IIII)V

    new-instance v5, Landroid/widget/ImageButton;

    invoke-direct {v5, v2}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;)V

    const v6, 0x7f08015f

    invoke-virtual {v5, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {v5, v4}, Landroid/view/View;->setBackgroundColor(I)V

    new-instance v6, LJ3;

    const/4 v7, 0x1

    invoke-direct {v6, p0, v7}, LJ3;-><init>(LL3;I)V

    invoke-virtual {v5, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v6

    iget v6, v6, Landroid/util/DisplayMetrics;->density:F

    const/16 v7, 0x28

    int-to-float v7, v7

    mul-float/2addr v6, v7

    float-to-int v6, v6

    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v7, v6, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v5, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v5, Landroid/widget/TextView;

    invoke-direct {v5, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const v6, 0x7f13002f

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v6, 0x7f060340

    invoke-virtual {v2, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v2, 0x42040000    # 33.0f

    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setSingleLine(Z)V

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v7, -0x2

    invoke-direct {v2, v7, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v8

    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float/2addr v8, v9

    float-to-int v8, v8

    invoke-virtual {v2, v8}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-virtual {v3, v5, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, Lji;

    invoke-direct {v2, p1}, Lji;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/high16 v3, 0x41800000    # 16.0f

    mul-float/2addr v3, p2

    float-to-int v3, v3

    invoke-virtual {v2, v3, v3, v3, v3}, Landroid/view/View;->setPadding(IIII)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v5, -0x1

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-direct {v3, v5, v4, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, LF3;

    const v10, 0x7f13019a

    invoke-virtual {p0, v10}, Lzc;->l(I)Ljava/lang/String;

    move-result-object v10

    const v11, 0x7f130199

    invoke-virtual {p0, v11}, Lzc;->l(I)Ljava/lang/String;

    move-result-object v11

    const v12, 0x7f06030c

    invoke-direct {v9, v10, v12, v11}, LF3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v9, LF3;

    const v10, 0x7f1301de

    invoke-virtual {p0, v10}, Lzc;->l(I)Ljava/lang/String;

    move-result-object v10

    const v11, 0x7f1301dd

    invoke-virtual {p0, v11}, Lzc;->l(I)Ljava/lang/String;

    move-result-object v11

    const v12, 0x7f080153

    invoke-direct {v9, v10, v12, v11}, LF3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v9, LF3;

    const v10, 0x7f1301b0

    invoke-virtual {p0, v10}, Lzc;->l(I)Ljava/lang/String;

    move-result-object v10

    const v11, 0x7f1301af

    invoke-virtual {p0, v11}, Lzc;->l(I)Ljava/lang/String;

    move-result-object v11

    const v12, 0x7f0800e4

    invoke-direct {v9, v10, v12, v11}, LF3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v9, LF3;

    const v10, 0x7f130191

    invoke-virtual {p0, v10}, Lzc;->l(I)Ljava/lang/String;

    move-result-object v10

    const v11, 0x7f130192

    invoke-virtual {p0, v11}, Lzc;->l(I)Ljava/lang/String;

    move-result-object v11

    const v12, 0x7f080087

    invoke-direct {v9, v10, v12, v11}, LF3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v9, LF3;

    const v10, 0x7f1301bc

    invoke-virtual {p0, v10}, Lzc;->l(I)Ljava/lang/String;

    move-result-object v10

    const v11, 0x7f1301bd

    invoke-virtual {p0, v11}, Lzc;->l(I)Ljava/lang/String;

    move-result-object v11

    const v12, 0x7f08012c

    invoke-direct {v9, v10, v12, v11}, LF3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v9, LF3;

    const v10, 0x7f1301e0

    invoke-virtual {p0, v10}, Lzc;->l(I)Ljava/lang/String;

    move-result-object v10

    const v11, 0x7f1301e1

    invoke-virtual {p0, v11}, Lzc;->l(I)Ljava/lang/String;

    move-result-object v11

    const v12, 0x7f080156

    invoke-direct {v9, v10, v12, v11}, LF3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v9, 0x0

    invoke-virtual {p1, v9}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v10

    invoke-static {p1, v10, v4, v3}, LL3;->Q(Landroid/content/Context;Ljava/io/File;ZLjava/util/ArrayList;)V

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v10

    invoke-static {p1, v10, v1, v3}, LL3;->Q(Landroid/content/Context;Ljava/io/File;ZLjava/util/ArrayList;)V

    new-instance v1, Landroid/widget/ListView;

    invoke-direct {v1, p1}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v9}, Landroid/widget/ListView;->setDivider(Landroid/graphics/drawable/Drawable;)V

    new-instance v9, LK3;

    invoke-direct {v9, p0, p1, v3}, LK3;-><init>(LL3;Landroid/content/Context;Ljava/util/ArrayList;)V

    invoke-virtual {v1, v9}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    new-instance v9, LI3;

    invoke-direct {v9, p0, v3}, LI3;-><init>(LL3;Ljava/util/ArrayList;)V

    invoke-virtual {v1, v9}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v3, v5, v4, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v2, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v1, Landroid/view/View;

    invoke-direct {v1, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v8, 0x41400000    # 12.0f

    mul-float/2addr v8, p2

    float-to-int v8, v8

    invoke-direct {v3, v5, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v1, Landroid/widget/Button;

    invoke-direct {v1, p1}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    const v3, 0x7f130189

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setAllCaps(Z)V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v6, 0x7f07034d

    invoke-virtual {v3, v6}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    invoke-virtual {v1, v4, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    const v3, 0x7f080161

    invoke-virtual {v1, v3}, Landroid/view/View;->setBackgroundResource(I)V

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v3, 0x7f07034c

    invoke-virtual {p1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setMinHeight(I)V

    invoke-virtual {v1, p1}, Landroid/view/View;->setMinimumHeight(I)V

    const/high16 p1, 0x41e00000    # 28.0f

    mul-float/2addr p2, p1

    float-to-int p1, p2

    invoke-virtual {v1, p1, v4, p1, v4}, Landroid/view/View;->setPadding(IIII)V

    new-instance p1, LJ3;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, LJ3;-><init>(LL3;I)V

    invoke-virtual {v1, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {p1, v5, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v1, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object v0
.end method
