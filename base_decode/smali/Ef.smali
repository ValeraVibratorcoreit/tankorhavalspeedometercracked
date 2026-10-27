.class public final LEf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld8;


# instance fields
.field public final a:Luh;


# direct methods
.method public constructor <init>(Luh;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LEf;->a:Luh;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Class;
    .locals 1

    const-class v0, Ljava/io/InputStream;

    return-object v0
.end method

.method public final b(Ljava/lang/Object;)Le8;
    .locals 2

    check-cast p1, Ljava/io/InputStream;

    new-instance v0, Lk0;

    iget-object v1, p0, LEf;->a:Luh;

    invoke-direct {v0, p1, v1}, Lk0;-><init>(Ljava/io/InputStream;Luh;)V

    return-object v0
.end method
