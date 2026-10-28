.class public final Lnq;
.super LTf;
.source "SourceFile"


# instance fields
.field public final synthetic j:Landroid/content/Context;

.field public final synthetic k:Landroid/text/TextPaint;

.field public final synthetic l:LTf;

.field public final synthetic m:Loq;


# direct methods
.method public constructor <init>(Loq;Landroid/content/Context;Landroid/text/TextPaint;LTf;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnq;->m:Loq;

    iput-object p2, p0, Lnq;->j:Landroid/content/Context;

    iput-object p3, p0, Lnq;->k:Landroid/text/TextPaint;

    iput-object p4, p0, Lnq;->l:LTf;

    return-void
.end method


# virtual methods
.method public final M(I)V
    .locals 1

    iget-object v0, p0, Lnq;->l:LTf;

    invoke-virtual {v0, p1}, LTf;->M(I)V

    return-void
.end method

.method public final N(Landroid/graphics/Typeface;Z)V
    .locals 3

    iget-object v0, p0, Lnq;->k:Landroid/text/TextPaint;

    iget-object v1, p0, Lnq;->m:Loq;

    iget-object v2, p0, Lnq;->j:Landroid/content/Context;

    invoke-virtual {v1, v2, v0, p1}, Loq;->g(Landroid/content/Context;Landroid/text/TextPaint;Landroid/graphics/Typeface;)V

    iget-object v0, p0, Lnq;->l:LTf;

    invoke-virtual {v0, p1, p2}, LTf;->N(Landroid/graphics/Typeface;Z)V

    return-void
.end method
