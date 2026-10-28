.class public final LSe;
.super Liq;
.source "SourceFile"


# instance fields
.field public final synthetic e:LTe;

.field public final synthetic f:I

.field public final synthetic g:J


# direct methods
.method public constructor <init>(Ljava/lang/String;LTe;IJ)V
    .locals 0

    iput-object p2, p0, LSe;->e:LTe;

    iput p3, p0, LSe;->f:I

    iput-wide p4, p0, LSe;->g:J

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Liq;-><init>(Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 5

    iget-object v0, p0, LSe;->e:LTe;

    :try_start_0
    iget-object v1, v0, LTe;->y:Lbf;

    iget v2, p0, LSe;->f:I

    iget-wide v3, p0, LSe;->g:J

    invoke-virtual {v1, v3, v4, v2}, Lbf;->B(JI)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {v0, v1}, LTe;->w(Ljava/io/IOException;)V

    :goto_0
    const-wide/16 v0, -0x1

    return-wide v0
.end method
