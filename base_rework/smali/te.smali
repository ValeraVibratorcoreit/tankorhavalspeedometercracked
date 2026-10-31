.class public interface abstract Lte;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lng;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Llg;

    sget-object v0, Llg;->a:Ljava/util/Map;

    new-instance v0, Lng;

    invoke-direct {v0}, Lng;-><init>()V

    sput-object v0, Lte;->a:Lng;

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/util/Map;
.end method
