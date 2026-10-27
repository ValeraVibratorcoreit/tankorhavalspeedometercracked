.class public final synthetic Ljo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;


# direct methods
.method public synthetic constructor <init>(Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;I)V
    .locals 0

    iput p2, p0, Ljo;->a:I

    iput-object p1, p0, Ljo;->b:Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 0

    iget p1, p0, Ljo;->a:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, Ljo;->b:Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;

    iget-object p1, p1, Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;->e:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->showDropDown()V

    return-void

    :pswitch_0
    iget-object p1, p0, Ljo;->b:Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;

    iget-object p1, p1, Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;->e:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->showDropDown()V

    return-void

    :pswitch_1
    iget-object p1, p0, Ljo;->b:Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;

    iget-object p1, p1, Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;->e:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->showDropDown()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
