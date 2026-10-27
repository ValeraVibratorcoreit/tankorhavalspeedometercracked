.class public final LMa;
.super Lmk;
.source "SourceFile"


# instance fields
.field public final l:LLa;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LLa;

    invoke-direct {v0, p1}, LLa;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, LMa;->l:LLa;

    return-void
.end method


# virtual methods
.method public final H(Z)V
    .locals 2

    sget-object v0, Lza;->k:Lza;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    xor-int/2addr v0, v1

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, LMa;->l:LLa;

    invoke-virtual {v0, p1}, LLa;->H(Z)V

    return-void
.end method

.method public final I(Z)V
    .locals 2

    sget-object v0, Lza;->k:Lza;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    xor-int/2addr v0, v1

    iget-object v1, p0, LMa;->l:LLa;

    if-eqz v0, :cond_1

    iput-boolean p1, v1, LLa;->n:Z

    goto :goto_1

    :cond_1
    invoke-virtual {v1, p1}, LLa;->I(Z)V

    :goto_1
    return-void
.end method

.method public final M(Landroid/text/method/TransformationMethod;)Landroid/text/method/TransformationMethod;
    .locals 2

    sget-object v0, Lza;->k:Lza;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    xor-int/2addr v0, v1

    if-eqz v0, :cond_1

    return-object p1

    :cond_1
    iget-object v0, p0, LMa;->l:LLa;

    invoke-virtual {v0, p1}, LLa;->M(Landroid/text/method/TransformationMethod;)Landroid/text/method/TransformationMethod;

    move-result-object p1

    return-object p1
.end method

.method public final m([Landroid/text/InputFilter;)[Landroid/text/InputFilter;
    .locals 2

    sget-object v0, Lza;->k:Lza;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    xor-int/2addr v0, v1

    if-eqz v0, :cond_1

    return-object p1

    :cond_1
    iget-object v0, p0, LMa;->l:LLa;

    invoke-virtual {v0, p1}, LLa;->m([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    return-object p1
.end method

.method public final t()Z
    .locals 1

    iget-object v0, p0, LMa;->l:LLa;

    iget-boolean v0, v0, LLa;->n:Z

    return v0
.end method
