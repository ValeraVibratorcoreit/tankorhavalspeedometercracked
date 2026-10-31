.class public final Leo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:I

.field public final d:Ljava/lang/Class;

.field public final e:[I

.field public final f:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;IILjava/lang/Class;[I[Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leo;->a:Ljava/lang/String;

    iput p2, p0, Leo;->b:I

    iput p3, p0, Leo;->c:I

    iput-object p4, p0, Leo;->d:Ljava/lang/Class;

    iput-object p5, p0, Leo;->e:[I

    iput-object p6, p0, Leo;->f:[Ljava/lang/String;

    return-void
.end method

.method public static a(Ljava/lang/String;IILjava/lang/Class;)Leo;
    .locals 8

    new-instance v7, Leo;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, v7

    move-object v1, p0

    move v2, p1

    move v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v6}, Leo;-><init>(Ljava/lang/String;IILjava/lang/Class;[I[Ljava/lang/String;)V

    return-object v7
.end method
