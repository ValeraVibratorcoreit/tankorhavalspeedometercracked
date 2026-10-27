package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: g2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0188g2 {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        B7 c0308k0;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                c0308k0 = new C0308k0(clipData, 3);
            } else {
                C7 c7 = new C7();
                c7.b = clipData;
                c7.c = 3;
                c0308k0 = c7;
            }
            Gs.f(textView, c0308k0.g());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        B7 c0308k0;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            c0308k0 = new C0308k0(clipData, 3);
        } else {
            C7 c7 = new C7();
            c7.b = clipData;
            c7.c = 3;
            c0308k0 = c7;
        }
        Gs.f(view, c0308k0.g());
        return true;
    }
}
