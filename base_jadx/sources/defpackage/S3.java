package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Environment;
import android.preference.PreferenceManager;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class S3 implements Yi, InterfaceC0751ya, InterfaceC0015ae {
    public final /* synthetic */ int a;
    public Context b;

    public static void b(File file, String str, ZipOutputStream zipOutputStream) throws IOException {
        byte[] bArr = new byte[8192];
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 8192);
            try {
                zipOutputStream.putNextEntry(new ZipEntry(str));
                while (true) {
                    int i = bufferedInputStream.read(bArr, 0, 8192);
                    if (i == -1) {
                        zipOutputStream.closeEntry();
                        C0768yr.e("BackupRestoreUtility", "Added to backup: " + str);
                        bufferedInputStream.close();
                        fileInputStream.close();
                        return;
                    }
                    zipOutputStream.write(bArr, 0, i);
                    try {
                        fileInputStream.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            fileInputStream.close();
            throw th4;
        }
    }

    public static void c(File file, String str, ZipOutputStream zipOutputStream) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (!file2.getName().startsWith(".")) {
                String str2 = str + "/" + file2.getName();
                if (file2.isDirectory()) {
                    c(file2, str2, zipOutputStream);
                } else {
                    b(file2, str2, zipOutputStream);
                }
            }
        }
    }

    public static String k() {
        return "ts_backup_" + new SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault()).format(new Date()) + ".appbackup";
    }

    public static boolean m(File file) {
        if (!file.exists()) {
            C0768yr.e("BackupRestoreUtility", "Invalid: file does not exist at " + file.getAbsolutePath());
            return false;
        }
        if (!file.isFile()) {
            C0768yr.e("BackupRestoreUtility", "Invalid: not a file (might be a directory)");
            return false;
        }
        if (!file.canRead()) {
            C0768yr.e("BackupRestoreUtility", "Invalid: cannot read file");
            return false;
        }
        if (file.length() == 0) {
            C0768yr.e("BackupRestoreUtility", "Invalid: file is empty");
            return false;
        }
        if (!file.getName().endsWith(".appbackup")) {
            C0768yr.e("BackupRestoreUtility", "Invalid: wrong extension - " + file.getName());
            return false;
        }
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file));
            int i = 0;
            boolean z = false;
            boolean z2 = false;
            while (true) {
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry == null) {
                        break;
                    }
                    i++;
                    String name = nextEntry.getName();
                    if (name.equals("backup_metadata.json")) {
                        z = true;
                    } else if (name.equals("preferences/default_preferences.json")) {
                        z2 = true;
                    }
                    zipInputStream.closeEntry();
                    if (z && z2) {
                        break;
                    }
                } catch (Throwable th) {
                    try {
                        zipInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            C0768yr.e("BackupRestoreUtility", "Validation: entries=" + i + ", metadata=" + z + ", defaultPrefs=" + z2);
            boolean z3 = z && z2;
            zipInputStream.close();
            return z3;
        } catch (IOException e) {
            C0768yr.c("BackupRestoreUtility", "Error reading backup file during validation", e);
            return false;
        }
    }

    @Override // defpackage.InterfaceC0751ya
    public void a(Ud ud) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new T6("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new B9(this, ud, threadPoolExecutor, 2));
    }

    public void d(ZipOutputStream zipOutputStream) throws IOException {
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.b);
            boolean z = defaultSharedPreferences.getBoolean("pswBackupSwitch", false);
            Map<String, ?> all = defaultSharedPreferences.getAll();
            C0768yr.e("BackupRestoreUtility", "Backing up default preferences, count: " + all.size());
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (key.equals("password") || key.equals("authcode")) {
                    if (z) {
                    }
                }
                if (!key.equals("LALALA") && !key.equals("VERSION")) {
                    try {
                        if (value instanceof Set) {
                            JSONArray jSONArray = new JSONArray();
                            for (Object obj : (Set) value) {
                                if (obj != null) {
                                    jSONArray.put(obj.toString());
                                }
                            }
                            jSONObject.put(key, jSONArray);
                        } else if (value != null) {
                            jSONObject.put(key, value);
                        }
                    } catch (JSONException e) {
                        C0768yr.c("BackupRestoreUtility", "Could not add preference to JSON: " + key + " = " + value, e);
                    }
                }
            }
            String string = jSONObject.toString();
            C0768yr.e("BackupRestoreUtility", "Default preferences JSON size: " + string.length() + " chars");
            zipOutputStream.putNextEntry(new ZipEntry("preferences/default_preferences.json"));
            zipOutputStream.write(string.getBytes("UTF-8"));
            zipOutputStream.closeEntry();
            C0768yr.e("BackupRestoreUtility", "Default preferences backed up successfully");
        } catch (Exception e2) {
            C0768yr.c("BackupRestoreUtility", "Unexpected error while backing up default preferences", e2);
            throw new IOException("Failed to backup default preferences: " + e2.getMessage());
        }
    }

    public void e(ZipOutputStream zipOutputStream) throws IOException {
        File externalFilesDir = this.b.getExternalFilesDir(null);
        if (externalFilesDir == null || !externalFilesDir.exists()) {
            C0768yr.e("BackupRestoreUtility", "External files directory not available");
            return;
        }
        C0768yr.e("BackupRestoreUtility", "Backing up external files from: " + externalFilesDir.getAbsolutePath());
        c(externalFilesDir, "external_files", zipOutputStream);
    }

    public void f(ZipOutputStream zipOutputStream) throws IOException {
        String str;
        Context context = this.b;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", 1);
            jSONObject.put("package_name", context.getPackageName());
            try {
                str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (Exception e) {
                C0768yr.c("BackupRestoreUtility", "Could not get app version", e);
                str = "unknown";
            }
            jSONObject.put("app_version", str);
            jSONObject.put("created_at", new Date().toString());
            jSONObject.put("backup_type", "full");
        } catch (JSONException e2) {
            C0768yr.c("BackupRestoreUtility", "Error creating metadata JSON", e2);
            try {
                jSONObject.put("version", 1);
                jSONObject.put("package_name", context.getPackageName());
                jSONObject.put("created_at", new Date().toString());
            } catch (JSONException e3) {
                C0768yr.c("BackupRestoreUtility", "Failed to create minimal metadata", e3);
            }
        }
        try {
            zipOutputStream.putNextEntry(new ZipEntry("backup_metadata.json"));
            zipOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            zipOutputStream.closeEntry();
            C0768yr.e("BackupRestoreUtility", "Metadata added to backup");
        } catch (IOException e4) {
            C0768yr.c("BackupRestoreUtility", "Failed to write metadata to ZIP", e4);
            throw e4;
        }
    }

    public void g(ZipOutputStream zipOutputStream) {
        Context context = this.b;
        File file = new File(context.getApplicationInfo().dataDir, "shared_prefs");
        if (!file.exists() || !file.isDirectory()) {
            C0768yr.e("BackupRestoreUtility", "No shared_prefs directory found");
            return;
        }
        File[] fileArrListFiles = file.listFiles(new R3(0));
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            C0768yr.e("BackupRestoreUtility", "No named preference files found");
            return;
        }
        C0768yr.e("BackupRestoreUtility", "Found " + fileArrListFiles.length + " named preference files");
        for (File file2 : fileArrListFiles) {
            try {
                String name = file2.getName();
                if (!name.equals(context.getPackageName() + "_preferences.xml") && !name.equals("preferences.xml") && !name.contains("_preferences.xml")) {
                    b(file2, "shared_prefs/" + file2.getName(), zipOutputStream);
                    C0768yr.e("BackupRestoreUtility", "Added named preference file: " + file2.getName());
                }
            } catch (IOException e) {
                C0768yr.c("BackupRestoreUtility", "Failed to backup preference file: " + file2.getName(), e);
            }
        }
    }

    @Override // defpackage.InterfaceC0015ae
    public Object get() {
        return (ConnectivityManager) this.b.getSystemService("connectivity");
    }

    public void h(Object obj) throws IOException {
        switch (this.a) {
            case 1:
                ((AssetFileDescriptor) obj).close();
                break;
            case 2:
                break;
            default:
                ((InputStream) obj).close();
                break;
        }
    }

    public File i(String str) throws IOException {
        if (str == null || str.trim().isEmpty()) {
            str = k();
        } else if (!str.endsWith(".appbackup")) {
            str = str.concat(".appbackup");
        }
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        if (!externalStoragePublicDirectory.exists() && !externalStoragePublicDirectory.mkdirs()) {
            throw new IOException("Cannot create Downloads directory");
        }
        File file = new File(externalStoragePublicDirectory, str);
        C0768yr.e("BackupRestoreUtility", "Creating backup to: " + file.getAbsolutePath());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(fileOutputStream));
                try {
                    try {
                        f(zipOutputStream);
                        try {
                            d(zipOutputStream);
                            try {
                                g(zipOutputStream);
                            } catch (Exception e) {
                                C0768yr.c("BackupRestoreUtility", "Error backing up named preferences", e);
                            }
                            try {
                                e(zipOutputStream);
                            } catch (Exception e2) {
                                C0768yr.c("BackupRestoreUtility", "Error backing up external files", e2);
                            }
                            C0768yr.e("BackupRestoreUtility", "Backup created successfully: " + file.getName());
                            zipOutputStream.close();
                            fileOutputStream.close();
                            return file;
                        } catch (Exception e3) {
                            C0768yr.c("BackupRestoreUtility", "Error backing up default preferences", e3);
                            throw new IOException("Failed to backup preferences: " + e3.getMessage());
                        }
                    } catch (Exception e4) {
                        C0768yr.c("BackupRestoreUtility", "Error backing up metadata", e4);
                        throw new IOException("Failed to create metadata: " + e4.getMessage());
                    }
                } catch (Throwable th) {
                    try {
                        zipOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException e5) {
            C0768yr.c("BackupRestoreUtility", "Backup creation failed", e5);
            if (file.exists()) {
                C0768yr.e("BackupRestoreUtility", "Deleted corrupted backup file: " + file.delete());
            }
            throw e5;
        }
    }

    public File j(Uri uri) throws IOException {
        Context context = this.b;
        ContentResolver contentResolver = context.getContentResolver();
        File file = new File(context.getCacheDir(), "temp_backup_" + System.currentTimeMillis() + ".appbackup");
        try {
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    if (inputStreamOpenInputStream == null) {
                        throw new IOException("Cannot open input stream from URI");
                    }
                    byte[] bArr = new byte[8192];
                    long j = 0;
                    while (true) {
                        int i = inputStreamOpenInputStream.read(bArr);
                        if (i == -1) {
                            C0768yr.e("BackupRestoreUtility", "Copied backup from URI to temp file: " + file.getAbsolutePath() + " (" + j + " bytes)");
                            fileOutputStream.close();
                            inputStreamOpenInputStream.close();
                            return file;
                        }
                        fileOutputStream.write(bArr, 0, i);
                        j += (long) i;
                    }
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (IOException e) {
            C0768yr.c("BackupRestoreUtility", "Error copying file from URI", e);
            throw e;
        }
    }

    public Class l() {
        switch (this.a) {
            case 1:
                return AssetFileDescriptor.class;
            case 2:
                return Drawable.class;
            default:
                return InputStream.class;
        }
    }

    public boolean n(Uri uri) {
        C0768yr.e("BackupRestoreUtility", "Validating backup URI: " + uri);
        File fileJ = null;
        try {
            try {
                fileJ = j(uri);
                boolean zM = m(fileJ);
                C0768yr.e("BackupRestoreUtility", "URI validation result: " + zM);
                if (fileJ.exists()) {
                    C0768yr.e("BackupRestoreUtility", "Cleaned up temp validation file: " + fileJ.delete());
                }
                return zM;
            } catch (IOException e) {
                C0768yr.c("BackupRestoreUtility", "Error validating backup URI", e);
                if (fileJ == null || !fileJ.exists()) {
                    return false;
                }
                C0768yr.e("BackupRestoreUtility", "Cleaned up temp validation file: " + fileJ.delete());
                return false;
            }
        } catch (Throwable th) {
            if (fileJ != null && fileJ.exists()) {
                C0768yr.e("BackupRestoreUtility", "Cleaned up temp validation file: " + fileJ.delete());
            }
            throw th;
        }
    }

    @Override // defpackage.Yi
    public Xi o(C0296jj c0296jj) {
        switch (this.a) {
            case 1:
                return new C0280j3(this.b, this);
            case 2:
                return new C0280j3(this.b, this);
            case 3:
                return new C0280j3(this.b, this);
            case 4:
            default:
                return new C0280j3(this.b, c0296jj.e(Integer.class, InputStream.class));
            case 5:
                return new C0357li(this.b, 0);
            case 6:
                return new C0357li(this.b, 1);
            case 7:
                return new C0357li(this.b, 2);
            case 8:
                return new C0280j3(this.b, c0296jj.e(Integer.class, AssetFileDescriptor.class));
        }
    }

    public Object p(Resources resources, int i, Resources.Theme theme) {
        switch (this.a) {
            case 1:
                return resources.openRawResourceFd(i);
            case 2:
                Context context = this.b;
                return Tf.A(context, context, i, theme);
            default:
                return resources.openRawResource(i);
        }
    }

    public void q(File file) throws IOException {
        if (!m(file)) {
            throw new IllegalArgumentException("Invalid backup file format");
        }
        C0768yr.e("BackupRestoreUtility", "Starting restore from: " + file.getAbsolutePath());
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(fileInputStream));
                while (true) {
                    try {
                        ZipEntry nextEntry = zipInputStream.getNextEntry();
                        if (nextEntry == null) {
                            C0768yr.e("BackupRestoreUtility", "Restore completed successfully");
                            zipInputStream.close();
                            fileInputStream.close();
                            return;
                        }
                        String name = nextEntry.getName();
                        try {
                            if (name.equals("preferences/default_preferences.json")) {
                                s(zipInputStream);
                            } else if (name.startsWith("shared_prefs/") && !nextEntry.isDirectory()) {
                                u(zipInputStream, nextEntry);
                            } else if (name.startsWith("external_files/") && !nextEntry.isDirectory()) {
                                t(zipInputStream, nextEntry);
                            }
                        } catch (Exception e) {
                            C0768yr.c("BackupRestoreUtility", "Error restoring entry: " + name, e);
                        }
                        zipInputStream.closeEntry();
                    } catch (Throwable th) {
                        try {
                            zipInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                fileInputStream.close();
                throw th4;
            }
        } catch (IOException e2) {
            C0768yr.c("BackupRestoreUtility", "Restore failed", e2);
            throw e2;
        }
    }

    public void r(Uri uri) throws IOException {
        File fileJ = j(uri);
        try {
            q(fileJ);
        } finally {
            if (fileJ.exists()) {
                C0768yr.e("BackupRestoreUtility", "Temporary backup file deleted: " + fileJ.delete());
            }
        }
    }

    public void s(ZipInputStream zipInputStream) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int i = zipInputStream.read(bArr);
                if (i == -1) {
                    break;
                } else {
                    byteArrayOutputStream.write(bArr, 0, i);
                }
            }
            String string = byteArrayOutputStream.toString("UTF-8");
            C0768yr.e("BackupRestoreUtility", "Read preferences JSON, length: " + string.length());
            JSONObject jSONObject = new JSONObject(string);
            C0768yr.e("BackupRestoreUtility", "Parsed JSON, entries: " + jSONObject.length());
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(this.b).edit();
            editorEdit.clear();
            Iterator<String> itKeys = jSONObject.keys();
            int i2 = 0;
            int i3 = 0;
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!next.equals("LALALA") && !next.equals("VERSION")) {
                    try {
                        Object obj = jSONObject.get(next);
                        if (obj instanceof Boolean) {
                            editorEdit.putBoolean(next, ((Boolean) obj).booleanValue());
                        } else if (obj instanceof Integer) {
                            editorEdit.putInt(next, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            editorEdit.putLong(next, ((Long) obj).longValue());
                        } else if (obj instanceof Double) {
                            editorEdit.putFloat(next, ((Double) obj).floatValue());
                        } else if (obj instanceof String) {
                            editorEdit.putString(next, (String) obj);
                        } else if (obj instanceof JSONArray) {
                            JSONArray jSONArray = (JSONArray) obj;
                            HashSet hashSet = new HashSet();
                            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                                hashSet.add(jSONArray.getString(i4));
                            }
                            editorEdit.putStringSet(next, hashSet);
                        }
                        i2++;
                    } catch (Exception e) {
                        C0768yr.c("BackupRestoreUtility", "Error restoring preference key: " + next, e);
                        i3++;
                    }
                }
            }
            C0768yr.e("BackupRestoreUtility", "Default preferences restored: " + editorEdit.commit() + ", restored: " + i2 + ", errors: " + i3);
        } catch (JSONException e2) {
            C0768yr.c("BackupRestoreUtility", "Invalid JSON in default preferences", e2);
            throw new IOException("Invalid JSON format in backup file: " + e2.getMessage());
        } catch (Exception e3) {
            C0768yr.c("BackupRestoreUtility", "Unexpected error restoring default preferences", e3);
            throw new IOException("Failed to restore default preferences: " + e3.getMessage());
        }
    }

    public void t(ZipInputStream zipInputStream, ZipEntry zipEntry) throws IOException {
        String strSubstring = zipEntry.getName().substring(15);
        try {
            File externalFilesDir = this.b.getExternalFilesDir(null);
            if (externalFilesDir == null) {
                throw new IOException("External files directory not available");
            }
            File file = new File(externalFilesDir, strSubstring);
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                throw new IOException("Cannot create directory: " + parentFile.getAbsolutePath());
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream, 8192);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i = zipInputStream.read(bArr, 0, 8192);
                        if (i == -1) {
                            bufferedOutputStream.close();
                            fileOutputStream.close();
                            C0768yr.e("BackupRestoreUtility", "Restored external file: " + strSubstring);
                            return;
                        }
                        bufferedOutputStream.write(bArr, 0, i);
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        bufferedOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                fileOutputStream.close();
                throw th4;
            }
        } catch (Exception e) {
            C0768yr.c("BackupRestoreUtility", "Error restoring external file: " + strSubstring, e);
            throw new IOException("Failed to restore external file: " + e.getMessage());
        }
    }

    public void u(ZipInputStream zipInputStream, ZipEntry zipEntry) throws IOException {
        String strSubstring = zipEntry.getName().substring(13);
        try {
            File file = new File(this.b.getApplicationInfo().dataDir, "shared_prefs/" + strSubstring);
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                throw new IOException("Cannot create directory: " + parentFile.getAbsolutePath());
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream, 8192);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i = zipInputStream.read(bArr, 0, 8192);
                        if (i == -1) {
                            bufferedOutputStream.close();
                            fileOutputStream.close();
                            C0768yr.e("BackupRestoreUtility", "Restored named preference file: " + strSubstring);
                            return;
                        }
                        bufferedOutputStream.write(bArr, 0, i);
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        bufferedOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                fileOutputStream.close();
                throw th4;
            }
        } catch (Exception e) {
            C0768yr.c("BackupRestoreUtility", "Error restoring named preference file: " + strSubstring, e);
            throw new IOException("Failed to restore preference file: " + e.getMessage());
        }
    }

    public /* synthetic */ S3(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    public S3(Context context) {
        this.a = 4;
        this.b = context.getApplicationContext();
    }
}
