package com.jcraft.jsch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Vector;

/* JADX INFO: loaded from: classes.dex */
public class KnownHosts implements HostKeyRepository {
    private static final String _known_hosts = "known_hosts";
    private MAC hmacsha1;
    private JSch jsch;
    private String known_hosts = null;
    private Vector pool;
    private static final byte[] space = {32};
    private static final byte[] cr = Util.str2byte("\n");

    public class HashedHostKey extends HostKey {
        private static final String HASH_DELIM = "|";
        private static final String HASH_MAGIC = "|1|";
        byte[] hash;
        private boolean hashed;
        byte[] salt;

        public HashedHostKey(KnownHosts knownHosts, String str, byte[] bArr) {
            this(knownHosts, str, 0, bArr);
        }

        public void hash() {
            if (this.hashed) {
                return;
            }
            MAC hmacsha1 = KnownHosts.this.getHMACSHA1();
            if (this.salt == null) {
                Random random = Session.random;
                synchronized (random) {
                    byte[] bArr = new byte[hmacsha1.getBlockSize()];
                    this.salt = bArr;
                    random.fill(bArr, 0, bArr.length);
                }
            }
            try {
                synchronized (hmacsha1) {
                    hmacsha1.init(this.salt);
                    byte[] bArrStr2byte = Util.str2byte(this.host);
                    hmacsha1.update(bArrStr2byte, 0, bArrStr2byte.length);
                    byte[] bArr2 = new byte[hmacsha1.getBlockSize()];
                    this.hash = bArr2;
                    hmacsha1.doFinal(bArr2, 0);
                }
            } catch (Exception unused) {
            }
            StringBuilder sb = new StringBuilder(HASH_MAGIC);
            byte[] bArr3 = this.salt;
            sb.append(Util.byte2str(Util.toBase64(bArr3, 0, bArr3.length)));
            sb.append(HASH_DELIM);
            byte[] bArr4 = this.hash;
            sb.append(Util.byte2str(Util.toBase64(bArr4, 0, bArr4.length)));
            this.host = sb.toString();
            this.hashed = true;
        }

        public boolean isHashed() {
            return this.hashed;
        }

        @Override // com.jcraft.jsch.HostKey
        public boolean isMatched(String str) {
            boolean zArray_equals;
            if (!this.hashed) {
                return super.isMatched(str);
            }
            MAC hmacsha1 = KnownHosts.this.getHMACSHA1();
            try {
                synchronized (hmacsha1) {
                    hmacsha1.init(this.salt);
                    byte[] bArrStr2byte = Util.str2byte(str);
                    hmacsha1.update(bArrStr2byte, 0, bArrStr2byte.length);
                    byte[] bArr = new byte[hmacsha1.getBlockSize()];
                    hmacsha1.doFinal(bArr, 0);
                    zArray_equals = Util.array_equals(this.hash, bArr);
                }
                return zArray_equals;
            } catch (Exception e) {
                System.out.println(e);
                return false;
            }
        }

        public HashedHostKey(KnownHosts knownHosts, String str, int i, byte[] bArr) {
            this("", str, i, bArr, null);
        }

        public HashedHostKey(String str, String str2, int i, byte[] bArr, String str3) throws JSchException {
            super(str, str2, i, bArr, str3);
            this.hashed = false;
            this.salt = null;
            this.hash = null;
            if (!this.host.startsWith(HASH_MAGIC) || this.host.substring(3).indexOf(HASH_DELIM) <= 0) {
                return;
            }
            String strSubstring = this.host.substring(3);
            String strSubstring2 = strSubstring.substring(0, strSubstring.indexOf(HASH_DELIM));
            String strSubstring3 = strSubstring.substring(strSubstring.indexOf(HASH_DELIM) + 1);
            this.salt = Util.fromBase64(Util.str2byte(strSubstring2), 0, strSubstring2.length());
            byte[] bArrFromBase64 = Util.fromBase64(Util.str2byte(strSubstring3), 0, strSubstring3.length());
            this.hash = bArrFromBase64;
            if (this.salt.length == 20 && bArrFromBase64.length == 20) {
                this.hashed = true;
            } else {
                this.salt = null;
                this.hash = null;
            }
        }
    }

    public KnownHosts(JSch jSch) {
        this.pool = null;
        this.hmacsha1 = null;
        this.jsch = jSch;
        this.hmacsha1 = getHMACSHA1();
        this.pool = new Vector();
    }

    private void addInvalidLine(String str) {
        this.pool.addElement(new HostKey(str, 6, null));
    }

