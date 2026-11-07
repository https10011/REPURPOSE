package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class wr3 extends ij2 {
    public final g93 b;
    public final g93 c;
    public final int[] d;
    public final int e;

    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    public wr3(g93 g93Var, g93 g93Var2) {
        this.b = g93Var;
        this.c = g93Var2;
        int iJ = g93Var2.J();
        if (!(iJ <= 28)) {
            e.g("metadata size too large");
            throw null;
        }
        int[] iArr = new int[iJ];
        this.d = iArr;
        long j = 0;
        int i = 0;
        int i2 = 0;
        while (i < iJ) {
            pq3 pq3VarD = d(i);
            long j2 = pq3VarD.e | j;
            if (j2 == j) {
                int i3 = 0;
                while (true) {
                    if (i3 >= i2) {
                        i3 = -1;
                        break;
                    } else if (pq3VarD.equals(d(iArr[i3] & 31))) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 != -1) {
                    iArr[i3] = pq3VarD.c ? iArr[i3] | (1 << (i + 4)) : i;
                } else {
                    iArr[i2] = i;
                    i2++;
                }
            } else {
                iArr[i2] = i;
                i2++;
            }
            i++;
            j = j2;
        }
        this.e = i2;
    }

    @Override // defpackage.ij2
    public final void a(ud2 ud2Var, lr3 lr3Var) {
        for (int i = 0; i < this.e; i++) {
            int i2 = this.d[i];
            pq3 pq3VarD = d(i2 & 31);
            if (pq3VarD.c) {
                ud2Var.y(pq3VarD, new ur3(this, pq3VarD, i2), lr3Var);
            } else {
                g93 g93Var = this.b;
                int iJ = g93Var.J();
                if (i2 >= iJ) {
                    g93Var = this.c;
                    i2 -= iJ;
                }
                ud2Var.v(pq3VarD, pq3VarD.b.cast(g93Var.N(i2)), lr3Var);
            }
        }
    }

    @Override // defpackage.ij2
    public final int b() {
        return this.e;
    }

    @Override // defpackage.ij2
    public final Set c() {
        return new hb(this, 4);
    }

    public final pq3 d(int i) {
        g93 g93Var = this.b;
        int iJ = g93Var.J();
        return i >= iJ ? this.c.M(i - iJ) : g93Var.M(i);
    }
}
