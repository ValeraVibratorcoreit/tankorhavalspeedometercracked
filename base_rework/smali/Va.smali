.class public final LVa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfg;


# static fields
.field public static final b:LVa;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LVa;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LVa;->b:LVa;

    return-void
.end method


# virtual methods
.method public final a(Ljava/security/MessageDigest;)V
    .locals 0

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "EmptySignature"

    return-object v0
.end method
