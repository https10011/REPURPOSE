package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/1.dex */
public abstract class s70 extends ys {
    public static final /* synthetic */ int f = 0;
    public long c;
    public boolean d;
    public fb e;

    public final void l(boolean z) {
        long j = this.c - (z ? 4294967296L : 1L);
        this.c = j;
        if (j <= 0 && this.d) {
            shutdown();
        }
    }

    public final void m(boolean z) {
        this.c = (z ? 4294967296L : 1L) + this.c;
        if (z) {
            return;
        }
        this.d = true;
    }

    public abstract long n();

    public final boolean p() {
        fb fbVar = this.e;
        if (fbVar == null) {
            return false;
        }
        h20 h20Var = (h20) (fbVar.isEmpty() ? null : fbVar.removeFirst());
        if (h20Var == null) {
            return false;
        }
        h20Var.run();
        return true;
    }

    public abstract void shutdown();
}
