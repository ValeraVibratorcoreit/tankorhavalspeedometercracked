.class public final Li3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYi;


# instance fields
.field public final synthetic a:I

.field public final b:Landroid/content/res/AssetManager;


# direct methods
.method public synthetic constructor <init>(Landroid/content/res/AssetManager;I)V
    .locals 0

    iput p2, p0, Li3;->a:I

    iput-object p1, p0, Li3;->b:Landroid/content/res/AssetManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/res/AssetManager;Ljava/lang/String;)La8;
    .locals 2

    iget v0, p0, Li3;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, LTb;

    const/4 v1, 0x1

    invoke-direct {v0, p1, p2, v1}, LTb;-><init>(Landroid/content/res/AssetManager;Ljava/lang/String;I)V

    return-object v0

    :pswitch_0
    new-instance v0, LTb;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, v1}, LTb;-><init>(Landroid/content/res/AssetManager;Ljava/lang/String;I)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final o(Ljj;)LXi;
    .locals 2

    iget p1, p0, Li3;->a:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lj3;

    iget-object v0, p0, Li3;->b:Landroid/content/res/AssetManager;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1, p0}, Lj3;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    return-object p1

    :pswitch_0
    new-instance p1, Lj3;

    iget-object v0, p0, Li3;->b:Landroid/content/res/AssetManager;

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1, p0}, Lj3;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
