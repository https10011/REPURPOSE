package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class y70 implements m90 {
    public final /* synthetic */ int a;
    public final yd1 b;

    public /* synthetic */ y70(yd1 yd1Var, int i) {
        this.a = i;
        this.b = yd1Var;
    }

    @Override // defpackage.yd1
    public final Object get() {
        int i = this.a;
        yd1 yd1Var = this.b;
        switch (i) {
            case 0:
                String packageName = ((Context) yd1Var.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                uq1.h("Cannot return null from a non-@Nullable @Provides method");
                return null;
            default:
                return new bm1(Integer.valueOf(bm1.d).intValue(), (Context) yd1Var.get(), "com.google.android.datatransport.events");
        }
    }
}
