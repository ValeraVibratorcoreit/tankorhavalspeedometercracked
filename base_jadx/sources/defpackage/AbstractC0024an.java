package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: an, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0024an {
    public static final ThreadLocal a = new ThreadLocal();
    public static final WeakHashMap b = new WeakHashMap(0);
    public static final Object c = new Object();

    public static Typeface a(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00da  */
    public static Typeface b(Context context, int i, TypedValue typedValue, int i2, Br br, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceA = null;
        if (string.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            C0758yh c0758yh = Cr.b;
            Typeface typefaceS = (Typeface) c0758yh.a(Cr.b(resources, i, string, i3, i2));
            if (typefaceS != null) {
                if (br != null) {
                    new Handler(Looper.getMainLooper()).post(new B1(br, 10, typefaceS));
                }
            } else if (!z2) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        InterfaceC0382mc interfaceC0382mcO = Tf.O(resources.getXml(i), resources);
                        if (interfaceC0382mcO == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (br != null) {
                                br.i(-3);
                            }
                        } else {
                            typefaceA = Cr.a(context, interfaceC0382mcO, resources, i, string, typedValue.assetCookie, i2, br, z);
                        }
                    } else {
                        int i4 = typedValue.assetCookie;
                        typefaceS = Cr.a.s(context, resources, i, string, i2);
                        if (typefaceS != null) {
                            c0758yh.b(Cr.b(resources, i, string, i4, i2), typefaceS);
                        }
                        if (br != null) {
                            if (typefaceS != null) {
                                new Handler(Looper.getMainLooper()).post(new B1(br, 10, typefaceS));
                            } else {
                                br.i(-3);
                            }
                        }
                    }
                } catch (IOException e) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(string), e);
                    if (br != null) {
                        br.i(-3);
                    }
                } catch (XmlPullParserException e2) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(string), e2);
                    if (br != null) {
                        br.i(-3);
                    }
                }
            }
            typefaceA = typefaceS;
        } else if (br != null) {
            br.i(-3);
        }
        if (typefaceA != null || br != null || z2) {
            return typefaceA;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
