package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class t01 implements xb1 {
    public final u01 a;
    public int b;
    public Class c;

    public t01(u01 u01Var) {
        this.a = u01Var;
    }

    @Override // defpackage.xb1
    public final void a() {
        this.a.q(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t01) {
            t01 t01Var = (t01) obj;
            if (this.b == t01Var.b && this.c == t01Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b * 31;
        Class cls = this.c;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.b + "array=" + this.c + '}';
    }
}
