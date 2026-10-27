.class public final LH4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR8;


# virtual methods
.method public final a(Ljavax/net/ssl/SSLSocket;)Z
    .locals 0

    sget-boolean p1, LG4;->d:Z

    invoke-static {}, LF4;->T()Z

    move-result p1

    const/4 p1, 0x0

    return p1
.end method

.method public final c(Ljavax/net/ssl/SSLSocket;)LTo;
    .locals 0

    new-instance p1, LI4;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    return-object p1
.end method
