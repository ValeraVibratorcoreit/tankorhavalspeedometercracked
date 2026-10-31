.class public final Lru/zinovin/tankspeedometer/ThemeLayoutHelper;
.super Ljava/lang/Object;
.source "ThemeLayoutHelper.java"

# direct methods
.method public constructor <init>()V
    .locals 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V
    return-void
.end method

.method public static apply(Lru/zinovin/tankspeedometer/SpedometerPanel;)V
    .locals 3

    :try_start_all
    if-nez p0, :cond_start
    return-void

    :cond_start
    # Always keep left and right wells visible
    const/4 v0, 0x0
    iget-object v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->u:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;
    if-eqz v1, :show_v
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    :show_v
    iget-object v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->v:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;
    if-eqz v1, :hide_submeters
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    :hide_submeters
    # Hide submeters if any (y, z, A)
    const/16 v0, 0x8
    iget-object v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->y:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;
    if-eqz v1, :hide_z
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    :hide_z
    iget-object v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->z:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;
    if-eqz v1, :hide_a
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    :hide_a
    iget-object v1, p0, Lru/zinovin/tankspeedometer/SpedometerPanel;->A:Lru/zinovin/tankspeedometer/view/speedometer/SpeedometerView;
    if-eqz v1, :done
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    :done
    return-void

    :try_end_all
    .catch Ljava/lang/Throwable; {:try_start_all .. :try_end_all} :catch_all

    :catch_all
    move-exception v0
    const-string v1, "T500.THEMES"
    const-string v2, "Error applying theme layout"
    invoke-static {v1, v2, v0}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    return-void
.end method
