.class public final LPd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lsp;

.field public final b:Landroid/os/Handler;

.field public final c:Ljava/util/ArrayList;

.field public final d:LEm;

.field public final e:Lu4;

.field public f:Z

.field public g:Z

.field public h:Lzm;

.field public i:LMd;

.field public j:Z

.field public k:LMd;

.field public l:Landroid/graphics/Bitmap;

.field public m:LMd;

.field public n:I

.field public o:I

.field public p:I


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/a;Lsp;IILandroid/graphics/Bitmap;)V
    .locals 7

    sget-object v0, LIr;->b:LIr;

    iget-object v1, p1, Lcom/bumptech/glide/a;->a:Lu4;

    iget-object p1, p1, Lcom/bumptech/glide/a;->c:LVd;

    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed)."

    invoke-static {v3, v2}, LUd;->l(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v2}, Lcom/bumptech/glide/a;->a(Landroid/content/Context;)Lcom/bumptech/glide/a;

    move-result-object v4

    iget-object v4, v4, Lcom/bumptech/glide/a;->e:LFm;

    invoke-virtual {v4, v2}, LFm;->b(Landroid/content/Context;)LEm;

    move-result-object v2

    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {v3, p1}, LUd;->l(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {p1}, Lcom/bumptech/glide/a;->a(Landroid/content/Context;)Lcom/bumptech/glide/a;

    move-result-object v3

    iget-object v3, v3, Lcom/bumptech/glide/a;->e:LFm;

    invoke-virtual {v3, p1}, LFm;->b(Landroid/content/Context;)LEm;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Lzm;

    iget-object v4, p1, LEm;->a:Lcom/bumptech/glide/a;

    iget-object v5, p1, LEm;->b:Landroid/content/Context;

    const-class v6, Landroid/graphics/Bitmap;

    invoke-direct {v3, v4, p1, v6, v5}, Lzm;-><init>(Lcom/bumptech/glide/a;LEm;Ljava/lang/Class;Landroid/content/Context;)V

    sget-object p1, LEm;->k:LGm;

    invoke-virtual {v3, p1}, Lzm;->t(LZ3;)Lzm;

    move-result-object p1

    sget-object v3, Lk9;->b:Lk9;

    new-instance v4, LGm;

    invoke-direct {v4}, LZ3;-><init>()V

    invoke-virtual {v4, v3}, LZ3;->d(Lk9;)LZ3;

    move-result-object v3

    check-cast v3, LGm;

    invoke-virtual {v3}, LZ3;->r()LZ3;

    move-result-object v3

    check-cast v3, LGm;

    invoke-virtual {v3}, LZ3;->n()LZ3;

    move-result-object v3

    check-cast v3, LGm;

    invoke-virtual {v3, p3, p4}, LZ3;->h(II)LZ3;

    move-result-object p3

    invoke-virtual {p1, p3}, Lzm;->t(LZ3;)Lzm;

    move-result-object p1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p3, Ljava/util/ArrayList;

    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    iput-object p3, p0, LPd;->c:Ljava/util/ArrayList;

    iput-object v2, p0, LPd;->d:LEm;

    new-instance p3, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p4

    new-instance v2, LOd;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, LOd;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p3, p4, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    iput-object v1, p0, LPd;->e:Lu4;

    iput-object p3, p0, LPd;->b:Landroid/os/Handler;

    iput-object p1, p0, LPd;->h:Lzm;

    iput-object p2, p0, LPd;->a:Lsp;

    invoke-virtual {p0, v0, p5}, LPd;->c(Lfr;Landroid/graphics/Bitmap;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    iget-boolean v0, p0, LPd;->f:Z

    if-eqz v0, :cond_5

    iget-boolean v0, p0, LPd;->g:Z

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, p0, LPd;->m:LMd;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    iput-object v1, p0, LPd;->m:LMd;

    invoke-virtual {p0, v0}, LPd;->b(LMd;)V

    return-void

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, LPd;->g:Z

    iget-object v1, p0, LPd;->a:Lsp;

    iget-object v2, v1, Lsp;->l:LQd;

    iget v3, v2, LQd;->c:I

    if-lez v3, :cond_4

    iget v4, v1, Lsp;->k:I

    if-gez v4, :cond_2

    goto :goto_0

    :cond_2
    if-ltz v4, :cond_3

    if-ge v4, v3, :cond_3

    iget-object v2, v2, LQd;->e:Ljava/util/ArrayList;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LLd;

    iget v2, v2, LLd;->i:I

    goto :goto_1

    :cond_3
    const/4 v2, -0x1

    goto :goto_1

    :cond_4
    :goto_0
    const/4 v2, 0x0

    :goto_1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    int-to-long v5, v2

    add-long/2addr v3, v5

    iget v2, v1, Lsp;->k:I

    add-int/2addr v2, v0

    iget-object v0, v1, Lsp;->l:LQd;

    iget v0, v0, LQd;->c:I

    rem-int/2addr v2, v0

    iput v2, v1, Lsp;->k:I

    new-instance v0, LMd;

    iget-object v5, p0, LPd;->b:Landroid/os/Handler;

    invoke-direct {v0, v5, v2, v3, v4}, LMd;-><init>(Landroid/os/Handler;IJ)V

    iput-object v0, p0, LPd;->k:LMd;

    iget-object v0, p0, LPd;->h:Lzm;

    new-instance v2, LLj;

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-direct {v2, v3}, LLj;-><init>(Ljava/lang/Object;)V

    new-instance v3, LGm;

    invoke-direct {v3}, LZ3;-><init>()V

    invoke-virtual {v3, v2}, LZ3;->m(Lfg;)LZ3;

    move-result-object v2

    check-cast v2, LGm;

    invoke-virtual {v0, v2}, Lzm;->t(LZ3;)Lzm;

    move-result-object v0

    invoke-virtual {v0, v1}, Lzm;->x(Ljava/lang/Object;)Lzm;

    move-result-object v0

    iget-object v1, p0, LPd;->k:LMd;

    invoke-virtual {v0, v1, v0}, Lzm;->w(Lgq;LZ3;)V

    :cond_5
    :goto_2
    return-void
.end method

.method public final b(LMd;)V
    .locals 8

    const/4 v0, 0x0

    iput-boolean v0, p0, LPd;->g:Z

    iget-boolean v0, p0, LPd;->j:Z

    const/4 v1, 0x2

    iget-object v2, p0, LPd;->b:Landroid/os/Handler;

    if-eqz v0, :cond_0

    invoke-virtual {v2, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void

    :cond_0
    iget-boolean v0, p0, LPd;->f:Z

    if-nez v0, :cond_1

    iput-object p1, p0, LPd;->m:LMd;

    return-void

    :cond_1
    iget-object v0, p1, LMd;->g:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_9

    iget-object v0, p0, LPd;->l:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_2

    iget-object v3, p0, LPd;->e:Lu4;

    invoke-interface {v3, v0}, Lu4;->k(Landroid/graphics/Bitmap;)V

    const/4 v0, 0x0

    iput-object v0, p0, LPd;->l:Landroid/graphics/Bitmap;

    :cond_2
    iget-object v0, p0, LPd;->i:LMd;

    iput-object p1, p0, LPd;->i:LMd;

    iget-object p1, p0, LPd;->c:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    :goto_0
    if-ltz v3, :cond_8

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LNd;

    check-cast v4, LId;

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v5

    :goto_1
    instance-of v6, v5, Landroid/graphics/drawable/Drawable;

    if-eqz v6, :cond_3

    check-cast v5, Landroid/graphics/drawable/Drawable;

    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getCallback()Landroid/graphics/drawable/Drawable$Callback;

    move-result-object v5

    goto :goto_1

    :cond_3
    if-nez v5, :cond_4

    invoke-virtual {v4}, LId;->stop()V

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    goto :goto_3

    :cond_4
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    iget-object v5, v4, LId;->a:Lj1;

    iget-object v5, v5, Lj1;->b:Ljava/lang/Object;

    check-cast v5, LPd;

    iget-object v6, v5, LPd;->i:LMd;

    const/4 v7, -0x1

    if-eqz v6, :cond_5

    iget v6, v6, LMd;->e:I

    goto :goto_2

    :cond_5
    move v6, v7

    :goto_2
    iget-object v5, v5, LPd;->a:Lsp;

    iget-object v5, v5, Lsp;->l:LQd;

    iget v5, v5, LQd;->c:I

    add-int/lit8 v5, v5, -0x1

    if-ne v6, v5, :cond_6

    iget v5, v4, LId;->f:I

    add-int/lit8 v5, v5, 0x1

    iput v5, v4, LId;->f:I

    :cond_6
    iget v5, v4, LId;->g:I

    if-eq v5, v7, :cond_7

    iget v6, v4, LId;->f:I

    if-lt v6, v5, :cond_7

    invoke-virtual {v4}, LId;->stop()V

    :cond_7
    :goto_3
    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    :cond_8
    if-eqz v0, :cond_9

    invoke-virtual {v2, v1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    :cond_9
    invoke-virtual {p0}, LPd;->a()V

    return-void
.end method

.method public final c(Lfr;Landroid/graphics/Bitmap;)V
    .locals 3

    const-string v0, "Argument must not be null"

    invoke-static {v0, p1}, LUd;->l(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v0, p2}, LUd;->l(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p2, p0, LPd;->l:Landroid/graphics/Bitmap;

    iget-object v0, p0, LPd;->h:Lzm;

    new-instance v1, LGm;

    invoke-direct {v1}, LZ3;-><init>()V

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v2}, LZ3;->p(Lfr;Z)LZ3;

    move-result-object p1

    invoke-virtual {v0, p1}, Lzm;->t(LZ3;)Lzm;

    move-result-object p1

    iput-object p1, p0, LPd;->h:Lzm;

    invoke-static {p2}, LQr;->c(Landroid/graphics/Bitmap;)I

    move-result p1

    iput p1, p0, LPd;->n:I

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result p1

    iput p1, p0, LPd;->o:I

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result p1

    iput p1, p0, LPd;->p:I

    return-void
.end method
