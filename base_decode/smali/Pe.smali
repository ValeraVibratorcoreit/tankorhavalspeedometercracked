.class public final LPe;
.super Liq;
.source "SourceFile"


# instance fields
.field public final synthetic e:I

.field public final synthetic f:LTe;

.field public final synthetic g:I

.field public final synthetic h:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;LTe;ILjava/util/List;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LPe;->e:I

    iput-object p2, p0, LPe;->f:LTe;

    iput p3, p0, LPe;->g:I

    iput-object p4, p0, LPe;->h:Ljava/util/List;

    const/4 p2, 0x1

    .line 1
    invoke-direct {p0, p1, p2}, Liq;-><init>(Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LTe;ILjava/util/List;Z)V
    .locals 0

    const/4 p5, 0x0

    iput p5, p0, LPe;->e:I

    iput-object p2, p0, LPe;->f:LTe;

    iput p3, p0, LPe;->g:I

    iput-object p4, p0, LPe;->h:Ljava/util/List;

    const/4 p2, 0x1

    .line 2
    invoke-direct {p0, p1, p2}, Liq;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 3

    iget v0, p0, LPe;->e:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LPe;->f:LTe;

    iget-object v0, v0, LTe;->l:Lpa;

    iget-object v1, p0, LPe;->h:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "requestHeaders"

    invoke-static {v0, v1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    :try_start_0
    iget-object v0, p0, LPe;->f:LTe;

    iget-object v0, v0, LTe;->y:Lbf;

    iget v1, p0, LPe;->g:I

    const/16 v2, 0x9

    invoke-virtual {v0, v1, v2}, Lbf;->A(II)V

    iget-object v0, p0, LPe;->f:LTe;

    monitor-enter v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v1, p0, LPe;->f:LTe;

    iget-object v1, v1, LTe;->A:Ljava/util/LinkedHashSet;

    iget v2, p0, LPe;->g:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :goto_0
    const-wide/16 v0, -0x1

    return-wide v0

    :pswitch_0
    iget-object v0, p0, LPe;->f:LTe;

    iget-object v0, v0, LTe;->l:Lpa;

    iget-object v1, p0, LPe;->h:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "responseHeaders"

    invoke-static {v0, v1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    :try_start_3
    iget-object v0, p0, LPe;->f:LTe;

    iget-object v0, v0, LTe;->y:Lbf;

    iget v1, p0, LPe;->g:I

    const/16 v2, 0x9

    invoke-virtual {v0, v1, v2}, Lbf;->A(II)V

    iget-object v0, p0, LPe;->f:LTe;

    monitor-enter v0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    :try_start_4
    iget-object v1, p0, LPe;->f:LTe;

    iget-object v1, v1, LTe;->A:Ljava/util/LinkedHashSet;

    iget v2, p0, LPe;->g:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    monitor-exit v0

    goto :goto_1

    :catchall_1
    move-exception v1

    monitor-exit v0

    throw v1
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    :catch_1
    :goto_1
    const-wide/16 v0, -0x1

    return-wide v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
