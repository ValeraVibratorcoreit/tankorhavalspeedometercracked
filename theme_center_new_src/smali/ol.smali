.class public abstract Lol;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[I

.field public static final b:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const v0, 0x7f04028b

    const v1, 0x7f040454

    filled-new-array {v0, v1}, [I

    move-result-object v0

    sput-object v0, Lol;->a:[I

    const/4 v0, 0x7

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lol;->b:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x10100b3
        0x7f040297
        0x7f040298
        0x7f040299
        0x7f0402ca
        0x7f0402d4
        0x7f0402d5
    .end array-data
.end method
