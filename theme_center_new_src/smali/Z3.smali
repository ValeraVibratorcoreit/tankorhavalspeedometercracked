.class public abstract LZ3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public a:I

.field public b:F

.field public c:Lk9;

.field public d:LUk;

.field public e:Landroid/graphics/drawable/Drawable;

.field public f:I

.field public g:Landroid/graphics/drawable/Drawable;

.field public h:I

.field public i:Z

.field public j:I

.field public k:I

.field public l:Lfg;

.field public m:Z

.field public n:Z

.field public o:Landroid/graphics/drawable/Drawable;

.field public p:I

.field public q:Lrk;

.field public r:Lh5;

.field public s:Ljava/lang/Class;

.field public t:Z

.field public u:Landroid/content/res/Resources$Theme;

.field public v:Z

.field public w:Z

.field public x:Z

.field public y:Z

.field public z:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, LZ3;->b:F

    sget-object v0, Lk9;->d:Lk9;

    iput-object v0, p0, LZ3;->c:Lk9;

    sget-object v0, LUk;->c:LUk;

    iput-object v0, p0, LZ3;->d:LUk;

    const/4 v0, 0x1

    iput-boolean v0, p0, LZ3;->i:Z

    const/4 v1, -0x1

    iput v1, p0, LZ3;->j:I

    iput v1, p0, LZ3;->k:I

    sget-object v1, LVa;->b:LVa;

    iput-object v1, p0, LZ3;->l:Lfg;

    iput-boolean v0, p0, LZ3;->n:Z

    new-instance v1, Lrk;

    invoke-direct {v1}, Lrk;-><init>()V

    iput-object v1, p0, LZ3;->q:Lrk;

    new-instance v1, Lh5;

    invoke-direct {v1}, LFo;-><init>()V

    iput-object v1, p0, LZ3;->r:Lh5;

    const-class v1, Ljava/lang/Object;

    iput-object v1, p0, LZ3;->s:Ljava/lang/Class;

    iput-boolean v0, p0, LZ3;->y:Z

    return-void
.end method

