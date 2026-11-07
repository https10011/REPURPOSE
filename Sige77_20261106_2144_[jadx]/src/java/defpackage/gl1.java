package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class gl1 extends jl1 implements Iterator {
    public hl1 a;
    public hl1 b;
    public final /* synthetic */ int c;

    public gl1(hl1 hl1Var, hl1 hl1Var2, int i) {
        this.c = i;
        this.a = hl1Var2;
        this.b = hl1Var;
    }

    @Override // defpackage.jl1
    public final void a(hl1 hl1Var) {
        hl1 hl1Var2;
        hl1 hl1VarB = null;
        if (this.a == hl1Var && hl1Var == this.b) {
            this.b = null;
            this.a = null;
        }
        hl1 hl1Var3 = this.a;
        if (hl1Var3 == hl1Var) {
            switch (this.c) {
                case 0:
                    hl1Var2 = hl1Var3.d;
                    break;
                default:
                    hl1Var2 = hl1Var3.c;
                    break;
            }
            this.a = hl1Var2;
        }
        hl1 hl1Var4 = this.b;
        if (hl1Var4 == hl1Var) {
            hl1 hl1Var5 = this.a;
            if (hl1Var4 != hl1Var5 && hl1Var5 != null) {
                hl1VarB = b(hl1Var4);
            }
            this.b = hl1VarB;
        }
    }

    public final hl1 b(hl1 hl1Var) {
        switch (this.c) {
            case 0:
                return hl1Var.c;
            default:
                return hl1Var.d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        hl1 hl1Var = this.b;
        hl1 hl1Var2 = this.a;
        this.b = (hl1Var == hl1Var2 || hl1Var2 == null) ? null : b(hl1Var);
        return hl1Var;
    }
}
