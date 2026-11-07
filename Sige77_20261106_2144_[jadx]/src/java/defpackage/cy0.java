package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class cy0 implements Iterator {
    public ey0 a;
    public ey0 b = null;
    public int c;
    public final /* synthetic */ fy0 d;
    public final /* synthetic */ int e;

    public cy0(fy0 fy0Var, int i) {
        this.e = i;
        this.d = fy0Var;
        this.a = fy0Var.f.d;
        this.c = fy0Var.e;
    }

    public final Object a() {
        return b();
    }

    public final ey0 b() {
        ey0 ey0Var = this.a;
        fy0 fy0Var = this.d;
        if (ey0Var == fy0Var.f) {
            uq1.a();
            return null;
        }
        if (fy0Var.e != this.c) {
            throw new ConcurrentModificationException();
        }
        this.a = ey0Var.d;
        this.b = ey0Var;
        return ey0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a != this.d.f;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.e) {
            case 1:
                return b().f;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        ey0 ey0Var = this.b;
        if (ey0Var == null) {
            uq1.n();
            return;
        }
        fy0 fy0Var = this.d;
        fy0Var.c(ey0Var, true);
        this.b = null;
        this.c = fy0Var.e;
    }
}
