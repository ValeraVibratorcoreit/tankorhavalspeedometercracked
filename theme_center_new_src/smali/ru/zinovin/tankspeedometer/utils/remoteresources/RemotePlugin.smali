.class public interface abstract Lru/zinovin/tankspeedometer/utils/remoteresources/RemotePlugin;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public varargs abstract execute(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation
.end method

.method public abstract getName()Ljava/lang/String;
.end method

.method public abstract getVersion()Ljava/lang/String;
.end method

.method public abstract initialize(Landroid/content/Context;)V
.end method
