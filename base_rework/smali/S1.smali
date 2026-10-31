.class public final synthetic LS1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgg;


# instance fields
.field public final synthetic a:LR0;


# direct methods
.method public synthetic constructor <init>(LR0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LS1;->a:LR0;

    return-void
.end method


# virtual methods
.method public final c(Landroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, LS1;->a:LR0;

    invoke-virtual {v0, p1}, LR0;->j(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
