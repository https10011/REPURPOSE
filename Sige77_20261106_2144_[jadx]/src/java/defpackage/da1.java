package defpackage;

import java.security.MessageDigest;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class da1 implements hv0 {
    public final uj b = new uj(0);

    @Override // defpackage.hv0
    public final void b(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            uj ujVar = this.b;
            if (i >= ujVar.c) {
                return;
            }
            z91 z91Var = (z91) ujVar.f(i);
            Object objJ = this.b.j(i);
            y91 y91Var = z91Var.b;
            if (z91Var.d == null) {
                z91Var.d = z91Var.c.getBytes(hv0.a);
            }
            y91Var.e(z91Var.d, objJ, messageDigest);
            i++;
        }
    }

    public final Object c(z91 z91Var) {
        uj ujVar = this.b;
        return ujVar.containsKey(z91Var) ? ujVar.get(z91Var) : z91Var.a;
    }

    @Override // defpackage.hv0
    public final boolean equals(Object obj) {
        if (obj instanceof da1) {
            return this.b.equals(((da1) obj).b);
        }
        return false;
    }

    @Override // defpackage.hv0
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.b + '}';
    }
}
