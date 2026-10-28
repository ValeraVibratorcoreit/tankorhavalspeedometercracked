.class public final LHn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final a:LFg;

.field public final b:Ltg;

.field public c:Z


# direct methods
.method public constructor <init>(LFg;Ltg;)V
    .locals 1

    const-string v0, "registry"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "event"

    invoke-static {v0, p2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHn;->a:LFg;

    iput-object p2, p0, LHn;->b:Ltg;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-boolean v0, p0, LHn;->c:Z

    if-nez v0, :cond_0

    iget-object v0, p0, LHn;->a:LFg;

    iget-object v1, p0, LHn;->b:Ltg;

    invoke-virtual {v0, v1}, LFg;->e(Ltg;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, LHn;->c:Z

    :cond_0
    return-void
.end method
