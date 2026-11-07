package defpackage;

import android.util.SparseArray;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class cg1 {
    public SparseArray a;
    public int b;

    public final bg1 a(int i) {
        SparseArray sparseArray = this.a;
        bg1 bg1Var = (bg1) sparseArray.get(i);
        if (bg1Var != null) {
            return bg1Var;
        }
        bg1 bg1Var2 = new bg1();
        sparseArray.put(i, bg1Var2);
        return bg1Var2;
    }
}
