package defpackage;

import android.os.SystemClock;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class bp3 {
    public static final bj0 a;

    static {
        zo3 zo3Var;
        try {
            SystemClock.elapsedRealtimeNanos();
            zo3Var = new zo3(0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            zo3Var = new zo3(1);
        }
        a = zo3Var;
    }
}
