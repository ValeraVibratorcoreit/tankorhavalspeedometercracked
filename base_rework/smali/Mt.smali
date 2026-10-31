.class public final LMt;
.super LLt;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LLt;-><init>()V

    return-void
.end method

.method public constructor <init>(LVt;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LLt;-><init>(LVt;)V

    return-void
.end method


# virtual methods
.method public c(ILHf;)V
    .locals 1

    iget-object v0, p0, LLt;->c:Landroid/view/WindowInsets$Builder;

    invoke-static {p1}, LUt;->a(I)I

    move-result p1

    invoke-virtual {p2}, LHf;->d()Landroid/graphics/Insets;

    move-result-object p2

    invoke-static {v0, p1, p2}, LB;->q(Landroid/view/WindowInsets$Builder;ILandroid/graphics/Insets;)V

    return-void
.end method
