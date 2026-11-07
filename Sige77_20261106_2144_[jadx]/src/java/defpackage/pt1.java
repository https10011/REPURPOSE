package defpackage;

import android.util.StateSet;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class pt1 {
    public int a;
    public op1 b;
    public int[][] c;
    public op1[] d;
    public ot1 e;
    public ot1 f;
    public ot1 g;
    public ot1 h;

    public pt1(op1 op1Var) {
        b();
        a(StateSet.WILD_CARD, op1Var);
    }

    public final void a(int[] iArr, op1 op1Var) {
        int i = this.a;
        if (i == 0 || iArr.length == 0) {
            this.b = op1Var;
        }
        int[][] iArr2 = this.c;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            int[][] iArr3 = new int[i2][];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.c = iArr3;
            op1[] op1VarArr = new op1[i2];
            System.arraycopy(this.d, 0, op1VarArr, 0, i);
            this.d = op1VarArr;
        }
        int[][] iArr4 = this.c;
        int i3 = this.a;
        iArr4[i3] = iArr;
        this.d[i3] = op1Var;
        this.a = i3 + 1;
    }

    public final void b() {
        this.b = new op1();
        this.c = new int[10][];
        this.d = new op1[10];
    }
}
