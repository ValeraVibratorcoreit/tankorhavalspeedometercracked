.class public final LXk;
.super LQa;
.source "SourceFile"


# instance fields
.field final synthetic this$0:LZk;


# direct methods
.method public constructor <init>(LZk;)V
    .locals 0

    iput-object p1, p0, LXk;->this$0:LZk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onActivityPostResumed(Landroid/app/Activity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object p1, p0, LXk;->this$0:LZk;

    invoke-virtual {p1}, LZk;->a()V

    return-void
.end method

.method public onActivityPostStarted(Landroid/app/Activity;)V
    .locals 2

    const-string v0, "activity"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object p1, p0, LXk;->this$0:LZk;

    iget v0, p1, LZk;->a:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p1, LZk;->a:I

    if-ne v0, v1, :cond_0

    iget-boolean v0, p1, LZk;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p1, LZk;->f:LFg;

    sget-object v1, Ltg;->ON_START:Ltg;

    invoke-virtual {v0, v1}, LFg;->e(Ltg;)V

    const/4 v0, 0x0

    iput-boolean v0, p1, LZk;->d:Z

    :cond_0
    return-void
.end method
