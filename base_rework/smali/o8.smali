.class public final Lo8;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Z

.field public c:Z


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, Lo8;->c:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lo8;->b:Z

    if-eqz v0, :cond_1

    :cond_0
    iget-boolean v0, p0, Lo8;->a:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
