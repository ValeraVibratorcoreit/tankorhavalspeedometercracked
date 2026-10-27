.class public final Le1;
.super Landroid/graphics/drawable/Animatable2$AnimationCallback;
.source "SourceFile"


# instance fields
.field public final synthetic a:LZh;


# direct methods
.method public constructor <init>(LZh;)V
    .locals 0

    iput-object p1, p0, Le1;->a:LZh;

    invoke-direct {p0}, Landroid/graphics/drawable/Animatable2$AnimationCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, Le1;->a:LZh;

    iget-object v0, v0, LZh;->b:Lbi;

    iget-object v0, v0, Lbi;->o:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_0

    invoke-static {p1, v0}, LO9;->h(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public final onAnimationStart(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    iget-object v0, p0, Le1;->a:LZh;

    iget-object v0, v0, LZh;->b:Lbi;

    iget-object v1, v0, Lbi;->o:Landroid/content/res/ColorStateList;

    if-eqz v1, :cond_0

    iget-object v0, v0, Lbi;->s:[I

    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v2

    invoke-virtual {v1, v0, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v0

    invoke-static {p1, v0}, LO9;->g(Landroid/graphics/drawable/Drawable;I)V

    :cond_0
    return-void
.end method
