package defpackage;

import android.net.Uri;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class pi3 implements lh3 {
    public boolean a;

    static {
        new AtomicInteger();
    }

    @Override // defpackage.lh3
    public final Object c(ep1 ep1Var) throws IOException {
        if (this.a) {
            if (((ro0) ep1Var.c).isEmpty()) {
                return ((xi3) ep1Var.b).f((Uri) ep1Var.e);
            }
            throw new tn("Short circuit would skip transforms.");
        }
        Closeable closeableH = rq0.H(ep1Var);
        try {
            if (!(closeableH instanceof xh3)) {
                throw new IOException("Not convertible and fallback to pipe is disabled.");
            }
            File fileZza = ((xh3) closeableH).zza();
            if (closeableH != null) {
                closeableH.close();
            }
            return fileZza;
        } catch (Throwable th) {
            if (closeableH != null) {
                try {
                    closeableH.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
