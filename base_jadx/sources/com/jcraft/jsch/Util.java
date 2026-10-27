package com.jcraft.jsch;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.Vector;

/* JADX INFO: loaded from: classes.dex */
class Util {
    private static final byte[] b64 = str2byte("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=");
    private static String[] chars = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
    static final byte[] empty = str2byte("");

    public static boolean array_equals(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static String byte2str(byte[] bArr, String str) {
        return byte2str(bArr, 0, bArr.length, str);
    }

    public static void bzero(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = 0;
        }
    }

    public static String checkTilde(String str) {
        try {
            return str.startsWith("~") ? str.replace("~", System.getProperty("user.home")) : str;
        } catch (SecurityException unused) {
            return str;
        }
    }

    public static Socket createSocket(final String str, final int i, int i2) throws JSchException {
        String str2;
        if (i2 == 0) {
            try {
                return new Socket(str, i);
            } catch (Exception e) {
                throw new JSchException(e.toString(), e);
            }
        }
        final Socket[] socketArr = new Socket[1];
        final Exception[] excArr = new Exception[1];
        Thread thread = new Thread(new Runnable() { // from class: com.jcraft.jsch.Util.1
            @Override // java.lang.Runnable
            public void run() {
                Socket[] socketArr2 = socketArr;
                socketArr2[0] = null;
                try {
                    socketArr2[0] = new Socket(str, i);
                } catch (Exception e2) {
                    excArr[0] = e2;
                    Socket socket = socketArr[0];
                    if (socket != null && socket.isConnected()) {
                        try {
                            socketArr[0].close();
                        } catch (Exception unused) {
                        }
                    }
                    socketArr[0] = null;
                }
            }
        });
        thread.setName("Opening Socket " + str);
        thread.start();
        try {
            thread.join(i2);
            str2 = "timeout: ";
        } catch (InterruptedException unused) {
            str2 = "";
        }
        Socket socket = socketArr[0];
        if (socket != null && socket.isConnected()) {
            return socketArr[0];
        }
        String strConcat = str2.concat("socket is not established");
        Exception exc = excArr[0];
        if (exc != null) {
            strConcat = exc.toString();
        }
        thread.interrupt();
        throw new JSchException(strConcat, excArr[0]);
    }

