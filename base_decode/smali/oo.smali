.class public final Loo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LF4;

.field public b:LF4;

.field public c:LF4;

.field public d:LF4;

.field public e:LR7;

.field public f:LR7;

.field public g:LR7;

.field public h:LR7;

.field public i:Lpa;

.field public j:Lpa;

.field public k:Lpa;

.field public l:Lpa;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Len;

    invoke-direct {v0}, Len;-><init>()V

    iput-object v0, p0, Loo;->a:LF4;

    new-instance v0, Len;

    invoke-direct {v0}, Len;-><init>()V

    iput-object v0, p0, Loo;->b:LF4;

    new-instance v0, Len;

    invoke-direct {v0}, Len;-><init>()V

    iput-object v0, p0, Loo;->c:LF4;

    new-instance v0, Len;

    invoke-direct {v0}, Len;-><init>()V

    iput-object v0, p0, Loo;->d:LF4;

    new-instance v0, Li;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li;-><init>(F)V

    iput-object v0, p0, Loo;->e:LR7;

    new-instance v0, Li;

    invoke-direct {v0, v1}, Li;-><init>(F)V

    iput-object v0, p0, Loo;->f:LR7;

    new-instance v0, Li;

    invoke-direct {v0, v1}, Li;-><init>(F)V

    iput-object v0, p0, Loo;->g:LR7;

    new-instance v0, Li;

    invoke-direct {v0, v1}, Li;-><init>(F)V

    iput-object v0, p0, Loo;->h:LR7;

    new-instance v0, Lpa;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpa;-><init>(I)V

    iput-object v0, p0, Loo;->i:Lpa;

    new-instance v0, Lpa;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpa;-><init>(I)V

    iput-object v0, p0, Loo;->j:Lpa;

    new-instance v0, Lpa;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpa;-><init>(I)V

    iput-object v0, p0, Loo;->k:Lpa;

    new-instance v0, Lpa;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lpa;-><init>(I)V

    iput-object v0, p0, Loo;->l:Lpa;

    return-void
.end method

.method public static b(LF4;)V
    .locals 1

    instance-of v0, p0, Len;

    if-eqz v0, :cond_0

    check-cast p0, Len;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_0
    instance-of v0, p0, LU7;

    if-eqz v0, :cond_1

    check-cast p0, LU7;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_1
    return-void
.end method


# virtual methods
.method public final a()Lpo;
    .locals 2

    new-instance v0, Lpo;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Loo;->a:LF4;

    iput-object v1, v0, Lpo;->a:LF4;

    iget-object v1, p0, Loo;->b:LF4;

    iput-object v1, v0, Lpo;->b:LF4;

    iget-object v1, p0, Loo;->c:LF4;

    iput-object v1, v0, Lpo;->c:LF4;

    iget-object v1, p0, Loo;->d:LF4;

    iput-object v1, v0, Lpo;->d:LF4;

    iget-object v1, p0, Loo;->e:LR7;

    iput-object v1, v0, Lpo;->e:LR7;

    iget-object v1, p0, Loo;->f:LR7;

    iput-object v1, v0, Lpo;->f:LR7;

    iget-object v1, p0, Loo;->g:LR7;

    iput-object v1, v0, Lpo;->g:LR7;

    iget-object v1, p0, Loo;->h:LR7;

    iput-object v1, v0, Lpo;->h:LR7;

    iget-object v1, p0, Loo;->i:Lpa;

    iput-object v1, v0, Lpo;->i:Lpa;

    iget-object v1, p0, Loo;->j:Lpa;

    iput-object v1, v0, Lpo;->j:Lpa;

    iget-object v1, p0, Loo;->k:Lpa;

    iput-object v1, v0, Lpo;->k:Lpa;

    iget-object v1, p0, Loo;->l:Lpa;

    iput-object v1, v0, Lpo;->l:Lpa;

    return-object v0
.end method
