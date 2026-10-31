.class public final LJo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:LKo;


# direct methods
.method public constructor <init>(LKo;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LJo;->b:LKo;

    iput-boolean p2, p0, LJo;->a:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LJo;->b:LKo;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, LQr;->a()V

    iget-object v0, v0, LKo;->a:Lo9;

    iget-boolean v1, v0, Lo9;->a:Z

    iget-boolean v2, p0, LJo;->a:Z

    iput-boolean v2, v0, Lo9;->a:Z

    if-eq v1, v2, :cond_0

    iget-object v0, v0, Lo9;->b:Ljava/lang/Object;

    check-cast v0, LZ6;

    invoke-interface {v0, v2}, LZ6;->a(Z)V

    :cond_0
    return-void
.end method
