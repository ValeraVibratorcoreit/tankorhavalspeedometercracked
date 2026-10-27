package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: renamed from: hf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0232hf implements InterfaceC0009a8 {
    public final C0046be a;
    public final int b;
    public HttpURLConnection c;
    public InputStream d;
    public volatile boolean e;

    public C0232hf(C0046be c0046be, int i) {
        this.a = c0046be;
        this.b = i;
    }

    public static int b(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e);
            return -1;
        }
    }

    @Override // defpackage.InterfaceC0009a8
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.InterfaceC0009a8
    public final void c() {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.c = null;
    }

    @Override // defpackage.InterfaceC0009a8
    public final void cancel() {
        this.e = true;
    }

    @Override // defpackage.InterfaceC0009a8
    public final void d(Uk uk, Z7 z7) {
        StringBuilder sb;
        C0046be c0046be = this.a;
        int i = AbstractC0449oh.b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            z7.m(f(c0046be.d(), 0, null, c0046be.b.a()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder("Finished http url fetcher fetch in ");
                sb.append(AbstractC0449oh.a(jElapsedRealtimeNanos));
                String string = sb.toString();
            }
        } catch (IOException e) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e);
            }
            z7.h(e);
            if (!Log.isLoggable("HttpUrlFetcher", 2)) {
            } else {
                sb = new StringBuilder("Finished http url fetcher fetch in ");
            }
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + AbstractC0449oh.a(jElapsedRealtimeNanos));
            }
        }
    }

    @Override // defpackage.InterfaceC0009a8
    public final int e() {
        return 2;
    }

    public final InputStream f(URL url, int i, URL url2, Map map) throws C0078cf {
        if (i >= 5) {
            throw new C0078cf("Too many (> 5) redirects!", -1, null);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new C0078cf("In re-direct loop", -1, null);
                }
            } catch (URISyntaxException unused) {
            }
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            int i2 = this.b;
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.c = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.d = this.c.getInputStream();
                if (this.e) {
                    return null;
                }
                int iB = b(this.c);
                int i3 = iB / 100;
                if (i3 == 2) {
                    HttpURLConnection httpURLConnection2 = this.c;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.d = new F7(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.d = httpURLConnection2.getInputStream();
                        }
                        return this.d;
                    } catch (IOException e) {
                        throw new C0078cf("Failed to obtain InputStream", b(httpURLConnection2), e);
                    }
                }
                if (i3 != 3) {
                    if (iB == -1) {
                        throw new C0078cf("Http request failed", iB, null);
                    }
                    try {
                        throw new C0078cf(this.c.getResponseMessage(), iB, null);
                    } catch (IOException e2) {
                        throw new C0078cf("Failed to get a response message", iB, e2);
                    }
                }
                String headerField = this.c.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new C0078cf("Received empty or null redirect url", iB, null);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    c();
                    return f(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new C0078cf("Bad redirect url: " + headerField, iB, e3);
                }
            } catch (IOException e4) {
                throw new C0078cf("Failed to connect or obtain data", b(this.c), e4);
            }
        } catch (IOException e5) {
            throw new C0078cf("URL.openConnection threw", 0, e5);
        }
    }
}
