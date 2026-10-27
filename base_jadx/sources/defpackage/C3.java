package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import ru.zinovin.tankspeedometer.MainActivity;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C3(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String name;
        int i = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                E3 e3 = (E3) obj2;
                e3.getClass();
                Button button = (Button) obj;
                button.setEnabled(false);
                button.setText(R.string.bg_sun_refreshing);
                new Thread(new B1(e3, i, button)).start();
                break;
            case 1:
                H3 h3 = (H3) obj2;
                h3.getClass();
                F3 f3 = (F3) obj;
                if (f3.a == null) {
                    switch (f3.d) {
                        case R.drawable.brabus_background /* 2131230855 */:
                            name = "BUILD_IN_BRABUS";
                            break;
                        case R.drawable.kia_background /* 2131230948 */:
                            name = "BUILD_IN_KIA";
                            break;
                        case R.drawable.night_background /* 2131231020 */:
                            name = "BUILD_IN_NIGHT";
                            break;
                        case R.drawable.transparent_ip_background /* 2131231059 */:
                            name = "BUILD_IN_TRANSPARENT";
                            break;
                        case R.drawable.trx_background_03 /* 2131231062 */:
                            name = "BUILD_IN_TRX";
                            break;
                        default:
                            name = "BUILD_IN_NONE";
                            break;
                    }
                } else {
                    name = new File(f3.a.getPath()).getName();
                }
                E3 e4 = h3.b;
                SharedPreferences.Editor editorEdit = e4.T().edit();
                editorEdit.putString("selectedBackground", name);
                editorEdit.commit();
                e4.c0();
                Object[] objArr = {f3.b};
                Context context = h3.a;
                Toast.makeText(context, context.getString(R.string.text_background_selected_msg, objArr), 1).show();
                h3.notifyDataSetChanged();
                break;
            case 2:
                Ak ak = (Ak) obj2;
                ak.Y = !ak.Y;
                ((SharedPreferences) obj).edit().putBoolean("favoriteFilterEnabled", ak.Y).apply();
                ak.d0();
                ak.U.setFavoriteFilterEnabled(ak.Y);
                ak.U.setFavorites(ak.X);
                ak.U.setItems(Br.h(ak.I()));
                ak.c0();
                break;
            case 3:
                Un un = (Un) obj2;
                String str = (String) obj;
                un.f = str;
                un.a();
                Tn tn = un.g;
                if (tn != null) {
                    tn.a(str);
                }
                break;
            case 4:
                C0056bo c0056bo = (C0056bo) obj2;
                c0056bo.getClass();
                Yn yn = (Yn) obj;
                c0056bo.f = yn.a;
                c0056bo.a();
                InterfaceC0025ao interfaceC0025ao = c0056bo.g;
                if (interfaceC0025ao != null) {
                    C0792zk c0792zk = (C0792zk) interfaceC0025ao;
                    Ak ak2 = c0792zk.a;
                    ak2.getClass();
                    SharedPreferences.Editor editorEdit2 = c0792zk.b.edit();
                    String str2 = yn.a;
                    editorEdit2.putString("selectedTheme", str2).apply();
                    ak2.T.z = str2;
                }
                break;
            default:
                C0098d4 c0098d4 = ((C0210go) obj2).d;
                if (c0098d4 != null) {
                    C0179fo c0179fo = (C0179fo) obj;
                    RecyclerView recyclerView = c0179fo.r;
                    int iF = recyclerView == null ? -1 : recyclerView.F(c0179fo);
                    int i2 = MainActivity.M;
                    ((MainActivity) c0098d4.b).L(iF, 0);
                }
                break;
        }
    }
}
