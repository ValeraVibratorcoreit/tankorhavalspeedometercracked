.class public final LKl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzg;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LKl;->a:I

    iput-object p1, p0, LKl;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lxn;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LKl;->a:I

    const-string v0, "owner"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LKl;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final n(LDg;Ltg;)V
    .locals 6

    iget v0, p0, LKl;->a:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Ltg;->ON_CREATE:Ltg;

    if-ne p2, v0, :cond_0

    invoke-interface {p1}, LDg;->getLifecycle()Lwg;

    move-result-object p1

    invoke-virtual {p1, p0}, Lwg;->b(LCg;)V

    iget-object p1, p0, LKl;->b:Ljava/lang/Object;

    check-cast p1, Ltn;

    invoke-virtual {p1}, Ltn;->b()V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "Next event must be ON_CREATE, it was "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :pswitch_0
    sget-object p1, Ltg;->ON_STOP:Ltg;

    if-ne p2, p1, :cond_1

    iget-object p1, p0, LKl;->b:Ljava/lang/Object;

    check-cast p1, Lzc;

    iget-object p1, p1, Lzc;->E:Landroid/view/View;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->cancelPendingInputEvents()V

    :cond_1
    return-void

    :pswitch_1
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iget-object p1, p0, LKl;->b:Ljava/lang/Object;

    check-cast p1, [LEd;

    array-length p2, p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-gtz p2, :cond_3

    array-length p2, p1

    if-gtz p2, :cond_2

    return-void

    :cond_2
    aget-object p1, p1, v1

    throw v0

    :cond_3
    aget-object p1, p1, v1

    throw v0

    :pswitch_2
    iget-object p1, p0, LKl;->b:Ljava/lang/Object;

    check-cast p1, LP6;

    iget-object p2, p1, LP6;->e:LRs;

    if-nez p2, :cond_5

    invoke-virtual {p1}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LK6;

    if-eqz p2, :cond_4

    iget-object p2, p2, LK6;->a:LRs;

    iput-object p2, p1, LP6;->e:LRs;

    :cond_4
    iget-object p2, p1, LP6;->e:LRs;

    if-nez p2, :cond_5

    new-instance p2, LRs;

    invoke-direct {p2}, LRs;-><init>()V

    iput-object p2, p1, LP6;->e:LRs;

    :cond_5
    iget-object p1, p1, LP6;->a:LFg;

    invoke-virtual {p1, p0}, LFg;->b(LCg;)V

    return-void

    :pswitch_3
    sget-object v0, Ltg;->ON_CREATE:Ltg;

    if-ne p2, v0, :cond_c

    invoke-interface {p1}, LDg;->getLifecycle()Lwg;

    move-result-object p1

    invoke-virtual {p1, p0}, Lwg;->b(LCg;)V

    iget-object p1, p0, LKl;->b:Ljava/lang/Object;

    check-cast p1, Lxn;

    invoke-interface {p1}, Lxn;->b()Lx1;

    move-result-object p2

    const-string v0, "androidx.savedstate.Restarter"

    invoke-virtual {p2, v0}, Lx1;->c(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p2

    if-nez p2, :cond_6

    goto/16 :goto_2

    :cond_6
    const-string v0, "classes_to_restore"

    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p2

    if-eqz p2, :cond_b

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_7
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "Class "

    :try_start_0
    const-class v2, LKl;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v0, v3, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v2

    const-class v3, Lvn;

    invoke-virtual {v2, v3}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v2

    const-string v3, "{\n                Class.\u2026class.java)\n            }"

    invoke-static {v3, v2}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2

    const/4 v3, 0x0

    :try_start_1
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    :try_start_2
    invoke-virtual {v1, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v3, "{\n                constr\u2026wInstance()\n            }"

    invoke-static {v3, v1}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v1, Lvn;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    instance-of v0, p1, LSs;

    if-eqz v0, :cond_9

    move-object v0, p1

    check-cast v0, LSs;

    invoke-interface {v0}, LSs;->d()LRs;

    move-result-object v0

    invoke-interface {p1}, Lxn;->b()Lx1;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Ljava/util/HashSet;

    iget-object v0, v0, LRs;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const-string v5, "key"

    invoke-static {v5, v4}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LOs;

    invoke-static {v4}, LTf;->f(Ljava/lang/Object;)V

    invoke-interface {p1}, LDg;->getLifecycle()Lwg;

    move-result-object v5

    invoke-static {v4, v1, v5}, LBr;->f(LOs;Lx1;Lwg;)V

    goto :goto_1

    :cond_8
    new-instance v3, Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v3}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v2

    if-eqz v0, :cond_7

    invoke-virtual {v1}, Lx1;->g()V

    goto/16 :goto_0

    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to instantiate "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " must have default constructor in order to be automatically recreated"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_2
    move-exception p1

    new-instance p2, Ljava/lang/RuntimeException;

    const-string v2, " wasn\'t found"

    invoke-static {v1, v0, v2}, LVo;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :cond_a
    :goto_2
    return-void

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\""

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "Next event must be ON_CREATE"

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
