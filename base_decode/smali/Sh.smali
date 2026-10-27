.class public final LSh;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Li;


# instance fields
.field public final a:LR7;

.field public final b:LR7;

.field public final c:LR7;

.field public final d:LR7;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li;-><init>(F)V

    sput-object v0, LSh;->e:Li;

    return-void
.end method

.method public constructor <init>(LR7;LR7;LR7;LR7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSh;->a:LR7;

    iput-object p3, p0, LSh;->b:LR7;

    iput-object p4, p0, LSh;->c:LR7;

    iput-object p2, p0, LSh;->d:LR7;

    return-void
.end method
