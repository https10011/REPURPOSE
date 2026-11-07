package defpackage;

import android.os.Process;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class g4 implements Runnable {
    public final /* synthetic */ int a;
    public final Runnable b;

    public /* synthetic */ g4(Runnable runnable, int i) {
        this.a = i;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Runnable runnable = this.b;
        switch (i) {
            case 0:
                Process.setThreadPriority(10);
                runnable.run();
                break;
            case 1:
                try {
                    runnable.run();
                } catch (Exception e) {
                    d42.h(e, "Executor", "Background execution failure.");
                    return;
                }
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                runnable.run();
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                runnable.run();
                break;
            default:
                Process.setThreadPriority(0);
                runnable.run();
                break;
        }
    }

    public String toString() {
        int i = this.a;
        Runnable runnable = this.b;
        switch (i) {
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                return runnable.toString();
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                return runnable.toString();
            default:
                return super.toString();
        }
    }
}
