package defpackage;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: renamed from: s3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0558s3 implements Mc {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public String h;
    public int i;
    public CharSequence j;
    public int k;
    public CharSequence l;
    public ArrayList m;
    public ArrayList n;
    public boolean o;
    public final Oc p;
    public boolean q;
    public int r;

    public C0558s3(Oc oc) {
        oc.D();
        Bc bc = oc.t;
        if (bc != null) {
            bc.k.getClassLoader();
        }
        this.a = new ArrayList();
        this.o = false;
        this.r = -1;
        this.p = oc;
    }

    @Override // defpackage.Mc
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        Oc oc = this.p;
        if (oc.d == null) {
            oc.d = new ArrayList();
        }
        oc.d.add(this);
        return true;
    }

    public final void b(Zc zc) {
        this.a.add(zc);
        zc.d = this.b;
        zc.e = this.c;
        zc.f = this.d;
        zc.g = this.e;
    }

    public final void c(int i) {
        if (this.g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Zc zc = (Zc) arrayList.get(i2);
                AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = zc.b;
                if (abstractComponentCallbacksC0784zc != null) {
                    abstractComponentCallbacksC0784zc.q += i;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Bump nesting of " + zc.b + " to " + zc.b.q);
                    }
                }
            }
        }
    }

    public final int d(boolean z) {
        if (this.q) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new C0480ph());
            f("  ", printWriter, true);
            printWriter.close();
        }
        this.q = true;
        boolean z2 = this.g;
        Oc oc = this.p;
        if (z2) {
            this.r = oc.i.getAndIncrement();
        } else {
            this.r = -1;
        }
        oc.w(this, z);
        return this.r;
    }

    public final void e(int i, AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc, String str, int i2) {
        String str2 = abstractComponentCallbacksC0784zc.K;
        if (str2 != null) {
            Yc.c(abstractComponentCallbacksC0784zc, str2);
        }
        Class<?> cls = abstractComponentCallbacksC0784zc.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = abstractComponentCallbacksC0784zc.x;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + abstractComponentCallbacksC0784zc + ": was " + abstractComponentCallbacksC0784zc.x + " now " + str);
            }
            abstractComponentCallbacksC0784zc.x = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC0784zc + " with tag " + str + " to container view with no id");
            }
            int i3 = abstractComponentCallbacksC0784zc.v;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC0784zc + ": was " + abstractComponentCallbacksC0784zc.v + " now " + i);
            }
            abstractComponentCallbacksC0784zc.v = i;
            abstractComponentCallbacksC0784zc.w = i;
        }
        b(new Zc(i2, abstractComponentCallbacksC0784zc));
        abstractComponentCallbacksC0784zc.r = this.p;
    }

    public final void f(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.h);
            printWriter.print(" mIndex=");
            printWriter.print(this.r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.q);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (this.b != 0 || this.c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (this.i != 0 || this.j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.j);
            }
            if (this.k != 0 || this.l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.l);
            }
        }
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Zc zc = (Zc) arrayList.get(i);
            switch (zc.a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + zc.a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(zc.b);
            if (z) {
                if (zc.d != 0 || zc.e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(zc.d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(zc.e));
                }
                if (zc.f != 0 || zc.g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(zc.f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(zc.g));
                }
            }
        }
    }

    public final void g(AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc) {
        Oc oc = abstractComponentCallbacksC0784zc.r;
        if (oc == null || oc == this.p) {
            b(new Zc(3, abstractComponentCallbacksC0784zc));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + abstractComponentCallbacksC0784zc.toString() + " is already attached to a FragmentManager.");
    }

    public final void h(int i, AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        e(i, abstractComponentCallbacksC0784zc, str, 2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.r >= 0) {
            sb.append(" #");
            sb.append(this.r);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
