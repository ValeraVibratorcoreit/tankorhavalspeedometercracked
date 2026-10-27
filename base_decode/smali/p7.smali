.class public final Lp7;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public final b:Ls7;

.field public final c:Lr7;

.field public final d:Lq7;

.field public final e:Lt7;

.field public f:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ls7;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x0

    iput v1, v0, Ls7;->a:I

    iput v1, v0, Ls7;->b:I

    const/high16 v2, 0x3f800000    # 1.0f

    iput v2, v0, Ls7;->c:F

    const/high16 v3, 0x7fc00000    # Float.NaN

    iput v3, v0, Ls7;->d:F

    iput-object v0, p0, Lp7;->b:Ls7;

    new-instance v0, Lr7;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v4, -0x1

    iput v4, v0, Lr7;->a:I

    iput v1, v0, Lr7;->b:I

    iput v4, v0, Lr7;->c:I

    iput v3, v0, Lr7;->d:F

    iput v3, v0, Lr7;->e:F

    iput v3, v0, Lr7;->f:F

    iput v4, v0, Lr7;->g:I

    const/4 v5, 0x0

    iput-object v5, v0, Lr7;->h:Ljava/lang/String;

    iput v4, v0, Lr7;->i:I

    iput-object v0, p0, Lp7;->c:Lr7;

    new-instance v0, Lq7;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-boolean v1, v0, Lq7;->a:Z

    iput v4, v0, Lq7;->d:I

    iput v4, v0, Lq7;->e:I

    const/high16 v6, -0x40800000    # -1.0f

    iput v6, v0, Lq7;->f:F

    const/4 v7, 0x1

    iput-boolean v7, v0, Lq7;->g:Z

    iput v4, v0, Lq7;->h:I

    iput v4, v0, Lq7;->i:I

    iput v4, v0, Lq7;->j:I

    iput v4, v0, Lq7;->k:I

    iput v4, v0, Lq7;->l:I

    iput v4, v0, Lq7;->m:I

    iput v4, v0, Lq7;->n:I

    iput v4, v0, Lq7;->o:I

    iput v4, v0, Lq7;->p:I

    iput v4, v0, Lq7;->q:I

    iput v4, v0, Lq7;->r:I

    iput v4, v0, Lq7;->s:I

    iput v4, v0, Lq7;->t:I

    iput v4, v0, Lq7;->u:I

    iput v4, v0, Lq7;->v:I

    const/high16 v8, 0x3f000000    # 0.5f

    iput v8, v0, Lq7;->w:F

    iput v8, v0, Lq7;->x:F

    iput-object v5, v0, Lq7;->y:Ljava/lang/String;

    iput v4, v0, Lq7;->z:I

    iput v1, v0, Lq7;->A:I

    const/4 v5, 0x0

    iput v5, v0, Lq7;->B:F

    iput v4, v0, Lq7;->C:I

    iput v4, v0, Lq7;->D:I

    iput v4, v0, Lq7;->E:I

    iput v1, v0, Lq7;->F:I

    iput v1, v0, Lq7;->G:I

    iput v1, v0, Lq7;->H:I

    iput v1, v0, Lq7;->I:I

    iput v1, v0, Lq7;->J:I

    iput v1, v0, Lq7;->K:I

    iput v1, v0, Lq7;->L:I

    const/high16 v8, -0x80000000

    iput v8, v0, Lq7;->M:I

    iput v8, v0, Lq7;->N:I

    iput v8, v0, Lq7;->O:I

    iput v8, v0, Lq7;->P:I

    iput v8, v0, Lq7;->Q:I

    iput v8, v0, Lq7;->R:I

    iput v8, v0, Lq7;->S:I

    iput v6, v0, Lq7;->T:F

    iput v6, v0, Lq7;->U:F

    iput v1, v0, Lq7;->V:I

    iput v1, v0, Lq7;->W:I

    iput v1, v0, Lq7;->X:I

    iput v1, v0, Lq7;->Y:I

    iput v1, v0, Lq7;->Z:I

    iput v1, v0, Lq7;->a0:I

    iput v1, v0, Lq7;->b0:I

    iput v1, v0, Lq7;->c0:I

    iput v2, v0, Lq7;->d0:F

    iput v2, v0, Lq7;->e0:F

    iput v4, v0, Lq7;->f0:I

    iput v1, v0, Lq7;->g0:I

    iput v4, v0, Lq7;->h0:I

    iput-boolean v1, v0, Lq7;->l0:Z

    iput-boolean v1, v0, Lq7;->m0:Z

    iput-boolean v7, v0, Lq7;->n0:Z

    iput v1, v0, Lq7;->o0:I

    iput-object v0, p0, Lp7;->d:Lq7;

    new-instance v0, Lt7;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput v5, v0, Lt7;->a:F

    iput v5, v0, Lt7;->b:F

    iput v5, v0, Lt7;->c:F

    iput v2, v0, Lt7;->d:F

    iput v2, v0, Lt7;->e:F

    iput v3, v0, Lt7;->f:F

    iput v3, v0, Lt7;->g:F

    iput v4, v0, Lt7;->h:I

    iput v5, v0, Lt7;->i:F

    iput v5, v0, Lt7;->j:F

    iput v5, v0, Lt7;->k:F

    iput-boolean v1, v0, Lt7;->l:Z

    iput v5, v0, Lt7;->m:F

    iput-object v0, p0, Lp7;->e:Lt7;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lp7;->f:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final a(Ll7;)V
    .locals 2

    iget-object v0, p0, Lp7;->d:Lq7;

    iget v1, v0, Lq7;->h:I

    iput v1, p1, Ll7;->e:I

    iget v1, v0, Lq7;->i:I

    iput v1, p1, Ll7;->f:I

    iget v1, v0, Lq7;->j:I

    iput v1, p1, Ll7;->g:I

    iget v1, v0, Lq7;->k:I

    iput v1, p1, Ll7;->h:I

    iget v1, v0, Lq7;->l:I

    iput v1, p1, Ll7;->i:I

    iget v1, v0, Lq7;->m:I

    iput v1, p1, Ll7;->j:I

    iget v1, v0, Lq7;->n:I

    iput v1, p1, Ll7;->k:I

    iget v1, v0, Lq7;->o:I

    iput v1, p1, Ll7;->l:I

    iget v1, v0, Lq7;->p:I

    iput v1, p1, Ll7;->m:I

    iget v1, v0, Lq7;->q:I

    iput v1, p1, Ll7;->n:I

    iget v1, v0, Lq7;->r:I

    iput v1, p1, Ll7;->o:I

    iget v1, v0, Lq7;->s:I

    iput v1, p1, Ll7;->s:I

    iget v1, v0, Lq7;->t:I

    iput v1, p1, Ll7;->t:I

    iget v1, v0, Lq7;->u:I

    iput v1, p1, Ll7;->u:I

    iget v1, v0, Lq7;->v:I

    iput v1, p1, Ll7;->v:I

    iget v1, v0, Lq7;->F:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v1, v0, Lq7;->G:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget v1, v0, Lq7;->H:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v1, v0, Lq7;->I:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v1, v0, Lq7;->R:I

    iput v1, p1, Ll7;->A:I

    iget v1, v0, Lq7;->Q:I

    iput v1, p1, Ll7;->B:I

    iget v1, v0, Lq7;->N:I

    iput v1, p1, Ll7;->x:I

    iget v1, v0, Lq7;->P:I

    iput v1, p1, Ll7;->z:I

    iget v1, v0, Lq7;->w:F

    iput v1, p1, Ll7;->E:F

    iget v1, v0, Lq7;->x:F

    iput v1, p1, Ll7;->F:F

    iget v1, v0, Lq7;->z:I

    iput v1, p1, Ll7;->p:I

    iget v1, v0, Lq7;->A:I

    iput v1, p1, Ll7;->q:I

    iget v1, v0, Lq7;->B:F

    iput v1, p1, Ll7;->r:F

    iget-object v1, v0, Lq7;->y:Ljava/lang/String;

    iput-object v1, p1, Ll7;->G:Ljava/lang/String;

    iget v1, v0, Lq7;->C:I

    iput v1, p1, Ll7;->T:I

    iget v1, v0, Lq7;->D:I

    iput v1, p1, Ll7;->U:I

    iget v1, v0, Lq7;->T:F

    iput v1, p1, Ll7;->I:F

    iget v1, v0, Lq7;->U:F

    iput v1, p1, Ll7;->H:F

    iget v1, v0, Lq7;->W:I

    iput v1, p1, Ll7;->K:I

    iget v1, v0, Lq7;->V:I

    iput v1, p1, Ll7;->J:I

    iget-boolean v1, v0, Lq7;->l0:Z

    iput-boolean v1, p1, Ll7;->W:Z

    iget-boolean v1, v0, Lq7;->m0:Z

    iput-boolean v1, p1, Ll7;->X:Z

    iget v1, v0, Lq7;->X:I

    iput v1, p1, Ll7;->L:I

    iget v1, v0, Lq7;->Y:I

    iput v1, p1, Ll7;->M:I

    iget v1, v0, Lq7;->Z:I

    iput v1, p1, Ll7;->P:I

    iget v1, v0, Lq7;->a0:I

    iput v1, p1, Ll7;->Q:I

    iget v1, v0, Lq7;->b0:I

    iput v1, p1, Ll7;->N:I

    iget v1, v0, Lq7;->c0:I

    iput v1, p1, Ll7;->O:I

    iget v1, v0, Lq7;->d0:F

    iput v1, p1, Ll7;->R:F

    iget v1, v0, Lq7;->e0:F

    iput v1, p1, Ll7;->S:F

    iget v1, v0, Lq7;->E:I

    iput v1, p1, Ll7;->V:I

    iget v1, v0, Lq7;->f:F

    iput v1, p1, Ll7;->c:F

    iget v1, v0, Lq7;->d:I

    iput v1, p1, Ll7;->a:I

    iget v1, v0, Lq7;->e:I

    iput v1, p1, Ll7;->b:I

    iget v1, v0, Lq7;->b:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    iget v1, v0, Lq7;->c:I

    iput v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    iget-object v1, v0, Lq7;->k0:Ljava/lang/String;

    if-eqz v1, :cond_0

    iput-object v1, p1, Ll7;->Y:Ljava/lang/String;

    :cond_0
    iget v1, v0, Lq7;->o0:I

    iput v1, p1, Ll7;->Z:I

    iget v1, v0, Lq7;->K:I

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    iget v0, v0, Lq7;->J:I

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {p1}, Ll7;->a()V

    return-void
