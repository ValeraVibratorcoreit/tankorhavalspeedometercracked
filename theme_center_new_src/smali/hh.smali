.class public final Lhh;
.super LOs;
.source "SourceFile"


# static fields
.field public static final c:LQc;


# instance fields
.field public final b:Lbp;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LQc;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LQc;-><init>(I)V

    sput-object v0, Lhh;->c:LQc;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, LOs;-><init>()V

    new-instance v0, Lbp;

    invoke-direct {v0}, Lbp;-><init>()V

    iput-object v0, p0, Lhh;->b:Lbp;

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 6

    iget-object v0, p0, Lhh;->b:Lbp;

    iget v1, v0, Lbp;->c:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-gtz v1, :cond_1

    iget-object v4, v0, Lbp;->b:[Ljava/lang/Object;

    move v5, v3

    :goto_0
    if-ge v5, v1, :cond_0

    aput-object v2, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    iput v3, v0, Lbp;->c:I

    return-void

    :cond_1
    iget-object v0, v0, Lbp;->b:[Ljava/lang/Object;

    aget-object v0, v0, v3

    invoke-static {v0}, LVo;->l(Ljava/lang/Object;)V

    throw v2
.end method
