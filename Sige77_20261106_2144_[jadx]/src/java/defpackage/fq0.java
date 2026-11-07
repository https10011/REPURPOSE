package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class fq0 implements o62 {
    public final m62[] a;

    public fq0(m62... m62VarArr) {
        this.a = m62VarArr;
    }

    @Override // defpackage.o62
    public final l62 h(Class cls, c61 c61Var) {
        l62 l62Var = null;
        for (m62 m62Var : this.a) {
            if (Intrinsics.areEqual(m62Var.a, cls)) {
                Object objInvoke = m62Var.b.invoke(c61Var);
                l62Var = objInvoke instanceof l62 ? (l62) objInvoke : null;
            }
        }
        if (l62Var != null) {
            return l62Var;
        }
        e.g("No initializer set for given class ".concat(cls.getName()));
        return null;
    }
}
