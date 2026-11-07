package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class r extends p {
    public abstract boolean b(r rVar);

    public abstract void c(kj0 kj0Var);

    public abstract int d();

    @Override // defpackage.p
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && b(((p) obj).a());
    }

    @Override // defpackage.p
    public abstract int hashCode();

    @Override // defpackage.p
    public final r a() {
        return this;
    }

    public r e() {
        return this;
    }
}
