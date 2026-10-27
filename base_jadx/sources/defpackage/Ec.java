package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class Ec implements LayoutInflater.Factory2 {
    public final Oc a;

    public Ec(Oc oc) {
        this.a = oc;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        Vc vcF;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        Oc oc = this.a;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, oc);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0515ql.a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                zIsAssignableFrom = AbstractComponentCallbacksC0784zc.class.isAssignableFrom(Jc.b(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                zIsAssignableFrom = false;
            }
            if (zIsAssignableFrom) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zcB = resourceId != -1 ? oc.B(resourceId) : null;
                if (abstractComponentCallbacksC0784zcB == null && string != null) {
                    C0296jj c0296jj = oc.c;
                    ArrayList arrayList = (ArrayList) c0296jj.a;
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size >= 0) {
                            AbstractComponentCallbacksC0784zc abstractComponentCallbacksC0784zc = (AbstractComponentCallbacksC0784zc) arrayList.get(size);
                            if (abstractComponentCallbacksC0784zc != null && string.equals(abstractComponentCallbacksC0784zc.x)) {
                                abstractComponentCallbacksC0784zcB = abstractComponentCallbacksC0784zc;
                                break;
                            }
                            size--;
                        } else {
                            Iterator it = ((HashMap) c0296jj.b).values().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    abstractComponentCallbacksC0784zcB = null;
                                    break;
                                }
                                Vc vc = (Vc) it.next();
                                if (vc != null) {
                                    abstractComponentCallbacksC0784zcB = vc.c;
                                    if (string.equals(abstractComponentCallbacksC0784zcB.x)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                if (abstractComponentCallbacksC0784zcB == null && id != -1) {
                    abstractComponentCallbacksC0784zcB = oc.B(id);
                }
                if (abstractComponentCallbacksC0784zcB == null) {
                    Jc jcD = oc.D();
                    context.getClassLoader();
                    abstractComponentCallbacksC0784zcB = jcD.a(attributeValue);
                    abstractComponentCallbacksC0784zcB.m = true;
                    abstractComponentCallbacksC0784zcB.v = resourceId != 0 ? resourceId : id;
                    abstractComponentCallbacksC0784zcB.w = id;
                    abstractComponentCallbacksC0784zcB.x = string;
                    abstractComponentCallbacksC0784zcB.n = true;
                    abstractComponentCallbacksC0784zcB.r = oc;
                    Bc bc = oc.t;
                    abstractComponentCallbacksC0784zcB.s = bc;
                    Context context2 = bc.k;
                    abstractComponentCallbacksC0784zcB.C = true;
                    if ((bc == null ? null : bc.j) != null) {
                        abstractComponentCallbacksC0784zcB.C = true;
                    }
                    vcF = oc.a(abstractComponentCallbacksC0784zcB);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC0784zcB + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                } else {
                    if (abstractComponentCallbacksC0784zcB.n) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    abstractComponentCallbacksC0784zcB.n = true;
                    abstractComponentCallbacksC0784zcB.r = oc;
                    Bc bc2 = oc.t;
                    abstractComponentCallbacksC0784zcB.s = bc2;
                    Context context3 = bc2.k;
                    abstractComponentCallbacksC0784zcB.C = true;
                    if ((bc2 == null ? null : bc2.j) != null) {
                        abstractComponentCallbacksC0784zcB.C = true;
                    }
                    vcF = oc.f(abstractComponentCallbacksC0784zcB);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Retained Fragment " + abstractComponentCallbacksC0784zcB + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                Xc xc = Yc.a;
                Yc.b(new Tc(abstractComponentCallbacksC0784zcB, "Attempting to use <fragment> tag to add fragment " + abstractComponentCallbacksC0784zcB + " to container " + viewGroup));
                Yc.a(abstractComponentCallbacksC0784zcB).getClass();
                abstractComponentCallbacksC0784zcB.D = viewGroup;
                vcF.k();
                vcF.j();
                View view2 = abstractComponentCallbacksC0784zcB.E;
                if (view2 == null) {
                    throw new IllegalStateException(Vo.g("Fragment ", attributeValue, " did not create a view."));
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (abstractComponentCallbacksC0784zcB.E.getTag() == null) {
                    abstractComponentCallbacksC0784zcB.E.setTag(string);
                }
                abstractComponentCallbacksC0784zcB.E.addOnAttachStateChangeListener(new Dc(this, vcF));
                return abstractComponentCallbacksC0784zcB.E;
            }
        }
        return null;
    }
}
