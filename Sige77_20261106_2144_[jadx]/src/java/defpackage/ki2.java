package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ki2 implements f7 {
    public static final ki2 c;
    public final boolean a;
    public final String b;

    static {
        nl1 nl1Var = new nl1();
        nl1Var.b = Boolean.FALSE;
        c = new ki2(nl1Var);
    }

    public ki2(nl1 nl1Var) {
        this.a = ((Boolean) nl1Var.b).booleanValue();
        this.b = (String) nl1Var.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ki2)) {
            return false;
        }
        ki2 ki2Var = (ki2) obj;
        return jw.j(null, null) && this.a == ki2Var.a && jw.j(this.b, ki2Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.a), this.b});
    }
}
