.class public final Lg0;
.super LFi;
.source "SourceFile"


# instance fields
.field public final synthetic m:I

.field public final synthetic n:Ll0;


# direct methods
.method public constructor <init>(Ll0;Landroid/content/Context;LNp;Landroid/view/View;)V
    .locals 8

    const/4 v0, 0x0

    iput v0, p0, Lg0;->m:I

    .line 8
    iput-object p1, p0, Lg0;->n:Ll0;

    const/4 v7, 0x0

    const v2, 0x7f040022

    const/4 v3, 0x0

    move-object v1, p0

    move-object v4, p3

    move-object v5, p2

    move-object v6, p4

    .line 9
    invoke-direct/range {v1 .. v7}, LFi;-><init>(IILti;Landroid/content/Context;Landroid/view/View;Z)V

    .line 10
    iget-object p2, p3, LNp;->A:Lyi;

    .line 11
    invoke-virtual {p2}, Lyi;->f()Z

    move-result p2

    if-nez p2, :cond_1

    .line 12
    iget-object p2, p1, Ll0;->i:Lj0;

    if-nez p2, :cond_0

    .line 13
    iget-object p2, p1, Ll0;->h:LNi;

    .line 14
    check-cast p2, Landroid/view/View;

    .line 15
    :cond_0
    iput-object p2, p0, LFi;->f:Landroid/view/View;

    .line 16
    :cond_1
    iget-object p1, p1, Ll0;->w:Lk0;

    .line 17
    iput-object p1, p0, LFi;->i:LKi;

    .line 18
    iget-object p2, p0, LFi;->j:LDi;

    if-eqz p2, :cond_2

    .line 19
    invoke-interface {p2, p1}, LLi;->f(LKi;)V

    :cond_2
    return-void
.end method

.method public constructor <init>(Ll0;Landroid/content/Context;Lti;Landroid/view/View;)V
    .locals 8

    const/4 v0, 0x1

    iput v0, p0, Lg0;->m:I

    .line 1
    iput-object p1, p0, Lg0;->n:Ll0;

    const/4 v3, 0x0

    const v2, 0x7f040022

    const/4 v7, 0x1

    move-object v1, p0

    move-object v4, p3

    move-object v5, p2

    move-object v6, p4

    .line 2
    invoke-direct/range {v1 .. v7}, LFi;-><init>(IILti;Landroid/content/Context;Landroid/view/View;Z)V

    const p2, 0x800005

    .line 3
    iput p2, p0, LFi;->g:I

    .line 4
    iget-object p1, p1, Ll0;->w:Lk0;

    .line 5
    iput-object p1, p0, LFi;->i:LKi;

    .line 6
    iget-object p2, p0, LFi;->j:LDi;

    if-eqz p2, :cond_0

    .line 7
    invoke-interface {p2, p1}, LLi;->f(LKi;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 3

    iget v0, p0, Lg0;->m:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg0;->n:Ll0;

    iget-object v1, v0, Ll0;->c:Lti;

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lti;->c(Z)V

    :cond_0
    const/4 v1, 0x0

    iput-object v1, v0, Ll0;->s:Lg0;

    invoke-super {p0}, LFi;->c()V

    return-void

    :pswitch_0
    const/4 v0, 0x0

    iget-object v1, p0, Lg0;->n:Ll0;

    iput-object v0, v1, Ll0;->t:Lg0;

    invoke-super {p0}, LFi;->c()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
