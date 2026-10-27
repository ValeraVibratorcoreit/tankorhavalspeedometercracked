package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class Sp extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public Sp(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [Sp] */
    /* JADX WARN: Type inference failed for: r3v15, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        ?? r4;
        int i;
        ?? r6;
        ColorStateList colorStateList;
        int resourceId;
        Rp rp = new Rp(this, menu);
        int eventType = xmlResourceParser.getEventType();
        do {
            r4 = 1;
            i = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
                break;
            }
            eventType = xmlResourceParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == r4) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType == i) {
                if (!z2) {
                    String name2 = xmlResourceParser.getName();
                    boolean zEquals = name2.equals("group");
                    Sp sp = rp.E;
                    if (zEquals) {
                        ?? ObtainStyledAttributes = sp.c.obtainStyledAttributes(attributeSet, AbstractC0700wl.p);
                        rp.b = ObtainStyledAttributes.getResourceId(r4, 0);
                        rp.c = ObtainStyledAttributes.getInt(3, 0);
                        rp.d = ObtainStyledAttributes.getInt(4, 0);
                        rp.e = ObtainStyledAttributes.getInt(5, 0);
                        rp.f = ObtainStyledAttributes.getBoolean(2, r4);
                        rp.g = ObtainStyledAttributes.getBoolean(0, r4);
                        ObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        Context context = sp.c;
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0700wl.q);
                        rp.i = typedArrayObtainStyledAttributes.getResourceId(2, 0);
                        rp.j = (typedArrayObtainStyledAttributes.getInt(5, rp.c) & (-65536)) | (typedArrayObtainStyledAttributes.getInt(6, rp.d) & 65535);
                        rp.k = typedArrayObtainStyledAttributes.getText(7);
                        rp.l = typedArrayObtainStyledAttributes.getText(8);
                        rp.m = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                        String string = typedArrayObtainStyledAttributes.getString(9);
                        rp.n = string == null ? (char) 0 : string.charAt(0);
                        rp.o = typedArrayObtainStyledAttributes.getInt(16, 4096);
                        String string2 = typedArrayObtainStyledAttributes.getString(10);
                        rp.p = string2 == null ? (char) 0 : string2.charAt(0);
                        rp.q = typedArrayObtainStyledAttributes.getInt(20, 4096);
                        if (typedArrayObtainStyledAttributes.hasValue(11)) {
                            rp.r = typedArrayObtainStyledAttributes.getBoolean(11, false) ? 1 : 0;
                        } else {
                            rp.r = rp.e;
                        }
                        rp.s = typedArrayObtainStyledAttributes.getBoolean(3, false);
                        rp.t = typedArrayObtainStyledAttributes.getBoolean(4, rp.f);
                        rp.u = typedArrayObtainStyledAttributes.getBoolean(1, rp.g);
                        rp.v = typedArrayObtainStyledAttributes.getInt(21, -1);
                        rp.y = typedArrayObtainStyledAttributes.getString(12);
                        rp.w = typedArrayObtainStyledAttributes.getResourceId(13, 0);
                        rp.x = typedArrayObtainStyledAttributes.getString(15);
                        String string3 = typedArrayObtainStyledAttributes.getString(14);
                        boolean z3 = string3 != null;
                        if (z3 && rp.w == 0 && rp.x == null) {
                            rp.z = (ActionProviderVisibilityListenerC0790zi) rp.a(string3, f, sp.b);
                        } else {
                            if (z3) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            rp.z = null;
                        }
                        rp.A = typedArrayObtainStyledAttributes.getText(17);
                        rp.B = typedArrayObtainStyledAttributes.getText(22);
                        if (typedArrayObtainStyledAttributes.hasValue(19)) {
                            rp.D = W9.c(typedArrayObtainStyledAttributes.getInt(19, -1), rp.D);
                        } else {
                            rp.D = null;
                        }
                        if (typedArrayObtainStyledAttributes.hasValue(18)) {
                            if (!typedArrayObtainStyledAttributes.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(18, 0)) == 0 || (colorStateList = F4.C(context, resourceId)) == null) {
                                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(18);
                            }
                            rp.C = colorStateList;
                        } else {
                            rp.C = null;
                        }
                        typedArrayObtainStyledAttributes.recycle();
                        rp.h = false;
                        r6 = 1;
                    } else if (name2.equals("menu")) {
                        r6 = 1;
                        rp.h = true;
                        SubMenu subMenuAddSubMenu = rp.a.addSubMenu(rp.b, rp.i, rp.j, rp.k);
                        rp.b(subMenuAddSubMenu.getItem());
                        b(xmlResourceParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        r6 = 1;
                        str = name2;
                        z2 = true;
                    }
                }
                r6 = r4;
                z = z;
            } else if (eventType != 3) {
                r6 = r4;
                z = z;
            } else {
                String name3 = xmlResourceParser.getName();
                if (z2 && name3.equals(str)) {
                    r6 = r4;
                    z2 = false;
                    str = null;
                } else {
                    if (name3.equals("group")) {
                        rp.b = 0;
                        rp.c = 0;
                        rp.d = 0;
                        rp.e = 0;
                        rp.f = r4;
                        rp.g = r4;
                    } else if (name3.equals("item")) {
                        if (!rp.h) {
                            ActionProviderVisibilityListenerC0790zi actionProviderVisibilityListenerC0790zi = rp.z;
                            if (actionProviderVisibilityListenerC0790zi == null || !actionProviderVisibilityListenerC0790zi.b.hasSubMenu()) {
                                rp.h = r4;
                                rp.b(rp.a.add(rp.b, rp.i, rp.j, rp.k));
                            } else {
                                rp.h = r4;
                                rp.b(rp.a.addSubMenu(rp.b, rp.i, rp.j, rp.k).getItem());
                            }
                        }
                    } else if (name3.equals("menu")) {
                        ?? r7 = r4;
                        z = r7 == true ? 1 : 0;
                        r6 = r7;
                    }
                    r6 = r4;
                    z = z;
                }
            }
            eventType = xmlResourceParser.next();
            r4 = r6;
            i = 2;
            z = z;
            z2 = z2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof MenuC0604ti)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.c.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof MenuC0604ti) {
                    MenuC0604ti menuC0604ti = (MenuC0604ti) menu;
                    if (!menuC0604ti.p) {
                        menuC0604ti.w();
                        z = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((MenuC0604ti) menu).v();
                }
                layout.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z) {
                ((MenuC0604ti) menu).v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
