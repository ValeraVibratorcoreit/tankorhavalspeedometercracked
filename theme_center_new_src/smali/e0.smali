.class public final Le0;
.super Ltc;
.source "SourceFile"


# instance fields
.field public final synthetic j:I

.field public final synthetic k:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroidx/appcompat/view/menu/ActionMenuItemView;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Le0;->j:I

    .line 1
    iput-object p1, p0, Le0;->k:Landroid/view/View;

    .line 2
    invoke-direct {p0, p1}, Ltc;-><init>(Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lj0;Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Le0;->j:I

    .line 3
    iput-object p1, p0, Le0;->k:Landroid/view/View;

    invoke-direct {p0, p2}, Ltc;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final b()LCo;
    .locals 2

    iget v0, p0, Le0;->j:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Le0;->k:Landroid/view/View;

    check-cast v0, Lj0;

    iget-object v0, v0, Lj0;->d:Ll0;

    iget-object v0, v0, Ll0;->s:Lg0;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LFi;->a()LDi;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_0
    iget-object v0, p0, Le0;->k:Landroid/view/View;

    check-cast v0, Landroidx/appcompat/view/menu/ActionMenuItemView;

    iget-object v0, v0, Landroidx/appcompat/view/menu/ActionMenuItemView;->l:Lf0;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast v0, Lh0;

    iget-object v0, v0, Lh0;->a:Ll0;

    iget-object v0, v0, Ll0;->t:Lg0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LFi;->a()LDi;

    move-result-object v1

    :cond_1
    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c()Z
    .locals 3

    iget v0, p0, Le0;->j:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Le0;->k:Landroid/view/View;

    check-cast v0, Lj0;

    iget-object v0, v0, Lj0;->d:Ll0;

    invoke-virtual {v0}, Ll0;->l()Z

    const/4 v0, 0x1

    return v0

    :pswitch_0
    iget-object v0, p0, Le0;->k:Landroid/view/View;

    check-cast v0, Landroidx/appcompat/view/menu/ActionMenuItemView;

    iget-object v1, v0, Landroidx/appcompat/view/menu/ActionMenuItemView;->j:Lsi;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Landroidx/appcompat/view/menu/ActionMenuItemView;->g:Lyi;

    invoke-interface {v1, v0}, Lsi;->a(Lyi;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Le0;->b()LCo;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, LCo;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    :cond_0
    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public d()Z
    .locals 2

    iget v0, p0, Le0;->j:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ltc;->d()Z

    move-result v0

    return v0

    :pswitch_0
    iget-object v0, p0, Le0;->k:Landroid/view/View;

    check-cast v0, Lj0;

    iget-object v0, v0, Lj0;->d:Ll0;

    iget-object v1, v0, Ll0;->u:Li0;

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ll0;->e()Z

    const/4 v0, 0x1

    :goto_0
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
