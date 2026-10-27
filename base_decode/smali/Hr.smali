.class public final LHr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LXi;


# static fields
.field public static final b:LHr;


# instance fields
.field public final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LHr;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LHr;-><init>(I)V

    sput-object v0, LHr;->b:LHr;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, LHr;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Z
    .locals 1

    iget v0, p0, LHr;->a:I

    packed-switch v0, :pswitch_data_0

    const/4 p1, 0x0

    return p1

    :pswitch_0
    check-cast p1, Ljava/io/File;

    const/4 p1, 0x1

    return p1

    :pswitch_1
    const/4 p1, 0x1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljava/lang/Object;IILrk;)LWi;
    .locals 1

    iget p2, p0, LHr;->a:I

    packed-switch p2, :pswitch_data_0

    const/4 p1, 0x0

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/io/File;

    new-instance p2, LWi;

    new-instance p3, LLj;

    invoke-direct {p3, p1}, LLj;-><init>(Ljava/lang/Object;)V

    new-instance p4, LW4;

    const/4 v0, 0x0

    invoke-direct {p4, p1, v0}, LW4;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p2, p3, p4}, LWi;-><init>(Lfg;La8;)V

    return-object p2

    :pswitch_1
    new-instance p2, LWi;

    new-instance p3, LLj;

    invoke-direct {p3, p1}, LLj;-><init>(Ljava/lang/Object;)V

    new-instance p4, LW4;

    const/4 v0, 0x1

    invoke-direct {p4, p1, v0}, LW4;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p2, p3, p4}, LWi;-><init>(Lfg;La8;)V

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
