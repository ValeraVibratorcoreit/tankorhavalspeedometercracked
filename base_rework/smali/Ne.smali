.class public final LNe;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldd;


# instance fields
.field public final a:LWe;

.field public final synthetic b:LTe;


# direct methods
.method public constructor <init>(LTe;LWe;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LNe;->b:LTe;

    iput-object p2, p0, LNe;->a:LWe;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, LNe;->b:LTe;

    iget-object v1, p0, LNe;->a:LWe;

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {v1, p0}, LWe;->w(LNe;)V

    :goto_0
    const/4 v3, 0x0

    invoke-virtual {v1, v3, p0}, LWe;->n(ZLNe;)Z

    move-result v3
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x1

    const/16 v4, 0x9

    invoke-virtual {v0, v3, v4, v2}, LTe;->n(IILjava/io/IOException;)V

    :goto_1
    invoke-static {v1}, LRr;->d(Ljava/io/Closeable;)V

    goto :goto_4

    :catchall_0
    move-exception v3

    goto :goto_2

    :catch_0
    move-exception v2

    goto :goto_3

    :goto_2
    const/4 v4, 0x3

    invoke-virtual {v0, v4, v4, v2}, LTe;->n(IILjava/io/IOException;)V

    invoke-static {v1}, LRr;->d(Ljava/io/Closeable;)V

    throw v3

    :goto_3
    const/4 v3, 0x2

    invoke-virtual {v0, v3, v3, v2}, LTe;->n(IILjava/io/IOException;)V

    goto :goto_1

    :goto_4
    sget-object v0, Lpa;->m:Lpa;

    return-object v0
.end method
