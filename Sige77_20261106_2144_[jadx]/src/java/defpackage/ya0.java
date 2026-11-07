package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class ya0 implements lw {
    public final /* synthetic */ int a;
    public final Comparable b;
    public final Object c;
    public Object d;

    public /* synthetic */ ya0(Comparable comparable, Object obj, int i) {
        this.a = i;
        this.b = comparable;
        this.c = obj;
    }

    public static ya0 b(Context context, Uri uri, px1 px1Var) {
        v01 v01Var = a.a(context).d;
        ArrayList arrayListE = a.a(context).c.a().e();
        ContentResolver contentResolver = context.getContentResolver();
        ud2 ud2Var = new ud2();
        ud2Var.a = px1Var;
        ud2Var.b = v01Var;
        ud2Var.c = contentResolver;
        ud2Var.d = arrayListE;
        return new ya0(uri, ud2Var, 1);
    }

    @Override // defpackage.lw
    public final Class a() {
        switch (this.a) {
            case 0:
                return ((za0) this.c).a();
            default:
                return InputStream.class;
        }
    }

    @Override // defpackage.lw
    public final void cancel() {
        int i = this.a;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033 A[PHI: r6
      0x0033: PHI (r6v7 android.database.Cursor) = (r6v3 android.database.Cursor), (r6v10 android.database.Cursor) binds: [B:26:0x0056, B:14:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0047 A[Catch: all -> 0x002b, TRY_LEAVE, TryCatch #8 {all -> 0x002b, blocks: (B:6:0x001c, B:8:0x0022, B:23:0x0041, B:25:0x0047), top: B:83:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:25:0x0047, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x002c: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:45), block:B:11:0x002c */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.NullPointerException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v0 */
    public InputStream e() throws Throwable {
        ?? r6;
        SecurityException e;
        Cursor cursorI;
        String string;
        File file;
        InputStream inputStreamOpenInputStream;
        int iL;
        ud2 ud2Var = (ud2) this.c;
        ContentResolver contentResolver = (ContentResolver) ud2Var.c;
        Uri uri = (Uri) this.b;
        ?? r5 = 0;
        InputStream inputStreamOpenInputStream2 = null;
        try {
            try {
                try {
                    try {
                        cursorI = ((px1) ud2Var.a).i(uri);
                        if (cursorI != null) {
                            try {
                                if (cursorI.moveToFirst()) {
                                    string = cursorI.getString(0);
                                    cursorI.close();
                                }
                            } catch (SecurityException e2) {
                                e = e2;
                                if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                    Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e);
                                }
                                if (cursorI != null) {
                                }
                                string = null;
                                if (TextUtils.isEmpty(string)) {
                                    inputStreamOpenInputStream = null;
                                } else {
                                    file = new File(string);
                                    if (file.exists()) {
                                        inputStreamOpenInputStream = null;
                                    } else {
                                        inputStreamOpenInputStream = null;
                                    }
                                }
                                if (inputStreamOpenInputStream != null) {
                                    try {
                                        try {
                                            inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                                            iL = qt.l((ArrayList) ud2Var.d, inputStreamOpenInputStream2, (v01) ud2Var.b);
                                            if (inputStreamOpenInputStream2 != null) {
                                                try {
                                                    inputStreamOpenInputStream2.close();
                                                } catch (IOException unused) {
                                                }
                                            }
                                        } catch (Throwable th) {
                                            if (0 != 0) {
                                                try {
                                                    r5.close();
                                                } catch (IOException unused2) {
                                                }
                                            }
                                            throw th;
                                        }
                                    } catch (IOException | NullPointerException e3) {
                                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                                            Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e3);
                                        }
                                        if (inputStreamOpenInputStream2 != null) {
                                            try {
                                                inputStreamOpenInputStream2.close();
                                            } catch (IOException unused3) {
                                            }
                                        }
                                        iL = -1;
                                    }
                                } else {
                                    iL = -1;
                                }
                                if (iL != -1) {
                                    return new s80(inputStreamOpenInputStream, iL);
                                }
                                return inputStreamOpenInputStream;
                            }
                            if (TextUtils.isEmpty(string)) {
                                inputStreamOpenInputStream = null;
                            } else {
                                file = new File(string);
                                if (file.exists() || 0 >= file.length()) {
                                    inputStreamOpenInputStream = null;
                                } else {
                                    Uri uriFromFile = Uri.fromFile(file);
                                    try {
                                        inputStreamOpenInputStream = contentResolver.openInputStream(uriFromFile);
                                    } catch (NullPointerException e4) {
                                        throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e4));
                                    }
                                }
                            }
                            if (inputStreamOpenInputStream != null) {
                                inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                                iL = qt.l((ArrayList) ud2Var.d, inputStreamOpenInputStream2, (v01) ud2Var.b);
                                if (inputStreamOpenInputStream2 != null) {
                                    inputStreamOpenInputStream2.close();
                                }
                            } else {
                                iL = -1;
                            }
                            if (iL != -1) {
                                return new s80(inputStreamOpenInputStream, iL);
                            }
                            return inputStreamOpenInputStream;
                        }
                        if (cursorI != null) {
                            cursorI.close();
                        }
                    } catch (SecurityException e5) {
                        e = e5;
                        cursorI = null;
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e);
                        }
                        if (cursorI != null) {
                            cursorI.close();
                        }
                        string = null;
                        if (TextUtils.isEmpty(string)) {
                            inputStreamOpenInputStream = null;
                        } else {
                            file = new File(string);
                            if (file.exists()) {
                                inputStreamOpenInputStream = null;
                            } else {
                                inputStreamOpenInputStream = null;
                            }
                        }
                        if (inputStreamOpenInputStream != null) {
                            inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                            iL = qt.l((ArrayList) ud2Var.d, inputStreamOpenInputStream2, (v01) ud2Var.b);
                            if (inputStreamOpenInputStream2 != null) {
                                inputStreamOpenInputStream2.close();
                            }
                        } else {
                            iL = -1;
                        }
                        if (iL != -1) {
                            return new s80(inputStreamOpenInputStream, iL);
                        }
                        return inputStreamOpenInputStream;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (r5 != 0) {
                        r5.close();
                    }
                    throw th;
                }
            } catch (SecurityException e6) {
                e = e6;
            }
            string = null;
            if (TextUtils.isEmpty(string)) {
                inputStreamOpenInputStream = null;
            } else {
                file = new File(string);
                if (file.exists()) {
                    inputStreamOpenInputStream = null;
                } else {
                    inputStreamOpenInputStream = null;
                }
            }
            if (inputStreamOpenInputStream != null) {
                inputStreamOpenInputStream2 = contentResolver.openInputStream(uri);
                iL = qt.l((ArrayList) ud2Var.d, inputStreamOpenInputStream2, (v01) ud2Var.b);
                if (inputStreamOpenInputStream2 != null) {
                    inputStreamOpenInputStream2.close();
                }
            } else {
                iL = -1;
            }
            if (iL != -1) {
                return new s80(inputStreamOpenInputStream, iL);
            }
            return inputStreamOpenInputStream;
        } catch (Throwable th3) {
            th = th3;
            r5 = r6;
        }
    }

    @Override // defpackage.lw
    public final void h() {
        switch (this.a) {
            case 0:
                Object obj = this.d;
                if (obj != null) {
                    try {
                        ((za0) this.c).m(obj);
                    } catch (IOException unused) {
                        return;
                    }
                }
                break;
            default:
                InputStream inputStream = (InputStream) this.d;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // defpackage.lw
    public final void i(vc1 vc1Var, kw kwVar) throws Throwable {
        switch (this.a) {
            case 0:
                try {
                    Object objI = ((za0) this.c).i((File) this.b);
                    this.d = objI;
                    kwVar.c(objI);
                } catch (FileNotFoundException e) {
                    if (Log.isLoggable("FileLoader", 3)) {
                        Log.d("FileLoader", "Failed to open file", e);
                    }
                    kwVar.b(e);
                    return;
                }
                break;
            default:
                try {
                    InputStream inputStreamE = e();
                    this.d = inputStreamE;
                    kwVar.c(inputStreamE);
                } catch (FileNotFoundException e2) {
                    if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                        Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e2);
                    }
                    kwVar.b(e2);
                }
                break;
        }
    }

    @Override // defpackage.lw
    public final int j() {
        switch (this.a) {
        }
        return 1;
    }

    private final void c() {
    }

    private final void d() {
    }
}
