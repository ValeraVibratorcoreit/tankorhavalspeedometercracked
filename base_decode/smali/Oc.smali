.class public final LOc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:LK2;

.field public B:LK2;

.field public C:Ljava/util/ArrayDeque;

.field public D:Z

.field public E:Z

.field public F:Z

.field public G:Z

.field public H:Z

.field public I:Ljava/util/ArrayList;

.field public J:Ljava/util/ArrayList;

.field public K:Ljava/util/ArrayList;

.field public L:LRc;

.field public final M:Lr0;

.field public final a:Ljava/util/ArrayList;

.field public b:Z

.field public final c:Ljj;

.field public d:Ljava/util/ArrayList;

.field public e:Ljava/util/ArrayList;

.field public final f:LEc;

.field public g:Lak;

.field public final h:LHc;

.field public final i:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final j:Ljava/util/Map;

.field public final k:Ljava/util/Map;

.field public final l:Ld2;

.field public final m:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final n:LFc;

.field public final o:LFc;

.field public final p:LFc;

.field public final q:LFc;

.field public final r:LIc;

.field public s:I

.field public t:LBc;

.field public u:LBr;

.field public v:Lzc;

.field public w:Lzc;

.field public final x:LJc;

.field public final y:Lh8;

.field public z:LK2;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LOc;->a:Ljava/util/ArrayList;

    new-instance v0, Ljj;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ljj;-><init>(I)V

    iput-object v0, p0, LOc;->c:Ljj;

    new-instance v0, LEc;

    invoke-direct {v0, p0}, LEc;-><init>(LOc;)V

    iput-object v0, p0, LOc;->f:LEc;

    new-instance v0, LHc;

    invoke-direct {v0, p0}, LHc;-><init>(LOc;)V

    iput-object v0, p0, LOc;->h:LHc;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, LOc;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, LOc;->j:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, LOc;->k:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    new-instance v0, Ld2;

    invoke-direct {v0, p0}, Ld2;-><init>(LOc;)V

    iput-object v0, p0, LOc;->l:Ld2;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, LOc;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v0, LFc;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, LFc;-><init>(LOc;I)V

    iput-object v0, p0, LOc;->n:LFc;

    new-instance v0, LFc;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, LFc;-><init>(LOc;I)V

    iput-object v0, p0, LOc;->o:LFc;

    new-instance v0, LFc;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, LFc;-><init>(LOc;I)V

    iput-object v0, p0, LOc;->p:LFc;

    new-instance v0, LFc;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, LFc;-><init>(LOc;I)V

    iput-object v0, p0, LOc;->q:LFc;

    new-instance v0, LIc;

    invoke-direct {v0, p0}, LIc;-><init>(LOc;)V

    iput-object v0, p0, LOc;->r:LIc;

    const/4 v0, -0x1

    iput v0, p0, LOc;->s:I

    new-instance v0, LJc;

    invoke-direct {v0, p0}, LJc;-><init>(LOc;)V

    iput-object v0, p0, LOc;->x:LJc;

    new-instance v0, Lh8;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Lh8;-><init>(I)V

    iput-object v0, p0, LOc;->y:Lh8;

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, LOc;->C:Ljava/util/ArrayDeque;

    new-instance v0, Lr0;

    const/16 v1, 0x8

    invoke-direct {v0, p0, v1}, Lr0;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, LOc;->M:Lr0;

    return-void
.end method

.method public static G(Lzc;)Z
    .locals 3

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p0, p0, Lzc;->t:LOc;

    iget-object p0, p0, LOc;->c:Ljj;

    invoke-virtual {p0}, Ljj;->p()Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    move v1, v0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzc;

    if-eqz v2, :cond_1

    invoke-static {v2}, LOc;->G(Lzc;)Z

    move-result v1

    :cond_1
    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :cond_2
    return v0
.end method

