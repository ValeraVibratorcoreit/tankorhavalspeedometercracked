.class public final LSj;
.super Ljg;
.source "SourceFile"

# interfaces
.implements Lod;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lak;


# direct methods
.method public synthetic constructor <init>(Lak;I)V
    .locals 0

    iput p2, p0, LSj;->b:I

    iput-object p1, p0, LSj;->c:Lak;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Ljg;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, LSj;->b:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lr3;

    const-string v0, "backEvent"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object p1, p0, LSj;->c:Lak;

    iget-object v0, p1, Lak;->c:LHc;

    if-nez v0, :cond_2

    iget-object p1, p1, Lak;->b:LZ2;

    invoke-virtual {p1}, LZ2;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LHc;

    iget-boolean v1, v1, LHc;->a:Z

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    check-cast v0, LHc;

    :cond_2
    sget-object p1, Lpa;->m:Lpa;

    return-object p1

    :pswitch_0
    check-cast p1, Lr3;

    const-string v0, "backEvent"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object p1, p0, LSj;->c:Lak;

    iget-object v0, p1, Lak;->b:LZ2;

    invoke-virtual {v0}, LZ2;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LHc;

    iget-boolean v2, v2, LHc;->a:Z

    if-eqz v2, :cond_3

    goto :goto_1

    :cond_4
    const/4 v1, 0x0

    :goto_1
    check-cast v1, LHc;

    iget-object v0, p1, Lak;->c:LHc;

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lak;->a()V

    :cond_5
    iput-object v1, p1, Lak;->c:LHc;

    sget-object p1, Lpa;->m:Lpa;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
