.class public final LWj;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LWj;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LWj;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LWj;->a:LWj;

    return-void
.end method


# virtual methods
.method public final a(Lod;Lod;Ldd;Ldd;)Landroid/window/OnBackInvokedCallback;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lod;",
            "Lod;",
            "Ldd;",
            "Ldd;",
            ")",
            "Landroid/window/OnBackInvokedCallback;"
        }
    .end annotation

    const-string v0, "onBackStarted"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "onBackProgressed"

    invoke-static {v0, p2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "onBackInvoked"

    invoke-static {v0, p3}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "onBackCancelled"

    invoke-static {v0, p4}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v0, LVj;

    invoke-direct {v0, p1, p2, p3, p4}, LVj;-><init>(Lod;Lod;Ldd;Ldd;)V

    return-object v0
.end method
