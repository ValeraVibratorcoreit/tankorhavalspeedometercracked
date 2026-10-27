.class public final LEi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;


# instance fields
.field public final synthetic a:LFi;


# direct methods
.method public constructor <init>(LFi;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LEi;->a:LFi;

    return-void
.end method


# virtual methods
.method public final onDismiss()V
    .locals 1

    iget-object v0, p0, LEi;->a:LFi;

    invoke-virtual {v0}, LFi;->c()V

    return-void
.end method
