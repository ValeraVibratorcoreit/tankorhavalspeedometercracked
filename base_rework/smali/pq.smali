.class public abstract Lpq;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LB4;

.field public static final b:LB4;

.field public static final c:LB4;

.field public static final d:LB4;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, LB4;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LB4;-><init>(Lpa;Z)V

    sput-object v0, Lpq;->a:LB4;

    new-instance v0, LB4;

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, LB4;-><init>(Lpa;Z)V

    sput-object v0, Lpq;->b:LB4;

    new-instance v0, LB4;

    sget-object v1, Lpa;->k:Lpa;

    invoke-direct {v0, v1, v2}, LB4;-><init>(Lpa;Z)V

    sput-object v0, Lpq;->c:LB4;

    new-instance v0, LB4;

    invoke-direct {v0, v1, v3}, LB4;-><init>(Lpa;Z)V

    sput-object v0, Lpq;->d:LB4;

    return-void
.end method
