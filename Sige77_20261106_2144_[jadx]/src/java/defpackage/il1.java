package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class il1 extends jl1 implements Iterator {
    public hl1 a;
    public boolean b = true;
    public final /* synthetic */ kl1 c;

    public il1(kl1 kl1Var) {
        this.c = kl1Var;
    }

    @Override // defpackage.jl1
    public final void a(hl1 hl1Var) {
        hl1 hl1Var2 = this.a;
        if (hl1Var == hl1Var2) {
            hl1 hl1Var3 = hl1Var2.d;
            this.a = hl1Var3;
            this.b = hl1Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b) {
            return this.c.a != null;
        }
        hl1 hl1Var = this.a;
        return (hl1Var == null || hl1Var.c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.b) {
            this.b = false;
            this.a = this.c.a;
        } else {
            hl1 hl1Var = this.a;
            this.a = hl1Var != null ? hl1Var.c : null;
        }
        return this.a;
    }
}
