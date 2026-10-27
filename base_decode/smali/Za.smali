.class public final LZa;
.super LAq;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lcb;


# direct methods
.method public constructor <init>(Lcb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LZa;->a:Lcb;

    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    iget-object p1, p0, LZa;->a:Lcb;

    invoke-virtual {p1}, Lcb;->b()Ldb;

    move-result-object p1

    invoke-virtual {p1}, Ldb;->a()V

    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    iget-object p1, p0, LZa;->a:Lcb;

    invoke-virtual {p1}, Lcb;->b()Ldb;

    move-result-object p1

    invoke-virtual {p1}, Ldb;->b()V

    return-void
.end method
