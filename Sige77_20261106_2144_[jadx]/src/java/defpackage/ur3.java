package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public final class ur3 implements Iterator {
    public final pq3 a;
    public int b;
    public int c;
    public final /* synthetic */ wr3 d;

    public /* synthetic */ ur3(wr3 wr3Var, pq3 pq3Var, int i) {
        this.d = wr3Var;
        this.a = pq3Var;
        int i2 = i & 31;
        this.b = i2;
        this.c = i >>> (i2 + 5);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.b;
        wr3 wr3Var = this.d;
        g93 g93Var = wr3Var.b;
        int iJ = g93Var.J();
        Object objCast = this.a.b.cast(i >= iJ ? wr3Var.c.N(i - iJ) : g93Var.N(i));
        int i2 = this.c;
        if (i2 == 0) {
            this.b = -1;
            return objCast;
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i2) + 1;
        this.c >>>= iNumberOfTrailingZeros;
        this.b += iNumberOfTrailingZeros;
        return objCast;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
