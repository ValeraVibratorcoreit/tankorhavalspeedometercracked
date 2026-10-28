.class public final LGn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Ldg;


# instance fields
.field public final synthetic a:LFn;


# direct methods
.method public constructor <init>(LU8;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LGn;->a:LFn;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    iget-object v0, p0, LGn;->a:LFn;

    invoke-interface {v0}, LFn;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
