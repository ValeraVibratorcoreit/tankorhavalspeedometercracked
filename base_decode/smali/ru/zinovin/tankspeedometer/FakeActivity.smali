.class public Lru/zinovin/tankspeedometer/FakeActivity;
.super Lq1;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lq1;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Lq1;->onCreate(Landroid/os/Bundle;)V

    const-string p1, "T500.FAKE"

    const-string v0, "onCreate() start"

    invoke-static {p1, v0}, Lyr;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0}, Lka;->a(LP6;)V

    const p1, 0x7f0e017a

    invoke-virtual {p0, p1}, Lq1;->setContentView(I)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method