    public static String diffString(String str, String[] strArr) {
        String[] strArrSplit = split(str, ",");
        String str2 = null;
        for (int i = 0; i < strArrSplit.length; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= strArr.length) {
                    if (str2 != null) {
                        str2 = str2 + "," + strArrSplit[i];
                        break;
                    }
                    str2 = strArrSplit[i];
                    break;
                }
                if (strArrSplit[i].equals(strArr[i2])) {
                    break;
                }
                i2++;
            }
        }
        return str2;
    }

    public static byte[] fromBase64(byte[] bArr, int i, int i2) throws JSchException {
        try {
            byte[] bArr2 = new byte[i2];
            int i3 = 0;
            for (int i4 = i; i4 < i + i2; i4 += 4) {
                int i5 = i4 + 1;
                bArr2[i3] = (byte) ((val(bArr[i4]) << 2) | ((val(bArr[i5]) & 48) >>> 4));
                int i6 = i4 + 2;
                if (bArr[i6] == 61) {
                    i3++;
                    break;
                }
                bArr2[i3 + 1] = (byte) (((val(bArr[i5]) & 15) << 4) | ((val(bArr[i6]) & 60) >>> 2));
                int i7 = i4 + 3;
                if (bArr[i7] == 61) {
                    i3 += 2;
                    break;
                }
                bArr2[i3 + 2] = (byte) (((val(bArr[i6]) & 3) << 6) | (val(bArr[i7]) & 63));
                i3 += 3;
            }
            byte[] bArr3 = new byte[i3];
            System.arraycopy(bArr2, 0, bArr3, 0, i3);
            return bArr3;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new JSchException("fromBase64: invalid base64 data", e);
        }
    }

    public static byte[] fromFile(String str) throws IOException {
        String strCheckTilde = checkTilde(str);
        File file = new File(strCheckTilde);
        FileInputStream fileInputStream = new FileInputStream(strCheckTilde);
        try {
            int length = (int) file.length();
            byte[] bArr = new byte[length];
            int i = 0;
            while (true) {
                int i2 = fileInputStream.read(bArr, i, length - i);
                if (i2 <= 0) {
                    fileInputStream.close();
                    return bArr;
                }
                i += i2;
            }
        } finally {
            fileInputStream.close();
        }
    }

    public static String getFingerPrint(HASH hash, byte[] bArr) {
        try {
            hash.init();
            int i = 0;
            hash.update(bArr, 0, bArr.length);
            byte[] bArrDigest = hash.digest();
            StringBuffer stringBuffer = new StringBuffer();
            while (i < bArrDigest.length) {
                byte b = bArrDigest[i];
                stringBuffer.append(chars[((b & 255) >>> 4) & 15]);
                stringBuffer.append(chars[b & 15]);
                i++;
                if (i < bArrDigest.length) {
                    stringBuffer.append(":");
                }
            }
            return stringBuffer.toString();
        } catch (Exception unused) {
            return "???";
        }
    }

    public static boolean glob(byte[] bArr, byte[] bArr2) {
        return glob0(bArr, 0, bArr2, 0);
    }

    private static boolean glob0(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (bArr2.length <= 0 || bArr2[0] != 46) {
            return glob(bArr, i, bArr2, i2);
        }
        if (bArr.length <= 0 || bArr[0] != 46) {
            return false;
        }
        if (bArr.length == 2 && bArr[1] == 42) {
            return true;
        }
        return glob(bArr, i + 1, bArr2, i2 + 1);
    }

    public static String quote(String str) {
        byte[] bArrStr2byte = str2byte(str);
        int i = 0;
        int i2 = 0;
        for (byte b : bArrStr2byte) {
            if (b == 92 || b == 63 || b == 42) {
                i2++;
            }
        }
        if (i2 == 0) {
            return str;
        }
        byte[] bArr = new byte[bArrStr2byte.length + i2];
        int i3 = 0;
        while (i < bArrStr2byte.length) {
            byte b2 = bArrStr2byte[i];
            if (b2 == 92 || b2 == 63 || b2 == 42) {
                bArr[i3] = 92;
                i3++;
            }
            bArr[i3] = b2;
            i++;
            i3++;
        }
        return byte2str(bArr);
    }

    private static int skipUTF8Char(byte b) {
        if (((byte) (b & 128)) == 0) {
            return 1;
        }
        if (((byte) (b & 224)) == -64) {
            return 2;
        }
        return ((byte) (b & 240)) == -32 ? 3 : 1;
    }

    public static String[] split(String str, String str2) {
        if (str == null) {
            return null;
        }
        byte[] bArrStr2byte = str2byte(str);
        Vector vector = new Vector();
        int i = 0;
        while (true) {
            int iIndexOf = str.indexOf(str2, i);
            if (iIndexOf < 0) {
                break;
            }
            vector.addElement(byte2str(bArrStr2byte, i, iIndexOf - i));
            i = iIndexOf + 1;
        }
        vector.addElement(byte2str(bArrStr2byte, i, bArrStr2byte.length - i));
        int size = vector.size();
        String[] strArr = new String[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = (String) vector.elementAt(i2);
        }
        return strArr;
    }

    public static byte[] str2byte(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes(str2);
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes();
        }
    }

    public static byte[] toBase64(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2 * 2];
        int i3 = ((i2 / 3) * 3) + i;
        int i4 = i;
        int i5 = 0;
        while (i4 < i3) {
            int i6 = (bArr[i4] >>> 2) & 63;
            byte[] bArr3 = b64;
            bArr2[i5] = bArr3[i6];
            int i7 = i4 + 1;
            bArr2[i5 + 1] = bArr3[((bArr[i4] & 3) << 4) | ((bArr[i7] >>> 4) & 15)];
            int i8 = i4 + 2;
            int i9 = i5 + 3;
            bArr2[i5 + 2] = bArr3[((bArr[i7] & 15) << 2) | ((bArr[i8] >>> 6) & 3)];
            i5 += 4;
            bArr2[i9] = bArr3[bArr[i8] & 63];
            i4 += 3;
        }
        int i10 = (i + i2) - i3;
        if (i10 == 1) {
            int i11 = (bArr[i4] >>> 2) & 63;
            byte[] bArr4 = b64;
            bArr2[i5] = bArr4[i11];
            bArr2[i5 + 1] = bArr4[((bArr[i4] & 3) << 4) & 63];
            int i12 = i5 + 3;
            bArr2[i5 + 2] = 61;
            i5 += 4;
            bArr2[i12] = 61;
        } else if (i10 == 2) {
            int i13 = (bArr[i4] >>> 2) & 63;
            byte[] bArr5 = b64;
            bArr2[i5] = bArr5[i13];
            int i14 = (bArr[i4] & 3) << 4;
            int i15 = i4 + 1;
            bArr2[i5 + 1] = bArr5[i14 | ((bArr[i15] >>> 4) & 15)];
            int i16 = i5 + 3;
            bArr2[i5 + 2] = bArr5[((bArr[i15] & 15) << 2) & 63];
            i5 += 4;
            bArr2[i16] = 61;
        }
        byte[] bArr6 = new byte[i5];
        System.arraycopy(bArr2, 0, bArr6, 0, i5);
        return bArr6;
    }

    public static String toHex(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while (i < bArr.length) {
            String hexString = Integer.toHexString(bArr[i] & 255);
            StringBuilder sb = new StringBuilder("0x");
            sb.append(hexString.length() == 1 ? "0" : "");
            sb.append(hexString);
            stringBuffer.append(sb.toString());
            i++;
            if (i < bArr.length) {
                stringBuffer.append(":");
            }
        }
        return stringBuffer.toString();
    }

    public static String unquote(String str) {
        byte[] bArrStr2byte = str2byte(str);
        byte[] bArrUnquote = unquote(bArrStr2byte);
        return bArrStr2byte.length == bArrUnquote.length ? str : byte2str(bArrUnquote);
    }

    private static byte val(byte b) {
        if (b == 61) {
            return (byte) 0;
        }
        int i = 0;
        while (true) {
            byte[] bArr = b64;
            if (i >= bArr.length) {
                return (byte) 0;
            }
            if (b == bArr[i]) {
                return (byte) i;
            }
            i++;
        }
    }

    public static String byte2str(byte[] bArr, int i, int i2, String str) {
        try {
            return new String(bArr, i, i2, str);
        } catch (UnsupportedEncodingException unused) {
            return new String(bArr, i, i2);
        }
    }

    private static boolean glob(byte[] bArr, int i, byte[] bArr2, int i2) {
        byte b;
        int iSkipUTF8Char;
        int length = bArr.length;
        if (length == 0) {
            return false;
        }
        int length2 = bArr2.length;
        while (i < length && i2 < length2) {
            byte b2 = bArr[i];
            if (b2 == 92) {
                int i3 = i + 1;
                if (i3 == length || (b = bArr[i3]) != bArr2[i2]) {
                    return false;
                }
                i = i3 + skipUTF8Char(b);
                iSkipUTF8Char = skipUTF8Char(bArr2[i2]);
            } else {
                if (b2 == 42) {
                    while (i < length && bArr[i] == 42) {
                        i++;
                    }
                    if (length == i) {
                        return true;
                    }
                    byte b3 = bArr[i];
                    if (b3 == 63) {
                        while (i2 < length2) {
                            if (glob(bArr, i, bArr2, i2)) {
                                return true;
                            }
                            i2 += skipUTF8Char(bArr2[i2]);
                        }
                        return false;
                    }
                    if (b3 != 92) {
                        while (i2 < length2) {
                            if (b3 == bArr2[i2] && glob(bArr, i, bArr2, i2)) {
                                return true;
                            }
                            i2 += skipUTF8Char(bArr2[i2]);
                        }
                        return false;
                    }
                    int i4 = i + 1;
                    if (i4 == length) {
                        return false;
                    }
                    byte b4 = bArr[i4];
                    while (i2 < length2) {
                        if (b4 == bArr2[i2] && glob(bArr, skipUTF8Char(b4) + i4, bArr2, skipUTF8Char(bArr2[i2]) + i2)) {
                            return true;
                        }
                        i2 += skipUTF8Char(bArr2[i2]);
                    }
                    return false;
                }
                if (b2 == 63) {
                    i++;
                    iSkipUTF8Char = skipUTF8Char(bArr2[i2]);
                } else {
                    if (b2 != bArr2[i2]) {
                        return false;
                    }
                    i += skipUTF8Char(b2);
                    i2 += skipUTF8Char(bArr2[i2]);
                    if (i2 < length2) {
                        continue;
                    } else {
                        if (i >= length) {
                            return true;
                        }
                        if (bArr[i] == 42) {
                            break;
                        }
                    }
                }
            }
            i2 += iSkipUTF8Char;
        }
        if (i == length && i2 == length2) {
            return true;
        }
        if (i2 < length2 || bArr[i] != 42) {
            return false;
        }
        while (i < length) {
            int i5 = i + 1;
            if (bArr[i] != 42) {
                return false;
            }
            i = i5;
        }
        return true;
    }

    public static byte[] str2byte(String str) {
        return str2byte(str, "UTF-8");
    }

    public static String byte2str(byte[] bArr) {
        return byte2str(bArr, 0, bArr.length, "UTF-8");
    }

    public static String byte2str(byte[] bArr, int i, int i2) {
        return byte2str(bArr, i, i2, "UTF-8");
    }

    public static byte[] unquote(byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            if (bArr[i] == 92) {
                int i2 = i + 1;
                if (i2 == length) {
                    break;
                }
                System.arraycopy(bArr, i2, bArr, i, bArr.length - i2);
                length--;
                i = i2;
            } else {
                i++;
            }
        }
        if (length == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }
}
