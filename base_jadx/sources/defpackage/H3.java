package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.util.List;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final class H3 extends ArrayAdapter {
    public final Context a;
    public final E3 b;
    public final int c;

    public H3(Context context, E3 e3, List list) {
        super(context, 0, list);
        this.a = context;
        this.b = e3;
        this.c = R.layout.item_image;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(final int i, View view, ViewGroup viewGroup) {
        String name;
        F3 f3 = (F3) getItem(i);
        Context context = this.a;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(this.c, viewGroup, false);
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.item_image);
        TextView textView = (TextView) view.findViewById(R.id.item_text);
        TextView textView2 = (TextView) view.findViewById(R.id.item_desc);
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.btn_delete);
        Uri uri = f3.a;
        if (uri == null) {
            int i2 = f3.d;
            imageView.setImageResource(i2);
            switch (i2) {
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
            imageView.setImageURI(uri);
            name = new File(f3.a.getPath()).getName();
        }
        textView.setText(f3.b);
        textView2.setText(f3.c);
        SharedPreferences sharedPreferencesT = this.b.T();
        if (sharedPreferencesT.getBoolean("useDefaultSwitchBack", true)) {
            sharedPreferencesT = context.getSharedPreferences("prefs_Default", 0);
        }
        view.setActivated(sharedPreferencesT.getString("selectedBackground", "BUILD_IN_NONE").equals(name));
        view.setOnClickListener(new C3(this, 1, f3));
        if (name.startsWith("BUILD_IN")) {
            imageButton.setVisibility(4);
        } else {
            imageButton.setVisibility(0);
            imageButton.setOnClickListener(new View.OnClickListener() { // from class: G3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Uri uri2;
                    H3 h3 = this.a;
                    F3 f4 = (F3) h3.getItem(i);
                    if (f4 == null || (uri2 = f4.a) == null) {
                        return;
                    }
                    File file = new File(uri2.getPath());
                    File file2 = new File(file.getParent(), Ud.u(file.getName()));
                    if (f4.e) {
                        String name2 = file.getName();
                        Context context2 = h3.a;
                        File file3 = new File(context2.getFilesDir(), name2);
                        File file4 = new File(context2.getFilesDir(), Ud.u(name2));
                        if (file3.exists()) {
                            file3.delete();
                        }
                        if (file4.exists()) {
                            file4.delete();
                        }
                    }
                    if (file.exists()) {
                        file.delete();
                    }
                    if (file2.exists()) {
                        file2.delete();
                    }
                    h3.remove(f4);
                    h3.notifyDataSetChanged();
                }
            });
        }
        return view;
    }
}
