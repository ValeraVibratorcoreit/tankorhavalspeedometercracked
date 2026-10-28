.class public final Lff;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:I

.field public final c:Ljava/util/ArrayList;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lff;->a:I

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    const-string v0, ""

    iput-object v0, p0, Lff;->e:Ljava/lang/Object;

    .line 16
    iput-object v0, p0, Lff;->f:Ljava/lang/Object;

    const/4 v1, -0x1

    .line 17
    iput v1, p0, Lff;->b:I

    .line 18
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lff;->c:Ljava/util/ArrayList;

    .line 19
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public constructor <init>(LI0;LVi;LDl;Lpa;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lff;->a:I

    const-string v0, "address"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "routeDatabase"

    invoke-static {v0, p2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "call"

    invoke-static {v0, p3}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "eventListener"

    invoke-static {v0, p4}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lff;->f:Ljava/lang/Object;

    iput-object p2, p0, Lff;->g:Ljava/lang/Object;

    iput-object p3, p0, Lff;->h:Ljava/lang/Object;

    iput-object p4, p0, Lff;->i:Ljava/lang/Object;

    .line 2
    sget-object p2, LSa;->a:LSa;

    iput-object p2, p0, Lff;->d:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Lff;->e:Ljava/lang/Object;

    .line 4
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lff;->c:Ljava/util/ArrayList;

    .line 5
    iget-object p2, p1, LI0;->a:Lgf;

    const-string p3, "url"

    invoke-static {p3, p2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    invoke-virtual {p2}, Lgf;->f()Ljava/net/URI;

    move-result-object p2

    .line 7
    invoke-virtual {p2}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object p3

    if-nez p3, :cond_0

    sget-object p1, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    filled-new-array {p1}, [Ljava/net/Proxy;

    move-result-object p1

    invoke-static {p1}, LRr;->l([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_1

    .line 8
    :cond_0
    iget-object p1, p1, LI0;->j:Ljava/net/ProxySelector;

    invoke-virtual {p1, p2}, Ljava/net/ProxySelector;->select(Ljava/net/URI;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 9
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_0

    .line 10
    :cond_1
    invoke-static {p1}, LRr;->w(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    goto :goto_1

    .line 11
    :cond_2
    :goto_0
    sget-object p1, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    filled-new-array {p1}, [Ljava/net/Proxy;

    move-result-object p1

    invoke-static {p1}, LRr;->l([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 12
    :goto_1
    iput-object p1, p0, Lff;->d:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 13
    iput p1, p0, Lff;->b:I

    return-void
.end method


# virtual methods
.method public a()Lgf;
    .locals 14

    iget-object v0, p0, Lff;->d:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_6

    iget-object v0, p0, Lff;->e:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x0

    const/4 v3, 0x7

    invoke-static {v0, v1, v1, v1, v3}, Lh8;->q(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v0

    iget-object v4, p0, Lff;->f:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-static {v4, v1, v1, v1, v3}, Lh8;->q(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lff;->g:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_5

    invoke-virtual {p0}, Lff;->b()I

    move-result v6

    iget-object v7, p0, Lff;->c:Ljava/util/ArrayList;

    new-instance v8, Ljava/util/ArrayList;

    invoke-static {v7}, Lm6;->u0(Ljava/lang/Iterable;)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-static {v9, v1, v1, v1, v3}, Lh8;->q(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v7, p0, Lff;->i:Ljava/lang/Object;

    check-cast v7, Ljava/util/ArrayList;

    const/4 v9, 0x0

    if-eqz v7, :cond_2

    new-instance v10, Ljava/util/ArrayList;

    invoke-static {v7}, Lm6;->u0(Ljava/lang/Iterable;)I

    move-result v11

    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    if-eqz v11, :cond_1

    const/4 v12, 0x3

    const/4 v13, 0x1

    invoke-static {v11, v1, v1, v13, v12}, Lh8;->q(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v11

    goto :goto_2

    :cond_1
    move-object v11, v9

    :goto_2
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    move-object v10, v9

    :cond_3
    iget-object v7, p0, Lff;->h:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    if-eqz v7, :cond_4

    invoke-static {v7, v1, v1, v1, v3}, Lh8;->q(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v1

    move-object v9, v1

    :cond_4
    invoke-virtual {p0}, Lff;->toString()Ljava/lang/String;

    move-result-object v11

    new-instance v12, Lgf;

    move-object v1, v12

    move-object v3, v0

    move-object v7, v8

    move-object v8, v10

    move-object v10, v11

    invoke-direct/range {v1 .. v10}, Lgf;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    return-object v12

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "host == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "scheme == null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b()I
    .locals 4

    iget v0, p0, Lff;->b:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lff;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, LTf;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    const v3, 0x310888    # 4.503E-39f

    if-eq v2, v3, :cond_2

    const v3, 0x5f008eb

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    const-string v2, "https"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/16 v0, 0x1bb

    goto :goto_1

    :cond_2
    const-string v2, "http"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/16 v0, 0x50

    goto :goto_1

    :cond_3
    :goto_0
    move v0, v1

    :goto_1
    return v0
.end method

.method public c()Z
    .locals 4

    iget v0, p0, Lff;->b:I

    iget-object v1, p0, Lff;->d:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ge v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-nez v0, :cond_1

    iget-object v0, p0, Lff;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v3

    if-eqz v0, :cond_2

    :cond_1
    move v2, v3

    :cond_2
    return v2
.end method

.method public d(Lgf;Ljava/lang/String;)V
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v10, p2

    const/4 v11, 0x1

    sget-object v2, LRr;->a:[B

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v12, 0x0

    invoke-static {v10, v12, v2}, LRr;->n(Ljava/lang/String;II)I

    move-result v2

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v3

    invoke-static {v10, v2, v3}, LRr;->o(Ljava/lang/String;II)I

    move-result v13

    sub-int v3, v13, v2

    const/4 v4, 0x2

    const/16 v14, 0x3a

    const/4 v15, -0x1

    if-ge v3, v4, :cond_1

    :cond_0
    :goto_0
    move v3, v15

    goto :goto_6

    :cond_1
    invoke-virtual {v10, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v5, 0x61

    invoke-static {v3, v5}, LTf;->k(II)I

    move-result v6

    const/16 v7, 0x5a

    const/16 v8, 0x41

    const/16 v9, 0x7a

    if-ltz v6, :cond_2

    invoke-static {v3, v9}, LTf;->k(II)I

    move-result v6

    if-lez v6, :cond_3

    :cond_2
    invoke-static {v3, v8}, LTf;->k(II)I

    move-result v6

    if-ltz v6, :cond_0

    invoke-static {v3, v7}, LTf;->k(II)I

    move-result v3

    if-lez v3, :cond_3

    goto :goto_0

    :cond_3
    add-int/lit8 v3, v2, 0x1

    :goto_1
    if-ge v3, v13, :cond_0

    invoke-virtual {v10, v3}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-le v5, v6, :cond_4

    goto :goto_2

    :cond_4
    if-lt v9, v6, :cond_5

    goto :goto_5

    :cond_5
    :goto_2
    if-le v8, v6, :cond_6

    goto :goto_3

    :cond_6
    if-lt v7, v6, :cond_7

    goto :goto_5

    :cond_7
    :goto_3
    const/16 v5, 0x30

    if-le v5, v6, :cond_8

    goto :goto_4

    :cond_8
    const/16 v5, 0x39

    if-lt v5, v6, :cond_9

    goto :goto_5

    :cond_9
    :goto_4
    const/16 v5, 0x2b

    if-ne v6, v5, :cond_a

    goto :goto_5

    :cond_a
    const/16 v5, 0x2d

    if-ne v6, v5, :cond_b

    goto :goto_5

    :cond_b
    const/16 v5, 0x2e

    if-ne v6, v5, :cond_c

    :goto_5
    add-int/2addr v3, v11

    const/16 v5, 0x61

    goto :goto_1

    :cond_c
    if-ne v6, v14, :cond_0

    :goto_6
    const-string v9, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"

    if-eq v3, v15, :cond_f

    const-string v5, "https:"

    invoke-static {v10, v5, v2, v11}, LMp;->T0(Ljava/lang/String;Ljava/lang/String;IZ)Z

    move-result v5

    if-eqz v5, :cond_d

    const-string v3, "https"

    iput-object v3, v0, Lff;->d:Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x6

    goto :goto_7

    :cond_d
    const-string v5, "http:"

    invoke-static {v10, v5, v2, v11}, LMp;->T0(Ljava/lang/String;Ljava/lang/String;IZ)Z

    move-result v5

    if-eqz v5, :cond_e

    const-string v3, "http"

    iput-object v3, v0, Lff;->d:Ljava/lang/Object;

    add-int/lit8 v2, v2, 0x5

    goto :goto_7

    :cond_e
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Expected URL scheme \'http\' or \'https\' but was \'"

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v12, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v9, v3}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_f
    if-eqz v1, :cond_35

    iget-object v3, v1, Lgf;->b:Ljava/lang/String;

    iput-object v3, v0, Lff;->d:Ljava/lang/Object;

    :goto_7
    move v3, v2

    move v5, v12

    :goto_8
    const/16 v8, 0x2f

    const/16 v7, 0x5c

    if-ge v3, v13, :cond_11

    invoke-virtual {v10, v3}, Ljava/lang/String;->charAt(I)C

    move-result v6

    if-eq v6, v7, :cond_10

    if-ne v6, v8, :cond_11

    :cond_10
    add-int/2addr v5, v11

    add-int/2addr v3, v11

    goto :goto_8

    :cond_11
    iget-object v6, v0, Lff;->c:Ljava/util/ArrayList;

    const/16 v3, 0x3f

    const/16 v12, 0x23

    if-ge v5, v4, :cond_16

    if-eqz v1, :cond_16

    iget-object v4, v0, Lff;->d:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v14, v1, Lgf;->b:Ljava/lang/String;

    invoke-static {v14, v4}, LTf;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    xor-int/2addr v4, v11

    if-eqz v4, :cond_12

    goto :goto_a

    :cond_12
    invoke-virtual/range {p1 .. p1}, Lgf;->e()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v0, Lff;->e:Ljava/lang/Object;

    invoke-virtual/range {p1 .. p1}, Lgf;->a()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v0, Lff;->f:Ljava/lang/Object;

    iget-object v4, v1, Lgf;->e:Ljava/lang/String;

    iput-object v4, v0, Lff;->g:Ljava/lang/Object;

    iget v4, v1, Lgf;->f:I

    iput v4, v0, Lff;->b:I

    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    invoke-virtual/range {p1 .. p1}, Lgf;->c()Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    if-eq v2, v13, :cond_13

    invoke-virtual {v10, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-ne v4, v12, :cond_15

    :cond_13
    invoke-virtual/range {p1 .. p1}, Lgf;->d()Ljava/lang/String;

    move-result-object v17

    if-eqz v17, :cond_14

    const/16 v22, 0x0

    const/16 v25, 0xd3

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-string v20, " \"\'<>#"

    const/16 v21, 0x1

    const/16 v23, 0x1

    const/16 v24, 0x0

    invoke-static/range {v17 .. v25}, Lh8;->g(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lh8;->v(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    goto :goto_9

    :cond_14
    const/4 v1, 0x0

    :goto_9
    iput-object v1, v0, Lff;->i:Ljava/lang/Object;

    :cond_15
    move-object/from16 v23, v6

    const/4 v12, 0x0

    goto/16 :goto_15

    :cond_16
    :goto_a
    add-int/2addr v2, v5

    move v14, v2

    const/16 v18, 0x0

    const/16 v19, 0x0

    :goto_b
    const-string v1, "@/\\?#"

    invoke-static {v10, v14, v1, v13}, LRr;->g(Ljava/lang/String;ILjava/lang/String;I)I

    move-result v5

    if-eq v5, v13, :cond_17

    invoke-virtual {v10, v5}, Ljava/lang/String;->charAt(I)C

    move-result v1

    goto :goto_c

    :cond_17
    move v1, v15

    :goto_c
    if-eq v1, v15, :cond_1c

    if-eq v1, v12, :cond_1c

    if-eq v1, v8, :cond_1c

    if-eq v1, v7, :cond_1c

    if-eq v1, v3, :cond_1c

    const/16 v2, 0x40

    if-eq v1, v2, :cond_18

    move v12, v3

    move-object/from16 v23, v6

    move-object/from16 v26, v9

    goto/16 :goto_e

    :cond_18
    const-string v4, "%40"

    if-nez v18, :cond_1b

    const/16 v1, 0x3a

    invoke-static {v10, v1, v14, v5}, LRr;->f(Ljava/lang/String;CII)I

    move-result v2

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-string v22, " \"\':;<=>@[]^`{}|/\\?#"

    const/16 v23, 0x1

    const/16 v24, 0x0

    const/16 v25, 0xf0

    move-object/from16 v1, p2

    move/from16 p1, v2

    move v2, v14

    move v14, v3

    move/from16 v3, p1

    move-object v12, v4

    move-object/from16 v4, v22

    move v15, v5

    move/from16 v5, v23

    move-object/from16 v23, v6

    move/from16 v6, v24

    move/from16 v7, v20

    move/from16 v8, v21

    move-object/from16 v26, v9

    move/from16 v9, v25

    invoke-static/range {v1 .. v9}, Lh8;->g(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object v1

    if-eqz v19, :cond_19

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, v0, Lff;->e:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_19
    iput-object v1, v0, Lff;->e:Ljava/lang/Object;

    move/from16 v1, p1

    if-eq v1, v15, :cond_1a

    add-int/lit8 v2, v1, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-string v4, " \"\':;<=>@[]^`{}|/\\?#"

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/16 v9, 0xf0

    move-object/from16 v1, p2

    move v3, v15

    invoke-static/range {v1 .. v9}, Lh8;->g(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lff;->f:Ljava/lang/Object;

    move/from16 v18, v11

    :cond_1a
    move/from16 v19, v11

    move v12, v14

    goto :goto_d

    :cond_1b
    move-object v12, v4

    move v15, v5

    move-object/from16 v23, v6

    move-object/from16 v26, v9

    move v9, v3

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, v0, Lff;->f:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v7, 0x0

    const/4 v12, 0x0

    const-string v4, " \"\':;<=>@[]^`{}|/\\?#"

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/16 v20, 0xf0

    move-object/from16 v1, p2

    move v2, v14

    move v3, v15

    move-object v14, v8

    move v8, v12

    move v12, v9

    move/from16 v9, v20

    invoke-static/range {v1 .. v9}, Lh8;->g(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v14, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lff;->f:Ljava/lang/Object;

    :goto_d
    add-int/lit8 v14, v15, 0x1

    :goto_e
    move v3, v12

    move-object/from16 v6, v23

    move-object/from16 v9, v26

    const/16 v7, 0x5c

    const/16 v8, 0x2f

    const/16 v12, 0x23

    const/4 v15, -0x1

    goto/16 :goto_b

    :cond_1c
    move v12, v3

    move v15, v5

    move-object/from16 v23, v6

    move-object/from16 v26, v9

    move v5, v14

    :goto_f
    if-ge v5, v15, :cond_20

    invoke-virtual {v10, v5}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x3a

    if-eq v1, v2, :cond_1f

    const/16 v3, 0x5b

    if-eq v1, v3, :cond_1d

    goto :goto_10

    :cond_1d
    add-int/2addr v5, v11

    if-ge v5, v15, :cond_1e

    invoke-virtual {v10, v5}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v3, 0x5d

    if-ne v1, v3, :cond_1d

    :cond_1e
    :goto_10
    add-int/2addr v5, v11

    goto :goto_f

    :cond_1f
    move v9, v5

    goto :goto_11

    :cond_20
    move v9, v15

    :goto_11
    add-int/lit8 v8, v9, 0x1

    const/4 v1, 0x4

    const/16 v7, 0x22

    if-ge v8, v15, :cond_24

    const/4 v2, 0x0

    invoke-static {v10, v14, v9, v2, v1}, Lh8;->q(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LTf;->b0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lff;->g:Ljava/lang/Object;

    :try_start_0
    const-string v4, ""
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v17, 0xf8

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v1, p2

    move v2, v8

    move v3, v15

    move v12, v7

    move/from16 v7, v18

    move v12, v8

    move/from16 v8, v19

    move/from16 v27, v9

    move/from16 v9, v17

    :try_start_1
    invoke-static/range {v1 .. v9}, Lh8;->g(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    if-le v11, v1, :cond_21

    goto :goto_12

    :cond_21
    const v2, 0xffff

    if-lt v2, v1, :cond_22

    goto :goto_13

    :catch_0
    move v12, v8

    move/from16 v27, v9

    :catch_1
    :cond_22
    :goto_12
    const/4 v1, -0x1

    :goto_13
    iput v1, v0, Lff;->b:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_23

    move-object/from16 v3, v26

    move/from16 v5, v27

    const/4 v12, 0x0

    goto :goto_14

    :cond_23
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid URL port: \""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v12, v15}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v3, v26

    invoke-static {v3, v2}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x22

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_24
    move v5, v9

    move-object/from16 v3, v26

    const/4 v12, 0x0

    invoke-static {v10, v14, v5, v12, v1}, Lh8;->q(Ljava/lang/String;IIZI)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LTf;->b0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lff;->g:Ljava/lang/Object;

    iget-object v1, v0, Lff;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, LTf;->f(Ljava/lang/Object;)V

    invoke-static {v1}, Lh8;->k(Ljava/lang/String;)I

    move-result v1

    iput v1, v0, Lff;->b:I

    :goto_14
    iget-object v1, v0, Lff;->g:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_34

    move v2, v15

    :goto_15
    const-string v1, "?#"

    invoke-static {v10, v2, v1, v13}, LRr;->g(Ljava/lang/String;ILjava/lang/String;I)I

    move-result v14

    if-ne v2, v14, :cond_25

    goto/16 :goto_1d

    :cond_25
    invoke-virtual {v10, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const-string v15, ""

    const/16 v3, 0x2f

    if-eq v1, v3, :cond_26

    const/16 v3, 0x5c

    if-ne v1, v3, :cond_27

    :cond_26
    move-object/from16 v9, v23

    goto :goto_16

    :cond_27
    invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int/2addr v1, v11

    move-object/from16 v9, v23

    invoke-virtual {v9, v1, v15}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_17

    :goto_16
    invoke-virtual {v9}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v9, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/2addr v2, v11

    :goto_17
    if-ge v2, v14, :cond_31

    const-string v1, "/\\"

    invoke-static {v10, v2, v1, v14}, LRr;->g(Ljava/lang/String;ILjava/lang/String;I)I

    move-result v8

    if-ge v8, v14, :cond_28

    move/from16 v16, v11

    goto :goto_18

    :cond_28
    move/from16 v16, v12

    :goto_18
    const/4 v7, 0x0

    const/16 v17, 0x0

    const-string v4, " \"<>^`{}|/\\?#"

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/16 v18, 0xf0

    move-object/from16 v1, p2

    move v3, v8

    move/from16 v19, v8

    move/from16 v8, v17

    move-object/from16 v23, v9

    move/from16 v9, v18

    invoke-static/range {v1 .. v9}, Lh8;->g(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object v1

    const-string v2, "."

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_29

    const-string v2, "%2e"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2a

    :cond_29
    move-object/from16 v3, v23

    goto/16 :goto_1b

    :cond_2a
    const-string v2, ".."

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2b

    const-string v2, "%2e."

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2b

    const-string v2, ".%2e"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2b

    const-string v2, "%2e%2e"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2c

    :cond_2b
    move-object/from16 v3, v23

    goto :goto_1a

    :cond_2c
    invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-int/2addr v2, v11

    move-object/from16 v3, v23

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_2d

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-int/2addr v2, v11

    invoke-virtual {v3, v2, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_19

    :cond_2d
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_19
    if-eqz v16, :cond_2f

    invoke-virtual {v3, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1b

    :goto_1a
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int/2addr v1, v11

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_2e

    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    xor-int/2addr v1, v11

    if-eqz v1, :cond_2e

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int/2addr v1, v11

    invoke-virtual {v3, v1, v15}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_1b

    :cond_2e
    invoke-virtual {v3, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2f
    :goto_1b
    if-eqz v16, :cond_30

    add-int/lit8 v8, v19, 0x1

    move v2, v8

    goto :goto_1c

    :cond_30
    move/from16 v2, v19

    :goto_1c
    move-object v9, v3

    goto/16 :goto_17

    :cond_31
    :goto_1d
    if-ge v14, v13, :cond_32

    invoke-virtual {v10, v14}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x3f

    if-ne v1, v2, :cond_32

    const/16 v1, 0x23

    invoke-static {v10, v1, v14, v13}, LRr;->f(Ljava/lang/String;CII)I

    move-result v12

    add-int/lit8 v2, v14, 0x1

    const/4 v7, 0x1

    const/4 v8, 0x0

    const-string v4, " \"\'<>#"

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/16 v9, 0xd0

    move-object/from16 v1, p2

    move v3, v12

    invoke-static/range {v1 .. v9}, Lh8;->g(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lh8;->v(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, v0, Lff;->i:Ljava/lang/Object;

    move v14, v12

    :cond_32
    if-ge v14, v13, :cond_33

    invoke-virtual {v10, v14}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x23

    if-ne v1, v2, :cond_33

    add-int/lit8 v2, v14, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    const-string v4, ""

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/16 v9, 0xb0

    move-object/from16 v1, p2

    move v3, v13

    invoke-static/range {v1 .. v9}, Lh8;->g(Ljava/lang/String;IILjava/lang/String;ZZZZI)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lff;->h:Ljava/lang/Object;

    :cond_33
    return-void

    :cond_34
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid URL host: \""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v14, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x22

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_35
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Expected URL scheme \'http\' or \'https\' but no colon was found"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget v0, p0, Lff;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lff;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "://"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string v1, "//"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    iget-object v1, p0, Lff;->e:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x3a

    if-lez v1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lff;->f:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_3

    :goto_1
    iget-object v1, p0, Lff;->e:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lff;->f:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lff;->f:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_3
    iget-object v1, p0, Lff;->g:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_5

    invoke-static {v1, v2}, LMp;->C0(Ljava/lang/CharSequence;C)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lff;->g:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lff;->g:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    :goto_2
    iget v1, p0, Lff;->b:I

    const/4 v3, -0x1

    if-ne v1, v3, :cond_6

    iget-object v1, p0, Lff;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_b

    :cond_6
    invoke-virtual {p0}, Lff;->b()I

    move-result v1

    iget-object v4, p0, Lff;->d:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_a

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v5

    const v6, 0x310888    # 4.503E-39f

    if-eq v5, v6, :cond_8

    const v6, 0x5f008eb

    if-eq v5, v6, :cond_7

    goto :goto_3

    :cond_7
    const-string v5, "https"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    const/16 v3, 0x1bb

    goto :goto_3

    :cond_8
    const-string v5, "http"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    const/16 v3, 0x50

    :cond_9
    :goto_3
    if-eq v1, v3, :cond_b

    :cond_a
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :cond_b
    iget-object v1, p0, Lff;->c:Ljava/util/ArrayList;

    const-string v2, "$this$toPathString"

    invoke-static {v2, v1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_4
    if-ge v4, v2, :cond_c

    const/16 v5, 0x2f

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_c
    iget-object v1, p0, Lff;->i:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    if-eqz v1, :cond_10

    const/16 v1, 0x3f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lff;->i:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-static {v1}, LTf;->f(Ljava/lang/Object;)V

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v3, v2}, LTd;->O(II)LPf;

    move-result-object v2

    const/4 v3, 0x2

    invoke-static {v2, v3}, LTd;->M(LNf;I)LNf;

    move-result-object v2

    iget v3, v2, LNf;->a:I

    iget v4, v2, LNf;->b:I

    iget v2, v2, LNf;->c:I

    if-ltz v2, :cond_d

    if-gt v3, v4, :cond_10

    goto :goto_5

    :cond_d
    if-lt v3, v4, :cond_10

    :goto_5
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    add-int/lit8 v6, v3, 0x1

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    if-lez v3, :cond_e

    const/16 v7, 0x26

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_e
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v6, :cond_f

    const/16 v5, 0x3d

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_f
    if-eq v3, v4, :cond_10

    add-int/2addr v3, v2

    goto :goto_5

    :cond_10
    iget-object v1, p0, Lff;->h:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_11

    const/16 v1, 0x23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lff;->h:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_11
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v1, v0}, LTf;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
