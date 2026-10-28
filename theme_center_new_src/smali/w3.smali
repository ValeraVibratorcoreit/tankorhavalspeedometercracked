.class public final synthetic Lw3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:LE3;

.field public final synthetic b:Landroid/widget/TextView;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Z

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(LE3;Landroid/widget/TextView;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw3;->a:LE3;

    iput-object p2, p0, Lw3;->b:Landroid/widget/TextView;

    iput-object p3, p0, Lw3;->c:Ljava/lang/String;

    iput-boolean p4, p0, Lw3;->d:Z

    iput-object p5, p0, Lw3;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 9

    iget-object v1, p0, Lw3;->a:LE3;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v5, p0, Lw3;->b:Landroid/widget/TextView;

    invoke-virtual {v5}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x6

    const/4 v2, 0x0

    :try_start_0
    const-string v3, ":"

    invoke-virtual {p1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    aget-object v3, p1, v2

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    const/4 v3, 0x1

    aget-object p1, p1, v3

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance p1, Landroid/widget/TimePicker;

    invoke-virtual {v1}, Lzc;->I()Landroid/content/Context;

    move-result-object v3

    invoke-direct {p1, v3}, Landroid/widget/TimePicker;-><init>(Landroid/content/Context;)V

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v3}, Landroid/widget/TimePicker;->setIs24HourView(Ljava/lang/Boolean;)V

    invoke-virtual {p1, v0}, Landroid/widget/TimePicker;->setHour(I)V

    invoke-virtual {p1, v2}, Landroid/widget/TimePicker;->setMinute(I)V

    new-instance v7, LQ0;

    invoke-virtual {v1}, Lzc;->I()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v7, v0}, LQ0;-><init>(Landroid/content/Context;)V

    iget-object v0, v7, LQ0;->b:Ljava/lang/Object;

    check-cast v0, LM0;

    iput-object p1, v0, LM0;->r:Landroid/view/View;

    new-instance v8, Lz3;

    iget-boolean v4, p0, Lw3;->d:Z

    iget-object v6, p0, Lw3;->e:Ljava/lang/String;

    iget-object v3, p0, Lw3;->c:Ljava/lang/String;

    move-object v0, v8

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lz3;-><init>(LE3;Landroid/widget/TimePicker;Ljava/lang/String;ZLandroid/widget/TextView;Ljava/lang/String;)V

    const p1, 0x7f1301c4

    invoke-virtual {v7, p1, v8}, LQ0;->e(ILandroid/content/DialogInterface$OnClickListener;)LQ0;

    const p1, 0x7f130194

    const/4 v0, 0x0

    invoke-virtual {v7, p1, v0}, LQ0;->d(ILandroid/content/DialogInterface$OnClickListener;)LQ0;

    invoke-virtual {v7}, LQ0;->g()V

    return-void
.end method
