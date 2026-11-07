package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class mj2 {
    public final jk2 a = jk2.b;
    public final String b;

    public mj2(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mj2)) {
            return false;
        }
        mj2 mj2Var = (mj2) obj;
        return this.a.equals(mj2Var.a) && this.b.equals(mj2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }
}
