.class public final LOe;
.super Liq;
.source "SourceFile"


# instance fields
.field public final synthetic e:LTe;

.field public final synthetic f:I

.field public final synthetic g:LL4;

.field public final synthetic h:I


# direct methods
.method public constructor <init>(Ljava/lang/String;LTe;ILL4;IZ)V
    .locals 0

    iput-object p2, p0, LOe;->e:LTe;

    iput p3, p0, LOe;->f:I

    iput-object p4, p0, LOe;->g:LL4;

    iput p5, p0, LOe;->h:I

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Liq;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 4

    :try_start_0
    iget-object v0, p0, LOe;->e:LTe;

    iget-object v0, v0, LTe;->l:Lpa;

    iget-object v1, p0, LOe;->g:LL4;

    iget v2, p0, LOe;->h:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "source"

    invoke-static {v0, v1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    int-to-long v2, v2

    invoke-virtual {v1, v2, v3}, LL4;->a(J)V

    iget-object v0, p0, LOe;->e:LTe;

    iget-object v0, v0, LTe;->y:Lbf;

    iget v1, p0, LOe;->f:I

    const/16 v2, 0x9

    invoke-virtual {v0, v1, v2}, Lbf;->A(II)V

    iget-object v0, p0, LOe;->e:LTe;

    monitor-enter v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v1, p0, LOe;->e:LTe;

    iget-object v1, v1, LTe;->A:Ljava/util/LinkedHashSet;

    iget v2, p0, LOe;->f:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :goto_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method
