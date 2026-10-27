package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: ic, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0260ic implements InterfaceC0748y7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0260ic(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC0748y7
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                C0289jc c0289jc = (C0289jc) obj;
                if (c0289jc == null) {
                    c0289jc = new C0289jc(-3);
                }
                ((C0096d2) this.b).R(c0289jc);
                return;
            default:
                C0289jc c0289jc2 = (C0289jc) obj;
                synchronized (AbstractC0320kc.c) {
                    try {
                        Fo fo = AbstractC0320kc.d;
                        ArrayList arrayList = (ArrayList) fo.getOrDefault((String) this.b, null);
                        if (arrayList == null) {
                            return;
                        }
                        fo.remove((String) this.b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((InterfaceC0748y7) arrayList.get(i)).accept(c0289jc2);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
