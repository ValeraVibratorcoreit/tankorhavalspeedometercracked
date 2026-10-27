package com.jcraft.jsch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Hashtable;
import java.util.Vector;

/* JADX INFO: loaded from: classes.dex */
public class OpenSSHConfig implements ConfigRepository {
    private static final Hashtable keymap;
    private final Hashtable config = new Hashtable();
    private final Vector hosts = new Vector();

    public class MyConfig implements ConfigRepository.Config {
        private Vector _configs;
        private String host;

        public MyConfig(String str) {
            boolean z;
            Vector vector = new Vector();
            this._configs = vector;
            this.host = str;
            vector.addElement(OpenSSHConfig.this.config.get(""));
            byte[] bArrStr2byte = Util.str2byte(str);
            if (OpenSSHConfig.this.hosts.size() > 1) {
                for (int i = 1; i < OpenSSHConfig.this.hosts.size(); i++) {
                    for (String str2 : ((String) OpenSSHConfig.this.hosts.elementAt(i)).split("[ \t]")) {
                        String strTrim = str2.trim();
                        if (strTrim.startsWith("!")) {
                            strTrim = strTrim.substring(1).trim();
                            z = true;
                        } else {
                            z = false;
                        }
                        if (Util.glob(Util.str2byte(strTrim), bArrStr2byte)) {
                            if (!z) {
                                this._configs.addElement(OpenSSHConfig.this.config.get((String) OpenSSHConfig.this.hosts.elementAt(i)));
                            }
                        } else if (z) {
                            this._configs.addElement(OpenSSHConfig.this.config.get((String) OpenSSHConfig.this.hosts.elementAt(i)));
                        }
                    }
                }
            }
        }

        private String find(String str) {
            if (OpenSSHConfig.keymap.get(str) != null) {
                str = (String) OpenSSHConfig.keymap.get(str);
            }
            String upperCase = str.toUpperCase();
            String str2 = null;
            for (int i = 0; i < this._configs.size(); i++) {
                Vector vector = (Vector) this._configs.elementAt(i);
                for (int i2 = 0; i2 < vector.size(); i2++) {
                    String[] strArr = (String[]) vector.elementAt(i2);
                    if (strArr[0].toUpperCase().equals(upperCase)) {
                        str2 = strArr[1];
                        break;
                    }
                }
                if (str2 != null) {
                    break;
                }
            }
            return str2;
        }

        private String[] multiFind(String str) {
            String str2;
            String upperCase = str.toUpperCase();
            Vector vector = new Vector();
            for (int i = 0; i < this._configs.size(); i++) {
                Vector vector2 = (Vector) this._configs.elementAt(i);
                for (int i2 = 0; i2 < vector2.size(); i2++) {
                    String[] strArr = (String[]) vector2.elementAt(i2);
                    if (strArr[0].toUpperCase().equals(upperCase) && (str2 = strArr[1]) != null) {
                        vector.remove(str2);
                        vector.addElement(str2);
                    }
                }
            }
            String[] strArr2 = new String[vector.size()];
            vector.toArray(strArr2);
            return strArr2;
        }

        @Override // com.jcraft.jsch.ConfigRepository.Config
        public String getHostname() {
            return find("Hostname");
        }

        @Override // com.jcraft.jsch.ConfigRepository.Config
        public int getPort() {
            try {
                return Integer.parseInt(find("Port"));
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        @Override // com.jcraft.jsch.ConfigRepository.Config
        public String getUser() {
            return find("User");
        }

        @Override // com.jcraft.jsch.ConfigRepository.Config
        public String getValue(String str) {
            if (!str.equals("compression.s2c") && !str.equals("compression.c2s")) {
                return find(str);
            }
            String strFind = find(str);
            return (strFind == null || strFind.equals("no")) ? "none,zlib@openssh.com,zlib" : "zlib@openssh.com,zlib,none";
        }

        @Override // com.jcraft.jsch.ConfigRepository.Config
        public String[] getValues(String str) {
            return multiFind(str);
        }
    }

    static {
        Hashtable hashtable = new Hashtable();
        keymap = hashtable;
        hashtable.put("kex", "KexAlgorithms");
        hashtable.put("server_host_key", "HostKeyAlgorithms");
        hashtable.put("cipher.c2s", "Ciphers");
        hashtable.put("cipher.s2c", "Ciphers");
        hashtable.put("mac.c2s", "Macs");
        hashtable.put("mac.s2c", "Macs");
        hashtable.put("compression.s2c", "Compression");
        hashtable.put("compression.c2s", "Compression");
        hashtable.put("compression_level", "CompressionLevel");
        hashtable.put("MaxAuthTries", "NumberOfPasswordPrompts");
    }

    public OpenSSHConfig(Reader reader) throws IOException {
        _parse(reader);
    }

    private void _parse(Reader reader) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(reader);
        Vector vector = new Vector();
        String str = "";
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                this.config.put(str, vector);
                this.hosts.addElement(str);
                return;
            }
            String strTrim = line.trim();
            if (strTrim.length() != 0 && !strTrim.startsWith("#")) {
                String[] strArrSplit = strTrim.split("[= \t]", 2);
                for (int i = 0; i < strArrSplit.length; i++) {
                    strArrSplit[i] = strArrSplit[i].trim();
                }
                if (strArrSplit.length > 1) {
                    if (strArrSplit[0].equals("Host")) {
                        this.config.put(str, vector);
                        this.hosts.addElement(str);
                        str = strArrSplit[1];
                        vector = new Vector();
                    } else {
                        vector.addElement(strArrSplit);
                    }
                }
            }
        }
    }

    public static OpenSSHConfig parse(String str) throws IOException {
        StringReader stringReader = new StringReader(str);
        try {
            return new OpenSSHConfig(stringReader);
        } finally {
            stringReader.close();
        }
    }

    public static OpenSSHConfig parseFile(String str) throws IOException {
        FileReader fileReader = new FileReader(Util.checkTilde(str));
        try {
            return new OpenSSHConfig(fileReader);
        } finally {
            fileReader.close();
        }
    }

    @Override // com.jcraft.jsch.ConfigRepository
    public ConfigRepository.Config getConfig(String str) {
        return new MyConfig(str);
    }
}
