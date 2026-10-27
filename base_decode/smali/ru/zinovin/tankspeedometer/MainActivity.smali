.class public Lru/zinovin/tankspeedometer/MainActivity;
.super Lq1;
.source "SourceFile"

# interfaces
.implements Lkf;


# static fields
.field public static final synthetic M:I


# instance fields
.field public A:Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;

.field public B:Landroidx/recyclerview/widget/RecyclerView;

.field public C:Lgo;

.field public D:Ljava/util/ArrayList;

.field public E:Ljava/lang/String;

.field public F:Lzc;

.field public G:Z

.field public H:LU2;

.field public I:Landroid/content/SharedPreferences;

.field public J:Z

.field public K:Z

.field public final L:LLf;

.field public y:Landroid/content/SharedPreferences;

.field public z:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lq1;-><init>()V

    const-string v0, "Audi Virtual Cockpit"

    iput-object v0, p0, Lru/zinovin/tankspeedometer/MainActivity;->z:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lru/zinovin/tankspeedometer/MainActivity;->G:Z

    iput-boolean v0, p0, Lru/zinovin/tankspeedometer/MainActivity;->J:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lru/zinovin/tankspeedometer/MainActivity;->K:Z

    invoke-static {}, LLf;->a()LLf;

    move-result-object v0

    iput-object v0, p0, Lru/zinovin/tankspeedometer/MainActivity;->L:LLf;

    return-void
.end method


# virtual methods
.method public final E()V
    .locals 6

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.settings.APPLICATION_DETAILS_SETTINGS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "package"

    const/4 v4, 0x0

    invoke-static {v3, v2, v4}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    const/high16 v5, 0x10000

    invoke-virtual {v2, v0, v5}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    if-eqz v0, :cond_0

    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    const-string v2, "com.gwm.app.settings"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.MAIN"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v1, Landroid/content/ComponentName;

    const-string v2, "com.android.settings"

    const-string v3, "com.android.settings.Settings"

    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_1

    :cond_1
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1, v4}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :goto_1
    return-void
.end method

.method public final F()V
    .locals 4

    const v0, 0x7f0b02ac

    invoke-virtual {p0, v0}, Lq1;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lq1;->v()LOc;

    move-result-object v2

    invoke-virtual {v2, v0}, LOc;->B(I)Lzc;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lq1;->v()LOc;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Ls3;

    invoke-direct {v3, v2}, Ls3;-><init>(LOc;)V

    invoke-virtual {v3, v0}, Ls3;->g(Lzc;)V

    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Ls3;->d(Z)I

    :cond_1
    const/16 v0, 0x8

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final G(Ljava/lang/String;)Landroid/content/SharedPreferences;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "prefs_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    return-object p1
.end method

