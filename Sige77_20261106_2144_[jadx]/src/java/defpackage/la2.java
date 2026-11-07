package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class la2 {
    public static final la2 b;
    public na1 a;

    static {
        la2 la2Var = new la2();
        la2Var.a = null;
        b = la2Var;
    }

    public static na1 a(Context context) {
        na1 na1Var;
        la2 la2Var = b;
        synchronized (la2Var) {
            try {
                if (la2Var.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    la2Var.a = new na1(context, 0);
                }
                na1Var = la2Var.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return na1Var;
    }
}
