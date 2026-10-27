package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: u7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0624u7 {
    public static final int[] d = {0, 4, 8};
    public static final SparseIntArray e;
    public static final SparseIntArray f;
    public final HashMap a = new HashMap();
    public final boolean b = true;
    public final HashMap c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int[] e(W3 w3, String str) {
        int iIntValue;
        HashMap map;
        String[] strArrSplit = str.split(",");
        Context context = w3.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = AbstractC0391ml.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && w3.isInEditMode() && (w3.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) w3.getParent();
                constraintLayout.getClass();
                if ((strTrim instanceof String) && (map = constraintLayout.m) != null && map.containsKey(strTrim)) {
                    obj = constraintLayout.m.get(strTrim);
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:125:0x0606. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x008b. Please report as an issue. */
    public static C0470p7 f(Context context, AttributeSet attributeSet, boolean z) {
        String str;
        int i;
        int i2;
        C0470p7 c0470p7 = new C0470p7();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? AbstractC0422nl.c : AbstractC0422nl.a);
        int[] iArr = d;
        SparseIntArray sparseIntArray = e;
        String[] strArr = Tf.b;
        C0562s7 c0562s7 = c0470p7.b;
        C0593t7 c0593t7 = c0470p7.e;
        C0531r7 c0531r7 = c0470p7.c;
        C0501q7 c0501q7 = c0470p7.d;
        String str2 = "Unknown attribute 0x";
        String str3 = "ConstraintSet";
        if (z) {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            C0439o7 c0439o7 = new C0439o7();
            c0439o7.a = new int[10];
            c0439o7.b = new int[10];
            c0439o7.c = 0;
            c0439o7.d = new int[10];
            c0439o7.e = new float[10];
            c0439o7.f = 0;
            c0439o7.g = new int[5];
            c0439o7.h = new String[5];
            c0439o7.i = 0;
            c0439o7.j = new int[4];
            c0439o7.k = new boolean[4];
            c0439o7.l = 0;
            c0531r7.getClass();
            c0501q7.getClass();
            c0562s7.getClass();
            c0593t7.getClass();
            int i3 = 0;
            while (i3 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                int i4 = indexCount;
                switch (f.get(index)) {
                    case 2:
                        c0439o7.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0501q7.I));
                        i2 = 1;
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder(str2);
                        str2 = str2;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        i2 = 1;
                        break;
                    case 5:
                        c0439o7.c(5, typedArrayObtainStyledAttributes.getString(index));
                        i2 = 1;
                        break;
                    case 6:
                        str2 = str2;
                        c0439o7.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0501q7.C));
                        i2 = 1;
                        break;
                    case 7:
                        str2 = str2;
                        c0439o7.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0501q7.D));
                        i2 = 1;
                        break;
                    case 8:
                        str2 = str2;
                        c0439o7.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0501q7.J));
                        i2 = 1;
                        break;
                    case 11:
                        str2 = str2;
                        c0439o7.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0501q7.P));
                        i2 = 1;
                        break;
                    case 12:
                        str2 = str2;
                        c0439o7.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0501q7.Q));
                        i2 = 1;
                        break;
                    case 13:
                        str2 = str2;
                        c0439o7.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0501q7.M));
                        i2 = 1;
                        break;
                    case 14:
                        str2 = str2;
                        c0439o7.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0501q7.O));
                        i2 = 1;
                        break;
                    case 15:
                        str2 = str2;
                        c0439o7.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0501q7.R));
                        i2 = 1;
                        break;
                    case 16:
                        str2 = str2;
                        c0439o7.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0501q7.N));
                        i2 = 1;
                        break;
                    case 17:
                        str2 = str2;
                        c0439o7.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0501q7.d));
                        i2 = 1;
                        break;
                    case 18:
                        str2 = str2;
                        c0439o7.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0501q7.e));
                        i2 = 1;
                        break;
                    case 19:
                        str2 = str2;
                        c0439o7.a(19, typedArrayObtainStyledAttributes.getFloat(index, c0501q7.f));
                        i2 = 1;
                        break;
                    case 20:
                        str2 = str2;
                        c0439o7.a(20, typedArrayObtainStyledAttributes.getFloat(index, c0501q7.w));
                        i2 = 1;
                        break;
                    case 21:
                        str2 = str2;
                        c0439o7.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, c0501q7.c));
                        i2 = 1;
                        break;
                    case 22:
                        str2 = str2;
                        c0439o7.b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, c0562s7.a)]);
                        i2 = 1;
                        break;
                    case 23:
                        str2 = str2;
                        c0439o7.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, c0501q7.b));
                        i2 = 1;
                        break;
                    case 24:
                        str2 = str2;
                        c0439o7.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0501q7.F));
                        i2 = 1;
                        break;
                    case 27:
                        str2 = str2;
                        c0439o7.b(27, typedArrayObtainStyledAttributes.getInt(index, c0501q7.E));
                        i2 = 1;
                        break;
                    case 28:
                        str2 = str2;
                        c0439o7.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0501q7.G));
                        i2 = 1;
                        break;
                    case 31:
                        str2 = str2;
                        c0439o7.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0501q7.K));
                        i2 = 1;
                        break;
                    case 34:
                        str2 = str2;
                        c0439o7.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0501q7.H));
                        i2 = 1;
                        break;
                    case 37:
                        str2 = str2;
                        c0439o7.a(37, typedArrayObtainStyledAttributes.getFloat(index, c0501q7.x));
                        i2 = 1;
                        break;
                    case 38:
                        str2 = str2;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c0470p7.a);
                        c0470p7.a = resourceId;
                        c0439o7.b(38, resourceId);
                        i2 = 1;
                        break;
                    case 39:
                        str2 = str2;
                        c0439o7.a(39, typedArrayObtainStyledAttributes.getFloat(index, c0501q7.U));
                        i2 = 1;
                        break;
                    case 40:
                        str2 = str2;
                        c0439o7.a(40, typedArrayObtainStyledAttributes.getFloat(index, c0501q7.T));
                        i2 = 1;
                        break;
                    case 41:
                        str2 = str2;
                        c0439o7.b(41, typedArrayObtainStyledAttributes.getInt(index, c0501q7.V));
                        i2 = 1;
                        break;
                    case 42:
                        str2 = str2;
                        c0439o7.b(42, typedArrayObtainStyledAttributes.getInt(index, c0501q7.W));
                        i2 = 1;
                        break;
                    case 43:
                        str2 = str2;
                        c0439o7.a(43, typedArrayObtainStyledAttributes.getFloat(index, c0562s7.c));
                        i2 = 1;
                        break;
                    case 44:
                        str2 = str2;
                        c0439o7.d(44, true);
                        c0439o7.a(44, typedArrayObtainStyledAttributes.getDimension(index, c0593t7.m));
                        i2 = 1;
                        break;
                    case 45:
                        str2 = str2;
                        c0439o7.a(45, typedArrayObtainStyledAttributes.getFloat(index, c0593t7.b));
                        i2 = 1;
                        break;
                    case 46:
                        str2 = str2;
                        c0439o7.a(46, typedArrayObtainStyledAttributes.getFloat(index, c0593t7.c));
                        i2 = 1;
                        break;
                    case 47:
                        str2 = str2;
                        c0439o7.a(47, typedArrayObtainStyledAttributes.getFloat(index, c0593t7.d));
                        i2 = 1;
                        break;
                    case 48:
                        str2 = str2;
                        c0439o7.a(48, typedArrayObtainStyledAttributes.getFloat(index, c0593t7.e));
                        i2 = 1;
                        break;
                    case 49:
                        str2 = str2;
                        c0439o7.a(49, typedArrayObtainStyledAttributes.getDimension(index, c0593t7.f));
                        i2 = 1;
                        break;
                    case 50:
                        str2 = str2;
                        c0439o7.a(50, typedArrayObtainStyledAttributes.getDimension(index, c0593t7.g));
                        i2 = 1;
                        break;
                    case 51:
                        str2 = str2;
                        c0439o7.a(51, typedArrayObtainStyledAttributes.getDimension(index, c0593t7.i));
                        i2 = 1;
                        break;
                    case 52:
                        str2 = str2;
                        c0439o7.a(52, typedArrayObtainStyledAttributes.getDimension(index, c0593t7.j));
                        i2 = 1;
                        break;
                    case 53:
                        str2 = str2;
                        c0439o7.a(53, typedArrayObtainStyledAttributes.getDimension(index, c0593t7.k));
                        i2 = 1;
                        break;
                    case 54:
                        str2 = str2;
                        c0439o7.b(54, typedArrayObtainStyledAttributes.getInt(index, c0501q7.X));
                        i2 = 1;
                        break;
                    case 55:
                        str2 = str2;
                        c0439o7.b(55, typedArrayObtainStyledAttributes.getInt(index, c0501q7.Y));
                        i2 = 1;
                        break;
                    case 56:
                        str2 = str2;
                        c0439o7.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0501q7.Z));
                        i2 = 1;
                        break;
                    case 57:
                        str2 = str2;
                        c0439o7.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0501q7.a0));
                        i2 = 1;
                        break;
                    case 58:
                        str2 = str2;
                        c0439o7.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0501q7.b0));
                        i2 = 1;
                        break;
                    case 59:
                        str2 = str2;
                        c0439o7.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0501q7.c0));
                        i2 = 1;
                        break;
                    case 60:
                        str2 = str2;
                        c0439o7.a(60, typedArrayObtainStyledAttributes.getFloat(index, c0593t7.a));
                        i2 = 1;
                        break;
                    case 62:
                        str2 = str2;
                        c0439o7.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0501q7.A));
                        i2 = 1;
                        break;
                    case 63:
                        str2 = str2;
                        c0439o7.a(63, typedArrayObtainStyledAttributes.getFloat(index, c0501q7.B));
                        i2 = 1;
                        break;
                    case 64:
                        str2 = str2;
                        c0439o7.b(64, i(typedArrayObtainStyledAttributes, index, c0531r7.a));
                        i2 = 1;
                        break;
                    case 65:
                        str2 = str2;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            c0439o7.c(65, typedArrayObtainStyledAttributes.getString(index));
                        } else {
                            c0439o7.c(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        }
                        i2 = 1;
                        break;
                    case 66:
                        str2 = str2;
                        c0439o7.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        i2 = 1;
                        break;
                    case 67:
                        str2 = str2;
                        c0439o7.a(67, typedArrayObtainStyledAttributes.getFloat(index, c0531r7.e));
                        i2 = 1;
                        break;
                    case 68:
                        str2 = str2;
                        c0439o7.a(68, typedArrayObtainStyledAttributes.getFloat(index, c0562s7.d));
                        i2 = 1;
                        break;
                    case 69:
                        str2 = str2;
                        c0439o7.a(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        i2 = 1;
                        break;
                    case 70:
                        str2 = str2;
                        c0439o7.a(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        i2 = 1;
                        break;
                    case 71:
                        str2 = str2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        i2 = 1;
                        break;
                    case 72:
                        str2 = str2;
                        c0439o7.b(72, typedArrayObtainStyledAttributes.getInt(index, c0501q7.f0));
                        i2 = 1;
                        break;
                    case 73:
                        str2 = str2;
                        c0439o7.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0501q7.g0));
                        i2 = 1;
                        break;
                    case 74:
                        str2 = str2;
                        c0439o7.c(74, typedArrayObtainStyledAttributes.getString(index));
                        i2 = 1;
                        break;
                    case 75:
                        str2 = str2;
                        c0439o7.d(75, typedArrayObtainStyledAttributes.getBoolean(index, c0501q7.n0));
                        i2 = 1;
                        break;
                    case 76:
                        str2 = str2;
                        c0439o7.b(76, typedArrayObtainStyledAttributes.getInt(index, c0531r7.c));
                        i2 = 1;
                        break;
                    case 77:
                        str2 = str2;
                        c0439o7.c(77, typedArrayObtainStyledAttributes.getString(index));
                        i2 = 1;
                        break;
                    case 78:
                        str2 = str2;
                        c0439o7.b(78, typedArrayObtainStyledAttributes.getInt(index, c0562s7.b));
                        i2 = 1;
                        break;
                    case 79:
                        str2 = str2;
                        c0439o7.a(79, typedArrayObtainStyledAttributes.getFloat(index, c0531r7.d));
                        i2 = 1;
                        break;
                    case 80:
                        str2 = str2;
                        c0439o7.d(80, typedArrayObtainStyledAttributes.getBoolean(index, c0501q7.l0));
                        i2 = 1;
                        break;
                    case 81:
                        str2 = str2;
                        c0439o7.d(81, typedArrayObtainStyledAttributes.getBoolean(index, c0501q7.m0));
                        i2 = 1;
                        break;
                    case 82:
                        str2 = str2;
                        c0439o7.b(82, typedArrayObtainStyledAttributes.getInteger(index, c0531r7.b));
                        i2 = 1;
                        break;
                    case 83:
                        str2 = str2;
                        c0439o7.b(83, i(typedArrayObtainStyledAttributes, index, c0593t7.h));
                        i2 = 1;
                        break;
                    case 84:
                        str2 = str2;
                        c0439o7.b(84, typedArrayObtainStyledAttributes.getInteger(index, c0531r7.g));
                        i2 = 1;
                        break;
                    case 85:
                        str2 = str2;
                        c0439o7.a(85, typedArrayObtainStyledAttributes.getFloat(index, c0531r7.f));
                        i2 = 1;
                        break;
                    case 86:
                        str2 = str2;
                        int i5 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i5 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            c0531r7.i = resourceId2;
                            c0439o7.b(89, resourceId2);
                            if (c0531r7.i != -1) {
                                c0439o7.b(88, -2);
                            }
                        } else if (i5 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            c0531r7.h = string;
                            c0439o7.c(90, string);
                            if (c0531r7.h.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                c0531r7.i = resourceId3;
                                c0439o7.b(89, resourceId3);
                                c0439o7.b(88, -2);
                            } else {
                                c0439o7.b(88, -1);
                            }
                        } else {
                            c0439o7.b(88, typedArrayObtainStyledAttributes.getInteger(index, c0531r7.i));
                        }
                        i2 = 1;
                        break;
                    case 87:
                        str2 = str2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        i2 = 1;
                        break;
                    case 93:
                        str2 = str2;
                        c0439o7.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0501q7.L));
                        i2 = 1;
                        break;
                    case 94:
                        str2 = str2;
                        c0439o7.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0501q7.S));
                        i2 = 1;
                        break;
                    case 95:
                        str2 = str2;
                        j(c0439o7, typedArrayObtainStyledAttributes, index, 0);
                        i2 = 1;
                        break;
                    case 96:
                        str2 = str2;
                        i2 = 1;
                        j(c0439o7, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        str2 = str2;
                        c0439o7.b(97, typedArrayObtainStyledAttributes.getInt(index, c0501q7.o0));
                        i2 = 1;
                        break;
                    case 98:
                        str2 = str2;
                        int i6 = AbstractC0082cj.s;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            c0470p7.a = typedArrayObtainStyledAttributes.getResourceId(index, c0470p7.a);
                        }
                        i2 = 1;
                        break;
                    case 99:
                        str2 = str2;
                        c0439o7.d(99, typedArrayObtainStyledAttributes.getBoolean(index, c0501q7.g));
                        i2 = 1;
                        break;
                }
                i3 += i2;
                indexCount = i4;
                str2 = str2;
            }
        } else {
            String str4 = "CURRENTLY UNSUPPORTED";
            String str5 = "Unknown attribute 0x";
            int i7 = 1;
            int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount();
            int i8 = 0;
            while (i8 < indexCount2) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i8);
                if (index2 != i7 && 23 != index2 && 24 != index2) {
                    c0531r7.getClass();
                    c0501q7.getClass();
                    c0562s7.getClass();
                    c0593t7.getClass();
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.p = i(typedArrayObtainStyledAttributes, index2, c0501q7.p);
                        i = 1;
                        break;
                    case 2:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0501q7.I);
                        i = 1;
                        break;
                    case 3:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.o = i(typedArrayObtainStyledAttributes, index2, c0501q7.o);
                        i = 1;
                        break;
                    case 4:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.n = i(typedArrayObtainStyledAttributes, index2, c0501q7.n);
                        i = 1;
                        break;
                    case 5:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.y = typedArrayObtainStyledAttributes.getString(index2);
                        i = 1;
                        break;
                    case 6:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c0501q7.C);
                        i = 1;
                        break;
                    case 7:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c0501q7.D);
                        i = 1;
                        break;
                    case 8:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0501q7.J);
                        i = 1;
                        break;
                    case 9:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.v = i(typedArrayObtainStyledAttributes, index2, c0501q7.v);
                        i = 1;
                        break;
                    case 10:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.u = i(typedArrayObtainStyledAttributes, index2, c0501q7.u);
                        i = 1;
                        break;
                    case 11:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0501q7.P);
                        i = 1;
                        break;
                    case 12:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0501q7.Q);
                        i = 1;
                        break;
                    case 13:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0501q7.M);
                        i = 1;
                        break;
                    case 14:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0501q7.O);
                        i = 1;
                        break;
                    case 15:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0501q7.R);
                        i = 1;
                        break;
                    case 16:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0501q7.N);
                        i = 1;
                        break;
                    case 17:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c0501q7.d);
                        i = 1;
                        break;
                    case 18:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, c0501q7.e);
                        i = 1;
                        break;
                    case 19:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.f = typedArrayObtainStyledAttributes.getFloat(index2, c0501q7.f);
                        i = 1;
                        break;
                    case 20:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.w = typedArrayObtainStyledAttributes.getFloat(index2, c0501q7.w);
                        i = 1;
                        break;
                    case 21:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, c0501q7.c);
                        i = 1;
                        break;
                    case 22:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        int i9 = typedArrayObtainStyledAttributes.getInt(index2, c0562s7.a);
                        c0562s7.a = i9;
                        c0562s7.a = iArr[i9];
                        i = 1;
                        break;
                    case 23:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, c0501q7.b);
                        i = 1;
                        break;
                    case 24:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0501q7.F);
                        i = 1;
                        break;
                    case 25:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.h = i(typedArrayObtainStyledAttributes, index2, c0501q7.h);
                        i = 1;
                        break;
                    case 26:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.i = i(typedArrayObtainStyledAttributes, index2, c0501q7.i);
                        i = 1;
                        break;
                    case 27:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.E = typedArrayObtainStyledAttributes.getInt(index2, c0501q7.E);
                        i = 1;
                        break;
                    case 28:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0501q7.G);
                        i = 1;
                        break;
                    case 29:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.j = i(typedArrayObtainStyledAttributes, index2, c0501q7.j);
                        i = 1;
                        break;
                    case 30:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.k = i(typedArrayObtainStyledAttributes, index2, c0501q7.k);
                        i = 1;
                        break;
                    case 31:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0501q7.K);
                        i = 1;
                        break;
                    case 32:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.s = i(typedArrayObtainStyledAttributes, index2, c0501q7.s);
                        i = 1;
                        break;
                    case 33:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.t = i(typedArrayObtainStyledAttributes, index2, c0501q7.t);
                        i = 1;
                        break;
                    case 34:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0501q7.H);
                        i = 1;
                        break;
                    case 35:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.m = i(typedArrayObtainStyledAttributes, index2, c0501q7.m);
                        i = 1;
                        break;
                    case 36:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.l = i(typedArrayObtainStyledAttributes, index2, c0501q7.l);
                        i = 1;
                        break;
                    case 37:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.x = typedArrayObtainStyledAttributes.getFloat(index2, c0501q7.x);
                        i = 1;
                        break;
                    case 38:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0470p7.a = typedArrayObtainStyledAttributes.getResourceId(index2, c0470p7.a);
                        i = 1;
                        break;
                    case 39:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.U = typedArrayObtainStyledAttributes.getFloat(index2, c0501q7.U);
                        i = 1;
                        break;
                    case 40:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.T = typedArrayObtainStyledAttributes.getFloat(index2, c0501q7.T);
                        i = 1;
                        break;
                    case 41:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.V = typedArrayObtainStyledAttributes.getInt(index2, c0501q7.V);
                        i = 1;
                        break;
                    case 42:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.W = typedArrayObtainStyledAttributes.getInt(index2, c0501q7.W);
                        i = 1;
                        break;
                    case 43:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0562s7.c = typedArrayObtainStyledAttributes.getFloat(index2, c0562s7.c);
                        i = 1;
                        break;
                    case 44:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0593t7.l = true;
                        c0593t7.m = typedArrayObtainStyledAttributes.getDimension(index2, c0593t7.m);
                        i = 1;
                        break;
                    case 45:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0593t7.b = typedArrayObtainStyledAttributes.getFloat(index2, c0593t7.b);
                        i = 1;
                        break;
                    case 46:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0593t7.c = typedArrayObtainStyledAttributes.getFloat(index2, c0593t7.c);
                        i = 1;
                        break;
                    case 47:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0593t7.d = typedArrayObtainStyledAttributes.getFloat(index2, c0593t7.d);
                        i = 1;
                        break;
                    case 48:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0593t7.e = typedArrayObtainStyledAttributes.getFloat(index2, c0593t7.e);
                        i = 1;
                        break;
                    case 49:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0593t7.f = typedArrayObtainStyledAttributes.getDimension(index2, c0593t7.f);
                        i = 1;
                        break;
                    case 50:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0593t7.g = typedArrayObtainStyledAttributes.getDimension(index2, c0593t7.g);
                        i = 1;
                        break;
                    case 51:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0593t7.i = typedArrayObtainStyledAttributes.getDimension(index2, c0593t7.i);
                        i = 1;
                        break;
                    case 52:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0593t7.j = typedArrayObtainStyledAttributes.getDimension(index2, c0593t7.j);
                        i = 1;
                        break;
                    case 53:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0593t7.k = typedArrayObtainStyledAttributes.getDimension(index2, c0593t7.k);
                        i = 1;
                        break;
                    case 54:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.X = typedArrayObtainStyledAttributes.getInt(index2, c0501q7.X);
                        i = 1;
                        break;
                    case 55:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.Y = typedArrayObtainStyledAttributes.getInt(index2, c0501q7.Y);
                        i = 1;
                        break;
                    case 56:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0501q7.Z);
                        i = 1;
                        break;
                    case 57:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0501q7.a0);
                        i = 1;
                        break;
                    case 58:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0501q7.b0);
                        i = 1;
                        break;
                    case 59:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0501q7.c0);
                        i = 1;
                        break;
                    case 60:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0593t7.a = typedArrayObtainStyledAttributes.getFloat(index2, c0593t7.a);
                        i = 1;
                        break;
                    case 61:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.z = i(typedArrayObtainStyledAttributes, index2, c0501q7.z);
                        i = 1;
                        break;
                    case 62:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0501q7.A);
                        i = 1;
                        break;
                    case 63:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0501q7.B = typedArrayObtainStyledAttributes.getFloat(index2, c0501q7.B);
                        i = 1;
                        break;
                    case 64:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        c0531r7.a = i(typedArrayObtainStyledAttributes, index2, c0531r7.a);
                        i = 1;
                        break;
                    case 65:
                        indexCount2 = indexCount2;
                        str4 = str4;
                        str5 = str5;
                        str = str3;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type != 3) {
                            String str6 = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            c0531r7.getClass();
                            i = 1;
                        } else {
                            typedArrayObtainStyledAttributes.getString(index2);
                            c0531r7.getClass();
                            i = 1;
                        }
                        break;
                    case 66:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        c0531r7.getClass();
                        str = str3;
                        i = 1;
                        break;
                    case 67:
                        str4 = str4;
                        c0531r7.e = typedArrayObtainStyledAttributes.getFloat(index2, c0531r7.e);
                        str = str3;
                        i = 1;
                        break;
                    case 68:
                        str4 = str4;
                        c0562s7.d = typedArrayObtainStyledAttributes.getFloat(index2, c0562s7.d);
                        str = str3;
                        i = 1;
                        break;
                    case 69:
                        str4 = str4;
                        c0501q7.d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        str = str3;
                        i = 1;
                        break;
                    case 70:
                        str4 = str4;
                        c0501q7.e0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        str = str3;
                        i = 1;
                        break;
                    case 71:
                        str4 = str4;
                        Log.e(str3, str4);
                        str = str3;
                        i = 1;
                        break;
                    case 72:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        c0501q7.f0 = typedArrayObtainStyledAttributes.getInt(index2, c0501q7.f0);
                        str = str3;
                        i = 1;
                        break;
                    case 73:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        c0501q7.g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0501q7.g0);
                        str = str3;
                        i = 1;
                        break;
                    case 74:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        c0501q7.j0 = typedArrayObtainStyledAttributes.getString(index2);
                        str = str3;
                        i = 1;
                        break;
                    case 75:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        c0501q7.n0 = typedArrayObtainStyledAttributes.getBoolean(index2, c0501q7.n0);
                        str = str3;
                        i = 1;
                        break;
                    case 76:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        c0531r7.c = typedArrayObtainStyledAttributes.getInt(index2, c0531r7.c);
                        str = str3;
                        i = 1;
                        break;
                    case 77:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        c0501q7.k0 = typedArrayObtainStyledAttributes.getString(index2);
                        str = str3;
                        i = 1;
                        break;
                    case 78:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        c0562s7.b = typedArrayObtainStyledAttributes.getInt(index2, c0562s7.b);
                        str = str3;
                        i = 1;
                        break;
                    case 79:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        c0531r7.d = typedArrayObtainStyledAttributes.getFloat(index2, c0531r7.d);
                        str = str3;
                        i = 1;
                        break;
                    case 80:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        c0501q7.l0 = typedArrayObtainStyledAttributes.getBoolean(index2, c0501q7.l0);
                        str = str3;
                        i = 1;
                        break;
                    case 81:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        c0501q7.m0 = typedArrayObtainStyledAttributes.getBoolean(index2, c0501q7.m0);
                        str = str3;
                        i = 1;
                        break;
                    case 82:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        c0531r7.b = typedArrayObtainStyledAttributes.getInteger(index2, c0531r7.b);
                        str = str3;
                        i = 1;
                        break;
                    case 83:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        c0593t7.h = i(typedArrayObtainStyledAttributes, index2, c0593t7.h);
                        str = str3;
                        i = 1;
                        break;
                    case 84:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        c0531r7.g = typedArrayObtainStyledAttributes.getInteger(index2, c0531r7.g);
                        str = str3;
                        i = 1;
                        break;
                    case 85:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        c0531r7.f = typedArrayObtainStyledAttributes.getFloat(index2, c0531r7.f);
                        str = str3;
                        i = 1;
                        break;
                    case 86:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        int i10 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i10 == 1) {
                            c0531r7.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i10 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            c0531r7.h = string2;
                            if (string2.indexOf("/") > 0) {
                                c0531r7.i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, c0531r7.i);
                        }
                        str = str3;
                        i = 1;
                        break;
                    case 87:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        Log.w(str3, "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        str = str3;
                        i = 1;
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        str5 = str5;
                        StringBuilder sb2 = new StringBuilder(str5);
                        indexCount2 = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w(str3, sb2.toString());
                        str = str3;
                        i = 1;
                        break;
                    case 91:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        c0501q7.q = i(typedArrayObtainStyledAttributes, index2, c0501q7.q);
                        str = str3;
                        i = 1;
                        break;
                    case 92:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        c0501q7.r = i(typedArrayObtainStyledAttributes, index2, c0501q7.r);
                        str = str3;
                        i = 1;
                        break;
                    case 93:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        c0501q7.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0501q7.L);
                        str = str3;
                        i = 1;
                        break;
                    case 94:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        c0501q7.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, c0501q7.S);
                        str = str3;
                        i = 1;
                        break;
                    case 95:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        j(c0501q7, typedArrayObtainStyledAttributes, index2, 0);
                        str = str3;
                        i = 1;
                        break;
                    case 96:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        j(c0501q7, typedArrayObtainStyledAttributes, index2, 1);
                        str4 = str4;
                        str = str3;
                        i = 1;
                        break;
                    case 97:
                        indexCount2 = indexCount2;
                        str5 = str5;
                        c0501q7.o0 = typedArrayObtainStyledAttributes.getInt(index2, c0501q7.o0);
                        str = str3;
                        i = 1;
                        break;
                }
                i8 += i;
                indexCount2 = indexCount2;
                str5 = str5;
                String str7 = str4;
                i7 = i;
                str3 = str;
                str4 = str7;
            }
            if (c0501q7.j0 != null) {
                c0501q7.i0 = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return c0470p7;
    }

    public static int i(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0035  */
    /* JADX WARN: Code duplicated, block: B:22:0x0039  */
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    public static void j(Object obj, TypedArray typedArray, int i, int i2) {
        int dimensionPixelSize;
        C0439o7 c0439o7;
        C0501q7 c0501q7;
        C0346l7 c0346l7;
        if (obj == null) {
            return;
        }
        int i3 = typedArray.peekValue(i).type;
        boolean z = true;
        int i4 = 0;
        if (i3 != 3) {
            if (i3 != 5) {
                dimensionPixelSize = typedArray.getInt(i, 0);
                if (dimensionPixelSize == -4) {
                    i4 = -2;
                } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                    z = false;
                }
                if (obj instanceof C0346l7) {
                    c0346l7 = (C0346l7) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) c0346l7).width = i4;
                        c0346l7.W = z;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) c0346l7).height = i4;
                        c0346l7.X = z;
                        return;
                    }
                }
                if (obj instanceof C0501q7) {
                    c0501q7 = (C0501q7) obj;
                    if (i2 == 0) {
                        c0501q7.b = i4;
                        c0501q7.l0 = z;
                        return;
                    } else {
                        c0501q7.c = i4;
                        c0501q7.m0 = z;
                        return;
                    }
                }
                if (obj instanceof C0439o7) {
                    c0439o7 = (C0439o7) obj;
                    if (i2 == 0) {
                        c0439o7.b(23, i4);
                        c0439o7.d(80, z);
                        return;
                    } else {
                        c0439o7.b(21, i4);
                        c0439o7.d(81, z);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
            z = false;
            i4 = dimensionPixelSize;
            if (obj instanceof C0346l7) {
                c0346l7 = (C0346l7) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) c0346l7).width = i4;
                    c0346l7.W = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) c0346l7).height = i4;
                    c0346l7.X = z;
                    return;
                }
            }
            if (obj instanceof C0501q7) {
                c0501q7 = (C0501q7) obj;
                if (i2 == 0) {
                    c0501q7.b = i4;
                    c0501q7.l0 = z;
                    return;
                } else {
                    c0501q7.c = i4;
                    c0501q7.m0 = z;
                    return;
                }
            }
            if (obj instanceof C0439o7) {
                c0439o7 = (C0439o7) obj;
                if (i2 == 0) {
                    c0439o7.b(23, i4);
                    c0439o7.d(80, z);
                    return;
                } else {
                    c0439o7.b(21, i4);
                    c0439o7.d(81, z);
                    return;
                }
            }
            return;
        }
        String string = typedArray.getString(i);
        if (string == null) {
            return;
        }
        int iIndexOf = string.indexOf(61);
        int length = string.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = string.substring(0, iIndexOf);
        String strSubstring2 = string.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof C0346l7) {
                    C0346l7 c0346l8 = (C0346l7) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) c0346l8).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) c0346l8).height = 0;
                    }
                    k(c0346l8, strTrim2);
                    return;
                }
                if (obj instanceof C0501q7) {
                    ((C0501q7) obj).y = strTrim2;
                    return;
                } else {
                    if (obj instanceof C0439o7) {
                        ((C0439o7) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f2 = Float.parseFloat(strTrim2);
                    if (obj instanceof C0346l7) {
                        C0346l7 c0346l9 = (C0346l7) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) c0346l9).width = 0;
                            c0346l9.H = f2;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c0346l9).height = 0;
                            c0346l9.I = f2;
                        }
                    } else if (obj instanceof C0501q7) {
                        C0501q7 c0501q8 = (C0501q7) obj;
                        if (i2 == 0) {
                            c0501q8.b = 0;
                            c0501q8.U = f2;
                        } else {
                            c0501q8.c = 0;
                            c0501q8.T = f2;
                        }
                    } else if (obj instanceof C0439o7) {
                        C0439o7 c0439o8 = (C0439o7) obj;
                        if (i2 == 0) {
                            c0439o8.b(23, 0);
                            c0439o8.a(39, f2);
                        } else {
                            c0439o8.b(21, 0);
                            c0439o8.a(40, f2);
                        }
                    }
                } else {
                    if (!"parent".equalsIgnoreCase(strTrim)) {
                        return;
                    }
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof C0346l7) {
                        C0346l7 c0346l10 = (C0346l7) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) c0346l10).width = 0;
                            c0346l10.R = fMax;
                            c0346l10.L = 2;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c0346l10).height = 0;
                            c0346l10.S = fMax;
                            c0346l10.M = 2;
                        }
                    } else if (obj instanceof C0501q7) {
                        C0501q7 c0501q9 = (C0501q7) obj;
                        if (i2 == 0) {
                            c0501q9.b = 0;
                            c0501q9.d0 = fMax;
                            c0501q9.X = 2;
                        } else {
                            c0501q9.c = 0;
                            c0501q9.e0 = fMax;
                            c0501q9.Y = 2;
                        }
                    } else if (obj instanceof C0439o7) {
                        C0439o7 c0439o9 = (C0439o7) obj;
                        if (i2 == 0) {
                            c0439o9.b(23, 0);
                            c0439o9.b(54, 2);
                        } else {
                            c0439o9.b(21, 0);
                            c0439o9.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void k(C0346l7 c0346l7, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i = 0;
            int i2 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (!strSubstring.equalsIgnoreCase("W")) {
                    i = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i2 = i;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f2 = Float.parseFloat(strSubstring3);
                        float f3 = Float.parseFloat(strSubstring4);
                        if (f2 > 0.0f && f3 > 0.0f) {
                            if (i2 == 1) {
                                Math.abs(f3 / f2);
                            } else {
                                Math.abs(f2 / f3);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        c0346l7.G = str;
    }

    public static String l(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(ConstraintLayout constraintLayout) {
        int i;
        int i2;
        int i3;
        String resourceEntryName;
        C0624u7 c0624u7 = this;
        int i4 = 1;
        int childCount = constraintLayout.getChildCount();
        HashMap map = c0624u7.c;
        HashSet<Integer> hashSet = new HashSet(map.keySet());
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = constraintLayout.getChildAt(i5);
            int id = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb.append(resourceEntryName);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (c0624u7.b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (map.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        C0470p7 c0470p7 = (C0470p7) map.get(Integer.valueOf(id));
                        if (c0470p7 != null) {
                            if (childAt instanceof W3) {
                                C0501q7 c0501q7 = c0470p7.d;
                                c0501q7.h0 = i4;
                                W3 w3 = (W3) childAt;
                                w3.setId(id);
                                w3.setType(c0501q7.f0);
                                w3.setMargin(c0501q7.g0);
                                w3.setAllowsGoneWidget(c0501q7.n0);
                                int[] iArr = c0501q7.i0;
                                if (iArr != null) {
                                    w3.setReferencedIds(iArr);
                                } else {
                                    String str = c0501q7.j0;
                                    if (str != null) {
                                        int[] iArrE = e(w3, str);
                                        c0501q7.i0 = iArrE;
                                        w3.setReferencedIds(iArrE);
                                    }
                                }
                            }
                            C0346l7 c0346l7 = (C0346l7) childAt.getLayoutParams();
                            c0346l7.a();
                            c0470p7.a(c0346l7);
                            HashMap map2 = c0470p7.f;
                            Class<?> cls = childAt.getClass();
                            for (String str2 : map2.keySet()) {
                                C0255i7 c0255i7 = (C0255i7) map2.get(str2);
                                String str3 = c0255i7.a ? str2 : "set" + str2;
                                try {
                                    switch (Vo.o(c0255i7.b)) {
                                        case 0:
                                            i3 = childCount;
                                            cls.getMethod(str3, Integer.TYPE).invoke(childAt, Integer.valueOf(c0255i7.c));
                                            break;
                                        case 1:
                                            i3 = childCount;
                                            cls.getMethod(str3, Float.TYPE).invoke(childAt, Float.valueOf(c0255i7.d));
                                            break;
                                        case 2:
                                            i3 = childCount;
                                            cls.getMethod(str3, Integer.TYPE).invoke(childAt, Integer.valueOf(c0255i7.g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(str3, Drawable.class);
                                            i3 = childCount;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(c0255i7.g);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e2) {
                                                e = e2;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                                e.printStackTrace();
                                            } catch (NoSuchMethodException e3) {
                                                e = e3;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str3);
                                            } catch (InvocationTargetException e4) {
                                                e = e4;
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                                e.printStackTrace();
                                            }
                                            break;
                                        case 4:
                                            cls.getMethod(str3, CharSequence.class).invoke(childAt, c0255i7.e);
                                            i3 = childCount;
                                            break;
                                        case 5:
                                            cls.getMethod(str3, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c0255i7.f));
                                            i3 = childCount;
                                            break;
                                        case 6:
                                            cls.getMethod(str3, Float.TYPE).invoke(childAt, Float.valueOf(c0255i7.d));
                                            i3 = childCount;
                                            break;
                                        case 7:
                                            cls.getMethod(str3, Integer.TYPE).invoke(childAt, Integer.valueOf(c0255i7.c));
                                            i3 = childCount;
                                            break;
                                        default:
                                            i3 = childCount;
                                            break;
                                    }
                                } catch (IllegalAccessException e5) {
                                    e = e5;
                                    i3 = childCount;
                                } catch (NoSuchMethodException e6) {
                                    e = e6;
                                    i3 = childCount;
                                } catch (InvocationTargetException e7) {
                                    e = e7;
                                    i3 = childCount;
                                }
                                map2 = map2;
                                childCount = i3;
                            }
                            i = childCount;
                            childAt.setLayoutParams(c0346l7);
                            C0562s7 c0562s7 = c0470p7.b;
                            if (c0562s7.b == 0) {
                                childAt.setVisibility(c0562s7.a);
                            }
                            childAt.setAlpha(c0562s7.c);
                            C0593t7 c0593t7 = c0470p7.e;
                            childAt.setRotation(c0593t7.a);
                            childAt.setRotationX(c0593t7.b);
                            childAt.setRotationY(c0593t7.c);
                            childAt.setScaleX(c0593t7.d);
                            childAt.setScaleY(c0593t7.e);
                            if (c0593t7.h != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(c0593t7.h);
                                if (viewFindViewById != null) {
                                    float bottom = (viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f;
                                    float right = (viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        float left = right - childAt.getLeft();
                                        float top = bottom - childAt.getTop();
                                        childAt.setPivotX(left);
                                        childAt.setPivotY(top);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(c0593t7.f)) {
                                    childAt.setPivotX(c0593t7.f);
                                }
                                if (!Float.isNaN(c0593t7.g)) {
                                    childAt.setPivotY(c0593t7.g);
                                }
                            }
                            childAt.setTranslationX(c0593t7.i);
                            childAt.setTranslationY(c0593t7.j);
                            childAt.setTranslationZ(c0593t7.k);
                            if (c0593t7.l) {
                                childAt.setElevation(c0593t7.m);
                            }
                        }
                    } else {
                        i = childCount;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                    i2 = 1;
                }
                i5 += i2;
                i4 = i2;
                childCount = i;
                c0624u7 = this;
            }
            i2 = i4;
            i = childCount;
            i5 += i2;
            i4 = i2;
            childCount = i;
            c0624u7 = this;
        }
        int i6 = childCount;
        for (Integer num : hashSet) {
            C0470p7 c0470p8 = (C0470p7) map.get(num);
            if (c0470p8 != null) {
                C0501q7 c0501q8 = c0470p8.d;
                if (c0501q8.h0 == 1) {
                    Context context = constraintLayout.getContext();
                    W3 w4 = new W3(context);
                    w4.a = new int[32];
                    w4.g = new HashMap();
                    w4.c = context;
                    w4.g(null);
                    w4.setVisibility(8);
                    w4.setId(num.intValue());
                    int[] iArr2 = c0501q8.i0;
                    if (iArr2 != null) {
                        w4.setReferencedIds(iArr2);
                    } else {
                        String str4 = c0501q8.j0;
                        if (str4 != null) {
                            int[] iArrE2 = e(w4, str4);
                            c0501q8.i0 = iArrE2;
                            w4.setReferencedIds(iArrE2);
                        }
                    }
                    w4.setType(c0501q8.f0);
                    w4.setMargin(c0501q8.g0);
                    Bo bo = ConstraintLayout.r;
                    C0346l7 c0346l8 = new C0346l7(-2, -2);
                    w4.i();
                    c0470p8.a(c0346l8);
                    constraintLayout.addView(w4, c0346l8);
                }
                if (c0501q8.a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    Bo bo2 = ConstraintLayout.r;
                    C0346l7 c0346l9 = new C0346l7(-2, -2);
                    c0470p8.a(c0346l9);
                    constraintLayout.addView(guideline, c0346l9);
                }
            }
        }
        for (int i7 = 0; i7 < i6; i7++) {
            View childAt2 = constraintLayout.getChildAt(i7);
            if (childAt2 instanceof AbstractC0284j7) {
                ((AbstractC0284j7) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        C0624u7 c0624u7 = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map = c0624u7.c;
        map.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            C0346l7 c0346l7 = (C0346l7) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c0624u7.b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new C0470p7());
            }
            C0470p7 c0470p7 = (C0470p7) map.get(Integer.valueOf(id));
            if (c0470p7 != null) {
                HashMap map2 = c0624u7.a;
                HashMap map3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : map2.keySet()) {
                    C0255i7 c0255i7 = (C0255i7) map2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            map3.put(str, new C0255i7(c0255i7, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            map3.put(str, new C0255i7(c0255i7, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    } catch (NoSuchMethodException e3) {
                        e3.printStackTrace();
                    } catch (InvocationTargetException e4) {
                        e4.printStackTrace();
                    }
                }
                c0470p7.f = map3;
                c0470p7.a = id;
                int i2 = c0346l7.e;
                C0501q7 c0501q7 = c0470p7.d;
                c0501q7.h = i2;
                c0501q7.i = c0346l7.f;
                c0501q7.j = c0346l7.g;
                c0501q7.k = c0346l7.h;
                c0501q7.l = c0346l7.i;
                c0501q7.m = c0346l7.j;
                c0501q7.n = c0346l7.k;
                c0501q7.o = c0346l7.l;
                c0501q7.p = c0346l7.m;
                c0501q7.q = c0346l7.n;
                c0501q7.r = c0346l7.o;
                c0501q7.s = c0346l7.s;
                c0501q7.t = c0346l7.t;
                c0501q7.u = c0346l7.u;
                c0501q7.v = c0346l7.v;
                c0501q7.w = c0346l7.E;
                c0501q7.x = c0346l7.F;
                c0501q7.y = c0346l7.G;
                c0501q7.z = c0346l7.p;
                c0501q7.A = c0346l7.q;
                c0501q7.B = c0346l7.r;
                c0501q7.C = c0346l7.T;
                c0501q7.D = c0346l7.U;
                c0501q7.E = c0346l7.V;
                c0501q7.f = c0346l7.c;
                c0501q7.d = c0346l7.a;
                c0501q7.e = c0346l7.b;
                c0501q7.b = ((ViewGroup.MarginLayoutParams) c0346l7).width;
                c0501q7.c = ((ViewGroup.MarginLayoutParams) c0346l7).height;
                c0501q7.F = ((ViewGroup.MarginLayoutParams) c0346l7).leftMargin;
                c0501q7.G = ((ViewGroup.MarginLayoutParams) c0346l7).rightMargin;
                c0501q7.H = ((ViewGroup.MarginLayoutParams) c0346l7).topMargin;
                c0501q7.I = ((ViewGroup.MarginLayoutParams) c0346l7).bottomMargin;
                c0501q7.L = c0346l7.D;
                c0501q7.T = c0346l7.I;
                c0501q7.U = c0346l7.H;
                c0501q7.W = c0346l7.K;
                c0501q7.V = c0346l7.J;
                c0501q7.l0 = c0346l7.W;
                c0501q7.m0 = c0346l7.X;
                c0501q7.X = c0346l7.L;
                c0501q7.Y = c0346l7.M;
                c0501q7.Z = c0346l7.P;
                c0501q7.a0 = c0346l7.Q;
                c0501q7.b0 = c0346l7.N;
                c0501q7.c0 = c0346l7.O;
                c0501q7.d0 = c0346l7.R;
                c0501q7.e0 = c0346l7.S;
                c0501q7.k0 = c0346l7.Y;
                c0501q7.N = c0346l7.x;
                c0501q7.P = c0346l7.z;
                c0501q7.M = c0346l7.w;
                c0501q7.O = c0346l7.y;
                c0501q7.R = c0346l7.A;
                c0501q7.Q = c0346l7.B;
                c0501q7.S = c0346l7.C;
                c0501q7.o0 = c0346l7.Z;
                c0501q7.J = c0346l7.getMarginEnd();
                c0501q7.K = c0346l7.getMarginStart();
                int visibility = childAt.getVisibility();
                C0562s7 c0562s7 = c0470p7.b;
                c0562s7.a = visibility;
                c0562s7.c = childAt.getAlpha();
                float rotation = childAt.getRotation();
                C0593t7 c0593t7 = c0470p7.e;
                c0593t7.a = rotation;
                c0593t7.b = childAt.getRotationX();
                c0593t7.c = childAt.getRotationY();
                c0593t7.d = childAt.getScaleX();
                c0593t7.e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    c0593t7.f = pivotX;
                    c0593t7.g = pivotY;
                }
                c0593t7.i = childAt.getTranslationX();
                c0593t7.j = childAt.getTranslationY();
                c0593t7.k = childAt.getTranslationZ();
                if (c0593t7.l) {
                    c0593t7.m = childAt.getElevation();
                }
                if (childAt instanceof W3) {
                    W3 w3 = (W3) childAt;
                    c0501q7.n0 = w3.getAllowsGoneWidget();
                    c0501q7.i0 = w3.getReferencedIds();
                    c0501q7.f0 = w3.getType();
                    c0501q7.g0 = w3.getMargin();
                }
            }
            i++;
            c0624u7 = this;
        }
    }

    public final void c(int i, int i2, int i3, int i4, int i5) {
        HashMap map = this.c;
        if (!map.containsKey(Integer.valueOf(i))) {
            map.put(Integer.valueOf(i), new C0470p7());
        }
        C0470p7 c0470p7 = (C0470p7) map.get(Integer.valueOf(i));
        if (c0470p7 == null) {
            return;
        }
        C0501q7 c0501q7 = c0470p7.d;
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    c0501q7.h = i3;
                    c0501q7.i = -1;
                } else {
                    if (i4 != 2) {
                        throw new IllegalArgumentException("Left to " + l(i4) + " undefined");
                    }
                    c0501q7.i = i3;
                    c0501q7.h = -1;
                }
                c0501q7.F = i5;
                return;
            case 2:
                if (i4 == 1) {
                    c0501q7.j = i3;
                    c0501q7.k = -1;
                } else {
                    if (i4 != 2) {
                        throw new IllegalArgumentException("right to " + l(i4) + " undefined");
                    }
                    c0501q7.k = i3;
                    c0501q7.j = -1;
                }
                c0501q7.G = i5;
                return;
            case 3:
                if (i4 == 3) {
                    c0501q7.l = i3;
                    c0501q7.m = -1;
                    c0501q7.p = -1;
                    c0501q7.q = -1;
                    c0501q7.r = -1;
                } else {
                    if (i4 != 4) {
                        throw new IllegalArgumentException("right to " + l(i4) + " undefined");
                    }
                    c0501q7.m = i3;
                    c0501q7.l = -1;
                    c0501q7.p = -1;
                    c0501q7.q = -1;
                    c0501q7.r = -1;
                }
                c0501q7.H = i5;
                return;
            case 4:
                if (i4 == 4) {
                    c0501q7.o = i3;
                    c0501q7.n = -1;
                    c0501q7.p = -1;
                    c0501q7.q = -1;
                    c0501q7.r = -1;
                } else {
                    if (i4 != 3) {
                        throw new IllegalArgumentException("right to " + l(i4) + " undefined");
                    }
                    c0501q7.n = i3;
                    c0501q7.o = -1;
                    c0501q7.p = -1;
                    c0501q7.q = -1;
                    c0501q7.r = -1;
                }
                c0501q7.I = i5;
                return;
            case 5:
                if (i4 == 5) {
                    c0501q7.p = i3;
                    c0501q7.o = -1;
                    c0501q7.n = -1;
                    c0501q7.l = -1;
                    c0501q7.m = -1;
                    return;
                }
                if (i4 == 3) {
                    c0501q7.q = i3;
                    c0501q7.o = -1;
                    c0501q7.n = -1;
                    c0501q7.l = -1;
                    c0501q7.m = -1;
                    return;
                }
                if (i4 != 4) {
                    throw new IllegalArgumentException("right to " + l(i4) + " undefined");
                }
                c0501q7.r = i3;
                c0501q7.o = -1;
                c0501q7.n = -1;
                c0501q7.l = -1;
                c0501q7.m = -1;
                return;
            case 6:
                if (i4 == 6) {
                    c0501q7.t = i3;
                    c0501q7.s = -1;
                } else {
                    if (i4 != 7) {
                        throw new IllegalArgumentException("right to " + l(i4) + " undefined");
                    }
                    c0501q7.s = i3;
                    c0501q7.t = -1;
                }
                c0501q7.K = i5;
                return;
            case 7:
                if (i4 == 7) {
                    c0501q7.v = i3;
                    c0501q7.u = -1;
                } else {
                    if (i4 != 6) {
                        throw new IllegalArgumentException("right to " + l(i4) + " undefined");
                    }
                    c0501q7.u = i3;
                    c0501q7.v = -1;
                }
                c0501q7.J = i5;
                return;
            default:
                throw new IllegalArgumentException(l(i2) + " to " + l(i4) + " unknown");
        }
    }

    public final void d(int i, int i2) {
        g(i).d.c = i2;
    }

    public final C0470p7 g(int i) {
        HashMap map = this.c;
        if (!map.containsKey(Integer.valueOf(i))) {
            map.put(Integer.valueOf(i), new C0470p7());
        }
        return (C0470p7) map.get(Integer.valueOf(i));
    }

    public final void h(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0470p7 c0470p7F = f(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        c0470p7F.d.a = true;
                    }
                    this.c.put(Integer.valueOf(c0470p7F.a), c0470p7F);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
