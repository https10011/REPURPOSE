package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class sv0 implements Comparable {
    public static final rv0 b = new rv0(null);
    public static final sv0 c = new sv0();
    public final int a = 131605;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        sv0 sv0Var = (sv0) obj;
        sv0Var.getClass();
        return this.a - sv0Var.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        sv0 sv0Var = obj instanceof sv0 ? (sv0) obj : null;
        return sv0Var != null && this.a == sv0Var.a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "2.2.21";
    }
}
