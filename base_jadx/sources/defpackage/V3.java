package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: loaded from: classes.dex */
public final class V3 {
    public final U3 a;
    public final U3 b = new U3();
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final int k;

    public V3(Context context) {
        AttributeSet attributeSet;
        int styleAttribute;
        int next;
        U3 u3 = new U3();
        int i = u3.a;
        if (i != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                styleAttribute = attributeSetAsAttributeSet.getStyleAttribute();
                attributeSet = attributeSetAsAttributeSet;
            } catch (IOException | XmlPullParserException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i));
                notFoundException.initCause(e);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            styleAttribute = 0;
        }
        TypedArray typedArrayZ = AbstractC0390mk.z(context, attributeSet, AbstractC0638ul.a, R.attr.badgeStyle, styleAttribute == 0 ? 2132018236 : styleAttribute, new int[0]);
        Resources resources = context.getResources();
        this.c = typedArrayZ.getDimensionPixelSize(4, -1);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.d = typedArrayZ.getDimensionPixelSize(14, -1);
        this.e = typedArrayZ.getDimension(12, resources.getDimension(R.dimen.m3_badge_size));
        this.g = typedArrayZ.getDimension(17, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.f = typedArrayZ.getDimension(3, resources.getDimension(R.dimen.m3_badge_size));
        this.h = typedArrayZ.getDimension(13, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.k = typedArrayZ.getInt(24, 1);
        U3 u4 = this.b;
        int i2 = u3.i;
        u4.i = i2 == -2 ? 255 : i2;
        int i3 = u3.k;
        if (i3 != -2) {
            u4.k = i3;
        } else if (typedArrayZ.hasValue(23)) {
            this.b.k = typedArrayZ.getInt(23, 0);
        } else {
            this.b.k = -1;
        }
        String str = u3.j;
        if (str != null) {
            this.b.j = str;
        } else if (typedArrayZ.hasValue(7)) {
            this.b.j = typedArrayZ.getString(7);
        }
        U3 u5 = this.b;
        u5.o = u3.o;
        CharSequence charSequence = u3.p;
        u5.p = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        U3 u6 = this.b;
        int i4 = u3.q;
        u6.q = i4 == 0 ? R.plurals.mtrl_badge_content_description : i4;
        int i5 = u3.r;
        u6.r = i5 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i5;
        Boolean bool = u3.t;
        u6.t = Boolean.valueOf(bool == null || bool.booleanValue());
        U3 u7 = this.b;
        int i6 = u3.l;
        u7.l = i6 == -2 ? typedArrayZ.getInt(21, -2) : i6;
        U3 u8 = this.b;
        int i7 = u3.m;
        u8.m = i7 == -2 ? typedArrayZ.getInt(22, -2) : i7;
        U3 u9 = this.b;
        Integer num = u3.e;
        u9.e = Integer.valueOf(num == null ? typedArrayZ.getResourceId(5, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num.intValue());
        U3 u10 = this.b;
        Integer num2 = u3.f;
        u10.f = Integer.valueOf(num2 == null ? typedArrayZ.getResourceId(6, 0) : num2.intValue());
        U3 u11 = this.b;
        Integer num3 = u3.g;
        u11.g = Integer.valueOf(num3 == null ? typedArrayZ.getResourceId(15, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : num3.intValue());
        U3 u12 = this.b;
        Integer num4 = u3.h;
        u12.h = Integer.valueOf(num4 == null ? typedArrayZ.getResourceId(16, 0) : num4.intValue());
        U3 u13 = this.b;
        Integer num5 = u3.b;
        u13.b = Integer.valueOf(num5 == null ? Br.u(context, typedArrayZ, 1).getDefaultColor() : num5.intValue());
        U3 u14 = this.b;
        Integer num6 = u3.d;
        u14.d = Integer.valueOf(num6 == null ? typedArrayZ.getResourceId(8, R.style.TextAppearance_MaterialComponents_Badge) : num6.intValue());
        Integer num7 = u3.c;
        if (num7 != null) {
            this.b.c = num7;
        } else if (typedArrayZ.hasValue(9)) {
            this.b.c = Integer.valueOf(Br.u(context, typedArrayZ, 9).getDefaultColor());
        } else {
            int iIntValue = this.b.d.intValue();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iIntValue, AbstractC0638ul.B);
            typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
            ColorStateList colorStateListU = Br.u(context, typedArrayObtainStyledAttributes, 3);
            Br.u(context, typedArrayObtainStyledAttributes, 4);
            Br.u(context, typedArrayObtainStyledAttributes, 5);
            typedArrayObtainStyledAttributes.getInt(2, 0);
            typedArrayObtainStyledAttributes.getInt(1, 1);
            int i8 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
            typedArrayObtainStyledAttributes.getResourceId(i8, 0);
            typedArrayObtainStyledAttributes.getString(i8);
            typedArrayObtainStyledAttributes.getBoolean(14, false);
            Br.u(context, typedArrayObtainStyledAttributes, 6);
            typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
            typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iIntValue, AbstractC0638ul.s);
            typedArrayObtainStyledAttributes2.hasValue(0);
            typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes2.recycle();
            this.b.c = Integer.valueOf(colorStateListU.getDefaultColor());
        }
        U3 u15 = this.b;
        Integer num8 = u3.s;
        u15.s = Integer.valueOf(num8 == null ? typedArrayZ.getInt(2, 8388661) : num8.intValue());
        U3 u16 = this.b;
        Integer num9 = u3.u;
        u16.u = Integer.valueOf(num9 == null ? typedArrayZ.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding)) : num9.intValue());
        U3 u17 = this.b;
        Integer num10 = u3.v;
        u17.v = Integer.valueOf(num10 == null ? typedArrayZ.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding)) : num10.intValue());
        U3 u18 = this.b;
        Integer num11 = u3.w;
        u18.w = Integer.valueOf(num11 == null ? typedArrayZ.getDimensionPixelOffset(18, 0) : num11.intValue());
        U3 u19 = this.b;
        Integer num12 = u3.x;
        u19.x = Integer.valueOf(num12 == null ? typedArrayZ.getDimensionPixelOffset(25, 0) : num12.intValue());
        U3 u20 = this.b;
        Integer num13 = u3.y;
        u20.y = Integer.valueOf(num13 == null ? typedArrayZ.getDimensionPixelOffset(19, u20.w.intValue()) : num13.intValue());
        U3 u21 = this.b;
        Integer num14 = u3.z;
        u21.z = Integer.valueOf(num14 == null ? typedArrayZ.getDimensionPixelOffset(26, u21.x.intValue()) : num14.intValue());
        U3 u22 = this.b;
        Integer num15 = u3.C;
        u22.C = Integer.valueOf(num15 == null ? typedArrayZ.getDimensionPixelOffset(20, 0) : num15.intValue());
        U3 u23 = this.b;
        Integer num16 = u3.A;
        u23.A = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        U3 u24 = this.b;
        Integer num17 = u3.B;
        u24.B = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        U3 u25 = this.b;
        Boolean bool2 = u3.D;
        u25.D = Boolean.valueOf(bool2 == null ? typedArrayZ.getBoolean(0, false) : bool2.booleanValue());
        typedArrayZ.recycle();
        Locale locale = u3.n;
        if (locale == null) {
            this.b.n = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            this.b.n = locale;
        }
        this.a = u3;
    }
}
