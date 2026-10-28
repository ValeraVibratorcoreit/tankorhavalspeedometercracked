.class public Lipc/fdbus/FdbusParcelable;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lipc/fdbus/FdbusParcelable$TextFormatter;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public deserialize(Lipc/fdbus/FdbusDeserializer;)V
    .locals 0

    return-void
.end method

.method public serialize(Lipc/fdbus/FdbusSerializer;)V
    .locals 0

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 2
    new-instance v0, Lipc/fdbus/FdbusParcelable$TextFormatter;

    invoke-direct {v0}, Lipc/fdbus/FdbusParcelable$TextFormatter;-><init>()V

    .line 3
    invoke-virtual {v0, p0}, Lipc/fdbus/FdbusParcelable$TextFormatter;->format(Ljava/lang/Object;)V

    .line 4
    invoke-virtual {v0}, Lipc/fdbus/FdbusParcelable$TextFormatter;->stream()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString(Lipc/fdbus/FdbusParcelable$TextFormatter;)V
    .locals 1

    .line 1
    const-string v0, "null"

    invoke-virtual {p1, v0}, Lipc/fdbus/FdbusParcelable$TextFormatter;->format(Ljava/lang/Object;)V

    return-void
.end method
