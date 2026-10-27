package defpackage;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class Ds {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static E7 b(View view, E7 e7) {
        ContentInfo contentInfoJ = e7.a.j();
        Objects.requireNonNull(contentInfoJ);
        ContentInfo contentInfoG = AbstractC0776z4.g(contentInfoJ);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoG);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoG ? e7 : new E7(new C0308k0(contentInfoPerformReceiveContent));
    }

    public static void c(View view, String[] strArr, InterfaceC0237hk interfaceC0237hk) {
        if (interfaceC0237hk == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new Es(interfaceC0237hk));
        }
    }
}