    private String deleteSubString(String str, String str2) {
        int length = str2.length();
        int length2 = str.length();
        int i = 0;
        while (i < length2) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                break;
            }
            if (str2.equals(str.substring(i, iIndexOf))) {
                return str.substring(0, i) + str.substring(iIndexOf + 1);
            }
            i = iIndexOf + 1;
        }
        if (str.endsWith(str2) && length2 - i == length) {
            return str.substring(0, length == length2 ? 0 : (length2 - length) - 1);
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MAC getHMACSHA1() {
        if (this.hmacsha1 == null) {
            try {
                this.hmacsha1 = (MAC) Class.forName(JSch.getConfig("hmac-sha1")).newInstance();
            } catch (Exception e) {
                System.err.println("hmacsha1: " + e);
            }
        }
        return this.hmacsha1;
    }

    @Override // com.jcraft.jsch.HostKeyRepository
    public void add(HostKey hostKey, UserInfo userInfo) {
        boolean z;
        int i = hostKey.type;
        String host = hostKey.getHost();
        synchronized (this.pool) {
            z = false;
            for (int i2 = 0; i2 < this.pool.size(); i2++) {
                try {
                    ((HostKey) this.pool.elementAt(i2)).isMatched(host);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.pool.addElement(hostKey);
        String knownHostsRepositoryID = getKnownHostsRepositoryID();
        if (knownHostsRepositoryID != null) {
            File file = new File(Util.checkTilde(knownHostsRepositoryID));
            if (file.exists()) {
                z = true;
            } else if (userInfo != null) {
                boolean zPromptYesNo = userInfo.promptYesNo(knownHostsRepositoryID.concat(" does not exist.\nAre you sure you want to create it?"));
                File parentFile = file.getParentFile();
                if (zPromptYesNo && parentFile != null && !parentFile.exists()) {
                    zPromptYesNo = userInfo.promptYesNo("The parent directory " + parentFile + " does not exist.\nAre you sure you want to create it?");
                    if (zPromptYesNo) {
                        if (parentFile.mkdirs()) {
                            userInfo.showMessage(parentFile + " has been succesfully created.\nPlease check its access permission.");
                        } else {
                            userInfo.showMessage(parentFile + " has not been created.");
                            zPromptYesNo = false;
                        }
                    }
                }
                if (parentFile != null) {
                    z = zPromptYesNo;
                }
            }
            if (z) {
                try {
                    sync(knownHostsRepositoryID);
                } catch (Exception e) {
                    System.err.println("sync known_hosts: " + e);
                }
            }
        }
    }

    @Override // com.jcraft.jsch.HostKeyRepository
    public int check(String str, byte[] bArr) {
        if (str == null) {
            return 1;
        }
        try {
            HostKey hostKey = new HostKey(str, 0, bArr);
            synchronized (this.pool) {
                int i = 1;
                for (int i2 = 0; i2 < this.pool.size(); i2++) {
                    try {
                        HostKey hostKey2 = (HostKey) this.pool.elementAt(i2);
                        if (hostKey2.isMatched(str) && hostKey2.type == hostKey.type) {
                            if (Util.array_equals(hostKey2.key, bArr)) {
                                return 0;
                            }
                            i = 2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return (i == 1 && str.startsWith("[") && str.indexOf("]:") > 1) ? check(str.substring(1, str.indexOf("]:")), bArr) : i;
            }
        } catch (JSchException unused) {
            return 1;
        }
    }

    public HostKey createHashedHostKey(String str, byte[] bArr) {
        HashedHostKey hashedHostKey = new HashedHostKey(this, str, bArr);
        hashedHostKey.hash();
        return hashedHostKey;
    }

    public void dump(OutputStream outputStream) {
        try {
            synchronized (this.pool) {
                for (int i = 0; i < this.pool.size(); i++) {
                    try {
                        HostKey hostKey = (HostKey) this.pool.elementAt(i);
                        String marker = hostKey.getMarker();
                        String host = hostKey.getHost();
                        String type = hostKey.getType();
                        String comment = hostKey.getComment();
                        if (type.equals("UNKNOWN")) {
                            outputStream.write(Util.str2byte(host));
                            outputStream.write(cr);
                        } else {
                            if (marker.length() != 0) {
                                outputStream.write(Util.str2byte(marker));
                                outputStream.write(space);
                            }
                            outputStream.write(Util.str2byte(host));
                            byte[] bArr = space;
                            outputStream.write(bArr);
                            outputStream.write(Util.str2byte(type));
                            outputStream.write(bArr);
                            outputStream.write(Util.str2byte(hostKey.getKey()));
                            if (comment != null) {
                                outputStream.write(bArr);
                                outputStream.write(Util.str2byte(comment));
                            }
                            outputStream.write(cr);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    @Override // com.jcraft.jsch.HostKeyRepository
    public HostKey[] getHostKey() {
        return getHostKey(null, null);
    }

    public String getKnownHostsFile() {
        return this.known_hosts;
    }

    @Override // com.jcraft.jsch.HostKeyRepository
    public String getKnownHostsRepositoryID() {
        return this.known_hosts;
    }

    @Override // com.jcraft.jsch.HostKeyRepository
    public void remove(String str, String str2) {
        remove(str, str2, null);
    }

    public void setKnownHosts(String str) throws JSchException {
        try {
            this.known_hosts = str;
            setKnownHosts(new FileInputStream(Util.checkTilde(str)));
        } catch (FileNotFoundException unused) {
        }
    }

    public void sync() {
        String str = this.known_hosts;
        if (str != null) {
            sync(str);
        }
    }

    @Override // com.jcraft.jsch.HostKeyRepository
    public HostKey[] getHostKey(String str, String str2) {
        HostKey[] hostKeyArr;
        synchronized (this.pool) {
            try {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < this.pool.size(); i++) {
                    HostKey hostKey = (HostKey) this.pool.elementAt(i);
                    if (hostKey.type != 6 && (str == null || (hostKey.isMatched(str) && (str2 == null || hostKey.getType().equals(str2))))) {
                        arrayList.add(hostKey);
                    }
                }
                int size = arrayList.size();
                hostKeyArr = new HostKey[size];
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    hostKeyArr[i2] = (HostKey) arrayList.get(i2);
                }
                if (str != null && str.startsWith("[") && str.indexOf("]:") > 1) {
                    HostKey[] hostKey2 = getHostKey(str.substring(1, str.indexOf("]:")), str2);
                    if (hostKey2.length > 0) {
                        HostKey[] hostKeyArr2 = new HostKey[hostKey2.length + size];
                        System.arraycopy(hostKeyArr, 0, hostKeyArr2, 0, size);
                        System.arraycopy(hostKey2, 0, hostKeyArr2, size, hostKey2.length);
                        hostKeyArr = hostKeyArr2;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hostKeyArr;
    }

    @Override // com.jcraft.jsch.HostKeyRepository
    public void remove(String str, String str2, byte[] bArr) {
        boolean z;
        synchronized (this.pool) {
            z = false;
            for (int i = 0; i < this.pool.size(); i++) {
                try {
                    HostKey hostKey = (HostKey) this.pool.elementAt(i);
                    if (str == null || (hostKey.isMatched(str) && (str2 == null || (hostKey.getType().equals(str2) && (bArr == null || Util.array_equals(bArr, hostKey.key)))))) {
                        String host = hostKey.getHost();
                        if (host.equals(str) || ((hostKey instanceof HashedHostKey) && ((HashedHostKey) hostKey).isHashed())) {
                            this.pool.removeElement(hostKey);
                        } else {
                            hostKey.host = deleteSubString(host, str);
                        }
                        z = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (z) {
            try {
                sync();
            } catch (Exception unused) {
            }
        }
    }

    public synchronized void sync(String str) {
        if (str == null) {
            return;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(Util.checkTilde(str));
        dump(fileOutputStream);
        fileOutputStream.close();
    }

    public void setKnownHosts(InputStream inputStream) throws JSchException {
        int iName2type;
        String string;
        String string2;
        this.pool.removeAllElements();
        StringBuffer stringBuffer = new StringBuffer();
        try {
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    byte[] bArr2 = bArr;
                    int i = 0;
                    while (true) {
                        int i2 = inputStream.read();
                        iName2type = -1;
                        if (i2 == -1) {
                            if (i != 0) {
                                break;
                            }
                            try {
                                inputStream.close();
                                return;
                            } catch (IOException e) {
                                throw new JSchException(e.toString(), e);
                            }
                        }
                        if (i2 != 13) {
                            if (i2 == 10) {
                                break;
                            }
                            if (bArr2.length <= i) {
                                if (i > 10240) {
                                    break;
                                }
                                byte[] bArr3 = new byte[bArr2.length * 2];
                                System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
                                bArr2 = bArr3;
                            }
                            int i3 = i + 1;
                            bArr2[i] = (byte) i2;
                            i = i3;
                        }
                    }
                    int i4 = 0;
                    while (true) {
                        if (i4 < i) {
                            byte b = bArr2[i4];
                            if (b != 32 && b != 9) {
                                if (b == 35) {
                                    addInvalidLine(Util.byte2str(bArr2, 0, i));
                                }
                                bArr = bArr2;
                            }
                            i4++;
                        }
                        if (i4 >= i) {
                            addInvalidLine(Util.byte2str(bArr2, 0, i));
                        } else {
                            stringBuffer.setLength(0);
                            while (i4 < i) {
                                int i5 = i4 + 1;
                                byte b2 = bArr2[i4];
                                if (b2 != 32 && b2 != 9) {
                                    stringBuffer.append((char) b2);
                                    i4 = i5;
                                }
                                i4 = i5;
                                break;
                            }
                            String string3 = stringBuffer.toString();
                            if (i4 < i && string3.length() != 0) {
                                while (i4 < i) {
                                    byte b3 = bArr2[i4];
                                    if (b3 != 32 && b3 != 9) {
                                        break;
                                    } else {
                                        i4++;
                                    }
                                }
                                if (string3.charAt(0) != '@') {
                                    string = string3;
                                    string3 = "";
                                } else {
                                    stringBuffer.setLength(0);
                                    while (i4 < i) {
                                        int i6 = i4 + 1;
                                        byte b4 = bArr2[i4];
                                        if (b4 != 32 && b4 != 9) {
                                            stringBuffer.append((char) b4);
                                            i4 = i6;
                                        }
                                        i4 = i6;
                                        break;
                                    }
                                    string = stringBuffer.toString();
                                    if (i4 < i && string.length() != 0) {
                                        while (i4 < i) {
                                            byte b5 = bArr2[i4];
                                            if (b5 != 32 && b5 != 9) {
                                                break;
                                            } else {
                                                i4++;
                                            }
                                        }
                                    } else {
                                        addInvalidLine(Util.byte2str(bArr2, 0, i));
                                    }
                                }
                                stringBuffer.setLength(0);
                                while (i4 < i) {
                                    int i7 = i4 + 1;
                                    byte b6 = bArr2[i4];
                                    if (b6 != 32 && b6 != 9) {
                                        stringBuffer.append((char) b6);
                                        i4 = i7;
                                    }
                                    i4 = i7;
                                    break;
                                }
                                String string4 = stringBuffer.toString();
                                if (HostKey.name2type(string4) != 6) {
                                    iName2type = HostKey.name2type(string4);
                                } else {
                                    i4 = i;
                                }
                                int i8 = iName2type;
                                if (i4 >= i) {
                                    addInvalidLine(Util.byte2str(bArr2, 0, i));
                                } else {
                                    while (i4 < i) {
                                        byte b7 = bArr2[i4];
                                        if (b7 != 32 && b7 != 9) {
                                            break;
                                        } else {
                                            i4++;
                                        }
                                    }
                                    stringBuffer.setLength(0);
                                    while (i4 < i) {
                                        int i9 = i4 + 1;
                                        byte b8 = bArr2[i4];
                                        if (b8 != 13) {
                                            if (b8 != 10 && b8 != 32 && b8 != 9) {
                                                stringBuffer.append((char) b8);
                                            }
                                            i4 = i9;
                                            break;
                                        }
                                        i4 = i9;
                                    }
                                    String string5 = stringBuffer.toString();
                                    if (string5.length() == 0) {
                                        addInvalidLine(Util.byte2str(bArr2, 0, i));
                                    } else {
                                        while (i4 < i) {
                                            byte b9 = bArr2[i4];
                                            if (b9 != 32 && b9 != 9) {
                                                break;
                                            } else {
                                                i4++;
                                            }
                                        }
                                        if (i4 < i) {
                                            stringBuffer.setLength(0);
                                            while (i4 < i) {
                                                int i10 = i4 + 1;
                                                byte b10 = bArr2[i4];
                                                if (b10 != 13) {
                                                    if (b10 == 10) {
                                                        break;
                                                    } else {
                                                        stringBuffer.append((char) b10);
                                                    }
                                                }
                                                i4 = i10;
                                            }
                                            string2 = stringBuffer.toString();
                                        } else {
                                            string2 = null;
                                        }
                                        this.pool.addElement(new HashedHostKey(string3, string, i8, Util.fromBase64(Util.str2byte(string5), 0, string5.length()), string2));
                                    }
                                }
                            } else {
                                addInvalidLine(Util.byte2str(bArr2, 0, i));
                            }
                        }
                        bArr = bArr2;
                    }
                }
            } catch (Exception e2) {
                if (!(e2 instanceof JSchException)) {
                    throw new JSchException(e2.toString(), e2);
                }
                throw ((JSchException) e2);
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
                throw th;
            } catch (IOException e3) {
                throw new JSchException(e3.toString(), e3);
            }
        }
    }
}
