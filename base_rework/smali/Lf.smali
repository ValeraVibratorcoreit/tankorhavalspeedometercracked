.class public final LLf;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static J:LLf;


# instance fields
.field public A:Ldr;

.field public B:Ldr;

.field public C:Ldr;

.field public D:Ldr;

.field public E:Ldr;

.field public F:Ldr;

.field public G:Ldr;

.field public H:Ldr;

.field public I:Ldr;

.field public a:Ldr;

.field public b:Ldr;

.field public c:Ldr;

.field public d:Ldr;

.field public e:Ldr;

.field public f:Ldr;

.field public g:Ldr;

.field public h:Ldr;

.field public i:Ldr;

.field public j:Ldr;

.field public k:Ldr;

.field public l:Ldr;

.field public m:Ldr;

.field public n:Ldr;

.field public o:Ldr;

.field public p:Ldr;

.field public q:Ldr;

.field public r:Ldr;

.field public s:Ldr;

.field public t:Ldr;

.field public u:Ldr;

.field public v:Ldr;

.field public w:Ldr;

.field public x:Ldr;

.field public y:Ldr;

.field public z:Ldr;


# direct methods
.method public static a()LLf;
    .locals 6

    sget-object v0, LLf;->J:LLf;

    if-nez v0, :cond_0

    new-instance v0, LLf;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ldr;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-direct {v1, v2}, Ldr;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, LLf;->a:Ldr;

    new-instance v1, Ldr;

    invoke-direct {v1, v2}, Ldr;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, LLf;->b:Ldr;

    new-instance v1, Ldr;

    const/4 v3, 0x3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v3}, Ldr;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, LLf;->c:Ldr;

    new-instance v1, Ldr;

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v1, v3}, Ldr;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, LLf;->d:Ldr;

    new-instance v1, Ldr;

    invoke-direct {v1, v2}, Ldr;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, LLf;->e:Ldr;

    new-instance v1, Ldr;

    invoke-direct {v1, v2}, Ldr;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, LLf;->f:Ldr;

    new-instance v1, Ldr;

    const/high16 v4, -0x40800000    # -1.0f

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-direct {v1, v4}, Ldr;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, LLf;->g:Ldr;

    new-instance v1, Ldr;

    invoke-direct {v1, v4}, Ldr;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, LLf;->h:Ldr;

    new-instance v1, Ldr;

    invoke-direct {v1, v4}, Ldr;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, LLf;->i:Ldr;

    new-instance v1, Ldr;

    invoke-direct {v1, v4}, Ldr;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, LLf;->j:Ldr;

    new-instance v1, Ldr;

    invoke-direct {v1, v4}, Ldr;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, LLf;->k:Ldr;

    new-instance v1, Ldr;

    invoke-direct {v1, v4}, Ldr;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, LLf;->l:Ldr;

    new-instance v1, Ldr;

    invoke-direct {v1, v4}, Ldr;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, LLf;->m:Ldr;

    new-instance v1, Ldr;

    const/4 v5, -0x1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-direct {v1, v5}, Ldr;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, LLf;->n:Ldr;

    new-instance v1, Ldr;

    invoke-direct {v1, v4}, Ldr;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, LLf;->o:Ldr;

    new-instance v1, Ldr;

    invoke-direct {v1, v4}, Ldr;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, LLf;->p:Ldr;

    new-instance v1, Ldr;

    invoke-direct {v1, v4}, Ldr;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, LLf;->q:Ldr;

    new-instance v1, Ldr;

    invoke-direct {v1, v2}, Ldr;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, LLf;->r:Ldr;

    new-instance v1, Ldr;

    const/high16 v2, -0x3b860000    # -1000.0f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-direct {v1, v2}, Ldr;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, LLf;->s:Ldr;

    new-instance v1, Ldr;

    invoke-direct {v1, v3}, Ldr;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, LLf;->t:Ldr;

    new-instance v1, Ldr;

    const-string v2, "1"

    invoke-direct {v1, v2}, Ldr;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, LLf;->u:Ldr;

    new-instance v1, Ldr;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v1, v2}, Ldr;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, LLf;->v:Ldr;

    new-instance v1, Ldr;

    invoke-direct {v1, v2}, Ldr;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, LLf;->w:Ldr;

    new-instance v1, Ldr;

    invoke-direct {v1, v2}, Ldr;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, LLf;->x:Ldr;

    new-instance v1, Ldr;

    invoke-direct {v1, v2}, Ldr;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, LLf;->y:Ldr;

    new-instance v1, Ldr;

    const-string v2, "[]"

    invoke-direct {v1, v2}, Ldr;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, LLf;->z:Ldr;

    new-instance v1, Ldr;

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v1, v2}, Ldr;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, LLf;->A:Ldr;

    new-instance v1, Ldr;

    invoke-direct {v1, v3}, Ldr;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, LLf;->B:Ldr;

    new-instance v1, Ldr;

    invoke-direct {v1, v3}, Ldr;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, LLf;->C:Ldr;

    new-instance v1, Ldr;

    invoke-direct {v1, v2}, Ldr;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, LLf;->D:Ldr;

    new-instance v1, Ldr;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {v1, v2}, Ldr;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, LLf;->E:Ldr;

    new-instance v1, Ldr;

    invoke-direct {v1, v4}, Ldr;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, LLf;->F:Ldr;

    new-instance v1, Ldr;

    invoke-direct {v1, v5}, Ldr;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, LLf;->G:Ldr;

    new-instance v1, Ldr;

    invoke-direct {v1, v5}, Ldr;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, LLf;->H:Ldr;

    new-instance v1, Ldr;

    const-string v2, "ru.yandex.yandexnavi"

    invoke-direct {v1, v2}, Ldr;-><init>(Ljava/lang/Object;)V

    iput-object v1, v0, LLf;->I:Ldr;

    sput-object v0, LLf;->J:LLf;

    :cond_0
    sget-object v0, LLf;->J:LLf;

    return-object v0
