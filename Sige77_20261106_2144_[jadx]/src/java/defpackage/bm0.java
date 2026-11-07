package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class bm0 extends qr {
    public qr[] p0 = new qr[4];
    public int q0 = 0;

    public final void M(int i, k82 k82Var, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.q0; i2++) {
            qr qrVar = this.p0[i2];
            ArrayList arrayList2 = k82Var.a;
            if (!arrayList2.contains(qrVar)) {
                arrayList2.add(qrVar);
            }
        }
        for (int i3 = 0; i3 < this.q0; i3++) {
            dw0.d(this.p0[i3], i, arrayList, k82Var);
        }
    }

    public void N() {
    }
}
