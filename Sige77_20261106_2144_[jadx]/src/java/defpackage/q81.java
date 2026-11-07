package defpackage;

import okhttp3.Call;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class q81 implements f51 {
    public static volatile OkHttpClient b;
    public final Call.Factory a;

    public q81() {
        if (b == null) {
            synchronized (q81.class) {
                try {
                    if (b == null) {
                        b = new OkHttpClient();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.a = b;
    }

    @Override // defpackage.f51
    public final e51 a(ep1 ep1Var) {
        return new r81(this.a);
    }
}
