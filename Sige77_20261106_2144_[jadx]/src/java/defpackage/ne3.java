package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public abstract class ne3 extends ge3 {
    public boolean c;

    public ne3(if3 if3Var) {
        super(if3Var);
        this.b.e0++;
    }

    public final void F() {
        if (this.c) {
            return;
        }
        uq1.q("Not initialized");
    }

    public final void G() {
        if (this.c) {
            uq1.q("Can't initialize twice");
            return;
        }
        H();
        this.b.f0++;
        this.c = true;
    }

    public abstract void H();
}
