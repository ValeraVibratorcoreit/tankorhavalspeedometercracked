.class public final LXc;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LXc;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LXc;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v0, LXc;->a:LXc;

    return-void
.end method
