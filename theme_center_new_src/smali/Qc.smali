.class public final LQc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQs;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, LQc;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Class;)LOs;
    .locals 1

    iget p1, p0, LQc;->a:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lhh;

    invoke-direct {p1}, Lhh;-><init>()V

    return-object p1

    :pswitch_0
    new-instance p1, LRc;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, LRc;-><init>(Z)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
