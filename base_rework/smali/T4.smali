.class public final LT4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LXi;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, LT4;->a:I

    iput-object p1, p0, LT4;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Z
    .locals 1

    iget v0, p0, LT4;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/io/File;

    const/4 p1, 0x1

    return p1

    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "data:image"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    return p1

    :pswitch_1
    check-cast p1, [B

    const/4 p1, 0x1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljava/lang/Object;IILrk;)LWi;
    .locals 2

    iget p2, p0, LT4;->a:I

    packed-switch p2, :pswitch_data_0

    check-cast p1, Ljava/io/File;

    new-instance p2, LWi;

    new-instance p3, LLj;

    invoke-direct {p3, p1}, LLj;-><init>(Ljava/lang/Object;)V

    new-instance p4, Lg8;

    iget-object v0, p0, LT4;->b:Ljava/lang/Object;

    check-cast v0, Lh8;

    const/4 v1, 0x1

    invoke-direct {p4, v1, p1, v0}, Lg8;-><init>(ILjava/lang/Comparable;Ljava/lang/Object;)V

    invoke-direct {p2, p3, p4}, LWi;-><init>(Lfg;La8;)V

    return-object p2

    :pswitch_0
    new-instance p2, LWi;

    new-instance p3, LLj;

    invoke-direct {p3, p1}, LLj;-><init>(Ljava/lang/Object;)V

    new-instance p4, Lg8;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, LT4;->b:Ljava/lang/Object;

    check-cast v0, Lh8;

    const/4 v1, 0x0

    invoke-direct {p4, v1, p1, v0}, Lg8;-><init>(ILjava/lang/Comparable;Ljava/lang/Object;)V

    invoke-direct {p2, p3, p4}, LWi;-><init>(Lfg;La8;)V

    return-object p2

    :pswitch_1
    check-cast p1, [B

    new-instance p2, LWi;

    new-instance p3, LLj;

    invoke-direct {p3, p1}, LLj;-><init>(Ljava/lang/Object;)V

    new-instance p4, Lki;

    iget-object v0, p0, LT4;->b:Ljava/lang/Object;

    check-cast v0, LS4;

    const/4 v1, 0x1

    invoke-direct {p4, p1, v1, v0}, Lki;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-direct {p2, p3, p4}, LWi;-><init>(Lfg;La8;)V

    return-object p2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
