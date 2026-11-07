package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class h22 implements Executor {
    public static final h22 a;
    public static final Handler b;
    public static final /* synthetic */ h22[] c;

    static {
        h22 h22Var = new h22("INSTANCE", 0);
        a = h22Var;
        c = new h22[]{h22Var};
        b = new Handler(Looper.getMainLooper());
    }

    public static h22 valueOf(String str) {
        return (h22) Enum.valueOf(h22.class, str);
    }

    public static h22[] values() {
        return (h22[]) c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b.post(runnable);
    }
}
