.class public final synthetic LE0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, LE0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget v0, p0, LE0;->a:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x1

    invoke-static {v0}, LUd;->p0(Z)V

    return-void

    :pswitch_0
    const/4 v0, 0x0

    invoke-static {v0}, LUd;->p0(Z)V

    invoke-static {}, LUd;->e0()V

    return-void

    :pswitch_1
    invoke-static {}, LUd;->o0()V

    return-void

    :pswitch_2
    invoke-static {}, LUd;->m0()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