.method public static f(II)Z
    .locals 0

    and-int/2addr p0, p1

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public a(LZ3;)LZ3;
    .locals 4

    iget-boolean v0, p0, LZ3;->v:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZ3;->b()LZ3;

    move-result-object v0

    invoke-virtual {v0, p1}, LZ3;->a(LZ3;)LZ3;

    move-result-object p1

    return-object p1

    :cond_0
    iget v0, p1, LZ3;->a:I

    const/4 v1, 0x2

    invoke-static {v0, v1}, LZ3;->f(II)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p1, LZ3;->b:F

    iput v0, p0, LZ3;->b:F

    :cond_1
    iget v0, p1, LZ3;->a:I

    const/high16 v1, 0x40000

    invoke-static {v0, v1}, LZ3;->f(II)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-boolean v0, p1, LZ3;->w:Z

    iput-boolean v0, p0, LZ3;->w:Z

    :cond_2
    iget v0, p1, LZ3;->a:I

    const/high16 v1, 0x100000

    invoke-static {v0, v1}, LZ3;->f(II)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-boolean v0, p1, LZ3;->z:Z

    iput-boolean v0, p0, LZ3;->z:Z

    :cond_3
    iget v0, p1, LZ3;->a:I

    const/4 v1, 0x4

    invoke-static {v0, v1}, LZ3;->f(II)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p1, LZ3;->c:Lk9;

    iput-object v0, p0, LZ3;->c:Lk9;

    :cond_4
    iget v0, p1, LZ3;->a:I

    const/16 v1, 0x8

    invoke-static {v0, v1}, LZ3;->f(II)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p1, LZ3;->d:LUk;

    iput-object v0, p0, LZ3;->d:LUk;

    :cond_5
    iget v0, p1, LZ3;->a:I

    const/16 v1, 0x10

    invoke-static {v0, v1}, LZ3;->f(II)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    iget-object v0, p1, LZ3;->e:Landroid/graphics/drawable/Drawable;

    iput-object v0, p0, LZ3;->e:Landroid/graphics/drawable/Drawable;

    iput v1, p0, LZ3;->f:I

    iget v0, p0, LZ3;->a:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, LZ3;->a:I

    :cond_6
    iget v0, p1, LZ3;->a:I

    const/16 v2, 0x20

    invoke-static {v0, v2}, LZ3;->f(II)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_7

    iget v0, p1, LZ3;->f:I

    iput v0, p0, LZ3;->f:I

    iput-object v2, p0, LZ3;->e:Landroid/graphics/drawable/Drawable;

    iget v0, p0, LZ3;->a:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, LZ3;->a:I

    :cond_7
    iget v0, p1, LZ3;->a:I

    const/16 v3, 0x40

    invoke-static {v0, v3}, LZ3;->f(II)Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, p1, LZ3;->g:Landroid/graphics/drawable/Drawable;

    iput-object v0, p0, LZ3;->g:Landroid/graphics/drawable/Drawable;

    iput v1, p0, LZ3;->h:I

    iget v0, p0, LZ3;->a:I

    and-int/lit16 v0, v0, -0x81

    iput v0, p0, LZ3;->a:I

    :cond_8
    iget v0, p1, LZ3;->a:I

    const/16 v3, 0x80

    invoke-static {v0, v3}, LZ3;->f(II)Z

    move-result v0

    if-eqz v0, :cond_9

    iget v0, p1, LZ3;->h:I

    iput v0, p0, LZ3;->h:I

    iput-object v2, p0, LZ3;->g:Landroid/graphics/drawable/Drawable;

    iget v0, p0, LZ3;->a:I

    and-int/lit8 v0, v0, -0x41

    iput v0, p0, LZ3;->a:I

    :cond_9
    iget v0, p1, LZ3;->a:I

    const/16 v3, 0x100

    invoke-static {v0, v3}, LZ3;->f(II)Z

    move-result v0

    if-eqz v0, :cond_a

    iget-boolean v0, p1, LZ3;->i:Z

    iput-boolean v0, p0, LZ3;->i:Z

    :cond_a
    iget v0, p1, LZ3;->a:I

    const/16 v3, 0x200

    invoke-static {v0, v3}, LZ3;->f(II)Z

    move-result v0

    if-eqz v0, :cond_b

    iget v0, p1, LZ3;->k:I

    iput v0, p0, LZ3;->k:I

    iget v0, p1, LZ3;->j:I

    iput v0, p0, LZ3;->j:I

    :cond_b
    iget v0, p1, LZ3;->a:I

    const/16 v3, 0x400

    invoke-static {v0, v3}, LZ3;->f(II)Z

    move-result v0

    if-eqz v0, :cond_c

    iget-object v0, p1, LZ3;->l:Lfg;

    iput-object v0, p0, LZ3;->l:Lfg;

    :cond_c
    iget v0, p1, LZ3;->a:I

    const/16 v3, 0x1000

    invoke-static {v0, v3}, LZ3;->f(II)Z

    move-result v0

    if-eqz v0, :cond_d

    iget-object v0, p1, LZ3;->s:Ljava/lang/Class;

    iput-object v0, p0, LZ3;->s:Ljava/lang/Class;

    :cond_d
    iget v0, p1, LZ3;->a:I

    const/16 v3, 0x2000

    invoke-static {v0, v3}, LZ3;->f(II)Z

    move-result v0

    if-eqz v0, :cond_e

    iget-object v0, p1, LZ3;->o:Landroid/graphics/drawable/Drawable;

    iput-object v0, p0, LZ3;->o:Landroid/graphics/drawable/Drawable;

    iput v1, p0, LZ3;->p:I

    iget v0, p0, LZ3;->a:I

    and-int/lit16 v0, v0, -0x4001

    iput v0, p0, LZ3;->a:I

    :cond_e
    iget v0, p1, LZ3;->a:I

    const/16 v3, 0x4000

    invoke-static {v0, v3}, LZ3;->f(II)Z

    move-result v0

    if-eqz v0, :cond_f

    iget v0, p1, LZ3;->p:I

    iput v0, p0, LZ3;->p:I

    iput-object v2, p0, LZ3;->o:Landroid/graphics/drawable/Drawable;

    iget v0, p0, LZ3;->a:I

    and-int/lit16 v0, v0, -0x2001

    iput v0, p0, LZ3;->a:I

    :cond_f
    iget v0, p1, LZ3;->a:I

    const v2, 0x8000

    invoke-static {v0, v2}, LZ3;->f(II)Z

    move-result v0

    if-eqz v0, :cond_10

    iget-object v0, p1, LZ3;->u:Landroid/content/res/Resources$Theme;

    iput-object v0, p0, LZ3;->u:Landroid/content/res/Resources$Theme;

    :cond_10
    iget v0, p1, LZ3;->a:I

    const/high16 v2, 0x10000

    invoke-static {v0, v2}, LZ3;->f(II)Z

    move-result v0

    if-eqz v0, :cond_11

    iget-boolean v0, p1, LZ3;->n:Z

    iput-boolean v0, p0, LZ3;->n:Z

    :cond_11
    iget v0, p1, LZ3;->a:I

    const/high16 v2, 0x20000

    invoke-static {v0, v2}, LZ3;->f(II)Z

    move-result v0

    if-eqz v0, :cond_12

    iget-boolean v0, p1, LZ3;->m:Z

    iput-boolean v0, p0, LZ3;->m:Z

    :cond_12
    iget v0, p1, LZ3;->a:I

    const/16 v2, 0x800

    invoke-static {v0, v2}, LZ3;->f(II)Z

    move-result v0

    if-eqz v0, :cond_13

    iget-object v0, p0, LZ3;->r:Lh5;

    iget-object v2, p1, LZ3;->r:Lh5;

    invoke-virtual {v0, v2}, Lc3;->putAll(Ljava/util/Map;)V

    iget-boolean v0, p1, LZ3;->y:Z

    iput-boolean v0, p0, LZ3;->y:Z

    :cond_13
    iget v0, p1, LZ3;->a:I

    const/high16 v2, 0x80000

    invoke-static {v0, v2}, LZ3;->f(II)Z

    move-result v0

    if-eqz v0, :cond_14

    iget-boolean v0, p1, LZ3;->x:Z

    iput-boolean v0, p0, LZ3;->x:Z

    :cond_14
    iget-boolean v0, p0, LZ3;->n:Z

    if-nez v0, :cond_15

    iget-object v0, p0, LZ3;->r:Lh5;

    invoke-virtual {v0}, Lh5;->clear()V

    iget v0, p0, LZ3;->a:I

    iput-boolean v1, p0, LZ3;->m:Z

    const v1, -0x20801

    and-int/2addr v0, v1

    iput v0, p0, LZ3;->a:I

    const/4 v0, 0x1

    iput-boolean v0, p0, LZ3;->y:Z

    :cond_15
    iget v0, p0, LZ3;->a:I

    iget v1, p1, LZ3;->a:I

    or-int/2addr v0, v1

    iput v0, p0, LZ3;->a:I

    iget-object v0, p0, LZ3;->q:Lrk;

    iget-object p1, p1, LZ3;->q:Lrk;

    iget-object v0, v0, Lrk;->b:Lh5;

    iget-object p1, p1, Lrk;->b:Lh5;

    invoke-virtual {v0, p1}, Lh5;->i(LFo;)V

    invoke-virtual {p0}, LZ3;->k()V

    return-object p0
