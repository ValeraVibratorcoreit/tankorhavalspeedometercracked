.class public final LG8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzg;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LAa;Lzg;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LG8;->a:I

    const-string v0, "defaultLifecycleObserver"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LG8;->b:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, LG8;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 2

    const/4 v0, 0x2

    iput v0, p0, LG8;->a:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, LG8;->b:Ljava/lang/Object;

    .line 6
    sget-object v0, Lb6;->c:Lb6;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    .line 7
    iget-object v1, v0, Lb6;->a:Ljava/util/HashMap;

    .line 8
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LZ5;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, p1, v1}, Lb6;->a(Ljava/lang/Class;[Ljava/lang/reflect/Method;)LZ5;

    move-result-object v1

    .line 10
    :goto_0
    iput-object v1, p0, LG8;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lx1;Lwg;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LG8;->a:I

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p2, p0, LG8;->b:Ljava/lang/Object;

    iput-object p1, p0, LG8;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final n(LDg;Ltg;)V
    .locals 5

    iget v0, p0, LG8;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LG8;->c:Ljava/lang/Object;

    check-cast v0, LZ5;

    iget-object v0, v0, LZ5;->a:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    iget-object v2, p0, LG8;->b:Ljava/lang/Object;

    invoke-static {v1, p1, p2, v2}, LZ5;->a(Ljava/util/List;LDg;Ltg;Ljava/lang/Object;)V

    sget-object v1, Ltg;->ON_ANY:Ltg;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0, p1, p2, v2}, LZ5;->a(Ljava/util/List;LDg;Ltg;Ljava/lang/Object;)V

    return-void

    :pswitch_0
    sget-object p1, Ltg;->ON_START:Ltg;

    if-ne p2, p1, :cond_0

    iget-object p1, p0, LG8;->b:Ljava/lang/Object;

    check-cast p1, Lwg;

    invoke-virtual {p1, p0}, Lwg;->b(LCg;)V

    iget-object p1, p0, LG8;->c:Ljava/lang/Object;

    check-cast p1, Lx1;

    invoke-virtual {p1}, Lx1;->g()V

    :cond_0
    return-void

    :pswitch_1
    sget-object v0, LF8;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    iget-object v1, p0, LG8;->b:Ljava/lang/Object;

    check-cast v1, LAa;

    packed-switch v0, :pswitch_data_1

    goto :goto_0

    :pswitch_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "ON_ANY must not been send by anybody"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :pswitch_4
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :pswitch_5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :pswitch_6
    iget-object v0, v1, LAa;->b:Landroidx/emoji2/text/EmojiCompatInitializer;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {v0}, LU6;->a(Landroid/os/Looper;)Landroid/os/Handler;

    move-result-object v0

    new-instance v2, LCa;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    const-wide/16 v3, 0x1f4

    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    iget-object v0, v1, LAa;->a:Lwg;

    invoke-virtual {v0, v1}, Lwg;->b(LCg;)V

    goto :goto_0

    :pswitch_7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :pswitch_8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    iget-object v0, p0, LG8;->c:Ljava/lang/Object;

    check-cast v0, Lzg;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2}, Lzg;->n(LDg;Ltg;)V

    :cond_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method
