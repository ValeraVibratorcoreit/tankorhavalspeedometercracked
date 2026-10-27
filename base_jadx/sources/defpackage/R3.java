package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class R3 implements FilenameFilter {
    public final /* synthetic */ int a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.a) {
            case 0:
                return str.endsWith(".xml") && !str.startsWith(".");
            default:
                return str.startsWith("ts_") && str.endsWith(".log");
        }
    }
}
