.class public final Lt0;
.super Ljava/lang/ref/WeakReference;
.source "SourceFile"


# instance fields
.field public final a:Lfg;

.field public final b:Z

.field public c:LIm;


# direct methods
.method public constructor <init>(Lfg;Lnb;Ljava/lang/ref/ReferenceQueue;)V
    .locals 0

    invoke-direct {p0, p2, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    const-string p3, "Argument must not be null"

    invoke-static {p3, p1}, LUd;->l(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p1, p0, Lt0;->a:Lfg;

    iget-boolean p1, p2, Lnb;->a:Z

    const/4 p2, 0x0

    iput-object p2, p0, Lt0;->c:LIm;

    iput-boolean p1, p0, Lt0;->b:Z

    return-void
.end method
