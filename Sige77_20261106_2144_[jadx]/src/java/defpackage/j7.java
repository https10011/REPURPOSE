package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class j7 {
    public final int a;
    public final yd2 b;
    public final f7 c;
    public final String d;

    public j7(yd2 yd2Var, f7 f7Var, String str) {
        this.b = yd2Var;
        this.c = f7Var;
        this.d = str;
        this.a = Arrays.hashCode(new Object[]{yd2Var, f7Var, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j7)) {
            return false;
        }
        j7 j7Var = (j7) obj;
        return jw.j(this.b, j7Var.b) && jw.j(this.c, j7Var.c) && jw.j(this.d, j7Var.d);
    }

    public final int hashCode() {
        return this.a;
    }
}
