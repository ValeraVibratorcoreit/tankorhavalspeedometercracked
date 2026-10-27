package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: f3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0158f3 extends AbstractC0390mk {
    public static void P(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        Tf.j("<this>", bArr);
        Tf.j("destination", bArr2);
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    public static final void Q(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        Tf.j("<this>", objArr);
        Tf.j("destination", objArr2);
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static byte[] R(int i, int i2, byte[] bArr) {
        Tf.j("<this>", bArr);
        int length = bArr.length;
        if (i2 <= length) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
            Tf.i("copyOfRange(this, fromIndex, toIndex)", bArrCopyOfRange);
            return bArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is greater than size (" + length + ").");
    }

    public static void S(Object[] objArr, int i, int i2) {
        Tf.j("<this>", objArr);
        Arrays.fill(objArr, i, i2, (Object) null);
    }

    public static ArrayList T(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static char U(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }
}