.method public static I(Lzc;)Z
    .locals 2

    const/4 v0, 0x1

    if-nez p0, :cond_0

    return v0

    :cond_0
    iget-boolean v1, p0, Lzc;->B:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Lzc;->r:LOc;

    if-eqz v1, :cond_2

    iget-object p0, p0, Lzc;->u:Lzc;

    invoke-static {p0}, LOc;->I(Lzc;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :cond_2
    :goto_0
    return v0
.end method

.method public static J(Lzc;)Z
    .locals 3

    const/4 v0, 0x1

    if-nez p0, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lzc;->r:LOc;

    iget-object v2, v1, LOc;->w:Lzc;

    invoke-virtual {p0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    iget-object p0, v1, LOc;->v:Lzc;

    invoke-static {p0}, LOc;->J(Lzc;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static Y(Lzc;)V
    .locals 3

    const/4 v0, 0x2

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "show: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-boolean v0, p0, Lzc;->y:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lzc;->y:Z

    iget-boolean v0, p0, Lzc;->I:Z

    xor-int/lit8 v0, v0, 0x1

    iput-boolean v0, p0, Lzc;->I:Z

    :cond_1
    return-void
.end method


# virtual methods
.method public final A(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ls3;

    iget-boolean v5, v5, Ls3;->o:Z

    iget-object v6, v0, LOc;->K:Ljava/util/ArrayList;

    if-nez v6, :cond_0

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, v0, LOc;->K:Ljava/util/ArrayList;

    goto :goto_0

    :cond_0
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    :goto_0
    iget-object v6, v0, LOc;->K:Ljava/util/ArrayList;

    iget-object v7, v0, LOc;->c:Ljj;

    invoke-virtual {v7}, Ljj;->r()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v6, v0, LOc;->w:Lzc;

    move v9, v3

    const/4 v10, 0x0

    :goto_1
    const/4 v11, 0x1

    if-ge v9, v4, :cond_13

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ls3;

    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Boolean;

    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v14

    if-nez v14, :cond_d

    iget-object v14, v0, LOc;->K:Ljava/util/ArrayList;

    const/4 v12, 0x0

    :goto_2
    iget-object v8, v13, Ls3;->a:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v15

    if-ge v12, v15, :cond_c

    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, LZc;

    iget v3, v15, LZc;->a:I

    if-eq v3, v11, :cond_b

    const/4 v11, 0x2

    const/16 v2, 0x9

    if-eq v3, v11, :cond_5

    const/4 v11, 0x3

    if-eq v3, v11, :cond_4

    const/4 v11, 0x6

    if-eq v3, v11, :cond_4

    const/4 v11, 0x7

    if-eq v3, v11, :cond_3

    const/16 v11, 0x8

    if-eq v3, v11, :cond_1

    goto :goto_3

    :cond_1
    new-instance v3, LZc;

    const/4 v11, 0x0

    invoke-direct {v3, v2, v6, v11}, LZc;-><init>(ILzc;I)V

    invoke-virtual {v8, v12, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    const/4 v2, 0x1

    iput-boolean v2, v15, LZc;->c:Z

    add-int/lit8 v12, v12, 0x1

    iget-object v2, v15, LZc;->b:Lzc;

    move-object v6, v2

    :cond_2
    :goto_3
    move-object/from16 v20, v7

    const/4 v1, 0x1

    goto/16 :goto_8

    :cond_3
    move-object/from16 v20, v7

    const/4 v1, 0x1

    goto/16 :goto_7

    :cond_4
    iget-object v3, v15, LZc;->b:Lzc;

    invoke-virtual {v14, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v3, v15, LZc;->b:Lzc;

    if-ne v3, v6, :cond_2

    new-instance v6, LZc;

    invoke-direct {v6, v2, v3}, LZc;-><init>(ILzc;)V

    invoke-virtual {v8, v12, v6}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v12, v12, 0x1

    move-object/from16 v20, v7

    const/4 v1, 0x1

    const/4 v6, 0x0

    goto/16 :goto_8

    :cond_5
    iget-object v3, v15, LZc;->b:Lzc;

    iget v11, v3, Lzc;->w:I

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v17

    const/16 v16, 0x1

    add-int/lit8 v17, v17, -0x1

    move/from16 v2, v17

    const/16 v17, 0x0

    :goto_4
    if-ltz v2, :cond_9

    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v19

    move-object/from16 v20, v7

    move-object/from16 v7, v19

    check-cast v7, Lzc;

    iget v1, v7, Lzc;->w:I

    if-ne v1, v11, :cond_8

    if-ne v7, v3, :cond_6

    move/from16 v18, v11

    const/4 v1, 0x1

    const/16 v17, 0x1

    goto :goto_6

    :cond_6
    if-ne v7, v6, :cond_7

    new-instance v1, LZc;

    move/from16 v18, v11

    const/4 v6, 0x0

    const/16 v11, 0x9

    invoke-direct {v1, v11, v7, v6}, LZc;-><init>(ILzc;I)V

    invoke-virtual {v8, v12, v1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v12, v12, 0x1

    move v1, v6

    const/4 v6, 0x0

    goto :goto_5

    :cond_7
    move/from16 v18, v11

    const/4 v1, 0x0

    const/16 v11, 0x9

    :goto_5
    new-instance v11, LZc;

    move-object/from16 v21, v6

    const/4 v6, 0x3

    invoke-direct {v11, v6, v7, v1}, LZc;-><init>(ILzc;I)V

    iget v1, v15, LZc;->d:I

    iput v1, v11, LZc;->d:I

    iget v1, v15, LZc;->f:I

    iput v1, v11, LZc;->f:I

    iget v1, v15, LZc;->e:I

    iput v1, v11, LZc;->e:I

    iget v1, v15, LZc;->g:I

    iput v1, v11, LZc;->g:I

    invoke-virtual {v8, v12, v11}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    invoke-virtual {v14, v7}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 v1, 0x1

    add-int/2addr v12, v1

    move-object/from16 v6, v21

    goto :goto_6

    :cond_8
    move/from16 v18, v11

    const/4 v1, 0x1

    :goto_6
    add-int/lit8 v2, v2, -0x1

    move-object/from16 v1, p1

    move/from16 v11, v18

    move-object/from16 v7, v20

    goto :goto_4

    :cond_9
    move-object/from16 v20, v7

    const/4 v1, 0x1

    if-eqz v17, :cond_a

    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    add-int/lit8 v12, v12, -0x1

    goto :goto_8

    :cond_a
    iput v1, v15, LZc;->a:I

    iput-boolean v1, v15, LZc;->c:Z

    invoke-virtual {v14, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_b
    move-object/from16 v20, v7

    move v1, v11

    :goto_7
    iget-object v2, v15, LZc;->b:Lzc;

    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_8
    add-int/2addr v12, v1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move v11, v1

    move-object/from16 v7, v20

    move-object/from16 v1, p1

    goto/16 :goto_2

    :cond_c
    move-object/from16 v20, v7

    goto :goto_b

    :cond_d
    move-object/from16 v20, v7

    move v1, v11

    iget-object v2, v0, LOc;->K:Ljava/util/ArrayList;

    iget-object v3, v13, Ls3;->a:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v7

    sub-int/2addr v7, v1

    :goto_9
    if-ltz v7, :cond_10

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LZc;

    iget v11, v8, LZc;->a:I

    if-eq v11, v1, :cond_f

    const/4 v1, 0x3

    if-eq v11, v1, :cond_e

    packed-switch v11, :pswitch_data_0

    goto :goto_a

    :pswitch_0
    iget-object v11, v8, LZc;->h:Lug;

    iput-object v11, v8, LZc;->i:Lug;

    goto :goto_a

    :pswitch_1
    iget-object v6, v8, LZc;->b:Lzc;

    goto :goto_a

    :pswitch_2
    const/4 v6, 0x0

    goto :goto_a

    :cond_e
    :pswitch_3
    iget-object v8, v8, LZc;->b:Lzc;

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_f
    const/4 v1, 0x3

    :pswitch_4
    iget-object v8, v8, LZc;->b:Lzc;

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :goto_a
    add-int/lit8 v7, v7, -0x1

    const/4 v1, 0x1

    goto :goto_9

    :cond_10
    :goto_b
    if-nez v10, :cond_12

    iget-boolean v1, v13, Ls3;->g:Z

    if-eqz v1, :cond_11

    goto :goto_c

    :cond_11
    const/4 v10, 0x0

    goto :goto_d

    :cond_12
    :goto_c
    const/4 v10, 0x1

    :goto_d
    add-int/lit8 v9, v9, 0x1

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move-object/from16 v7, v20

    goto/16 :goto_1

    :cond_13
    move-object/from16 v20, v7

    iget-object v1, v0, LOc;->K:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    if-nez v5, :cond_16

    iget v1, v0, LOc;->s:I

    const/4 v2, 0x1

    if-lt v1, v2, :cond_16

    move/from16 v1, p3

    :goto_e
    if-ge v1, v4, :cond_16

    move-object/from16 v2, p1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ls3;

    iget-object v3, v3, Ls3;->a:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_15

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LZc;

    iget-object v5, v5, LZc;->b:Lzc;

    if-eqz v5, :cond_14

    iget-object v6, v5, Lzc;->r:LOc;

    if-eqz v6, :cond_14

    invoke-virtual {v0, v5}, LOc;->f(Lzc;)LVc;

    move-result-object v5

    move-object/from16 v6, v20

    invoke-virtual {v6, v5}, Ljj;->s(LVc;)V

    goto :goto_10

    :cond_14
    move-object/from16 v6, v20

    :goto_10
    move-object/from16 v20, v6

    goto :goto_f

    :cond_15
    move-object/from16 v6, v20

    add-int/lit8 v1, v1, 0x1

    goto :goto_e

    :cond_16
    move-object/from16 v2, p1

    move/from16 v1, p3

    :goto_11
    const/4 v3, -0x1

    if-ge v1, v4, :cond_22

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ls3;

    move-object/from16 v6, p2

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    const-string v8, "Unknown cmd: "

    if-eqz v7, :cond_1e

    invoke-virtual {v5, v3}, Ls3;->c(I)V

    iget-object v3, v5, Ls3;->a:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v7

    const/4 v9, 0x1

    sub-int/2addr v7, v9

    :goto_12
    if-ltz v7, :cond_1d

    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LZc;

    iget-object v11, v10, LZc;->b:Lzc;

    if-eqz v11, :cond_1c

    iget-object v12, v11, Lzc;->H:Lxc;

    if-nez v12, :cond_17

    goto :goto_13

    :cond_17
    invoke-virtual {v11}, Lzc;->e()Lxc;

    move-result-object v12

    iput-boolean v9, v12, Lxc;->a:Z

    :goto_13
    iget v9, v5, Ls3;->f:I

    const/16 v12, 0x2002

    const/16 v13, 0x1001

    if-eq v9, v13, :cond_1a

    if-eq v9, v12, :cond_18

    const/16 v12, 0x1004

    const/16 v13, 0x2005

    if-eq v9, v13, :cond_1a

    const/16 v14, 0x1003

    if-eq v9, v14, :cond_19

    if-eq v9, v12, :cond_18

    const/4 v12, 0x0

    goto :goto_14

    :cond_18
    move v12, v13

    goto :goto_14

    :cond_19
    move v12, v14

    :cond_1a
    :goto_14
    iget-object v9, v11, Lzc;->H:Lxc;

    if-nez v9, :cond_1b

    if-nez v12, :cond_1b

    goto :goto_15

    :cond_1b
    invoke-virtual {v11}, Lzc;->e()Lxc;

    iget-object v9, v11, Lzc;->H:Lxc;

    iput v12, v9, Lxc;->f:I

    :goto_15
    invoke-virtual {v11}, Lzc;->e()Lxc;

    iget-object v9, v11, Lzc;->H:Lxc;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_1c
    iget v9, v10, LZc;->a:I

    iget-object v12, v5, Ls3;->p:LOc;

    packed-switch v9, :pswitch_data_1

    :pswitch_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, v10, LZc;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_6
    iget-object v9, v10, LZc;->h:Lug;

    invoke-virtual {v12, v11, v9}, LOc;->V(Lzc;Lug;)V

    :goto_16
    const/4 v9, 0x1

    goto/16 :goto_17

    :pswitch_7
    invoke-virtual {v12, v11}, LOc;->W(Lzc;)V

    goto :goto_16

    :pswitch_8
    const/4 v9, 0x0

    invoke-virtual {v12, v9}, LOc;->W(Lzc;)V

    goto :goto_16

    :pswitch_9
    iget v9, v10, LZc;->d:I

    iget v13, v10, LZc;->e:I

    iget v14, v10, LZc;->f:I

    iget v10, v10, LZc;->g:I

    invoke-virtual {v11, v9, v13, v14, v10}, Lzc;->K(IIII)V

    const/4 v9, 0x1

    invoke-virtual {v12, v11, v9}, LOc;->U(Lzc;Z)V

    invoke-virtual {v12, v11}, LOc;->g(Lzc;)V

    goto :goto_16

    :pswitch_a
    iget v9, v10, LZc;->d:I

    iget v13, v10, LZc;->e:I

    iget v14, v10, LZc;->f:I

    iget v10, v10, LZc;->g:I

    invoke-virtual {v11, v9, v13, v14, v10}, Lzc;->K(IIII)V

    invoke-virtual {v12, v11}, LOc;->c(Lzc;)V

    goto :goto_16

    :pswitch_b
    iget v9, v10, LZc;->d:I

    iget v13, v10, LZc;->e:I

    iget v14, v10, LZc;->f:I

    iget v10, v10, LZc;->g:I

    invoke-virtual {v11, v9, v13, v14, v10}, Lzc;->K(IIII)V

    const/4 v9, 0x1

    invoke-virtual {v12, v11, v9}, LOc;->U(Lzc;Z)V

    invoke-virtual {v12, v11}, LOc;->F(Lzc;)V

    goto :goto_16

    :pswitch_c
    iget v9, v10, LZc;->d:I

    iget v13, v10, LZc;->e:I

    iget v14, v10, LZc;->f:I

    iget v10, v10, LZc;->g:I

    invoke-virtual {v11, v9, v13, v14, v10}, Lzc;->K(IIII)V

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v11}, LOc;->Y(Lzc;)V

    goto :goto_16

    :pswitch_d
    iget v9, v10, LZc;->d:I

    iget v13, v10, LZc;->e:I

    iget v14, v10, LZc;->f:I

    iget v10, v10, LZc;->g:I

    invoke-virtual {v11, v9, v13, v14, v10}, Lzc;->K(IIII)V

    invoke-virtual {v12, v11}, LOc;->a(Lzc;)LVc;

    goto :goto_16

    :pswitch_e
    iget v9, v10, LZc;->d:I

    iget v13, v10, LZc;->e:I

    iget v14, v10, LZc;->f:I

    iget v10, v10, LZc;->g:I

    invoke-virtual {v11, v9, v13, v14, v10}, Lzc;->K(IIII)V

    const/4 v9, 0x1

    invoke-virtual {v12, v11, v9}, LOc;->U(Lzc;Z)V

    invoke-virtual {v12, v11}, LOc;->P(Lzc;)V

    :goto_17
    add-int/lit8 v7, v7, -0x1

    goto/16 :goto_12

    :cond_1d
    const/4 v9, 0x0

    goto/16 :goto_1d

    :cond_1e
    const/4 v9, 0x1

    invoke-virtual {v5, v9}, Ls3;->c(I)V

    iget-object v3, v5, Ls3;->a:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v7

    const/4 v11, 0x0

    :goto_18
    if-ge v11, v7, :cond_1d

    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LZc;

    iget-object v10, v9, LZc;->b:Lzc;

    if-eqz v10, :cond_21

    iget-object v12, v10, Lzc;->H:Lxc;

    if-nez v12, :cond_1f

    goto :goto_19

    :cond_1f
    invoke-virtual {v10}, Lzc;->e()Lxc;

    move-result-object v12

    const/4 v13, 0x0

    iput-boolean v13, v12, Lxc;->a:Z

    :goto_19
    iget v12, v5, Ls3;->f:I

    iget-object v13, v10, Lzc;->H:Lxc;

    if-nez v13, :cond_20

    if-nez v12, :cond_20

    goto :goto_1a

    :cond_20
    invoke-virtual {v10}, Lzc;->e()Lxc;

    iget-object v13, v10, Lzc;->H:Lxc;

    iput v12, v13, Lxc;->f:I

    :goto_1a
    invoke-virtual {v10}, Lzc;->e()Lxc;

    iget-object v12, v10, Lzc;->H:Lxc;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_21
    iget v12, v9, LZc;->a:I

    iget-object v13, v5, Ls3;->p:LOc;

    packed-switch v12, :pswitch_data_2

    :pswitch_f
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v3, v9, LZc;->a:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_10
    iget-object v9, v9, LZc;->i:Lug;

    invoke-virtual {v13, v10, v9}, LOc;->V(Lzc;Lug;)V

    :goto_1b
    const/4 v9, 0x0

    goto/16 :goto_1c

    :pswitch_11
    const/4 v12, 0x0

    invoke-virtual {v13, v12}, LOc;->W(Lzc;)V

    goto :goto_1b

    :pswitch_12
    const/4 v12, 0x0

    invoke-virtual {v13, v10}, LOc;->W(Lzc;)V

    goto :goto_1b

    :pswitch_13
    const/4 v12, 0x0

    iget v14, v9, LZc;->d:I

    iget v15, v9, LZc;->e:I

    iget v12, v9, LZc;->f:I

    iget v9, v9, LZc;->g:I

    invoke-virtual {v10, v14, v15, v12, v9}, Lzc;->K(IIII)V

    const/4 v9, 0x0

    invoke-virtual {v13, v10, v9}, LOc;->U(Lzc;Z)V

    invoke-virtual {v13, v10}, LOc;->c(Lzc;)V

    goto :goto_1b

    :pswitch_14
    iget v12, v9, LZc;->d:I

    iget v14, v9, LZc;->e:I

    iget v15, v9, LZc;->f:I

    iget v9, v9, LZc;->g:I

    invoke-virtual {v10, v12, v14, v15, v9}, Lzc;->K(IIII)V

    invoke-virtual {v13, v10}, LOc;->g(Lzc;)V

    goto :goto_1b

    :pswitch_15
    iget v12, v9, LZc;->d:I

    iget v14, v9, LZc;->e:I

    iget v15, v9, LZc;->f:I

    iget v9, v9, LZc;->g:I

    invoke-virtual {v10, v12, v14, v15, v9}, Lzc;->K(IIII)V

    const/4 v9, 0x0

    invoke-virtual {v13, v10, v9}, LOc;->U(Lzc;Z)V

    invoke-static {v10}, LOc;->Y(Lzc;)V

    goto :goto_1b

    :pswitch_16
    iget v12, v9, LZc;->d:I

    iget v14, v9, LZc;->e:I

    iget v15, v9, LZc;->f:I

    iget v9, v9, LZc;->g:I

    invoke-virtual {v10, v12, v14, v15, v9}, Lzc;->K(IIII)V

    invoke-virtual {v13, v10}, LOc;->F(Lzc;)V

    goto :goto_1b

    :pswitch_17
    iget v12, v9, LZc;->d:I

    iget v14, v9, LZc;->e:I

    iget v15, v9, LZc;->f:I

    iget v9, v9, LZc;->g:I

    invoke-virtual {v10, v12, v14, v15, v9}, Lzc;->K(IIII)V

    invoke-virtual {v13, v10}, LOc;->P(Lzc;)V

    goto :goto_1b

    :pswitch_18
    iget v12, v9, LZc;->d:I

    iget v14, v9, LZc;->e:I

    iget v15, v9, LZc;->f:I

    iget v9, v9, LZc;->g:I

    invoke-virtual {v10, v12, v14, v15, v9}, Lzc;->K(IIII)V

    const/4 v9, 0x0

    invoke-virtual {v13, v10, v9}, LOc;->U(Lzc;Z)V

    invoke-virtual {v13, v10}, LOc;->a(Lzc;)LVc;

    :goto_1c
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_18

    :goto_1d
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_11

    :cond_22
    move-object/from16 v6, p2

    add-int/lit8 v1, v4, -0x1

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    move/from16 v5, p3

    :goto_1e
    if-ge v5, v4, :cond_27

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ls3;

    if-eqz v1, :cond_24

    iget-object v8, v7, Ls3;->a:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    const/4 v9, 0x1

    sub-int/2addr v8, v9

    :goto_1f
    if-ltz v8, :cond_26

    iget-object v9, v7, Ls3;->a:Ljava/util/ArrayList;

    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LZc;

    iget-object v9, v9, LZc;->b:Lzc;

    if-eqz v9, :cond_23

    invoke-virtual {v0, v9}, LOc;->f(Lzc;)LVc;

    move-result-object v9

    invoke-virtual {v9}, LVc;->k()V

    :cond_23
    add-int/lit8 v8, v8, -0x1

    goto :goto_1f

    :cond_24
    iget-object v7, v7, Ls3;->a:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_25
    :goto_20
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_26

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LZc;

    iget-object v8, v8, LZc;->b:Lzc;

    if-eqz v8, :cond_25

    invoke-virtual {v0, v8}, LOc;->f(Lzc;)LVc;

    move-result-object v8

    invoke-virtual {v8}, LVc;->k()V

    goto :goto_20

    :cond_26
    add-int/lit8 v5, v5, 0x1

    goto :goto_1e

    :cond_27
    iget v5, v0, LOc;->s:I

    const/4 v7, 0x1

    invoke-virtual {v0, v5, v7}, LOc;->K(IZ)V

    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    move/from16 v7, p3

    :goto_21
    if-ge v7, v4, :cond_2a

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ls3;

    iget-object v8, v8, Ls3;->a:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_28
    :goto_22
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_29

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LZc;

    iget-object v9, v9, LZc;->b:Lzc;

    if-eqz v9, :cond_28

    iget-object v9, v9, Lzc;->D:Landroid/view/ViewGroup;

    if-eqz v9, :cond_28

    invoke-virtual/range {p0 .. p0}, LOc;->E()Lh8;

    move-result-object v10

    invoke-static {v9, v10}, LO8;->f(Landroid/view/ViewGroup;Lh8;)LO8;

    move-result-object v9

    invoke-virtual {v5, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_22

    :cond_29
    add-int/lit8 v7, v7, 0x1

    goto :goto_21

    :cond_2a
    invoke-virtual {v5}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_23
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LO8;

    iput-boolean v1, v7, LO8;->d:Z

    invoke-virtual {v7}, LO8;->g()V

    invoke-virtual {v7}, LO8;->c()V

    goto :goto_23

    :cond_2b
    move/from16 v1, p3

    :goto_24
    if-ge v1, v4, :cond_2d

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ls3;

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-eqz v7, :cond_2c

    iget v7, v5, Ls3;->r:I

    if-ltz v7, :cond_2c

    iput v3, v5, Ls3;->r:I

    :cond_2c
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v1, v1, 0x1

    goto :goto_24

    :cond_2d
    return-void

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_e
        :pswitch_5
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_18
        :pswitch_f
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
    .end packed-switch
.end method

.method public final B(I)Lzc;
    .locals 5

    iget-object v0, p0, LOc;->c:Ljj;

    iget-object v1, v0, Ljj;->a:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    :goto_0
    if-ltz v2, :cond_1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lzc;

    if-eqz v3, :cond_0

    iget v4, v3, Lzc;->v:I

    if-ne v4, p1, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_1
    iget-object v0, v0, Ljj;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LVc;

    if-eqz v1, :cond_2

    iget-object v3, v1, LVc;->c:Lzc;

    iget v1, v3, Lzc;->v:I

    if-ne v1, p1, :cond_2

    goto :goto_1

    :cond_3
    const/4 v3, 0x0

    :goto_1
    return-object v3
.end method

.method public final C(Lzc;)Landroid/view/ViewGroup;
    .locals 2

    iget-object v0, p1, Lzc;->D:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget v0, p1, Lzc;->w:I

    const/4 v1, 0x0

    if-gtz v0, :cond_1

    return-object v1

    :cond_1
    iget-object v0, p0, LOc;->u:LBr;

    invoke-virtual {v0}, LBr;->Q()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LOc;->u:LBr;

    iget p1, p1, Lzc;->w:I

    invoke-virtual {v0, p1}, LBr;->N(I)Landroid/view/View;

    move-result-object p1

    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    check-cast p1, Landroid/view/ViewGroup;

    return-object p1

    :cond_2
    return-object v1
.end method

.method public final D()LJc;
    .locals 1

    iget-object v0, p0, LOc;->v:Lzc;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lzc;->r:LOc;

    invoke-virtual {v0}, LOc;->D()LJc;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, LOc;->x:LJc;

    return-object v0
.end method

.method public final E()Lh8;
    .locals 1

    iget-object v0, p0, LOc;->v:Lzc;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lzc;->r:LOc;

    invoke-virtual {v0}, LOc;->E()Lh8;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, LOc;->y:Lh8;

    return-object v0
.end method

.method public final F(Lzc;)V
    .locals 3

    const-string v0, "FragmentManager"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "hide: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-boolean v0, p1, Lzc;->y:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p1, Lzc;->y:Z

    iget-boolean v1, p1, Lzc;->I:Z

    xor-int/2addr v0, v1

    iput-boolean v0, p1, Lzc;->I:Z

    invoke-virtual {p0, p1}, LOc;->X(Lzc;)V

    :cond_1
    return-void
.end method

.method public final H()Z
    .locals 2

    iget-object v0, p0, LOc;->v:Lzc;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Lzc;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, LOc;->v:Lzc;

    invoke-virtual {v0}, Lzc;->j()LOc;

    move-result-object v0

    invoke-virtual {v0}, LOc;->H()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public final K(IZ)V
    .locals 3

    iget-object v0, p0, LOc;->t:LBc;

    if-nez v0, :cond_1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "No activity"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-nez p2, :cond_2

    iget p2, p0, LOc;->s:I

    if-ne p1, p2, :cond_2

    return-void

    :cond_2
    iput p1, p0, LOc;->s:I

    iget-object p1, p0, LOc;->c:Ljj;

    iget-object p2, p1, Ljj;->a:Ljava/lang/Object;

    check-cast p2, Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_3
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    iget-object v1, p1, Ljj;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    if-eqz v0, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzc;

    iget-object v0, v0, Lzc;->e:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LVc;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LVc;->k()V

    goto :goto_1

    :cond_4
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_5
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LVc;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, LVc;->k()V

    iget-object v1, v0, LVc;->c:Lzc;

    iget-boolean v2, v1, Lzc;->l:Z

    if-eqz v2, :cond_5

    invoke-virtual {v1}, Lzc;->r()Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {p1, v0}, Ljj;->t(LVc;)V

    goto :goto_2

    :cond_6
    invoke-virtual {p0}, LOc;->Z()V

    iget-boolean p1, p0, LOc;->D:Z

    if-eqz p1, :cond_7

    iget-object p1, p0, LOc;->t:LBc;

    if-eqz p1, :cond_7

    iget p2, p0, LOc;->s:I

    const/4 v0, 0x7

    if-ne p2, v0, :cond_7

    iget-object p1, p1, LBc;->n:Lq1;

    invoke-virtual {p1}, Landroid/app/Activity;->invalidateOptionsMenu()V

    const/4 p1, 0x0

    iput-boolean p1, p0, LOc;->D:Z

    :cond_7
    return-void
.end method

.method public final L()V
    .locals 2

    iget-object v0, p0, LOc;->t:LBc;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, LOc;->E:Z

    iput-boolean v0, p0, LOc;->F:Z

    iget-object v1, p0, LOc;->L:LRc;

    iput-boolean v0, v1, LRc;->g:Z

    iget-object v0, p0, LOc;->c:Ljj;

    invoke-virtual {v0}, Ljj;->r()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzc;

    if-eqz v1, :cond_1

    iget-object v1, v1, Lzc;->t:LOc;

    invoke-virtual {v1}, LOc;->L()V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final M()Z
    .locals 2

    const/4 v0, -0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, LOc;->N(II)Z

    move-result v0

    return v0
.end method

.method public final N(II)Z
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, LOc;->y(Z)Z

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, LOc;->x(Z)V

    iget-object v1, p0, LOc;->w:Lzc;

    if-eqz v1, :cond_0

    if-gez p1, :cond_0

    invoke-virtual {v1}, Lzc;->g()LOc;

    move-result-object v1

    invoke-virtual {v1}, LOc;->M()Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, LOc;->I:Ljava/util/ArrayList;

    iget-object v2, p0, LOc;->J:Ljava/util/ArrayList;

    invoke-virtual {p0, v1, v2, p1, p2}, LOc;->O(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z

    move-result p1

    if-eqz p1, :cond_1

    iput-boolean v0, p0, LOc;->b:Z

    :try_start_0
    iget-object p2, p0, LOc;->I:Ljava/util/ArrayList;

    iget-object v0, p0, LOc;->J:Ljava/util/ArrayList;

    invoke-virtual {p0, p2, v0}, LOc;->Q(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, LOc;->d()V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, LOc;->d()V

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {p0}, LOc;->b0()V

    invoke-virtual {p0}, LOc;->u()V

    iget-object p2, p0, LOc;->c:Ljj;

    iget-object p2, p2, Ljj;->b:Ljava/lang/Object;

    check-cast p2, Ljava/util/HashMap;

    invoke-virtual {p2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    return p1
.end method

.method public final O(Ljava/util/ArrayList;Ljava/util/ArrayList;II)Z
    .locals 5

    const/4 v0, 0x1

    and-int/2addr p4, v0

    const/4 v1, 0x0

    if-eqz p4, :cond_0

    move p4, v0

    goto :goto_0

    :cond_0
    move p4, v1

    :goto_0
    iget-object v2, p0, LOc;->d:Ljava/util/ArrayList;

    const/4 v3, -0x1

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_5

    :cond_1
    if-gez p3, :cond_3

    if-eqz p4, :cond_2

    move v3, v1

    goto :goto_5

    :cond_2
    iget-object p3, p0, LOc;->d:Ljava/util/ArrayList;

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p3

    add-int/lit8 v3, p3, -0x1

    goto :goto_5

    :cond_3
    iget-object v2, p0, LOc;->d:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-int/2addr v2, v0

    :goto_1
    if-ltz v2, :cond_5

    iget-object v4, p0, LOc;->d:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ls3;

    if-ltz p3, :cond_4

    iget v4, v4, Ls3;->r:I

    if-ne p3, v4, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 v2, v2, -0x1

    goto :goto_1

    :cond_5
    :goto_2
    if-gez v2, :cond_7

    :cond_6
    :goto_3
    move v3, v2

    goto :goto_5

    :cond_7
    if-eqz p4, :cond_8

    :goto_4
    if-lez v2, :cond_6

    iget-object p4, p0, LOc;->d:Ljava/util/ArrayList;

    add-int/lit8 v3, v2, -0x1

    invoke-virtual {p4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ls3;

    if-ltz p3, :cond_6

    iget p4, p4, Ls3;->r:I

    if-ne p3, p4, :cond_6

    add-int/lit8 v2, v2, -0x1

    goto :goto_4

    :cond_8
    iget-object p3, p0, LOc;->d:Ljava/util/ArrayList;

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p3

    sub-int/2addr p3, v0

    if-ne v2, p3, :cond_9

    goto :goto_5

    :cond_9
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_a
    :goto_5
    if-gez v3, :cond_b

    return v1

    :cond_b
    iget-object p3, p0, LOc;->d:Ljava/util/ArrayList;

    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    move-result p3

    sub-int/2addr p3, v0

    :goto_6
    if-lt p3, v3, :cond_c

    iget-object p4, p0, LOc;->d:Ljava/util/ArrayList;

    invoke-virtual {p4, p3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ls3;

    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p2, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p3, p3, -0x1

    goto :goto_6

    :cond_c
    return v0
.end method

.method public final P(Lzc;)V
    .locals 3

    const-string v0, "FragmentManager"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "remove: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " nesting="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p1, Lzc;->q:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-virtual {p1}, Lzc;->r()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    iget-boolean v2, p1, Lzc;->z:Z

    if-eqz v2, :cond_1

    if-eqz v0, :cond_3

    :cond_1
    iget-object v0, p0, LOc;->c:Ljj;

    iget-object v2, v0, Ljj;->a:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    monitor-enter v2

    :try_start_0
    iget-object v0, v0, Ljj;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    iput-boolean v0, p1, Lzc;->k:Z

    invoke-static {p1}, LOc;->G(Lzc;)Z

    move-result v0

    if-eqz v0, :cond_2

    iput-boolean v1, p0, LOc;->D:Z

    :cond_2
    iput-boolean v1, p1, Lzc;->l:Z

    invoke-virtual {p0, p1}, LOc;->X(Lzc;)V

    :cond_3
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final Q(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ne v0, v1, :cond_6

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_4

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ls3;

    iget-boolean v3, v3, Ls3;->o:Z

    if-nez v3, :cond_3

    if-eq v2, v1, :cond_1

    invoke-virtual {p0, p1, p2, v2, v1}, LOc;->A(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    :cond_1
    add-int/lit8 v2, v1, 0x1

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2

    :goto_1
    if-ge v2, v0, :cond_2

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ls3;

    iget-boolean v3, v3, Ls3;->o:Z

    if-nez v3, :cond_2

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {p0, p1, p2, v1, v2}, LOc;->A(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    add-int/lit8 v1, v2, -0x1

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    if-eq v2, v0, :cond_5

    invoke-virtual {p0, p1, p2, v2, v0}, LOc;->A(Ljava/util/ArrayList;Ljava/util/ArrayList;II)V

    :cond_5
    return-void

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Internal error with the back stack records"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final R(Landroid/os/Parcelable;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    check-cast v1, Landroid/os/Bundle;

    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "result_"

    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v4

    if-eqz v4, :cond_0

    iget-object v5, v0, LOc;->t:LBc;

    iget-object v5, v5, LBc;->k:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    const/4 v5, 0x7

    invoke-virtual {v3, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    iget-object v5, v0, LOc;->k:Ljava/util/Map;

    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const-string v5, "state"

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const-string v6, "fragment_"

    invoke-virtual {v4, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v4

    if-eqz v4, :cond_2

    iget-object v6, v0, LOc;->t:LBc;

    iget-object v6, v6, LBc;->k:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v6

    invoke-virtual {v4, v6}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    invoke-virtual {v4, v5}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v4

    check-cast v4, LUc;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    iget-object v3, v0, LOc;->c:Ljj;

    iget-object v4, v3, Ljj;->c:Ljava/lang/Object;

    check-cast v4, Ljava/util/HashMap;

    invoke-virtual {v4}, Ljava/util/HashMap;->clear()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LUc;

    iget-object v7, v6, LUc;->b:Ljava/lang/String;

    invoke-virtual {v4, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_4
    invoke-virtual {v1, v5}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, LPc;

    if-nez v1, :cond_5

    return-void

    :cond_5
    iget-object v2, v3, Ljj;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->clear()V

    iget-object v4, v1, LPc;->a:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_6
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x2

    iget-object v7, v0, LOc;->l:Ld2;

    const-string v8, "): "

    const-string v9, "FragmentManager"

    if-eqz v5, :cond_a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    iget-object v10, v3, Ljj;->c:Ljava/lang/Object;

    check-cast v10, Ljava/util/HashMap;

    invoke-virtual {v10, v5}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    move-object v15, v5

    check-cast v15, LUc;

    if-eqz v15, :cond_6

    iget-object v5, v0, LOc;->L:LRc;

    iget-object v5, v5, LRc;->b:Ljava/util/HashMap;

    iget-object v10, v15, LUc;->b:Ljava/lang/String;

    invoke-virtual {v5, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lzc;

    if-eqz v5, :cond_8

    invoke-static {v9, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v10

    if-eqz v10, :cond_7

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "restoreSaveState: re-attaching retained "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7
    new-instance v10, LVc;

    invoke-direct {v10, v7, v3, v5, v15}, LVc;-><init>(Ld2;Ljj;Lzc;LUc;)V

    goto :goto_4

    :cond_8
    new-instance v5, LVc;

    iget-object v7, v0, LOc;->t:LBc;

    iget-object v7, v7, LBc;->k:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v13

    invoke-virtual/range {p0 .. p0}, LOc;->D()LJc;

    move-result-object v14

    iget-object v11, v0, LOc;->l:Ld2;

    iget-object v12, v0, LOc;->c:Ljj;

    move-object v10, v5

    invoke-direct/range {v10 .. v15}, LVc;-><init>(Ld2;Ljj;Ljava/lang/ClassLoader;LJc;LUc;)V

    :goto_4
    iget-object v5, v10, LVc;->c:Lzc;

    iput-object v0, v5, Lzc;->r:LOc;

    invoke-static {v9, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v6

    if-eqz v6, :cond_9

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "restoreSaveState: active ("

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v7, v5, Lzc;->e:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v9, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_9
    iget-object v5, v0, LOc;->t:LBc;

    iget-object v5, v5, LBc;->k:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v5

    invoke-virtual {v10, v5}, LVc;->m(Ljava/lang/ClassLoader;)V

    invoke-virtual {v3, v10}, Ljj;->s(LVc;)V

    iget v5, v0, LOc;->s:I

    iput v5, v10, LVc;->e:I

    goto/16 :goto_3

    :cond_a
    iget-object v4, v0, LOc;->L:LRc;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v5, Ljava/util/ArrayList;

    iget-object v4, v4, LRc;->b:Ljava/util/HashMap;

    invoke-virtual {v4}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v4

    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v10, 0x1

    if-eqz v5, :cond_d

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lzc;

    iget-object v11, v5, Lzc;->e:Ljava/lang/String;

    invoke-virtual {v2, v11}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    if-eqz v11, :cond_b

    goto :goto_5

    :cond_b
    invoke-static {v9, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v11

    if-eqz v11, :cond_c

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "Discarding retained Fragment "

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v12, " that was not found in the set of active Fragments "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v12, v1, LPc;->a:Ljava/util/ArrayList;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v9, v11}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_c
    iget-object v11, v0, LOc;->L:LRc;

    invoke-virtual {v11, v5}, LRc;->e(Lzc;)V

    iput-object v0, v5, Lzc;->r:LOc;

    new-instance v11, LVc;

    invoke-direct {v11, v7, v3, v5}, LVc;-><init>(Ld2;Ljj;Lzc;)V

    iput v10, v11, LVc;->e:I

    invoke-virtual {v11}, LVc;->k()V

    iput-boolean v10, v5, Lzc;->l:Z

    invoke-virtual {v11}, LVc;->k()V

    goto :goto_5

    :cond_d
    iget-object v2, v1, LPc;->b:Ljava/util/ArrayList;

    iget-object v4, v3, Ljj;->a:Ljava/lang/Object;

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    if-eqz v2, :cond_10

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_10

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljj;->h(Ljava/lang/String;)Lzc;

    move-result-object v5

    if-eqz v5, :cond_f

    invoke-static {v9, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v7

    if-eqz v7, :cond_e

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v11, "restoreSaveState: added ("

    invoke-direct {v7, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v9, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_e
    invoke-virtual {v3, v5}, Ljj;->b(Lzc;)V

    goto :goto_6

    :cond_f
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "No instantiated fragment for ("

    const-string v3, ")"

    invoke-static {v2, v4, v3}, LVo;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_10
    iget-object v2, v1, LPc;->c:[Lt3;

    if-eqz v2, :cond_18

    new-instance v2, Ljava/util/ArrayList;

    iget-object v5, v1, LPc;->c:[Lt3;

    array-length v5, v5

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v2, v0, LOc;->d:Ljava/util/ArrayList;

    const/4 v2, 0x0

    :goto_7
    iget-object v5, v1, LPc;->c:[Lt3;

    array-length v7, v5

    if-ge v2, v7, :cond_17

    aget-object v5, v5, v2

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v7, Ls3;

    invoke-direct {v7, v0}, Ls3;-><init>(LOc;)V

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_8
    iget-object v13, v5, Lt3;->a:[I

    array-length v14, v13

    if-ge v11, v14, :cond_13

    new-instance v14, LZc;

    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    add-int/lit8 v15, v11, 0x1

    aget v4, v13, v11

    iput v4, v14, LZc;->a:I

    invoke-static {v9, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v4

    if-eqz v4, :cond_11

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v6, "Instantiate "

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " op #"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, " base fragment #"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget v6, v13, v15

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v9, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_11
    invoke-static {}, Lug;->values()[Lug;

    move-result-object v4

    iget-object v6, v5, Lt3;->c:[I

    aget v6, v6, v12

    aget-object v4, v4, v6

    iput-object v4, v14, LZc;->h:Lug;

    invoke-static {}, Lug;->values()[Lug;

    move-result-object v4

    iget-object v6, v5, Lt3;->d:[I

    aget v6, v6, v12

    aget-object v4, v4, v6

    iput-object v4, v14, LZc;->i:Lug;

    add-int/lit8 v4, v11, 0x2

    aget v6, v13, v15

    if-eqz v6, :cond_12

    move v6, v10

    goto :goto_9

    :cond_12
    const/4 v6, 0x0

    :goto_9
    iput-boolean v6, v14, LZc;->c:Z

    add-int/lit8 v6, v11, 0x3

    aget v4, v13, v4

    iput v4, v14, LZc;->d:I

    add-int/lit8 v15, v11, 0x4

    aget v6, v13, v6

    iput v6, v14, LZc;->e:I

    add-int/lit8 v16, v11, 0x5

    aget v15, v13, v15

    iput v15, v14, LZc;->f:I

    add-int/lit8 v11, v11, 0x6

    aget v13, v13, v16

    iput v13, v14, LZc;->g:I

    iput v4, v7, Ls3;->b:I

    iput v6, v7, Ls3;->c:I

    iput v15, v7, Ls3;->d:I

    iput v13, v7, Ls3;->e:I

    invoke-virtual {v7, v14}, Ls3;->b(LZc;)V

    add-int/lit8 v12, v12, 0x1

    const/4 v6, 0x2

    goto/16 :goto_8

    :cond_13
    iget v4, v5, Lt3;->e:I

    iput v4, v7, Ls3;->f:I

    iget-object v4, v5, Lt3;->f:Ljava/lang/String;

    iput-object v4, v7, Ls3;->h:Ljava/lang/String;

    iput-boolean v10, v7, Ls3;->g:Z

    iget v4, v5, Lt3;->h:I

    iput v4, v7, Ls3;->i:I

    iget-object v4, v5, Lt3;->i:Ljava/lang/CharSequence;

    iput-object v4, v7, Ls3;->j:Ljava/lang/CharSequence;

    iget v4, v5, Lt3;->j:I

    iput v4, v7, Ls3;->k:I

    iget-object v4, v5, Lt3;->k:Ljava/lang/CharSequence;

    iput-object v4, v7, Ls3;->l:Ljava/lang/CharSequence;

    iget-object v4, v5, Lt3;->l:Ljava/util/ArrayList;

    iput-object v4, v7, Ls3;->m:Ljava/util/ArrayList;

    iget-object v4, v5, Lt3;->m:Ljava/util/ArrayList;

    iput-object v4, v7, Ls3;->n:Ljava/util/ArrayList;

    iget-boolean v4, v5, Lt3;->n:Z

    iput-boolean v4, v7, Ls3;->o:Z

    iget v4, v5, Lt3;->g:I

    iput v4, v7, Ls3;->r:I

    const/4 v4, 0x0

    :goto_a
    iget-object v6, v5, Lt3;->b:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-ge v4, v11, :cond_15

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    if-eqz v6, :cond_14

    iget-object v11, v7, Ls3;->a:Ljava/util/ArrayList;

    invoke-virtual {v11, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LZc;

    invoke-virtual {v3, v6}, Ljj;->h(Ljava/lang/String;)Lzc;

    move-result-object v6

    iput-object v6, v11, LZc;->b:Lzc;

    :cond_14
    add-int/lit8 v4, v4, 0x1

    goto :goto_a

    :cond_15
    invoke-virtual {v7, v10}, Ls3;->c(I)V

    const/4 v4, 0x2

    invoke-static {v9, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_16

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "restoreAllState: back stack #"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, " (index "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, v7, Ls3;->r:I

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v9, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v5, Lph;

    invoke-direct {v5}, Lph;-><init>()V

    new-instance v6, Ljava/io/PrintWriter;

    invoke-direct {v6, v5}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    const-string v5, "  "

    const/4 v11, 0x0

    invoke-virtual {v7, v5, v6, v11}, Ls3;->f(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    invoke-virtual {v6}, Ljava/io/PrintWriter;->close()V

    goto :goto_b

    :cond_16
    const/4 v11, 0x0

    :goto_b
    iget-object v5, v0, LOc;->d:Ljava/util/ArrayList;

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    move v6, v4

    goto/16 :goto_7

    :cond_17
    const/4 v11, 0x0

    goto :goto_c

    :cond_18
    const/4 v11, 0x0

    const/4 v2, 0x0

    iput-object v2, v0, LOc;->d:Ljava/util/ArrayList;

    :goto_c
    iget-object v2, v0, LOc;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    iget v4, v1, LPc;->d:I

    invoke-virtual {v2, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    iget-object v2, v1, LPc;->e:Ljava/lang/String;

    if-eqz v2, :cond_19

    invoke-virtual {v3, v2}, Ljj;->h(Ljava/lang/String;)Lzc;

    move-result-object v2

    iput-object v2, v0, LOc;->w:Lzc;

    invoke-virtual {v0, v2}, LOc;->q(Lzc;)V

    :cond_19
    iget-object v2, v1, LPc;->f:Ljava/util/ArrayList;

    if-eqz v2, :cond_1a

    move v4, v11

    :goto_d
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v4, v3, :cond_1a

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    iget-object v5, v1, LPc;->g:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lu3;

    iget-object v6, v0, LOc;->j:Ljava/util/Map;

    invoke-interface {v6, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    goto :goto_d

    :cond_1a
    new-instance v2, Ljava/util/ArrayDeque;

    iget-object v1, v1, LPc;->h:Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    iput-object v2, v0, LOc;->C:Ljava/util/ArrayDeque;

    return-void
.end method

.method public final S()Landroid/os/Bundle;
    .locals 13

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p0}, LOc;->e()Ljava/util/HashSet;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LO8;

    iget-boolean v5, v2, LO8;->e:Z

    if-eqz v5, :cond_0

    const-string v5, "FragmentManager"

    invoke-static {v5, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v4, "SpecialEffectsController: Forcing postponed operations"

    invoke-static {v5, v4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    iput-boolean v3, v2, LO8;->e:Z

    invoke-virtual {v2}, LO8;->c()V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, LOc;->e()Ljava/util/HashSet;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LO8;

    invoke-virtual {v2}, LO8;->e()V

    goto :goto_1

    :cond_3
    const/4 v1, 0x1

    invoke-virtual {p0, v1}, LOc;->y(Z)Z

    iput-boolean v1, p0, LOc;->E:Z

    iget-object v2, p0, LOc;->L:LRc;

    iput-boolean v1, v2, LRc;->g:Z

    iget-object v1, p0, LOc;->c:Ljj;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Ljava/util/ArrayList;

    iget-object v1, v1, Ljj;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v5

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LVc;

    if-eqz v5, :cond_4

    invoke-virtual {v5}, LVc;->o()V

    iget-object v5, v5, LVc;->c:Lzc;

    iget-object v6, v5, Lzc;->e:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v6, "FragmentManager"

    invoke-static {v6, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v7

    if-eqz v7, :cond_4

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "Saved state of "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v8, ": "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, v5, Lzc;->b:Landroid/os/Bundle;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v6, v5}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    :cond_5
    iget-object v1, p0, LOc;->c:Ljj;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v5, Ljava/util/ArrayList;

    iget-object v1, v1, Ljj;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_6

    const-string v1, "FragmentManager"

    invoke-static {v1, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_f

    const-string v1, "FragmentManager"

    const-string v2, "saveAllState: no fragments!"

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_8

    :cond_6
    iget-object v1, p0, LOc;->c:Ljj;

    iget-object v6, v1, Ljj;->a:Ljava/lang/Object;

    check-cast v6, Ljava/util/ArrayList;

    monitor-enter v6

    :try_start_0
    iget-object v7, v1, Ljj;->a:Ljava/lang/Object;

    check-cast v7, Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    const/4 v8, 0x0

    if-eqz v7, :cond_7

    monitor-exit v6

    move-object v7, v8

    goto :goto_4

    :catchall_0
    move-exception v0

    goto/16 :goto_9

    :cond_7
    new-instance v7, Ljava/util/ArrayList;

    iget-object v9, v1, Ljj;->a:Ljava/lang/Object;

    check-cast v9, Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v9

    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v1, v1, Ljj;->a:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_8
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lzc;

    iget-object v10, v9, Lzc;->e:Ljava/lang/String;

    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v10, "FragmentManager"

    invoke-static {v10, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v10

    if-eqz v10, :cond_8

    const-string v10, "FragmentManager"

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "saveAllState: adding fragment ("

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v12, v9, Lzc;->e:Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v12, "): "

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v10, v9}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_3

    :cond_9
    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_4
    iget-object v1, p0, LOc;->d:Ljava/util/ArrayList;

    if-eqz v1, :cond_b

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_b

    new-array v6, v1, [Lt3;

    :goto_5
    if-ge v3, v1, :cond_c

    new-instance v9, Lt3;

    iget-object v10, p0, LOc;->d:Ljava/util/ArrayList;

    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ls3;

    invoke-direct {v9, v10}, Lt3;-><init>(Ls3;)V

    aput-object v9, v6, v3

    const-string v9, "FragmentManager"

    invoke-static {v9, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v9

    if-eqz v9, :cond_a

    const-string v9, "FragmentManager"

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "saveAllState: adding back stack #"

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v11, ": "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v11, p0, LOc;->d:Ljava/util/ArrayList;

    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_a
    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_b
    move-object v6, v8

    :cond_c
    new-instance v1, LPc;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v8, v1, LPc;->e:Ljava/lang/String;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v1, LPc;->f:Ljava/util/ArrayList;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, v1, LPc;->g:Ljava/util/ArrayList;

    iput-object v2, v1, LPc;->a:Ljava/util/ArrayList;

    iput-object v7, v1, LPc;->b:Ljava/util/ArrayList;

    iput-object v6, v1, LPc;->c:[Lt3;

    iget-object v2, p0, LOc;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v2

    iput v2, v1, LPc;->d:I

    iget-object v2, p0, LOc;->w:Lzc;

    if-eqz v2, :cond_d

    iget-object v2, v2, Lzc;->e:Ljava/lang/String;

    iput-object v2, v1, LPc;->e:Ljava/lang/String;

    :cond_d
    iget-object v2, p0, LOc;->j:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v2, p0, LOc;->j:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, LOc;->C:Ljava/util/ArrayDeque;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, v1, LPc;->h:Ljava/util/ArrayList;

    const-string v2, "state"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    iget-object v1, p0, LOc;->k:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "result_"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, LOc;->k:Ljava/util/Map;

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Bundle;

    invoke-virtual {v0, v3, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_6

    :cond_e
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LUc;

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-string v4, "state"

    invoke-virtual {v3, v4, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "fragment_"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, v2, LUc;->b:Ljava/lang/String;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    goto :goto_7

    :cond_f
    :goto_8
    return-object v0

    :goto_9
    :try_start_1
    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final T()V
    .locals 3

    iget-object v0, p0, LOc;->a:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LOc;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, LOc;->t:LBc;

    iget-object v1, v1, LBc;->l:Landroid/os/Handler;

    iget-object v2, p0, LOc;->M:Lr0;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v1, p0, LOc;->t:LBc;

    iget-object v1, v1, LBc;->l:Landroid/os/Handler;

    iget-object v2, p0, LOc;->M:Lr0;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    invoke-virtual {p0}, LOc;->b0()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final U(Lzc;Z)V
    .locals 1

    invoke-virtual {p0, p1}, LOc;->C(Lzc;)Landroid/view/ViewGroup;

    move-result-object p1

    if-eqz p1, :cond_0

    instance-of v0, p1, Landroidx/fragment/app/FragmentContainerView;

    if-eqz v0, :cond_0

    check-cast p1, Landroidx/fragment/app/FragmentContainerView;

    xor-int/lit8 p2, p2, 0x1

    invoke-virtual {p1, p2}, Landroidx/fragment/app/FragmentContainerView;->setDrawDisappearingViewsLast(Z)V

    :cond_0
    return-void
.end method

.method public final V(Lzc;Lug;)V
    .locals 2

    iget-object v0, p1, Lzc;->e:Ljava/lang/String;

    iget-object v1, p0, LOc;->c:Ljj;

    invoke-virtual {v1, v0}, Ljj;->h(Ljava/lang/String;)Lzc;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Lzc;->s:LBc;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lzc;->r:LOc;

    if-ne v0, p0, :cond_1

    :cond_0
    iput-object p2, p1, Lzc;->L:Lug;

    return-void

    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Fragment "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not an active fragment of FragmentManager "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final W(Lzc;)V
    .locals 3

    if-eqz p1, :cond_1

    iget-object v0, p1, Lzc;->e:Ljava/lang/String;

    iget-object v1, p0, LOc;->c:Ljj;

    invoke-virtual {v1, v0}, Ljj;->h(Ljava/lang/String;)Lzc;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Lzc;->s:LBc;

    if-eqz v0, :cond_1

    iget-object v0, p1, Lzc;->r:LOc;

    if-ne v0, p0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Fragment "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " is not an active fragment of FragmentManager "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, LOc;->w:Lzc;

    iput-object p1, p0, LOc;->w:Lzc;

    invoke-virtual {p0, v0}, LOc;->q(Lzc;)V

    iget-object p1, p0, LOc;->w:Lzc;

    invoke-virtual {p0, p1}, LOc;->q(Lzc;)V

    return-void
.end method

.method public final X(Lzc;)V
    .locals 5

    invoke-virtual {p0, p1}, LOc;->C(Lzc;)Landroid/view/ViewGroup;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-object v1, p1, Lzc;->H:Lxc;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    iget v3, v1, Lxc;->b:I

    :goto_0
    if-nez v1, :cond_1

    move v4, v2

    goto :goto_1

    :cond_1
    iget v4, v1, Lxc;->c:I

    :goto_1
    add-int/2addr v4, v3

    if-nez v1, :cond_2

    move v3, v2

    goto :goto_2

    :cond_2
    iget v3, v1, Lxc;->d:I

    :goto_2
    add-int/2addr v3, v4

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    iget v1, v1, Lxc;->e:I

    :goto_3
    add-int/2addr v1, v3

    if-lez v1, :cond_7

    const v1, 0x7f0b02c8

    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_4

    invoke-virtual {v0, v1, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_4
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzc;

    iget-object p1, p1, Lzc;->H:Lxc;

    if-nez p1, :cond_5

    goto :goto_4

    :cond_5
    iget-boolean v2, p1, Lxc;->a:Z

    :goto_4
    iget-object p1, v0, Lzc;->H:Lxc;

    if-nez p1, :cond_6

    goto :goto_5

    :cond_6
    invoke-virtual {v0}, Lzc;->e()Lxc;

    move-result-object p1

    iput-boolean v2, p1, Lxc;->a:Z

    :cond_7
    :goto_5
    return-void
.end method

.method public final Z()V
    .locals 4

    iget-object v0, p0, LOc;->c:Ljj;

    invoke-virtual {v0}, Ljj;->o()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LVc;

    iget-object v2, v1, LVc;->c:Lzc;

    iget-boolean v3, v2, Lzc;->F:Z

    if-eqz v3, :cond_0

    iget-boolean v3, p0, LOc;->b:Z

    if-eqz v3, :cond_1

    const/4 v1, 0x1

    iput-boolean v1, p0, LOc;->H:Z

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    iput-boolean v3, v2, Lzc;->F:Z

    invoke-virtual {v1}, LVc;->k()V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final a(Lzc;)LVc;
    .locals 3

    iget-object v0, p1, Lzc;->K:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {p1, v0}, LYc;->c(Lzc;Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x2

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "add: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    invoke-virtual {p0, p1}, LOc;->f(Lzc;)LVc;

    move-result-object v0

    iput-object p0, p1, Lzc;->r:LOc;

    iget-object v1, p0, LOc;->c:Ljj;

    invoke-virtual {v1, v0}, Ljj;->s(LVc;)V

    iget-boolean v2, p1, Lzc;->z:Z

    if-nez v2, :cond_3

    invoke-virtual {v1, p1}, Ljj;->b(Lzc;)V

    const/4 v1, 0x0

    iput-boolean v1, p1, Lzc;->l:Z

    iget-object v2, p1, Lzc;->E:Landroid/view/View;

    if-nez v2, :cond_2

    iput-boolean v1, p1, Lzc;->I:Z

    :cond_2
    invoke-static {p1}, LOc;->G(Lzc;)Z

    move-result p1

    if-eqz p1, :cond_3

    const/4 p1, 0x1

    iput-boolean p1, p0, LOc;->D:Z

    :cond_3
    return-object v0
.end method

.method public final a0(Ljava/lang/IllegalStateException;)V
    .locals 7

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FragmentManager"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const-string v0, "Activity state:"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lph;

    invoke-direct {v0}, Lph;-><init>()V

    new-instance v2, Ljava/io/PrintWriter;

    invoke-direct {v2, v0}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    iget-object v0, p0, LOc;->t:LBc;

    const-string v3, "Failed dumping state"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v6, "  "

    if-eqz v0, :cond_0

    :try_start_0
    new-array v4, v4, [Ljava/lang/String;

    iget-object v0, v0, LBc;->n:Lq1;

    invoke-virtual {v0, v6, v5, v2, v4}, Lq1;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {v1, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :cond_0
    :try_start_1
    new-array v0, v4, [Ljava/lang/String;

    invoke-virtual {p0, v6, v5, v2, v0}, LOc;->v(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    invoke-static {v1, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    throw p1
.end method

.method public final b(LBc;LBr;Lzc;)V
    .locals 4

    iget-object v0, p0, LOc;->t:LBc;

    if-nez v0, :cond_13

    iput-object p1, p0, LOc;->t:LBc;

    iput-object p2, p0, LOc;->u:LBr;

    iput-object p3, p0, LOc;->v:Lzc;

    iget-object p2, p0, LOc;->m:Ljava/util/concurrent/CopyOnWriteArrayList;

    if-eqz p3, :cond_0

    new-instance v0, LKc;

    invoke-direct {v0, p3}, LKc;-><init>(Lzc;)V

    invoke-virtual {p2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    instance-of v0, p1, LSc;

    if-eqz v0, :cond_1

    invoke-virtual {p2, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    iget-object p2, p0, LOc;->v:Lzc;

    if-eqz p2, :cond_2

    invoke-virtual {p0}, LOc;->b0()V

    :cond_2
    instance-of p2, p1, Lbk;

    if-eqz p2, :cond_5

    iget-object p2, p1, LBc;->n:Lq1;

    invoke-virtual {p2}, LP6;->l()Lak;

    move-result-object p2

    iput-object p2, p0, LOc;->g:Lak;

    if-eqz p3, :cond_3

    move-object v0, p3

    goto :goto_1

    :cond_3
    move-object v0, p1

    :goto_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v1, "onBackPressedCallback"

    iget-object v2, p0, LOc;->h:LHc;

    invoke-static {v1, v2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v0}, LDg;->getLifecycle()Lwg;

    move-result-object v0

    move-object v1, v0

    check-cast v1, LFg;

    iget-object v1, v1, LFg;->c:Lug;

    sget-object v3, Lug;->a:Lug;

    if-ne v1, v3, :cond_4

    goto :goto_2

    :cond_4
    new-instance v1, LXj;

    invoke-direct {v1, p2, v0, v2}, LXj;-><init>(Lak;Lwg;LHc;)V

    iget-object v0, v2, LHc;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p2}, Lak;->d()V

    new-instance v0, LZj;

    const/4 v1, 0x0

    invoke-direct {v0, p2, v1}, LZj;-><init>(Ljava/lang/Object;I)V

    iput-object v0, v2, LHc;->c:Ldd;

    :cond_5
    :goto_2
    const/4 p2, 0x0

    if-eqz p3, :cond_7

    iget-object p1, p3, Lzc;->r:LOc;

    iget-object p1, p1, LOc;->L:LRc;

    iget-object v0, p1, LRc;->c:Ljava/util/HashMap;

    iget-object v1, p3, Lzc;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LRc;

    if-nez v1, :cond_6

    new-instance v1, LRc;

    iget-boolean p1, p1, LRc;->e:Z

    invoke-direct {v1, p1}, LRc;-><init>(Z)V

    iget-object p1, p3, Lzc;->e:Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    iput-object v1, p0, LOc;->L:LRc;

    goto :goto_3

    :cond_7
    instance-of v0, p1, LSs;

    if-eqz v0, :cond_8

    iget-object p1, p1, LBc;->n:Lq1;

    invoke-virtual {p1}, LP6;->d()LRs;

    move-result-object p1

    new-instance v0, LVi;

    sget-object v1, LRc;->h:LQc;

    invoke-direct {v0, p1, v1}, LVi;-><init>(LRs;LQs;)V

    const-class p1, LRc;

    invoke-virtual {v0, p1}, LVi;->e(Ljava/lang/Class;)LOs;

    move-result-object p1

    check-cast p1, LRc;

    iput-object p1, p0, LOc;->L:LRc;

    goto :goto_3

    :cond_8
    new-instance p1, LRc;

    invoke-direct {p1, p2}, LRc;-><init>(Z)V

    iput-object p1, p0, LOc;->L:LRc;

    :goto_3
    iget-object p1, p0, LOc;->L:LRc;

    iget-boolean v0, p0, LOc;->E:Z

    if-nez v0, :cond_9

    iget-boolean v0, p0, LOc;->F:Z

    if-eqz v0, :cond_a

    :cond_9
    const/4 p2, 0x1

    :cond_a
    iput-boolean p2, p1, LRc;->g:Z

    iget-object p2, p0, LOc;->c:Ljj;

    iput-object p1, p2, Ljj;->d:Ljava/lang/Object;

    iget-object p1, p0, LOc;->t:LBc;

    instance-of p2, p1, Lxn;

    if-eqz p2, :cond_b

    if-nez p3, :cond_b

    invoke-virtual {p1}, LBc;->b()Lx1;

    move-result-object p1

    new-instance p2, LG6;

    const/4 v0, 0x2

    invoke-direct {p2, p0, v0}, LG6;-><init>(Ljava/lang/Object;I)V

    const-string v0, "android:support:fragments"

    invoke-virtual {p1, v0, p2}, Lx1;->f(Ljava/lang/String;Lwn;)V

    invoke-virtual {p1, v0}, Lx1;->c(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_b

    invoke-virtual {p0, p1}, LOc;->R(Landroid/os/Parcelable;)V

    :cond_b
    iget-object p1, p0, LOc;->t:LBc;

    instance-of p2, p1, LD0;

    if-eqz p2, :cond_d

    iget-object p1, p1, LBc;->n:Lq1;

    iget-object p1, p1, LP6;->h:LN6;

    if-eqz p3, :cond_c

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p3, Lzc;->e:Ljava/lang/String;

    const-string v1, ":"

    invoke-static {p2, v0, v1}, LVo;->h(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_4

    :cond_c
    const-string p2, ""

    :goto_4
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "FragmentManager:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "StartActivityForResult"

    invoke-static {p2, v0}, LVo;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, LA0;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, LA0;-><init>(I)V

    new-instance v2, LGc;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, LGc;-><init>(LOc;I)V

    invoke-virtual {p1, v0, v1, v2}, LN6;->c(Ljava/lang/String;LTd;LGc;)LK2;

    move-result-object v0

    iput-object v0, p0, LOc;->z:LK2;

    const-string v0, "StartIntentSenderForResult"

    invoke-static {p2, v0}, LVo;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, LA0;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, LA0;-><init>(I)V

    new-instance v2, LGc;

    const/4 v3, 0x2

    invoke-direct {v2, p0, v3}, LGc;-><init>(LOc;I)V

    invoke-virtual {p1, v0, v1, v2}, LN6;->c(Ljava/lang/String;LTd;LGc;)LK2;

    move-result-object v0

    iput-object v0, p0, LOc;->A:LK2;

    const-string v0, "RequestPermissions"

    invoke-static {p2, v0}, LVo;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-instance v0, LA0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LA0;-><init>(I)V

    new-instance v1, LGc;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, LGc;-><init>(LOc;I)V

    invoke-virtual {p1, p2, v0, v1}, LN6;->c(Ljava/lang/String;LTd;LGc;)LK2;

    move-result-object p1

    iput-object p1, p0, LOc;->B:LK2;

    :cond_d
    iget-object p1, p0, LOc;->t:LBc;

    instance-of p2, p1, Lck;

    if-eqz p2, :cond_e

    iget-object p2, p0, LOc;->n:LFc;

    invoke-virtual {p1, p2}, LBc;->C0(Ly7;)V

    :cond_e
    iget-object p1, p0, LOc;->t:LBc;

    instance-of p2, p1, Ljk;

    if-eqz p2, :cond_f

    iget-object p2, p0, LOc;->o:LFc;

    invoke-virtual {p1, p2}, LBc;->F0(LFc;)V

    :cond_f
    iget-object p1, p0, LOc;->t:LBc;

    instance-of p2, p1, Lfk;

    if-eqz p2, :cond_10

    iget-object p2, p0, LOc;->p:LFc;

    invoke-virtual {p1, p2}, LBc;->D0(LFc;)V

    :cond_10
    iget-object p1, p0, LOc;->t:LBc;

    instance-of p2, p1, Lgk;

    if-eqz p2, :cond_11

    iget-object p2, p0, LOc;->q:LFc;

    invoke-virtual {p1, p2}, LBc;->E0(LFc;)V

    :cond_11
    iget-object p1, p0, LOc;->t:LBc;

    instance-of p2, p1, Lvi;

    if-eqz p2, :cond_12

    if-nez p3, :cond_12

    iget-object p2, p0, LOc;->r:LIc;

    invoke-virtual {p1, p2}, LBc;->B0(LIc;)V

    :cond_12
    return-void

    :cond_13
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Already attached"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b0()V
    .locals 4

    iget-object v0, p0, LOc;->a:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LOc;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_1

    iget-object v1, p0, LOc;->h:LHc;

    iput-boolean v2, v1, LHc;->a:Z

    iget-object v1, v1, LHc;->c:Ldd;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ldd;->a()Ljava/lang/Object;

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, LOc;->h:LHc;

    iget-object v1, p0, LOc;->d:Ljava/util/ArrayList;

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    goto :goto_0

    :cond_2
    move v1, v3

    :goto_0
    if-lez v1, :cond_3

    iget-object v1, p0, LOc;->v:Lzc;

    invoke-static {v1}, LOc;->J(Lzc;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    move v2, v3

    :goto_1
    iput-boolean v2, v0, LHc;->a:Z

    iget-object v0, v0, LHc;->c:Ldd;

    if-eqz v0, :cond_4

    invoke-interface {v0}, Ldd;->a()Ljava/lang/Object;

    :cond_4
    return-void

    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final c(Lzc;)V
    .locals 4

    const-string v0, "FragmentManager"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "attach: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-boolean v2, p1, Lzc;->z:Z

    if-eqz v2, :cond_2

    const/4 v2, 0x0

    iput-boolean v2, p1, Lzc;->z:Z

    iget-boolean v2, p1, Lzc;->k:Z

    if-nez v2, :cond_2

    iget-object v2, p0, LOc;->c:Ljj;

    invoke-virtual {v2, p1}, Ljj;->b(Lzc;)V

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "add from attach: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    invoke-static {p1}, LOc;->G(Lzc;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    iput-boolean p1, p0, LOc;->D:Z

    :cond_2
    return-void
.end method

.method public final d()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, LOc;->b:Z

    iget-object v0, p0, LOc;->J:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, LOc;->I:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public final e()Ljava/util/HashSet;
    .locals 4

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iget-object v1, p0, LOc;->c:Ljj;

    invoke-virtual {v1}, Ljj;->o()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LVc;

    iget-object v2, v2, LVc;->c:Lzc;

    iget-object v2, v2, Lzc;->D:Landroid/view/ViewGroup;

    if-eqz v2, :cond_0

    invoke-virtual {p0}, LOc;->E()Lh8;

    move-result-object v3

    invoke-static {v2, v3}, LO8;->f(Landroid/view/ViewGroup;Lh8;)LO8;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public final f(Lzc;)LVc;
    .locals 3

    iget-object v0, p1, Lzc;->e:Ljava/lang/String;

    iget-object v1, p0, LOc;->c:Ljj;

    iget-object v2, v1, Ljj;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LVc;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, LVc;

    iget-object v2, p0, LOc;->l:Ld2;

    invoke-direct {v0, v2, v1, p1}, LVc;-><init>(Ld2;Ljj;Lzc;)V

    iget-object p1, p0, LOc;->t:LBc;

    iget-object p1, p1, LBc;->k:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    invoke-virtual {v0, p1}, LVc;->m(Ljava/lang/ClassLoader;)V

    iget p1, p0, LOc;->s:I

    iput p1, v0, LVc;->e:I

    return-object v0
.end method

.method public final g(Lzc;)V
    .locals 4

    const-string v0, "FragmentManager"

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "detach: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    iget-boolean v2, p1, Lzc;->z:Z

    if-nez v2, :cond_3

    const/4 v2, 0x1

    iput-boolean v2, p1, Lzc;->z:Z

    iget-boolean v3, p1, Lzc;->k:Z

    if-eqz v3, :cond_3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "remove from detach: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    iget-object v0, p0, LOc;->c:Ljj;

    iget-object v1, v0, Ljj;->a:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    monitor-enter v1

    :try_start_0
    iget-object v0, v0, Ljj;->a:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    iput-boolean v0, p1, Lzc;->k:Z

    invoke-static {p1}, LOc;->G(Lzc;)Z

    move-result v0

    if-eqz v0, :cond_2

    iput-boolean v2, p0, LOc;->D:Z

    :cond_2
    invoke-virtual {p0, p1}, LOc;->X(Lzc;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_3
    :goto_0
    return-void
.end method

.method public final h(Z)V
    .locals 3

    if-eqz p1, :cond_1

    iget-object v0, p0, LOc;->t:LBc;

    instance-of v0, v0, Lck;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LOc;->a0(Ljava/lang/IllegalStateException;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, LOc;->c:Ljj;

    invoke-virtual {v0}, Ljj;->r()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzc;

    if-eqz v1, :cond_2

    const/4 v2, 0x1

    iput-boolean v2, v1, Lzc;->C:Z

    if-eqz p1, :cond_2

    iget-object v1, v1, Lzc;->t:LOc;

    invoke-virtual {v1, v2}, LOc;->h(Z)V

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final i()Z
    .locals 5

    iget v0, p0, LOc;->s:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, LOc;->c:Ljj;

    invoke-virtual {v0}, Ljj;->r()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lzc;

    if-eqz v3, :cond_1

    iget-boolean v4, v3, Lzc;->y:Z

    if-nez v4, :cond_2

    iget-object v3, v3, Lzc;->t:LOc;

    invoke-virtual {v3}, LOc;->i()Z

    move-result v3

    goto :goto_0

    :cond_2
    move v3, v1

    :goto_0
    if-eqz v3, :cond_1

    return v2

    :cond_3
    return v1
.end method

.method public final j()Z
    .locals 7

    iget v0, p0, LOc;->s:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, LOc;->c:Ljj;

    invoke-virtual {v0}, Ljj;->r()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v3, 0x0

    move v4, v1

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lzc;

    if-eqz v5, :cond_1

    invoke-static {v5}, LOc;->I(Lzc;)Z

    move-result v6

    if-eqz v6, :cond_1

    iget-boolean v6, v5, Lzc;->y:Z

    if-nez v6, :cond_2

    iget-object v6, v5, Lzc;->t:LOc;

    invoke-virtual {v6}, LOc;->j()Z

    move-result v6

    goto :goto_1

    :cond_2
    move v6, v1

    :goto_1
    if-eqz v6, :cond_1

    if-nez v3, :cond_3

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :cond_3
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v4, v2

    goto :goto_0

    :cond_4
    iget-object v0, p0, LOc;->e:Ljava/util/ArrayList;

    if-eqz v0, :cond_7

    :goto_2
    iget-object v0, p0, LOc;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_7

    iget-object v0, p0, LOc;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzc;

    if-eqz v3, :cond_5

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    :cond_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_6
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_7
    iput-object v3, p0, LOc;->e:Ljava/util/ArrayList;

    return v4
.end method

.method public final k()V
    .locals 8

    const/4 v0, 0x1

    iput-boolean v0, p0, LOc;->G:Z

    invoke-virtual {p0, v0}, LOc;->y(Z)Z

    invoke-virtual {p0}, LOc;->e()Ljava/util/HashSet;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LO8;

    invoke-virtual {v2}, LO8;->e()V

    goto :goto_0

    :cond_0
    iget-object v1, p0, LOc;->t:LBc;

    instance-of v2, v1, LSs;

    iget-object v3, p0, LOc;->c:Ljj;

    if-eqz v2, :cond_1

    iget-object v0, v3, Ljj;->d:Ljava/lang/Object;

    check-cast v0, LRc;

    iget-boolean v0, v0, LRc;->f:Z

    goto :goto_1

    :cond_1
    iget-object v1, v1, LBc;->k:Landroid/content/Context;

    instance-of v2, v1, Landroid/app/Activity;

    if-eqz v2, :cond_2

    check-cast v1, Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result v1

    xor-int/2addr v0, v1

    :cond_2
    :goto_1
    if-eqz v0, :cond_5

    iget-object v0, p0, LOc;->j:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu3;

    iget-object v1, v1, Lu3;->a:Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v4, v3, Ljj;->d:Ljava/lang/Object;

    check-cast v4, LRc;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v5, 0x3

    const-string v6, "FragmentManager"

    invoke-static {v6, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v5

    if-eqz v5, :cond_4

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v7, "Clearing non-config state for saved state of Fragment "

    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v6, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    invoke-virtual {v4, v2}, LRc;->d(Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, LOc;->t(I)V

    iget-object v0, p0, LOc;->t:LBc;

    instance-of v1, v0, Ljk;

    if-eqz v1, :cond_6

    iget-object v1, p0, LOc;->o:LFc;

    invoke-virtual {v0, v1}, LBc;->K0(LFc;)V

    :cond_6
    iget-object v0, p0, LOc;->t:LBc;

    instance-of v1, v0, Lck;

    if-eqz v1, :cond_7

    iget-object v1, p0, LOc;->n:LFc;

    invoke-virtual {v0, v1}, LBc;->H0(LFc;)V

    :cond_7
    iget-object v0, p0, LOc;->t:LBc;

    instance-of v1, v0, Lfk;

    if-eqz v1, :cond_8

    iget-object v1, p0, LOc;->p:LFc;

    invoke-virtual {v0, v1}, LBc;->I0(LFc;)V

    :cond_8
    iget-object v0, p0, LOc;->t:LBc;

    instance-of v1, v0, Lgk;

    if-eqz v1, :cond_9

    iget-object v1, p0, LOc;->q:LFc;

    invoke-virtual {v0, v1}, LBc;->J0(LFc;)V

    :cond_9
    iget-object v0, p0, LOc;->t:LBc;

    instance-of v1, v0, Lvi;

    if-eqz v1, :cond_a

    iget-object v1, p0, LOc;->r:LIc;

    invoke-virtual {v0, v1}, LBc;->G0(LIc;)V

    :cond_a
    const/4 v0, 0x0

    iput-object v0, p0, LOc;->t:LBc;

    iput-object v0, p0, LOc;->u:LBr;

    iput-object v0, p0, LOc;->v:Lzc;

    iget-object v1, p0, LOc;->g:Lak;

    if-eqz v1, :cond_c

    iget-object v1, p0, LOc;->h:LHc;

    iget-object v1, v1, LHc;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp5;

    invoke-interface {v2}, Lp5;->cancel()V

    goto :goto_3

    :cond_b
    iput-object v0, p0, LOc;->g:Lak;

    :cond_c
    iget-object v0, p0, LOc;->z:LK2;

    if-eqz v0, :cond_d

    invoke-virtual {v0}, LK2;->P()V

    iget-object v0, p0, LOc;->A:LK2;

    invoke-virtual {v0}, LK2;->P()V

    iget-object v0, p0, LOc;->B:LK2;

    invoke-virtual {v0}, LK2;->P()V

    :cond_d
    return-void
.end method

.method public final l(Z)V
    .locals 3

    if-eqz p1, :cond_1

    iget-object v0, p0, LOc;->t:LBc;

    instance-of v0, v0, Ljk;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LOc;->a0(Ljava/lang/IllegalStateException;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, LOc;->c:Ljj;

    invoke-virtual {v0}, Ljj;->r()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzc;

    if-eqz v1, :cond_2

    const/4 v2, 0x1

    iput-boolean v2, v1, Lzc;->C:Z

    if-eqz p1, :cond_2

    iget-object v1, v1, Lzc;->t:LOc;

    invoke-virtual {v1, v2}, LOc;->l(Z)V

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final m(ZZ)V
    .locals 3

    if-eqz p2, :cond_1

    iget-object v0, p0, LOc;->t:LBc;

    instance-of v0, v0, Lfk;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LOc;->a0(Ljava/lang/IllegalStateException;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, LOc;->c:Ljj;

    invoke-virtual {v0}, Ljj;->r()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzc;

    if-eqz v1, :cond_2

    if-eqz p2, :cond_2

    iget-object v1, v1, Lzc;->t:LOc;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v2}, LOc;->m(ZZ)V

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final n()V
    .locals 2

    iget-object v0, p0, LOc;->c:Ljj;

    invoke-virtual {v0}, Ljj;->p()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzc;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lzc;->q()Z

    iget-object v1, v1, Lzc;->t:LOc;

    invoke-virtual {v1}, LOc;->n()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final o()Z
    .locals 5

    iget v0, p0, LOc;->s:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, LOc;->c:Ljj;

    invoke-virtual {v0}, Ljj;->r()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lzc;

    if-eqz v3, :cond_1

    iget-boolean v4, v3, Lzc;->y:Z

    if-nez v4, :cond_2

    iget-object v3, v3, Lzc;->t:LOc;

    invoke-virtual {v3}, LOc;->o()Z

    move-result v3

    goto :goto_0

    :cond_2
    move v3, v1

    :goto_0
    if-eqz v3, :cond_1

    return v2

    :cond_3
    return v1
.end method

.method public final p()V
    .locals 3

    iget v0, p0, LOc;->s:I

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LOc;->c:Ljj;

    invoke-virtual {v0}, Ljj;->r()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzc;

    if-eqz v1, :cond_1

    iget-boolean v2, v1, Lzc;->y:Z

    if-nez v2, :cond_1

    iget-object v1, v1, Lzc;->t:LOc;

    invoke-virtual {v1}, LOc;->p()V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final q(Lzc;)V
    .locals 2

    if-eqz p1, :cond_1

    iget-object v0, p1, Lzc;->e:Ljava/lang/String;

    iget-object v1, p0, LOc;->c:Ljj;

    invoke-virtual {v1, v0}, Ljj;->h(Ljava/lang/String;)Lzc;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p1, Lzc;->r:LOc;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, LOc;->J(Lzc;)Z

    move-result v0

    iget-object v1, p1, Lzc;->j:Ljava/lang/Boolean;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eq v1, v0, :cond_1

    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p1, Lzc;->j:Ljava/lang/Boolean;

    iget-object p1, p1, Lzc;->t:LOc;

    invoke-virtual {p1}, LOc;->b0()V

    iget-object v0, p1, LOc;->w:Lzc;

    invoke-virtual {p1, v0}, LOc;->q(Lzc;)V

    :cond_1
    return-void
.end method

.method public final r(ZZ)V
    .locals 3

    if-eqz p2, :cond_1

    iget-object v0, p0, LOc;->t:LBc;

    instance-of v0, v0, Lgk;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LOc;->a0(Ljava/lang/IllegalStateException;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, LOc;->c:Ljj;

    invoke-virtual {v0}, Ljj;->r()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzc;

    if-eqz v1, :cond_2

    if-eqz p2, :cond_2

    iget-object v1, v1, Lzc;->t:LOc;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v2}, LOc;->r(ZZ)V

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final s()Z
    .locals 6

    iget v0, p0, LOc;->s:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ge v0, v2, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, LOc;->c:Ljj;

    invoke-virtual {v0}, Ljj;->r()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v3, v1

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lzc;

    if-eqz v4, :cond_1

    invoke-static {v4}, LOc;->I(Lzc;)Z

    move-result v5

    if-eqz v5, :cond_1

    iget-boolean v5, v4, Lzc;->y:Z

    if-nez v5, :cond_2

    iget-object v4, v4, Lzc;->t:LOc;

    invoke-virtual {v4}, LOc;->s()Z

    move-result v4

    goto :goto_1

    :cond_2
    move v4, v1

    :goto_1
    if-eqz v4, :cond_1

    move v3, v2

    goto :goto_0

    :cond_3
    return v3
.end method

.method public final t(I)V
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v0, p0, LOc;->b:Z

    iget-object v2, p0, LOc;->c:Ljj;

    iget-object v2, v2, Ljj;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LVc;

    if-eqz v3, :cond_0

    iput p1, v3, LVc;->e:I

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1, v1}, LOc;->K(IZ)V

    invoke-virtual {p0}, LOc;->e()Ljava/util/HashSet;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LO8;

    invoke-virtual {v2}, LO8;->e()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_2
    iput-boolean v1, p0, LOc;->b:Z

    invoke-virtual {p0, v0}, LOc;->y(Z)Z

    return-void

    :goto_2
    iput-boolean v1, p0, LOc;->b:Z

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x80

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "FragmentManager{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LOc;->v:Lzc;

    const-string v2, "}"

    const-string v3, "{"

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LOc;->v:Lzc;

    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    iget-object v1, p0, LOc;->t:LBc;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LOc;->t:LBc;

    invoke-static {v1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const-string v1, "null"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    const-string v1, "}}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()V
    .locals 1

    iget-boolean v0, p0, LOc;->H:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, LOc;->H:Z

    invoke-virtual {p0}, LOc;->Z()V

    :cond_0
    return-void
.end method

.method public final v(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 10

    const-string v0, "    "

    invoke-static {p1, v0}, LVo;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LOc;->c:Ljj;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "    "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v1, Ljj;->b:Ljava/lang/Object;

    check-cast v3, Ljava/util/HashMap;

    invoke-virtual {v3}, Ljava/util/HashMap;->isEmpty()Z

    move-result v4

    const/4 v5, 0x0

    if-nez v4, :cond_1c

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v4, "Active Fragments:"

    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1c

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LVc;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    if-eqz v4, :cond_1b

    iget-object v4, v4, LVc;->c:Lzc;

    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mFragmentId=#"

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v6, v4, Lzc;->v:I

    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, " mContainerId=#"

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v6, v4, Lzc;->w:I

    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, " mTag="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Lzc;->x:Ljava/lang/String;

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mState="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v6, v4, Lzc;->a:I

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(I)V

    const-string v6, " mWho="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Lzc;->e:Ljava/lang/String;

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, " mBackStackNesting="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v6, v4, Lzc;->q:I

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mAdded="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v6, v4, Lzc;->k:Z

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    const-string v6, " mRemoving="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v6, v4, Lzc;->l:Z

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    const-string v6, " mFromLayout="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v6, v4, Lzc;->m:Z

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    const-string v6, " mInLayout="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v6, v4, Lzc;->n:Z

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Z)V

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mHidden="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v6, v4, Lzc;->y:Z

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    const-string v6, " mDetached="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v6, v4, Lzc;->z:Z

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    const-string v6, " mMenuVisible="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v6, v4, Lzc;->B:Z

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    const-string v6, " mHasMenu="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->println(Z)V

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mRetainInstance="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v6, v4, Lzc;->A:Z

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Z)V

    const-string v6, " mUserVisibleHint="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean v6, v4, Lzc;->G:Z

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Z)V

    iget-object v6, v4, Lzc;->r:LOc;

    if-eqz v6, :cond_0

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mFragmentManager="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Lzc;->r:LOc;

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_0
    iget-object v6, v4, Lzc;->s:LBc;

    if-eqz v6, :cond_1

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mHost="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Lzc;->s:LBc;

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_1
    iget-object v6, v4, Lzc;->u:Lzc;

    if-eqz v6, :cond_2

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mParentFragment="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Lzc;->u:Lzc;

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_2
    iget-object v6, v4, Lzc;->f:Landroid/os/Bundle;

    if-eqz v6, :cond_3

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mArguments="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Lzc;->f:Landroid/os/Bundle;

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_3
    iget-object v6, v4, Lzc;->b:Landroid/os/Bundle;

    if-eqz v6, :cond_4

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mSavedFragmentState="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Lzc;->b:Landroid/os/Bundle;

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_4
    iget-object v6, v4, Lzc;->c:Landroid/util/SparseArray;

    if-eqz v6, :cond_5

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mSavedViewState="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Lzc;->c:Landroid/util/SparseArray;

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_5
    iget-object v6, v4, Lzc;->d:Landroid/os/Bundle;

    if-eqz v6, :cond_6

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mSavedViewRegistryState="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Lzc;->d:Landroid/os/Bundle;

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_6
    iget-object v6, v4, Lzc;->g:Lzc;

    const/4 v7, 0x0

    if-eqz v6, :cond_7

    goto :goto_1

    :cond_7
    iget-object v6, v4, Lzc;->r:LOc;

    if-eqz v6, :cond_8

    iget-object v8, v4, Lzc;->h:Ljava/lang/String;

    if-eqz v8, :cond_8

    iget-object v6, v6, LOc;->c:Ljj;

    invoke-virtual {v6, v8}, Ljj;->h(Ljava/lang/String;)Lzc;

    move-result-object v6

    goto :goto_1

    :cond_8
    move-object v6, v7

    :goto_1
    if-eqz v6, :cond_9

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v8, "mTarget="

    invoke-virtual {p3, v8}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    const-string v6, " mTargetRequestCode="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget v6, v4, Lzc;->i:I

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    :cond_9
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mPopDirection="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Lzc;->H:Lxc;

    if-nez v6, :cond_a

    move v6, v5

    goto :goto_2

    :cond_a
    iget-boolean v6, v6, Lxc;->a:Z

    :goto_2
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Z)V

    iget-object v6, v4, Lzc;->H:Lxc;

    if-nez v6, :cond_b

    move v6, v5

    goto :goto_3

    :cond_b
    iget v6, v6, Lxc;->b:I

    :goto_3
    if-eqz v6, :cond_d

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "getEnterAnim="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Lzc;->H:Lxc;

    if-nez v6, :cond_c

    move v6, v5

    goto :goto_4

    :cond_c
    iget v6, v6, Lxc;->b:I

    :goto_4
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    :cond_d
    iget-object v6, v4, Lzc;->H:Lxc;

    if-nez v6, :cond_e

    move v6, v5

    goto :goto_5

    :cond_e
    iget v6, v6, Lxc;->c:I

    :goto_5
    if-eqz v6, :cond_10

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "getExitAnim="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Lzc;->H:Lxc;

    if-nez v6, :cond_f

    move v6, v5

    goto :goto_6

    :cond_f
    iget v6, v6, Lxc;->c:I

    :goto_6
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    :cond_10
    iget-object v6, v4, Lzc;->H:Lxc;

    if-nez v6, :cond_11

    move v6, v5

    goto :goto_7

    :cond_11
    iget v6, v6, Lxc;->d:I

    :goto_7
    if-eqz v6, :cond_13

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "getPopEnterAnim="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Lzc;->H:Lxc;

    if-nez v6, :cond_12

    move v6, v5

    goto :goto_8

    :cond_12
    iget v6, v6, Lxc;->d:I

    :goto_8
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    :cond_13
    iget-object v6, v4, Lzc;->H:Lxc;

    if-nez v6, :cond_14

    move v6, v5

    goto :goto_9

    :cond_14
    iget v6, v6, Lxc;->e:I

    :goto_9
    if-eqz v6, :cond_16

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "getPopExitAnim="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Lzc;->H:Lxc;

    if-nez v6, :cond_15

    move v6, v5

    goto :goto_a

    :cond_15
    iget v6, v6, Lxc;->e:I

    :goto_a
    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(I)V

    :cond_16
    iget-object v6, v4, Lzc;->D:Landroid/view/ViewGroup;

    if-eqz v6, :cond_17

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mContainer="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Lzc;->D:Landroid/view/ViewGroup;

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_17
    iget-object v6, v4, Lzc;->E:Landroid/view/View;

    if-eqz v6, :cond_18

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v6, "mView="

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v6, v4, Lzc;->E:Landroid/view/View;

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_18
    invoke-virtual {v4}, Lzc;->h()Landroid/content/Context;

    move-result-object v6

    if-eqz v6, :cond_1a

    invoke-interface {v4}, LSs;->d()LRs;

    move-result-object v6

    new-instance v8, LVi;

    sget-object v9, Lhh;->c:LQc;

    invoke-direct {v8, v6, v9}, LVi;-><init>(LRs;LQs;)V

    const-class v6, Lhh;

    invoke-virtual {v8, v6}, LVi;->e(Ljava/lang/Class;)LOs;

    move-result-object v6

    check-cast v6, Lhh;

    iget-object v6, v6, Lhh;->b:Lbp;

    iget v8, v6, Lbp;->c:I

    if-lez v8, :cond_1a

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v8, "Loaders:"

    invoke-virtual {p3, v8}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    iget v8, v6, Lbp;->c:I

    if-gtz v8, :cond_19

    goto :goto_b

    :cond_19
    iget-object p1, v6, Lbp;->b:[Ljava/lang/Object;

    aget-object p1, p1, v5

    invoke-static {p1}, LVo;->l(Ljava/lang/Object;)V

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p1, "  #"

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p1, v6, Lbp;->a:[I

    aget p1, p1, v5

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(I)V

    const-string p1, ": "

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    throw v7

    :cond_1a
    :goto_b
    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Child "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v7, v4, Lzc;->t:LOc;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, ":"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p3, v6}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    iget-object v4, v4, Lzc;->t:LOc;

    const-string v6, "  "

    invoke-static {v2, v6}, LVo;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6, p2, p3, p4}, LOc;->v(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_1b
    const-string v4, "null"

    invoke-virtual {p3, v4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_1c
    iget-object p2, v1, Ljj;->a:Ljava/lang/Object;

    check-cast p2, Ljava/util/ArrayList;

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p4

    if-lez p4, :cond_1d

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "Added Fragments:"

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move v1, v5

    :goto_c
    if-ge v1, p4, :cond_1d

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzc;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v3, "  #"

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(I)V

    const-string v3, ": "

    invoke-virtual {p3, v3}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v2}, Lzc;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_c

    :cond_1d
    iget-object p2, p0, LOc;->e:Ljava/util/ArrayList;

    if-eqz p2, :cond_1e

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lez p2, :cond_1e

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p4, "Fragments Created Menus:"

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move p4, v5

    :goto_d
    if-ge p4, p2, :cond_1e

    iget-object v1, p0, LOc;->e:Ljava/util/ArrayList;

    invoke-virtual {v1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzc;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v2, "  #"

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(I)V

    const-string v2, ": "

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v1}, Lzc;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    add-int/lit8 p4, p4, 0x1

    goto :goto_d

    :cond_1e
    iget-object p2, p0, LOc;->d:Ljava/util/ArrayList;

    if-eqz p2, :cond_1f

    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lez p2, :cond_1f

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p4, "Back Stack:"

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    move p4, v5

    :goto_e
    if-ge p4, p2, :cond_1f

    iget-object v1, p0, LOc;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, p4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls3;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v2, "  #"

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(I)V

    const-string v2, ": "

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {v1}, Ls3;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3, v2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-virtual {v1, v0, p3, v2}, Ls3;->f(Ljava/lang/String;Ljava/io/PrintWriter;Z)V

    add-int/lit8 p4, p4, 0x1

    goto :goto_e

    :cond_1f
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p4, "Back Stack Index: "

    invoke-direct {p2, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p4, p0, LOc;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p4}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p4

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    iget-object p2, p0, LOc;->a:Ljava/util/ArrayList;

    monitor-enter p2

    :try_start_0
    iget-object p4, p0, LOc;->a:Ljava/util/ArrayList;

    invoke-virtual {p4}, Ljava/util/ArrayList;->size()I

    move-result p4

    if-lez p4, :cond_20

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "Pending Actions:"

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    :goto_f
    if-ge v5, p4, :cond_20

    iget-object v0, p0, LOc;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LMc;

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v1, "  #"

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v5}, Ljava/io/PrintWriter;->print(I)V

    const-string v1, ": "

    invoke-virtual {p3, v1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_f

    :catchall_0
    move-exception p1

    goto :goto_10

    :cond_20
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "FragmentManager misc state:"

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "  mHost="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, LOc;->t:LBc;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "  mContainer="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, LOc;->u:LBr;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    iget-object p2, p0, LOc;->v:Lzc;

    if-eqz p2, :cond_21

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "  mParent="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object p2, p0, LOc;->v:Lzc;

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    :cond_21
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p2, "  mCurState="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget p2, p0, LOc;->s:I

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(I)V

    const-string p2, " mStateSaved="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean p2, p0, LOc;->E:Z

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    const-string p2, " mStopped="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean p2, p0, LOc;->F:Z

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Z)V

    const-string p2, " mDestroyed="

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean p2, p0, LOc;->G:Z

    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Z)V

    iget-boolean p2, p0, LOc;->D:Z

    if-eqz p2, :cond_22

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string p1, "  mNeedMenuInvalidate="

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-boolean p1, p0, LOc;->D:Z

    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->println(Z)V

    :cond_22
    return-void

    :goto_10
    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final w(LMc;Z)V
    .locals 2

    if-nez p2, :cond_3

    iget-object v0, p0, LOc;->t:LBc;

    if-nez v0, :cond_1

    iget-boolean p1, p0, LOc;->G:Z

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "FragmentManager has been destroyed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "FragmentManager has not been attached to a host."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-boolean v0, p0, LOc;->E:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, LOc;->F:Z

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Can not perform this action after onSaveInstanceState"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_0
    iget-object v0, p0, LOc;->a:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LOc;->t:LBc;

    if-nez v1, :cond_5

    if-eqz p2, :cond_4

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Activity has been destroyed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    iget-object p2, p0, LOc;->a:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, LOc;->T()V

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final x(Z)V
    .locals 2

    iget-boolean v0, p0, LOc;->b:Z

    if-nez v0, :cond_6

    iget-object v0, p0, LOc;->t:LBc;

    if-nez v0, :cond_1

    iget-boolean p1, p0, LOc;->G:Z

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "FragmentManager has been destroyed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "FragmentManager has not been attached to a host."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, LOc;->t:LBc;

    iget-object v1, v1, LBc;->l:Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_5

    if-nez p1, :cond_3

    iget-boolean p1, p0, LOc;->E:Z

    if-nez p1, :cond_2

    iget-boolean p1, p0, LOc;->F:Z

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Can not perform this action after onSaveInstanceState"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_0
    iget-object p1, p0, LOc;->I:Ljava/util/ArrayList;

    if-nez p1, :cond_4

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LOc;->I:Ljava/util/ArrayList;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LOc;->J:Ljava/util/ArrayList;

    :cond_4
    return-void

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Must be called from main thread of fragment host"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "FragmentManager is already executing transactions"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final y(Z)Z
    .locals 8

    invoke-virtual {p0, p1}, LOc;->x(Z)V

    const/4 p1, 0x0

    move v0, p1

    :goto_0
    iget-object v1, p0, LOc;->I:Ljava/util/ArrayList;

    iget-object v2, p0, LOc;->J:Ljava/util/ArrayList;

    iget-object v3, p0, LOc;->a:Ljava/util/ArrayList;

    monitor-enter v3

    :try_start_0
    iget-object v4, p0, LOc;->a:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v6, p1

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_0
    :try_start_1
    iget-object v4, p0, LOc;->a:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    move v5, p1

    move v6, v5

    :goto_1
    if-ge v5, v4, :cond_1

    iget-object v7, p0, LOc;->a:Ljava/util/ArrayList;

    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LMc;

    invoke-interface {v7, v1, v2}, LMc;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    move-result v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    or-int/2addr v6, v7

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_3

    :cond_1
    :try_start_2
    iget-object v1, p0, LOc;->a:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v1, p0, LOc;->t:LBc;

    iget-object v1, v1, LBc;->l:Landroid/os/Handler;

    iget-object v2, p0, LOc;->M:Lr0;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_2
    if-eqz v6, :cond_2

    const/4 v0, 0x1

    iput-boolean v0, p0, LOc;->b:Z

    :try_start_3
    iget-object v1, p0, LOc;->I:Ljava/util/ArrayList;

    iget-object v2, p0, LOc;->J:Ljava/util/ArrayList;

    invoke-virtual {p0, v1, v2}, LOc;->Q(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    invoke-virtual {p0}, LOc;->d()V

    goto :goto_0

    :catchall_2
    move-exception p1

    invoke-virtual {p0}, LOc;->d()V

    throw p1

    :cond_2
    invoke-virtual {p0}, LOc;->b0()V

    invoke-virtual {p0}, LOc;->u()V

    iget-object p1, p0, LOc;->c:Ljj;

    iget-object p1, p1, Ljj;->b:Ljava/lang/Object;

    check-cast p1, Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p1

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    return v0

    :goto_3
    :try_start_4
    iget-object v0, p0, LOc;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, LOc;->t:LBc;

    iget-object v0, v0, LBc;->l:Landroid/os/Handler;

    iget-object v1, p0, LOc;->M:Lr0;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    throw p1

    :goto_4
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw p1
.end method

.method public final z(LMc;Z)V
    .locals 1

    if-eqz p2, :cond_1

    iget-object v0, p0, LOc;->t:LBc;

    if-eqz v0, :cond_0

    iget-boolean v0, p0, LOc;->G:Z

    if-eqz v0, :cond_1

    :cond_0
    return-void

    :cond_1
    invoke-virtual {p0, p2}, LOc;->x(Z)V

    iget-object p2, p0, LOc;->I:Ljava/util/ArrayList;

    iget-object v0, p0, LOc;->J:Ljava/util/ArrayList;

    invoke-interface {p1, p2, v0}, LMc;->a(Ljava/util/ArrayList;Ljava/util/ArrayList;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    iput-boolean p1, p0, LOc;->b:Z

    :try_start_0
    iget-object p1, p0, LOc;->I:Ljava/util/ArrayList;

    iget-object p2, p0, LOc;->J:Ljava/util/ArrayList;

    invoke-virtual {p0, p1, p2}, LOc;->Q(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, LOc;->d()V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, LOc;->d()V

    throw p1

    :cond_2
    :goto_0
    invoke-virtual {p0}, LOc;->b0()V

    invoke-virtual {p0}, LOc;->u()V

    iget-object p1, p0, LOc;->c:Ljj;

    iget-object p1, p1, Ljj;->b:Ljava/lang/Object;

    check-cast p1, Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p1

    const/4 p2, 0x0

    invoke-static {p2}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    return-void
.end method
