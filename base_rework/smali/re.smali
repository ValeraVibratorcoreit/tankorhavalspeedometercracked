.class public final Lre;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:Le5;

.field public static final e:Le5;

.field public static final f:Le5;

.field public static final g:Le5;

.field public static final h:Le5;

.field public static final i:Le5;


# instance fields
.field public final a:I

.field public final b:Le5;

.field public final c:Le5;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Le5;->d:Le5;

    const-string v0, ":"

    invoke-static {v0}, Lpa;->t(Ljava/lang/String;)Le5;

    move-result-object v0

    sput-object v0, Lre;->d:Le5;

    const-string v0, ":status"

    invoke-static {v0}, Lpa;->t(Ljava/lang/String;)Le5;

    move-result-object v0

    sput-object v0, Lre;->e:Le5;

    const-string v0, ":method"

    invoke-static {v0}, Lpa;->t(Ljava/lang/String;)Le5;

    move-result-object v0

    sput-object v0, Lre;->f:Le5;

    const-string v0, ":path"

    invoke-static {v0}, Lpa;->t(Ljava/lang/String;)Le5;

    move-result-object v0

    sput-object v0, Lre;->g:Le5;

    const-string v0, ":scheme"

    invoke-static {v0}, Lpa;->t(Ljava/lang/String;)Le5;

    move-result-object v0

    sput-object v0, Lre;->h:Le5;

    const-string v0, ":authority"

    invoke-static {v0}, Lpa;->t(Ljava/lang/String;)Le5;

    move-result-object v0

    sput-object v0, Lre;->i:Le5;

    return-void
.end method

.method public constructor <init>(Le5;Le5;)V
    .locals 1

    const-string v0, "name"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "value"

    invoke-static {v0, p2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lre;->b:Le5;

    iput-object p2, p0, Lre;->c:Le5;

    .line 2
    invoke-virtual {p1}, Le5;->b()I

    move-result p1

    add-int/lit8 p1, p1, 0x20

    invoke-virtual {p2}, Le5;->b()I

    move-result p2

    add-int/2addr p2, p1

    .line 3
    iput p2, p0, Lre;->a:I

    return-void
.end method

.method public constructor <init>(Le5;Ljava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "value"

    invoke-static {v0, p2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    .line 5
    sget-object v0, Le5;->d:Le5;

    invoke-static {p2}, Lpa;->t(Ljava/lang/String;)Le5;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lre;-><init>(Le5;Le5;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {v0, p1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "value"

    invoke-static {v0, p2}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    sget-object v0, Le5;->d:Le5;

    invoke-static {p1}, Lpa;->t(Ljava/lang/String;)Le5;

    move-result-object p1

    invoke-static {p2}, Lpa;->t(Ljava/lang/String;)Le5;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lre;-><init>(Le5;Le5;)V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-eq p0, p1, :cond_1

    instance-of v0, p1, Lre;

    if-eqz v0, :cond_0

    check-cast p1, Lre;

    iget-object v0, p1, Lre;->b:Le5;

    iget-object v1, p0, Lre;->b:Le5;

    invoke-static {v1, v0}, LTf;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lre;->c:Le5;

    iget-object p1, p1, Lre;->c:Le5;

    invoke-static {v0, p1}, LTf;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lre;->b:Le5;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Le5;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    iget-object v2, p0, Lre;->c:Le5;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Le5;->hashCode()I

    move-result v0

    :cond_1
    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lre;->b:Le5;

    invoke-virtual {v1}, Le5;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lre;->c:Le5;

    invoke-virtual {v1}, Le5;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
