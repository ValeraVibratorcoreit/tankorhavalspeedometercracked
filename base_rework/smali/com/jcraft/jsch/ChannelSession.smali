.class Lcom/jcraft/jsch/ChannelSession;
.super Lcom/jcraft/jsch/Channel;
.source "SourceFile"


# static fields
.field private static _session:[B


# instance fields
.field protected agent_forwarding:Z

.field protected env:Ljava/util/Hashtable;

.field protected pty:Z

.field protected tcol:I

.field protected terminal_mode:[B

.field protected thp:I

.field protected trow:I

.field protected ttype:Ljava/lang/String;

.field protected twp:I

.field protected xforwading:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "session"

    invoke-static {v0}, Lcom/jcraft/jsch/Util;->str2byte(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Lcom/jcraft/jsch/ChannelSession;->_session:[B

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/jcraft/jsch/Channel;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jcraft/jsch/ChannelSession;->agent_forwarding:Z

    iput-boolean v0, p0, Lcom/jcraft/jsch/ChannelSession;->xforwading:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/jcraft/jsch/ChannelSession;->env:Ljava/util/Hashtable;

    iput-boolean v0, p0, Lcom/jcraft/jsch/ChannelSession;->pty:Z

    const-string v0, "vt100"

    iput-object v0, p0, Lcom/jcraft/jsch/ChannelSession;->ttype:Ljava/lang/String;

    const/16 v0, 0x50

    iput v0, p0, Lcom/jcraft/jsch/ChannelSession;->tcol:I

    const/16 v0, 0x18

    iput v0, p0, Lcom/jcraft/jsch/ChannelSession;->trow:I

    const/16 v0, 0x280

    iput v0, p0, Lcom/jcraft/jsch/ChannelSession;->twp:I

    const/16 v0, 0x1e0

    iput v0, p0, Lcom/jcraft/jsch/ChannelSession;->thp:I

    iput-object v1, p0, Lcom/jcraft/jsch/ChannelSession;->terminal_mode:[B

    sget-object v0, Lcom/jcraft/jsch/ChannelSession;->_session:[B

    iput-object v0, p0, Lcom/jcraft/jsch/Channel;->type:[B

    new-instance v0, Lcom/jcraft/jsch/IO;

    invoke-direct {v0}, Lcom/jcraft/jsch/IO;-><init>()V

    iput-object v0, p0, Lcom/jcraft/jsch/Channel;->io:Lcom/jcraft/jsch/IO;

    return-void
.end method

.method private getEnv()Ljava/util/Hashtable;
    .locals 1

    iget-object v0, p0, Lcom/jcraft/jsch/ChannelSession;->env:Ljava/util/Hashtable;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lcom/jcraft/jsch/ChannelSession;->env:Ljava/util/Hashtable;

    :cond_0
    iget-object v0, p0, Lcom/jcraft/jsch/ChannelSession;->env:Ljava/util/Hashtable;

    return-object v0
.end method

.method private toByteArray(Ljava/lang/Object;)[B
    .locals 1

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lcom/jcraft/jsch/Util;->str2byte(Ljava/lang/String;)[B

    move-result-object p1

    return-object p1

    :cond_0
    check-cast p1, [B

    return-object p1
.end method


# virtual methods
.method public run()V
    .locals 6

    new-instance v0, Lcom/jcraft/jsch/Buffer;

    iget v1, p0, Lcom/jcraft/jsch/Channel;->rmpsize:I

    invoke-direct {v0, v1}, Lcom/jcraft/jsch/Buffer;-><init>(I)V

    new-instance v1, Lcom/jcraft/jsch/Packet;

    invoke-direct {v1, v0}, Lcom/jcraft/jsch/Packet;-><init>(Lcom/jcraft/jsch/Buffer;)V

    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lcom/jcraft/jsch/Channel;->isConnected()Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/jcraft/jsch/Channel;->thread:Ljava/lang/Thread;

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/jcraft/jsch/Channel;->io:Lcom/jcraft/jsch/IO;

    if-eqz v2, :cond_3

    iget-object v2, v2, Lcom/jcraft/jsch/IO;->in:Ljava/io/InputStream;

    if-eqz v2, :cond_3

    iget-object v3, v0, Lcom/jcraft/jsch/Buffer;->buffer:[B

    array-length v4, v3

    add-int/lit16 v4, v4, -0x8e

    const/16 v5, 0xe

    invoke-virtual {v2, v3, v5, v4}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, -0x1

    if-ne v2, v3, :cond_1

    invoke-virtual {p0}, Lcom/jcraft/jsch/Channel;->eof()V

    goto :goto_1

    :cond_1
    iget-boolean v3, p0, Lcom/jcraft/jsch/Channel;->close:Z

    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Lcom/jcraft/jsch/Packet;->reset()V

    const/16 v3, 0x5e

    invoke-virtual {v0, v3}, Lcom/jcraft/jsch/Buffer;->putByte(B)V

    iget v3, p0, Lcom/jcraft/jsch/Channel;->recipient:I

    invoke-virtual {v0, v3}, Lcom/jcraft/jsch/Buffer;->putInt(I)V

    invoke-virtual {v0, v2}, Lcom/jcraft/jsch/Buffer;->putInt(I)V

    invoke-virtual {v0, v2}, Lcom/jcraft/jsch/Buffer;->skip(I)V

    invoke-virtual {p0}, Lcom/jcraft/jsch/Channel;->getSession()Lcom/jcraft/jsch/Session;

    move-result-object v3

    invoke-virtual {v3, v1, p0, v2}, Lcom/jcraft/jsch/Session;->write(Lcom/jcraft/jsch/Packet;Lcom/jcraft/jsch/Channel;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/jcraft/jsch/Channel;->thread:Ljava/lang/Thread;

    if-eqz v0, :cond_4

    monitor-enter v0

    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v0

    goto :goto_2

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    :cond_4
    :goto_2
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/jcraft/jsch/Channel;->thread:Ljava/lang/Thread;

    return-void
.end method

.method public sendRequests()V
    .locals 6

    invoke-virtual {p0}, Lcom/jcraft/jsch/Channel;->getSession()Lcom/jcraft/jsch/Session;

    move-result-object v0

    iget-boolean v1, p0, Lcom/jcraft/jsch/ChannelSession;->agent_forwarding:Z

    if-eqz v1, :cond_0

    new-instance v1, Lcom/jcraft/jsch/RequestAgentForwarding;

    invoke-direct {v1}, Lcom/jcraft/jsch/RequestAgentForwarding;-><init>()V

    invoke-virtual {v1, v0, p0}, Lcom/jcraft/jsch/RequestAgentForwarding;->request(Lcom/jcraft/jsch/Session;Lcom/jcraft/jsch/Channel;)V

    :cond_0
    iget-boolean v1, p0, Lcom/jcraft/jsch/ChannelSession;->xforwading:Z

    if-eqz v1, :cond_1

    new-instance v1, Lcom/jcraft/jsch/RequestX11;

    invoke-direct {v1}, Lcom/jcraft/jsch/RequestX11;-><init>()V

    invoke-virtual {v1, v0, p0}, Lcom/jcraft/jsch/RequestX11;->request(Lcom/jcraft/jsch/Session;Lcom/jcraft/jsch/Channel;)V

    :cond_1
    iget-boolean v1, p0, Lcom/jcraft/jsch/ChannelSession;->pty:Z

    if-eqz v1, :cond_3

    new-instance v1, Lcom/jcraft/jsch/RequestPtyReq;

    invoke-direct {v1}, Lcom/jcraft/jsch/RequestPtyReq;-><init>()V

    iget-object v2, p0, Lcom/jcraft/jsch/ChannelSession;->ttype:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/jcraft/jsch/RequestPtyReq;->setTType(Ljava/lang/String;)V

    iget v2, p0, Lcom/jcraft/jsch/ChannelSession;->tcol:I

    iget v3, p0, Lcom/jcraft/jsch/ChannelSession;->trow:I

    iget v4, p0, Lcom/jcraft/jsch/ChannelSession;->twp:I

    iget v5, p0, Lcom/jcraft/jsch/ChannelSession;->thp:I

    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/jcraft/jsch/RequestPtyReq;->setTSize(IIII)V

    iget-object v2, p0, Lcom/jcraft/jsch/ChannelSession;->terminal_mode:[B

    if-eqz v2, :cond_2

    invoke-virtual {v1, v2}, Lcom/jcraft/jsch/RequestPtyReq;->setTerminalMode([B)V

    :cond_2
    invoke-virtual {v1, v0, p0}, Lcom/jcraft/jsch/RequestPtyReq;->request(Lcom/jcraft/jsch/Session;Lcom/jcraft/jsch/Channel;)V

    :cond_3
    iget-object v1, p0, Lcom/jcraft/jsch/ChannelSession;->env:Ljava/util/Hashtable;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/util/Hashtable;->keys()Ljava/util/Enumeration;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Enumeration;->hasMoreElements()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Lcom/jcraft/jsch/ChannelSession;->env:Ljava/util/Hashtable;

    invoke-virtual {v3, v2}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    new-instance v4, Lcom/jcraft/jsch/RequestEnv;

    invoke-direct {v4}, Lcom/jcraft/jsch/RequestEnv;-><init>()V

    invoke-direct {p0, v2}, Lcom/jcraft/jsch/ChannelSession;->toByteArray(Ljava/lang/Object;)[B

    move-result-object v2

    invoke-direct {p0, v3}, Lcom/jcraft/jsch/ChannelSession;->toByteArray(Ljava/lang/Object;)[B

    move-result-object v3

    invoke-virtual {v4, v2, v3}, Lcom/jcraft/jsch/RequestEnv;->setEnv([B[B)V

    invoke-virtual {v4, v0, p0}, Lcom/jcraft/jsch/RequestEnv;->request(Lcom/jcraft/jsch/Session;Lcom/jcraft/jsch/Channel;)V

    goto :goto_0

    :cond_4
    return-void
.end method

.method public setAgentForwarding(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/jcraft/jsch/ChannelSession;->agent_forwarding:Z

    return-void
.end method

.method public setEnv(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 4
    invoke-static {p1}, Lcom/jcraft/jsch/Util;->str2byte(Ljava/lang/String;)[B

    move-result-object p1

    invoke-static {p2}, Lcom/jcraft/jsch/Util;->str2byte(Ljava/lang/String;)[B

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/jcraft/jsch/ChannelSession;->setEnv([B[B)V

    return-void
.end method

.method public setEnv(Ljava/util/Hashtable;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-object p1, p0, Lcom/jcraft/jsch/ChannelSession;->env:Ljava/util/Hashtable;

    .line 3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public setEnv([B[B)V
    .locals 1

    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    invoke-direct {p0}, Lcom/jcraft/jsch/ChannelSession;->getEnv()Ljava/util/Hashtable;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public setPty(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/jcraft/jsch/ChannelSession;->pty:Z

    return-void
.end method

.method public setPtySize(IIII)V
    .locals 6

    iget-object v1, p0, Lcom/jcraft/jsch/ChannelSession;->ttype:Ljava/lang/String;

    move-object v0, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Lcom/jcraft/jsch/ChannelSession;->setPtyType(Ljava/lang/String;IIII)V

    iget-boolean v0, p0, Lcom/jcraft/jsch/ChannelSession;->pty:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/jcraft/jsch/Channel;->isConnected()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    new-instance v0, Lcom/jcraft/jsch/RequestWindowChange;

    invoke-direct {v0}, Lcom/jcraft/jsch/RequestWindowChange;-><init>()V

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/jcraft/jsch/RequestWindowChange;->setSize(IIII)V

    invoke-virtual {p0}, Lcom/jcraft/jsch/Channel;->getSession()Lcom/jcraft/jsch/Session;

    move-result-object p1

    invoke-virtual {v0, p1, p0}, Lcom/jcraft/jsch/RequestWindowChange;->request(Lcom/jcraft/jsch/Session;Lcom/jcraft/jsch/Channel;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    :goto_0
    return-void
.end method

.method public setPtyType(Ljava/lang/String;)V
    .locals 6

    const/16 v4, 0x280

    const/16 v5, 0x1e0

    const/16 v2, 0x50

    const/16 v3, 0x18

    move-object v0, p0

    move-object v1, p1

    .line 1
    invoke-virtual/range {v0 .. v5}, Lcom/jcraft/jsch/ChannelSession;->setPtyType(Ljava/lang/String;IIII)V

    return-void
.end method

.method public setPtyType(Ljava/lang/String;IIII)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/jcraft/jsch/ChannelSession;->ttype:Ljava/lang/String;

    .line 3
    iput p2, p0, Lcom/jcraft/jsch/ChannelSession;->tcol:I

    .line 4
    iput p3, p0, Lcom/jcraft/jsch/ChannelSession;->trow:I

    .line 5
    iput p4, p0, Lcom/jcraft/jsch/ChannelSession;->twp:I

    .line 6
    iput p5, p0, Lcom/jcraft/jsch/ChannelSession;->thp:I

    return-void
.end method

.method public setTerminalMode([B)V
    .locals 0

    iput-object p1, p0, Lcom/jcraft/jsch/ChannelSession;->terminal_mode:[B

    return-void
.end method

.method public setXForwarding(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/jcraft/jsch/ChannelSession;->xforwading:Z

    return-void
.end method
