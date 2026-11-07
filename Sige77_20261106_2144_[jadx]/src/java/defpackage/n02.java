package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class n02 extends l02 {
    @Override // defpackage.l02
    public final Object b(au0 au0Var) {
        return new AtomicBoolean(au0Var.t());
    }

    @Override // defpackage.l02
    public final void c(eu0 eu0Var, Object obj) throws IOException {
        eu0Var.C(((AtomicBoolean) obj).get());
    }
}
