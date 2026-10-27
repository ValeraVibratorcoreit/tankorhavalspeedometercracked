.class public final Lmq;
.super LBr;
.source "SourceFile"


# instance fields
.field public final synthetic j:LTf;

.field public final synthetic k:Loq;


# direct methods
.method public constructor <init>(Loq;LTf;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmq;->k:Loq;

    iput-object p2, p0, Lmq;->j:LTf;

    return-void
.end method


# virtual methods
.method public final O(I)V
    .locals 2

    iget-object v0, p0, Lmq;->k:Loq;

    const/4 v1, 0x1

    iput-boolean v1, v0, Loq;->m:Z

    iget-object v0, p0, Lmq;->j:LTf;

    invoke-virtual {v0, p1}, LTf;->M(I)V

    return-void
.end method

.method public final P(Landroid/graphics/Typeface;)V
    .locals 2

    iget-object v0, p0, Lmq;->k:Loq;

    iget v1, v0, Loq;->c:I

    invoke-static {p1, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, v0, Loq;->n:Landroid/graphics/Typeface;

    const/4 p1, 0x1

    iput-boolean p1, v0, Loq;->m:Z

    iget-object p1, v0, Loq;->n:Landroid/graphics/Typeface;

    const/4 v0, 0x0

    iget-object v1, p0, Lmq;->j:LTf;

    invoke-virtual {v1, p1, v0}, LTf;->N(Landroid/graphics/Typeface;Z)V

    return-void
.end method
