.class public final Li9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La8;


# instance fields
.field public final a:Landroid/content/res/Resources$Theme;

.field public final b:Landroid/content/res/Resources;

.field public final c:LS3;

.field public final d:I

.field public e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;LS3;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li9;->a:Landroid/content/res/Resources$Theme;

    iput-object p2, p0, Li9;->b:Landroid/content/res/Resources;

    iput-object p3, p0, Li9;->c:LS3;

    iput p4, p0, Li9;->d:I

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Li9;->c:LS3;

    invoke-virtual {v0}, LS3;->l()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, Li9;->e:Ljava/lang/Object;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v1, p0, Li9;->c:LS3;

    invoke-virtual {v1, v0}, LS3;->h(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public final cancel()V
    .locals 0

    return-void
.end method

.method public final d(LUk;LZ7;)V
    .locals 3

    :try_start_0
    iget-object p1, p0, Li9;->c:LS3;

    iget-object v0, p0, Li9;->a:Landroid/content/res/Resources$Theme;

    iget-object v1, p0, Li9;->b:Landroid/content/res/Resources;

    iget v2, p0, Li9;->d:I

    invoke-virtual {p1, v1, v2, v0}, LS3;->p(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Li9;->e:Ljava/lang/Object;

    invoke-interface {p2, p1}, LZ7;->m(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-interface {p2, p1}, LZ7;->h(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method

.method public final e()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
