.class public final LOj;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljj;

.field public final b:Lk0;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/ArrayList;

.field public final e:LVi;

.field public final f:Z

.field public final g:Lpa;

.field public final h:Z

.field public final i:Z

.field public final j:Lpa;

.field public final k:Lpa;

.field public final l:Lpa;

.field public final m:Ljavax/net/SocketFactory;

.field public final n:Ljava/util/List;

.field public final o:Ljava/util/List;

.field public final p:LNj;

.field public final q:LD5;

.field public r:I

.field public s:I

.field public final t:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljj;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljj;-><init>(I)V

    iput-object v0, p0, LOj;->a:Ljj;

    new-instance v0, Lk0;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lk0;-><init>(I)V

    iput-object v0, p0, LOj;->b:Lk0;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LOj;->c:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LOj;->d:Ljava/util/ArrayList;

    new-instance v0, LVi;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, LVi;-><init>(I)V

    iput-object v0, p0, LOj;->e:LVi;

    const/4 v0, 0x1

    iput-boolean v0, p0, LOj;->f:Z

    sget-object v1, Lpa;->b:Lpa;

    iput-object v1, p0, LOj;->g:Lpa;

    iput-boolean v0, p0, LOj;->h:Z

    iput-boolean v0, p0, LOj;->i:Z

    sget-object v0, Lpa;->c:Lpa;

    iput-object v0, p0, LOj;->j:Lpa;

    sget-object v0, Lpa;->d:Lpa;

    iput-object v0, p0, LOj;->k:Lpa;

    iput-object v1, p0, LOj;->l:Lpa;

    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    move-result-object v0

    const-string v1, "SocketFactory.getDefault()"

    invoke-static {v1, v0}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object v0, p0, LOj;->m:Ljavax/net/SocketFactory;

    sget-object v0, LPj;->A:Ljava/util/List;

    iput-object v0, p0, LOj;->n:Ljava/util/List;

    sget-object v0, LPj;->z:Ljava/util/List;

    iput-object v0, p0, LOj;->o:Ljava/util/List;

    sget-object v0, LNj;->a:LNj;

    iput-object v0, p0, LOj;->p:LNj;

    sget-object v0, LD5;->c:LD5;

    iput-object v0, p0, LOj;->q:LD5;

    const/16 v0, 0x2710

    iput v0, p0, LOj;->r:I

    iput v0, p0, LOj;->s:I

    iput v0, p0, LOj;->t:I

    return-void
.end method
