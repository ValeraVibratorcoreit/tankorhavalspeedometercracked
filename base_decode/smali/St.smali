.class public final LSt;
.super LRt;
.source "SourceFile"


# static fields
.field public static final q:LVt;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, LB;->g()Landroid/view/WindowInsets;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, LVt;->g(Landroid/view/View;Landroid/view/WindowInsets;)LVt;

    move-result-object v0

    sput-object v0, LSt;->q:LVt;

    return-void
.end method

.method public constructor <init>(LVt;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LRt;-><init>(LVt;Landroid/view/WindowInsets;)V

    return-void
.end method


# virtual methods
.method public final d(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public f(I)LHf;
    .locals 1

    iget-object v0, p0, LOt;->c:Landroid/view/WindowInsets;

    invoke-static {p1}, LUt;->a(I)I

    move-result p1

    invoke-static {v0, p1}, LB;->e(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {p1}, LHf;->c(Landroid/graphics/Insets;)LHf;

    move-result-object p1

    return-object p1
.end method
