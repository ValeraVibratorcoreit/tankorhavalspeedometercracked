.class public final Lp1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldk;


# instance fields
.field public final synthetic a:Lq1;


# direct methods
.method public constructor <init>(Lq1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1;->a:Lq1;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)V
    .locals 2

    iget-object p1, p0, Lp1;->a:Lq1;

    invoke-virtual {p1}, Lq1;->t()LE1;

    move-result-object v0

    invoke-virtual {v0}, LE1;->a()V

    iget-object p1, p1, LP6;->d:LLo;

    iget-object p1, p1, LLo;->d:Ljava/lang/Object;

    check-cast p1, Lx1;

    const-string v1, "androidx:appcompat"

    invoke-virtual {p1, v1}, Lx1;->c(Ljava/lang/String;)Landroid/os/Bundle;

    invoke-virtual {v0}, LE1;->d()V

    return-void
.end method
