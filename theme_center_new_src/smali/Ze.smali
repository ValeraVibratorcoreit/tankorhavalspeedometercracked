.class public final LZe;
.super Ln3;
.source "SourceFile"


# instance fields
.field public final synthetic k:I

.field public final l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, LZe;->k:I

    iput-object p1, p0, LZe;->l:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public j(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    iget v0, p0, LZe;->k:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    invoke-super {p0, p1}, Ln3;->j(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    return-object p1

    :pswitch_1
    new-instance v0, Ljava/net/SocketTimeoutException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/net/SocketTimeoutException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_0
    return-object v0

    :pswitch_2
    new-instance v0, Ljava/net/SocketTimeoutException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/net/SocketTimeoutException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_1

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_1
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public final k()V
    .locals 6

    iget v0, p0, LZe;->k:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "Failed to close timed out socket "

    iget-object v1, p0, LZe;->l:Ljava/lang/Object;

    check-cast v1, Ljava/net/Socket;

    :try_start_0
    invoke-virtual {v1}, Ljava/net/Socket;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    invoke-static {v2}, LTf;->I(Ljava/lang/AssertionError;)Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v3, LQj;->a:Ljava/util/logging/Logger;

    sget-object v4, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v4, v0, v2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    throw v2

    :catch_1
    move-exception v2

    sget-object v3, LQj;->a:Ljava/util/logging/Logger;

    sget-object v4, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v4, v0, v2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, LZe;->l:Ljava/lang/Object;

    check-cast v0, LDl;

    iget-boolean v1, v0, LDl;->m:Z

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x1

    iput-boolean v1, v0, LDl;->m:Z

    iget-object v1, v0, LDl;->n:Lsb;

    if-eqz v1, :cond_2

    iget-object v1, v1, Lsb;->f:Ltb;

    invoke-interface {v1}, Ltb;->cancel()V

    :cond_2
    iget-object v1, v0, LDl;->o:LGl;

    if-eqz v1, :cond_3

    iget-object v1, v1, LGl;->b:Ljava/net/Socket;

    if-eqz v1, :cond_3

    invoke-static {v1}, LRr;->e(Ljava/net/Socket;)V

    :cond_3
    iget-object v0, v0, LDl;->b:Lpa;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_1
    return-void

    :pswitch_1
    iget-object v0, p0, LZe;->l:Ljava/lang/Object;

    check-cast v0, Laf;

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Laf;->e(I)V

    iget-object v0, p0, LZe;->l:Ljava/lang/Object;

    check-cast v0, Laf;

    iget-object v0, v0, Laf;->n:LTe;

    monitor-enter v0

    :try_start_1
    iget-wide v1, v0, LTe;->p:J

    iget-wide v3, v0, LTe;->o:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    cmp-long v1, v1, v3

    if-gez v1, :cond_4

    monitor-exit v0

    goto :goto_2

    :cond_4
    const-wide/16 v1, 0x1

    add-long/2addr v3, v1

    :try_start_2
    iput-wide v3, v0, LTe;->o:J

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    const v3, 0x3b9aca00

    int-to-long v3, v3

    add-long/2addr v1, v3

    iput-wide v1, v0, LTe;->q:J
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    iget-object v1, v0, LTe;->i:Ljq;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v0, LTe;->d:Ljava/lang/String;

    const-string v4, " ping"

    invoke-static {v2, v3, v4}, LVo;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, LRe;

    invoke-direct {v3, v2, v0}, LRe;-><init>(Ljava/lang/String;LTe;)V

    const-wide/16 v4, 0x0

    invoke-virtual {v1, v3, v4, v5}, Ljq;->c(Liq;J)V

    :goto_2
    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public l()V
    .locals 1

    invoke-virtual {p0}, Ln3;->i()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LZe;->j(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method
