package com.jcraft.jsch;

/* JADX INFO: loaded from: classes.dex */
public class HostKey {
    public static final int ECDSA256 = 3;
    public static final int ECDSA384 = 4;
    public static final int ECDSA521 = 5;
    protected static final int GUESS = 0;
    public static final int SSHDSS = 1;
    public static final int SSHRSA = 2;
    static final int UNKNOWN = 6;
    private static final byte[][] names = {Util.str2byte("ssh-dss"), Util.str2byte("ssh-rsa"), Util.str2byte("ecdsa-sha2-nistp256"), Util.str2byte("ecdsa-sha2-nistp384"), Util.str2byte("ecdsa-sha2-nistp521")};
    protected String comment;
    protected String host;
    protected byte[] key;
    protected String marker;
    protected int type;

    public HostKey(String str, byte[] bArr) {
        this(str, 0, bArr);
    }

    private boolean isIncluded(String str) {
        String str2 = this.host;
        int length = str2.length();
        int length2 = str.length();
        int i = 0;
        while (i < length) {
            int iIndexOf = str2.indexOf(44, i);
            if (iIndexOf == -1) {
                if (length2 != length - i) {
                    return false;
                }
                return str2.regionMatches(true, i, str, 0, length2);
            }
            if (length2 == iIndexOf - i && str2.regionMatches(true, i, str, 0, length2)) {
                return true;
            }
            i = iIndexOf + 1;
        }
        return false;
    }

    public static int name2type(String str) {
        int i = 0;
        while (true) {
            byte[][] bArr = names;
            if (i >= bArr.length) {
                return 6;
            }
            if (Util.byte2str(bArr[i]).equals(str)) {
                return i + 1;
            }
            i++;
        }
    }

    public String getComment() {
        return this.comment;
    }

    public String getFingerPrint(JSch jSch) {
        HASH hash;
        try {
            hash = (HASH) Class.forName(JSch.getConfig("md5")).newInstance();
        } catch (Exception e) {
            System.err.println("getFingerPrint: " + e);
            hash = null;
        }
        return Util.getFingerPrint(hash, this.key);
    }

    public String getHost() {
        return this.host;
    }

    public String getKey() {
        byte[] bArr = this.key;
        return Util.byte2str(Util.toBase64(bArr, 0, bArr.length));
    }

    public String getMarker() {
        return this.marker;
    }

    public String getType() {
        int i = this.type;
        return (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) ? Util.byte2str(names[i - 1]) : "UNKNOWN";
    }

    public boolean isMatched(String str) {
        return isIncluded(str);
    }

    public HostKey(String str, int i, byte[] bArr) {
        this(str, i, bArr, null);
    }

    public HostKey(String str, int i, byte[] bArr, String str2) {
        this("", str, i, bArr, str2);
    }

    public HostKey(String str, String str2, int i, byte[] bArr, String str3) throws JSchException {
        this.marker = str;
        this.host = str2;
        if (i == 0) {
            byte b = bArr[8];
            if (b == 100) {
                this.type = 1;
            } else if (b == 114) {
                this.type = 2;
            } else if (b == 97 && bArr[20] == 50) {
                this.type = 3;
            } else if (b == 97 && bArr[20] == 51) {
                this.type = 4;
            } else {
                if (b != 97 || bArr[20] != 53) {
                    throw new JSchException("invalid key type");
                }
                this.type = 5;
            }
        } else {
            this.type = i;
        }
        this.key = bArr;
        this.comment = str3;
    }
}