.method public final H(Landroid/content/Intent;Z)V
    .locals 3

    if-eqz p1, :cond_0

    const-string v0, "ts_target_section"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    if-eqz p1, :cond_1

    const-string v2, "ts_target_tab"

    invoke-virtual {p1, v2, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    goto :goto_1

    :cond_1
    move p1, v1

    :goto_1
    if-nez v0, :cond_3

    if-eqz p2, :cond_2

    const-string p1, "setting_panel"

    invoke-virtual {p0, v1, p1}, Lru/zinovin/tankspeedometer/MainActivity;->K(ILjava/lang/String;)V

    :cond_2
    return-void

    :cond_3
    invoke-virtual {p0, p1, v0}, Lru/zinovin/tankspeedometer/MainActivity;->K(ILjava/lang/String;)V

    return-void
.end method

.method public final I()V
    .locals 12

    const/4 v0, 0x1

    const v1, 0x7f0e0105

    invoke-virtual {p0, v1}, Lq1;->setContentView(I)V

    invoke-static {p0}, Lmk;->l(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    iput-object v1, p0, Lru/zinovin/tankspeedometer/MainActivity;->y:Landroid/content/SharedPreferences;

    const-string v2, "selectedTheme"

    const-string v3, "Audi Virtual Cockpit"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lru/zinovin/tankspeedometer/MainActivity;->z:Ljava/lang/String;

    const v1, 0x7f0b02b8

    invoke-virtual {p0, v1}, Lq1;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;

    iput-object v1, p0, Lru/zinovin/tankspeedometer/MainActivity;->A:Lru/zinovin/tankspeedometer/preferences/widget/SettingsTopBar;

    const v1, 0x7f0b02af

    invoke-virtual {p0, v1}, Lq1;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v1, p0, Lru/zinovin/tankspeedometer/MainActivity;->B:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const-string v2, "setting_panel"

    const v3, 0x7f1300d7

    const v4, 0x7f08017d

    const-class v5, LAk;

    invoke-static {v2, v3, v4, v5}, Leo;->a(Ljava/lang/String;IILjava/lang/Class;)Leo;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v2, "setting_theme_view"

    const v3, 0x7f1300d8

    const v4, 0x7f08016f

    const-class v5, LDq;

    invoke-static {v2, v3, v4, v5}, Leo;->a(Ljava/lang/String;IILjava/lang/Class;)Leo;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v2, "setting_background"

    const v3, 0x7f1300d1

    const v4, 0x7f080170

    const-class v5, LE3;

    invoke-static {v2, v3, v4, v5}, Leo;->a(Ljava/lang/String;IILjava/lang/Class;)Leo;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v2, "setting_common"

    const v3, 0x7f1300d2

    const v4, 0x7f080172

    const-class v5, LD6;

    invoke-static {v2, v3, v4, v5}, Leo;->a(Ljava/lang/String;IILjava/lang/Class;)Leo;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v2, 0x7f130182

    const v3, 0x7f130183

    filled-new-array {v2, v3}, [I

    move-result-object v9

    const-class v2, Lsj;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-class v3, Lxj;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v10

    new-instance v2, Leo;

    const/4 v8, 0x0

    const-string v5, "setting_navi"

    const v6, 0x7f1300d6

    const v7, 0x7f08017b

    move-object v4, v2

    invoke-direct/range {v4 .. v10}, Leo;-><init>(Ljava/lang/String;IILjava/lang/Class;[I[Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v2, "setting_music"

    const v3, 0x7f1300d5

    const v4, 0x7f08017a

    const-class v5, Lmj;

    invoke-static {v2, v3, v4, v5}, Leo;->a(Ljava/lang/String;IILjava/lang/Class;)Leo;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v2, 0x7f13017f

    const v3, 0x7f13017e

    filled-new-array {v2, v3}, [I

    move-result-object v9

    const-class v2, Luf;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-class v3, Lqf;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v10

    new-instance v2, Leo;

    const/4 v8, 0x0

    const-string v5, "setting_indicators"

    const v6, 0x7f1300d3

    const v7, 0x7f080178

    move-object v4, v2

    invoke-direct/range {v4 .. v10}, Leo;-><init>(Ljava/lang/String;IILjava/lang/Class;[I[Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v2, 0x7f130185

    const v3, 0x7f130181

    const v4, 0x7f130180

    filled-new-array {v4, v2, v3}, [I

    move-result-object v10

    const-class v2, LEh;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-class v3, Lut;

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    const-class v4, LQ3;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v2, v3, v4}, [Ljava/lang/String;

    move-result-object v11

    new-instance v2, Leo;

    const/4 v9, 0x0

    const-string v6, "setting_manage"

    const v7, 0x7f1300d4

    const v8, 0x7f080179

    move-object v5, v2

    invoke-direct/range {v5 .. v11}, Leo;-><init>(Ljava/lang/String;IILjava/lang/Class;[I[Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const v2, 0x7f13019e

    filled-new-array {v2}, [I

    move-result-object v8

    const-class v2, LK9;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v9

    new-instance v2, Leo;

    const/4 v7, 0x0

    const-string v4, "setting_update"

    const v5, 0x7f1300d9

    const v6, 0x7f08017e

    move-object v3, v2

    invoke-direct/range {v3 .. v9}, Leo;-><init>(Ljava/lang/String;IILjava/lang/Class;[I[Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v2, "setting_about"

    const v3, 0x7f130186

    const v4, 0x7f08016e

    const-class v5, Lb;

    invoke-static {v2, v3, v4, v5}, Leo;->a(Ljava/lang/String;IILjava/lang/Class;)Leo;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-object v1, p0, Lru/zinovin/tankspeedometer/MainActivity;->D:Ljava/util/ArrayList;

    new-instance v2, Lgo;

    new-instance v4, Ld4;

    const/4 v5, 0x0

    invoke-direct {v4, p0, v5}, Ld4;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v2, v1, v4}, Lgo;-><init>(Ljava/util/ArrayList;Ld4;)V

    iput-object v2, p0, Lru/zinovin/tankspeedometer/MainActivity;->C:Lgo;

    iget-object v1, p0, Lru/zinovin/tankspeedometer/MainActivity;->B:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v2, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(LWl;)V

    new-instance v1, Lu9;

    invoke-direct {v1, p0}, Lu9;-><init>(Landroid/content/Context;)V

    const v2, 0x7f08016d

    invoke-static {p0, v2}, LH7;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_2

    iput-object v2, v1, Lu9;->a:Landroid/graphics/drawable/Drawable;

    iget-object v2, p0, Lru/zinovin/tankspeedometer/MainActivity;->B:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/RecyclerView;->g(LTl;)V

    iget-object v1, p0, Lru/zinovin/tankspeedometer/MainActivity;->B:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v2, p0, Lru/zinovin/tankspeedometer/MainActivity;->C:Lgo;

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(LOl;)V

    iput-boolean v0, p0, Lru/zinovin/tankspeedometer/MainActivity;->G:Z

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lru/zinovin/tankspeedometer/MainActivity;->H(Landroid/content/Intent;Z)V

    const v1, 0x7f0b02b1

    invoke-virtual {p0, v1}, Lq1;->findViewById(I)Landroid/view/View;

    move-result-object v1

    new-instance v2, Lf9;

    invoke-direct {v2, v0}, Lf9;-><init>(I)V

    sget-object v0, LGs;->a:Ljava/util/WeakHashMap;

    invoke-static {v1, v2}, Lvs;->u(Landroid/view/View;LRj;)V

    const-string v0, "SHOW_ABOUT"

    invoke-static {v0}, LTf;->H(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "false"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lru/zinovin/tankspeedometer/MainActivity;->I:Landroid/content/SharedPreferences;

    const-string v1, "language"

    const-string v2, "sys"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lq1;->getResources()Landroid/content/res/Resources;

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
    new-instance v1, Ljava/io/File;

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v2

    const-string v4, "about_"

    const-string v5, ".txt"

    invoke-static {v4, v0, v5}, LVo;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    invoke-virtual {v1}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    move-result-object v0

    invoke-static {v0}, Ljava/nio/file/Files;->readAllLines(Ljava/nio/file/Path;)Ljava/util/List;

    move-result-object v0

    const-string v1, "\n"

    invoke-static {v1, v0}, Ljava/lang/String;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Lru/zinovin/tankspeedometer/MainActivity;->M(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "T500.ERROR"

    const-string v2, "ERROR in normalStart()"

    invoke-static {v1, v2, v0}, Lyr;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-void

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Drawable cannot be null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final J(Lzc;)V
    .locals 4

    const v0, 0x7f0b02ac

    invoke-virtual {p0, v0}, Lq1;->findViewById(I)Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lq1;->v()LOc;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Ls3;

    invoke-direct {v3, v2}, Ls3;-><init>(LOc;)V

    const-string v2, "ts_overlay"

    invoke-virtual {v3, v0, p1, v2}, Ls3;->h(ILzc;Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-virtual {v3, p1}, Ls3;->d(Z)I

    invoke-virtual {v1, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final K(ILjava/lang/String;)V
    .locals 4

    iget-object v0, p0, Lru/zinovin/tankspeedometer/MainActivity;->D:Ljava/util/ArrayList;

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Leo;

    iget-object v3, v3, Leo;->a:Ljava/lang/String;

    invoke-virtual {v3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, -0x1

    :goto_1
    if-gez v2, :cond_2

    goto :goto_2

    :cond_2
    move v1, v2

    :goto_2
    invoke-virtual {p0, v1, p1}, Lru/zinovin/tankspeedometer/MainActivity;->L(II)V

    return-void
.end method

.method public final L(II)V
    .locals 5

    iget-boolean v0, p0, Lru/zinovin/tankspeedometer/MainActivity;->G:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lru/zinovin/tankspeedometer/MainActivity;->D:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leo;

    iget-object v1, v0, Leo;->a:Ljava/lang/String;

    iget-object v2, p0, Lru/zinovin/tankspeedometer/MainActivity;->E:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, v0, Leo;->f:[Ljava/lang/String;

    if-eqz v1, :cond_4

    if-eqz v2, :cond_4

    iget-object v1, p0, Lru/zinovin/tankspeedometer/MainActivity;->F:Lzc;

    instance-of v3, v1, Lio;

    if-eqz v3, :cond_4

    check-cast v1, Lio;

    iput p2, v1, Lio;->V:I

    iget-object v0, v1, Lzc;->E:Landroid/view/View;

    if-eqz v0, :cond_3

    const v1, 0x7f0b02b7

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/tabs/TabLayout;

    if-ltz p2, :cond_2

    invoke-virtual {v0}, Lcom/google/android/material/tabs/TabLayout;->getTabCount()I

    move-result v1

    if-lt p2, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, v0, Lcom/google/android/material/tabs/TabLayout;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcq;

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    const/4 p2, 0x0

    :goto_1
    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lcq;->a()V

    :cond_3
    iget-object p2, p0, Lru/zinovin/tankspeedometer/MainActivity;->C:Lgo;

    iput p1, p2, Lgo;->e:I

    iget-object p1, p2, LOl;->a:LPl;

    invoke-virtual {p1}, LPl;->b()V

    return-void

    :cond_4
    iget-object v1, v0, Leo;->a:Ljava/lang/String;

    iput-object v1, p0, Lru/zinovin/tankspeedometer/MainActivity;->E:Ljava/lang/String;

    iget-object v1, p0, Lru/zinovin/tankspeedometer/MainActivity;->C:Lgo;

    iput p1, v1, Lgo;->e:I

    iget-object p1, v1, LOl;->a:LPl;

    invoke-virtual {p1}, LPl;->b()V

    const/4 p1, 0x0

    if-gez p2, :cond_5

    move p2, p1

    :cond_5
    if-eqz v2, :cond_6

    new-instance v1, Lio;

    invoke-direct {v1}, Lio;-><init>()V

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-string v4, "ts_labels"

    iget-object v0, v0, Leo;->e:[I

    invoke-virtual {v3, v4, v0}, Landroid/os/BaseBundle;->putIntArray(Ljava/lang/String;[I)V

    const-string v0, "ts_classes"

    invoke-virtual {v3, v0, v2}, Landroid/os/BaseBundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    const-string v0, "ts_initial_tab"

    invoke-virtual {v3, v0, p2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {v1, v3}, Lzc;->L(Landroid/os/Bundle;)V

    goto :goto_2

    :cond_6
    :try_start_0
    iget-object p2, v0, Leo;->d:Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p2

    move-object v1, p2

    check-cast v1, Lzc;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_2
    iput-object v1, p0, Lru/zinovin/tankspeedometer/MainActivity;->F:Lzc;

    invoke-virtual {p0}, Lq1;->v()LOc;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ls3;

    invoke-direct {v0, p2}, Ls3;-><init>(LOc;)V

    const p2, 0x7f0b02ad

    const-string v2, "ts_section"

    invoke-virtual {v0, p2, v1, v2}, Ls3;->h(ILzc;Ljava/lang/String;)V

    iget-boolean p2, v0, Ls3;->g:Z

    if-nez p2, :cond_7

    iget-object p2, v0, Ls3;->p:LOc;

    invoke-virtual {p2, v0, p1}, LOc;->z(LMc;Z)V

    return-void

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "This transaction is already being added to the back stack"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final M(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x0

    invoke-static {p2, v0}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    move-result-object p2

    new-instance v0, Landroidx/core/widget/NestedScrollView;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/core/widget/NestedScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/core/widget/NestedScrollView;->setFillViewport(Z)V

    new-instance v1, Landroid/widget/TextView;

    invoke-direct {v1, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/16 p2, 0x14

    invoke-virtual {v1, p2, p2, p2, p2}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {p0}, Lq1;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->heightPixels:I

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v2, p2, p2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v0, v1}, Landroidx/core/widget/NestedScrollView;->addView(Landroid/view/View;)V

    new-instance p2, LQ0;

    invoke-direct {p2, p0}, LQ0;-><init>(Landroid/content/Context;)V

    iget-object v1, p2, LQ0;->b:Ljava/lang/Object;

    check-cast v1, LM0;

    iput-object p1, v1, LM0;->d:Ljava/lang/CharSequence;

    iput-object v0, v1, LM0;->r:Landroid/view/View;

    new-instance p1, LBh;

    const/4 v0, 0x5

    invoke-direct {p1, p0, v0}, LBh;-><init>(Lru/zinovin/tankspeedometer/MainActivity;I)V

    const v0, 0x104000a

    invoke-virtual {p2, v0, p1}, LQ0;->e(ILandroid/content/DialogInterface$OnClickListener;)LQ0;

    invoke-virtual {p2}, LQ0;->g()V

    return-void
.end method

.method public final N(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V
    .locals 3

    new-instance v0, LQ0;

    invoke-direct {v0, p0}, LQ0;-><init>(Landroid/content/Context;)V

    const v1, 0x7f1301c8

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    iget-object v2, v0, LQ0;->b:Ljava/lang/Object;

    check-cast v2, LM0;

    iput-object v1, v2, LM0;->d:Ljava/lang/CharSequence;

    iput-object p1, v2, LM0;->f:Ljava/lang/CharSequence;

    const p1, 0x7f1301c4

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v2, LM0;->g:Ljava/lang/CharSequence;

    iput-object p2, v2, LM0;->h:Landroid/content/DialogInterface$OnClickListener;

    const p1, 0x7f130194

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    new-instance p2, LBh;

    const/4 v1, 0x4

    invoke-direct {p2, p0, v1}, LBh;-><init>(Lru/zinovin/tankspeedometer/MainActivity;I)V

    iput-object p1, v2, LM0;->i:Ljava/lang/CharSequence;

    iput-object p2, v2, LM0;->j:Landroid/content/DialogInterface$OnClickListener;

    invoke-virtual {v0}, LQ0;->b()LR0;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

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

.method public final onBackPressed()V
    .locals 1

    const v0, 0x7f0b02ac

    invoke-virtual {p0, v0}, Lq1;->findViewById(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/MainActivity;->F()V

    return-void

    :cond_0
    invoke-super {p0}, LP6;->onBackPressed()V

    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Lq1;->onCreate(Landroid/os/Bundle;)V

    const-string p1, "T500.MAIN"

    const-string v0, "MainActivity.onCreate()"

    invoke-static {p1, v0}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0}, Lmk;->l(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lru/zinovin/tankspeedometer/MainActivity;->I:Landroid/content/SharedPreferences;

    new-instance v0, LU2;

    const/4 v1, 0x6

    invoke-direct {v0, p0, v1}, LU2;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lru/zinovin/tankspeedometer/MainActivity;->H:LU2;

    const-string v0, "naviPackage"

    const-string v1, "ru.yandex.yandexnavi"

    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lru/zinovin/tankspeedometer/MainActivity;->L:LLf;

    iget-object v0, v0, LLf;->I:Ldr;

    invoke-virtual {v0, p1}, Ldr;->f(Ljava/lang/Object;)V

    iget-object p1, p0, Lru/zinovin/tankspeedometer/MainActivity;->I:Landroid/content/SharedPreferences;

    iget-object v0, p0, Lru/zinovin/tankspeedometer/MainActivity;->H:LU2;

    invoke-interface {p1, v0}, Landroid/content/SharedPreferences;->registerOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    invoke-static {p0}, Lka;->a(LP6;)V

    const p1, 0x7f0e017a

    invoke-virtual {p0, p1}, Lq1;->setContentView(I)V

    return-void
.end method

.method public final onDestroy()V
    .locals 2

    iget-object v0, p0, Lru/zinovin/tankspeedometer/MainActivity;->H:LU2;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lru/zinovin/tankspeedometer/MainActivity;->I:Landroid/content/SharedPreferences;

    invoke-interface {v1, v0}, Landroid/content/SharedPreferences;->unregisterOnSharedPreferenceChangeListener(Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;)V

    :cond_0
    invoke-super {p0}, Lq1;->onDestroy()V

    return-void
.end method

.method public final onNewIntent(Landroid/content/Intent;)V
    .locals 1

    invoke-super {p0, p1}, LP6;->onNewIntent(Landroid/content/Intent;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    iget-boolean v0, p0, Lru/zinovin/tankspeedometer/MainActivity;->G:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lru/zinovin/tankspeedometer/MainActivity;->H(Landroid/content/Intent;Z)V

    :cond_0
    return-void
.end method

.method public final onResume()V
    .locals 6

    invoke-super {p0}, Lq1;->onResume()V

    const-string v0, "T500.MAIN"

    const-string v1, "onResume()"

    invoke-static {v0, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "permission.WRITE_EXTERNAL_STORAGE granted="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v2, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-static {p0, v2}, LF4;->j(Landroid/content/Context;Ljava/lang/String;)I

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-nez v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0, v2}, LF4;->j(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_4

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "shouldShowRequestPermissionRationale(WRITE_EXTERNAL_STORAGE)="

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x21

    if-ge v3, v4, :cond_1

    const-string v4, "android.permission.POST_NOTIFICATIONS"

    invoke-static {v4, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    const/16 v4, 0x20

    if-lt v3, v4, :cond_2

    invoke-static {p0, v2}, Lw0;->a(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result v5

    goto :goto_1

    :cond_2
    const/16 v4, 0x1f

    if-ne v3, v4, :cond_3

    invoke-static {p0, v2}, Lv0;->b(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result v5

    goto :goto_1

    :cond_3
    invoke-static {p0, v2}, Lu0;->c(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result v5

    :goto_1
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    const v0, 0x7f1301ec

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, LBh;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, LBh;-><init>(Lru/zinovin/tankspeedometer/MainActivity;I)V

    invoke-virtual {p0, v0, v1}, Lru/zinovin/tankspeedometer/MainActivity;->N(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V

    goto/16 :goto_3

    :cond_4
    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    invoke-static {p0, v1}, LF4;->j(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_5

    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {p0, v1}, LF4;->j(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_5

    const v0, 0x7f1301b7

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, LBh;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, LBh;-><init>(Lru/zinovin/tankspeedometer/MainActivity;I)V

    invoke-virtual {p0, v0, v1}, Lru/zinovin/tankspeedometer/MainActivity;->N(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V

    goto/16 :goto_3

    :cond_5
    invoke-static {p0}, Landroid/provider/Settings;->canDrawOverlays(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_6

    const v0, 0x7f1301c6

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, LBh;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, LBh;-><init>(Lru/zinovin/tankspeedometer/MainActivity;I)V

    invoke-virtual {p0, v0, v1}, Lru/zinovin/tankspeedometer/MainActivity;->N(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V

    goto/16 :goto_3

    :cond_6
    invoke-static {}, LUd;->J()Z

    move-result v1

    if-nez v1, :cond_7

    const v0, 0x7f1301e7

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, LBh;

    const/4 v2, 0x3

    invoke-direct {v1, p0, v2}, LBh;-><init>(Lru/zinovin/tankspeedometer/MainActivity;I)V

    invoke-virtual {p0, v0, v1}, Lru/zinovin/tankspeedometer/MainActivity;->N(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V

    goto/16 :goto_3

    :cond_7
    iget-boolean v1, p0, Lru/zinovin/tankspeedometer/MainActivity;->J:Z

    if-nez v1, :cond_c

    iput-boolean v4, p0, Lru/zinovin/tankspeedometer/MainActivity;->J:Z

    invoke-static {}, LTf;->s()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Version in settings "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, LUd;->D()Ljava/util/ArrayList;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    move-result-object v0

    new-instance v2, LQ2;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-interface {v0, v2}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    move-result-object v0

    new-instance v2, LR2;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-interface {v0, v2}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    move-result-object v0

    new-instance v2, LS2;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-interface {v0, v2}, Ljava/util/stream/Stream;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    invoke-static {}, Ln1;->a()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lmk;->l(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    const-string v3, "DEMO"

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    const-string v2, "LALALA"

    invoke-static {v2}, LTf;->H(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "0.0"

    invoke-virtual {v1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_9

    invoke-static {}, LTf;->x()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, LTf;->l(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    goto :cond_9

    :cond_8
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    goto :cond_9

    :cond_9
    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/MainActivity;->I()V

    goto :goto_3

    :cond_a
    :goto_2
    array-length v0, v0

    if-lez v0, :cond_b

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lru/zinovin/tankspeedometer/DownloadActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "DOWNLOAD_MODE"

    const-string v2, "DOWNLOAD"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "MANUAL_DOWNLOAD"

    invoke-virtual {v0, v1, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_3

    :cond_b
    invoke-static {}, LTf;->x()Ljava/lang/String;

    move-result-object v0

    const-string v1, "VERSION"

    invoke-static {v1, v0}, LTf;->W(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Lru/zinovin/tankspeedometer/MainActivity;->I()V

    :cond_c
    :goto_3
    return-void
.end method
