.class public abstract Lzl;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lyl;

.field public static final b:Lzl;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lyl;

    invoke-direct {v0}, Lzl;-><init>()V

    sput-object v0, Lzl;->a:Lyl;

    sget-object v0, LJk;->a:LIk;

    invoke-virtual {v0}, LIk;->b()Lzl;

    move-result-object v0

    sput-object v0, Lzl;->b:Lzl;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()I
.end method
