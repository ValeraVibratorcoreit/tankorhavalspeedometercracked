.class public final LC0;
.super Ljg;
.source "SourceFile"

# interfaces
.implements Ldd;


# static fields
.field public static final b:LC0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LC0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljg;-><init>(I)V

    sput-object v0, LC0;->b:LC0;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    sget-object v0, Lzl;->a:Lyl;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lzl;->b:Lzl;

    invoke-virtual {v0}, Lzl;->a()I

    move-result v0

    const/high16 v1, 0x10000

    add-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
