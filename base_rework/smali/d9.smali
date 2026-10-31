.class public final Ld9;
.super LBr;
.source "SourceFile"


# instance fields
.field public final synthetic j:LBr;

.field public final synthetic k:Le9;


# direct methods
.method public constructor <init>(Le9;Lwc;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld9;->k:Le9;

    iput-object p2, p0, Ld9;->j:LBr;

    return-void
.end method


# virtual methods
.method public final N(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Ld9;->j:LBr;

    invoke-virtual {v0}, LBr;->Q()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1}, LBr;->N(I)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Ld9;->k:Le9;

    iget-object v0, v0, Le9;->e0:Landroid/app/Dialog;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final Q()Z
    .locals 1

    iget-object v0, p0, Ld9;->j:LBr;

    invoke-virtual {v0}, LBr;->Q()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ld9;->k:Le9;

    iget-boolean v0, v0, Le9;->h0:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
