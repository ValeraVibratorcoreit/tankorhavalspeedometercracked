package defpackage;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: ti, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class MenuC0604ti implements Menu {
    public static final int[] y = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public final Resources b;
    public boolean c;
    public final boolean d;
    public InterfaceC0542ri e;
    public final ArrayList f;
    public final ArrayList g;
    public boolean h;
    public final ArrayList i;
    public final ArrayList j;
    public boolean k;
    public CharSequence m;
    public Drawable n;
    public View o;
    public C0759yi v;
    public boolean x;
    public int l = 0;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public final ArrayList t = new ArrayList();
    public final CopyOnWriteArrayList u = new CopyOnWriteArrayList();
    public boolean w = false;

    public MenuC0604ti(Context context) {
        boolean z = false;
        this.a = context;
        Resources resources = context.getResources();
        this.b = resources;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = true;
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = true;
        if (resources.getConfiguration().keyboard != 1 && Is.b(ViewConfiguration.get(context))) {
            z = true;
        }
        this.d = z;
    }

    public final C0759yi a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (y[i5] << 16) | (65535 & i3);
        C0759yi c0759yi = new C0759yi(this, i, i2, i3, i6, charSequence, this.l);
        ArrayList arrayList = this.f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((C0759yi) arrayList.get(size)).d <= i6) {
                i4 = size + 1;
                arrayList.add(i4, c0759yi);
                p(true);
                return c0759yi;
            }
        }
        i4 = 0;
        arrayList.add(i4, c0759yi);
        p(true);
        return c0759yi;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            C0759yi c0759yiA = a(i, i2, i3, resolveInfo.loadLabel(packageManager));
            c0759yiA.setIcon(resolveInfo.loadIcon(packageManager));
            c0759yiA.g = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = c0759yiA;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(Li li, Context context) {
        this.u.add(new WeakReference(li));
        li.j(context, this);
        this.k = true;
    }

    public final void c(boolean z) {
        if (this.s) {
            return;
        }
        this.s = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            Li li = (Li) weakReference.get();
            if (li == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                li.b(this, z);
            }
        }
        this.s = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        C0759yi c0759yi = this.v;
        if (c0759yi != null) {
            d(c0759yi);
        }
        this.f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.n = null;
        this.m = null;
        this.o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(C0759yi c0759yi) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        boolean zD = false;
        if (!copyOnWriteArrayList.isEmpty() && this.v == c0759yi) {
            w();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                Li li = (Li) weakReference.get();
                if (li != null) {
                    zD = li.d(c0759yi);
                    if (zD) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            v();
            if (zD) {
                this.v = null;
            }
        }
        return zD;
    }

    public boolean e(MenuC0604ti menuC0604ti, MenuItem menuItem) {
        InterfaceC0542ri interfaceC0542ri = this.e;
        return interfaceC0542ri != null && interfaceC0542ri.n(menuC0604ti, menuItem);
    }

    public boolean f(C0759yi c0759yi) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        boolean zG = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            Li li = (Li) weakReference.get();
            if (li != null) {
                zG = li.g(c0759yi);
                if (zG) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        v();
        if (zG) {
            this.v = c0759yi;
        }
        return zG;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0759yi c0759yi = (C0759yi) arrayList.get(i2);
            if (c0759yi.a == i) {
                return c0759yi;
            }
            if (c0759yi.hasSubMenu() && (menuItemFindItem = c0759yi.o.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final C0759yi g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.t;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C0759yi) arrayList.get(0);
        }
        boolean zN = n();
        for (int i2 = 0; i2 < size; i2++) {
            C0759yi c0759yi = (C0759yi) arrayList.get(i2);
            char c = zN ? c0759yi.j : c0759yi.h;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zN && c == '\b' && i == 67))) {
                return c0759yi;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f.get(i);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    public final void h(List list, int i, KeyEvent keyEvent) {
        boolean zN = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.f;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0759yi c0759yi = (C0759yi) arrayList.get(i2);
                if (c0759yi.hasSubMenu()) {
                    c0759yi.o.h(list, i, keyEvent);
                }
                char c = zN ? c0759yi.j : c0759yi.h;
                if ((modifiers & 69647) == ((zN ? c0759yi.k : c0759yi.i) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if (c != cArr[0] && c != cArr[2]) {
                        if (zN && c == '\b') {
                            if (i == 67) {
                            }
                        }
                    }
                    if (c0759yi.isEnabled()) {
                        list.add(c0759yi);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.x) {
            return true;
        }
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C0759yi) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList arrayListL = l();
        if (this.k) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
            boolean zC = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                Li li = (Li) weakReference.get();
                if (li == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zC |= li.c();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.j;
            if (zC) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListL.size();
                for (int i = 0; i < size; i++) {
                    C0759yi c0759yi = (C0759yi) arrayListL.get(i);
                    if (c0759yi.f()) {
                        arrayList.add(c0759yi);
                    } else {
                        arrayList2.add(c0759yi);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public MenuC0604ti k() {
        return this;
    }

    public final ArrayList l() {
        boolean z = this.h;
        ArrayList arrayList = this.g;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C0759yi c0759yi = (C0759yi) arrayList2.get(i);
            if (c0759yi.isVisible()) {
                arrayList.add(c0759yi);
            }
        }
        this.h = false;
        this.k = true;
        return arrayList;
    }

    public boolean m() {
        return this.w;
    }

    public boolean n() {
        return this.c;
    }

    public boolean o() {
        return this.d;
    }

    public final void p(boolean z) {
        if (this.p) {
            this.q = true;
            if (z) {
                this.r = true;
                return;
            }
            return;
        }
        if (z) {
            this.h = true;
            this.k = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            Li li = (Li) weakReference.get();
            if (li == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                li.h();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return q(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0759yi c0759yiG = g(i, keyEvent);
        boolean zQ = c0759yiG != null ? q(c0759yiG, null, i2) : false;
        if ((i2 & 2) != 0) {
            c(true);
        }
        return zQ;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0018  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00b1 A[SYNTHETIC] */
    public final boolean q(MenuItem menuItem, Li li, int i) {
        ActionProviderVisibilityListenerC0790zi actionProviderVisibilityListenerC0790zi;
        boolean zExpandActionView;
        ActionProviderVisibilityListenerC0790zi actionProviderVisibilityListenerC0790zi2;
        boolean z;
        Np np;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList;
        Li li2;
        C0759yi c0759yi = (C0759yi) menuItem;
        boolean zK = false;
        if (c0759yi == null || !c0759yi.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = c0759yi.p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(c0759yi)) {
            MenuC0604ti menuC0604ti = c0759yi.n;
            if (menuC0604ti.e(menuC0604ti, c0759yi)) {
                zExpandActionView = true;
            } else {
                Intent intent = c0759yi.g;
                if (intent != null) {
                    try {
                        menuC0604ti.a.startActivity(intent);
                    } catch (ActivityNotFoundException e) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                        actionProviderVisibilityListenerC0790zi = c0759yi.A;
                        if (actionProviderVisibilityListenerC0790zi == null) {
                        }
                        zExpandActionView = false;
                        actionProviderVisibilityListenerC0790zi2 = c0759yi.A;
                        if (actionProviderVisibilityListenerC0790zi2 == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (c0759yi.e()) {
                            zExpandActionView |= c0759yi.expandActionView();
                            if (zExpandActionView) {
                                c(true);
                            }
                        } else if (c0759yi.hasSubMenu()) {
                            if ((i & 4) == 0) {
                                c(false);
                            }
                            if (!c0759yi.hasSubMenu()) {
                                Np np2 = new Np(this.a, this, c0759yi);
                                c0759yi.o = np2;
                                np2.setHeaderTitle(c0759yi.e);
                            }
                            np = c0759yi.o;
                            if (z) {
                                actionProviderVisibilityListenerC0790zi2.c.getClass();
                                actionProviderVisibilityListenerC0790zi2.b.onPrepareSubMenu(np);
                            }
                            copyOnWriteArrayList = this.u;
                            if (!copyOnWriteArrayList.isEmpty()) {
                                if (li != null) {
                                }
                                for (WeakReference weakReference : copyOnWriteArrayList) {
                                    li2 = (Li) weakReference.get();
                                    if (li2 == null) {
                                        copyOnWriteArrayList.remove(weakReference);
                                    } else if (!zK) {
                                        zK = li2.k(np);
                                    }
                                }
                            }
                            zExpandActionView |= zK;
                            if (!zExpandActionView) {
                                c(true);
                            }
                        } else {
                            if ((i & 4) == 0) {
                                c(false);
                            }
                            if (!c0759yi.hasSubMenu()) {
                                Np np3 = new Np(this.a, this, c0759yi);
                                c0759yi.o = np3;
                                np3.setHeaderTitle(c0759yi.e);
                            }
                            np = c0759yi.o;
                            if (z) {
                                actionProviderVisibilityListenerC0790zi2.c.getClass();
                                actionProviderVisibilityListenerC0790zi2.b.onPrepareSubMenu(np);
                            }
                            copyOnWriteArrayList = this.u;
                            if (!copyOnWriteArrayList.isEmpty()) {
                                zK = li != null ? li.k(np) : false;
                                while (r8.hasNext()) {
                                    li2 = (Li) weakReference.get();
                                    if (li2 == null) {
                                        copyOnWriteArrayList.remove(weakReference);
                                    } else if (!zK) {
                                        zK = li2.k(np);
                                    }
                                }
                            }
                            zExpandActionView |= zK;
                            if (!zExpandActionView) {
                                c(true);
                            }
                        }
                        return zExpandActionView;
                    }
                    zExpandActionView = true;
                } else {
                    actionProviderVisibilityListenerC0790zi = c0759yi.A;
                    if (actionProviderVisibilityListenerC0790zi == null && actionProviderVisibilityListenerC0790zi.b.onPerformDefaultAction()) {
                        zExpandActionView = true;
                    } else {
                        zExpandActionView = false;
                    }
                }
            }
        } else {
            zExpandActionView = true;
        }
        actionProviderVisibilityListenerC0790zi2 = c0759yi.A;
        if (actionProviderVisibilityListenerC0790zi2 == null && actionProviderVisibilityListenerC0790zi2.b.hasSubMenu()) {
            z = true;
        } else {
            z = false;
        }
        if (c0759yi.e()) {
            zExpandActionView |= c0759yi.expandActionView();
            if (zExpandActionView) {
                c(true);
            }
        } else if (c0759yi.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                c(false);
            }
            if (!c0759yi.hasSubMenu()) {
                Np np4 = new Np(this.a, this, c0759yi);
                c0759yi.o = np4;
                np4.setHeaderTitle(c0759yi.e);
            }
            np = c0759yi.o;
            if (z) {
                actionProviderVisibilityListenerC0790zi2.c.getClass();
                actionProviderVisibilityListenerC0790zi2.b.onPrepareSubMenu(np);
            }
            copyOnWriteArrayList = this.u;
            if (!copyOnWriteArrayList.isEmpty()) {
                if (li != null) {
                }
                while (r8.hasNext()) {
                    li2 = (Li) weakReference.get();
                    if (li2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zK) {
                        zK = li2.k(np);
                    }
                }
            }
            zExpandActionView |= zK;
            if (!zExpandActionView) {
                c(true);
            }
        } else if ((i & 1) == 0) {
            c(true);
        }
        return zExpandActionView;
    }

    public final void r(Li li) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.u;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            Li li2 = (Li) weakReference.get();
            if (li2 == null || li2 == li) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((C0759yi) arrayList.get(i3)).b == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((C0759yi) arrayList.get(i3)).b != i) {
                    break;
                }
                if (i3 >= 0) {
                    ArrayList arrayList2 = this.f;
                    if (i3 < arrayList2.size()) {
                        arrayList2.remove(i3);
                    }
                }
                i2 = i4;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((C0759yi) arrayList.get(i2)).a == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            ArrayList arrayList2 = this.f;
            if (i2 >= arrayList2.size()) {
                return;
            }
            arrayList2.remove(i2);
            p(true);
        }
    }

    public final void s(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((Np) item.getSubMenu()).s(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0759yi c0759yi = (C0759yi) arrayList.get(i2);
            if (c0759yi.b == i) {
                c0759yi.x = (c0759yi.x & (-5)) | (z2 ? 4 : 0);
                c0759yi.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.w = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0759yi c0759yi = (C0759yi) arrayList.get(i2);
            if (c0759yi.b == i) {
                c0759yi.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0759yi c0759yi = (C0759yi) arrayList.get(i2);
            if (c0759yi.b == i) {
                int i3 = c0759yi.x;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                c0759yi.x = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.c = z;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((Np) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.o = view;
            this.m = null;
            this.n = null;
        } else {
            if (i > 0) {
                this.m = this.b.getText(i);
            } else if (charSequence != null) {
                this.m = charSequence;
            }
            if (i2 > 0) {
                this.n = H7.b(this.a, i2);
            } else if (drawable != null) {
                this.n = drawable;
            }
            this.o = null;
        }
        p(false);
    }

    public final void v() {
        this.p = false;
        if (this.q) {
            this.q = false;
            p(this.r);
        }
    }

    public final void w() {
        if (this.p) {
            return;
        }
        this.p = true;
        this.q = false;
        this.r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0759yi c0759yiA = a(i, i2, i3, charSequence);
        Np np = new Np(this.a, this, c0759yiA);
        c0759yiA.o = np;
        np.setHeaderTitle(c0759yiA.e);
        return np;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.b.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.b.getString(i4));
    }
}
