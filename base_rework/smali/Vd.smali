.class public final LVd;
.super Landroid/content/ContextWrapper;
.source "SourceFile"


# static fields
.field public static final k:LHd;


# instance fields
.field public final a:Luh;

.field public final b:LG7;

.field public final c:Lh8;

.field public final d:Lh8;

.field public final e:Ljava/util/List;

.field public final f:Ljava/util/Map;

.field public final g:Lfb;

.field public final h:Lk0;

.field public final i:I

.field public j:LGm;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LHd;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sget-object v1, LFj;->a:Lmh;

    iput-object v1, v0, LHd;->a:Lmh;

    sput-object v0, LVd;->k:LHd;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Luh;LLo;Lh8;Lh8;Lc3;Ljava/util/List;Lfb;Lk0;)V
    .locals 0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, LVd;->a:Luh;

    iput-object p4, p0, LVd;->c:Lh8;

    iput-object p5, p0, LVd;->d:Lh8;

    iput-object p7, p0, LVd;->e:Ljava/util/List;

    iput-object p6, p0, LVd;->f:Ljava/util/Map;

    iput-object p8, p0, LVd;->g:Lfb;

    iput-object p9, p0, LVd;->h:Lk0;

    const/4 p1, 0x4

    iput p1, p0, LVd;->i:I

    new-instance p1, LG7;

    invoke-direct {p1, p3}, LG7;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, LVd;->b:LG7;

    return-void
.end method


# virtual methods
.method public final a()Lsm;
    .locals 1

    iget-object v0, p0, LVd;->b:LG7;

    invoke-virtual {v0}, LG7;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsm;

    return-object v0
.end method
