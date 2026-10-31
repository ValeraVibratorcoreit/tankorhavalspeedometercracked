.class public final synthetic Lko;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic a:Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;


# direct methods
.method public synthetic constructor <init>(Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lko;->a:Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    sget p2, Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;->h:I

    iget-object p2, p0, Lko;->a:Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, p3}, Landroid/widget/AdapterView;->getItemAtPosition(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iget-object p2, p2, Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;->g:Lmo;

    if-eqz p2, :cond_0

    invoke-interface {p2, p1}, Lmo;->b(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
