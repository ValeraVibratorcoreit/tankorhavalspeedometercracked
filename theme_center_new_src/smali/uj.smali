.class public final Luj;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ltj;

.field public final b:Ltj;


# direct methods
.method public constructor <init>(Ltj;Ltj;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luj;->a:Ltj;

    iput-object p2, p0, Luj;->b:Ltj;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Luj;

    if-eq v3, v2, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Luj;

    iget-object v2, p0, Luj;->a:Ltj;

    iget-object v3, p1, Luj;->a:Ltj;

    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Luj;->b:Ltj;

    iget-object p1, p1, Luj;->b:Ltj;

    invoke-static {v2, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Luj;->a:Ltj;

    iget-object v1, p0, Luj;->b:Ltj;

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
