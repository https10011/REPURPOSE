package defpackage;

import java.util.AbstractList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class rm2 extends AbstractList {
    public final om2 a;
    public final qm2 b;

    public rm2(om2 om2Var, qm2 qm2Var) {
        this.a = om2Var;
        this.b = qm2Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iC = ((fm2) this.a).c(i);
        ((sh1) this.b).getClass();
        rk2 rk2VarA = rk2.a(iC);
        return rk2VarA == null ? rk2.UNKNOWN : rk2VarA;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
