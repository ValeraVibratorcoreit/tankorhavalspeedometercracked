package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0280j3 implements Xi {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ C0280j3(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.Xi
    public final boolean a(Object obj) {
        switch (this.a) {
            case 0:
                Uri uri = (Uri) obj;
                return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
            case 1:
                return true;
            case 2:
                Iterator it = ((List) this.b).iterator();
                while (it.hasNext()) {
                    if (((Xi) it.next()).a(obj)) {
                        return true;
                    }
                }
                return false;
            case 3:
                return true;
            default:
                Uri uri2 = (Uri) obj;
                return "android.resource".equals(uri2.getScheme()) && ((Context) this.b).getPackageName().equals(uri2.getAuthority());
        }
    }

    @Override // defpackage.Xi
    public final Wi b(Object obj, int i, int i2, C0544rk c0544rk) {
        Wi wiB;
        Uri uri;
        switch (this.a) {
            case 0:
                Uri uri2 = (Uri) obj;
                return new Wi(new Lj(uri2), ((C0251i3) this.c).a((AssetManager) this.b, uri2.toString().substring(22)));
            case 1:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) c0544rk.c(Pm.b);
                return new Wi(new Lj(num), new C0257i9(theme, theme != null ? theme.getResources() : ((Context) this.b).getResources(), (S3) this.c, num.intValue()));
            case 2:
                List list = (List) this.b;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                InterfaceC0171fg interfaceC0171fg = null;
                for (int i3 = 0; i3 < size; i3++) {
                    Xi xi = (Xi) list.get(i3);
                    if (xi.a(obj) && (wiB = xi.b(obj, i, i2, c0544rk)) != null) {
                        arrayList.add(wiB.c);
                        interfaceC0171fg = wiB.a;
                    }
                }
                if (arrayList.isEmpty() || interfaceC0171fg == null) {
                    return null;
                }
                return new Wi(interfaceC0171fg, new C0236hj(arrayList, (Nk) this.c));
            case 3:
                Integer num2 = (Integer) obj;
                Resources resources = (Resources) this.c;
                try {
                    uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num2.intValue()) + '/' + resources.getResourceTypeName(num2.intValue()) + '/' + resources.getResourceEntryName(num2.intValue()));
                    break;
                } catch (Resources.NotFoundException e) {
                    if (Log.isLoggable("ResourceLoader", 5)) {
                        Log.w("ResourceLoader", "Received invalid resource id: " + num2, e);
                    }
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((Xi) this.b).b(uri, i, i2, c0544rk);
            default:
                Uri uri3 = (Uri) obj;
                List<String> pathSegments = uri3.getPathSegments();
                int size2 = pathSegments.size();
                Xi xi2 = (Xi) this.c;
                Wi wiB2 = null;
                if (size2 == 1) {
                    try {
                        int i4 = Integer.parseInt(uri3.getPathSegments().get(0));
                        if (i4 != 0) {
                            wiB2 = xi2.b(Integer.valueOf(i4), i, i2, c0544rk);
                        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                            Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri3);
                        }
                        return wiB2;
                    } catch (NumberFormatException e2) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return wiB2;
                        }
                        Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri3, e2);
                        return wiB2;
                    }
                }
                if (pathSegments.size() != 2) {
                    if (!Log.isLoggable("ResourceUriLoader", 5)) {
                        return null;
                    }
                    Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri3);
                    return null;
                }
                List<String> pathSegments2 = uri3.getPathSegments();
                String str = pathSegments2.get(0);
                String str2 = pathSegments2.get(1);
                Context context = (Context) this.b;
                int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
                if (identifier != 0) {
                    return xi2.b(Integer.valueOf(identifier), i, i2, c0544rk);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri3);
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((List) this.b).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    public C0280j3(Resources resources, Xi xi) {
        this.a = 3;
        this.c = resources;
        this.b = xi;
    }

    public C0280j3(Context context, S3 s3) {
        this.a = 1;
        this.b = context.getApplicationContext();
        this.c = s3;
    }

    public C0280j3(Context context, Xi xi) {
        this.a = 4;
        this.b = context.getApplicationContext();
        this.c = xi;
    }
}
