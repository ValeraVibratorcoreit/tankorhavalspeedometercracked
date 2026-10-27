.class public final LCe;
.super LAe;
.source "SourceFile"


# instance fields
.field public d:J

.field public e:Z

.field public final f:Lgf;

.field public final synthetic g:LGe;


# direct methods
.method public constructor <init>(LGe;Lgf;)V
    .locals 1

    const-string v0, "url"

    invoke-static {v0, p2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p1, p0, LCe;->g:LGe;

    invoke-direct {p0, p1}, LAe;-><init>(LGe;)V

    iput-object p2, p0, LCe;->f:Lgf;

    const-wide/16 p1, -0x1

    iput-wide p1, p0, LCe;->d:J

    const/4 p1, 0x1

    iput-boolean p1, p0, LCe;->e:Z

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    iget-boolean v0, p0, LAe;->b:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-boolean v0, p0, LCe;->e:Z

    if-eqz v0, :cond_1

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {p0, v0}, LRr;->h(LXo;Ljava/util/concurrent/TimeUnit;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, LCe;->g:LGe;

    iget-object v0, v0, LGe;->g:Ljava/lang/Object;

    check-cast v0, LGl;

    invoke-virtual {v0}, LGl;->k()V

    invoke-virtual {p0}, LAe;->n()V

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, LAe;->b:Z

    return-void
.end method

.method public final f(LL4;J)J
    .locals 10

    const-string v0, "sink"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_9

    iget-boolean v2, p0, LAe;->b:Z

    xor-int/lit8 v2, v2, 0x1

    if-eqz v2, :cond_8

    iget-boolean v2, p0, LCe;->e:Z

    const-wide/16 v3, -0x1

    if-nez v2, :cond_0

    return-wide v3

    :cond_0
    iget-wide v5, p0, LCe;->d:J

    cmp-long v2, v5, v0

    iget-object v7, p0, LCe;->g:LGe;

    if-eqz v2, :cond_1

    cmp-long v2, v5, v3

    if-nez v2, :cond_5

    :cond_1
    const-string v2, "expected chunk size and optional extensions but was \""

    cmp-long v5, v5, v3

    if-eqz v5, :cond_2

    iget-object v5, v7, LGe;->a:LP4;

    invoke-interface {v5}, LP4;->k()Ljava/lang/String;

    :cond_2
    :try_start_0
    iget-object v5, v7, LGe;->a:LP4;

    invoke-interface {v5}, LP4;->s()J

    move-result-wide v5

    iput-wide v5, p0, LCe;->d:J

    iget-object v5, v7, LGe;->a:LP4;

    invoke-interface {v5}, LP4;->k()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, LMp;->W0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    iget-wide v8, p0, LCe;->d:J

    cmp-long v6, v8, v0

    if-ltz v6, :cond_7

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    const/4 v8, 0x0

    if-lez v6, :cond_3

    const-string v6, ";"

    invoke-static {v5, v6, v8}, LMp;->U0(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v6
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v6, :cond_7

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_3
    :goto_0
    iget-wide v5, p0, LCe;->d:J

    cmp-long v0, v5, v0

    if-nez v0, :cond_4

    iput-boolean v8, p0, LCe;->e:Z

    iget-object v0, v7, LGe;->d:Ljava/lang/Object;

    check-cast v0, LO5;

    invoke-virtual {v0}, LO5;->f()Lse;

    move-result-object v0

    iput-object v0, v7, LGe;->e:Ljava/lang/Object;

    iget-object v0, v7, LGe;->f:Ljava/lang/Object;

    check-cast v0, LPj;

    invoke-static {v0}, LTf;->f(Ljava/lang/Object;)V

    iget-object v1, v7, LGe;->e:Ljava/lang/Object;

    check-cast v1, Lse;

    invoke-static {v1}, LTf;->f(Ljava/lang/Object;)V

    iget-object v0, v0, LPj;->j:Lpa;

    iget-object v2, p0, LCe;->f:Lgf;

    invoke-static {v0, v2, v1}, Lef;->b(Lpa;Lgf;Lse;)V

    invoke-virtual {p0}, LAe;->n()V

    :cond_4
    iget-boolean v0, p0, LCe;->e:Z

    if-nez v0, :cond_5

    return-wide v3

    :cond_5
    iget-wide v0, p0, LCe;->d:J

    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    invoke-super {p0, p1, p2, p3}, LAe;->f(LL4;J)J

    move-result-wide p1

    cmp-long p3, p1, v3

    if-eqz p3, :cond_6

    iget-wide v0, p0, LCe;->d:J

    sub-long/2addr v0, p1

    iput-wide v0, p0, LCe;->d:J

    return-wide p1

    :cond_6
    iget-object p1, v7, LGe;->g:Ljava/lang/Object;

    check-cast p1, LGl;

    invoke-virtual {p1}, LGl;->k()V

    new-instance p1, Ljava/net/ProtocolException;

    const-string p2, "unexpected end of stream"

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, LAe;->n()V

    throw p1

    :cond_7
    :try_start_1
    new-instance p1, Ljava/net/ProtocolException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v0, p0, LCe;->d:J

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p3, 0x22

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    :goto_1
    new-instance p2, Ljava/net/ProtocolException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "byteCount < 0: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
