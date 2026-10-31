.class public final synthetic Lf9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LRj;
.implements LOn;
.implements Luq;


# static fields
.field public static final b:Lf9;

.field public static final c:Lf9;

.field public static final d:Lf9;

.field public static final e:Lf9;

.field public static final f:Lf9;


# instance fields
.field public final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lf9;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lf9;-><init>(I)V

    sput-object v0, Lf9;->b:Lf9;

    new-instance v0, Lf9;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lf9;-><init>(I)V

    sput-object v0, Lf9;->c:Lf9;

    new-instance v0, Lf9;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lf9;-><init>(I)V

    sput-object v0, Lf9;->d:Lf9;

    new-instance v0, Lf9;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lf9;-><init>(I)V

    sput-object v0, Lf9;->e:Lf9;

    new-instance v0, Lf9;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lf9;-><init>(I)V

    sput-object v0, Lf9;->f:Lf9;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lf9;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public b(Lkr;Llr;)V
    .locals 1

    iget v0, p0, Lf9;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-interface {p1}, Lkr;->e()V

    return-void

    :pswitch_0
    invoke-interface {p1}, Lkr;->c()V

    return-void

    :pswitch_1
    invoke-interface {p1, p2}, Lkr;->d(Llr;)V

    return-void

    :pswitch_2
    invoke-interface {p1, p2}, Lkr;->f(Llr;)V

    return-void

    :pswitch_3
    invoke-interface {p1, p2}, Lkr;->a(Llr;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public h(Landroid/view/View;LVt;)LVt;
    .locals 3

    sget v0, Lru/zinovin/tankspeedometer/MainActivity;->M:I

    iget-object p2, p2, LVt;->a:LTt;

    const/4 v0, 0x7

    invoke-virtual {p2, v0}, LTt;->f(I)LHf;

    move-result-object p2

    iget v0, p2, LHf;->a:I

    iget v1, p2, LHf;->c:I

    iget v2, p2, LHf;->d:I

    iget p2, p2, LHf;->b:I

    invoke-virtual {p1, v0, p2, v1, v2}, Landroid/view/View;->setPadding(IIII)V

    sget-object p1, LVt;->b:LVt;

    return-object p1
.end method
