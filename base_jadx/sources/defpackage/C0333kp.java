package defpackage;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.jcraft.jsch.SftpATTRS;
import java.util.Arrays;

/* JADX INFO: renamed from: kp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0333kp {
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int[] f;
    public final /* synthetic */ StaggeredGridLayoutManager g;

    public C0333kp(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.a = -1;
        this.b = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        this.c = false;
        this.d = false;
        this.e = false;
        int[] iArr = this.f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
