.class public final Lu;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lu;


# instance fields
.field public volatile a:Ljava/lang/Thread;

.field public volatile b:Lu;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lu;->c:Lu;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lv;->f:LUd;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v0, p0, v1}, LUd;->b0(Lu;Ljava/lang/Thread;)V

    return-void
.end method
