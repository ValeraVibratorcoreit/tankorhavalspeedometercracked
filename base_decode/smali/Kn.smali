.class public final LKn;
.super LSn;
.source "SourceFile"


# instance fields
.field public g:Landroid/view/View;

.field public h:Landroid/graphics/drawable/GradientDrawable;

.field public i:LJn;

.field public j:I


# virtual methods
.method public getColor()I
    .locals 1

    iget v0, p0, LKn;->j:I

    return v0
.end method

.method public setColor(I)V
    .locals 1

    iput p1, p0, LKn;->j:I

    iget-object v0, p0, LKn;->h:Landroid/graphics/drawable/GradientDrawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    return-void
.end method

.method public setOnColorChanged(LJn;)V
    .locals 0

    iput-object p1, p0, LKn;->i:LJn;

    return-void
.end method
