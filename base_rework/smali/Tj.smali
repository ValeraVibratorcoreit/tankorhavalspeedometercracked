.class public final LTj;
.super Ljg;
.source "SourceFile"

# interfaces
.implements Ldd;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lak;


# direct methods
.method public synthetic constructor <init>(Lak;I)V
    .locals 0

    iput p2, p0, LTj;->b:I

    iput-object p1, p0, LTj;->c:Lak;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ljg;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    iget v0, p0, LTj;->b:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LTj;->c:Lak;

    invoke-virtual {v0}, Lak;->b()V

    sget-object v0, Lpa;->m:Lpa;

    return-object v0

    :pswitch_0
    iget-object v0, p0, LTj;->c:Lak;

    invoke-virtual {v0}, Lak;->a()V

    sget-object v0, Lpa;->m:Lpa;

    return-object v0

    :pswitch_1
    iget-object v0, p0, LTj;->c:Lak;

    invoke-virtual {v0}, Lak;->b()V

    sget-object v0, Lpa;->m:Lpa;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
