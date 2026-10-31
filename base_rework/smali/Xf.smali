.class public LXf;
.super LVf;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LVf;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()Lzl;
    .locals 2

    sget-object v0, LWf;->a:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, LLb;

    invoke-direct {v0}, LLb;-><init>()V

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v0, LKk;

    invoke-direct {v0}, Lzl;-><init>()V

    :goto_1
    return-object v0
.end method
