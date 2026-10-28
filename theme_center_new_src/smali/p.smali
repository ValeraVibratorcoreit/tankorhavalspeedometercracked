.class public final Lp;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lp;

.field public static final c:Lp;


# instance fields
.field public final a:Ljava/lang/Throwable;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-boolean v0, Lv;->d:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    sput-object v1, Lp;->c:Lp;

    sput-object v1, Lp;->b:Lp;

    goto :goto_0

    :cond_0
    new-instance v0, Lp;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Lp;-><init>(ZLjava/util/concurrent/CancellationException;)V

    sput-object v0, Lp;->c:Lp;

    new-instance v0, Lp;

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, Lp;-><init>(ZLjava/util/concurrent/CancellationException;)V

    sput-object v0, Lp;->b:Lp;

    :goto_0
    return-void
.end method

.method public constructor <init>(ZLjava/util/concurrent/CancellationException;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lp;->a:Ljava/lang/Throwable;

    return-void
.end method
