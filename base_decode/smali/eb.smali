.class public final Leb;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LZd;

.field public final b:LZd;

.field public final c:LZd;

.field public final d:LZd;

.field public final e:Lkb;

.field public final f:Lmb;

.field public final g:LK2;


# direct methods
.method public constructor <init>(LZd;LZd;LZd;LZd;Lkb;Lmb;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lk0;

    const/16 v1, 0x10

    invoke-direct {v0, p0, v1}, Lk0;-><init>(Ljava/lang/Object;I)V

    const/16 v1, 0x96

    invoke-static {v1, v0}, LBr;->s0(ILHb;)LK2;

    move-result-object v0

    iput-object v0, p0, Leb;->g:LK2;

    iput-object p1, p0, Leb;->a:LZd;

    iput-object p2, p0, Leb;->b:LZd;

    iput-object p3, p0, Leb;->c:LZd;

    iput-object p4, p0, Leb;->d:LZd;

    iput-object p5, p0, Leb;->e:Lkb;

    iput-object p6, p0, Leb;->f:Lmb;

    return-void
.end method
