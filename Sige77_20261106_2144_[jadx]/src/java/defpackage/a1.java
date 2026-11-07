package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class a1 extends b1 implements RandomAccess {
    public final b1 b;
    public final int c;
    public final int d;

    public a1(b1 b1Var, int i, int i2) {
        this.b = b1Var;
        this.c = i;
        x0 x0Var = b1.a;
        int iA = b1Var.a();
        x0Var.getClass();
        x0.c(i, i2, iA);
        this.d = i2 - i;
    }

    @Override // defpackage.d0
    public final int a() {
        return this.d;
    }

    @Override // defpackage.b1, java.util.List
    public final Object get(int i) {
        b1.a.getClass();
        x0.a(i, this.d);
        return this.b.get(this.c + i);
    }

    @Override // defpackage.b1, java.util.List
    public final List subList(int i, int i2) {
        b1.a.getClass();
        x0.c(i, i2, this.d);
        int i3 = this.c;
        return new a1(this.b, i + i3, i3 + i2);
    }
}
