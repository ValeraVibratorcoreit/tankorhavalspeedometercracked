.class public final LJ6;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LJ6;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LJ6;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, LJ6;->a:LJ6;

    return-void
.end method


# virtual methods
.method public final a(Landroid/app/Activity;)Landroid/window/OnBackInvokedDispatcher;
    .locals 1

    const-string v0, "activity"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p1}, Landroid/app/Activity;->getOnBackInvokedDispatcher()Landroid/window/OnBackInvokedDispatcher;

    move-result-object p1

    const-string v0, "activity.getOnBackInvokedDispatcher()"

    invoke-static {v0, p1}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-object p1
.end method
