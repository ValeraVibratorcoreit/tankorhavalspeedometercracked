.class public final Lmn;
.super Lnn;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public a:Lln;

.field public b:Z

.field public final synthetic c:Lon;


# direct methods
.method public constructor <init>(Lon;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmn;->c:Lon;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lmn;->b:Z

    return-void
.end method


# virtual methods
.method public final a(Lln;)V
    .locals 1

    iget-object v0, p0, Lmn;->a:Lln;

    if-ne p1, v0, :cond_1

    iget-object p1, v0, Lln;->d:Lln;

    iput-object p1, p0, Lmn;->a:Lln;

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lmn;->b:Z

    :cond_1
    return-void
.end method

.method public final hasNext()Z
    .locals 3

    iget-boolean v0, p0, Lmn;->b:Z

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    iget-object v0, p0, Lmn;->c:Lon;

    iget-object v0, v0, Lon;->a:Lln;

    if-eqz v0, :cond_0

    move v1, v2

    :cond_0
    return v1

    :cond_1
    iget-object v0, p0, Lmn;->a:Lln;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lln;->c:Lln;

    if-eqz v0, :cond_2

    move v1, v2

    :cond_2
    return v1
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    iget-boolean v0, p0, Lmn;->b:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lmn;->b:Z

    iget-object v0, p0, Lmn;->c:Lon;

    iget-object v0, v0, Lon;->a:Lln;

    iput-object v0, p0, Lmn;->a:Lln;

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lmn;->a:Lln;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lln;->c:Lln;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lmn;->a:Lln;

    :goto_1
    iget-object v0, p0, Lmn;->a:Lln;

    return-object v0
.end method
