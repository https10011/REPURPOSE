package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class sc1 extends aa1 {
    public final Object a;

    public sc1(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.aa1
    public final Object a() {
        return this.a;
    }

    @Override // defpackage.aa1
    public final boolean b() {
        return true;
    }

    @Override // defpackage.aa1
    public final Object c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sc1) {
            return this.a.equals(((sc1) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(strValueOf);
        sb.append(")");
        return sb.toString();
    }
}
