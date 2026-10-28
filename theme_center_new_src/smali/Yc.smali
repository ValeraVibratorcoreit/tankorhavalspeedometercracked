.class public abstract LYc;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LXc;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, LXc;->a:LXc;

    sput-object v0, LYc;->a:LXc;

    return-void
.end method

.method public static a(Lzc;)LXc;
    .locals 1

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lzc;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lzc;->j()LOc;

    :cond_0
    iget-object p0, p0, Lzc;->u:Lzc;

    goto :goto_0

    :cond_1
    sget-object p0, LYc;->a:LXc;

    return-object p0
.end method

.method public static b(LTc;)V
    .locals 3

    const/4 v0, 0x3

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LTc;->a:Lzc;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v2, "StrictMode violation in "

    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    return-void
.end method

.method public static final c(Lzc;Ljava/lang/String;)V
    .locals 3

    const-string v0, "fragment"

    invoke-static {v0, p0}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "previousFragmentId"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v0, LTc;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Attempting to reuse fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " with previous ID "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p0, p1}, LTc;-><init>(Lzc;Ljava/lang/String;)V

    invoke-static {v0}, LYc;->b(LTc;)V

    invoke-static {p0}, LYc;->a(Lzc;)LXc;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