.end method

.method public b()LZ3;
    .locals 3

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ3;

    new-instance v1, Lrk;

    invoke-direct {v1}, Lrk;-><init>()V

    iput-object v1, v0, LZ3;->q:Lrk;

    iget-object v2, p0, LZ3;->q:Lrk;

    iget-object v1, v1, Lrk;->b:Lh5;

    iget-object v2, v2, Lrk;->b:Lh5;

    invoke-virtual {v1, v2}, Lh5;->i(LFo;)V

    new-instance v1, Lh5;

    invoke-direct {v1}, LFo;-><init>()V

    iput-object v1, v0, LZ3;->r:Lh5;

    iget-object v2, p0, LZ3;->r:Lh5;

    invoke-virtual {v1, v2}, Lc3;->putAll(Ljava/util/Map;)V

    const/4 v1, 0x0

    iput-boolean v1, v0, LZ3;->t:Z

    iput-boolean v1, v0, LZ3;->v:Z
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final c(Ljava/lang/Class;)LZ3;
    .locals 1

    iget-boolean v0, p0, LZ3;->v:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZ3;->b()LZ3;

    move-result-object v0

    invoke-virtual {v0, p1}, LZ3;->c(Ljava/lang/Class;)LZ3;

    move-result-object p1

    return-object p1

    :cond_0
    iput-object p1, p0, LZ3;->s:Ljava/lang/Class;

    iget p1, p0, LZ3;->a:I

    or-int/lit16 p1, p1, 0x1000

    iput p1, p0, LZ3;->a:I

    invoke-virtual {p0}, LZ3;->k()V

    return-object p0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LZ3;->b()LZ3;

    move-result-object v0

    return-object v0
