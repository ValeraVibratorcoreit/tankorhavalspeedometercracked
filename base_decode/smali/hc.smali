.class public final Lhc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Landroid/content/Context;

.field public final synthetic d:LH0;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Landroid/content/Context;LH0;II)V
    .locals 0

    iput p5, p0, Lhc;->a:I

    iput-object p1, p0, Lhc;->b:Ljava/lang/String;

    iput-object p2, p0, Lhc;->c:Landroid/content/Context;

    iput-object p3, p0, Lhc;->d:LH0;

    iput p4, p0, Lhc;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lhc;->a:I

    packed-switch v0, :pswitch_data_0

    :try_start_0
    iget-object v0, p0, Lhc;->b:Ljava/lang/String;

    iget-object v1, p0, Lhc;->c:Landroid/content/Context;

    iget-object v2, p0, Lhc;->d:LH0;

    iget v3, p0, Lhc;->e:I

    invoke-static {v0, v1, v2, v3}, Lkc;->a(Ljava/lang/String;Landroid/content/Context;LH0;I)Ljc;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    new-instance v0, Ljc;

    const/4 v1, -0x3

    invoke-direct {v0, v1}, Ljc;-><init>(I)V

    :goto_0
    return-object v0

    :pswitch_0
    iget-object v0, p0, Lhc;->b:Ljava/lang/String;

    iget-object v1, p0, Lhc;->c:Landroid/content/Context;

    iget-object v2, p0, Lhc;->d:LH0;

    iget v3, p0, Lhc;->e:I

    invoke-static {v0, v1, v2, v3}, Lkc;->a(Ljava/lang/String;Landroid/content/Context;LH0;I)Ljc;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
