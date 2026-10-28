.class public final synthetic LP3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LQ3;

.field public final synthetic c:Ljava/lang/Exception;


# direct methods
.method public synthetic constructor <init>(LQ3;Ljava/lang/Exception;I)V
    .locals 0

    iput p3, p0, LP3;->a:I

    iput-object p1, p0, LP3;->b:LQ3;

    iput-object p2, p0, LP3;->c:Ljava/lang/Exception;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget v0, p0, LP3;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, LQ0;

    iget-object v1, p0, LP3;->b:LQ3;

    invoke-virtual {v1}, Lzc;->I()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, LQ0;-><init>(Landroid/content/Context;)V

    const v2, 0x7f1301fa

    invoke-virtual {v0, v2}, LQ0;->f(I)LQ0;

    iget-object v2, p0, LP3;->c:Ljava/lang/Exception;

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const v3, 0x7f1301f9

    invoke-virtual {v1, v3, v2}, Lzc;->m(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, v0, LQ0;->b:Ljava/lang/Object;

    check-cast v2, LM0;

    iput-object v1, v2, LM0;->f:Ljava/lang/CharSequence;

    const v1, 0x7f1301c4

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, LQ0;->e(ILandroid/content/DialogInterface$OnClickListener;)LQ0;

    invoke-virtual {v0}, LQ0;->g()V

    return-void

    :pswitch_0
    new-instance v0, LQ0;

    iget-object v1, p0, LP3;->b:LQ3;

    invoke-virtual {v1}, Lzc;->I()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, LQ0;-><init>(Landroid/content/Context;)V

    const v2, 0x7f130207

    invoke-virtual {v0, v2}, LQ0;->f(I)LQ0;

    iget-object v2, p0, LP3;->c:Ljava/lang/Exception;

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const v3, 0x7f1301f9

    invoke-virtual {v1, v3, v2}, Lzc;->m(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, v0, LQ0;->b:Ljava/lang/Object;

    check-cast v2, LM0;

    iput-object v1, v2, LM0;->f:Ljava/lang/CharSequence;

    const v1, 0x7f1301c4

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, LQ0;->e(ILandroid/content/DialogInterface$OnClickListener;)LQ0;

    invoke-virtual {v0}, LQ0;->g()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
