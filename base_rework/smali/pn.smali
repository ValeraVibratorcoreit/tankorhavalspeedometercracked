.class public final Lpn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LIb;


# instance fields
.field public final a:Ljava/security/MessageDigest;

.field public final b:Lwp;


# direct methods
.method public constructor <init>(Ljava/security/MessageDigest;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lwp;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lpn;->b:Lwp;

    iput-object p1, p0, Lpn;->a:Ljava/security/MessageDigest;

    return-void
.end method


# virtual methods
.method public final b()Lwp;
    .locals 1

    iget-object v0, p0, Lpn;->b:Lwp;

    return-object v0
.end method
