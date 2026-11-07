package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class k13 extends f03 {
    public boolean b;

    public k13(y53 y53Var) {
        super(y53Var);
        ((y53) this.a).n0++;
    }

    public final void F() {
        if (this.b) {
            return;
        }
        uq1.q("Not initialized");
    }

    public final void G() {
        if (this.b) {
            uq1.q("Can't initialize twice");
        } else {
            if (H()) {
                return;
            }
            ((y53) this.a).p0.incrementAndGet();
            this.b = true;
        }
    }

    public abstract boolean H();
}
