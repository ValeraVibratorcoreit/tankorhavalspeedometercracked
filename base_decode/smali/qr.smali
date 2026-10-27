.class public final Lqr;
.super Lmr;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:Llr;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lqr;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Llr;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lqr;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lqr;->b:Llr;

    return-void
.end method


# virtual methods
.method public b(Llr;)V
    .locals 1

    iget p1, p0, Lqr;->a:I

    packed-switch p1, :pswitch_data_0

    return-void

    :pswitch_0
    iget-object p1, p0, Lqr;->b:Llr;

    check-cast p1, Lp3;

    iget-boolean v0, p1, Lp3;->D:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Llr;->G()V

    const/4 v0, 0x1

    iput-boolean v0, p1, Lp3;->D:Z

    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Llr;)V
    .locals 2

    iget v0, p0, Lqr;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lqr;->b:Llr;

    check-cast v0, Lp3;

    iget v1, v0, Lp3;->C:I

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, Lp3;->C:I

    if-nez v1, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lp3;->D:Z

    invoke-virtual {v0}, Llr;->m()V

    :cond_0
    invoke-virtual {p1, p0}, Llr;->x(Lkr;)Llr;

    return-void

    :pswitch_0
    iget-object v0, p0, Lqr;->b:Llr;

    invoke-virtual {v0}, Llr;->z()V

    invoke-virtual {p1, p0}, Llr;->x(Lkr;)Llr;

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
