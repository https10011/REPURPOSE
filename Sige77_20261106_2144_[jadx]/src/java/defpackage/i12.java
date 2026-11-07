package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class i12 implements m02 {
    public final /* synthetic */ Class a;
    public final /* synthetic */ Class b;
    public final /* synthetic */ l02 c;

    public i12(Class cls, Class cls2, l02 l02Var) {
        this.a = cls;
        this.b = cls2;
        this.c = l02Var;
    }

    @Override // defpackage.m02
    public final l02 c(uk0 uk0Var, s12 s12Var) {
        Class cls = s12Var.a;
        if (cls == this.a || cls == this.b) {
            return this.c;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.b.getName() + "+" + this.a.getName() + ",adapter=" + this.c + "]";
    }
}
