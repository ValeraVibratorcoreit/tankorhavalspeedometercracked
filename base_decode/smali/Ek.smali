.class public abstract LEk;
.super Lzc;
.source "SourceFile"


# instance fields
.field public final T:Ljava/util/LinkedHashSet;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lzc;-><init>()V

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, LEk;->T:Ljava/util/LinkedHashSet;

    return-void
.end method
