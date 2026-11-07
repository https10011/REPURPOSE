package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class h12 implements m02 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Class b;
    public final /* synthetic */ l02 c;

    public /* synthetic */ h12(Class cls, l02 l02Var, int i) {
        this.a = i;
        this.b = cls;
        this.c = l02Var;
    }

    @Override // defpackage.m02
    public final l02 c(uk0 uk0Var, s12 s12Var) {
        int i = this.a;
        Class cls = this.b;
        switch (i) {
            case 0:
                if (s12Var.a == cls) {
                    return this.c;
                }
                return null;
            default:
                Class<?> cls2 = s12Var.a;
                if (cls.isAssignableFrom(cls2)) {
                    return new ho(this, cls2);
                }
                return null;
        }
    }

    public final String toString() {
        int i = this.a;
        l02 l02Var = this.c;
        Class cls = this.b;
        switch (i) {
            case 0:
                return "Factory[type=" + cls.getName() + ",adapter=" + l02Var + "]";
            default:
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + l02Var + "]";
        }
    }
}
