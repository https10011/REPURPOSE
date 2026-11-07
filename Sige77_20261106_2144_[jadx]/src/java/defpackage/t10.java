package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class t10 implements Executor {
    public static final t10 a;
    public static final /* synthetic */ t10[] b;

    static {
        t10 t10Var = new t10("INSTANCE", 0);
        a = t10Var;
        b = new t10[]{t10Var};
    }

    public static t10 valueOf(String str) {
        return (t10) Enum.valueOf(t10.class, str);
    }

    public static t10[] values() {
        return (t10[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
