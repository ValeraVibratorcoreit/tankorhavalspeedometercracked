.class public final LF3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/net/Uri;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:I

.field public final e:Z


# direct methods
.method public constructor <init>(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LF3;->a:Landroid/net/Uri;

    .line 3
    iput-object p2, p0, LF3;->b:Ljava/lang/String;

    .line 4
    iput-object p3, p0, LF3;->c:Ljava/lang/String;

    const/4 p1, -0x1

    .line 5
    iput p1, p0, LF3;->d:I

    .line 6
    iput-boolean p4, p0, LF3;->e:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 1

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, LF3;->a:Landroid/net/Uri;

    .line 9
    iput-object p1, p0, LF3;->b:Ljava/lang/String;

    .line 10
    iput-object p3, p0, LF3;->c:Ljava/lang/String;

    .line 11
    iput p2, p0, LF3;->d:I

    const/4 p1, 0x0

    .line 12
    iput-boolean p1, p0, LF3;->e:Z

    return-void
.end method
