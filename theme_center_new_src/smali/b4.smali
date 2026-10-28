.class public final synthetic Lb4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVn;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:LWn;

.field public final synthetic d:LVn;


# direct methods
.method public synthetic constructor <init>(IILWn;LVn;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lb4;->a:I

    iput p2, p0, Lb4;->b:I

    iput-object p3, p0, Lb4;->c:LWn;

    iput-object p4, p0, Lb4;->d:LVn;

    return-void
.end method


# virtual methods
.method public final c(Z)V
    .locals 2

    iget v0, p0, Lb4;->a:I

    if-eqz v0, :cond_1

    iget v1, p0, Lb4;->b:I

    if-eqz v1, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-object v1, p0, Lb4;->c:LWn;

    invoke-virtual {v1, v0}, LSn;->setSubtitle(I)V

    :cond_1
    iget-object v0, p0, Lb4;->d:LVn;

    if-eqz v0, :cond_2

    invoke-interface {v0, p1}, LVn;->c(Z)V

    :cond_2
    return-void
.end method
