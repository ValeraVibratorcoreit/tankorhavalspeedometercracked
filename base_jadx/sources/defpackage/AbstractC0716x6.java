package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;
import ru.zinovin.tankspeedometer.R;

/* JADX INFO: renamed from: x6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0716x6 {
    public static final ThreadLocal a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r33v0, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    public static ColorStateList b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        int[] iArr;
        boolean z;
        int iR;
        float f;
        float f2;
        TypedValue typedValue;
        resources = resources;
        attributeSet = attributeSet;
        theme = theme;
        String name = xmlResourceParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r4 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr2 = new int[20];
        int i = 0;
        int i2 = 0;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == r4 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr3 = AbstractC0484pl.a;
                ?? ObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr3) : theme.obtainStyledAttributes(attributeSet, iArr3, i, i);
                int resourceId = ObtainAttributes.getResourceId(i, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    resources.getValue(resourceId, typedValue, r4);
                    int i3 = typedValue.type;
                    if (i3 < 28 || i3 > 31) {
                        try {
                            color = a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = ObtainAttributes.getColor(i, -65281);
                        }
                    } else {
                        color = ObtainAttributes.getColor(i, -65281);
                    }
                } else {
                    color = ObtainAttributes.getColor(i, -65281);
                }
                float f3 = ObtainAttributes.hasValue(r4) ? ObtainAttributes.getFloat(r4, 1.0f) : ObtainAttributes.hasValue(3) ? ObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                float f4 = (Build.VERSION.SDK_INT < 31 || !ObtainAttributes.hasValue(2)) ? ObtainAttributes.getFloat(4, -1.0f) : ObtainAttributes.getFloat(2, -1.0f);
                ObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr4 = new int[attributeCount];
                int i4 = i;
                for (int i5 = i4; i5 < attributeCount; i5++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i5);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                        int i6 = i4 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i5, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr4[i4] = attributeNameResource;
                        i4 = i6;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr4, i4);
                float f5 = 0.0f;
                float f6 = 100.0f;
                boolean z2 = f4 >= 0.0f && f4 <= 100.0f;
                if (f3 != 1.0f || z2) {
                    int iF = Td.f((int) ((Color.alpha(color) * f3) + 0.5f), 0, 255);
                    if (z2) {
                        C0406n5 c0406n5A = C0406n5.a(color);
                        C0430nt c0430nt = C0430nt.k;
                        float f7 = c0406n5A.b;
                        if (f7 >= 1.0d && Math.round(f4) > 0.0d && Math.round(f4) < 100.0d) {
                            float f8 = c0406n5A.a;
                            float fMin = f8 < 0.0f ? 0.0f : Math.min(360.0f, f8);
                            float f9 = 0.0f;
                            float f10 = f7;
                            C0406n5 c0406n5 = null;
                            boolean z3 = true;
                            while (true) {
                                if (Math.abs(f9 - f7) < 0.4f) {
                                    iArr = iArrTrimStateSet;
                                    depth2 = depth2;
                                    z = true;
                                    if (c0406n5 != null) {
                                        iR = c0406n5.c(c0430nt);
                                        break;
                                    }
                                    iR = AbstractC0390mk.r(f4);
                                    break;
                                }
                                float f11 = 1000.0f;
                                float f12 = f5;
                                float f13 = f6;
                                float f14 = 1000.0f;
                                C0406n5 c0406n6 = null;
                                while (true) {
                                    if (Math.abs(f12 - f13) <= 0.01f) {
                                        depth2 = depth2;
                                        fMin = fMin;
                                        f6 = f6;
                                        z = true;
                                        float f15 = f5;
                                        iArr = iArrTrimStateSet;
                                        f = f15;
                                        break;
                                    }
                                    float f16 = ((f13 - f12) / 2.0f) + f12;
                                    int iC = C0406n5.b(f16, f10, fMin).c(C0430nt.k);
                                    float fX = AbstractC0390mk.x(Color.red(iC));
                                    float fX2 = AbstractC0390mk.x(Color.green(iC));
                                    float fX3 = AbstractC0390mk.x(Color.blue(iC));
                                    z = true;
                                    float[] fArr = AbstractC0390mk.d[1];
                                    f6 = 100.0f;
                                    float f17 = ((fX3 * fArr[2]) + ((fX2 * fArr[1]) + (fX * fArr[0]))) / 100.0f;
                                    float fCbrt = f17 <= 0.008856452f ? f17 * 903.2963f : (((float) Math.cbrt(f17)) * 116.0f) - 16.0f;
                                    float fAbs = Math.abs(f4 - fCbrt);
                                    if (fAbs < 0.2f) {
                                        C0406n5 c0406n5A2 = C0406n5.a(iC);
                                        C0406n5 c0406n5B = C0406n5.b(c0406n5A2.c, c0406n5A2.b, fMin);
                                        f2 = f16;
                                        float f18 = c0406n5A2.d - c0406n5B.d;
                                        fMin = fMin;
                                        float f19 = c0406n5A2.e - c0406n5B.e;
                                        float f20 = c0406n5A2.f - c0406n5B.f;
                                        double dSqrt = Math.sqrt((f20 * f20) + (f19 * f19) + (f18 * f18));
                                        iArr = iArrTrimStateSet;
                                        float fPow = (float) (Math.pow(dSqrt, 0.63d) * 1.41d);
                                        if (fPow <= 1.0f) {
                                            f14 = fPow;
                                            c0406n6 = c0406n5A2;
                                            f11 = fAbs;
                                        }
                                    } else {
                                        f2 = f16;
                                        fMin = fMin;
                                        iArr = iArrTrimStateSet;
                                    }
                                    f = 0.0f;
                                    if (f11 == 0.0f && f14 == 0.0f) {
                                        break;
                                    }
                                    if (fCbrt < f4) {
                                        f12 = f2;
                                    } else {
                                        f13 = f2;
                                    }
                                    f6 = 100.0f;
                                    depth2 = depth2;
                                    fMin = fMin;
                                    int[] iArr5 = iArr;
                                    f5 = 0.0f;
                                    iArrTrimStateSet = iArr5;
                                }
                                C0406n5 c0406n7 = c0406n6;
                                if (!z3) {
                                    if (c0406n7 == null) {
                                        f7 = f10;
                                    } else {
                                        c0406n5 = c0406n7;
                                        f9 = f10;
                                    }
                                    f10 = ((f7 - f9) / 2.0f) + f9;
                                } else {
                                    if (c0406n7 != null) {
                                        iR = c0406n7.c(c0430nt);
                                        break;
                                    }
                                    f10 = ((f7 - f9) / 2.0f) + f9;
                                    z3 = false;
                                }
                                int[] iArr6 = iArr;
                                f5 = f;
                                iArrTrimStateSet = iArr6;
                            }
                        } else {
                            iArr = iArrTrimStateSet;
                            depth2 = depth2;
                            z = true;
                            iR = AbstractC0390mk.r(f4);
                        }
                        color = iR;
                    } else {
                        iArr = iArrTrimStateSet;
                        depth2 = depth2;
                        z = true;
                    }
                    color = (16777215 & color) | (iF << 24);
                } else {
                    iArr = iArrTrimStateSet;
                    depth2 = depth2;
                    z = true;
                }
                int i7 = i2 + 1;
                if (i7 > iArr2.length) {
                    int[] iArr7 = new int[i2 <= 4 ? 8 : i2 * 2];
                    System.arraycopy(iArr2, 0, iArr7, 0, i2);
                    iArr2 = iArr7;
                }
                iArr2[i2] = color;
                if (i7 > objArr.length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2 > 4 ? i2 * 2 : 8);
                    System.arraycopy(objArr, 0, objArr2, 0, i2);
                    objArr = objArr2;
                }
                objArr[i2] = iArr;
                objArr = (int[][]) objArr;
                i2 = i7;
                r4 = z;
                depth2 = depth2;
                i = 0;
            } else {
                int i8 = depth2;
                r4 = r4 == true ? 1 : 0;
                depth2 = i8;
                i = 0;
            }
        }
        int[] iArr8 = new int[i2];
        int[][] iArr9 = new int[i2][];
        System.arraycopy(iArr2, 0, iArr8, 0, i2);
        System.arraycopy(objArr, 0, iArr9, 0, i2);
        return new ColorStateList(iArr9, iArr8);
    }
}
