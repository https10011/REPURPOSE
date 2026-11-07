package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public class e70 implements m02 {
    @Override // defpackage.m02
    public final l02 c(uk0 uk0Var, s12 s12Var) {
        Class superclass = s12Var.a;
        if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
            return null;
        }
        if (!superclass.isEnum()) {
            superclass = superclass.getSuperclass();
        }
        return new f70(superclass);
    }
}
