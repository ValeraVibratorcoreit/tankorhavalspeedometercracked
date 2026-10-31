.class public LMn;
.super Lzc;
.source "SourceFile"


# instance fields
.field public T:Ljava/lang/CharSequence;

.field public U:Ljava/lang/String;

.field public V:I

.field public W:Ljava/lang/CharSequence;

.field public X:Ld4;

.field public Y:Landroid/widget/EditText;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lzc;-><init>()V

    const-string v0, ""

    iput-object v0, p0, LMn;->T:Ljava/lang/CharSequence;

    iput-object v0, p0, LMn;->U:Ljava/lang/String;

    const/4 v0, 0x1

    iput v0, p0, LMn;->V:I

    return-void
.end method


# virtual methods
.method public final O()V
    .locals 3

    iget-object v0, p0, LMn;->Y:Landroid/widget/EditText;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    if-eqz v0, :cond_1

    iget-object v1, p0, LMn;->Y:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lzc;->h()Landroid/content/Context;

    move-result-object v0

    instance-of v1, v0, Lkf;

    if-eqz v1, :cond_2

    check-cast v0, Lkf;

    check-cast v0, Lru/zinovin/tankspeedometer/MainActivity;

    invoke-virtual {v0}, Lru/zinovin/tankspeedometer/MainActivity;->F()V

    :cond_2
    return-void
.end method

.method public final P(I)I
    .locals 1

    invoke-virtual {p0}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    int-to-float p1, p1

    mul-float/2addr v0, p1

    float-to-int p1, v0

    return p1
.end method

