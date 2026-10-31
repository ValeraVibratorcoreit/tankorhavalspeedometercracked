.class public abstract Lka;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:I

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0xe6

    const/16 v1, 0xff

    invoke-static {v0, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    sput v0, Lka;->a:I

    const/16 v0, 0x80

    const/16 v1, 0x1b

    invoke-static {v0, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    sput v0, Lka;->b:I

    return-void
.end method

.method public static final a(LP6;)V
    .locals 9

    const-string v0, "<this>"

    invoke-static {v0, p0}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    sget-object v0, LWp;->b:LWp;

    new-instance v2, LXp;

    const/4 v1, 0x0

    invoke-direct {v2, v1, v1, v0}, LXp;-><init>(IILod;)V

    new-instance v3, LXp;

    sget v1, Lka;->a:I

    sget v4, Lka;->b:I

    invoke-direct {v3, v1, v4, v0}, LXp;-><init>(IILod;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v5

    const-string v1, "window.decorView"

    invoke-static {v1, v5}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v5}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v4, "view.resources"

    invoke-static {v4, v1}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Lod;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    invoke-virtual {v5}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-static {v4, v1}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Lod;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    new-instance v0, Loa;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_0

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    new-instance v0, Lna;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_0

    :cond_1
    new-instance v0, Lma;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    :goto_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v4

    const-string v8, "window"

    invoke-static {v8, v4}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    move-object v1, v0

    invoke-virtual/range {v1 .. v7}, Lla;->a(LXp;LXp;Landroid/view/Window;Landroid/view/View;ZZ)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    invoke-static {v8, p0}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0, p0}, Lma;->b(Landroid/view/Window;)V

    return-void
.end method