.end method

.method public final clone()Ljava/lang/Object;
    .locals 5

    new-instance v0, Lp7;

    invoke-direct {v0}, Lp7;-><init>()V

    iget-object v1, v0, Lp7;->d:Lq7;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Lp7;->d:Lq7;

    iget-boolean v3, v2, Lq7;->a:Z

    iput-boolean v3, v1, Lq7;->a:Z

    iget v3, v2, Lq7;->b:I

    iput v3, v1, Lq7;->b:I

    iget v3, v2, Lq7;->c:I

    iput v3, v1, Lq7;->c:I

    iget v3, v2, Lq7;->d:I

    iput v3, v1, Lq7;->d:I

    iget v3, v2, Lq7;->e:I

    iput v3, v1, Lq7;->e:I

    iget v3, v2, Lq7;->f:F

    iput v3, v1, Lq7;->f:F

    iget-boolean v3, v2, Lq7;->g:Z

    iput-boolean v3, v1, Lq7;->g:Z

    iget v3, v2, Lq7;->h:I

    iput v3, v1, Lq7;->h:I

    iget v3, v2, Lq7;->i:I

    iput v3, v1, Lq7;->i:I

    iget v3, v2, Lq7;->j:I

    iput v3, v1, Lq7;->j:I

    iget v3, v2, Lq7;->k:I

    iput v3, v1, Lq7;->k:I

    iget v3, v2, Lq7;->l:I

    iput v3, v1, Lq7;->l:I

    iget v3, v2, Lq7;->m:I

    iput v3, v1, Lq7;->m:I

    iget v3, v2, Lq7;->n:I

    iput v3, v1, Lq7;->n:I

    iget v3, v2, Lq7;->o:I

    iput v3, v1, Lq7;->o:I

    iget v3, v2, Lq7;->p:I

    iput v3, v1, Lq7;->p:I

    iget v3, v2, Lq7;->q:I

    iput v3, v1, Lq7;->q:I

    iget v3, v2, Lq7;->r:I

    iput v3, v1, Lq7;->r:I

    iget v3, v2, Lq7;->s:I

    iput v3, v1, Lq7;->s:I

    iget v3, v2, Lq7;->t:I

    iput v3, v1, Lq7;->t:I

    iget v3, v2, Lq7;->u:I

    iput v3, v1, Lq7;->u:I

    iget v3, v2, Lq7;->v:I

    iput v3, v1, Lq7;->v:I

    iget v3, v2, Lq7;->w:F

    iput v3, v1, Lq7;->w:F

    iget v3, v2, Lq7;->x:F

    iput v3, v1, Lq7;->x:F

    iget-object v3, v2, Lq7;->y:Ljava/lang/String;

    iput-object v3, v1, Lq7;->y:Ljava/lang/String;

    iget v3, v2, Lq7;->z:I

    iput v3, v1, Lq7;->z:I

    iget v3, v2, Lq7;->A:I

    iput v3, v1, Lq7;->A:I

    iget v3, v2, Lq7;->B:F

    iput v3, v1, Lq7;->B:F

    iget v3, v2, Lq7;->C:I

    iput v3, v1, Lq7;->C:I

    iget v3, v2, Lq7;->D:I

    iput v3, v1, Lq7;->D:I

    iget v3, v2, Lq7;->E:I

    iput v3, v1, Lq7;->E:I

    iget v3, v2, Lq7;->F:I

    iput v3, v1, Lq7;->F:I

    iget v3, v2, Lq7;->G:I

    iput v3, v1, Lq7;->G:I

    iget v3, v2, Lq7;->H:I

    iput v3, v1, Lq7;->H:I

    iget v3, v2, Lq7;->I:I

    iput v3, v1, Lq7;->I:I

    iget v3, v2, Lq7;->J:I

    iput v3, v1, Lq7;->J:I

    iget v3, v2, Lq7;->K:I

    iput v3, v1, Lq7;->K:I

    iget v3, v2, Lq7;->L:I

    iput v3, v1, Lq7;->L:I

    iget v3, v2, Lq7;->M:I

    iput v3, v1, Lq7;->M:I

    iget v3, v2, Lq7;->N:I

    iput v3, v1, Lq7;->N:I

    iget v3, v2, Lq7;->O:I

    iput v3, v1, Lq7;->O:I

    iget v3, v2, Lq7;->P:I

    iput v3, v1, Lq7;->P:I

    iget v3, v2, Lq7;->Q:I

    iput v3, v1, Lq7;->Q:I

    iget v3, v2, Lq7;->R:I

    iput v3, v1, Lq7;->R:I

    iget v3, v2, Lq7;->S:I

    iput v3, v1, Lq7;->S:I

    iget v3, v2, Lq7;->T:F

    iput v3, v1, Lq7;->T:F

    iget v3, v2, Lq7;->U:F

    iput v3, v1, Lq7;->U:F

    iget v3, v2, Lq7;->V:I

    iput v3, v1, Lq7;->V:I

    iget v3, v2, Lq7;->W:I

    iput v3, v1, Lq7;->W:I

    iget v3, v2, Lq7;->X:I

    iput v3, v1, Lq7;->X:I

    iget v3, v2, Lq7;->Y:I

    iput v3, v1, Lq7;->Y:I

    iget v3, v2, Lq7;->Z:I

    iput v3, v1, Lq7;->Z:I

    iget v3, v2, Lq7;->a0:I

    iput v3, v1, Lq7;->a0:I

    iget v3, v2, Lq7;->b0:I

    iput v3, v1, Lq7;->b0:I

    iget v3, v2, Lq7;->c0:I

    iput v3, v1, Lq7;->c0:I

    iget v3, v2, Lq7;->d0:F

    iput v3, v1, Lq7;->d0:F

    iget v3, v2, Lq7;->e0:F

    iput v3, v1, Lq7;->e0:F

    iget v3, v2, Lq7;->f0:I

    iput v3, v1, Lq7;->f0:I

    iget v3, v2, Lq7;->g0:I

    iput v3, v1, Lq7;->g0:I

    iget v3, v2, Lq7;->h0:I

    iput v3, v1, Lq7;->h0:I

    iget-object v3, v2, Lq7;->k0:Ljava/lang/String;

    iput-object v3, v1, Lq7;->k0:Ljava/lang/String;

    iget-object v3, v2, Lq7;->i0:[I

    if-eqz v3, :cond_0

    iget-object v4, v2, Lq7;->j0:Ljava/lang/String;

    if-nez v4, :cond_0

    array-length v4, v3

    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v3

    iput-object v3, v1, Lq7;->i0:[I

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    iput-object v3, v1, Lq7;->i0:[I

    :goto_0
    iget-object v3, v2, Lq7;->j0:Ljava/lang/String;

    iput-object v3, v1, Lq7;->j0:Ljava/lang/String;

    iget-boolean v3, v2, Lq7;->l0:Z

    iput-boolean v3, v1, Lq7;->l0:Z

    iget-boolean v3, v2, Lq7;->m0:Z

    iput-boolean v3, v1, Lq7;->m0:Z

    iget-boolean v3, v2, Lq7;->n0:Z

    iput-boolean v3, v1, Lq7;->n0:Z

    iget v2, v2, Lq7;->o0:I

    iput v2, v1, Lq7;->o0:I

    iget-object v1, v0, Lp7;->c:Lr7;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Lp7;->c:Lr7;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v3, v2, Lr7;->a:I

    iput v3, v1, Lr7;->a:I

    iget v3, v2, Lr7;->c:I

    iput v3, v1, Lr7;->c:I

    iget v3, v2, Lr7;->e:F

    iput v3, v1, Lr7;->e:F

    iget v2, v2, Lr7;->d:F

    iput v2, v1, Lr7;->d:F

    iget-object v1, v0, Lp7;->b:Ls7;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Lp7;->b:Ls7;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v3, v2, Ls7;->a:I

    iput v3, v1, Ls7;->a:I

    iget v3, v2, Ls7;->c:F

    iput v3, v1, Ls7;->c:F

    iget v3, v2, Ls7;->d:F

    iput v3, v1, Ls7;->d:F

    iget v2, v2, Ls7;->b:I

    iput v2, v1, Ls7;->b:I

    iget-object v1, v0, Lp7;->e:Lt7;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, p0, Lp7;->e:Lt7;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v3, v2, Lt7;->a:F

    iput v3, v1, Lt7;->a:F

    iget v3, v2, Lt7;->b:F

    iput v3, v1, Lt7;->b:F

    iget v3, v2, Lt7;->c:F

    iput v3, v1, Lt7;->c:F

    iget v3, v2, Lt7;->d:F

    iput v3, v1, Lt7;->d:F

    iget v3, v2, Lt7;->e:F

    iput v3, v1, Lt7;->e:F

    iget v3, v2, Lt7;->f:F

    iput v3, v1, Lt7;->f:F

    iget v3, v2, Lt7;->g:F

    iput v3, v1, Lt7;->g:F

    iget v3, v2, Lt7;->h:I

    iput v3, v1, Lt7;->h:I

    iget v3, v2, Lt7;->i:F

    iput v3, v1, Lt7;->i:F

    iget v3, v2, Lt7;->j:F

    iput v3, v1, Lt7;->j:F

    iget v3, v2, Lt7;->k:F

    iput v3, v1, Lt7;->k:F

    iget-boolean v3, v2, Lt7;->l:Z

    iput-boolean v3, v1, Lt7;->l:Z

    iget v2, v2, Lt7;->m:F

    iput v2, v1, Lt7;->m:F

    iget v1, p0, Lp7;->a:I

    iput v1, v0, Lp7;->a:I

    return-object v0
.end method
