package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class Lp extends AbstractC0293jg implements InterfaceC0785zd {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Lp(Object obj, boolean z, int i) {
        super(2);
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x009d A[LOOP:0: B:26:0x006a->B:37:0x009d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d4 A[LOOP:2: B:40:0x00a3->B:51:0x00d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:61:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00d7 A[SYNTHETIC] */
    public final C0761yk d(Object obj, Integer num) {
        Object next;
        String str;
        C0761yk c0761yk;
        String str2;
        Object next2;
        String str3;
        String str4;
        switch (this.b) {
            case 0:
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue = num.intValue();
                Tf.j("$this$$receiver", charSequence);
                int iK0 = Mp.K0(charSequence, (char[]) this.d, iIntValue, this.c);
                if (iK0 < 0) {
                    return null;
                }
                return new C0761yk(Integer.valueOf(iK0), 1);
            default:
                CharSequence charSequence2 = (CharSequence) obj;
                int iIntValue2 = num.intValue();
                Tf.j("$this$$receiver", charSequence2);
                List list = (List) this.d;
                boolean z = this.c;
                if (z || list.size() != 1) {
                    if (iIntValue2 < 0) {
                        iIntValue2 = 0;
                    }
                    boolean z2 = charSequence2 instanceof String;
                    int i = new Pf(iIntValue2, charSequence2.length(), 1).b;
                    if (z2) {
                        if (iIntValue2 > i) {
                            c0761yk = null;
                        } else {
                            while (true) {
                                Iterator it = list.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        str4 = (String) next2;
                                    } else {
                                        next2 = null;
                                    }
                                    str3 = (String) next2;
                                    if (str3 != null) {
                                        c0761yk = new C0761yk(Integer.valueOf(iIntValue2), str3);
                                    } else if (iIntValue2 != i) {
                                        iIntValue2++;
                                    } else {
                                        c0761yk = null;
                                    }
                                } while (!Mp.N0(0, iIntValue2, str4.length(), str4, (String) charSequence2, z));
                                str3 = (String) next2;
                                if (str3 != null) {
                                    c0761yk = new C0761yk(Integer.valueOf(iIntValue2), str3);
                                } else if (iIntValue2 != i) {
                                    iIntValue2++;
                                } else {
                                    c0761yk = null;
                                }
                            }
                        }
                    } else if (iIntValue2 > i) {
                        c0761yk = null;
                    } else {
                        while (true) {
                            Iterator it2 = list.iterator();
                            do {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    str2 = (String) next;
                                } else {
                                    next = null;
                                }
                                str = (String) next;
                                if (str != null) {
                                    c0761yk = new C0761yk(Integer.valueOf(iIntValue2), str);
                                } else if (iIntValue2 != i) {
                                    iIntValue2++;
                                } else {
                                    c0761yk = null;
                                }
                            } while (!Mp.O0(str2, 0, charSequence2, iIntValue2, str2.length(), z));
                            str = (String) next;
                            if (str != null) {
                                c0761yk = new C0761yk(Integer.valueOf(iIntValue2), str);
                            } else if (iIntValue2 != i) {
                                iIntValue2++;
                            } else {
                                c0761yk = null;
                            }
                        }
                    }
                } else {
                    int size = list.size();
                    if (size == 0) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    if (size != 1) {
                        throw new IllegalArgumentException("List has more than one element.");
                    }
                    String str5 = (String) list.get(0);
                    int iJ0 = Mp.J0(charSequence2, str5, iIntValue2, false, 4);
                    if (iJ0 < 0) {
                        c0761yk = null;
                    } else {
                        c0761yk = new C0761yk(Integer.valueOf(iJ0), str5);
                    }
                }
                if (c0761yk == null) {
                    return null;
                }
                return new C0761yk(c0761yk.a, Integer.valueOf(((String) c0761yk.b).length()));
        }
    }
}
