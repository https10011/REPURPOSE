package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class kr0 {
    public String a;

    public final boolean equals(Object obj) {
        if (obj instanceof kr0) {
            return jw.j(this.a, ((kr0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        hs1 hs1Var = new hs1(this);
        hs1Var.e(this.a, "token");
        return hs1Var.toString();
    }
}
