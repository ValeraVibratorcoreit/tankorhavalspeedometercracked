package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: renamed from: wm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class FragmentC0701wm extends Fragment {
    public static final /* synthetic */ int b = 0;
    public Vi a;

    public final void a(EnumC0602tg enumC0602tg) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            Tf.i("activity", activity);
            AbstractC0390mk.h(activity, enumC0602tg);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC0602tg.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC0602tg.ON_DESTROY);
        this.a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC0602tg.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        Vi vi = this.a;
        if (vi != null) {
            ((Zk) vi.a).a();
        }
        a(EnumC0602tg.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        Vi vi = this.a;
        if (vi != null) {
            Zk zk = (Zk) vi.a;
            int i = zk.a + 1;
            zk.a = i;
            if (i == 1 && zk.d) {
                zk.f.e(EnumC0602tg.ON_START);
                zk.d = false;
            }
        }
        a(EnumC0602tg.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC0602tg.ON_STOP);
    }
}
