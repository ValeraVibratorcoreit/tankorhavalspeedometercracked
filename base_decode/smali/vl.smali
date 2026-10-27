.class public abstract Lvl;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[I

.field public static final b:[I

.field public static final c:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const v0, 0x7f04022e

    const v1, 0x7f04022f

    filled-new-array {v0, v1}, [I

    move-result-object v0

    sput-object v0, Lvl;->a:[I

    const/16 v0, 0x8

    new-array v1, v0, [I

    fill-array-data v1, :array_0

    sput-object v1, Lvl;->b:[I

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lvl;->c:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x7f040577
        0x7f040578
        0x7f040579
        0x7f04057a
        0x7f04057b
        0x7f04057c
        0x7f04057d
        0x7f04057e
    .end array-data

    :array_1
    .array-data 4
        0x7f040052
        0x7f0401bc
        0x7f040333
        0x7f040340
        0x7f04037d
        0x7f04037e
        0x7f04037f
        0x7f040443
    .end array-data
.end method
