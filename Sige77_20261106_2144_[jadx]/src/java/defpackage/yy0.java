package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class yy0 {
    public final nl1 a;
    public final String b;

    public yy0(nl1 nl1Var, String str) {
        this.a = nl1Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy0)) {
            return false;
        }
        yy0 yy0Var = (yy0) obj;
        return this.a == yy0Var.a && this.b.equals(yy0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (System.identityHashCode(this.a) * 31);
    }
}
