.class public final LZc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Lzc;

.field public c:Z

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:Lug;

.field public i:Lug;


# direct methods
.method public constructor <init>(ILzc;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, LZc;->a:I

    .line 3
    iput-object p2, p0, LZc;->b:Lzc;

    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, LZc;->c:Z

    .line 5
    sget-object p1, Lug;->e:Lug;

    iput-object p1, p0, LZc;->h:Lug;

    .line 6
    iput-object p1, p0, LZc;->i:Lug;

    return-void
.end method

.method public constructor <init>(ILzc;I)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput p1, p0, LZc;->a:I

    .line 9
    iput-object p2, p0, LZc;->b:Lzc;

    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, LZc;->c:Z

    .line 11
    sget-object p1, Lug;->e:Lug;

    iput-object p1, p0, LZc;->h:Lug;

    .line 12
    iput-object p1, p0, LZc;->i:Lug;

    return-void
.end method
