.class public final Lth;
.super LY3;
.source "SourceFile"


# instance fields
.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lth;->b:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LY3;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()LMk;
    .locals 1

    iget v0, p0, Lth;->b:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, LOo;

    invoke-direct {v0, p0}, LOo;-><init>(Lth;)V

    return-object v0

    :pswitch_0
    new-instance v0, Lsh;

    invoke-direct {v0, p0}, Lsh;-><init>(Lth;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
