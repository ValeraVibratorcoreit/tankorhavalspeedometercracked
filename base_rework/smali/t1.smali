.class public Lt1;
.super Landroid/widget/Button;
.source "SourceFile"


# instance fields
.field public final a:Ls1;

.field public final b:Lz2;

.field public c:LX1;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    invoke-static {p1}, LKq;->a(Landroid/content/Context;)V

    invoke-direct {p0, p1, p2, p3}, Landroid/widget/Button;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p0, p1}, LCq;->a(Landroid/view/View;Landroid/content/Context;)V

    new-instance p1, Ls1;

    invoke-direct {p1, p0}, Ls1;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lt1;->a:Ls1;

    invoke-virtual {p1, p2, p3}, Ls1;->d(Landroid/util/AttributeSet;I)V

    new-instance p1, Lz2;

    invoke-direct {p1, p0}, Lz2;-><init>(Landroid/widget/TextView;)V

    iput-object p1, p0, Lt1;->b:Lz2;

    invoke-virtual {p1, p2, p3}, Lz2;->f(Landroid/util/AttributeSet;I)V

    invoke-virtual {p1}, Lz2;->b()V

    invoke-direct {p0}, Lt1;->getEmojiTextViewHelper()LX1;

    move-result-object p1

    invoke-virtual {p1, p2, p3}, LX1;->b(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private getEmojiTextViewHelper()LX1;
    .locals 1

    iget-object v0, p0, Lt1;->c:LX1;

    if-nez v0, :cond_0

    new-instance v0, LX1;

    invoke-direct {v0, p0}, LX1;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Lt1;->c:LX1;

    :cond_0
    iget-object v0, p0, Lt1;->c:LX1;

    return-object v0
.end method


# virtual methods
.method public final drawableStateChanged()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V

    iget-object v0, p0, Lt1;->a:Ls1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ls1;->a()V

    :cond_0
    iget-object v0, p0, Lt1;->b:Lz2;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lz2;->b()V

    :cond_1
    return-void
.end method

.method public getAutoSizeMaxTextSize()I
    .locals 1

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeMaxTextSize()I

    move-result v0

    return v0
.end method

.method public getAutoSizeMinTextSize()I
    .locals 1

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeMinTextSize()I

    move-result v0

    return v0
.end method

.method public getAutoSizeStepGranularity()I
    .locals 1

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeStepGranularity()I

    move-result v0

    return v0
.end method

.method public getAutoSizeTextAvailableSizes()[I
    .locals 1

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeTextAvailableSizes()[I

    move-result-object v0

    return-object v0
.end method

.method public getAutoSizeTextType()I
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    invoke-super {p0}, Landroid/widget/TextView;->getAutoSizeTextType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;
    .locals 1

    invoke-super {p0}, Landroid/widget/TextView;->getCustomSelectionActionModeCallback()Landroid/view/ActionMode$Callback;

    move-result-object v0

    return-object v0
.end method

.method public getSupportBackgroundTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lt1;->a:Ls1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ls1;->b()Landroid/content/res/ColorStateList;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportBackgroundTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lt1;->a:Ls1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ls1;->c()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getSupportCompoundDrawablesTintList()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Lt1;->b:Lz2;

    invoke-virtual {v0}, Lz2;->d()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public getSupportCompoundDrawablesTintMode()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Lt1;->b:Lz2;

    invoke-virtual {v0}, Lz2;->e()Landroid/graphics/PorterDuff$Mode;

    move-result-object v0

    return-object v0
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    const-class v0, Landroid/widget/Button;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityRecord;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    const-class v0, Landroid/widget/Button;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onLayout(ZIIII)V
    .locals 0

    invoke-super/range {p0 .. p5}, Landroid/view/View;->onLayout(ZIIII)V

    iget-object p1, p0, Lt1;->b:Lz2;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->onTextChanged(Ljava/lang/CharSequence;III)V

    return-void
.end method

.method public setAllCaps(Z)V
    .locals 1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setAllCaps(Z)V

    invoke-direct {p0}, Lt1;->getEmojiTextViewHelper()LX1;

    move-result-object v0

    invoke-virtual {v0, p1}, LX1;->c(Z)V

    return-void
.end method

.method public setAutoSizeTextTypeWithDefaults(I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/TextView;->setAutoSizeTextTypeWithDefaults(I)V

    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lt1;->a:Ls1;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ls1;->e()V

    :cond_0
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    iget-object v0, p0, Lt1;->a:Ls1;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ls1;->f(I)V

    :cond_0
    return-void
.end method

.method public setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/TextView;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    return-void
.end method

.method public setEmojiCompatEnabled(Z)V
    .locals 1

    invoke-direct {p0}, Lt1;->getEmojiTextViewHelper()LX1;

    move-result-object v0

    invoke-virtual {v0, p1}, LX1;->d(Z)V

    return-void
.end method

.method public setFilters([Landroid/text/InputFilter;)V
    .locals 1

    invoke-direct {p0}, Lt1;->getEmojiTextViewHelper()LX1;

    move-result-object v0

    invoke-virtual {v0, p1}, LX1;->a([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    invoke-super {p0, p1}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method public setSupportAllCaps(Z)V
    .locals 1

    iget-object v0, p0, Lt1;->b:Lz2;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lz2;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setAllCaps(Z)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lt1;->a:Ls1;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ls1;->h(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setSupportBackgroundTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lt1;->a:Ls1;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ls1;->i(Landroid/graphics/PorterDuff$Mode;)V

    :cond_0
    return-void
.end method

.method public setSupportCompoundDrawablesTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Lt1;->b:Lz2;

    invoke-virtual {v0, p1}, Lz2;->i(Landroid/content/res/ColorStateList;)V

    invoke-virtual {v0}, Lz2;->b()V

    return-void
.end method

.method public setSupportCompoundDrawablesTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Lt1;->b:Lz2;

    invoke-virtual {v0, p1}, Lz2;->j(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v0}, Lz2;->b()V

    return-void
.end method

.method public final setTextAppearance(Landroid/content/Context;I)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    iget-object v0, p0, Lt1;->b:Lz2;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lz2;->g(Landroid/content/Context;I)V

    :cond_0
    return-void
.end method
