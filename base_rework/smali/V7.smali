.class public final LV7;
.super Lfi;
.source "SourceFile"


# instance fields
.field public final v:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(LV7;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Lfi;-><init>(Lfi;)V

    .line 4
    iget-object p1, p1, LV7;->v:Landroid/graphics/RectF;

    iput-object p1, p0, LV7;->v:Landroid/graphics/RectF;

    return-void
.end method

.method public constructor <init>(Lpo;Landroid/graphics/RectF;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lfi;-><init>(Lpo;)V

    .line 2
    iput-object p2, p0, LV7;->v:Landroid/graphics/RectF;

    return-void
.end method


# virtual methods
.method public final newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    new-instance v0, LW7;

    invoke-direct {v0, p0}, LW7;-><init>(LV7;)V

    invoke-virtual {v0}, Lgi;->invalidateSelf()V

    return-object v0
.end method
