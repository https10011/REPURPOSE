package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class iz2 implements Executor {
    public static final /* synthetic */ iz2 b = new iz2(0);
    public static final /* synthetic */ iz2 c = new iz2(1);
    public static final /* synthetic */ iz2 d = new iz2(6);
    public final /* synthetic */ int a;

    public /* synthetic */ iz2(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            case oc1.FLOAT_FIELD_NUMBER /* 2 */:
                new Thread(runnable).start();
                break;
            case oc1.INTEGER_FIELD_NUMBER /* 3 */:
                runnable.getClass();
                new Thread(runnable).start();
                break;
            case oc1.LONG_FIELD_NUMBER /* 4 */:
                d42.t().post(runnable);
                break;
            case oc1.STRING_FIELD_NUMBER /* 5 */:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
