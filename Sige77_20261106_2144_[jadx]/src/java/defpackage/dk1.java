package defpackage;

/* JADX INFO: loaded from: /storage/emulated/0/Download/APK Decompiler Pro/sources/Sige77_20261106_2144_[jadx]/dex-files/0.dex */
public final class dk1 extends w0 {
    public int c;
    public int d;
    public final /* synthetic */ ek1 e;

    public dk1(ek1 ek1Var) {
        this.e = ek1Var;
        this.c = ek1Var.e;
        this.d = ek1Var.d;
    }

    @Override // defpackage.w0
    public final void a() {
        int i = this.c;
        if (i == 0) {
            this.a = 2;
            return;
        }
        ek1 ek1Var = this.e;
        Object[] objArr = ek1Var.b;
        int i2 = this.d;
        this.b = objArr[i2];
        this.a = 1;
        this.d = (i2 + 1) % ek1Var.c;
        this.c = i - 1;
    }
}
