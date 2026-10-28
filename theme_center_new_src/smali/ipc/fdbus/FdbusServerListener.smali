.class public interface abstract Lipc/fdbus/FdbusServerListener;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract onInvoke(Lipc/fdbus/FdbusMessage;)V
.end method

.method public abstract onOffline(IZ)V
.end method

.method public abstract onOnline(IZ)V
.end method

.method public abstract onSubscribe(Lipc/fdbus/FdbusMessage;Ljava/util/ArrayList;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lipc/fdbus/FdbusMessage;",
            "Ljava/util/ArrayList<",
            "Lipc/fdbus/SubscribeItem;",
            ">;)V"
        }
    .end annotation
.end method