.method public final w(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 10

    new-instance p1, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-virtual {p0}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f060334

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    new-instance v0, Landroid/widget/LinearLayout;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v3, 0x10

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    invoke-virtual {p0}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f060336

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v0, v4}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {p0}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f07035d

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {v0, v4}, Landroid/view/View;->setMinimumHeight(I)V

    const/16 v4, 0xc

    invoke-virtual {p0, v4}, LMn;->P(I)I

    move-result v5

    invoke-virtual {v0, v5, v2, v5, v2}, Landroid/view/View;->setPadding(IIII)V

    new-instance v5, Landroid/widget/ImageButton;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v6

    invoke-direct {v5, v6}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;)V

    const v6, 0x7f08015f

    invoke-virtual {v5, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {v5, v2}, Landroid/view/View;->setBackgroundColor(I)V

    new-instance v6, LLn;

    const/4 v7, 0x0

    invoke-direct {v6, p0, v7}, LLn;-><init>(LMn;I)V

    invoke-virtual {v5, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/16 v6, 0x28

    invoke-virtual {p0, v6}, LMn;->P(I)I

    move-result v6

    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v7, v6, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v5, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v5, Landroid/widget/TextView;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v6

    invoke-direct {v5, v6}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iget-object v6, p0, LMn;->T:Ljava/lang/CharSequence;

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x7f060340

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v6, 0x42040000    # 33.0f

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {v5, p2}, Landroid/widget/TextView;->setSingleLine(Z)V

    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v8, -0x2

    invoke-direct {v6, v8, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v9, 0x8

    invoke-virtual {p0, v9}, LMn;->P(I)I

    move-result v9

    invoke-virtual {v6, v9}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-virtual {v0, v5, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v0, Lji;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v0, v5}, Lji;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    invoke-virtual {p0, v3}, LMn;->P(I)I

    move-result v3

    invoke-virtual {v0, v3, v3, v3, v3}, Landroid/view/View;->setPadding(IIII)V

    new-instance v3, Landroid/widget/FrameLayout;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v3, v5}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    new-instance v5, Landroid/widget/EditText;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v6

    invoke-direct {v5, v6}, Landroid/widget/EditText;-><init>(Landroid/content/Context;)V

    iput-object v5, p0, LMn;->Y:Landroid/widget/EditText;

    iget v6, p0, LMn;->V:I

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setInputType(I)V

    iget-object v5, p0, LMn;->Y:Landroid/widget/EditText;

    iget-object v6, p0, LMn;->U:Ljava/lang/String;

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v5, p0, LMn;->Y:Landroid/widget/EditText;

    iget-object v6, p0, LMn;->W:Ljava/lang/CharSequence;

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    iget-object v5, p0, LMn;->Y:Landroid/widget/EditText;

    invoke-virtual {v5, p2}, Landroid/widget/TextView;->setSingleLine(Z)V

    iget-object v5, p0, LMn;->Y:Landroid/widget/EditText;

    invoke-virtual {p0}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v5, p0, LMn;->Y:Landroid/widget/EditText;

    const/high16 v6, 0x41d80000    # 27.0f

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextSize(F)V

    iget-object v5, p0, LMn;->Y:Landroid/widget/EditText;

    const v6, 0x7f080167

    invoke-virtual {v5, v6}, Landroid/view/View;->setBackgroundResource(I)V

    iget-object v5, p0, LMn;->Y:Landroid/widget/EditText;

    invoke-virtual {v5, p2}, Landroid/widget/TextView;->setSelectAllOnFocus(Z)V

    const/16 p2, 0xe

    invoke-virtual {p0, p2}, LMn;->P(I)I

    move-result p2

    iget-object v5, p0, LMn;->Y:Landroid/widget/EditText;

    invoke-virtual {p0, v4}, LMn;->P(I)I

    move-result v6

    const/16 v7, 0x2c

    invoke-virtual {p0, v7}, LMn;->P(I)I

    move-result v7

    invoke-virtual {p0, v4}, LMn;->P(I)I

    move-result v9

    invoke-virtual {v5, p2, v6, v7, v9}, Landroid/view/View;->setPadding(IIII)V

    iget-object p2, p0, LMn;->Y:Landroid/widget/EditText;

    const/16 v5, 0x34

    invoke-virtual {p0, v5}, LMn;->P(I)I

    move-result v6

    invoke-virtual {p2, v6}, Landroid/widget/TextView;->setMinHeight(I)V

    iget-object p2, p0, LMn;->Y:Landroid/widget/EditText;

    new-instance v6, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v7, -0x1

    invoke-direct {v6, v7, v8}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v3, p2, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance p2, Landroid/widget/ImageView;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v6

    invoke-direct {p2, v6}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    const v6, 0x7f080171

    invoke-virtual {p2, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    new-instance v6, LLn;

    const/4 v7, 0x1

    invoke-direct {v6, p0, v7}, LLn;-><init>(LMn;I)V

    invoke-virtual {p2, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const/16 v6, 0x18

    invoke-virtual {p0, v6}, LMn;->P(I)I

    move-result v6

    new-instance v7, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v7, v6, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const v6, 0x800015

    iput v6, v7, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-virtual {p0, v4}, LMn;->P(I)I

    move-result v6

    invoke-virtual {v7, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {v3, p2, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance p2, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-direct {p2, v2, v8, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v0, v3, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance p2, Landroid/widget/TextView;

    invoke-virtual {p0}, Lzc;->I()Landroid/content/Context;

    move-result-object v3

    invoke-direct {p2, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const v3, 0x7f1301d0

    invoke-virtual {p2, v3}, Landroid/widget/TextView;->setText(I)V

    const/16 v3, 0x11

    invoke-virtual {p2, v3}, Landroid/widget/TextView;->setGravity(I)V

    invoke-virtual {p0}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {p0}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f07034d

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    invoke-virtual {p2, v2, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    const v1, 0x7f080160

    invoke-virtual {p2, v1}, Landroid/view/View;->setBackgroundResource(I)V

    const/16 v1, 0x1c

    invoke-virtual {p0, v1}, LMn;->P(I)I

    move-result v1

    invoke-virtual {p2, v1, v2, v1, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {p0}, Lzc;->k()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f07034c

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setMinHeight(I)V

    new-instance v1, LLn;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, LLn;-><init>(LMn;I)V

    invoke-virtual {p2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {p0, v5}, LMn;->P(I)I

    move-result v2

    invoke-direct {v1, v8, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v4}, LMn;->P(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-virtual {p2, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object p2, p0, LMn;->Y:Landroid/widget/EditText;

    invoke-virtual {p2}, Landroid/view/View;->requestFocus()Z

    iget-object p2, p0, LMn;->Y:Landroid/widget/EditText;

    new-instance v1, Lt5;

    const/16 v2, 0x12

    invoke-direct {v1, p0, v2}, Lt5;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p2, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-object p1
.end method
