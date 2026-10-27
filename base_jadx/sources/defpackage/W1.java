package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public class W1 extends EditText implements InterfaceC0267ik {
    public final C0556s1 a;
    public final C0774z2 b;
    public final C0798zq c;
    public final C0096d2 d;
    public V1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        Kq.a(context);
        Cq.a(this, getContext());
        C0556s1 c0556s1 = new C0556s1(this);
        this.a = c0556s1;
        c0556s1.d(attributeSet, R.attr.editTextStyle);
        C0774z2 c0774z2 = new C0774z2(this);
        this.b = c0774z2;
        c0774z2.f(attributeSet, R.attr.editTextStyle);
        c0774z2.b();
        this.c = new C0798zq();
        C0096d2 c0096d2 = new C0096d2(this, 3);
        this.d = c0096d2;
        c0096d2.O(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerI = c0096d2.I(keyListener);
            if (keyListenerI == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerI);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    private V1 getSuperCaller() {
        if (this.e == null) {
            this.e = new V1(this);
        }
        return this.e;
    }

    @Override // defpackage.InterfaceC0267ik
    public final E7 a(E7 e7) {
        return this.c.a(this, e7);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0556s1 c0556s1 = this.a;
        if (c0556s1 != null) {
            c0556s1.a();
        }
        C0774z2 c0774z2 = this.b;
        if (c0774z2 != null) {
            c0774z2.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0556s1 c0556s1 = this.a;
        if (c0556s1 != null) {
            return c0556s1.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0556s1 c0556s1 = this.a;
        if (c0556s1 != null) {
            return c0556s1.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrD;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        C0774z2.h(this, inputConnectionOnCreateInputConnection, editorInfo);
        Br.L(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionOnCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (strArrD = Gs.d(this)) != null) {
            editorInfo.contentMimeTypes = strArrD;
            inputConnectionOnCreateInputConnection = new Df(inputConnectionOnCreateInputConnection, new C0098d4(this, 3));
        }
        return this.d.Q(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zA = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && Gs.d(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zA = AbstractC0188g2.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        C7 c7;
        B7 b7;
        int i2;
        C0308k0 c0308k0;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31 || Gs.d(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i3 >= 31) {
                c0308k0 = new C0308k0(primaryClip, 1);
            } else {
                c7 = new C7();
                c7.b = primaryClip;
                c7.c = 1;
            }
            if (i == 16908322) {
                b7 = c7;
                b7 = c0308k0;
                i2 = 0;
            } else {
                b7 = c7;
                b7 = c0308k0;
                i2 = 1;
            }
            b7.x(i2);
            Gs.f(this, b7.g());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0556s1 c0556s1 = this.a;
        if (c0556s1 != null) {
            c0556s1.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0556s1 c0556s1 = this.a;
        if (c0556s1 != null) {
            c0556s1.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0774z2 c0774z2 = this.b;
        if (c0774z2 != null) {
            c0774z2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0774z2 c0774z2 = this.b;
        if (c0774z2 != null) {
            c0774z2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.d.W(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.d.I(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0556s1 c0556s1 = this.a;
        if (c0556s1 != null) {
            c0556s1.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0556s1 c0556s1 = this.a;
        if (c0556s1 != null) {
            c0556s1.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0774z2 c0774z2 = this.b;
        c0774z2.i(colorStateList);
        c0774z2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0774z2 c0774z2 = this.b;
        c0774z2.j(mode);
        c0774z2.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0774z2 c0774z2 = this.b;
        if (c0774z2 != null) {
            c0774z2.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return super.getText();
    }
}
