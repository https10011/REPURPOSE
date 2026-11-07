package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class pz0 implements lw {
    public final boolean a;
    public final Uri b;
    public final ContentResolver c;
    public Object d;

    public pz0(ContentResolver contentResolver, Uri uri, boolean z) {
        this.c = contentResolver;
        this.b = uri;
        this.a = z;
    }

    public abstract void b(Object obj);

    public abstract Object c(ContentResolver contentResolver, Uri uri);

    @Override // defpackage.lw
    public final void h() {
        Object obj = this.d;
        if (obj != null) {
            try {
                b(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.lw
    public final void i(vc1 vc1Var, kw kwVar) {
        try {
            Object objC = c(this.c, this.b);
            this.d = objC;
            kwVar.c(objC);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            kwVar.b(e);
        }
    }

    @Override // defpackage.lw
    public final int j() {
        return 1;
    }

    @Override // defpackage.lw
    public final void cancel() {
    }
}
