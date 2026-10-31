.class public final synthetic Lz3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic a:LE3;

.field public final synthetic b:Landroid/widget/TimePicker;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Z

.field public final synthetic e:Landroid/widget/TextView;

.field public final synthetic f:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LE3;Landroid/widget/TimePicker;Ljava/lang/String;ZLandroid/widget/TextView;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz3;->a:LE3;

    iput-object p2, p0, Lz3;->b:Landroid/widget/TimePicker;

    iput-object p3, p0, Lz3;->c:Ljava/lang/String;

    iput-boolean p4, p0, Lz3;->d:Z

    iput-object p5, p0, Lz3;->e:Landroid/widget/TextView;

    iput-object p6, p0, Lz3;->f:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 18

    move-object/from16 v0, p0

    const-string v1, "day"

    const/4 v3, 0x1

    iget-object v4, v0, Lz3;->a:LE3;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v5, v0, Lz3;->b:Landroid/widget/TimePicker;

    invoke-virtual {v5}, Landroid/widget/TimePicker;->getHour()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5}, Landroid/widget/TimePicker;->getMinute()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    filled-new-array {v6, v5}, [Ljava/lang/Object;

    move-result-object v5

    const-string v6, "%02d:%02d"

    invoke-static {v6, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    iget-boolean v6, v0, Lz3;->d:Z

    if-eqz v6, :cond_0

    invoke-virtual {v4}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f030008

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    :cond_0
    invoke-virtual {v4}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f030006

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v7

    :goto_0
    array-length v8, v7

    new-array v9, v8, [Ljava/lang/String;

    const/4 v10, 0x0

    :goto_1
    array-length v11, v7

    if-ge v10, v11, :cond_8

    aget-object v11, v7, v10

    iget-object v12, v0, Lz3;->c:Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1

    aput-object v5, v9, v10

    goto/16 :goto_7

    :cond_1
    const-string v11, "_time"

    new-instance v12, Ljava/lang/StringBuilder;

    if-eqz v6, :cond_2

    const-string v13, "bg_sun_"

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v13, v7, v10

    :goto_2
    invoke-static {v12, v13, v11}, LVo;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    goto :goto_3

    :cond_2
    const-string v13, "bg_time_"

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-object v13, v7, v10

    goto :goto_2

    :goto_3
    invoke-virtual {v4}, Lc4;->T()Landroid/content/SharedPreferences;

    move-result-object v12

    const-string v13, "18:00"

    const-string v14, "06:00"

    if-eqz v6, :cond_3

    aget-object v15, v7, v10

    invoke-virtual {v1, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_7

    :goto_4
    move-object v13, v14

    goto :goto_6

    :cond_3
    aget-object v15, v7, v10

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v16, -0x1

    invoke-virtual {v15}, Ljava/lang/String;->hashCode()I

    move-result v17

    sparse-switch v17, :sswitch_data_0

    goto :goto_5

    :sswitch_0
    const-string v2, "night"

    invoke-virtual {v15, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    goto :goto_5

    :cond_4
    const/16 v16, 0x2

    goto :goto_5

    :sswitch_1
    invoke-virtual {v15, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_5

    :cond_5
    move/from16 v16, v3

    goto :goto_5

    :sswitch_2
    const-string v2, "evening"

    invoke-virtual {v15, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_5

    :cond_6
    const/16 v16, 0x0

    :goto_5
    packed-switch v16, :pswitch_data_0

    goto :goto_4

    :pswitch_0
    const-string v13, "22:00"

    goto :goto_6

    :pswitch_1
    const-string v13, "10:00"

    :cond_7
    :goto_6
    :pswitch_2
    invoke-interface {v12, v11, v13}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v9, v10

    :goto_7
    add-int/2addr v10, v3

    goto :goto_1

    :cond_8
    move v1, v3

    :goto_8
    if-ge v1, v8, :cond_a

    aget-object v2, v9, v1

    add-int/lit8 v6, v1, -0x1

    aget-object v6, v9, v6

    invoke-virtual {v2, v6}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v2

    if-gtz v2, :cond_9

    invoke-virtual {v4}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f130043

    invoke-static {v1, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    goto :goto_9

    :cond_9
    add-int/2addr v1, v3

    goto :goto_8

    :cond_a
    iget-object v1, v0, Lz3;->e:Landroid/widget/TextView;

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v4}, Lc4;->T()Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    iget-object v2, v0, Lz3;->f:Ljava/lang/String;

    invoke-interface {v1, v2, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-virtual {v4}, LE3;->k0()V

    :goto_9
    return-void

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
