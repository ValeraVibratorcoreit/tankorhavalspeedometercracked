.class public abstract LKe;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LJe;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LJe;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LKe;->a:LJe;

    return-void
.end method


# virtual methods
.method public a(LTe;Lco;)V
    .locals 1

    const-string v0, "connection"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string p1, "settings"

    invoke-static {p1, p2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public abstract b(Laf;)V
.end method
