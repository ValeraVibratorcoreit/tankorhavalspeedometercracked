.class public final Lnj;
.super LY3;
.source "SourceFile"


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    sget-object p1, LS7;->b:LS7;

    invoke-direct {p0, p1}, Lnj;-><init>(LY3;)V

    return-void
.end method

.method public constructor <init>(LY3;)V
    .locals 1

    const-string v0, "initialExtras"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, LY3;-><init>(I)V

    .line 3
    iget-object v0, p0, LY3;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/LinkedHashMap;

    iget-object p1, p1, LY3;->a:Ljava/lang/Object;

    check-cast p1, Ljava/util/LinkedHashMap;

    .line 4
    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method
