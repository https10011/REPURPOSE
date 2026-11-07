package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class kg2 implements rb2 {
    public final Context a;
    public volatile String b = null;
    public volatile boolean c = false;
    public final /* synthetic */ int d;

    public kg2(Context context, int i) {
        this.d = i;
        this.a = context;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a3 A[PHI: r1 r8
      0x00a3: PHI (r1v4 java.lang.String) = (r1v11 java.lang.String), (r1v7 java.lang.String), (r1v14 java.lang.String) binds: [B:51:0x00d0, B:30:0x00a1, B:36:0x00b1] A[DONT_GENERATE, DONT_INLINE]
      0x00a3: PHI (r8v5 android.database.Cursor) = (r8v4 android.database.Cursor), (r8v10 android.database.Cursor), (r8v10 android.database.Cursor) binds: [B:51:0x00d0, B:30:0x00a1, B:36:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ad  */
    public final String a(String str) throws Throwable {
        Cursor cursorQuery;
        Throwable th;
        Throwable th2;
        RandomAccessFile randomAccessFile;
        Cursor cursor = null;
        strA = null;
        strA = null;
        strA = null;
        strA = null;
        strA = null;
        String strA = null;
        cursor = null;
        switch (this.d) {
            case 0:
                try {
                    try {
                        try {
                            cursorQuery = this.a.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_display_name", "title"}, "_display_name=?", new String[]{str + ".mp3"}, null);
                            if (cursorQuery != null) {
                                try {
                                    if (cursorQuery.getCount() > 0) {
                                        cursorQuery.moveToFirst();
                                        int columnIndex = cursorQuery.getColumnIndex("title");
                                        if (columnIndex >= 0) {
                                            strA = yv2.a(cursorQuery.getString(columnIndex));
                                            if (!cursorQuery.isClosed()) {
                                                cursorQuery.close();
                                            }
                                        } else if (cursorQuery != null && !cursorQuery.isClosed()) {
                                            cursorQuery.close();
                                        }
                                    } else if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                } catch (Exception unused) {
                                    if (cursorQuery != null && !cursorQuery.isClosed()) {
                                    }
                                    return strA;
                                } catch (Throwable th3) {
                                    th = th3;
                                    cursor = cursorQuery;
                                    if (cursor == null || cursor.isClosed()) {
                                        throw th;
                                    }
                                    cursor.close();
                                    throw th;
                                }
                            } else if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return strA;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Exception unused2) {
                    cursorQuery = null;
                }
                break;
            default:
                if (!Environment.getExternalStorageState().equals("mounted")) {
                    return null;
                }
                try {
                    try {
                        randomAccessFile = new RandomAccessFile(new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Installation", str), "r");
                        try {
                            byte[] bArr = new byte[(int) randomAccessFile.length()];
                            randomAccessFile.readFully(bArr);
                            String str2 = new String(bArr);
                            try {
                                randomAccessFile.close();
                                break;
                            } catch (IOException unused3) {
                            }
                            return str2;
                        } catch (Throwable th6) {
                            th2 = th6;
                            if (randomAccessFile == null) {
                                throw th2;
                            }
                            try {
                                randomAccessFile.close();
                                throw th2;
                            } catch (IOException unused4) {
                                throw th2;
                            }
                        }
                    } catch (Exception unused5) {
                        return null;
                    }
                } catch (Throwable th7) {
                    th2 = th7;
                    randomAccessFile = null;
                }
                break;
        }
    }

    @Override // defpackage.rb2
    public final synchronized String b(String str) {
        if (this.c) {
            return this.b;
        }
        return a(str);
    }

    public final boolean c(String str, String str2) throws Throwable {
        FileOutputStream fileOutputStream;
        Throwable th;
        switch (this.d) {
            case 0:
                if (b(str) == null) {
                    ContentResolver contentResolver = this.a.getContentResolver();
                    Uri uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("relative_path", "Notifications/Installation");
                    contentValues.put("_display_name", str + ".mp3");
                    try {
                        ub2 ub2Var = ub2.e;
                        Charset charset = vb2.a;
                        str2 = new String(ub2Var.a(str2.getBytes(charset)), charset);
                    } catch (Exception unused) {
                    }
                    contentValues.put("title", str2);
                    try {
                        if (contentResolver.insert(uri, contentValues) == null) {
                            return false;
                        }
                    } catch (Exception unused2) {
                        return false;
                    }
                }
                return true;
            default:
                if (!Environment.getExternalStorageState().equals("mounted")) {
                    return false;
                }
                try {
                    File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Installation", str);
                    File parentFile = file.getParentFile();
                    if (parentFile != null && !parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    try {
                        fileOutputStream = new FileOutputStream(file);
                        try {
                            fileOutputStream.write(str2.getBytes());
                            try {
                                fileOutputStream.close();
                                break;
                            } catch (IOException unused3) {
                            }
                            return true;
                        } catch (Throwable th2) {
                            th = th2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                    break;
                                } catch (IOException unused4) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        fileOutputStream = null;
                        th = th3;
                    }
                } catch (Exception unused5) {
                    return false;
                }
                break;
        }
    }

    @Override // defpackage.rb2
    public final synchronized void d(String str, String str2) {
        if (str2 == null) {
            return;
        }
        if (this.c && str2.equals(this.b)) {
            return;
        }
        if (c(str, str2)) {
            this.c = true;
        } else {
            this.c = false;
        }
        this.b = str2;
    }
}
