package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class Gs {
    public static WeakHashMap a = null;
    public static Field b = null;
    public static boolean c = false;
    public static final int[] d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final C0522qs e = new C0522qs();
    public static final ViewTreeObserverOnGlobalLayoutListenerC0583ss f = new ViewTreeObserverOnGlobalLayoutListenerC0583ss();

    public static Ws a(View view) {
        if (a == null) {
            a = new WeakHashMap();
        }
        Ws ws = (Ws) a.get(view);
        if (ws != null) {
            return ws;
        }
        Ws ws2 = new Ws(view);
        a.put(view, ws2);
        return ws2;
    }

    public static View.AccessibilityDelegate b(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return Bs.a(view);
        }
        if (c) {
            return null;
        }
        if (b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            c = true;
            return null;
        }
    }

    public static ArrayList c(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] d(View view) {
        return Build.VERSION.SDK_INT >= 31 ? Ds.a(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void e(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = As.b(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(As.b(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(As.b(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static E7 f(View view, E7 e7) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + e7 + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return Ds.b(view, e7);
        }
        InterfaceC0237hk interfaceC0237hk = (InterfaceC0237hk) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC0267ik interfaceC0267ik = e;
        if (interfaceC0237hk == null) {
            if (view instanceof InterfaceC0267ik) {
                interfaceC0267ik = (InterfaceC0267ik) view;
            }
            return interfaceC0267ik.a(e7);
        }
        E7 e7A = ((C0798zq) interfaceC0237hk).a(view, e7);
        if (e7A == null) {
            return null;
        }
        if (view instanceof InterfaceC0267ik) {
            interfaceC0267ik = (InterfaceC0267ik) view;
        }
        return interfaceC0267ik.a(e7A);
    }

    public static void g(View view, int i) {
        ArrayList arrayListC = c(view);
        for (int i2 = 0; i2 < arrayListC.size(); i2++) {
            if (((E) arrayListC.get(i2)).a() == i) {
                arrayListC.remove(i2);
                return;
            }
        }
    }

    public static void h(View view, E e2, U u) {
        C0740y c0740y;
        E e3 = new E(null, e2.b, null, u, e2.c);
        View.AccessibilityDelegate accessibilityDelegateB = b(view);
        if (accessibilityDelegateB == null) {
            c0740y = null;
        } else {
            c0740y = accessibilityDelegateB instanceof C0709x ? ((C0709x) accessibilityDelegateB).a : new C0740y(accessibilityDelegateB);
        }
        if (c0740y == null) {
            c0740y = new C0740y();
        }
        j(view, c0740y);
        g(view, e3.a());
        c(view).add(e3);
        e(view, 0);
    }

    public static void i(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            Bs.d(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void j(View view, C0740y c0740y) {
        if (c0740y == null && (b(view) instanceof C0709x)) {
            c0740y = new C0740y();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0740y == null ? null : c0740y.b);
    }

    public static void k(View view, CharSequence charSequence) {
        new C0552rs(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).e(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC0583ss viewTreeObserverOnGlobalLayoutListenerC0583ss = f;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC0583ss.a.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC0583ss);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0583ss);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC0583ss.a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC0583ss);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0583ss);
            }
        }
    }
}
