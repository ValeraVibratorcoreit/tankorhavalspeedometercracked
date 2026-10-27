package defpackage;

import android.text.SpannableStringBuilder;

/* JADX INFO: renamed from: o4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0436o4 {
    public static final String d;
    public static final String e;
    public static final C0436o4 f;
    public static final C0436o4 g;
    public final boolean a;
    public final int b;
    public final B4 c;

    static {
        B4 b4 = AbstractC0489pq.c;
        d = Character.toString((char) 8206);
        e = Character.toString((char) 8207);
        f = new C0436o4(false);
        g = new C0436o4(true);
    }

    public C0436o4(boolean z) {
        B4 b4 = AbstractC0489pq.c;
        this.a = z;
        this.b = 2;
        this.c = b4;
    }

    public static int a(CharSequence charSequence) {
        byte directionality;
        C0405n4 c0405n4 = new C0405n4(charSequence);
        c0405n4.c = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = c0405n4.c;
            if (i4 < c0405n4.b && i == 0) {
                CharSequence charSequence2 = c0405n4.a;
                char cCharAt = charSequence2.charAt(i4);
                c0405n4.d = cCharAt;
                if (Character.isHighSurrogate(cCharAt)) {
                    int iCodePointAt = Character.codePointAt(charSequence2, c0405n4.c);
                    c0405n4.c = Character.charCount(iCodePointAt) + c0405n4.c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    c0405n4.c++;
                    char c = c0405n4.d;
                    directionality = c < 1792 ? C0405n4.e[c] : Character.getDirectionality(c);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
        }
        if (i == 0) {
            return 0;
        }
        if (i2 != 0) {
            return i2;
        }
        while (c0405n4.c > 0) {
            switch (c0405n4.a()) {
                case 14:
                case 15:
                    if (i == i3) {
                        return -1;
                    }
                    i3--;
                    break;
                case 16:
                case 17:
                    if (i == i3) {
                        return 1;
                    }
                    i3--;
                    break;
                case 18:
                    i3++;
                    break;
                default:
                    break;
            }
        }
        return 0;
    }

    public static int b(CharSequence charSequence) {
        C0405n4 c0405n4 = new C0405n4(charSequence);
        c0405n4.c = c0405n4.b;
        int i = 0;
        while (true) {
            int i2 = i;
            while (c0405n4.c > 0) {
                byte bA = c0405n4.a();
                if (bA == 0) {
                    if (i == 0) {
                        return -1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bA == 1 || bA == 2) {
                    if (i == 0) {
                        return 1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bA != 9) {
                    switch (bA) {
                        case 14:
                        case 15:
                            if (i2 == i) {
                                return -1;
                            }
                            i--;
                            break;
                        case 16:
                        case 17:
                            if (i2 == i) {
                                return 1;
                            }
                            i--;
                            break;
                        case 18:
                            i++;
                            break;
                        default:
                            if (i2 != 0) {
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        String str;
        B4 b4 = AbstractC0489pq.c;
        if (charSequence == null) {
            return null;
        }
        boolean zC = b4.c(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = this.b & 2;
        String str2 = "";
        String str3 = e;
        String str4 = d;
        boolean z = this.a;
        if (i != 0) {
            boolean zC2 = (zC ? AbstractC0489pq.b : AbstractC0489pq.a).c(charSequence, charSequence.length());
            if (z || !(zC2 || a(charSequence) == 1)) {
                str = (!z || (zC2 && a(charSequence) != -1)) ? "" : str3;
            } else {
                str = str4;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (zC != z) {
            spannableStringBuilder.append(zC ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zC3 = (zC ? AbstractC0489pq.b : AbstractC0489pq.a).c(charSequence, charSequence.length());
        if (!z && (zC3 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z && (!zC3 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
