.class public final LWp;
.super Ljg;
.source "SourceFile"

# interfaces
.implements Lod;


# static fields
.field public static final b:LWp;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LWp;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljg;-><init>(I)V

    sput-object v0, LWp;->b:LWp;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Landroid/content/res/Resources;

    const-string v0, "resources"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    iget p1, p1, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 p1, p1, 0x30

    const/16 v0, 0x20

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
