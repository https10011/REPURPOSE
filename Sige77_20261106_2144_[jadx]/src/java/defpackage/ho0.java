package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class ho0 extends bs0 {
    public int b;
    public final /* synthetic */ io0 c;

    public ho0(io0 io0Var) {
        super(0);
        this.c = io0Var;
        this.b = io0Var.b == lo0.c ? 1 : 2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b > 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        io0 io0Var = this.c;
        Object obj = io0Var.a;
        Object obj2 = io0Var.b;
        int i = this.b;
        if (i == 1) {
            this.b = 0;
            return (lo0.b || obj2 == lo0.c) ? obj : obj2;
        }
        if (i == 2) {
            this.b = 1;
            return lo0.b ? obj2 : obj;
        }
        uq1.a();
        return null;
    }
}
