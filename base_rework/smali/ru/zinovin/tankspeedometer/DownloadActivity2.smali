.class public Lru/zinovin/tankspeedometer/DownloadActivity2;
.super Lq1;
.source "SourceFile"


# static fields
.field public static final G:Lmi;


# instance fields
.field public A:Lcom/google/android/material/textfield/TextInputEditText;

.field public B:Landroid/widget/ProgressBar;

.field public C:Landroid/widget/TextView;

.field public D:Landroid/widget/CheckBox;

.field public E:Landroid/os/Handler;

.field public F:Landroid/widget/AutoCompleteTextView;

.field public y:Landroid/widget/Button;

.field public z:Lcom/google/android/material/textfield/TextInputEditText;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lmi;->c:Ljava/util/regex/Pattern;

    const-string v0, "application/json; charset=utf-8"

    invoke-static {v0}, LTf;->r(Ljava/lang/String;)Lmi;

    move-result-object v0

    sput-object v0, Lru/zinovin/tankspeedometer/DownloadActivity2;->G:Lmi;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lq1;-><init>()V

    return-void
.end method


# virtual methods
.method public final E()V
    .locals 2

    iget-object v0, p0, Lru/zinovin/tankspeedometer/DownloadActivity2;->y:Landroid/widget/Button;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p0, Lru/zinovin/tankspeedometer/DownloadActivity2;->C:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lru/zinovin/tankspeedometer/DownloadActivity2;->B:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final F(Ljava/lang/Exception;Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ERROR"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lru/zinovin/tankspeedometer/DownloadActivity2;->G(Ljava/lang/String;)V

    const-string v0, "ERROR in "

    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "T500.ERROR"

    invoke-static {v0, p2, p1}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final G(Ljava/lang/String;)V
    .locals 2

    new-instance v0, LI9;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, LI9;-><init>(Lru/zinovin/tankspeedometer/DownloadActivity2;Ljava/lang/String;I)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final attachBaseContext(Landroid/content/Context;)V
    .locals 3

    invoke-static {p1}, Lmk;->l(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "language"

    const-string v2, "sys"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget-object v1, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    :cond_0
    invoke-static {p1, v0}, LF4;->b0(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Context;

    move-result-object p1

    invoke-super {p0, p1}, Lq1;->attachBaseContext(Landroid/content/Context;)V

    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Lq1;->onCreate(Landroid/os/Bundle;)V

    invoke-static {p0}, Lka;->a(LP6;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    const p1, 0x7f0e005f

    invoke-virtual {p0, p1}, Lq1;->setContentView(I)V

    const p1, 0x7f0b029c

    invoke-virtual {p0, p1}, Lq1;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    invoke-virtual {p0, p1}, Lq1;->D(Lcom/google/android/material/appbar/MaterialToolbar;)V

    invoke-virtual {p0}, Lq1;->u()LBr;

    move-result-object p1

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lq1;->u()LBr;

    move-result-object p1

    invoke-virtual {p1, v0}, LBr;->k0(Z)V

    invoke-virtual {p0}, Lq1;->u()LBr;

    move-result-object p1

    const v1, 0x7f13019e

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, LBr;->m0(Ljava/lang/String;)V

    :cond_0
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {p1, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lru/zinovin/tankspeedometer/DownloadActivity2;->E:Landroid/os/Handler;

    const-string p1, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {p0, p1}, LF4;->j(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_1

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1, v0}, LF4;->W(Landroid/app/Activity;[Ljava/lang/String;I)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    :cond_1
    const p1, 0x7f0b0089

    invoke-virtual {p0, p1}, Lq1;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    iput-object p1, p0, Lru/zinovin/tankspeedometer/DownloadActivity2;->D:Landroid/widget/CheckBox;

    const p1, 0x7f0b0099

    invoke-virtual {p0, p1}, Lq1;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    iput-object p1, p0, Lru/zinovin/tankspeedometer/DownloadActivity2;->y:Landroid/widget/Button;

    const p1, 0x7f0b02c6

    invoke-virtual {p0, p1}, Lq1;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "VIN: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "persist.gwm.vehicle.vin"

    invoke-static {p0, v1}, LTf;->F(Landroid/app/Activity;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p1, 0x7f0b01fe

    invoke-virtual {p0, p1}, Lq1;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    iput-object p1, p0, Lru/zinovin/tankspeedometer/DownloadActivity2;->z:Lcom/google/android/material/textfield/TextInputEditText;

    const-string v0, "password"

    invoke-static {v0}, LTf;->H(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p1, 0x7f0b0075

    invoke-virtual {p0, p1}, Lq1;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    iput-object p1, p0, Lru/zinovin/tankspeedometer/DownloadActivity2;->A:Lcom/google/android/material/textfield/TextInputEditText;

    const-string v0, "authcode"

    invoke-static {v0}, LTf;->H(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p1, 0x7f0b020b

    invoke-virtual {p0, p1}, Lq1;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lru/zinovin/tankspeedometer/DownloadActivity2;->B:Landroid/widget/ProgressBar;

    const p1, 0x7f0b020d

    invoke-virtual {p0, p1}, Lq1;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lru/zinovin/tankspeedometer/DownloadActivity2;->C:Landroid/widget/TextView;

    const p1, 0x7f0b01a5

    invoke-virtual {p0, p1}, Lq1;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    invoke-static {p0}, LTf;->v(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f130196

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p1, 0x7f0b0071

    invoke-virtual {p0, p1}, Lq1;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/AutoCompleteTextView;

    iput-object p1, p0, Lru/zinovin/tankspeedometer/DownloadActivity2;->F:Landroid/widget/AutoCompleteTextView;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    const-string v0, "NaviOnIP"

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v0, "TouchControl"

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v0, "NaviManager"

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v0, "HiddenControl"

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Landroid/widget/ArrayAdapter;

    const v1, 0x109000a

    invoke-direct {v0, p0, v1, p1}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    iget-object p1, p0, Lru/zinovin/tankspeedometer/DownloadActivity2;->F:Landroid/widget/AutoCompleteTextView;

    invoke-virtual {p1, v0}, Landroid/widget/AutoCompleteTextView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget-object p1, p0, Lru/zinovin/tankspeedometer/DownloadActivity2;->y:Landroid/widget/Button;

    new-instance v0, Lc6;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lc6;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x102002c

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, LP6;->onBackPressed()V

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1}, Landroid/app/Activity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method
