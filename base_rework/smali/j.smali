.class public final Lj;
.super Ljg;
.source "SourceFile"

# interfaces
.implements Lod;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lj;->b:I

    sget-object v0, LC0;->b:LC0;

    .line 1
    iput-object v0, p0, Lj;->c:Ljava/lang/Object;

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ljg;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ln;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lj;->b:I

    .line 2
    iput-object p1, p0, Lj;->c:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ljg;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lj;->b:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "it"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object p1, p0, Lj;->c:Ljava/lang/Object;

    check-cast p1, Ldd;

    invoke-interface {p1}, Ldd;->a()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lj;->c:Ljava/lang/Object;

    check-cast v0, Ln;

    if-ne p1, v0, :cond_0

    const-string p1, "(this Collection)"

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
