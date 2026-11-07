package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class la3 implements Runnable {
    public final /* synthetic */ ja3 a;
    public final /* synthetic */ ja3 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ua3 e;

    public la3(ua3 ua3Var, ja3 ja3Var, ja3 ja3Var2, long j, boolean z) {
        this.a = ja3Var;
        this.b = ja3Var2;
        this.c = j;
        this.d = z;
        this.e = ua3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.K(this.a, this.b, this.c, this.d, null);
    }
}
