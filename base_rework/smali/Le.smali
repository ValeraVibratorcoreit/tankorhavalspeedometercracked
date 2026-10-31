.class public final LLe;
.super Liq;
.source "SourceFile"


# instance fields
.field public final synthetic e:I

.field public final synthetic f:LNe;

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/String;LNe;Lom;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LLe;->e:I

    iput-object p2, p0, LLe;->f:LNe;

    iput-object p3, p0, LLe;->g:Ljava/lang/Object;

    const/4 p2, 0x1

    .line 1
    invoke-direct {p0, p1, p2}, Liq;-><init>(Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Laf;LNe;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LLe;->e:I

    iput-object p2, p0, LLe;->g:Ljava/lang/Object;

    iput-object p3, p0, LLe;->f:LNe;

    const/4 p2, 0x1

    .line 2
    invoke-direct {p0, p1, p2}, Liq;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 6

    const-wide/16 v0, -0x1

    iget v2, p0, LLe;->e:I

    packed-switch v2, :pswitch_data_0

    :try_start_0
    iget-object v2, p0, LLe;->f:LNe;

    iget-object v2, v2, LNe;->b:LTe;

    iget-object v2, v2, LTe;->b:LKe;

    iget-object v3, p0, LLe;->g:Ljava/lang/Object;

    check-cast v3, Laf;

    invoke-virtual {v2, v3}, LKe;->b(Laf;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    sget-object v3, LGk;->a:LGk;

    sget-object v3, LGk;->a:LGk;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Http2Connection.Listener failure for "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, LLe;->f:LNe;

    iget-object v5, v5, LNe;->b:LTe;

    iget-object v5, v5, LTe;->d:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x4

    invoke-static {v3, v4, v2}, LGk;->i(ILjava/lang/String;Ljava/lang/Throwable;)V

    :try_start_1
    iget-object v3, p0, LLe;->g:Ljava/lang/Object;

    check-cast v3, Laf;

    const/4 v4, 0x2

    invoke-virtual {v3, v4, v2}, Laf;->c(ILjava/io/IOException;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :goto_0
    return-wide v0

    :pswitch_0
    iget-object v2, p0, LLe;->f:LNe;

    iget-object v2, v2, LNe;->b:LTe;

    iget-object v3, v2, LTe;->b:LKe;

    iget-object v4, p0, LLe;->g:Ljava/lang/Object;

    check-cast v4, Lom;

    iget-object v4, v4, Lom;->b:Ljava/lang/Object;

    check-cast v4, Lco;

    invoke-virtual {v3, v2, v4}, LKe;->a(LTe;Lco;)V

    return-wide v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
