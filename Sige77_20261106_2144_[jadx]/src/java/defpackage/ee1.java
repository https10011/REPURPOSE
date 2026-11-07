package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ee1 implements f51 {
    public final Context a;
    public final Class b;

    public ee1(Context context, Class cls) {
        this.a = context;
        this.b = cls;
    }

    @Override // defpackage.f51
    public final e51 a(ep1 ep1Var) {
        Class cls = this.b;
        return new ge1(this.a, ep1Var.i(File.class, cls), ep1Var.i(Uri.class, cls), cls);
    }
}
