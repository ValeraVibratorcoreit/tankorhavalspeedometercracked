.class public final LU8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LFn;


# instance fields
.field public final a:Ljava/lang/CharSequence;

.field public final b:I

.field public final c:I

.field public final d:LLp;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;IILLp;)V
    .locals 1

    const-string v0, "input"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LU8;->a:Ljava/lang/CharSequence;

    iput p2, p0, LU8;->b:I

    iput p3, p0, LU8;->c:I

    iput-object p4, p0, LU8;->d:LLp;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    new-instance v0, LT8;

    invoke-direct {v0, p0}, LT8;-><init>(LU8;)V

    return-object v0
.end method
