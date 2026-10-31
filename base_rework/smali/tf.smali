.class public final synthetic Ltf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LOn;
.implements LVn;


# instance fields
.field public final synthetic a:Landroid/content/SharedPreferences;

.field public final synthetic b:Lc4;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LEh;LWn;Landroid/content/SharedPreferences;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltf;->b:Lc4;

    iput-object p2, p0, Ltf;->c:Ljava/lang/Object;

    iput-object p3, p0, Ltf;->a:Landroid/content/SharedPreferences;

    return-void
.end method

.method public synthetic constructor <init>(Luf;Landroid/content/SharedPreferences;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltf;->b:Lc4;

    iput-object p2, p0, Ltf;->a:Landroid/content/SharedPreferences;

    iput-object p3, p0, Ltf;->c:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Ltf;->b:Lc4;

    check-cast v0, Luf;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Ltf;->a:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    iget-object v2, p0, Ltf;->c:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1, v2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-virtual {v0, v2}, Lc4;->X(Ljava/lang/String;)V

    return-void
.end method

.method public c(Z)V
    .locals 5

    iget-object v0, p0, Ltf;->b:Lc4;

    check-cast v0, LEh;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Ltf;->c:Ljava/lang/Object;

    check-cast v1, LWn;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, LSn;->setRowEnabled(Z)V

    if-eqz p1, :cond_0

    new-instance v2, Lip;

    const-string v3, "iptables -I FORWARD -o ccinet+ -j REJECT"

    invoke-direct {v2, v3}, Lip;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Ljava/util/concurrent/CompletableFuture;->supplyAsync(Ljava/util/function/Supplier;)Ljava/util/concurrent/CompletableFuture;

    move-result-object v2

    goto :goto_0

    :cond_0
    new-instance v2, Lip;

    const-string v3, "iptables -D FORWARD -o ccinet+ -j REJECT"

    invoke-direct {v2, v3}, Lip;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Ljava/util/concurrent/CompletableFuture;->supplyAsync(Ljava/util/function/Supplier;)Ljava/util/concurrent/CompletableFuture;

    move-result-object v2

    :goto_0
    new-instance v3, LCh;

    iget-object v4, p0, Ltf;->a:Landroid/content/SharedPreferences;

    invoke-direct {v3, v0, v4, p1, v1}, LCh;-><init>(LEh;Landroid/content/SharedPreferences;ZLWn;)V

    invoke-virtual {v2, v3}, Ljava/util/concurrent/CompletableFuture;->thenAccept(Ljava/util/function/Consumer;)Ljava/util/concurrent/CompletableFuture;

    return-void
.end method
