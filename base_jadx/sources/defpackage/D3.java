package defpackage;

import java.io.File;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class D3 implements Comparator {
    public final /* synthetic */ int a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return new File(((F3) obj).a.getPath()).getName().compareTo(new File(((F3) obj2).a.getPath()).getName());
            case 1:
                return new File(((F3) obj).a.getPath()).getName().compareTo(new File(((F3) obj2).a.getPath()).getName());
            default:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
        }
    }
}
