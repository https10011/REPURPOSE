package defpackage;

import android.util.SparseArray;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class v41 {
    public final SparseArray a;
    public b22 b;

    public v41(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(b22 b22Var, int i, int i2) {
        int iA = b22Var.a(i);
        SparseArray sparseArray = this.a;
        v41 v41Var = sparseArray == null ? null : (v41) sparseArray.get(iA);
        if (v41Var == null) {
            v41Var = new v41(1);
            sparseArray.put(b22Var.a(i), v41Var);
        }
        if (i2 > i) {
            v41Var.a(b22Var, i + 1, i2);
        } else {
            v41Var.b = b22Var;
        }
    }
}
