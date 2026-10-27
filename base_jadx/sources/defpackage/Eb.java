package defpackage;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;

/* JADX INFO: loaded from: classes.dex */
public abstract class Eb {
    public static void a(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) {
        mediaMetadataRetriever.setDataSource(mediaDataSource);
    }
}
