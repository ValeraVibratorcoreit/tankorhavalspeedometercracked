package defpackage;

import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes.dex */
public class Gk {
    public static volatile Gk a;
    public static final Logger b;

    /* JADX WARN: Code duplicated, block: B:27:0x0078 A[PHI: r1
      0x0078: PHI (r1v3 Gk) = (r1v1 Gk), (r1v4 Gk) binds: [B:66:0x0167, B:26:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00da  */
    /* JADX WARN: Code duplicated, block: B:48:0x00de  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:63:0x0110  */
    /* JADX WARN: Code duplicated, block: B:68:0x016b  */
    static {
        Provider provider;
        Provider provider2;
        Gk gk;
        String property;
        Gk zf = null;
        if (C0387mh.l()) {
            for (Map.Entry entry : X0.b.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (X0.a.add(logger)) {
                    Tf.i("logger", logger);
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(Y0.a);
                }
            }
            gk = U0.d ? new U0() : null;
            if (gk == null) {
                zf = C0002a1.e ? new C0002a1() : null;
                Tf.f(zf);
                gk = zf;
            }
        } else {
            Provider provider3 = Security.getProviders()[0];
            Tf.i("Security.getProviders()[0]", provider3);
            if ("Conscrypt".equals(provider3.getName())) {
                gk = C0101d7.d ? new C0101d7() : null;
                if (gk == null) {
                    provider = Security.getProviders()[0];
                    Tf.i("Security.getProviders()[0]", provider);
                    if ("BC".equals(provider.getName())) {
                        if (G4.d) {
                            gk = new G4();
                        } else {
                            gk = null;
                        }
                        if (gk == null) {
                            provider2 = Security.getProviders()[0];
                            Tf.i("Security.getProviders()[0]", provider2);
                            if ("OpenJSSE".equals(provider2.getName())) {
                                if (C0421nk.d) {
                                    gk = new C0421nk();
                                } else {
                                    gk = null;
                                }
                                if (gk == null) {
                                    if (C0017ag.c) {
                                        gk = new C0017ag();
                                    } else {
                                        gk = null;
                                    }
                                    if (gk == null) {
                                        property = System.getProperty("java.specification.version", "unknown");
                                        Tf.i("jvmVersion", property);
                                        if (Integer.parseInt(property) < 9) {
                                            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                            Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                            Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                            Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                            Method method = cls.getMethod("put", SSLSocket.class, cls2);
                                            Method method2 = cls.getMethod("get", SSLSocket.class);
                                            Method method3 = cls.getMethod("remove", SSLSocket.class);
                                            Tf.i("putMethod", method);
                                            Tf.i("getMethod", method2);
                                            Tf.i("removeMethod", method3);
                                            Tf.i("clientProviderClass", cls3);
                                            Tf.i("serverProviderClass", cls4);
                                            zf = new Zf(method, method2, method3, cls3, cls4);
                                        }
                                        if (zf != null) {
                                            gk = zf;
                                        } else {
                                            gk = new Gk();
                                        }
                                    }
                                }
                            } else {
                                if (C0017ag.c) {
                                    gk = new C0017ag();
                                } else {
                                    gk = null;
                                }
                                if (gk == null) {
                                    property = System.getProperty("java.specification.version", "unknown");
                                    Tf.i("jvmVersion", property);
                                    if (Integer.parseInt(property) < 9) {
                                        Class<?> cls5 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                        Class<?> cls6 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                        Class<?> cls7 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                        Class<?> cls8 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                        Method method4 = cls5.getMethod("put", SSLSocket.class, cls6);
                                        Method method5 = cls5.getMethod("get", SSLSocket.class);
                                        Method method6 = cls5.getMethod("remove", SSLSocket.class);
                                        Tf.i("putMethod", method4);
                                        Tf.i("getMethod", method5);
                                        Tf.i("removeMethod", method6);
                                        Tf.i("clientProviderClass", cls7);
                                        Tf.i("serverProviderClass", cls8);
                                        zf = new Zf(method4, method5, method6, cls7, cls8);
                                    }
                                    if (zf != null) {
                                        gk = zf;
                                    } else {
                                        gk = new Gk();
                                    }
                                }
                            }
                        }
                    } else {
                        provider2 = Security.getProviders()[0];
                        Tf.i("Security.getProviders()[0]", provider2);
                        if ("OpenJSSE".equals(provider2.getName())) {
                            if (C0017ag.c) {
                                gk = new C0017ag();
                            } else {
                                gk = null;
                            }
                            if (gk == null) {
                                property = System.getProperty("java.specification.version", "unknown");
                                Tf.i("jvmVersion", property);
                                if (Integer.parseInt(property) < 9) {
                                    Class<?> cls9 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                    Class<?> cls10 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                    Class<?> cls11 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                    Class<?> cls12 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                    Method method7 = cls9.getMethod("put", SSLSocket.class, cls10);
                                    Method method8 = cls9.getMethod("get", SSLSocket.class);
                                    Method method9 = cls9.getMethod("remove", SSLSocket.class);
                                    Tf.i("putMethod", method7);
                                    Tf.i("getMethod", method8);
                                    Tf.i("removeMethod", method9);
                                    Tf.i("clientProviderClass", cls11);
                                    Tf.i("serverProviderClass", cls12);
                                    zf = new Zf(method7, method8, method9, cls11, cls12);
                                }
                                if (zf != null) {
                                    gk = zf;
                                } else {
                                    gk = new Gk();
                                }
                            }
                        } else {
                            if (C0421nk.d) {
                                gk = new C0421nk();
                            } else {
                                gk = null;
                            }
                            if (gk == null) {
                                if (C0017ag.c) {
                                    gk = new C0017ag();
                                } else {
                                    gk = null;
                                }
                                if (gk == null) {
                                    property = System.getProperty("java.specification.version", "unknown");
                                    Tf.i("jvmVersion", property);
                                    if (Integer.parseInt(property) < 9) {
                                        Class<?> cls13 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                        Class<?> cls14 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                        Class<?> cls15 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                        Class<?> cls16 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                        Method method10 = cls13.getMethod("put", SSLSocket.class, cls14);
                                        Method method11 = cls13.getMethod("get", SSLSocket.class);
                                        Method method12 = cls13.getMethod("remove", SSLSocket.class);
                                        Tf.i("putMethod", method10);
                                        Tf.i("getMethod", method11);
                                        Tf.i("removeMethod", method12);
                                        Tf.i("clientProviderClass", cls15);
                                        Tf.i("serverProviderClass", cls16);
                                        zf = new Zf(method10, method11, method12, cls15, cls16);
                                    }
                                    if (zf != null) {
                                        gk = zf;
                                    } else {
                                        gk = new Gk();
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                provider = Security.getProviders()[0];
                Tf.i("Security.getProviders()[0]", provider);
                if ("BC".equals(provider.getName())) {
                    provider2 = Security.getProviders()[0];
                    Tf.i("Security.getProviders()[0]", provider2);
                    if ("OpenJSSE".equals(provider2.getName())) {
                        if (C0017ag.c) {
                            gk = new C0017ag();
                        } else {
                            gk = null;
                        }
                        if (gk == null) {
                            property = System.getProperty("java.specification.version", "unknown");
                            try {
                                Tf.i("jvmVersion", property);
                                if (Integer.parseInt(property) < 9) {
                                    try {
                                        Class<?> cls17 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                        Class<?> cls18 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                        Class<?> cls19 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                        Class<?> cls110 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                        Method method13 = cls17.getMethod("put", SSLSocket.class, cls18);
                                        Method method14 = cls17.getMethod("get", SSLSocket.class);
                                        Method method15 = cls17.getMethod("remove", SSLSocket.class);
                                        Tf.i("putMethod", method13);
                                        Tf.i("getMethod", method14);
                                        Tf.i("removeMethod", method15);
                                        Tf.i("clientProviderClass", cls19);
                                        Tf.i("serverProviderClass", cls110);
                                        zf = new Zf(method13, method14, method15, cls19, cls110);
                                    } catch (ClassNotFoundException | NoSuchMethodException unused) {
                                    }
                                }
                            } catch (NumberFormatException unused2) {
                            }
                            if (zf != null) {
                                gk = zf;
                            } else {
                                gk = new Gk();
                            }
                        }
                    } else {
                        if (C0421nk.d) {
                            gk = new C0421nk();
                        } else {
                            gk = null;
                        }
                        if (gk == null) {
                            if (C0017ag.c) {
                                gk = new C0017ag();
                            } else {
                                gk = null;
                            }
                            if (gk == null) {
                                property = System.getProperty("java.specification.version", "unknown");
                                Tf.i("jvmVersion", property);
                                if (Integer.parseInt(property) < 9) {
                                    Class<?> cls111 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                    Class<?> cls112 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                    Class<?> cls113 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                    Class<?> cls114 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                    Method method16 = cls111.getMethod("put", SSLSocket.class, cls112);
                                    Method method17 = cls111.getMethod("get", SSLSocket.class);
                                    Method method18 = cls111.getMethod("remove", SSLSocket.class);
                                    Tf.i("putMethod", method16);
                                    Tf.i("getMethod", method17);
                                    Tf.i("removeMethod", method18);
                                    Tf.i("clientProviderClass", cls113);
                                    Tf.i("serverProviderClass", cls114);
                                    zf = new Zf(method16, method17, method18, cls113, cls114);
                                }
                                if (zf != null) {
                                    gk = zf;
                                } else {
                                    gk = new Gk();
                                }
                            }
                        }
                    }
                } else {
                    if (G4.d) {
                        gk = new G4();
                    } else {
                        gk = null;
                    }
                    if (gk == null) {
                        provider2 = Security.getProviders()[0];
                        Tf.i("Security.getProviders()[0]", provider2);
                        if ("OpenJSSE".equals(provider2.getName())) {
                            if (C0017ag.c) {
                                gk = new C0017ag();
                            } else {
                                gk = null;
                            }
                            if (gk == null) {
                                property = System.getProperty("java.specification.version", "unknown");
                                Tf.i("jvmVersion", property);
                                if (Integer.parseInt(property) < 9) {
                                    Class<?> cls115 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                    Class<?> cls116 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                    Class<?> cls117 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                    Class<?> cls118 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                    Method method19 = cls115.getMethod("put", SSLSocket.class, cls116);
                                    Method method110 = cls115.getMethod("get", SSLSocket.class);
                                    Method method111 = cls115.getMethod("remove", SSLSocket.class);
                                    Tf.i("putMethod", method19);
                                    Tf.i("getMethod", method110);
                                    Tf.i("removeMethod", method111);
                                    Tf.i("clientProviderClass", cls117);
                                    Tf.i("serverProviderClass", cls118);
                                    zf = new Zf(method19, method110, method111, cls117, cls118);
                                }
                                if (zf != null) {
                                    gk = zf;
                                } else {
                                    gk = new Gk();
                                }
                            }
                        } else {
                            if (C0421nk.d) {
                                gk = new C0421nk();
                            } else {
                                gk = null;
                            }
                            if (gk == null) {
                                if (C0017ag.c) {
                                    gk = new C0017ag();
                                } else {
                                    gk = null;
                                }
                                if (gk == null) {
                                    property = System.getProperty("java.specification.version", "unknown");
                                    Tf.i("jvmVersion", property);
                                    if (Integer.parseInt(property) < 9) {
                                        Class<?> cls119 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                                        Class<?> cls1110 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                                        Class<?> cls1111 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                                        Class<?> cls1112 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                                        Method method112 = cls119.getMethod("put", SSLSocket.class, cls1110);
                                        Method method113 = cls119.getMethod("get", SSLSocket.class);
                                        Method method114 = cls119.getMethod("remove", SSLSocket.class);
                                        Tf.i("putMethod", method112);
                                        Tf.i("getMethod", method113);
                                        Tf.i("removeMethod", method114);
                                        Tf.i("clientProviderClass", cls1111);
                                        Tf.i("serverProviderClass", cls1112);
                                        zf = new Zf(method112, method113, method114, cls1111, cls1112);
                                    }
                                    if (zf != null) {
                                        gk = zf;
                                    } else {
                                        gk = new Gk();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        a = gk;
        b = Logger.getLogger(Pj.class.getName());
    }

    public static void i(int i, String str, Throwable th) {
        Tf.j("message", str);
        b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void a(SSLSocket sSLSocket) {
    }

    public AbstractC0390mk b(X509TrustManager x509TrustManager) {
        return new C0281j4(c(x509TrustManager));
    }

    public InterfaceC0706wr c(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        Tf.i("trustManager.acceptedIssuers", acceptedIssuers);
        return new C0374m4((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void d(SSLSocket sSLSocket, String str, List list) {
        Tf.j("protocols", list);
    }

    public void e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        Tf.j("address", inetSocketAddress);
        socket.connect(inetSocketAddress, i);
    }

    public String f(SSLSocket sSLSocket) {
        return null;
    }

    public Object g() {
        if (b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean h(String str) {
        Tf.j("hostname", str);
        return true;
    }

    public void j(String str, Object obj) {
        Tf.j("message", str);
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        i(5, str, (Throwable) obj);
    }

    public SSLContext k() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        Tf.i("SSLContext.getInstance(\"TLS\")", sSLContext);
        return sSLContext;
    }

    public SSLSocketFactory l(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContextK = k();
            sSLContextK.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = sSLContextK.getSocketFactory();
            Tf.i("newSSLContext().apply {\n…ll)\n      }.socketFactory", socketFactory);
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    public X509TrustManager m() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        Tf.f(trustManagers);
        if (!(trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager))) {
            String string = Arrays.toString(trustManagers);
            Tf.i("java.util.Arrays.toString(this)", string);
            throw new IllegalStateException("Unexpected default trust managers: ".concat(string).toString());
        }
        TrustManager trustManager = trustManagers[0];
        if (trustManager != null) {
            return (X509TrustManager) trustManager;
        }
        throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
