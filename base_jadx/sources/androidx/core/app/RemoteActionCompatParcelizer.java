package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.AbstractC0245hs;
import defpackage.C0275is;
import defpackage.InterfaceC0305js;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0245hs abstractC0245hs) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC0305js interfaceC0305jsG = remoteActionCompat.a;
        if (abstractC0245hs.e(1)) {
            interfaceC0305jsG = abstractC0245hs.g();
        }
        remoteActionCompat.a = (IconCompat) interfaceC0305jsG;
        CharSequence charSequence = remoteActionCompat.b;
        if (abstractC0245hs.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0275is) abstractC0245hs).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (abstractC0245hs.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0275is) abstractC0245hs).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) abstractC0245hs.f(remoteActionCompat.d, 4);
        boolean z = remoteActionCompat.e;
        if (abstractC0245hs.e(5)) {
            z = ((C0275is) abstractC0245hs).e.readInt() != 0;
        }
        remoteActionCompat.e = z;
        boolean z2 = remoteActionCompat.f;
        if (abstractC0245hs.e(6)) {
            z2 = ((C0275is) abstractC0245hs).e.readInt() != 0;
        }
        remoteActionCompat.f = z2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0245hs abstractC0245hs) {
        abstractC0245hs.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        abstractC0245hs.h(1);
        abstractC0245hs.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        abstractC0245hs.h(2);
        Parcel parcel = ((C0275is) abstractC0245hs).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        abstractC0245hs.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        abstractC0245hs.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.e;
        abstractC0245hs.h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        abstractC0245hs.h(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
