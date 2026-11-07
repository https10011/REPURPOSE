package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final /* synthetic */ class dp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ dp0(int i, int i2, Context context) {
        this.a = i2;
        this.b = i;
        this.c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Context context = this.c;
        int i2 = this.b;
        switch (i) {
            case 0:
                if (mt.a.contains(ep0.class)) {
                    return;
                }
                try {
                    if (i2 == 0) {
                        throw null;
                    }
                    context.getClass();
                    ep0 ep0Var = ep0.a;
                    String packageName = context.getPackageName();
                    packageName.getClass();
                    ep0Var.a(i2, packageName);
                    return;
                } catch (Throwable th) {
                    mt.a(ep0.class, th);
                    return;
                }
            default:
                if (mt.a.contains(ep0.class)) {
                    return;
                }
                try {
                    if (i2 == 0) {
                        throw null;
                    }
                    context.getClass();
                    ep0 ep0Var2 = ep0.a;
                    String packageName2 = context.getPackageName();
                    packageName2.getClass();
                    ep0Var2.a(i2, packageName2);
                    return;
                } catch (Throwable th2) {
                    mt.a(ep0.class, th2);
                    return;
                }
        }
    }
}
