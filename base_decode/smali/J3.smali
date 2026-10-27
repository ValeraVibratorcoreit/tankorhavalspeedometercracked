.class public final synthetic LJ3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:LL3;


# direct methods
.method public synthetic constructor <init>(LL3;I)V
    .locals 0

    iput p2, p0, LJ3;->a:I

    iput-object p1, p0, LJ3;->b:LL3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    iget p1, p0, LJ3;->a:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, LJ3;->b:LL3;

    invoke-virtual {p1}, LL3;->O()V

    return-void

    :pswitch_0
    iget-object p1, p0, LJ3;->b:LL3;

    iget-object v0, p1, LL3;->T:Lk0;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lk0;->b:Ljava/lang/Object;

    check-cast v0, LE3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.PICK"

    sget-object v3, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const/4 v2, 0x2

    invoke-virtual {v0, v1, v2}, Lzc;->N(Landroid/content/Intent;I)V

    :cond_0
    invoke-virtual {p1}, LL3;->O()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
