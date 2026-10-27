package defpackage;

import com.jcraft.jsch.SftpATTRS;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: ag, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0017ag extends Gk {
    public static final boolean c;

    /* JADX WARN: Code duplicated, block: B:21:0x0043  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062 A[EDGE_INSN: B:34:0x0062->B:37:0x006e BREAK  A[LOOP:0: B:20:0x0041->B:32:0x005d]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0067 A[EDGE_INSN: B:35:0x0067->B:37:0x006e BREAK  A[LOOP:0: B:20:0x0041->B:32:0x005d]] */
    /* JADX WARN: Code duplicated, block: B:36:0x006d A[EDGE_INSN: B:36:0x006d->B:37:0x006e BREAK  A[LOOP:0: B:20:0x0041->B:32:0x005d]] */
    /* JADX WARN: Code duplicated, block: B:48:0x0060 A[SYNTHETIC] */
    static {
        Integer numValueOf;
        int i;
        int i2;
        int i3;
        int iDigit;
        int i4;
        boolean z = true;
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            numValueOf = null;
            break;
        }
        F4.i(10);
        int length = property.length();
        if (length != 0) {
            char cCharAt = property.charAt(0);
            int i5 = -2147483647;
            if (Tf.k(cCharAt, 48) < 0) {
                if (length != 1) {
                    if (cCharAt != '-') {
                        if (cCharAt == '+') {
                            i = 1;
                            i2 = 0;
                            i3 = 0;
                            int i6 = -59652323;
                            while (true) {
                                if (i < length) {
                                    if (i2 != 0) {
                                        numValueOf = Integer.valueOf(-i3);
                                        break;
                                    } else {
                                        numValueOf = Integer.valueOf(i3);
                                        break;
                                    }
                                }
                                iDigit = Character.digit((int) property.charAt(i), 10);
                                if (iDigit >= 0 && ((i3 >= i6 || (i6 == -59652323 && i3 >= (i6 = i5 / 10))) && (i4 = i3 * 10) >= i5 + iDigit)) {
                                    i3 = i4 - iDigit;
                                    i++;
                                }
                            }
                        }
                    } else {
                        i5 = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
                        i = 1;
                    }
                }
                numValueOf = null;
                break;
            } else {
                i = 0;
            }
            i2 = i;
            i3 = 0;
            int i7 = -59652323;
            while (true) {
                if (i < length) {
                    if (i2 != 0) {
                        numValueOf = Integer.valueOf(-i3);
                        break;
                    } else {
                        numValueOf = Integer.valueOf(i3);
                        break;
                    }
                }
                iDigit = Character.digit((int) property.charAt(i), 10);
                if (iDigit >= 0) {
                    i3 = i4 - iDigit;
                    i++;
                }
                numValueOf = null;
                break;
            }
        }
        numValueOf = null;
        break;
        if (numValueOf == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", null);
            } catch (NoSuchMethodException unused) {
                z = false;
            }
        } else if (numValueOf.intValue() < 9) {
            z = false;
        }
        c = z;
    }

    @Override // defpackage.Gk
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Tf.j("protocols", list);
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((EnumC0268il) obj) != EnumC0268il.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0376m6.u0(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EnumC0268il) it.next()).a);
        }
        Tf.i("sslParameters", sSLParameters);
        Object[] array = arrayList2.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        sSLParameters.setApplicationProtocols((String[]) array);
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // defpackage.Gk
    public final String f(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (applicationProtocol.hashCode() == 0 && applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
