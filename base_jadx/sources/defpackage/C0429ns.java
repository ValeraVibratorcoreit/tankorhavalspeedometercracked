package defpackage;

import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* JADX INFO: renamed from: ns, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0429ns implements InterfaceC0398ms {
    @Override // defpackage.InterfaceC0398ms
    public void a(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }

    @Override // defpackage.InterfaceC0398ms
    public void d(MediaExtractor mediaExtractor, Object obj) throws IOException {
        mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
    }
}
