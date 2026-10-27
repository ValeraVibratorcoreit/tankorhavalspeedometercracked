package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class P2 {
    public String a;
    public int b;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AppResource{name='");
        sb.append(this.a);
        sb.append("', resourceType=");
        int i = this.b;
        if (i != 1) {
            str = i != 2 ? "null" : "DEX";
        } else {
            str = "FILE";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
