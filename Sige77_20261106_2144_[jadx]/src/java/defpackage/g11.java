package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class g11 implements h41 {
    public h41[] a;

    @Override // defpackage.h41
    public final if1 a(Class cls) {
        for (h41 h41Var : this.a) {
            if (h41Var.b(cls)) {
                return h41Var.a(cls);
            }
        }
        sm0.h("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.h41
    public final boolean b(Class cls) {
        for (h41 h41Var : this.a) {
            if (h41Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
