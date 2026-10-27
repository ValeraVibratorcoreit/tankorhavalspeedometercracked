.class public final synthetic LO3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LQ3;


# direct methods
.method public synthetic constructor <init>(LQ3;I)V
    .locals 0

    iput p2, p0, LO3;->a:I

    iput-object p1, p0, LO3;->b:LQ3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget v0, p0, LO3;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LO3;->b:LQ3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    iget-object v1, v0, LQ3;->V:LPn;

    invoke-virtual {v1}, LPn;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v1, 0x0

    :cond_0
    iget-object v2, v0, LQ3;->U:LS3;

    invoke-virtual {v2, v1}, LS3;->i(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    new-instance v2, LB1;

    const/4 v3, 0x4

    invoke-direct {v2, v0, v3, v1}, LB1;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {v0, v2}, LQ3;->c0(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "T500.Backup"

    const-string v3, "Backup creation failed"

    invoke-static {v2, v3, v1}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v2, LP3;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v1, v3}, LP3;-><init>(LQ3;Ljava/lang/Exception;I)V

    invoke-virtual {v0, v2}, LQ3;->c0(Ljava/lang/Runnable;)V

    :goto_0
    return-void

    :pswitch_0
    new-instance v0, LQ0;

    iget-object v1, p0, LO3;->b:LQ3;

    invoke-virtual {v1}, Lzc;->I()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, LQ0;-><init>(Landroid/content/Context;)V

    const v2, 0x7f13020d

    invoke-virtual {v0, v2}, LQ0;->f(I)LQ0;

    iget-object v2, v0, LQ0;->b:Ljava/lang/Object;

    check-cast v2, LM0;

    iget-object v3, v2, LM0;->a:Landroid/content/Context;

    const v4, 0x7f13020c

    invoke-virtual {v3, v4}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v3

    iput-object v3, v2, LM0;->f:Ljava/lang/CharSequence;

    new-instance v2, LM3;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, LM3;-><init>(Ljava/lang/Object;I)V

    const v1, 0x7f1301c4

    invoke-virtual {v0, v1, v2}, LQ0;->e(ILandroid/content/DialogInterface$OnClickListener;)LQ0;

    invoke-virtual {v0}, LQ0;->g()V

    return-void

    :pswitch_1
    new-instance v0, LQ0;

    iget-object v1, p0, LO3;->b:LQ3;

    invoke-virtual {v1}, Lzc;->I()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, LQ0;-><init>(Landroid/content/Context;)V

    const v1, 0x7f130207

    invoke-virtual {v0, v1}, LQ0;->f(I)LQ0;

    iget-object v1, v0, LQ0;->b:Ljava/lang/Object;

    check-cast v1, LM0;

    iget-object v2, v1, LM0;->a:Landroid/content/Context;

    const v3, 0x7f130208

    invoke-virtual {v2, v3}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v2

    iput-object v2, v1, LM0;->f:Ljava/lang/CharSequence;

    const v1, 0x7f1301c4

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, LQ0;->e(ILandroid/content/DialogInterface$OnClickListener;)LQ0;

    invoke-virtual {v0}, LQ0;->g()V

    return-void

    :pswitch_2
    iget-object v0, p0, LO3;->b:LQ3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.GET_CONTENT"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v2, "*/*"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "android.intent.category.OPENABLE"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    const v2, 0x7f13020b

    :try_start_1
    invoke-virtual {v0, v2}, Lzc;->l(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v1

    const/16 v2, 0x3e9

    invoke-virtual {v0, v1, v2}, Lzc;->N(Landroid/content/Intent;I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v1

    const-string v2, "T500.Backup"

    const-string v3, "Error opening file picker"

    invoke-static {v2, v3, v1}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v0}, Lzc;->I()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f13020a

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    :goto_1
    return-void

    :pswitch_3
    iget-object v0, p0, LO3;->b:LQ3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ljava/lang/Thread;

    new-instance v2, LO3;

    const/4 v3, 0x4

    invoke-direct {v2, v0, v3}, LO3;-><init>(LQ3;I)V

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
