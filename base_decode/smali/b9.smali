.class public final Lb9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# instance fields
.field public final synthetic a:Le9;


# direct methods
.method public constructor <init>(Le9;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb9;->a:Le9;

    return-void
.end method


# virtual methods
.method public final onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    iget-object p1, p0, Lb9;->a:Le9;

    iget-object v0, p1, Le9;->e0:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0}, Le9;->onCancel(Landroid/content/DialogInterface;)V

    :cond_0
    return-void
.end method