.end method

.method public final d(Lk9;)LZ3;
    .locals 1

    iget-boolean v0, p0, LZ3;->v:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZ3;->b()LZ3;

    move-result-object v0

    invoke-virtual {v0, p1}, LZ3;->d(Lk9;)LZ3;

    move-result-object p1

    return-object p1

    :cond_0
    iput-object p1, p0, LZ3;->c:Lk9;

    iget p1, p0, LZ3;->a:I

    or-int/lit8 p1, p1, 0x4

    iput p1, p0, LZ3;->a:I

    invoke-virtual {p0}, LZ3;->k()V

    return-object p0
.end method

.method public final e(LZ3;)Z
    .locals 2

    iget v0, p1, LZ3;->b:F

    iget v1, p0, LZ3;->b:F

    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    move-result v0

    if-nez v0, :cond_0

    iget v0, p0, LZ3;->f:I

    iget v1, p1, LZ3;->f:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LZ3;->e:Landroid/graphics/drawable/Drawable;

    iget-object v1, p1, LZ3;->e:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, v1}, LQr;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, LZ3;->h:I

    iget v1, p1, LZ3;->h:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LZ3;->g:Landroid/graphics/drawable/Drawable;

    iget-object v1, p1, LZ3;->g:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, v1}, LQr;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, LZ3;->p:I

    iget v1, p1, LZ3;->p:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LZ3;->o:Landroid/graphics/drawable/Drawable;

    iget-object v1, p1, LZ3;->o:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, v1}, LQr;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, LZ3;->i:Z

    iget-boolean v1, p1, LZ3;->i:Z

    if-ne v0, v1, :cond_0

    iget v0, p0, LZ3;->j:I

    iget v1, p1, LZ3;->j:I

    if-ne v0, v1, :cond_0

    iget v0, p0, LZ3;->k:I

    iget v1, p1, LZ3;->k:I

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, LZ3;->m:Z

    iget-boolean v1, p1, LZ3;->m:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, LZ3;->n:Z

    iget-boolean v1, p1, LZ3;->n:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, LZ3;->w:Z

    iget-boolean v1, p1, LZ3;->w:Z

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, LZ3;->x:Z

    iget-boolean v1, p1, LZ3;->x:Z

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LZ3;->c:Lk9;

    iget-object v1, p1, LZ3;->c:Lk9;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LZ3;->d:LUk;

    iget-object v1, p1, LZ3;->d:LUk;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, LZ3;->q:Lrk;

    iget-object v1, p1, LZ3;->q:Lrk;

    invoke-virtual {v0, v1}, Lrk;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LZ3;->r:Lh5;

    iget-object v1, p1, LZ3;->r:Lh5;

    invoke-virtual {v0, v1}, LFo;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LZ3;->s:Ljava/lang/Class;

    iget-object v1, p1, LZ3;->s:Ljava/lang/Class;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LZ3;->l:Lfg;

    iget-object v1, p1, LZ3;->l:Lfg;

    invoke-static {v0, v1}, LQr;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LZ3;->u:Landroid/content/res/Resources$Theme;

    iget-object p1, p1, LZ3;->u:Landroid/content/res/Resources$Theme;

    invoke-static {v0, p1}, LQr;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LZ3;

    if-eqz v0, :cond_0

    check-cast p1, LZ3;

    invoke-virtual {p0, p1}, LZ3;->e(LZ3;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final g(LL9;Lw4;)LZ3;
    .locals 1

    iget-boolean v0, p0, LZ3;->v:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZ3;->b()LZ3;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LZ3;->g(LL9;Lw4;)LZ3;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, LL9;->g:Lpk;

    invoke-virtual {p0, v0, p1}, LZ3;->l(Lpk;Ljava/lang/Object;)LZ3;

    const/4 p1, 0x0

    invoke-virtual {p0, p2, p1}, LZ3;->p(Lfr;Z)LZ3;

    move-result-object p1

    return-object p1
.end method

.method public final h(II)LZ3;
    .locals 1

    iget-boolean v0, p0, LZ3;->v:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZ3;->b()LZ3;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LZ3;->h(II)LZ3;

    move-result-object p1

    return-object p1

    :cond_0
    iput p1, p0, LZ3;->k:I

    iput p2, p0, LZ3;->j:I

    iget p1, p0, LZ3;->a:I

    or-int/lit16 p1, p1, 0x200

    iput p1, p0, LZ3;->a:I

    invoke-virtual {p0}, LZ3;->k()V

    return-object p0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, LZ3;->b:F

    sget-object v1, LQr;->a:[C

    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    const/16 v1, 0x11

    invoke-static {v0, v1}, LQr;->g(II)I

    move-result v0

    iget v1, p0, LZ3;->f:I

    invoke-static {v1, v0}, LQr;->g(II)I

    move-result v0

    iget-object v1, p0, LZ3;->e:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, v1}, LQr;->h(ILjava/lang/Object;)I

    move-result v0

    iget v1, p0, LZ3;->h:I

    invoke-static {v1, v0}, LQr;->g(II)I

    move-result v0

    iget-object v1, p0, LZ3;->g:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, v1}, LQr;->h(ILjava/lang/Object;)I

    move-result v0

    iget v1, p0, LZ3;->p:I

    invoke-static {v1, v0}, LQr;->g(II)I

    move-result v0

    iget-object v1, p0, LZ3;->o:Landroid/graphics/drawable/Drawable;

    invoke-static {v0, v1}, LQr;->h(ILjava/lang/Object;)I

    move-result v0

    iget-boolean v1, p0, LZ3;->i:Z

    invoke-static {v1, v0}, LQr;->g(II)I

    move-result v0

    iget v1, p0, LZ3;->j:I

    invoke-static {v1, v0}, LQr;->g(II)I

    move-result v0

    iget v1, p0, LZ3;->k:I

    invoke-static {v1, v0}, LQr;->g(II)I

    move-result v0

    iget-boolean v1, p0, LZ3;->m:Z

    invoke-static {v1, v0}, LQr;->g(II)I

    move-result v0

    iget-boolean v1, p0, LZ3;->n:Z

    invoke-static {v1, v0}, LQr;->g(II)I

    move-result v0

    iget-boolean v1, p0, LZ3;->w:Z

    invoke-static {v1, v0}, LQr;->g(II)I

    move-result v0

    iget-boolean v1, p0, LZ3;->x:Z

    invoke-static {v1, v0}, LQr;->g(II)I

    move-result v0

    iget-object v1, p0, LZ3;->c:Lk9;

    invoke-static {v0, v1}, LQr;->h(ILjava/lang/Object;)I

    move-result v0

    iget-object v1, p0, LZ3;->d:LUk;

    invoke-static {v0, v1}, LQr;->h(ILjava/lang/Object;)I

    move-result v0

    iget-object v1, p0, LZ3;->q:Lrk;

    invoke-static {v0, v1}, LQr;->h(ILjava/lang/Object;)I

    move-result v0

    iget-object v1, p0, LZ3;->r:Lh5;

    invoke-static {v0, v1}, LQr;->h(ILjava/lang/Object;)I

    move-result v0

    iget-object v1, p0, LZ3;->s:Ljava/lang/Class;

    invoke-static {v0, v1}, LQr;->h(ILjava/lang/Object;)I

    move-result v0

    iget-object v1, p0, LZ3;->l:Lfg;

    invoke-static {v0, v1}, LQr;->h(ILjava/lang/Object;)I

    move-result v0

    iget-object v1, p0, LZ3;->u:Landroid/content/res/Resources$Theme;

    invoke-static {v0, v1}, LQr;->h(ILjava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final i()LZ3;
    .locals 2

    sget-object v0, LUk;->d:LUk;

    iget-boolean v1, p0, LZ3;->v:Z

    if-eqz v1, :cond_0

    invoke-virtual {p0}, LZ3;->b()LZ3;

    move-result-object v0

    invoke-virtual {v0}, LZ3;->i()LZ3;

    move-result-object v0

    return-object v0

    :cond_0
    iput-object v0, p0, LZ3;->d:LUk;

    iget v0, p0, LZ3;->a:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, LZ3;->a:I

    invoke-virtual {p0}, LZ3;->k()V

    return-object p0
.end method

.method public final j(Lpk;)LZ3;
    .locals 1

    iget-boolean v0, p0, LZ3;->v:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZ3;->b()LZ3;

    move-result-object v0

    invoke-virtual {v0, p1}, LZ3;->j(Lpk;)LZ3;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, LZ3;->q:Lrk;

    iget-object v0, v0, Lrk;->b:Lh5;

    invoke-virtual {v0, p1}, LFo;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, LZ3;->k()V

    return-object p0
.end method

.method public final k()V
    .locals 2

    iget-boolean v0, p0, LZ3;->t:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You cannot modify locked T, consider clone()"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final l(Lpk;Ljava/lang/Object;)LZ3;
    .locals 1

    iget-boolean v0, p0, LZ3;->v:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZ3;->b()LZ3;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LZ3;->l(Lpk;Ljava/lang/Object;)LZ3;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, LUd;->k(Ljava/lang/Object;)V

    invoke-static {p2}, LUd;->k(Ljava/lang/Object;)V

    iget-object v0, p0, LZ3;->q:Lrk;

    iget-object v0, v0, Lrk;->b:Lh5;

    invoke-virtual {v0, p1, p2}, Lh5;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, LZ3;->k()V

    return-object p0
.end method

.method public final m(Lfg;)LZ3;
    .locals 1

    iget-boolean v0, p0, LZ3;->v:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZ3;->b()LZ3;

    move-result-object v0

    invoke-virtual {v0, p1}, LZ3;->m(Lfg;)LZ3;

    move-result-object p1

    return-object p1

    :cond_0
    iput-object p1, p0, LZ3;->l:Lfg;

    iget p1, p0, LZ3;->a:I

    or-int/lit16 p1, p1, 0x400

    iput p1, p0, LZ3;->a:I

    invoke-virtual {p0}, LZ3;->k()V

    return-object p0
.end method

.method public final n()LZ3;
    .locals 1

    iget-boolean v0, p0, LZ3;->v:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZ3;->b()LZ3;

    move-result-object v0

    invoke-virtual {v0}, LZ3;->n()LZ3;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, LZ3;->i:Z

    iget v0, p0, LZ3;->a:I

    or-int/lit16 v0, v0, 0x100

    iput v0, p0, LZ3;->a:I

    invoke-virtual {p0}, LZ3;->k()V

    return-object p0
.end method

.method public final o(Landroid/content/res/Resources$Theme;)LZ3;
    .locals 2

    iget-boolean v0, p0, LZ3;->v:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZ3;->b()LZ3;

    move-result-object v0

    invoke-virtual {v0, p1}, LZ3;->o(Landroid/content/res/Resources$Theme;)LZ3;

    move-result-object p1

    return-object p1

    :cond_0
    iput-object p1, p0, LZ3;->u:Landroid/content/res/Resources$Theme;

    if-eqz p1, :cond_1

    iget v0, p0, LZ3;->a:I

    const v1, 0x8000

    or-int/2addr v0, v1

    iput v0, p0, LZ3;->a:I

    sget-object v0, LPm;->b:Lpk;

    invoke-virtual {p0, v0, p1}, LZ3;->l(Lpk;Ljava/lang/Object;)LZ3;

    move-result-object p1

    return-object p1

    :cond_1
    iget p1, p0, LZ3;->a:I

    const v0, -0x8001

    and-int/2addr p1, v0

    iput p1, p0, LZ3;->a:I

    sget-object p1, LPm;->b:Lpk;

    invoke-virtual {p0, p1}, LZ3;->j(Lpk;)LZ3;

    move-result-object p1

    return-object p1
.end method

.method public final p(Lfr;Z)LZ3;
    .locals 2

    iget-boolean v0, p0, LZ3;->v:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZ3;->b()LZ3;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, LZ3;->p(Lfr;Z)LZ3;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, LR9;

    invoke-direct {v0, p1, p2}, LR9;-><init>(Lfr;Z)V

    const-class v1, Landroid/graphics/Bitmap;

    invoke-virtual {p0, v1, p1, p2}, LZ3;->q(Ljava/lang/Class;Lfr;Z)LZ3;

    const-class v1, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, v1, v0, p2}, LZ3;->q(Ljava/lang/Class;Lfr;Z)LZ3;

    const-class v1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0, v1, v0, p2}, LZ3;->q(Ljava/lang/Class;Lfr;Z)LZ3;

    new-instance v0, LKd;

    invoke-direct {v0, p1}, LKd;-><init>(Lfr;)V

    const-class p1, LId;

    invoke-virtual {p0, p1, v0, p2}, LZ3;->q(Ljava/lang/Class;Lfr;Z)LZ3;

    invoke-virtual {p0}, LZ3;->k()V

    return-object p0
