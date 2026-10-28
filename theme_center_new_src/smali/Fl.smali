.class public final LFl;
.super Ljg;
.source "SourceFile"

# interfaces
.implements Ldd;


# instance fields
.field public final synthetic b:LD5;

.field public final synthetic c:Loe;

.field public final synthetic d:LI0;


# direct methods
.method public constructor <init>(LD5;Loe;LI0;)V
    .locals 0

    iput-object p1, p0, LFl;->b:LD5;

    iput-object p2, p0, LFl;->c:Loe;

    iput-object p3, p0, LFl;->d:LI0;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ljg;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, LFl;->b:LD5;

    iget-object v0, v0, LD5;->b:Lmk;

    invoke-static {v0}, LTf;->f(Ljava/lang/Object;)V

    iget-object v1, p0, LFl;->c:Loe;

    invoke-virtual {v1}, Loe;->a()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, LFl;->d:LI0;

    iget-object v2, v2, LI0;->a:Lgf;

    iget-object v2, v2, Lgf;->e:Ljava/lang/String;

    invoke-virtual {v0, v2, v1}, Lmk;->g(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
