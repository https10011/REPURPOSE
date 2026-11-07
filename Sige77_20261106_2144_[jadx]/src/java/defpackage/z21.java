package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class z21 implements lw {
    public static final String[] d = {"_data"};
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;

    public /* synthetic */ z21(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.lw
    public final Class a() {
        switch (this.a) {
            case 0:
                return File.class;
            case 1:
                return ((bj) this.c).a();
            default:
                return InputStream.class;
        }
    }

    @Override // defpackage.lw
    public final void cancel() {
        int i = this.a;
    }

    @Override // defpackage.lw
    public final void h() {
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                try {
                    ((ByteArrayInputStream) this.c).close();
                } catch (IOException unused) {
                    return;
                }
                break;
        }
    }

    @Override // defpackage.lw
    public final void i(vc1 vc1Var, kw kwVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Cursor cursorQuery = ((Context) obj).getContentResolver().query((Uri) this.c, d, null, null, null);
                String string = null;
                if (cursorQuery != null) {
                    try {
                        string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                        cursorQuery.close();
                    } catch (Throwable th) {
                        cursorQuery.close();
                        throw th;
                    }
                    break;
                }
                if (!TextUtils.isEmpty(string)) {
                    kwVar.c(new File(string));
                    return;
                }
                kwVar.b(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.c)));
                return;
            case 1:
                kwVar.c(((bj) this.c).j((byte[]) obj));
                return;
            default:
                try {
                    ByteArrayInputStream byteArrayInputStreamJ = vl0.j((String) obj);
                    this.c = byteArrayInputStreamJ;
                    kwVar.c(byteArrayInputStreamJ);
                    return;
                } catch (IllegalArgumentException e) {
                    kwVar.b(e);
                    return;
                }
        }
    }

    @Override // defpackage.lw
    public final int j() {
        switch (this.a) {
        }
        return 1;
    }

    public z21(String str, vl0 vl0Var) {
        this.a = 2;
        this.b = str;
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }

    private final void e() {
    }

    private final void f() {
    }
}
