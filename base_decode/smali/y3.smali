.class public final synthetic Ly3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    iput p1, p0, Ly3;->a:I

    iput-object p2, p0, Ly3;->c:Ljava/lang/Object;

    iput-object p3, p0, Ly3;->d:Ljava/lang/Object;

    iput-boolean p4, p0, Ly3;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-boolean v0, p0, Ly3;->b:Z

    iget-object v1, p0, Ly3;->d:Ljava/lang/Object;

    const/4 v2, 0x1

    iget-object v3, p0, Ly3;->c:Ljava/lang/Object;

    iget v4, p0, Ly3;->a:I

    packed-switch v4, :pswitch_data_0

    sget v4, Lru/zinovin/tankspeedometer/SpedometerPanel;->s0:I

    check-cast v3, Lru/zinovin/tankspeedometer/SpedometerPanel;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "usePreferences"

    check-cast v1, Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1, v4, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-virtual {v3, v0}, Lru/zinovin/tankspeedometer/SpedometerPanel;->s(Z)V

    return-void

    :pswitch_0
    check-cast v3, LE3;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v1, Landroid/widget/Button;

    invoke-virtual {v1, v2}, Landroid/view/View;->setEnabled(Z)V

    if-eqz v0, :cond_0

    const v0, 0x7f13003a

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, v3, LE3;->c0:Landroid/widget/LinearLayout;

    invoke-virtual {v3, v0, v2}, LE3;->m0(Landroid/view/View;Z)V

    goto :goto_0

    :cond_0
    const v0, 0x7f130039

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(I)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
