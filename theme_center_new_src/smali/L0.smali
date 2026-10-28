.class public final LL0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic a:LP0;

.field public final synthetic b:LM0;


# direct methods
.method public constructor <init>(LM0;LP0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LL0;->b:LM0;

    iput-object p2, p0, LL0;->a:LP0;

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    iget-object p1, p0, LL0;->b:LM0;

    iget-object p2, p1, LM0;->q:Landroid/content/DialogInterface$OnClickListener;

    iget-object p4, p0, LL0;->a:LP0;

    iget-object p5, p4, LP0;->b:LR0;

    invoke-interface {p2, p5, p3}, Landroid/content/DialogInterface$OnClickListener;->onClick(Landroid/content/DialogInterface;I)V

    iget-boolean p1, p1, LM0;->s:Z

    if-nez p1, :cond_0

    iget-object p1, p4, LP0;->b:LR0;

    invoke-virtual {p1}, LR0;->dismiss()V

    :cond_0
    return-void
.end method
