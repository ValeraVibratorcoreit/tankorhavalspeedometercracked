.class public final Lmi;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Ljava/util/regex/Pattern;

.field public static final d:Ljava/util/regex/Pattern;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lmi;->c:Ljava/util/regex/Pattern;

    const-string v0, ";\\s*(?:([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+)|\"([^\"]*)\"))?"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lmi;->d:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmi;->a:Ljava/lang/String;

    iput-object p2, p0, Lmi;->b:[Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;
    .locals 7

    const-string v0, "<this>"

    iget-object v1, p0, Lmi;->b:[Ljava/lang/String;

    invoke-static {v0, v1}, LTf;->j(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v0, LPf;

    array-length v2, v1

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    const/4 v4, 0x0

    invoke-direct {v0, v4, v2, v3}, LNf;-><init>(III)V

    const/4 v2, 0x2

    invoke-static {v0, v2}, LTd;->M(LNf;I)LNf;

    move-result-object v0

    iget v2, v0, LNf;->a:I

    iget v4, v0, LNf;->b:I

    iget v0, v0, LNf;->c:I

    if-ltz v0, :cond_0

    if-gt v2, v4, :cond_2

    goto :goto_0

    :cond_0
    if-lt v2, v4, :cond_2

    :goto_0
    aget-object v5, v1, v2

    const-string v6, "charset"

    invoke-static {v5, v6}, LMp;->F0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    add-int/2addr v2, v3

    aget-object v0, v1, v2

    goto :goto_1

    :cond_1
    if-eq v2, v4, :cond_2

    add-int/2addr v2, v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_3

    :try_start_0
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_3
    return-object p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lmi;

    if-eqz v0, :cond_0

    check-cast p1, Lmi;

    iget-object p1, p1, Lmi;->a:Ljava/lang/String;

    iget-object v0, p0, Lmi;->a:Ljava/lang/String;

    invoke-static {p1, v0}, LTf;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lmi;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lmi;->a:Ljava/lang/String;

    return-object v0
.end method
