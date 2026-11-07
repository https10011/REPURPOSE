package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class k02 extends l02 {
    public final /* synthetic */ l02 a;

    public k02(l02 l02Var) {
        this.a = l02Var;
    }

    @Override // defpackage.l02
    public final Object b(au0 au0Var) throws IOException {
        if (au0Var.R() != 9) {
            return this.a.b(au0Var);
        }
        au0Var.D();
        return null;
    }

    @Override // defpackage.l02
    public final void c(eu0 eu0Var, Object obj) throws IOException {
        if (obj == null) {
            eu0Var.p();
        } else {
            this.a.c(eu0Var, obj);
        }
    }

    public final String toString() {
        return "NullSafeTypeAdapter[" + this.a + "]";
    }
}