.end method

.method public final q(Ljava/lang/Class;Lfr;Z)LZ3;
    .locals 1

    iget-boolean v0, p0, LZ3;->v:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZ3;->b()LZ3;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, LZ3;->q(Ljava/lang/Class;Lfr;Z)LZ3;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p2}, LUd;->k(Ljava/lang/Object;)V

    iget-object v0, p0, LZ3;->r:Lh5;

    invoke-virtual {v0, p1, p2}, Lh5;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget p1, p0, LZ3;->a:I

    const/4 p2, 0x1

    iput-boolean p2, p0, LZ3;->n:Z

    const v0, 0x10800

    or-int/2addr v0, p1

    iput v0, p0, LZ3;->a:I

    const/4 v0, 0x0

    iput-boolean v0, p0, LZ3;->y:Z

    if-eqz p3, :cond_1

    const p3, 0x30800

    or-int/2addr p1, p3

    iput p1, p0, LZ3;->a:I

    iput-boolean p2, p0, LZ3;->m:Z

    :cond_1
    invoke-virtual {p0}, LZ3;->k()V

    return-object p0
.end method

.method public final r()LZ3;
    .locals 2

    iget-boolean v0, p0, LZ3;->v:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZ3;->b()LZ3;

    move-result-object v0

    invoke-virtual {v0}, LZ3;->r()LZ3;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, LZ3;->z:Z

    iget v0, p0, LZ3;->a:I

    const/high16 v1, 0x100000

    or-int/2addr v0, v1

    iput v0, p0, LZ3;->a:I

    invoke-virtual {p0}, LZ3;->k()V

    return-object p0
.end method
