.class public final Lta;
.super LUd;
.source "SourceFile"


# instance fields
.field public final synthetic h:Lua;


# direct methods
.method public constructor <init>(Lua;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lta;->h:Lua;

    return-void
.end method


# virtual methods
.method public final X(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lta;->h:Lua;

    iget-object v0, v0, Lua;->a:Lza;

    invoke-virtual {v0, p1}, Lza;->d(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final Y(Ljj;)V
    .locals 6

    iget-object v0, p0, Lta;->h:Lua;

    iput-object p1, v0, Lua;->c:Ljj;

    new-instance p1, LK2;

    iget-object v1, v0, Lua;->c:Ljj;

    iget-object v2, v0, Lua;->a:Lza;

    iget-object v3, v2, Lza;->g:Lh8;

    iget-object v2, v2, Lza;->i:Lu8;

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x22

    if-lt v4, v5, :cond_0

    invoke-static {}, LEa;->a()Ljava/util/Set;

    move-result-object v4

    goto :goto_0

    :cond_0
    invoke-static {}, LTf;->B()Ljava/util/Set;

    move-result-object v4

    :goto_0
    invoke-direct {p1, v1, v3, v2, v4}, LK2;-><init>(Ljj;Lh8;Lwa;Ljava/util/Set;)V

    iput-object p1, v0, Lua;->b:LK2;

    iget-object p1, v0, Lua;->a:Lza;

    invoke-virtual {p1}, Lza;->e()V

    return-void
.end method
