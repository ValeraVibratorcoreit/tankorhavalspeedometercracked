package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Xml;
import android.widget.ImageView;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class Z1 {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;
    public Object d;

    public Z1(EnumC0268il enumC0268il, int i, String str) {
        this.a = 3;
        this.c = enumC0268il;
        this.b = i;
        this.d = str;
    }

    public static Z1 b(Resources resources, int i, Resources.Theme theme) {
        int next;
        float f;
        float f2;
        float f3;
        int i2;
        Shader radialGradient;
        Shader.TileMode tileMode;
        Shader.TileMode tileMode2;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListB = AbstractC0716x6.b(resources, xml, attributeSetAsAttributeSet, theme);
                return new Z1((Shader) null, colorStateListB, colorStateListB.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayJ = Br.J(resources, theme, attributeSetAsAttributeSet, AbstractC0484pl.d);
        float f4 = !Br.E(xml, "startX") ? 0.0f : typedArrayJ.getFloat(8, 0.0f);
        float f5 = !Br.E(xml, "startY") ? 0.0f : typedArrayJ.getFloat(9, 0.0f);
        float f6 = !Br.E(xml, "endX") ? 0.0f : typedArrayJ.getFloat(10, 0.0f);
        float f7 = !Br.E(xml, "endY") ? 0.0f : typedArrayJ.getFloat(11, 0.0f);
        float f8 = !Br.E(xml, "centerX") ? 0.0f : typedArrayJ.getFloat(3, 0.0f);
        float f9 = !Br.E(xml, "centerY") ? 0.0f : typedArrayJ.getFloat(4, 0.0f);
        int i3 = !Br.E(xml, "type") ? 0 : typedArrayJ.getInt(2, 0);
        int color = !Br.E(xml, "startColor") ? 0 : typedArrayJ.getColor(0, 0);
        boolean zE = Br.E(xml, "centerColor");
        int color2 = !Br.E(xml, "centerColor") ? 0 : typedArrayJ.getColor(7, 0);
        int color3 = !Br.E(xml, "endColor") ? 0 : typedArrayJ.getColor(1, 0);
        int i4 = !Br.E(xml, "tileMode") ? 0 : typedArrayJ.getInt(6, 0);
        float f10 = !Br.E(xml, "gradientRadius") ? 0.0f : typedArrayJ.getFloat(5, 0.0f);
        typedArrayJ.recycle();
        int depth = xml.getDepth() + 1;
        float f11 = f10;
        ArrayList arrayList = new ArrayList(20);
        float f12 = f7;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f = f6;
            if (next2 == 1) {
                f2 = f5;
                break;
            }
            int depth2 = xml.getDepth();
            f2 = f5;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayJ2 = Br.J(resources, theme, attributeSetAsAttributeSet, AbstractC0484pl.e);
                boolean zHasValue = typedArrayJ2.hasValue(0);
                boolean zHasValue2 = typedArrayJ2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayJ2.getColor(0, 0);
                float f13 = typedArrayJ2.getFloat(1, 0.0f);
                typedArrayJ2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f13));
            }
            f6 = f;
            f5 = f2;
        }
        C0096d2 c0096d2 = arrayList2.size() > 0 ? new C0096d2(arrayList2, arrayList) : null;
        if (c0096d2 == null) {
            c0096d2 = zE ? new C0096d2(color, color2, color3) : new C0096d2(color, color3);
        }
        if (i3 == 1) {
            float f14 = f8;
            i2 = 0;
            if (f11 <= 0.0f) {
                f3 = f9;
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            if (i4 == 1) {
                f3 = f9;
                tileMode = Shader.TileMode.REPEAT;
            } else if (i4 != 2) {
                f3 = f9;
                tileMode = Shader.TileMode.CLAMP;
            } else {
                f3 = f9;
                tileMode = Shader.TileMode.MIRROR;
            }
            radialGradient = new RadialGradient(f14, f3, f11, (int[]) c0096d2.b, (float[]) c0096d2.c, tileMode);
        } else if (i3 != 2) {
            if (i4 != 1) {
                tileMode2 = i4 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode2 = Shader.TileMode.REPEAT;
            }
            Shader.TileMode tileMode3 = tileMode2;
            i2 = 0;
            radialGradient = new LinearGradient(f4, f2, f, f12, (int[]) c0096d2.b, (float[]) c0096d2.c, tileMode3);
        } else {
            i2 = 0;
            radialGradient = new SweepGradient(f8, f9, (int[]) c0096d2.b, (float[]) c0096d2.c);
        }
        return new Z1(radialGradient, (ColorStateList) null, i2);
    }

    public void a() {
        W6 w6;
        ImageView imageView = (ImageView) this.c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            W9.a(drawable);
        }
        if (drawable == null || (w6 = (W6) this.d) == null) {
            return;
        }
        U1.d(drawable, w6, imageView.getDrawableState());
    }

    public boolean c() {
        ColorStateList colorStateList;
        return ((Shader) this.c) == null && (colorStateList = (ColorStateList) this.d) != null && colorStateList.isStateful();
    }

    public void d(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.c;
        Context context = imageView.getContext();
        int[] iArr = AbstractC0700wl.f;
        K2 k2G = K2.G(context, attributeSet, iArr, i, 0);
        Gs.i(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) k2G.b, i);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) k2G.b;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = F4.F(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                W9.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                AbstractC0447of.c(imageView, k2G.p(2));
            }
            if (typedArray.hasValue(3)) {
                AbstractC0447of.d(imageView, W9.c(typedArray.getInt(3, -1), null));
            }
        } finally {
            k2G.J();
        }
    }

    public String toString() {
        switch (this.a) {
            case 3:
                StringBuilder sb = new StringBuilder();
                if (((EnumC0268il) this.c) == EnumC0268il.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.b);
                sb.append(' ');
                sb.append((String) this.d);
                String string = sb.toString();
                Tf.i("StringBuilder().apply(builderAction).toString()", string);
                return string;
            default:
                return super.toString();
        }
    }

    public Z1(ImageView imageView) {
        this.a = 0;
        this.b = 0;
        this.c = imageView;
    }

    public Z1(Shader shader, ColorStateList colorStateList, int i) {
        this.a = 1;
        this.c = shader;
        this.d = colorStateList;
        this.b = i;
    }

    public Z1(G7 g7) {
        this.a = 2;
        this.d = Br.s0(150, new C0308k0(this, 15));
        this.c = g7;
    }
}
