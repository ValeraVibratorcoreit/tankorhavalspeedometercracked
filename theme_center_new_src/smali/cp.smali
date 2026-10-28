.class public final Lcp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ldp;

.field public final synthetic c:LO8;


# direct methods
.method public synthetic constructor <init>(LO8;Ldp;I)V
    .locals 0

    iput p3, p0, Lcp;->a:I

    iput-object p1, p0, Lcp;->c:LO8;

    iput-object p2, p0, Lcp;->b:Ldp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, Lcp;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcp;->c:LO8;

    iget-object v1, v0, LO8;->b:Ljava/util/ArrayList;

    iget-object v2, p0, Lcp;->b:Ldp;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v0, v0, LO8;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void

    :pswitch_0
    iget-object v0, p0, Lcp;->c:LO8;

    iget-object v0, v0, LO8;->b:Ljava/util/ArrayList;

    iget-object v1, p0, Lcp;->b:Ldp;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, v1, Ldp;->a:I

    iget-object v1, v1, Ldp;->c:Lzc;

    iget-object v1, v1, Lzc;->E:Landroid/view/View;

    invoke-static {v1, v0}, LVo;->a(Landroid/view/View;I)V

    :cond_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
