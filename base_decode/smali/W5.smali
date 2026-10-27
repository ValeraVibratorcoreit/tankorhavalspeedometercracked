.class public final LW5;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:LV5;

.field public static final c:Ljava/util/LinkedHashMap;

.field public static final d:LW5;

.field public static final e:LW5;

.field public static final f:LW5;

.field public static final g:LW5;

.field public static final h:LW5;

.field public static final i:LW5;

.field public static final j:LW5;

.field public static final k:LW5;

.field public static final l:LW5;

.field public static final m:LW5;

.field public static final n:LW5;

.field public static final o:LW5;

.field public static final p:LW5;

.field public static final q:LW5;

.field public static final r:LW5;

.field public static final s:LW5;

.field public static final t:Lpa;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lpa;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Lpa;-><init>(I)V

    sput-object v0, LW5;->t:Lpa;

    new-instance v1, LV5;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, LV5;-><init>(I)V

    sput-object v1, LW5;->b:LV5;

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v1, LW5;->c:Ljava/util/LinkedHashMap;

    const-string v1, "SSL_RSA_WITH_NULL_MD5"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "SSL_RSA_WITH_NULL_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "SSL_RSA_EXPORT_WITH_RC4_40_MD5"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "SSL_RSA_WITH_RC4_128_MD5"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "SSL_RSA_WITH_RC4_128_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "SSL_RSA_WITH_DES_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "SSL_RSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    move-result-object v1

    sput-object v1, LW5;->d:LW5;

    const-string v1, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "SSL_DHE_DSS_WITH_DES_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "SSL_DHE_RSA_WITH_DES_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "SSL_DH_anon_WITH_RC4_128_MD5"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "SSL_DH_anon_WITH_DES_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_KRB5_WITH_DES_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_KRB5_WITH_RC4_128_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_KRB5_WITH_DES_CBC_MD5"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_KRB5_WITH_RC4_128_MD5"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_RSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    move-result-object v1

    sput-object v1, LW5;->e:LW5;

    const-string v1, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_DH_anon_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_RSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    move-result-object v1

    sput-object v1, LW5;->f:LW5;

    const-string v1, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_DH_anon_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_RSA_WITH_NULL_SHA256"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_RSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_RSA_WITH_AES_256_CBC_SHA256"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_DH_anon_WITH_AES_128_CBC_SHA256"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_DH_anon_WITH_AES_256_CBC_SHA256"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_PSK_WITH_RC4_128_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_PSK_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_PSK_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_PSK_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_RSA_WITH_SEED_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_RSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    move-result-object v1

    sput-object v1, LW5;->g:LW5;

    const-string v1, "TLS_RSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    move-result-object v1

    sput-object v1, LW5;->h:LW5;

    const-string v1, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_DH_anon_WITH_AES_128_GCM_SHA256"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_DH_anon_WITH_AES_256_GCM_SHA384"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_FALLBACK_SCSV"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_ECDH_ECDSA_WITH_NULL_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_NULL_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_ECDH_RSA_WITH_NULL_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_ECDH_RSA_WITH_RC4_128_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_ECDHE_RSA_WITH_NULL_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_ECDHE_RSA_WITH_RC4_128_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    move-result-object v1

    sput-object v1, LW5;->i:LW5;

    const-string v1, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    move-result-object v1

    sput-object v1, LW5;->j:LW5;

    const-string v1, "TLS_ECDH_anon_WITH_NULL_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_ECDH_anon_WITH_RC4_128_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    move-result-object v1

    sput-object v1, LW5;->k:LW5;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    move-result-object v1

    sput-object v1, LW5;->l:LW5;

    const-string v1, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    move-result-object v1

    sput-object v1, LW5;->m:LW5;

    const-string v1, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    move-result-object v1

    sput-object v1, LW5;->n:LW5;

    const-string v1, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    move-result-object v1

    sput-object v1, LW5;->o:LW5;

    const-string v1, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    move-result-object v1

    sput-object v1, LW5;->p:LW5;

    const-string v1, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_AES_128_GCM_SHA256"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    move-result-object v1

    sput-object v1, LW5;->q:LW5;

    const-string v1, "TLS_AES_256_GCM_SHA384"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    move-result-object v1

    sput-object v1, LW5;->r:LW5;

    const-string v1, "TLS_CHACHA20_POLY1305_SHA256"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    move-result-object v1

    sput-object v1, LW5;->s:LW5;

    const-string v1, "TLS_AES_128_CCM_SHA256"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    const-string v1, "TLS_AES_128_CCM_8_SHA256"

    invoke-static {v0, v1}, Lpa;->n(Lpa;Ljava/lang/String;)LW5;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LW5;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LW5;->a:Ljava/lang/String;

    return-object v0
.end method
