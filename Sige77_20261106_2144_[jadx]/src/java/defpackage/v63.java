package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzr;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class v63 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzr b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ g73 d;

    public /* synthetic */ v63(g73 g73Var, zzr zzrVar, Bundle bundle, int i) {
        this.a = i;
        this.b = zzrVar;
        this.c = bundle;
        this.d = g73Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        int i = this.a;
        Bundle bundle = this.c;
        zzr zzrVar = this.b;
        g73 g73Var = this.d;
        switch (i) {
            case 0:
                g73Var.a.V();
                break;
            default:
                g73Var.a.V();
                break;
        }
        return g73Var.a.d0(bundle, zzrVar);
    }
}
