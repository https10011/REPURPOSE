package defpackage;

import java.io.InputStream;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class bc3 implements lh3 {
    public boolean a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lh3
    public /* bridge */ /* synthetic */ Object c(ep1 ep1Var) {
        dc3 dc3VarA;
        InputStream inputStreamH = rq0.H(ep1Var);
        try {
            int i = 4096;
            if (this.a) {
                if (inputStreamH instanceof xh3) {
                    long length = ((xh3) inputStreamH).zza().length();
                    if (length == 0) {
                        i = 512;
                    } else if (length < 4096) {
                        i = (int) length;
                    }
                }
                dc3VarA = dc3.a(ll2.h(inputStreamH, i), true);
            } else {
                dc3VarA = dc3.a(ll2.h(inputStreamH, 4096), false);
            }
            nj2.q(inputStreamH, null);
            return dc3VarA;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                nj2.q(inputStreamH, th);
                throw th2;
            }
        }
    }
}
