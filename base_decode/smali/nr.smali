.class public final Lnr;
.super Lmr;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lc3;

.field public final synthetic b:Lor;


# direct methods
.method public constructor <init>(Lor;Lc3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnr;->b:Lor;

    iput-object p2, p0, Lnr;->a:Lc3;

    return-void
.end method


# virtual methods
.method public final f(Llr;)V
    .locals 3

    iget-object v0, p0, Lnr;->b:Lor;

    iget-object v0, v0, Lor;->b:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    iget-object v2, p0, Lnr;->a:Lc3;

    invoke-virtual {v2, v0, v1}, LFo;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p1, p0}, Llr;->x(Lkr;)Llr;

    return-void
.end method