.end method

.method public static f(Loj;LDg;LMj;)V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "observe"

    invoke-static {v0}, Loj;->a(Ljava/lang/String;)V

    invoke-interface {p1}, LDg;->getLifecycle()Lwg;

    move-result-object v0

    check-cast v0, LFg;

    iget-object v0, v0, LFg;->c:Lug;

    sget-object v1, Lug;->a:Lug;

    if-ne v0, v1, :cond_0

    goto :goto_3

    :cond_0
    new-instance v0, Ldh;

    invoke-direct {v0, p0, p1, p2}, Ldh;-><init>(Loj;LDg;LMj;)V

    iget-object p0, p0, Loj;->b:Lon;

    invoke-virtual {p0, p2}, Lon;->a(Ljava/lang/Object;)Lln;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object p0, v1, Lln;->b:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    new-instance v1, Lln;

    invoke-direct {v1, p2, v0}, Lln;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iget p2, p0, Lon;->d:I

    add-int/lit8 p2, p2, 0x1

    iput p2, p0, Lon;->d:I

    iget-object p2, p0, Lon;->b:Lln;

    if-nez p2, :cond_2

    iput-object v1, p0, Lon;->a:Lln;

    iput-object v1, p0, Lon;->b:Lln;

    goto :goto_0

    :cond_2
    iput-object v1, p2, Lln;->c:Lln;

    iput-object p2, v1, Lln;->d:Lln;

    iput-object v1, p0, Lon;->b:Lln;

    :goto_0
    const/4 p0, 0x0

    :goto_1
    check-cast p0, Leh;

    if-eqz p0, :cond_4

    invoke-virtual {p0, p1}, Leh;->c(LDg;)Z

    move-result p2

    if-eqz p2, :cond_3

    goto :goto_2

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Cannot add the same observer with different lifecycles"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    :goto_2
    if-eqz p0, :cond_5

    goto :goto_3

    :cond_5
    invoke-interface {p1}, LDg;->getLifecycle()Lwg;

    move-result-object p0

    invoke-virtual {p0, v0}, Lwg;->a(LCg;)V

    :goto_3
    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, LLf;->s:Ldr;

    invoke-virtual {v0}, Loj;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    return-object v0
.end method

.method public final c()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, LLf;->g:Ldr;

    invoke-virtual {v0}, Loj;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    return-object v0
.end method

.method public final d()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, LLf;->E:Ldr;

    invoke-virtual {v0}, Loj;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    return-object v0
.end method

.method public final e(Ljava/lang/Integer;)V
    .locals 1

    iget-object v0, p0, LLf;->t:Ldr;

    invoke-virtual {v0, p1}, Ldr;->f(Ljava/lang/Object;)V

    return-void
.end method

.method public final g(Ljava/lang/Float;)V
    .locals 1

    iget-object v0, p0, LLf;->g:Ldr;

    invoke-virtual {v0, p1}, Ldr;->f(Ljava/lang/Object;)V

    return-void
.end method

.method public final h(Ljava/lang/Boolean;)V
    .locals 1

    iget-object v0, p0, LLf;->E:Ldr;

    invoke-virtual {v0, p1}, Ldr;->f(Ljava/lang/Object;)V

    return-void
.end method

.method public final i(Ljava/lang/Boolean;)V
    .locals 1

    iget-object v0, p0, LLf;->v:Ldr;

    invoke-virtual {v0, p1}, Ldr;->f(Ljava/lang/Object;)V

    return-void
.end method
