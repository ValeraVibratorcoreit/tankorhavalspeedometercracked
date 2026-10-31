.class Lcom/jcraft/jsch/UserAuthPassword;
.super Lcom/jcraft/jsch/UserAuth;
.source "SourceFile"


# instance fields
.field private final SSH_MSG_USERAUTH_PASSWD_CHANGEREQ:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/jcraft/jsch/UserAuth;-><init>()V

    const/16 v0, 0x3c

    iput v0, p0, Lcom/jcraft/jsch/UserAuthPassword;->SSH_MSG_USERAUTH_PASSWD_CHANGEREQ:I

    return-void
.end method


# virtual methods
.method public start(Lcom/jcraft/jsch/Session;)Z
    .locals 14

    const/4 v0, 0x1

    const/4 v1, 0x0

    const-string v2, "ssh-connection"

    invoke-super {p0, p1}, Lcom/jcraft/jsch/UserAuth;->start(Lcom/jcraft/jsch/Session;)Z

    iget-object v3, p1, Lcom/jcraft/jsch/Session;->password:[B

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/jcraft/jsch/UserAuth;->username:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "@"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p1, Lcom/jcraft/jsch/Session;->host:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iget v5, p1, Lcom/jcraft/jsch/Session;->port:I

    const/16 v6, 0x16

    if-eq v5, v6, :cond_0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ":"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p1, Lcom/jcraft/jsch/Session;->port:I

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    :cond_0
    move-object v10, v4

    :cond_1
    :goto_0
    :try_start_0
    iget v4, p1, Lcom/jcraft/jsch/Session;->auth_failures:I

    iget v5, p1, Lcom/jcraft/jsch/Session;->max_auth_tries:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lt v4, v5, :cond_3

    if-eqz v3, :cond_2

    invoke-static {v3}, Lcom/jcraft/jsch/Util;->bzero([B)V

    :cond_2
    return v1

    :cond_3
    const-string v11, "password"

    if-nez v3, :cond_8

    :try_start_1
    iget-object v4, p0, Lcom/jcraft/jsch/UserAuth;->userinfo:Lcom/jcraft/jsch/UserInfo;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v4, :cond_5

    if-eqz v3, :cond_4

    invoke-static {v3}, Lcom/jcraft/jsch/Util;->bzero([B)V

    :cond_4
    return v1

    :cond_5
    :try_start_2
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Password for "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Lcom/jcraft/jsch/UserInfo;->promptPassword(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_7

    iget-object v4, p0, Lcom/jcraft/jsch/UserAuth;->userinfo:Lcom/jcraft/jsch/UserInfo;

    invoke-interface {v4}, Lcom/jcraft/jsch/UserInfo;->getPassword()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_6

    invoke-static {v4}, Lcom/jcraft/jsch/Util;->str2byte(Ljava/lang/String;)[B

    move-result-object v3

    goto :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :cond_6
    new-instance p1, Lcom/jcraft/jsch/JSchAuthCancelException;

    invoke-direct {p1, v11}, Lcom/jcraft/jsch/JSchAuthCancelException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance p1, Lcom/jcraft/jsch/JSchAuthCancelException;

    invoke-direct {p1, v11}, Lcom/jcraft/jsch/JSchAuthCancelException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    :goto_1
    iget-object v4, p0, Lcom/jcraft/jsch/UserAuth;->username:Ljava/lang/String;

    invoke-static {v4}, Lcom/jcraft/jsch/Util;->str2byte(Ljava/lang/String;)[B

    move-result-object v12

    iget-object v4, p0, Lcom/jcraft/jsch/UserAuth;->packet:Lcom/jcraft/jsch/Packet;

    invoke-virtual {v4}, Lcom/jcraft/jsch/Packet;->reset()V

    iget-object v4, p0, Lcom/jcraft/jsch/UserAuth;->buf:Lcom/jcraft/jsch/Buffer;

    const/16 v13, 0x32

    invoke-virtual {v4, v13}, Lcom/jcraft/jsch/Buffer;->putByte(B)V

    iget-object v4, p0, Lcom/jcraft/jsch/UserAuth;->buf:Lcom/jcraft/jsch/Buffer;

    invoke-virtual {v4, v12}, Lcom/jcraft/jsch/Buffer;->putString([B)V

    iget-object v4, p0, Lcom/jcraft/jsch/UserAuth;->buf:Lcom/jcraft/jsch/Buffer;

    invoke-static {v2}, Lcom/jcraft/jsch/Util;->str2byte(Ljava/lang/String;)[B

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/jcraft/jsch/Buffer;->putString([B)V

    iget-object v4, p0, Lcom/jcraft/jsch/UserAuth;->buf:Lcom/jcraft/jsch/Buffer;

    invoke-static {v11}, Lcom/jcraft/jsch/Util;->str2byte(Ljava/lang/String;)[B

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/jcraft/jsch/Buffer;->putString([B)V

    iget-object v4, p0, Lcom/jcraft/jsch/UserAuth;->buf:Lcom/jcraft/jsch/Buffer;

    invoke-virtual {v4, v1}, Lcom/jcraft/jsch/Buffer;->putByte(B)V

    iget-object v4, p0, Lcom/jcraft/jsch/UserAuth;->buf:Lcom/jcraft/jsch/Buffer;

    invoke-virtual {v4, v3}, Lcom/jcraft/jsch/Buffer;->putString([B)V

    iget-object v4, p0, Lcom/jcraft/jsch/UserAuth;->packet:Lcom/jcraft/jsch/Packet;

    invoke-virtual {p1, v4}, Lcom/jcraft/jsch/Session;->write(Lcom/jcraft/jsch/Packet;)V

    :cond_9
    :goto_2
    iget-object v4, p0, Lcom/jcraft/jsch/UserAuth;->buf:Lcom/jcraft/jsch/Buffer;

    invoke-virtual {p1, v4}, Lcom/jcraft/jsch/Session;->read(Lcom/jcraft/jsch/Buffer;)Lcom/jcraft/jsch/Buffer;

    move-result-object v4

    iput-object v4, p0, Lcom/jcraft/jsch/UserAuth;->buf:Lcom/jcraft/jsch/Buffer;

    invoke-virtual {v4}, Lcom/jcraft/jsch/Buffer;->getCommand()B

    move-result v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    and-int/lit16 v4, v4, 0xff

    const/16 v5, 0x34

    if-ne v4, v5, :cond_b

    if-eqz v3, :cond_a

    invoke-static {v3}, Lcom/jcraft/jsch/Util;->bzero([B)V

    :cond_a
    return v0

    :cond_b
    const/16 v5, 0x35

    if-ne v4, v5, :cond_c

    :try_start_3
    iget-object v4, p0, Lcom/jcraft/jsch/UserAuth;->buf:Lcom/jcraft/jsch/Buffer;

    invoke-virtual {v4}, Lcom/jcraft/jsch/Buffer;->getInt()I

    iget-object v4, p0, Lcom/jcraft/jsch/UserAuth;->buf:Lcom/jcraft/jsch/Buffer;

    invoke-virtual {v4}, Lcom/jcraft/jsch/Buffer;->getByte()I

    iget-object v4, p0, Lcom/jcraft/jsch/UserAuth;->buf:Lcom/jcraft/jsch/Buffer;

    invoke-virtual {v4}, Lcom/jcraft/jsch/Buffer;->getByte()I

    iget-object v4, p0, Lcom/jcraft/jsch/UserAuth;->buf:Lcom/jcraft/jsch/Buffer;

    invoke-virtual {v4}, Lcom/jcraft/jsch/Buffer;->getString()[B

    move-result-object v4

    iget-object v5, p0, Lcom/jcraft/jsch/UserAuth;->buf:Lcom/jcraft/jsch/Buffer;

    invoke-virtual {v5}, Lcom/jcraft/jsch/Buffer;->getString()[B

    invoke-static {v4}, Lcom/jcraft/jsch/Util;->byte2str([B)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/jcraft/jsch/UserAuth;->userinfo:Lcom/jcraft/jsch/UserInfo;

    if-eqz v5, :cond_9

    invoke-interface {v5, v4}, Lcom/jcraft/jsch/UserInfo;->showMessage(Ljava/lang/String;)V

    goto :goto_2

    :cond_c
    const/16 v5, 0x3c

    if-ne v4, v5, :cond_12

    iget-object v4, p0, Lcom/jcraft/jsch/UserAuth;->buf:Lcom/jcraft/jsch/Buffer;

    invoke-virtual {v4}, Lcom/jcraft/jsch/Buffer;->getInt()I

    iget-object v4, p0, Lcom/jcraft/jsch/UserAuth;->buf:Lcom/jcraft/jsch/Buffer;

    invoke-virtual {v4}, Lcom/jcraft/jsch/Buffer;->getByte()I

    iget-object v4, p0, Lcom/jcraft/jsch/UserAuth;->buf:Lcom/jcraft/jsch/Buffer;

    invoke-virtual {v4}, Lcom/jcraft/jsch/Buffer;->getByte()I

    iget-object v4, p0, Lcom/jcraft/jsch/UserAuth;->buf:Lcom/jcraft/jsch/Buffer;

    invoke-virtual {v4}, Lcom/jcraft/jsch/Buffer;->getString()[B

    move-result-object v4

    iget-object v5, p0, Lcom/jcraft/jsch/UserAuth;->buf:Lcom/jcraft/jsch/Buffer;

    invoke-virtual {v5}, Lcom/jcraft/jsch/Buffer;->getString()[B

    iget-object v5, p0, Lcom/jcraft/jsch/UserAuth;->userinfo:Lcom/jcraft/jsch/UserInfo;

    if-eqz v5, :cond_f

    instance-of v6, v5, Lcom/jcraft/jsch/UIKeyboardInteractive;

    if-nez v6, :cond_d

    goto :goto_3

    :cond_d
    check-cast v5, Lcom/jcraft/jsch/UIKeyboardInteractive;

    const-string v6, "Password Change Required"

    const-string v7, "New Password: "

    filled-new-array {v7}, [Ljava/lang/String;

    move-result-object v8

    new-array v9, v0, [Z

    aput-boolean v1, v9, v1

    invoke-static {v4}, Lcom/jcraft/jsch/Util;->byte2str([B)Ljava/lang/String;

    move-result-object v7

    move-object v4, v5

    move-object v5, v10

    invoke-interface/range {v4 .. v9}, Lcom/jcraft/jsch/UIKeyboardInteractive;->promptKeyboardInteractive(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;[Z)[Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_e

    aget-object v4, v4, v1

    invoke-static {v4}, Lcom/jcraft/jsch/Util;->str2byte(Ljava/lang/String;)[B

    move-result-object v4

    iget-object v5, p0, Lcom/jcraft/jsch/UserAuth;->packet:Lcom/jcraft/jsch/Packet;

    invoke-virtual {v5}, Lcom/jcraft/jsch/Packet;->reset()V

    iget-object v5, p0, Lcom/jcraft/jsch/UserAuth;->buf:Lcom/jcraft/jsch/Buffer;

    invoke-virtual {v5, v13}, Lcom/jcraft/jsch/Buffer;->putByte(B)V

    iget-object v5, p0, Lcom/jcraft/jsch/UserAuth;->buf:Lcom/jcraft/jsch/Buffer;

    invoke-virtual {v5, v12}, Lcom/jcraft/jsch/Buffer;->putString([B)V

    iget-object v5, p0, Lcom/jcraft/jsch/UserAuth;->buf:Lcom/jcraft/jsch/Buffer;

    invoke-static {v2}, Lcom/jcraft/jsch/Util;->str2byte(Ljava/lang/String;)[B

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/jcraft/jsch/Buffer;->putString([B)V

    iget-object v5, p0, Lcom/jcraft/jsch/UserAuth;->buf:Lcom/jcraft/jsch/Buffer;

    invoke-static {v11}, Lcom/jcraft/jsch/Util;->str2byte(Ljava/lang/String;)[B

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/jcraft/jsch/Buffer;->putString([B)V

    iget-object v5, p0, Lcom/jcraft/jsch/UserAuth;->buf:Lcom/jcraft/jsch/Buffer;

    invoke-virtual {v5, v0}, Lcom/jcraft/jsch/Buffer;->putByte(B)V

    iget-object v5, p0, Lcom/jcraft/jsch/UserAuth;->buf:Lcom/jcraft/jsch/Buffer;

    invoke-virtual {v5, v3}, Lcom/jcraft/jsch/Buffer;->putString([B)V

    iget-object v5, p0, Lcom/jcraft/jsch/UserAuth;->buf:Lcom/jcraft/jsch/Buffer;

    invoke-virtual {v5, v4}, Lcom/jcraft/jsch/Buffer;->putString([B)V

    invoke-static {v4}, Lcom/jcraft/jsch/Util;->bzero([B)V

    iget-object v4, p0, Lcom/jcraft/jsch/UserAuth;->packet:Lcom/jcraft/jsch/Packet;

    invoke-virtual {p1, v4}, Lcom/jcraft/jsch/Session;->write(Lcom/jcraft/jsch/Packet;)V

    goto/16 :goto_2

    :cond_e
    new-instance p1, Lcom/jcraft/jsch/JSchAuthCancelException;

    invoke-direct {p1, v11}, Lcom/jcraft/jsch/JSchAuthCancelException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_f
    :goto_3
    if-eqz v5, :cond_10

    const-string p1, "Password must be changed."

    invoke-interface {v5, p1}, Lcom/jcraft/jsch/UserInfo;->showMessage(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :cond_10
    if-eqz v3, :cond_11

    invoke-static {v3}, Lcom/jcraft/jsch/Util;->bzero([B)V

    :cond_11
    return v1

    :cond_12
    const/16 v5, 0x33

    if-ne v4, v5, :cond_14

    :try_start_4
    iget-object v4, p0, Lcom/jcraft/jsch/UserAuth;->buf:Lcom/jcraft/jsch/Buffer;

    invoke-virtual {v4}, Lcom/jcraft/jsch/Buffer;->getInt()I

    iget-object v4, p0, Lcom/jcraft/jsch/UserAuth;->buf:Lcom/jcraft/jsch/Buffer;

    invoke-virtual {v4}, Lcom/jcraft/jsch/Buffer;->getByte()I

    iget-object v4, p0, Lcom/jcraft/jsch/UserAuth;->buf:Lcom/jcraft/jsch/Buffer;

    invoke-virtual {v4}, Lcom/jcraft/jsch/Buffer;->getByte()I

    iget-object v4, p0, Lcom/jcraft/jsch/UserAuth;->buf:Lcom/jcraft/jsch/Buffer;

    invoke-virtual {v4}, Lcom/jcraft/jsch/Buffer;->getString()[B

    move-result-object v4

    iget-object v5, p0, Lcom/jcraft/jsch/UserAuth;->buf:Lcom/jcraft/jsch/Buffer;

    invoke-virtual {v5}, Lcom/jcraft/jsch/Buffer;->getByte()I

    move-result v5

    if-nez v5, :cond_13

    iget v4, p1, Lcom/jcraft/jsch/Session;->auth_failures:I

    add-int/2addr v4, v0

    iput v4, p1, Lcom/jcraft/jsch/Session;->auth_failures:I

    if-eqz v3, :cond_1

    invoke-static {v3}, Lcom/jcraft/jsch/Util;->bzero([B)V

    const/4 v3, 0x0

    goto/16 :goto_0

    :cond_13
    new-instance p1, Lcom/jcraft/jsch/JSchPartialAuthException;

    invoke-static {v4}, Lcom/jcraft/jsch/Util;->byte2str([B)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/jcraft/jsch/JSchPartialAuthException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :cond_14
    if-eqz v3, :cond_15

    invoke-static {v3}, Lcom/jcraft/jsch/Util;->bzero([B)V

    :cond_15
    return v1

    :goto_4
    if-eqz v3, :cond_16

    invoke-static {v3}, Lcom/jcraft/jsch/Util;->bzero([B)V

    :cond_16
    throw p1
.end method
