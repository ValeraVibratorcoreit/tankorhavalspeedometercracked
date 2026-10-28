.class public final LGd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LFn;


# instance fields
.field public final a:Ldd;

.field public final b:Lod;


# direct methods
.method public constructor <init>(Lj;)V
    .locals 1

    sget-object v0, LC0;->b:LC0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, LGd;->a:Ldd;

    iput-object p1, p0, LGd;->b:Lod;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, LFd;

    invoke-direct {v0, p0}, LFd;-><init>(LGd;)V

    return-object v0
.end method
