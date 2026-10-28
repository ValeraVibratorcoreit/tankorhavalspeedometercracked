.class public final synthetic Lvj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LVn;
.implements Lmo;


# instance fields
.field public final synthetic a:Lxj;


# direct methods
.method public synthetic constructor <init>(Lxj;)V
    .locals 0

    iput-object p1, p0, Lvj;->a:Lxj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lvj;->a:Lxj;

    iget-object v1, v0, Lc4;->T:Lru/zinovin/tankspeedometer/MainActivity;

    iput-object p1, v1, Lru/zinovin/tankspeedometer/MainActivity;->z:Ljava/lang/String;

    iget-object v1, v0, Lxj;->U:LWn;

    const-string v2, "Default"

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2}, LSn;->setRowEnabled(Z)V

    invoke-virtual {v0, p1}, Lxj;->c0(Ljava/lang/String;)V

    invoke-virtual {v0}, Lxj;->h0()V

    return-void
.end method

.method public c(Z)V
    .locals 0

    iget-object p1, p0, Lvj;->a:Lxj;

    invoke-virtual {p1}, Lxj;->h0()V

    return-void
.end method
